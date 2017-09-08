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
 * File ConfigDescriptionRow.cpp
 */
 
#include <vector>
using std::vector;

#include <set>
using std::set;

#include <ASDM.h>
#include <ConfigDescriptionRow.h>
#include <ConfigDescriptionTable.h>
#include <AntennaTable.h>
#include <AntennaRow.h>
#include <FeedTable.h>
#include <FeedRow.h>
#include <SwitchCycleTable.h>
#include <SwitchCycleRow.h>
#include <DataDescriptionTable.h>
#include <DataDescriptionRow.h>
#include <ProcessorTable.h>
#include <ProcessorRow.h>

using asdm::ASDM;
using asdm::ConfigDescriptionRow;
using asdm::ConfigDescriptionTable;
using asdm::AntennaTable;
using asdm::AntennaRow;
using asdm::FeedTable;
using asdm::FeedRow;
using asdm::SwitchCycleTable;
using asdm::SwitchCycleRow;
using asdm::DataDescriptionTable;
using asdm::DataDescriptionRow;
using asdm::ProcessorTable;
using asdm::ProcessorRow;

#include <Parser.h>
using asdm::Parser;

#include <EnumerationParser.h>
#include <ASDMValuesParser.h>
 
#include <InvalidArgumentException.h>
using asdm::InvalidArgumentException;

namespace asdm {
	ConfigDescriptionRow::~ConfigDescriptionRow() {
	}

	/**
	 * Return the table to which this row belongs.
	 */
	ConfigDescriptionTable &ConfigDescriptionRow::getTable() const {
		return table;
	}

	bool ConfigDescriptionRow::isAdded() const {
		return hasBeenAdded;
	}	

	void ConfigDescriptionRow::isAdded(bool added) {
		hasBeenAdded = added;
	}
	
#ifndef WITHOUT_ACS
	using asdmIDL::ConfigDescriptionRowIDL;
#endif

#ifndef WITHOUT_ACS
	/**
	 * Return this row in the form of an IDL struct.
	 * @return The values of this row as a ConfigDescriptionRowIDL struct.
	 */
	ConfigDescriptionRowIDL *ConfigDescriptionRow::toIDL() const {
		ConfigDescriptionRowIDL *x = new ConfigDescriptionRowIDL ();
		
		// Fill the IDL structure.
	
	x->configDescriptionId = configDescriptionId.toIDLTag();
	
	x->numAntenna = numAntenna;
	
	x->numDataDescription = numDataDescription;
	
	x->numFeed = numFeed;
	
	x->correlationMode = correlationMode;
	
	x->numAtmPhaseCorrection = numAtmPhaseCorrection;
	
	x->atmPhaseCorrection.length(atmPhaseCorrection.size());
	for (unsigned int i = 0; i < atmPhaseCorrection.size(); ++i) {
		x->atmPhaseCorrection[i] = atmPhaseCorrection.at(i);
	}
	
	x->processorType = processorType;
	
	x->spectralType = spectralType;
	
	x->phasedArrayListExists = phasedArrayListExists;
	x->phasedArrayList.length(phasedArrayList.size());
	for (unsigned int i = 0; i < phasedArrayList.size(); ++i) {
		x->phasedArrayList[i] = phasedArrayList.at(i);
	}
	
	x->numAssocValuesExists = numAssocValuesExists;
	x->numAssocValues = numAssocValues;
	
	x->assocNatureExists = assocNatureExists;
	x->assocNature.length(assocNature.size());
	for (unsigned int i = 0; i < assocNature.size(); ++i) {
		x->assocNature[i] = assocNature.at(i);
	}
	
	
	x->antennaId.length(antennaId.size());
	for (unsigned int i = 0; i < antennaId.size(); ++i) {
		x->antennaId[i] = antennaId.at(i).toIDLTag();
	}
	
	
	x->assocConfigDescriptionIdExists = assocConfigDescriptionIdExists;
	
	x->assocConfigDescriptionId.length(assocConfigDescriptionId.size());
	for (unsigned int i = 0; i < assocConfigDescriptionId.size(); ++i) {
		x->assocConfigDescriptionId[i] = assocConfigDescriptionId.at(i).toIDLTag();
	}
	
	
	x->dataDescriptionId.length(dataDescriptionId.size());
	for (unsigned int i = 0; i < dataDescriptionId.size(); ++i) {
		x->dataDescriptionId[i] = dataDescriptionId.at(i).toIDLTag();
	}
	
	
	x->feedId.length(feedId.size());
	for (unsigned int i = 0; i < feedId.size(); ++i) {
		x->feedId[i] = feedId.at(i);
	}
	
	
	x->processorId = processorId.toIDLTag();
	
	
	x->switchCycleId.length(switchCycleId.size());
	for (unsigned int i = 0; i < switchCycleId.size(); ++i) {
		x->switchCycleId[i] = switchCycleId.at(i).toIDLTag();
	}
				
				
				
				
				
				
		
		return x;
	
	}
	
