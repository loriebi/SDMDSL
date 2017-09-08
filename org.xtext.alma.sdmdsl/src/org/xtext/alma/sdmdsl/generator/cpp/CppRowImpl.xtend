package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppRowImpl {
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * CppRowImpl generator
		 */
		for(table : container.tables){
			
			//  creating file and generating Cpp code for table 
			sdmFsa.setFile("src/" + table.name + "Row.cpp")
			sdmFsa.generateFile(table.generateCppRowImpl)
			
		}
		
	}
	
	
	def generateCppRowImpl(AlmaTable table)'''
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
	 * File «table.name»Row.cpp
	 */
	 
	#include <vector>
	using std::vector;
	
	#include <set>
	using std::set;
	
	#include <«container.name».h>
	#include <«table.name»Row.h>
	#include <«table.name»Table.h>
	«FOR linkAttr : table.link»
	«IF !linkAttr.refersTo.equals(table.name)»
	#include <«linkAttr.refersTo»Table.h>
	#include <«linkAttr.refersTo»Row.h>
	«ENDIF»
	«ENDFOR»	
	
	using asdm::«container.name»;
	using asdm::«table.name»Row;
	using asdm::«table.name»Table;
	«FOR linkAttr : table.link »
	«IF !linkAttr.refersTo.equals(table.name)»
	using asdm::«linkAttr.refersTo»Table;
	using asdm::«linkAttr.refersTo»Row;
	«ENDIF»
	«ENDFOR»
	
	#include <Parser.h>
	using asdm::Parser;
	
	#include <EnumerationParser.h>
	#include <ASDMValuesParser.h>
	 
	#include <InvalidArgumentException.h>
	using asdm::InvalidArgumentException;

	namespace asdm {
		«table.name»Row::~«table.name»Row() {
		}
	
		/**
		 * Return the table to which this row belongs.
		 */
		«table.name»Table &«table.name»Row::getTable() const {
			return table;
		}
	
		bool «table.name»Row::isAdded() const {
			return hasBeenAdded;
		}	
	
		void «table.name»Row::isAdded(bool added) {
			hasBeenAdded = added;
		}
		
	#ifndef WITHOUT_ACS
		using asdmIDL::«table.name»RowIDL;
	#endif
	
	#ifndef WITHOUT_ACS
		/**
		 * Return this row in the form of an IDL struct.
		 * @return The values of this row as a «table.name»RowIDL struct.
		 */
		«table.name»RowIDL *«table.name»Row::toIDL() const {
			«table.name»RowIDL *x = new «table.name»RowIDL ();
			
			// Fill the IDL structure.
		«IF !table.noIntrinsicAttribute»
			«FOR attr : table.intrinsic»
			«toIDLDef(attr)»
			«ENDFOR»
		«ENDIF»
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«toIDLDef(attr)»
			«ENDFOR»
		«ENDIF»
			«FOR linkAttr : table.link»
			«toIDLLinks(linkAttr)»
			«ENDFOR»
			
			return x;
		
		}
		
		void «table.name»Row::toIDL(asdmIDL::«table.name»RowIDL& x) const {
			// Set the x's fields.
		«IF !table.noIntrinsicAttribute»
			«FOR attr : table.intrinsic»
			«toIDLDefByRef(attr)»
			«ENDFOR»
		«ENDIF»
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«toIDLDefByRef(attr)»
			«ENDFOR»
		«ENDIF»
			«FOR linkAttr : table.link»
			«toIDLLinksByRef(linkAttr)»
			«ENDFOR»
		
		}
	#endif
	
	#ifndef WITHOUT_ACS
		/**
		 * Fill the values of this row from the IDL struct «table.name»RowIDL.
		 * @param x The IDL struct containing the values used to fill this row.
		 */
		void «table.name»Row::setFromIDL («table.name»RowIDL x){
			try {
			// Fill the values from x.
		«IF !table.noIntrinsicAttribute»
			«FOR attr : table.intrinsic»
			«fromIDLDef(attr)»
			«ENDFOR»
		«ENDIF»
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«fromIDLDef(attr)»
			«ENDFOR»
		«ENDIF»
			«FOR linkAttr : table.link»
			«fromIDLLinks(linkAttr)»
			«ENDFOR»
			} catch (IllegalAccessException err) {
				throw ConversionException (err.getMessage(),"«table.name»");
			}
		}
	#endif
	
		/**
		 * Return this row in the form of an XML string.
		 * @return The values of this row as an XML string.
		 */
		string «table.name»Row::toXML() const {
			string buf;
			buf.append("<row> \n");
			
		«IF !table.noIntrinsicAttribute»
			«FOR attr : table.intrinsic»
			«toXMLAttributeName(attr)»
			«ENDFOR»
		«ENDIF»
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«toXMLAttributeName(attr)»
			«ENDFOR»
		«ENDIF»
			«FOR linkAttr : table.link»
			«toXMLAttributeLinks(linkAttr)»
			«ENDFOR»
			
			buf.append("</row>\n");
			return buf;
		}
		
		/**
		 * Fill the values of this row from an XML string 
		 * that was produced by the toXML() method.
		 * @param x The XML string being used to set the values of this row.
		 */
		void «table.name»Row::setFromXML (string rowDoc) {
			Parser row(rowDoc);
			string s = "";
			try {
		«IF !table.noIntrinsicAttribute»
			«FOR attr : table.intrinsic»
			«fromXMLAttributeName(attr)»
			«ENDFOR»
		«ENDIF»
		«IF !table.noExtrinsicAttribute»
			«FOR attr : table.extrinsic»
			«fromXMLAttributeName(attr)»
			«ENDFOR»
		«ENDIF»
			«FOR linkAttr : table.link»
			«fromXMLAttributeLinks(linkAttr)»
			«ENDFOR»
			} catch (IllegalAccessException err) {
				throw ConversionException (err.getMessage(),"«table.name»");
			}
		}
		
		void «table.name»Row::toBin(EndianOSStream& eoss) {
		«/* Serialize the required attributes (key first) */»
		«FOR attr : table.requiredAttributes»
		«toBin(attr)»
		«ENDFOR»
	
		«/* Serialize the optional attributes */»
		«FOR attr : table.optionalValueAttributes»
		«toBinOpt(attr)»
		«ENDFOR»
		}
		
		«FOR attr : table.requiredAttributes»
		«binaryDeserialize(table, attr, "EndianIStream", "eis")»
		«ENDFOR»
		«FOR attr : table.optionalValueAttributes»
		«binaryDeserialize(table, attr, "EndianIStream", "eis")»
		«ENDFOR»
	
		«table.name»Row* «table.name»Row::fromBin(EndianIStream& eis, «table.name»Table& table, const vector<string>& attributesSeq) {
			«table.name»Row* row = new  «table.name»Row(table);
			
			map<string, «table.name»AttributeFromBin>::iterator iter ;
			for (unsigned int i = 0; i < attributesSeq.size(); i++) {
				iter = row->fromBinMethods.find(attributesSeq.at(i));
				if (iter != row->fromBinMethods.end()) {
					(row->*(row->fromBinMethods[ attributesSeq.at(i) ] ))(eis);			
				}
				else {
					BinaryAttributeReaderFunctor* functorP = table.getUnknownAttributeBinaryReader(attributesSeq.at(i));
					if (functorP)
						(*functorP)(eis);
					else
						throw ConversionException("There is not method to read an attribute '"+attributesSeq.at(i)+"'.", "«table.name»Table");
				}
					
			}				
			return row;
		}
	
		//
		// A collection of methods to set the value of the attributes from their textual value in the XML representation
		// of one row.
		//
		«FOR attr : table.requiredAttributes»
		«textDeserialize(table,attr)»
		«ENDFOR»
		«FOR attr: table.optionalValueAttributes»
		«textDeserialize(table,attr)»
		«ENDFOR»
		
		void «table.name»Row::fromText(const std::string& attributeName, const std::string&  t) {
			map<string, «table.name»AttributeFromText>::iterator iter;
			if ((iter = fromTextMethods.find(attributeName)) == fromTextMethods.end())
				throw ConversionException("I do not know what to do with '"+attributeName+"' and its content '"+t+"' (while parsing an XML document)", "«table.name»Table");
			(this->*(iter->second))(t);
		}
		
		////////////////////////////////////////////////
		// Intrinsic Table Attributes getters/setters //
		////////////////////////////////////////////////
		«FOR attr : table.intrinsic»
		«new CppTableAttributeImpl().doGenerate(table.name,"Row",attr)»
		«ENDFOR»
		
		///////////////////////////////////////////////
		// Extrinsic Table Attributes getters/setters//
		///////////////////////////////////////////////
		«FOR attr : table.extrinsic»
		«new CppTableAttributeImpl().doGenerate(table.name,"Row",attr)»
		«ENDFOR»
	
		//////////////////////////////////////
		// Links Attributes getters/setters //
		//////////////////////////////////////
		«FOR linkAttr : table.link»
		«new CppTableLinksImpl().doGenerate(linkAttr)»
		«ENDFOR»
	
	
		/**
		 * Create a «table.name»Row.
		 * <p>
		 * This constructor is private because only the
		 * table can create rows.  All rows know the table
		 * to which they belong.
		 * @param table The table to which this row belongs.
		 */ 
		«table.name»Row::«table.name»Row («table.name»Table &t) : table(t) {
			hasBeenAdded = false;
			
		«FOR attr : table.intrinsic»
		«initializeOptional(attr)»
		«ENDFOR»
		«FOR attr : table.extrinsic»
		«initializeOptional(attr)»
		«ENDFOR»
		
		
		«/* Here we assume that there are an enumeration cannot be the type of an extrinsic attribute */»
		«FOR attr : table.intrinsic»
		«initializeLiteral(attr)»
		«ENDFOR»
		
		«/* Populate the map string -> method fromBinMethods */»
		«FOR attr : table.requiredAttributes»
		fromBinMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromBin; 
		«ENDFOR»	
		
		«FOR attr : table.optionalValueAttributes»
		fromBinMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromBin; 
		«ENDFOR»
		
		«/* Populate the map string -> method fromTextMethods */»
		«FOR attr : table.requiredAttributes»
			«IF !attr.typeName.equals("EntityRef")»		 
			fromTextMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromText;
			«ENDIF» 
		«ENDFOR»
	
		«FOR attr : table.optionalValueAttributes» 
			«IF !attr.typeName.equals("EntityRef")»		
			fromTextMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromText;
			«ENDIF» 	
		«ENDFOR»	
		}
	
		«table.name»Row::«table.name»Row («table.name»Table &t, «table.name»Row &row) : table(t) {
			hasBeenAdded = false;
			
			if (&row == 0) {
		«/* Simply set to false all the optional attributes flags.*/»
		«FOR attr : table.intrinsic»
		«initializeOptional(attr)»
		«ENDFOR»
		«FOR attr : table.extrinsic»
		«initializeOptional(attr)»
		«ENDFOR»
			}
			else {
		«/* Firstly process the key attributes */»
			«FOR attr : table.keyAttributes »
				«attr.name» = row.«attr.name»;
			«ENDFOR»
			
			«/* Secondly process the required value attributes */»
			«FOR attr : table.requiredValueAttributes»
				«attr.name» = row.«attr.name»;
			«ENDFOR»
			
			«/* Thirdly process the optional attributes
			Basically it's the same than above with a supplementary test.*/»
			«FOR attr : table.optionalValueAttributes»
			if (row.«attr.name»Exists) {
				«attr.name» = row.«attr.name»;		
				«attr.name»Exists = true;
			}
			else
				«attr.name»Exists = false;
			«ENDFOR»
			}
			«/* Populate the map string -> method fromBinMethods */»
			«FOR attr : table.requiredAttributes»
			fromBinMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromBin; 
			«ENDFOR»	
		
			«FOR attr : table.optionalValueAttributes»
			fromBinMethods["«attr.name»"] = &«table.name»Row::«attr.name»FromBin; 
			«ENDFOR»	
		}
		
		
		«IF table.requiredNoAutoIncrementableAttributes.size != 0»
		bool «table.name»Row::compareNoAutoInc(«table.RequiredNoAutoIncrementableCpp») {
			bool result;
			result = true;
			«FOR attr : table.requiredNoAutoIncrementableAttributes»
			«compareAttribute(attr)»
			«ENDFOR»
			return result;
		}	
		«ENDIF»
		
		«IF table.requiredValueAttributes.size != 0»
		bool «table.name»Row::compareRequiredValue(«table.RequiredValueCpp») {
			bool result;
			result = true;
			«FOR attr : table.requiredValueAttributes»
			«compareAttributeExactly(attr)»
			«ENDFOR»
			return result;
		}
		«ENDIF»
	
		/**
		 * Return true if all required attributes of the value part are equal to their homologues
		 * in x and false otherwise.
		 *
	«IF table.requiredValueAttributes.size != 0»
		 * @param x a pointer on the «table.name»Row whose required attributes of the value part 
	«ENDIF»
		 * will be compared with those of this.
		 * @return a boolean.
		 */
		bool «table.name»Row::equalByRequiredValue(«table.name»Row* «IF table.requiredValueAttributes.size != 0» x «ENDIF») {
			«IF table.requiredValueAttributes.size != 0»
				«FOR attr : table.requiredValueAttributes»
				if (this->«attr.name» != x->«attr.name») return false;
				«ENDFOR»
			«ENDIF»
			return true;
		}	
		
		/*
		 map<string, «table.name»AttributeFromBin> «table.name»Row::initFromBinMethods() {
			map<string, «table.name»AttributeFromBin> result;
			
			«FOR attr : table.requiredAttributes»
			result["«attr.name»"] = &«table.name»Row::«attr.name»FromBin;
			«ENDFOR»
			
			«FOR attr : table.optionalValueAttributes»
			result["«attr.name»"] = &«table.name»Row::«attr.name»FromBin;
			«ENDFOR»
			
			return result;	
		}
		*/		


	
	}// End namespace asdm
	'''
	
	
	
	def toIDLDef(ASDMAttribute attr)'''
		«IF attr.set»
			«/* This is a set.*/»
			«IF attr.isExtrinsic»
				«/* and it's extrinsic */»
			x->«attr.name».length(«attr.name».size());
				«IF attr.isExtendedType»
			«attr.CppType»::iterator iter;
			int i = 0;
			for (iter=«attr.name».begin(); iter!=«attr.name».end(); iter++)
				x->«attr.name»[i++] = (*iter).toIDL«attr.SimpleCppType»();
				«ELSE»
			«attr.CppType»::iterator iter;
			int i = 0;
			for (iter=«attr.name».begin(); iter!=«attr.name».end(); iter++)
				«IF attr.SimpleCppType == "string"»
					«/* special case of a string */»
				x->«attr.name»[i] = CORBA::string_dup((*iter).c_str());
					«ELSE»
				x->«attr.name»[i] = *iter;
					«ENDIF»
				«ENDIF»
			«ELSE»
				«/* and it's not extrinsic */»
				«/* T.B.D.*/»
			«ENDIF»
		«ELSEIF attr.isExtrinsic»
			«/* This is an extrinsic attribute */»
			«IF attr.isOptional»
			«/* This is an optional attribute */»
			x->«attr.name»Exists = «attr.name»Exists;
			«ENDIF»
			«IF attr.isArray»
			«/* This is an array attribute */»
			x->«attr.name».length(«attr.name».size());
			for (unsigned int i = 0; i < «attr.name».size(); ++i) {
				«IF attr.isExtendedType»
				x->«attr.name»[i] = «attr.name».at(i).toIDL«attr.SimpleCppType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
					x->«attr.name»[i] = CORBA::string_dup(«attr.name».at(i).c_str());
					«ELSE»
					x->«attr.name»[i] = «attr.name».at(i);
					«ENDIF»
				«ENDIF»
			}
			«ELSE»
				«/* This is a scalar attribute */»
				«IF attr.isExtendedType»
				x->«attr.name» = «attr.name».toIDL«attr.JavaType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
					x->«attr.name» = CORBA::string_dup(«attr.name».c_str());
					«ELSE»
					x->«attr.name» = «attr.name»;
					«ENDIF»
				«ENDIF»
			 «ENDIF»
		«ELSE»
			«/* This is not an extrinsic attribute */»
			«IF attr.isOptional»
			x->«attr.name»Exists = «attr.name»Exists;
			«ENDIF»
			«IF attr.isArray»
				«IF attr.dimension == 1»
				x->«attr.name».length(«attr.name».size());
				for (unsigned int i = 0; i < «attr.name».size(); ++i) {
					«IF attr.isExtendedType»
					x->«attr.name»[i] = «attr.name».at(i).toIDL«attr.SimpleCppType»();
					«ELSE»
						«IF attr.SimpleCppType.equals("string")»
						x->«attr.name»[i] = CORBA::string_dup(«attr.name».at(i).c_str());
						«ELSE»
						x->«attr.name»[i] = «attr.name».at(i);
						«ENDIF»
					«ENDIF»
				}
				«ELSEIF attr.dimension == 2»
				x->«attr.name».length(«attr.name».size());
				for (unsigned int i = 0; i < «attr.name».size(); i++) {
					x->«attr.name»[i].length(«attr.name».at(i).size());
				}
				
				for (unsigned int i = 0; i < «attr.name».size() ; i++)
					for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
						«IF attr.isExtendedType»
						x->«attr.name»[i][j]= «attr.name».at(i).at(j).toIDL«attr.SimpleCppType»();
						«ELSE»
							«IF attr.SimpleCppType.equals("string")»
							x->«attr.name»[i][j] = CORBA::string_dup(«attr.name».at(i).at(j).c_str());
							«ELSE»
							x->«attr.name»[i][j] = «attr.name».at(i).at(j);
							«ENDIF»
						«ENDIF»
				«ELSEIF attr.dimension == 3»
					x->«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) {
						x->«attr.name»[i].length(«attr.name».at(i).size());
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++) {
							x->«attr.name»[i][j].length(«attr.name».at(i).at(j).size());
						}					 		
					}
					
					for (unsigned int i = 0; i < «attr.name».size() ; i++)
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++)
								«IF attr.isExtendedType»
									x->«attr.name»[i][j][k] = «attr.name».at(i).at(j).at(k).toIDL«attr.SimpleCppType»();
								«ELSE»
									«IF attr.SimpleCppType.equals("string")»
										x->«attr.name»[i][j][k] = CORBA::string_dup(«attr.name».at(i).at(j).at(k).c_str());
									«ELSE»
										x->«attr.name»[i][j][k] = «attr.name».at(i).at(j).at(k);
						 			«ENDIF»
							 	«ENDIF»
				«ELSEIF attr.dimension == 4»
					x->«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) {
						x->«attr.name»[i].length(«attr.name».at(i).size());
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++) {
							x->«attr.name»[i][j].length(«attr.name».at(i).at(j).size());
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++) {
								 x->«attr.name»[i][j][k].length(«attr.name».at(i).at(j).at(k).size());
							   }
						}					 		
					}
					
					for (unsigned int i = 0; i < «attr.name».size() ; i++)
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++)
								for (unsigned int l = 0; l < «attr.name».at(i).at(j).at(k).size(); l++)
								«IF attr.isExtendedType»
									x->«attr.name»[i][j][k][l] = «attr.name».at(i).at(j).at(k).at(l).toIDL«attr.SimpleCppType»();
								«ELSE»
									«IF attr.SimpleCppType.equals("string")»
										x->«attr.name»[i][j][k][l] = CORBA::string_dup(«attr.name».at(i).at(j).at(k).at(l).c_str());
									«ELSE»
										x->«attr.name»[i][j][k][l] = «attr.name».at(i).at(j).at(k).at(l);
						 			«ENDIF»
							 	«ENDIF»					
					 cout << "Converted successfully" << endl;
				«ENDIF»
			«ELSE»
				«IF attr.isExtendedType»
					x->«attr.name» = «attr.name».toIDL«attr.JavaType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
						x->«attr.name» = CORBA::string_dup(«attr.name».c_str());
					«ELSE»
						x->«attr.name» = «attr.name»;
			 		«ENDIF»
			 	«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	
	def toIDLLinks(ASDMAttribute attr)'''
		«/* TODO: implementation*/»
	'''
	
	
	def toIDLDefByRef(ASDMAttribute attr)'''
		«IF attr.isSet»
			«/* This is a set.*/»
			«IF attr.isExtrinsic»
				«/* and it's extrinsic */»
				x.«attr.name».length(«attr.name».size());
				«IF attr.isExtendedType»
					«/* it has an extended type.*/»
					«attr.CppType»::iterator iter;
					int i = 0;
					for (iter=«attr.name».begin(); iter!=«attr.name».end(); iter++)
						x.«attr.name»[i++] = (*iter).toIDL«attr.SimpleCppType»();
	 			«ELSE»
					«/* it does not have an extended type.*/»
					«attr.CppType»::iterator iter;
					int i = 0;
					for (iter=«attr.name».begin(); iter!=«attr.name».end(); iter++)
						«IF attr.SimpleCppType.equals("string")»
							«/* special case of a string*/»
							x.«attr.name»[i] = CORBA::string_dup((*iter).c_str());
						«ELSE»
							x.«attr.name»[i] = *iter;
			 			«ENDIF» 		 		 			
	 			«ENDIF»
			«ELSE»
				«/* and it's not extrinsic*/»
				«/* T.B.D.*/»
			«ENDIF»

		«ELSEIF attr.isExtrinsic»
			«/* This is an extrinsic attribute */»
			«IF attr.isOptional»
			«/* This is an optional attribute */»
			x.«attr.name»Exists = «attr.name»Exists;
			«ENDIF»
			«IF attr.isArray»
			«/* This is an array attribute */»
			x.«attr.name».length(«attr.name».size());
			for (unsigned int i = 0; i < «attr.name».size(); ++i) {
				«IF attr.isExtendedType»
				x.«attr.name»[i] = «attr.name».at(i).toIDL«attr.SimpleCppType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
						x.«attr.name»[i] = CORBA::string_dup(«attr.name».at(i).c_str());
					«ELSE»
						x.«attr.name»[i] = «attr.name».at(i);
		 			«ENDIF»
		 		«ENDIF»
			}
		 	«ELSE»
				«/* This is a scalar attribute */»
				«IF attr.isExtendedType»
					x.«attr.name» = «attr.name».toIDL«attr.JavaType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
						x.«attr.name» = CORBA::string_dup(«attr.name».c_str());
					«ELSE»
						x.«attr.name» = «attr.name»;
	 				«ENDIF»
	 			«ENDIF»
		 	«ENDIF»
		«ELSE»
			«/* This is not an extrinsic attribute */»
			«IF attr.isOptional»
				x.«attr.name»Exists = «attr.name»Exists;
			«ENDIF»
			«IF attr.isArray»
				«IF attr.dimension == 1»
					x.«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); ++i) {
						«IF attr.isExtendedType»
							x.«attr.name»[i] = «attr.name».at(i).toIDL«attr.SimpleCppType»();
						«ELSE»
							«IF attr.SimpleCppType.equals("string")»
								x.«attr.name»[i] = CORBA::string_dup(«attr.name».at(i).c_str());
							«ELSE»
								x.«attr.name»[i] = «attr.name».at(i);
		 					«ENDIF»
		 				«ENDIF»
					}
				«ELSEIF attr.dimension == 2»
					x.«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) {
						x.«attr.name»[i].length(«attr.name».at(i).size());			 		
					}
					
					for (unsigned int i = 0; i < «attr.name».size() ; i++)
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
								«IF attr.isExtendedType»
									x.«attr.name»[i][j]= «attr.name».at(i).at(j).toIDL«attr.SimpleCppType»();
								«ELSE»
									«IF attr.SimpleCppType.equals("string")»
										x.«attr.name»[i][j] = CORBA::string_dup(«attr.name».at(i).at(j).c_str());
									«ELSE»
										x.«attr.name»[i][j] = «attr.name».at(i).at(j);
					 				«ENDIF»
						 		«ENDIF»

				«ELSEIF attr.dimension == 3»
					x.«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) {
						x.«attr.name»[i].length(«attr.name».at(i).size());
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++) {
							x.«attr.name»[i][j].length(«attr.name».at(i).at(j).size());
						}					 		
					}
					
					for (unsigned int i = 0; i < «attr.name».size() ; i++)
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++)
								«IF attr.isExtendedType»
									x.«attr.name»[i][j][k] = «attr.name».at(i).at(j).at(k).toIDL«attr.SimpleCppType»();
								«ELSE»
									«IF attr.SimpleCppType.equals("string")»
										x.«attr.name»[i][j][k] = CORBA::string_dup(«attr.name».at(i).at(j).at(k).c_str());
									«ELSE»
										x.«attr.name»[i][j][k] = «attr.name».at(i).at(j).at(k);
					 				«ENDIF»
						 		«ENDIF»							
				«ELSEIF attr.dimension == 4»
					x.«attr.name».length(«attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) {
						x.«attr.name»[i].length(«attr.name».at(i).size());
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++) {
							x.«attr.name»[i][j].length(«attr.name».at(i).at(j).size());
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++) {
								x.«attr.name»[i][j][k].length(«attr.name».at(i).at(j).at(k).size());
							}
						}					 		
					}
							
					for (unsigned int i = 0; i < «attr.name».size() ; i++)
						for (unsigned int j = 0; j < «attr.name».at(i).size(); j++)
							for (unsigned int k = 0; k < «attr.name».at(i).at(j).size(); k++)
								for (unsigned int l = 0; l < «attr.name».at(i).at(j).at(k).size(); l++)
									«IF attr.isExtendedType»
										x.«attr.name»[i][j][k][l] = «attr.name».at(i).at(j).at(k).at(l).toIDL«attr.SimpleCppType»();
									«ELSE»
										«IF attr.SimpleCppType.equals("string")»
											x.«attr.name»[i][j][k][l] = CORBA::string_dup(«attr.name».at(i).at(j).at(k).at(l).c_str());
										«ELSE»
											x.«attr.name»[i][j][k][l] = «attr.name».at(i).at(j).at(k).at(l);
								 		«ENDIF»
									 «ENDIF»
					cout << "Converted successfully" << endl;
				«ENDIF»
			«ELSE»
				«IF attr.isExtendedType»
					x.«attr.name» = «attr.name».toIDL«attr.JavaType»();
				«ELSE»
					«IF attr.SimpleCppType.equals("string")»
						x.«attr.name» = CORBA::string_dup(«attr.name».c_str());
					«ELSE»
						x.«attr.name» = «attr.name»;
	 				«ENDIF»
	 			«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	def toIDLLinksByRef(ASDMAttribute attr)'''
		«/* TODO : implementation*/»
	'''
	
	
	def fromIDLDef(ASDMAttribute attr)'''
		«IF attr.isSet»
			«/* It's a set */»
			«IF attr.isExtrinsic»
				«/* and it's extrinsic */»
				«attr.CppType» tmp«attr.UpperCaseName»;
				for (unsigned int i = 0; i < tmp«attr.UpperCaseName».size(); ++i) {
					«IF attr.isExtendedType || attr.SimpleCppType.equals("string")»
						tmp«attr.UpperCaseName».insert(«attr.SimpleCppType» (x.«attr.name»[i]));
					«ELSE»
						tmp«attr.UpperCaseName».insert(x.«attr.name»[i]);
	  				«ENDIF»
				}
				set«attr.UpperCaseName»(tmp«attr.UpperCaseName»);				
			«ELSE»
				«/* and it's not extrinsic*/»
				«/* T.B.D.*/»
			
			«ENDIF»
			
		«ELSEIF attr.isExtrinsic && attr.isArray»
			«IF attr.isOptional»
				«attr.name»Exists = x.«attr.name»Exists;
				if (x.«attr.name»Exists) {
			«ENDIF»
			«attr.name» .clear();
			for (unsigned int i = 0; i <x.«attr.name».length(); ++i) {
				«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
					«attr.name».push_back(«attr.SimpleCppType» (x.«attr.name»[i]));
				«ELSE»
					«attr.name».push_back(x.«attr.name»[i]);
		  		«ENDIF»
			}
			«IF attr.isOptional»
			}
			«ENDIF»
		«ELSE»
			«IF attr.isOptional»
				«attr.name»Exists = x.«attr.name»Exists;
				if (x.«attr.name»Exists) {
			«ENDIF»
			«IF attr.isArray»
				«IF attr.dimension == 1»
					«attr.name» .clear();
					for (unsigned int i = 0; i <x.«attr.name».length(); ++i) {
						«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
							«attr.name».push_back(«attr.SimpleCppType» (x.«attr.name»[i]));
						«ELSE»
							«attr.name».push_back(x.«attr.name»[i]);
	  					«ENDIF»
					}
				«ELSEIF attr.dimension == 2»
					«attr.name» .clear();
					vector<«attr.SimpleCppType»> v_aux_«attr.name»;
					for (unsigned int i = 0; i < x.«attr.name».length(); ++i) {
						v_aux_«attr.name».clear();
						for (unsigned int j = 0; j < x.«attr.name»[0].length(); ++j) {
							«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
								v_aux_«attr.name».push_back(«attr.SimpleCppType» (x.«attr.name»[i][j]));
							«ELSE»
								v_aux_«attr.name».push_back(x.«attr.name»[i][j]);
				  			«ENDIF»
						}
			  			«attr.name».push_back(v_aux_«attr.name»);
					}
				«ELSEIF attr.dimension == 3»
					«attr.name» .clear();
					vector< vector<«attr.SimpleCppType»> > vv_aux_«attr.name»;
					vector<«attr.SimpleCppType»> v_aux_«attr.name»;
					
					for (unsigned int i = 0; i < x.«attr.name».length(); ++i) {
						vv_aux_«attr.name».clear();
						for (unsigned int j = 0; j < x.«attr.name»[0].length(); ++j) {
							v_aux_«attr.name».clear();
							for (unsigned int k = 0; k < x.«attr.name»[0][0].length(); ++k) {
								«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
									v_aux_«attr.name».push_back(«attr.SimpleCppType» (x.«attr.name»[i][j][k]));
								«ELSE»
									v_aux_«attr.name».push_back(x.«attr.name»[i][j][k]);
					  			«ENDIF»
					  		}
					  		vv_aux_«attr.name».push_back(v_aux_«attr.name»);
						}
			  			«attr.name».push_back(vv_aux_«attr.name»);
					}
				«ELSEIF attr.dimension == 4»
					«attr.name» .clear();
					vector <vector< vector<«attr.SimpleCppType»> > > vvv_aux_«attr.name»;
					vector< vector<«attr.SimpleCppType»> > vv_aux_«attr.name»;
					vector<«attr.SimpleCppType»> v_aux_«attr.name»;
					
					for (unsigned int i = 0; i <x.«attr.name».length(); ++i) {
						vvv_aux_«attr.name».clear();
						for (unsigned int j = 0; j <x.«attr.name»[0].length(); ++j) { 
							vv_aux_«attr.name».clear();
							for (unsigned int k = 0; k < x.«attr.name»[0][0].length(); ++k) { 
								v_aux_«attr.name».clear();
								for (unsigned int l = 0; l <x.«attr.name»[0][0][0].length(); ++l) { 
								«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
									v_aux_«attr.name».push_back(«attr.SimpleCppType» (x.«attr.name»[i][j][k][l]));
								«ELSE»
									v_aux_«attr.name».push_back(x.«attr.name»[i][j][k][l]);
					  			«ENDIF»
					  		   }
					  		   vv_aux_«attr.name».push_back(v_aux_«attr.name»);
					  	   }
					  	   vvv_aux_«attr.name».push_back(vv_aux_«attr.name»);
					  	}
					  	«attr.name».push_back(vvv_aux_«attr.name»);
					} 
				«ENDIF»
	  		«ELSE»
				«IF attr.isExtendedType.equals("string") || attr.SimpleCppType.equals("string")»
					set«attr.UpperCaseName»(«attr.SimpleCppType» (x.«attr.name»));
				«ELSE»
					set«attr.UpperCaseName»(x.«attr.name»);
	  			«ENDIF»
	 		«ENDIF»
			«IF attr.isOptional»
			}
			«ENDIF»
		«ENDIF»
	'''
	
	
	def toXMLAttributeLinks(ASDMAttribute attr)'''
		«/* TODO : implementation */»
	'''
	
	
	def fromIDLLinks(ASDMAttribute attr)'''
		«/* TODO : implementation */»
	'''
	
	
	def toXMLAttributeName(ASDMAttribute attr)'''
		«IF attr.isOptional»
			if («attr.name»Exists) {
		«ENDIF»
		«IF attr.isEnumeration»
			buf.append(EnumerationParser::toXML("«attr.name»", «attr.name»));
		«ELSEIF attr.getExportEncoding.toString().equals("Base64")»
			Parser::toXMLBase64(«attr.name», "«attr.name»", buf);
		«ELSE»
			Parser::toXML(«attr.name», "«attr.name»", buf);
		«ENDIF»
		«IF attr.isOptional»
		}
		«ENDIF»	
	'''
	
	
	def fromXMLAttributeName(ASDMAttribute attr)'''
		«IF attr.isEnumeration»
			«IF attr.isOptional»
			if (row.isStr("<«attr.name»>")) {
			«ENDIF»
			
			«IF attr.isArray»
			«attr.name» = EnumerationParser::get«attr.SimpleCppType»«attr.ArrayDimensions»D("«attr.name»","«attr.tableName»",rowDoc);
			«ELSE»
			«attr.name» = EnumerationParser::get«attr.SimpleCppType»("«attr.name»","«attr.tableName»",rowDoc);
			«ENDIF»
			
			«IF attr.isOptional»
			«attr.name»Exists = true;
			}
			«ENDIF»
		«ELSEIF attr.set»
			«IF attr.extrinsic»
				«/* and extrinsic */»
				set«attr.UpperCaseName»(Parser::get«attr.TypeSet»("«attr.name»","«attr.tableName»",rowDoc));
			«ELSE»
				«/* not extrinsic T.B.D */»
			«ENDIF»
		«ELSEIF attr.extrinsic && attr.isArray»
			«IF attr.isOptional»
				if (row.isStr("<«attr.name»>")) {
					  set«attr.UpperCaseName»(Parser::get1D«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc)); 
				}
			«ELSE»
				set«attr.UpperCaseName»(Parser::get1D«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc));
			«ENDIF»
		«ELSE»
			«IF attr.isOptional»
				if (row.isStr("<«attr.name»>")) {
				«IF attr.isArray»
					«IF attr.getExportEncoding.toString.equals("Base64")»
					Parser::get«attr.ArrayDimensions»D«attr.WrapperType»FromBase64("«attr.name»","«attr.tableName»",rowDoc, «attr.name»);
					«ELSE»
					set«attr.UpperCaseName»(Parser::get«attr.ArrayDimensions»D«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc));
					«ENDIF»
				«ELSE»
					set«attr.UpperCaseName»(Parser::get«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc));
				«ENDIF»
			}
			«ELSE»
				«IF attr.isArray»
					«IF attr.getExportEncoding.toString.equals("Base64")»
					Parser::get«attr.ArrayDimensions»D«attr.WrapperType»FromBase64("«attr.name»","«attr.tableName»",rowDoc, «attr.name»);
					«ELSE»
					set«attr.UpperCaseName»(Parser::get«attr.ArrayDimensions»D«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc));
					«ENDIF»
				«ELSE»
					set«attr.UpperCaseName»(Parser::get«attr.WrapperType»("«attr.name»","«attr.tableName»",rowDoc));
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	
	def fromXMLAttributeLinks(ASDMAttribute attr)'''
		«/* TODO: implementation*/»
	'''
	
	
	def toBin(ASDMAttribute attr)'''
		«IF attr.isExtendedType»
			«/* The attribute has an extended type */»
			«IF attr.isArray»
				«attr.CppClass»::toBin(«attr.name», eoss);
			«ELSE»
				«attr.name».toBin(eoss);
			«ENDIF»
		«ELSE»
			«/* The attribute has a basic type or an enumrated type */»
			«IF attr.isArray»
				«/* Awful this should be rewritten  */»
				«IF attr.dimension == 1»
					eoss.writeInt((int) «attr.name».size());
					for (unsigned int i = 0; i < «attr.name».size(); i++)
					«IF attr.isEnumeration»
						eoss.writeString(C«attr.typeName»::name(«attr.name».at(i)));
						/* eoss.writeInt(«attr.name».at(i)); */
					«ELSE»
						eoss.write«attr.SimpleJavaType.toFirstUpper()»(«attr.name».at(i));
					«ENDIF»
					
				«ELSEIF attr.dimension == 2»
					eoss.writeInt((int) «attr.name».size());
					eoss.writeInt((int) «attr.name».at(0).size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) 
						for (unsigned int j = 0;  j < «attr.name».at(0).size(); j++) 
							«IF attr.isEnumeration»
								eoss.writeString(C«attr.typeName»::name(«attr.name».at(i).at(j)));				
								/* eoss.writeInt(«attr.name».at(i).at(j)); */
							«ELSE»			 
								eoss.write«attr.SimpleJavaType.toFirstUpper()»(«attr.name».at(i).at(j));
							«ENDIF»
						
				«ELSEIF attr.dimension == 3»
					eoss.writeInt((int) «attr.name».size());
					eoss.writeInt((int) «attr.name».at(0).size());		
					eoss.writeInt((int) «attr.name».at(0).at(0).size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) 
						for (unsigned int j = 0;  j < «attr.name».at(0).size(); j++)
							for (unsigned int k = 0; k <  «attr.name».at(0).at(0).size(); k++)	
							«IF attr.isEnumeration»
								eoss.writeString(C«attr.typeName»::name(«attr.name».at(i).at(j).at(k)));
								/* eoss.writeInt(«attr.name».at(i).at(j).at(k)); */
							«ELSE»			 
								eoss.write«attr.SimpleJavaType.toFirstUpper()»(«attr.name».at(i).at(j).at(k));
							«ENDIF»		
				«ELSEIF attr.dimension == 4»
					eoss.writeInt((int) «attr.name».size());
					eoss.writeInt((int) «attr.name».at(0).size());		
					eoss.writeInt((int) «attr.name».at(0).at(0).size());			
					eoss.writeInt((int) «attr.name».at(0).at(0).at(0).size());
					for (unsigned int i = 0; i < «attr.name».size(); i++) 
						for (unsigned int j = 0;  j < «attr.name».at(0).size(); j++)
							for (unsigned int k = 0; k <  «attr.name».at(0).at(0).size(); k++)
								for (unsigned int l = 0; l < 	«attr.name».at(0).at(0).at(0).size(); l++)
									«IF attr.isEnumeration»
											eoss.writeString(C«attr.typeName»::name(«attr.name».at(i).at(j).at(k).at(l)));
											/* eoss.writeInt(«attr.name».at(i).at(j).at(k).at(l)); */
									«ELSE»					 
											eoss.write«attr.SimpleJavaType.toFirstUpper()»(«attr.name».at(i).at(j).at(k).at(l));	
									«ENDIF»						
				«ENDIF»			
			«ELSE»
				«IF attr.isEnumeration»	
					eoss.writeString(C«attr.typeName»::name(«attr.name»));
					/* eoss.writeInt(«attr.name»); */
				«ELSE»		
					eoss.write«attr.SimpleJavaType.toFirstUpper()»(«attr.name»);
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	
	def toBinOpt(ASDMAttribute attr)'''
		eoss.writeBoolean(«attr.name»Exists);
		if («attr.name»Exists) {
			«toBin(attr)»
		}
	'''
	
	
	def binaryDeserialize(AlmaTable table, ASDMAttribute attr, String binSourceType, String binSource)'''
		void «table.name»Row::«attr.name»FromBin(«binSourceType»& «binSource») {
			«IF attr.isOptional»
				«fromBinOpt(binSource,attr)»
			«ELSE»
				«fromBin(binSource,attr)»
			«ENDIF»
		}
	'''
	
	
	def textDeserialize(AlmaTable table, ASDMAttribute attr)'''
		«IF !attr.typeName.equals("EntityRef")»
			// Convert a string into an «attr.typeName» 
			void «table.name»Row::«attr.name»FromText(const string & s) {
				«IF attr.isOptional»
					«attr.name»Exists = true;
				«ENDIF» 
				«IF attr.isArray»
					«attr.name» = ASDMValuesParser::parse«attr.dimension»D<«attr.SimpleCppType»>(s);
				«ELSE»
					«attr.name» = ASDMValuesParser::parse<«attr.SimpleCppType»>(s);
				«ENDIF»
			}
		«ENDIF»
	'''
	
	
	def initializeOptional(ASDMAttribute attr)'''
		«IF attr.isOptional»
			«attr.name»Exists = false;
		«ENDIF»
	'''
	
	
	def initializeLiteral(ASDMAttribute attr)'''
		«IF attr.isEnumeration && !attr.isArray»
			// This attribute is scalar and has an enumeration type. Let's initialize it to some valid value (the 1st of the enumeration).		
			«attr.name» = C«attr.SimpleCppType»::from_int(0);
		«ENDIF»
	'''
	
	
	def compareAttribute(ASDMAttribute attr)'''
		«IF !attr.isOptional && !attr.isAutoIncrementable»
			«IF attr.CppType.equals("ArrayTimeInterval")»
				result = result && (this->«attr.name».overlaps(«attr.name»));
			«ELSEIF attr.CppType.equals("EntityId")»
				result = result && (this->«attr.name».equals(«attr.name»));
			«ELSE»
				result = result && (this->«attr.name» == «attr.name»);
			«ENDIF»
				if (!result) return false;
		«ENDIF»
	'''
	
	
	def compareAttributeExactly(ASDMAttribute attr)'''
		«IF !attr.isOptional»
			if (!(this->«attr.name» == «attr.name»)) return false;
		«ENDIF»	
	'''
	
	
	def fromBinOpt(String binSource,ASDMAttribute attr)'''
		«attr.name»Exists = «binSource».readBoolean();
		if («attr.name»Exists) {
			«fromBin(binSource,attr)»
		}
	'''
	
	
	def fromBin(String binSource,ASDMAttribute attr)'''
		«IF attr.isExtendedType»
			«/* The attribute has an extended type.*/»	
			«IF attr.isArray»
				«fromBinArrayExtendedType(binSource,attr)»
			«ELSE»
				«attr.name» =  «attr.SimpleCppType»::fromBin(«binSource»);
			«ENDIF»
		«ELSE»
			«/* The attribute has a basic type or an enumerated type */»
			«IF attr.isArray»
				«fromBinArrayBasicOrEnumType(binSource,attr)»
			«ELSE»
				«IF attr.isEnumeration»
					«attr.name» = C«attr.SimpleCppType»::literal(«binSource».readString());
				«ELSE»
					«attr.name» =  «binSource».read«attr.SimpleJavaType.toFirstUpper()»();
				«ENDIF»
			«ENDIF»
		«ENDIF»
	'''
	
	
	def fromBinArrayExtendedType(String binSource,ASDMAttribute attr)'''
		«IF attr.dimension == 1»
			«attr.name» = «attr.SimpleCppType»::from1DBin(«binSource»);	
		«ELSEIF attr.dimension == 2»
			«attr.name» = «attr.SimpleCppType»::from2DBin(«binSource»);		
		«ELSEIF attr.dimension == 3»
			«attr.name» = «attr.SimpleCppType»::from3DBin(«binSource»);		
		«ELSEIF attr.dimension == 4»
			«attr.name» = «attr.SimpleCppType»::from4DBin(«binSource»);		
		«ENDIF»
	'''
	
	
	def fromBinArrayBasicOrEnumType(String binSource,ASDMAttribute attr)'''
		«IF attr.dimension == 1»
			«attr.name».clear();
			
			unsigned int «attr.name»Dim1 = «binSource».readInt();
			for (unsigned int  i = 0 ; i < «attr.name»Dim1; i++)
				«IF attr.isEnumeration»
					«attr.name».push_back(C«attr.SimpleCppType»::literal(«binSource».readString()));
				«ELSE»
					«attr.name».push_back(«binSource».read«attr.SimpleJavaType.toFirstUpper()»());
				«ENDIF»
		«ELSEIF attr.dimension == 2»
			«attr.name».clear();
			
			unsigned int «attr.name»Dim1 = «binSource».readInt();
			unsigned int «attr.name»Dim2 = «binSource».readInt();
			vector <«attr.SimpleCppType»> «attr.name»Aux1;
			for (unsigned int i = 0; i < «attr.name»Dim1; i++) {
				«attr.name»Aux1.clear();
				for (unsigned int j = 0; j < «attr.name»Dim2 ; j++)			
					«IF attr.isEnumeration»
						«attr.name»Aux1.push_back(C«attr.SimpleCppType»::literal(«binSource».readString()));
					«ELSE»
						«attr.name»Aux1.push_back(«binSource».read«attr.SimpleJavaType.toFirstUpper()»());
					«ENDIF»
						«attr.name».push_back(«attr.name»Aux1);
			}
			
		«ELSEIF attr.dimension == 3»
			«attr.name».clear();
				
			unsigned int «attr.name»Dim1 = «binSource».readInt();
			unsigned int «attr.name»Dim2 = «binSource».readInt();
			unsigned int «attr.name»Dim3 = «binSource».readInt();
			vector <vector<«attr.SimpleCppType»> > «attr.name»Aux2;
			vector <«attr.SimpleCppType»> «attr.name»Aux1;
			for (unsigned int i = 0; i < «attr.name»Dim1; i++) {
				«attr.name»Aux2.clear();
				for (unsigned int j = 0; j < «attr.name»Dim2 ; j++) {
					«attr.name»Aux1.clear();
					for (unsigned int k = 0; k < «attr.name»Dim3; k++) {
						«IF attr.isEnumeration»
							«attr.name»Aux1.push_back(C«attr.SimpleCppType»::literal(«binSource».readString()));
						«ELSE»
							«attr.name»Aux1.push_back(«binSource».read«attr.SimpleJavaType.toFirstUpper()»());
						«ENDIF»
					}
					«attr.name»Aux2.push_back(«attr.name»Aux1);
				}
				«attr.name».push_back(«attr.name»Aux2);
			}	
		«ELSEIF attr.dimension == 4»
			«attr.name».clear();
				
			unsigned int «attr.name»Dim1 = «binSource».readInt();
			unsigned int «attr.name»Dim2 = «binSource».readInt();
			unsigned int «attr.name»Dim3 = «binSource».readInt();
			unsigned int «attr.name»Dim3 = «binSource».readInt();
			
			vector<vector <vector<«attr.SimpleCppType»> > >«attr.name»Aux3;
			vector <vector<«attr.SimpleCppType»> > «attr.name»Aux2;
			vector <«attr.SimpleCppType»> «attr.name»Aux1;
			for (unsigned int i = 0; i < «attr.name»Dim1; i++) {
				«attr.name»Aux3.clear();
				for (unsigned int j = 0; j < «attr.name»Dim2 ; j++) {
					«attr.name»Aux2.clear();
					for (unsigned int k = 0; k < «attr.name»Dim3; k++) {
						«attr.name»Aux1.clear();
						for (unsigned int l = 0; l < «attr.name»Dim4; k++) {
							«IF attr.isEnumeration»
								«attr.name»Aux1.push_back(C«attr.SimpleCppType»::literal(«binSource».readString()));
							«ELSE»
								«attr.name»Aux1.push_back(«binSource».read«attr.SimpleJavaType.toFirstUpper()»());
							«ENDIF»
						}
						«attr.name»Aux2.push_back(«attr.name»Aux1);
					}
					«attr.name»Aux3.push_back(«attr.name»Aux2);
				}
				«attr.name».push_back(«attr.name»Aux3);
			}		
		«ENDIF»
	'''
}