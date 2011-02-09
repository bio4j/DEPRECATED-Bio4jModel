/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.article;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Proteins one article references
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleProteinCitationRel extends BasicRelationship{

    public static final String NAME = "ARTICLE_PROTEIN_CITATION";

    public ArticleProteinCitationRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
