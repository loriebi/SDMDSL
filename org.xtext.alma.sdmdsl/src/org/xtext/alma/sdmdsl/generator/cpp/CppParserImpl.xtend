package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.ASDMAttribute

class CppParserImpl {
	
	var container = AlmaTableContainer.getInstance();
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context){
	
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file Parser.cpp
		sdmFsa.setFile("src/Parser.cpp")
		sdmFsa.generateFile(generateParserImpl)
		
	}
	
	
	
	def generateParserImpl()'''
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
		 * File Parser.cpp
		 */
		#include <iostream>
		#include <sstream>
		#include <Base64.h>
		
		#include <Parser.h>
		#include <boost/property_tree/detail/xml_parser_utils.hpp>
		#include <OutOfBoundsException.h>
		#include <NumberFormatException.h>
		#include <BooleanWrapper.h>
		#include <ByteWrapper.h>
		#include <CharacterWrapper.h>
		#include <DoubleWrapper.h>
		#include <FloatWrapper.h>
		#include <IntegerWrapper.h>
		#include <LongWrapper.h>
		#include <ShortWrapper.h>
		
		using asdm::OutOfBoundsException;
		using asdm::NumberFormatException;
		using asdm::Boolean;
		using asdm::Byte;
		using asdm::Character;
		using asdm::Double;
		using asdm::Float;
		using asdm::Integer;
		using asdm::Long;
		using asdm::Short;
		
		namespace asdm { 
		 
			string Parser::substring(const string &s, int a, int b) {
				return s.substr(a,(b - a));
			}
			
		  	string Parser::trim(const string &s) {
				unsigned int i = 0;
				//while (s.at(i) == ' ' && i < s.length())
				while (i < s.length() && s.at(i) == ' ')
					++i;
				if (i == s.length())
					return "";
				unsigned int j = s.length() - 1;
				//while (s.at(j) == ' ' && j > i)
				while (j > i && s.at(j) == ' ')
					--j;
				return substring(s,i,j + 1);		
			}
		 
		 	/**
			 * Get the portion of the string bounded by s1 and s2, inclusive.
			 * @param s1
			 * @param s2
			 * @return
			 */
			string Parser::getElement(const string &s1, const string &s2) {
				beg = str.find(s1,pos);
				if (beg == string::npos)
					return "";
				end = str.find(s2,beg + s1.length());
				if (end == string::npos)
					return "";
				pos = end + s2.length();
				return substring(str,beg,end + s2.length());
			}
		
			/**
			 * Get the portion of the string bounded by s1 and s2, exclusive.
			 * @param s1
			 * @param s2
			 * @return
			 */
			string Parser::getElementContent(const string &s1, const string &s2) {
				string s = getElement(s1,s2);
				if (s.length() == 0)
					return "";
				s = substring(str,beg + s1.length(),end);
				return trim(s);
			}
		
			string Parser::getField(const string &field) {
				beg = str.find("<" + field + ">");
				if (beg == string::npos)
					return "";
				beg += field.length() + 2;
				end = str.find("</" + field + ">",beg);
				if (end == string::npos)
					return "";
				string s = substring(str,beg,end);
				return trim(s);
			}
		
			string Parser::getField(const string &xml, const string &field) {
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
		
			//////////////////////////////////////////////////////
			// The follwing is a special case.
			//////////////////////////////////////////////////////
		
			string Parser::getString(const string &name, const string &tableName, const string &xmlDoc) 
			{
				string xmlField = Parser::getField(xmlDoc,name);
				/*
				if (xmlField == "")
					throw  ConversionException("Error: Missing field \"" + 
							name + "\" or invalid syntax",tableName);
				*/
				return boost::property_tree::xml_parser::decode_char_entities(xmlField);
			}
		
			vector<string> Parser::get1DString(const string &name, const string &tableName, const string &xmlDoc)
			{
				vector<string> x(2);
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField == "") {
					throw  ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 1) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					vector<string> value(dim0);
					if (dim0 == 0)
						return value;
					t.nextToken("\""); // the space
					value[0] = t.nextToken();
					for (int i = 1; i < dim0; ++i) {
						t.nextToken(); // the space		
						value[i] = boost::property_tree::xml_parser::decode_char_entities(t.nextToken());
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Unexpected end of string", tableName);
				}
			}
		 
			vector <vector<string> > Parser::get2DString(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField == "") {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 2) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					int dim1 = Integer::parseInt(t.nextToken());
					vector <vector<string> > value;
		
					if (dim0 == 0 || dim1 == 0)
						return value;
					t.nextToken("\""); // the space
					
					vector<string>v_aux;
					for (int i = 0; i < dim0; ++i) {
						v_aux.clear();
						for (int j = 0; j < dim1; ++j) {
							v_aux.push_back( boost::property_tree::xml_parser::decode_char_entities(t.nextToken()));
							if (i != dim0 - 1 || j != dim1 - 1)
								t.nextToken(); // the space
						}
						value.push_back(v_aux);
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Unexpected end of string", tableName);
				}
			}
		 
			vector <vector <vector<string> > > Parser::get3DString(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField == "") {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 3) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					int dim1 = Integer::parseInt(t.nextToken());
					int dim2 = Integer::parseInt(t.nextToken());
					vector <vector <vector<string> > > value;
					if (dim0 == 0 || dim1 == 0 || dim2 == 0)
						return value;
					t.nextToken("\""); // the space
					
					vector<string> v_aux;
					vector<vector <string> > vv_aux;
					for (int i = 0; i < dim0; ++i) {
						vv_aux.clear();
						for (int j = 0; j < dim1; ++j) {
							v_aux.clear();
							for (int k = 0; k < dim2; ++k) {
								v_aux.push_back( boost::property_tree::xml_parser::decode_char_entities(t.nextToken()));
								if (i != dim0 - 1 || j != dim1 - 1 || k != dim2 - 1)
									t.nextToken(); // the space
							}
							vv_aux.push_back(v_aux);
						}
						value.push_back(vv_aux);
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
								name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Unexpected end of string", tableName);
				}
			}
		
			// Generated methods for conversion to and from XML
			// data representations for all types, both primitive
			// and extended.  Also included are 1, 2, and 3 
			// dimensional arrays of these types.
		
		
			«FOR attr : container.BasicType»
				«DefineType(attr)»
		 	«ENDFOR»
		 	
		    // Generated methods for conversion to and from XML
			// data representations with  a Base64 encoded content.
			// The methods are generated only for 1, 2 and 3 dimensional arrays
			// of data whose BasicType have a non null BaseWrapperName.
			// In practice this represents data whose type is one of the basic numeric types
			// or is built upon a basic numeric type. 
		
			«FOR attr : container.BasicType»
				«DefineTypeBase64(attr)»
			«ENDFOR»
		
		 } // End namespace asdm
	'''
	
	
	
	def DefineType(ASDMAttribute attr)'''
		// Field type: «attr.CppType»
	
		void Parser::toXML(«attr.CppType» data, const string &name, string &buf) {
			buf.append("<" + name + "> ");
			«IF attr.isStringType»
				if (data.size()>0)
					buf.append(boost::property_tree::xml_parser::encode_char_entities(data));
			«ELSEIF attr.isArrayTimeIntervalType»
				//buf.append(data.getStart().toString()+" "+data.getDuration().toString());	
				buf.append(data.getMidPoint().toString()+" "+data.getDuration().toString());
			«ELSEIF attr.isExtendedType»
				buf.append(data.toString());
			«ELSE»
				buf.append(«attr.WrapperType»::toString(data));
			«ENDIF»	
			buf.append(" </" + name + "> ");
		}
		
		
		«/* For now we implement the parser only for Tag and int */»
		«IF attr.CppType=="int" || attr.CppType=="Tag"»
			 void Parser::toXML(set< «attr.CppType» > data, const string &name, string &buf) {
				buf.append("<" + name + "> ");
				set < «attr.CppType» >::iterator iter;
				for (iter=data.begin(); iter!=data.end(); iter++) {
					«IF attr.isExtendedType»
						buf.append((*iter).toString()+" ");
					«ELSE»
						buf.append(«attr.WrapperType»::toString(*iter));
						buf.append(" ");			
					«ENDIF»
				}	
			}
		«ENDIF»
		
		void Parser::toXML(vector<«attr.CppType»> data, const string &name, string &buf) {
			buf.append("<" + name + "> ");
			buf.append("1 ");
			buf.append(Integer::toString(data.size()));
			buf.append(" ");
			for (unsigned int i = 0; i < data.size(); ++i) {
			«IF attr.isStringType»
				buf.append("\"");
				if (data[i].size()>0)	
					buf.append(boost::property_tree::xml_parser::encode_char_entities(data[i]));
				buf.append("\"");
			«ELSEIF attr.isArrayTimeIntervalType»
				//buf.append(data[i].getStart().toString()+" "+data[i].getDuration().toString()+" ");	
				buf.append(data[i].getMidPoint().toString()+" "+data[i].getDuration().toString()+" ");	
			«ELSEIF attr.isExtendedType»
				buf.append(data[i].toString());
			«ELSE»
				buf.append(«attr.WrapperType»::toString(data[i]));
			«ENDIF»	
				buf.append(" ");
			}
			buf.append(" </" + name + "> ");
		}
		
		
		
		void Parser::toXML(vector< vector<«attr.CppType»> > data, const string &name, string &buf) {
			buf.append("<" + name + "> ");
			buf.append("2 ");
			buf.append(Integer::toString(data.size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0].size()));
			buf.append(" ");
			for (unsigned int i = 0; i < data.size(); ++i) {
				for (unsigned int j = 0; j < data[i].size(); ++j) {
					«IF attr.isStringType»
						buf.append("\"");
						if(data[i][j].size()>0)	
							buf.append(boost::property_tree::xml_parser::encode_char_entities(data[i][j]));
						buf.append("\"");
					«ELSEIF attr.isArrayTimeIntervalType»
						//buf.append(data[i][j].getStart().toString()+" "+data[i][j].getDuration().toString()+" ");	
						buf.append(data[i][j].getMidPoint().toString()+" "+data[i][j].getDuration().toString()+" ");				
					«ELSEIF attr.isExtendedType»
						buf.append(data[i][j].toString());
					«ELSE»
						buf.append(«attr.WrapperType»::toString(data[i][j]));
					«ENDIF»	
					buf.append(" ");
				}
			}
			buf.append(" </" + name + "> ");
		}
		
		
		void Parser::toXML(vector< vector< vector<«attr.CppType»> > > data, const string &name, string &buf) {
			buf.append("<" + name + "> ");
			buf.append("3 ");
			buf.append(Integer::toString(data.size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0].size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0][0].size()));
			buf.append(" ");
			for (unsigned int i = 0; i < data.size(); ++i) {
				for (unsigned int j = 0; j < data[i].size(); ++j) {
					for (unsigned int k = 0; k < data[i][j].size(); ++k) {
						«IF attr.isStringType»
							buf.append("\"");
							if (data[i][j][k].size() > 0)	
								buf.append(boost::property_tree::xml_parser::encode_char_entities(data[i][j][k]));
							buf.append("\"");
						«ELSEIF attr.isArrayTimeIntervalType»
							//buf.append(data[i][j][k].getStart().toString()+" "+data[i][j][k].getDuration().toString()+" ");	
							buf.append(data[i][j][k].getMidPoint().toString()+" "+data[i][j][k].getDuration().toString()+" ");	
						«ELSEIF attr.isExtendedType»
							buf.append(data[i][j][k].toString());
						«ELSE»
							buf.append(«attr.WrapperType»::toString(data[i][j][k]));
						«ENDIF»	
						buf.append(" ");
					}
				}
			}
			buf.append(" </" + name + "> ");
		}
		
		
		
		void Parser::toXML(vector<vector< vector< vector<«attr.CppType»> > > >data, const string &name, string &buf) {
			buf.append("<" + name + "> ");
			buf.append("4 ");
			buf.append(Integer::toString(data.size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0].size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0][0].size()));
			buf.append(" ");
			buf.append(Integer::toString(data[0][0][0].size()));
			buf.append(" ");
			for (unsigned int i = 0; i < data.size(); ++i) {
				for (unsigned int j = 0; j < data[i].size(); ++j) {
					for (unsigned int k = 0; k < data[i][j].size(); ++k) {
						for (unsigned int l = 0; l < data[i][j][k].size(); l++) {
							«IF attr.isStringType»
								buf.append("\"");
								if (data[i][j][k][l].size() > 0)	
									buf.append(boost::property_tree::xml_parser::encode_char_entities(data[i][j][k][l]));
								buf.append("\"");
							«ELSEIF attr.isArrayTimeIntervalType»
								//buf.append(data[i][j][k][l].getStart().toString()+" "+data[i][j][k][l].getDuration().toString()+" ");
								buf.append(data[i][j][k][l].getMidPoint().toString()+" "+data[i][j][k][l].getDuration().toString()+" ");		
							«ELSEIF attr.isExtendedType»
								buf.append(data[i][j][k][l].toString());
							«ELSE»
								buf.append(«attr.WrapperType»::toString(data[i][j][k][l]));
							«ENDIF»	
							buf.append(" ");
						}
					}
				}
			}
			buf.append(" </" + name + "> ");
		}
		
		
		«IF !attr.isStringType»
			«/* For now we implement the get only for Tag and int sets */»
			«IF attr.CppType.equals("int") || attr.CppType.equals("Tag")»
				set< «attr.CppType» >  Parser::get«attr.TypeSet»(const string &name, const string &tableName, const string &xmlDoc) {
					string xmlField = Parser::getField(xmlDoc,name);
					if (xmlField.length() == 0)
						throw ConversionException("Error: Missing field \"" + 
							name + "\" or invalid syntax",tableName);
					StringTokenizer t(xmlField," ");
					set < «attr.CppType» > result;
					
					while (t.hasMoreTokens()) {
						«IF attr.CppType.equals("Tag")»
							«/* It's a Tag */»
							try {
								result.insert(Tag::parseTag(t.nextToken()));
							}
							catch (TagFormatException e) {
								throw ConversionException("Error: Field \"" + 
								name + "\": " + e.getMessage(), tableName);				
							}	
						«ELSEIF attr.isExtendedType»
							result.insert(«attr.CppType» (t.nextToken()));
						«ELSE»
							«/* it has a basic type */»
							try {
								«attr.CppType» data = «attr.WrapperType»::«attr.ParserType»(xmlField);
								result.insert(data);
							} catch (NumberFormatException e) {
								throw ConversionException("Error: Field \"" + 
								name + "\": " + e.getMessage(), tableName);
							}
						«ENDIF»
					}
					
					return result;							
				}
			«ENDIF»
			
			«attr.CppType» Parser::get«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc) 
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0)
					throw ConversionException("Error: Missing field \"" + 
						name + "\" or invalid syntax",tableName);
				«IF attr.isCharType»
					return xmlField.at(0);
				«ELSEIF attr.isArrayTimeIntervalType»
					StringTokenizer t(xmlField," ");
					//int64_t start = Long::parseLong(t.nextToken());
					int64_t l1 = Long::parseLong(t.nextToken());
					int64_t l2 = Long::parseLong(t.nextToken());
					if ( ArrayTimeInterval::readStartTimeDurationInXML() ) 
						return «attr.CppType» (l1, l2);
					else 
						return «attr.CppType» (l1 - l2 / 2, l2);
				«ELSEIF attr.CppType.equals("Tag")»
					try {
						return Tag::parseTag(xmlField);
					}
					catch (TagFormatException e) {
						throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
					}
				«ELSEIF attr.isExtendedType»
					try {	
						return «attr.CppType» (xmlField);
					}
					catch (InvalidArgumentException e) {
						throw ConversionException("Error: message was '"+ 
						                           e.getMessage()+
						                           "'",
						                           tableName);
					}
				«ELSE»
					try {
						«attr.CppType» data = «attr.WrapperType»::«attr.ParserType»(xmlField);
						return data;
					} catch (NumberFormatException e) {
						throw ConversionException("Error: Field \"" + 
							name + "\": " + e.getMessage(), tableName);
					}
				«ENDIF»	
			}
			
			
			
			vector<«attr.CppType»> Parser::get1D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 1) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					vector<«attr.CppType»> value (dim0);
					if (dim0 == 0)
						return value;
					for (int i = 0; i < dim0; ++i) {
						«IF attr.isArrayTimeIntervalType»
							int64_t l1 = Long::parseLong(t.nextToken());
							int64_t l2 = Long::parseLong(t.nextToken());
							if ( ArrayTimeInterval::readStartTimeDurationInXML() ) 
								value[i] = «attr.CppType» (l1, l2);
							else 
								value[i] = «attr.CppType» (l1 - l2 / 2, l2);
						«ELSEIF attr.CppType.equals("Tag")»
							value[i] = Tag::parseTag(t.nextToken());
						«ELSEIF attr.isExtendedType»
							value[i] = «attr.WrapperType»::get«attr.WrapperType»(t);
						«ELSEIF attr.isCharType»
							value[i] = t.nextToken().at(0);
						«ELSE»
							value[i] = «attr.WrapperType»::«attr.ParserType»(t.nextToken());
						«ENDIF»
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw  ConversionException("Error: Field \"" + 
						name + "\": Unexpected end of string", tableName);
				} catch (TagFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);				
				}		
			}	
			
			
			vector< vector<«attr.CppType»> > Parser::get2D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 2) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					int dim1 = Integer::parseInt(t.nextToken());
					vector< vector<«attr.CppType»> > value;

					if (dim0 == 0 || dim1 == 0)
						return value;

					vector<«attr.CppType»> v_aux;
					for (int i = 0; i < dim0; ++i) {
						v_aux.clear();
						for (int j = 0; j < dim1; ++j) {
							«IF attr.isArrayTimeIntervalType»
								int64_t l1 = Long::parseLong(t.nextToken());
								int64_t l2 = Long::parseLong(t.nextToken());
								if ( ArrayTimeInterval::readStartTimeDurationInXML() ) 
									v_aux.push_back(«attr.CppType» (l1, l2));
								else 
									v_aux.push_back(«attr.CppType» (l1 - l2 / 2, l2));
													
							«ELSEIF attr.CppType.equals("Tag")»
								v_aux.push_back(Tag::parseTag(t.nextToken()));
							«ELSEIF attr.isExtendedType»
								v_aux.push_back(«attr.WrapperType»::get«attr.WrapperType»(t));
							«ELSEIF attr.isCharType»
								v_aux.push_back(t.nextToken().at(0));
							«ELSE»
								v_aux.push_back(«attr.WrapperType»::«attr.ParserType»(t.nextToken()));
							«ENDIF»
						}
						value.push_back(v_aux);
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw  ConversionException("Error: Field \"" + 
						name + "\": Unexpected end of string", tableName);
				} catch (TagFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
				}
			}
			
			
			vector< vector< vector<«attr.CppType»> > > Parser::get3D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 3) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					int dim1 = Integer::parseInt(t.nextToken());
					int dim2 = Integer::parseInt(t.nextToken());
					vector< vector< vector<«attr.CppType»> > > value ;
					if (dim0 == 0 || dim1 == 0 || dim2 == 0)
						return value;
					
					vector<vector<«attr.CppType»> > vv_aux;
					vector<«attr.CppType»> v_aux;
					for (int i = 0; i < dim0; ++i) {
						vv_aux.clear();
						for (int j = 0; j < dim1; ++j) {
							v_aux.clear();
							for (int k = 0; k < dim2; ++k) {
								«IF attr.isArrayTimeIntervalType»
									int64_t l1 = Long::parseLong(t.nextToken());
									int64_t l2 = Long::parseLong(t.nextToken());
									if ( ArrayTimeInterval::readStartTimeDurationInXML() ) 
										v_aux.push_back(«attr.CppType» (l1, l2));
									else 
										v_aux.push_back(«attr.CppType» (l1 - l2 / 2, l2));						
								«ELSEIF attr.CppType.equals("Tag")»
									v_aux.push_back(Tag::parseTag(t.nextToken()));							
								«ELSEIF attr.isExtendedType»
									v_aux.push_back(«attr.WrapperType»::get«attr.WrapperType»(t));
								«ELSEIF attr.isCharType»
									v_aux.push_back( t.nextToken().at(0));
								«ELSE»
									v_aux.push_back(«attr.WrapperType»::«attr.ParserType»(t.nextToken()));
								«ENDIF»
							}
							vv_aux.push_back(v_aux);
						}
						value.push_back(vv_aux);
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw  ConversionException("Error: Field \"" + 
						name + "\": Unexpected end of string", tableName);
				} catch (TagFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);				
				}		
			}
			
			
			vector< vector< vector< vector<«attr.CppType»> > > >Parser::get4D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				StringTokenizer t(xmlField," ");
				try {
					int ndim = Integer::parseInt(t.nextToken());
					if (ndim != 4) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Invalid array format", tableName);
					}
					int dim0 = Integer::parseInt(t.nextToken());
					int dim1 = Integer::parseInt(t.nextToken());
					int dim2 = Integer::parseInt(t.nextToken());
					int dim3 = Integer::parseInt(t.nextToken());
					vector<vector< vector< vector<«attr.CppType»> > > >value;
					if (dim0 == 0 || dim1 == 0 || dim2 == 0 ||  dim3 == 0)
						return value;
					
					vector<vector<vector<«attr.CppType»> > >vvv_aux;
					vector<vector< «attr.CppType»> > vv_aux;
					vector<«attr.CppType»> v_aux;
					for (int i = 0; i < dim0; ++i) {
						vvv_aux.clear();
						for (int j = 0; j < dim1; ++j) {
							vv_aux.clear();
							for (int k = 0; k < dim2; ++k) {
								v_aux.clear();
								for (int l = 0; l < dim3; l++) {
									«IF attr.isArrayTimeIntervalType»
										int64_t l1 = Long::parseLong(t.nextToken());
										int64_t l2 = Long::parseLong(t.nextToken());
										if ( ArrayTimeInterval::readStartTimeDurationInXML() ) 
											v_aux.push_back(«attr.CppType» (l1, l2));
										else 
											v_aux.push_back(«attr.CppType» (l1 - l2 / 2, l2));	
									«ELSEIF attr.CppType.equals("Tag")»
										v_aux.push_back(Tag::parseTag(t.nextToken()));							
									«ELSEIF attr.isExtendedType»
										v_aux.push_back(«attr.WrapperType»::get«attr.WrapperType»(t));
									«ELSEIF attr.isCharType»
										v_aux.push_back( t.nextToken().at(0));
									«ELSE»
										v_aux.push_back(«attr.WrapperType»::«attr.ParserType»(t.nextToken()));
									«ENDIF»
								}
								vv_aux.push_back(v_aux);
							}
							vvv_aux.push_back(vv_aux);
						}
						value.push_back(vvv_aux);
					}
					if (t.hasMoreTokens()) {
						throw ConversionException("Error: Field \"" + 
							name + "\": Syntax error.", tableName);
					}
					return value;
				} catch (NumberFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);
				} catch (OutOfBoundsException e) {
					throw  ConversionException("Error: Field \"" + 
						name + "\": Unexpected end of string", tableName);
				} catch (TagFormatException e) {
					throw ConversionException("Error: Field \"" + 
						name + "\": " + e.getMessage(), tableName);				
				}		
			}	
			
			
		«ENDIF»
	'''
	
	
	
	def DefineTypeBase64(ASDMAttribute attr)'''
		«/* We consider only the types which have DataOutputType defined */»
		«IF attr.DataOutputType != null»
		
			«/* One dimension array encoding to Base64 */»
			void Parser::toXMLBase64(vector<«attr.CppType»> data, const string &name, string &buf){
				stringstream oss(stringstream::out | stringstream::binary);
		  		string encoded;
		  		
				buf.append("<" + name + "> ");
				int ndim = 1;
		  		int dim1 = data.size();
		 
		  		oss.write((char *)&ndim, sizeof(int));
		 		oss.write((char *)&dim1, sizeof(dim1));
		
		  		for (unsigned int i = 0; i < data.size(); i++)  {
		    		«IF attr.isExtendedType»
		    			«attr.DataOutputType.toFirstLower()» v = data.at(i).get();
		      		«ELSE»
		     			«attr.SimpleCppType.toFirstLower()» v = data.at(i);
		     		«ENDIF»
		      		oss.write((char *) &v, sizeof(v));
		    	}
		
		  		Base64 b64;
		 	    b64.encode(oss.str(), encoded, false);
		 	    buf.append(encoded);
				buf.append(" </" + name + "> ");	
			}
		
			«/* Two dimensions array encoding to Base64 */»
			void Parser::toXMLBase64(vector< vector<«attr.CppType»> > data, const string &name, string &buf){
				stringstream oss(stringstream::out | stringstream::binary);
		  		string encoded;
		  		
				buf.append("<" + name + "> ");
				int ndim = 2;
		  		int dim1 = data.size();
		  		int dim2 = data.at(0).size();
		
		  		oss.write((char *)&ndim, sizeof(int));
		 		oss.write((char *)&dim1, sizeof(dim1));
		  		oss.write((char *)&dim2, sizeof(dim2));
		  		for (unsigned int i = 0; i < data.size(); i++) 
		    		for (unsigned int j = 0; j < data.at(0).size(); j++) {
			    		«IF attr.isExtendedType»
			    		 	«attr.DataOutputType.toFirstLower()» v = data.at(i).at(j).get();
			      		«ELSE»
			     			«attr.SimpleCppType.toFirstLower()» v = data.at(i).at(j);
			     		«ENDIF»
		      			oss.write((char *) &v, sizeof(v));
		    		}
		
		  		Base64 b64;
		 	    b64.encode(oss.str(), encoded, false);
		 	    buf.append(encoded);
				buf.append(" </" + name + "> ");
			}
		
		
		
			«/* Three dimensions array encoding to Base64 */»
			void Parser::toXMLBase64(vector< vector< vector<«attr.CppType»> > > data, const string &name, string &buf){
				stringstream oss(stringstream::out | stringstream::binary);
		  		string encoded;
		  		
				buf.append("<" + name + "> ");
				int ndim = 3;
		  		int dim1 = data.size();
		  		int dim2 = data.at(0).size();
		  		int dim3 = data.at(0).at(0).size();
		
		  		oss.write((char *)&ndim, sizeof(int));
		 		oss.write((char *)&dim1, sizeof(dim1));
		  		oss.write((char *)&dim2, sizeof(dim2));
		  		oss.write((char *)&dim3, sizeof(dim3));
		  		for (unsigned int i = 0; i < data.size(); i++) 
		    		for (unsigned int j = 0; j < data.at(0).size(); j++) 
		    			for (unsigned int k = 0; k < data.at(0).at(0).size(); k++){
		    				«IF attr.isExtendedType»
		    		 			«attr.DataOutputType.toFirstLower()» v = data.at(i).at(j).at(k).get();
		      				«ELSE»
		     					«attr.SimpleCppType.toFirstLower()» v = data.at(i).at(j).at(k);
		     				«ENDIF»
		      				oss.write((char *) &v, sizeof(v));
		    			}
		
		  		Base64 b64;
		 	    b64.encode(oss.str(), encoded, false);
		 	    buf.append(encoded);
				buf.append(" </" + name + "> ");
			}
			
			«/* Four dimensions array encoding to Base64 */»
			void Parser::toXMLBase64(vector<vector< vector< vector<«attr.CppType»> > > >data, const string &name, string &buf){
				stringstream oss(stringstream::out | stringstream::binary);
		  		string encoded;
		  		
				buf.append("<" + name + "> ");
				int ndim = 3;
		  		int dim1 = data.size();
		  		int dim2 = data.at(0).size();
		  		int dim3 = data.at(0).at(0).size();
		  		int dim4 = data.at(0).at(0).at(0).size();
		  		
		  		oss.write((char *)&ndim, sizeof(int));
		 		oss.write((char *)&dim1, sizeof(dim1));
		  		oss.write((char *)&dim2, sizeof(dim2));
		  		oss.write((char *)&dim3, sizeof(dim3));
		   		oss.write((char *)&dim4, sizeof(dim4));
		  		for (unsigned int i = 0; i < data.size(); i++) 
		    		for (unsigned int j = 0; j < data.at(0).size(); j++) 
		    			for (unsigned int k = 0; k < data.at(0).at(0).size(); k++)
		    				for (unsigned int l = 0; l < data.at(0).at(0).at(0).size(); l++){
					    		«IF attr.isExtendedType»
					    		 	«attr.DataOutputType.toFirstLower()» v = data.at(i).at(j).at(k).at(l).get();
					      		«ELSE»
					     			«attr.SimpleCppType.toFirstLower()» v = data.at(i).at(j).at(k).at(l);
					     		«ENDIF»
		      				oss.write((char *) &v, sizeof(v));
		    				}
		
		  		Base64 b64;
		 	    b64.encode(oss.str(), encoded, false);
		 	    buf.append(encoded);
				buf.append(" </" + name + "> ");
			}
			
			
			«/* Not very elegant solution but.... */»
			#ifndef «attr.DataOutputType»_CPP
				«IF attr.DataOutputType.equals("Byte")»
					#define «attr.DataOutputType»_CPP char
				«ELSEIF attr.DataOutputType.equals("Boolean")»
					#define «attr.DataOutputType»_CPP bool
				«ELSEIF attr.DataOutputType.equals("Long")»
					#define «attr.DataOutputType»_CPP int64_t
				«ELSE»
					#define «attr.DataOutputType»_CPP «attr.DataOutputType.toFirstLower()»	
				«ENDIF»
			#endif
			
			
			
			«/* End of not very elegant solution */»
		
			#define TRYREAD(_stream_, _value_) _stream_.read((char*) &(_value_), sizeof(_value_));	\
			if (_stream_.bad()) throw ConversionException("I/O error during read of " + name, tableName);
				
		    «/* One dimension array decoding from Base64 */»
			vector<«attr.CppType»>& Parser::get1D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector<«attr.CppType»>& attribute)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				
				string decodedString;
				Base64 b64;
				b64.decode(xmlField, decodedString);
				
				stringstream iss(stringstream::in | stringstream::binary);
				iss.str(decodedString);
				
				attribute.clear();
				
				unsigned int ndim = 0;
				//iss.read((char *)&ndim, sizeof(ndim));
				TRYREAD(iss,ndim);
				
				unsigned int dim1 = 0;
				//iss.read((char *)&dim1, sizeof(dim1));
				TRYREAD(iss,dim1);
				if (ndim != 1) {
						throw ConversionException("Error while decoding Base64 representation of \"" + name + "\" : found " + Integer::toString(ndim) + " for the number of dimensions, expecting 1.", tableName);
					}
				
				attribute.reserve(dim1);
				
				«attr.DataOutputType»_CPP v;
				for (unsigned int i = 0; i < dim1; i++) {
					//iss.read((char*) &v, sizeof(v));
					TRYREAD(iss,v);
					«IF attr.isExtendedType»
						attribute.push_back(«attr.CppType»(v));
					«ELSE»
						attribute.push_back(v);
					«ENDIF»	
				}
				return attribute;
			}
			
			
			«/* Two dimensions array decoding from Base64 */»
			vector <vector<«attr.CppType»> >& Parser::get2D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector<«attr.CppType»> >& attribute)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				
				string decodedString;
				Base64 b64;
				b64.decode(xmlField, decodedString);
				
				stringstream iss(stringstream::in | stringstream::binary);
				iss.str(decodedString);
				
				attribute.clear();
				
				unsigned int ndim = 0;
				//iss.read((char *)&ndim, sizeof(ndim));
				TRYREAD(iss,ndim);
				
				if (ndim != 2) {
					throw ConversionException("Error while decoding Base64 representation of \"" + name + "\" : found " + Integer::toString(ndim) + " for the number of dimensions, expecting 2.", tableName);
				}
			
				unsigned int dim1 = 0;
				//iss.read((char *)&dim1, sizeof(dim1));
				TRYREAD(iss,dim1);
				
				unsigned int dim2 = 0;
				//iss.read((char *)&dim2, sizeof(dim2));
				TRYREAD(iss,dim2);
				
				attribute.reserve(dim1);
				
				«attr.DataOutputType»_CPP v;
				vector<«attr.CppType»> aux2;
				aux2.reserve(dim2);
				for (unsigned int i = 0; i < dim1; i++) {
					aux2.clear();
					for (unsigned int j = 0; j < dim2; j++) {
						//iss.read((char*) &v, sizeof(v));
						TRYREAD(iss,v);
						«IF attr.isExtendedType»
							aux2.push_back(«attr.CppType»(v));
						«ELSE»
							aux2.push_back(v);
						«ENDIF»
					}
					attribute.push_back(aux2);
				}
				return attribute;
			}
			
			
			«/* Three dimensions array decoding from Base64 */»
			vector <vector <vector<«attr.CppType»> > >& Parser::get3D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector <vector<«attr.CppType»> > >& attribute)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				
				string decodedString;
				Base64 b64;
				b64.decode(xmlField, decodedString);
				
				stringstream iss(stringstream::in | stringstream::binary);
				iss.str(decodedString);
				
				attribute.clear();
				
				unsigned int ndim = 0;
				//iss.read((char *)&ndim, sizeof(ndim));
				TRYREAD(iss, ndim);	
				if (ndim != 3) {
						throw ConversionException("Error while decoding Base64 representation of \"" + name + "\" : found " + Integer::toString(ndim) + " for the number of dimensions, expecting 3.", tableName);
				}
						
				unsigned int dim1 = 0;
				//iss.read((char *)&dim1, sizeof(dim1));
				TRYREAD(iss,dim1);
				
				unsigned int dim2 = 0;
				//iss.read((char *)&dim2, sizeof(dim2));
				TRYREAD(iss,dim2);
				
				unsigned int dim3 = 0;
				//iss.read((char *)&dim2, sizeof(dim3));
				TRYREAD(iss,dim3);
				
				attribute.reserve(dim1);
				
				«attr.DataOutputType»_CPP v;
				vector <vector<«attr.CppType»> > aux2;
				vector<«attr.CppType»> aux3;		
				aux2.reserve(dim2);
				aux3.reserve(dim3);
				
				for (unsigned int i = 0; i < dim1; i++) {
					aux2.clear();
					for (unsigned int j = 0; j < dim2; j++) {
						aux3.clear();
						for (unsigned int k = 0; k < dim3; k++) {
							//iss.read((char*) &v, sizeof(v));
							TRYREAD(iss,v);
							«IF attr.isExtendedType»
										aux3.push_back(«attr.CppType»(v));
							«ELSE»
										aux3.push_back(v);
							«ENDIF»
						}
						aux2.push_back(aux3);
					}
					attribute.push_back(aux2);	
				}
				return attribute;
				;
			}
			
			«/* Four dimensions array decoding from Base64 */»
			vector <vector <vector <vector<«attr.CppType»> > > >& Parser::get4D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector< vector <vector <vector<«attr.CppType»> > > >& attribute)
			{
				string xmlField = Parser::getField(xmlDoc,name);
				if (xmlField.length() == 0) {
					throw ConversionException("Error: Field \"" + 
							name + "\": Invalid XML syntax", tableName);
				}
				
				string decodedString;
				Base64 b64;
				b64.decode(xmlField, decodedString);
				
				stringstream iss(stringstream::in | stringstream::binary);
				iss.str(decodedString);
				
				attribute.clear();
				
				unsigned int ndim = 0;
				//iss.read((char *)&ndim, sizeof(ndim));
				TRYREAD(iss, ndim);	
				if (ndim != 4) {
						throw ConversionException("Error while decoding Base64 representation of \"" + name + "\" : found " + Integer::toString(ndim) + " for the number of dimensions, expecting 4.", tableName);
				}
						
				unsigned int dim1 = 0;
				//iss.read((char *)&dim1, sizeof(dim1));
				TRYREAD(iss,dim1);
				
				unsigned int dim2 = 0;
				//iss.read((char *)&dim2, sizeof(dim2));
				TRYREAD(iss,dim2);
				
				unsigned int dim3 = 0;
				//iss.read((char *)&dim2, sizeof(dim3));
				TRYREAD(iss,dim3);
				
				unsigned int dim4 = 0;
				//iss.read((char *)&dim2, sizeof(dim3));
				TRYREAD(iss,dim3);
				
				attribute.reserve(dim1);
				
				«attr.DataOutputType»_CPP v;
				vector <vector <vector<«attr.CppType»> > > aux2;
				vector <vector<«attr.CppType»> > aux3;
				vector<«attr.CppType»> aux4;		
				aux2.reserve(dim2);
				aux3.reserve(dim3);
				aux4.reserve(dim4);
				
				for (unsigned int i = 0; i < dim1; i++) {
					aux2.clear();
					for (unsigned int j = 0; j < dim2; j++) {
						aux3.clear();
						for (unsigned int k = 0; k < dim3; k++) {
							aux4.clear();
							for (unsigned int l = 0; l < dim4; l++) {
							//iss.read((char*) &v, sizeof(v));
								TRYREAD(iss,v);
								«IF attr.isExtendedType»
									aux4.push_back(«attr.CppType»(v));
								«ELSE»
									aux4.push_back(v);
								«ENDIF»
							}
							aux3.push_back(aux4);
						}
						aux2.push_back(aux3);
					}
					attribute.push_back(aux2);	
				}
				return attribute;
				;
			}	
		
			
		«ENDIF»
	'''
}