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
 * File ASDMAttribute.java
 */

package alma.hla.datamodel.meta.asdm;

import org.xtext.alma.container.container.ContainerField;
import org.xtext.alma.sdmdsl.sdmdsl.Addition;
import org.xtext.alma.sdmdsl.sdmdsl.Defined;
import org.xtext.alma.sdmdsl.sdmdsl.Field;
import org.xtext.alma.sdmdsl.sdmdsl.FieldDimensions;
import org.xtext.alma.sdmdsl.sdmdsl.GlobalField;
import org.xtext.alma.sdmdsl.sdmdsl.IntDimensions;
import org.xtext.alma.sdmdsl.sdmdsl.Multiplication;
import org.xtext.alma.sdmdsl.sdmdsl.NotDefined;
import org.xtext.alma.sdmdsl.sdmdsl.OtherTableField;
import org.xtext.alma.sdmdsl.sdmdsl.Primary;
import org.xtext.alma.sdmdsl.sdmdsl.impl.FieldImpl;

import alma.hla.datamodel.util.MMUtil;

public class ASDMAttribute extends FieldImpl {

	protected String tableName = null;

	protected String typeName;
	protected int dimension;

	protected String size = "";
	protected String initValue;

	protected boolean isEnumeration = false;
	protected boolean isPrimitiveType = false;

	protected boolean optional = false;
	protected boolean key = false;
	protected boolean required = false;
	protected boolean global = false;

	protected boolean extrinsic = false;
	protected boolean set = false;
	protected boolean isStatic = false;
	protected boolean array = false;
	protected boolean readOnly = false;

	protected boolean tableKey = false;

	protected ExportEncoding exportEncoding = ExportEncoding.ASCII;

	protected String alias = null;
	protected String[] shape_ = null;

	protected boolean is_id = false;

	/* other attributes */
	static protected String oracleKeywords = "TYPE#SIZE#LEVEL";

	/* -------------------- Functions -------------------- */

	public boolean isReadOnly() {
		return readOnly;
	}

	public String ShortDocumentation() {
		String doc = this.doc;
		int index = doc.indexOf("|");
		if (index == -1)
			return doc;
		return doc.substring(0, index);
	}

	public boolean isPhysQuantity() {
		if (isEnumeration())
			return false;

		BasicType[] basicType = BasicType.getBasicType();
		String s = MMUtil.JavaType(typeName);

		int i = 0;
		for (; i < basicType.length; ++i)
			if (basicType[i].getJavaName().equals(s))
				break;
		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type: " + s);

		return basicType[i].isPhysQuant();
	}

	/**
	 * Returns the name which will be given to a column in the Oracle database.
	 * given the name of the attribute.s
	 */
	public String SQLName() {
		int maxlen = 29; // Due to Oracle limitation (30 max) minus the possible
							// ('_') at the end.
		String s = this.name.toUpperCase();
		if (this.isArrayTimeIntervalType()) {
			maxlen = maxlen - 6; // Keep space for _START and _DUR
		} else if (isEnumeration) {
			maxlen = maxlen - 3; // Keep space for _ID a the end
		}

		s = s.substring(0, Math.min(s.length(), maxlen));

		if (isEnumeration) {
			s = s + "_ID";
		}

		if (oracleKeywords.indexOf(s) != -1)
			s = s + "_";

		return s;
	}

	public String CppClass() {
		if (isEnumeration) {
			return typeName;
		}

		return MMUtil.CppType(typeName);
	}

	/**
	 * @return the c++ base type
	 */
	public String SimpleCppType() {
		return MMUtil.CppType(typeName);
	}

	/**
	 * @return the swig type of the attribute
	 */
	public String SwigType() {
		String ret = "";

		if (isEnumeration) {
			ret = "Enum<" + this.SimpleCppType() + "Mod::" + this.SimpleCppType() + ">";
		} else {
			ret = MMUtil.CppType(typeName);
		}

		if (array) {

			if (extrinsic) {
				ret = CppType();
			} else {
				for (int i = 0; i < dimension; ++i)
					ret = "vector<" + ret + " > ";
			}

		}

		return ret;
	}

