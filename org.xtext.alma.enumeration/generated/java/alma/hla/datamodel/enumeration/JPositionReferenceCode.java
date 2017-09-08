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
 * File JPositionReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.PositionReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the PositionReferenceCode enumeration.
*/ 
public class JPositionReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sITRF = "ITRF";  /*!< A string definition for ITRF */
	public static final String sWGS84 = "WGS84";  /*!< A string definition for WGS84 */
	public static final String sSITE = "SITE";  /*!< A string definition for SITE */
	public static final String sSTATION = "STATION";  /*!< A string definition for STATION */
	public static final String sYOKE = "YOKE";  /*!< A string definition for YOKE */
	public static final String sREFLECTOR = "REFLECTOR";  /*!< A string definition for REFLECTOR */
	private static final String[] sPositionReferenceCodeSet = {
		sITRF,
		sWGS84,
		sSITE,
		sSTATION,
		sYOKE,
		sREFLECTOR
	};
	
	
	/**
	* Returns the version number of the enumeration PositionReferenceCode.
	*/
	public static int version() { 
		return alma.PositionReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration PositionReferenceCode.
	*/
	public static String revision() { 
		return alma.PositionReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in PositionReferenceCode.
	*/
	public static int size() { 
		return sPositionReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified PositionReferenceCode's enumerator.
	*/
	public static String name(PositionReferenceCode f){
		switch(f.value()){
			case PositionReferenceCode._ITRF : 
				return sITRF;
			case PositionReferenceCode._WGS84 : 
				return sWGS84;
			case PositionReferenceCode._SITE : 
				return sSITE;
			case PositionReferenceCode._STATION : 
				return sSTATION;
			case PositionReferenceCode._YOKE : 
				return sYOKE;
			case PositionReferenceCode._REFLECTOR : 
				return sREFLECTOR;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified PositionReferenceCode's enumerator.
	*/
	public static String toString(PositionReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sPositionReferenceCodeSet;
	}
	
	
	/**
	* Returns a PositionReferenceCode's enumerator by specifying its name.
	*/
	public static PositionReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sITRF)) return PositionReferenceCode.from_int(PositionReferenceCode._ITRF);
		if(name.equals(sWGS84)) return PositionReferenceCode.from_int(PositionReferenceCode._WGS84);
		if(name.equals(sSITE)) return PositionReferenceCode.from_int(PositionReferenceCode._SITE);
		if(name.equals(sSTATION)) return PositionReferenceCode.from_int(PositionReferenceCode._STATION);
		if(name.equals(sYOKE)) return PositionReferenceCode.from_int(PositionReferenceCode._YOKE);
		if(name.equals(sREFLECTOR)) return PositionReferenceCode.from_int(PositionReferenceCode._REFLECTOR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a PositionReferenceCode enumeration object by specifying its name
	*/
	public static PositionReferenceCode newPositionReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sITRF)) return PositionReferenceCode.from_int(PositionReferenceCode._ITRF);
		if(name.equals(sWGS84)) return PositionReferenceCode.from_int(PositionReferenceCode._WGS84);
		if(name.equals(sSITE)) return PositionReferenceCode.from_int(PositionReferenceCode._SITE);
		if(name.equals(sSTATION)) return PositionReferenceCode.from_int(PositionReferenceCode._STATION);
		if(name.equals(sYOKE)) return PositionReferenceCode.from_int(PositionReferenceCode._YOKE);
		if(name.equals(sREFLECTOR)) return PositionReferenceCode.from_int(PositionReferenceCode._REFLECTOR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is PositionReferenceCode. 
	 * @parameter value an instance of PositionReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, PositionReferenceCode value) {
			
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


