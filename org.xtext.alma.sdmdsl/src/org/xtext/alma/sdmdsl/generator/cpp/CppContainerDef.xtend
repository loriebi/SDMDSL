package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppContainerDef{
	
	var container = AlmaTableContainer.getInstance();
	
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		// creating and generating CPP container file ASDM.h
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		sdmFsa.setFile("include/" + container.name + ".h")
		sdmFsa.generateFile(generateCppContainerDef)
	}
	
	
	
	
	def generateCppContainerDef()'''
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
		 * File «container.name».h
		 */
		 
		#ifndef «container.name»_CLASS
		#define «container.name»_CLASS
		
		#include <vector>
		#include <map>
		
		#include <Representable.h>
		#include <Entity.h>
		#include <EntityId.h>
		#include <ArrayTime.h>
		#include <IllegalAccessException.h>
		#include <InvalidArgumentException.h>
		
		#include <Misc.h>
		
		#ifndef WITHOUT_ACS
		#include <asdmIDLC.h> /// <-------------------
		//using namespace asdmIDL;   /// <-------------------
		#endif
		
		
		/*\file «container.name+".h"»
		    \brief Generated from model's revision "«AlmaTableContainer.revision»", branch "«AlmaTableContainer.branch»"
		*/

		namespace asdm {
			
			«FOR table : container.tables»
				//class asdm::«table.name»Table;
				class «table.name»Table;
			«ENDFOR»
			
			/**
			 * The «container.name» class is the container for all tables.  Its instantation
			 * creates a complete set of tables.
			 *
			 * 
			 * Generated from model's revision "«AlmaTableContainer.revision»", branch "«AlmaTableContainer.branch»"
			 */
			//class «container.name» : public Representable {
			class «container.name» {
			
			public:
				/**
				 * Constructs an empty «container.name».
				 */
				«container.name» ();
				
				virtual ~«container.name» ();
				
				«FOR table : container.tables »
					/**
					 * Get the table «table.name».
					 * @return The table «table.name» as a «table.name»Table.
					 */
					«table.name»Table & get«table.name» () const;
				«ENDFOR»
				
				/**
				 * Produces the XML representation of * this.
				 * @return a string containing the XML representation of this.
				 * @throws ConversionException.
				 */
				virtual std::string toXML();
				
				
				/**
				 * Write this «container.name» dataset to the specified directory
				 * as a collection of XML documents. 
				 * @param directory The directory to which this dataset is written.
				 * @throws ConversionException If any error occurs in converting the
				 * table to XML and writing it to the directory.  This method will
				 * not overwrite any existing file; a ConversionException is also
				 * thrown in this case.
				 */
				void toXML(std::string directory) ;
				
				
				/**
				 * Get an ASDM dataset, given the full path name of the 
				 * directory containing the XML version of the dataset.
				 * @param xmlDirectory The full path name of the directory
				 * containing this dataset.
				 * @return The complete dataset that belongs to the container
				 * in this directory.
				 * @throws ConversionException If any error occurs reading the 
				 * files in the directory or in converting the tables from XML.
				 */
				virtual void fromXML(std::string xml) ;
				
				
				/**
				 * Get an «container.name» dataset, given the full path name of the 
				 * directory containing the XML version of the dataset.
				 * @param xmlDirectory The full path name of the directory
				 * containing this dataset.
				 * @return The complete dataset that belongs to the container
				 * in this directory.
				 * @throws ConversionException If any error occurs reading the 
				 * files in the directory or in converting the tables from XML.
				 *
				 * @deprecated
				 */
				static «container.name» *getFromXML(std::string xmlDirectory) ;
				
				
				/**
				 * Serialize this into a stream of bytes and encapsulates that stream into a MIME message.
				 * @returns a string containing the MIME message.
				 * 
				 */
				std::string toMIME();
				
				
				/**
				 * Extracts the binary part of a MIME message and deserialize its content
				 * to fill this with the result of the deserialization. 
				 * @param mimeMsg the string containing the MIME message.
				 * @throws ConversionException
				 */
				void setFromMIME(const std::string & );
				
				
				/**
				 * Write this «container.name» dataset to the specified directory
				 * as a collection of files.
				 *
				 * The container itself is written into an XML file. Each table of the container
				 * having at least one row is written into a binary or an XML file depending on
				 * the value of its "fileAsBin" private field.
				 * 
				 * @param directory The directory to which this dataset is written.
				 * @throws ConversionException If any error occurs in converting the
				 * container or any of its table.  This method will
				 * not overwrite any existing file; a ConversionException is also
				 * thrown in this case.
				 */
				void toFile(std::string directory);
				
				
				/**
				 * Constructs totally or partially an ASDM dataset from its representation on disk.
				 *
				 * Reads and parses a file («container.name».xml) containing the top level element of an ASDM.
				 * Depending on the value of the boolean parameter loadTablesOnDemand the files containing the tables of
				 * of the dataset are parsed to populate the dataset in memory immediately (false) or only when an application tries
				 * to retrieve values from these tables (true).
				 *
				 * @param directory the name of the directory containing the files.
				 * @param loadTablesOnDemand the tables are read and parsed immediately (false) or only when necessary (true).
				 * @throws ConversionException If any error occurs while reading the 
				 * files in the directory or parsing them.
				 *
				 */	
				 void setFromFile(std::string directory, bool loadTablesOnDemand);
				 
				/**
				 * Constructs an ASDM dataset from its representation on disk.
				 *
				 * Reads and parses a file («container.name».xml) containing the top level element of an ASDM and then the files
				 * containing the representation on disk of the dataset's tables. On exit the dataset contains 
				 * all its tables in memory.
				 *
				 * <b>Backward compatibility.</b> This method presents some level of backward compatibility in the sense that it does its best to check if the dataset needs to be
				 * transformed on the fly to the currently defined format prior being parsed and converted to its in memory representation. In order to do that it may need 
				 * to find the version information of the dataset and possibly its origin (i.e. which telescope has created it). Based on these informations it decides if
				 * if a transformation has to be applied on the fly or if the dataset can be processed as is.
				 *
				 * <b>Helping backward compatibility</b> It may happen though that the algorithm which searches the dataset for its version information and its origin fails, while the user knows
				 * that his/her dataset can be parsed. Then the method's behaviour can be controlled by using the second (and optional) argument <code>parse</code> which has 
				 * to be an instance of ASDMParseOptions. See below the description of this argument to undersand how to use it.
				 *
				 * @param directory the name of the directory containing the files.
				 * @param parse an instance of ASDMParseOptions which can be used to tailor the behaviour of the method. Please read the definition of ASDMParseOptions to
				 * see how the logic of the method can be controlled. Most of the time it wont be necessary to specify this argument hence the fact it's optional. The typical 
				 * cases when one may have to use this argument are :
				 * <ul>
				 * <li> The version information cannot be derived from the content of the ASDM and you want to force the method to consider its format as the most recent one or the older one. 
				 * In such a case present an ASDMParseOptions instance onto which you have applied <code>.asV3()</code> or <code>.asV2()</code></li>. 
				 *
				 * <li> The origin of the data cannot be retrieved from the content of the ASDM; this happens when the dataset has not ExecbBlock table. Then one can help the method 
				 * by providing an instance of ASDMParseOptions onto which one of <code>.asALMA()</code>, <code>.asIRAM_PDB()</code>, <code>.asEVLA()</code> has been applied.</li>
				 *
				 * <li> One wants to control if all the tables of the dataset must be parsed and put into memory during the execution of the method or if one prefers to load them on 
				 * on demand (i.e. a table is loaded in memory only the first time it's referred by the code.). One will present an instance of ASDMParseOptions onto which <code>.loadTablesOnDemand(b)</code>
				 * hase been called where <code>b</code> is boolean value interpreted as follows :  <code>true</code> <->"load on demand" and <code>false</code> <-> "load the tables immediately." </li>
				 * </ul>
				 * @throws ConversionException If any error occurs while reading the 
				 * files in the directory or parsing them.
				 *
				 */	
				 void setFromFile(std::string directory, const ASDMParseOptions&  parse=ASDMParseOptions());
				 
				 /**
				  * Returns a boolean value indicating if a control of the uniqueness of each row of each table is done during the execution
				  * of the method setFromFile.
				  *
				  * @return a bool.
				  *
				  * see the documentation of ASDMParseOptions about how to set this parameter. 
				  */
				  bool checkRowUniqueness() const ;
				
				#ifndef WITHOUT_ACS
					/**
					  * Converts this «container.name» into an «container.name»DataSetIDL CORBA structure
					  * @return a pointer to a «container.name»DataSetIDL.
					  */
					virtual asdmIDL::ASDMDataSetIDL* toIDL();  	
					
					/**
					 * Builds an «container.name» out of its IDL representation.
					 * @param x the IDL representation of the «container.name»
					 *
					 * @throws DuplicateKey 
					 * @throws ConversionException
					 * @throws UniquenessViolationException
					 */
					virtual void fromIDL(asdmIDL::ASDMDataSetIDL* x); 
				#endif
				
				virtual Entity getEntity() const;
			
				virtual void setEntity(Entity e);
				
				/**
				 * Meaningless, but required for the Representable interface.
				 */
				virtual std::string getName() const;
				
				/**
				 * Meaningless, but required for the Representable interface.
				 */
				virtual unsigned int size() ;
				
				#ifndef WITHOUT_ACS
					/**
					 * Create an «container.name» dataset from the ALMA archive, given the
					 * entityId of its container.
					 * @param datasetId The entityId of the container of the dataset.
					 * @throws ConversionException
					 */
					static «container.name» *fromArchive(EntityId datasetId) ;
				#endif
				
				#ifndef WITHOUT_ACS
					/**
					 * Update an «container.name» dataset that already exists in the ALMA archive.
					 * @throws ConversionException
					 */
					void updateArchive() const ;
				#endif
				
				
				/**
				 * Return the table, as a Representable object, with the
				 * specified name.
				 * @throws InvalidArgumentException
				 */
				Representable &getTable(std::string tableName) ;
				
				
				// ===> Attribute timeOfCreation
				
				
			 	/**
			 	 * Get timeOfCreation.
			 	 * @return timeOfCreation as ArrayTime
			 	 */
			 	ArrayTime getTimeOfCreation() const;
				
			 
			 	
			 	
			 	/**
			 	 * Set timeOfCreation with the specified ArrayTime.
			 	 * @param timeOfCreation The ArrayTime value to which timeOfCreation is to be set.
			 	 
			 		
			 			
			 	 */
			 	void setTimeOfCreation (ArrayTime timeOfCreation);
			  		
				
				
				
			
			
				
				// ===> Attribute version
				
				
				
			
				
			 	/**
			 	 * Get version.
			 	 * @return version as int
			 	 */
			 	int getVersion() const;
				
			 
			 	
			 	
			 	/**
			 	 * Set version with the specified int.
			 	 * @param version The int value to which version is to be set.
			 	 
			 		
			 			
			 	 */
			 	void setVersion (int version);
			  		
				
				
				
			
			
				
				// ===> Attribute xmlnsPrefix
				
				
				
			
				
			 	/**
			 	 * Get xmlnsPrefix.
			 	 * @return xmlnsPrefix as string
			 	 */
			 	string getXmlnsPrefix() const;
				
			 
			 	
			 	
			 	/**
			 	 * Set xmlnsPrefix with the specified string.
			 	 * @param xmlnsPrefix The string value to which xmlnsPrefix is to be set.
			 	 
			 		
			 			
			 	 */
			 	void setXmlnsPrefix (string xmlnsPrefix);
			
				/**
				 *  \enum Origin
				 *
				 *  \brief This enumeration lists the different possible origins for an ASDM present in memory. 
				 */
				enum Origin {
					FILE,  ///< The dataset has been constructed from its representation on disk. 
					ARCHIVE, ///< The dataset has been constructed from its representation in the Archive. 
					EX_NIHILO ///< The dataset has been constructed ex nihilo.
				};
				
				/**
				 * Returns the origin of the dataset in memory.
				 *
				 * @return an «container.name»::Origin value.
				 */
				 Origin getOrigin() const ;
				 
				 /**
				  * Returns the ASDM's directory.
				  * 
				  * @return a string containing path to the directory containing the external representation of the ASDM
				  * if it has been constructed from this representation or an empty string if it has been
				  * constructed ex nihilo.
				  */
				 std::string getDirectory() const ;
				 
				 XSLTransformer & getXSLTransformer() ;
			private:
			
				bool archiveAsBin; // If true archive binary else archive XML
				bool fileAsBin ; // If true file binary else file XML		
				bool hasBeenAdded;
				Origin origin;
				bool loadTablesOnDemand_;  // For a dataset which is stored on disk, convert and load in memory only the tables which are used by the code the first time they are referred to.
				bool checkRowUniqueness_;  // For a dataset which is stored on disk, when a table is converted and loaded in memory verify (true) or not (false) the fact that each row is unique.
				std::string directory_;    // The directory where the ASDM has been read. (left empty if the ASDM is only in memory)
				
				«FOR almaTable : container.tables »
					/**
					 * The table «almaTable.name»
					 */
					«almaTable.name»Table * «almaTable.LowerCase»;
				«ENDFOR»
				
				/**
				 * The list of tables as Representable.
				 */
				std::vector<Representable *> table;
				
				/**
				 * The list of Entity objects representing the tables.
				 */
				//vector<Entity *> tableEntity;
				std::map<std::string, Entity> tableEntity;
				
				/**
				 * This Container's entity.
				 */
				Entity entity;
				
				
				// ===> Attribute timeOfCreation
				ArrayTime timeOfCreation;
			

				
				// ===> Attribute version
				int version;
			

			
				
				// ===> Attribute xmlnsPrefix
				string xmlnsPrefix;
				
			
				void error() ; // throw(ConversionException);
				static std::string getXMLEntity(EntityId); // throw(ConversionException);
				static void putXMLEntity(std::string); // throw(ConversionException);
				
				XSLTransformer xslTransformer;
			};
			
		} // End namespace asdm
		#endif /* «container.name»_CLASS */
	'''
	
}