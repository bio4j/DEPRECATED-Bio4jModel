/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Modified residues excluding lipids, glycans and protein cross-links
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ModifiedResidueFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_MODIFIED_RESIDUE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "modified residue";

    public ModifiedResidueFeatureRel(Relationship rel){
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

