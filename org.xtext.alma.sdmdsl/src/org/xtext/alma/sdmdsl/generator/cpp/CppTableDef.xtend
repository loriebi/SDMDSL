package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppTableDef {
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * CppTableDef generator
		 */
		for(table : container.tables){
			
			//  creating file and generating Cpp code for table 
			sdmFsa.setFile("include/" + table.name + "Table.h")
			sdmFsa.generateFile(table.generateCppTableDef)
			
		}
		
	}
	
	
	def generateCppTableDef(AlmaTable table)'''
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
	 * File «table.name»Table.h
	 */
	 
	#ifndef «table.name»Table_CLASS
	#define «table.name»Table_CLASS
	
	#include <string>
	#include <vector>
	#include <map>
	
	«/* Do we need to include files for extended types ?*/»
	«FOR et : table.usedExtendedTypes»
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
	#include <DuplicateKey.h>
	#include <UniquenessViolationException.h>
	#include <NoSuchRow.h>
	#include <DuplicateKey.h>
	
	
	#ifndef WITHOUT_ACS
	#include <asdmIDLC.h>
	#endif
	
	
	#include <Representable.h>
	
	#include <pthread.h>
	
	namespace asdm {
		
	//class asdm::«container.name»;
	//class asdm::«table.name»Row;
	
	class «container.name»;
	class «table.name»Row;
	
	/**
	 * The «table.name»Table class is an Alma table.
	 * <BR>
	 * 
	 * \par Role
	 * «table.doc»
	 * <BR>
	 
	 * Generated from model's revision "«AlmaTable.revision»", branch «AlmaTable.branch»
	 *
	 * <TABLE BORDER="1">
	 * <CAPTION> Attributes of «table.name» </CAPTION>
	 * <TR BGCOLOR="#AAAAAA"> <TH> Name </TH> <TH> Type </TH> <TH> Expected shape  </TH> <TH> Comment </TH></TR>
	 «IF table.keyAttributes.size != 0»
	 * <TR> <TH BGCOLOR="#CCCCCC" colspan="4" align="center"> Key </TD></TR>
	 «FOR kat : table.keyAttributes»
	 * <TR>
	 «IF kat.isAutoIncrementable»
	 * <TD><I> «kat.name» </I></TD>
	 «ELSE»
	 * <TD> «kat.name» </TD>
	 «ENDIF» 
	 * <TD> «kat.CppType»</TD>
	 * <TD> &nbsp; </TD>
	 * <TD> &nbsp;«kat.ShortDocumentation» </TD>
	 * </TR>
	 «ENDFOR»
	«ENDIF»
	«IF table.requiredValueAttributes.size != 0»
	 * <TR> <TH BGCOLOR="#CCCCCC"  colspan="4" valign="center"> Value <br> (Mandatory) </TH></TR>
	«FOR rvat : table.requiredValueAttributes»
	 * <TR>
	 * <TD> «rvat.name» «IF rvat.isDimensionPar»(«rvat.LatexSymbol»)«ENDIF»</TD>
	 * <TD> «rvat.CppType» </TD>
	 * <TD> «IF rvat.isArray» «rvat.CppTypeDescription»«ELSE» &nbsp; «ENDIF» </TD>
	 * <TD> &nbsp;«rvat.ShortDocumentation» </TD>
	 * </TR>
	«ENDFOR»
	«ENDIF»
	«IF table.optionalValueAttributes.size != 0»
	 * <TR> <TH BGCOLOR="#CCCCCC"  colspan="4" valign="center"> Value <br> (Optional) </TH></TR>
	«FOR ovat : table.optionalValueAttributes»
	 * <TR>
	 * <TD> «ovat.name»«IF ovat.isDimensionPar»(«ovat.LatexSymbol»)«ENDIF»</TD>
	 * <TD> «ovat.CppType» </TD>
	 * <TD> «IF ovat.isArray» «ovat.CppTypeDescription» «ELSE» &nbsp;«ENDIF» </TD>
	 * <TD>&nbsp; «ovat.ShortDocumentation» </TD>
	 * </TR>
	«ENDFOR»
	«ENDIF»
	 * </TABLE>
	 */
	
	class «table.name»Table : public Representable {
		friend class «container.name»;
	
	public:
	
	
		/**
		 * Return the list of field names that make up key «table.key.name»
		 * as an array of strings.
		 * @return a vector of string.
		 */	
		static const std::vector<std::string>& get«table.key.UpperCaseName»Name();
		
	
	
		virtual ~«table.name»Table();
		
		/**
		 * Return the container to which this table belongs.
		 *
		 * @return the «container.name» containing this table.
		 */
		«container.name» &getContainer() const;
		
		
		/**
		 * Return the number of rows in the table.
		 *
		 * @return the number of rows in an unsigned int.
		 */
		unsigned int size() const;
		
		/**
		 * Return the name of this table.
		 *
		 * This is a instance method of the class.
		 *
		 * @return the name of this table in a string.
		 */
		std::string getName() const;
		
		/**
		 * Return the name of this table.
		 *
		 * This is a static method of the class.
		 *
		 * @return the name of this table in a string.
		 */
		static std::string name() ;	
		
		/**
		 * Return the version information about this table.
		 *
		 */
		 std::string getVersion() const ;
		
		/**
		 * Return the names of the attributes of this table.
		 *
		 * @return a vector of string
		 */
		 static const std::vector<std::string>& getAttributesNames();
	
		/**
		 * Return the default sorted list of attributes names in the binary representation of the table.
		 *
		 * @return a const reference to a vector of string
		 */
		 static const std::vector<std::string>& defaultAttributesNamesInBin();
		 
		/**
		 * Return this table's Entity.
		 */
		Entity getEntity() const;
	
		/**
		 * Set this table's Entity.
		 * @param e An entity. 
		 */
		void setEntity(Entity e);
			
		/**
		 * Produces an XML representation conform
		 * to the schema defined for «table.name» («table.name»Table.xsd).
		 *
		 * @returns a string containing the XML representation.
		 * @throws ConversionException
		 */
		std::string toXML()  ;
		
		
	#ifndef WITHOUT_ACS
		// Conversion Methods
		/**
		 * Convert this table into a «table.name»TableIDL CORBA structure.
		 *
		 * @return a pointer to a «table.name»TableIDL
		 */
		asdmIDL::«table.name»TableIDL *toIDL() ;
		
		/**
		 * Fills the CORBA data structure passed in parameter
		 * with the content of this table.
		 *
		 * @param x a reference to the asdmIDL::«table.name»TableIDL to be populated
		 * with the content of this.
		 */
		 void toIDL(asdmIDL::«table.name»TableIDL& x) const;
		 
	#endif
	
	#ifndef WITHOUT_ACS
		/**
		 * Populate this table from the content of a «table.name»TableIDL Corba structure.
		 *
		 * @throws DuplicateKey Thrown if the method tries to add a row having a key that is already in the table.
		 * @throws ConversionException
		 */	
		void fromIDL(asdmIDL::«table.name»TableIDL x) ;
	#endif
	
		//
		// ====> Row creation.
		//
		
		/**
		 * Create a new row with default values.
		 * @return a pointer on a «table.name»Row
		 */
		«table.name»Row *newRow();
		
		
		«IF table.requiredNoAutoIncrementableAttributes.size != 0»	
			/**
			 * Create a new row initialized to the specified values.
			 * @return a pointer on the created and initialized row.
			«FOR attr : table.requiredNoAutoIncrementableAttributes»
			 * @param «attr.name»
			«ENDFOR»
			 */
			«table.name»Row *newRow(«table.RequiredNoAutoIncrementableCpp»);
			
		«ENDIF»
		
	
		/**
		 * Create a new row using a copy constructor mechanism.
		 * 
		 * The method creates a new «table.name»Row owned by this. Each attribute of the created row 
		 * is a (deep) copy of the corresponding attribute of row. The method does not add 
		 * the created row to this, its simply parents it to this, a call to the add method
		 * has to be done in order to get the row added (very likely after having modified
		 * some of its attributes).
		 * If row is null then the method returns a new «table.name»Row with default values for its attributes. 
		 *
		 * @param row the row which is to be copied.
		 */
		 «table.name»Row *newRow(«table.name»Row *row); 
	
	
		//
		// ====> Append a row to its table.
		//
	«IF !table.NoAutoIncrementableAttribute»
		«/* This table has autoincrementable attribute */»
		«IF table.isTemporal» 
		«/* This table has a temporal attribute in its key section*/»
		«/* T.B.D : document the fact that rows are ordered by ascending time for a given context*/»
		/** 
		 * Add a row.
		 * If there table contains a row whose key's fields except² «table.TheAutoIncrementableAttribute.name» are equal
		 * to x's ones then return a pointer on this row (i.e. no actual insertion is performed) 
		 * otherwise add x to the table and return x.
		 * @param x . A pointer on the row to be added.
		 * @returns a pointer to a «table.name»Row.
		 */
		 «ELSE»
		«/* This table does not have a temporal attribute in its key section*/»
		/** 
		 * Add a row.
		 * If there table contains a row whose key's fields are equal
		 * to x's ones then return a pointer on this row (i.e. no actual insertion is performed) 
		 * otherwise add x to the table and return x.
		 * @param x . A pointer on the row to be added.
		 * @returns a pointer to a «table.name»Row.	 
		 */	
		 «ENDIF»
	 	 «table.name»Row* add(«table.name»Row* x) ;
	«ELSE» 
		«/* this table does not have an autoincrementable attributes.*/»
		/**
		 * Add a row.
		 * @param x a pointer to the «table.name»Row to be added.
		 *
		 * @return a pointer to a «table.name»Row. If the table contains a «table.name»Row whose attributes (key and mandatory values) are equal to x ones
		 * then returns a pointer on that «table.name»Row, otherwise returns x.
		 *
		 * @throw DuplicateKey { thrown when the table contains a «table.name»Row with a key equal to the x one but having
		 * and a value section different from x one }
		 *
		«IF table.isTemporal»
		 * @note The row is inserted in the table in such a way that all the rows having the same value of
		 * ( «table.KeyNoAutoIncNoTimeAttributesList» ) are stored by ascending time.
		 * @see method getByContext.
		«ENDIF»
		 */
		«table.name»Row* add(«table.name»Row* x) ;
	«ENDIF»
	
		
		
		//
		// ====> Methods returning rows.
		//
			
		/**
		 * Get a collection of pointers on the rows of the table.
		 * @return Alls rows in a vector of pointers of «table.name»Row. The elements of this vector are stored in the order 
		 * in which they have been added to the «table.name»Table.
		 */
		std::vector<«table.name»Row *> get() ;
		
		/**
		 * Get a const reference on the collection of rows pointers internally hold by the table.
		 * @return A const reference of a vector of pointers of «table.name»Row. The elements of this vector are stored in the order 
		 * in which they have been added to the «table.name»Table.
		 *
		 */
		 const std::vector<«table.name»Row *>& get() const ;
		 
		 
	«IF table.isTemporal && table.NoAutoIncrementableAttribute && table.keyNoAutoIncrementableAttributes.size != 0»
		/**
		 * Returns all the rows sorted by ascending startTime for a given context. 
		 * The context is defined by a value of ( «table.KeyNoAutoIncNoTimeAttributesList» ).
		 *
		 * @return a pointer on a vector<«table.name»Row *>. A null returned value means that the table contains
		 * no «table.name»Row for the given ( «table.KeyNoAutoIncNoTimeAttributesList» ).
		 *
		 * @throws IllegalAccessException when a call is done to this method when it's called while the dataset has been imported with the 
		 * option checkRowUniqueness set to false.
		 */
		 std::vector <«table.name»Row*> *getByContext(«table.KeyNoAutoIncNoTimeCpp»);
		 
	«ENDIF»
	
	
	«IF !table.KeyCpp.equals("")» 
		«/* In principle this guard is not needed since all tables have a key*/»
		/**
		 * Returns a «table.name»Row* given a key.
		 * @return a pointer to the row having the key whose values are passed as parameters, or 0 if
		 * no row exists for that key.
		«FOR attr : table.keyAttributes»
		 * @param «attr.name»
		«ENDFOR»
		 *
		 */
	 	«table.name»Row* getRowByKey(«table.KeyCpp»);
	«ENDIF»
		 
		 
	«IF !table.NoAutoIncrementableAttribute && table.keyNoAutoIncrementableAttributes.size != 0» 	
		/**
		 * Returns a vector of pointers on rows whose key element «table.TheAutoIncrementableAttribute.name» 
		 * is equal to the parameter «table.TheAutoIncrementableAttribute.name».
		 * @return a vector of vector <«table.name»Row *>. A returned vector of size 0 means that no row has been found.
		 * @param «table.TheAutoIncrementableAttribute.name» «table.TheAutoIncrementableAttribute.CppType» contains the value of
		 * the autoincrementable attribute that is looked up in the table.
		 */
		std::vector <«table.name»Row *>  getRowBy«table.TheAutoIncrementableAttribute.UpperCaseName»(«table.TheAutoIncrementableAttribute.CppType»);
	«ENDIF»
	
	
	«IF table.requiredNoAutoIncrementableAttributes.size != 0»
		/**
		 * Look up the table for a row whose all attributes «IF !table.NoAutoIncrementableAttribute» except the autoincrementable one «ENDIF»
		 * are equal to the corresponding parameters of the method.
		 * @return a pointer on this row if any, null otherwise.
		 *
		 «FOR attr : table.requiredNoAutoIncrementableAttributes»
		 * @param «attr.name»
		 «ENDFOR» 
		 */
		«table.name»Row* lookup(«table.RequiredNoAutoIncrementableCpp»); 
	«ENDIF»
		
		void setUnknownAttributeBinaryReader(const std::string& attributeName, BinaryAttributeReaderFunctor* barFctr);
		BinaryAttributeReaderFunctor* getUnknownAttributeBinaryReader(const std::string& attributeName) const;
		
		
	private:
	
		
		/**
		 * Create a «table.name»Table.
		 * <p>
		 * This constructor is private because only the
		 * container can create tables.  All tables must know the container
		 * to which they belong.
		 * @param container The container to which this table belongs.
		 */ 
		«table.name»Table («container.name» & container);
	
		«container.name» & container;
		
		bool archiveAsBin; // If true archive binary else archive XML
		bool fileAsBin ; // If true file binary else file XML	
		
		std::string version ; 
		
		Entity entity;
		
		
		«/* 
		This is a kludge for the specific case of the Source table. In the case of this table we want
		to ensure that for each sourceName there is only one value of sourceId. In other words, there 
		should not be two distinct rows in the table with the same sourceName and different sourceId.
		*/»
	«IF table.name.equals("Source")»
		/*
		** Let's use a map to implement the condition "one sourceName -> one sourceId"
		*/
		std::map<const std::string, int> name2id_m;
	«ENDIF»
	
	«IF !table.NoAutoIncrementableAttribute && !table.isTemporal»
		// A map for the autoincrementation algorithm
		std::map<std::string,int>  noAutoIncIds;
		void autoIncrement(std::string key, «table.name»Row* x);
	«ENDIF»
	
	
		/**
		 * If this table has an autoincrementable attribute then check if *x verifies the rule of uniqueness and throw exception if not.
		 * Check if *x verifies the key uniqueness rule and throw an exception if not.
		 * Append x to its table.
		 * @throws DuplicateKey
		 «IF !table.NoAutoIncrementableAttribute»
		 * @throws UniquenessViolationException
		 «ENDIF»
		 */
		«table.name»Row* checkAndAdd(«table.name»Row* x, bool skipCheckUniqueness=false) ;
		
		
		/**
		 * Brutally append an «table.name»Row x to the collection of rows already stored in this table. No uniqueness check is done !
		 *
		 * @param «table.name»Row* x a pointer onto the «table.name»Row to be appended.
		 */
		 void append(«table.name»Row* x) ;
		 
		/**
		 * Brutally append an «table.name»Row x to the collection of rows already stored in this table. No uniqueness check is done !
		 *
		 * @param «table.name»Row* x a pointer onto the «table.name»Row to be appended.
		 */
		 void addWithoutCheckingUnique(«table.name»Row* x) ;
		 
		 
	«IF table.isTemporal»
		«IF table.TemporalAttribute.JavaType.equals("ArrayTimeInterval")»
		«/* The temporal attribute is an ArrayTimeInterval */»
		/**
		 * Insert a «table.name»Row* in a vector of «table.name»Row* so that it's ordered by ascending time.
		 *
		 * @param «table.name»Row* x . The pointer to be inserted.
		 * @param vector <«table.name»Row*>& row . A reference to the vector where to insert x.
		 *
		 */
		 «table.name»Row * insertByStartTime(«table.name»Row* x, std::vector<«table.name»Row* >& row);
		 «ELSEIF table.TemporalAttribute.JavaType.equals("ArrayTime")»
		 «/* The temporal attribute is an ArrayTime» */»
		/**
		 * Insert a «table.name»Row* in a vector of «table.name»Row* so that it's ordered by ascending time.
		 *
		 * @param «table.name»Row* x . The pointer to be inserted.
		 * @param vector <«table.name»Row*>& row . A reference to the vector where to insert x.
		 *
		 */
	 	«table.name»Row * insertByTime(«table.name»Row* x, std::vector<«table.name»Row *>&row );
	 	«ENDIF» 
	«ENDIF»
	
	// A data structure to store the pointers on the table's rows.
	
	// In all cases we maintain a private vector of «table.name»Row s.
	   std::vector<«table.name»Row * > privateRows;
		
		
		
	«IF !table.isTemporal »
		«/* This is not a temporal ASDM entity*/»		
		std::vector<«table.name»Row *> row;
	«ELSE»
		«/* This is a temporal ASDM entity*/»
	
		«IF table.NoAutoIncrementableAttribute»
			«/* There is no autoincrementable attribute*/»
			«IF table.keyNoAutoIncNoTimeAttributes.size != 0»
				«/* The key section contains other attributes than the temporal one*/»
				typedef std::vector <«table.name»Row* > TIME_ROWS;
				std::map<std::string, TIME_ROWS > context;
					
				/** 
				 * Returns a string built by concatenating the ascii representation of the
				 * parameters values suffixed with a "_" character.
				 */
				 std::string Key(«table.KeyNoAutoIncNoTimeCpp») ;
			«ELSE»
				«/* The key section contains only the temporal attribute*/»
				std::vector <«table.name»Row *> row;
			«ENDIF» 
		«ELSE»
			«/* The key section contains an autoincrementable attribute*/»
			«IF table.keyNoAutoIncNoTimeAttributes.size != 0»
				«/* The key section contains other attributes than the autoincrementable and the temporal ones*/»
				typedef std::vector <std::vector <«table.name»Row* > > ID_TIME_ROWS;
				std::map<std::string, ID_TIME_ROWS > context;
				
				/** 
				 * Returns a string built by concatenating the ascii representation of the
				 * parameters values suffixed with a "_" character.
				 */
				std::string Key(«table.KeyNoAutoIncNoTimeCpp»);
		 	«ELSE»
				«/*The key section contains NO other attributes than the autoincrementable and the temporal ones*/»
		 	«ENDIF»
		«ENDIF»	
		
		«IF table.keyNoAutoIncNoTimeAttributes.size != 0»
			/**
			 * Fills the vector vout (passed by reference) with pointers on elements of vin 
			 * whose attributes are equal to the corresponding parameters of the method.
			 *
			 */
			void getByKeyNoAutoIncNoTime(std::vector <«table.name»Row*>& vin, std::vector <«table.name»Row*>& vout,  «table.KeyNoAutoIncNoTimeCpp»);
		«ENDIF»
	«ENDIF»
	
		void error() ; //throw(ConversionException);
		
		/**
		 * Populate this table from the content of a XML document that is required to
		 * be conform to the XML schema defined for a «table.name» («table.name»Table.xsd).
		 * @throws ConversionException
		 * 
		 */
		void fromXML(std::string& xmlDoc) ;
		
		std::map<std::string, BinaryAttributeReaderFunctor *> unknownAttributes2Functors;
	
		/**
		  * Private methods involved during the build of this table out of the content
		  * of file(s) containing an external representation of a «table.name» table.
		  */
		void setFromMIMEFile(const std::string& directory);
		/*
		void openMIMEFile(const std::string& directory);
		*/
		void setFromXMLFile(const std::string& directory);
	
	
		/**
		 * Serialize this into a stream of bytes and encapsulates that stream into a MIME message.
		 * @returns a string containing the MIME message.
		 *
		 * @param byteOrder a const pointer to a static instance of the class ByteOrder.
		 * 
		 */
		std::string toMIME(const asdm::ByteOrder* byteOrder=asdm::ByteOrder::Machine_Endianity);
		
		
		
	 	/** 
	     * Extracts the binary part of a MIME message and deserialize its content
		 * to fill this with the result of the deserialization. 
		 * @param mimeMsg the string containing the MIME message.
		 * @throws ConversionException
		 */
		 void setFromMIME(const std::string & mimeMsg);
		
		/**
		  * Private methods involved during the export of this table into disk file(s).
		  */
		std::string MIMEXMLPart(const asdm::ByteOrder* byteOrder=asdm::ByteOrder::Machine_Endianity);
		
		/**
		  * Stores a representation (binary or XML) of this table into a file.
		  *
		  * Depending on the boolean value of its private field fileAsBin a binary serialization  of this (fileAsBin==true)  
		  * will be saved in a file "«table.name».bin" or an XML representation (fileAsBin==false) will be saved in a file "«table.name».xml".
		  * The file is always written in a directory whose name is passed as a parameter.
		 * @param directory The name of directory  where the file containing the table's representation will be saved.
		  * 
		  */
		  void toFile(std::string directory);
		  
		  /**
		   * Load the table in memory if necessary.
		   */
		  bool loadInProgress;
		  void checkPresenceInMemory() {
			if (!presentInMemory && !loadInProgress) {
				loadInProgress = true;
				setFromFile(getContainer().getDirectory());
				presentInMemory = true;
				loadInProgress = false;
		  	}
		  }
		/**
		 * Reads and parses a file containing a representation of a «table.name»Table as those produced  by the toFile method.
		 * This table is populated with the result of the parsing.
		 * @param directory The name of the directory containing the file te be read and parsed.
		 * @throws ConversionException If any error occurs while reading the 
		 * files in the directory or parsing them.
		 *
		 */
		 void setFromFile(const std::string& directory);
		
	};
		
		
	} // End namespace asdm
	
	#endif /* «table.name»Table_CLASS */
	
	'''
}