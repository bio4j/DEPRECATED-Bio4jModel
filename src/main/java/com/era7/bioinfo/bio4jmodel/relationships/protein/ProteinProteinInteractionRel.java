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
public class ProteinProteinInteractionRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_PROTEIN_INTERACTION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "interaction";

    public static final String ORGANISMS_DIFFER_PROPERTY = "organisms_differ";
    public static final String EXPERIMENTS_PROPERTY = "experiments";
    public static final String INTACT_ID_1_PROPERTY = "intact_id_1";
    public static final String INTACT_ID_2_PROPERTY = "intact_id_2";

    public ProteinProteinInteractionRel(Relationship rel){
        super(rel);
    }

    public String getOrganismsDiffer(){    return String.valueOf(this.relationship.getProperty(ORGANISMS_DIFFER_PROPERTY));}
    public String getExperiments(){  return String.valueOf(this.relationship.getProperty(EXPERIMENTS_PROPERTY));}
    public String getIntactId2(){    return String.valueOf(this.relationship.getProperty(INTACT_ID_2_PROPERTY));}
    public String getIntactId1(){  return String.valueOf(this.relationship.getProperty(INTACT_ID_1_PROPERTY));}

    public void setOrganismsDiffer(String value){  this.relationship.setProperty(ORGANISMS_DIFFER_PROPERTY, value);}
    public void setExperiments(String value){    this.relationship.setProperty(EXPERIMENTS_PROPERTY, value);}
    public void setIntactId2(String value){  this.relationship.setProperty(INTACT_ID_2_PROPERTY, value);}
    public void setIntactId1(String value){    this.relationship.setProperty(INTACT_ID_1_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "organisms differ = " + getOrganismsDiffer() + "\n" +
                "experiments = " + getExperiments() + "\n" +
                "intactId 1 = " + getIntactId1() + "\n" +
                "intactId 2 = " + getIntactId2();
    }

}