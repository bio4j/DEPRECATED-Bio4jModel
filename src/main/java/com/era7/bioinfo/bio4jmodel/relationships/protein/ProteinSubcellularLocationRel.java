/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.protein;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class ProteinSubcellularLocationRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_SUBCELLULAR_LOCATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "subcellular location";

    public static final String EVIDENCE_PROPERTY = "evidence";
    public static final String STATUS_PROPERTY = "status";
    public static final String TOPOLOGY_STATUS_PROPERTY = "topology_status";
    public static final String TOPOLOGY_PROPERTY = "topology";

    public ProteinSubcellularLocationRel(Relationship rel){
        super(rel);
    }

    public String getEvidence(){    return String.valueOf(this.relationship.getProperty(EVIDENCE_PROPERTY));}
    public String getStatus(){  return String.valueOf(this.relationship.getProperty(STATUS_PROPERTY));}
    public String getTopology(){    return String.valueOf(this.relationship.getProperty(TOPOLOGY_PROPERTY));}
    public String getTopologyStatus(){  return String.valueOf(this.relationship.getProperty(TOPOLOGY_STATUS_PROPERTY));}

    public void setEvidence(String value){  this.relationship.setProperty(EVIDENCE_PROPERTY, value);}
    public void setStatus(String value){    this.relationship.setProperty(STATUS_PROPERTY, value);}
    public void setTopology(String value){  this.relationship.setProperty(TOPOLOGY_PROPERTY, value);}
    public void setTopologyStatus(String value){    this.relationship.setProperty(TOPOLOGY_STATUS_PROPERTY, value);}

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return "status = " + getStatus() +
                "\nevidence = " + getEvidence();
    }

}