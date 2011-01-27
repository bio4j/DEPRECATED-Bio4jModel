/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.ncbi;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class TaxonParentNcbiRel extends BasicRelationship{

    public static final String NAME = "TAXON_PARENT_NCBI";

    public TaxonParentNcbiRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}