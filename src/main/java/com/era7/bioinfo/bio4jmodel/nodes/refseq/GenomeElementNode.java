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

package com.era7.bioinfo.bio4jmodel.nodes.refseq;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Organisms genome elements
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementNode extends BasicEntity{

    public static final String GENOME_ELEMENT_VERSION_INDEX = "genome_element_version_index";
    public static final String NODE_TYPE = GenomeElementNode.class.getCanonicalName();

    public static final String VERSION_PROPERTY = "version";
    public static final String COMMENT_PROPERTY = "comment";
    public static final String DEFINITION_PROPERTY = "definition";


    public GenomeElementNode(Node n){
        super(n);
    }


    public String getVersion(){  return String.valueOf(node.getProperty(VERSION_PROPERTY));}
    public String getComment(){    return String.valueOf(node.getProperty(COMMENT_PROPERTY));}
    public String getDefinition(){  return String.valueOf(node.getProperty(DEFINITION_PROPERTY));}


    public void setVersion(String value){    node.setProperty(VERSION_PROPERTY, value);}
    public void setComment(String value){  node.setProperty(COMMENT_PROPERTY, value);}
    public void setDefinition(String value){  node.setProperty(DEFINITION_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof GenomeElementNode){
            GenomeElementNode other = (GenomeElementNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

}
