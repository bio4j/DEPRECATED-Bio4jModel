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

package com.era7.bioinfo.bio4jmodel.relationships.protein;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * 
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinFoundInGenomeElementRel extends BasicRelationship{

    public static final String NAME = "PROTEIN_FOUND_IN_GENOME_ELEMENT";

    public static final String BEGIN_PROPERTY = "begin";
    public static final String END_PROPERTY = "end";

    public ProteinFoundInGenomeElementRel(Relationship rel){
        super(rel);
    }

    public int getBegin(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(BEGIN_PROPERTY)));
    }
    public int getEnd(){
        return Integer.parseInt(String.valueOf(this.relationship.getProperty(END_PROPERTY)));
    }

    public void setBegin(int value){
        relationship.setProperty(BEGIN_PROPERTY, String.valueOf(value));
    }
    public void setEnd(int value){
        relationship.setProperty(END_PROPERTY, String.valueOf(value));
    }


    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String toString(){
        return super.toString() + "\nbegin = " + getBegin() + "\n" +
                "end = " + getEnd();
    }

}
