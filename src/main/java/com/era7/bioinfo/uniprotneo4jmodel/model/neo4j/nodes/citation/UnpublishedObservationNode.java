/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * The reference information for unpublished observations includes the month and the year.
 * The expression ‘unpublished observations’ is used to cite communications directly submitted to UniProtKB/Swiss-Prot by
 * scientists and concerning their unpublished biological information on various aspects of the entry.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnpublishedObservationNode extends BasicEntity{

    /** Date (month and year) **/
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
