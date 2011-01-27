/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * It simply models a country
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class CountryNode extends BasicEntity{

    public static final String COUNTRY_NAME_INDEX = "country_name_index";

    /** Country name **/
    public static final String NAME_PROPERTY = "name";


    public CountryNode(Node n){
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
        if(obj instanceof CountryNode){
            CountryNode other = (CountryNode) obj;
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
