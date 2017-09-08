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
 * File JDifferenceType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DifferenceTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DifferenceType enumeration.
*/ 
public class JDifferenceType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sPREDICTED = "PREDICTED";  /*!< A string definition for PREDICTED */
	public static final String sPRELIMINARY = "PRELIMINARY";  /*!< A string definition for PRELIMINARY */
	public static final String sRAPID = "RAPID";  /*!< A string definition for RAPID */
	public static final String sFINAL = "FINAL";  /*!< A string definition for FINAL */
	private static final String[] sDifferenceTypeSet = {
		sPREDICTED,
		sPRELIMINARY,
		sRAPID,
		sFINAL
	};
	
	
	/**
	* Returns the version number of the enumeration DifferenceType.
	*/
	public static int version() { 
		return alma.DifferenceTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DifferenceType.
	*/
	public static String revision() { 
		return alma.DifferenceTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DifferenceType.
	*/
	public static int size() { 
		return sDifferenceTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DifferenceType's enumerator.
	*/
	public static String name(DifferenceType f){
		switch(f.value()){
			case DifferenceType._PREDICTED : 
				return sPREDICTED;
			case DifferenceType._PRELIMINARY : 
				return sPRELIMINARY;
			case DifferenceType._RAPID : 
				return sRAPID;
			case DifferenceType._FINAL : 
				return sFINAL;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DifferenceType's enumerator.
	*/
	public static String toString(DifferenceType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDifferenceTypeSet;
	}
	
	
	/**
	* Returns a DifferenceType's enumerator by specifying its name.
	*/
	public static DifferenceType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sPREDICTED)) return DifferenceType.from_int(DifferenceType._PREDICTED);
		if(name.equals(sPRELIMINARY)) return DifferenceType.from_int(DifferenceType._PRELIMINARY);
		if(name.equals(sRAPID)) return DifferenceType.from_int(DifferenceType._RAPID);
		if(name.equals(sFINAL)) return DifferenceType.from_int(DifferenceType._FINAL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DifferenceType enumeration object by specifying its name
	*/
	public static DifferenceType newDifferenceType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sPREDICTED)) return DifferenceType.from_int(DifferenceType._PREDICTED);
		if(name.equals(sPRELIMINARY)) return DifferenceType.from_int(DifferenceType._PRELIMINARY);
		if(name.equals(sRAPID)) return DifferenceType.from_int(DifferenceType._RAPID);
		if(name.equals(sFINAL)) return DifferenceType.from_int(DifferenceType._FINAL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DifferenceType. 
	 * @parameter value an instance of DifferenceType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DifferenceType value) {
			
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


