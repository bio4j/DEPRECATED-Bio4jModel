/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.sc;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ErroneousGeneModelPredictionRel extends BasicRelationship{

    public static final String NAME = "ERRONEOUS_GENE_MODEL_PREDICTION";

    public ErroneousGeneModelPredictionRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}

