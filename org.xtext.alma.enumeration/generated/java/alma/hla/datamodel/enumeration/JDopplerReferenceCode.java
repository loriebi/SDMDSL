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
 * File JDopplerReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DopplerReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DopplerReferenceCode enumeration.
*/ 
public class JDopplerReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sRADIO = "RADIO";  /*!< A string definition for RADIO */
	public static final String sZ = "Z";  /*!< A string definition for Z */
	public static final String sRATIO = "RATIO";  /*!< A string definition for RATIO */
	public static final String sBETA = "BETA";  /*!< A string definition for BETA */
	public static final String sGAMMA = "GAMMA";  /*!< A string definition for GAMMA */
	public static final String sOPTICAL = "OPTICAL";  /*!< A string definition for OPTICAL */
	public static final String sRELATIVISTIC = "RELATIVISTIC";  /*!< A string definition for RELATIVISTIC */
	private static final String[] sDopplerReferenceCodeSet = {
		sRADIO,
		sZ,
		sRATIO,
		sBETA,
		sGAMMA,
		sOPTICAL,
		sRELATIVISTIC
	};
	
	
	/**
	* Returns the version number of the enumeration DopplerReferenceCode.
	*/
	public static int version() { 
		return alma.DopplerReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DopplerReferenceCode.
	*/
	public static String revision() { 
		return alma.DopplerReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DopplerReferenceCode.
	*/
	public static int size() { 
		return sDopplerReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DopplerReferenceCode's enumerator.
	*/
	public static String name(DopplerReferenceCode f){
		switch(f.value()){
			case DopplerReferenceCode._RADIO : 
				return sRADIO;
			case DopplerReferenceCode._Z : 
				return sZ;
			case DopplerReferenceCode._RATIO : 
				return sRATIO;
			case DopplerReferenceCode._BETA : 
				return sBETA;
			case DopplerReferenceCode._GAMMA : 
				return sGAMMA;
			case DopplerReferenceCode._OPTICAL : 
				return sOPTICAL;
			case DopplerReferenceCode._RELATIVISTIC : 
				return sRELATIVISTIC;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DopplerReferenceCode's enumerator.
	*/
	public static String toString(DopplerReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDopplerReferenceCodeSet;
	}
	
	
	/**
	* Returns a DopplerReferenceCode's enumerator by specifying its name.
	*/
	public static DopplerReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sRADIO)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RADIO);
		if(name.equals(sZ)) return DopplerReferenceCode.from_int(DopplerReferenceCode._Z);
		if(name.equals(sRATIO)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RATIO);
		if(name.equals(sBETA)) return DopplerReferenceCode.from_int(DopplerReferenceCode._BETA);
		if(name.equals(sGAMMA)) return DopplerReferenceCode.from_int(DopplerReferenceCode._GAMMA);
		if(name.equals(sOPTICAL)) return DopplerReferenceCode.from_int(DopplerReferenceCode._OPTICAL);
		if(name.equals(sRELATIVISTIC)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RELATIVISTIC);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DopplerReferenceCode enumeration object by specifying its name
	*/
	public static DopplerReferenceCode newDopplerReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sRADIO)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RADIO);
		if(name.equals(sZ)) return DopplerReferenceCode.from_int(DopplerReferenceCode._Z);
		if(name.equals(sRATIO)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RATIO);
		if(name.equals(sBETA)) return DopplerReferenceCode.from_int(DopplerReferenceCode._BETA);
		if(name.equals(sGAMMA)) return DopplerReferenceCode.from_int(DopplerReferenceCode._GAMMA);
		if(name.equals(sOPTICAL)) return DopplerReferenceCode.from_int(DopplerReferenceCode._OPTICAL);
		if(name.equals(sRELATIVISTIC)) return DopplerReferenceCode.from_int(DopplerReferenceCode._RELATIVISTIC);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DopplerReferenceCode. 
	 * @parameter value an instance of DopplerReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DopplerReferenceCode value) {
			
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


