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
 * File JCorrelatorCalibration.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CorrelatorCalibrationMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CorrelatorCalibration enumeration.
*/ 
public class JCorrelatorCalibration {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	public static final String sCORRELATOR_CALIBRATION = "CORRELATOR_CALIBRATION";  /*!< A string definition for CORRELATOR_CALIBRATION */
	public static final String sREAL_OBSERVATION = "REAL_OBSERVATION";  /*!< A string definition for REAL_OBSERVATION */
	private static final String[] sCorrelatorCalibrationSet = {
		sNONE,
		sCORRELATOR_CALIBRATION,
		sREAL_OBSERVATION
	};
	
	
	/**
	* Returns the version number of the enumeration CorrelatorCalibration.
	*/
	public static int version() { 
		return alma.CorrelatorCalibrationMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CorrelatorCalibration.
	*/
	public static String revision() { 
		return alma.CorrelatorCalibrationMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CorrelatorCalibration.
	*/
	public static int size() { 
		return sCorrelatorCalibrationSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CorrelatorCalibration's enumerator.
	*/
	public static String name(CorrelatorCalibration f){
		switch(f.value()){
			case CorrelatorCalibration._NONE : 
				return sNONE;
			case CorrelatorCalibration._CORRELATOR_CALIBRATION : 
				return sCORRELATOR_CALIBRATION;
			case CorrelatorCalibration._REAL_OBSERVATION : 
				return sREAL_OBSERVATION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CorrelatorCalibration's enumerator.
	*/
	public static String toString(CorrelatorCalibration f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCorrelatorCalibrationSet;
	}
	
	
	/**
	* Returns a CorrelatorCalibration's enumerator by specifying its name.
	*/
	public static CorrelatorCalibration literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return CorrelatorCalibration.from_int(CorrelatorCalibration._NONE);
		if(name.equals(sCORRELATOR_CALIBRATION)) return CorrelatorCalibration.from_int(CorrelatorCalibration._CORRELATOR_CALIBRATION);
		if(name.equals(sREAL_OBSERVATION)) return CorrelatorCalibration.from_int(CorrelatorCalibration._REAL_OBSERVATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CorrelatorCalibration enumeration object by specifying its name
	*/
	public static CorrelatorCalibration newCorrelatorCalibration(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return CorrelatorCalibration.from_int(CorrelatorCalibration._NONE);
		if(name.equals(sCORRELATOR_CALIBRATION)) return CorrelatorCalibration.from_int(CorrelatorCalibration._CORRELATOR_CALIBRATION);
		if(name.equals(sREAL_OBSERVATION)) return CorrelatorCalibration.from_int(CorrelatorCalibration._REAL_OBSERVATION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CorrelatorCalibration. 
	 * @parameter value an instance of CorrelatorCalibration.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CorrelatorCalibration value) {
			
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


