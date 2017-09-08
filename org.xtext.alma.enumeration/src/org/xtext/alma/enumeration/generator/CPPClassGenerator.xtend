package org.xtext.alma.enumeration.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.enumeration.enumeration.EnumValue
import org.xtext.alma.enumeration.enumeration.EnumValueWithoutComma
import org.xtext.alma.enumeration.generator.enumfilesystem.EnumerationFileSystemAccess

class CPPClassGenerator extends EnumerationAbstractGenerator {

	override doGenerate(EList<Resource> input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		/*
		 * generates CPP class file for each resource
		 */
		for (Resource resource : input) {
			doGenerate(resource, fsa, context)
		}
	}

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var enumFsa = (fsa as EnumerationFileSystemAccess)

		var enumType = resourceToEObject(resource) as EnumType
		enumFsa.setFile("src/C" + enumType.name + ".cpp")
		enumFsa.generateFile(enumType.generateCPPClass)
		
	}
	
	
	
	// returns head of AST
	def resourceToEObject(Resource resource) {
		return resource?.allContents?.head
	}

	def generateCPPClass(EnumType enumType) '''
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
		 * File C«enumType.name».cpp
		 */
		  
		#include <sstream>
		#include <C«enumType.name».h>
		#include <string>
			
		using namespace std;
		 	
		 	
		int C«enumType.name»::version() {
			return «enumType.name»Mod::version;
		}
		
		string C«enumType.name»::revision () {
			return «enumType.name»Mod::revision;
		}
		 	
		 	
		unsigned int C«enumType.name»::size() {
			return «enumType.values.size»;
		}
		
		
		«FOR literal : enumType.values»
			«IF literal instanceof EnumValueWithoutComma»
				const std::string& C«enumType.name»::s«literal.name» = "«literal.name»";
			«ENDIF»
			«IF literal instanceof EnumValue»
				const std::string& C«enumType.name»::s«literal.name» = "«literal.name»";
			«ENDIF»			
		«ENDFOR»
		
		const std::vector<std::string> C«enumType.name»::names() {
			std::vector<std::string> enumSet;
			
			«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					enumSet.insert(enumSet.end(), C«enumType.name»::s«literal.name»);
				«ENDIF»
				«IF literal instanceof EnumValue»
					enumSet.insert(enumSet.end(), C«enumType.name»::s«literal.name»);
				«ENDIF»
				
			«ENDFOR»
			
			return enumSet;
		}
		
		std::string C«enumType.name»::name(const «enumType.name»Mod::«enumType.name»& f) {
			
			switch (f) {
				
				«FOR literal : enumType.values»
					«IF literal instanceof EnumValueWithoutComma»
						case «enumType.name»Mod::«literal.name»:
							return C«enumType.name»::s«literal.name»;
					«ENDIF»
					«IF literal instanceof EnumValue»
						case «enumType.name»Mod::«literal.name»:
							return C«enumType.name»::s«literal.name»;
					«ENDIF»
					
				«ENDFOR»
			
			}
			
			// Impossible siutation but....who knows with C++ enums
			throw badInt((int) f);
		    
		}
		
		
		«enumType.name»Mod::«enumType.name» C«enumType.name»::new«enumType.name»(const std::string& name) {
			
			«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					if (name == C«enumType.name»::s«literal.name»){
						return «enumType.name»Mod::«literal.name»;
					}
				«ENDIF»
				«IF literal instanceof EnumValue»
					if (name == C«enumType.name»::s«literal.name»){
						return «enumType.name»Mod::«literal.name»;
					}
				«ENDIF»
				
			«ENDFOR»
			
			throw badString(name);
		}
		
		
		«enumType.name»Mod::«enumType.name» C«enumType.name»::literal(const std::string& name) {
			«FOR literal : enumType.values»
				«IF literal instanceof EnumValueWithoutComma»
					if (name == C«enumType.name»::s«literal.name»){
						return «enumType.name»Mod::«literal.name»;
					}
				«ENDIF»
				«IF literal instanceof EnumValue»
					if (name == C«enumType.name»::s«literal.name»){
						return «enumType.name»Mod::«literal.name»;
					}
				«ENDIF»
				
			«ENDFOR»
			
			throw badString(name);
		}
		
		
		«enumType.name»Mod::«enumType.name» C«enumType.name»::from_int(unsigned int i) {
			vector<string> names_ = names();
			if (i >= names_.size()) throw badInt(i);
			return new«enumType.name»(names_.at(i));
		}
		
		
		string C«enumType.name»::badString(const string& name) {
			return "'"+name+"' does not correspond to any literal in the enumeration '«enumType.name»'.";
		}
		
		
		string C«enumType.name»::badInt(unsigned int i) {
			ostringstream oss ;
			oss << "'" << i << "' is out of range for the enumeration '«enumType.name»'.";
			return oss.str();
		}
		
		
		
		namespace «enumType.name»Mod {
			
			std::ostream & operator << ( std::ostream & out, const «enumType.name»& value) {
				out << C«enumType.name»::name(value);
				return out;
			}

			std::istream & operator >> ( std::istream & in , «enumType.name»& value ) {
				in.clear();
				string s;
				in >> s;
				try {
					value = C«enumType.name»::literal(s);
				}
				catch (string & m) {
					in.setstate(ios::failbit);
				}
				return in;
			}
		}		
		
	'''
}
