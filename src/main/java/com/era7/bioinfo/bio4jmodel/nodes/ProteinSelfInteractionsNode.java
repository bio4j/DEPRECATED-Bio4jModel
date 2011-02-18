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
 * This class just models a Research Institute.
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinSelfInteractionsNode extends BasicEntity{

    
    public ProteinSelfInteractionsNode(Node n){
        super(n);
        nodeType = ProteinSelfInteractionsNode.class.getCanonicalName();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ProteinSelfInteractionsNode){
            ProteinSelfInteractionsNode other = (ProteinSelfInteractionsNode) obj;
            return this.node.equals(other.node);
        }else{
            return false;
        }
    }


}
