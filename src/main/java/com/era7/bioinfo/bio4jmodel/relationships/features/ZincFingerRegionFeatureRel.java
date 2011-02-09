/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Position(s) and type(s) of zinc fingers within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ZincFingerRegionFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_ZINC_FINGER_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "zinc finger region";

    public ZincFingerRegionFeatureRel(Relationship rel){
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

