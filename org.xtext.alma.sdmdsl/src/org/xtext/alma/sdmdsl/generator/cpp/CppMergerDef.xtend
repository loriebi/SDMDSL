package org.xtext.alma.sdmdsl.generator.cpp

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.AlmaTableContainer

class CppMergerDef {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file Merger.h
		sdmFsa.setFile("include/Merger.h")
		sdmFsa.generateFile(generateMergerDef)
	}
	
	
	def generateMergerDef()'''
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
		 * File Merger.h
		 */
		#ifndef Merger_CLASS
		#define Merger_CLASS
		#include <map>
		
		#include "«container.name».h"
		«FOR table : container.tables»
			#include "«table.name»Table.h"
			#include "«table.name»Row.h"
		«ENDFOR»
		
		/*\file "Merger.h"
		    \brief Generated from model's revision "«AlmaTableContainer.revision»", branch "«AlmaTableContainer.branch»"
		*/
		using namespace std;
		
		
		namespace asdm {
			
			class Merger {
				public :
					Merger();
						virtual ~Merger();
						
						void merge(«container.name»* ds1, «container.name»* ds2);
				private:
					ASDM* ds1;
					ASDM* ds2;
					map<string, Tag> tagTag;
					Tag getTag(const Tag& t, void (Merger::*mergeTables)());
					
					map<string, int> idId;
					int getId(const string& tableName, int id, void (Merger::*mergeTables)());
					
					«FOR table : container.tables»
						bool hasMerged«table.name»;	
					«ENDFOR»
					
					«FOR table : container.tables»
						void merge«table.name»();
						void postMerge«table.name»();
					«ENDFOR»
					
					«FOR table : container.tables»
						void (Merger::*merge«table.name»Ptr) () ;
					«ENDFOR»
			};
			
		} // End namespace asdm
		
		#endif  /* Merger_CLASS */
	'''
}