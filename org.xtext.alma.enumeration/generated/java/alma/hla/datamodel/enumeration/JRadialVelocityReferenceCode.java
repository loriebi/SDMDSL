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
 * File JRadialVelocityReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.RadialVelocityReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the RadialVelocityReferenceCode enumeration.
*/ 
public class JRadialVelocityReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sLSRD = "LSRD";  /*!< A string definition for LSRD */
	public static final String sLSRK = "LSRK";  /*!< A string definition for LSRK */
	public static final String sGALACTO = "GALACTO";  /*!< A string definition for GALACTO */
	public static final String sBARY = "BARY";  /*!< A string definition for BARY */
	public static final String sGEO = "GEO";  /*!< A string definition for GEO */
	public static final String sTOPO = "TOPO";  /*!< A string definition for TOPO */
	private static final String[] sRadialVelocityReferenceCodeSet = {
		sLSRD,
		sLSRK,
		sGALACTO,
		sBARY,
		sGEO,
		sTOPO
	};
	
	
	/**
	* Returns the version number of the enumeration RadialVelocityReferenceCode.
	*/
	public static int version() { 
		return alma.RadialVelocityReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration RadialVelocityReferenceCode.
	*/
	public static String revision() { 
		return alma.RadialVelocityReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in RadialVelocityReferenceCode.
	*/
	public static int size() { 
		return sRadialVelocityReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified RadialVelocityReferenceCode's enumerator.
	*/
	public static String name(RadialVelocityReferenceCode f){
		switch(f.value()){
			case RadialVelocityReferenceCode._LSRD : 
				return sLSRD;
			case RadialVelocityReferenceCode._LSRK : 
				return sLSRK;
			case RadialVelocityReferenceCode._GALACTO : 
				return sGALACTO;
			case RadialVelocityReferenceCode._BARY : 
				return sBARY;
			case RadialVelocityReferenceCode._GEO : 
				return sGEO;
			case RadialVelocityReferenceCode._TOPO : 
				return sTOPO;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified RadialVelocityReferenceCode's enumerator.
	*/
	public static String toString(RadialVelocityReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sRadialVelocityReferenceCodeSet;
	}
	
	
	/**
	* Returns a RadialVelocityReferenceCode's enumerator by specifying its name.
	*/
	public static RadialVelocityReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sLSRD)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._LSRD);
		if(name.equals(sLSRK)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._LSRK);
		if(name.equals(sGALACTO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._GALACTO);
		if(name.equals(sBARY)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._BARY);
		if(name.equals(sGEO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._GEO);
		if(name.equals(sTOPO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._TOPO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a RadialVelocityReferenceCode enumeration object by specifying its name
	*/
	public static RadialVelocityReferenceCode newRadialVelocityReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sLSRD)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._LSRD);
		if(name.equals(sLSRK)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._LSRK);
		if(name.equals(sGALACTO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._GALACTO);
		if(name.equals(sBARY)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._BARY);
		if(name.equals(sGEO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._GEO);
		if(name.equals(sTOPO)) return RadialVelocityReferenceCode.from_int(RadialVelocityReferenceCode._TOPO);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is RadialVelocityReferenceCode. 
	 * @parameter value an instance of RadialVelocityReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, RadialVelocityReferenceCode value) {
			
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


