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
    /** Isoform name **/
    public static final String NAME_PROPERTY = "name";
    /** Isoform note **/
    public static final String NOTE_PROPERTY = "note";
    /** Isoform sequence **/
    public static final String SEQUENCE_PROPERTY = "sequence";


    public IsoformNode(Node n){
        super(n);
        nodeType = IsoformNode.class.getCanonicalName();
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getNote(){    return String.valueOf(node.getProperty(NOTE_PROPERTY));}
    public String getName() {        return String.valueOf(node.getProperty(NAME_PROPERTY)); }
    public String getSequence() {        return String.valueOf(node.getProperty(SEQUENCE_PROPERTY));    }


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setNote(String value){  node.setProperty(NOTE_PROPERTY, value);}
    public void setName(String value) {        node.setProperty(NAME_PROPERTY, value);    }
    public void setSequence(String value) {      node.setProperty(SEQUENCE_PROPERTY, value);   }


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
