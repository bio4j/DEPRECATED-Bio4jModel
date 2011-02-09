/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 * Description of the effects caused by the disruption of a protein-encoding gene
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DisruptionPhenotypeCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_DISRUPTION_PHENOTYPE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "disruption phenotype";

    public DisruptionPhenotypeCommentRel(Relationship rel){
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