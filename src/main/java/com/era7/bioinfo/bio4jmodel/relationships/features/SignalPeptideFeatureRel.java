/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 * Sequence targeting proteins to the secretory pathway or periplasmic space
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SignalPeptideFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "FEATURE_SIGNAL_PEPTIDE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "signal peptide";

    public SignalPeptideFeatureRel(Relationship rel){
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
