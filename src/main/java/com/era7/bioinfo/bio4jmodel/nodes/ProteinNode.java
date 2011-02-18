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
package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinDatasetRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinOrganismRel;
import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;

/**
 * Uniprot proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinNode extends BasicEntity {

    public static final String PROTEIN_ACCESSION_INDEX = "protein_accession_index";
    
    public static final String NAME_PROPERTY = "name";
    public static final String FULL_NAME_PROPERTY = "full_name";
    public static final String ACCESSION_PROPERTY = "accession";
    public static final String SEQUENCE_PROPERTY = "sequence";
    public static final String MASS_PROPERTY = "mass";
    public static final String LENGTH_PROPERTY = "length";
    public static final String MODIFIED_DATE_PROPERTY = "modified_date";
    public static final String GENE_NAMES_PROPERTY = "gene_names";

    public static final String GENE_NAMES_SEPARATOR = "\t";

    public ProteinNode(Node n) {
        super(n);
        nodeType = ProteinNode.class.getCanonicalName();
    }

    public String getName() {
        return String.valueOf(node.getProperty(NAME_PROPERTY));
    }

    public String getFullName(){
        return String.valueOf(node.getProperty(FULL_NAME_PROPERTY));
    }

    public String getAccession() {
        return String.valueOf(node.getProperty(ACCESSION_PROPERTY));
    }

    public String getSequence() {
        return String.valueOf(node.getProperty(SEQUENCE_PROPERTY));
    }

    public String getModifiedDate(){
        return String.valueOf(node.getProperty(MODIFIED_DATE_PROPERTY));
    }

    public float getMass() {
        return Float.parseFloat(String.valueOf(node.getProperty(MASS_PROPERTY)));
    }

    public int getLength() {
        return Integer.parseInt(String.valueOf(node.getProperty(LENGTH_PROPERTY)));
    }

    public String getGeneNames(){
        return String.valueOf(node.getProperty(GENE_NAMES_PROPERTY));
    }

    public String[] getGeneNamesArray(){
        return String.valueOf(node.getProperty(GENE_NAMES_PROPERTY)).split(GENE_NAMES_SEPARATOR);
    }

    public OrganismNode getOrganism() {
        OrganismNode org = null;
        Relationship rel = node.getSingleRelationship(new ProteinOrganismRel(null), Direction.OUTGOING);
        if (rel != null) {
            org = new OrganismNode(rel.getEndNode());
        }
        return org;
    }
    

    public DatasetNode getDataset(){
        DatasetNode dataset = null;
        Relationship rel = node.getSingleRelationship(new ProteinDatasetRel(null), Direction.OUTGOING);
        if(rel != null){
            dataset = new DatasetNode(rel.getEndNode());
        }
        return dataset;
    }

    public void setName(String value) {
        node.setProperty(NAME_PROPERTY, value);
    }

    public void setFullName(String value){
        node.setProperty(FULL_NAME_PROPERTY, value);
    }

    public void setAccession(String value) {
        node.setProperty(ACCESSION_PROPERTY, value);
    }

    public void setSequence(String value) {
        node.setProperty(SEQUENCE_PROPERTY, value);
    }

    public void setModifiedDate(String value){
        node.setProperty(MODIFIED_DATE_PROPERTY, value);
    }

    public void setMass(float value) {
        node.setProperty(MASS_PROPERTY, value);
    }

    public void setLength(int value) {
        node.setProperty(LENGTH_PROPERTY, value);
    }

    public void setGeneNames(String value){
        node.setProperty(GENE_NAMES_PROPERTY, value);
    }

    public void setGeneNames(List<String> list){
        String geneNames = "";
        for (String st : list) {
            geneNames += st + GENE_NAMES_SEPARATOR;
        }
        if(list != null){
            if(list.size() > 0){
                //le quito el tabulador que sobra al final
                geneNames = geneNames.substring(0, geneNames.length()-1);
            }
        }
        node.setProperty(GENE_NAMES_PROPERTY, geneNames);
        
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProteinNode) {
            ProteinNode other = (ProteinNode) obj;
            return this.node.equals(other.node);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "\naccession = " + this.getAccession() +
                "\nname = " + this.getName() +
                "\nfull name = " + this.getFullName() +
                "\nmodified date = " + this.getModifiedDate() +
                "\nmass = " + this.getMass() +
                "\nlength = " + this.getLength() +
                "\ngene names = " + this.getGeneNames() + 
                "\nsequence = " + this.getSequence();

        return result;
    }
}
