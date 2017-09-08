package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import alma.hla.datamodel.util.MMUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppTableImpl {
	
	var container = AlmaTableContainer.instance
	
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		/*
		 * CppTableImpl generator
		 */
		for(table : container.tables){
			
			//  creating file and generating Cpp code for table 
			sdmFsa.setFile("src/" + table.name + "Table.cpp")
			sdmFsa.generateFile(table.generateCppTableImpl)
			
		}
		
	}
	
	
	def generateCppTableImpl(AlmaTable table)'''
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
	 * File «table.name»Table.cpp
	 */
	#include <ConversionException.h>
	#include <DuplicateKey.h>
	#include <OutOfBoundsException.h>
	
	using asdm::ConversionException;
	using asdm::DuplicateKey;
	using asdm::OutOfBoundsException;
	
	#include <«container.name».h>
	#include <«table.name»Table.h>
	#include <«table.name»Row.h>
	#include <Parser.h>
	
	using asdm::«container.name»;
	using asdm::«table.name»Table;
	using asdm::«table.name»Row;
	using asdm::Parser;
	
	#include <iostream>
	#include <fstream>
	#include <iterator>
	#include <sstream>
	#include <set>
	#include <algorithm>
	using namespace std;
	
	#include <Misc.h>
	using namespace asdm;
	
	#include <libxml/parser.h>
	#include <libxml/tree.h>
	
	#include "boost/filesystem/operations.hpp"
	#include <boost/algorithm/string.hpp>
	using namespace boost;
	
	
	namespace asdm {
		
		// The name of the entity we will store in this table.
		static string entityNameOf«table.name» = "«table.name»";
		
		
		// An array of string containing the names of the columns of this table.
		// The array is filled in the order : key, required value, optional value.
		//
		static string attributesNamesOf«table.name»_a[] = {
			«FOR attr : table.keyAttributes SEPARATOR ","»
				"«attr.name»"
			«ENDFOR»
			«FOR attr : table.requiredValueAttributes»
				, "«attr.name»"
			«ENDFOR»		
			«FOR attr : table.optionalValueAttributes»
				, "«attr.name»"
			«ENDFOR»		
		};
		
		// A vector of string whose content is a copy of the strings in the array above.
		//
		static vector<string> attributesNamesOf«table.name»_v (attributesNamesOf«table.name»_a, attributesNamesOf«table.name»_a + sizeof(attributesNamesOf«table.name»_a) / sizeof(attributesNamesOf«table.name»_a[0]));
		
		
		// An array of string containing the names of the columns of this table.
		// The array is filled in the order where the names would be read by default in the XML header of a file containing
		// the table exported in binary mode.
		//	
		static string attributesNamesInBinOf«table.name»_a[] = {
			«IF table.name.equals("Pointing")»
				"antennaId",
				"timeInterval",
				"numSample",
				"encoder",
				"pointingTracking",
				"usePolynomials",
				"timeOrigin",
				"numTerm",
				"pointingDirection",
				"target",
				"offset",
				"pointingModelId",
				"overTheTop",
				"sourceOffset",
				"sourceOffsetReferenceCode",
				"sourceOffsetEquinox",
				"sampledTimeInterval"
			«ELSE»
		    	«FOR attr : table.requiredAttributes SEPARATOR "," » "«attr.name»" «ENDFOR»
		    	,
		    	«FOR attr : table.optionalValueAttributes SEPARATOR "," » "«attr.name»" «ENDFOR»
		    «ENDIF»
		};
		
		
		// A vector of string whose content is a copy of the strings in the array above.
		//
		static vector<string> attributesNamesInBinOf«table.name»_v(attributesNamesInBinOf«table.name»_a, attributesNamesInBinOf«table.name»_a + sizeof(attributesNamesInBinOf«table.name»_a) / sizeof(attributesNamesInBinOf«table.name»_a[0]));		
	
		// The array of attributes (or column) names that make up key «table.key.name».
		//
		string «table.key.name»Of«table.name»_a[] = {
		«FOR f : table.key.field SEPARATOR "," »
			"«f.name»"
		«ENDFOR»	 
		};
			 
		// A vector of strings which are copies of those stored in the array above.
		vector<string> «table.key.name»Of«table.name»_v(«table.key.name»Of«table.name»_a, «table.key.name»Of«table.name»_a + sizeof(«table.key.name»Of«table.name»_a) / sizeof(«table.key.name»Of«table.name»_a[0]));
	
		/**
		 * Return the list of field names that make up key «table.key.name»
		 * as a const reference to a vector of strings.
		 */	
		const vector<string>& «table.name»Table::get«table.key.UpperCaseName»Name() {
			return «table.key.name»Of«table.name»_v;
		}
		
		
		«table.name»Table::«table.name»Table(«container.name» &c) : container(c) {
	
			// Define a default entity.
			entity.setEntityId(EntityId("uid://X0/X0/X0"));
			entity.setEntityIdEncrypted("na");
			entity.setEntityTypeName("«table.name»Table");
			entity.setEntityVersion("1");
			entity.setInstanceVersion("1");
			
			// Archive XML
			archiveAsBin = «table.archiveAsBin»;
			
			// File XML
			fileAsBin = «table.fileAsBin»;
			
			// By default the table is considered as present in memory
			presentInMemory = true;
			
			// By default there is no load in progress
			loadInProgress = false;
		}
		
		/**
		 * A destructor for «table.name»Table.
		 */
		«table.name»Table::~«table.name»Table() {
			for (unsigned int i = 0; i < privateRows.size(); i++) 
				delete(privateRows.at(i));
		}
		
		
		
		/**
		 * Container to which this table belongs.
		 */
		«container.name» &«table.name»Table::getContainer() const {
			return container;
		}
	
		/**
		 * Return the number of rows in the table.
		 */
		unsigned int «table.name»Table::size() const {
			if (presentInMemory) 
				return privateRows.size();
			else
				return declaredSize;
		}
		
		
		/**
		 * Return the name of this table.
		 */
		string «table.name»Table::getName() const {
			return entityNameOf«table.name»;
		}
		
		/**
		 * Return the name of this table.
		 */
		string «table.name»Table::name() {
			return entityNameOf«table.name»;
		}
		
		
		/**
		 * Return the the names of the attributes (or columns) of this table.
		 */
		const vector<string>& «table.name»Table::getAttributesNames() { return attributesNamesOf«table.name»_v; }
		
		/**
		 * Return the the names of the attributes (or columns) of this table as they appear by default
		 * in an binary export of this table.
		 */
		const vector<string>& «table.name»Table::defaultAttributesNamesInBin() { return attributesNamesInBinOf«table.name»_v; }
	
		/**
		 * Return this table's Entity.
		 */
		Entity «table.name»Table::getEntity() const {
			return entity;
		}
	
		/**
		 * Set this table's Entity.
		 */
		void «table.name»Table::setEntity(Entity e) {
			this->entity = e; 
		}
	
		//
		// ====> Row creation.
		//
		
		/**
		 * Create a new row.
		 */
		«table.name»Row *«table.name»Table::newRow() {
			return new «table.name»Row (*this);
		}

		«IF table.requiredNoAutoIncrementableAttributes.size != 0»
			/**
			 * Create a new row initialized to the specified values.
			 * @return a pointer on the created and initialized row.
			«FOR attr : table.requiredNoAutoIncrementableAttributes»
			 * @param «attr.name»
			«ENDFOR»
			 */
			«table.name»Row* «table.name»Table::newRow(«table.RequiredNoAutoIncrementableCpp»){
				«table.name»Row *row = new «table.name»Row(*this);
				«FOR attr : table.requiredNoAutoIncrementableAttributes»
					row->set«attr.UpperCaseName»(«attr.name»);
				«ENDFOR»
				return row;	
			}
		«ENDIF»
		
		
		«table.name»Row* «table.name»Table::newRow(«table.name»Row* row) {
			return new «table.name»Row(*this, *row);
		}
	
		//
		// Append a row to its table.
		//
		«IF table.isTemporal»
			«IF table.name.equals("Source")»
				«table.addRowToSource»
			«ELSE»
				«table.addRowToTemporal»
			«ENDIF»
		«ELSE»
			«table.addRowToNotTemporal»
		«ENDIF»
		
		
		// 
		// A private method to append a row to its table, used by input conversion
		// methods, with row uniqueness.
		//
		«IF table.isTemporal»
			«table.addAndCheckToTemporal»
		«ELSE»
			«table.addAndCheckToNotTemporal»
		«ENDIF»
	

		//
		// A private method to brutally append a row to its table, without checking for row uniqueness.
		//
		«table.append»
		
		«/* Methods returning rows. */»
		«table.getters»
		
		«IF table.isTemporal»
		«/* Returning rows of temporal tables.*/»
			«table.gettersTemporal»
		«ELSE»
		«/* Returning rows of non temporal tables.*/»
			«table.gettersNotTemporal»
		«ENDIF»

	#ifndef WITHOUT_ACS
		using asdmIDL::«table.name»TableIDL;
	#endif
	
	#ifndef WITHOUT_ACS
		// Conversion Methods
	
		«table.name»TableIDL *«table.name»Table::toIDL() {
			«table.name»TableIDL *x = new «table.name»TableIDL ();
			unsigned int nrow = size();
			x->row.length(nrow);
			vector<«table.name»Row*> v = get();
			for (unsigned int i = 0; i < nrow; ++i) {
				//x->row[i] = *(v[i]->toIDL());
				v[i]->toIDL(x->row[i]);
			}
			return x;
		}
		
		void «table.name»Table::toIDL(asdmIDL::«table.name»TableIDL& x) const {
			unsigned int nrow = size();
			x.row.length(nrow);
			vector<«table.name»Row*> v = get();
			for (unsigned int i = 0; i < nrow; ++i) {
				v[i]->toIDL(x.row[i]);
			}
		}	
	#endif
	
	
	#ifndef WITHOUT_ACS
		void «table.name»Table::fromIDL(«table.name»TableIDL x) {
			unsigned int nrow = x.row.length();
			for (unsigned int i = 0; i < nrow; ++i) {
				«table.name»Row *tmp = newRow();
				tmp->setFromIDL(x.row[i]);
				// checkAndAdd(tmp);
				add(tmp);
			}
		}	
	#endif
	
	
		«table.toXML»
		«table.fromXML»
		
		void «table.name»Table::error()  {
			throw ConversionException("Invalid xml document","«table.name»");
		}
		
		«table.toMIME»
		«table.setFromMIME»
		«table.toFile»
		«table.setFromFile»
		«table.setFromMIMEFile»
		«table.setFromXMLFile»

		
		
		«IF table.isTemporal»
			«IF table.TemporalAttribute.JavaType.equals("ArrayTimeInterval")»
				«/* The temporal attribute is an ArrayTimeInterval */»
				/**
				 * Insert a «table.name»Row* in a vector of «table.name»Row* so that it's ordered by ascending start time.
				 *
				 * @param «table.name»Row* x . The pointer to be inserted.
				 * @param vector <«table.name»Row*>& row. A reference to the vector where to insert x.
				 *
				 */
				 «table.name»Row* «table.name»Table::insertByStartTime(«table.name»Row* x, vector<«table.name»Row*>& row) {
				 				
				 		vector <«table.name»Row*>::iterator theIterator;
				 		
				 		ArrayTime start = x->«table.TemporalAttribute.name».getStart();
				 
				     	// Is the row vector empty ?
				     	if (row.size() == 0) {
				     		row.push_back(x);
				     		privateRows.push_back(x);
				     		x->isAdded(true);
				     		return x;
				     	}
				     	
				     	// Optimization for the case of insertion by ascending time.
				     	«table.name»Row* last = *(row.end()-1);
				         
				     	if ( start > last->«table.TemporalAttribute.name».getStart() ) {
				  	    	//
				 	    	// Modify the duration of last if and only if the start time of x
				 	    	// is located strictly before the end time of last.
				 	    	//
				 	  		if ( start < (last->«table.TemporalAttribute.name».getStart() + last->«table.TemporalAttribute.name».getDuration()))   		
				     			last->«table.TemporalAttribute.name».setDuration(start - last->«table.TemporalAttribute.name».getStart());
				     		row.push_back(x);
				     		privateRows.push_back(x);
				     		x->isAdded(true);
				     		return x;
				     	}
				     	
				     	// Optimization for the case of insertion by descending time.
				     	«table.name»Row* first = *(row.begin());
				         
				     	if ( start < first->«table.TemporalAttribute.name».getStart() ) {
				 			//
				 	  		// Modify the duration of x if and only if the start time of first
				 	  		// is located strictly before the end time of x.
				 	  		//
				 	  		if ( first->«table.TemporalAttribute.name».getStart() < (start + x->«table.TemporalAttribute.name».getDuration()) )	  		
				     			x->«table.TemporalAttribute.name».setDuration(first->«table.TemporalAttribute.name».getStart() - start);
				     		row.insert(row.begin(), x);
				     		privateRows.push_back(x);
				     		x->isAdded(true);
				     		return x;
				     	}
				     	
				     	// Case where x has to be inserted inside row; let's use a dichotomy
				     	// method to find the insertion index.
				 		unsigned int k0 = 0;
				 		unsigned int k1 = row.size() - 1;
				 	
				 		while (k0 != (k1 - 1)) {
				 			if (start == row[k0]->«table.TemporalAttribute.name».getStart()) {
				 				if (row[k0]->equalByRequiredValue(x))
				 					return row[k0];
				 				else
				 					throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
				 			}
				 			else if (start == row[k1]->«table.TemporalAttribute.name».getStart()) {
				 				if (row[k1]->equalByRequiredValue(x))
				 					return row[k1];
				 				else
				 					throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
				 			}
				 			else {
				 				if (start <= row[(k0+k1)/2]->«table.TemporalAttribute.name».getStart())
				 					k1 = (k0 + k1) / 2;
				 				else
				 					k0 = (k0 + k1) / 2;				
				 			} 	
				 		}
				 
				 		if (start == row[k0]->«table.TemporalAttribute.name».getStart()) {
				 			if (row[k0]->equalByRequiredValue(x))
				 				return row[k0];
				 			else
				 				throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
				 		}
				 		else if (start == row[k1]->«table.TemporalAttribute.name».getStart()) {
				 			if (row[k1]->equalByRequiredValue(x))
				 				return row[k1];
				 			else
				 				throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
				 		}	
				 
				 		row[k0]->«table.TemporalAttribute.name».setDuration(start-row[k0]->«table.TemporalAttribute.name».getStart());
				 		x->«table.TemporalAttribute.name».setDuration(row[k0+1]->«table.TemporalAttribute.name».getStart() - start);
				 		row.insert(row.begin()+(k0+1), x);
				 		privateRows.push_back(x);
				    		x->isAdded(true);
				 		return x;   
				     }
			«ELSEIF table.TemporalAttribute.JavaType.equals("ArrayTime")»
				«/*The temporal attribute is an ArrayTime» */»
				«table.name»Row * «table.name»Table::insertByTime(«table.name»Row* x, vector<«table.name»Row *>&row ) {
						ArrayTime start = x->get«table.TemporalAttribute.UpperCaseName»();
						
						// Is the vector empty ?
						if (row.size() == 0) {
							row.push_back(x);
							privateRows.push_back(x);
							x->isAdded(true);
							return x;
						}
						
						// Optimization for the case of insertion by ascending time.
						«table.name»Row* last = row.at(row.size()-1);
						
						if (start.get() > last->get«table.TemporalAttribute.UpperCaseName»().get()) {
							row.push_back(x);
							privateRows.push_back(x);
							x->isAdded(true);
							return x;
						}
						
						// Optimization for the case of insertion by descending time.
						«table.name»Row* first = row.at(0);
						
						if (start.get() < first->get«table.TemporalAttribute.UpperCaseName»().get()) {
							row.insert(row.begin(), x);
							privateRows.push_back(x);
							x->isAdded(true);
							return x;
						}
						
						// Case where x has to be inserted inside row; let's use a dichotomy
						// method to find the insertion index.		
						int k0 = 0;
						int k1 = row.size() - 1;    	  
						while (k0 != (k1 - 1)) {
							if (start.get() == row.at(k0)->get«table.TemporalAttribute.UpperCaseName»().get()) {
								if (row.at(k0)->equalByRequiredValue(x))
									return row.at(k0);
								else
									throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
							}
							else if (start.get() == row.at(k1)->get«table.TemporalAttribute.UpperCaseName»().get()) {
								if (row.at(k1)->equalByRequiredValue(x))
									return row.at(k1);
								else
									throw  DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
							}
							else {
								if (start.get() <= row.at((k0+k1)/2)->get«table.TemporalAttribute.UpperCaseName»().get())
									k1 = (k0 + k1) / 2;
								else
									k0 = (k0 + k1) / 2;				
							} 	
						}
						
						if (start.get() == row.at(k0)->get«table.TemporalAttribute.UpperCaseName»().get()) {
							if (row.at(k0)->equalByRequiredValue(x))
								return row.at(k0);
							else
								throw DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
						}
						else if (start.get() == row.at(k1)->get«table.TemporalAttribute.UpperCaseName»().get()) {
							if (row.at(k1)->equalByRequiredValue(x))
								return row.at(k1);
							else
								throw  DuplicateKey("DuplicateKey exception in ", "«table.name»Table");	
						}		
						
						row.insert(row.begin()+(k0+1), x);
						privateRows.push_back(x);
						x->isAdded(true);
						return x; 						
					}
			«ENDIF»
		«ENDIF»
		
		
		
		«IF !table.NoAutoIncrementableAttribute && !table.isTemporal»
			void «table.name»Table::autoIncrement(string key, «table.name»Row* x) {
				map<string, int>::iterator iter;
				if ((iter=noAutoIncIds.find(key)) == noAutoIncIds.end()) {
					// There is not yet a combination of the non autoinc attributes values in the hashtable
					«IF table.TheAutoIncrementableAttribute.JavaType.equals("Tag")»
						// Initialize  «table.TheAutoIncrementableAttribute.name» to Tag(0).
						x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(0,  TagType::«table.name»));
					«ELSEIF table.TheAutoIncrementableAttribute.JavaType.equals("int")»
						// Initialize  «table.TheAutoIncrementableAttribute.name» to 0.		
						x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(0);
					«ENDIF»
					// Record it in the map.		
					noAutoIncIds.insert(make_pair(key, 0));			
				} 
				else {
					// There is already a combination of the non autoinc attributes values in the hashtable
					// Increment its value.
					int n = iter->second + 1; 
					«IF table.TheAutoIncrementableAttribute.JavaType.equals("Tag")»
						// Initialize  «table.TheAutoIncrementableAttribute.name» to Tag(n).
						x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(n, TagType::«table.name»));
					«ELSEIF table.TheAutoIncrementableAttribute.JavaType.equals("int")»
						// Initialize  «table.TheAutoIncrementableAttribute.name» to n.		
						x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(n);
					«ENDIF»
					// Record it in the map.		
					noAutoIncIds.insert(make_pair(key, n));				
				}		
			}
		«ENDIF»
		
		
	} // End namespace asdm
	
	'''
	
	
	
	def addRowToSource(AlmaTable table)'''
	/** 
	 * Returns a string built by concatenating the ascii representation of the
	 * parameters values suffixed with a "_" character.
	 */
	string «table.name»Table::Key(«table.KeyNoAutoIncNoTimeCpp») {
		ostringstream ostrstr;
		ostrstr
		«FOR attr : table.KeyNoAutoIncNoTimeAttributes»
			<< «IF attr.CppType.equals("Tag")»«attr.name».toString() «ELSE» «attr.name» «ENDIF» << "_"
		«ENDFOR»
		;
		return ostrstr.str();
	}
	
	
	«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
		// Get the start time of the row to be inserted.
		ArrayTime startTime = x->get«table.TemporalAttribute.UpperCaseName»().getStart();
		// cout << "Trying to add a new row with start time = " << startTime << endl;
		int insertionId = 0;

		 
		// Determine the entry in the context map from the appropriates attributes.
		string k = Key(«FOR param : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","»
						x->get«param.UpperCaseName»()
					   «ENDFOR»);
					   
		if (name2id_m.find(x->getSourceName()) == name2id_m.end()) {
			int dummy = name2id_m.size();
			name2id_m[x->getSourceName()] = dummy;
		}
		
		insertionId = name2id_m[x->getSourceName()];
		if (context.find(k) != context.end()) {
			for (unsigned int j = 0; j < context[k].size(); j++) 
				if ((context[k].size() > insertionId) && context[k][insertionId][j]->getTimeInterval().getStart().equals(startTime)) {
					if(
						«FOR attr : table.requiredValueAttributes SEPARATOR " && \n"»
						 (context[k][insertionId][j]->get«attr.UpperCaseName»() == x->get«attr.UpperCaseName»())
						«ENDFOR»
						) {
							// cout << "A row equal to x has been found, I return it " << endl;
							return context[k][insertionId][j];
						}
					else 
						throw UniquenessViolationException();
				}
		}
		else { // There is not yet a context ...
			   // Create and initialize an entry in the context map for this combination....
			// cout << "Starting a new context " << k << endl;
			ID_TIME_ROWS vv;
			context[k] = vv;
		}
		
		«IF table.TheAutoIncrementableAttribute.CppType.equals("int")»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(insertionId);
		«ELSE»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(insertionId, TagType::«table.name»));							
		«ENDIF»
			if (insertionId >= (int) context[k].size()) context[k].resize(insertionId+1);
			return insertByStartTime(x, context[k][insertionId]);
	}
	
	void «table.name»Table::addWithoutCheckingUnique(«table.name»Row * x) {
		«table.name»Row * dummy = checkAndAdd(x, true); // We require the check for uniqueness to be skipped.
		                                           // by passing true in the second parameter
		                                           // whose value by default is false
		if (false) cout << (unsigned long long) dummy;
	}		
	
	'''
	
	
	def addRowToTemporal(AlmaTable table)'''
	«IF !table.NoAutoIncrementableAttribute»
	«/* This table has an autoincrementable attribute*/»
	«IF table.KeyNoAutoIncNoTimeAttributes.size == 0»
	«/* This table's key section does not have any other attribute than the autoinc and the temporal ones*/»
	«ELSE»
	«/* This table's key has other attributes than the autoincrementable and the temporal one*/»

	/** 
	 * Returns a string built by concatenating the ascii representation of the
	 * parameters values suffixed with a "_" character.
	 */
	 string «table.name»Table::Key(«table.KeyNoAutoIncNoTimeCpp») {
	 	ostringstream ostrstr;
	 		ostrstr  
			«FOR attr : table.KeyNoAutoIncNoTimeAttributes»
				<< «IF attr.CppType.equals("Tag")»«attr.name».toString() «ELSE» «attr.name» «ENDIF» << "_"
			«ENDFOR»
			;
		return ostrstr.str();	 	
	 }

	/**
	 * Append a row to a «table.name»Table which has simply 
	 * 1) an autoincrementable attribute  («table.TheAutoIncrementableAttribute.name») 
	 * 2) a temporal attribute («table.TemporalAttribute.name») in its key section.
	 * 3) other attributes in the key section (defining a so called context).
	 * If there is already a row in the table whose key section non including is equal to x's one and
	 * whose value section is equal to x's one then return this row, otherwise add x to the collection
	 * of rows.
	 */
	«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
		// Get the start time of the row to be inserted.
		ArrayTime startTime = x->get«table.TemporalAttribute.UpperCaseName»().getStart();
		// cout << "Trying to add a new row with start time = " << startTime << endl;
		int insertionId = 0;

		 
		// Determine the entry in the context map from the appropriates attributes.
		string k = Key(«FOR param : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","»
						x->get«param.UpperCaseName»()
					   «ENDFOR»);
					   

		// Determine the insertion index for the row x, possibly returning a pointer to a row identical to x. 					   
		if (context.find(k) != context.end()) {
			// cout << "The context " << k << " already exists " << endl;
			for (unsigned int i = 0; i < context[k].size(); i++) {
				//cout << "Looking for a same starttime in i = " << i << endl;
				for (unsigned int j=0; j<context[k][i].size(); j++) 
					if (context[k][i][j]->getTimeInterval().getStart().equals(startTime)) {
						if (
						«FOR attr : table.requiredValueAttributes SEPARATOR " && \n"»
						 (context[k][i][j]->get«attr.UpperCaseName»() == x->get«attr.UpperCaseName»())
						«ENDFOR»
						) {
							// cout << "A row equal to x has been found, I return it " << endl;
							return context[k][i][j];
						}
						
						// Otherwise we must autoincrement «table.TheAutoIncrementableAttribute.name» and
						// insert a new «table.name»Row with this autoincremented value.
						insertionId = i+1;

						break;
						
						// And goto insertion
						// goto done;
					}
			}
			//cout << "No row with the same start time than x, it will be inserted in row with id = 0" << endl;
			// insertionId = 0;
		}
		else { // There is not yet a context ...
			   // Create and initialize an entry in the context map for this combination....
			// cout << "Starting a new context " << k << endl;
			ID_TIME_ROWS vv;
			context[k] = vv;

			insertionId = 0;				
		}
		
		«IF table.TheAutoIncrementableAttribute.CppType.equals("int")»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(insertionId);
		«ELSE»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(insertionId, TagType::«table.name»));							
		«ENDIF»
			if (insertionId >= (int) context[k].size()) context[k].resize(insertionId+1);
			return insertByStartTime(x, context[k][insertionId]);
	}
	
		«ENDIF»
	«ELSE»
		«IF table.KeyNoAutoIncNoTimeAttributes.size != 0»
«/*This table does not have an autoincrementable attribute but has key attributes other than the temporal one*/»
	/** 
	 * Returns a string built by concatenating the ascii representation of the
	 * parameters values suffixed with a "_" character.
	 */
	 string «table.name»Table::Key(«table.KeyNoAutoIncNoTimeCpp») {
	 	ostringstream ostrstr;
	 		ostrstr  
			«FOR attr : table.KeyNoAutoIncNoTimeAttributes»
				<<  «IF attr.CppType.equals("Tag")»«attr.name».toString() «ELSE» «attr.name» «ENDIF» << "_"
			«ENDFOR»
			;
		return ostrstr.str();	 	
	 }
	 
			«IF table.TemporalAttribute.JavaType == "ArrayTimeInterval"»
«/* The TemporalAttribute is an ArrayTimeInterval */»
	«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
		ArrayTime startTime = x->get«table.TemporalAttribute.UpperCaseName»().getStart();

		/*
	 	 * Is there already a context for this combination of not temporal 
	 	 * attributes ?
	 	 */
		string k = Key(«FOR param : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","»
						x->get«param.UpperCaseName»()
					   «ENDFOR»);

		if (context.find(k) == context.end()) { 
			// There is not yet a context ...
			// Create and initialize an entry in the context map for this combination....
			TIME_ROWS v;
			context[k] = v;			
		}
		
		return insertByStartTime(x, context[k]);
	}	
			«ELSEIF table.TemporalAttribute.JavaType == "ArrayTime"»
«/* The TemporalAttribute is an ArrayTime */»
	«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
		string keystr = Key(«FOR param : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","»
						x->get«param.UpperCaseName»()
					   «ENDFOR»);
		if (context.find(keystr) == context.end()) {
			vector<«table.name»Row *> v;
			context[keystr] = v;
		}
		return insertByTime(x, context[keystr]);					
	}
			«ENDIF»
		«ELSE»«/* There is only a temporal attribute in the key section */»  
	«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
		«table.name»Row* aRow = getRowByKey(
		«FOR param : table.keyAttributes SEPARATOR ","»
			x->get«param.UpperCaseName»()
		«ENDFOR»
		);
		// There is a row with x's key section return it.
		if (aRow) throw DuplicateKey("Duplicate key exception in ", "«table.name»Table");
		
		// Insert the row x in the table in such a way that the vector row is sorted
		// by ascending values on «table.TemporalAttribute.name».getStart().
		return insertByStartTime(x, row);
	}
		«ENDIF»
	«ENDIF»
		
	void «table.name»Table::addWithoutCheckingUnique(«table.name»Row * x) {
		«table.name»Row * dummy = checkAndAdd(x, true); // We require the check for uniqueness to be skipped.
		                                           // by passing true in the second parameter
		                                           // whose value by default is false.
		if (false) cout << (unsigned long long) dummy;
	}
	'''
	
	def addRowToNotTemporal(AlmaTable table)'''
	«IF !table.NoAutoIncrementableAttribute» 
		«/* This table has autoincrementable attribute*/»
		/** 
		 * Look up the table for a row whose noautoincrementable attributes are matching their
		 * homologues in *x.  If a row is found  this row else autoincrement  *x.«table.TheAutoIncrementableAttribute.name», 
		 * add x to its table and returns x.
		 *  
		 * @returns a pointer on a «table.name»Row.
		 * @param x. A pointer on the row to be added.
		 */ 
		«IF table.keyNoAutoIncrementableAttributes.size != 0»
«/* addAutoInc on a table with a composite key*/»
		«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
			«table.name»Row* aRow = lookup(
				«FOR param : table.requiredNoAutoIncrementableAttributes SEPARATOR ","»
				x->get«param.UpperCaseName»()
				«ENDFOR»
			);
			if (aRow) return aRow;
	
			// Autoincrementation algorithm. We use the hashtable.
			ostringstream noAutoIncIdsEntry;
			noAutoIncIdsEntry
			«FOR at : table.keyNoAutoIncrementableAttributes»
			«IF at.JavaType.equals("Tag")»
			<< x->«at.name».toString() << "_"
			«ELSEIF at.JavaType.equals("int")»
			<< x->«at.name» << "_"			
			«ENDIF»	
			«ENDFOR»
			;
			
			map<string, int>::iterator iter;
			if ((iter=noAutoIncIds.find(noAutoIncIdsEntry.str())) == noAutoIncIds.end()) {
				// There is not yet a combination of the non autoinc attributes values in the hashtable
	
				«IF table.TheAutoIncrementableAttribute.JavaType.equals("Tag")»
				// Initialize  «table.TheAutoIncrementableAttribute.name» .
				x->«table.TheAutoIncrementableAttribute.name» = Tag(0, TagType::«table.name»);
				//x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(0, TagType::«table.name»));
				«ELSEIF table.TheAutoIncrementableAttribute.JavaType.equals("int")»
				// Initialize  «table.TheAutoIncrementableAttribute.name» to 0.
				x->«table.TheAutoIncrementableAttribute.name» = 0;		
				//x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(0);
				«ENDIF»
				// Record it in the map.		
				noAutoIncIds.insert(make_pair(noAutoIncIdsEntry.str(), 0));			
			} 
			else {
				// There is already a combination of the non autoinc attributes values in the hashtable
				// Increment its value.
				int n = iter->second + 1; 
				«IF table.TheAutoIncrementableAttribute.JavaType.equals("Tag")»
				// Initialize  «table.TheAutoIncrementableAttribute.name» to Tag(n).
				//x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(n, TagType::«table.name»));
				x->«table.TheAutoIncrementableAttribute.name» = Tag(n, TagType::«table.name»);
				«ELSEIF table.TheAutoIncrementableAttribute.JavaType.equals("int")»
				// Initialize  «table.TheAutoIncrementableAttribute.name» to n.		
				//x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(n);
				x->«table.TheAutoIncrementableAttribute.name» = n;
				«ENDIF»
				// Record it in the map.		
				noAutoIncIds.erase(iter);
				noAutoIncIds.insert(make_pair(noAutoIncIdsEntry.str(), n));				
			}	
			
			row.push_back(x);
			privateRows.push_back(x);
			x->isAdded(true);
			return x;
		}	 
			«ELSE»
«/* addAutoInc on a table with a simple key*/»
		«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
			«IF table.requiredValueAttributes.size != 0» «/* We lookup only if there is something to lookup for*/»
			«table.name»Row* aRow = lookup(
			«FOR param : table.requiredValueAttributes SEPARATOR ","»
			x->get«param.UpperCaseName»()
			«ENDFOR»
			);
			if (aRow) return aRow;
			«ENDIF»
	
			«IF table.TheAutoIncrementableAttribute.JavaType.equals("Tag")»
			// Autoincrement «table.TheAutoIncrementableAttribute.name»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(Tag(size(), TagType::«table.name»));
			«ELSEIF table.TheAutoIncrementableAttribute.JavaType.equals("int")»
			x->set«table.TheAutoIncrementableAttribute.UpperCaseName»(size());
			«ENDIF»			
			row.push_back(x);
			privateRows.push_back(x);
			x->isAdded(true);
			return x;
		}
			«ENDIF»
		«ELSE» «/* this table does not have an autoincrementable attributes.*/»
		/**
		 * Add a row.
		 * @throws DuplicateKey Thrown if the new row has a key that is already in the table.
		 * @param x A pointer to the row to be added.
		 * @return x
		 */
		«table.name»Row* «table.name»Table::add(«table.name»Row* x) {
			if (getRowByKey(«FOR attr : table.keyAttributes SEPARATOR ","»
							x->get«attr.UpperCaseName»()
							«ENDFOR»))
				//throw DuplicateKey(«table.key.FieldNames4»,"«table.name»");
				throw DuplicateKey("Duplicate key exception in ","«table.name»Table");
			row.push_back(x);
			privateRows.push_back(x);
			x->isAdded(true);
			return x;
		}

		«ENDIF»
			
		void «table.name»Table::addWithoutCheckingUnique(«table.name»Row * x) {
			if (getRowByKey(«FOR attr : table.keyAttributes SEPARATOR ","»
							x->get«attr.UpperCaseName»()
							«ENDFOR») != («table.name»Row *) 0) 
				throw DuplicateKey("Dupicate key exception in ", "«table.name»Table");
			row.push_back(x);
			privateRows.push_back(x);
			x->isAdded(true);
		}
	'''
	
	def addAndCheckToTemporal(AlmaTable table)'''
	«IF !table.NoAutoIncrementableAttribute»
			«/* There is an autoincrementable attribute */»
		/**
		 * If this table has an autoincrementable attribute then check if *x verifies the rule of uniqueness and throw exception if not.
		 * Check if *x verifies the key uniqueness rule and throw an exception if not.
		 * Append x to its table.
		 * @param x a pointer on the row to be appended.
		 * @returns a pointer on x.
		 * @throws DuplicateKey
		 * @throws UniquenessViolationException 
		 */
		«table.name»Row*  «table.name»Table::checkAndAdd(«table.name»Row* x, bool skipCheckUniqueness) {
			ArrayTime startTime = x->get«table.TemporalAttribute.UpperCaseName»().getStart();		
			
			// Determine the entry in the context map from the appropriate attributes.
			string k = Key(«FOR attr : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","»
			                x->get«attr.UpperCaseName»()
			               «ENDFOR»);

			if (!skipCheckUniqueness) {
				// Uniqueness Rule Check
				if (context.find(k) != context.end()) {
					for (unsigned int i = 0;  i < context[k].size(); i++) 
						for (unsigned int j = 0; j < context[k][i].size(); j++)
							if (
								(context[k][i][j]->get«table.TemporalAttribute.UpperCaseName»().getStart().equals(startTime)) 
						«FOR attr : table.requiredValueAttributes SEPARATOR "\n"»
								 && (context[k][i][j]->get«attr.UpperCaseName»() == x->get«attr.UpperCaseName»())
						«ENDFOR»
							)
								throw UniquenessViolationException("Uniqueness violation exception in table «table.name»Table");			
				}
			}



			// Good, now it's time to insert the row x, possibly triggering a DuplicateKey exception.	
			
			ID_TIME_ROWS dummyPlane;

			// Determine the integer representation of the identifier of the row (x) to be inserted. 
			int id = «IF table.TheAutoIncrementableAttribute.CppType.equals("Tag")»
					Integer.parseInt(x->get«table.TheAutoIncrementableAttribute.UpperCaseName»());
					«ELSE»
					x->get«table.TheAutoIncrementableAttribute.UpperCaseName»();
					«ENDIF»
		
			if (context.find(k) != context.end()) {
				if (id >= (int) context[k].size()) 
					context[k].resize(id+1);
				else {
					// This «table.TheAutoIncrementableAttribute.name» 's value has already rows for this context.
					// Check that there is not yet a row with the same time. (simply check start time)
					// If there is such a row then trigger a Duplicate Key Exception.
					for (unsigned int j = 0; j < context[k][id].size(); j++)
						if (context[k][id][j]->get«table.TemporalAttribute.UpperCaseName»().getStart().equals(startTime))
							throw DuplicateKey("Duplicate key exception in ", "«table.name»Table"); 
				}					
			}
			else {
				context[k] = dummyPlane;
				context[k].resize(id+1);
			}
			return insertByStartTime(x, context[k][id]);
		}
		«ELSE»
			«/* There is NO autoincrementable attribute*/»
			«IF table.KeyNoAutoIncNoTimeAttributes.size != 0»
				«/* There are other attributes than ArrayTimeInterval in the key section*/»
				
				«IF table.TemporalAttribute.JavaType.equals("ArrayTimeInterval")»
«/* The temporal attribute is an ArrayTimeInterval */»
		«table.name»Row*  «table.name»Table::checkAndAdd(«table.name»Row* x, bool ) {
			string keystr = Key(«FOR attr : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","» 
							x->get«attr.UpperCaseName»() 
						   «ENDFOR»); 
			if (context.find(keystr) == context.end()) {
				vector<«table.name»Row *> v;
				context[keystr] = v;
			}
			
			vector<«table.name»Row*>& found = context.find(keystr)->second;
			return insertByStartTime(x, found);			
		}
				«ELSEIF table.TemporalAttribute.JavaType.equals("ArrayTime")»
«/* The temporal attribute is an ArrayTime */»
		«table.name»Row*  «table.name»Table::checkAndAdd(«table.name»Row* x, bool ) {
			string keystr = Key(«FOR attr : table.KeyNoAutoIncNoTimeAttributes SEPARATOR ","» 
							x->get«attr.UpperCaseName»() 
						   «ENDFOR»); 
			if (context.find(keystr) == context.end()) {
				vector<«table.name»Row *> v;
				context[keystr] = v;
			}
			
			vector<«table.name»Row*>& found = context.find(keystr)->second;
			return insertByTime(x, found);	
		}				
				«ENDIF»
			«ELSE»
«/* There are no other attributes than ArrayTimeInterval in the key section*/»
		«table.name»Row*  «table.name»Table::checkAndAdd(«table.name»Row* x, bool) {
			if (getRowByKey(
			«FOR param : table.keyAttributes SEPARATOR ","»
				x->get«param.UpperCaseName»()
			«ENDFOR»		
			)) throw DuplicateKey("Duplicate key exception in ", "«table.name»Table");

			return insertByStartTime(x, row);
		}
			«ENDIF»			
		«ENDIF»	
	'''
	
	def addAndCheckToNotTemporal(AlmaTable table)'''
	/**
	 * If this table has an autoincrementable attribute then check if *x verifies the rule of uniqueness and throw exception if not.
	 * Check if *x verifies the key uniqueness rule and throw an exception if not.
	 * Append x to its table.
	 * @param x a pointer on the row to be appended.
	 * @returns a pointer on x.
	 * @throws DuplicateKey
	 «IF !table.NoAutoIncrementableAttribute»
	 * @throws UniquenessViolationException
	 «ENDIF»
	 */
	«table.name»Row*  «table.name»Table::checkAndAdd(«table.name»Row* x, bool skipCheckUniqueness)  {
		if (!skipCheckUniqueness) { 
	«IF !table.NoAutoIncrementableAttribute» «/* This table has an autoincrementable attribute -> check the uniqueness rule.*/»
		«IF table.requiredNoAutoIncrementableAttributes.size != 0» «/* We lookup only if there is something to lookup for*/»
			if (lookup(
			«FOR param : table.requiredNoAutoIncrementableAttributes SEPARATOR ","»
				x->get«param.UpperCaseName»()
			«ENDFOR»
			)) throw UniquenessViolationException();
		«ENDIF»
	«ENDIF»	
		}
		
		if (getRowByKey(
	«FOR param : table.keyAttributes SEPARATOR ","»
			x->get«param.UpperCaseName»()
	«ENDFOR»		
		)) throw DuplicateKey("Duplicate key exception in ", "«table.name»Table");
		
		row.push_back(x);
		privateRows.push_back(x);
		x->isAdded(true);
		return x;	
	}
	'''
	
	
	def toFile(AlmaTable table)'''
	void «table.name»Table::toFile(string directory) {
		if (!directoryExists(directory.c_str()) &&
			!createPath(directory.c_str())) {
			throw ConversionException("Could not create directory " , directory);
		}

		string fileName = directory + "/«table.name».xml";
		ofstream tableout(fileName.c_str(),ios::out|ios::trunc);
		if (tableout.rdstate() == ostream::failbit)
			throw ConversionException("Could not open file " + fileName + " to write ", "«table.name»");
		if (fileAsBin) 
			tableout << MIMEXMLPart();
		else
			tableout << toXML() << endl;
		tableout.close();
		if (tableout.rdstate() == ostream::failbit)
			throw ConversionException("Could not close file " + fileName, "«table.name»");

		if (fileAsBin) {
			// write the bin serialized
			string fileName = directory + "/«table.name».bin";
			ofstream tableout(fileName.c_str(),ios::out|ios::trunc);
			if (tableout.rdstate() == ostream::failbit)
				throw ConversionException("Could not open file " + fileName + " to write ", "«table.name»");
			tableout << toMIME() << endl;
			tableout.close();
			if (tableout.rdstate() == ostream::failbit)
				throw ConversionException("Could not close file " + fileName, "«table.name»");
		}
	}
	'''
	
	def append(AlmaTable table)'''
	void «table.name»Table::append(«table.name»Row *x) {
		privateRows.push_back(x);
		x->isAdded(true);
	}
	'''
	
	
	def getters(AlmaTable table)'''
	vector<«table.name»Row *> «table.name»Table::get() {
		checkPresenceInMemory();
		return privateRows;
	}
		 
	const vector<«table.name»Row *>& «table.name»Table::get() const {
		const_cast<«table.name»Table&>(*this).checkPresenceInMemory();
		return privateRows;
	}	 
		 
	'''
	
	
	def gettersTemporal(AlmaTable table)'''
	«/* Implementation of methods returning rows of temporal tables*/»
	«IF table.NoAutoIncrementableAttribute»
		«/* This table has NO autoincrementable attribute*/»
		«IF table.keyNoAutoIncNoTimeAttributes.size != 0»
			vector<«table.name»Row *> *«table.name»Table::getByContext(«table.KeyNoAutoIncNoTimeCpp») {
				//if (getContainer().checkRowUniqueness() == false)
				//throw IllegalAccessException ("The method 'getByContext' can't be called because the dataset has been built without checking the row uniqueness.", "«table.name»Table");

				heckPresenceInMemory();
				string k = Key(«table.KeyNoAutoIncNoTimeAttributesList»);

				if (context.find(k) == context.end()) return 0;
				else return &(context[k]);		
			}		
		«ENDIF»
	«ENDIF»
	
	«IF !table.KeyCpp.equals("")»
		«IF table.NoAutoIncrementableAttribute»
		«/* There is no autoincrementable attribute*/»
			«IF table.KeyNoAutoIncNoTimeAttributes.size != 0»
			«/* There are others attributes than the temporal one in the Key section*/»
			/*
			 ** Returns a «table.name»Row* given a key.
			 ** @return a pointer to the row having the key whose values are passed as parameters, or 0 if
			 ** no row exists for that key.
			 **
			 */
				 «IF table.TemporalAttribute.CppType.equals("ArrayTimeInterval")»
				 «/* The temporal attribute is an ArrayTimeInterval */»
				 «table.name»Row* «table.name»Table::getRowByKey(«table.KeyCpp»)  {
				 		checkPresenceInMemory();
				  		string keystr = Key(«table.KeyNoAutoIncNoTimeAttributesList»);
				  		vector<«table.name»Row *> row;
				  		
				  		if ( context.find(keystr)  == context.end()) return 0;
				  		
				  		row = context[keystr];
				  		
				  		// Is the vector empty...impossible in principle !
				  		if (row.size() == 0) return 0;
				  		
				  		// Only one element in the vector
				  		if (row.size() == 1) {
				  			«table.name»Row* r = row.at(0);
				  			if ( r->get«table.TemporalAttribute.UpperCaseName»().contains(timeInterval.getStart()))
				  				return r;
				  			else
				  				return 0;
				  		}
				  		
				  		// Optimizations
				  		«table.name»Row* last = row.at(row.size()-1);
				  		if (timeInterval.getStart().get() >= (last->get«table.TemporalAttribute.UpperCaseName»().getStart().get()+last->get«table.TemporalAttribute.UpperCaseName»().getDuration().get())) return 0;
				  		
				  		«table.name»Row* first = row.at(0);
				  		if (timeInterval.getStart().get() < first->get«table.TemporalAttribute.UpperCaseName»().getStart().get()) return 0;
				  		
				  		
				  		// More than one row 
				  		// Let's use a dichotomy method for the general case..	
				  		int k0 = 0;
				  		int k1 = row.size() - 1;
				  		«table.name»Row* r = 0;
				  		while (k0!=k1) {
				  		
				  			// Is the start time contained in the time interval of row #k0
				  			r = row.at(k0);
				  			if (r->get«table.TemporalAttribute.UpperCaseName»().contains(timeInterval.getStart())) return r;
				  			
				  			// Is the start contained in the time interval of row #k1
				  			r = row.at(k1);
				 			if (r->get«table.TemporalAttribute.UpperCaseName»().contains(timeInterval.getStart())) return r;
				 			
				 			// Are the rows #k0 and #k1 consecutive
				 			// Then we know for sure that there is no row containing the start of timeInterval
				 			if (k1==(k0+1)) return 0;
				 			
				 			// Proceed to the next step of dichotomy.
				 			r = row.at((k0+k1)/2);
				 			if ( timeInterval.getStart().get() <= r->get«table.TemporalAttribute.UpperCaseName»().getStart().get())
				 				k1 = (k0 + k1) / 2;
				 			else
				 				k0 = (k0 + k1) / 2;
				 		}
				 		return 0;	
				 	}
				 «ELSEIF table.TemporalAttribute.CppType.equals("ArrayTime")»
				 «/* The temporal attribute is an ArrayTimeInterval */»
				 «table.name»Row* «table.name»Table::getRowByKey(«table.KeyCpp»)  {
				  	checkPresenceInMemory();
				 	string keystr = Key(«table.KeyNoAutoIncNoTimeAttributesList»);
				  		
				  	if (context.find(keystr) == context.end()) return 0;
				  		
				  	vector<«table.name»Row* > row = context[keystr];
				  		
				  	// Is the vector empty...impossible in principle !
				 	if (row.size() == 0) return 0;
				 		
				 	// Only one element in the vector
				 	if (row.size() == 1) {
				 		if (time.get() == row.at(0)->getTime().get())
				 			return row.at(0);
				 		else
				 			return 0;	
				 	}
				 		
				 	// Optimizations 
				 	«table.name»Row* last = row.at(row.size()-1);		
				 	if (time.get() > last->get«table.TemporalAttribute.UpperCaseName»().get()) return 0;
				 	«table.name»Row* first = row.at(0);
				 	if (time.get() < first->get«table.TemporalAttribute.UpperCaseName»().get()) return 0;
				 		
				 	// More than one row
				 	// let's use a dichotomy method for the general case..		
				 	int k0 = 0;
				 	int k1 = row.size() - 1;    	  
				 	while (k0 !=  k1 ) {
				 		if (time.get() == row.at(k0)->get«table.TemporalAttribute.UpperCaseName»().get()) {
				 			return row.at(k0);
				 		}
				 		else if (time.get() == row.at(k1)->get«table.TemporalAttribute.UpperCaseName»().get()) {
				 			return row.at(k1);
				 		}
				 		else {
				 			if (time.get() <= row.at((k0+k1)/2)->get«table.TemporalAttribute.UpperCaseName»().get())
				 				k1 = (k0 + k1) / 2;
				 			else
				 				k0 = (k0 + k1) / 2;				
				 		} 	
				 	}
				 		return 0; 			
				 }
				 «ENDIF»
			«ELSE»
			«/* The key section has only one attribute : the temporal one*/»
			/*
			 ** Returns a «table.name»Row* given a key.
			 ** @return a pointer to the row having the key whose values are passed as parameters, or 0 if
			 ** no row exists for that key.
			 **
			 */
			 «table.name»Row* «table.name»Table::getRowByKey(«table.KeyCpp»)  {
			 	checkPresenceInMemory();
				«table.name»Row* aRow = 0;
				for (unsigned int i = 0; i < privateRows.size(); i++) {
					aRow = row.at(i);
					if (aRow->«table.TemporalAttribute.name».contains(«table.TemporalAttribute.name».getStart())) return aRow;
				}
				return 0;		
			}
			«ENDIF»
		«ELSE»
		«/* There is an autoincrementable attribute*/»
			«IF table.KeyNoAutoIncNoTimeAttributes.size != 0»
			«/* There are other attributes than the autoincrementable and temporal ones in the key section*/» 
			/*
			 ** Returns a «table.name»Row* given a key.
			 ** @return a pointer to the row having the key whose values are passed as parameters, or 0 if
			 ** no row exists for that key.
			 **
			 */
			«table.name»Row* «table.name»Table::getRowByKey(«table.KeyCpp»)  {
				checkPresenceInMemory();	
				ArrayTime start = «table.TemporalAttribute.name».getStart();
				
				map<string, ID_TIME_ROWS >::iterator mapIter;
				if ((mapIter = context.find(Key(«table.KeyNoAutoIncNoTimeAttributesList»))) != context.end()) {
					«IF table.TheAutoIncrementableAttribute.CppType.equals("Tag")»
					int id = Integer.parseInt(«table.TheAutoIncrementableAttribute.name».getId());
					«ELSE»
					int id = «table.TheAutoIncrementableAttribute.name»;
					«ENDIF»
					if (id < (int) ((*mapIter).second).size()) {
						vector <«table.name»Row*>::iterator rowIter;
						for (rowIter = ((*mapIter).second)[id].begin(); rowIter != ((*mapIter).second)[id].end(); rowIter++) {
							if ((*rowIter)->get«table.TemporalAttribute.UpperCaseName»().contains(«table.TemporalAttribute.name»))
								return *rowIter; 
						}
					}
				}
				return 0;
			}
			
			/*
			 * Returns a vector of pointers on rows whose key element «table.TheAutoIncrementableAttribute.name» 
			 * is equal to the parameter «table.TheAutoIncrementableAttribute.name».
			 * @return a vector of vector <«table.name»Row *>. A returned vector of size 0 means that no row has been found.
			 * @param «table.TheAutoIncrementableAttribute.name» «table.TheAutoIncrementableAttribute.CppType» contains the value of
			 * the autoincrementable attribute that is looked up in the table.
			 */
			 vector <«table.name»Row *>  «table.name»Table::getRowBy«table.TheAutoIncrementableAttribute.UpperCaseName»(«table.TheAutoIncrementableAttribute.CppType» «table.TheAutoIncrementableAttribute.name») {
				checkPresenceInMemory();
				vector<«table.name»Row *> list;
				map<string, ID_TIME_ROWS >::iterator mapIter;
				
				for (mapIter=context.begin(); mapIter!=context.end(); mapIter++) {
					int maxId = ((*mapIter).second).size();
					if («table.TheAutoIncrementableAttribute.name» < maxId) {
						vector<«table.name»Row *>::iterator rowIter;
						for (rowIter=((*mapIter).second)[«table.TheAutoIncrementableAttribute.name»].begin(); 
						     rowIter!=((*mapIter).second)[«table.TheAutoIncrementableAttribute.name»].end(); rowIter++)
							list.push_back(*rowIter);
					}
				}
				return list;
			 }
			«ELSE»
			 «/* There are NO other attributes than the autoincrementable and temporal ones in the key section*/»
			«ENDIF»
		«ENDIF»
		«IF !table.NoAutoIncrementableAttribute && table.requiredNoAutoIncrementableAttributes.size != 0»
		/**
		 * Look up the table for a row whose all attributes «IF !table.NoAutoIncrementableAttribute» except the autoincrementable one «ENDIF»
		 * are equal to the corresponding parameters of the method.
		 * @return a pointer on this row if any, 0 otherwise.
		 *
		«FOR attr : table.requiredNoAutoIncrementableAttributes»
		 * @param «attr».
		«ENDFOR» 
		 */
		«table.name»Row* «table.name»Table::lookup(«table.RequiredNoAutoIncrementableCpp») {	
				using asdm::ArrayTimeInterval;
				map<string, ID_TIME_ROWS >::iterator mapIter;
				string k = Key(«table.KeyNoAutoIncNoTimeAttributesList»);
				if ((mapIter = context.find(k)) != context.end()) {
					ID_TIME_ROWS::iterator planeIter;
					for (planeIter = context[k].begin(); planeIter != context[k].end(); planeIter++)  {
						vector <«table.name»Row*>::iterator rowIter;
						for (rowIter = (*planeIter).begin(); rowIter != (*planeIter).end(); rowIter++) {
							if ((*rowIter)->get«table.TemporalAttribute.UpperCaseName»().contains(«table.TemporalAttribute.name»)
							    && (*rowIter)->compareRequiredValue(«table.requiredValueAttributes»)) {
								return *rowIter;
							} 
						}
					}
				}				
				return 0;	
		}
		«ENDIF»
	«ENDIF»
	'''
	
	
	def gettersNotTemporal(AlmaTable table)'''
	«/* Implementation of methods returning rows of non temporal tables*/»
	«IF table.KeyCpp != ""»
	/*
	 ** Returns a «table.name»Row* given a key.
	 ** @return a pointer to the row having the key whose values are passed as parameters, or 0 if
	 ** no row exists for that key.
	 **
	 */
	 	«table.name»Row* «table.name»Table::getRowByKey(«table.KeyCpp»)  {
	 	checkPresenceInMemory();
		«table.name»Row* aRow = 0;
		for (unsigned int i = 0; i < privateRows.size(); i++) {
			aRow = row.at(i);
			«FOR param : table.keyAttributes»
				«IF param.isArrayTimeIntervalType»
					if (!aRow->«param.name».contains(«param.name».getStart())) continue;
				«ELSE»
					if (aRow->«param.name» != «param.name») continue;
				«ENDIF»
			«ENDFOR»
			return aRow;
		}
		return 0;		
	}
	«ENDIF»
	
	«IF table.requiredNoAutoIncrementableAttributes.size != 0»
	/**
	 * Look up the table for a row whose all attributes «IF !table.NoAutoIncrementableAttribute» except the autoincrementable one «ENDIF»
	 * are equal to the corresponding parameters of the method.
	 * @return a pointer on this row if any, 0 otherwise.
	 *
	«FOR attr : table.requiredNoAutoIncrementableAttributes»
	 * @param «attr.name».
	«ENDFOR» 
	 */
	«table.name»Row* «table.name»Table::lookup(«table.RequiredNoAutoIncrementableCpp») {
			«table.name»Row* aRow;
			for (unsigned int i = 0; i < privateRows.size(); i++) {
				aRow = privateRows.at(i); 
				if (aRow->compareNoAutoInc(«table.RequiredNoAutoIncrementableAttributesList»)) return aRow;
			}			
			return 0;	
	} 
	«ENDIF»
	
	
	«IF !table.NoAutoIncrementableAttribute && table.keyNoAutoIncrementableAttributes.size != 0» 	
	/*
	 * Returns a vector of pointers on rows whose key element «table.TheAutoIncrementableAttribute.name» 
	 * is equal to the parameter «table.TheAutoIncrementableAttribute.name».
	 * @return a vector of vector <«table.name»Row *>. A returned vector of size 0 means that no row has been found.
	 * @param «table.TheAutoIncrementableAttribute.name» «table.TheAutoIncrementableAttribute.CppType» contains the value of
	 * the autoincrementable attribute that is looked up in the table.
	 */
	 vector <«table.name»Row *>  «table.name»Table::getRowBy«table.TheAutoIncrementableAttribute.UpperCaseName»(«table.TheAutoIncrementableAttribute.CppType» «table.TheAutoIncrementableAttribute.name») {
		checkPresenceInMemory();
		vector<«table.name»Row *> list;
		for (unsigned int i = 0; i < row.size(); ++i) {
			«table.name»Row &x = *row[i];
			«IF table.TheAutoIncrementableAttribute.JavaType == "Tag"»
			if (x.«table.TheAutoIncrementableAttribute.name».equals(«table.TheAutoIncrementableAttribute.name»))
				«ELSE»			
			if (x.«table.TheAutoIncrementableAttribute.name» == «table.TheAutoIncrementableAttribute.name»)
				«ENDIF»
			list.push_back(row[i]);
		}
		//if (list.size() == 0) throw  NoSuchRow("","«table.name»");
		return list;	
	 }
		«ENDIF»
	'''
	
	
	def toXML(AlmaTable table)'''
	string «table.name»Table::toXML()  {
		string buf;

		buf.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> ");
		buf.append("<«table.name»Table xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:«table.xmlnsPrefix»=\"http://Alma/XASDM/«table.name»Table\" xsi:schemaLocation=\"http://Alma/XASDM/«table.name»Table http://almaobservatory.org/XML/XASDM/«container.version»/«table.name»Table.xsd\" schemaVersion=\"«container.version»\" schemaRevision=\"«AlmaTableContainer.revision»\">\n");
	
		buf.append(entity.toXML());
		string s = container.getEntity().toXML();
		// Change the "Entity" tag to "ContainerEntity".
		buf.append("<Container" + s.substr(1,s.length() - 1)+" ");
		vector<«table.name»Row*> v = get();
		for (unsigned int i = 0; i < v.size(); ++i) {
			try {
				buf.append(v[i]->toXML());
			} catch (NoSuchRow e) {
			}
			buf.append("  ");
		}		
		buf.append("</«table.name»Table> ");
		return buf;
	}
	'''
	
	
	def fromXML(AlmaTable table)'''
	string «table.name»Table::getVersion() const {
		return version;
	}
	

	void «table.name»Table::fromXML(string& tableInXML)  {
		//
		// Look for a version information in the schemaVersion of the XML
		//
		xmlDoc *doc;
		doc = xmlReadMemory(tableInXML.data(), tableInXML.size(), "XMLTableHeader.xml", NULL, XML_PARSE_NOBLANKS);
		if ( doc == NULL )
			throw ConversionException("Failed to parse the xmlHeader into a DOM structure.", "«table.name»");
		
		xmlNode* root_element = xmlDocGetRootElement(doc);
		if ( root_element == NULL || root_element->type != XML_ELEMENT_NODE )
			throw ConversionException("Failed to retrieve the root element in the DOM structure.", "«table.name»");

		xmlChar * propValue = xmlGetProp(root_element, (const xmlChar *) "schemaVersion");
		if ( propValue != 0 ) {
		version = string( (const char*) propValue);
			xmlFree(propValue);   		
		}

		Parser xml(tableInXML);
		if (!xml.isStr("<«table.name»Table")) 
			error();
		// cout << "Parsing a «table.name»Table" << endl;
		string s = xml.getElement("<Entity","/>");
		if (s.length() == 0) 
			error();
		Entity e;
		e.setFromXML(s);
		if (e.getEntityTypeName() != "«table.name»Table")
			error();
		setEntity(e);
		// Skip the container's entity; but, it has to be there.
		s = xml.getElement("<ContainerEntity","/>");
		if (s.length() == 0) 
			error();

		// Get each row in the table.
		s = xml.getElementContent("<row>","</row>");
		«table.name»Row *row;
		if (getContainer().checkRowUniqueness()) {
			try {
				while (s.length() != 0) {
					row = newRow();
					row->setFromXML(s);
					checkAndAdd(row);
					s = xml.getElementContent("<row>","</row>");
				}
				
			}
			catch (DuplicateKey e1) {
				throw ConversionException(e1.getMessage(),"«table.name»Table");
			} 
			catch (UniquenessViolationException e1) {
				throw ConversionException(e1.getMessage(),"«table.name»Table");	
			}
			catch (...) {
				// cout << "Unexpected error in «table.name»Table::checkAndAdd called from «table.name»Table::fromXML " << endl;
			}
		}
		else {
			try {
				while (s.length() != 0) {
					row = newRow();
					row->setFromXML(s);
					addWithoutCheckingUnique(row);
					s = xml.getElementContent("<row>","</row>");
				}
			}
			catch (DuplicateKey e1) {
				throw ConversionException(e1.getMessage(),"«table.name»Table");
			} 
			catch (...) {
				// cout << "Unexpected error in «table.name»Table::addWithoutCheckingUnique called from «table.name»Table::fromXML " << endl;
			}
		}				
				
				
		if (!xml.isStr("</«table.name»Table>")) 
		error();
		// Changed 24 Sep, 2015 - The export policy cannot be changed by what has been observed at import time. M Caillat.			
		//archiveAsBin = false;
		//fileAsBin = false;
		
	}
	
	'''
	
	
	def toMIME(AlmaTable table)'''
	string «table.name»Table::MIMEXMLPart(const asdm::ByteOrder* byteOrder) {
		string UID = getEntity().getEntityId().toString();
		string withoutUID = UID.substr(6);
		string containerUID = getContainer().getEntity().getEntityId().toString();
		ostringstream oss;
		oss << "<?xml version='1.0'  encoding='ISO-8859-1'?>";
		oss << "\n";
		oss << "<«table.name»Table xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:«table.xmlnsPrefix»=\"http://Alma/XASDM/«table.name»Table\" xsi:schemaLocation=\"http://Alma/XASDM/«table.name»Table http://almaobservatory.org/XML/XASDM/«container.version»/«table.name»Table.xsd\" schemaVersion=\"«container.version»\" schemaRevision=\"«AlmaTableContainer.revision»\">\n";
		oss<< "<Entity entityId='"<<UID<<"' entityIdEncrypted='na' entityTypeName='«MMUtil.UpperCaseName(table.name)»Table' schemaVersion='1' documentVersion='1'/>\n";
		oss<< "<ContainerEntity entityId='"<<containerUID<<"' entityIdEncrypted='na' entityTypeName='ASDM' schemaVersion='1' documentVersion='1'/>\n";
		oss << "<BulkStoreRef file_id='"<<withoutUID<<"' byteOrder='"<<byteOrder->toString()<<"' />\n";
		oss << "<Attributes>\n";
		«FOR ra : table.requiredAttributes»
		oss << "<«ra.name»/>\n"; «ENDFOR»
		«FOR oa : table.optionalValueAttributes»
		oss << "<«oa.name»/>\n"; «ENDFOR»
		oss << "</Attributes>\n";		
		oss << "</«table.name»Table>\n";

		return oss.str();				
	}
	
	string «table.name»Table::toMIME(const asdm::ByteOrder* byteOrder) {
		EndianOSStream eoss(byteOrder);
		
		string UID = getEntity().getEntityId().toString();
		
		// The MIME Header
		eoss <<"MIME-Version: 1.0";
		eoss << "\n";
		eoss << "Content-Type: Multipart/Related; boundary='MIME_boundary'; type='text/xml'; start= '<header.xml>'";
		eoss <<"\n";
		eoss <<"Content-Description: Correlator";
		eoss <<"\n";
		eoss <<"alma-uid:" << UID;
		eoss <<"\n";
		eoss <<"\n";		
		
		// The MIME XML part header.
		eoss <<"--MIME_boundary";
		eoss <<"\n";
		eoss <<"Content-Type: text/xml; charset='ISO-8859-1'";
		eoss <<"\n";
		eoss <<"Content-Transfer-Encoding: 8bit";
		eoss <<"\n";
		eoss <<"Content-ID: <header.xml>";
		eoss <<"\n";
		eoss <<"\n";
		
		// The MIME XML part content.
		eoss << MIMEXMLPart(byteOrder);

		// The MIME binary part header
		eoss <<"--MIME_boundary";
		eoss <<"\n";
		eoss <<"Content-Type: binary/octet-stream";
		eoss <<"\n";
		eoss <<"Content-ID: <content.bin>";
		eoss <<"\n";
		eoss <<"\n";	
		
		// The MIME binary content
		entity.toBin(eoss);
		container.getEntity().toBin(eoss);
		eoss.writeInt((int) privateRows.size());
		for (unsigned int i = 0; i < privateRows.size(); i++) {
			privateRows.at(i)->toBin(eoss);	
		}
		
		// The closing MIME boundary
		eoss << "\n--MIME_boundary--";
		eoss << "\n";
		
		return eoss.str();	
	}
	'''
	
	
	def setFromMIME(AlmaTable table)'''
	void «table.name»Table::setFromMIME(const string & mimeMsg) {
	    string xmlPartMIMEHeader = "Content-ID: <header.xml>\n\n";
	    
	    string binPartMIMEHeader = "--MIME_boundary\nContent-Type: binary/octet-stream\nContent-ID: <content.bin>\n\n";
	    
	    // Detect the XML header.
	    string::size_type loc0 = mimeMsg.find(xmlPartMIMEHeader, 0);
	    if ( loc0 == string::npos) {
	      // let's try with CRLFs
	      xmlPartMIMEHeader = "Content-ID: <header.xml>\r\n\r\n";
	      loc0 = mimeMsg.find(xmlPartMIMEHeader, 0);
	      if  ( loc0 == string::npos ) 
		      throw ConversionException("Failed to detect the beginning of the XML header", "«table.name»");
	    }
	
	    loc0 += xmlPartMIMEHeader.size();
	    
	    // Look for the string announcing the binary part.
	    string::size_type loc1 = mimeMsg.find( binPartMIMEHeader, loc0 );
	    
	    if ( loc1 == string::npos ) {
	      throw ConversionException("Failed to detect the beginning of the binary part", "«table.name»");
	    }
	    
	    //
	    // Extract the xmlHeader and analyze it to find out what is the byte order and the sequence
	    // of attribute names.
	    //
	    string xmlHeader = mimeMsg.substr(loc0, loc1-loc0);
	    xmlDoc *doc;
	    doc = xmlReadMemory(xmlHeader.data(), xmlHeader.size(), "BinaryTableHeader.xml", NULL, XML_PARSE_NOBLANKS);
	    if ( doc == NULL ) 
	      throw ConversionException("Failed to parse the xmlHeader into a DOM structure.", "«table.name»");
	    
	   // This vector will be filled by the names of  all the attributes of the table
	   // in the order in which they are expected to be found in the binary representation.
	   //
	    vector<string> attributesSeq;
	      
	    xmlNode* root_element = xmlDocGetRootElement(doc);
	    if ( root_element == NULL || root_element->type != XML_ELEMENT_NODE )
	      throw ConversionException("Failed to parse the xmlHeader into a DOM structure.", "«table.name»");
	    
	    const ByteOrder* byteOrder=0;
	    if ( string("ASDMBinaryTable").compare((const char*) root_element->name) == 0) {
	      // Then it's an "old fashioned" MIME file for tables.
	      // Just try to deserialize it with Big_Endian for the bytes ordering.
	      byteOrder = asdm::ByteOrder::Big_Endian;
	      
	 	 //
	    // Let's consider a  default order for the sequence of attributes.
	    //
	    «IF table.name == "Pointing"»
	    	attributesSeq.push_back("antennaId");
	    attributesSeq.push_back("timeInterval");
	    attributesSeq.push_back("numSample");
	    attributesSeq.push_back("encoder");
	    attributesSeq.push_back("pointingTracking");
	    attributesSeq.push_back("usePolynomials");
	    attributesSeq.push_back("timeOrigin");
	    attributesSeq.push_back("numTerm");
	    attributesSeq.push_back("pointingDirection");
	    attributesSeq.push_back("target");
	    attributesSeq.push_back("offset");
	    attributesSeq.push_back("pointingModelId");
	    attributesSeq.push_back("overTheTop");
	    attributesSeq.push_back("sourceOffset");
	    attributesSeq.push_back("sourceOffsetReferenceCode");
	    attributesSeq.push_back("sourceOffsetEquinox");
	    attributesSeq.push_back("sampledTimeInterval");    	
	    «ELSE»
	    «FOR ra : table.requiredAttributes» 
	    attributesSeq.push_back("«ra.name»") ; 
	    «ENDFOR»
	    «FOR oa : table.optionalValueAttributes» 
	    attributesSeq.push_back("«oa.name»") ; 
	    «ENDFOR»
	    «ENDIF» 
	    
	    
	    // And decide that it has version == "2"
	    version = "2";         
	     }
	    else if (string("«table.name»Table").compare((const char*) root_element->name) == 0) {
	      // It's a new (and correct) MIME file for tables.
	      //
	      // 1st )  Look for a BulkStoreRef element with an attribute byteOrder.
	      //
	      xmlNode* bulkStoreRef = 0;
	      xmlNode* child = root_element->children;
	      
	      if (xmlHasProp(root_element, (const xmlChar*) "schemaVersion")) {
	      	xmlChar * value = xmlGetProp(root_element, (const xmlChar *) "schemaVersion");
	      	version = string ((const char *) value);
	      	xmlFree(value);	
	      }
	      
	      // Skip the two first children (Entity and ContainerEntity).
	      bulkStoreRef = (child ==  0) ? 0 : ( (child->next) == 0 ? 0 : child->next->next );
	      
	      if ( bulkStoreRef == 0 || (bulkStoreRef->type != XML_ELEMENT_NODE)  || (string("BulkStoreRef").compare((const char*) bulkStoreRef->name) != 0))
	      	throw ConversionException ("Could not find the element '/«table.name»Table/BulkStoreRef'. Invalid XML header '"+ xmlHeader + "'.", "«table.name»");
	      	
	      // We found BulkStoreRef, now look for its attribute byteOrder.
	      _xmlAttr* byteOrderAttr = 0;
	      for (struct _xmlAttr* attr = bulkStoreRef->properties; attr; attr = attr->next) 
		  if (string("byteOrder").compare((const char*) attr->name) == 0) {
		   byteOrderAttr = attr;
		   break;
		 }
	      
	      if (byteOrderAttr == 0) 
		     throw ConversionException("Could not find the element '/«table.name»Table/BulkStoreRef/@byteOrder'. Invalid XML header '" + xmlHeader +"'.", "«table.name»");
	      
	      string byteOrderValue = string((const char*) byteOrderAttr->children->content);
	      if (!(byteOrder = asdm::ByteOrder::fromString(byteOrderValue)))
			throw ConversionException("No valid value retrieved for the element '/«table.name»Table/BulkStoreRef/@byteOrder'. Invalid XML header '" + xmlHeader + "'.", "«table.name»");
			
		 //
		 // 2nd) Look for the Attributes element and grab the names of the elements it contains.
		 //
		 xmlNode* attributes = bulkStoreRef->next;
	     if ( attributes == 0 || (attributes->type != XML_ELEMENT_NODE)  || (string("Attributes").compare((const char*) attributes->name) != 0))	 
	       	throw ConversionException ("Could not find the element '/«table.name»Table/Attributes'. Invalid XML header '"+ xmlHeader + "'.", "«table.name»");
	 
	 	xmlNode* childOfAttributes = attributes->children;
	 	
	 	while ( childOfAttributes != 0 && (childOfAttributes->type == XML_ELEMENT_NODE) ) {
	 		attributesSeq.push_back(string((const char*) childOfAttributes->name));
	 		childOfAttributes = childOfAttributes->next;
	    }
	    }
	    // Create an EndianISStream from the substring containing the binary part.
	    EndianISStream eiss(mimeMsg.substr(loc1+binPartMIMEHeader.size()), byteOrder);
	    
	    entity = Entity::fromBin((EndianIStream&) eiss);
	    
	    // We do nothing with that but we have to read it.
	    Entity containerEntity = Entity::fromBin((EndianIStream&) eiss);
	
		// Let's read numRows but ignore it and rely on the value specified in the ASDM.xml file.    
	    int numRows = ((EndianIStream&) eiss).readInt();
	    if ((numRows != -1)                        // Then these are *not* data produced at the EVLA.
	    	&& ((unsigned int) numRows != this->declaredSize )) { // Then the declared size (in ASDM.xml) is not equal to the one 
	    	                                       // written into the binary representation of the table.
			cout << "The a number of rows ('" 
				 << numRows
				 << "') declared in the binary representation of the table is different from the one declared in ASDM.xml ('"
				 << this->declaredSize
				 << "'). I'll proceed with the value declared in ASDM.xml"
				 << endl;
	    }                                           
	
		if (getContainer().checkRowUniqueness()) {
	    	try {
	      		for (uint32_t i = 0; i < this->declaredSize; i++) {
					«table.name»Row* aRow = «table.name»Row::fromBin((EndianIStream&) eiss, *this, attributesSeq);
					checkAndAdd(aRow);
	      		}
	    	}
	    	catch (DuplicateKey e) {
	      		throw ConversionException("Error while writing binary data , the message was "
					+ e.getMessage(), "«table.name»");
	    	}
	    	catch (TagFormatException e) {
	     		 throw ConversionException("Error while reading binary data , the message was "
					+ e.getMessage(), "«table.name»");
	    	}
	    }
	    else {
	 		for (uint32_t i = 0; i < this->declaredSize; i++) {
				«table.name»Row* aRow = «table.name»Row::fromBin((EndianIStream&) eiss, *this, attributesSeq);
				append(aRow);
	      	}   	
	    }
	    // Changed 24 Sep, 2015 - The export policy cannot be changed by what has been observed at import time. M Caillat
	    // archiveAsBin = true;
	    // fileAsBin = true;
		}
		
		void «table.name»Table::setUnknownAttributeBinaryReader(const string& attributeName, BinaryAttributeReaderFunctor* barFctr) {
			//
			// Is this attribute really unknown ?
			//
			for (vector<string>::const_iterator iter = attributesNamesOf«table.name»_v.begin(); iter != attributesNamesOf«table.name»_v.end(); iter++) {
				if ((*iter).compare(attributeName) == 0) 
					throw ConversionException("the attribute '"+attributeName+"' is known you can't override the way it's read in the MIME binary file containing the table.", "«table.name»"); 
			}
			
			// Ok then register the functor to activate when an unknown attribute is met during the reading of a binary table?
			unknownAttributes2Functors[attributeName] = barFctr;
		}
		
		BinaryAttributeReaderFunctor* «table.name»Table::getUnknownAttributeBinaryReader(const string& attributeName) const {
			map<string, BinaryAttributeReaderFunctor*>::const_iterator iter = unknownAttributes2Functors.find(attributeName);
			return (iter == unknownAttributes2Functors.end()) ? 0 : iter->second;
		}
	'''
	
	
	def setFromFile(AlmaTable table)'''
	void «table.name»Table::setFromFile(const string& directory) {		
	    if (boost::filesystem::exists(boost::filesystem::path(uniqSlashes(directory + "/«table.name».xml"))))
	      setFromXMLFile(directory);
	    else if (boost::filesystem::exists(boost::filesystem::path(uniqSlashes(directory + "/«table.name».bin"))))
	      setFromMIMEFile(directory);
	    else
	      throw ConversionException("No file found for the «table.name» table", "«table.name»");
	}	
	'''
	
	
	def setFromMIMEFile(AlmaTable table)'''
	void «table.name»Table::setFromMIMEFile(const string& directory) {
	    string tablePath ;
	    
	    tablePath = directory + "/«table.name».bin";
	    ifstream tablefile(tablePath.c_str(), ios::in|ios::binary);
	    if (!tablefile.is_open()) { 
	      throw ConversionException("Could not open file " + tablePath, "«table.name»");
	    }
	    // Read in a stringstream.
	    stringstream ss; ss << tablefile.rdbuf();
	    
	    if (tablefile.rdstate() == istream::failbit || tablefile.rdstate() == istream::badbit) {
	      throw ConversionException("Error reading file " + tablePath,"«table.name»");
	    }
	    
	    // And close.
	    tablefile.close();
	    if (tablefile.rdstate() == istream::failbit)
	      throw ConversionException("Could not close file " + tablePath,"«table.name»");
	    
	    setFromMIME(ss.str());
	  }	
	/* 
	  void «table.name»Table::openMIMEFile (const string& directory) {
	  		
	  	// Open the file.
	  	string tablePath ;
	    tablePath = directory + "/«table.name».bin";
	    ifstream tablefile(tablePath.c_str(), ios::in|ios::binary);
	    if (!tablefile.is_open())
	      throw ConversionException("Could not open file " + tablePath, "«table.name»");
	      
		// Locate the xmlPartMIMEHeader.
	    string xmlPartMIMEHeader = "CONTENT-ID: <HEADER.XML>\n\n";
	    CharComparator comparator;
	    istreambuf_iterator<char> BEGIN(tablefile.rdbuf());
	    istreambuf_iterator<char> END;
	    istreambuf_iterator<char> it = search(BEGIN, END, xmlPartMIMEHeader.begin(), xmlPartMIMEHeader.end(), comparator);
	    if (it == END) 
	    	throw ConversionException("failed to detect the beginning of the XML header", "«table.name»");
	    
	    // Locate the binaryPartMIMEHeader while accumulating the characters of the xml header.	
	    string binPartMIMEHeader = "--MIME_BOUNDARY\nCONTENT-TYPE: BINARY/OCTET-STREAM\nCONTENT-ID: <CONTENT.BIN>\n\n";
	    string xmlHeader;
	   	CharCompAccumulator compaccumulator(&xmlHeader, 100000);
	   	++it;
	   	it = search(it, END, binPartMIMEHeader.begin(), binPartMIMEHeader.end(), compaccumulator);
	   	if (it == END) 
	   		throw ConversionException("failed to detect the beginning of the binary part", "«table.name»");
	   	
		cout << xmlHeader << endl;
		//
		// We have the xmlHeader , let's parse it.
		//
		xmlDoc *doc;
	    doc = xmlReadMemory(xmlHeader.data(), xmlHeader.size(), "BinaryTableHeader.xml", NULL, XML_PARSE_NOBLANKS);
	    if ( doc == NULL ) 
	      throw ConversionException("Failed to parse the xmlHeader into a DOM structure.", "«table.name»");
	    
	   // This vector will be filled by the names of  all the attributes of the table
	   // in the order in which they are expected to be found in the binary representation.
	   //
	    vector<string> attributesSeq(attributesNamesInBinOf«table.name»_v);
	      
	    xmlNode* root_element = xmlDocGetRootElement(doc);
	    if ( root_element == NULL || root_element->type != XML_ELEMENT_NODE )
	      throw ConversionException("Failed to parse the xmlHeader into a DOM structure.", "«table.name»");
	    
	    const ByteOrder* byteOrder=0;
	    if ( string("ASDMBinaryTable").compare((const char*) root_element->name) == 0) {
	      // Then it's an "old fashioned" MIME file for tables.
	      // Just try to deserialize it with Big_Endian for the bytes ordering.
	      byteOrder = asdm::ByteOrder::Big_Endian;
	        
	      // And decide that it has version == "2"
	    version = "2";         
	     }
	    else if (string("«table.name»Table").compare((const char*) root_element->name) == 0) {
	      // It's a new (and correct) MIME file for tables.
	      //
	      // 1st )  Look for a BulkStoreRef element with an attribute byteOrder.
	      //
	      xmlNode* bulkStoreRef = 0;
	      xmlNode* child = root_element->children;
	      
	      if (xmlHasProp(root_element, (const xmlChar*) "schemaVersion")) {
	      	xmlChar * value = xmlGetProp(root_element, (const xmlChar *) "schemaVersion");
	      	version = string ((const char *) value);
	      	xmlFree(value);	
	      }
	      
	      // Skip the two first children (Entity and ContainerEntity).
	      bulkStoreRef = (child ==  0) ? 0 : ( (child->next) == 0 ? 0 : child->next->next );
	      
	      if ( bulkStoreRef == 0 || (bulkStoreRef->type != XML_ELEMENT_NODE)  || (string("BulkStoreRef").compare((const char*) bulkStoreRef->name) != 0))
	      	throw ConversionException ("Could not find the element '/«table.name»Table/BulkStoreRef'. Invalid XML header '"+ xmlHeader + "'.", "«table.name»");
	      	
	      // We found BulkStoreRef, now look for its attribute byteOrder.
	      _xmlAttr* byteOrderAttr = 0;
	      for (struct _xmlAttr* attr = bulkStoreRef->properties; attr; attr = attr->next) 
		  if (string("byteOrder").compare((const char*) attr->name) == 0) {
		   byteOrderAttr = attr;
		   break;
		 }
	      
	      if (byteOrderAttr == 0) 
		     throw ConversionException("Could not find the element '/«table.name»Table/BulkStoreRef/@byteOrder'. Invalid XML header '" + xmlHeader +"'.", "«table.name»");
	      
	      string byteOrderValue = string((const char*) byteOrderAttr->children->content);
	      if (!(byteOrder = asdm::ByteOrder::fromString(byteOrderValue)))
			throw ConversionException("No valid value retrieved for the element '/«table.name»Table/BulkStoreRef/@byteOrder'. Invalid XML header '" + xmlHeader + "'.", "«table.name»");
			
		 //
		 // 2nd) Look for the Attributes element and grab the names of the elements it contains.
		 //
		 xmlNode* attributes = bulkStoreRef->next;
	     if ( attributes == 0 || (attributes->type != XML_ELEMENT_NODE)  || (string("Attributes").compare((const char*) attributes->name) != 0))	 
	       	throw ConversionException ("Could not find the element '/«table.name»Table/Attributes'. Invalid XML header '"+ xmlHeader + "'.", "«table.name»");
	 
	 	xmlNode* childOfAttributes = attributes->children;
	 	
	 	while ( childOfAttributes != 0 && (childOfAttributes->type == XML_ELEMENT_NODE) ) {
	 		attributesSeq.push_back(string((const char*) childOfAttributes->name));
	 		childOfAttributes = childOfAttributes->next;
	    }
	    }
	    // Create an EndianISStream from the substring containing the binary part.
	    EndianIFStream eifs(&tablefile, byteOrder);
	    
	    entity = Entity::fromBin((EndianIStream &) eifs);
	    
	    // We do nothing with that but we have to read it.
	    Entity containerEntity = Entity::fromBin((EndianIStream &) eifs);
	
		// Let's read numRows but ignore it and rely on the value specified in the ASDM.xml file.    
	    int numRows = eifs.readInt();
	    if ((numRows != -1)                        // Then these are *not* data produced at the EVLA.
	    	&& ((unsigned int) numRows != this->declaredSize )) { // Then the declared size (in ASDM.xml) is not equal to the one 
	    	                                       // written into the binary representation of the table.
			cout << "The a number of rows ('" 
				 << numRows
				 << "') declared in the binary representation of the table is different from the one declared in ASDM.xml ('"
				 << this->declaredSize
				 << "'). I'll proceed with the value declared in ASDM.xml"
				 << endl;
	    }    
	  } 
	 */
	'''
	
	
	def setFromXMLFile(AlmaTable table)'''
	void «table.name»Table::setFromXMLFile(const string& directory) {
	    string tablePath ;
	    
	    tablePath = directory + "/«table.name».xml";
	    
	    /*
	    ifstream tablefile(tablePath.c_str(), ios::in|ios::binary);
	    if (!tablefile.is_open()) { 
	      throw ConversionException("Could not open file " + tablePath, "«table.name»");
	    }
	      // Read in a stringstream.
	    stringstream ss;
	    ss << tablefile.rdbuf();
	    
	    if  (tablefile.rdstate() == istream::failbit || tablefile.rdstate() == istream::badbit) {
	      throw ConversionException("Error reading file '" + tablePath + "'", "«table.name»");
	    }
	    
	    // And close
	    tablefile.close();
	    if (tablefile.rdstate() == istream::failbit)
	      throw ConversionException("Could not close file '" + tablePath + "'", "«table.name»");
	
	    // Let's make a string out of the stringstream content and empty the stringstream.
	    string xmlDocument = ss.str(); ss.str("");
		
	    // Let's make a very primitive check to decide
	    // whether the XML content represents the table
	    // or refers to it via a <BulkStoreRef element.
	    */
	    
	    string xmlDocument;
	    try {
	    	xmlDocument = getContainer().getXSLTransformer()(tablePath);
	    	if (getenv("ASDM_DEBUG")) cout << "About to read " << tablePath << endl;
	    }
	    catch (XSLTransformerException e) {
	    	throw ConversionException("Caugth an exception whose message is '" + e.getMessage() + "'.", "«table.name»");
	    }
	    
	    if (xmlDocument.find("<BulkStoreRef") != string::npos)
	      setFromMIMEFile(directory);
	    else
	      fromXML(xmlDocument);
	  }
	'''
}