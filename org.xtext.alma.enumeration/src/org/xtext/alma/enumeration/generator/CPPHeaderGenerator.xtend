package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class CPPHeaderGenerator extends EnumerationAbstractGenerator{
	
	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/*
		 * generates cpp header file for each resource
		*/
		for(Resource resource : input){
			doGenerate(resource,fsa,context)
		}
		
	}
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)

		var enumType = resourceToEObject(resource) as EnumType
		enumFsa.setFile("include/C" + enumType.name + ".h")
		enumFsa.generateFile(enumType.generateCPPHeader)
		
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
	
	def generateCPPHeader(EnumType enumType)'''
		#ifndef C«enumType.name»_H
		#define C«enumType.name»_H
		
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
		 * /////////////////////////////////////////////////////////////////
		 * // WARNING!  DO NOT MODIFY THIS FILE!                          //
		 * //  ---------------------------------------------------------  //
		 * // | This is generated code!  Do not modify this file.       | //
		 * // | Any changes will be lost when the file is re-generated. | //
		 * //  ---------------------------------------------------------  //
		 * /////////////////////////////////////////////////////////////////
		 *
		 * File C«enumType.name».h
		 */
		 
		#ifndef __cplusplus
		#error This is a C++ include file and cannot be used from plain C
		#endif

		#include <iostream>
		#include <string>
		#include <vector>
		
		/**
		* A namespace to encapsulate the «enumType.name» enumeration.
		*/
		#ifndef WITHOUT_ACS
		#include <almaEnumerations_IFC.h>
		#else
		
		// This part mimics the behaviour of
		namespace «enumType.name»Mod
		{
			//! «enumType.name»
			//! «documentation(enumType?.docEnum)»
			
			const char *const revision = "«enumType.revision»";
			const int version = «enumType.version»;
			
			
			enum «enumType.name»{
				«FOR literal : enumType.values SEPARATOR ','»
					«IF literal instanceof EnumValueWithoutComma»
						«literal.name» «IF literal.doc != null» «documentation(literal.doc)»«ENDIF»
					«ENDIF»
					«IF literal instanceof EnumValue»
						«literal.name» «IF literal.doc != null» «documentation(literal.doc)»«ENDIF»
					«ENDIF»
				«ENDFOR»
			};
			typedef «enumType.name» &«enumType.name»_out;
		
		}
		#endif
		
		
		namespace «enumType.name»Mod {
			std::ostream & operator << ( std::ostream & out, const «enumType.name»& value);
			std::istream & operator >> ( std::istream & in , «enumType.name»& value );
		}
		
		/** 
		* A helper class for the enumeration «enumType.name».
		* 
		*/
		class C«enumType.name» {
			public:
			
				/**
				* Enumerators as strings.
				*/
				«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					static const std::string& s«literal.name»; /*!< A const string equal to "«literal.name»" .*/
				«ENDIF»
				«IF literal instanceof EnumValue»
					static const std::string& s«literal.name»; /*!< A const string equal to "«literal.name»" .*/
				«ENDIF»
				
				«ENDFOR»
				
				
				
				/**
				* Return the major version number as an int.
				* @return an int.
				*/
				static int version();
				
				
				/**
				* Return the revision as a string.
				* @return a string
				*/
				static std::string revision();
				
				
				/**
				* Return the number of enumerators declared in «enumType.name»Mod::«enumType.name».
				* @return an unsigned int.
				*/
				static unsigned int size();
				
				
				/**
				* Returns an enumerator as a string.
				* @param e an enumerator of «enumType.name»Mod::«enumType.name».
				* @return a string.
				*/
				static std::string name(const «enumType.name»Mod::«enumType.name»& e);
				
				
				/**
				* Equivalent to the name method.
				*/
				static std::string toString(const «enumType.name»Mod::«enumType.name»& f) { return name(f); }
				
				
				/** 
				* Returns vector of  all the enumerators as strings. 
				* The strings are stored in the vector in the same order than the enumerators are declared in the enumeration.
				* @return a vector of string.
				*/
				static const std::vector<std::string> names();
				
				
				// Create a «enumType.name» enumeration object by specifying its name.
				static «enumType.name»Mod::«enumType.name» new«enumType.name»(const std::string& name);
				
				
				/*! Return a «enumType.name»'s enumerator  given a string.
				* @param name the string representation of the enumerator.
				* @return a «enumType.name»Mod::«enumType.name»'s enumerator.
				* @throws a string containing an error message if no enumerator could be found for this name.
				*/
				static «enumType.name»Mod::«enumType.name» literal(const std::string& name);
				
				
				/*! Return a «enumType.name»'s enumerator given an unsigned int.
				* @param i the index of the enumerator in «enumType.name»Mod::«enumType.name».
				* @return a «enumType.name»Mod::«enumType.name»'s enumerator.
				* @throws a string containing an error message if no enumerator could be found for this integer.
				*/
				static «enumType.name»Mod::«enumType.name» from_int(unsigned int i);
				
				
				private:
					/* Not Implemented.  This is a pure static class. */
					C«enumType.name»();
					C«enumType.name»(const C«enumType.name»&);
					C«enumType.name»& operator=(const C«enumType.name»&);
					
					static std::string badString(const std::string& name);
					static std::string badInt(unsigned int i);
					
		};
		#endif /*!C«enumType.name»_H*/
	'''

}