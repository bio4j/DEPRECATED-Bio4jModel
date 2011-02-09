/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.patent;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Proteins referenced by a patent
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PatentProteinCitationRel extends BasicRelationship{

    public static final String NAME = "PATENT_PROTEIN_CITATION";

    public PatentProteinCitationRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
