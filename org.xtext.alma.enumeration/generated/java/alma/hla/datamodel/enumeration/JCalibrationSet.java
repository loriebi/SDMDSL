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
 * File JCalibrationSet.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CalibrationSetMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CalibrationSet enumeration.
*/ 
public class JCalibrationSet {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	public static final String sAMPLI_CURVE = "AMPLI_CURVE";  /*!< A string definition for AMPLI_CURVE */
	public static final String sANTENNA_POSITIONS = "ANTENNA_POSITIONS";  /*!< A string definition for ANTENNA_POSITIONS */
	public static final String sPHASE_CURVE = "PHASE_CURVE";  /*!< A string definition for PHASE_CURVE */
	public static final String sPOINTING_MODEL = "POINTING_MODEL";  /*!< A string definition for POINTING_MODEL */
	public static final String sACCUMULATE = "ACCUMULATE";  /*!< A string definition for ACCUMULATE */
	public static final String sTEST = "TEST";  /*!< A string definition for TEST */
	public static final String sUNSPECIFIED = "UNSPECIFIED";  /*!< A string definition for UNSPECIFIED */
	private static final String[] sCalibrationSetSet = {
		sNONE,
		sAMPLI_CURVE,
		sANTENNA_POSITIONS,
		sPHASE_CURVE,
		sPOINTING_MODEL,
		sACCUMULATE,
		sTEST,
		sUNSPECIFIED
	};
	
	
	/**
	* Returns the version number of the enumeration CalibrationSet.
	*/
	public static int version() { 
		return alma.CalibrationSetMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CalibrationSet.
	*/
	public static String revision() { 
		return alma.CalibrationSetMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CalibrationSet.
	*/
	public static int size() { 
		return sCalibrationSetSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CalibrationSet's enumerator.
	*/
	public static String name(CalibrationSet f){
		switch(f.value()){
			case CalibrationSet._NONE : 
				return sNONE;
			case CalibrationSet._AMPLI_CURVE : 
				return sAMPLI_CURVE;
			case CalibrationSet._ANTENNA_POSITIONS : 
				return sANTENNA_POSITIONS;
			case CalibrationSet._PHASE_CURVE : 
				return sPHASE_CURVE;
			case CalibrationSet._POINTING_MODEL : 
				return sPOINTING_MODEL;
			case CalibrationSet._ACCUMULATE : 
				return sACCUMULATE;
			case CalibrationSet._TEST : 
				return sTEST;
			case CalibrationSet._UNSPECIFIED : 
				return sUNSPECIFIED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CalibrationSet's enumerator.
	*/
	public static String toString(CalibrationSet f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCalibrationSetSet;
	}
	
	
	/**
	* Returns a CalibrationSet's enumerator by specifying its name.
	*/
	public static CalibrationSet literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return CalibrationSet.from_int(CalibrationSet._NONE);
		if(name.equals(sAMPLI_CURVE)) return CalibrationSet.from_int(CalibrationSet._AMPLI_CURVE);
		if(name.equals(sANTENNA_POSITIONS)) return CalibrationSet.from_int(CalibrationSet._ANTENNA_POSITIONS);
		if(name.equals(sPHASE_CURVE)) return CalibrationSet.from_int(CalibrationSet._PHASE_CURVE);
		if(name.equals(sPOINTING_MODEL)) return CalibrationSet.from_int(CalibrationSet._POINTING_MODEL);
		if(name.equals(sACCUMULATE)) return CalibrationSet.from_int(CalibrationSet._ACCUMULATE);
		if(name.equals(sTEST)) return CalibrationSet.from_int(CalibrationSet._TEST);
		if(name.equals(sUNSPECIFIED)) return CalibrationSet.from_int(CalibrationSet._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CalibrationSet enumeration object by specifying its name
	*/
	public static CalibrationSet newCalibrationSet(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return CalibrationSet.from_int(CalibrationSet._NONE);
		if(name.equals(sAMPLI_CURVE)) return CalibrationSet.from_int(CalibrationSet._AMPLI_CURVE);
		if(name.equals(sANTENNA_POSITIONS)) return CalibrationSet.from_int(CalibrationSet._ANTENNA_POSITIONS);
		if(name.equals(sPHASE_CURVE)) return CalibrationSet.from_int(CalibrationSet._PHASE_CURVE);
		if(name.equals(sPOINTING_MODEL)) return CalibrationSet.from_int(CalibrationSet._POINTING_MODEL);
		if(name.equals(sACCUMULATE)) return CalibrationSet.from_int(CalibrationSet._ACCUMULATE);
		if(name.equals(sTEST)) return CalibrationSet.from_int(CalibrationSet._TEST);
		if(name.equals(sUNSPECIFIED)) return CalibrationSet.from_int(CalibrationSet._UNSPECIFIED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CalibrationSet. 
	 * @parameter value an instance of CalibrationSet.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CalibrationSet value) {
			
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


