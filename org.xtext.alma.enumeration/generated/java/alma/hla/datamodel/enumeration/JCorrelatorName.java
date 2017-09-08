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
 * File JCorrelatorName.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.CorrelatorNameMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the CorrelatorName enumeration.
*/ 
public class JCorrelatorName {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sALMA_ACA = "ALMA_ACA";  /*!< A string definition for ALMA_ACA */
	public static final String sALMA_BASELINE = "ALMA_BASELINE";  /*!< A string definition for ALMA_BASELINE */
	public static final String sALMA_BASELINE_ATF = "ALMA_BASELINE_ATF";  /*!< A string definition for ALMA_BASELINE_ATF */
	public static final String sALMA_BASELINE_PROTO_OSF = "ALMA_BASELINE_PROTO_OSF";  /*!< A string definition for ALMA_BASELINE_PROTO_OSF */
	public static final String sHERSCHEL = "HERSCHEL";  /*!< A string definition for HERSCHEL */
	public static final String sIRAM_PDB = "IRAM_PDB";  /*!< A string definition for IRAM_PDB */
	public static final String sIRAM_30M_VESPA = "IRAM_30M_VESPA";  /*!< A string definition for IRAM_30M_VESPA */
	public static final String sIRAM_WILMA = "IRAM_WILMA";  /*!< A string definition for IRAM_WILMA */
	public static final String sNRAO_VLA = "NRAO_VLA";  /*!< A string definition for NRAO_VLA */
	public static final String sNRAO_WIDAR = "NRAO_WIDAR";  /*!< A string definition for NRAO_WIDAR */
	private static final String[] sCorrelatorNameSet = {
		sALMA_ACA,
		sALMA_BASELINE,
		sALMA_BASELINE_ATF,
		sALMA_BASELINE_PROTO_OSF,
		sHERSCHEL,
		sIRAM_PDB,
		sIRAM_30M_VESPA,
		sIRAM_WILMA,
		sNRAO_VLA,
		sNRAO_WIDAR
	};
	
	
	/**
	* Returns the version number of the enumeration CorrelatorName.
	*/
	public static int version() { 
		return alma.CorrelatorNameMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration CorrelatorName.
	*/
	public static String revision() { 
		return alma.CorrelatorNameMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in CorrelatorName.
	*/
	public static int size() { 
		return sCorrelatorNameSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified CorrelatorName's enumerator.
	*/
	public static String name(CorrelatorName f){
		switch(f.value()){
			case CorrelatorName._ALMA_ACA : 
				return sALMA_ACA;
			case CorrelatorName._ALMA_BASELINE : 
				return sALMA_BASELINE;
			case CorrelatorName._ALMA_BASELINE_ATF : 
				return sALMA_BASELINE_ATF;
			case CorrelatorName._ALMA_BASELINE_PROTO_OSF : 
				return sALMA_BASELINE_PROTO_OSF;
			case CorrelatorName._HERSCHEL : 
				return sHERSCHEL;
			case CorrelatorName._IRAM_PDB : 
				return sIRAM_PDB;
			case CorrelatorName._IRAM_30M_VESPA : 
				return sIRAM_30M_VESPA;
			case CorrelatorName._IRAM_WILMA : 
				return sIRAM_WILMA;
			case CorrelatorName._NRAO_VLA : 
				return sNRAO_VLA;
			case CorrelatorName._NRAO_WIDAR : 
				return sNRAO_WIDAR;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified CorrelatorName's enumerator.
	*/
	public static String toString(CorrelatorName f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sCorrelatorNameSet;
	}
	
	
	/**
	* Returns a CorrelatorName's enumerator by specifying its name.
	*/
	public static CorrelatorName literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_ACA)) return CorrelatorName.from_int(CorrelatorName._ALMA_ACA);
		if(name.equals(sALMA_BASELINE)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE);
		if(name.equals(sALMA_BASELINE_ATF)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE_ATF);
		if(name.equals(sALMA_BASELINE_PROTO_OSF)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE_PROTO_OSF);
		if(name.equals(sHERSCHEL)) return CorrelatorName.from_int(CorrelatorName._HERSCHEL);
		if(name.equals(sIRAM_PDB)) return CorrelatorName.from_int(CorrelatorName._IRAM_PDB);
		if(name.equals(sIRAM_30M_VESPA)) return CorrelatorName.from_int(CorrelatorName._IRAM_30M_VESPA);
		if(name.equals(sIRAM_WILMA)) return CorrelatorName.from_int(CorrelatorName._IRAM_WILMA);
		if(name.equals(sNRAO_VLA)) return CorrelatorName.from_int(CorrelatorName._NRAO_VLA);
		if(name.equals(sNRAO_WIDAR)) return CorrelatorName.from_int(CorrelatorName._NRAO_WIDAR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a CorrelatorName enumeration object by specifying its name
	*/
	public static CorrelatorName newCorrelatorName(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sALMA_ACA)) return CorrelatorName.from_int(CorrelatorName._ALMA_ACA);
		if(name.equals(sALMA_BASELINE)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE);
		if(name.equals(sALMA_BASELINE_ATF)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE_ATF);
		if(name.equals(sALMA_BASELINE_PROTO_OSF)) return CorrelatorName.from_int(CorrelatorName._ALMA_BASELINE_PROTO_OSF);
		if(name.equals(sHERSCHEL)) return CorrelatorName.from_int(CorrelatorName._HERSCHEL);
		if(name.equals(sIRAM_PDB)) return CorrelatorName.from_int(CorrelatorName._IRAM_PDB);
		if(name.equals(sIRAM_30M_VESPA)) return CorrelatorName.from_int(CorrelatorName._IRAM_30M_VESPA);
		if(name.equals(sIRAM_WILMA)) return CorrelatorName.from_int(CorrelatorName._IRAM_WILMA);
		if(name.equals(sNRAO_VLA)) return CorrelatorName.from_int(CorrelatorName._NRAO_VLA);
		if(name.equals(sNRAO_WIDAR)) return CorrelatorName.from_int(CorrelatorName._NRAO_WIDAR);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is CorrelatorName. 
	 * @parameter value an instance of CorrelatorName.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, CorrelatorName value) {
			
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


