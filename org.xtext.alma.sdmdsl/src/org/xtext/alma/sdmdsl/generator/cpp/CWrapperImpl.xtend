package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CWrapperImpl {

	var container = AlmaTableContainer.getInstance();

	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context) {
		// creating and generating CWrapperImpl (src/sdmWrapper.cpp) 
		var sdmFsa = (fsa as SDMFileSystemAccess)

		sdmFsa.setFile("src/sdmWrapper.cpp")
		sdmFsa.generateFile(generateCWrapperImpl)
	}

	def generateCWrapperImpl() '''
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
		 * File sdmWrapper.cpp
		 */
		
		#include <iostream>
		#include <string.h>
		#include <dirent.h>
		  
		using namespace std;
		 
		#include <ASDMAll.h>
		// *** binaries not included at this time... ***
		//#include "SDMBinaryBlock.h"
		//#include "SDMBinaryExceptions.h"
		//#include "TPBinaryBlock.h"
		//using namespace asdmBinary;
		// *** binaries not included at this time... ***
		using namespace asdm;
		
		#undef max
		#define max(a,b) ((a) > (b) ? (a) : (b))
		#undef min
		#define min(a,b) ((a) < (b) ? (a) : (b))
		  
		#define sdm_init  sdm_init_
		#define sdm_write sdm_write_
		#define sdm_close sdm_close_
		#define sdm_getbinary sdm_getbinary_
		#define sdm_writebinary sdm_writebinary_
		#define sdm_getTPbinary sdm_gettpbinary_
		#define sdm_writeTPbinary sdm_writetpbinary_
		
		
		«FOR table : container.sortedAlmaTable»
			#define sdm_add«table.name»Row sdm_add«table.ToLowerCase»row_
			#define sdm_get«table.name»Row sdm_get«table.ToLowerCase»row_
			#define sdm_get«table.name»TableSize sdm_get«table.ToLowerCase»tablesize_
			#define sdm_get«table.name»Keys sdm_get«table.ToLowerCase»keys_
		«ENDFOR»
		
		extern "C" void sdm_init(char *, bool *);
		extern "C" void sdm_write();
		extern "C" void sdm_close();
		
		namespace asdm {    
		  /**
		   * This class is derived from the pure virtual class BinaryAttributeReaderFunctor.
		   *
		   * It implements the behaviour of the reading machinery when a simple boolean
		   * value has to be read . 
		   * In our case , the behaviour is reduced to one simple thing : just
		   * read one boolean value out of  the EndianIStream.
		   */
		  class BinaryBooleanAttributeReader : public BinaryAttributeReaderFunctor { 
		  private:
		    bool value;
		  public:
		    virtual void operator() (EndianIStream& eis);   
		    virtual ~BinaryBooleanAttributeReader();
		  };
		  void BinaryBooleanAttributeReader::operator()(EndianIStream& eis) {
		    value = eis.readBoolean();                                          
		  }
		  BinaryBooleanAttributeReader::~BinaryBooleanAttributeReader() {;}                          
		};
		
		ASDM * dataset;
		string datasetDirectory;  
		
		
		//----------------------------------------------------------------------------
		
		void sdm_init(char * directoryName, bool * error) {
		  *error = false;
		
		  // Read from directory
		  // cout<<"directoryName="<<directoryName<<endl;
		  datasetDirectory=string(directoryName);
		
		  try {
		    dataset=0;
		    // Check if directory exists and then, if ASDM.xml exists
		    if (opendir(directoryName)!=NULL) {
		      string asdmFile= datasetDirectory+"/ASDM.xml";
		      if (fopen(asdmFile.c_str(),"r")!=NULL) {
			// dataset = ASDM::getFromXML(datasetDirectory);
			dataset = new ASDM();
			// We want to define what has to be done when the TotalPower is read as a binary document and  an attribute "flagRow" is met 
			// that we want to just to skip.
			BinaryBooleanAttributeReader bbar;
			
			// Attach the behaviour defined in bbar to the attribute "flagRow" in the totalpower table.
			//
			TotalPowerTable& tpT = dataset->getTotalPower();
			const string unknownAttributeName("flagRow");
			// Call bbar functor each time the attribute flagRow is met . 
			tpT.setUnknownAttributeBinaryReader(unknownAttributeName, &bbar);  
			dataset->setFromFile(datasetDirectory);
			// cout<<"Dataset initialized from "<<datasetDirectory<<endl;
			     }
			   } else {
			     cout<<"Directory "<<datasetDirectory<<" does not exist"<<endl;
			   }
			 }
			 catch (ConversionException e) {
			 	cout << e.getMessage() << endl;
			 }
		
		  if (dataset==0) {
		    cout<<"Create new dataset in "<<datasetDirectory<<endl;
		    dataset = new ASDM();
		  }
		  return;
		}
		//----------------------------------------------------------------------------
		
		void sdm_write() {
		  cout<<"sdm_write()"<<endl;
		  if (dataset==0) {
		    cout<<"No dataset initialized"<<endl;
		    return;
		  }
		
		  try {
		    dataset->toFile(datasetDirectory);
		    cout << "The dataset has been saved in the directory " << datasetDirectory << endl;
		  }
		  catch (ConversionException e) {
		    cout << e.getMessage() << endl;
		  }
		}
		//----------------------------------------------------------------------------
		
		void sdm_close() {
		    // cout<<"sdm_close()"<<endl;
		//   dataset->toXML(datasetDirectory);
		//   cout << "The dataset has been saved in the directory " << datasetDirectory << endl;
		  delete dataset;
		  dataset = 0;
		}
		
		//----------------------------------------------------------------------------
		
		
		
		
		
		
		«new CTableWrapperImpl().doGenerate»
		
		
	'''

}
