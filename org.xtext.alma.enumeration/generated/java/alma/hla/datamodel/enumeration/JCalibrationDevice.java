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
 * File JCalibrationDevice.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CalibrationDeviceMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CalibrationDevice enumeration.
*/ 
public class JCalibrationDevice {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sAMBIENT_LOAD = "AMBIENT_LOAD";  /*!< A string definition for AMBIENT_LOAD */
	public static final String sCOLD_LOAD = "COLD_LOAD";  /*!< A string definition for COLD_LOAD */
	public static final String sHOT_LOAD = "HOT_LOAD";  /*!< A string definition for HOT_LOAD */
	public static final String sNOISE_TUBE_LOAD = "NOISE_TUBE_LOAD";  /*!< A string definition for NOISE_TUBE_LOAD */
	public static final String sQUARTER_WAVE_PLATE = "QUARTER_WAVE_PLATE";  /*!< A string definition for QUARTER_WAVE_PLATE */
	public static final String sSOLAR_FILTER = "SOLAR_FILTER";  /*!< A string definition for SOLAR_FILTER */
	public static final String sNONE = "NONE";  /*!< A string definition for NONE */
	private static final String[] sCalibrationDeviceSet = {
		sAMBIENT_LOAD,
		sCOLD_LOAD,
		sHOT_LOAD,
		sNOISE_TUBE_LOAD,
		sQUARTER_WAVE_PLATE,
		sSOLAR_FILTER,
		sNONE
	};
	
	
	/**
	* Returns the version number of the enumeration CalibrationDevice.
	*/
	public static int version() { 
		return alma.CalibrationDeviceMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CalibrationDevice.
	*/
	public static String revision() { 
		return alma.CalibrationDeviceMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CalibrationDevice.
	*/
	public static int size() { 
		return sCalibrationDeviceSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CalibrationDevice's enumerator.
	*/
	public static String name(CalibrationDevice f){
		switch(f.value()){
			case CalibrationDevice._AMBIENT_LOAD : 
				return sAMBIENT_LOAD;
			case CalibrationDevice._COLD_LOAD : 
				return sCOLD_LOAD;
			case CalibrationDevice._HOT_LOAD : 
				return sHOT_LOAD;
			case CalibrationDevice._NOISE_TUBE_LOAD : 
				return sNOISE_TUBE_LOAD;
			case CalibrationDevice._QUARTER_WAVE_PLATE : 
				return sQUARTER_WAVE_PLATE;
			case CalibrationDevice._SOLAR_FILTER : 
				return sSOLAR_FILTER;
			case CalibrationDevice._NONE : 
				return sNONE;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CalibrationDevice's enumerator.
	*/
	public static String toString(CalibrationDevice f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCalibrationDeviceSet;
	}
	
	
	/**
	* Returns a CalibrationDevice's enumerator by specifying its name.
	*/
	public static CalibrationDevice literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sAMBIENT_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._AMBIENT_LOAD);
		if(name.equals(sCOLD_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._COLD_LOAD);
		if(name.equals(sHOT_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._HOT_LOAD);
		if(name.equals(sNOISE_TUBE_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._NOISE_TUBE_LOAD);
		if(name.equals(sQUARTER_WAVE_PLATE)) return CalibrationDevice.from_int(CalibrationDevice._QUARTER_WAVE_PLATE);
		if(name.equals(sSOLAR_FILTER)) return CalibrationDevice.from_int(CalibrationDevice._SOLAR_FILTER);
		if(name.equals(sNONE)) return CalibrationDevice.from_int(CalibrationDevice._NONE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CalibrationDevice enumeration object by specifying its name
	*/
	public static CalibrationDevice newCalibrationDevice(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sAMBIENT_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._AMBIENT_LOAD);
		if(name.equals(sCOLD_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._COLD_LOAD);
		if(name.equals(sHOT_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._HOT_LOAD);
		if(name.equals(sNOISE_TUBE_LOAD)) return CalibrationDevice.from_int(CalibrationDevice._NOISE_TUBE_LOAD);
		if(name.equals(sQUARTER_WAVE_PLATE)) return CalibrationDevice.from_int(CalibrationDevice._QUARTER_WAVE_PLATE);
		if(name.equals(sSOLAR_FILTER)) return CalibrationDevice.from_int(CalibrationDevice._SOLAR_FILTER);
		if(name.equals(sNONE)) return CalibrationDevice.from_int(CalibrationDevice._NONE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CalibrationDevice. 
	 * @parameter value an instance of CalibrationDevice.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CalibrationDevice value) {
			
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


