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
 * Gene ontology term
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class GoTermNode extends BasicEntity{

    public static final String GO_TERM_ID_INDEX = "go_term_id_index";

    /** GO Term id **/
    public static final String ID_PROPERTY = "id";
    /** Go Term name **/
    public static final String NAME_PROPERTY = "name";
    /** Go Term definition **/
    public static final String DEFINITION_PROPERTY = "definition";
    /** Go Term namespace.<br>
        One of these:<br>
        - Biological process<br>
        - Molecular function<br>
        - Cellular component<br>**/
    public static final String NAMESPACE_PROPERTY = "namespace";
    public static final String ALTERNATIVE_IDS_PROPERTY = "alternative_ids";

    public static final String BIOLOGICAL_PROCESS_NAMESPACE = "biological_process";
    public static final String MOLECULAR_FUNCTION_NAMESPACE = "molecular_function";
    public static final String CELLULAR_COMPONENT_NAMESPACE = "cellular_component";


    public GoTermNode(Node n){
        super(n);
        nodeType = GoTermNode.class.getCanonicalName();
    }


    public String getId(){  return String.valueOf(node.getProperty(ID_PROPERTY));}
    public String getName(){    return String.valueOf(node.getProperty(NAME_PROPERTY));}
    public String getDefinition(){  return String.valueOf(node.getProperty(DEFINITION_PROPERTY));}
    public String getNamespace(){   return String.valueOf(node.getProperty(NAMESPACE_PROPERTY));}
    public String[] getAlternativeIds(){    return (String[]) node.getProperty(ALTERNATIVE_IDS_PROPERTY);}


    public void setId(String value){    node.setProperty(ID_PROPERTY, value);}
    public void setName(String value){  node.setProperty(NAME_PROPERTY, value);}
    public void setDefinition(String value){    node.setProperty(DEFINITION_PROPERTY, value);}
    public void setNamespace(String value){ node.setProperty(NAMESPACE_PROPERTY, value);}
    public void setAlternativeIds(String[] value){  node.setProperty(ALTERNATIVE_IDS_PROPERTY, value);}


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof GoTermNode){
            GoTermNode other = (GoTermNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "id = " + getId() +
                "\nnamespace = " + getNamespace() + 
                "\nname = " + getName() +
                "\ndefinition = " + getDefinition();
    }

}
