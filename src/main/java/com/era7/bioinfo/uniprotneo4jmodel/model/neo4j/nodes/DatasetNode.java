/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Datasets from which proteins where retrieved. <br>
 * One of these two values: <br>
 * - Swiss-Prot
 * - Trembl
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class DatasetNode extends BasicEntity{

    public static final String DATASET_NAME_INDEX = "dataset_name_index";

    /** Dataset name **/
    public static final String NAME_PROPERTY = "name";


    public DatasetNode(Node n){
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
        if(obj instanceof DatasetNode){
            DatasetNode other = (DatasetNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

}
