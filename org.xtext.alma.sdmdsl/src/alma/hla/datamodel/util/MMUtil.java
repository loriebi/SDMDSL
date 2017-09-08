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
 * File MMUtil.java
 */
 
package alma.hla.datamodel.util;

public class MMUtil {

	
	static public String UpperCaseName(String s) {
		return s.substring(0,1).toUpperCase() + s.substring(1);
	}

	
	
	static public String LowerCaseName(String s) {
		return s.substring(0,1).toLowerCase() + s.substring(1);
	}
	
	
	
	static public String JavaType(String type){
		
		switch(type){
			case "Integer" : return "int";
			case "Char" : return "char";
			case "Short" : return "short";
			case "Long" : return "long";
			case "Float" : return "float";
			case "Double" : return "double";
			case "Boolean" : return "boolean";
			default : return type;
		}
		
	}
	
	static public String CppType(String type) {
		String typeName = type;
		String ret = null;
		
		if (typeName.equals("Integer")) {
			ret = "int";
		}
		else if (typeName.equals("Boolean")) {
			ret = "bool";
		}
		else if (typeName.equals("boolean")) {
			ret = "bool";
		}
		else if (typeName.equals("String")) {
			ret = "string";
		}
		else if (typeName.equals("string")) {
			ret = "string";
		}
		else if (typeName.equals("Byte")) {
			ret = "char";
		}
		else if (typeName.equals("byte")) {
			ret = "char";
		}
		else if (typeName.equals("Char")) {
			ret = "unsigned char";
		}
		else if (typeName.equals("char")) {
			ret = "unsigned char";
		}
		else if(typeName.equals("Long")) {
			ret = "int64_t";
		}
		else if(typeName.equals("long")) {
			ret = "int64_t";
		}
		else if(typeName.equals("Double")) {
			ret = "double";
		}
		else if(typeName.equals("Float")) {
			ret = "float";
		}
		else {
			ret = typeName;
		}
		
		return ret;
	}
	
	
	static public String simpleName(String name) {
		String s = name;
		if (s.endsWith("Id"))
			return s.substring(0,s.length() - 2);
		else if (s.endsWith("IdArray"))
			return s.substring(0,s.length() - 7);
		else if (s.endsWith("IdSet"))
			return s.substring(0,s.length() - 5);
		else if (s.endsWith("IdList"))
			return s.substring(0,s.length() - 6);
		else if (s.endsWith("Array"))
			return s.substring(0,s.length() - 5);
		else if (s.endsWith("Set"))
			return s.substring(0,s.length() - 3);
		else if (s.endsWith("List"))
			return s.substring(0,s.length() - 4);
		return s;
	}
	
}
