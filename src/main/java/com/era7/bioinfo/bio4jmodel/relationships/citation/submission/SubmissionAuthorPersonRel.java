/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.submission;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Submission authors (people)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionAuthorPersonRel extends BasicRelationship{

    public static final String NAME = "SUBMISSION_AUTHOR_PERSON";

    public SubmissionAuthorPersonRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
