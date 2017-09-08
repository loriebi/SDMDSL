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
 * File JSynthProf.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.SynthProfMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the SynthProf enumeration.
*/ 
public class JSynthProf {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sNOSYNTH = "NOSYNTH";  /*!< A string definition for NOSYNTH */
	public static final String sACACORR = "ACACORR";  /*!< A string definition for ACACORR */
	public static final String sACA_CDP = "ACA_CDP";  /*!< A string definition for ACA_CDP */
	private static final String[] sSynthProfSet = {
		sNOSYNTH,
		sACACORR,
		sACA_CDP
	};
	
	
	/**
	* Returns the version number of the enumeration SynthProf.
	*/
	public static int version() { 
		return alma.SynthProfMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration SynthProf.
	*/
	public static String revision() { 
		return alma.SynthProfMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in SynthProf.
	*/
	public static int size() { 
		return sSynthProfSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified SynthProf's enumerator.
	*/
	public static String name(SynthProf f){
		switch(f.value()){
			case SynthProf._NOSYNTH : 
				return sNOSYNTH;
			case SynthProf._ACACORR : 
				return sACACORR;
			case SynthProf._ACA_CDP : 
				return sACA_CDP;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified SynthProf's enumerator.
	*/
	public static String toString(SynthProf f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sSynthProfSet;
	}
	
	
	/**
	* Returns a SynthProf's enumerator by specifying its name.
	*/
	public static SynthProf literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSYNTH)) return SynthProf.from_int(SynthProf._NOSYNTH);
		if(name.equals(sACACORR)) return SynthProf.from_int(SynthProf._ACACORR);
		if(name.equals(sACA_CDP)) return SynthProf.from_int(SynthProf._ACA_CDP);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a SynthProf enumeration object by specifying its name
	*/
	public static SynthProf newSynthProf(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sNOSYNTH)) return SynthProf.from_int(SynthProf._NOSYNTH);
		if(name.equals(sACACORR)) return SynthProf.from_int(SynthProf._ACACORR);
		if(name.equals(sACA_CDP)) return SynthProf.from_int(SynthProf._ACA_CDP);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is SynthProf. 
	 * @parameter value an instance of SynthProf.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, SynthProf value) {
			
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


