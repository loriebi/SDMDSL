package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppContainerImpl {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context){
		// creating and generating CPP container file ASDM.cpp
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		sdmFsa.setFile("src/" + container.name + ".cpp")
		sdmFsa.generateFile(generateCppContainerImpl)
	}
	
	
	def generateCppContainerImpl()'''
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
		 * File «container.name».cpp
		 */
		 
		#include <«container.name».h>
		«FOR table : container.tables »
			#include <«table.name»Table.h>
		«ENDFOR»
		
		using asdm::«container.name»;
		«FOR table : container.tables »
			using asdm::«table.name»Table;
		«ENDFOR»
		
		#include <Parser.h>
		#include <ConversionException.h>
		
		using asdm::ConversionException;
		using asdm::Parser;
		
		#include <iostream>
		#include <fstream>
		#include <time.h>
		
		//#ifdef WITHOUT_ACS
		#include <sys/stat.h>
		#include <sys/types.h>
		#include <dirent.h>
		//#endif
		
		#include <Misc.h>
		using namespace asdm;
		using namespace std;
		
		namespace asdm { 
			
			«container.name»::Origin «container.name»::getOrigin() const { return origin ; }
				
			string «container.name»::getDirectory() const { return directory_ ; }
				
			XSLTransformer & «container.name»::getXSLTransformer() { return xslTransformer; }
			
			
			/**
			 * Create an instance of the tables that belong to this model.
			 */
			«container.name»::«container.name» () {
				Entity emptyEntity;
				«FOR table : container.tables »
					«table.LowerCase» = new «table.name»Table (*this);
					table.push_back(«table.LowerCase»);
					tableEntity["«table.name»"] = emptyEntity;
				«ENDFOR»
				//for (unsigned int i = 0; i < table.size(); ++i)
				//	tableEntity.push_back(new Entity ());
					
				// Define a default entity.		
				entity.setEntityId(EntityId("uid://X0/X0/X0"));
				entity.setEntityIdEncrypted("na");
				entity.setEntityTypeName("«container.name»");
				entity.setEntityVersion("1");
				entity.setInstanceVersion("1");	
				
				
				// Define a default creation time : now.
				time_t rawtime;
				time(&rawtime);
				struct tm* timeInfo = localtime(&rawtime);		
				//setTimeOfCreation(ArrayTime((1900+timeInfo->tm_year), (timeInfo->tm_mon+1), timeInfo->tm_mday, timeInfo->tm_hour, timeInfo->tm_min, (double) timeInfo->tm_sec));
				timeOfCreation = ArrayTime((1900+timeInfo->tm_year), (timeInfo->tm_mon+1), timeInfo->tm_mday, timeInfo->tm_hour, timeInfo->tm_min, (double) timeInfo->tm_sec);
				// Archive binary or XML
				archiveAsBin = false;
				
				// File binary or XML
				fileAsBin = false;			
				
				// Set imperatively to false
				hasBeenAdded = false;
				
				// So far it's created ex nihilo.
				origin = EX_NIHILO;
				loadTablesOnDemand_ = false;
				checkRowUniqueness_ = true;
			}
			
			«container.name»::~«container.name» () {
				for (unsigned int i = 0; i < table.size(); ++i) {
					delete table[i];
					//delete tableEntity[i];
				}
			}
			
			«FOR table : container.tables »
				/**
				 * Get the table «table.name».
				 * @return The table «table.name» as a «table.name»Table.
				 */
				«table.name»Table & «container.name»::get«table.name» () const {
					return *«table.LowerCase»;
				}
			«ENDFOR»
			
			«toXML»
			
			«fromXML»
			
			#ifndef WITHOUT_ACS
				using namespace asdmIDL;
			#endif
			
			#ifndef WITHOUT_ACS	
				ASDMDataSetIDL* ASDM::toIDL() {
					ASDMDataSetIDL* result = new ASDMDataSetIDL();
					«FOR table : container.tables »
						result->«table.LowerCase» = *(this->«table.LowerCase»->toIDL());
					«ENDFOR»
					return result;	
				}
				
				void ASDM::fromIDL(ASDMDataSetIDL* x) {
					«FOR table : container.tables »
						this->«table.LowerCase»->fromIDL(x->«table.LowerCase»);
					«ENDFOR»
				}
			#endif
			
			
			/**
			 * Write this «container.name» dataset to the specified directory
			 * as a collection of XML documents. 
			 * @param directory The directory to which this dataset is written.
			 * @throws ConversionException If any error occurs in converting the
			 * table to XML and writing it to the directory.  This method will
			 * not overwrite any existing file; a ConversionException is also
			 * thrown in this case.
			 */
			void «container.name»::toXML(string directory) {
			
				if (!directoryExists(directory.c_str()) &&
					!createPath(directory.c_str())) {
					throw ConversionException("Could not create directory " , directory);
				}
				
				/*
				if (mkdir(directory.c_str(), S_IRWXU) == -1) 
					throw ConversionException("Could not create directory ", directory);
				*/
					
				string containername = directory + "/«container.name».xml";
				ofstream out(containername.c_str(),ios::out|ios::trunc);
				if (out.rdstate() == ostream::failbit)
					throw ConversionException("Could not open file " + containername + " for writing","«container.name»");
				out << toXML() << endl;
				out.close();
				if (out.rdstate() == ostream::failbit)
					throw ConversionException("Could not close file " + containername,"«container.name»");
				for (unsigned int i = 0; i < table.size(); ++i) {
					if (table[i]->size() == 0)
						continue; // Skip any empty table.
					string tablename = directory + "/" + table[i]->getName() + ".xml";
					ofstream tableout(tablename.c_str(),ios::out|ios::trunc);
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not open file " + tablename + " for writing",table[i]->getName());
					tableout << table[i]->toXML() << endl;
					tableout.close();
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not close file " + tablename,table[i]->getName());
				}	
			}
			
			/**
			 * Get an «container.name» dataset, given the full path name of the 
			 * directory containing the XML version of the dataset.
			 * @param xmlDirectory The full path name of the directory
			 * containing this dataset.
			 * @return The complete dataset that belongs to the container
			 * in this directory.
			 * @throws ConversionException If any error occurs reading the 
			 * files in the directory or in converting the tables from XML.
			 */
			«container.name» *«container.name»::getFromXML(string xmlDirectory)  {
				string containername = xmlDirectory + "/«container.name».xml";
				ifstream in(containername.c_str(),ios::in);
				if (in.rdstate() == istream::failbit)
					throw ConversionException("Could not open file " + containername + " for reading","«container.name»");
				string xmlDoc;
				const int SIZE = 4096*1024;
				char line[SIZE];
				while (in.getline(line,SIZE)) {
					if (in.rdstate() == istream::failbit || in.rdstate() == istream::badbit) {
						throw ConversionException("Error reading file " + containername,"«container.name»");
					};
					xmlDoc.append(line);
				}
				in.close();
				if (in.rdstate() == istream::failbit)
					throw ConversionException("Could not close file " + containername,"«container.name»");
				«container.name» *dataset = new «container.name» ();
				dataset->fromXML(xmlDoc);
				// Now, do each table.
				int BLOCKSIZE = 1000000;
				char c[BLOCKSIZE];
				Entity entity;
				
				«FOR table : container.tables»
					entity = dataset->tableEntity["«table.name»"];
					if (entity.getEntityId().getId().length()  != 0) {
						// Which file must we read ?
						string tablename = xmlDirectory + "/«table.name».xml";
						
						// Determine the file size
						ifstream::pos_type size;	
						ifstream tablein (tablename.c_str() , ios::in|ios::binary|ios::ate);
						if (tablein.is_open()) {
							size = tablein.tellg();
						}
						else {
							throw ConversionException("Could not open file " + tablename, "«table.name»");
						}
						
						// Read the file in a string
						string tableDoc;
						
						tableDoc.reserve(size);
						tablein.seekg (0);	
						int nread = BLOCKSIZE;	
						while (nread == BLOCKSIZE) {
							tablein.read(c, BLOCKSIZE);
							if (tablein.rdstate() == istream::failbit || tablein.rdstate() == istream::badbit) {
								throw ConversionException("Error reading file " + tablename,"«container.name»");
							}
							nread = tablein.gcount();
							tableDoc.append(c, nread);
						}
						tablein.close();
						if (tablein.rdstate() == istream::failbit)
							throw ConversionException("Could not close file " + tablename,"«container.name»");
						
						// And finally parse the XML document to populate the table.
						dataset->get«table.name»().fromXML(tableDoc);
					}
				«ENDFOR»
				
				return dataset;
			}
			
			string «container.name»::toMIME() {
				// To be implemented
				return "";
				;
			}
			
			void «container.name»::setFromMIME(const string & ) {
				// To be implemented
				;
			}
			
			«toFile»
			
			«setFromFile»
			
			Entity «container.name»::getEntity() const {
				return entity;
			}
		
			void «container.name»::setEntity(Entity e) {
				this->entity = e; 
			}
			
			/**
			 * Meaningless, but required for the Representable interface.
			 */
			string «container.name»::getName() const {
				return "";
			}
			
			/**
			 * Meaningless, but required for the Representable interface.
			 */
			unsigned int «container.name»::size()  {
				return 0;
			}
			
			#ifndef WITHOUT_ACS
				/**
				 * Create an «container.name» dataset from the ALMA archive, given the
				 * entityId of its container.
				 * @param datasetId The entityId of the container of the dataset.
				 */
				«container.name» *«container.name»::fromArchive(EntityId datasetId) {
					// Get the xml representation of the container.
					string xml = getXMLEntity(datasetId);
					// Create the container ...
					«container.name» *container = new «container.name» ();
					// ... and populate it with data.
					container->fromXML(xml);
					
					// Now build the tables.
					Entity entity;
					«FOR table : container.tables»	
						entity = container->tableEntity["«table.name»"];
						if (entity.getEntityId().getId().size() != 0) {
							container->get«table.name»().setEntity(entity);
							xml = getXMLEntity(entity.getEntityId());
							container->get«table.name»().fromXML(xml);
						}
					«ENDFOR»
					return container;
				}
			#endif
			
			#ifndef WITHOUT_ACS
				/**
				 * Update an «container.name» dataset that already exists in the ALMA archive.
				 */
				void «container.name»::updateArchive() const{
					// Assumption: Entity objects have already been assigned.
					// Convert each table to an XML document and write it to the archive.
					for (unsigned int i = 0; i < table.size(); ++i) {
						string xml = table[i]->toXML();
						putXMLEntity(xml);
					}
					// Now, convert the container and write it to the archive.
					string xml = toXML();
					putXMLEntity(xml);
				}
			#endif
			
			/**
			 * Return the table, as a Representable object, with the
			 * specified name.
			 */
			Representable &«container.name»::getTable(string tableName)  {
				for (unsigned int i = 0; i < table.size(); ++i)
					if (table[i]->getName() == tableName)
						return *table[i];
				throw InvalidArgumentException("No such table as " + tableName);
			}
			
			
			
			/**
		 	 * Get timeOfCreation.
		 	 * @return timeOfCreation as ArrayTime
		 	 */
		 	ArrayTime ASDM::getTimeOfCreation() const {
			
		  		return timeOfCreation;
		 	}
		
		 	/**
		 	 * Set timeOfCreation with the specified ArrayTime.
		 	 * @param timeOfCreation The ArrayTime value to which timeOfCreation is to be set.
		 	 */
		 	void ASDM::setTimeOfCreation (ArrayTime timeOfCreation)  {
		  	
		  	
		  		if (hasBeenAdded) {
		 		
		  		}
		  	
		 		this->timeOfCreation = timeOfCreation;
			
		 	}
			
			
			
		 	/**
		 	 * Get version.
		 	 * @return version as int
		 	 */
		 	int ASDM::getVersion() const {
			
		  		return version;
		 	}
		
		 	/**
		 	 * Set version with the specified int.
		 	 * @param version The int value to which version is to be set.
		 	 */
		 	void ASDM::setVersion (int version)  {
		  	
		  	
		  		if (hasBeenAdded) {
		 		
		  		}
		  	
		 		this->version = version;
			
		 	}
			

		 	/**
		 	 * Get xmlnsPrefix.
		 	 * @return xmlnsPrefix as string
		 	 */
		 	string ASDM::getXmlnsPrefix() const {
			
		  		return xmlnsPrefix;
		 	}
		
		 	/**
		 	 * Set xmlnsPrefix with the specified string.
		 	 * @param xmlnsPrefix The string value to which xmlnsPrefix is to be set.
		 	 */
		 	void ASDM::setXmlnsPrefix (string xmlnsPrefix)  {
		  	
		  	
		  		if (hasBeenAdded) {
		 		
		  		}
		  	
		 		this->xmlnsPrefix = xmlnsPrefix;
			
		 	}
		 	
		 	void «container.name»::error() {
		 		throw ConversionException("Invalid xml document","«container.name»");
		 	}
		 	
		 	string «container.name»::getXMLEntity(EntityId) {
		 		throw ConversionException("Not implemented","«container.name»");
		 	}
		 	
		 	void «container.name»::putXMLEntity(string) {
		 		throw ConversionException("Not implemented","«container.name»");
		 	}
		} // End namespace asdm
	'''
	
	
	
	def toXML()'''
		string «container.name»::toXML()   {
			string out;
			out.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> ");
			out.append("<«container.name» xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:«container.xmlnsPrefix»=\"http://Alma/XASDM/ASDM\" xsi:schemaLocation=\"http://Alma/XASDM/«container.name» http://almaobservatory.org/XML/XASDM/«container.version»/«container.name».xsd\" schemaVersion=\"«container.version»\" schemaRevision=\"«AlmaTableContainer.revision»\"> ");

			if (entity.isNull())
				throw ConversionException("Container entity cannot be null.","Container");
			out.append(entity.toXML());
			out.append(" ");
			out.append("<TimeOfCreation> ");
			out.append(timeOfCreation.toFITS());
			out.append(" ");
			out.append("</TimeOfCreation>");
			for (unsigned int i = 0; i < table.size(); ++i) {
				out.append("<Table> ");
				out.append("<Name> ");
				out.append(table[i]->getName());
				out.append(" ");
				out.append("</Name> ");
				out.append("<NumberRows> ");
				out.append(Integer::toString(table[i]->size()));
				out.append(" ");
				out.append("</NumberRows> ");
				if (table[i]->size() > 0) {
					if (table[i]->getEntity().isNull())
						throw ConversionException("Table entity is null.",table[i]->getName());
					out.append(table[i]->getEntity().toXML());
				}
				out.append(" ");
				out.append("</Table> ");
			}
			out.append("</«container.name»>");
			return out;
		}
	'''
	
	
	def fromXML()'''
		void «container.name»::fromXML(string xmlDoc)  {
			Parser xml(xmlDoc);
			if (!xml.isStr("<«container.name»")) 
				error();
			string s = xml.getElement("<Entity","/>");
			if (s.length() == 0) 
				error();
			Entity e;
			e.setFromXML(s);
			if (e.getEntityTypeName() != "«container.name»")
				error();
			setEntity(e);
			
			s = xml.getElementContent("<TimeOfCreation>","</TimeOfCreation>");
			if (s.length() == 0) 
				error();
			ArrayTime t(s);
			//setTimeOfCreation(t);
			timeOfCreation = t;
			
			// Do we have an element startTimeDurationInXML
			s = xml.getElement("<startTimeDurationInXML","/>");
			if (s.length() != 0) 
				ArrayTimeInterval::readStartTimeDurationInXML(true);
			else 
				ArrayTimeInterval::readStartTimeDurationInXML(false);
				
			// Do we have an element startTimeDurationInBin
			s = xml.getElement("<startTimeDurationInBin","/>");
			if (s.length() != 0) 
				ArrayTimeInterval::readStartTimeDurationInBin(true);
			else 
				ArrayTimeInterval::readStartTimeDurationInBin(false);
				
			// Get each table in the dataset.
			s = xml.getElementContent("<Table>","</Table>");
			while (s.length() != 0) {
				Parser tab(s);
				s = tab.getElementContent("<Name>","</Name>");
				if (s.length() == 0) 
					error();
				string tableName = s;
				s = tab.getElementContent("<NumberRows>","</NumberRows>");
				if (s.length() == 0) 
					error();
				int numberRows = 0;
				try {
					numberRows = Integer::parseInt(s);
					getTable(tableName).declaredSize = numberRows;
				    if (numberRows > 0 ) {
					   s = tab.getElementContent("<Entity","/>");
					   if (s.length() == 0) 
						 error();
					   Entity tabE;
					   tabE.setFromXML(s);
					   if (tabE.getEntityTypeName() != (tableName + "Table"))
						 error();
					   tableEntity[tableName] = tabE;
					}
				} 
				catch (NumberFormatException err) {
					error(); // Expected to happen while parsing the number of rows.
				}
				catch (InvalidArgumentException err) {
			      ; // This happens when the name of a table which is not recognized by this
				    // version of the software. Then we simply ignore it !
				}
				s = xml.getElementContent("<Table>","</Table>");
			}
			if (!xml.isStr("</«container.name»>")) 
				error();	
		}
	'''
	
	def toFile()'''
		void «container.name»::toFile(string directory) {
			if (!directoryExists(directory.c_str()) &&
					!createPath(directory.c_str())) {
					throw ConversionException("Could not create directory " , directory);
				}
		
				// Firstly send the container to its file.		
				if (fileAsBin) {
					// write the bin serialized
					string fileName = directory + "/«container.name».bin";
					ofstream tableout(fileName.c_str(),ios::out|ios::trunc);
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not open file " + fileName, "«container.name»");
					tableout << toMIME() << endl;
					tableout.close();
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not close file " + fileName, "«container.name»");		
				}			
				else {
					// write the XML
					string fileName = directory + "/«container.name».xml";
					ofstream tableout(fileName.c_str(),ios::out|ios::trunc);
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not open file " + fileName , "«container.name»");
					tableout << toXML() << endl;
					tableout.close();
					if (tableout.rdstate() == ostream::failbit)
						throw ConversionException("Could not close file " + fileName, "«container.name»");		
				}
				
				// Then send each of its table to its own file.
				«FOR table : container.tables»
					if (get«table.name»().size() > 0) {
						get«table.name»().toFile(directory);
					}
				«ENDFOR»
		}
	'''
	
	def setFromFile()'''
		void «container.name»::setFromFile(string directory, bool loadTablesOnDemand) {
			this->setFromFile(directory, ASDMParseOptions().loadTablesOnDemand(loadTablesOnDemand));
		}
		
		void «container.name»::setFromFile(string directory, const ASDMParseOptions& parse) {
			this->loadTablesOnDemand_ = parse.loadTablesOnDemand_;
			this->checkRowUniqueness_ = parse.checkRowUniqueness_;
			this->directory_          = directory;
			string fileName;
			if (fileAsBin) {
				fileName = directory + "/«container.name».bin";
				// Determine the file size.
				ifstream::pos_type size;
				ifstream theFile(fileName.c_str(), ios::in|ios::binary|ios::ate);
		
		 		if (theFile.is_open()) { 
		  			size = theFile.tellg(); 
		  		}
				else {
					throw ConversionException("Could not open file " + fileName, "«container.name»");
				}
				
				// Re position to the beginning.
				theFile.seekg(0);
				
				// Read in a stringstream.
				stringstream ss;
				ss << theFile.rdbuf();
		
				if (theFile.rdstate() == istream::failbit || theFile.rdstate() == istream::badbit) {
					throw ConversionException("Error reading file " + fileName,"«container.name»");
				}
		
				// And close
				theFile.close();
				if (theFile.rdstate() == istream::failbit)
					throw ConversionException("Could not close file " + fileName,"«container.name»");
					
				setFromMIME(ss.str());
			}
			else {
				fileName = directory + "/«container.name».xml";
				string version ;
				ASDMUtils::Origin origin;
				
				try { 
					version = parse.detectVersion_ ? ASDMUtils::version(directory_) : parse.version_;
					origin = parse.detectOrigin_ ? ASDMUtils::origin(ASDMUtils::telescopeNames(directory_)) : parse.origin_;
				}
				catch (ASDMUtilsException e) {
					throw ConversionException ("Caught an exception whose message is '" + e.getMessage() + "'.", "«container.name»");
				}
				
		    	if ((version == "UNKNOWN") && (origin == ASDMUtils::UNKNOWN))
		    		throw ConversionException("I cannot read this dataset with version='UNKNOWN' and origin='UNKNOWN'", "«container.name»");
		 		
		   		string xsltPath;
		 		bool proceed = (origin == ASDMUtils::EVLA)  
		    			    || (version.compare("3") && ( origin == ASDMUtils::ALMA)); // If it's an ALMA then we must check its version.
				string xmlDoc;
		 		try {
		 			if (proceed) {
		    			if (origin == ASDMUtils::EVLA)
							xsltPath = ASDMUtils::pathToV2V3EVLAxslTransform();
						else 
							xsltPath = ASDMUtils::pathToV2V3ALMAxslTransform();
					
						if (xsltPath.size() == 0)
							throw ConversionException("An XSL transformation must be done on this '" + ((origin==ASDMUtils::EVLA) ? string("EVLA") : string("ALMA")) + "' dataset, but its file , '" + ASDMUtils::nameOfV2V3xslTransform(origin) + "' cannot be found.", "«container.name»");
						 
						xslTransformer.setTransformation(xsltPath);
						//cout << "An XSL transformation will be done on this dataset using '" << xsltPath << "'." << endl;
					}
					else {
						//cout << "No transformation will be applied on this dataset." << endl;
					}
					 
					xmlDoc = getXSLTransformer()(fileName);
				}
				catch (XSLTransformerException e) {
					throw ConversionException("Caugth an exception whose message is '" + e.getMessage() + "'.", "«container.name»");
				}
				fromXML(xmlDoc);
			}
			
			if (!loadTablesOnDemand_) {
				// Now read and parse all files for the tables whose number of rows appear as
				// non null in the container just built.
				Entity entity;
				«FOR table : container.tables»
					entity = tableEntity["«table.name»"];
					if (entity.getEntityId().getId().length()  != 0) {
						get«table.name»().setFromFile(directory_);
					}
				«ENDFOR»
			}else{
				«FOR table : container.tables»
					get«table.name»().presentInMemory = tableEntity["«table.name»"].getEntityId().getId().length() == 0;
				«ENDFOR»
			}
			
			origin = FILE;
		}
		
		bool «container.name»::checkRowUniqueness() const { return checkRowUniqueness_; }
	'''
	
	
}