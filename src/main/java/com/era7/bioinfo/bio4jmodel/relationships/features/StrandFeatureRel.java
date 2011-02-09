/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Beta strand regions within the experimentally determined protein structure
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class StrandFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_STRAND";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "strand";

    public StrandFeatureRel(Relationship rel){
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
