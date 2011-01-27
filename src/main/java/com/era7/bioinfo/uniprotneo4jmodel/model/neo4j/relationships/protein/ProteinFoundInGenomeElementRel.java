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
public class ProteinFoundInGenomeElementRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_FOUND_IN_GENOME_ELEMENT";

    public static final String BEGIN_PROPERTY = "begin";
    public static final String END_PROPERTY = "end";

    public ProteinFoundInGenomeElementRel(Relationship rel){
        super(rel);
    }

    public int getBegin(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(BEGIN_PROPERTY)));
    }
    public int getEnd(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(END_PROPERTY)));
    }

    public void setBegin(int value){
        relationship.setProperty(BEGIN_PROPERTY, String.valueOf(value));
    }
    public void setEnd(int value){
        relationship.setProperty(END_PROPERTY, String.valueOf(value));
    }


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString() + "\nbegin = " + getBegin() + "\n" +
                "end = " + getEnd();
    }

}
