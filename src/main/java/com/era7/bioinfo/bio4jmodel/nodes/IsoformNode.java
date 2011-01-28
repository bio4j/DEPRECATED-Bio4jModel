/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Protein isoforms. Their information is retrieved from entries' binary interactions.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class IsoformNode extends BasicEntity{

    public static final String ISOFORM_ID_INDEX = "isoform_id_index";

    /** Isoform id **/
    public static final String ID_PROPERTY = "id";
    /** Isoform note **/
    public static final String NOTE_PROPERTY = "note";


    public IsoformNode(Node n){
        super(n);
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getNote(){    return String.valueOf(node.getProperty(NOTE_PROPERTY));}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setNote(String value){  node.setProperty(NOTE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof IsoformNode){
            IsoformNode other = (IsoformNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "id = " + getId() + "\n" +
                "note = " + getNote();
    }

}
