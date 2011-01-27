/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * This class is aimed to list the alternative protein sequences that can be generated
 * from the same gene by a single or by the combination of up to four biological events: <br>
 * - alternative promoter usage <br>
 * - alternative splicing <br>
 * - alternative initiation <br>
 * - ribosomal frameshifting <br>
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class AlternativeProductNode extends BasicEntity{

    public static final String ALTERNATIVE_PRODUCT_NAME_INDEX = "alternative_product_name_index";

    /** Alternative product name; one of these: <br>
     * - alternative initiation <br>
     * - alternative promoter <br>
     * - ribosomal frameshifting <br>
     * - alternative splicing
     */
    public static final String NAME_PROPERTY = "name";


    public AlternativeProductNode(Node n){
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
