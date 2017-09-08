package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.enumeration.EnumerationContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.enumeration.enumeration.EnumType
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppEnumerationParserImpl {
	
	var enumerationContainer = EnumerationContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file EnumerationParser.cpp
		sdmFsa.setFile("src/EnumerationParser.cpp")
		sdmFsa.generateFile(generateEnumerationParserImpl)
	}
	
	
	
	def generateEnumerationParserImpl()'''
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
		 * File EnumerationParser.cpp
		 */
		 
		#include "EnumerationParser.h"
		#include <sstream>
		#include <stdlib.h> // for atoi()
		#include <errno.h>  // to detect exception raised by atoi.
		using namespace std;
		 
		using namespace asdm;
		 
		namespace asdm {
			string EnumerationParser::getField(const string &xml, const string &field) {
					string::size_type b = xml.find("<" + field + ">");
					if (b == string::npos)
						return "";
					b += field.length() + 2;
					string::size_type e = xml.find("</" + field + ">",b);
					if (e == string::npos)
						return "";
					string s = substring(xml,b,e);
					return trim(s);
			}
			
			string EnumerationParser::substring(const string &s, int a, int b) {
					return s.substr(a,(b - a));
			}
			
			string EnumerationParser::trim(const string &s) {
					string::size_type i = 0;
					while (s.at(i) == ' ' && i < s.length())
						++i;
					if (i == s.length())
						return "";
					string::size_type j = s.length() - 1;
					while (s.at(j) == ' ' && j > i)
						--j;
					return substring(s,i,j + 1);
			}
			
			«FOR enumType : enumerationContainer.enumerations»
				«dotCpp(enumType)»
			«ENDFOR»
		} // namespace asdm.
	'''
	
	
	def dotCpp(EnumType enumType)'''
		string EnumerationParser::toXML(const string& elementName, «enumType.name»Mod::«enumType.name» e) {
			return "<"+elementName+">"+C«enumType.name»::name(e)+"</"+elementName+">";
		}
		
		string EnumerationParser::toXML(const string& elementName, const vector<«enumType.name»Mod::«enumType.name»>& v_e) {
			ostringstream oss;
			oss << "<" << elementName << ">" 
				<< " 1" 
				<< " " << v_e.size();
		
			for (unsigned int i = 0; i < v_e.size(); i++) 
				oss << " " << C«enumType.name»::name(v_e.at(i));
			oss << "</" << elementName << ">";
			return oss.str();
		}
		
		string EnumerationParser::toXML(const string& elementName, const vector<vector<«enumType.name»Mod::«enumType.name»> >& vv_e) {
			ostringstream oss;
			oss << "<" << elementName << ">"  
				<< " 2"
				<< " " <<vv_e.size()
				<< " " <<vv_e.at(0).size();
				
			for (unsigned int i = 0; i < vv_e.size(); i++)
				for (unsigned int j = 0; j < vv_e.at(i).size(); j++) 
					oss << " " << C«enumType.name»::name(vv_e.at(i).at(j));
			oss << "</" << elementName << ">";
			return oss.str();
		}
		
		string EnumerationParser::toXML(const string& elementName, const vector<vector<vector<«enumType.name»Mod::«enumType.name»> > >& vvv_e) {
			ostringstream oss;
			oss << "<" << elementName << ">"  
				<< " 3"
				<< " " <<vvv_e.size()
				<< " " <<vvv_e.at(0).size()
				<< " " <<vvv_e.at(0).at(0).size();
				
			for (unsigned int i = 0; i < vvv_e.size(); i++)
				for (unsigned int j = 0; j < vvv_e.at(i).size(); j++)
					for (unsigned int k = 0; k < vvv_e.at(i).at(j).size(); k++)
						oss << " " << C«enumType.name»::name(vvv_e.at(i).at(j).at(k));
			oss << "</" << elementName << ">";
			return oss.str();
		}
		
		«enumType.name»Mod::«enumType.name» EnumerationParser::get«enumType.name»(const string &name, const string &tableName, const string &xmlDoc) {
			string s = getField(xmlDoc,name);
				if (s.length() == 0)
					throw ConversionException("Error: Missing field \"" + 
						name + "\" or invalid syntax",tableName);
						
			«enumType.name» result;
			try {
				result = C«enumType.name»::new«enumType.name»(s);
			}
			catch (...) {
					throw ConversionException("Error: could not convert '"+s+"' into a «enumType.name».", tableName);
			}
			return result;
		}
		
		vector<«enumType.name»Mod::«enumType.name»> EnumerationParser::get«enumType.name»1D(const string &name, const string &tableName, const string &xmlDoc) {
			vector<«enumType.name»Mod::«enumType.name»>	result;
			
			string s = getField(xmlDoc,name);
				if (s.length() == 0)
					throw ConversionException("Error: Missing field \"" + 
						name + "\" or invalid syntax",tableName);
			
			istringstream iss;
			iss.str(s);
			vector<string> tokens;
			
			// Tokenize.
			string buf;
			while (iss >> buf) {
				tokens.push_back(buf);
			}
			
			// The length must be 2 at the minimum (there may be an empty array)
			if (tokens.size() < 2) 
				throw ConversionException("Error: missing values in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
		
			
			
			// The number of dimension should be 1.
			if (tokens.at(0) != "1")
				throw ConversionException("Error: wrong dimensionality in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
				
			// Then parse the size of the unique dimension
			errno = 0;
			int size1 = atoi(tokens.at(1).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);
			
			if (size1 < 0)
				throw ConversionException("Error: wrong size for the unique dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
				
			if (tokens.size() != (unsigned int) (size1 + 2))
				throw ConversionException("Error: incorrect number of values in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
				
			int k = 2;
			try {
				for (unsigned int i = 0 ; i < (unsigned int) size1; i++) {
					 result.push_back(C«enumType.name»::new«enumType.name»(tokens.at(k).c_str()));
					 k++;
				}
			} 
			catch (...) {
					throw ConversionException("Error: in '" + s + "' could not convert '"+tokens.at(k)+"' into a «enumType.name».", tableName);
			}
		
			return result;
		}
		
		vector<vector<«enumType.name»Mod::«enumType.name»> > EnumerationParser::get«enumType.name»2D(const string &name, const string &tableName, const string &xmlDoc) {
			vector<vector<«enumType.name»Mod::«enumType.name»> >	result;
			
			string s = getField(xmlDoc,name);
			if (s.length() == 0)
				throw ConversionException("Error: Missing field \"" + 
						name + "\" or invalid syntax",tableName);
			
			istringstream iss;
			iss.str(s);
			vector<string> tokens;
		
			// Tokenize.
			string buf;
			while (iss >> buf) {
				tokens.push_back(buf);
			}
			
			// The length must be 3 at the minimum (there may be an empty array)
			if (tokens.size() < 3) 
				throw ConversionException("Error: missing values in field \"" + 
						name + "\" or invalid syntax(" + s +"')",tableName);	
				
				
			// The number of dimension should be 2.
			if (tokens.at(0) != "2")
				throw ConversionException("Error: wrong dimensionality in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
			
			// Then parse the size of the two dimensions
			errno = 0;
			int size1 = atoi(tokens.at(1).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);
			
			if (size1 <= 0)
				throw ConversionException("Error: wrong size for the first dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName); 
			errno = 0;
			int size2 = atoi(tokens.at(2).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);	
			
			if (size2 < 0)
				throw ConversionException("Error: wrong size for the second dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName); 
				
			if (tokens.size() != (unsigned int) (size1*size2 + 3))
				throw ConversionException("Error: incorrect number of values in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
				
			int k = 3;
			try {
				vector<«enumType.name»Mod::«enumType.name»> v_aux;
				for (unsigned int i = 0; i < (unsigned int) size1; i++) {
					v_aux.clear();
					for (unsigned int j = 0; j < (unsigned int) size2; j++) {
						v_aux.push_back(C«enumType.name»::new«enumType.name»(tokens.at(k).c_str()));
						k++;
					}
					result.push_back(v_aux);
				}
			}
			catch (...) {
				throw ConversionException("Error: in '" + s + "' could not convert '"+tokens.at(k)+"' into a «enumType.name».", tableName);
			}	
			return result;	
		}
		
		vector<vector<vector<«enumType.name»Mod::«enumType.name»> > > EnumerationParser::get«enumType.name»3D(const string &name, const string &tableName, const string &xmlDoc) {
			vector<vector<vector<«enumType.name»Mod::«enumType.name»> >	>result;
				
			string s = getField(xmlDoc,name);
			if (s.length() == 0)
				throw ConversionException("Error: Missing field \"" + 
						name + "\" or invalid syntax",tableName);
			
			istringstream iss;
			iss.str(s);
			vector<string> tokens;
		
			// Tokenize.
			string buf;
			while (iss >> buf) {
				tokens.push_back(buf);
			}
			
			// The length must be 4 at the minimum (there may be an empty array)
			if (tokens.size() < 4)
				throw ConversionException("Error: missing values in field \"" + 
						name + "\" or invalid syntax(" + s +"')",tableName);	 
		
				
			// The number of dimension should be 3.
			if (tokens.at(0) != "3")
				throw ConversionException("Error: wrong dimensionality in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);	
			
			// Then parse the size of the three dimensions
			errno = 0;
			int size1 = atoi(tokens.at(1).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);	
			
			if (size1 <= 0)
				throw ConversionException("Error: wrong size for the first dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName); 
		
			errno = 0;		
			int size2 = atoi(tokens.at(2).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);	
			
			if (size2 <= 0)
				throw ConversionException("Error: wrong size for the first dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName); 
		
			errno = 0;
			int size3 = atoi(tokens.at(3).c_str());
			if (errno != 0) throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax ('" + s +"')", tableName);	
			
			
			if (size3 < 0)
				throw ConversionException("Error: wrong size for the second dimension \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName); 
				
			if (tokens.size() != (unsigned int) (size1*size2*size3 + 4))
				throw ConversionException("Error: incorrect number of values in field \"" + 
						name + "\" or invalid syntax('" + s +"')",tableName);
						
			int k = 4;
			try {
				vector<«enumType.name»Mod::«enumType.name»> v_aux;
				vector<vector<«enumType.name»Mod::«enumType.name»> > vv_aux;	
				for (unsigned int i = 0; i < (unsigned int) size1; i++) {
					vv_aux.clear();
					for (unsigned int j = 0; j < (unsigned int) size2; j++) {
						v_aux.clear();
						for (unsigned int l = 0; l < (unsigned int) size3; l++) {
							v_aux.push_back(C«enumType.name»::new«enumType.name»(tokens.at(k).c_str()));
							k++;
						}
						vv_aux.push_back(v_aux);
					}
					result.push_back(vv_aux);
				}
			}
			catch (...) {
				throw ConversionException("Error:in '" + s + "' could not convert '"+tokens.at(k)+"' into a «enumType.name».", tableName);
			}
			
			return result;	
		}	
	'''
	
}