	// returns WrapperType of BasicType
	public String WrapperType() {

		if (isEnumeration()) {
			return typeName;
		}

		BasicType[] basicType = BasicType.getBasicType();
		String type = MMUtil.JavaType(typeName);

		int i = 0;
		for (; i < basicType.length; i++)
			if (basicType[i].getJavaName().equals(type))
				break;

		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type: " + type);

		return basicType[i].getWrapperName();
	}

	public String DataOutputType() {
		BasicType[] basicType = BasicType.getBasicType();
		String s = MMUtil.JavaType(typeName);
		int i = 0;
		for (; i < basicType.length; ++i)
			if (basicType[i].getJavaName().equals(s))
				break;
		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type: " + s);
		return basicType[i].getOutputType();
	}

	public String ParserType() {
		BasicType[] basicType = BasicType.getBasicType();
		String s = MMUtil.JavaType(typeName);
		int i = 0;
		for (; i < basicType.length; ++i)
			if (basicType[i].getJavaName().equals(s))
				break;
		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type: " + s);
		if (basicType[i].getJavaName().equals("int"))
			return "parseInt";
		else if (basicType[i].getJavaName().equals("boolean"))
			return "parseBoolean";
		return "parse" + basicType[i].getWrapperName();
	}

	// checks if type is extended
	public boolean isExtendedType() {

		if (isEnumeration())
			return false;

		BasicType[] basicType = BasicType.getBasicType();
		String type = MMUtil.JavaType(typeName);

		int i = 0;
		for (; i < basicType.length; i++)
			if (basicType[i].getJavaName().equals(type))
				break;

		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type: " + type);

		return basicType[i].isExtended();
	}

	// checks if attribute is an array
	public boolean isArray() {
		if (dimension > 0)
			return true;
		return false;
	}

	// returns name in uppercase form
	public String UpperCaseName() {
		return MMUtil.UpperCaseName(name);
	}

	public String JavaBaseType() {
		String ret = JavaType();
		return ret;
	}

	public String JavaType() {
		String ret = "";

		if (isEnumeration) {
			ret = typeName;
		} else {
			ret = MMUtil.JavaType(typeName);
		}

		if (array) {

			if (extrinsic) {
				ret += "[]";
			} else {
				for (int i = 0; i < dimension; i++) {
					ret += "[]";
				}
			}

		}

		return ret;

	}

	public String XMLJavaType() {

		return this.JavaType();
	}

	public String LatexSymbol() {
		String str = "";
		if (alias == null || alias.equals("")) {
			str = name.replaceAll("_", "\\\\_");

			if (this.isDimensionPar()) {
				if (str.length() > 7) {
					str = "\\f$N_{" + str.substring(3, 7) + "}\\f$";
				} else {
					str = "\\f$N_{" + str.substring(3) + "}\\f$";
				}
			}
		} else {
			str = " \\f$" + alias + "\\f$";
		}
		return str;
	}

	// ------------- Methods used for C interface of ASDM -------------------

	public String CType() {
		String s = this.SimpleCppType();
		if (s.equals("Angle"))
			s = "double";
		else if (s.equals("AngularRate"))
			s = "double";
		else if (s.equals("ArrayTime"))
			s = "int64_t";
		else if (s.equals("ArrayTimeInterval"))
			s = "int64_t";
		else if (s.equals("EntityRef"))
			s = "char";
		else if (s.equals("Flux"))
			s = "double";
		else if (s.equals("Frequency"))
			s = "double";
		else if (s.equals("Humidity"))
			s = "double";
		else if (s.equals("Interval"))
			s = "int64_t";
		else if (s.equals("Length"))
			s = "double";
		else if (s.equals("Pressure"))
			s = "double";
		else if (s.equals("Speed"))
			s = "double";
		else if (s.equals("string"))
			s = "char";
		else if (s.equals("Tag"))
			s = "int";
		else if (s.equals("Temperature"))
			s = "double";
		return s;
	}

