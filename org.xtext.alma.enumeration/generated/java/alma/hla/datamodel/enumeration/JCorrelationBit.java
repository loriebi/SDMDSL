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
 * File JCorrelationBit.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CorrelationBitMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CorrelationBit enumeration.
*/ 
public class JCorrelationBit {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sBITS_2x2 = "BITS_2x2";  /*!< A string definition for BITS_2x2 */
	public static final String sBITS_3x3 = "BITS_3x3";  /*!< A string definition for BITS_3x3 */
	public static final String sBITS_4x4 = "BITS_4x4";  /*!< A string definition for BITS_4x4 */
	private static final String[] sCorrelationBitSet = {
		sBITS_2x2,
		sBITS_3x3,
		sBITS_4x4
	};
	
	
	/**
	* Returns the version number of the enumeration CorrelationBit.
	*/
	public static int version() { 
		return alma.CorrelationBitMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CorrelationBit.
	*/
	public static String revision() { 
		return alma.CorrelationBitMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CorrelationBit.
	*/
	public static int size() { 
		return sCorrelationBitSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CorrelationBit's enumerator.
	*/
	public static String name(CorrelationBit f){
		switch(f.value()){
			case CorrelationBit._BITS_2x2 : 
				return sBITS_2x2;
			case CorrelationBit._BITS_3x3 : 
				return sBITS_3x3;
			case CorrelationBit._BITS_4x4 : 
				return sBITS_4x4;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CorrelationBit's enumerator.
	*/
	public static String toString(CorrelationBit f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCorrelationBitSet;
	}
	
	
	/**
	* Returns a CorrelationBit's enumerator by specifying its name.
	*/
	public static CorrelationBit literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sBITS_2x2)) return CorrelationBit.from_int(CorrelationBit._BITS_2x2);
		if(name.equals(sBITS_3x3)) return CorrelationBit.from_int(CorrelationBit._BITS_3x3);
		if(name.equals(sBITS_4x4)) return CorrelationBit.from_int(CorrelationBit._BITS_4x4);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CorrelationBit enumeration object by specifying its name
	*/
	public static CorrelationBit newCorrelationBit(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sBITS_2x2)) return CorrelationBit.from_int(CorrelationBit._BITS_2x2);
		if(name.equals(sBITS_3x3)) return CorrelationBit.from_int(CorrelationBit._BITS_3x3);
		if(name.equals(sBITS_4x4)) return CorrelationBit.from_int(CorrelationBit._BITS_4x4);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CorrelationBit. 
	 * @parameter value an instance of CorrelationBit.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CorrelationBit value) {
			
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


