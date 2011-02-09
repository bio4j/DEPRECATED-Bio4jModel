/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.thesis;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Thesis institute
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ThesisInstituteRel extends BasicRelationship{

    public static final String NAME = "THESIS_INSTITUTE";

    public ThesisInstituteRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