	/**
	 * Return the type of a Tag in the C++ form "TagType::Something" (e.g.
	 * TagType::Holography, TagType::SpectralWindow...).
	 * 
	 * It returns an empty string if the attribute is not a Tag. The algorithm
	 * to determine the type of a Tag is based on analyzing its name which
	 * always follows naming conventions. It also considers the case of "modeId"
	 * which should have been "almaCorrelatorMode" !!! This should definitely be
	 * replaced by a more complete and coherent approach where Tag attributes
	 * would be defined with their types in the UML model.
	 */
	public String CppTagType() {
		String result = "";
		if (this.SimpleCppType().equals("Tag")) {
			if (this.name.equals("pairedAntennaId"))
				return "TagType::Antenna";
			// Is it this "modeId" ???
			if (this.name.equals("almaCorrelatorModeId"))
				return "TagType::CorrelatorMode";
			if (this.name.equals("modeId"))
				return "TagType::AlmaRadiometer";

			result = this.name;
			// Does the name starts with assoc ?
			if (result.indexOf("assoc") == 0) {
				// Then extract assoc
				result = result.substring(5);
			}
			// Does the name starts with input ?
			if (result.indexOf("input") == 0) {
				// Then extract input
				result = result.substring(5);
			}
			// Does the name starts with ref ?
			else if (result.indexOf("ref") == 0) {
				// Then extract assoc
				result = result.substring(3);
			}
			// I know ... this is infamous !
			else if (result.equals("imageSpectralWindowId")) {
				result = result.substring(5);
			}
			// Now look for the terminating Id.
			result = result.substring(0, result.indexOf("Id"));
			result = "TagType::" + result.substring(0, 1).toUpperCase() + result.substring(1);
		}
		return result;
	}

	public boolean isCppStandard() {
		boolean b = true;
		String s = this.SimpleCppType();
		if (s.equals("Angle") || s.equals("AngularRate") || s.equals("ArrayTime") || s.equals("ArrayTimeInterval")
				|| s.equals("EntityRef") || s.equals("Flux") || s.equals("Frequency") || s.equals("Humidity")
				|| s.equals("Interval") || s.equals("Length") || s.equals("Pressure") || s.equals("Speed")
				|| s.equals("string") || s.equals("Tag") || s.equals("Temperature")) {
			b = false;
		}
		return b;
	}

	// ------------- Methods used for latex documentation -------------------
	public String LatexLongDoc() {
		if (this.doc != "") {
			String str = this.doc + "| ";
			int sep = str.indexOf("|");
			str = str.substring(sep + 1);
			sep = str.indexOf("|");
			// if (sep > 0) return str.substring(0,sep).replaceAll("_",
			// "\\\\_");
			if (sep > 0)
				return str.substring(0, sep);
			return "{\\red long doc missing}";
		}
		return new String("{\\red missing}");
	}

	public String LatexShortDoc() {
		if (this.doc != "") {
			String str = this.doc + "| ";
			int sep = str.indexOf("|");
			// if (sep > 0) return str.substring(0, sep).replaceAll("_",
			// "\\\\_");
			if (sep > 0)
				return str.substring(0, sep);
			return "{\\red short doc missing}";
		}
		return new String("{\\red doc missing}");
	}

	public String LatexTypeDescription() {
		String s = this.SimpleCppType().replace("_", "\\_");
		if (shape_ == null)
			return s;
		for (int i = 0; i < shape_.length; i++) {
			s = s + " [" + shape_[i].toString() + "] ";
			// if (!Shape_[i].trim().equals("")){
			// if (Shape_[i].toString().indexOf("num")==0) {
			// s = s+ " [\\"+ Shape_[i].toString()+"] ";
			// } else {
			// s = s+ " ["+ Shape_[i].toString()+"] ";
			// }
			// }
		}
		// System.out.println(s);
		return s;
	}

