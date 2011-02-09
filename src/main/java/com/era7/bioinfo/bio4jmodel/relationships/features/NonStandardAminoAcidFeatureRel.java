/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Occurence of non-standard amino acids (selenocysteine and pyrrolysine) in the protein sequence
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class NonStandardAminoAcidFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_NON_STANDARD_AMINO_ACID";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "non-standard amino acid";

    public NonStandardAminoAcidFeatureRel(Relationship rel){
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
