/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * The reference information for submissions includes the date and the database to which the
 * data were submitted.
 * Data submitted to the following databases is available: <br>
 * - the EMBL/GenBank/DDBJ databases <br>
 * - UniProtKB <br>
 * - the PDB data bank <br>
 * - the PIR data bank <br>
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class SubmissionNode extends BasicEntity{

    public static final String SUBMISSION_TITLE_INDEX = "submission_title_index";

    /** Submission title **/
    public static final String TITLE_PROPERTY = "title";
    /** Submission date **/
    public static final String DATE_PROPERTY = "date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "submission";


    public SubmissionNode(Node n){
        super(n);
    }


    public String getTitle(){    return String.valueOf(node.getProperty(TITLE_PROPERTY));}
    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}


    public void setTitle(String value){  node.setProperty(TITLE_PROPERTY, value);}
    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SubmissionNode){
            SubmissionNode other = (SubmissionNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "title = " + getTitle();
    }

}