	public String JavaTypeDescription() {

		if (shape_ == null)
			return new String("");

		StringBuffer result = new StringBuffer("");
		for (int i = 0; i < shape_.length; i++) {
			if (i > 0)
				result.append(", ");
			if (!shape_[i].trim().equals("")) {
				result.append(shape_[i]);
			}
		}
		return result.toString();
	}

	public String XMLJavaTypeDescription() {
		return this.JavaTypeDescription();
	}

	public String IDLBaseType() {
		return IDLType();
	}

	public String IDLType() {
		// System.out.println(tableName + " --> " + "field : " + this.name + " :
		// " + array + " : " + Integer.toString(dimension));
		String ret = "";

		if (isEnumeration) {
			ret = typeName + "Mod::" + typeName;
		} else {
			BasicType[] basicType = BasicType.getBasicType();
			String s = MMUtil.JavaType(typeName);
			int i = 0;
			for (; i < basicType.length; ++i)
				if (basicType[i].getJavaName().equals(s))
					break;
			if (i == basicType.length)
				throw new IllegalArgumentException("Unrecognized Java type: " + s);
			BasicType x = basicType[i];
			if (x.isExtended())
				ret = "asdmIDLTypes::" + x.getIDLName();
			else
				ret = basicType[i].getIDLName();
		}

		if (array) {

			if (extrinsic) {
				String[] w = ret.split("::");
				String ns = new String("");
				String bn = new String("");
				if (w.length == 2) {
					ns = w[0] + "::";
					bn = w[1];
				} else {
					ns = "asdmIDLTypes::";
					bn = w[0];
				}
				return ns + "Sof" + bn;
			} else {
				String ns = new String("");
				String bn = new String("");
				int pos = ret.indexOf("::");
				if (pos == -1) {
					ns = "";
					bn = ret;
				} else {
					ns = ret.substring(0, pos);
					bn = ret.substring(pos + 2);
				}

				String result = bn;
				if (result.equals("long long"))
					result = "longlong";
				for (int i = 0; i < dimension; ++i) {
					result = "Sof" + result;
				}

				/*
				 * This part has been commented out on Fri, 27 2015 in the
				 * context of ICT-4496 - thank you to Alessandro Caproni if
				 * (ns.length() > 0) result = ns+"::"+result; else result =
				 * "asdmIDLTypes::"+result;
				 */

				return result;
			}

		}

		return ret;

	}

	// returns simple IDL type name
	public String SimpleIDLType() {

		BasicType[] basicType = BasicType.getBasicType();
		String type = MMUtil.JavaType(typeName);

		int i = 0;
		for (; i < basicType.length; ++i)
			if (basicType[i].getJavaName().equals(type))
				break;

		if (i == basicType.length)
			throw new IllegalArgumentException("Unrecognized Java type : " + type);

		return basicType[i].getIDLName();

	}

	public String CppBaseType() {

		return CppType();
	}

	public String CppType() {

		String ret = "";

		if (isEnumeration) {
			ret = typeName + "Mod::" + typeName;
		} else {
			ret = MMUtil.CppType(typeName);
		}

		if (array) {

			if (extrinsic) {
				ret = "vector<" + ret + "> ";
			} else {
				for (int i = 0; i < dimension; i++) {
					ret = "vector<" + ret + " >";
				}
			}

		}

		return ret;

	}

	public String XMLCppType() {
		return this.CppType().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}

