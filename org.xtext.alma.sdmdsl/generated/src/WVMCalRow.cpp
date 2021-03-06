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
 * File WVMCalRow.cpp
 */
 
#include <vector>
using std::vector;

#include <set>
using std::set;

#include <ASDM.h>
#include <WVMCalRow.h>
#include <WVMCalTable.h>
#include <AntennaTable.h>
#include <AntennaRow.h>
#include <SpectralWindowTable.h>
#include <SpectralWindowRow.h>
#include <AntennaTable.h>
#include <AntennaRow.h>

using asdm::ASDM;
using asdm::WVMCalRow;
using asdm::WVMCalTable;
using asdm::AntennaTable;
using asdm::AntennaRow;
using asdm::SpectralWindowTable;
using asdm::SpectralWindowRow;
using asdm::AntennaTable;
using asdm::AntennaRow;

#include <Parser.h>
using asdm::Parser;

#include <EnumerationParser.h>
#include <ASDMValuesParser.h>
 
#include <InvalidArgumentException.h>
using asdm::InvalidArgumentException;

namespace asdm {
	WVMCalRow::~WVMCalRow() {
	}

	/**
	 * Return the table to which this row belongs.
	 */
	WVMCalTable &WVMCalRow::getTable() const {
		return table;
	}

	bool WVMCalRow::isAdded() const {
		return hasBeenAdded;
	}	

	void WVMCalRow::isAdded(bool added) {
		hasBeenAdded = added;
	}
	
#ifndef WITHOUT_ACS
	using asdmIDL::WVMCalRowIDL;
#endif

#ifndef WITHOUT_ACS
	/**
	 * Return this row in the form of an IDL struct.
	 * @return The values of this row as a WVMCalRowIDL struct.
	 */
	WVMCalRowIDL *WVMCalRow::toIDL() const {
		WVMCalRowIDL *x = new WVMCalRowIDL ();
		
		// Fill the IDL structure.
	
	x->timeInterval = timeInterval.toIDLArrayTimeInterval();
	
	x->wvrMethod = wvrMethod;
	
	x->polyFreqLimits.length(polyFreqLimits.size());
	for (unsigned int i = 0; i < polyFreqLimits.size(); ++i) {
		x->polyFreqLimits[i] = polyFreqLimits.at(i).toIDLFrequency();
	}
	
	x->numInputAntenna = numInputAntenna;
	
	x->numChan = numChan;
	
	x->numPoly = numPoly;
	
	x->pathCoeff.length(pathCoeff.size());
	for (unsigned int i = 0; i < pathCoeff.size(); i++) {
		x->pathCoeff[i].length(pathCoeff.at(i).size());
		for (unsigned int j = 0; j < pathCoeff.at(i).size(); j++) {
			x->pathCoeff[i][j].length(pathCoeff.at(i).at(j).size());
		}					 		
	}
	
	for (unsigned int i = 0; i < pathCoeff.size() ; i++)
		for (unsigned int j = 0; j < pathCoeff.at(i).size(); j++)
			for (unsigned int k = 0; k < pathCoeff.at(i).at(j).size(); k++)
				x->pathCoeff[i][j][k] = pathCoeff.at(i).at(j).at(k);
	
	x->refTemp.length(refTemp.size());
	for (unsigned int i = 0; i < refTemp.size(); i++) {
		x->refTemp[i].length(refTemp.at(i).size());
	}
	
	for (unsigned int i = 0; i < refTemp.size() ; i++)
		for (unsigned int j = 0; j < refTemp.at(i).size(); j++)
			x->refTemp[i][j]= refTemp.at(i).at(j).toIDLTemperature();
	
	
	x->antennaId = antennaId.toIDLTag();
	
	
	x->inputAntennaId.length(inputAntennaId.size());
	for (unsigned int i = 0; i < inputAntennaId.size(); ++i) {
		x->inputAntennaId[i] = inputAntennaId.at(i).toIDLTag();
	}
	
	
	x->spectralWindowId = spectralWindowId.toIDLTag();
				
				
				
		
		return x;
	
	}
	
