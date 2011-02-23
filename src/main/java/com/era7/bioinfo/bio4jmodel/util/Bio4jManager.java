/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.util;

import com.era7.bioinfo.bio4jmodel.nodes.*;
import com.era7.bioinfo.bio4jmodel.nodes.citation.*;
import com.era7.bioinfo.bioinfoneo4j.Neo4jManager;
import java.util.HashMap;
import java.util.Map;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.Index;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class Bio4jManager extends Neo4jManager{

    private static boolean alreadyCreated = false;

    private static String PROVIDER_ST = "provider";
    private static String EXACT_ST = "exact";
    private static String FULL_TEXT_ST = "fulltext";
    private static String LUCENE_ST = "lucene";
    private static String TYPE_ST = "type";

    private GraphDatabaseService graphDbService = null;

    private Index<Node> goTermIdIndex = null;
    private Index<Node> proteinAccessionIndex = null;
    private Index<Node> proteinFullNameFullTextIndex = null;
    private Index<Node> proteinGeneNamesFullTextIndex = null;
    private Index<Node> keywordIdIndex = null;
    private Index<Node> keywordNameIndex = null;
    private Index<Node> interproIdIndex = null;
    private Index<Node> organismScientificNameIndex = null;
    private Index<Node> organismNcbiTaxonomyIdIndex = null;
    private Index<Node> taxonNameIndex = null;
    private Index<Node> featureTypeNameIndex = null;
    private Index<Node> commentTypeNameIndex = null;
    private Index<Node> isoformIdIndex = null;
    private Index<Node> personNameFullTextIndex = null;
    private Index<Node> consortiumNameIndex = null;
    private Index<Node> instituteNameIndex = null;
    private Index<Node> countryNameIndex = null;
    private Index<Node> cityNameIndex = null;
    private Index<Node> thesisFullTextIndex = null;
    private Index<Node> patentNumberIndex = null;
    private Index<Node> bookNameFullTextIndex = null;
    private Index<Node> publisherNameIndex = null;
    private Index<Node> onlineArticleTitleFullTextIndex = null;
    private Index<Node> onlineJournalNameIndex = null;
    private Index<Node> articleTitleFullTextIndex = null;
    private Index<Node> articleMedlineIdIndex = null;
    private Index<Node> articleDoiIdIndex = null;
    private Index<Node> articlePubmedIdIndex = null;
    private Index<Node> journalNameIndex = null;

    /**
     * Constructor
     * @param dbFolder
     */
    public Bio4jManager(String dbFolder){        
        super(dbFolder,firstTimeCalled());
        graphDbService = Neo4jManager.graphService;

        Map<String,String> indexProps = new HashMap<String, String>();
        indexProps.put(PROVIDER_ST, LUCENE_ST);
        indexProps.put(TYPE_ST, EXACT_ST);

        Map<String,String> indexFullTextProps = new HashMap<String, String>();
        indexFullTextProps.put(PROVIDER_ST, LUCENE_ST);
        indexFullTextProps.put(TYPE_ST, FULL_TEXT_ST);

        goTermIdIndex = graphDbService.index().forNodes(GoTermNode.GO_TERM_ID_INDEX, indexProps);
        proteinAccessionIndex = graphDbService.index().forNodes(ProteinNode.PROTEIN_ACCESSION_INDEX, indexProps);
        proteinFullNameFullTextIndex = graphDbService.index().forNodes(ProteinNode.PROTEIN_FULL_NAME_FULL_TEXT_INDEX, indexFullTextProps);
        proteinGeneNamesFullTextIndex = graphDbService.index().forNodes(ProteinNode.PROTEIN_GENE_NAMES_FULL_TEXT_INDEX, indexFullTextProps);
        keywordIdIndex = graphDbService.index().forNodes(KeywordNode.KEYWORD_ID_INDEX, indexProps);
        keywordNameIndex = graphDbService.index().forNodes(KeywordNode.KEYWORD_NAME_INDEX, indexProps);
        interproIdIndex = graphDbService.index().forNodes(InterproNode.INTERPRO_ID_INDEX, indexProps);
        organismScientificNameIndex = graphDbService.index().forNodes(OrganismNode.ORGANISM_SCIENTIFIC_NAME_INDEX, indexProps);
        organismNcbiTaxonomyIdIndex = graphDbService.index().forNodes(OrganismNode.NCBI_TAXONOMY_ID_PROPERTY, indexProps);
        taxonNameIndex = graphDbService.index().forNodes(TaxonNode.TAXON_NAME_INDEX, indexProps);
        featureTypeNameIndex = graphDbService.index().forNodes(FeatureTypeNode.FEATURE_TYPE_NAME_INDEX, indexProps);
        commentTypeNameIndex = graphDbService.index().forNodes(CommentTypeNode.COMMENT_TYPE_NAME_INDEX, indexProps);
        isoformIdIndex = graphDbService.index().forNodes(IsoformNode.ISOFORM_ID_INDEX, indexProps);
        personNameFullTextIndex = graphDbService.index().forNodes(PersonNode.PERSON_NAME_FULL_TEXT_INDEX, indexFullTextProps);
        consortiumNameIndex = graphDbService.index().forNodes(ConsortiumNode.CONSORTIUM_NAME_INDEX, indexProps);
        instituteNameIndex = graphDbService.index().forNodes(InstituteNode.INSTITUTE_NAME_INDEX, indexProps);
        countryNameIndex = graphDbService.index().forNodes(CountryNode.COUNTRY_NAME_INDEX, indexProps);
        cityNameIndex = graphDbService.index().forNodes(CityNode.CITY_NAME_INDEX, indexProps);
        thesisFullTextIndex = graphDbService.index().forNodes(ThesisNode.THESIS_TITLE_FULL_TEXT_INDEX, indexProps);
        patentNumberIndex = graphDbService.index().forNodes(PatentNode.PATENT_NUMBER_INDEX, indexProps);
        bookNameFullTextIndex = graphDbService.index().forNodes(BookNode.BOOK_NAME_FULL_TEXT_INDEX, indexFullTextProps);
        publisherNameIndex = graphDbService.index().forNodes(PublisherNode.PUBLISHER_NAME_INDEX, indexProps);
        onlineArticleTitleFullTextIndex = graphDbService.index().forNodes(OnlineArticleNode.ONLINE_ARTICLE_TITLE_FULL_TEXT_INDEX, indexFullTextProps);
        onlineJournalNameIndex = graphDbService.index().forNodes(OnlineJournalNode.ONLINE_JOURNAL_NAME_INDEX, indexProps);
        articleTitleFullTextIndex = graphDbService.index().forNodes(ArticleNode.ARTICLE_TITLE_FULL_TEXT_INDEX, indexFullTextProps);
        articleMedlineIdIndex = graphDbService.index().forNodes(ArticleNode.ARTICLE_MEDLINE_ID_INDEX, indexProps);
        articleDoiIdIndex = graphDbService.index().forNodes(ArticleNode.ARTICLE_DOI_ID_INDEX, indexProps);
        articlePubmedIdIndex = graphDbService.index().forNodes(ArticleNode.ARTICLE_PUBMED_ID_INDEX, indexProps);
        journalNameIndex = graphDbService.index().forNodes(JournalNode.JOURNAL_NAME_INDEX, indexProps);
        

    }
    private static synchronized boolean firstTimeCalled(){
        if(!alreadyCreated){
            alreadyCreated = true;
            return true;
        }else{
            return false;
        }
    }

    //---------------------------------------------------------------
    //--------------------------INDEXES------------------------------
    //------------------------------------------------------------------S

    public Index<Node> getGoTermIdIndex(){        
        return goTermIdIndex;
    }
    public Index<Node> getProteinAccessionIndex(){        
        return proteinAccessionIndex;
    }
    public Index<Node> getProteinFullNameFullTextIndex(){
        return proteinFullNameFullTextIndex;
    }
    public Index<Node> getProteinGeneNamesFullTextIndex(){
        return proteinGeneNamesFullTextIndex;
    }
    public Index<Node> getKeywordIdIndex(){
        return keywordIdIndex;
    }
    public Index<Node> getKeywordNameIndex(){
        return keywordNameIndex;
    }
    public Index<Node> getInterproIdIndex(){
        return interproIdIndex;
    }
    public Index<Node> getOrganismScientificNameIndex(){
        return organismScientificNameIndex;
    }
    public Index<Node> getOrganismNcbiTaxonomyIdIndex(){
        return organismNcbiTaxonomyIdIndex;
    }
    public Index<Node> getTaxonNameIndex(){
        return taxonNameIndex;
    }
    public Index<Node> getFeatureTypeNameIndex(){
        return featureTypeNameIndex;
    }
    public Index<Node> getCommentTypeNameIndex(){
        return commentTypeNameIndex;
    }
    public Index<Node> getIsoformIdIndex(){
        return isoformIdIndex;
    }
    public Index<Node> getPersonNameIndex(){
        return personNameFullTextIndex;
    }
    public Index<Node> getConsortiumNameIndex(){
        return consortiumNameIndex;
    }
    public Index<Node> getInstituteNameIndex(){
        return instituteNameIndex;
    }
    public Index<Node> getCountryNameIndex(){
        return countryNameIndex;
    }
    public Index<Node> getCityNameIndex(){
        return cityNameIndex;
    }
    public Index<Node> getThesisFullTextIndex(){
        return thesisFullTextIndex;
    }
    public Index<Node> getPatentNumberIndex(){
        return patentNumberIndex;
    }
    public Index<Node> getBookNameFullTextIndex(){
        return bookNameFullTextIndex;
    }
    public Index<Node> getPublisherNameIndex(){
        return publisherNameIndex;
    }
    public Index<Node> getOnlineArticleTitleFullTextIndex(){
        return onlineArticleTitleFullTextIndex;
    }
    public Index<Node> getOnlineJournalNameIndex(){
        return onlineJournalNameIndex;
    }
    public Index<Node> getArticleTitleFullTextIndex(){
        return articleTitleFullTextIndex;
    }
    public Index<Node> getArticleMedLineIdIndex(){
        return articleMedlineIdIndex;
    }
    public Index<Node> getArticleDoiIdIndex(){
        return articleDoiIdIndex;
    }
    public Index<Node> getArticlePubmedIdIndex(){
        return articlePubmedIdIndex;
    }
    public Index<Node> getJournalNameIndex(){
        return journalNameIndex;
    }



}
