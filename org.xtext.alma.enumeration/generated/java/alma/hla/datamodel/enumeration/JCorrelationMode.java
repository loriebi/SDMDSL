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
 * File JCorrelationMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CorrelationModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CorrelationMode enumeration.
*/ 
public class JCorrelationMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCROSS_ONLY = "CROSS_ONLY";  /*!< A string definition for CROSS_ONLY */
	public static final String sAUTO_ONLY = "AUTO_ONLY";  /*!< A string definition for AUTO_ONLY */
	public static final String sCROSS_AND_AUTO = "CROSS_AND_AUTO";  /*!< A string definition for CROSS_AND_AUTO */
	private static final String[] sCorrelationModeSet = {
		sCROSS_ONLY,
		sAUTO_ONLY,
		sCROSS_AND_AUTO
	};
	
	
	/**
	* Returns the version number of the enumeration CorrelationMode.
	*/
	public static int version() { 
		return alma.CorrelationModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CorrelationMode.
	*/
	public static String revision() { 
		return alma.CorrelationModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CorrelationMode.
	*/
	public static int size() { 
		return sCorrelationModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CorrelationMode's enumerator.
	*/
	public static String name(CorrelationMode f){
		switch(f.value()){
			case CorrelationMode._CROSS_ONLY : 
				return sCROSS_ONLY;
			case CorrelationMode._AUTO_ONLY : 
				return sAUTO_ONLY;
			case CorrelationMode._CROSS_AND_AUTO : 
				return sCROSS_AND_AUTO;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CorrelationMode's enumerator.
	*/
	public static String toString(CorrelationMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCorrelationModeSet;
	}
	
	
	/**
	* Returns a CorrelationMode's enumerator by specifying its name.
	*/
	public static CorrelationMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCROSS_ONLY)) return CorrelationMode.from_int(CorrelationMode._CROSS_ONLY);
		if(name.equals(sAUTO_ONLY)) return CorrelationMode.from_int(CorrelationMode._AUTO_ONLY);
		if(name.equals(sCROSS_AND_AUTO)) return CorrelationMode.from_int(CorrelationMode._CROSS_AND_AUTO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CorrelationMode enumeration object by specifying its name
	*/
	public static CorrelationMode newCorrelationMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCROSS_ONLY)) return CorrelationMode.from_int(CorrelationMode._CROSS_ONLY);
		if(name.equals(sAUTO_ONLY)) return CorrelationMode.from_int(CorrelationMode._AUTO_ONLY);
		if(name.equals(sCROSS_AND_AUTO)) return CorrelationMode.from_int(CorrelationMode._CROSS_AND_AUTO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CorrelationMode. 
	 * @parameter value an instance of CorrelationMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CorrelationMode value) {
			
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


