/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Description of sequence discrepancies of unknown origin
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SequenceConflictFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_SEQUENCE_CONFLICT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "sequence conflict";

    public SequenceConflictFeatureRel(Relationship rel){
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


