/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.citation.submission;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class SubmissionDbRel extends BasicRelationship{

    public static final String NAME = "SUBMISSION_DB";

    public static final String DATE_PROPERTY = "date";

    public SubmissionDbRel(Relationship rel){
        super(rel);
    }

    public String getDate(){    return String.valueOf(this.relationship.getProperty(DATE_PROPERTY));}

    public void setDate(String value){  this.relationship.setProperty(DATE_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
