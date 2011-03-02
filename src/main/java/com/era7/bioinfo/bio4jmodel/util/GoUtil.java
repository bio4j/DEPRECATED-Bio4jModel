/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.era7.bioinfo.bio4jmodel.util;

import com.era7.bioinfo.bio4jmodel.nodes.GoTermNode;
import com.era7.bioinfo.bio4jmodel.nodes.ProteinNode;
import com.era7.bioinfo.bio4jmodel.relationships.go.GoParentRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinGoRel;
import com.era7.lib.bioinfoxml.ProteinXML;
import com.era7.lib.bioinfoxml.go.GOSlimXML;
import com.era7.lib.bioinfoxml.go.GoAnnotationXML;
import com.era7.lib.bioinfoxml.go.GoTermXML;
import com.era7.lib.bioinfoxml.go.SlimSetXML;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.Element;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.index.Index;
import org.neo4j.graphdb.index.IndexHits;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GoUtil {

    public static GoAnnotationXML getGoAnnotation(ArrayList<ProteinXML> proteins,
            Bio4jManager manager) {

        GoAnnotationXML annotationXML = new GoAnnotationXML();


        HashMap<String, GoTermXML> goAnnotatorsMap = new HashMap<String, GoTermXML>();
        HashMap<String, Integer> goCountsMap = new HashMap<String, Integer>();

        Transaction txn = manager.beginTransaction();

        try {

            //IndexService indexService = manager.getIndexService();
            Index<Node> proteinAccessionIndex = manager.getProteinAccessionIndex();

            ProteinGoRel proteinGoRel = new ProteinGoRel(null);
            Iterator<Relationship> relIterator = null;

            for (ProteinXML proteinXML : proteins) {

                IndexHits<Node> protHits = proteinAccessionIndex.get(ProteinNode.PROTEIN_ACCESSION_INDEX, proteinXML.getId());
                if (protHits.hasNext()) {
                    ProteinNode proteinNode = new ProteinNode(protHits.getSingle());
                    relIterator = proteinNode.getNode().getRelationships(proteinGoRel, Direction.OUTGOING).iterator();
                    while (relIterator.hasNext()) {

                        proteinGoRel = new ProteinGoRel(relIterator.next());
                        GoTermNode goTermNode = new GoTermNode(proteinGoRel.getRelationship().getEndNode());
                        String goId = goTermNode.getId();

                        GoTermXML goXml = new GoTermXML();
                        goXml.setId(goId);
                        goXml.setAspect(goTermNode.getNamespace());
                        goXml.setGoName(goTermNode.getName());
                        goXml.setEvidence(proteinGoRel.getEvidence());
                        proteinXML.addGoTerm(goXml, true);

                        Integer goCount = goCountsMap.get(goId);
                        if (goCount == null) {
                            goCountsMap.put(goId, 1);
                            goAnnotatorsMap.put(goId, new GoTermXML((Element) goXml.asJDomElement().clone()));
                        } else {
                            goCountsMap.put(goId, (goCount + 1));
                        }
                    }

                    proteinXML.detach();

                    annotationXML.addProteinAnnotation(proteinXML);
                }

            }

            Set<String> keySet = goAnnotatorsMap.keySet();
            for (String currentKey : keySet) {
                GoTermXML tempGo = goAnnotatorsMap.get(currentKey);
                tempGo.setAnnotationsCount(goCountsMap.get(currentKey));
                annotationXML.addAnnotatorGoTerm(tempGo);
            }


            txn.success();

        } catch (Exception e) {
            Logger logger = Logger.getLogger("GoUtil");
            logger.log(Level.SEVERE, e.getMessage());
            txn.failure();
            annotationXML = null;
        } finally {
            txn.finish();
        }


        return annotationXML;
    }

    public static GOSlimXML getGoSlim(ArrayList<ProteinXML> proteins,
            SlimSetXML slimSetXML,
            Bio4jManager manager) {

        GOSlimXML goSlimXML = new GOSlimXML();

        GoAnnotationXML goAnnotationXML = GoUtil.getGoAnnotation(proteins, manager);

        Index<Node> goTermIdIndex = manager.getGoTermIdIndex();

        if (goAnnotationXML != null) {
            List<GoTermXML> goAnnotators = goAnnotationXML.getAnnotatorGoTerms();

            //IndexService indexService = manager.getIndexService();

            // in this hash map there is one entry for each annotator go term
            // the hash-set contains every slim-set go term including the annotator
            HashMap<String, HashSet<String>> goAnnotatorsIncludingSlimSetTermsMap = new HashMap<String, HashSet<String>>();

            //Here is every id included in the slim set
            HashSet<String> slimSetIds = new HashSet<String>();

            //Now I extract the ids of the SlimSet
            List<Element> slimElements = slimSetXML.asJDomElement().getChildren(GoTermXML.TAG_NAME);
            for (Element slimElement : slimElements) {
                GoTermXML tempGo = new GoTermXML(slimElement);
                slimSetIds.add(tempGo.getId());
            }
            //--------------------------------------------

            //Now it is time for goAnnotatorsIncludingSlimSetTermsMap initialization
            for (GoTermXML goAnnotator : goAnnotators) {
                goAnnotatorsIncludingSlimSetTermsMap.put(goAnnotator.getId(), new HashSet<String>());
            }
            //------------------------------------------------------

            Transaction txn = manager.beginTransaction();

            try {

                GoParentRel goParentRel = new GoParentRel(null);

                //Now I search the way up of every go Annotator and check if in the way I find
                //any of the terms included in the slim set.
                for (GoTermXML goAnnotator : goAnnotators) {
                    //this array includes the term own id and every ancestor id
                    ArrayList<String> ancestorsIds = new ArrayList<String>();

                    GoTermNode goTermNode = new GoTermNode(goTermIdIndex.get(GoTermNode.GO_TERM_ID_INDEX, goAnnotator.getId()).getSingle());
                    //now I look up for the term ancestors
                    GoTermNode parent = goTermNode;
                    while (parent != null) {
                        ancestorsIds.add(parent.getId());

                        Node nodeParent = parent.getNode().getSingleRelationship(goParentRel, Direction.OUTGOING).getEndNode();
                        if (nodeParent != null) {
                            parent = new GoTermNode(nodeParent);
                        } else {
                            parent = null;
                        }
                    }

                    for (String ancestorId : ancestorsIds) {
                        //If the ancestor is included in the slim set, it means that this term
                        //from the slim set includes the goAnnotator 
                        if (slimSetIds.contains(ancestorId)) {
                            HashSet<String> hashSet = goAnnotatorsIncludingSlimSetTermsMap.get(goAnnotator.getId());
                            hashSet.add(ancestorId); //ancestorId is actually one of the slim-set terms ids.
                        }
                    }
                }


                //So now I should have every goAnnotator with its corresponing slimSet terms



                txn.success();
            } catch (Exception e) {
                Logger logger = Logger.getLogger("GoUtil");
                logger.log(Level.SEVERE, e.getMessage());
                txn.failure();
                goSlimXML = null;
            } finally {
                txn.finish();
            }


        } else {
            goSlimXML = null;
        }


        return goSlimXML;
    }
}
