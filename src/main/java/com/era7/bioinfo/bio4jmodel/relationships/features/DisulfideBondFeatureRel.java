/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Cysteine residues participating in disulfide bonds
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DisulfideBondFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_DISULFIDE_BOND";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disulfide bond";

    public DisulfideBondFeatureRel(Relationship rel){
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
