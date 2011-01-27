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
public class RnaEditingCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_RNA_EDITING";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "RNA editing";

    public static final String POSITION_PROPERTY = "position";

    public RnaEditingCommentRel(Relationship rel){
        super(rel);
    }

    public String getPosition(){
        return String.valueOf(this.relationship.getProperty(POSITION_PROPERTY));
    }

    public void setPosition(String value){
        this.relationship.setProperty(POSITION_PROPERTY, value);
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
