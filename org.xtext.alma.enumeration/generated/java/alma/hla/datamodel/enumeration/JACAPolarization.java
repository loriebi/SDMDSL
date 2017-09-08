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
 * File JACAPolarization.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.ACAPolarizationMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the ACAPolarization enumeration.
*/ 
public class JACAPolarization {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sACA_STANDARD = "ACA_STANDARD";  /*!< A string definition for ACA_STANDARD */
	public static final String sACA_XX_YY_SUM = "ACA_XX_YY_SUM";  /*!< A string definition for ACA_XX_YY_SUM */
	public static final String sACA_XX_50 = "ACA_XX_50";  /*!< A string definition for ACA_XX_50 */
	public static final String sACA_YY_50 = "ACA_YY_50";  /*!< A string definition for ACA_YY_50 */
	private static final String[] sACAPolarizationSet = {
		sACA_STANDARD,
		sACA_XX_YY_SUM,
		sACA_XX_50,
		sACA_YY_50
	};
	
	
	/**
	* Returns the version number of the enumeration ACAPolarization.
	*/
	public static int version() { 
		return alma.ACAPolarizationMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration ACAPolarization.
	*/
	public static String revision() { 
		return alma.ACAPolarizationMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in ACAPolarization.
	*/
	public static int size() { 
		return sACAPolarizationSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified ACAPolarization's enumerator.
	*/
	public static String name(ACAPolarization f){
		switch(f.value()){
			case ACAPolarization._ACA_STANDARD : 
				return sACA_STANDARD;
			case ACAPolarization._ACA_XX_YY_SUM : 
				return sACA_XX_YY_SUM;
			case ACAPolarization._ACA_XX_50 : 
				return sACA_XX_50;
			case ACAPolarization._ACA_YY_50 : 
				return sACA_YY_50;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified ACAPolarization's enumerator.
	*/
	public static String toString(ACAPolarization f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sACAPolarizationSet;
	}
	
	
	/**
	* Returns a ACAPolarization's enumerator by specifying its name.
	*/
	public static ACAPolarization literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sACA_STANDARD)) return ACAPolarization.from_int(ACAPolarization._ACA_STANDARD);
		if(name.equals(sACA_XX_YY_SUM)) return ACAPolarization.from_int(ACAPolarization._ACA_XX_YY_SUM);
		if(name.equals(sACA_XX_50)) return ACAPolarization.from_int(ACAPolarization._ACA_XX_50);
		if(name.equals(sACA_YY_50)) return ACAPolarization.from_int(ACAPolarization._ACA_YY_50);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a ACAPolarization enumeration object by specifying its name
	*/
	public static ACAPolarization newACAPolarization(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sACA_STANDARD)) return ACAPolarization.from_int(ACAPolarization._ACA_STANDARD);
		if(name.equals(sACA_XX_YY_SUM)) return ACAPolarization.from_int(ACAPolarization._ACA_XX_YY_SUM);
		if(name.equals(sACA_XX_50)) return ACAPolarization.from_int(ACAPolarization._ACA_XX_50);
		if(name.equals(sACA_YY_50)) return ACAPolarization.from_int(ACAPolarization._ACA_YY_50);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is ACAPolarization. 
	 * @parameter value an instance of ACAPolarization.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, ACAPolarization value) {
			
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


