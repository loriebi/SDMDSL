package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppTagTypeDef {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa, IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file TagType.h
		sdmFsa.setFile("include/TagType.h")
		sdmFsa.generateFile(generateTagTypeDef)
		
	}
	
	
	
	def generateTagTypeDef()'''
		#ifndef TagType_CLASS
		#define TagType_CLASS
		#include <string>
		#include <map>
		#include <iostream>
		
		using namespace std;
		
		namespace asdm {
		/**
		** A class to represent the type of Tag , i.e. the ASDM class a Tag refers to.
		*/
		class TagType {
			
			public:
			 	/**
				 * The string representation of a TagType.
				 * @return the string representation of of TagType.
				 */
			 	virtual string toString() const;
			  
			  	/**
				 * Returns a TagType given a string.
				 * @return the TagType associated to the string given in as a parameter. E.g. getTagType("Holography")
				 * returns TagType.Holography. Returns 0 is no Tag is associated to the given string.
				 */
			 	static const TagType* getTagType(string name);
			  
			 	/**
				 * The TagType for a no typed Tag.
				 */ 
			  	static const TagType* NoType;
			  
				«FOR table : container.tables »
					«IF table.autoIncrementable.size != 0»
						/**
						 * The TagType for a «table.name» Tag.
						 */
						static const TagType*  «table.name»;
					«ENDIF»
				«ENDFOR»
				
			private:
				string name;
				static map<string,const TagType*> name2TagType;
				virtual ~TagType() {};
				TagType(string name);
				  
				class TagTypeMgr {
				public:
				  	~TagTypeMgr () {
				  		if (TagType::NoType) {delete TagType::NoType; TagType::NoType=0;}
				  		«FOR table : container.tables»
				  			«IF table.autoIncrementable.size != 0»
				  				if (TagType:: «table.name») { delete TagType::«table.name»; TagType::«table.name» = 0; }
				  			«ENDIF»
				  		«ENDFOR»
				  	};
				  	
				  	TagTypeMgr() {};
				  	
				private :
				   	TagTypeMgr(const TagTypeMgr&);
				   	TagTypeMgr & operator=(const TagTypeMgr&);
				};
				
				static TagTypeMgr tagTypeMgr;
		};
		} // end namespace asdm
		#endif /* TagType_CLASS */
	'''
}