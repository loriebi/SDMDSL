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
 * File JFluxCalibrationMethod.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.FluxCalibrationMethodMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the FluxCalibrationMethod enumeration.
*/ 
public class JFluxCalibrationMethod {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sABSOLUTE = "ABSOLUTE";  /*!< A string definition for ABSOLUTE */
	public static final String sRELATIVE = "RELATIVE";  /*!< A string definition for RELATIVE */
	public static final String sEFFICIENCY = "EFFICIENCY";  /*!< A string definition for EFFICIENCY */
	private static final String[] sFluxCalibrationMethodSet = {
		sABSOLUTE,
		sRELATIVE,
		sEFFICIENCY
	};
	
	
	/**
	* Returns the version number of the enumeration FluxCalibrationMethod.
	*/
	public static int version() { 
		return alma.FluxCalibrationMethodMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration FluxCalibrationMethod.
	*/
	public static String revision() { 
		return alma.FluxCalibrationMethodMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in FluxCalibrationMethod.
	*/
	public static int size() { 
		return sFluxCalibrationMethodSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified FluxCalibrationMethod's enumerator.
	*/
	public static String name(FluxCalibrationMethod f){
		switch(f.value()){
			case FluxCalibrationMethod._ABSOLUTE : 
				return sABSOLUTE;
			case FluxCalibrationMethod._RELATIVE : 
				return sRELATIVE;
			case FluxCalibrationMethod._EFFICIENCY : 
				return sEFFICIENCY;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified FluxCalibrationMethod's enumerator.
	*/
	public static String toString(FluxCalibrationMethod f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sFluxCalibrationMethodSet;
	}
	
	
	/**
	* Returns a FluxCalibrationMethod's enumerator by specifying its name.
	*/
	public static FluxCalibrationMethod literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sABSOLUTE)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._ABSOLUTE);
		if(name.equals(sRELATIVE)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._RELATIVE);
		if(name.equals(sEFFICIENCY)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._EFFICIENCY);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a FluxCalibrationMethod enumeration object by specifying its name
	*/
	public static FluxCalibrationMethod newFluxCalibrationMethod(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sABSOLUTE)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._ABSOLUTE);
		if(name.equals(sRELATIVE)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._RELATIVE);
		if(name.equals(sEFFICIENCY)) return FluxCalibrationMethod.from_int(FluxCalibrationMethod._EFFICIENCY);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is FluxCalibrationMethod. 
	 * @parameter value an instance of FluxCalibrationMethod.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, FluxCalibrationMethod value) {
			
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


