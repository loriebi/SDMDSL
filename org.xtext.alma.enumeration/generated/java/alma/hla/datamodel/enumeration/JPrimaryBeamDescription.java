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
 * File JPrimaryBeamDescription.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.PrimaryBeamDescriptionMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the PrimaryBeamDescription enumeration.
*/ 
public class JPrimaryBeamDescription {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sCOMPLEX_FIELD_PATTERN = "COMPLEX_FIELD_PATTERN";  /*!< A string definition for COMPLEX_FIELD_PATTERN */
	public static final String sAPERTURE_FIELD_DISTRIBUTION = "APERTURE_FIELD_DISTRIBUTION";  /*!< A string definition for APERTURE_FIELD_DISTRIBUTION */
	private static final String[] sPrimaryBeamDescriptionSet = {
		sCOMPLEX_FIELD_PATTERN,
		sAPERTURE_FIELD_DISTRIBUTION
	};
	
	
	/**
	* Returns the version number of the enumeration PrimaryBeamDescription.
	*/
	public static int version() { 
		return alma.PrimaryBeamDescriptionMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration PrimaryBeamDescription.
	*/
	public static String revision() { 
		return alma.PrimaryBeamDescriptionMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in PrimaryBeamDescription.
	*/
	public static int size() { 
		return sPrimaryBeamDescriptionSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified PrimaryBeamDescription's enumerator.
	*/
	public static String name(PrimaryBeamDescription f){
		switch(f.value()){
			case PrimaryBeamDescription._COMPLEX_FIELD_PATTERN : 
				return sCOMPLEX_FIELD_PATTERN;
			case PrimaryBeamDescription._APERTURE_FIELD_DISTRIBUTION : 
				return sAPERTURE_FIELD_DISTRIBUTION;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified PrimaryBeamDescription's enumerator.
	*/
	public static String toString(PrimaryBeamDescription f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sPrimaryBeamDescriptionSet;
	}
	
	
	/**
	* Returns a PrimaryBeamDescription's enumerator by specifying its name.
	*/
	public static PrimaryBeamDescription literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCOMPLEX_FIELD_PATTERN)) return PrimaryBeamDescription.from_int(PrimaryBeamDescription._COMPLEX_FIELD_PATTERN);
		if(name.equals(sAPERTURE_FIELD_DISTRIBUTION)) return PrimaryBeamDescription.from_int(PrimaryBeamDescription._APERTURE_FIELD_DISTRIBUTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a PrimaryBeamDescription enumeration object by specifying its name
	*/
	public static PrimaryBeamDescription newPrimaryBeamDescription(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sCOMPLEX_FIELD_PATTERN)) return PrimaryBeamDescription.from_int(PrimaryBeamDescription._COMPLEX_FIELD_PATTERN);
		if(name.equals(sAPERTURE_FIELD_DISTRIBUTION)) return PrimaryBeamDescription.from_int(PrimaryBeamDescription._APERTURE_FIELD_DISTRIBUTION);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is PrimaryBeamDescription. 
	 * @parameter value an instance of PrimaryBeamDescription.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, PrimaryBeamDescription value) {
			
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


