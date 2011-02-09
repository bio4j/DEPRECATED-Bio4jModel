/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Extent of a transit peptide for organelle targeting
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TransitPeptideFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_TRANSIT_PEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "transit peptide";

    public TransitPeptideFeatureRel(Relationship rel){
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

