/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Organisms genome elements
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementNode extends BasicEntity{

    public static final String GENOME_ELEMENT_ID_INDEX = "genome_element_id_index";

    public static final String ID_PROPERTY = "id";
    public static final String SEQUENCE_PROPERTY = "sequence";


    public GenomeElementNode(Node n){
        super(n);
        nodeType = GenomeElementNode.class.getCanonicalName();
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getSequence(){    return String.valueOf(node.getProperty(SEQUENCE_PROPERTY));}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setSequence(String value){  node.setProperty(SEQUENCE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof GenomeElementNode){
            GenomeElementNode other = (GenomeElementNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

}
