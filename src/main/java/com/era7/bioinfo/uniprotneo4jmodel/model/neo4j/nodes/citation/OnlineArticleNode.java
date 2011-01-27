/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.uniprotneo4jmodel.model.neo4j.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * The reference information for a online article citation includes the online journal,
 * the locator and the title, (plus author list information).
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class OnlineArticleNode extends BasicEntity{

    public static final String ONLINE_ARTICLE_TITLE_INDEX = "online_article_title_index";


    /** Online article title **/
    public static final String TITLE_PROPERTY = "title";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online journal article";


    public OnlineArticleNode(Node n){
        super(n);
    }


    public String getTitle(){    return String.valueOf(node.getProperty(TITLE_PROPERTY));}


    public void setTitle(String value){  node.setProperty(TITLE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof OnlineArticleNode){
            OnlineArticleNode other = (OnlineArticleNode) obj;
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
