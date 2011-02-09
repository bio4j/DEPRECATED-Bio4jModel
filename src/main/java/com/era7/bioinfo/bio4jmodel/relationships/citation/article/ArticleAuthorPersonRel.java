/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.article;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Article authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleAuthorPersonRel extends BasicRelationship{

    public static final String NAME = "ARTICLE_AUTHOR_PERSON";

    public ArticleAuthorPersonRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
