/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Covalently attached lipid group(s)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class LipidMoietyBindingRegionFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_LIPID_MOIETY_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "lipid moiety-binding region";

    public LipidMoietyBindingRegionFeatureRel(Relationship rel){
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
