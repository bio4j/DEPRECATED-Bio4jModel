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

package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Organisms genome elements
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GenomeElementNode extends BasicEntity{

    public static final String GENOME_ELEMENT_ID_INDEX = "genome_element_id_index";
    public static final String NODE_TYPE = GenomeElementNode.class.getCanonicalName();

    public static final String ID_PROPERTY = "id";
    public static final String SEQUENCE_PROPERTY = "sequence";


    public GenomeElementNode(Node n){
        super(n);
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getSequence(){    return String.valueOf(node.getProperty(SEQUENCE_PROPERTY));}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setSequence(String value){  node.setProperty(SEQUENCE_PROPERTY, value);}


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
