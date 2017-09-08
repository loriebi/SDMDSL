package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class PythonGenerator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/*
		 * generates python file for each resource
		 */
		for(Resource resource : input){
			doGenerate(resource,fsa,context)
		}
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var enumFsa = (fsa as EnumerationFileSystemAccess)
		
		var enumType = resourceToEObject(resource) as EnumType
		enumFsa.setFile("src/PyDataModelEnumeration/Py"+ enumType.name +"/__init__.py")
		enumFsa.generateFile(enumType.generatePython)
	}
	
	// returns head of AST 
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
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
	
	def generatePython(EnumType enumType)'''
		#! /usr/bin/env python
		# ALMA - Atacama Large Millimeter Array
		# (c) European Southern Observatory, 2002
		# (c) Associated Universities Inc., 2002
		# Copyright by ESO (in the framework of the ALMA collaboration),
		# Copyright by AUI (in the framework of the ALMA collaboration),
		# All rights reserved.
		# 
		# This library is free software; you can redistribute it and/or
		# modify it under the terms of the GNU Lesser General Public
		# License as published by the Free software Foundation; either
		# version 2.1 of the License, or (at your option) any later version.
		# 
		# This library is distributed in the hope that it will be useful,
		# but WITHOUT ANY WARRANTY, without even the implied warranty of
		# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
		# Lesser General Public License for more details.
		# 
		# You should have received a copy of the GNU Lesser General Public
		# License along with this library; if not, write to the Free Software
		# Foundation, Inc., 59 Temple Place, Suite 330, Boston,
		# MA 02111-1307  USA
		# 
		# /////////////////////////////////////////////////////////////////
		# // WARNING!  DO NOT MODIFY THIS FILE!                          //
		# //  =========================================================  //
		# // | This is generated code!  Do not modify this file.       | //
		# // | Any changes will be lost when the file is re-generated. | //
		# //  =========================================================  //
		# /////////////////////////////////////////////////////////////////
		#
		# File __init__.py
		#
		
		
		from «enumType.name»Mod import *
		from ACSErrTypeCommon import BadParameterEx
		
		def fromString(stringVersionOfEnumeration):
			try:
				return {
					«FOR literal : enumType.values»
						«IF literal instanceof EnumValueWithoutComma»
							'«literal.name»': «literal.name»,
						«ENDIF»
						«IF literal instanceof EnumValue»
							'«literal.name»': «literal.name»,
						«ENDIF»
					«ENDFOR»
				}[stringVersionOfEnumeration]
			except KeyError:
				raise BadParameterEx('stringVersionOfEnumeration')
				
		def «enumType.name»Set():
			return [
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						'«enumType.name»',
					«ENDIF»
					«IF literal instanceof EnumValue»
						'«enumType.name»',
					«ENDIF»
				«ENDFOR»
		 	]
		"""
		Although this method could be simpler, the strings are listed explicity
		to ensure consistency between this and other language mappings.
		"""
		def toString(valueVersionOfEnumeration):
			return {
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						«literal.name»: '«literal.name»',
					«ENDIF»
					«IF literal instanceof EnumValue»
						«literal.name»: '«literal.name»',
					«ENDIF»
				«ENDFOR»
		 	}[valueVersionOfEnumeration]
		
		def hasHelp():
			«IF enumType.docEnum != null» 
				return True
			«ELSE»
				return False
			«ENDIF»
			
		«IF enumType.docEnum != null»
			def help(valueVersionOfEnumeration):
				return {
					«FOR literal : enumType.values»
						«IF literal instanceof EnumValueWithoutComma»
							«literal.name»: """«documentation(literal.doc)»""",
						«ENDIF»
						«IF literal instanceof EnumValue»
							«literal.name»: """«documentation(literal.doc)»""",
						«ENDIF»
					«ENDFOR»
				}
		«ENDIF»
		
		def hasAssociatedNumber():
		 	return False
		 	
		def new«enumType.name»(p):
		     if type(p) is str:
		         return fromString(p)
		     return None
	'''
	
}