/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.go;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class CellularComponentRel extends BasicRelationship{

    public static final String NAME = "CELLULAR_COMPONENT";

    public CellularComponentRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}