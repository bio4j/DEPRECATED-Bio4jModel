/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.citation.uo;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class UnpublishedObservationProteinCitationRel extends BasicRelationship{

    public static final String NAME = "UNPUBLISHED_OBSERVATION_PROTEIN_CITATION";

    public UnpublishedObservationProteinCitationRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
