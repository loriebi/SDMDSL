package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.enumeration.EnumerationContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppEnumerationParserDef {
	
	var enumerationContainer = EnumerationContainer.getInstance();
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file EnumerationParser.h
		sdmFsa.setFile("include/EnumerationParser.h")
		sdmFsa.generateFile(generateEnumerationParserDef)
		
	}
	
	
	def generateEnumerationParserDef()'''
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
		 * File CEnumerationParser.h
		 */
		#include <string>
		#include <ConversionException.h>
		 
		using namespace std;
		«/* Include all enumerations include files */»
		«FOR enumType : enumerationContainer.enumerations SEPARATOR '\n'»
			#include "C«enumType.name».h"
			using namespace «enumType.name»Mod;
		«ENDFOR»
		
		namespace asdm {
		 
		 	class EnumerationParser {
		 	
		 	static string getField(const string &xml, const string &field);
		 	
		 	static string substring(const string &s, int a, int b);
		 	
		 	static string trim(const string &s);
			
			public:
				«FOR enumType : enumerationContainer.enumerations»
					«dotH(enumType)»
				«ENDFOR»
			};
		} // namespace asdm.
	'''
	
	
	def dotH(EnumType enumType)'''
		/**
		 * Returns a string which represents a XML element 
		 * with name 'elementName' and a content equal to 
		 * the string associated to 'e'
		 * @param elementName a string.
		 * @param e  «enumType.name»Mod::«enumType.name» value.
		 * @return a string.
		 */
		static string toXML(const string& elementName, «enumType.name»Mod::«enumType.name» e);
		 
		/**
		 * Returns a string which represents a XML element 
		 * with name 'elementName' and of content equal to 
		 * the number of elements of 'v_e' followed by sequence of strings associated to each element of 'v_e'
		 * @param elementName a string.
		 * @param v_e  a const reference to a vector<«enumType.name»Mod::«enumType.name»>.
		 * @return a string.
		 */
		static string toXML(const string& elementName, const vector<«enumType.name»Mod::«enumType.name»>& v_e);
		 
		 
		/**
		 * Returns a string which represents a XML element 
		 * with name 'elementName' and of content equal to 
		 * the number of elements of 'vv_e' followed by sequence of strings associated to each element of 'vv_e'.
		 * @param elementName a string.
		 * @param vv_e  a const reference to a vector<vector<«enumType.name»Mod::«enumType.name»> >.
		 * @return a string.
		 */	
		static string toXML(const string& elementName, const vector<vector<«enumType.name»Mod::«enumType.name»> >& vv_e); 
		

		/**
		 * Returns a string which represents a XML element 
		 * with name 'elementName' and of content equal to 
		 * the number of elements of 'vvv_e' followed by sequence of strings associated to each element of 'vvv_e'.
		 * @param elementName a string.
		 * @param vvv_e  a const reference to a vector<vector<vector<«enumType.name»Mod::«enumType.name»> > >.
		 * @return a string.
		 */	
		static string toXML(const string& elementName, const vector<vector<vector<«enumType.name»Mod::«enumType.name»> > >& vvv_e);
		
		
		/**
		 * Returns a «enumType.name»Mod::«enumType.name» from a string.
		 * @param xml the string to be converted into a «enumType.name»Mod::«enumType.name»
		 * @return a «enumType.name»Mod::«enumType.name».
		 */
		static «enumType.name»Mod::«enumType.name» get«enumType.name»(const string &name, const string &tableName, const string &xmlDoc);
		
		/**
		 * Returns a vector<«enumType.name»Mod::«enumType.name»> from a string.
		 * @param xml the string to be converted into a vector<«enumType.name»Mod::«enumType.name»>
		 * @return a vector<«enumType.name»Mod::«enumType.name»>.
		 */
		static vector<«enumType.name»Mod::«enumType.name»> get«enumType.name»1D(const string &name, const string &tableName, const string &xmlDoc);


		/**
		 * Returns a vector<vector<«enumType.name»Mod::«enumType.name»> > from a string.
		 * @param xml the string to be converted into a vector<vector<«enumType.name»Mod::«enumType.name»> >
		 * @return a vector<vector<«enumType.name»Mod::«enumType.name»> >.
		 */
		static vector<vector<«enumType.name»Mod::«enumType.name»> > get«enumType.name»2D(const string &name, const string &tableName, const string &xmlDoc);
		
		/**
		 * Returns a vector<vector<vector<«enumType.name»Mod::«enumType.name»> > > from a string.
		 * @param xml the string to be converted into a vector<vector<vector<«enumType.name»Mod::«enumType.name»> > >
		 * @return a vector<vector<vector<«enumType.name»Mod::«enumType.name»> > >.
		 */
		static vector<vector<vector<«enumType.name»Mod::«enumType.name»> > > get«enumType.name»3D(const string &name, const string &tableName, const string &xmlDoc);
	'''
}