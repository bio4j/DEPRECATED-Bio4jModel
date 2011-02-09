/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Positions of repeated sequence motifs or repeated domains
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class RepeatFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_REPEAT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "repeat";


    public RepeatFeatureRel(Relationship rel){
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
