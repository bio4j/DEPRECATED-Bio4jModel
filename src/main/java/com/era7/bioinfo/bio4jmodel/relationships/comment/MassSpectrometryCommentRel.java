/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Information derived from mass spectrometry experiments
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class MassSpectrometryCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_MASS_SPECTROMETRY";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "mass spectrometry";

    public static final String BEGIN_PROPERTY = "begin";
    public static final String END_PROPERTY = "end";
    public static final String MASS_PROPERTY = "mass";
    public static final String METHOD_PROPERTY = "method";

    public MassSpectrometryCommentRel(Relationship rel){
        super(rel);
    }

    public String getBegin(){
        return String.valueOf(this.relationship.getProperty(BEGIN_PROPERTY));
    }
    public String getEnd(){
        return String.valueOf(this.relationship.getProperty(END_PROPERTY));
    }
    public String getMass(){
        return String.valueOf(this.relationship.getProperty(MASS_PROPERTY));
    }
    public String getMethod(){
        return String.valueOf(this.relationship.getProperty(METHOD_PROPERTY));
    }

    public void setBegin(String value){
        this.relationship.setProperty(BEGIN_PROPERTY, value);
    }
    public void setEnd(String value){
        this.relationship.setProperty(END_PROPERTY, value);
    }
    public void setMass(String value){
        this.relationship.setProperty(MASS_PROPERTY, value);
    }
    public void setMethod(String value){
        this.relationship.setProperty(METHOD_PROPERTY, value);
    }

    @Override
    public String name() {
        return RELATIONSHIP_NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
