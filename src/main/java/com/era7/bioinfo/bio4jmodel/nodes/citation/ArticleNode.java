/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * The reference information for a journal citation includes the journal abbreviation, the volume number,
 * the page range and the year of publication.<p/>
 * Journal names are abbreviated according to the conventions used by the National Library of Medicine (NLM)
 * and are based on the existing ISO and ANSI standards.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ArticleNode extends BasicEntity{

    public static final String ARTICLE_TITLE_INDEX = "article_title_index";

    public static final String ARTICLE_PUBMED_ID_INDEX = "article_pubmed_id_index";
    public static final String ARTICLE_MEDLINE_ID_INDEX = "article_medline_id_index";
    public static final String ARTICLE_DOI_ID_INDEX = "article_doi_id_index";

    /** Article title */
    public static final String TITLE_PROPERTY = "title";
    /** Article PubMed Id (if known)*/
    public static final String PUBMED_ID_PROPERTY = "pubmed_id";
    /** Article MedLine Id (if known)*/
    public static final String MEDLINE_ID_PROPERTY = "medline_id";
    /** Article DOI Id (if known)*/
    public static final String DOI_ID_PROPERTY = "doi_id";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "journal article";


    public ArticleNode(Node n){
        super(n);
        nodeType = ArticleNode.class.getCanonicalName();
    }


    public String getTitle(){    return String.valueOf(node.getProperty(TITLE_PROPERTY));}
    public String getPubmedId(){    return String.valueOf(node.getProperty(PUBMED_ID_PROPERTY));}
    public String getMedlineId(){    return String.valueOf(node.getProperty(MEDLINE_ID_PROPERTY));}
    public String getDoiId(){    return String.valueOf(node.getProperty(DOI_ID_PROPERTY));}


    public void setTitle(String value){  node.setProperty(TITLE_PROPERTY, value);}
    public void setPubmedId(String value){  node.setProperty(PUBMED_ID_PROPERTY, value);}
    public void setMedlineId(String value){  node.setProperty(MEDLINE_ID_PROPERTY, value);}
    public void setDoiId(String value){  node.setProperty(DOI_ID_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ArticleNode){
            ArticleNode other = (ArticleNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "title = " + getTitle() + "\n" +
                "pubmed id = " + getPubmedId() + "\n" +
                "medline id = " + getMedlineId() + "\n" +
                "doi id = " + getDoiId();
    }

}