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
public class OnlineInformationCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_ONLINE_INFORMATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online information";

    public static final String NAME_PROPERTY = "name";
    public static final String LINK_PROPERTY = "link";

    public OnlineInformationCommentRel(Relationship rel){
        super(rel);
    }

    public String getName(){
        return String.valueOf(this.relationship.getProperty(NAME_PROPERTY));
    }
    public String getLink(){
        return String.valueOf(this.relationship.getProperty(LINK_PROPERTY));
    }

    public void setName(String value){
        this.relationship.setProperty(NAME_PROPERTY, value);
    }
    public void setLink(String value){
        this.relationship.setProperty(LINK_PROPERTY, value);
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