	void WVMCalRow::toIDL(asdmIDL::WVMCalRowIDL& x) const {
		// Set the x's fields.
	
	x.timeInterval = timeInterval.toIDLArrayTimeInterval();
	
	x.wvrMethod = wvrMethod;
	
	x.polyFreqLimits.length(polyFreqLimits.size());
	for (unsigned int i = 0; i < polyFreqLimits.size(); ++i) {
		x.polyFreqLimits[i] = polyFreqLimits.at(i).toIDLFrequency();
	}
	
	x.numInputAntenna = numInputAntenna;
	
	x.numChan = numChan;
	
	x.numPoly = numPoly;
	
	x.pathCoeff.length(pathCoeff.size());
	for (unsigned int i = 0; i < pathCoeff.size(); i++) {
		x.pathCoeff[i].length(pathCoeff.at(i).size());
		for (unsigned int j = 0; j < pathCoeff.at(i).size(); j++) {
			x.pathCoeff[i][j].length(pathCoeff.at(i).at(j).size());
		}					 		
	}
	
	for (unsigned int i = 0; i < pathCoeff.size() ; i++)
		for (unsigned int j = 0; j < pathCoeff.at(i).size(); j++)
			for (unsigned int k = 0; k < pathCoeff.at(i).at(j).size(); k++)
				x.pathCoeff[i][j][k] = pathCoeff.at(i).at(j).at(k);
	
	x.refTemp.length(refTemp.size());
	for (unsigned int i = 0; i < refTemp.size(); i++) {
		x.refTemp[i].length(refTemp.at(i).size());			 		
	}
	
	for (unsigned int i = 0; i < refTemp.size() ; i++)
		for (unsigned int j = 0; j < refTemp.at(i).size(); j++)
				x.refTemp[i][j]= refTemp.at(i).at(j).toIDLTemperature();
	
	
	
	x.antennaId = antennaId.toIDLTag();
	
	
	x.inputAntennaId.length(inputAntennaId.size());
	for (unsigned int i = 0; i < inputAntennaId.size(); ++i) {
		x.inputAntennaId[i] = inputAntennaId.at(i).toIDLTag();
	}
	
	
	x.spectralWindowId = spectralWindowId.toIDLTag();
				
				
				
	
	}
#endif

#ifndef WITHOUT_ACS
	/**
	 * Fill the values of this row from the IDL struct WVMCalRowIDL.
	 * @param x The IDL struct containing the values used to fill this row.
	 */
	void WVMCalRow::setFromIDL (WVMCalRowIDL x){
		try {
		// Fill the values from x.
	setTimeInterval(x.timeInterval);
	setWvrMethod(x.wvrMethod);
	polyFreqLimits .clear();
	for (unsigned int i = 0; i <x.polyFreqLimits.length(); ++i) {
		polyFreqLimits.push_back(x.polyFreqLimits[i]);
	}
	setNumInputAntenna(x.numInputAntenna);
	setNumChan(x.numChan);
	setNumPoly(x.numPoly);
	pathCoeff .clear();
	vector< vector<float> > vv_aux_pathCoeff;
	vector<float> v_aux_pathCoeff;
	
	for (unsigned int i = 0; i < x.pathCoeff.length(); ++i) {
		vv_aux_pathCoeff.clear();
		for (unsigned int j = 0; j < x.pathCoeff[0].length(); ++j) {
			v_aux_pathCoeff.clear();
			for (unsigned int k = 0; k < x.pathCoeff[0][0].length(); ++k) {
				v_aux_pathCoeff.push_back(x.pathCoeff[i][j][k]);
	  		}
	  		vv_aux_pathCoeff.push_back(v_aux_pathCoeff);
		}
				  			pathCoeff.push_back(vv_aux_pathCoeff);
	}
	refTemp .clear();
	vector<Temperature> v_aux_refTemp;
	for (unsigned int i = 0; i < x.refTemp.length(); ++i) {
		v_aux_refTemp.clear();
		for (unsigned int j = 0; j < x.refTemp[0].length(); ++j) {
			v_aux_refTemp.push_back(x.refTemp[i][j]);
		}
				  			refTemp.push_back(v_aux_refTemp);
	}
	setAntennaId(x.antennaId);
	inputAntennaId .clear();
	for (unsigned int i = 0; i <x.inputAntennaId.length(); ++i) {
		inputAntennaId.push_back(x.inputAntennaId[i]);
	}
	setSpectralWindowId(x.spectralWindowId);
				
				
				
		} catch (IllegalAccessException err) {
			throw ConversionException (err.getMessage(),"WVMCal");
		}
	}
#endif

