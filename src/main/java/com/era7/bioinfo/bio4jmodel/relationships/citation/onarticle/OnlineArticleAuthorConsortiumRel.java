/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.onarticle;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class OnlineArticleAuthorConsortiumRel extends BasicRelationship{

    public static final String NAME = "ONLINE_ARTICLE_AUTHOR_CONSORTIUM";

    public OnlineArticleAuthorConsortiumRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
