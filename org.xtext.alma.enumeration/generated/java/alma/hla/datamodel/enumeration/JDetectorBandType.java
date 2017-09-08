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
 * File JDetectorBandType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DetectorBandTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DetectorBandType enumeration.
*/ 
public class JDetectorBandType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sBASEBAND = "BASEBAND";  /*!< A string definition for BASEBAND */
	public static final String sDOWN_CONVERTER = "DOWN_CONVERTER";  /*!< A string definition for DOWN_CONVERTER */
	public static final String sHOLOGRAPHY_RECEIVER = "HOLOGRAPHY_RECEIVER";  /*!< A string definition for HOLOGRAPHY_RECEIVER */
	public static final String sSUBBAND = "SUBBAND";  /*!< A string definition for SUBBAND */
	private static final String[] sDetectorBandTypeSet = {
		sBASEBAND,
		sDOWN_CONVERTER,
		sHOLOGRAPHY_RECEIVER,
		sSUBBAND
	};
	
	
	/**
	* Returns the version number of the enumeration DetectorBandType.
	*/
	public static int version() { 
		return alma.DetectorBandTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DetectorBandType.
	*/
	public static String revision() { 
		return alma.DetectorBandTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DetectorBandType.
	*/
	public static int size() { 
		return sDetectorBandTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DetectorBandType's enumerator.
	*/
	public static String name(DetectorBandType f){
		switch(f.value()){
			case DetectorBandType._BASEBAND : 
				return sBASEBAND;
			case DetectorBandType._DOWN_CONVERTER : 
				return sDOWN_CONVERTER;
			case DetectorBandType._HOLOGRAPHY_RECEIVER : 
				return sHOLOGRAPHY_RECEIVER;
			case DetectorBandType._SUBBAND : 
				return sSUBBAND;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DetectorBandType's enumerator.
	*/
	public static String toString(DetectorBandType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDetectorBandTypeSet;
	}
	
	
	/**
	* Returns a DetectorBandType's enumerator by specifying its name.
	*/
	public static DetectorBandType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sBASEBAND)) return DetectorBandType.from_int(DetectorBandType._BASEBAND);
		if(name.equals(sDOWN_CONVERTER)) return DetectorBandType.from_int(DetectorBandType._DOWN_CONVERTER);
		if(name.equals(sHOLOGRAPHY_RECEIVER)) return DetectorBandType.from_int(DetectorBandType._HOLOGRAPHY_RECEIVER);
		if(name.equals(sSUBBAND)) return DetectorBandType.from_int(DetectorBandType._SUBBAND);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DetectorBandType enumeration object by specifying its name
	*/
	public static DetectorBandType newDetectorBandType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sBASEBAND)) return DetectorBandType.from_int(DetectorBandType._BASEBAND);
		if(name.equals(sDOWN_CONVERTER)) return DetectorBandType.from_int(DetectorBandType._DOWN_CONVERTER);
		if(name.equals(sHOLOGRAPHY_RECEIVER)) return DetectorBandType.from_int(DetectorBandType._HOLOGRAPHY_RECEIVER);
		if(name.equals(sSUBBAND)) return DetectorBandType.from_int(DetectorBandType._SUBBAND);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DetectorBandType. 
	 * @parameter value an instance of DetectorBandType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DetectorBandType value) {
			
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