	/**
	 * Return this row in the form of an XML string.
	 * @return The values of this row as an XML string.
	 */
	string WVMCalRow::toXML() const {
		string buf;
		buf.append("<row> \n");
		
	Parser::toXML(timeInterval, "timeInterval", buf);
	buf.append(EnumerationParser::toXML("wvrMethod", wvrMethod));
	Parser::toXML(polyFreqLimits, "polyFreqLimits", buf);
	Parser::toXML(numInputAntenna, "numInputAntenna", buf);
	Parser::toXML(numChan, "numChan", buf);
	Parser::toXML(numPoly, "numPoly", buf);
	Parser::toXML(pathCoeff, "pathCoeff", buf);
	Parser::toXML(refTemp, "refTemp", buf);
	Parser::toXML(antennaId, "antennaId", buf);
	Parser::toXML(inputAntennaId, "inputAntennaId", buf);
	Parser::toXML(spectralWindowId, "spectralWindowId", buf);
				
				
				
		
		buf.append("</row>\n");
		return buf;
	}
	
	/**
	 * Fill the values of this row from an XML string 
	 * that was produced by the toXML() method.
	 * @param x The XML string being used to set the values of this row.
	 */
	void WVMCalRow::setFromXML (string rowDoc) {
		Parser row(rowDoc);
		string s = "";
		try {
	setTimeInterval(Parser::getArrayTimeInterval("timeInterval","WVMCal",rowDoc));
	
	wvrMethod = EnumerationParser::getWVRMethod("wvrMethod","WVMCal",rowDoc);
	
	setPolyFreqLimits(Parser::get1DFrequency("polyFreqLimits","WVMCal",rowDoc));
	setNumInputAntenna(Parser::getInteger("numInputAntenna","WVMCal",rowDoc));
	setNumChan(Parser::getInteger("numChan","WVMCal",rowDoc));
	setNumPoly(Parser::getInteger("numPoly","WVMCal",rowDoc));
	setPathCoeff(Parser::get3DFloat("pathCoeff","WVMCal",rowDoc));
	setRefTemp(Parser::get2DTemperature("refTemp","WVMCal",rowDoc));
	setAntennaId(Parser::getTag("antennaId","WVMCal",rowDoc));
	setInputAntennaId(Parser::get1DTag("inputAntennaId","WVMCal",rowDoc));
	setSpectralWindowId(Parser::getTag("spectralWindowId","WVMCal",rowDoc));
				
				
				
		} catch (IllegalAccessException err) {
			throw ConversionException (err.getMessage(),"WVMCal");
		}
	}
	
	void WVMCalRow::toBin(EndianOSStream& eoss) {
	
	
	antennaId.toBin(eoss);
	
	spectralWindowId.toBin(eoss);
	
	timeInterval.toBin(eoss);
	
	eoss.writeString(CWVRMethod::name(wvrMethod));
	/* eoss.writeInt(wvrMethod); */
	
	Frequency::toBin(polyFreqLimits, eoss);
	
	eoss.writeInt(numInputAntenna);
	
	eoss.writeInt(numChan);
	
	eoss.writeInt(numPoly);
	
	
	eoss.writeInt((int) pathCoeff.size());
	eoss.writeInt((int) pathCoeff.at(0).size());		
	eoss.writeInt((int) pathCoeff.at(0).at(0).size());
	for (unsigned int i = 0; i < pathCoeff.size(); i++) 
		for (unsigned int j = 0;  j < pathCoeff.at(0).size(); j++)
			for (unsigned int k = 0; k <  pathCoeff.at(0).at(0).size(); k++)	
			eoss.writeFloat(pathCoeff.at(i).at(j).at(k));
	
	Temperature::toBin(refTemp, eoss);
	
	Tag::toBin(inputAntennaId, eoss);

	
	}
	
