/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.aproducts;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class AlternativeProductRibosomalFrameshiftingRel extends BasicRelationship{

    public static final String NAME = "ALTERNATIVE_PRODUCT_RIBOSOMAL_FRAMESHIFTING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "ribosomal frameshifting";

    public AlternativeProductRibosomalFrameshiftingRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
