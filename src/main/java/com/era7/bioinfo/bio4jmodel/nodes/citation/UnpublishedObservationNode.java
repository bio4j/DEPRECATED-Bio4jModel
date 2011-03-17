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

package com.era7.bioinfo.bio4jmodel.nodes.citation;

import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import org.neo4j.graphdb.Node;

/**
 * Protein unpublished observation citations
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class UnpublishedObservationNode extends BasicEntity{

    public static final String DATE_PROPERTY = "date";

    public static final String NODE_TYPE = UnpublishedObservationNode.class.getCanonicalName();

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "unpublished observations";


    public UnpublishedObservationNode(Node n){
        super(n);
    }


    public String getDate(){    return String.valueOf(node.getProperty(DATE_PROPERTY));}

    public void setDate(String value){  node.setProperty(DATE_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof UnpublishedObservationNode){
            UnpublishedObservationNode other = (UnpublishedObservationNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "date = " + getDate();
    }

}
