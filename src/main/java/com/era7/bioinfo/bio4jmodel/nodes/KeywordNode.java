/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Keyword
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class KeywordNode extends BasicEntity{

    public static final String KEYWORD_ID_INDEX = "keyword_id_index";
    public static final String KEYWORD_NAME_INDEX = "keyword_name_index";

    /** Keyword id **/
    public static final String ID_PROPERTY = "id";
    /** Keyword name **/
    public static final String NAME_PROPERTY = "name";


    public KeywordNode(Node n){
        super(n);
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof KeywordNode){
            KeywordNode other = (KeywordNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "id = " + getId() + "\n" +
                "name = " + getName();
    }

}