	void ConfigDescriptionRow::toIDL(asdmIDL::ConfigDescriptionRowIDL& x) const {
		// Set the x's fields.
	
	x.configDescriptionId = configDescriptionId.toIDLTag();
	
	x.numAntenna = numAntenna;
	
	x.numDataDescription = numDataDescription;
	
	x.numFeed = numFeed;
	
	x.correlationMode = correlationMode;
	
	x.numAtmPhaseCorrection = numAtmPhaseCorrection;
	
	x.atmPhaseCorrection.length(atmPhaseCorrection.size());
	for (unsigned int i = 0; i < atmPhaseCorrection.size(); ++i) {
		x.atmPhaseCorrection[i] = atmPhaseCorrection.at(i);
	}
	
	x.processorType = processorType;
	
	x.spectralType = spectralType;
	
	x.phasedArrayListExists = phasedArrayListExists;
	x.phasedArrayList.length(phasedArrayList.size());
	for (unsigned int i = 0; i < phasedArrayList.size(); ++i) {
		x.phasedArrayList[i] = phasedArrayList.at(i);
	}
	
	x.numAssocValuesExists = numAssocValuesExists;
	x.numAssocValues = numAssocValues;
	
	x.assocNatureExists = assocNatureExists;
	x.assocNature.length(assocNature.size());
	for (unsigned int i = 0; i < assocNature.size(); ++i) {
		x.assocNature[i] = assocNature.at(i);
	}
	
	
	x.antennaId.length(antennaId.size());
	for (unsigned int i = 0; i < antennaId.size(); ++i) {
		x.antennaId[i] = antennaId.at(i).toIDLTag();
	}
	
	
	x.assocConfigDescriptionIdExists = assocConfigDescriptionIdExists;
	
	x.assocConfigDescriptionId.length(assocConfigDescriptionId.size());
	for (unsigned int i = 0; i < assocConfigDescriptionId.size(); ++i) {
		x.assocConfigDescriptionId[i] = assocConfigDescriptionId.at(i).toIDLTag();
	}
	
	
	x.dataDescriptionId.length(dataDescriptionId.size());
	for (unsigned int i = 0; i < dataDescriptionId.size(); ++i) {
		x.dataDescriptionId[i] = dataDescriptionId.at(i).toIDLTag();
	}
	
	
	x.feedId.length(feedId.size());
	for (unsigned int i = 0; i < feedId.size(); ++i) {
		x.feedId[i] = feedId.at(i);
	}
	
	
	x.processorId = processorId.toIDLTag();
	
	
	x.switchCycleId.length(switchCycleId.size());
	for (unsigned int i = 0; i < switchCycleId.size(); ++i) {
		x.switchCycleId[i] = switchCycleId.at(i).toIDLTag();
	}
				
				
				
				
				
				
	
	}
#endif

#ifndef WITHOUT_ACS
	/**
	 * Fill the values of this row from the IDL struct ConfigDescriptionRowIDL.
	 * @param x The IDL struct containing the values used to fill this row.
	 */
	void ConfigDescriptionRow::setFromIDL (ConfigDescriptionRowIDL x){
		try {
		// Fill the values from x.
	setConfigDescriptionId(x.configDescriptionId);
	setNumAntenna(x.numAntenna);
	setNumDataDescription(x.numDataDescription);
	setNumFeed(x.numFeed);
	setCorrelationMode(x.correlationMode);
	setNumAtmPhaseCorrection(x.numAtmPhaseCorrection);
	atmPhaseCorrection .clear();
	for (unsigned int i = 0; i <x.atmPhaseCorrection.length(); ++i) {
		atmPhaseCorrection.push_back(x.atmPhaseCorrection[i]);
	}
	setProcessorType(x.processorType);
	setSpectralType(x.spectralType);
	phasedArrayListExists = x.phasedArrayListExists;
	if (x.phasedArrayListExists) {
	phasedArrayList .clear();
	for (unsigned int i = 0; i <x.phasedArrayList.length(); ++i) {
		phasedArrayList.push_back(x.phasedArrayList[i]);
	}
	}
	numAssocValuesExists = x.numAssocValuesExists;
	if (x.numAssocValuesExists) {
	setNumAssocValues(x.numAssocValues);
	}
	assocNatureExists = x.assocNatureExists;
	if (x.assocNatureExists) {
	assocNature .clear();
	for (unsigned int i = 0; i <x.assocNature.length(); ++i) {
		assocNature.push_back(x.assocNature[i]);
	}
	}
	antennaId .clear();
	for (unsigned int i = 0; i <x.antennaId.length(); ++i) {
		antennaId.push_back(x.antennaId[i]);
	}
	assocConfigDescriptionIdExists = x.assocConfigDescriptionIdExists;
	if (x.assocConfigDescriptionIdExists) {
	assocConfigDescriptionId .clear();
	for (unsigned int i = 0; i <x.assocConfigDescriptionId.length(); ++i) {
		assocConfigDescriptionId.push_back(x.assocConfigDescriptionId[i]);
	}
	}
	dataDescriptionId .clear();
	for (unsigned int i = 0; i <x.dataDescriptionId.length(); ++i) {
		dataDescriptionId.push_back(x.dataDescriptionId[i]);
	}
	feedId .clear();
	for (unsigned int i = 0; i <x.feedId.length(); ++i) {
		feedId.push_back(x.feedId[i]);
	}
	setProcessorId(x.processorId);
	switchCycleId .clear();
	for (unsigned int i = 0; i <x.switchCycleId.length(); ++i) {
		switchCycleId.push_back(x.switchCycleId[i]);
	}
				
				
				
				
				
				
		} catch (IllegalAccessException err) {
			throw ConversionException (err.getMessage(),"ConfigDescription");
		}
	}
#endif

	/**
	 * Return this row in the form of an XML string.
	 * @return The values of this row as an XML string.
	 */
	string ConfigDescriptionRow::toXML() const {
		string buf;
		buf.append("<row> \n");
		
	Parser::toXML(configDescriptionId, "configDescriptionId", buf);
	Parser::toXML(numAntenna, "numAntenna", buf);
	Parser::toXML(numDataDescription, "numDataDescription", buf);
	Parser::toXML(numFeed, "numFeed", buf);
	buf.append(EnumerationParser::toXML("correlationMode", correlationMode));
	Parser::toXML(numAtmPhaseCorrection, "numAtmPhaseCorrection", buf);
	buf.append(EnumerationParser::toXML("atmPhaseCorrection", atmPhaseCorrection));
	buf.append(EnumerationParser::toXML("processorType", processorType));
	buf.append(EnumerationParser::toXML("spectralType", spectralType));
	if (phasedArrayListExists) {
	Parser::toXML(phasedArrayList, "phasedArrayList", buf);
	}
	if (numAssocValuesExists) {
	Parser::toXML(numAssocValues, "numAssocValues", buf);
	}
	if (assocNatureExists) {
	buf.append(EnumerationParser::toXML("assocNature", assocNature));
	}
	Parser::toXML(antennaId, "antennaId", buf);
	if (assocConfigDescriptionIdExists) {
	Parser::toXML(assocConfigDescriptionId, "assocConfigDescriptionId", buf);
	}
	Parser::toXML(dataDescriptionId, "dataDescriptionId", buf);
	Parser::toXML(feedId, "feedId", buf);
	Parser::toXML(processorId, "processorId", buf);
	Parser::toXML(switchCycleId, "switchCycleId", buf);
				
				
				
				
				
				
		
		buf.append("</row>\n");
		return buf;
	}
	
