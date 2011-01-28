/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.book;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class BookProteinCitationRel extends BasicRelationship{

    public static final String NAME = "BOOK_PROTEIN_CITATION";

    public static final String TITLE_PROPERTY = "title";
    public static final String VOLUME_PROPERTY = "volume";
    public static final String FIRST_PROPERTY = "first";
    public static final String LAST_PROPERTY = "last";

    public BookProteinCitationRel(Relationship rel){
        super(rel);
    }

    public String getTitle(){    return String.valueOf(this.relationship.getProperty(TITLE_PROPERTY));}
    public String getVolume(){    return String.valueOf(this.relationship.getProperty(VOLUME_PROPERTY));}
    public String getFirst(){    return String.valueOf(this.relationship.getProperty(FIRST_PROPERTY));}
    public String getLast(){    return String.valueOf(this.relationship.getProperty(LAST_PROPERTY));}

    public void setTitle(String value){  this.relationship.setProperty(TITLE_PROPERTY, value);}
    public void setVolume(String value){  this.relationship.setProperty(VOLUME_PROPERTY, value);}
    public void setFirst(String value){  this.relationship.setProperty(FIRST_PROPERTY, value);}
    public void setLast(String value){  this.relationship.setProperty(LAST_PROPERTY, value);}


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "title = " + getTitle() + "\n" +
                "volume = " + getVolume() + "\n" +
                "first = " + getFirst() + "\n" +
                "last = " + getLast();
    }

}