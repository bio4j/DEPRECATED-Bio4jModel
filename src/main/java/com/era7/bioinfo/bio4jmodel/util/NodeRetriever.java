/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era7.bioinfo.bio4jmodel.util;

import com.era7.bioinfo.bio4jmodel.nodes.*;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.index.IndexHits;

/**
 *
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class NodeRetriever {
    
    protected Bio4jManager manager;
    
    
    public NodeRetriever(Bio4jManager bio4jManager){
        manager = bio4jManager;
    }
    
    
    //-------------------------------------------------------------------
    //--------------------GENE ONTOLOGY--------------------------------
    
    /**
     * 
     * @param goId
     * @return GoTermNode with the id provided
     */
    public GoTermNode getGoTermById(String goId){
        
        IndexHits<Node> hits = manager.getGoTermIdIndex().get(GoTermNode.GO_TERM_ID_INDEX, goId);
        
        if(hits.hasNext()){
            return new GoTermNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    
    //-------------------------------------------------------------------
    //--------------------PROTEINS--------------------------------
    
    /**
     * 
     * @param goId 
     * @return ProteinNode with the accession provided
     */
    public ProteinNode getProteinNodeByAccession(String proteinAccession){
        
        IndexHits<Node> hits = manager.getProteinAccessionIndex().get(ProteinNode.PROTEIN_ACCESSION_INDEX, proteinAccession);
        
        if(hits.hasNext()){
            return new ProteinNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    /**
     * 
     * @param proteinFullName
     * @return List of proteins (if any) which match the full name provided
     */
    public List<ProteinNode> getProteinsByFullName(String proteinFullName){
        
        IndexHits<Node> hits = manager.getProteinFullNameFullTextIndex().get(ProteinNode.PROTEIN_FULL_NAME_FULL_TEXT_INDEX, proteinFullName);
        
        List<ProteinNode> list = new ArrayList<ProteinNode>();
        
        while(hits.hasNext()){
            list.add(new ProteinNode(hits.next()));
        }        
        return list;        
    }
    
    /**
     * 
     * @param proteinGeneName
     * @return List of proteins (if any) which match the gene name provided
     */
    public List<ProteinNode> getProteinsByGeneNames(String proteinGeneName){
        
        IndexHits<Node> hits = manager.getProteinGeneNamesFullTextIndex().get(ProteinNode.PROTEIN_GENE_NAMES_FULL_TEXT_INDEX, proteinGeneName);
        
        List<ProteinNode> list = new ArrayList<ProteinNode>();
        
        while(hits.hasNext()){
            list.add(new ProteinNode(hits.next()));
        }        
        return list;        
    }
    
    
    //-------------------------------------------------------------------
    //--------------------KEYWORDS--------------------------------
    
    /**
     * 
     * @param keywordId 
     * @return KeywordNode with the id provided
     */
    public KeywordNode getKeywordById(String keywordId){
        
        IndexHits<Node> hits = manager.getKeywordIdIndex().get(KeywordNode.KEYWORD_ID_INDEX, keywordId);
        
        if(hits.hasNext()){
            return new KeywordNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    /**
     * 
     * @param keywordName 
     * @return KeywordNode with the id provided
     */
    public KeywordNode getKeywordByName(String keywordName){
        
        IndexHits<Node> hits = manager.getKeywordNameIndex().get(KeywordNode.KEYWORD_NAME_INDEX, keywordName);
        
        if(hits.hasNext()){
            return new KeywordNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    
    //-------------------------------------------------------------------
    //--------------------INTERPRO--------------------------------
    /**
     * 
     * @param interproId 
     * @return InterproNode with the id provided
     */
    public InterproNode getInterproById(String interproId){
        
        IndexHits<Node> hits = manager.getInterproIdIndex().get(InterproNode.INTERPRO_ID_INDEX, interproId);
        
        if(hits.hasNext()){
            return new InterproNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    //-------------------------------------------------------------------
    //--------------------ORGANISM--------------------------------
    /**
     * 
     * @param scientificName 
     * @return OrganismNode with the scientific name provided
     */
    public OrganismNode getOrganismByScientificName(String scientificName){
        
        IndexHits<Node> hits = manager.getOrganismScientificNameIndex().get(OrganismNode.ORGANISM_SCIENTIFIC_NAME_INDEX, scientificName);
        
        if(hits.hasNext()){
            return new OrganismNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    /**
     * 
     * @param scientificName 
     * @return OrganismNode with the scientific name provided
     */
    public OrganismNode getOrganismByNCBITaxonomyId(String ncbiTaxonomyId){
        
        IndexHits<Node> hits = manager.getOrganismNcbiTaxonomyIdIndex().get(OrganismNode.ORGANISM_NCBI_TAXONOMY_ID_INDEX, ncbiTaxonomyId);
        
        if(hits.hasNext()){
            return new OrganismNode(hits.getSingle());
        }else{
            return null;
        }        
    }
    
    //-------------------------------------------------------------------
    //--------------------TAXON--------------------------------
    
    /**
     * 
     * @param taxonName
     * @return TaxonNode with the name provided
     */
    public TaxonNode getTaxonByName(String taxonName){
        IndexHits<Node> hits = manager.getTaxonNameIndex().get(TaxonNode.TAXON_NAME_INDEX, taxonName);        
        if(hits.hasNext()){
            return new TaxonNode(hits.getSingle());
        }else{
            return null;
        }   
    }
    
    //-------------------------------------------------------------------
    //--------------------ISOFORMS--------------------------------
    /**
     * 
     * @param isoformId
     * @return IsoformNode with the id provided
     */
    public IsoformNode getIsoformById(String isoformId){
        IndexHits<Node> hits = manager.getIsoformIdIndex().get(IsoformNode.ISOFORM_ID_INDEX, isoformId);        
        if(hits.hasNext()){
            return new IsoformNode(hits.getSingle());
        }else{
            return null;
        }   
    }
    //-------------------------------------------------------------------
    //--------------------PERSON--------------------------------
    /**
     * 
     * @param personName
     * @return PersonNode with the name provided
     */
    public List<PersonNode> getPeopleByName(String personName){
        
        IndexHits<Node> hits = manager.getPersonNameIndex().get(PersonNode.PERSON_NAME_FULL_TEXT_INDEX, personName);
        
        List<PersonNode> list = new ArrayList<PersonNode>();
        
        while(hits.hasNext()){
            list.add(new PersonNode(hits.next()));
        }        
        return list; 
    }
    
}
