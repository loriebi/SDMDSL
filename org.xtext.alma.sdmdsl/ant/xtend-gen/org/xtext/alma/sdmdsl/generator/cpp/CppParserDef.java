package org.xtext.alma.sdmdsl.generator.cpp;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;
import alma.hla.datamodel.meta.asdm.AlmaTableContainer;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess;

@SuppressWarnings("all")
public class CppParserDef {
  private AlmaTableContainer container = AlmaTableContainer.getInstance();
  
  public void doGenerate(final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    SDMFileSystemAccess sdmFsa = ((SDMFileSystemAccess) fsa);
    sdmFsa.setFile("include/Parser.h");
    CharSequence _generateParserDef = this.generateParserDef();
    sdmFsa.generateFile(_generateParserDef);
  }
  
  public CharSequence generateParserDef() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ALMA - Atacama Large Millimeter Array");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) European Southern Observatory, 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* (c) Associated Universities Inc., 2002");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by ESO (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Copyright by AUI (in the framework of the ALMA collaboration),");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* All rights reserved.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is free software; you can redistribute it and/or");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* modify it under the terms of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License as published by the Free software Foundation; either");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* version 2.1 of the License, or (at your option) any later version.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This library is distributed in the hope that it will be useful,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* but WITHOUT ANY WARRANTY, without even the implied warranty of");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Lesser General Public License for more details.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* You should have received a copy of the GNU Lesser General Public");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* License along with this library; if not, write to the Free Software");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Foundation, Inc., 59 Temple Place, Suite 330, Boston,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* MA 02111-1307  USA");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Warning!");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  -------------------------------------------------------------------- ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | This is generated code!  Do not modify this file.                  |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* | If you do, all changes will be lost when the file is re-generated. |");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*  --------------------------------------------------------------------");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* File Parser.h");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("#ifndef Parser_CLASS");
    _builder.newLine();
    _builder.append("#define Parser_CLASS");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    _builder.append("#include <string>");
    _builder.newLine();
    _builder.append("#include <vector>");
    _builder.newLine();
    _builder.append("#include <set>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using std::string;");
    _builder.newLine();
    _builder.append("using std::vector;");
    _builder.newLine();
    _builder.append("using std::set;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#include <Angle.h>");
    _builder.newLine();
    _builder.append("#include <AngularRate.h>");
    _builder.newLine();
    _builder.append("#include <ArrayTime.h>");
    _builder.newLine();
    _builder.append("#include <ArrayTimeInterval.h>");
    _builder.newLine();
    _builder.append("#include <ComplexWrapper.h>");
    _builder.newLine();
    _builder.append("#include <Entity.h>");
    _builder.newLine();
    _builder.append("#include <EntityId.h>");
    _builder.newLine();
    _builder.append("#include <EntityRef.h>");
    _builder.newLine();
    _builder.append("#include <Flux.h>");
    _builder.newLine();
    _builder.append("#include <Frequency.h>");
    _builder.newLine();
    _builder.append("#include <Humidity.h>");
    _builder.newLine();
    _builder.append("#include <Interval.h>");
    _builder.newLine();
    _builder.append("#include <Length.h>");
    _builder.newLine();
    _builder.append("#include <Pressure.h>");
    _builder.newLine();
    _builder.append("#include <Speed.h>");
    _builder.newLine();
    _builder.append("#include <Tag.h>");
    _builder.newLine();
    _builder.append("#include <Temperature.h>");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("#include <StringTokenizer.h>");
    _builder.newLine();
    _builder.append("#include <OutOfBoundsException.h>");
    _builder.newLine();
    _builder.append("#include <LongWrapper.h>");
    _builder.newLine();
    _builder.append("#include <ConversionException.h>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.append("using asdm::Angle;");
    _builder.newLine();
    _builder.append("using asdm::AngularRate;");
    _builder.newLine();
    _builder.append("using asdm::ArrayTime;");
    _builder.newLine();
    _builder.append("using asdm::Complex;");
    _builder.newLine();
    _builder.append("using asdm::Entity;");
    _builder.newLine();
    _builder.append("using asdm::EntityId;");
    _builder.newLine();
    _builder.append("using asdm::EntityRef;");
    _builder.newLine();
    _builder.append("using asdm::Flux;");
    _builder.newLine();
    _builder.append("using asdm::Frequency;");
    _builder.newLine();
    _builder.append("using asdm::Humidity;");
    _builder.newLine();
    _builder.append("using asdm::Interval;");
    _builder.newLine();
    _builder.append("using asdm::Length;");
    _builder.newLine();
    _builder.append("using asdm::Pressure;");
    _builder.newLine();
    _builder.append("using asdm::Speed;");
    _builder.newLine();
    _builder.append("using asdm::Tag;");
    _builder.newLine();
    _builder.append("using asdm::Temperature;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("using asdm::StringTokenizer;");
    _builder.newLine();
    _builder.append("using asdm::OutOfBoundsException;");
    _builder.newLine();
    _builder.append("using asdm::Long;");
    _builder.newLine();
    _builder.append("using asdm::ConversionException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("namespace asdm {");
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* A Parser of for XML representation of ASDM datasets.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("class Parser {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Parser(const string &s);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Is s in the string being parsed?");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("bool isStr(const string &) const;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get the portion of the string bounded by s1 and s2, inclusive.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param s1");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param s2");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string getElement(const string &s1, const string &s2);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Get the portion of the string bounded by s1 and s2, exclusive.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param s1");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @param s2");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @return");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string getElementContent(const string &s1, const string &s2);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string getField(const string &field);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static string getField(const string &xml, const string &field);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The follwing is a special case.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static string getString(const string &name, const string &tableName, const string &xmlDoc) ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//  throw (ConversionException);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static vector<string> get1DString(const string &name, const string &tableName, const string &xmlDoc) ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//\tthrow (ConversionException);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static vector <vector<string> > get2DString(const string &name, const string &tableName, const string &xmlDoc) ;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//\tthrow (ConversionException);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static vector <vector <vector<string> > > get3DString(const string &name, const string &tableName, const string &xmlDoc);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//\tthrow (ConversionException);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Generated methods for conversion to and from XML");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// data representations for all types, both primitive");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// and extended.  Also included are 1, 2, and 3 ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// dimensional arrays of these types.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _BasicType = this.container.BasicType();
      for(final ASDMAttribute attr : _BasicType) {
        _builder.append("\t");
        CharSequence _DefineType = this.DefineType(attr);
        _builder.append(_DefineType, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Generated methods for conversion to and from XML");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// data representations with  a Base64 encoded content.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// The methods are generated only for 1, 2 and 3 dimensional arrays");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// of data whose BasicType have a non null BaseWrapperName.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// In practice this represents data whose type is one of the basic numeric types");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// or is built upon a basic numeric type. ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      List<ASDMAttribute> _BasicType_1 = this.container.BasicType();
      for(final ASDMAttribute attr_1 : _BasicType_1) {
        _builder.append("\t");
        CharSequence _DefineTypeBase64 = this.DefineTypeBase64(attr_1);
        _builder.append(_DefineTypeBase64, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("private:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string str;\t\t// The string being parsed.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string::size_type pos;\t\t// The current position in the string.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string::size_type beg;\t\t// The beginning and end of a fragement");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("string::size_type end;\t\t//    in the string.");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static string substring(const string &s, int a, int b);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static string trim(const string &s);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}; // End class Parser");
    _builder.newLine();
    _builder.newLine();
    _builder.append("inline Parser::Parser(const string &s) : str(s), pos(0), beg(0), end(0) {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("inline bool Parser::isStr(const string &s) const {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return str.find(s,pos) == string::npos ? false : true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("} // End namespace asdm");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#endif /* Parser_CLASS */");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence DefineType(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("// Field type: ");
    String _CppType = attr.CppType();
    _builder.append(_CppType, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static void toXML(");
    String _CppType_1 = attr.CppType();
    _builder.append(_CppType_1, "\t");
    _builder.append(" data, const string &name, string &buf);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static void toXML(vector<");
    String _CppType_2 = attr.CppType();
    _builder.append(_CppType_2, "\t");
    _builder.append("> data, const string &name, string &buf);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static void toXML(vector< vector<");
    String _CppType_3 = attr.CppType();
    _builder.append(_CppType_3, "\t");
    _builder.append("> > data, const string &name, string &buf);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static void toXML(vector< vector< vector<");
    String _CppType_4 = attr.CppType();
    _builder.append(_CppType_4, "\t");
    _builder.append("> > > data, const string &name, string &buf);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static void toXML(vector<vector< vector< vector<");
    String _CppType_5 = attr.CppType();
    _builder.append(_CppType_5, "\t");
    _builder.append("> > > >data, const string &name, string &buf);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _or = false;
      String _CppType_6 = attr.CppType();
      boolean _equals = _CppType_6.equals("int");
      if (_equals) {
        _or = true;
      } else {
        String _CppType_7 = attr.CppType();
        boolean _equals_1 = _CppType_7.equals("Tag");
        _or = _equals_1;
      }
      if (_or) {
        _builder.append("\t");
        _builder.append("static void toXML(set < ");
        String _CppType_8 = attr.CppType();
        _builder.append(_CppType_8, "\t");
        _builder.append(" > data, const string &name, string &buf);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _isStringType = attr.isStringType();
      boolean _not = (!_isStringType);
      if (_not) {
        _builder.append("\t");
        _builder.newLine();
        {
          boolean _or_1 = false;
          String _CppType_9 = attr.CppType();
          boolean _equals_2 = _CppType_9.equals("int");
          if (_equals_2) {
            _or_1 = true;
          } else {
            String _CppType_10 = attr.CppType();
            boolean _equals_3 = _CppType_10.equals("Tag");
            _or_1 = _equals_3;
          }
          if (_or_1) {
            _builder.append("\t");
            _builder.append("static set< ");
            String _CppType_11 = attr.CppType();
            _builder.append(_CppType_11, "\t");
            _builder.append(" >  get");
            String _TypeSet = attr.TypeSet();
            _builder.append(_TypeSet, "\t");
            _builder.append("(const string &name, const string &tableName, const string &xmlDoc);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("static ");
        String _CppType_12 = attr.CppType();
        _builder.append(_CppType_12, "\t");
        _builder.append(" get");
        String _WrapperType = attr.WrapperType();
        _builder.append(_WrapperType, "\t");
        _builder.append("(const string &name, const string &tableName, const string &xmlDoc) ;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// throw (ConversionException);");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("static vector<");
        String _CppType_13 = attr.CppType();
        _builder.append(_CppType_13, "\t");
        _builder.append("> get1D");
        String _WrapperType_1 = attr.WrapperType();
        _builder.append(_WrapperType_1, "\t");
        _builder.append("(const string &name, const string &tableName, const string &xmlDoc);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// throw (ConversionException);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("static vector< vector<");
        String _CppType_14 = attr.CppType();
        _builder.append(_CppType_14, "\t");
        _builder.append("> > get2D");
        String _WrapperType_2 = attr.WrapperType();
        _builder.append(_WrapperType_2, "\t");
        _builder.append("(const string &name, const string &tableName, const string &xmlDoc);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// throw (ConversionException);\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("static vector< vector< vector<");
        String _CppType_15 = attr.CppType();
        _builder.append(_CppType_15, "\t");
        _builder.append("> > > get3D");
        String _WrapperType_3 = attr.WrapperType();
        _builder.append(_WrapperType_3, "\t");
        _builder.append("(const string &name, const string &tableName, const string &xmlDoc);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// throw (ConversionException);\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("static vector<vector< vector< vector<");
        String _CppType_16 = attr.CppType();
        _builder.append(_CppType_16, "\t");
        _builder.append("> > > >get4D");
        String _WrapperType_4 = attr.WrapperType();
        _builder.append(_WrapperType_4, "\t");
        _builder.append("(const string &name, const string &tableName, const string &xmlDoc);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("// throw (ConversionException);\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence DefineTypeBase64(final ASDMAttribute attr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      String _DataOutputType = attr.DataOutputType();
      boolean _notEquals = (!Objects.equal(_DataOutputType, null));
      if (_notEquals) {
        _builder.append("static void toXMLBase64(vector<");
        String _CppType = attr.CppType();
        _builder.append(_CppType, "");
        _builder.append("> data, const string &name, string &buf);");
        _builder.newLineIfNotEmpty();
        _builder.append("static void toXMLBase64(vector< vector<");
        String _CppType_1 = attr.CppType();
        _builder.append(_CppType_1, "");
        _builder.append("> > data, const string &name, string &buf);");
        _builder.newLineIfNotEmpty();
        _builder.append("static void toXMLBase64(vector< vector< vector<");
        String _CppType_2 = attr.CppType();
        _builder.append(_CppType_2, "");
        _builder.append("> > > data, const string &name, string &buf);");
        _builder.newLineIfNotEmpty();
        _builder.append("static void toXMLBase64(vector< vector< vector< vector<");
        String _CppType_3 = attr.CppType();
        _builder.append(_CppType_3, "");
        _builder.append("> > > >data, const string &name, string &buf);");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.newLine();
        _builder.append("static vector<");
        String _CppType_4 = attr.CppType();
        _builder.append(_CppType_4, "");
        _builder.append(">& get1D");
        String _WrapperType = attr.WrapperType();
        _builder.append(_WrapperType, "");
        _builder.append("FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector<");
        String _CppType_5 = attr.CppType();
        _builder.append(_CppType_5, "");
        _builder.append(">& attribute);");
        _builder.newLineIfNotEmpty();
        _builder.append("// throw (ConversionException);");
        _builder.newLine();
        _builder.newLine();
        _builder.append(" ");
        _builder.newLine();
        _builder.append("static vector <vector<");
        String _CppType_6 = attr.CppType();
        _builder.append(_CppType_6, "");
        _builder.append("> >& get2D");
        String _WrapperType_1 = attr.WrapperType();
        _builder.append(_WrapperType_1, "");
        _builder.append("FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector<");
        String _CppType_7 = attr.CppType();
        _builder.append(_CppType_7, "");
        _builder.append("> >& attribute);");
        _builder.newLineIfNotEmpty();
        _builder.append("// throw (ConversionException);");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("static vector <vector <vector<");
        String _CppType_8 = attr.CppType();
        _builder.append(_CppType_8, "");
        _builder.append("> > >& get3D");
        String _WrapperType_2 = attr.WrapperType();
        _builder.append(_WrapperType_2, "");
        _builder.append("FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector <vector<");
        String _CppType_9 = attr.CppType();
        _builder.append(_CppType_9, "");
        _builder.append("> > >& attribute);");
        _builder.newLineIfNotEmpty();
        _builder.append("// throw (ConversionException);");
        _builder.newLine();
        _builder.newLine();
        _builder.newLine();
        _builder.append("static vector <vector <vector <vector<");
        String _CppType_10 = attr.CppType();
        _builder.append(_CppType_10, "");
        _builder.append("> > > >& get4D");
        String _WrapperType_3 = attr.WrapperType();
        _builder.append(_WrapperType_3, "");
        _builder.append("FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector <vector <vector<");
        String _CppType_11 = attr.CppType();
        _builder.append(_CppType_11, "");
        _builder.append("> > > >& attribute);");
        _builder.newLineIfNotEmpty();
        _builder.append("// throw (ConversionException);\t");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
