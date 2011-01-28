/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.features;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class GlycosylationSiteFeatureRel extends BasicFeatureRel{

    public static final String RELATIONSHIP_NAME = "GLYCOSYLATION_SITE";
    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "glycosylation site";


    public GlycosylationSiteFeatureRel(Relationship rel){
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