	/**
	 * Return the type of a Tag in the form "Something" (e.g. Holography,
	 * SpectralWindow...).
	 * 
	 * It returns an empty string if the attribute is not a Tag. The algorithm
	 * to determine the type of a Tag is based on analyzing its name which
	 * always follows naming conventions. It also considers the case of "modeId"
	 * which should have been "almaCorrelatorMode" !!! This should definitely be
	 * replaced by a more complete and coherent approach where Tag attributes
	 * would be defined with their types in the UML model.
	 */
	public String TagType() {
		String result = "";
		if (this.SimpleCppType().equals("Tag")) {
			// Is it this "modeId" ???
			if (this.name.equals("modeId"))
				return "AlmaCorrelatorMode";

			result = this.name;
			// Does the name starts with assoc ?
			if (result.indexOf("assoc") == 0) {
				// Then extract assoc
				result = result.substring(5);
			}
			// Does the name starts with input ?
			if (result.indexOf("input") == 0) {
				// Then extract input
				result = result.substring(5);
			}
			// Does the name starts with ref ?
			else if (result.indexOf("ref") == 0) {
				// Then extract assoc
				result = result.substring(3);
			} else if (result.equals("imageSpectralWindowId")) {
				result = result.substring(5);
			}

			// Now look for the terminating Id.
			result = result.substring(0, result.indexOf("Id"));
			result = result.substring(0, 1).toUpperCase() + result.substring(1);
		}
		return result;
	}

	public String casaColumnDesc() {
		return VerbatimCASAFiller.casaColumnDesc(this);
	}

	public String casaScalarType() {
		return VerbatimCASAFiller.casaScalarType(this);
	}

	public String casaColumn() {
		return VerbatimCASAFiller.casaColumn(this);
	}

	public String casaArrayValue(String rowContext) {
		return VerbatimCASAFiller.casaArrayValue(this, rowContext);
	}

	public String casaScalarValue(String rowContext) {
		return VerbatimCASAFiller.casaScalarValue(this, rowContext);
	}

	public String CppTypeDescription() {

		if (shape_ == null)
			return new String("");
		StringBuffer result = new StringBuffer("");
		for (int i = 0; i < shape_.length; i++) {
			if (i > 0)
				result.append(", ");
			if (!shape_[i].trim().equals("")) {
				result.append(shape_[i]);
			}
		}
		return result.toString();
	}

	public String XMLCppTypeDescription() {
		return this.CppTypeDescription().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}

	// retursn type in form of JavaType
	public String SimpleJavaType() {

		if (isEnumeration)
			return typeName;

		return MMUtil.JavaType(typeName);
	}

	public String TypeSet() {
		return MMUtil.UpperCaseName(JavaType()) + "Set";
	}

	public boolean isStringType() {
		return MMUtil.JavaType(typeName).equals("String");
	}

	public boolean isCharType() {
		return MMUtil.JavaType(typeName).equals("char");
	}

	public boolean isArrayTimeIntervalType() {
		return MMUtil.JavaType(typeName).equals("ArrayTimeInterval");
	}

	public boolean isArrayTimeType() {
		return MMUtil.JavaType(typeName).equals("ArrayTime");
	}

	public boolean isTemporal() {
		return (MMUtil.JavaType(typeName).equals("ArrayTime") || MMUtil.JavaType(typeName).equals("ArrayTimeInterval"));
	}

	public String ArrayDimensions() {
		if (array) {
			return Integer.toString(dimension);
		}
		return "0";
	}

	public boolean isDimensionPar() {
		boolean b = false;
		String str = this.name;
		if (str.indexOf("num") == 0) {
			b = true;
		}
		return b;
	}

	public String SimpleName() {
		if (extrinsic) {
			return MMUtil.simpleName(this.name);
		}
		return this.name;
	}

	public String SimpleUpperCaseName() {
		return MMUtil.UpperCaseName(SimpleName());
	}

	/**
	 * Return the name of this attribute in lower cases.
	 */
	public String ToLowerCase() {
		String s = this.name;
		return s.toLowerCase();
	}

	/**
	 * Return a C type list for an attribute Add dimensions after the attribute
	 * name Example : int * assocFieldId, int * assocFieldIdDimOne
	 */
	public String CTypeAttributeDimList() {

		String s = "";
		// String[] dimOrder = {"DimOne","DimTwo","DimThird"};

		if (!this.isArray() && !this.isStringType()) {
			s = s + this.CType() + " * " + this.name;
		} else { // array
			s = s + this.CType() + " * " + this.name + ", int * " + this.name + "Dim";

		}
		return s;
	}

	public boolean isOneD() {
		if (this.dimension == 1)
			return true;

		return false;
	}

