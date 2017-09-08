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
 * File JCalDataOrigin.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CalDataOriginMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CalDataOrigin enumeration.
*/ 
public class JCalDataOrigin {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sTOTAL_POWER = "TOTAL_POWER";  /*!< A string definition for TOTAL_POWER */
	public static final String sWVR = "WVR";  /*!< A string definition for WVR */
	public static final String sCHANNEL_AVERAGE_AUTO = "CHANNEL_AVERAGE_AUTO";  /*!< A string definition for CHANNEL_AVERAGE_AUTO */
	public static final String sCHANNEL_AVERAGE_CROSS = "CHANNEL_AVERAGE_CROSS";  /*!< A string definition for CHANNEL_AVERAGE_CROSS */
	public static final String sFULL_RESOLUTION_AUTO = "FULL_RESOLUTION_AUTO";  /*!< A string definition for FULL_RESOLUTION_AUTO */
	public static final String sFULL_RESOLUTION_CROSS = "FULL_RESOLUTION_CROSS";  /*!< A string definition for FULL_RESOLUTION_CROSS */
	public static final String sOPTICAL_POINTING = "OPTICAL_POINTING";  /*!< A string definition for OPTICAL_POINTING */
	public static final String sHOLOGRAPHY = "HOLOGRAPHY";  /*!< A string definition for HOLOGRAPHY */
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	private static final String[] sCalDataOriginSet = {
		sTOTAL_POWER,
		sWVR,
		sCHANNEL_AVERAGE_AUTO,
		sCHANNEL_AVERAGE_CROSS,
		sFULL_RESOLUTION_AUTO,
		sFULL_RESOLUTION_CROSS,
		sOPTICAL_POINTING,
		sHOLOGRAPHY,
		sNONE
	};
	
	
	/**
	* Returns the version number of the enumeration CalDataOrigin.
	*/
	public static int version() { 
		return alma.CalDataOriginMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CalDataOrigin.
	*/
	public static String revision() { 
		return alma.CalDataOriginMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CalDataOrigin.
	*/
	public static int size() { 
		return sCalDataOriginSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CalDataOrigin's enumerator.
	*/
	public static String name(CalDataOrigin f){
		switch(f.value()){
			case CalDataOrigin._TOTAL_POWER : 
				return sTOTAL_POWER;
			case CalDataOrigin._WVR : 
				return sWVR;
			case CalDataOrigin._CHANNEL_AVERAGE_AUTO : 
				return sCHANNEL_AVERAGE_AUTO;
			case CalDataOrigin._CHANNEL_AVERAGE_CROSS : 
				return sCHANNEL_AVERAGE_CROSS;
			case CalDataOrigin._FULL_RESOLUTION_AUTO : 
				return sFULL_RESOLUTION_AUTO;
			case CalDataOrigin._FULL_RESOLUTION_CROSS : 
				return sFULL_RESOLUTION_CROSS;
			case CalDataOrigin._OPTICAL_POINTING : 
				return sOPTICAL_POINTING;
			case CalDataOrigin._HOLOGRAPHY : 
				return sHOLOGRAPHY;
			case CalDataOrigin._NONE : 
				return sNONE;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CalDataOrigin's enumerator.
	*/
	public static String toString(CalDataOrigin f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCalDataOriginSet;
	}
	
	
	/**
	* Returns a CalDataOrigin's enumerator by specifying its name.
	*/
	public static CalDataOrigin literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTOTAL_POWER)) return CalDataOrigin.from_int(CalDataOrigin._TOTAL_POWER);
		if(name.equals(sWVR)) return CalDataOrigin.from_int(CalDataOrigin._WVR);
		if(name.equals(sCHANNEL_AVERAGE_AUTO)) return CalDataOrigin.from_int(CalDataOrigin._CHANNEL_AVERAGE_AUTO);
		if(name.equals(sCHANNEL_AVERAGE_CROSS)) return CalDataOrigin.from_int(CalDataOrigin._CHANNEL_AVERAGE_CROSS);
		if(name.equals(sFULL_RESOLUTION_AUTO)) return CalDataOrigin.from_int(CalDataOrigin._FULL_RESOLUTION_AUTO);
		if(name.equals(sFULL_RESOLUTION_CROSS)) return CalDataOrigin.from_int(CalDataOrigin._FULL_RESOLUTION_CROSS);
		if(name.equals(sOPTICAL_POINTING)) return CalDataOrigin.from_int(CalDataOrigin._OPTICAL_POINTING);
		if(name.equals(sHOLOGRAPHY)) return CalDataOrigin.from_int(CalDataOrigin._HOLOGRAPHY);
		if(name.equals(sNONE)) return CalDataOrigin.from_int(CalDataOrigin._NONE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CalDataOrigin enumeration object by specifying its name
	*/
	public static CalDataOrigin newCalDataOrigin(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sTOTAL_POWER)) return CalDataOrigin.from_int(CalDataOrigin._TOTAL_POWER);
		if(name.equals(sWVR)) return CalDataOrigin.from_int(CalDataOrigin._WVR);
		if(name.equals(sCHANNEL_AVERAGE_AUTO)) return CalDataOrigin.from_int(CalDataOrigin._CHANNEL_AVERAGE_AUTO);
		if(name.equals(sCHANNEL_AVERAGE_CROSS)) return CalDataOrigin.from_int(CalDataOrigin._CHANNEL_AVERAGE_CROSS);
		if(name.equals(sFULL_RESOLUTION_AUTO)) return CalDataOrigin.from_int(CalDataOrigin._FULL_RESOLUTION_AUTO);
		if(name.equals(sFULL_RESOLUTION_CROSS)) return CalDataOrigin.from_int(CalDataOrigin._FULL_RESOLUTION_CROSS);
		if(name.equals(sOPTICAL_POINTING)) return CalDataOrigin.from_int(CalDataOrigin._OPTICAL_POINTING);
		if(name.equals(sHOLOGRAPHY)) return CalDataOrigin.from_int(CalDataOrigin._HOLOGRAPHY);
		if(name.equals(sNONE)) return CalDataOrigin.from_int(CalDataOrigin._NONE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CalDataOrigin. 
	 * @parameter value an instance of CalDataOrigin.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CalDataOrigin value) {
			
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


