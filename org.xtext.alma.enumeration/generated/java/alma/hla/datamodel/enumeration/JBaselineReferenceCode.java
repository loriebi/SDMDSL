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
 * File JBaselineReferenceCode.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.BaselineReferenceCodeMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the BaselineReferenceCode enumeration.
*/ 
public class JBaselineReferenceCode {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sJ2000 = "J2000";  /*!< A string definition for J2000 */
	public static final String sB1950 = "B1950";  /*!< A string definition for B1950 */
	public static final String sGALACTIC = "GALACTIC";  /*!< A string definition for GALACTIC */
	public static final String sSUPERGAL = "SUPERGAL";  /*!< A string definition for SUPERGAL */
	public static final String sECLIPTIC = "ECLIPTIC";  /*!< A string definition for ECLIPTIC */
	public static final String sJMEAN = "JMEAN";  /*!< A string definition for JMEAN */
	public static final String sJTRUE = "JTRUE";  /*!< A string definition for JTRUE */
	public static final String sAPP = "APP";  /*!< A string definition for APP */
	public static final String sBMEAN = "BMEAN";  /*!< A string definition for BMEAN */
	public static final String sBTRUE = "BTRUE";  /*!< A string definition for BTRUE */
	public static final String sJNAT = "JNAT";  /*!< A string definition for JNAT */
	public static final String sMECLIPTIC = "MECLIPTIC";  /*!< A string definition for MECLIPTIC */
	public static final String sTECLIPTIC = "TECLIPTIC";  /*!< A string definition for TECLIPTIC */
	public static final String sTOPO = "TOPO";  /*!< A string definition for TOPO */
	public static final String sMERCURY = "MERCURY";  /*!< A string definition for MERCURY */
	public static final String sVENUS = "VENUS";  /*!< A string definition for VENUS */
	public static final String sMARS = "MARS";  /*!< A string definition for MARS */
	public static final String sJUPITER = "JUPITER";  /*!< A string definition for JUPITER */
	public static final String sSATURN = "SATURN";  /*!< A string definition for SATURN */
	public static final String sNEPTUN = "NEPTUN";  /*!< A string definition for NEPTUN */
	public static final String sSUN = "SUN";  /*!< A string definition for SUN */
	public static final String sMOON = "MOON";  /*!< A string definition for MOON */
	public static final String sHADEC = "HADEC";  /*!< A string definition for HADEC */
	public static final String sAZEL = "AZEL";  /*!< A string definition for AZEL */
	public static final String sAZELGEO = "AZELGEO";  /*!< A string definition for AZELGEO */
	public static final String sAZELSW = "AZELSW";  /*!< A string definition for AZELSW */
	public static final String sAZELNE = "AZELNE";  /*!< A string definition for AZELNE */
	public static final String sITRF = "ITRF";  /*!< A string definition for ITRF */
	private static final String[] sBaselineReferenceCodeSet = {
		sJ2000,
		sB1950,
		sGALACTIC,
		sSUPERGAL,
		sECLIPTIC,
		sJMEAN,
		sJTRUE,
		sAPP,
		sBMEAN,
		sBTRUE,
		sJNAT,
		sMECLIPTIC,
		sTECLIPTIC,
		sTOPO,
		sMERCURY,
		sVENUS,
		sMARS,
		sJUPITER,
		sSATURN,
		sNEPTUN,
		sSUN,
		sMOON,
		sHADEC,
		sAZEL,
		sAZELGEO,
		sAZELSW,
		sAZELNE,
		sITRF
	};
	
	
	/**
	* Returns the version number of the enumeration BaselineReferenceCode.
	*/
	public static int version() { 
		return alma.BaselineReferenceCodeMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration BaselineReferenceCode.
	*/
	public static String revision() { 
		return alma.BaselineReferenceCodeMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in BaselineReferenceCode.
	*/
	public static int size() { 
		return sBaselineReferenceCodeSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified BaselineReferenceCode's enumerator.
	*/
	public static String name(BaselineReferenceCode f){
		switch(f.value()){
			case BaselineReferenceCode._J2000 : 
				return sJ2000;
			case BaselineReferenceCode._B1950 : 
				return sB1950;
			case BaselineReferenceCode._GALACTIC : 
				return sGALACTIC;
			case BaselineReferenceCode._SUPERGAL : 
				return sSUPERGAL;
			case BaselineReferenceCode._ECLIPTIC : 
				return sECLIPTIC;
			case BaselineReferenceCode._JMEAN : 
				return sJMEAN;
			case BaselineReferenceCode._JTRUE : 
				return sJTRUE;
			case BaselineReferenceCode._APP : 
				return sAPP;
			case BaselineReferenceCode._BMEAN : 
				return sBMEAN;
			case BaselineReferenceCode._BTRUE : 
				return sBTRUE;
			case BaselineReferenceCode._JNAT : 
				return sJNAT;
			case BaselineReferenceCode._MECLIPTIC : 
				return sMECLIPTIC;
			case BaselineReferenceCode._TECLIPTIC : 
				return sTECLIPTIC;
			case BaselineReferenceCode._TOPO : 
				return sTOPO;
			case BaselineReferenceCode._MERCURY : 
				return sMERCURY;
			case BaselineReferenceCode._VENUS : 
				return sVENUS;
			case BaselineReferenceCode._MARS : 
				return sMARS;
			case BaselineReferenceCode._JUPITER : 
				return sJUPITER;
			case BaselineReferenceCode._SATURN : 
				return sSATURN;
			case BaselineReferenceCode._NEPTUN : 
				return sNEPTUN;
			case BaselineReferenceCode._SUN : 
				return sSUN;
			case BaselineReferenceCode._MOON : 
				return sMOON;
			case BaselineReferenceCode._HADEC : 
				return sHADEC;
			case BaselineReferenceCode._AZEL : 
				return sAZEL;
			case BaselineReferenceCode._AZELGEO : 
				return sAZELGEO;
			case BaselineReferenceCode._AZELSW : 
				return sAZELSW;
			case BaselineReferenceCode._AZELNE : 
				return sAZELNE;
			case BaselineReferenceCode._ITRF : 
				return sITRF;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified BaselineReferenceCode's enumerator.
	*/
	public static String toString(BaselineReferenceCode f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sBaselineReferenceCodeSet;
	}
	
	
	/**
	* Returns a BaselineReferenceCode's enumerator by specifying its name.
	*/
	public static BaselineReferenceCode literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sJ2000)) return BaselineReferenceCode.from_int(BaselineReferenceCode._J2000);
		if(name.equals(sB1950)) return BaselineReferenceCode.from_int(BaselineReferenceCode._B1950);
		if(name.equals(sGALACTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._GALACTIC);
		if(name.equals(sSUPERGAL)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SUPERGAL);
		if(name.equals(sECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._ECLIPTIC);
		if(name.equals(sJMEAN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JMEAN);
		if(name.equals(sJTRUE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JTRUE);
		if(name.equals(sAPP)) return BaselineReferenceCode.from_int(BaselineReferenceCode._APP);
		if(name.equals(sBMEAN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._BMEAN);
		if(name.equals(sBTRUE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._BTRUE);
		if(name.equals(sJNAT)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JNAT);
		if(name.equals(sMECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MECLIPTIC);
		if(name.equals(sTECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._TECLIPTIC);
		if(name.equals(sTOPO)) return BaselineReferenceCode.from_int(BaselineReferenceCode._TOPO);
		if(name.equals(sMERCURY)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MERCURY);
		if(name.equals(sVENUS)) return BaselineReferenceCode.from_int(BaselineReferenceCode._VENUS);
		if(name.equals(sMARS)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MARS);
		if(name.equals(sJUPITER)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JUPITER);
		if(name.equals(sSATURN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SATURN);
		if(name.equals(sNEPTUN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._NEPTUN);
		if(name.equals(sSUN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SUN);
		if(name.equals(sMOON)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MOON);
		if(name.equals(sHADEC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._HADEC);
		if(name.equals(sAZEL)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZEL);
		if(name.equals(sAZELGEO)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELGEO);
		if(name.equals(sAZELSW)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELSW);
		if(name.equals(sAZELNE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELNE);
		if(name.equals(sITRF)) return BaselineReferenceCode.from_int(BaselineReferenceCode._ITRF);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a BaselineReferenceCode enumeration object by specifying its name
	*/
	public static BaselineReferenceCode newBaselineReferenceCode(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sJ2000)) return BaselineReferenceCode.from_int(BaselineReferenceCode._J2000);
		if(name.equals(sB1950)) return BaselineReferenceCode.from_int(BaselineReferenceCode._B1950);
		if(name.equals(sGALACTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._GALACTIC);
		if(name.equals(sSUPERGAL)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SUPERGAL);
		if(name.equals(sECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._ECLIPTIC);
		if(name.equals(sJMEAN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JMEAN);
		if(name.equals(sJTRUE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JTRUE);
		if(name.equals(sAPP)) return BaselineReferenceCode.from_int(BaselineReferenceCode._APP);
		if(name.equals(sBMEAN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._BMEAN);
		if(name.equals(sBTRUE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._BTRUE);
		if(name.equals(sJNAT)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JNAT);
		if(name.equals(sMECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MECLIPTIC);
		if(name.equals(sTECLIPTIC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._TECLIPTIC);
		if(name.equals(sTOPO)) return BaselineReferenceCode.from_int(BaselineReferenceCode._TOPO);
		if(name.equals(sMERCURY)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MERCURY);
		if(name.equals(sVENUS)) return BaselineReferenceCode.from_int(BaselineReferenceCode._VENUS);
		if(name.equals(sMARS)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MARS);
		if(name.equals(sJUPITER)) return BaselineReferenceCode.from_int(BaselineReferenceCode._JUPITER);
		if(name.equals(sSATURN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SATURN);
		if(name.equals(sNEPTUN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._NEPTUN);
		if(name.equals(sSUN)) return BaselineReferenceCode.from_int(BaselineReferenceCode._SUN);
		if(name.equals(sMOON)) return BaselineReferenceCode.from_int(BaselineReferenceCode._MOON);
		if(name.equals(sHADEC)) return BaselineReferenceCode.from_int(BaselineReferenceCode._HADEC);
		if(name.equals(sAZEL)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZEL);
		if(name.equals(sAZELGEO)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELGEO);
		if(name.equals(sAZELSW)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELSW);
		if(name.equals(sAZELNE)) return BaselineReferenceCode.from_int(BaselineReferenceCode._AZELNE);
		if(name.equals(sITRF)) return BaselineReferenceCode.from_int(BaselineReferenceCode._ITRF);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is BaselineReferenceCode. 
	 * @parameter value an instance of BaselineReferenceCode.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, BaselineReferenceCode value) {
			
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


