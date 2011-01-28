/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 *
 * @author ppareja
 */
public class UnpublishedObservationNode extends BasicEntity{

    public static final String DATE_PROPERTY = "date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "unpublished observations";


    public UnpublishedObservationNode(Node n){
        super(n);
    }


    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}

    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof UnpublishedObservationNode){
            UnpublishedObservationNode other = (UnpublishedObservationNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
