/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.uo;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Proteins referenced by unpublished observations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
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
