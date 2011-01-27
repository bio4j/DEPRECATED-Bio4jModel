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
public class BasicProteinSequenceCautionRel extends BasicRelationship{

    public static final String NAME = "BASIC_PROTEIN_SEQUENCE_CAUTION";

    public static final String TEXT_PROPERTY = "text";
    public static final String STATUS_PROPERTY = "status";
    public static final String EVIDENCE_PROPERTY = "evidence";
    public static final String ID_PROPERTY = "id";
    public static final String POSITION_PROPERTY = "position";
    public static final String RESOURCE_PROPERTY = "resource";
    public static final String VERSION_PROPERTY = "version";


    public BasicProteinSequenceCautionRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

    public String getText(){
        return String.valueOf(this.relationship.getProperty(TEXT_PROPERTY));
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
    public String getPosition(){
        return String.valueOf(this.relationship.getProperty(POSITION_PROPERTY));
    }
    public String getResource(){
        return String.valueOf(this.relationship.getProperty(RESOURCE_PROPERTY));
    }
    public String getVersion(){
        return String.valueOf(this.relationship.getProperty(VERSION_PROPERTY));
    }

    public void setText(String value){
        relationship.setProperty(TEXT_PROPERTY, value);
    }
    public void setStatus(String value){
        relationship.setProperty(STATUS_PROPERTY, value);
    }
    public void setEvidence(String value){
        relationship.setProperty(EVIDENCE_PROPERTY, value);
    }
    public void setId(String value){
        relationship.setProperty(ID_PROPERTY, value);
    }
    public void setPosition(String value){
        relationship.setProperty(POSITION_PROPERTY, value);
    }
    public void setResource(String value){
        relationship.setProperty(RESOURCE_PROPERTY, value);
    }
    public void setVersion(String value){
        relationship.setProperty(VERSION_PROPERTY, value);
    }

    @Override
    public String toString(){
        return "text = " + getText() + "\n" +
                "status = " + getStatus() + "\n" +
                "evidence = " + getEvidence() + "\n" +
                "id = " + getId() + "\n" +
                "position = " + getPosition() + "\n" +
                "resource = " + getResource() + "\n" +
                "version = " + getVersion();
    }

}

