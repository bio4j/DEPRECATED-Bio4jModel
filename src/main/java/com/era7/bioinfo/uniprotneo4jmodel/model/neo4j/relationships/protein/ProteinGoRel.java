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
public class ProteinGoRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_GO";

    public static final String EVIDENCE_PROPERTY = "evidence";

    public ProteinGoRel(Relationship rel){
        super(rel);
    }

    public String getEvidence(){    return String.valueOf(this.relationship.getProperty(EVIDENCE_PROPERTY));}

    public void setEvidence(String value){  this.relationship.setProperty(EVIDENCE_PROPERTY, value);}


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "evidence = " + getEvidence();
    }

}
