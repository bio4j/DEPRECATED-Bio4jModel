/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.features;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes.FeatureTypeNode;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public abstract class BasicFeatureRel extends BasicRelationship{

    public static final String NAME = "BASIC_FEATURE";

    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String STATUS_PROPERTY = "status";
    public static final String EVIDENCE_PROPERTY = "evidence";
    public static final String BEGIN_PROPERTY = "begin";
    public static final String END_PROPERTY = "end";
    public static final String ORIGINAL_PROPERTY = "original";
    public static final String VARIATION_PROPERTY = "variation";
    public static final String REF_PROPERTY = "ref";
    

    public BasicFeatureRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

    public String getDescription(){
        return String.valueOf(this.relationship.getProperty(DESCRIPTION_PROPERTY));
    }
    public String getStatus(){
        return String.valueOf(this.relationship.getProperty(STATUS_PROPERTY));
    }
    public String getEvidence(){
        return String.valueOf(this.relationship.getProperty(EVIDENCE_PROPERTY));
    }
    public String getId(){
        return String.valueOf(this.relationship.getProperty(ID_PROPERTY));
    }
    public String getOriginal(){
        return String.valueOf(this.relationship.getProperty(ORIGINAL_PROPERTY));
    }
    public String getVariation(){
        return String.valueOf(this.relationship.getProperty(VARIATION_PROPERTY));
    }
    public String getRef(){
        return String.valueOf(this.relationship.getProperty(REF_PROPERTY));
    }
    public int getBegin(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(BEGIN_PROPERTY)));
    }
    public int getEnd(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(END_PROPERTY)));
    }    

    public FeatureTypeNode getFeatureType(){
        return new FeatureTypeNode(relationship.getEndNode());
    }

    public void setDescription(String value){
        relationship.setProperty(DESCRIPTION_PROPERTY, value);
    }
    public void setId(String value){
        relationship.setProperty(ID_PROPERTY, value);
    }
    public void setEvidence(String value){
        relationship.setProperty(EVIDENCE_PROPERTY, value);
    }
    public void setStatus(String value){
        relationship.setProperty(STATUS_PROPERTY, value);
    }
    public void setRef(String value){
        relationship.setProperty(REF_PROPERTY,value);
    }
    public void setBegin(int value){
        relationship.setProperty(BEGIN_PROPERTY, String.valueOf(value));
    }
    public void setEnd(int value){
        relationship.setProperty(END_PROPERTY, String.valueOf(value));
    }
    public void setOriginal(String value){
        this.relationship.setProperty(ORIGINAL_PROPERTY, value);
    }
    public void setVariation(String value){
        this.relationship.setProperty(VARIATION_PROPERTY, value);
    }

    @Override
    public String toString(){
        return "description = " + getDescription() + "\n" +
                "status = " + getStatus() + "\n" +
                "evidence = " + getEvidence() + "\n" +
                "id = " + getId() + "\n" +
                "begin = " + getBegin() + "\n" +
                "end = " + getEnd() + "\n" +
                "ref = " + getRef() + "\n" +
                "original = " + getOriginal() + "\n" +
                "variation = " + getVariation();
    }

}
