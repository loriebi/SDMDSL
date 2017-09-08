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
 * File JSyscalMethod.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SyscalMethodMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SyscalMethod enumeration.
*/ 
public class JSyscalMethod {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sTEMPERATURE_SCALE = "TEMPERATURE_SCALE";  /*!< A string definition for TEMPERATURE_SCALE */
	public static final String sSKYDIP = "SKYDIP";  /*!< A string definition for SKYDIP */
	public static final String sSIDEBAND_RATIO = "SIDEBAND_RATIO";  /*!< A string definition for SIDEBAND_RATIO */
	private static final String[] sSyscalMethodSet = {
		sTEMPERATURE_SCALE,
		sSKYDIP,
		sSIDEBAND_RATIO
	};
	
	
	/**
	* Returns the version number of the enumeration SyscalMethod.
	*/
	public static int version() { 
		return alma.SyscalMethodMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SyscalMethod.
	*/
	public static String revision() { 
		return alma.SyscalMethodMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SyscalMethod.
	*/
	public static int size() { 
		return sSyscalMethodSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SyscalMethod's enumerator.
	*/
	public static String name(SyscalMethod f){
		switch(f.value()){
			case SyscalMethod._TEMPERATURE_SCALE : 
				return sTEMPERATURE_SCALE;
			case SyscalMethod._SKYDIP : 
				return sSKYDIP;
			case SyscalMethod._SIDEBAND_RATIO : 
				return sSIDEBAND_RATIO;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SyscalMethod's enumerator.
	*/
	public static String toString(SyscalMethod f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSyscalMethodSet;
	}
	
	
	/**
	* Returns a SyscalMethod's enumerator by specifying its name.
	*/
	public static SyscalMethod literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTEMPERATURE_SCALE)) return SyscalMethod.from_int(SyscalMethod._TEMPERATURE_SCALE);
		if(name.equals(sSKYDIP)) return SyscalMethod.from_int(SyscalMethod._SKYDIP);
		if(name.equals(sSIDEBAND_RATIO)) return SyscalMethod.from_int(SyscalMethod._SIDEBAND_RATIO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SyscalMethod enumeration object by specifying its name
	*/
	public static SyscalMethod newSyscalMethod(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTEMPERATURE_SCALE)) return SyscalMethod.from_int(SyscalMethod._TEMPERATURE_SCALE);
		if(name.equals(sSKYDIP)) return SyscalMethod.from_int(SyscalMethod._SKYDIP);
		if(name.equals(sSIDEBAND_RATIO)) return SyscalMethod.from_int(SyscalMethod._SIDEBAND_RATIO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SyscalMethod. 
	 * @parameter value an instance of SyscalMethod.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SyscalMethod value) {
			
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


