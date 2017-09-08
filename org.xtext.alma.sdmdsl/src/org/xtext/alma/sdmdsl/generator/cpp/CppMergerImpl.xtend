package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppMergerImpl {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file Merger.cpp
		sdmFsa.setFile("src/Merger.cpp")
		sdmFsa.generateFile(generateMergerImpl)
		
	}
	
	
	def generateMergerImpl()'''
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
		 * File Merger.h
		 */
		#include <Merger.h>
		
		using namespace std;
		
		namespace asdm {
			
			Merger::Merger() {
				this->ds1 = («container.name» *) 0;
				this->ds2 = («container.name» *) 0;
				
				«FOR table : container.tables»
					Merger::merge«table.name»Ptr = &Merger::merge«table.name»;
				«ENDFOR»
			}
			
			Merger::~Merger() {
			
			}
			
			void Merger::merge(«container.name»* ds1, «container.name»* ds2) {
				this->ds1 = ds1;
				this->ds2 = ds2;
				
				«FOR table : container.tables»
					hasMerged«table.name» = false;
					merge«table.name»( );
					postMerge«table.name»( );
				«ENDFOR»
			}
			
			
			«FOR table : container.tables»
				void Merger::merge«table.name»() {
					cout << "Entering Merger::merge«table.name»" << endl;
					if (hasMerged«table.name») {
						cout << "Exiting Merger::merge«table.name»" << endl;
						return;
					}
					
					vector <«table.name»Row *> rows2 = ds2->get«table.name»().get();
					
					for (unsigned int i = 0; i < rows2.size(); i++) {
						cout << "Merger::merge«table.name» merging row #" << i << endl;
						«table.name»Row * row = ds1->get«table.name»().newRow(rows2.at(i));
						
						«IF table.RequiredExtrinsicAttributesSet.size != 0 »
							«FOR att : table.RequiredExtrinsicAttributesSet»
								«IF att.isArray»
									«/* If the attribute is an array then process each of its elements */»
									vector<«att.CppType»> «att.name»2 = rows2.at(i)->get«att.UpperCaseName»();
									vector<«att.CppType»> «att.name»1;
									for (unsigned int j = 0; j < «att.name»2.size(); j++)
										«IF att.JavaType.equals("Tag")»
											«att.name»1.push_back(getTag(«att.name»2.at(j), merge«att.refersTo»Ptr));
										«ELSEIF att.isId»
											«att.name»1.push_back(getId("«att.refersTo»", «att.name»2.at(j), merge«att.refersTo»Ptr));
										«ENDIF»
									row->set«att.UpperCaseName»(	«att.name»1);
								«ELSE»
									«/* If the attribute is a simple scalar */»
									«IF att.JavaType.equals("Tag")»
										Tag «att.name»Tag = getTag(row->get«att.UpperCaseName»(), merge«att.refersTo»Ptr);
										row->set«att.UpperCaseName»(«att.name»Tag);
									«ELSEIF att.isId»
										row->set«att.UpperCaseName»(getId("«att.refersTo»", row->get«att.UpperCaseName»(), merge«att.refersTo»Ptr));
									«ENDIF»
								«ENDIF»
							«ENDFOR»
						«ENDIF»
						
						«table.name»Row * retRow = ds1->get«table.name»().add(row);
						if (false) cout << (unsigned long long) retRow;
						
						«IF !table.NoAutoIncrementableAttribute»
							«IF table.TheAutoIncrementableAttribute.JavaType == "Tag"»
								tagTag.insert(make_pair(rows2.at(i)->get«table.TheAutoIncrementableAttribute.UpperCaseName»().toString(), retRow->get«table.TheAutoIncrementableAttribute.UpperCaseName»()));
							«ELSE»
								idId.insert(make_pair("«table.name»_"+Integer::toString(rows2.at(i)->get«table.TheAutoIncrementableAttribute.UpperCaseName»()), retRow->get«table.TheAutoIncrementableAttribute.UpperCaseName»()));
							«ENDIF»
						«ENDIF»
					}
					
					hasMerged«table.name» = true;
					cout << "Exiting Merger::merge«table.name»" << endl;
				}
				
				void Merger::postMerge«table.name»() {
					cout << "Entering Merger::postMerge«table.name»" << endl;
					
					«IF table.OptionalExtrinsicAttributesSet.size != 0»
						vector <«table.name»Row *> rows1 = ds1->get«table.name»().get();
						«table.name»Row *row1 = 0;
						
						for (unsigned int i = 0; i < rows1.size(); i++) {
							row1 = rows1.at(i);
							
							«FOR att : table.OptionalExtrinsicAttributesSet»
								«IF att.isOptional»
									if (row1->is«att.UpperCaseName»Exists()) {
										«IF att.isArray»
											«/* If the attribute is an array then process each of its elements */»
											vector<«att.CppType»> «att.name»1 = row1->get«att.UpperCaseName»();
											vector<«att.CppType»> «att.name»1_new;
											for (unsigned int j = 0; j < «att.name»1.size(); j++) {
												«IF att.JavaType == "Tag"»
													«att.name»1_new.push_back(getTag( «att.name»1.at(j), 0));
												«ELSEIF att.isId»
													«att.name»1_new.push_back(getId("«att.refersTo»", «att.name»1.at(j), 0));
												«ENDIF»
											}
											row1->set«att.UpperCaseName»(	«att.name»1_new);
										«ELSE»
										
											«/* If the attribute is a simple scalar */»
											«IF att.JavaType.equals("Tag")»
												row1->set«att.UpperCaseName»(getTag(row1->get«att.UpperCaseName»(), 0));
											«ELSEIF att.isId»
												row1->set«att.UpperCaseName»(getId("«att.refersTo»", row1->get«att.UpperCaseName»(), 0));
											«ENDIF»
										«ENDIF»
									}
								«ELSE»
									;
								«ENDIF»
							«ENDFOR»
						}
					«ENDIF»
					cout << "Exiting Merger::postMerge«table.name»" << endl;
				}
			«ENDFOR»
			
			Tag Merger::getTag(const Tag& t, void (Merger::*mergeTables)()) {
				if (mergeTables != 0) (this->*mergeTables)();
				
				
				
				map<string, Tag>::iterator iter = tagTag.find(t.toString());
				if (iter!=tagTag.end()) return iter->second;
				
				// Should throw an exception here.
				cout << "Could not find the mapped Tag for " << t.toString() << endl;
				return Tag();
			}
			
			int Merger::getId(const string& tableName, int id, void (Merger::*mergeTables)()) {
				if (mergeTables != 0) (this->*mergeTables)();
				
				map<string, int>::iterator iter = idId.find(tableName+"_"+Integer::toString(id));
				if (iter != idId.end()) return iter->second;
				
				// Should throw an exception here.
				cout << "Could not find the mapped Id for " << id << endl;
				return -1;
			}
			
		} // End of namespace asdm
	'''
	
}