	void WVMCalRow::antennaIdFromBin(EndianIStream& eis) {
			
		antennaId =  Tag::fromBin(eis);
	}
	void WVMCalRow::spectralWindowIdFromBin(EndianIStream& eis) {
			
		spectralWindowId =  Tag::fromBin(eis);
	}
	void WVMCalRow::timeIntervalFromBin(EndianIStream& eis) {
			
		timeInterval =  ArrayTimeInterval::fromBin(eis);
	}
	void WVMCalRow::wvrMethodFromBin(EndianIStream& eis) {
		
		wvrMethod = CWVRMethod::literal(eis.readString());
	}
	void WVMCalRow::polyFreqLimitsFromBin(EndianIStream& eis) {
			
		polyFreqLimits = Frequency::from1DBin(eis);	
	}
	void WVMCalRow::numInputAntennaFromBin(EndianIStream& eis) {
		
		numInputAntenna =  eis.readInt();
	}
	void WVMCalRow::numChanFromBin(EndianIStream& eis) {
		
		numChan =  eis.readInt();
	}
	void WVMCalRow::numPolyFromBin(EndianIStream& eis) {
		
		numPoly =  eis.readInt();
	}
	void WVMCalRow::pathCoeffFromBin(EndianIStream& eis) {
		
		pathCoeff.clear();
			
		unsigned int pathCoeffDim1 = eis.readInt();
		unsigned int pathCoeffDim2 = eis.readInt();
		unsigned int pathCoeffDim3 = eis.readInt();
		vector <vector<float> > pathCoeffAux2;
		vector <float> pathCoeffAux1;
		for (unsigned int i = 0; i < pathCoeffDim1; i++) {
			pathCoeffAux2.clear();
			for (unsigned int j = 0; j < pathCoeffDim2 ; j++) {
				pathCoeffAux1.clear();
				for (unsigned int k = 0; k < pathCoeffDim3; k++) {
					pathCoeffAux1.push_back(eis.readFloat());
				}
				pathCoeffAux2.push_back(pathCoeffAux1);
			}
			pathCoeff.push_back(pathCoeffAux2);
		}	
	}
	void WVMCalRow::refTempFromBin(EndianIStream& eis) {
			
		refTemp = Temperature::from2DBin(eis);		
	}
	void WVMCalRow::inputAntennaIdFromBin(EndianIStream& eis) {
			
		inputAntennaId = Tag::from1DBin(eis);	
	}

	WVMCalRow* WVMCalRow::fromBin(EndianIStream& eis, WVMCalTable& table, const vector<string>& attributesSeq) {
		WVMCalRow* row = new  WVMCalRow(table);
		
		map<string, WVMCalAttributeFromBin>::iterator iter ;
		for (unsigned int i = 0; i < attributesSeq.size(); i++) {
			iter = row->fromBinMethods.find(attributesSeq.at(i));
			if (iter != row->fromBinMethods.end()) {
				(row->*(row->fromBinMethods[ attributesSeq.at(i) ] ))(eis);			
			}
			else {
				BinaryAttributeReaderFunctor* functorP = table.getUnknownAttributeBinaryReader(attributesSeq.at(i));
				if (functorP)
					(*functorP)(eis);
				else
					throw ConversionException("There is not method to read an attribute '"+attributesSeq.at(i)+"'.", "WVMCalTable");
			}
				
		}				
		return row;
	}

