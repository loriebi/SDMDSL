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
 * File JStokesParameter.java
 */		
package alma.hla.datamodel.enumeration;

import alma.ACSErrTypeCommon.wrappers.AcsJBadParameterEx;
import alma.StokesParameterMod.*;

import java.lang.reflect.Array;

/**
* Extensions to the StokesParameter enumeration.
*/ 
public class JStokesParameter {
	/**
	* Individual static String declarations for each enumerator.
	*/
	public static final String sI = "I";  /*!< A string definition for I */
	public static final String sQ = "Q";  /*!< A string definition for Q */
	public static final String sU = "U";  /*!< A string definition for U */
	public static final String sV = "V";  /*!< A string definition for V */
	public static final String sRR = "RR";  /*!< A string definition for RR */
	public static final String sRL = "RL";  /*!< A string definition for RL */
	public static final String sLR = "LR";  /*!< A string definition for LR */
	public static final String sLL = "LL";  /*!< A string definition for LL */
	public static final String sXX = "XX";  /*!< A string definition for XX */
	public static final String sXY = "XY";  /*!< A string definition for XY */
	public static final String sYX = "YX";  /*!< A string definition for YX */
	public static final String sYY = "YY";  /*!< A string definition for YY */
	public static final String sRX = "RX";  /*!< A string definition for RX */
	public static final String sRY = "RY";  /*!< A string definition for RY */
	public static final String sLX = "LX";  /*!< A string definition for LX */
	public static final String sLY = "LY";  /*!< A string definition for LY */
	public static final String sXR = "XR";  /*!< A string definition for XR */
	public static final String sXL = "XL";  /*!< A string definition for XL */
	public static final String sYR = "YR";  /*!< A string definition for YR */
	public static final String sYL = "YL";  /*!< A string definition for YL */
	public static final String sPP = "PP";  /*!< A string definition for PP */
	public static final String sPQ = "PQ";  /*!< A string definition for PQ */
	public static final String sQP = "QP";  /*!< A string definition for QP */
	public static final String sQQ = "QQ";  /*!< A string definition for QQ */
	public static final String sRCIRCULAR = "RCIRCULAR";  /*!< A string definition for RCIRCULAR */
	public static final String sLCIRCULAR = "LCIRCULAR";  /*!< A string definition for LCIRCULAR */
	public static final String sLINEAR = "LINEAR";  /*!< A string definition for LINEAR */
	public static final String sPTOTAL = "PTOTAL";  /*!< A string definition for PTOTAL */
	public static final String sPLINEAR = "PLINEAR";  /*!< A string definition for PLINEAR */
	public static final String sPFTOTAL = "PFTOTAL";  /*!< A string definition for PFTOTAL */
	public static final String sPFLINEAR = "PFLINEAR";  /*!< A string definition for PFLINEAR */
	public static final String sPANGLE = "PANGLE";  /*!< A string definition for PANGLE */
	private static final String[] sStokesParameterSet = {
		sI,
		sQ,
		sU,
		sV,
		sRR,
		sRL,
		sLR,
		sLL,
		sXX,
		sXY,
		sYX,
		sYY,
		sRX,
		sRY,
		sLX,
		sLY,
		sXR,
		sXL,
		sYR,
		sYL,
		sPP,
		sPQ,
		sQP,
		sQQ,
		sRCIRCULAR,
		sLCIRCULAR,
		sLINEAR,
		sPTOTAL,
		sPLINEAR,
		sPFTOTAL,
		sPFLINEAR,
		sPANGLE
	};
	
	
	/**
	* Returns the version number of the enumeration StokesParameter.
	*/
	public static int version() { 
		return alma.StokesParameterMod.version.value;
	}
	
	
	/**
	* Returns the revision number of the enumeration StokesParameter.
	*/
	public static String revision() { 
		return alma.StokesParameterMod.revision.value;
	}
	

