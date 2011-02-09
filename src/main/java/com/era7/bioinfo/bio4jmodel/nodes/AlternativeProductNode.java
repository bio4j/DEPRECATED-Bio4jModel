/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Protein alternative products
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class AlternativeProductNode extends BasicEntity{

    public static final String ALTERNATIVE_PRODUCT_NAME_INDEX = "alternative_product_name_index";

    public static final String NAME_PROPERTY = "name";


    public AlternativeProductNode(Node n){
        super(n);
        nodeType = AlternativeProductNode.class.getCanonicalName();
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AlternativeProductNode){
            AlternativeProductNode other = (AlternativeProductNode) obj;
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
