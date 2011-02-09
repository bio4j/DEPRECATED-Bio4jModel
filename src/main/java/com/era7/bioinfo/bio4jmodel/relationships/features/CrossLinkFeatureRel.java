/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Residues participating in covalent linkage(s) between proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CrossLinkFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_CROSS_LINK";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "cross-link";

    public static final String POSITION_PROPERTY = "position";

    public CrossLinkFeatureRel(Relationship rel){
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

