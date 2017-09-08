package alma.hla.datamodel.meta.asdm;

public class BasicType {
	
	private String JavaName;
	private String WrapperName;
	private String OutputType;
	private String IDLName;
	private boolean extended;
	private boolean physquant;
	
	
	static public BasicType[] getBasicType() {
		return basicType;
	}
	
	static private final BasicType[] basicType = {
			//             	JavaName        				WrapperName			  OutputType				    IDLName          		  isExtended         isPhysQuant
			new BasicType ( "int", 							"Integer",				"Int",						"long", 					false, 				false),
			new BasicType ( "short", 						"Short",				"Short",					"short", 					false,				false),
			new BasicType ( "long",	 						"Long",					"Long",						"long long",				false, 				false),
			new BasicType ( "byte",	 						"Byte",					"Byte",						"octet", 					false,				false),
			new BasicType ( "float",						"Float",				"Float",					"float", 					false, 				false),
			new BasicType ( "double",						"Double",				"Double",					"double", 					false, 				false),
			new BasicType ( "char",	 						"Character",			"Char",						"char", 					false,				false),
			new BasicType ( "boolean",						"Boolean",				"Boolean",					"boolean", 					false,				false),
			new BasicType ( "String",						"String",				  null,						"string", 					false,				false),
			new BasicType ( "Angle",	 					"Angle",				"Double",					"IDLAngle", 				true,				true),
			new BasicType ( "AngularRate",					"AngularRate",			"Double",					"IDLAngularRate", 			true,				true),
			new BasicType ( "ArrayTime",					"ArrayTime",			"Long",						"IDLArrayTime", 			true,				false),
	        new BasicType ( "ArrayTimeInterval",    		"ArrayTimeInterval", 	  null,						"IDLArrayTimeInterval",		true,				false),            
			new BasicType ( "Complex",	 					"Complex",				  null,						"IDLComplex", 				true,				false),
			new BasicType ( "Entity",	 					"Entity",				  null,						"IDLEntity", 				true,				false),
			new BasicType ( "EntityId",	 					"EntityId",			 	  null,						"IDLEntityId",				true,				false),
			new BasicType ( "EntityRef",					"EntityRef",			  null,						"IDLEntityRef", 			true,				false),
			new BasicType ( "Flux",	 						"Flux",					"Double",					"IDLFlux", 					true, 				false),
			new BasicType ( "Frequency",					"Frequency",			"Double",					"IDLFrequency", 			true,				false),
			new BasicType ( "Humidity",	 					"Humidity",				"Double",					"IDLHumidity", 				true,				false),
			new BasicType ( "Interval",	 					"Interval",				"Long",						"IDLInterval", 				true,				false),
			new BasicType ( "Length",	 					"Length",				"Double",					"IDLLength", 				true,				true),
			new BasicType ( "Pressure",	 					"Pressure",				"Double",					"IDLPressure", 				true,				true),
			new BasicType ( "Speed",	 					"Speed",				"Double",					"IDLSpeed", 				true,				true),
			new BasicType ( "Tag",	 						"Tag",					  null,						"IDLTag", 					true,				false),
			new BasicType ( "Temperature",					"Temperature",			"Double",					"IDLTemperature", 			true,				true)
			//, new BasicType ( "AntennaType",        		"AntennaType",    		  null,                     "AntennaTypeIDL",    		true)
	};
	
	BasicType(String j, String w, String on, String i, boolean e, boolean pq) {
		JavaName = j;
		WrapperName = w;
		OutputType = on;
		IDLName = i;
		extended = e;
		physquant = pq;
	}
	
	
	/**
	 * 	@return Returns the value of (boolean) physquant
	 */
	public boolean isPhysQuant() {
		return physquant;
	}
	
	/**
	 * @return Returns the value of (boolean) extended.
	 */
	public boolean isExtended() {
		return extended;
	}

	/**
	 * @return Returns the iDLName.
	 */
	public String getIDLName() {
		return IDLName;
	}

	/**
	 * @return Returns the javaName.
	 */
	public String getJavaName() {
		return JavaName;
	}

	/**
	 * @return Returns the wrapperName.
	 */
	public String getWrapperName() {
		return WrapperName;
	}
	
	/**
	 * @return Returns the OutputName.
	 */
	public String getOutputType() {
		return OutputType;
	}

}
