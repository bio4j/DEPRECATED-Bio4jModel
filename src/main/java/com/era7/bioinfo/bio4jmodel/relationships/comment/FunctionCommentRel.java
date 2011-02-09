/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * General function(s) of a protein
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class FunctionCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_FUNCTION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "function";

    public FunctionCommentRel(Relationship rel){
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

