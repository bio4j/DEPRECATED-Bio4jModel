/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Short (up to 20 amino acids) sequence motif of biological interest
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ShortSequenceMotifFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_SHORT_SEQUENCE_MOTIF";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "short sequence motif";

    public ShortSequenceMotifFeatureRel(Relationship rel){
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
