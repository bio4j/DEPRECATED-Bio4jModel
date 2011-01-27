/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.aproducts;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class AlternativeProductSplicingRel extends BasicRelationship{

    public static final String NAME = "ALTERNATIVE_PRODUCT_SPLICING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "alternative splicing";

    public AlternativeProductSplicingRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
