package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppTagTypeImpl {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file TagType.cpp
		sdmFsa.setFile("src/TagType.cpp")
		sdmFsa.generateFile(generateTagTypeImpl)
		
	}
	
	
	
	def generateTagTypeImpl()'''
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
		 * File TagType.cpp
		 */
		 #include "TagType.h"
		
		namespace asdm {
			
			const TagType* TagType::NoType = new TagType("NoType") ;
			«FOR table : container.tables »
				«IF table.autoIncrementable.size != 0»
					const TagType* TagType::«table.name» = new TagType("«table.name»") ;
				«ENDIF»
			«ENDFOR»
				
			map<string, const TagType*> fillName2TagType_m() {
				map<string, const TagType*> result;
				result["NoType"] = TagType::NoType;
				«FOR table : container.tables »
					«IF table.autoIncrementable.size != 0»
						result["«table.name»"] = TagType::«table.name» ;
					«ENDIF»
				«ENDFOR»
				return result;
			}
			
			static map<string, const TagType*> name2TagType_m = fillName2TagType_m();
			
			TagType::TagTypeMgr TagType::tagTypeMgr;
			
			TagType::TagType(string name) {
			  this->name = name;
			}
			
			string TagType::toString() const {
			  return this->name;
			}
			
			const TagType* TagType::getTagType(string name) {
			  return name2TagType_m[name];
			} 
			
		} // End of namespace asdm
	'''
	
}