	/**
	 * Fill the values of this row from an XML string 
	 * that was produced by the toXML() method.
	 * @param x The XML string being used to set the values of this row.
	 */
	void ConfigDescriptionRow::setFromXML (string rowDoc) {
		Parser row(rowDoc);
		string s = "";
		try {
	setConfigDescriptionId(Parser::getTag("configDescriptionId","ConfigDescription",rowDoc));
	setNumAntenna(Parser::getInteger("numAntenna","ConfigDescription",rowDoc));
	setNumDataDescription(Parser::getInteger("numDataDescription","ConfigDescription",rowDoc));
	setNumFeed(Parser::getInteger("numFeed","ConfigDescription",rowDoc));
	
	correlationMode = EnumerationParser::getCorrelationMode("correlationMode","ConfigDescription",rowDoc);
	
	setNumAtmPhaseCorrection(Parser::getInteger("numAtmPhaseCorrection","ConfigDescription",rowDoc));
	
	atmPhaseCorrection = EnumerationParser::getAtmPhaseCorrection1D("atmPhaseCorrection","ConfigDescription",rowDoc);
	
	
	processorType = EnumerationParser::getProcessorType("processorType","ConfigDescription",rowDoc);
	
	
	spectralType = EnumerationParser::getSpectralResolutionType("spectralType","ConfigDescription",rowDoc);
	
		if (row.isStr("<phasedArrayList>")) {
		setPhasedArrayList(Parser::get1DInteger("phasedArrayList","ConfigDescription",rowDoc));
	}
		if (row.isStr("<numAssocValues>")) {
		setNumAssocValues(Parser::getInteger("numAssocValues","ConfigDescription",rowDoc));
	}
	if (row.isStr("<assocNature>")) {
	
	assocNature = EnumerationParser::getSpectralResolutionType1D("assocNature","ConfigDescription",rowDoc);
	
	assocNatureExists = true;
	}
	setAntennaId(Parser::get1DTag("antennaId","ConfigDescription",rowDoc));
	if (row.isStr("<assocConfigDescriptionId>")) {
		  setAssocConfigDescriptionId(Parser::get1DTag("assocConfigDescriptionId","ConfigDescription",rowDoc)); 
	}
	setDataDescriptionId(Parser::get1DTag("dataDescriptionId","ConfigDescription",rowDoc));
	setFeedId(Parser::get1DInteger("feedId","ConfigDescription",rowDoc));
	setProcessorId(Parser::getTag("processorId","ConfigDescription",rowDoc));
	setSwitchCycleId(Parser::get1DTag("switchCycleId","ConfigDescription",rowDoc));
				
				
				
				
				
				
		} catch (IllegalAccessException err) {
			throw ConversionException (err.getMessage(),"ConfigDescription");
		}
	}
	
	void ConfigDescriptionRow::toBin(EndianOSStream& eoss) {
	
	
	configDescriptionId.toBin(eoss);
	
	eoss.writeInt(numAntenna);
	
	eoss.writeInt(numDataDescription);
	
	eoss.writeInt(numFeed);
	
	eoss.writeString(CCorrelationMode::name(correlationMode));
	/* eoss.writeInt(correlationMode); */
	
	eoss.writeInt(numAtmPhaseCorrection);
	
	
	eoss.writeInt((int) atmPhaseCorrection.size());
	for (unsigned int i = 0; i < atmPhaseCorrection.size(); i++)
	eoss.writeString(CAtmPhaseCorrection::name(atmPhaseCorrection.at(i)));
	/* eoss.writeInt(atmPhaseCorrection.at(i)); */
	
	
	eoss.writeString(CProcessorType::name(processorType));
	/* eoss.writeInt(processorType); */
	
	eoss.writeString(CSpectralResolutionType::name(spectralType));
	/* eoss.writeInt(spectralType); */
	
	Tag::toBin(antennaId, eoss);
	
	
	eoss.writeInt((int) feedId.size());
	for (unsigned int i = 0; i < feedId.size(); i++)
	eoss.writeInt(feedId.at(i));
	
	
	Tag::toBin(switchCycleId, eoss);
	
	Tag::toBin(dataDescriptionId, eoss);
	
	processorId.toBin(eoss);

	
	eoss.writeBoolean(phasedArrayListExists);
	if (phasedArrayListExists) {
		
		
		eoss.writeInt((int) phasedArrayList.size());
		for (unsigned int i = 0; i < phasedArrayList.size(); i++)
		eoss.writeInt(phasedArrayList.at(i));
		
	}
	eoss.writeBoolean(numAssocValuesExists);
	if (numAssocValuesExists) {
		
		eoss.writeInt(numAssocValues);
	}
	eoss.writeBoolean(assocNatureExists);
	if (assocNatureExists) {
		
		
		eoss.writeInt((int) assocNature.size());
		for (unsigned int i = 0; i < assocNature.size(); i++)
		eoss.writeString(CSpectralResolutionType::name(assocNature.at(i)));
		/* eoss.writeInt(assocNature.at(i)); */
		
	}
	eoss.writeBoolean(assocConfigDescriptionIdExists);
	if (assocConfigDescriptionIdExists) {
		
		Tag::toBin(assocConfigDescriptionId, eoss);
	}
	}
	
	void ConfigDescriptionRow::configDescriptionIdFromBin(EndianIStream& eis) {
			
		configDescriptionId =  Tag::fromBin(eis);
	}
	void ConfigDescriptionRow::numAntennaFromBin(EndianIStream& eis) {
		
		numAntenna =  eis.readInt();
	}
	void ConfigDescriptionRow::numDataDescriptionFromBin(EndianIStream& eis) {
		
		numDataDescription =  eis.readInt();
	}
	void ConfigDescriptionRow::numFeedFromBin(EndianIStream& eis) {
		
		numFeed =  eis.readInt();
	}
	void ConfigDescriptionRow::correlationModeFromBin(EndianIStream& eis) {
		
		correlationMode = CCorrelationMode::literal(eis.readString());
	}
	void ConfigDescriptionRow::numAtmPhaseCorrectionFromBin(EndianIStream& eis) {
		
		numAtmPhaseCorrection =  eis.readInt();
	}
	void ConfigDescriptionRow::atmPhaseCorrectionFromBin(EndianIStream& eis) {
		
		atmPhaseCorrection.clear();
		
		unsigned int atmPhaseCorrectionDim1 = eis.readInt();
		for (unsigned int  i = 0 ; i < atmPhaseCorrectionDim1; i++)
			atmPhaseCorrection.push_back(CAtmPhaseCorrection::literal(eis.readString()));
	}
	void ConfigDescriptionRow::processorTypeFromBin(EndianIStream& eis) {
		
		processorType = CProcessorType::literal(eis.readString());
	}
	void ConfigDescriptionRow::spectralTypeFromBin(EndianIStream& eis) {
		
		spectralType = CSpectralResolutionType::literal(eis.readString());
	}
	void ConfigDescriptionRow::antennaIdFromBin(EndianIStream& eis) {
			
		antennaId = Tag::from1DBin(eis);	
	}
	void ConfigDescriptionRow::feedIdFromBin(EndianIStream& eis) {
		
		feedId.clear();
		
		unsigned int feedIdDim1 = eis.readInt();
		for (unsigned int  i = 0 ; i < feedIdDim1; i++)
			feedId.push_back(eis.readInt());
	}
	void ConfigDescriptionRow::switchCycleIdFromBin(EndianIStream& eis) {
			
		switchCycleId = Tag::from1DBin(eis);	
	}
	void ConfigDescriptionRow::dataDescriptionIdFromBin(EndianIStream& eis) {
			
		dataDescriptionId = Tag::from1DBin(eis);	
	}
	void ConfigDescriptionRow::processorIdFromBin(EndianIStream& eis) {
			
		processorId =  Tag::fromBin(eis);
	}
	void ConfigDescriptionRow::phasedArrayListFromBin(EndianIStream& eis) {
		phasedArrayListExists = eis.readBoolean();
		if (phasedArrayListExists) {
			
			phasedArrayList.clear();
			
			unsigned int phasedArrayListDim1 = eis.readInt();
			for (unsigned int  i = 0 ; i < phasedArrayListDim1; i++)
				phasedArrayList.push_back(eis.readInt());
		}
	}
	void ConfigDescriptionRow::numAssocValuesFromBin(EndianIStream& eis) {
		numAssocValuesExists = eis.readBoolean();
		if (numAssocValuesExists) {
			
			numAssocValues =  eis.readInt();
		}
	}
	void ConfigDescriptionRow::assocNatureFromBin(EndianIStream& eis) {
		assocNatureExists = eis.readBoolean();
		if (assocNatureExists) {
			
			assocNature.clear();
			
			unsigned int assocNatureDim1 = eis.readInt();
			for (unsigned int  i = 0 ; i < assocNatureDim1; i++)
				assocNature.push_back(CSpectralResolutionType::literal(eis.readString()));
		}
	}
	void ConfigDescriptionRow::assocConfigDescriptionIdFromBin(EndianIStream& eis) {
		assocConfigDescriptionIdExists = eis.readBoolean();
		if (assocConfigDescriptionIdExists) {
				
			assocConfigDescriptionId = Tag::from1DBin(eis);	
		}
	}

