package org.xtext.alma.sdmdsl.generator.verbatimfiller

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class ASDMTablesDef {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file ASDMTables.h
		sdmFsa.setFile("/tmp/include/ASDMTables.h")
		sdmFsa.generateFile(generateASDMTablesDef)
		
	}
	 
	
	
	def generateASDMTablesDef()'''
		#ifndef _ASDMTABLES_H_
		#define _ASDMTABLES_H_
		#include "ASDMTableBase.h"
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
		 * File ASDMTables.h
		 */
		«FOR table : container.sortedAlmaTable»
			 class ASDM_«table.name.toUpperCase()» : public ASDM_TABLE_SINGLETON<ASDM_«table.name.toUpperCase()»>, public ASDM_TABLE_BASE {
			   friend class ASDM_TABLE_SINGLETON<ASDM_«table.name.toUpperCase()»>;
			 	
			 	private:
			 	 ASDM_«table.name.toUpperCase()»();
			 	 ~ASDM_«table.name.toUpperCase()»();
			 	 TableDesc tableDesc_;
			 	
			 	public:
			 	 const TableDesc& tableDesc() const;
			 	 void fill(const ASDM& asdm);
			 };
		«ENDFOR»
		 
		#endif // _ASDMTABLES_H_ 
	'''
	
}