	//
	// A collection of methods to set the value of the attributes from their textual value in the XML representation
	// of one row.
	//
	// Convert a string into an Tag 
	void WVMCalRow::antennaIdFromText(const string & s) {
		antennaId = ASDMValuesParser::parse<Tag>(s);
	}
	// Convert a string into an Tag 
	void WVMCalRow::spectralWindowIdFromText(const string & s) {
		spectralWindowId = ASDMValuesParser::parse<Tag>(s);
	}
	// Convert a string into an ArrayTimeInterval 
	void WVMCalRow::timeIntervalFromText(const string & s) {
		timeInterval = ASDMValuesParser::parse<ArrayTimeInterval>(s);
	}
	// Convert a string into an WVRMethod 
	void WVMCalRow::wvrMethodFromText(const string & s) {
		wvrMethod = ASDMValuesParser::parse<WVRMethod>(s);
	}
	// Convert a string into an Frequency 
	void WVMCalRow::polyFreqLimitsFromText(const string & s) {
		polyFreqLimits = ASDMValuesParser::parse1D<Frequency>(s);
	}
	// Convert a string into an Integer 
	void WVMCalRow::numInputAntennaFromText(const string & s) {
		numInputAntenna = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an Integer 
	void WVMCalRow::numChanFromText(const string & s) {
		numChan = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an Integer 
	void WVMCalRow::numPolyFromText(const string & s) {
		numPoly = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an Float 
	void WVMCalRow::pathCoeffFromText(const string & s) {
		pathCoeff = ASDMValuesParser::parse3D<float>(s);
	}
	// Convert a string into an Temperature 
	void WVMCalRow::refTempFromText(const string & s) {
		refTemp = ASDMValuesParser::parse2D<Temperature>(s);
	}
	// Convert a string into an Tag 
	void WVMCalRow::inputAntennaIdFromText(const string & s) {
		inputAntennaId = ASDMValuesParser::parse1D<Tag>(s);
	}
	
	void WVMCalRow::fromText(const std::string& attributeName, const std::string&  t) {
		map<string, WVMCalAttributeFromText>::iterator iter;
		if ((iter = fromTextMethods.find(attributeName)) == fromTextMethods.end())
			throw ConversionException("I do not know what to do with '"+attributeName+"' and its content '"+t+"' (while parsing an XML document)", "WVMCalTable");
		(this->*(iter->second))(t);
	}
	
	////////////////////////////////////////////////
	// Intrinsic Table Attributes getters/setters //
	////////////////////////////////////////////////
	
		/**
		 * Get timeInterval.
		 * @return timeInterval as ArrayTimeInterval
		 */
		 	ArrayTimeInterval WVMCalRow::getTimeInterval() const {
	  		return timeInterval;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set timeInterval with the specified ArrayTimeInterval.
	  	 * @param timeInterval The ArrayTimeInterval value to which timeInterval is to be set.
	  	 
	  		* @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.
	  	 */
	  	void WVMCalRow::setTimeInterval (ArrayTimeInterval timeInterval)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		throw IllegalAccessException("timeInterval", "WVMCal");
	  		}
	  		this->timeInterval = timeInterval;
	  	}
	 	
	
		/**
		 * Get wvrMethod.
		 * @return wvrMethod as WVRMethodMod::WVRMethod
		 */
		 	WVRMethodMod::WVRMethod WVMCalRow::getWvrMethod() const {
	  		return wvrMethod;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set wvrMethod with the specified WVRMethodMod::WVRMethod.
	  	 * @param wvrMethod The WVRMethodMod::WVRMethod value to which wvrMethod is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setWvrMethod (WVRMethodMod::WVRMethod wvrMethod)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->wvrMethod = wvrMethod;
	  	}
	 	
	
		/**
		 * Get polyFreqLimits.
		 * @return polyFreqLimits as vector<Frequency >
		 */
		 	vector<Frequency > WVMCalRow::getPolyFreqLimits() const {
	  		return polyFreqLimits;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set polyFreqLimits with the specified vector<Frequency >.
	  	 * @param polyFreqLimits The vector<Frequency > value to which polyFreqLimits is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setPolyFreqLimits (vector<Frequency > polyFreqLimits)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->polyFreqLimits = polyFreqLimits;
	  	}
	 	
	
		/**
		 * Get numInputAntenna.
		 * @return numInputAntenna as int
		 */
		 	int WVMCalRow::getNumInputAntenna() const {
	  		return numInputAntenna;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numInputAntenna with the specified int.
	  	 * @param numInputAntenna The int value to which numInputAntenna is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setNumInputAntenna (int numInputAntenna)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numInputAntenna = numInputAntenna;
	  	}
	 	
	
		/**
		 * Get numChan.
		 * @return numChan as int
		 */
		 	int WVMCalRow::getNumChan() const {
	  		return numChan;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numChan with the specified int.
	  	 * @param numChan The int value to which numChan is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setNumChan (int numChan)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numChan = numChan;
	  	}
	 	
	
		/**
		 * Get numPoly.
		 * @return numPoly as int
		 */
		 	int WVMCalRow::getNumPoly() const {
	  		return numPoly;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numPoly with the specified int.
	  	 * @param numPoly The int value to which numPoly is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setNumPoly (int numPoly)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numPoly = numPoly;
	  	}
	 	
	
		/**
		 * Get pathCoeff.
		 * @return pathCoeff as vector<vector<vector<float > > >
		 */
		 	vector<vector<vector<float > > > WVMCalRow::getPathCoeff() const {
	  		return pathCoeff;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set pathCoeff with the specified vector<vector<vector<float > > >.
	  	 * @param pathCoeff The vector<vector<vector<float > > > value to which pathCoeff is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setPathCoeff (vector<vector<vector<float > > > pathCoeff)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->pathCoeff = pathCoeff;
	  	}
	 	
	
		/**
		 * Get refTemp.
		 * @return refTemp as vector<vector<Temperature > >
		 */
		 	vector<vector<Temperature > > WVMCalRow::getRefTemp() const {
	  		return refTemp;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set refTemp with the specified vector<vector<Temperature > >.
	  	 * @param refTemp The vector<vector<Temperature > > value to which refTemp is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setRefTemp (vector<vector<Temperature > > refTemp)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->refTemp = refTemp;
	  	}
	 	
	
	///////////////////////////////////////////////
	// Extrinsic Table Attributes getters/setters//
	///////////////////////////////////////////////
	
		/**
		 * Get antennaId.
		 * @return antennaId as Tag
		 */
		 	Tag WVMCalRow::getAntennaId() const {
	  		return antennaId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set antennaId with the specified Tag.
	  	 * @param antennaId The Tag value to which antennaId is to be set.
	  	 
	  		* @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.
	  	 */
	  	void WVMCalRow::setAntennaId (Tag antennaId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		throw IllegalAccessException("antennaId", "WVMCal");
	  		}
	  		this->antennaId = antennaId;
	  	}
	 	
	
		/**
		 * Get inputAntennaId.
		 * @return inputAntennaId as vector<Tag> 
		 */
		 	vector<Tag>  WVMCalRow::getInputAntennaId() const {
	  		return inputAntennaId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set inputAntennaId with the specified vector<Tag> .
	  	 * @param inputAntennaId The vector<Tag>  value to which inputAntennaId is to be set.
	  	 
	  	 */
	  	void WVMCalRow::setInputAntennaId (vector<Tag>  inputAntennaId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->inputAntennaId = inputAntennaId;
	  	}
	 	
	
		/**
		 * Get spectralWindowId.
		 * @return spectralWindowId as Tag
		 */
		 	Tag WVMCalRow::getSpectralWindowId() const {
	  		return spectralWindowId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set spectralWindowId with the specified Tag.
	  	 * @param spectralWindowId The Tag value to which spectralWindowId is to be set.
	  	 
	  		* @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.
	  	 */
	  	void WVMCalRow::setSpectralWindowId (Tag spectralWindowId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		throw IllegalAccessException("spectralWindowId", "WVMCal");
	  		}
	  		this->spectralWindowId = spectralWindowId;
	  	}
	 	

	//////////////////////////////////////
	// Links Attributes getters/setters //
	//////////////////////////////////////
		
		
		


	/**
	 * Create a WVMCalRow.
	 * <p>
	 * This constructor is private because only the
	 * table can create rows.  All rows know the table
	 * to which they belong.
	 * @param table The table to which this row belongs.
	 */ 
	WVMCalRow::WVMCalRow (WVMCalTable &t) : table(t) {
		hasBeenAdded = false;
		
	
	
	
	// This attribute is scalar and has an enumeration type. Let's initialize it to some valid value (the 1st of the enumeration).		
	wvrMethod = CWVRMethod::from_int(0);
	
	
	fromBinMethods["antennaId"] = &WVMCalRow::antennaIdFromBin; 
	fromBinMethods["spectralWindowId"] = &WVMCalRow::spectralWindowIdFromBin; 
	fromBinMethods["timeInterval"] = &WVMCalRow::timeIntervalFromBin; 
	fromBinMethods["wvrMethod"] = &WVMCalRow::wvrMethodFromBin; 
	fromBinMethods["polyFreqLimits"] = &WVMCalRow::polyFreqLimitsFromBin; 
	fromBinMethods["numInputAntenna"] = &WVMCalRow::numInputAntennaFromBin; 
	fromBinMethods["numChan"] = &WVMCalRow::numChanFromBin; 
	fromBinMethods["numPoly"] = &WVMCalRow::numPolyFromBin; 
	fromBinMethods["pathCoeff"] = &WVMCalRow::pathCoeffFromBin; 
	fromBinMethods["refTemp"] = &WVMCalRow::refTempFromBin; 
	fromBinMethods["inputAntennaId"] = &WVMCalRow::inputAntennaIdFromBin; 
	
	
	
	fromTextMethods["antennaId"] = &WVMCalRow::antennaIdFromText;
	fromTextMethods["spectralWindowId"] = &WVMCalRow::spectralWindowIdFromText;
	fromTextMethods["timeInterval"] = &WVMCalRow::timeIntervalFromText;
	fromTextMethods["wvrMethod"] = &WVMCalRow::wvrMethodFromText;
	fromTextMethods["polyFreqLimits"] = &WVMCalRow::polyFreqLimitsFromText;
	fromTextMethods["numInputAntenna"] = &WVMCalRow::numInputAntennaFromText;
	fromTextMethods["numChan"] = &WVMCalRow::numChanFromText;
	fromTextMethods["numPoly"] = &WVMCalRow::numPolyFromText;
	fromTextMethods["pathCoeff"] = &WVMCalRow::pathCoeffFromText;
	fromTextMethods["refTemp"] = &WVMCalRow::refTempFromText;
	fromTextMethods["inputAntennaId"] = &WVMCalRow::inputAntennaIdFromText;

	}

	WVMCalRow::WVMCalRow (WVMCalTable &t, WVMCalRow &row) : table(t) {
		hasBeenAdded = false;
		
		if (&row == 0) {
	
		}
		else {
	
		antennaId = row.antennaId;
		spectralWindowId = row.spectralWindowId;
		timeInterval = row.timeInterval;
		
		
		wvrMethod = row.wvrMethod;
		polyFreqLimits = row.polyFreqLimits;
		numInputAntenna = row.numInputAntenna;
		numChan = row.numChan;
		numPoly = row.numPoly;
		pathCoeff = row.pathCoeff;
		refTemp = row.refTemp;
		inputAntennaId = row.inputAntennaId;
		
		
		}
		
		fromBinMethods["antennaId"] = &WVMCalRow::antennaIdFromBin; 
		fromBinMethods["spectralWindowId"] = &WVMCalRow::spectralWindowIdFromBin; 
		fromBinMethods["timeInterval"] = &WVMCalRow::timeIntervalFromBin; 
		fromBinMethods["wvrMethod"] = &WVMCalRow::wvrMethodFromBin; 
		fromBinMethods["polyFreqLimits"] = &WVMCalRow::polyFreqLimitsFromBin; 
		fromBinMethods["numInputAntenna"] = &WVMCalRow::numInputAntennaFromBin; 
		fromBinMethods["numChan"] = &WVMCalRow::numChanFromBin; 
		fromBinMethods["numPoly"] = &WVMCalRow::numPolyFromBin; 
		fromBinMethods["pathCoeff"] = &WVMCalRow::pathCoeffFromBin; 
		fromBinMethods["refTemp"] = &WVMCalRow::refTempFromBin; 
		fromBinMethods["inputAntennaId"] = &WVMCalRow::inputAntennaIdFromBin; 
	
	}
	
	
	bool WVMCalRow::compareNoAutoInc(Tag antennaId, Tag spectralWindowId, ArrayTimeInterval timeInterval, WVRMethodMod::WVRMethod wvrMethod, vector<Frequency > polyFreqLimits, int numInputAntenna, int numChan, int numPoly, vector<vector<vector<float > > > pathCoeff, vector<vector<Temperature > > refTemp, vector<Tag>  inputAntennaId) {
		bool result;
		result = true;
		result = result && (this->antennaId == antennaId);
			if (!result) return false;
		result = result && (this->spectralWindowId == spectralWindowId);
			if (!result) return false;
		result = result && (this->timeInterval.overlaps(timeInterval));
			if (!result) return false;
		result = result && (this->wvrMethod == wvrMethod);
			if (!result) return false;
		result = result && (this->polyFreqLimits == polyFreqLimits);
			if (!result) return false;
		result = result && (this->numInputAntenna == numInputAntenna);
			if (!result) return false;
		result = result && (this->numChan == numChan);
			if (!result) return false;
		result = result && (this->numPoly == numPoly);
			if (!result) return false;
		result = result && (this->pathCoeff == pathCoeff);
			if (!result) return false;
		result = result && (this->refTemp == refTemp);
			if (!result) return false;
		result = result && (this->inputAntennaId == inputAntennaId);
			if (!result) return false;
		return result;
	}	
	
	bool WVMCalRow::compareRequiredValue(WVRMethodMod::WVRMethod wvrMethod, vector<Frequency > polyFreqLimits, int numInputAntenna, int numChan, int numPoly, vector<vector<vector<float > > > pathCoeff, vector<vector<Temperature > > refTemp, vector<Tag>  inputAntennaId) {
		bool result;
		result = true;
		if (!(this->wvrMethod == wvrMethod)) return false;
		if (!(this->polyFreqLimits == polyFreqLimits)) return false;
		if (!(this->numInputAntenna == numInputAntenna)) return false;
		if (!(this->numChan == numChan)) return false;
		if (!(this->numPoly == numPoly)) return false;
		if (!(this->pathCoeff == pathCoeff)) return false;
		if (!(this->refTemp == refTemp)) return false;
		if (!(this->inputAntennaId == inputAntennaId)) return false;
		return result;
	}

	/**
	 * Return true if all required attributes of the value part are equal to their homologues
	 * in x and false otherwise.
	 *
* @param x a pointer on the WVMCalRow whose required attributes of the value part 
	 * will be compared with those of this.
	 * @return a boolean.
	 */
	bool WVMCalRow::equalByRequiredValue(WVMCalRow*  x ) {
		if (this->wvrMethod != x->wvrMethod) return false;
		if (this->polyFreqLimits != x->polyFreqLimits) return false;
		if (this->numInputAntenna != x->numInputAntenna) return false;
		if (this->numChan != x->numChan) return false;
		if (this->numPoly != x->numPoly) return false;
		if (this->pathCoeff != x->pathCoeff) return false;
		if (this->refTemp != x->refTemp) return false;
		if (this->inputAntennaId != x->inputAntennaId) return false;
		return true;
	}	
	
	/*
	 map<string, WVMCalAttributeFromBin> WVMCalRow::initFromBinMethods() {
		map<string, WVMCalAttributeFromBin> result;
		
		result["antennaId"] = &WVMCalRow::antennaIdFromBin;
		result["spectralWindowId"] = &WVMCalRow::spectralWindowIdFromBin;
		result["timeInterval"] = &WVMCalRow::timeIntervalFromBin;
		result["wvrMethod"] = &WVMCalRow::wvrMethodFromBin;
		result["polyFreqLimits"] = &WVMCalRow::polyFreqLimitsFromBin;
		result["numInputAntenna"] = &WVMCalRow::numInputAntennaFromBin;
		result["numChan"] = &WVMCalRow::numChanFromBin;
		result["numPoly"] = &WVMCalRow::numPolyFromBin;
		result["pathCoeff"] = &WVMCalRow::pathCoeffFromBin;
		result["refTemp"] = &WVMCalRow::refTempFromBin;
		result["inputAntennaId"] = &WVMCalRow::inputAntennaIdFromBin;
		
		
		return result;	
	}
	*/		



}// End namespace asdm
