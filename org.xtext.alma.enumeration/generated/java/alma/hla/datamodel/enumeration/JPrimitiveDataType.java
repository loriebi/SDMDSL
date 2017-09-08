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
 * File JPrimitiveDataType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.PrimitiveDataTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the PrimitiveDataType enumeration.
*/ 
public class JPrimitiveDataType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sINT16_TYPE = "INT16_TYPE";  /*!< A string definition for INT16_TYPE */
	public static final String sINT32_TYPE = "INT32_TYPE";  /*!< A string definition for INT32_TYPE */
	public static final String sINT64_TYPE = "INT64_TYPE";  /*!< A string definition for INT64_TYPE */
	public static final String sFLOAT32_TYPE = "FLOAT32_TYPE";  /*!< A string definition for FLOAT32_TYPE */
	public static final String sFLOAT64_TYPE = "FLOAT64_TYPE";  /*!< A string definition for FLOAT64_TYPE */
	private static final String[] sPrimitiveDataTypeSet = {
		sINT16_TYPE,
		sINT32_TYPE,
		sINT64_TYPE,
		sFLOAT32_TYPE,
		sFLOAT64_TYPE
	};
	
	
	/**
	* Returns the version number of the enumeration PrimitiveDataType.
	*/
	public static int version() { 
		return alma.PrimitiveDataTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration PrimitiveDataType.
	*/
	public static String revision() { 
		return alma.PrimitiveDataTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in PrimitiveDataType.
	*/
	public static int size() { 
		return sPrimitiveDataTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified PrimitiveDataType's enumerator.
	*/
	public static String name(PrimitiveDataType f){
		switch(f.value()){
			case PrimitiveDataType._INT16_TYPE : 
				return sINT16_TYPE;
			case PrimitiveDataType._INT32_TYPE : 
				return sINT32_TYPE;
			case PrimitiveDataType._INT64_TYPE : 
				return sINT64_TYPE;
			case PrimitiveDataType._FLOAT32_TYPE : 
				return sFLOAT32_TYPE;
			case PrimitiveDataType._FLOAT64_TYPE : 
				return sFLOAT64_TYPE;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified PrimitiveDataType's enumerator.
	*/
	public static String toString(PrimitiveDataType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sPrimitiveDataTypeSet;
	}
	
	
	/**
	* Returns a PrimitiveDataType's enumerator by specifying its name.
	*/
	public static PrimitiveDataType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sINT16_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT16_TYPE);
		if(name.equals(sINT32_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT32_TYPE);
		if(name.equals(sINT64_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT64_TYPE);
		if(name.equals(sFLOAT32_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._FLOAT32_TYPE);
		if(name.equals(sFLOAT64_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._FLOAT64_TYPE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a PrimitiveDataType enumeration object by specifying its name
	*/
	public static PrimitiveDataType newPrimitiveDataType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sINT16_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT16_TYPE);
		if(name.equals(sINT32_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT32_TYPE);
		if(name.equals(sINT64_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._INT64_TYPE);
		if(name.equals(sFLOAT32_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._FLOAT32_TYPE);
		if(name.equals(sFLOAT64_TYPE)) return PrimitiveDataType.from_int(PrimitiveDataType._FLOAT64_TYPE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is PrimitiveDataType. 
	 * @parameter value an instance of PrimitiveDataType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, PrimitiveDataType value) {
			
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