	public boolean isTwoD() {
		if (this.dimension == 2)
			return true;

		return false;
	}

	public boolean isThreeD() {
		if (this.dimension == 3)
			return true;

		return false;
	}

	public boolean isFourD() {
		if (this.dimension == 4)
			return true;

		return false;

	}

	public String FType() {
		String s = this.SimpleCppType();
		if (isEnumeration())
			s = "integer";
		else if (s.equals("int"))
			s = "integer";
		else if (s.equals("int32_t"))
			s = "integer";
		else if (s.equals("int64_t"))
			s = "integer*8";
		else if (s.equals("long"))
			s = "integer";
		else if (s.equals("long long"))
			s = "integer*8";
		else if (s.equals("bool"))
			s = "logical*1";
		else if (s.equals("float"))
			s = "real";
		else if (s.equals("double"))
			s = "real*8";
		else if (s.equals("Angle"))
			s = "real*8";
		else if (s.equals("AngularRate"))
			s = "real*8";
		else if (s.equals("ArrayTime"))
			s = "integer*8";
		else if (s.equals("ArrayTimeInterval"))
			s = "type(ArrayTimeInterval)";
		else if (s.equals("EntityRef"))
			s = "character*256";
		else if (s.equals("Flux"))
			s = "real*8";
		else if (s.equals("Frequency"))
			s = "real*8";
		else if (s.equals("Humidity"))
			s = "real*8";
		else if (s.equals("Interval"))
			s = "integer*8";
		else if (s.equals("Length"))
			s = "real*8";
		else if (s.equals("Pressure"))
			s = "real*8";
		else if (s.equals("Speed"))
			s = "real*8";
		else if (s.equals("string"))
			s = "character*256";
		else if (s.equals("Tag"))
			s = "integer";
		else if (s.equals("Temperature"))
			s = "real*8";
		else if (s.equals("Complex"))
			s = "complex*16";
		return s;
	}

	/**
	 * Return name preceded by fortran structure name
	 */
	public String FFullName() {
		String s = " ";
		if (this.isKey())
			s = "key%";
		else
			s = "row%";
		return s + this.name;
	}

	/**
	 * Full Fortran specification
	 */
	public String FFullType() {
		String s = this.FType();
		if (this.isArray())
			s = s + ", allocatable";
		s = s + " :: " + this.name;
		if (this.isArray()) {
			if (this.isOneD() || this.isExtrinsic())
				s = s + "(:)";
			else if (this.isTwoD())
				s = s + "(:,:)";
			else if (this.isThreeD())
				s = s + "(:,:,:)";
			else if (this.isFourD())
				s = s + "(:,:,:,:)";
		}
		return s;
	}

	/**
	 * Return a Fortran type list for an attribute Add dimensions after the
	 * attribute name Example : int * assocFieldId, int * assocFieldIdDimOne
	 */
	public String FTypeAttributeDimList() {

		String s = "";
		// String[] dimOrder = {"DimOne","DimTwo","DimThird"};

		if (!this.isArray() && !this.isStringType()) {
			s = s + this.name;
		} else { // array
			s = s + this.name + ", " + this.name + "Dim";
		}
		return s;
	}

	/* -------------------- Constructor -------------------- */
	public ASDMAttribute() {
		super();
	}

