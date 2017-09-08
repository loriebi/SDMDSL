package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.ASDMAttribute

class CppTableAttributeDefGS {
	
	def doGenerate(ASDMAttribute attr)'''
		«IF attr.isOptional»
			// ===> Attribute «attr.name», which is optional
		«ELSE»
			// ===> Attribute «attr.name»
		«ENDIF»
		
	
		«IF attr.isOptional»
			/**
			 * The attribute «attr.name» is optional. Return true if this attribute exists.
			 * @return true if and only if the «attr.name» attribute exists. 
			 */
			bool is«attr.UpperCaseName»Exists() const;
		«ENDIF»	
		
		
		«IF attr.isOptional»
		 	/**
		 	 * Get «attr.name», which is optional.
		 	 * @return «attr.name» as «attr.CppType»
		 	 * @throws IllegalAccessException If «attr.name» does not exist.
		 	 */
		 	«attr.CppType» get«attr.UpperCaseName»() const;
		«ELSE»
		 	/**
		 	 * Get «attr.name».
		 	 * @return «attr.name» as «attr.CppType»
		 	 */
		 	«attr.CppType» get«attr.UpperCaseName»() const;
		«ENDIF»

		«/* public setters are allowed only on non autoincrementable attributes. */»
	 	«IF !attr.isAutoIncrementable»
	 		/**
	 		 * Set «attr.name» with the specified «attr.CppType».
	 		 * @param «attr.name» The «attr.CppType» value to which «attr.name» is to be set.
	 	 	«IF !attr.isOptional»
	 	 		«IF attr.isKey» * @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.«ENDIF»
	 	 		 */
	 	 		void set«attr.UpperCaseName» («attr.CppType» «attr.name»);
	 	 	«ELSE»
	 	 		 */
	 	 		void set«attr.UpperCaseName» («attr.CppType» «attr.name»)
	 	 	«ENDIF»
	 	«ENDIF»

		«IF attr.isOptional»
			/**
			 * Mark «attr.name», which is an optional field, as non-existent.
			 */
			void clear«attr.UpperCaseName» ();
		«ENDIF»

	
	'''
	
}