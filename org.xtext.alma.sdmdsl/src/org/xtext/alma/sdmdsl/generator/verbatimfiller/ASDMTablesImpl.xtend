package org.xtext.alma.sdmdsl.generator.verbatimfiller

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.ASDMAttribute

class ASDMTablesImpl {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDMTables.cpp
		sdmFsa.setFile("/tmp/src/ASDMTables.cpp")
		sdmFsa.generateFile(generateASDMTablesImpl)
		
	}
	
	
	def generateASDMTablesImpl()'''
		#include "ASDMTables.h"
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
		 * File ASDMTables.cpp
		 */
		#include <stdint.h>
		«FOR table : container.sortedAlmaTable»
			ASDM_«table.name.toUpperCase()»::ASDM_«table.name.toUpperCase()»() {
				name_ = "ASDM_«table.name.toUpperCase()»";
				tableDesc_.comment() = "The verbatim copy of the ASDM's dataset «table.name» table";
				«FOR attr : table.keyAttributes»
					tableDesc_.addColumn(«attr.casaColumnDesc»<«attr.casaScalarType»>("«attr.name»", "blabla"));
				«ENDFOR»
				«FOR attr : table.requiredValueAttributes»
					tableDesc_.addColumn(«attr.casaColumnDesc»<«attr.casaScalarType»>("«attr.name»", "blabla"));
				«ENDFOR»
				«FOR attr : table.optionalValueAttributes»
					tableDesc_.addColumn(«attr.casaColumnDesc»<«attr.casaScalarType»>("«attr.name»", "blabla"));
				«ENDFOR»
			}
			
			ASDM_«table.name.toUpperCase()»::~ASDM_«table.name.toUpperCase()»() {
			}
			
			const TableDesc& ASDM_«table.name.toUpperCase()»::tableDesc() const {
			  return tableDesc_;
			}
			
			#include "«table.name»Table.h"
			#include "«table.name»Row.h"
			
			«FOR attr : table.intrinsic»
				«IF attr.isEnumeration»
					using namespace «attr.typeName»Mod;
				«ENDIF»
			«ENDFOR»
			
			void ASDM_«table.name.toUpperCase()»::fill(const ASDM& asdm) {
				vector<«table.name»Row*> rows = asdm.get«table.name»().get();
				unsigned int rowIndex = table_p_->nrow();
				table_p_->addRow(rows.size());
				«FOR attr : table.keyAttributes»
					«attr.casaColumn»<«attr.casaScalarType»> «attr.name»(*table_p_, "«attr.name»");
				«ENDFOR»
				«FOR attr : table.requiredValueAttributes»
					«attr.casaColumn»<«attr.casaScalarType»> «attr.name»(*table_p_, "«attr.name»");
				«ENDFOR»
				«FOR attr : table.optionalValueAttributes»
					«attr.casaColumn»<«attr.casaScalarType»> «attr.name»(*table_p_, "«attr.name»");  
				«ENDFOR»
				
				for (unsigned int i = 0; i < rows.size(); i++) {
					«FOR attr : table.keyAttributes»
						«PUT("rowIndex", "rows.at(i)->", attr)»
					«ENDFOR»
					«FOR attr : table.requiredValueAttributes»
						«PUT("rowIndex", "rows.at(i)->", attr)»
					«ENDFOR»
					«FOR attr : table.optionalValueAttributes»
						«PUTOPT("rowIndex", "rows.at(i)->", attr)»
					«ENDFOR»				
					
					rowIndex++;		
				}
			}
			
			
		«ENDFOR»
	'''
	
	
	def PUT(String rowIndex, String rowContext, ASDMAttribute attr)'''
		«IF attr.isArray»
			«attr.name».put(«rowIndex», «attr.casaArrayValue(rowContext)»);
		«ELSE»
			«attr.name».put(«rowIndex», «attr.casaScalarValue(rowContext)»);
		«ENDIF»
	'''
	
	
	def PUTOPT(String rowIndex, String rowContext, ASDMAttribute attr)'''
		«IF attr.isArray»
			if («rowContext»is«attr.UpperCaseName»Exists())
				«attr.name».put(«rowIndex», «attr.casaArrayValue(rowContext)»);
		«ELSE»
			if («rowContext»is«attr.UpperCaseName»Exists())
				«attr.name».put(«rowIndex», «attr.casaScalarValue(rowContext)»);
		«ENDIF»
	'''
	
	
}