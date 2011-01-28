/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.sc;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class MiscellaneousDiscrepancyRel extends BasicRelationship{

    public static final String NAME = "MISCELLANEOUS_DISCREPANCY";

    public MiscellaneousDiscrepancyRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}