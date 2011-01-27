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
public class CofactorCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_COFACTOR";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "cofactor";

    public CofactorCommentRel(Relationship rel){
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
