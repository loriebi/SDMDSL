package alma.hla.datamodel.meta.asdm;

import java.util.HashMap;

public class VerbatimCASAFiller {
	
	static HashMap<String, String> typeMapperInit() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Integer", "int");
		hm.put("Short", "short");
		hm.put("Long", "int");
		hm.put("Byte", "char");
		hm.put("Char", "char");
		hm.put("Boolean", "bool");
		hm.put("Float", "float");
		hm.put("Double", "double");

		hm.put("String", "String");
		hm.put("Complex", "String");

		hm.put("Entity", "String");
		hm.put("EntityId", "String");
		hm.put("EntityRef", "String");
		hm.put("Tag", "String");

		hm.put("Interval", "double");
		hm.put("ArrayTime", "double");
		hm.put("ArrayTimeInterval", "double");

		hm.put("Angle", "double");
		hm.put("AngularRate", "double");
		hm.put("Flux", "double");
		hm.put("Frequency", "double");
		hm.put("Humidity", "double");
		hm.put("Length", "double");
		hm.put("Pressure", "double");
		hm.put("Speed", "double");
		hm.put("Temperature", "double");
		return hm;
	}
	
	static HashMap<String, String> typeMapper = typeMapperInit();
	
	static HashMap<String, String> valueMapperInit() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Integer", "");
		hm.put("Short", "");
		hm.put("Long", "");
		hm.put("Byte", "");
		hm.put("Char", "");
		hm.put("Boolean", "");
		hm.put("Float", "");
		hm.put("Double", "");

		hm.put("String", "");
		hm.put("Complex", ".toString()");

		hm.put("Entity", ".toString()");
		hm.put("EntityId", ".toString()");
		hm.put("EntityRef", ".toString()");
		hm.put("Tag", ".toString()");

		hm.put("Interval", ".get()/(1.0e9)");
		hm.put("ArrayTime", ".get()/(1.0e9)");
		hm.put("ArrayTimeInterval", "NotUsedHere");

		hm.put("Angle", ".get()");
		hm.put("AngularRate", ".get()");
		hm.put("Flux", ".get()");
		hm.put("Frequency", ".get()");
		hm.put("Humidity", ".get()");
		hm.put("Length", ".get()");
		hm.put("Pressure", ".get()");
		hm.put("Speed", ".get()");
		hm.put("Temperature", ".get()");
		return hm;
	}
	
	static HashMap<String, String> valueMapper = valueMapperInit();

	static HashMap<String, String> arrayMapper = arrayMapperInit();

	static HashMap<String, String> arrayMapperInit() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Integer", "basic2CASA");
		hm.put("Short", "basic2CASA");
		hm.put("Long", "basic2CASA");
		hm.put("Byte", "basic2CASA");
		hm.put("Char", "basic2CASA");
		hm.put("Boolean", "basic2CASA");
		hm.put("Float", "basic2CASA");
		hm.put("Double", "basic2CASA");

		hm.put("String", "basic2CASA");
		hm.put("Complex", "_2CASAString");

		hm.put("Entity", "_2CASAString");
		hm.put("EntityId", "_2CASAString");
		hm.put("EntityRef", "_2CASAString");
		hm.put("Tag", "_2CASAString");

		hm.put("Interval", "interval2CASA");
		hm.put("ArrayTime", "at2CASA");
		hm.put("ArrayTimeInterval", "ati2CASA");

		hm.put("Angle", "ext2CASA");
		hm.put("AngularRate", "ext2CASA");
		hm.put("Flux", "ext2CASA");
		hm.put("Frequency", "ext2CASA");
		hm.put("Humidity", "ext2CASA");
		hm.put("Length", "ext2CASA");
		hm.put("Pressure", "ext2CASA");
		hm.put("Speed", "ext2CASA");
		hm.put("Temperature", "ext2CASA");
		return hm;
	}
	
	static String casaScalarType(ASDMAttribute attr) {
		if (attr.isEnumeration)
			return "String";
		else
			return typeMapper.get(attr.SimpleJavaType());
	}

	static String casaScalarValue(ASDMAttribute attr, String rowContext) {
		if (attr.isEnumeration)
			return "C" + attr.typeName + "::name(" + rowContext + "get"
					+ attr.UpperCaseName() + "())";
		else {
			if (attr.isArrayTimeIntervalType())
				return "ati2CASA1D<" + typeMapper.get(attr.SimpleJavaType())
						+ ">(" + rowContext + "get" + attr.UpperCaseName()
						+ "()" + ")";
			else
				return rowContext + "get" + attr.UpperCaseName() + "()"
						+ valueMapper.get(attr.SimpleJavaType());
		}
	}
	
	static String casaArrayValue(ASDMAttribute attr, String rowContext) {
		if (attr.isEnumeration) {
			return "enum2CASA" + attr.dimension + "D" + "<"
					+ attr.typeName + "," + "C" + attr.typeName
					+ ">" + "(" + rowContext + "get" + attr.UpperCaseName()
					+ "())";
		} else {
			if (attr.isArrayTimeIntervalType()) {
				return arrayMapper.get(attr.SimpleJavaType())
						+ (attr.dimension + 1)
						+ "D" + "<" + typeMapper.get(attr.SimpleJavaType())
						+ ">(" + rowContext + "get" + attr.UpperCaseName()
						+ "()" + ")";
			} else if (attr.isArrayTimeType()) {
				return arrayMapper.get(attr.SimpleJavaType())
						+ attr.dimension + "D" + "<"
						+ typeMapper.get(attr.SimpleJavaType()) + ">("
						+ rowContext + "get" + attr.UpperCaseName() + "()"
						+ ")";
			} else {
				String asdmType = attr.SimpleCppType();
				if (asdmType.equals("Complex"))
					asdmType = "asdm::Complex";
				return arrayMapper.get(attr.SimpleJavaType())
						+ attr.dimension + "D" + "<" + asdmType
						+ "," + typeMapper.get(attr.SimpleJavaType()) + ">("
						+ rowContext + "get" + attr.UpperCaseName() + "()"
						+ ")";
			}
		}
	}

	static String casaColumn(ASDMAttribute attr) {
		if (attr.isArray() || attr.isArrayTimeIntervalType())
			return "ArrayColumn";
		else
			return "ScalarColumn";
	}

	static String casaColumnDesc(ASDMAttribute attr) {
		if (attr.isArray() || attr.isArrayTimeIntervalType())
			return "ArrayColumnDesc";
		else
			return "ScalarColumnDesc";
	}
}
