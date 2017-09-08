package org.xtext.alma.sdmdsl.generator.verbatimfiller

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.AlmaTableContainer

class Name2TableImpl {
	
	var container = AlmaTableContainer.instance
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file Name2TableDef.cpp
		sdmFsa.setFile("/tmp/src/Name2TableDef.cpp")
		sdmFsa.generateFile(generateName2TableImpl)
		
	}
	 
	
	def generateName2TableImpl()'''
		/*
		 * ALMA - Atacama Large Millimeter Array
		 * (c) European Southern Observatory, 2002
		 * (c) Associated Universities Inc., 2002
		 * Copyright by ESO (in the framework of the ALMA collaboration),
		 * Copyright by AUI (in the framework of the ALMA collaboration),
		 * All rights reserved.
		 * 
		 * This library is free software; you can redistribute it and/or
		 * modify it under the terms of the GNU Lesser General Public
		 * License as published by the Free software Foundation; either
		 * version 2.1 of the License, or (at your option) any later version.
		 * 
		 * This library is distributed in the hope that it will be useful,
		 * but WITHOUT ANY WARRANTY, without even the implied warranty of
		 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		 * Lesser General Public License for more details.
		 * 
		 * You should have received a copy of the GNU Lesser General Public
		 * License along with this library; if not, write to the Free Software
		 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		 * MA 02111-1307  USA
		 *
		 * Warning!
		 *  -------------------------------------------------------------------- 
		 * | This is generated code!  Do not modify this file.                  |
		 * | If you do, all changes will be lost when the file is re-generated. |
		 *  --------------------------------------------------------------------
		 *
		 * File Name2Table.cpp
		 */
		#include "ASDMTables.h"
		#include "Name2Table.h"
		#include "boost/regex.hpp"
		#include "boost/tokenizer.hpp"
		#include "boost/algorithm/string.hpp"
		
		#include <casa/Logging.h>
		
		using namespace boost; 
		using namespace std;
		
		typedef tokenizer<boost::char_separator<char> > my_tok;
		
		map<string, ASDM_TABLE_BASE*> Name2Table::name2Table_;
		bool Name2Table::init_ = Name2Table::init();
		set<ASDM_TABLE_BASE*> Name2Table::table_;
		
		bool Name2Table::init() {
			«FOR table : container.sortedAlmaTable»
				name2Table_["«table.name»"] = ASDM_«table.name.toUpperCase()»::instance();	
			«ENDFOR»
			
			return true;
		}
		
		const set<ASDM_TABLE_BASE*>& Name2Table::find (const vector<string>& name, bool verbose) {
		
		  LogSinkInterface& lsif = LogSink::globalSink();
		  ostringstream infostream; 
		
		  // Empty the set just to be sure.
		  table_.clear();
		  
		  // Process each string given as input
		  string wildcard = "*";
		  for (unsigned int i = 0; i < name.size(); i++) {
		    // Replace any possible wildcard (*) by a sequences '(.)*'
		    string name_ = name.at(i);
		    char_separator<char> sep("*", "", boost::keep_empty_tokens);
		    my_tok tokens(name_, sep);
		    ostringstream oss;
		    my_tok::iterator tok_iter = tokens.begin();
		    oss << *tok_iter ;
		    ++tok_iter;
		    for (; tok_iter != tokens.end(); ++tok_iter)
		      oss << "(.)*" << *tok_iter ; 
		
		    // Build a boost regexp out of this string written onto oss.
		    regex expression(oss.str().c_str()); 
		
		    // For each table name
		    for (map<string, ASDM_TABLE_BASE*>::const_iterator iter = name2Table_.begin();
			 iter!= name2Table_.end(); iter++) {
		      // Is there a match between the string and the name of the table ?
		      cmatch what; 
		      if(regex_match(iter->first.c_str(), what, expression)) {
		      	string uppername = iter->first; to_upper(uppername);
		      	if (verbose) {
		      		infostream.str("");
		      		infostream << "An ASDM_" << uppername << " table will be added to the MS" << endl;
		      		LogSink::postGlobally(LogMessage(infostream.str(),
							              			 LogOrigin("Name2Table", 
							                                   "find (const vector<string>& name, bool verbose=false)", 
							                                   WHERE)));
		      	}
				table_.insert(iter->second);
		      }
		    }
		  }
		  return table_;
		}
	'''
}