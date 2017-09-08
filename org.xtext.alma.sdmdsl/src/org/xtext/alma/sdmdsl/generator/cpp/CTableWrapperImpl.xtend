package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTable
import alma.hla.datamodel.meta.asdm.AlmaTableContainer

class CTableWrapperImpl {
	
	var container = AlmaTableContainer.instance
	
	
	/*
	 * CTableWrapperImpl generator (append to sdmWrapper.cpp file)
	 */
	def doGenerate() '''
	
	«FOR table : container.tables»
	«table.generateCTableWrapperImpl»
	«ENDFOR»
	
	'''
	
	
	private def generateCTableWrapperImpl(AlmaTable table)'''
	«FOR attr : table.intrinsic»
	«IF attr.isEnumeration»
	using namespace «attr.typeName»Mod;
	«ENDIF»
	«ENDFOR»
	
	
	// =================== «table.name»Table ============================
	
	«IF table.name !="DataDescription"»
	extern "C" int sdm_add«table.name»Row («table.RequiredAddCList»);
	«ELSEIF table.name =="DataDescription"»
	extern "C" int sdm_add«table.name»Row («table.RequiredAddCList», bool * holoType);
	«ENDIF»
	extern "C" int sdm_get«table.name»Row («table.RequiredGetCList»);
	
	
	extern "C" int sdm_get«table.name»TableSize ();
	
	extern "C" int sdm_get«table.name»Keys («table.KeyCTypeList»);
	
	
	/**
	 * Create a new row initialized to the specified values.
	 * @return a pointer on the created and initialized row.
	 */
	
	«IF table.name !="DataDescription"»
	int  sdm_add«table.name»Row («table.RequiredAddCList»){
	«ELSEIF table.name =="DataDescription"»
	int  sdm_add«table.name»Row («table.RequiredAddCList», bool * holoType){
	«ENDIF»
	
	
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
		   	return -1;
		}
		
		try {
		«table.name»Table &table = dataset->get«table.name»();
		«table.name»Row *row = 0;

		«FOR attr : table.requiredAttributes»
		«IF attr.isArray»
		// «attr.name» is an Array
		«IF attr.dimension == 1 || attr.isExtrinsic»
		// «attr.name» is OneD
		«IF  !attr.isStringType»
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[0]);
		for (int i=0;i<«attr.name»Dim[0];i++)
			«attr.name»Vec[i]= «attr.SimpleCppType»(«attr.name»[i]   «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
		«ELSE»
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[2]);
		for (int i=0;i<«attr.name»Dim[2];i++)
			«attr.name»Vec[i]= «attr.SimpleCppType»(«attr.name»+i*«attr.name»Dim[1]  «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
		«ENDIF»
		«ELSEIF attr.dimension == 2»
		// «attr.name» is 2 D
		«IF  !attr.isStringType»
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[2]);   // Inversion of dim in fortran/C
		for (int i=0;i<«attr.name»Dim[2];i++) {
			«attr.name»Vec[i].resize(«attr.name»Dim[0]);
			for (int j=0;j<«attr.name»Dim[0];j++)
				«attr.name»Vec[i][j]= «attr.SimpleCppType»(«attr.name»[i*«attr.name»Dim[1]+j]  «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
		«ELSE»
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[4]);   // Inversion of dim in fortran/C
		for (int i=0;i<«attr.name»Dim[4];i++) {
			«attr.name»Vec[i].resize(«attr.name»Dim[2]);
			for (int j=0;j<«attr.name»Dim[2];j++)
				«attr.name»Vec[i][j]= «attr.SimpleCppType»(«attr.name»+(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1] «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
		«ENDIF»
		
		
		}
		«ELSEIF attr.dimension == 3»
		// «attr.name» is 3 D
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[4]);   // Inversion of dim in fortran/C
		for (int i=0;i<«attr.name»Dim[4];i++) {
			«attr.name»Vec[i].resize(«attr.name»Dim[2]);
			for (int j=0;j<«attr.name»Dim[2];j++) {
				«attr.name»Vec[i][j].resize(«attr.name»Dim[0]);
				for (int k=0;k<«attr.name»Dim[0];k++)
			    «attr.name»Vec[i][j][k]= «attr.SimpleCppType»(«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k] «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
			}
		}
		«ELSEIF attr.dimension == 4»
		// «attr.name» is 4 D
		«attr.CppType»  «attr.name»Vec(«attr.name»Dim[6]);   // Inversion of dim in fortran/C
		for (int i=0;i<«attr.name»Dim[6];i++) {
			«attr.name»Vec[i].resize(«attr.name»Dim[4]);
			for (int j=0;j<«attr.name»Dim[4];j++) {
				«attr.name»Vec[i][j].resize(«attr.name»Dim[2]);
			  	for (int k=0;k<«attr.name»Dim[2];k++) {
			    	«attr.name»Vec[i][j][k].resize(«attr.name»Dim[0]);
			    	for (int l=0;k<«attr.name»Dim[0];l++) 
			    		«attr.name»Vec[i][j][k][l]= «attr.SimpleCppType»(«attr.name»[((i*«attr.name»Dim[5]+j)*«attr.name»Dim[3]+k)*«attr.name»Dim[1]+l] «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
		    	}
			}
		}
		
		«ENDIF»
		«ELSE»
		«IF attr.isEnumeration»
		// «attr.name» is an enumeration
		// «attr.CType» * «attr.name» =  (int) «attr.name»;
		«ENDIF»
		«ENDIF»
		«ENDFOR»
		
		// Create new row
	  
		«IF table.isArrayTimeIntervalKey»
		if (*(timeInterval+1)>0) {
			row = table.newRow(«table.RequiredValueCppFromCList»);
		} else {
			row = table.newRow(«table.RequiredValueCppFromCListWithoutInterval»);
		}
	  	«ELSEIF table.name =="DataDescription"»
		if (*holoType) {
			row = table.newRow(Tag(*polOrHoloId,TagType::Holography), Tag(*spectralWindowId,TagType::SpectralWindow));
		} else {
			row = table.newRow(Tag(*polOrHoloId,TagType::Polarization), Tag(*spectralWindowId,TagType::SpectralWindow));
		}	
		«ELSEIF table.name =="Processor"»
		if (*processorSubType == ProcessorSubTypeMod::ALMA_CORRELATOR_MODE) {
			row = table.newRow(Tag(*modeId, TagType::CorrelatorMode), *processorType, *processorSubType);
		} else if (*processorSubType == ProcessorSubTypeMod::ALMA_RADIOMETER) {
			row = table.newRow(Tag(*modeId, TagType::AlmaRadiometer), *processorType, *processorSubType);
		} else if (*processorSubType == ProcessorSubTypeMod::SQUARE_LAW_DETECTOR)  {
			row = table.newRow(Tag(*modeId, TagType::SquareLawDetector), *processorType, *processorSubType);
		//} else if (*processorSubType == ProcessorSubTypeMod::HOLOGRAPHY)  {
		//	  row = table.newRow(Tag(*modeId, TagType::Holography), *processorType, *processorSubType);
		}
		«ELSE»
		row = table.newRow(«table.RequiredValueCppFromCList»);
		«ENDIF»
	
		// Add row
		«table.name»Row *retRow = table.add(row);
	
		if (retRow != row) {
			//    cout << "Attempt to store a row identical to a row present in the «table.name»Table" << endl;
		}
		
		«IF  table.autoIncrementable.size != 0»
		«FOR attr : table.autoIncrementable»
		«IF attr.isCppStandard»
		return retRow->get«attr.UpperCaseName»();
		«ELSEIF attr.CppType=="Tag"»
		// return atoi((retRow->get«attr.UpperCaseName»().getId()).c_str());
		return retRow->get«attr.UpperCaseName»().getTagValue();
		«ELSE»
		return retRow->get«attr.UpperCaseName»();
		«ENDIF»
		«ENDFOR»
		«ELSE»
		return 0;    // No autoIncrementable attribute
		«ENDIF»
		}
	  	catch (DuplicateKey e) {  // exception thrown if duplicate key and no autoIncrementable attribute
			cout << e.getMessage() << endl;
			return 0;   // No autoIncrementable attribute
		}
		catch (InvalidArgumentException e)  { // exception thrown if Invalid Argument
			cout << e.getMessage() << endl;
			return 0;   // No autoIncrementable attribute
		}
	}
	// -------------------------------------------
	
	
	/**
	 * Returns a «table.name»Row* given a key.
	 */
	int sdm_get«table.name»Row («table.RequiredGetCList») {
		
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
			return -1;
		}
		«table.name»Table &table = dataset->get«table.name»();
		«table.name»Row *row = 0;
		«IF table.isArrayTimeIntervalKey»
		if (*(timeInterval+1)>0)  
			row = table.getRowByKey(«table.KeyCppFromCList»);
		else
			row = table.getRowByKey(«table.KeyCppFromCListWithoutInterval»);
		«ELSEIF table.name =="SquareLawDetector"»
		// row = table.getRowByKey( Tag(*modeId, TagType::SquareLawDetector));
		row = table.getRowByKey(«table.KeyCppFromCList»);
		«ELSE»
		row = table.getRowByKey(«table.KeyCppFromCList»);
		«ENDIF»
		
		
		if (row==0) {
			return -1;
		} else {
			// copy all elements of row in method parameters
			// example: *pressure      = row->getPressure().get();
			«FOR attr : table.requiredAttributes»
			//  attr.NameS:  «attr.name»  attr.UpperCaseName: «attr.UpperCaseName»
			«IF !attr.isKey»
			«IF !attr.isArray»
			«IF attr.isCppStandard»
			*«attr.name» = row->get«attr.UpperCaseName»();
			«ELSEIF attr.CppType=="Tag"»
			// *«attr.name» = atoi((row->get«attr.UpperCaseName»().getId()).c_str());
			*«attr.name» = row->get«attr.UpperCaseName»().getTagValue();
			«ELSEIF attr.CppType=="string"»
			if ((int)row->get«attr.UpperCaseName»().size()<«attr.name»Dim[1])
				strcpy(«attr.name»,row->get«attr.UpperCaseName»().c_str());
			else
				strncpy(«attr.name»,row->get«attr.UpperCaseName»().c_str(),«attr.name»Dim[1]);
			«attr.name»Dim[0] = (int)row->get«attr.UpperCaseName»().size();
			«ELSEIF attr.CppType=="EntityRef"»
			strcpy(«attr.name»,row->get«attr.UpperCaseName»().toString().c_str());
			«ELSEIF attr.CppType=="ArrayTime"»
			*«attr.name»     = row->get«attr.UpperCaseName»().get();
			«ELSEIF attr.CppType=="ArrayTimeInterval"»
			*«attr.name»     = row->get«attr.UpperCaseName»().getStartInNanoSeconds();
			*(«attr.name»+1) = row->get«attr.UpperCaseName»().getDurationInNanoSeconds();
			«ELSE»
			*«attr.name» = row->get«attr.UpperCaseName»().get();
			«ENDIF»
			«ELSE»
			
			«IF attr.dimension == 1 || attr.isExtrinsic»
			«attr.CppType»  «attr.name»Vec = row->get«attr.UpperCaseName»();
			
			«IF attr.isCppStandard»
			for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[1]); i++)
				«attr.name»[i] = «attr.name»Vec[i];
			«attr.name»Dim[0] = (int)«attr.name»Vec.size();  // return dimension of the ASDM table
			
			«ELSEIF attr.SimpleCppType=="Tag"»
			for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[1]); i++)
				//«attr.name»[i] = atoi((row->get«attr.UpperCaseName»()[i]).getId().c_str());
			«attr.name»[i] = «attr.name»Vec[i].getTagValue();
			«attr.name»Dim[0] = (int)«attr.name»Vec.size();  // return dimension of the ASDM table
			
			«ELSEIF attr.SimpleCppType=="string"»
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[3]); i++) {
				if ((int)«attr.name»Vec[i].size()<«attr.name»Dim[1])
					strcpy(«attr.name»+i*«attr.name»Dim[1],«attr.name»Vec[i].c_str());
				else
					strncpy(«attr.name»+i*«attr.name»Dim[1],«attr.name»Vec[i].c_str(),«attr.name»Dim[1]);
				maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimZero«attr.UpperCaseName»);
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = «attr.name»Vec.size();  // number of strings
			
			«ELSE»
			for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[1]); i++)
				«attr.name»[i] = «attr.name»Vec[i].get();
			«attr.name»Dim[0] = «attr.name»Vec.size(); // return dimension of the ASDM table
			«ENDIF»
			
			«ELSEIF attr.dimension == 2»
			«attr.CppType»  «attr.name»Vec = row->get«attr.UpperCaseName»();
			
			«IF attr.isCppStandard»
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0;i<min((int)«attr.name»Vec.size(),«attr.name»Dim[3]) ;i++) {
				maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimZero«attr.UpperCaseName»);
				for (int j=0;j<min((int)«attr.name»Vec[i].size(),«attr.name»Dim[1]) ;j++) {
					«attr.name»[i*«attr.name»Dim[1]+j]= «attr.name»Vec[i][j];
				}
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = «attr.name»Vec.size();  // return dimension of the ASDM
			
			«ELSEIF attr.SimpleCppType=="Tag"»
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0; i<min((int)«attr.name»Vec[i].size(),«attr.name»Dim[3]); i++) {
				maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i][i].size(),maxDimZero«attr.UpperCaseName»);
				for (int j=0; j<min((int)«attr.name»Vec[i][i].size(),«attr.name»Dim[1]) ;j++) {
					// «attr.name»[i*«attr.name»Dim[0]+j] = atoi((row->get«attr.UpperCaseName»()[i][j]).getId().c_str());
					«attr.name»[i*«attr.name»Dim[0]+j] = «attr.name»Vec[i][i][j].getTagValue();
				}
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = «attr.name»Vec.size();  // return dimension of the ASDM
			
			«ELSEIF attr.SimpleCppType=="string"»
			int maxDimTwo«attr.UpperCaseName» = 0;
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0; i< min((int)«attr.name»Vec[i].size(),«attr.name»Dim[5]) ;i++) {
				maxDimTwo«attr.UpperCaseName» = max((int)«attr.name»Vec[i][i].size(),maxDimTwo«attr.UpperCaseName»);
				for (int j=0; j< min((int)«attr.name»Vec[i].size(),«attr.name»Dim[3]) ;j++) {
					if ((int)«attr.name»Vec[i][j].size()>«attr.name»Dim[1])
						strcpy(«attr.name»+(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1],«attr.name»Vec[i][j].c_str());
					else
						strncpy(«attr.name»+(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1],«attr.name»Vec[i][j].c_str(),«attr.name»Dim[1]);
					maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i][j].size(),maxDimZero«attr.UpperCaseName»);
				}
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = maxDimTwo«attr.UpperCaseName»;
			«attr.name»Dim[4] = «attr.name»Vec.size();  // return dimension of the ASDM table
			
			«ELSE»
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0; i< min((int)«attr.name»Vec.size(),«attr.name»Dim[3]) ;i++) {
				maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimZero«attr.UpperCaseName»);
				for (int j=0; j<min((int)«attr.name»Vec[i].size(),«attr.name»Dim[1]) ;j++) {
					«attr.name»[i*«attr.name»Dim[1]+j] = «attr.name»Vec[i][j].get();
				}
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = «attr.name»Vec.size();  // return dimension of the ASDM table
			«ENDIF»
			
			«ELSEIF attr.dimension == 3»
			«attr.CppType»  «attr.name»Vec = row->get«attr.UpperCaseName»();
			int maxDimTwo«attr.UpperCaseName» = 0;
			int maxDimZero«attr.UpperCaseName» = 0;
			for (int i=0; i<  min((int)«attr.name»Vec.size(),«attr.name»Dim[5]) ;i++) {
				maxDimTwo«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimTwo«attr.UpperCaseName»);
				for (int j=0;j< min((int)«attr.name»Vec[i].size(),«attr.name»Dim[3]) ;j++) {
					maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i][j].size(),maxDimZero«attr.UpperCaseName»);
					for (int k=0; k< min((int)«attr.name»Vec[i][j].size(),«attr.name»Dim[1]) ;k++) {
						«IF attr.isCppStandard»
					 	«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k]= «attr.name»Vec[i][j][k];
						«ELSE»
						«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k]= «attr.name»Vec[i][j][k].get();
						«ENDIF»
					}
				}
			}
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
			«attr.name»Dim[2] = maxDimTwo«attr.UpperCaseName»;
			«attr.name»Dim[4] = «attr.name»Vec.size();  // return dimension of the ASDM table
			«ENDIF»
			«ENDIF»
			«ENDIF»
			«ENDFOR»
			
			return 1;   // 1 means that the line has been found
		}	
	}
	
	
	«IF table.name =="TotalPower" || table.name =="Pointing"»
	// -------------------------------------------
	// Columns get methods
	«FOR attr : table.requiredAttributes»
	// -------------------------------------------
	// NEW METHOD
	/**
	 * Returns the column «attr.UpperCaseName» of Table «table.name».
	 */
	#define sdm_get«table.name»«attr.UpperCaseName»Column  sdm_get«table.ToLowerCase»«attr.ToLowerCase»column_
	extern "C" int sdm_get«table.name»«attr.UpperCaseName»Column(«attr.CTypeAttributeDimList»);
	int sdm_get«table.name»«attr.UpperCaseName»Column («attr.CTypeAttributeDimList») {
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
			return -1;
		}
		«table.name»Table &table = dataset->get«table.name»();
		vector< «table.name»Row * > row = table.get();
		int size = (int)table.get().size();
		if (size==0) {
			return 0;
		} else {
			for (int ir=0; ir<size; ir++) {
				// Table:  «attr.name»  Column: «attr.UpperCaseName»
				«IF !attr.isArray»
				// Scalar column of «attr.CppType»
				«IF attr.isCppStandard»
				«attr.name»[ir] = row[ir]->get«attr.UpperCaseName»();
				«ELSEIF attr.CppType=="Tag"»
				«attr.name»[ir] = row[ir]->get«attr.UpperCaseName»().getTagValue();
				«ELSEIF attr.CppType=="string"»
				strcpy(«attr.name»+ir*«attr.name»Dim[0],row[ir]->get«attr.UpperCaseName»().c_str());
				«ELSEIF attr.CppType=="EntityRef"»
				strcpy(«attr.name»+ir*«attr.name»Dim[0],row[ir]->get«attr.UpperCaseName»().toString().c_str());
				«ELSEIF attr.CppType=="ArrayTime"»
				«attr.name»[ir]     = row[ir]->get«attr.UpperCaseName»().get();
				«ELSEIF attr.CppType=="ArrayTimeInterval"»
				«attr.name»[2*ir]  = row[ir]->get«attr.UpperCaseName»().getStartInNanoSeconds();
				«attr.name»[2*ir+1] = row[ir]->get«attr.UpperCaseName»().getDurationInNanoSeconds();
				«ELSE»
				«attr.name»[ir] = row[ir]->get«attr.UpperCaseName»().get();
				«ENDIF»
				«ELSE»
				«attr.CppType»  «attr.name»Vec = row[ir]->get«attr.UpperCaseName»();
				«IF attr.dimension == 1 || attr.isExtrinsic»
				// OneD column of «attr.SimpleCppType»
				«IF attr.SimpleCppType=="string"»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[3]); i++) {
					if ((int)«attr.name»Vec[i].size()<«attr.name»Dim[1])
						strcpy(«attr.name»+(ir*«attr.name»Dim[3]+i)*«attr.name»Dim[1], «attr.name»Vec[i].c_str());
					else 
						strncpy(«attr.name»+(ir*«attr.name»Dim[3]+i)*«attr.name»Dim[1], «attr.name»Vec[i].c_str(),
						«attr.name»Dim[1]);
					maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec.size(), maxDimZero«attr.UpperCaseName»);
				}
				«attr.name»Dim[ir*2] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[ir*2+2] = «attr.name»Vec.size();  // number of strings
				«ELSE»
				for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[1]); i++) {
					«IF attr.isCppStandard»
					«attr.name»[ir*«attr.name»Dim[1]+i] = «attr.name»Vec[i];
			        «ELSEIF attr.SimpleCppType=="Tag"»
			      	«attr.name»[ir*«attr.name»Dim[1]+i] = «attr.name»Vec[i].getTagValue();
			        «ELSE»
			      	«attr.name»[ir*«attr.name»Dim[1]+i] = «attr.name»Vec[i].get();
			        «ENDIF»
				}
				«attr.name»Dim[ir*2] = (int)«attr.name»Vec.size();  // return dimension of the vector in each row
				«ENDIF»
				«ELSEIF attr.dimension == 2»
				// TwoD column of «attr.SimpleCppType»
				«IF attr.SimpleCppType=="string"»
				int maxDimZero«attr.UpperCaseName» = 0;
				int maxDimTwo«attr.UpperCaseName» = 0;
				for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[5]); i++) {
					maxDimTwo«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(), maxDimTwo«attr.UpperCaseName»);
					for (int j=0; j<min((int)row[ir]->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[3]); j++) {
				  		maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i][j].size(), maxDimZero«attr.UpperCaseName»);
				  		if ((int)«attr.name»Vec[i][j].size()<«attr.name»Dim[1])
							strcpy(«attr.name»+((ir*«attr.name»Dim[5]+i)*«attr.name»Dim[3]+j)**«attr.name»Dim[1], 
					 			«attr.name»Vec[i][j].c_str());
				  		else 
				      		strcpy(«attr.name»+((ir*«attr.name»Dim[5]+i)*«attr.name»Dim[3]+j)**«attr.name»Dim[1], 
								«attr.name»Vec[i][j].c_str(),
						«attr.name»Dim[1]);
					}
				}
				«attr.name»Dim[ir*2] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[ir*2+2] = maxDimTwp«attr.UpperCaseName»;
				«attr.name»Dim[ir*2+4] = «attr.name»Vec.size();  // number of strings
				«ELSE»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<min((int)«attr.name»Vec.size(),«attr.name»Dim[3]); i++) {
					maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimZero«attr.UpperCaseName»);
					for (int j=0; j<min((int)«attr.name»Vec[i].size(), «attr.name»Dim[1]) ;j++) {
						«IF attr.isCppStandard»
						«attr.name»[(ir*«attr.name»Dim[3]+i)*«attr.name»Dim[1]+j]= «attr.name»Vec[i][j];
						«ELSEIF attr.SimpleCppType=="Tag"»
						«attr.name»[(ir*«attr.name»Dim[3]+i)*«attr.name»Dim[1]+j]= «attr.name»Vec[i][j].getTagValue();
						«ELSE»
						«attr.name»[(ir*«attr.name»Dim[3]+i)*«attr.name»Dim[1]+j]= «attr.name»Vec[i][j].get();;
						«ENDIF»
					}
				}
	  			«attr.name»Dim[ir*4] = maxDimZero«attr.UpperCaseName»; // return the maximum of inner dimension
         		«attr.name»Dim[ir*4+2] = «attr.name»Vec.size();  // return the outer dimension
	      		«ENDIF»
	      		«ELSEIF attr.dimension == 3»
				// ThreeD column of «attr.SimpleCppType»
				«IF attr.SimpleCppType=="string"»
				cout << "Programming deficiency: Dimensionality higher than two not supported for strings" << endl;
				«ELSE»
				int maxDimTwo«attr.UpperCaseName» = 0;
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<  min((int)«attr.name»Vec.size(),«attr.name»Dim[5]) ;i++) {
					maxDimTwo«attr.UpperCaseName» = max((int)«attr.name»Vec[i].size(),maxDimTwo«attr.UpperCaseName»);
					for (int j=0;j< min((int)«attr.name»Vec[i].size(),«attr.name»Dim[3]) ;j++) {
						maxDimZero«attr.UpperCaseName» = max((int)«attr.name»Vec[i][j].size(),maxDimZero«attr.UpperCaseName»);
						for (int k=0; k< min((int)«attr.name»Vec[i][j].size(),«attr.name»Dim[1]) ;k++) {
							«IF attr.isCppStandard»
							«attr.name»[((ir*«attr.name»Dim[5]+i)*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k] = «attr.name»Vec[i][j][k];
							«ELSEIF attr.SimpleCppType=="Tag"»
							«attr.name»[((ir*«attr.name»Dim[5]+i)*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k] = «attr.name»Vec[i][j][k].getTagValue();
							«ELSE»
							«attr.name»[((ir*«attr.name»Dim[5]+i)*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k] = «attr.name»Vec[i][j][k].get();
							«ENDIF»
						}
					}
				}
				«attr.name»Dim[ir*2] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[ir*2+2] = maxDimTwo«attr.UpperCaseName»;
				«attr.name»Dim[ir*2+4] = «attr.name»Vec.size();  // return dimension of the ASDM table 
				«ENDIF»
				«ELSE»
				cout << "Programming deficiency: Dimensionality higher than three not supported " << endl;
				«ENDIF»
				«ENDIF»
			}
		}
		return size ;   // return the size of the table  
	}
	«ENDFOR»
	«ENDIF»
	
	
	// -------------------------------------------
	/**
	 * Return the size of a table
	 *  0  if table is empty
	 * -1 if table does not exist
	 *
	 */
	
	int sdm_get«table.name»TableSize() {
		if (dataset==0) {
	    cout<<"No dataset initialized"<<endl;
	    return -1;
	}
	«table.name»Table &table = dataset->get«table.name»();
		int size = (int)table.get().size();
		return size;
	}
	
	
	// -------------------------------------------
	/**
	 * Return key arrays
	 *  0  if table is empty
	 * -1 if table does not exist
	 *
	 */
	int sdm_get«table.name»Keys(«table.KeyCTypeList») {
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
		    return -1;
		}
		
		«table.name»Table &table = dataset->get«table.name»();
		
		vector< «table.name»Row * > row = table.get();
	  	int size = (int)table.get().size();
	
	 	if (size==0) {
			return 0;
	  	} else {
			«FOR attr : table.requiredAttributes»
			«IF attr.isKey»
			«IF !attr.isArray»
			«IF attr.CppType=="string"»
			int maxDimZero«attr.UpperCaseName» = 0;
			«ENDIF»
			«ENDIF»
			«ENDIF»
	  		«ENDFOR»
	  		for (int i=0;i<size;i++) {
		  		«FOR attr : table.requiredAttributes»
		  		«IF attr.isKey»
		  		«IF !attr.isArray»
		  		«IF attr.isCppStandard»
		  		«attr.name»[i] = row[i]->get«attr.UpperCaseName»();
		  		«ELSEIF attr.CppType=="Tag"»
		  		// «attr.name»[i] = atoi((row[i]->get«attr.UpperCaseName»().getId()).c_str());
				«attr.name»[i] = row[i]->get«attr.UpperCaseName»().getTagValue();
		  		«ELSEIF attr.CppType=="string"»
		  		if ((int) row[i]->get«attr.UpperCaseName»().size() < «attr.name»Dim[1])
		  			strcpy(«attr.name»+i*«attr.name»Dim[1],row[i]->get«attr.UpperCaseName»().c_str());
		  		else
		  			strncpy(«attr.name»+i*«attr.name»Dim[1],row[i]->get«attr.UpperCaseName»().c_str(),«attr.name»Dim[1]);
		  		maxDimZero«attr.UpperCaseName» = max((int)row[i]->get«attr.UpperCaseName»().size(), maxDimZero«attr.UpperCaseName»);
		  		«ELSEIF attr.CppType=="EntityRef"»
		  		strcpy(«attr.name»+i*«attr.name»Dim[1],row[i]->get«attr.UpperCaseName»().toString().c_str());
		  		«ELSEIF attr.CppType=="ArrayTime"»
		  		«attr.name»[i] = row[i]->get«attr.UpperCaseName»().get();
		  		«ELSEIF attr.CppType=="ArrayTimeInterval"»
		  		«attr.name»[2*i]   = row[i]->get«attr.UpperCaseName»().getStartInNanoSeconds();
				«attr.name»[2*i+1]  = row[i]->get«attr.UpperCaseName»().getDurationInNanoSeconds();
		  		//cout<<"ArrayTimeInterval in key"<<endl;
		  		«ELSE»
		  		«attr.name»[i] = «attr.UpperCaseName»Vec.get();
		  		«ENDIF»
		  		«ELSE»
		  		cout<<"Multidimensional array in key !!!"<<endl;
		  		«ENDIF»
		  		«ENDIF»
		  		«ENDFOR»
	  		}
	  		
	  		«FOR attr : table.requiredAttributes»
			«IF attr.isKey»
			«IF !attr.isArray»
			«IF attr.CppType=="string"»
			«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName» ;
			«attr.name»Dim[2] = size ;
			«ENDIF»
			«ENDIF»
			«ENDIF»
			«ENDFOR»    
			return size;
	  	}
	}
	
	
	«/* Methods for optional parameters*/»
	
	«IF table.optionalValueAttributes.size != 0»
	«FOR attr : table.optionalValueAttributes»
	// -------------------------------------------
	/**
	 * Set the optional parameter «attr.name», in a row of the «table.name» table, given a key
	 *
	 */
	
	#define sdm_add«table.name»«attr.UpperCaseName»  sdm_add«table.ToLowerCase»«attr.ToLowerCase»_
	extern "C" int sdm_add«table.name»«attr.UpperCaseName»(«table.KeyCTypeList», «attr.CTypeAttributeDimList»);
	
	int sdm_add«table.name»«attr.UpperCaseName»(«table.KeyCTypeList», «attr.CTypeAttributeDimList») {
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
			return -1;
		}
		«table.name»Table &table = dataset->get«table.name»();
		
		«table.name»Row *row = 0;
		«IF table.isArrayTimeIntervalKey»
		if (*(timeInterval+1)>0)
			row = table.getRowByKey(«table.KeyCppFromCList»);
		else
			row = table.getRowByKey(«table.KeyCppFromCListWithoutInterval»);
		«ELSE»
		row = table.getRowByKey(«table.KeyCppFromCList»);
		«ENDIF»
		
		
		if (row==0) {
			return -1;     // No row corresponding to the key
		} else {
			«IF attr.isArray»
			«IF attr.dimension == 1 || attr.isExtrinsic»
			«IF  !attr.isStringType»
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[0]);
			for (int i=0;i<«attr.name»Dim[0];i++)
				«IF attr.SimpleCppType=="long long"»
				«attr.name»Vec[i]= «attr.name»[i];
				«ELSEIF attr.SimpleCppType=="ArrayTimeInterval"»
				«attr.name»Vec[i]= «attr.SimpleCppType»(«attr.name»[2*i], «attr.name»[2*i+1]);
				«ELSE»
				«attr.name»Vec[i]= «attr.SimpleCppType»(«attr.name»[i] «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
				«ENDIF»
			«ELSE»
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[2]);
			for (int i=0;i<«attr.name»Dim[2];i++)
				«attr.name»Vec[i]= «attr.SimpleCppType»(«attr.name»+i*«attr.name»Dim[1]  «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»
			«ENDIF»
			«ELSEIF attr.dimension == 2»
			«IF  !attr.isStringType»
			//... 2 dimensions optional par «attr.name»:
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[2]);
			for (int i=0;i<«attr.name»Dim[2];i++) {
				«attr.name»Vec[i].resize(«attr.name»Dim[0]);
				for (int j=0;j<«attr.name»Dim[0];j++)
					«IF attr.SimpleCppType=="long long"»
					«attr.name»Vec[i][j]= «attr.name»[i*(«attr.name»Dim[1])+j];
					«ELSE»
					«attr.name»Vec[i][j]= «attr.SimpleCppType»(«attr.name»[i*(«attr.name»Dim[1])+j]);
					«ENDIF»
			}
			«ELSE»
			// ... 2 dimensions optional  string parameter «attr.name»: 
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[4]  «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
			for (int i=0;i<*«attr.name»Dim[4];i++) {
				«attr.name»Vec[i].resize(«attr.name»Dim[2]);
				for (int j=0;j<«attr.name»Dim[2];j++)
					«attr.SimpleCppType»(«attr.name»+(i*(«attr.name»Dim[3])+j)*«attr.name»Dim[1]  «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»);
			}
			«ENDIF»
			«ELSEIF attr.dimension == 3»
			//... 3 dimensions optional par «attr.name»:  
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[4]);
			for (int i=0;i<«attr.name»Dim[4];i++) {
				«attr.name»Vec[i].resize(«attr.name»Dim[2]);
				for (int j=0;j<«attr.name»Dim[2];j++) {
					«attr.name»Vec[i][j].resize(«attr.name»Dim[0]);
					for (int k=0;k<«attr.name»Dim[0];k++)
						«IF attr.SimpleCppType=="long long"»
						«attr.name»Vec[i][j][k]= «attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k];
						«ELSE»
						«attr.name»Vec[i][j][k]= «attr.SimpleCppType»(«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k]);
						«ENDIF»           
				}
			}
			«ELSEIF attr.dimension == 4»
			//... 4 dimensions optional par «attr.name»: 
			«attr.CppType»  «attr.name»Vec(«attr.name»Dim[6]);
			for (int i=0;i<«attr.name»Dim[6];i++) {
				«attr.name»Vec[i].resize(«attr.name»Dim[4]);
				for (int j=0;j<«attr.name»Dim[4];j++) {
					«attr.name»Vec[i][j].resize(«attr.name»Dim[2]);
					for (int k=0;k<«attr.name»Dim[2];k++) {
						«attr.name»Vec[i][j][k].resize(«attr.name»Dim[0]);
						for (int l=0;l<«attr.name»Dim[0];k++)
							«IF attr.SimpleCppType=="long long"»
							«attr.name»Vec[i][j][k][l]= «attr.name»[((i*«attr.name»Dim[5]+j)*«attr.name»Dim[3]+k)*«attr.name»Dim[1]+l];
							«ELSE»
							«attr.name»Vec[i][j][k][l]= «attr.SimpleCppType»(«attr.name»[((i*«attr.name»Dim[5]+j)*«attr.name»Dim[3]+k)*«attr.name»Dim[1]+l]);
							«ENDIF»
					}
				}
			}
			«ENDIF»
			row->set«attr.UpperCaseName»(«attr.name»Vec);
			«ELSE»
			// case: scalar attribute.
			«IF attr.CppType=="EntityRef" || attr.CppType=="string"»
			row->set«attr.UpperCaseName»(«attr.SimpleCppType»(«attr.name»));
			«ELSEIF attr.CppType=="long long"» 
			row->set«attr.UpperCaseName»(* «attr.name»);
			«ELSE»
			row->set«attr.UpperCaseName»(«attr.SimpleCppType»(* «attr.name» «IF attr.SimpleCppType == "Tag"», «attr.CppTagType»«ENDIF»));
			«ENDIF»
			«ENDIF»
			
		}
		
		return 0;
	}
	
	
	// -------------------------------------------
	/**
	 * Get the optional parameter «attr.name», in a row of the «table.name» table, given a key
	 *
	 */
	
	#define sdm_get«table.name»«attr.UpperCaseName»  sdm_get«table.ToLowerCase»«attr.ToLowerCase»_
	extern "C" int sdm_get«table.name»«attr.UpperCaseName»(«table.KeyCTypeList», «attr.CTypeAttributeDimList»);
	
	int sdm_get«table.name»«attr.UpperCaseName»(«table.KeyCTypeList», «attr.CTypeAttributeDimList») {
		if (dataset==0) {
			cout<<"No dataset initialized"<<endl;
			return -1;
		}
		
		«table.name»Table &table = dataset->get«table.name»();
		«table.name»Row *row = 0;
		«IF table.isArrayTimeIntervalKey»
		if (*(timeInterval+1)>0)  
			row = table.getRowByKey(«table.KeyCppFromCList»);
		else
			row = table.getRowByKey(«table.KeyCppFromCListWithoutInterval»);
		«ELSE»
		row = table.getRowByKey(«table.KeyCppFromCList»);
		«ENDIF»
		
		if (row==0) {
			return -1;     // No row corresponding to the key
		} else {
			if (row->is«attr.UpperCaseName»Exists()) {
				«IF !attr.isArray»
				«IF attr.isCppStandard»
				*«attr.name» = row->get«attr.UpperCaseName»();
				«ELSEIF attr.CppType=="Tag"»
				// *«attr.name» = atoi((row->get«attr.UpperCaseName»().getId()).c_str());
				*«attr.name» = row->get«attr.UpperCaseName»().getTagValue();
				«ELSEIF attr.CppType=="string"»
				if ((int)row->get«attr.UpperCaseName»().size()<«attr.name»Dim[1])
					strcpy(«attr.name»,row->get«attr.UpperCaseName»().c_str());
				else
					strncpy(«attr.name»,row->get«attr.UpperCaseName»().c_str(),«attr.name»Dim[1]);
				«attr.name»Dim[0] = (int)row->get«attr.UpperCaseName»().size();
				«ELSEIF attr.CppType=="EntityRef"»
				strcpy(«attr.name»,row->get«attr.UpperCaseName»().toString().c_str());
				«ELSEIF attr.CppType=="ArrayTime"»
				*«attr.name»     = row->get«attr.UpperCaseName»().get();
				«ELSEIF attr.CppType=="ArrayTimeInterval"»
				*«attr.name»     = row->get«attr.UpperCaseName»().getStartInNanoSeconds();
				*(«attr.name»+1) = row->get«attr.UpperCaseName»().getDurationInNanoSeconds();
				«ELSE»
				*«attr.name» = row->get«attr.UpperCaseName»().get();
				«ENDIF»
				«ELSE»
				// attr.CppType: «attr.CppType» attr.isOneD: «attr.isOneD»
				«IF attr.isOneD || attr.isExtrinsic»
				«IF attr.isCppStandard»
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[1]); i++)
					«attr.name»[i] = row->get«attr.UpperCaseName»()[i];
				«attr.name»Dim[0] = (int)row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSEIF attr.SimpleCppType=="Tag"»
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[1]); i++)
				// «attr.name»[i] = atoi((row->get«attr.UpperCaseName»()[i]).getId().c_str());
				«attr.name»[i] = row->get«attr.UpperCaseName»()[i].getTagValue();
				«attr.name»Dim[0] = (int)row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSEIF attr.SimpleCppType=="string"»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[3]); i++) {
					if ((int)row->get«attr.UpperCaseName»()[i].size()<«attr.name»Dim[1])
						strcpy(«attr.name»+i*«attr.name»Dim[1],row->get«attr.UpperCaseName»()[i].c_str());
					else
						strncpy(«attr.name»+i*«attr.name»Dim[1],row->get«attr.UpperCaseName»()[i].c_str(),«attr.name»Dim[1]);
					maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimZero«attr.UpperCaseName»);
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = row->get«attr.UpperCaseName»().size();  // number of strings
				«ELSEIF attr.SimpleCppType=="ArrayTimeInterval"»
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[1]); i++) {
					«attr.name»[2*i] = row->get«attr.UpperCaseName»()[i].getStartInNanoSeconds();
					«attr.name»[2*i+1] = row->get«attr.UpperCaseName»()[i].getDurationInNanoSeconds();
				}
				«attr.name»Dim[0] = row->get«attr.UpperCaseName»().size(); // return dimension of the ASDM table
				«ELSE»
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[1]); i++)
					«attr.name»[i] = row->get«attr.UpperCaseName»()[i].get();
				«attr.name»Dim[0] = row->get«attr.UpperCaseName»().size(); // return dimension of the ASDM table
				«ENDIF»
				
				«ELSEIF attr.isTwoD»
				«IF attr.isCppStandard»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0;i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[3]) ;i++) {
					maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimZero«attr.UpperCaseName»);
					for (int j=0;j<min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[1]) ;j++) {
						«attr.name»[i*«attr.name»Dim[1]+j]= row->get«attr.UpperCaseName»()[i][j];
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSEIF attr.SimpleCppType=="Tag"»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[3]); i++) {
					maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimZero«attr.UpperCaseName»);
					for (int j=0; j<min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[1]) ;j++) {
						// «attr.name»[i*«attr.name»Dim[0]+j] = atoi((row->get«attr.UpperCaseName»()[i][j]).getId().c_str());
						«attr.name»[i*«attr.name»Dim[0]+j] = row->get«attr.UpperCaseName»()[i][j].getTagValue();
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSEIF attr.SimpleCppType=="string"»
				int maxDimTwo«attr.UpperCaseName» = 0;
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i< min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[5]) ;i++) {
					maxDimTwo«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimTwo«attr.UpperCaseName»);
					for (int j=0; j< min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[3]) ;j++) {
						if ((int)row->get«attr.UpperCaseName»()[i][j].size()>«attr.name»Dim[1])
							strcpy(«attr.name»+(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1],row->get«attr.UpperCaseName»()[i][j].c_str());
						else
							strncpy(«attr.name»+(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1],row->get«attr.UpperCaseName»()[i][j].c_str(),«attr.name»Dim[1]);
						maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i][j].size(),maxDimZero«attr.UpperCaseName»);
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = maxDimTwo«attr.UpperCaseName»;
				«attr.name»Dim[4] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSE»
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i< min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[3]) ;i++) {
					maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimZero«attr.UpperCaseName»);
					for (int j=0; j<min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[1]) ;j++) {
						«attr.name»[i*«attr.name»Dim[1]+j] = row->get«attr.UpperCaseName»()[i][j].get();
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ENDIF»

				«ELSEIF attr.isThreeD»
				int maxDimTwo«attr.UpperCaseName» = 0;
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<  min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[5]) ;i++) {
					maxDimTwo«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimTwo«attr.UpperCaseName»);
					for (int j=0;j< min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[3]) ;j++) {
						maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i][j].size(),maxDimZero«attr.UpperCaseName»);
						for (int k=0; k< min((int)row->get«attr.UpperCaseName»()[i][j].size(),«attr.name»Dim[1]) ;k++) {
							«IF attr.isCppStandard»
							«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k]= row->get«attr.UpperCaseName»()[i][j][k];
							«ELSE»
							«attr.name»[(i*«attr.name»Dim[3]+j)*«attr.name»Dim[1]+k]= row->get«attr.UpperCaseName»()[i][j][k].get();
							«ENDIF»
						}
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = maxDimTwo«attr.UpperCaseName»;
				«attr.name»Dim[4] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				
				«ELSEIF attr.isFourD»
				int maxDimFour«attr.UpperCaseName» = 0;
				int maxDimTwo«attr.UpperCaseName» = 0;
				int maxDimZero«attr.UpperCaseName» = 0;
				for (int i=0; i<  min((int)row->get«attr.UpperCaseName»().size(),«attr.name»Dim[7]) ;i++) {
					maxDimFour«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i].size(),maxDimFour«attr.UpperCaseName»);
					for (int j=0;j< min((int)row->get«attr.UpperCaseName»()[i].size(),«attr.name»Dim[5]) ;j++) {
						maxDimTwo«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i][j].size(),maxDimTwo«attr.UpperCaseName»);
						for (int k=0; k< min((int)row->get«attr.UpperCaseName»()[i][j].size(),«attr.name»Dim[3]) ;k++) {
							maxDimZero«attr.UpperCaseName» = max((int)row->get«attr.UpperCaseName»()[i][j][k].size(),maxDimZero«attr.UpperCaseName»);
							for (int l=0; l< min((int)row->get«attr.UpperCaseName»()[i][j][k].size(),«attr.name»Dim[1]) ;l++) 
								«attr.name»[((i*«attr.name»Dim[5]+j)*«attr.name»Dim[3]+k)*«attr.name»Dim[1]+l]= row->get«attr.UpperCaseName»()[i][j][k][l]«IF !attr.isCppStandard».get()«ENDIF»;
						}
					}
				}
				«attr.name»Dim[0] = maxDimZero«attr.UpperCaseName»;
				«attr.name»Dim[2] = maxDimTwo«attr.UpperCaseName»;
				«attr.name»Dim[4] = maxDimFour«attr.UpperCaseName»;
				«attr.name»Dim[6] = row->get«attr.UpperCaseName»().size();  // return dimension of the ASDM table
				«ELSE»
				// *** Unhandled case of >4 dimension parameter  «attr.name» *** 
				«ENDIF»
			«ENDIF»
			} else {
				return 1; // return 1 if optional parameter is absent, but row exists.
			}
		}
		
		return 0;
	}

	«ENDFOR»
	«ENDIF»
	
	'''
	
}