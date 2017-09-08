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
 * File JAntennaMake.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.AntennaMakeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the AntennaMake enumeration.
*/ 
public class JAntennaMake {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sAEM_12 = "AEM_12";  /*!< A string definition for AEM_12 */
	public static final String sMITSUBISHI_7 = "MITSUBISHI_7";  /*!< A string definition for MITSUBISHI_7 */
	public static final String sMITSUBISHI_12_A = "MITSUBISHI_12_A";  /*!< A string definition for MITSUBISHI_12_A */
	public static final String sMITSUBISHI_12_B = "MITSUBISHI_12_B";  /*!< A string definition for MITSUBISHI_12_B */
	public static final String sVERTEX_12_ATF = "VERTEX_12_ATF";  /*!< A string definition for VERTEX_12_ATF */
	public static final String sAEM_12_ATF = "AEM_12_ATF";  /*!< A string definition for AEM_12_ATF */
	public static final String sVERTEX_12 = "VERTEX_12";  /*!< A string definition for VERTEX_12 */
	public static final String sIRAM_15 = "IRAM_15";  /*!< A string definition for IRAM_15 */
	public static final String sUNDEFINED = "UNDEFINED";  /*!< A string definition for UNDEFINED */
	private static final String[] sAntennaMakeSet = {
		sAEM_12,
		sMITSUBISHI_7,
		sMITSUBISHI_12_A,
		sMITSUBISHI_12_B,
		sVERTEX_12_ATF,
		sAEM_12_ATF,
		sVERTEX_12,
		sIRAM_15,
		sUNDEFINED
	};
	
	
	/**
	* Returns the version number of the enumeration AntennaMake.
	*/
	public static int version() { 
		return alma.AntennaMakeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration AntennaMake.
	*/
	public static String revision() { 
		return alma.AntennaMakeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in AntennaMake.
	*/
	public static int size() { 
		return sAntennaMakeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified AntennaMake's enumerator.
	*/
	public static String name(AntennaMake f){
		switch(f.value()){
			case AntennaMake._AEM_12 : 
				return sAEM_12;
			case AntennaMake._MITSUBISHI_7 : 
				return sMITSUBISHI_7;
			case AntennaMake._MITSUBISHI_12_A : 
				return sMITSUBISHI_12_A;
			case AntennaMake._MITSUBISHI_12_B : 
				return sMITSUBISHI_12_B;
			case AntennaMake._VERTEX_12_ATF : 
				return sVERTEX_12_ATF;
			case AntennaMake._AEM_12_ATF : 
				return sAEM_12_ATF;
			case AntennaMake._VERTEX_12 : 
				return sVERTEX_12;
			case AntennaMake._IRAM_15 : 
				return sIRAM_15;
			case AntennaMake._UNDEFINED : 
				return sUNDEFINED;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified AntennaMake's enumerator.
	*/
	public static String toString(AntennaMake f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sAntennaMakeSet;
	}
	
	
	/**
	* Returns a AntennaMake's enumerator by specifying its name.
	*/
	public static AntennaMake literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sAEM_12)) return AntennaMake.from_int(AntennaMake._AEM_12);
		if(name.equals(sMITSUBISHI_7)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_7);
		if(name.equals(sMITSUBISHI_12_A)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_12_A);
		if(name.equals(sMITSUBISHI_12_B)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_12_B);
		if(name.equals(sVERTEX_12_ATF)) return AntennaMake.from_int(AntennaMake._VERTEX_12_ATF);
		if(name.equals(sAEM_12_ATF)) return AntennaMake.from_int(AntennaMake._AEM_12_ATF);
		if(name.equals(sVERTEX_12)) return AntennaMake.from_int(AntennaMake._VERTEX_12);
		if(name.equals(sIRAM_15)) return AntennaMake.from_int(AntennaMake._IRAM_15);
		if(name.equals(sUNDEFINED)) return AntennaMake.from_int(AntennaMake._UNDEFINED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a AntennaMake enumeration object by specifying its name
	*/
	public static AntennaMake newAntennaMake(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sAEM_12)) return AntennaMake.from_int(AntennaMake._AEM_12);
		if(name.equals(sMITSUBISHI_7)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_7);
		if(name.equals(sMITSUBISHI_12_A)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_12_A);
		if(name.equals(sMITSUBISHI_12_B)) return AntennaMake.from_int(AntennaMake._MITSUBISHI_12_B);
		if(name.equals(sVERTEX_12_ATF)) return AntennaMake.from_int(AntennaMake._VERTEX_12_ATF);
		if(name.equals(sAEM_12_ATF)) return AntennaMake.from_int(AntennaMake._AEM_12_ATF);
		if(name.equals(sVERTEX_12)) return AntennaMake.from_int(AntennaMake._VERTEX_12);
		if(name.equals(sIRAM_15)) return AntennaMake.from_int(AntennaMake._IRAM_15);
		if(name.equals(sUNDEFINED)) return AntennaMake.from_int(AntennaMake._UNDEFINED);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is AntennaMake. 
	 * @parameter value an instance of AntennaMake.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, AntennaMake value) {
			
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


