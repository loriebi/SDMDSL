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
 * File JFrequencyReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.FrequencyReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the FrequencyReferenceCode enumeration.
*/ 
public class JFrequencyReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sLABREST = "LABREST";  /*!< A string definition for LABREST */
	public static final String sLSRD = "LSRD";  /*!< A string definition for LSRD */
	public static final String sLSRK = "LSRK";  /*!< A string definition for LSRK */
	public static final String sBARY = "BARY";  /*!< A string definition for BARY */
	public static final String sREST = "REST";  /*!< A string definition for REST */
	public static final String sGEO = "GEO";  /*!< A string definition for GEO */
	public static final String sGALACTO = "GALACTO";  /*!< A string definition for GALACTO */
	public static final String sTOPO = "TOPO";  /*!< A string definition for TOPO */
	private static final String[] sFrequencyReferenceCodeSet = {
		sLABREST,
		sLSRD,
		sLSRK,
		sBARY,
		sREST,
		sGEO,
		sGALACTO,
		sTOPO
	};
	
	
	/**
	* Returns the version number of the enumeration FrequencyReferenceCode.
	*/
	public static int version() { 
		return alma.FrequencyReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration FrequencyReferenceCode.
	*/
	public static String revision() { 
		return alma.FrequencyReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in FrequencyReferenceCode.
	*/
	public static int size() { 
		return sFrequencyReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified FrequencyReferenceCode's enumerator.
	*/
	public static String name(FrequencyReferenceCode f){
		switch(f.value()){
			case FrequencyReferenceCode._LABREST : 
				return sLABREST;
			case FrequencyReferenceCode._LSRD : 
				return sLSRD;
			case FrequencyReferenceCode._LSRK : 
				return sLSRK;
			case FrequencyReferenceCode._BARY : 
				return sBARY;
			case FrequencyReferenceCode._REST : 
				return sREST;
			case FrequencyReferenceCode._GEO : 
				return sGEO;
			case FrequencyReferenceCode._GALACTO : 
				return sGALACTO;
			case FrequencyReferenceCode._TOPO : 
				return sTOPO;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified FrequencyReferenceCode's enumerator.
	*/
	public static String toString(FrequencyReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sFrequencyReferenceCodeSet;
	}
	
	
	/**
	* Returns a FrequencyReferenceCode's enumerator by specifying its name.
	*/
	public static FrequencyReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sLABREST)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LABREST);
		if(name.equals(sLSRD)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LSRD);
		if(name.equals(sLSRK)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LSRK);
		if(name.equals(sBARY)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._BARY);
		if(name.equals(sREST)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._REST);
		if(name.equals(sGEO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._GEO);
		if(name.equals(sGALACTO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._GALACTO);
		if(name.equals(sTOPO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._TOPO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a FrequencyReferenceCode enumeration object by specifying its name
	*/
	public static FrequencyReferenceCode newFrequencyReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sLABREST)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LABREST);
		if(name.equals(sLSRD)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LSRD);
		if(name.equals(sLSRK)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._LSRK);
		if(name.equals(sBARY)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._BARY);
		if(name.equals(sREST)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._REST);
		if(name.equals(sGEO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._GEO);
		if(name.equals(sGALACTO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._GALACTO);
		if(name.equals(sTOPO)) return FrequencyReferenceCode.from_int(FrequencyReferenceCode._TOPO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is FrequencyReferenceCode. 
	 * @parameter value an instance of FrequencyReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, FrequencyReferenceCode value) {
			
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


