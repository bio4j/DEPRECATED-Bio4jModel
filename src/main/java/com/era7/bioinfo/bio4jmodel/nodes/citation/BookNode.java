/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * The reference information for articles found in books or other types of publication includes
 * the book name, the volume number, the page range, the publisher, the city and the year.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BookNode extends BasicEntity{

    public static final String BOOK_NAME_INDEX = "book_name_index";

    /** Book name **/
    public static final String NAME_PROPERTY = "name";
    /** Year **/
    public static final String DATE_PROPERTY = "date";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "book";


    public BookNode(Node n){
        super(n);
        nodeType = BookNode.class.getCanonicalName();
    }


    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}
    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}


    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}
    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BookNode){
            BookNode other = (BookNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "name = " + getName() + "\n" +
                "date = " + getDate();
    }

}