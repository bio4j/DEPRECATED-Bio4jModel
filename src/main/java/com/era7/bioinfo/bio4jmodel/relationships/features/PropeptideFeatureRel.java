/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Part of a protein that is cleaved during maturation or activation
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PropeptideFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_PROPEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "propeptide";

    public PropeptideFeatureRel(Relationship rel){
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
