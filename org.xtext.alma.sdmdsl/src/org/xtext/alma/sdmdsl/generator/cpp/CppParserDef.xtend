package org.xtext.alma.sdmdsl.generator.cpp

import alma.hla.datamodel.meta.asdm.ASDMAttribute
import alma.hla.datamodel.meta.asdm.AlmaTableContainer
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.alma.sdmdsl.generator.sdmfilesystem.SDMFileSystemAccess

class CppParserDef {
	
	var container = AlmaTableContainer.getInstance();
	
	def doGenerate(IFileSystemAccess2 fsa,IGeneratorContext context){
		
		var sdmFsa = (fsa as SDMFileSystemAccess)
		
		// creating and generating file Parser.h
		sdmFsa.setFile("include/Parser.h")
		sdmFsa.generateFile(generateParserDef)
		
	}
	
	
	
	def generateParserDef()'''
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
		 * Warning!
		 *  -------------------------------------------------------------------- 
		 * | This is generated code!  Do not modify this file.                  |
		 * | If you do, all changes will be lost when the file is re-generated. |
		 *  --------------------------------------------------------------------
		 *
		 * File Parser.h
		 */
		#ifndef Parser_CLASS
		#define Parser_CLASS
		
		#include <stdint.h>
		#include <string>
		#include <vector>
		#include <set>
		
		using std::string;
		using std::vector;
		using std::set;
		
		#include <Angle.h>
		#include <AngularRate.h>
		#include <ArrayTime.h>
		#include <ArrayTimeInterval.h>
		#include <ComplexWrapper.h>
		#include <Entity.h>
		#include <EntityId.h>
		#include <EntityRef.h>
		#include <Flux.h>
		#include <Frequency.h>
		#include <Humidity.h>
		#include <Interval.h>
		#include <Length.h>
		#include <Pressure.h>
		#include <Speed.h>
		#include <Tag.h>
		#include <Temperature.h>
		 
		#include <StringTokenizer.h>
		#include <OutOfBoundsException.h>
		#include <LongWrapper.h>
		#include <ConversionException.h>
		
		using namespace std;
		using asdm::Angle;
		using asdm::AngularRate;
		using asdm::ArrayTime;
		using asdm::Complex;
		using asdm::Entity;
		using asdm::EntityId;
		using asdm::EntityRef;
		using asdm::Flux;
		using asdm::Frequency;
		using asdm::Humidity;
		using asdm::Interval;
		using asdm::Length;
		using asdm::Pressure;
		using asdm::Speed;
		using asdm::Tag;
		using asdm::Temperature;
		
		using asdm::StringTokenizer;
		using asdm::OutOfBoundsException;
		using asdm::Long;
		using asdm::ConversionException;
		
		namespace asdm {
		/**
		 * A Parser of for XML representation of ASDM datasets.
		 */
		class Parser {
		
		public:
		
			Parser(const string &s);
		
			/**
			 * Is s in the string being parsed?
			 */
			bool isStr(const string &) const;
		
			/**
			 * Get the portion of the string bounded by s1 and s2, inclusive.
			 * @param s1
			 * @param s2
			 * @return
			 */
			string getElement(const string &s1, const string &s2);
		
			/**
			 * Get the portion of the string bounded by s1 and s2, exclusive.
			 * @param s1
			 * @param s2
			 * @return
			 */
			string getElementContent(const string &s1, const string &s2);
		
			string getField(const string &field);
		
			static string getField(const string &xml, const string &field);
		
			// The follwing is a special case.
			static string getString(const string &name, const string &tableName, const string &xmlDoc) ;
			//  throw (ConversionException);
			static vector<string> get1DString(const string &name, const string &tableName, const string &xmlDoc) ;
			//	throw (ConversionException);
			static vector <vector<string> > get2DString(const string &name, const string &tableName, const string &xmlDoc) ;
			//	throw (ConversionException);
			static vector <vector <vector<string> > > get3DString(const string &name, const string &tableName, const string &xmlDoc);
			//	throw (ConversionException);
		
			// Generated methods for conversion to and from XML
			// data representations for all types, both primitive
			// and extended.  Also included are 1, 2, and 3 
			// dimensional arrays of these types.
			
			«FOR attr : container.BasicType»
				«DefineType(attr)»
			«ENDFOR»
			
			// Generated methods for conversion to and from XML
			// data representations with  a Base64 encoded content.
			// The methods are generated only for 1, 2 and 3 dimensional arrays
			// of data whose BasicType have a non null BaseWrapperName.
			// In practice this represents data whose type is one of the basic numeric types
			// or is built upon a basic numeric type. 
			
			«FOR attr : container.BasicType»
				«DefineTypeBase64(attr)»
			«ENDFOR»
			
		private:
			string str;		// The string being parsed.
			string::size_type pos;		// The current position in the string.
			string::size_type beg;		// The beginning and end of a fragement
			string::size_type end;		//    in the string.
			
		public:
			static string substring(const string &s, int a, int b);
			static string trim(const string &s);
		
		}; // End class Parser
		
		inline Parser::Parser(const string &s) : str(s), pos(0), beg(0), end(0) {
		}
		
		inline bool Parser::isStr(const string &s) const {
			return str.find(s,pos) == string::npos ? false : true;
		}
		
		} // End namespace asdm
		
		#endif /* Parser_CLASS */
	'''
	
	
	
