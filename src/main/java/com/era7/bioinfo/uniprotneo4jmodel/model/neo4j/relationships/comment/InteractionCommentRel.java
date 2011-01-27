/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class InteractionCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_INTERACTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "interaction";

    public static final String ORGANISMS_DIFFERS_PROPERTY = "organisms_differ";
    public static final String EXPERIMENTS_PROPERTY = "experiments";

    public InteractionCommentRel(Relationship rel){
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
