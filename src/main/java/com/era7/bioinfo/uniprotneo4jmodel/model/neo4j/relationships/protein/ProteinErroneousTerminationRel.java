/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.protein;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ProteinErroneousTerminationRel extends BasicProteinSequenceCautionRel{

    public static final String RELATIONSHIP_NAME = "PROTEIN_ERRONEOUS_TERMINATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "erroneous termination";

    public ProteinErroneousTerminationRel(Relationship rel){
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


