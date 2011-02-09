/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Amino acid change(s) producing alternate protein isoforms
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SpliceVariantFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_SPLICE_VARIANT";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "splice variant";

    public SpliceVariantFeatureRel(Relationship rel){
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

