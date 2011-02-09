/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.onarticle;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Online journal where an online article is published
 * @author Pablo Pareja Tobes <ppareja@era7.com>
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