/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.article;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ArticleJournalRel extends BasicRelationship{

    public static final String NAME = "ARTICLE_JOURNAL";

    public static final String DATE_PROPERTY = "date";
    public static final String VOLUME_PROPERTY = "volume";
    public static final String FIRST_PROPERTY = "first";
    public static final String LAST_PROPERTY = "last";

    public ArticleJournalRel(Relationship rel){
        super(rel);
    }

    public String getDate(){    return String.valueOf(this.relationship.getProperty(DATE_PROPERTY));}
    public String getVolume(){    return String.valueOf(this.relationship.getProperty(VOLUME_PROPERTY));}
    public String getFirst(){    return String.valueOf(this.relationship.getProperty(FIRST_PROPERTY));}
    public String getLast(){    return String.valueOf(this.relationship.getProperty(LAST_PROPERTY));}

    public void setDate(String value){  this.relationship.setProperty(DATE_PROPERTY, value);}
    public void setVolume(String value){  this.relationship.setProperty(VOLUME_PROPERTY, value);}
    public void setFirst(String value){  this.relationship.setProperty(FIRST_PROPERTY, value);}
    public void setLast(String value){  this.relationship.setProperty(LAST_PROPERTY, value);}


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "date = " + getDate() + "\n" +
                "volume = " + getVolume() + "\n" +
                "first = " + getFirst() + "\n" +
                "last = " + getLast();
    }

}