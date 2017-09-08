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
 * File JCalibrationMode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CalibrationModeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CalibrationMode enumeration.
*/ 
public class JCalibrationMode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sHOLOGRAPHY = "HOLOGRAPHY";  /*!< A string definition for HOLOGRAPHY */
	public static final String sINTERFEROMETRY = "INTERFEROMETRY";  /*!< A string definition for INTERFEROMETRY */
	public static final String sOPTICAL = "OPTICAL";  /*!< A string definition for OPTICAL */
	public static final String sRADIOMETRY = "RADIOMETRY";  /*!< A string definition for RADIOMETRY */
	public static final String sWVR = "WVR";  /*!< A string definition for WVR */
	private static final String[] sCalibrationModeSet = {
		sHOLOGRAPHY,
		sINTERFEROMETRY,
		sOPTICAL,
		sRADIOMETRY,
		sWVR
	};
	
	
	/**
	* Returns the version number of the enumeration CalibrationMode.
	*/
	public static int version() { 
		return alma.CalibrationModeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CalibrationMode.
	*/
	public static String revision() { 
		return alma.CalibrationModeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CalibrationMode.
	*/
	public static int size() { 
		return sCalibrationModeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CalibrationMode's enumerator.
	*/
	public static String name(CalibrationMode f){
		switch(f.value()){
			case CalibrationMode._HOLOGRAPHY : 
				return sHOLOGRAPHY;
			case CalibrationMode._INTERFEROMETRY : 
				return sINTERFEROMETRY;
			case CalibrationMode._OPTICAL : 
				return sOPTICAL;
			case CalibrationMode._RADIOMETRY : 
				return sRADIOMETRY;
			case CalibrationMode._WVR : 
				return sWVR;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CalibrationMode's enumerator.
	*/
	public static String toString(CalibrationMode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCalibrationModeSet;
	}
	
	
	/**
	* Returns a CalibrationMode's enumerator by specifying its name.
	*/
	public static CalibrationMode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sHOLOGRAPHY)) return CalibrationMode.from_int(CalibrationMode._HOLOGRAPHY);
		if(name.equals(sINTERFEROMETRY)) return CalibrationMode.from_int(CalibrationMode._INTERFEROMETRY);
		if(name.equals(sOPTICAL)) return CalibrationMode.from_int(CalibrationMode._OPTICAL);
		if(name.equals(sRADIOMETRY)) return CalibrationMode.from_int(CalibrationMode._RADIOMETRY);
		if(name.equals(sWVR)) return CalibrationMode.from_int(CalibrationMode._WVR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CalibrationMode enumeration object by specifying its name
	*/
	public static CalibrationMode newCalibrationMode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sHOLOGRAPHY)) return CalibrationMode.from_int(CalibrationMode._HOLOGRAPHY);
		if(name.equals(sINTERFEROMETRY)) return CalibrationMode.from_int(CalibrationMode._INTERFEROMETRY);
		if(name.equals(sOPTICAL)) return CalibrationMode.from_int(CalibrationMode._OPTICAL);
		if(name.equals(sRADIOMETRY)) return CalibrationMode.from_int(CalibrationMode._RADIOMETRY);
		if(name.equals(sWVR)) return CalibrationMode.from_int(CalibrationMode._WVR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CalibrationMode. 
	 * @parameter value an instance of CalibrationMode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CalibrationMode value) {
			
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


