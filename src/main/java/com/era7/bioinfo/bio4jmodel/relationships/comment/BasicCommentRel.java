/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class BasicCommentRel extends BasicRelationship{

    public static final String NAME = "BASIC_COMMENT";

    public static final String TEXT_PROPERTY = "text";
    public static final String STATUS_PROPERTY = "status";
    public static final String EVIDENCE_PROPERTY = "evidence";


    public BasicCommentRel(Relationship rel){
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

    public void setText(String value){
        relationship.setProperty(TEXT_PROPERTY, value);
    }    
    public void setStatus(String value){
        relationship.setProperty(STATUS_PROPERTY, value);
    }
    public void setEvidence(String value){
        relationship.setProperty(EVIDENCE_PROPERTY, value);
    }

    @Override
    public String toString(){
        return "text = " + getText() + "\n" +
                "status = " + getStatus();
    }

}

