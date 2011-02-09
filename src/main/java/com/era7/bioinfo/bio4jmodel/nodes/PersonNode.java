/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Normally people involved on protein citations (authors, editors...)
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class PersonNode extends BasicEntity{

    public static final String PERSON_NAME_INDEX = "person_name_index";

    public static final String NAME_PROPERTY = "name";


    public PersonNode(Node n){
        super(n);
        nodeType = PersonNode.class.getCanonicalName();
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof PersonNode){
            PersonNode other = (PersonNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "name = " + getName();
    }

}
