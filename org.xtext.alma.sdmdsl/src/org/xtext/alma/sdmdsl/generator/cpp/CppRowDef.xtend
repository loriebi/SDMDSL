package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess
import alma.hla.datamodel.meta.asdm.ASDMAttribute

class CppRowDef{
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * CppRowDef generator
		 */
		for(table : container.tables){
			
			//  creating file and generating Cpp code for table 
			sdmFsa.setFile("include/" + table.name + "Row.h")
			sdmFsa.generateFile(table.generateCppRowDef)
			
		}
		
	}
	
	
	
	
	def generateCppRowDef(AlmaTable table)'''
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
		 * File «table.name»Row.h
		 */
		 
		#ifndef «table.name»Row_CLASS
		#define «table.name»Row_CLASS
		
		#include <vector>
		#include <string>
		#include <set>
		
		#ifndef WITHOUT_ACS
		#include <asdmIDLC.h>
		#endif
		
		«/*  Do we have a long attribute at least , in such a case we must do the adapted include */»
		«IF table.hasLongAttribute»
			#include <stdint.h>
		«ENDIF»
		
		«/* Do we need to include files for extended types ? */»
		«FOR et : table.usedExtendedTypes »
			«IF et.equals("Boolean") || et.equals("Byte") || et.equals("Character") || et.equals("Complex") || et.equals("Double") || et.equals("Float") || et.equals("Integer") || et.equals("Long") || et.equals("Short")»
				#include <«et»Wrapper.h>
			«ELSE» 
				#include <«et».h>
			«ENDIF»
		«ENDFOR»
		
		«/* Do we need to include files for enumerations */»
		«FOR attr : table.intrinsic»
			«IF attr.isEnumeration»
				#include "C«attr.typeName».h"
			«ENDIF»
		«ENDFOR»
		
		
		«/* Exceptions definitions are included unconditionally. */»
		#include <ConversionException.h>
		#include <NoSuchRow.h>
		#include <IllegalAccessException.h>
		
		#include <RowTransformer.h>
		//#include <TableStreamReader.h>
		
		/*\file «table.name+".h"»
		    \brief Generated from model's revision "«AlmaTable.revision»", branch "«AlmaTable.branch»"
		*/
		
		namespace asdm {
			
			//class asdm::«table.name»Table;
			
			«FOR link : table.link »
				«IF !link.refersTo.equals(table.name)»
					// class asdm::«link.refersTo»Row;
					class «link.refersTo»Row;
				«ENDIF»
			«ENDFOR»
			
			
			class «table.name»Row;
			typedef void («table.name»Row::*«table.name»AttributeFromBin) (EndianIStream& eis);
			typedef void («table.name»Row::*«table.name»AttributeFromText) (const string& s);
			
			
			/**
			 * The «table.name»Row class is a row of a «table.name»Table.
			 * 
			 * Generated from model's revision "«AlmaTable.revision»", branch "«AlmaTable.branch»"
			 *
			 */
			class «table.name»Row {
			
			friend class asdm::«table.name»Table;
			friend class asdm::RowTransformer<«table.name»Row>;
			//friend class asdm::TableStreamReader<«table.name»Table, «table.name»Row>;
			
			public:
			
				virtual ~«table.name»Row();
				
				/**
				 * Return the table to which this row belongs.
				 */
				«table.name»Table &getTable() const;
				
				/**
				 * Has this row been added to its table ?
				 * @return true if and only if it has been added.
				 */
				bool isAdded() const;
				
				
				////////////////////////////////
				// Intrinsic Table Attributes //
				////////////////////////////////
				«FOR attr : table.intrinsic»
					«new CppTableAttributeDefGS().doGenerate(attr)»
				«ENDFOR»
				////////////////////////////////
				// Extrinsic Table Attributes //
				////////////////////////////////
				«FOR attr : table.extrinsic»
					«new CppTableAttributeDefGS().doGenerate(attr)»
				«ENDFOR»
				///////////
				// Links //
				///////////
				«/* TODO: CppTableLinksDefGS::Root FOREACH (Set[TableLink])Link */»
				«FOR linkAttr : table.link»
					«new CppTableLinksDefGS().doGenerate(linkAttr)»
				«ENDFOR»
				
				
				«IF  table.requiredNoAutoIncrementableAttributes.size != 0»
					/**
					 * Compare each mandatory attribute except the autoincrementable one of this «table.name»Row with 
					 * the corresponding parameters and return true if there is a match and false otherwise.
					 	«FOR attr : table.requiredNoAutoIncrementableAttributes»
					 		* @param «attr.name»
					    «ENDFOR»
					 */ 
					bool compareNoAutoInc(«table.RequiredNoAutoIncrementableCpp»);
				«ENDIF»
				
				«IF table.requiredValueAttributes.size != 0»
					/**
					 * Compare each mandatory value (i.e. not in the key) attribute  with 
					 * the corresponding parameters and return true if there is a match and false otherwise.
					 	«FOR attr : table.requiredValueAttributes»
					 		* @param «attr.name»
					    «ENDFOR»
					 */ 
					bool compareRequiredValue(«table.RequiredValueCpp»); 
				«ENDIF»	
				
				
				/**
				 * Return true if all required attributes of the value part are equal to their homologues
				 * in x and false otherwise.
				 *
				 * @param x a pointer on the «table.name»Row whose required attributes of the value part 
				 * will be compared with those of this.
				 * @return a boolean.
				 */
				bool equalByRequiredValue(«table.name»Row* x) ;
			
				
				#ifndef WITHOUT_ACS
					/**
					 * Return this row in the form of an IDL struct.
					 * @return The values of this row as a «table.name»RowIDL struct.
					 */
					asdmIDL::«table.name»RowIDL *toIDL() const;
					
					/**
					 * Define the content of a «table.name»RowIDL struct from the values
					 * found in this row.
					 *
					 * @param x a reference to the «table.name»RowIDL struct to be set.
					 *
					 */
					 void toIDL(asdmIDL::«table.name»RowIDL& x) const;
				#endif
				
				#ifndef WITHOUT_ACS
					/**
					 * Fill the values of this row from the IDL struct «table.name»RowIDL.
					 * @param x The IDL struct containing the values used to fill this row.
					 * @throws ConversionException
					 */
					void setFromIDL (asdmIDL::«table.name»RowIDL x) ;
				#endif
			
				/**
				 * Return this row in the form of an XML string.
				 * @return The values of this row as an XML string.
				 */
				std::string toXML() const;
			
				/**
				 * Fill the values of this row from an XML string 
				 * that was produced by the toXML() method.
				 * @param rowDoc the XML string being used to set the values of this row.
				 * @throws ConversionException
				 */
				void setFromXML (std::string rowDoc) ;
			
				/// @cond DISPLAY_PRIVATE	
				////////////////////////////////////////////////////////////
				// binary-deserialization material from an EndianIStream  //
				////////////////////////////////////////////////////////////
				
				std::map<std::string, «table.name»AttributeFromBin> fromBinMethods;
				«FOR attr : table.requiredAttributes»
					«binaryDeserialize("EndianIStream", "eis", attr)»
				«ENDFOR»
				«FOR attr : table.optionalValueAttributes»
					«binaryDeserialize("EndianIStream", "eis", attr)»
				«ENDFOR»
				
				/**
				 * Deserialize a stream of bytes read from an EndianIStream to build a PointingRow.
				 * @param eiss the EndianIStream to be read.
				 * @param table the «table.name»Table to which the row built by deserialization will be parented.
				 * @param attributesSeq a vector containing the names of the attributes . The elements order defines the order 
				 * in which the attributes are written in the binary serialization.
				 */
				static «table.name»Row* fromBin(EndianIStream& eis, «table.name»Table& table, const std::vector<std::string>& attributesSeq);	 
			 
			 	/**
			 	 * Parses a string t and assign the result of the parsing to the attribute of name attributeName.
			 	 *
			 	 * @param attributeName the name of the attribute whose value is going to be defined.
			 	 * @param t the string to be parsed into a value given to the attribute of name attributeName.
			 	 */
			 	void fromText(const std::string& attributeName, const std::string&  t);
			    /// @endcond
			private:
				/**
				 * The table to which this row belongs.
				 */
				«table.name»Table &table;
				
				/**
				 * Whether this row has been added to the table or not.
				 */
				bool hasBeenAdded;
			
				// This method is used by the Table class when this row is added to the table.
				void isAdded(bool added);
				
			
				/**
				 * Create a «table.name»Row.
				 * <p>
				 * This constructor is private because only the
				 * table can create rows.  All rows know the table
				 * to which they belong.
				 * @param table The table to which this row belongs.
				 */ 
				«table.name»Row («table.name»Table &table);
			
				/**
				 * Create a «table.name»Row using a copy constructor mechanism.
				 * <p>
				 * Given a «table.name»Row row and a «table.name»Table table, the method creates a new
				 * «table.name»Row owned by table. Each attribute of the created row is a copy (deep)
				 * of the corresponding attribute of row. The method does not add the created
				 * row to its table, its simply parents it to table, a call to the add method
				 * has to be done in order to get the row added (very likely after having modified
				 * some of its attributes).
				 * If row is null then the method returns a row with default values for its attributes. 
				 *
				 * This constructor is private because only the
				 * table can create rows.  All rows know the table
				 * to which they belong.
				 * @param table The table to which this row belongs.
				 * @param row  The row which is to be copied.
				 */
				 «table.name»Row («table.name»Table &table, «table.name»Row &row);
				 
					////////////////////////////////
					// Intrinsic Table Attributes //
					////////////////////////////////
					«FOR attr : table.intrinsic»
						«new CppTableAttributeDef().doGenerate(attr)»
					«ENDFOR»
					////////////////////////////////
					// Extrinsic Table Attributes //
					////////////////////////////////
					«FOR attr : table.extrinsic»
						«new CppTableAttributeDef().doGenerate(attr)»
					«ENDFOR»
					///////////
					// Links //
					///////////
					«/* TODO: CppTableLinksDef::Root FOREACH (Set[TableLink])Link */»
					«FOR linkAttr : table.link»
						«new CppTableLinksDef().doGenerate(linkAttr)»
					«ENDFOR»
			
			
					/*
					////////////////////////////////////////////////////////////
					// binary-deserialization material from an EndianIStream  //
					////////////////////////////////////////////////////////////
					std::map<std::string, «table.name»AttributeFromBin> fromBinMethods;
					«FOR attr : table.requiredAttributes»
						«binaryDeserialize("EndianIStream", "eis", attr)»
					«ENDFOR»
					«FOR attr : table.optionalValueAttributes»
						«binaryDeserialize("EndianIStream", "eis", attr)»
					«ENDFOR»
					*/
					
					
					///////////////////////////////////
					// text-deserialization material //
					///////////////////////////////////
					std::map<std::string, «table.name»AttributeFromText> fromTextMethods;
					«FOR attr : table.requiredAttributes»
						«textDeserialize(attr)»
					«ENDFOR»
					«FOR attr : table.optionalValueAttributes»
						«textDeserialize(attr)»	
					«ENDFOR»
					
					
					/**
					 * Serialize this into a stream of bytes written to an EndianOSStream.
					 * @param eoss the EndianOSStream to be written to
					 */
					void toBin(EndianOSStream& eoss);
					 
					/**
					 * Deserialize a stream of bytes read from an EndianIStream to build a PointingRow.
					 * @param eiss the EndianIStream to be read.
					 * @param table the «table.name»Table to which the row built by deserialization will be parented.
					 * @param attributesSeq a vector containing the names of the attributes . The elements order defines the order 
					 * in which the attributes are written in the binary serialization.
				
						static «table.name»Row* fromBin(EndianIStream& eis, «table.name»Table& table, const std::vector<std::string>& attributesSeq);	 
					 */
			};
			
			
		} // End namespace asdm
		
		#endif /* «table.name»_CLASS */
	'''
	
	
	
	def binaryDeserialize(String binSourceType, String binSource, ASDMAttribute attr)'''
		void «attr.name»FromBin( «binSourceType»& «binSource»);
	'''
	
	
	def textDeserialize(ASDMAttribute attr)'''
		«IF !attr.typeName.equals("EntityRef")»
			void «attr.name»FromText (const string & s);
		«ENDIF»
	'''
}