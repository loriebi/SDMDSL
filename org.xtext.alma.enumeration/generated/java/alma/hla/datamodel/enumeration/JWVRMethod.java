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
 * File JWVRMethod.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.WVRMethodMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the WVRMethod enumeration.
*/ 
public class JWVRMethod {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sATM_MODEL = "ATM_MODEL";  /*!< A string definition for ATM_MODEL */
	public static final String sEMPIRICAL = "EMPIRICAL";  /*!< A string definition for EMPIRICAL */
	private static final String[] sWVRMethodSet = {
		sATM_MODEL,
		sEMPIRICAL
	};
	
	
	/**
	* Returns the version number of the enumeration WVRMethod.
	*/
	public static int version() { 
		return alma.WVRMethodMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration WVRMethod.
	*/
	public static String revision() { 
		return alma.WVRMethodMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in WVRMethod.
	*/
	public static int size() { 
		return sWVRMethodSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified WVRMethod's enumerator.
	*/
	public static String name(WVRMethod f){
		switch(f.value()){
			case WVRMethod._ATM_MODEL : 
				return sATM_MODEL;
			case WVRMethod._EMPIRICAL : 
				return sEMPIRICAL;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified WVRMethod's enumerator.
	*/
	public static String toString(WVRMethod f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sWVRMethodSet;
	}
	
	
	/**
	* Returns a WVRMethod's enumerator by specifying its name.
	*/
	public static WVRMethod literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sATM_MODEL)) return WVRMethod.from_int(WVRMethod._ATM_MODEL);
		if(name.equals(sEMPIRICAL)) return WVRMethod.from_int(WVRMethod._EMPIRICAL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a WVRMethod enumeration object by specifying its name
	*/
	public static WVRMethod newWVRMethod(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sATM_MODEL)) return WVRMethod.from_int(WVRMethod._ATM_MODEL);
		if(name.equals(sEMPIRICAL)) return WVRMethod.from_int(WVRMethod._EMPIRICAL);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is WVRMethod. 
	 * @parameter value an instance of WVRMethod.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, WVRMethod value) {
			
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


