/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Location of non-membrane regions of membrane-spanning proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TopologicalDomainFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_TOPOLOGICAL_DOMAIN";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "topological domain";

    public TopologicalDomainFeatureRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return RELATIONSHIP_NAME;
    }


    @Override
    public String toString(){
        return super.toString();
    }

}
