/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class PostTransactionalModificationCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_POST_TRANSACTIONAL_MODIFICATION";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "PTM";

    public PostTransactionalModificationCommentRel(Relationship rel){
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