	/* receives Field */
	public ASDMAttribute(Field field) {

		super();

		// field name
		this.name = field.getName();

		// documentation
		if (field.getDoc() != null) {
			StringBuilder sb = new StringBuilder(field.getDoc());
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
			this.doc = sb.toString();
		} else
			this.doc = "";

		// autoIncrementable
		this.autoIncrementable = field.isAutoIncrementable();

		// field dimension size
		if (field.getDataDim() == null)
			this.dimension = 0;
		else {
			this.dimension = field.getDataDim().size();
			/* TODO: init shape_ */
			shape_ = new String[field.getDataDim().size()];
			for (int i = 0; i < field.getDataDim().size(); i++) {
				if (field.getDataDim().get(i) instanceof NotDefined) {
					shape_[i] = "";
				} else {
					Defined defDim = (Defined) field.getDataDim().get(i);
					Addition addition = defDim.getDataDimValue();
					String result = "";
					result += additionParser(addition);
					

					
					shape_[i] = result;
					//System.out.println(result);

				}
			}
		}

		if (dimension > 0) {
			array = true;
		}

		// field refered table name
		if (field.getRefersTo() != null) {
			this.refersTo = field.getRefersTo();

			this.extrinsic = true;

			this.refsToOne = field.isRefsToOne();
			this.refsToMany = field.isRefsToMany();
			this.refsToAslice = field.isRefsToAslice();
			this.refsToManySlices = field.isRefsToManySlices();
		} else {
			this.refersTo = null;
			this.extrinsic = false;
		}

		// field type name
		if (field.getEnumeration() != null) {
			isEnumeration = true;
			isPrimitiveType = false;
			typeName = field.getEnumeration().getName();
		} else {
			typeName = field.getPrimitiveType();
			isEnumeration = false;
			isPrimitiveType = true;

		}

	}

	/* receives ContainerField */
	public ASDMAttribute(ContainerField field) {
		super();

		// field name
		this.name = field.getName();

		// documentation
		if (field.getDoc() != null) {
			StringBuilder sb = new StringBuilder(field.getDoc());
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
			sb.deleteCharAt(sb.length() - 1);
			this.doc = sb.toString();
		} else
			this.doc = "";

		// field type name
		isEnumeration = false;
		isPrimitiveType = true;

		typeName = field.getPrimitiveType();

	}
	
	
	public String multiplicationParser(Multiplication multiplication){
		String result = "";
		
		int multCounter = 0;
		
		
		for(Primary primary : multiplication.getMultValue()){
			
			
			if (primary.getPrimValue() instanceof IntDimensions) {
				IntDimensions intDim = (IntDimensions) primary.getPrimValue();
				
				if (multCounter > 0) {
					result += multiplication.getOp().get(multCounter - 1);
				}
				result += intDim.getDimValue();
			}else if (primary.getPrimValue() instanceof FieldDimensions) {
				FieldDimensions fieldDim = (FieldDimensions) primary.getPrimValue();
				
				if (multCounter > 0) {
					result += multiplication.getOp().get(multCounter - 1);
				}
				result += fieldDim.getDimValue().getName();
			}else if (primary.getPrimValue() instanceof OtherTableField) {
				OtherTableField otherFieldDim = (OtherTableField) primary.getPrimValue();
				
				if (multCounter > 0) {
					result += multiplication.getOp().get(multCounter - 1);
				}
				result += otherFieldDim.getFieldName();
			}else {
				if (multCounter > 0) {
					result += multiplication.getOp().get(multCounter - 1);
				}
				result += '(' + additionParser(primary.getPrimAddValue()) + ')';
			}
			
			multCounter++;
			
		}
		
		
		return result;
	}

	
	
	public String additionParser(Addition addition) {
		String result = "";

		int addCounter = 0;
			
		
		
		/*
		for (Multiplication addValue : addition.getAddValue()) {
			for (Primary multValue : addValue.getMultValue()) {
				if (multValue.getPrimValue() instanceof IntDimensions) {
					IntDimensions intDim = (IntDimensions) multValue.getPrimValue();
					if (addCounter > 0) {
						result += addition.getOp().get(addCounter - 1);
					}
					result += intDim.getDimValue();
				} else if (multValue.getPrimValue() instanceof OtherTableField) {
					OtherTableField otherTableFieldDim = (OtherTableField) multValue.getPrimValue();
					if (addCounter > 0) {
						result += addition.getOp().get(addCounter - 1);
					}
					result += otherTableFieldDim.getFieldName();
				} else if (multValue.getPrimValue() instanceof FieldDimensions) {
					FieldDimensions fieldDim = (FieldDimensions) multValue.getPrimValue();
					if (addCounter > 0) {
						// result += addition.getOp().get(addCounter-1);
					}
					result += fieldDim.getDimValue().getName();
				} else {
					result += '(' + additionParser(multValue.getPrimAddValue()) + ')';
				}

				// multCounter++;

			}

			addCounter++;

		}

		*/
		
		
		
		for(Multiplication mult : addition.getAddValue()){
			
			
			if (addCounter > 0) {
				result += addition.getOp().get(addCounter - 1);
			}
			result += multiplicationParser(mult);
			
			
			
			addCounter++;
			
		}
		
		
		
		
		
		

		return result;
	}

