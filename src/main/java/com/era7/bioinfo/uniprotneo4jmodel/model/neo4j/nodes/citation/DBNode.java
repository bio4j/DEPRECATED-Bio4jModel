/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * This class models databases where data is submitted, e.g. EMBL/GenBank/DDBJ.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DBNode extends BasicEntity{

    public static final String DB_NAME_INDEX = "db_name_index";

    /** Database name **/
    public static final String NAME_PROPERTY = "name";


    public DBNode(Node n){
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
        if(obj instanceof DBNode){
            DBNode other = (DBNode) obj;
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