	def DefineType(ASDMAttribute attr)'''
		// Field type: «attr.CppType»
	
		static void toXML(«attr.CppType» data, const string &name, string &buf);
	
		static void toXML(vector<«attr.CppType»> data, const string &name, string &buf);
	
		static void toXML(vector< vector<«attr.CppType»> > data, const string &name, string &buf);
		
		static void toXML(vector< vector< vector<«attr.CppType»> > > data, const string &name, string &buf);
		
		static void toXML(vector<vector< vector< vector<«attr.CppType»> > > >data, const string &name, string &buf);
		
		«/* For now we implement the toXML only for Tag and int sets */»
		«IF attr.CppType.equals("int") || attr.CppType.equals("Tag")»
			static void toXML(set < «attr.CppType» > data, const string &name, string &buf);
		«ENDIF»
		
		«IF !attr.isStringType»
			«/* For now we implement the get only for Tag and int sets */»
			«IF attr.CppType.equals("int") || attr.CppType.equals("Tag")»
				static set< «attr.CppType» >  get«attr.TypeSet»(const string &name, const string &tableName, const string &xmlDoc);
			«ENDIF»	
			«/* All the other get methods */»		
			static «attr.CppType» get«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc) ;
			// throw (ConversionException);
			
			static vector<«attr.CppType»> get1D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc);
			// throw (ConversionException);
				
			static vector< vector<«attr.CppType»> > get2D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc);
			// throw (ConversionException);	
			
			static vector< vector< vector<«attr.CppType»> > > get3D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc);
			// throw (ConversionException);	
			
			static vector<vector< vector< vector<«attr.CppType»> > > >get4D«attr.WrapperType»(const string &name, const string &tableName, const string &xmlDoc);
			// throw (ConversionException);	
		«ENDIF»
	'''
	
	
	def DefineTypeBase64(ASDMAttribute attr)'''
		«/* We consider only the types which have DataOutputType defined */»
		«IF attr.DataOutputType != null»
			static void toXMLBase64(vector<«attr.CppType»> data, const string &name, string &buf);
			static void toXMLBase64(vector< vector<«attr.CppType»> > data, const string &name, string &buf);
			static void toXMLBase64(vector< vector< vector<«attr.CppType»> > > data, const string &name, string &buf);
			static void toXMLBase64(vector< vector< vector< vector<«attr.CppType»> > > >data, const string &name, string &buf);
			
			«/* One dimension array decoding from Base64 */»
			static vector<«attr.CppType»>& get1D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector<«attr.CppType»>& attribute);
			// throw (ConversionException);
			
			 «/* Two dimensions array decoding from Base64 */»
			static vector <vector<«attr.CppType»> >& get2D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector<«attr.CppType»> >& attribute);
			// throw (ConversionException);
			
			«/* Three dimensions array decoding from Base64 */»
			static vector <vector <vector<«attr.CppType»> > >& get3D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector <vector<«attr.CppType»> > >& attribute);
			// throw (ConversionException);
			
			«/* Four dimensions array decoding from Base64 */»
			static vector <vector <vector <vector<«attr.CppType»> > > >& get4D«attr.WrapperType»FromBase64(const string &name, const string &tableName, const string &xmlDoc, vector <vector <vector <vector<«attr.CppType»> > > >& attribute);
			// throw (ConversionException);	
		«ENDIF»
	'''
	
}