/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.protein;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ProteinOrganismRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_ORGANISM";

    public ProteinOrganismRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}