/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Expression of the gene product in different tissues
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class TissueSpecificityCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_TISSUE_SPECIFICITY";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "tissue specificity";

    public TissueSpecificityCommentRel(Relationship rel){
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

