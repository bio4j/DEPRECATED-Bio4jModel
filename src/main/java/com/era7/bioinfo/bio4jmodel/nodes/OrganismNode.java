/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Uniprot taxonomy organism
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OrganismNode extends BasicEntity{

    public static final String ORGANISM_SCIENTIFIC_NAME_INDEX = "organism_scientific_name_index";
    public static final String ORGANISM_NCBI_TAXONOMY_ID_INDEX = "organism_ncbi_taxonomy_id_index";

    public static final String SCIENTIFIC_NAME_PROPERTY = "scientific_name";
    public static final String COMMON_NAME_PROPERTY = "common_name";
    public static final String SYNONYM_NAME_PROPERTY = "synonym_name";
    public static final String NCBI_TAXONOMY_ID_PROPERTY = "ncbi_taxonomy_id";


    public OrganismNode(Node n){
        super(n);
        nodeType = OrganismNode.class.getCanonicalName();
    }


    public String getScientificName(){    return String.valueOf(node.getProperty(SCIENTIFIC_NAME_PROPERTY));}
    public String getCommonName(){    return String.valueOf(node.getProperty(COMMON_NAME_PROPERTY));}
    public String getSynonymName(){    return String.valueOf(node.getProperty(SYNONYM_NAME_PROPERTY));}
    public String getNcbiTaxonomyId(){    return String.valueOf(node.getProperty(NCBI_TAXONOMY_ID_PROPERTY));}

    public void setScientificName(String value){  node.setProperty(SCIENTIFIC_NAME_PROPERTY, value);}
    public void setCommonName(String value){  node.setProperty(COMMON_NAME_PROPERTY, value);}
    public void setSynonymName(String value){  node.setProperty(SYNONYM_NAME_PROPERTY, value);}
    public void setNcbiTaxonomyId(String value){    node.setProperty(NCBI_TAXONOMY_ID_PROPERTY, value);}
    
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OrganismNode){
            OrganismNode other = (OrganismNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

}
