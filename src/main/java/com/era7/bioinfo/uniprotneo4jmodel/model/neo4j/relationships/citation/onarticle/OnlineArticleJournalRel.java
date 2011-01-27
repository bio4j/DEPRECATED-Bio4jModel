/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.citation.onarticle;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class OnlineArticleJournalRel extends BasicRelationship{

    public static final String NAME = "ONLINE_ARTICLE_JOURNAL";

    public static final String LOCATOR_PROPERTY = "locator";

    public OnlineArticleJournalRel(Relationship rel){
        super(rel);
    }


    public String getLocator(){    return String.valueOf(this.relationship.getProperty(LOCATOR_PROPERTY));}

    public void setLocator(String value){  this.relationship.setProperty(LOCATOR_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "locator = " + getLocator();
    }

}