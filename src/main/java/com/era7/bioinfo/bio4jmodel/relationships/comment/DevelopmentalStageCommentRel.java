/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Expression of the gene product according to the cell stage and/or tissue or organism development
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DevelopmentalStageCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_DEVELOPMENTAL_STAGE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "developmental stage";

    public DevelopmentalStageCommentRel(Relationship rel){
        super(rel);
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
