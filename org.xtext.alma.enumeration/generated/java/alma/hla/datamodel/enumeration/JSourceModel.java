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
 * /////////////////////////////////////////////////////////////////
 * // WARNING!  DO NOT MODIFY THIS FILE!                          //
 * //  ---------------------------------------------------------  //
 * // | This is generated code!  Do not modify this file.       | //
 * // | Any changes will be lost when the file is re-generated. | //
 * //  ---------------------------------------------------------  //
 * /////////////////////////////////////////////////////////////////
 *
 * File JSourceModel.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SourceModelMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SourceModel enumeration.
*/ 
public class JSourceModel {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sGAUSSIAN = "GAUSSIAN";  /*!< A string definition for GAUSSIAN */
	public static final String sPOINT = "POINT";  /*!< A string definition for POINT */
	public static final String sDISK = "DISK";  /*!< A string definition for DISK */
	private static final String[] sSourceModelSet = {
		sGAUSSIAN,
		sPOINT,
		sDISK
	};
	
	
	/**
	* Returns the version number of the enumeration SourceModel.
	*/
	public static int version() { 
		return alma.SourceModelMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SourceModel.
	*/
	public static String revision() { 
		return alma.SourceModelMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SourceModel.
	*/
	public static int size() { 
		return sSourceModelSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SourceModel's enumerator.
	*/
	public static String name(SourceModel f){
		switch(f.value()){
			case SourceModel._GAUSSIAN : 
				return sGAUSSIAN;
			case SourceModel._POINT : 
				return sPOINT;
			case SourceModel._DISK : 
				return sDISK;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SourceModel's enumerator.
	*/
	public static String toString(SourceModel f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSourceModelSet;
	}
	
	
	/**
	* Returns a SourceModel's enumerator by specifying its name.
	*/
	public static SourceModel literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sGAUSSIAN)) return SourceModel.from_int(SourceModel._GAUSSIAN);
		if(name.equals(sPOINT)) return SourceModel.from_int(SourceModel._POINT);
		if(name.equals(sDISK)) return SourceModel.from_int(SourceModel._DISK);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SourceModel enumeration object by specifying its name
	*/
	public static SourceModel newSourceModel(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sGAUSSIAN)) return SourceModel.from_int(SourceModel._GAUSSIAN);
		if(name.equals(sPOINT)) return SourceModel.from_int(SourceModel._POINT);
		if(name.equals(sDISK)) return SourceModel.from_int(SourceModel._DISK);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SourceModel. 
	 * @parameter value an instance of SourceModel.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SourceModel value) {
			
		if ( a == null )  return (Object) value;
			
		String aCName = a.getClass().getName();
		System.out.println( aCName);
		if (aCName.charAt(0) == '[') {
			// Yes a is an array.
			for (int i = 0; i < Array.getLength(a); i++)
				Array.set(a, i, setArray( Array.get(a, i), value));
		}else{
			// No a is a scalar
			a =  value;
		}
			
		return a;
	} 
	
	
	
}


