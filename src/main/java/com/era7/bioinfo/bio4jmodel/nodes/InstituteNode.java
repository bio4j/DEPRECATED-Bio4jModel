/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * This class just models a Research Institute.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class InstituteNode extends BasicEntity{

    public static final String INSTITUTE_NAME_INDEX = "institute_name_index";

    /** Institute name **/
    public static final String NAME_PROPERTY = "name";


    public InstituteNode(Node n){
        super(n);
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof InstituteNode){
            InstituteNode other = (InstituteNode) obj;
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
