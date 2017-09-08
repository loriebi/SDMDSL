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
 * File JDirectionReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.DirectionReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the DirectionReferenceCode enumeration.
*/ 
public class JDirectionReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sJ2000 = "J2000";  /*!< A string definition for J2000 */
	public static final String sJMEAN = "JMEAN";  /*!< A string definition for JMEAN */
	public static final String sJTRUE = "JTRUE";  /*!< A string definition for JTRUE */
	public static final String sAPP = "APP";  /*!< A string definition for APP */
	public static final String sB1950 = "B1950";  /*!< A string definition for B1950 */
	public static final String sB1950_VLA = "B1950_VLA";  /*!< A string definition for B1950_VLA */
	public static final String sBMEAN = "BMEAN";  /*!< A string definition for BMEAN */
	public static final String sBTRUE = "BTRUE";  /*!< A string definition for BTRUE */
	public static final String sGALACTIC = "GALACTIC";  /*!< A string definition for GALACTIC */
	public static final String sHADEC = "HADEC";  /*!< A string definition for HADEC */
	public static final String sAZELSW = "AZELSW";  /*!< A string definition for AZELSW */
	public static final String sAZELSWGEO = "AZELSWGEO";  /*!< A string definition for AZELSWGEO */
	public static final String sAZELNE = "AZELNE";  /*!< A string definition for AZELNE */
	public static final String sAZELNEGEO = "AZELNEGEO";  /*!< A string definition for AZELNEGEO */
	public static final String sJNAT = "JNAT";  /*!< A string definition for JNAT */
	public static final String sECLIPTIC = "ECLIPTIC";  /*!< A string definition for ECLIPTIC */
	public static final String sMECLIPTIC = "MECLIPTIC";  /*!< A string definition for MECLIPTIC */
	public static final String sTECLIPTIC = "TECLIPTIC";  /*!< A string definition for TECLIPTIC */
	public static final String sSUPERGAL = "SUPERGAL";  /*!< A string definition for SUPERGAL */
	public static final String sITRF = "ITRF";  /*!< A string definition for ITRF */
	public static final String sTOPO = "TOPO";  /*!< A string definition for TOPO */
	public static final String sICRS = "ICRS";  /*!< A string definition for ICRS */
	public static final String sMERCURY = "MERCURY";  /*!< A string definition for MERCURY */
	public static final String sVENUS = "VENUS";  /*!< A string definition for VENUS */
	public static final String sMARS = "MARS";  /*!< A string definition for MARS */
	public static final String sJUPITER = "JUPITER";  /*!< A string definition for JUPITER */
	public static final String sSATURN = "SATURN";  /*!< A string definition for SATURN */
	public static final String sURANUS = "URANUS";  /*!< A string definition for URANUS */
	public static final String sNEPTUNE = "NEPTUNE";  /*!< A string definition for NEPTUNE */
	public static final String sPLUTO = "PLUTO";  /*!< A string definition for PLUTO */
	public static final String sSUN = "SUN";  /*!< A string definition for SUN */
	public static final String sMOON = "MOON";  /*!< A string definition for MOON */
	private static final String[] sDirectionReferenceCodeSet = {
		sJ2000,
		sJMEAN,
		sJTRUE,
		sAPP,
		sB1950,
		sB1950_VLA,
		sBMEAN,
		sBTRUE,
		sGALACTIC,
		sHADEC,
		sAZELSW,
		sAZELSWGEO,
		sAZELNE,
		sAZELNEGEO,
		sJNAT,
		sECLIPTIC,
		sMECLIPTIC,
		sTECLIPTIC,
		sSUPERGAL,
		sITRF,
		sTOPO,
		sICRS,
		sMERCURY,
		sVENUS,
		sMARS,
		sJUPITER,
		sSATURN,
		sURANUS,
		sNEPTUNE,
		sPLUTO,
		sSUN,
		sMOON
	};
	
	
	/**
	* Returns the version number of the enumeration DirectionReferenceCode.
	*/
	public static int version() { 
		return alma.DirectionReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration DirectionReferenceCode.
	*/
	public static String revision() { 
		return alma.DirectionReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in DirectionReferenceCode.
	*/
	public static int size() { 
		return sDirectionReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified DirectionReferenceCode's enumerator.
	*/
	public static String name(DirectionReferenceCode f){
		switch(f.value()){
			case DirectionReferenceCode._J2000 : 
				return sJ2000;
			case DirectionReferenceCode._JMEAN : 
				return sJMEAN;
			case DirectionReferenceCode._JTRUE : 
				return sJTRUE;
			case DirectionReferenceCode._APP : 
				return sAPP;
			case DirectionReferenceCode._B1950 : 
				return sB1950;
			case DirectionReferenceCode._B1950_VLA : 
				return sB1950_VLA;
			case DirectionReferenceCode._BMEAN : 
				return sBMEAN;
			case DirectionReferenceCode._BTRUE : 
				return sBTRUE;
			case DirectionReferenceCode._GALACTIC : 
				return sGALACTIC;
			case DirectionReferenceCode._HADEC : 
				return sHADEC;
			case DirectionReferenceCode._AZELSW : 
				return sAZELSW;
			case DirectionReferenceCode._AZELSWGEO : 
				return sAZELSWGEO;
			case DirectionReferenceCode._AZELNE : 
				return sAZELNE;
			case DirectionReferenceCode._AZELNEGEO : 
				return sAZELNEGEO;
			case DirectionReferenceCode._JNAT : 
				return sJNAT;
			case DirectionReferenceCode._ECLIPTIC : 
				return sECLIPTIC;
			case DirectionReferenceCode._MECLIPTIC : 
				return sMECLIPTIC;
			case DirectionReferenceCode._TECLIPTIC : 
				return sTECLIPTIC;
			case DirectionReferenceCode._SUPERGAL : 
				return sSUPERGAL;
			case DirectionReferenceCode._ITRF : 
				return sITRF;
			case DirectionReferenceCode._TOPO : 
				return sTOPO;
			case DirectionReferenceCode._ICRS : 
				return sICRS;
			case DirectionReferenceCode._MERCURY : 
				return sMERCURY;
			case DirectionReferenceCode._VENUS : 
				return sVENUS;
			case DirectionReferenceCode._MARS : 
				return sMARS;
			case DirectionReferenceCode._JUPITER : 
				return sJUPITER;
			case DirectionReferenceCode._SATURN : 
				return sSATURN;
			case DirectionReferenceCode._URANUS : 
				return sURANUS;
			case DirectionReferenceCode._NEPTUNE : 
				return sNEPTUNE;
			case DirectionReferenceCode._PLUTO : 
				return sPLUTO;
			case DirectionReferenceCode._SUN : 
				return sSUN;
			case DirectionReferenceCode._MOON : 
				return sMOON;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified DirectionReferenceCode's enumerator.
	*/
	public static String toString(DirectionReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sDirectionReferenceCodeSet;
	}
	
	
	/**
	* Returns a DirectionReferenceCode's enumerator by specifying its name.
	*/
	public static DirectionReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sJ2000)) return DirectionReferenceCode.from_int(DirectionReferenceCode._J2000);
		if(name.equals(sJMEAN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JMEAN);
		if(name.equals(sJTRUE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JTRUE);
		if(name.equals(sAPP)) return DirectionReferenceCode.from_int(DirectionReferenceCode._APP);
		if(name.equals(sB1950)) return DirectionReferenceCode.from_int(DirectionReferenceCode._B1950);
		if(name.equals(sB1950_VLA)) return DirectionReferenceCode.from_int(DirectionReferenceCode._B1950_VLA);
		if(name.equals(sBMEAN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._BMEAN);
		if(name.equals(sBTRUE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._BTRUE);
		if(name.equals(sGALACTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._GALACTIC);
		if(name.equals(sHADEC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._HADEC);
		if(name.equals(sAZELSW)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELSW);
		if(name.equals(sAZELSWGEO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELSWGEO);
		if(name.equals(sAZELNE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELNE);
		if(name.equals(sAZELNEGEO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELNEGEO);
		if(name.equals(sJNAT)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JNAT);
		if(name.equals(sECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ECLIPTIC);
		if(name.equals(sMECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MECLIPTIC);
		if(name.equals(sTECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._TECLIPTIC);
		if(name.equals(sSUPERGAL)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SUPERGAL);
		if(name.equals(sITRF)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ITRF);
		if(name.equals(sTOPO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._TOPO);
		if(name.equals(sICRS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ICRS);
		if(name.equals(sMERCURY)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MERCURY);
		if(name.equals(sVENUS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._VENUS);
		if(name.equals(sMARS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MARS);
		if(name.equals(sJUPITER)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JUPITER);
		if(name.equals(sSATURN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SATURN);
		if(name.equals(sURANUS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._URANUS);
		if(name.equals(sNEPTUNE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._NEPTUNE);
		if(name.equals(sPLUTO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._PLUTO);
		if(name.equals(sSUN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SUN);
		if(name.equals(sMOON)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MOON);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a DirectionReferenceCode enumeration object by specifying its name
	*/
	public static DirectionReferenceCode newDirectionReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sJ2000)) return DirectionReferenceCode.from_int(DirectionReferenceCode._J2000);
		if(name.equals(sJMEAN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JMEAN);
		if(name.equals(sJTRUE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JTRUE);
		if(name.equals(sAPP)) return DirectionReferenceCode.from_int(DirectionReferenceCode._APP);
		if(name.equals(sB1950)) return DirectionReferenceCode.from_int(DirectionReferenceCode._B1950);
		if(name.equals(sB1950_VLA)) return DirectionReferenceCode.from_int(DirectionReferenceCode._B1950_VLA);
		if(name.equals(sBMEAN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._BMEAN);
		if(name.equals(sBTRUE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._BTRUE);
		if(name.equals(sGALACTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._GALACTIC);
		if(name.equals(sHADEC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._HADEC);
		if(name.equals(sAZELSW)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELSW);
		if(name.equals(sAZELSWGEO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELSWGEO);
		if(name.equals(sAZELNE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELNE);
		if(name.equals(sAZELNEGEO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._AZELNEGEO);
		if(name.equals(sJNAT)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JNAT);
		if(name.equals(sECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ECLIPTIC);
		if(name.equals(sMECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MECLIPTIC);
		if(name.equals(sTECLIPTIC)) return DirectionReferenceCode.from_int(DirectionReferenceCode._TECLIPTIC);
		if(name.equals(sSUPERGAL)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SUPERGAL);
		if(name.equals(sITRF)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ITRF);
		if(name.equals(sTOPO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._TOPO);
		if(name.equals(sICRS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._ICRS);
		if(name.equals(sMERCURY)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MERCURY);
		if(name.equals(sVENUS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._VENUS);
		if(name.equals(sMARS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MARS);
		if(name.equals(sJUPITER)) return DirectionReferenceCode.from_int(DirectionReferenceCode._JUPITER);
		if(name.equals(sSATURN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SATURN);
		if(name.equals(sURANUS)) return DirectionReferenceCode.from_int(DirectionReferenceCode._URANUS);
		if(name.equals(sNEPTUNE)) return DirectionReferenceCode.from_int(DirectionReferenceCode._NEPTUNE);
		if(name.equals(sPLUTO)) return DirectionReferenceCode.from_int(DirectionReferenceCode._PLUTO);
		if(name.equals(sSUN)) return DirectionReferenceCode.from_int(DirectionReferenceCode._SUN);
		if(name.equals(sMOON)) return DirectionReferenceCode.from_int(DirectionReferenceCode._MOON);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is DirectionReferenceCode. 
	 * @parameter value an instance of DirectionReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, DirectionReferenceCode value) {
			
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


