package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class F90Generator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		enumFsa.setFile("src/sdm_enumerations.f90")
		
		// generates F90 file -> sdm_enumerations.f90	
		enumFsa.generateFile(input.generateF90File)
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	// documentation
	def documentation(String doc){
		var sb = new StringBuilder(doc);
		sb.deleteCharAt(0);
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
	
	// returns head of AST
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}
	
	def generateF90File(EList<Resource> input)'''
		!
		!  ALMA - Atacama Large Millimeter Array
		!  (c) European Southern Observatory, 2002
		!  (c) Associated Universities Inc., 2002
		!  Copyright by ESO (in the framework of the ALMA collaboration),
		!  Copyright by AUI (in the framework of the ALMA collaboration),
		!  All rights reserved.
		!  
		!  This library is free software; you can redistribute it and/or
		!  modify it under the terms of the GNU Lesser General Public
		!  License as published by the Free software Foundation; either
		!  version 2.1 of the License, or (at your option) any later version.
		!  
		!  This library is distributed in the hope that it will be useful,
		!  but WITHOUT ANY WARRANTY, without even the implied warranty of
		!  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		!  Lesser General Public License for more details.
		!  
		!  You should have received a copy of the GNU Lesser General Public
		!  License along with this library; if not, write to the Free Software
		!  Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		!  MA 02111-1307  USA
		!  
		!  /////////////////////////////////////////////////////////////////
		!  // WARNING!  DO NOT MODIFY THIS FILE!                          //
		!  //  ---------------------------------------------------------  //
		!  // | This is generated code!  Do not modify this file.       | //
		!  // | Any changes will be lost when the file is re-generated. | //
		!  //  ---------------------------------------------------------  //
		!  /////////////////////////////////////////////////////////////////
		! 
		!  File sdm_enumerations.f90
		! 
		
		module sdm_Enumerations
		
			«FOR resource : input» 
			
			«generateFa(resourceToEObject(resource) as EnumType)»
			
			«ENDFOR»
		
		contains
		
		«FOR resource : input» 
		
		«generateFb(resourceToEObject(resource) as EnumType)»
		
		«ENDFOR»
		
		end module sdm_Enumerations
		
	'''
	
	
	
	def generateFa(EnumType enumType)'''
		«var counter = 0»
		«FOR literal : enumType.values»
			«IF literal instanceof EnumValueWithoutComma»
				integer, parameter :: «enumType.name»_«literal.name»=«counter++»
			«ENDIF»
			«IF literal instanceof EnumValue»
				integer, parameter :: «enumType.name»_«literal.name»=«counter++»
			«ENDIF»
		«ENDFOR»
	'''
	
	def generateFb(EnumType enumType)'''
		!
			function «enumType.name»_toString(i)
				integer :: i
				character*80 :: «enumType.name»_toString
				select case(i)
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						case(«enumType.name»_«literal.name»)
							«enumType.name»_toString = '«literal.name»'
					«ENDIF»
					«IF literal instanceof EnumValue»
						case(«enumType.name»_«literal.name»)
							«enumType.name»_toString = '«literal.name»'
					«ENDIF»
				«ENDFOR»
				end select
			end function «enumType.name»_toString
		
		!
			function «enumType.name»_fromString(str)
				integer :: «enumType.name»_fromString
				character*80 :: str
				select case(str)
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						case('«literal.name»')
							«enumType.name»_fromString = «enumType.name»_«literal.name»
					«ENDIF»
					«IF literal instanceof EnumValue»
						case('«literal.name»')
							«enumType.name»_fromString = «enumType.name»_«literal.name»
					«ENDIF»
				«ENDFOR»
				end select
			end function «enumType.name»_fromString
		
	'''
}