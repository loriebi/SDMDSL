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
 * File JSBType.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SBTypeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SBType enumeration.
*/ 
public class JSBType {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sOBSERVATORY = "OBSERVATORY";  /*!< A string definition for OBSERVATORY */
	public static final String sOBSERVER = "OBSERVER";  /*!< A string definition for OBSERVER */
	public static final String sEXPERT = "EXPERT";  /*!< A string definition for EXPERT */
	private static final String[] sSBTypeSet = {
		sOBSERVATORY,
		sOBSERVER,
		sEXPERT
	};
	
	
	/**
	* Returns the version number of the enumeration SBType.
	*/
	public static int version() { 
		return alma.SBTypeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SBType.
	*/
	public static String revision() { 
		return alma.SBTypeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SBType.
	*/
	public static int size() { 
		return sSBTypeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SBType's enumerator.
	*/
	public static String name(SBType f){
		switch(f.value()){
			case SBType._OBSERVATORY : 
				return sOBSERVATORY;
			case SBType._OBSERVER : 
				return sOBSERVER;
			case SBType._EXPERT : 
				return sEXPERT;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SBType's enumerator.
	*/
	public static String toString(SBType f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSBTypeSet;
	}
	
	
	/**
	* Returns a SBType's enumerator by specifying its name.
	*/
	public static SBType literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sOBSERVATORY)) return SBType.from_int(SBType._OBSERVATORY);
		if(name.equals(sOBSERVER)) return SBType.from_int(SBType._OBSERVER);
		if(name.equals(sEXPERT)) return SBType.from_int(SBType._EXPERT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SBType enumeration object by specifying its name
	*/
	public static SBType newSBType(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sOBSERVATORY)) return SBType.from_int(SBType._OBSERVATORY);
		if(name.equals(sOBSERVER)) return SBType.from_int(SBType._OBSERVER);
		if(name.equals(sEXPERT)) return SBType.from_int(SBType._EXPERT);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SBType. 
	 * @parameter value an instance of SBType.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SBType value) {
			
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