	ConfigDescriptionRow* ConfigDescriptionRow::fromBin(EndianIStream& eis, ConfigDescriptionTable& table, const vector<string>& attributesSeq) {
		ConfigDescriptionRow* row = new  ConfigDescriptionRow(table);
		
		map<string, ConfigDescriptionAttributeFromBin>::iterator iter ;
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
					throw ConversionException("There is not method to read an attribute '"+attributesSeq.at(i)+"'.", "ConfigDescriptionTable");
			}
				
		}				
		return row;
	}

	//
	// A collection of methods to set the value of the attributes from their textual value in the XML representation
	// of one row.
	//
	// Convert a string into an Tag 
	void ConfigDescriptionRow::configDescriptionIdFromText(const string & s) {
		configDescriptionId = ASDMValuesParser::parse<Tag>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::numAntennaFromText(const string & s) {
		numAntenna = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::numDataDescriptionFromText(const string & s) {
		numDataDescription = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::numFeedFromText(const string & s) {
		numFeed = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an CorrelationMode 
	void ConfigDescriptionRow::correlationModeFromText(const string & s) {
		correlationMode = ASDMValuesParser::parse<CorrelationMode>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::numAtmPhaseCorrectionFromText(const string & s) {
		numAtmPhaseCorrection = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an AtmPhaseCorrection 
	void ConfigDescriptionRow::atmPhaseCorrectionFromText(const string & s) {
		atmPhaseCorrection = ASDMValuesParser::parse1D<AtmPhaseCorrection>(s);
	}
	// Convert a string into an ProcessorType 
	void ConfigDescriptionRow::processorTypeFromText(const string & s) {
		processorType = ASDMValuesParser::parse<ProcessorType>(s);
	}
	// Convert a string into an SpectralResolutionType 
	void ConfigDescriptionRow::spectralTypeFromText(const string & s) {
		spectralType = ASDMValuesParser::parse<SpectralResolutionType>(s);
	}
	// Convert a string into an Tag 
	void ConfigDescriptionRow::antennaIdFromText(const string & s) {
		antennaId = ASDMValuesParser::parse1D<Tag>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::feedIdFromText(const string & s) {
		feedId = ASDMValuesParser::parse1D<int>(s);
	}
	// Convert a string into an Tag 
	void ConfigDescriptionRow::switchCycleIdFromText(const string & s) {
		switchCycleId = ASDMValuesParser::parse1D<Tag>(s);
	}
	// Convert a string into an Tag 
	void ConfigDescriptionRow::dataDescriptionIdFromText(const string & s) {
		dataDescriptionId = ASDMValuesParser::parse1D<Tag>(s);
	}
	// Convert a string into an Tag 
	void ConfigDescriptionRow::processorIdFromText(const string & s) {
		processorId = ASDMValuesParser::parse<Tag>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::phasedArrayListFromText(const string & s) {
		phasedArrayListExists = true;
		phasedArrayList = ASDMValuesParser::parse1D<int>(s);
	}
	// Convert a string into an Integer 
	void ConfigDescriptionRow::numAssocValuesFromText(const string & s) {
		numAssocValuesExists = true;
		numAssocValues = ASDMValuesParser::parse<int>(s);
	}
	// Convert a string into an SpectralResolutionType 
	void ConfigDescriptionRow::assocNatureFromText(const string & s) {
		assocNatureExists = true;
		assocNature = ASDMValuesParser::parse1D<SpectralResolutionType>(s);
	}
	// Convert a string into an Tag 
	void ConfigDescriptionRow::assocConfigDescriptionIdFromText(const string & s) {
		assocConfigDescriptionIdExists = true;
		assocConfigDescriptionId = ASDMValuesParser::parse1D<Tag>(s);
	}
	
	void ConfigDescriptionRow::fromText(const std::string& attributeName, const std::string&  t) {
		map<string, ConfigDescriptionAttributeFromText>::iterator iter;
		if ((iter = fromTextMethods.find(attributeName)) == fromTextMethods.end())
			throw ConversionException("I do not know what to do with '"+attributeName+"' and its content '"+t+"' (while parsing an XML document)", "ConfigDescriptionTable");
		(this->*(iter->second))(t);
	}
	
	////////////////////////////////////////////////
	// Intrinsic Table Attributes getters/setters //
	////////////////////////////////////////////////
	
		/**
		 * Get configDescriptionId.
		 * @return configDescriptionId as Tag
		 */
		 	Tag ConfigDescriptionRow::getConfigDescriptionId() const {
	  		return configDescriptionId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set configDescriptionId with the specified Tag.
	  	 * @param configDescriptionId The Tag value to which configDescriptionId is to be set.
	  	 
	  		* @throw IllegalAccessException If an attempt is made to change this field after is has been added to the table.
	  	 */
	  	void ConfigDescriptionRow::setConfigDescriptionId (Tag configDescriptionId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		throw IllegalAccessException("configDescriptionId", "ConfigDescription");
	  		}
	  		this->configDescriptionId = configDescriptionId;
	  	}
	 	
	
		/**
		 * Get numAntenna.
		 * @return numAntenna as int
		 */
		 	int ConfigDescriptionRow::getNumAntenna() const {
	  		return numAntenna;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numAntenna with the specified int.
	  	 * @param numAntenna The int value to which numAntenna is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setNumAntenna (int numAntenna)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numAntenna = numAntenna;
	  	}
	 	
	
		/**
		 * Get numDataDescription.
		 * @return numDataDescription as int
		 */
		 	int ConfigDescriptionRow::getNumDataDescription() const {
	  		return numDataDescription;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numDataDescription with the specified int.
	  	 * @param numDataDescription The int value to which numDataDescription is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setNumDataDescription (int numDataDescription)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numDataDescription = numDataDescription;
	  	}
	 	
	
		/**
		 * Get numFeed.
		 * @return numFeed as int
		 */
		 	int ConfigDescriptionRow::getNumFeed() const {
	  		return numFeed;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numFeed with the specified int.
	  	 * @param numFeed The int value to which numFeed is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setNumFeed (int numFeed)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numFeed = numFeed;
	  	}
	 	
	
		/**
		 * Get correlationMode.
		 * @return correlationMode as CorrelationModeMod::CorrelationMode
		 */
		 	CorrelationModeMod::CorrelationMode ConfigDescriptionRow::getCorrelationMode() const {
	  		return correlationMode;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set correlationMode with the specified CorrelationModeMod::CorrelationMode.
	  	 * @param correlationMode The CorrelationModeMod::CorrelationMode value to which correlationMode is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setCorrelationMode (CorrelationModeMod::CorrelationMode correlationMode)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->correlationMode = correlationMode;
	  	}
	 	
	
		/**
		 * Get numAtmPhaseCorrection.
		 * @return numAtmPhaseCorrection as int
		 */
		 	int ConfigDescriptionRow::getNumAtmPhaseCorrection() const {
	  		return numAtmPhaseCorrection;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numAtmPhaseCorrection with the specified int.
	  	 * @param numAtmPhaseCorrection The int value to which numAtmPhaseCorrection is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setNumAtmPhaseCorrection (int numAtmPhaseCorrection)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->numAtmPhaseCorrection = numAtmPhaseCorrection;
	  	}
	 	
	
		/**
		 * Get atmPhaseCorrection.
		 * @return atmPhaseCorrection as vector<AtmPhaseCorrectionMod::AtmPhaseCorrection >
		 */
		 	vector<AtmPhaseCorrectionMod::AtmPhaseCorrection > ConfigDescriptionRow::getAtmPhaseCorrection() const {
	  		return atmPhaseCorrection;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set atmPhaseCorrection with the specified vector<AtmPhaseCorrectionMod::AtmPhaseCorrection >.
	  	 * @param atmPhaseCorrection The vector<AtmPhaseCorrectionMod::AtmPhaseCorrection > value to which atmPhaseCorrection is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setAtmPhaseCorrection (vector<AtmPhaseCorrectionMod::AtmPhaseCorrection > atmPhaseCorrection)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->atmPhaseCorrection = atmPhaseCorrection;
	  	}
	 	
	
		/**
		 * Get processorType.
		 * @return processorType as ProcessorTypeMod::ProcessorType
		 */
		 	ProcessorTypeMod::ProcessorType ConfigDescriptionRow::getProcessorType() const {
	  		return processorType;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set processorType with the specified ProcessorTypeMod::ProcessorType.
	  	 * @param processorType The ProcessorTypeMod::ProcessorType value to which processorType is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setProcessorType (ProcessorTypeMod::ProcessorType processorType)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->processorType = processorType;
	  	}
	 	
	
		/**
		 * Get spectralType.
		 * @return spectralType as SpectralResolutionTypeMod::SpectralResolutionType
		 */
		 	SpectralResolutionTypeMod::SpectralResolutionType ConfigDescriptionRow::getSpectralType() const {
	  		return spectralType;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set spectralType with the specified SpectralResolutionTypeMod::SpectralResolutionType.
	  	 * @param spectralType The SpectralResolutionTypeMod::SpectralResolutionType value to which spectralType is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setSpectralType (SpectralResolutionTypeMod::SpectralResolutionType spectralType)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->spectralType = spectralType;
	  	}
	 	
		/**
		 * The attribute phasedArrayList is optional. Return true if this attribute exists.
		 * @return true if and only if the phasedArrayList attribute exists. 
		 */
		bool ConfigDescriptionRow::isPhasedArrayListExists() const {
			return phasedArrayListExists;
		}
	
		/**
		 * Get phasedArrayList, which is optional.
		 * @return phasedArrayList as vector<int >
		 * @throw IllegalAccessException If phasedArrayList does not exist.
		 */
		 	vector<int > ConfigDescriptionRow::getPhasedArrayList() const  {
			if (!phasedArrayListExists) {
				throw IllegalAccessException("phasedArrayList", "ConfigDescription");
			}
	  		return phasedArrayList;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set phasedArrayList with the specified vector<int >.
	  	 * @param phasedArrayList The vector<int > value to which phasedArrayList is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setPhasedArrayList (vector<int > phasedArrayList) {
	  		this->phasedArrayList = phasedArrayList;
	 	phasedArrayListExists = true;
	  	}
	 	
	 	/**
	 	 * Mark phasedArrayList, which is an optional field, as non-existent.
	 	 */
	 	void ConfigDescriptionRow::clearPhasedArrayList () {
	 		phasedArrayListExists = false;
	 	}
		/**
		 * The attribute numAssocValues is optional. Return true if this attribute exists.
		 * @return true if and only if the numAssocValues attribute exists. 
		 */
		bool ConfigDescriptionRow::isNumAssocValuesExists() const {
			return numAssocValuesExists;
		}
	
		/**
		 * Get numAssocValues, which is optional.
		 * @return numAssocValues as int
		 * @throw IllegalAccessException If numAssocValues does not exist.
		 */
		 	int ConfigDescriptionRow::getNumAssocValues() const  {
			if (!numAssocValuesExists) {
				throw IllegalAccessException("numAssocValues", "ConfigDescription");
			}
	  		return numAssocValues;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set numAssocValues with the specified int.
	  	 * @param numAssocValues The int value to which numAssocValues is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setNumAssocValues (int numAssocValues) {
	  		this->numAssocValues = numAssocValues;
	 	numAssocValuesExists = true;
	  	}
	 	
	 	/**
	 	 * Mark numAssocValues, which is an optional field, as non-existent.
	 	 */
	 	void ConfigDescriptionRow::clearNumAssocValues () {
	 		numAssocValuesExists = false;
	 	}
		/**
		 * The attribute assocNature is optional. Return true if this attribute exists.
		 * @return true if and only if the assocNature attribute exists. 
		 */
		bool ConfigDescriptionRow::isAssocNatureExists() const {
			return assocNatureExists;
		}
	
		/**
		 * Get assocNature, which is optional.
		 * @return assocNature as vector<SpectralResolutionTypeMod::SpectralResolutionType >
		 * @throw IllegalAccessException If assocNature does not exist.
		 */
		 	vector<SpectralResolutionTypeMod::SpectralResolutionType > ConfigDescriptionRow::getAssocNature() const  {
			if (!assocNatureExists) {
				throw IllegalAccessException("assocNature", "ConfigDescription");
			}
	  		return assocNature;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set assocNature with the specified vector<SpectralResolutionTypeMod::SpectralResolutionType >.
	  	 * @param assocNature The vector<SpectralResolutionTypeMod::SpectralResolutionType > value to which assocNature is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setAssocNature (vector<SpectralResolutionTypeMod::SpectralResolutionType > assocNature) {
	  		this->assocNature = assocNature;
	 	assocNatureExists = true;
	  	}
	 	
	 	/**
	 	 * Mark assocNature, which is an optional field, as non-existent.
	 	 */
	 	void ConfigDescriptionRow::clearAssocNature () {
	 		assocNatureExists = false;
	 	}
	
	///////////////////////////////////////////////
	// Extrinsic Table Attributes getters/setters//
	///////////////////////////////////////////////
	
		/**
		 * Get antennaId.
		 * @return antennaId as vector<Tag> 
		 */
		 	vector<Tag>  ConfigDescriptionRow::getAntennaId() const {
	  		return antennaId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set antennaId with the specified vector<Tag> .
	  	 * @param antennaId The vector<Tag>  value to which antennaId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setAntennaId (vector<Tag>  antennaId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->antennaId = antennaId;
	  	}
	 	
		/**
		 * The attribute assocConfigDescriptionId is optional. Return true if this attribute exists.
		 * @return true if and only if the assocConfigDescriptionId attribute exists. 
		 */
		bool ConfigDescriptionRow::isAssocConfigDescriptionIdExists() const {
			return assocConfigDescriptionIdExists;
		}
	
		/**
		 * Get assocConfigDescriptionId, which is optional.
		 * @return assocConfigDescriptionId as vector<Tag> 
		 * @throw IllegalAccessException If assocConfigDescriptionId does not exist.
		 */
		 	vector<Tag>  ConfigDescriptionRow::getAssocConfigDescriptionId() const  {
			if (!assocConfigDescriptionIdExists) {
				throw IllegalAccessException("assocConfigDescriptionId", "ConfigDescription");
			}
	  		return assocConfigDescriptionId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set assocConfigDescriptionId with the specified vector<Tag> .
	  	 * @param assocConfigDescriptionId The vector<Tag>  value to which assocConfigDescriptionId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setAssocConfigDescriptionId (vector<Tag>  assocConfigDescriptionId) {
	  		this->assocConfigDescriptionId = assocConfigDescriptionId;
	 	assocConfigDescriptionIdExists = true;
	  	}
	 	
	 	/**
	 	 * Mark assocConfigDescriptionId, which is an optional field, as non-existent.
	 	 */
	 	void ConfigDescriptionRow::clearAssocConfigDescriptionId () {
	 		assocConfigDescriptionIdExists = false;
	 	}
	
		/**
		 * Get dataDescriptionId.
		 * @return dataDescriptionId as vector<Tag> 
		 */
		 	vector<Tag>  ConfigDescriptionRow::getDataDescriptionId() const {
	  		return dataDescriptionId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set dataDescriptionId with the specified vector<Tag> .
	  	 * @param dataDescriptionId The vector<Tag>  value to which dataDescriptionId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setDataDescriptionId (vector<Tag>  dataDescriptionId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->dataDescriptionId = dataDescriptionId;
	  	}
	 	
	
		/**
		 * Get feedId.
		 * @return feedId as vector<int> 
		 */
		 	vector<int>  ConfigDescriptionRow::getFeedId() const {
	  		return feedId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set feedId with the specified vector<int> .
	  	 * @param feedId The vector<int>  value to which feedId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setFeedId (vector<int>  feedId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->feedId = feedId;
	  	}
	 	
	
		/**
		 * Get processorId.
		 * @return processorId as Tag
		 */
		 	Tag ConfigDescriptionRow::getProcessorId() const {
	  		return processorId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set processorId with the specified Tag.
	  	 * @param processorId The Tag value to which processorId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setProcessorId (Tag processorId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->processorId = processorId;
	  	}
	 	
	
		/**
		 * Get switchCycleId.
		 * @return switchCycleId as vector<Tag> 
		 */
		 	vector<Tag>  ConfigDescriptionRow::getSwitchCycleId() const {
	  		return switchCycleId;
	 	}
	 	
	 	
	 	
		/**
	  	 * Set switchCycleId with the specified vector<Tag> .
	  	 * @param switchCycleId The vector<Tag>  value to which switchCycleId is to be set.
	  	 
	  	 */
	  	void ConfigDescriptionRow::setSwitchCycleId (vector<Tag>  switchCycleId)  {
	  		
	  		
	  		if (hasBeenAdded) {
	  		}
	  		this->switchCycleId = switchCycleId;
	  	}
	 	

	//////////////////////////////////////
	// Links Attributes getters/setters //
	//////////////////////////////////////
		
		
		
		
		
		


	/**
	 * Create a ConfigDescriptionRow.
	 * <p>
	 * This constructor is private because only the
	 * table can create rows.  All rows know the table
	 * to which they belong.
	 * @param table The table to which this row belongs.
	 */ 
	ConfigDescriptionRow::ConfigDescriptionRow (ConfigDescriptionTable &t) : table(t) {
		hasBeenAdded = false;
		
	phasedArrayListExists = false;
	numAssocValuesExists = false;
	assocNatureExists = false;
	assocConfigDescriptionIdExists = false;
	
	
	
	// This attribute is scalar and has an enumeration type. Let's initialize it to some valid value (the 1st of the enumeration).		
	correlationMode = CCorrelationMode::from_int(0);
	// This attribute is scalar and has an enumeration type. Let's initialize it to some valid value (the 1st of the enumeration).		
	processorType = CProcessorType::from_int(0);
	// This attribute is scalar and has an enumeration type. Let's initialize it to some valid value (the 1st of the enumeration).		
	spectralType = CSpectralResolutionType::from_int(0);
	
	
	fromBinMethods["configDescriptionId"] = &ConfigDescriptionRow::configDescriptionIdFromBin; 
	fromBinMethods["numAntenna"] = &ConfigDescriptionRow::numAntennaFromBin; 
	fromBinMethods["numDataDescription"] = &ConfigDescriptionRow::numDataDescriptionFromBin; 
	fromBinMethods["numFeed"] = &ConfigDescriptionRow::numFeedFromBin; 
	fromBinMethods["correlationMode"] = &ConfigDescriptionRow::correlationModeFromBin; 
	fromBinMethods["numAtmPhaseCorrection"] = &ConfigDescriptionRow::numAtmPhaseCorrectionFromBin; 
	fromBinMethods["atmPhaseCorrection"] = &ConfigDescriptionRow::atmPhaseCorrectionFromBin; 
	fromBinMethods["processorType"] = &ConfigDescriptionRow::processorTypeFromBin; 
	fromBinMethods["spectralType"] = &ConfigDescriptionRow::spectralTypeFromBin; 
	fromBinMethods["antennaId"] = &ConfigDescriptionRow::antennaIdFromBin; 
	fromBinMethods["feedId"] = &ConfigDescriptionRow::feedIdFromBin; 
	fromBinMethods["switchCycleId"] = &ConfigDescriptionRow::switchCycleIdFromBin; 
	fromBinMethods["dataDescriptionId"] = &ConfigDescriptionRow::dataDescriptionIdFromBin; 
	fromBinMethods["processorId"] = &ConfigDescriptionRow::processorIdFromBin; 
	
	fromBinMethods["phasedArrayList"] = &ConfigDescriptionRow::phasedArrayListFromBin; 
	fromBinMethods["numAssocValues"] = &ConfigDescriptionRow::numAssocValuesFromBin; 
	fromBinMethods["assocNature"] = &ConfigDescriptionRow::assocNatureFromBin; 
	fromBinMethods["assocConfigDescriptionId"] = &ConfigDescriptionRow::assocConfigDescriptionIdFromBin; 
	
	
	fromTextMethods["configDescriptionId"] = &ConfigDescriptionRow::configDescriptionIdFromText;
	fromTextMethods["numAntenna"] = &ConfigDescriptionRow::numAntennaFromText;
	fromTextMethods["numDataDescription"] = &ConfigDescriptionRow::numDataDescriptionFromText;
	fromTextMethods["numFeed"] = &ConfigDescriptionRow::numFeedFromText;
	fromTextMethods["correlationMode"] = &ConfigDescriptionRow::correlationModeFromText;
	fromTextMethods["numAtmPhaseCorrection"] = &ConfigDescriptionRow::numAtmPhaseCorrectionFromText;
	fromTextMethods["atmPhaseCorrection"] = &ConfigDescriptionRow::atmPhaseCorrectionFromText;
	fromTextMethods["processorType"] = &ConfigDescriptionRow::processorTypeFromText;
	fromTextMethods["spectralType"] = &ConfigDescriptionRow::spectralTypeFromText;
	fromTextMethods["antennaId"] = &ConfigDescriptionRow::antennaIdFromText;
	fromTextMethods["feedId"] = &ConfigDescriptionRow::feedIdFromText;
	fromTextMethods["switchCycleId"] = &ConfigDescriptionRow::switchCycleIdFromText;
	fromTextMethods["dataDescriptionId"] = &ConfigDescriptionRow::dataDescriptionIdFromText;
	fromTextMethods["processorId"] = &ConfigDescriptionRow::processorIdFromText;

	fromTextMethods["phasedArrayList"] = &ConfigDescriptionRow::phasedArrayListFromText;
	fromTextMethods["numAssocValues"] = &ConfigDescriptionRow::numAssocValuesFromText;
	fromTextMethods["assocNature"] = &ConfigDescriptionRow::assocNatureFromText;
	fromTextMethods["assocConfigDescriptionId"] = &ConfigDescriptionRow::assocConfigDescriptionIdFromText;
	}

	ConfigDescriptionRow::ConfigDescriptionRow (ConfigDescriptionTable &t, ConfigDescriptionRow &row) : table(t) {
		hasBeenAdded = false;
		
		if (&row == 0) {
	
	phasedArrayListExists = false;
	numAssocValuesExists = false;
	assocNatureExists = false;
	assocConfigDescriptionIdExists = false;
		}
		else {
	
		configDescriptionId = row.configDescriptionId;
		
		
		numAntenna = row.numAntenna;
		numDataDescription = row.numDataDescription;
		numFeed = row.numFeed;
		correlationMode = row.correlationMode;
		numAtmPhaseCorrection = row.numAtmPhaseCorrection;
		atmPhaseCorrection = row.atmPhaseCorrection;
		processorType = row.processorType;
		spectralType = row.spectralType;
		antennaId = row.antennaId;
		feedId = row.feedId;
		switchCycleId = row.switchCycleId;
		dataDescriptionId = row.dataDescriptionId;
		processorId = row.processorId;
		
		
		if (row.phasedArrayListExists) {
			phasedArrayList = row.phasedArrayList;		
			phasedArrayListExists = true;
		}
		else
			phasedArrayListExists = false;
		if (row.numAssocValuesExists) {
			numAssocValues = row.numAssocValues;		
			numAssocValuesExists = true;
		}
		else
			numAssocValuesExists = false;
		if (row.assocNatureExists) {
			assocNature = row.assocNature;		
			assocNatureExists = true;
		}
		else
			assocNatureExists = false;
		if (row.assocConfigDescriptionIdExists) {
			assocConfigDescriptionId = row.assocConfigDescriptionId;		
			assocConfigDescriptionIdExists = true;
		}
		else
			assocConfigDescriptionIdExists = false;
		}
		
		fromBinMethods["configDescriptionId"] = &ConfigDescriptionRow::configDescriptionIdFromBin; 
		fromBinMethods["numAntenna"] = &ConfigDescriptionRow::numAntennaFromBin; 
		fromBinMethods["numDataDescription"] = &ConfigDescriptionRow::numDataDescriptionFromBin; 
		fromBinMethods["numFeed"] = &ConfigDescriptionRow::numFeedFromBin; 
		fromBinMethods["correlationMode"] = &ConfigDescriptionRow::correlationModeFromBin; 
		fromBinMethods["numAtmPhaseCorrection"] = &ConfigDescriptionRow::numAtmPhaseCorrectionFromBin; 
		fromBinMethods["atmPhaseCorrection"] = &ConfigDescriptionRow::atmPhaseCorrectionFromBin; 
		fromBinMethods["processorType"] = &ConfigDescriptionRow::processorTypeFromBin; 
		fromBinMethods["spectralType"] = &ConfigDescriptionRow::spectralTypeFromBin; 
		fromBinMethods["antennaId"] = &ConfigDescriptionRow::antennaIdFromBin; 
		fromBinMethods["feedId"] = &ConfigDescriptionRow::feedIdFromBin; 
		fromBinMethods["switchCycleId"] = &ConfigDescriptionRow::switchCycleIdFromBin; 
		fromBinMethods["dataDescriptionId"] = &ConfigDescriptionRow::dataDescriptionIdFromBin; 
		fromBinMethods["processorId"] = &ConfigDescriptionRow::processorIdFromBin; 
	
		fromBinMethods["phasedArrayList"] = &ConfigDescriptionRow::phasedArrayListFromBin; 
		fromBinMethods["numAssocValues"] = &ConfigDescriptionRow::numAssocValuesFromBin; 
		fromBinMethods["assocNature"] = &ConfigDescriptionRow::assocNatureFromBin; 
		fromBinMethods["assocConfigDescriptionId"] = &ConfigDescriptionRow::assocConfigDescriptionIdFromBin; 
	}
	
	
	bool ConfigDescriptionRow::compareNoAutoInc(int numAntenna, int numDataDescription, int numFeed, CorrelationModeMod::CorrelationMode correlationMode, int numAtmPhaseCorrection, vector<AtmPhaseCorrectionMod::AtmPhaseCorrection > atmPhaseCorrection, ProcessorTypeMod::ProcessorType processorType, SpectralResolutionTypeMod::SpectralResolutionType spectralType, vector<Tag>  antennaId, vector<int>  feedId, vector<Tag>  switchCycleId, vector<Tag>  dataDescriptionId, Tag processorId) {
		bool result;
		result = true;
		result = result && (this->numAntenna == numAntenna);
			if (!result) return false;
		result = result && (this->numDataDescription == numDataDescription);
			if (!result) return false;
		result = result && (this->numFeed == numFeed);
			if (!result) return false;
		result = result && (this->correlationMode == correlationMode);
			if (!result) return false;
		result = result && (this->numAtmPhaseCorrection == numAtmPhaseCorrection);
			if (!result) return false;
		result = result && (this->atmPhaseCorrection == atmPhaseCorrection);
			if (!result) return false;
		result = result && (this->processorType == processorType);
			if (!result) return false;
		result = result && (this->spectralType == spectralType);
			if (!result) return false;
		result = result && (this->antennaId == antennaId);
			if (!result) return false;
		result = result && (this->feedId == feedId);
			if (!result) return false;
		result = result && (this->switchCycleId == switchCycleId);
			if (!result) return false;
		result = result && (this->dataDescriptionId == dataDescriptionId);
			if (!result) return false;
		result = result && (this->processorId == processorId);
			if (!result) return false;
		return result;
	}	
	
	bool ConfigDescriptionRow::compareRequiredValue(int numAntenna, int numDataDescription, int numFeed, CorrelationModeMod::CorrelationMode correlationMode, int numAtmPhaseCorrection, vector<AtmPhaseCorrectionMod::AtmPhaseCorrection > atmPhaseCorrection, ProcessorTypeMod::ProcessorType processorType, SpectralResolutionTypeMod::SpectralResolutionType spectralType, vector<Tag>  antennaId, vector<int>  feedId, vector<Tag>  switchCycleId, vector<Tag>  dataDescriptionId, Tag processorId) {
		bool result;
		result = true;
		if (!(this->numAntenna == numAntenna)) return false;
		if (!(this->numDataDescription == numDataDescription)) return false;
		if (!(this->numFeed == numFeed)) return false;
		if (!(this->correlationMode == correlationMode)) return false;
		if (!(this->numAtmPhaseCorrection == numAtmPhaseCorrection)) return false;
		if (!(this->atmPhaseCorrection == atmPhaseCorrection)) return false;
		if (!(this->processorType == processorType)) return false;
		if (!(this->spectralType == spectralType)) return false;
		if (!(this->antennaId == antennaId)) return false;
		if (!(this->feedId == feedId)) return false;
		if (!(this->switchCycleId == switchCycleId)) return false;
		if (!(this->dataDescriptionId == dataDescriptionId)) return false;
		if (!(this->processorId == processorId)) return false;
		return result;
	}

	/**
	 * Return true if all required attributes of the value part are equal to their homologues
	 * in x and false otherwise.
	 *
* @param x a pointer on the ConfigDescriptionRow whose required attributes of the value part 
	 * will be compared with those of this.
	 * @return a boolean.
	 */
	bool ConfigDescriptionRow::equalByRequiredValue(ConfigDescriptionRow*  x ) {
		if (this->numAntenna != x->numAntenna) return false;
		if (this->numDataDescription != x->numDataDescription) return false;
		if (this->numFeed != x->numFeed) return false;
		if (this->correlationMode != x->correlationMode) return false;
		if (this->numAtmPhaseCorrection != x->numAtmPhaseCorrection) return false;
		if (this->atmPhaseCorrection != x->atmPhaseCorrection) return false;
		if (this->processorType != x->processorType) return false;
		if (this->spectralType != x->spectralType) return false;
		if (this->antennaId != x->antennaId) return false;
		if (this->feedId != x->feedId) return false;
		if (this->switchCycleId != x->switchCycleId) return false;
		if (this->dataDescriptionId != x->dataDescriptionId) return false;
		if (this->processorId != x->processorId) return false;
		return true;
	}	
	
	/*
	 map<string, ConfigDescriptionAttributeFromBin> ConfigDescriptionRow::initFromBinMethods() {
		map<string, ConfigDescriptionAttributeFromBin> result;
		
		result["configDescriptionId"] = &ConfigDescriptionRow::configDescriptionIdFromBin;
		result["numAntenna"] = &ConfigDescriptionRow::numAntennaFromBin;
		result["numDataDescription"] = &ConfigDescriptionRow::numDataDescriptionFromBin;
		result["numFeed"] = &ConfigDescriptionRow::numFeedFromBin;
		result["correlationMode"] = &ConfigDescriptionRow::correlationModeFromBin;
		result["numAtmPhaseCorrection"] = &ConfigDescriptionRow::numAtmPhaseCorrectionFromBin;
		result["atmPhaseCorrection"] = &ConfigDescriptionRow::atmPhaseCorrectionFromBin;
		result["processorType"] = &ConfigDescriptionRow::processorTypeFromBin;
		result["spectralType"] = &ConfigDescriptionRow::spectralTypeFromBin;
		result["antennaId"] = &ConfigDescriptionRow::antennaIdFromBin;
		result["feedId"] = &ConfigDescriptionRow::feedIdFromBin;
		result["switchCycleId"] = &ConfigDescriptionRow::switchCycleIdFromBin;
		result["dataDescriptionId"] = &ConfigDescriptionRow::dataDescriptionIdFromBin;
		result["processorId"] = &ConfigDescriptionRow::processorIdFromBin;
		
		result["phasedArrayList"] = &ConfigDescriptionRow::phasedArrayListFromBin;
		result["numAssocValues"] = &ConfigDescriptionRow::numAssocValuesFromBin;
		result["assocNature"] = &ConfigDescriptionRow::assocNatureFromBin;
		result["assocConfigDescriptionId"] = &ConfigDescriptionRow::assocConfigDescriptionIdFromBin;
		
		return result;	
	}
	*/		



}// End namespace asdm
