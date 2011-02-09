/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * The sequence is incomplete. Indicate that a residue is not the terminal residue of the complete protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class NonTerminalResidueFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_NON_TERMINAL_RESIDUE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "non-terminal residue";

    public NonTerminalResidueFeatureRel(Relationship rel){
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
