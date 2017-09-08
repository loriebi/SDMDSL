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
 * File CDopplerTrackingMode.cpp
 */
  
#include <sstream>
#include <CDopplerTrackingMode.h>
#include <string>
	
using namespace std;
 	
 	
int CDopplerTrackingMode::version() {
	return DopplerTrackingModeMod::version;
}

string CDopplerTrackingMode::revision () {
	return DopplerTrackingModeMod::revision;
}
 	
 	
unsigned int CDopplerTrackingMode::size() {
	return 4;
}


const std::string& CDopplerTrackingMode::sNONE = "NONE";
const std::string& CDopplerTrackingMode::sCONTINUOUS = "CONTINUOUS";
const std::string& CDopplerTrackingMode::sSCAN_BASED = "SCAN_BASED";
const std::string& CDopplerTrackingMode::sSB_BASED = "SB_BASED";

const std::vector<std::string> CDopplerTrackingMode::names() {
	std::vector<std::string> enumSet;
	
	enumSet.insert(enumSet.end(), CDopplerTrackingMode::sNONE);
	
	enumSet.insert(enumSet.end(), CDopplerTrackingMode::sCONTINUOUS);
	
	enumSet.insert(enumSet.end(), CDopplerTrackingMode::sSCAN_BASED);
	
	enumSet.insert(enumSet.end(), CDopplerTrackingMode::sSB_BASED);
	
	
	return enumSet;
}

std::string CDopplerTrackingMode::name(const DopplerTrackingModeMod::DopplerTrackingMode& f) {
	
	switch (f) {
		
		case DopplerTrackingModeMod::NONE:
			return CDopplerTrackingMode::sNONE;
		
		case DopplerTrackingModeMod::CONTINUOUS:
			return CDopplerTrackingMode::sCONTINUOUS;
		
		case DopplerTrackingModeMod::SCAN_BASED:
			return CDopplerTrackingMode::sSCAN_BASED;
		
		case DopplerTrackingModeMod::SB_BASED:
			return CDopplerTrackingMode::sSB_BASED;
		
	
	}
	
	// Impossible siutation but....who knows with C++ enums
	throw badInt((int) f);
    
}


DopplerTrackingModeMod::DopplerTrackingMode CDopplerTrackingMode::newDopplerTrackingMode(const std::string& name) {
	
	if (name == CDopplerTrackingMode::sNONE){
		return DopplerTrackingModeMod::NONE;
	}
	
	if (name == CDopplerTrackingMode::sCONTINUOUS){
		return DopplerTrackingModeMod::CONTINUOUS;
	}
	
	if (name == CDopplerTrackingMode::sSCAN_BASED){
		return DopplerTrackingModeMod::SCAN_BASED;
	}
	
	if (name == CDopplerTrackingMode::sSB_BASED){
		return DopplerTrackingModeMod::SB_BASED;
	}
	
	
	throw badString(name);
}


DopplerTrackingModeMod::DopplerTrackingMode CDopplerTrackingMode::literal(const std::string& name) {
	if (name == CDopplerTrackingMode::sNONE){
		return DopplerTrackingModeMod::NONE;
	}
	
	if (name == CDopplerTrackingMode::sCONTINUOUS){
		return DopplerTrackingModeMod::CONTINUOUS;
	}
	
	if (name == CDopplerTrackingMode::sSCAN_BASED){
		return DopplerTrackingModeMod::SCAN_BASED;
	}
	
	if (name == CDopplerTrackingMode::sSB_BASED){
		return DopplerTrackingModeMod::SB_BASED;
	}
	
	
	throw badString(name);
}


DopplerTrackingModeMod::DopplerTrackingMode CDopplerTrackingMode::from_int(unsigned int i) {
	vector<string> names_ = names();
	if (i >= names_.size()) throw badInt(i);
	return newDopplerTrackingMode(names_.at(i));
}


string CDopplerTrackingMode::badString(const string& name) {
	return "'"+name+"' does not correspond to any literal in the enumeration 'DopplerTrackingMode'.";
}


string CDopplerTrackingMode::badInt(unsigned int i) {
	ostringstream oss ;
	oss << "'" << i << "' is out of range for the enumeration 'DopplerTrackingMode'.";
	return oss.str();
}



namespace DopplerTrackingModeMod {
	
	std::ostream & operator << ( std::ostream & out, const DopplerTrackingMode& value) {
		out << CDopplerTrackingMode::name(value);
		return out;
	}

	std::istream & operator >> ( std::istream & in , DopplerTrackingMode& value ) {
		in.clear();
		string s;
		in >> s;
		try {
			value = CDopplerTrackingMode::literal(s);
		}
		catch (string & m) {
			in.setstate(ios::failbit);
		}
		return in;
	}
}		

