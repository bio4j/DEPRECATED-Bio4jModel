/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.era7.bioinfo.bio4jmodel.nodes.reactome;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Gene ontology term
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ReactomeTermNode extends BasicEntity{

    public static final String REACTOME_TERM_ID_INDEX = "reactome_term_id_index";
    public static final String NODE_TYPE = ReactomeTermNode.class.getCanonicalName();

    /** Reactome Term id **/
    public static final String ID_PROPERTY = "id";
    /** Reactome term pathway name **/
    public static final String PATHWAY_NAME_PROPERTY = "pathway_name";


    public ReactomeTermNode(Node n){
        super(n);
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getPathwayName(){    return String.valueOf(node.getProperty(PATHWAY_NAME_PROPERTY));}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setPathwayName(String value){  node.setProperty(PATHWAY_NAME_PROPERTY, value);}
  
    
    
    
    
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ReactomeTermNode){
            ReactomeTermNode other = (ReactomeTermNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "id = " + getId() +
                "\npathway name = " + getPathwayName();
    }

}