	ASDMAttribute(GlobalField gField) {

		super();

		// field name
		this.name = gField.getName();

		// documentation
		if (gField.getDoc() != null)
			this.doc = gField.getDoc();
		else
			this.doc = "";

		// autoIncrementable
		this.autoIncrementable = false;

		// field dimension size
		this.dimension = 0;

		// field refered table name
		this.refersTo = null;

		// field type name
		if (gField.getEnumeration() != null) {
			isEnumeration = true;
			isPrimitiveType = false;
			typeName = gField.getEnumeration().getName();
		} else {
			typeName = gField.getPrimitiveType();
			isEnumeration = false;
			isPrimitiveType = true;
		}

		// readOnly and initValue
		this.readOnly = gField.isReadOnly();
		this.initValue = gField.getInitValue();
	}

	/* -------------------- Setters and Getters -------------------- */

	public boolean isOptional() {
		return optional;
	}

	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public boolean isExtrinsic() {
		return extrinsic;
	}

	public void setExtrinsic(boolean extrinsic) {
		this.extrinsic = extrinsic;
	}

	public String getRefersTo() {
		return refersTo;
	}

	public void setRefersTo(String refersTo) {
		this.refersTo = refersTo;
	}

	public boolean isSet() {
		return set;
	}

	public void setSet(boolean set) {
		this.set = set;
	}

	public ExportEncoding getExportEncoding() {
		return exportEncoding;
	}

	public void setExportEncoding(String exportEncoding) {
		this.exportEncoding = ExportEncoding.get(exportEncoding);
		// if (this.exportEncoding == null)
		// TODO : ??? Checks.error(this, "'" + exportEncoding +"' is not a valid
		// export encoding name for" + typeName);
	}

	public boolean isAutoIncrementable() {
		return autoIncrementable;
	}

	public void setAutoIncrementable(boolean autoIncrementable) {
		this.autoIncrementable = autoIncrementable;
	}

	public boolean isStatic() {
		return isStatic;
	}

	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}

	public void setExportEncoding(ExportEncoding exportEncoding) {
		this.exportEncoding = exportEncoding;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setShape_(String[] s) {
		shape_ = new String[s.length];
		for (int i = 0; i < shape_.length; i++)
			shape_[i] = s[i];
	}

	public String[] getShape_() {
		return shape_;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setArray(boolean array) {
		this.array = array;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}

	public boolean isGlobal() {
		return global;
	}

	public void setGlobal(boolean global) {
		this.global = global;
	}

	public String getInitValue() {
		return initValue;
	}

	public void setInitValue(String initValue) {
		this.initValue = initValue;
	}

	public static String getOracleKeywords() {
		return oracleKeywords;
	}

	public static void setOracleKeywords(String oracleKeywords) {
		ASDMAttribute.oracleKeywords = oracleKeywords;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public boolean isEnumeration() {
		return isEnumeration;
	}

	public boolean isPrimitiveType() {
		return isPrimitiveType;
	}

	public void setPrimitiveType(boolean isPrimitiveType) {
		this.isPrimitiveType = isPrimitiveType;
	}

	public boolean isTableKey() {
		return tableKey;
	}

	public void setTableKey(boolean tableKey) {
		this.tableKey = tableKey;
	}

	public void setEnumeration(boolean isEnumeration) {
		this.isEnumeration = isEnumeration;
	}

	public boolean isId() {
		return is_id;
	}

	public void setIs_id(boolean is_id) {
		this.is_id = is_id;
	}

}
