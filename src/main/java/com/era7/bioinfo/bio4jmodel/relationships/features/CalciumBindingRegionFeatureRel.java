/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Position(s) of calcium binding region(s) within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CalciumBindingRegionFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_CALCIUM_BINDING_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "calcium-binding region";

    public CalciumBindingRegionFeatureRel(Relationship rel){
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
