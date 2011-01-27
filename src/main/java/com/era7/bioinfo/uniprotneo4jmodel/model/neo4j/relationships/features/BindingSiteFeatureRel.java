/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class BindingSiteFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_BINDING_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "binding site";

    public BindingSiteFeatureRel(Relationship rel){
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
