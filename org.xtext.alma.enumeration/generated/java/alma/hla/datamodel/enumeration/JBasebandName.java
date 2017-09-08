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
 * File JBasebandName.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.BasebandNameMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the BasebandName enumeration.
*/ 
public class JBasebandName {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNOBB = "NOBB";  /*!< A string definition for NOBB */
	public static final String sBB_1 = "BB_1";  /*!< A string definition for BB_1 */
	public static final String sBB_2 = "BB_2";  /*!< A string definition for BB_2 */
	public static final String sBB_3 = "BB_3";  /*!< A string definition for BB_3 */
	public static final String sBB_4 = "BB_4";  /*!< A string definition for BB_4 */
	public static final String sBB_5 = "BB_5";  /*!< A string definition for BB_5 */
	public static final String sBB_6 = "BB_6";  /*!< A string definition for BB_6 */
	public static final String sBB_7 = "BB_7";  /*!< A string definition for BB_7 */
	public static final String sBB_8 = "BB_8";  /*!< A string definition for BB_8 */
	public static final String sBB_ALL = "BB_ALL";  /*!< A string definition for BB_ALL */
	public static final String sA1C1_3BIT = "A1C1_3BIT";  /*!< A string definition for A1C1_3BIT */
	public static final String sA2C2_3BIT = "A2C2_3BIT";  /*!< A string definition for A2C2_3BIT */
	public static final String sAC_8BIT = "AC_8BIT";  /*!< A string definition for AC_8BIT */
	public static final String sB1D1_3BIT = "B1D1_3BIT";  /*!< A string definition for B1D1_3BIT */
	public static final String sB2D2_3BIT = "B2D2_3BIT";  /*!< A string definition for B2D2_3BIT */
	public static final String sBD_8BIT = "BD_8BIT";  /*!< A string definition for BD_8BIT */
	private static final String[] sBasebandNameSet = {
		sNOBB,
		sBB_1,
		sBB_2,
		sBB_3,
		sBB_4,
		sBB_5,
		sBB_6,
		sBB_7,
		sBB_8,
		sBB_ALL,
		sA1C1_3BIT,
		sA2C2_3BIT,
		sAC_8BIT,
		sB1D1_3BIT,
		sB2D2_3BIT,
		sBD_8BIT
	};
	
	
	/**
	* Returns the version number of the enumeration BasebandName.
	*/
	public static int version() { 
		return alma.BasebandNameMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration BasebandName.
	*/
	public static String revision() { 
		return alma.BasebandNameMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in BasebandName.
	*/
	public static int size() { 
		return sBasebandNameSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified BasebandName's enumerator.
	*/
	public static String name(BasebandName f){
		switch(f.value()){
			case BasebandName._NOBB : 
				return sNOBB;
			case BasebandName._BB_1 : 
				return sBB_1;
			case BasebandName._BB_2 : 
				return sBB_2;
			case BasebandName._BB_3 : 
				return sBB_3;
			case BasebandName._BB_4 : 
				return sBB_4;
			case BasebandName._BB_5 : 
				return sBB_5;
			case BasebandName._BB_6 : 
				return sBB_6;
			case BasebandName._BB_7 : 
				return sBB_7;
			case BasebandName._BB_8 : 
				return sBB_8;
			case BasebandName._BB_ALL : 
				return sBB_ALL;
			case BasebandName._A1C1_3BIT : 
				return sA1C1_3BIT;
			case BasebandName._A2C2_3BIT : 
				return sA2C2_3BIT;
			case BasebandName._AC_8BIT : 
				return sAC_8BIT;
			case BasebandName._B1D1_3BIT : 
				return sB1D1_3BIT;
			case BasebandName._B2D2_3BIT : 
				return sB2D2_3BIT;
			case BasebandName._BD_8BIT : 
				return sBD_8BIT;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified BasebandName's enumerator.
	*/
	public static String toString(BasebandName f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sBasebandNameSet;
	}
	
	
	/**
	* Returns a BasebandName's enumerator by specifying its name.
	*/
	public static BasebandName literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOBB)) return BasebandName.from_int(BasebandName._NOBB);
		if(name.equals(sBB_1)) return BasebandName.from_int(BasebandName._BB_1);
		if(name.equals(sBB_2)) return BasebandName.from_int(BasebandName._BB_2);
		if(name.equals(sBB_3)) return BasebandName.from_int(BasebandName._BB_3);
		if(name.equals(sBB_4)) return BasebandName.from_int(BasebandName._BB_4);
		if(name.equals(sBB_5)) return BasebandName.from_int(BasebandName._BB_5);
		if(name.equals(sBB_6)) return BasebandName.from_int(BasebandName._BB_6);
		if(name.equals(sBB_7)) return BasebandName.from_int(BasebandName._BB_7);
		if(name.equals(sBB_8)) return BasebandName.from_int(BasebandName._BB_8);
		if(name.equals(sBB_ALL)) return BasebandName.from_int(BasebandName._BB_ALL);
		if(name.equals(sA1C1_3BIT)) return BasebandName.from_int(BasebandName._A1C1_3BIT);
		if(name.equals(sA2C2_3BIT)) return BasebandName.from_int(BasebandName._A2C2_3BIT);
		if(name.equals(sAC_8BIT)) return BasebandName.from_int(BasebandName._AC_8BIT);
		if(name.equals(sB1D1_3BIT)) return BasebandName.from_int(BasebandName._B1D1_3BIT);
		if(name.equals(sB2D2_3BIT)) return BasebandName.from_int(BasebandName._B2D2_3BIT);
		if(name.equals(sBD_8BIT)) return BasebandName.from_int(BasebandName._BD_8BIT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a BasebandName enumeration object by specifying its name
	*/
	public static BasebandName newBasebandName(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOBB)) return BasebandName.from_int(BasebandName._NOBB);
		if(name.equals(sBB_1)) return BasebandName.from_int(BasebandName._BB_1);
		if(name.equals(sBB_2)) return BasebandName.from_int(BasebandName._BB_2);
		if(name.equals(sBB_3)) return BasebandName.from_int(BasebandName._BB_3);
		if(name.equals(sBB_4)) return BasebandName.from_int(BasebandName._BB_4);
		if(name.equals(sBB_5)) return BasebandName.from_int(BasebandName._BB_5);
		if(name.equals(sBB_6)) return BasebandName.from_int(BasebandName._BB_6);
		if(name.equals(sBB_7)) return BasebandName.from_int(BasebandName._BB_7);
		if(name.equals(sBB_8)) return BasebandName.from_int(BasebandName._BB_8);
		if(name.equals(sBB_ALL)) return BasebandName.from_int(BasebandName._BB_ALL);
		if(name.equals(sA1C1_3BIT)) return BasebandName.from_int(BasebandName._A1C1_3BIT);
		if(name.equals(sA2C2_3BIT)) return BasebandName.from_int(BasebandName._A2C2_3BIT);
		if(name.equals(sAC_8BIT)) return BasebandName.from_int(BasebandName._AC_8BIT);
		if(name.equals(sB1D1_3BIT)) return BasebandName.from_int(BasebandName._B1D1_3BIT);
		if(name.equals(sB2D2_3BIT)) return BasebandName.from_int(BasebandName._B2D2_3BIT);
		if(name.equals(sBD_8BIT)) return BasebandName.from_int(BasebandName._BD_8BIT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is BasebandName. 
	 * @parameter value an instance of BasebandName.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, BasebandName value) {
			
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


