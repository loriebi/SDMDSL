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
 * File JAntennaMotionPattern.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.AntennaMotionPatternMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the AntennaMotionPattern enumeration.
*/ 
public class JAntennaMotionPattern {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	public static final String sCROSS_SCAN = "CROSS_SCAN";  /*!< A string definition for CROSS_SCAN */
	public static final String sSPIRAL = "SPIRAL";  /*!< A string definition for SPIRAL */
	public static final String sCIRCLE = "CIRCLE";  /*!< A string definition for CIRCLE */
	public static final String sTHREE_POINTS = "THREE_POINTS";  /*!< A string definition for THREE_POINTS */
	public static final String sFOUR_POINTS = "FOUR_POINTS";  /*!< A string definition for FOUR_POINTS */
	public static final String sFIVE_POINTS = "FIVE_POINTS";  /*!< A string definition for FIVE_POINTS */
	public static final String sTEST = "TEST";  /*!< A string definition for TEST */
	public static final String sUNSPECIFIED = "UNSPECIFIED";  /*!< A string definition for UNSPECIFIED */
	public static final String sSTAR = "STAR";  /*!< A string definition for STAR */
	public static final String sLISSAJOUS = "LISSAJOUS";  /*!< A string definition for LISSAJOUS */
	private static final String[] sAntennaMotionPatternSet = {
		sNONE,
		sCROSS_SCAN,
		sSPIRAL,
		sCIRCLE,
		sTHREE_POINTS,
		sFOUR_POINTS,
		sFIVE_POINTS,
		sTEST,
		sUNSPECIFIED,
		sSTAR,
		sLISSAJOUS
	};
	
	
	/**
	* Returns the version number of the enumeration AntennaMotionPattern.
	*/
	public static int version() { 
		return alma.AntennaMotionPatternMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration AntennaMotionPattern.
	*/
	public static String revision() { 
		return alma.AntennaMotionPatternMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in AntennaMotionPattern.
	*/
	public static int size() { 
		return sAntennaMotionPatternSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified AntennaMotionPattern's enumerator.
	*/
	public static String name(AntennaMotionPattern f){
		switch(f.value()){
			case AntennaMotionPattern._NONE : 
				return sNONE;
			case AntennaMotionPattern._CROSS_SCAN : 
				return sCROSS_SCAN;
			case AntennaMotionPattern._SPIRAL : 
				return sSPIRAL;
			case AntennaMotionPattern._CIRCLE : 
				return sCIRCLE;
			case AntennaMotionPattern._THREE_POINTS : 
				return sTHREE_POINTS;
			case AntennaMotionPattern._FOUR_POINTS : 
				return sFOUR_POINTS;
			case AntennaMotionPattern._FIVE_POINTS : 
				return sFIVE_POINTS;
			case AntennaMotionPattern._TEST : 
				return sTEST;
			case AntennaMotionPattern._UNSPECIFIED : 
				return sUNSPECIFIED;
			case AntennaMotionPattern._STAR : 
				return sSTAR;
			case AntennaMotionPattern._LISSAJOUS : 
				return sLISSAJOUS;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified AntennaMotionPattern's enumerator.
	*/
	public static String toString(AntennaMotionPattern f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sAntennaMotionPatternSet;
	}
	
	
	/**
	* Returns a AntennaMotionPattern's enumerator by specifying its name.
	*/
	public static AntennaMotionPattern literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return AntennaMotionPattern.from_int(AntennaMotionPattern._NONE);
		if(name.equals(sCROSS_SCAN)) return AntennaMotionPattern.from_int(AntennaMotionPattern._CROSS_SCAN);
		if(name.equals(sSPIRAL)) return AntennaMotionPattern.from_int(AntennaMotionPattern._SPIRAL);
		if(name.equals(sCIRCLE)) return AntennaMotionPattern.from_int(AntennaMotionPattern._CIRCLE);
		if(name.equals(sTHREE_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._THREE_POINTS);
		if(name.equals(sFOUR_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._FOUR_POINTS);
		if(name.equals(sFIVE_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._FIVE_POINTS);
		if(name.equals(sTEST)) return AntennaMotionPattern.from_int(AntennaMotionPattern._TEST);
		if(name.equals(sUNSPECIFIED)) return AntennaMotionPattern.from_int(AntennaMotionPattern._UNSPECIFIED);
		if(name.equals(sSTAR)) return AntennaMotionPattern.from_int(AntennaMotionPattern._STAR);
		if(name.equals(sLISSAJOUS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._LISSAJOUS);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a AntennaMotionPattern enumeration object by specifying its name
	*/
	public static AntennaMotionPattern newAntennaMotionPattern(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNONE)) return AntennaMotionPattern.from_int(AntennaMotionPattern._NONE);
		if(name.equals(sCROSS_SCAN)) return AntennaMotionPattern.from_int(AntennaMotionPattern._CROSS_SCAN);
		if(name.equals(sSPIRAL)) return AntennaMotionPattern.from_int(AntennaMotionPattern._SPIRAL);
		if(name.equals(sCIRCLE)) return AntennaMotionPattern.from_int(AntennaMotionPattern._CIRCLE);
		if(name.equals(sTHREE_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._THREE_POINTS);
		if(name.equals(sFOUR_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._FOUR_POINTS);
		if(name.equals(sFIVE_POINTS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._FIVE_POINTS);
		if(name.equals(sTEST)) return AntennaMotionPattern.from_int(AntennaMotionPattern._TEST);
		if(name.equals(sUNSPECIFIED)) return AntennaMotionPattern.from_int(AntennaMotionPattern._UNSPECIFIED);
		if(name.equals(sSTAR)) return AntennaMotionPattern.from_int(AntennaMotionPattern._STAR);
		if(name.equals(sLISSAJOUS)) return AntennaMotionPattern.from_int(AntennaMotionPattern._LISSAJOUS);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is AntennaMotionPattern. 
	 * @parameter value an instance of AntennaMotionPattern.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, AntennaMotionPattern value) {
			
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