	/**
	* Returns the number of enumerators defined in StokesParameter.
	*/
	public static int size() { 
		return sStokesParameterSet.length;
	}
	
	
	/**
	* Return the string name associated with the specified StokesParameter's enumerator.
	*/
	public static String name(StokesParameter f){
		switch(f.value()){
			case StokesParameter._I : 
				return sI;
			case StokesParameter._Q : 
				return sQ;
			case StokesParameter._U : 
				return sU;
			case StokesParameter._V : 
				return sV;
			case StokesParameter._RR : 
				return sRR;
			case StokesParameter._RL : 
				return sRL;
			case StokesParameter._LR : 
				return sLR;
			case StokesParameter._LL : 
				return sLL;
			case StokesParameter._XX : 
				return sXX;
			case StokesParameter._XY : 
				return sXY;
			case StokesParameter._YX : 
				return sYX;
			case StokesParameter._YY : 
				return sYY;
			case StokesParameter._RX : 
				return sRX;
			case StokesParameter._RY : 
				return sRY;
			case StokesParameter._LX : 
				return sLX;
			case StokesParameter._LY : 
				return sLY;
			case StokesParameter._XR : 
				return sXR;
			case StokesParameter._XL : 
				return sXL;
			case StokesParameter._YR : 
				return sYR;
			case StokesParameter._YL : 
				return sYL;
			case StokesParameter._PP : 
				return sPP;
			case StokesParameter._PQ : 
				return sPQ;
			case StokesParameter._QP : 
				return sQP;
			case StokesParameter._QQ : 
				return sQQ;
			case StokesParameter._RCIRCULAR : 
				return sRCIRCULAR;
			case StokesParameter._LCIRCULAR : 
				return sLCIRCULAR;
			case StokesParameter._LINEAR : 
				return sLINEAR;
			case StokesParameter._PTOTAL : 
				return sPTOTAL;
			case StokesParameter._PLINEAR : 
				return sPLINEAR;
			case StokesParameter._PFTOTAL : 
				return sPFTOTAL;
			case StokesParameter._PFLINEAR : 
				return sPFLINEAR;
			case StokesParameter._PANGLE : 
				return sPANGLE;
		}
		return "";
	}
	
	
	/**
 	* An alternate, Java-style way of getting the string name associated 
	* with the specified StokesParameter's enumerator.
	*/
	public static String toString(StokesParameter f) {
		return name(f);
	}
	
	
	/**
	* Return an array of all the enumerators as strings. The strings are stored in the array in the same order
	* than the enumerators are declared in the enumeration.
	*/
	public static String[] names() {
		return sStokesParameterSet;
	}
	
	
	/**
	* Returns a StokesParameter's enumerator by specifying its name.
	*/
	public static StokesParameter literal(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sI)) return StokesParameter.from_int(StokesParameter._I);
		if(name.equals(sQ)) return StokesParameter.from_int(StokesParameter._Q);
		if(name.equals(sU)) return StokesParameter.from_int(StokesParameter._U);
		if(name.equals(sV)) return StokesParameter.from_int(StokesParameter._V);
		if(name.equals(sRR)) return StokesParameter.from_int(StokesParameter._RR);
		if(name.equals(sRL)) return StokesParameter.from_int(StokesParameter._RL);
		if(name.equals(sLR)) return StokesParameter.from_int(StokesParameter._LR);
		if(name.equals(sLL)) return StokesParameter.from_int(StokesParameter._LL);
		if(name.equals(sXX)) return StokesParameter.from_int(StokesParameter._XX);
		if(name.equals(sXY)) return StokesParameter.from_int(StokesParameter._XY);
		if(name.equals(sYX)) return StokesParameter.from_int(StokesParameter._YX);
		if(name.equals(sYY)) return StokesParameter.from_int(StokesParameter._YY);
		if(name.equals(sRX)) return StokesParameter.from_int(StokesParameter._RX);
		if(name.equals(sRY)) return StokesParameter.from_int(StokesParameter._RY);
		if(name.equals(sLX)) return StokesParameter.from_int(StokesParameter._LX);
		if(name.equals(sLY)) return StokesParameter.from_int(StokesParameter._LY);
		if(name.equals(sXR)) return StokesParameter.from_int(StokesParameter._XR);
		if(name.equals(sXL)) return StokesParameter.from_int(StokesParameter._XL);
		if(name.equals(sYR)) return StokesParameter.from_int(StokesParameter._YR);
		if(name.equals(sYL)) return StokesParameter.from_int(StokesParameter._YL);
		if(name.equals(sPP)) return StokesParameter.from_int(StokesParameter._PP);
		if(name.equals(sPQ)) return StokesParameter.from_int(StokesParameter._PQ);
		if(name.equals(sQP)) return StokesParameter.from_int(StokesParameter._QP);
		if(name.equals(sQQ)) return StokesParameter.from_int(StokesParameter._QQ);
		if(name.equals(sRCIRCULAR)) return StokesParameter.from_int(StokesParameter._RCIRCULAR);
		if(name.equals(sLCIRCULAR)) return StokesParameter.from_int(StokesParameter._LCIRCULAR);
		if(name.equals(sLINEAR)) return StokesParameter.from_int(StokesParameter._LINEAR);
		if(name.equals(sPTOTAL)) return StokesParameter.from_int(StokesParameter._PTOTAL);
		if(name.equals(sPLINEAR)) return StokesParameter.from_int(StokesParameter._PLINEAR);
		if(name.equals(sPFTOTAL)) return StokesParameter.from_int(StokesParameter._PFTOTAL);
		if(name.equals(sPFLINEAR)) return StokesParameter.from_int(StokesParameter._PFLINEAR);
		if(name.equals(sPANGLE)) return StokesParameter.from_int(StokesParameter._PANGLE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/**
	* Create a StokesParameter enumeration object by specifying its name
	*/
	public static StokesParameter newStokesParameter(String name) throws AcsJBadParameterEx {
		
		if(name.equals(sI)) return StokesParameter.from_int(StokesParameter._I);
		if(name.equals(sQ)) return StokesParameter.from_int(StokesParameter._Q);
		if(name.equals(sU)) return StokesParameter.from_int(StokesParameter._U);
		if(name.equals(sV)) return StokesParameter.from_int(StokesParameter._V);
		if(name.equals(sRR)) return StokesParameter.from_int(StokesParameter._RR);
		if(name.equals(sRL)) return StokesParameter.from_int(StokesParameter._RL);
		if(name.equals(sLR)) return StokesParameter.from_int(StokesParameter._LR);
		if(name.equals(sLL)) return StokesParameter.from_int(StokesParameter._LL);
		if(name.equals(sXX)) return StokesParameter.from_int(StokesParameter._XX);
		if(name.equals(sXY)) return StokesParameter.from_int(StokesParameter._XY);
		if(name.equals(sYX)) return StokesParameter.from_int(StokesParameter._YX);
		if(name.equals(sYY)) return StokesParameter.from_int(StokesParameter._YY);
		if(name.equals(sRX)) return StokesParameter.from_int(StokesParameter._RX);
		if(name.equals(sRY)) return StokesParameter.from_int(StokesParameter._RY);
		if(name.equals(sLX)) return StokesParameter.from_int(StokesParameter._LX);
		if(name.equals(sLY)) return StokesParameter.from_int(StokesParameter._LY);
		if(name.equals(sXR)) return StokesParameter.from_int(StokesParameter._XR);
		if(name.equals(sXL)) return StokesParameter.from_int(StokesParameter._XL);
		if(name.equals(sYR)) return StokesParameter.from_int(StokesParameter._YR);
		if(name.equals(sYL)) return StokesParameter.from_int(StokesParameter._YL);
		if(name.equals(sPP)) return StokesParameter.from_int(StokesParameter._PP);
		if(name.equals(sPQ)) return StokesParameter.from_int(StokesParameter._PQ);
		if(name.equals(sQP)) return StokesParameter.from_int(StokesParameter._QP);
		if(name.equals(sQQ)) return StokesParameter.from_int(StokesParameter._QQ);
		if(name.equals(sRCIRCULAR)) return StokesParameter.from_int(StokesParameter._RCIRCULAR);
		if(name.equals(sLCIRCULAR)) return StokesParameter.from_int(StokesParameter._LCIRCULAR);
		if(name.equals(sLINEAR)) return StokesParameter.from_int(StokesParameter._LINEAR);
		if(name.equals(sPTOTAL)) return StokesParameter.from_int(StokesParameter._PTOTAL);
		if(name.equals(sPLINEAR)) return StokesParameter.from_int(StokesParameter._PLINEAR);
		if(name.equals(sPFTOTAL)) return StokesParameter.from_int(StokesParameter._PFTOTAL);
		if(name.equals(sPFLINEAR)) return StokesParameter.from_int(StokesParameter._PFLINEAR);
		if(name.equals(sPANGLE)) return StokesParameter.from_int(StokesParameter._PANGLE);
		
		throw new AcsJBadParameterEx();
	}
	
	
	/*
	 * Assign a given value to all the elements of an array with a number of dimensions greater or equal to one.
	 * @parameter a an Object which is expected to be an array whose base type is StokesParameter. 
	 * @parameter value an instance of StokesParameter.
	 * @returns a with all its elements set to value.
	 */
	static public Object setArray(Object a, StokesParameter value) {
			
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


