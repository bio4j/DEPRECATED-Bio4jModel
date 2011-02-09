/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Binding site for a metal ion
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MetalIonBindingSiteFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_METAL_ION_BINDING_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "metal ion-binding site";


    public MetalIonBindingSiteFeatureRel(Relationship rel){
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

