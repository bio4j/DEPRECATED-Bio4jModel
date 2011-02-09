/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Positions of regions of coiled coil within the protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CoiledCoilRegionFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_COILED_COIL_REGION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "coiled-coil region";

    public CoiledCoilRegionFeatureRel(Relationship rel){
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

