package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.ASDMAttribute

class CppTableAttributeImpl {
	
	def doGenerate(String tableName, String append, ASDMAttribute attr)'''
		«IF attr.isOptional»
		/**
		 * The attribute «attr.name» is optional. Return true if this attribute exists.
		 * @return true if and only if the «attr.name» attribute exists. 
		 */
		bool «tableName»«append»::is«attr.UpperCaseName»Exists() const {
			return «attr.name»Exists;
		}
		«ENDIF»
	
		«IF attr.isOptional»
		/**
		 * Get «attr.name», which is optional.
		 * @return «attr.name» as «attr.CppType»
		 * @throw IllegalAccessException If «attr.name» does not exist.
		 */
	 	«attr.CppType» «tableName»«append»::get«attr.UpperCaseName»() const  {
			if (!«attr.name»Exists) {
				throw IllegalAccessException("«attr.name»", "«tableName»");
			}
		«ELSE»
		/**
		 * Get «attr.name».
		 * @return «attr.name» as «attr.CppType»
		 */
	 	«attr.CppType» «tableName»«append»::get«attr.UpperCaseName»() const {
		«ENDIF»
	  		return «attr.name»;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set «attr.name» with the specified «attr.CppType».
	  	 * @param «attr.name» The «attr.CppType» value to which «attr.name» is to be set.
	  	 «/* «IF isKeyPart» the mandatory attributes ! not only the Key ones ! Michel Caillat - 25 Jul 2008 */»
	  	«IF !attr.isOptional»
	  		«IF attr.isKey»
	  		 * @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.
	  	 	«ENDIF»
	  	 */
	  	void «tableName»«append»::set«attr.UpperCaseName» («attr.CppType» «attr.name»)  {
	  		«/* The modification of 25 Jul 2008 has important consequences on the DC code, so relax the constraints. */»
	  		«/* We throw an exception only for Key attributes. */»
	  		if (hasBeenAdded) {
	  		«IF attr.isKey»
	  			throw IllegalAccessException("«attr.name»", "«tableName»");
	  		«ENDIF»
	  		}
	   	«ELSE»
	  	 */
	  	void «tableName»«append»::set«attr.UpperCaseName» («attr.CppType» «attr.name») {
	 	«ENDIF»
	  		this->«attr.name» = «attr.name»;
	 	«IF attr.isOptional»
	 		«attr.name»Exists = true;
	 	«ENDIF»
	  	}
	 	
	 	«IF attr.isOptional»
	 	/**
	 	 * Mark «attr.name», which is an optional field, as non-existent.
	 	 */
	 	void «tableName»«append»::clear«attr.UpperCaseName» () {
	 		«attr.name»Exists = false;
	 	}
	 	«ENDIF»
	'''
	
}