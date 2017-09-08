#include "ASDMTables.h"
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
 * File ASDMTables.cpp
 */
#include <stdint.h>
ASDM_MAIN::ASDM_MAIN() {
	name_ = "ASDM_MAIN";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Main table";
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("configDescriptionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("timeSampling", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("interval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numIntegration", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("scanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("subscanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("dataSize", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("dataUID", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("stateId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
}

ASDM_MAIN::~ASDM_MAIN() {
}

const TableDesc& ASDM_MAIN::tableDesc() const {
  return tableDesc_;
}

#include "MainTable.h"
#include "MainRow.h"

using namespace TimeSamplingMod;

void ASDM_MAIN::fill(const ASDM& asdm) {
	vector<MainRow*> rows = asdm.getMain().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<String> configDescriptionId(*table_p_, "configDescriptionId");
	ScalarColumn<String> fieldId(*table_p_, "fieldId");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ScalarColumn<String> timeSampling(*table_p_, "timeSampling");
	ScalarColumn<double> interval(*table_p_, "interval");
	ScalarColumn<> numIntegration(*table_p_, "numIntegration");
	ScalarColumn<> scanNumber(*table_p_, "scanNumber");
	ScalarColumn<> subscanNumber(*table_p_, "subscanNumber");
	ScalarColumn<> dataSize(*table_p_, "dataSize");
	ScalarColumn<String> dataUID(*table_p_, "dataUID");
	ArrayColumn<String> stateId(*table_p_, "stateId");
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		configDescriptionId.put(rowIndex, rows.at(i)->getConfigDescriptionId().toString());
		fieldId.put(rowIndex, rows.at(i)->getFieldId().toString());
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		timeSampling.put(rowIndex, CTimeSampling::name(rows.at(i)->getTimeSampling()));
		interval.put(rowIndex, rows.at(i)->getInterval().get()/(1.0e9));
		numIntegration.put(rowIndex, rows.at(i)->getNumIntegration()null);
		scanNumber.put(rowIndex, rows.at(i)->getScanNumber()null);
		subscanNumber.put(rowIndex, rows.at(i)->getSubscanNumber()null);
		dataSize.put(rowIndex, rows.at(i)->getDataSize()null);
		dataUID.put(rowIndex, rows.at(i)->getDataUID().toString());
		stateId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getStateId()));
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		
		rowIndex++;		
	}
}


ASDM_ALMARADIOMETER::ASDM_ALMARADIOMETER() {
	name_ = "ASDM_ALMARADIOMETER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset AlmaRadiometer table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("almaRadiometerId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("spectralWindowId", "blabla"));
}

ASDM_ALMARADIOMETER::~ASDM_ALMARADIOMETER() {
}

const TableDesc& ASDM_ALMARADIOMETER::tableDesc() const {
  return tableDesc_;
}

#include "AlmaRadiometerTable.h"
#include "AlmaRadiometerRow.h"


void ASDM_ALMARADIOMETER::fill(const ASDM& asdm) {
	vector<AlmaRadiometerRow*> rows = asdm.getAlmaRadiometer().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> almaRadiometerId(*table_p_, "almaRadiometerId");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");  
	ArrayColumn<String> spectralWindowId(*table_p_, "spectralWindowId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		almaRadiometerId.put(rowIndex, rows.at(i)->getAlmaRadiometerId().toString());
		if (rows.at(i)->isNumAntennaExists())
			numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		if (rows.at(i)->isSpectralWindowIdExists())
			spectralWindowId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getSpectralWindowId()));
		
		rowIndex++;		
	}
}


ASDM_ANNOTATION::ASDM_ANNOTATION() {
	name_ = "ASDM_ANNOTATION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Annotation table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("annotationId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("issue", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("details", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseband", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("interval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("dValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("vdValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("vvdValues", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("llValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("vllValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("vvllValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaId", "blabla"));
}

ASDM_ANNOTATION::~ASDM_ANNOTATION() {
}

const TableDesc& ASDM_ANNOTATION::tableDesc() const {
  return tableDesc_;
}

#include "AnnotationTable.h"
#include "AnnotationRow.h"

using namespace BasebandNameMod;

void ASDM_ANNOTATION::fill(const ASDM& asdm) {
	vector<AnnotationRow*> rows = asdm.getAnnotation().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> annotationId(*table_p_, "annotationId");
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<String> issue(*table_p_, "issue");
	ScalarColumn<String> details(*table_p_, "details");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");  
	ArrayColumn<String> basebandName(*table_p_, "basebandName");  
	ScalarColumn<> numBaseband(*table_p_, "numBaseband");  
	ScalarColumn<double> interval(*table_p_, "interval");  
	ScalarColumn<> dValue(*table_p_, "dValue");  
	ArrayColumn<> vdValue(*table_p_, "vdValue");  
	ArrayColumn<> vvdValues(*table_p_, "vvdValues");  
	ScalarColumn<> llValue(*table_p_, "llValue");  
	ArrayColumn<> vllValue(*table_p_, "vllValue");  
	ArrayColumn<> vvllValue(*table_p_, "vvllValue");  
	ArrayColumn<String> antennaId(*table_p_, "antennaId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		annotationId.put(rowIndex, rows.at(i)->getAnnotationId().toString());
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		issue.put(rowIndex, rows.at(i)->getIssue());
		details.put(rowIndex, rows.at(i)->getDetails());
		if (rows.at(i)->isNumAntennaExists())
			numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		if (rows.at(i)->isBasebandNameExists())
			basebandName.put(rowIndex, enum2CASA1D<BasebandName,CBasebandName>(rows.at(i)->getBasebandName()));
		if (rows.at(i)->isNumBasebandExists())
			numBaseband.put(rowIndex, rows.at(i)->getNumBaseband()null);
		if (rows.at(i)->isIntervalExists())
			interval.put(rowIndex, rows.at(i)->getInterval().get()/(1.0e9));
		if (rows.at(i)->isDValueExists())
			dValue.put(rowIndex, rows.at(i)->getDValue()null);
		if (rows.at(i)->isVdValueExists())
			vdValue.put(rowIndex, null1D<double,null>(rows.at(i)->getVdValue()));
		if (rows.at(i)->isVvdValuesExists())
			vvdValues.put(rowIndex, null2D<double,null>(rows.at(i)->getVvdValues()));
		if (rows.at(i)->isLlValueExists())
			llValue.put(rowIndex, rows.at(i)->getLlValue()null);
		if (rows.at(i)->isVllValueExists())
			vllValue.put(rowIndex, null1D<int64_t,null>(rows.at(i)->getVllValue()));
		if (rows.at(i)->isVvllValueExists())
			vvllValue.put(rowIndex, null2D<int64_t,null>(rows.at(i)->getVvllValue()));
		if (rows.at(i)->isAntennaIdExists())
			antennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAntennaId()));
		
		rowIndex++;		
	}
}


ASDM_ANTENNA::ASDM_ANTENNA() {
	name_ = "ASDM_ANTENNA";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Antenna table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("name", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("dishDiameter", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("position", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("stationId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocAntennaId", "blabla"));
}

ASDM_ANTENNA::~ASDM_ANTENNA() {
}

const TableDesc& ASDM_ANTENNA::tableDesc() const {
  return tableDesc_;
}

#include "AntennaTable.h"
#include "AntennaRow.h"

using namespace AntennaMakeMod;
using namespace AntennaTypeMod;

void ASDM_ANTENNA::fill(const ASDM& asdm) {
	vector<AntennaRow*> rows = asdm.getAntenna().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> name(*table_p_, "name");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<String> antennaType(*table_p_, "antennaType");
	ScalarColumn<double> dishDiameter(*table_p_, "dishDiameter");
	ArrayColumn<double> position(*table_p_, "position");
	ArrayColumn<double> offset(*table_p_, "offset");
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<String> stationId(*table_p_, "stationId");
	ScalarColumn<String> assocAntennaId(*table_p_, "assocAntennaId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		name.put(rowIndex, rows.at(i)->getName());
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		antennaType.put(rowIndex, CAntennaType::name(rows.at(i)->getAntennaType()));
		dishDiameter.put(rowIndex, rows.at(i)->getDishDiameter().get());
		position.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPosition()));
		offset.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getOffset()));
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		stationId.put(rowIndex, rows.at(i)->getStationId().toString());
		if (rows.at(i)->isAssocAntennaIdExists())
			assocAntennaId.put(rowIndex, rows.at(i)->getAssocAntennaId().toString());
		
		rowIndex++;		
	}
}


ASDM_CALAMPLI::ASDM_CALAMPLI() {
	name_ = "ASDM_CALAMPLI";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalAmpli table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("apertureEfficiency", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("apertureEfficiencyError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("correctionValidity", "blabla"));
}

ASDM_CALAMPLI::~ASDM_CALAMPLI() {
}

const TableDesc& ASDM_CALAMPLI::tableDesc() const {
  return tableDesc_;
}

#include "CalAmpliTable.h"
#include "CalAmpliRow.h"

using namespace AtmPhaseCorrectionMod;
using namespace ReceiverBandMod;
using namespace BasebandNameMod;
using namespace PolarizationTypeMod;

void ASDM_CALAMPLI::fill(const ASDM& asdm) {
	vector<CalAmpliRow*> rows = asdm.getCalAmpli().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ArrayColumn<> apertureEfficiency(*table_p_, "apertureEfficiency");
	ArrayColumn<> apertureEfficiencyError(*table_p_, "apertureEfficiencyError");
	ScalarColumn<> correctionValidity(*table_p_, "correctionValidity");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		apertureEfficiency.put(rowIndex, null1D<float,null>(rows.at(i)->getApertureEfficiency()));
		apertureEfficiencyError.put(rowIndex, null1D<float,null>(rows.at(i)->getApertureEfficiencyError()));
		if (rows.at(i)->isCorrectionValidityExists())
			correctionValidity.put(rowIndex, rows.at(i)->getCorrectionValidity()null);
		
		rowIndex++;		
	}
}


ASDM_CALAPPPHASE::ASDM_CALAPPPHASE() {
	name_ = "ASDM_CALAPPPHASE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalAppPhase table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("scanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("adjustTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("adjustToken", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("phasingMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPhasedAntennas", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("phasedAntennas", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("refAntennaIndex", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("candRefAntennaIndex", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("phasePacking", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptors", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChannels", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPhaseValues", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseValues", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCompare", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numEfficiencies", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("compareArray", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("efficiencyIndices", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("efficiencies", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("quality", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("phasedSumAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("typeSupports", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSupports", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseSupports", "blabla"));
}

ASDM_CALAPPPHASE::~ASDM_CALAPPPHASE() {
}

const TableDesc& ASDM_CALAPPPHASE::tableDesc() const {
  return tableDesc_;
}

#include "CalAppPhaseTable.h"
#include "CalAppPhaseRow.h"

using namespace BasebandNameMod;

void ASDM_CALAPPPHASE::fill(const ASDM& asdm) {
	vector<CalAppPhaseRow*> rows = asdm.getCalAppPhase().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<> scanNumber(*table_p_, "scanNumber");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<double> adjustTime(*table_p_, "adjustTime");
	ScalarColumn<String> adjustToken(*table_p_, "adjustToken");
	ScalarColumn<String> phasingMode(*table_p_, "phasingMode");
	ScalarColumn<> numPhasedAntennas(*table_p_, "numPhasedAntennas");
	ArrayColumn<String> phasedAntennas(*table_p_, "phasedAntennas");
	ScalarColumn<> refAntennaIndex(*table_p_, "refAntennaIndex");
	ScalarColumn<> candRefAntennaIndex(*table_p_, "candRefAntennaIndex");
	ScalarColumn<String> phasePacking(*table_p_, "phasePacking");
	ScalarColumn<> numReceptors(*table_p_, "numReceptors");
	ScalarColumn<> numChannels(*table_p_, "numChannels");
	ScalarColumn<> numPhaseValues(*table_p_, "numPhaseValues");
	ArrayColumn<> phaseValues(*table_p_, "phaseValues");
	ScalarColumn<> numCompare(*table_p_, "numCompare");
	ScalarColumn<> numEfficiencies(*table_p_, "numEfficiencies");
	ArrayColumn<String> compareArray(*table_p_, "compareArray");
	ArrayColumn<> efficiencyIndices(*table_p_, "efficiencyIndices");
	ArrayColumn<> efficiencies(*table_p_, "efficiencies");
	ArrayColumn<> quality(*table_p_, "quality");
	ScalarColumn<String> phasedSumAntenna(*table_p_, "phasedSumAntenna");
	ScalarColumn<String> typeSupports(*table_p_, "typeSupports");  
	ScalarColumn<> numSupports(*table_p_, "numSupports");  
	ArrayColumn<> phaseSupports(*table_p_, "phaseSupports");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		scanNumber.put(rowIndex, rows.at(i)->getScanNumber()null);
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		adjustTime.put(rowIndex, rows.at(i)->getAdjustTime().get()/(1.0e9));
		adjustToken.put(rowIndex, rows.at(i)->getAdjustToken());
		phasingMode.put(rowIndex, rows.at(i)->getPhasingMode());
		numPhasedAntennas.put(rowIndex, rows.at(i)->getNumPhasedAntennas()null);
		phasedAntennas.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getPhasedAntennas()));
		refAntennaIndex.put(rowIndex, rows.at(i)->getRefAntennaIndex()null);
		candRefAntennaIndex.put(rowIndex, rows.at(i)->getCandRefAntennaIndex()null);
		phasePacking.put(rowIndex, rows.at(i)->getPhasePacking());
		numReceptors.put(rowIndex, rows.at(i)->getNumReceptors()null);
		numChannels.put(rowIndex, rows.at(i)->getNumChannels()null);
		numPhaseValues.put(rowIndex, rows.at(i)->getNumPhaseValues()null);
		phaseValues.put(rowIndex, null1D<float,null>(rows.at(i)->getPhaseValues()));
		numCompare.put(rowIndex, rows.at(i)->getNumCompare()null);
		numEfficiencies.put(rowIndex, rows.at(i)->getNumEfficiencies()null);
		compareArray.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCompareArray()));
		efficiencyIndices.put(rowIndex, null1D<int,null>(rows.at(i)->getEfficiencyIndices()));
		efficiencies.put(rowIndex, null2D<float,null>(rows.at(i)->getEfficiencies()));
		quality.put(rowIndex, null1D<float,null>(rows.at(i)->getQuality()));
		phasedSumAntenna.put(rowIndex, rows.at(i)->getPhasedSumAntenna());
		if (rows.at(i)->isTypeSupportsExists())
			typeSupports.put(rowIndex, rows.at(i)->getTypeSupports());
		if (rows.at(i)->isNumSupportsExists())
			numSupports.put(rowIndex, rows.at(i)->getNumSupports()null);
		if (rows.at(i)->isPhaseSupportsExists())
			phaseSupports.put(rowIndex, null1D<float,null>(rows.at(i)->getPhaseSupports()));
		
		rowIndex++;		
	}
}


ASDM_CALATMOSPHERE::ASDM_CALATMOSPHERE() {
	name_ = "ASDM_CALATMOSPHERE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalAtmosphere table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numFreq", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numLoad", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("forwardEffSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("groundPressure", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("groundRelHumidity", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencySpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("groundTemperature", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("powerSkySpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("powerLoadSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("syscalType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tAtmSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tRecSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tSysSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("tauSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tAtm", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tRec", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tSys", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("tau", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("water", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("waterError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("alphaSpectrum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("forwardEfficiency", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("forwardEfficiencyError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("sbGain", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("sbGainError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("sbGainSpectrum", "blabla"));
}

ASDM_CALATMOSPHERE::~ASDM_CALATMOSPHERE() {
}

const TableDesc& ASDM_CALATMOSPHERE::tableDesc() const {
  return tableDesc_;
}

#include "CalAtmosphereTable.h"
#include "CalAtmosphereRow.h"

using namespace ReceiverBandMod;
using namespace BasebandNameMod;
using namespace PolarizationTypeMod;
using namespace SyscalMethodMod;

void ASDM_CALATMOSPHERE::fill(const ASDM& asdm) {
	vector<CalAtmosphereRow*> rows = asdm.getCalAtmosphere().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<> numFreq(*table_p_, "numFreq");
	ScalarColumn<> numLoad(*table_p_, "numLoad");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> forwardEffSpectrum(*table_p_, "forwardEffSpectrum");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<double> groundPressure(*table_p_, "groundPressure");
	ScalarColumn<double> groundRelHumidity(*table_p_, "groundRelHumidity");
	ArrayColumn<double> frequencySpectrum(*table_p_, "frequencySpectrum");
	ScalarColumn<double> groundTemperature(*table_p_, "groundTemperature");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> powerSkySpectrum(*table_p_, "powerSkySpectrum");
	ArrayColumn<> powerLoadSpectrum(*table_p_, "powerLoadSpectrum");
	ScalarColumn<String> syscalType(*table_p_, "syscalType");
	ArrayColumn<double> tAtmSpectrum(*table_p_, "tAtmSpectrum");
	ArrayColumn<double> tRecSpectrum(*table_p_, "tRecSpectrum");
	ArrayColumn<double> tSysSpectrum(*table_p_, "tSysSpectrum");
	ArrayColumn<> tauSpectrum(*table_p_, "tauSpectrum");
	ArrayColumn<double> tAtm(*table_p_, "tAtm");
	ArrayColumn<double> tRec(*table_p_, "tRec");
	ArrayColumn<double> tSys(*table_p_, "tSys");
	ArrayColumn<> tau(*table_p_, "tau");
	ArrayColumn<double> water(*table_p_, "water");
	ArrayColumn<double> waterError(*table_p_, "waterError");
	ArrayColumn<> alphaSpectrum(*table_p_, "alphaSpectrum");  
	ArrayColumn<> forwardEfficiency(*table_p_, "forwardEfficiency");  
	ArrayColumn<> forwardEfficiencyError(*table_p_, "forwardEfficiencyError");  
	ArrayColumn<> sbGain(*table_p_, "sbGain");  
	ArrayColumn<> sbGainError(*table_p_, "sbGainError");  
	ArrayColumn<> sbGainSpectrum(*table_p_, "sbGainSpectrum");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		numFreq.put(rowIndex, rows.at(i)->getNumFreq()null);
		numLoad.put(rowIndex, rows.at(i)->getNumLoad()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		forwardEffSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getForwardEffSpectrum()));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		groundPressure.put(rowIndex, rows.at(i)->getGroundPressure().get());
		groundRelHumidity.put(rowIndex, rows.at(i)->getGroundRelHumidity().get());
		frequencySpectrum.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencySpectrum()));
		groundTemperature.put(rowIndex, rows.at(i)->getGroundTemperature().get());
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		powerSkySpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getPowerSkySpectrum()));
		powerLoadSpectrum.put(rowIndex, null3D<float,null>(rows.at(i)->getPowerLoadSpectrum()));
		syscalType.put(rowIndex, CSyscalMethod::name(rows.at(i)->getSyscalType()));
		tAtmSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTAtmSpectrum()));
		tRecSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTRecSpectrum()));
		tSysSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTSysSpectrum()));
		tauSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getTauSpectrum()));
		tAtm.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTAtm()));
		tRec.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTRec()));
		tSys.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTSys()));
		tau.put(rowIndex, null1D<float,null>(rows.at(i)->getTau()));
		water.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getWater()));
		waterError.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getWaterError()));
		if (rows.at(i)->isAlphaSpectrumExists())
			alphaSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getAlphaSpectrum()));
		if (rows.at(i)->isForwardEfficiencyExists())
			forwardEfficiency.put(rowIndex, null1D<float,null>(rows.at(i)->getForwardEfficiency()));
		if (rows.at(i)->isForwardEfficiencyErrorExists())
			forwardEfficiencyError.put(rowIndex, null1D<double,null>(rows.at(i)->getForwardEfficiencyError()));
		if (rows.at(i)->isSbGainExists())
			sbGain.put(rowIndex, null1D<float,null>(rows.at(i)->getSbGain()));
		if (rows.at(i)->isSbGainErrorExists())
			sbGainError.put(rowIndex, null1D<float,null>(rows.at(i)->getSbGainError()));
		if (rows.at(i)->isSbGainSpectrumExists())
			sbGainSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getSbGainSpectrum()));
		
		rowIndex++;		
	}
}


ASDM_CALBANDPASS::ASDM_CALBANDPASS() {
	name_ = "ASDM_CALBANDPASS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalBandpass table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sideband", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("typeCurve", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaNames", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("refAntennaName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("freqLimits", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("curve", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseline", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("rms", "blabla"));
}

ASDM_CALBANDPASS::~ASDM_CALBANDPASS() {
}

const TableDesc& ASDM_CALBANDPASS::tableDesc() const {
  return tableDesc_;
}

#include "CalBandpassTable.h"
#include "CalBandpassRow.h"

using namespace BasebandNameMod;
using namespace NetSidebandMod;
using namespace AtmPhaseCorrectionMod;
using namespace CalCurveTypeMod;
using namespace ReceiverBandMod;
using namespace PolarizationTypeMod;

void ASDM_CALBANDPASS::fill(const ASDM& asdm) {
	vector<CalBandpassRow*> rows = asdm.getCalBandpass().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> sideband(*table_p_, "sideband");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> typeCurve(*table_p_, "typeCurve");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> antennaNames(*table_p_, "antennaNames");
	ScalarColumn<String> refAntennaName(*table_p_, "refAntennaName");
	ArrayColumn<double> freqLimits(*table_p_, "freqLimits");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> curve(*table_p_, "curve");
	ArrayColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ScalarColumn<> numBaseline(*table_p_, "numBaseline");  
	ArrayColumn<> rms(*table_p_, "rms");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		sideband.put(rowIndex, CNetSideband::name(rows.at(i)->getSideband()));
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		typeCurve.put(rowIndex, CCalCurveType::name(rows.at(i)->getTypeCurve()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		antennaNames.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getAntennaNames()));
		refAntennaName.put(rowIndex, rows.at(i)->getRefAntennaName());
		freqLimits.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFreqLimits()));
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		curve.put(rowIndex, null3D<float,null>(rows.at(i)->getCurve()));
		reducedChiSquared.put(rowIndex, null1D<double,null>(rows.at(i)->getReducedChiSquared()));
		if (rows.at(i)->isNumBaselineExists())
			numBaseline.put(rowIndex, rows.at(i)->getNumBaseline()null);
		if (rows.at(i)->isRmsExists())
			rms.put(rowIndex, null2D<float,null>(rows.at(i)->getRms()));
		
		rowIndex++;		
	}
}


ASDM_CALCURVE::ASDM_CALCURVE() {
	name_ = "ASDM_CALCURVE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalCurve table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("typeCurve", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaNames", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("refAntennaName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("curve", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseline", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("rms", "blabla"));
}

ASDM_CALCURVE::~ASDM_CALCURVE() {
}

const TableDesc& ASDM_CALCURVE::tableDesc() const {
  return tableDesc_;
}

#include "CalCurveTable.h"
#include "CalCurveRow.h"

using namespace AtmPhaseCorrectionMod;
using namespace CalCurveTypeMod;
using namespace ReceiverBandMod;
using namespace PolarizationTypeMod;

void ASDM_CALCURVE::fill(const ASDM& asdm) {
	vector<CalCurveRow*> rows = asdm.getCalCurve().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> typeCurve(*table_p_, "typeCurve");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> antennaNames(*table_p_, "antennaNames");
	ScalarColumn<String> refAntennaName(*table_p_, "refAntennaName");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> curve(*table_p_, "curve");
	ArrayColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ScalarColumn<> numBaseline(*table_p_, "numBaseline");  
	ArrayColumn<> rms(*table_p_, "rms");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		typeCurve.put(rowIndex, CCalCurveType::name(rows.at(i)->getTypeCurve()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		antennaNames.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getAntennaNames()));
		refAntennaName.put(rowIndex, rows.at(i)->getRefAntennaName());
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		curve.put(rowIndex, null3D<float,null>(rows.at(i)->getCurve()));
		reducedChiSquared.put(rowIndex, null1D<double,null>(rows.at(i)->getReducedChiSquared()));
		if (rows.at(i)->isNumBaselineExists())
			numBaseline.put(rowIndex, rows.at(i)->getNumBaseline()null);
		if (rows.at(i)->isRmsExists())
			rms.put(rowIndex, null2D<float,null>(rows.at(i)->getRms()));
		
		rowIndex++;		
	}
}


ASDM_CALDATA::ASDM_CALDATA() {
	name_ = "ASDM_CALDATA";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalData table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startTimeObserved", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endTimeObserved", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numScan", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("scanSet", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocCalDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocCalNature", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("fieldName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("sourceName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("sourceCode", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("scanIntent", "blabla"));
}

ASDM_CALDATA::~ASDM_CALDATA() {
}

const TableDesc& ASDM_CALDATA::tableDesc() const {
  return tableDesc_;
}

#include "CalDataTable.h"
#include "CalDataRow.h"

using namespace CalDataOriginMod;
using namespace CalTypeMod;
using namespace AssociatedCalNatureMod;
using namespace ScanIntentMod;

void ASDM_CALDATA::fill(const ASDM& asdm) {
	vector<CalDataRow*> rows = asdm.getCalData().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<double> startTimeObserved(*table_p_, "startTimeObserved");
	ScalarColumn<double> endTimeObserved(*table_p_, "endTimeObserved");
	ScalarColumn<String> execBlockUID(*table_p_, "execBlockUID");
	ScalarColumn<String> calDataType(*table_p_, "calDataType");
	ScalarColumn<String> calType(*table_p_, "calType");
	ScalarColumn<> numScan(*table_p_, "numScan");
	ArrayColumn<> scanSet(*table_p_, "scanSet");
	ScalarColumn<String> assocCalDataId(*table_p_, "assocCalDataId");  
	ScalarColumn<String> assocCalNature(*table_p_, "assocCalNature");  
	ArrayColumn<String> fieldName(*table_p_, "fieldName");  
	ArrayColumn<String> sourceName(*table_p_, "sourceName");  
	ArrayColumn<String> sourceCode(*table_p_, "sourceCode");  
	ArrayColumn<String> scanIntent(*table_p_, "scanIntent");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		startTimeObserved.put(rowIndex, rows.at(i)->getStartTimeObserved().get()/(1.0e9));
		endTimeObserved.put(rowIndex, rows.at(i)->getEndTimeObserved().get()/(1.0e9));
		execBlockUID.put(rowIndex, rows.at(i)->getExecBlockUID().toString());
		calDataType.put(rowIndex, CCalDataOrigin::name(rows.at(i)->getCalDataType()));
		calType.put(rowIndex, CCalType::name(rows.at(i)->getCalType()));
		numScan.put(rowIndex, rows.at(i)->getNumScan()null);
		scanSet.put(rowIndex, null1D<int,null>(rows.at(i)->getScanSet()));
		if (rows.at(i)->isAssocCalDataIdExists())
			assocCalDataId.put(rowIndex, rows.at(i)->getAssocCalDataId().toString());
		if (rows.at(i)->isAssocCalNatureExists())
			assocCalNature.put(rowIndex, CAssociatedCalNature::name(rows.at(i)->getAssocCalNature()));
		if (rows.at(i)->isFieldNameExists())
			fieldName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getFieldName()));
		if (rows.at(i)->isSourceNameExists())
			sourceName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getSourceName()));
		if (rows.at(i)->isSourceCodeExists())
			sourceCode.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getSourceCode()));
		if (rows.at(i)->isScanIntentExists())
			scanIntent.put(rowIndex, enum2CASA1D<ScanIntent,CScanIntent>(rows.at(i)->getScanIntent()));
		
		rowIndex++;		
	}
}


ASDM_CALDELAY::ASDM_CALDELAY() {
	name_ = "ASDM_CALDELAY";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalDelay table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("refAntennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("delayError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("delayOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("appliedDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("crossDelayOffset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("crossDelayOffsetError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSideband", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("refFreq", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("refFreqPhase", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("sidebands", "blabla"));
}

ASDM_CALDELAY::~ASDM_CALDELAY() {
}

const TableDesc& ASDM_CALDELAY::tableDesc() const {
  return tableDesc_;
}

#include "CalDelayTable.h"
#include "CalDelayRow.h"

using namespace AtmPhaseCorrectionMod;
using namespace BasebandNameMod;
using namespace ReceiverBandMod;
using namespace PolarizationTypeMod;
using namespace ReceiverSidebandMod;

void ASDM_CALDELAY::fill(const ASDM& asdm) {
	vector<CalDelayRow*> rows = asdm.getCalDelay().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<String> refAntennaName(*table_p_, "refAntennaName");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> delayError(*table_p_, "delayError");
	ArrayColumn<> delayOffset(*table_p_, "delayOffset");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ArrayColumn<> appliedDelay(*table_p_, "appliedDelay");
	ScalarColumn<> crossDelayOffset(*table_p_, "crossDelayOffset");  
	ScalarColumn<> crossDelayOffsetError(*table_p_, "crossDelayOffsetError");  
	ScalarColumn<> numSideband(*table_p_, "numSideband");  
	ArrayColumn<double> refFreq(*table_p_, "refFreq");  
	ArrayColumn<double> refFreqPhase(*table_p_, "refFreqPhase");  
	ArrayColumn<String> sidebands(*table_p_, "sidebands");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		refAntennaName.put(rowIndex, rows.at(i)->getRefAntennaName());
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		delayError.put(rowIndex, null1D<double,null>(rows.at(i)->getDelayError()));
		delayOffset.put(rowIndex, null1D<double,null>(rows.at(i)->getDelayOffset()));
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		reducedChiSquared.put(rowIndex, null1D<double,null>(rows.at(i)->getReducedChiSquared()));
		appliedDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getAppliedDelay()));
		if (rows.at(i)->isCrossDelayOffsetExists())
			crossDelayOffset.put(rowIndex, rows.at(i)->getCrossDelayOffset()null);
		if (rows.at(i)->isCrossDelayOffsetErrorExists())
			crossDelayOffsetError.put(rowIndex, rows.at(i)->getCrossDelayOffsetError()null);
		if (rows.at(i)->isNumSidebandExists())
			numSideband.put(rowIndex, rows.at(i)->getNumSideband()null);
		if (rows.at(i)->isRefFreqExists())
			refFreq.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getRefFreq()));
		if (rows.at(i)->isRefFreqPhaseExists())
			refFreqPhase.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getRefFreqPhase()));
		if (rows.at(i)->isSidebandsExists())
			sidebands.put(rowIndex, enum2CASA1D<ReceiverSideband,CReceiverSideband>(rows.at(i)->getSidebands()));
		
		rowIndex++;		
	}
}


ASDM_CALDEVICE::ASDM_CALDEVICE() {
	name_ = "ASDM_CALDEVICE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalDevice table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCalload", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("calLoadNames", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("calEff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("noiseCal", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coupledNoiseCal", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("temperatureLoad", "blabla"));
}

ASDM_CALDEVICE::~ASDM_CALDEVICE() {
}

const TableDesc& ASDM_CALDEVICE::tableDesc() const {
  return tableDesc_;
}

#include "CalDeviceTable.h"
#include "CalDeviceRow.h"

using namespace CalibrationDeviceMod;

void ASDM_CALDEVICE::fill(const ASDM& asdm) {
	vector<CalDeviceRow*> rows = asdm.getCalDevice().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ScalarColumn<> numCalload(*table_p_, "numCalload");
	ArrayColumn<String> calLoadNames(*table_p_, "calLoadNames");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");  
	ArrayColumn<> calEff(*table_p_, "calEff");  
	ArrayColumn<> noiseCal(*table_p_, "noiseCal");  
	ArrayColumn<> coupledNoiseCal(*table_p_, "coupledNoiseCal");  
	ArrayColumn<double> temperatureLoad(*table_p_, "temperatureLoad");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		numCalload.put(rowIndex, rows.at(i)->getNumCalload()null);
		calLoadNames.put(rowIndex, enum2CASA1D<CalibrationDevice,CCalibrationDevice>(rows.at(i)->getCalLoadNames()));
		if (rows.at(i)->isNumReceptorExists())
			numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		if (rows.at(i)->isCalEffExists())
			calEff.put(rowIndex, null2D<float,null>(rows.at(i)->getCalEff()));
		if (rows.at(i)->isNoiseCalExists())
			noiseCal.put(rowIndex, null1D<double,null>(rows.at(i)->getNoiseCal()));
		if (rows.at(i)->isCoupledNoiseCalExists())
			coupledNoiseCal.put(rowIndex, null2D<float,null>(rows.at(i)->getCoupledNoiseCal()));
		if (rows.at(i)->isTemperatureLoadExists())
			temperatureLoad.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTemperatureLoad()));
		
		rowIndex++;		
	}
}


ASDM_CALFLUX::ASDM_CALFLUX() {
	name_ = "ASDM_CALFLUX";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalFlux table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numFrequencyRanges", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numStokes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRanges", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fluxMethod", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("flux", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("fluxError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("stokes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("directionCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("directionEquinox", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("PA", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("PAError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("size", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("sizeError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceModel", "blabla"));
}

ASDM_CALFLUX::~ASDM_CALFLUX() {
}

const TableDesc& ASDM_CALFLUX::tableDesc() const {
  return tableDesc_;
}

#include "CalFluxTable.h"
#include "CalFluxRow.h"

using namespace FluxCalibrationMethodMod;
using namespace StokesParameterMod;
using namespace DirectionReferenceCodeMod;
using namespace SourceModelMod;

void ASDM_CALFLUX::fill(const ASDM& asdm) {
	vector<CalFluxRow*> rows = asdm.getCalFlux().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> sourceName(*table_p_, "sourceName");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<> numFrequencyRanges(*table_p_, "numFrequencyRanges");
	ScalarColumn<> numStokes(*table_p_, "numStokes");
	ArrayColumn<double> frequencyRanges(*table_p_, "frequencyRanges");
	ScalarColumn<String> fluxMethod(*table_p_, "fluxMethod");
	ArrayColumn<> flux(*table_p_, "flux");
	ArrayColumn<> fluxError(*table_p_, "fluxError");
	ArrayColumn<String> stokes(*table_p_, "stokes");
	ArrayColumn<double> direction(*table_p_, "direction");  
	ScalarColumn<String> directionCode(*table_p_, "directionCode");  
	ScalarColumn<double> directionEquinox(*table_p_, "directionEquinox");  
	ArrayColumn<double> PA(*table_p_, "PA");  
	ArrayColumn<double> PAError(*table_p_, "PAError");  
	ArrayColumn<double> size(*table_p_, "size");  
	ArrayColumn<double> sizeError(*table_p_, "sizeError");  
	ScalarColumn<String> sourceModel(*table_p_, "sourceModel");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		sourceName.put(rowIndex, rows.at(i)->getSourceName());
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		numFrequencyRanges.put(rowIndex, rows.at(i)->getNumFrequencyRanges()null);
		numStokes.put(rowIndex, rows.at(i)->getNumStokes()null);
		frequencyRanges.put(rowIndex, ext2CASA2D<Frequency,double>(rows.at(i)->getFrequencyRanges()));
		fluxMethod.put(rowIndex, CFluxCalibrationMethod::name(rows.at(i)->getFluxMethod()));
		flux.put(rowIndex, null2D<double,null>(rows.at(i)->getFlux()));
		fluxError.put(rowIndex, null2D<double,null>(rows.at(i)->getFluxError()));
		stokes.put(rowIndex, enum2CASA1D<StokesParameter,CStokesParameter>(rows.at(i)->getStokes()));
		if (rows.at(i)->isDirectionExists())
			direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		if (rows.at(i)->isDirectionCodeExists())
			directionCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getDirectionCode()));
		if (rows.at(i)->isDirectionEquinoxExists())
			directionEquinox.put(rowIndex, rows.at(i)->getDirectionEquinox().get());
		if (rows.at(i)->isPAExists())
			PA.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getPA()));
		if (rows.at(i)->isPAErrorExists())
			PAError.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getPAError()));
		if (rows.at(i)->isSizeExists())
			size.put(rowIndex, ext2CASA3D<Angle,double>(rows.at(i)->getSize()));
		if (rows.at(i)->isSizeErrorExists())
			sizeError.put(rowIndex, ext2CASA3D<Angle,double>(rows.at(i)->getSizeError()));
		if (rows.at(i)->isSourceModelExists())
			sourceModel.put(rowIndex, CSourceModel::name(rows.at(i)->getSourceModel()));
		
		rowIndex++;		
	}
}


ASDM_CALFOCUS::ASDM_CALFOCUS() {
	name_ = "ASDM_CALFOCUS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalFocus table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("ambientTemperature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("focusMethod", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("pointingDirection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("wereFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offsetError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("offsetWasTied", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("position", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("polarizationsAveraged", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusCurveWidth", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusCurveWidthError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("focusCurveWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offIntensity", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offIntensityError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("offIntensityWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("peakIntensity", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("peakIntensityError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("peakIntensityWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("astigmPlus", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("astigmPlusError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("astigmMult", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("astigmMultError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("illumOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("illumOffsetError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("fitRMS", "blabla"));
}

ASDM_CALFOCUS::~ASDM_CALFOCUS() {
}

const TableDesc& ASDM_CALFOCUS::tableDesc() const {
  return tableDesc_;
}

#include "CalFocusTable.h"
#include "CalFocusRow.h"

using namespace ReceiverBandMod;
using namespace AtmPhaseCorrectionMod;
using namespace FocusMethodMod;
using namespace PolarizationTypeMod;

void ASDM_CALFOCUS::fill(const ASDM& asdm) {
	vector<CalFocusRow*> rows = asdm.getCalFocus().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<double> ambientTemperature(*table_p_, "ambientTemperature");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> focusMethod(*table_p_, "focusMethod");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ArrayColumn<double> pointingDirection(*table_p_, "pointingDirection");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> wereFixed(*table_p_, "wereFixed");
	ArrayColumn<double> offset(*table_p_, "offset");
	ArrayColumn<double> offsetError(*table_p_, "offsetError");
	ArrayColumn<> offsetWasTied(*table_p_, "offsetWasTied");
	ArrayColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ArrayColumn<double> position(*table_p_, "position");
	ScalarColumn<> polarizationsAveraged(*table_p_, "polarizationsAveraged");  
	ArrayColumn<double> focusCurveWidth(*table_p_, "focusCurveWidth");  
	ArrayColumn<double> focusCurveWidthError(*table_p_, "focusCurveWidthError");  
	ArrayColumn<> focusCurveWasFixed(*table_p_, "focusCurveWasFixed");  
	ArrayColumn<double> offIntensity(*table_p_, "offIntensity");  
	ArrayColumn<double> offIntensityError(*table_p_, "offIntensityError");  
	ScalarColumn<> offIntensityWasFixed(*table_p_, "offIntensityWasFixed");  
	ArrayColumn<double> peakIntensity(*table_p_, "peakIntensity");  
	ArrayColumn<double> peakIntensityError(*table_p_, "peakIntensityError");  
	ScalarColumn<> peakIntensityWasFixed(*table_p_, "peakIntensityWasFixed");  
	ArrayColumn<double> astigmPlus(*table_p_, "astigmPlus");  
	ArrayColumn<double> astigmPlusError(*table_p_, "astigmPlusError");  
	ArrayColumn<double> astigmMult(*table_p_, "astigmMult");  
	ArrayColumn<double> astigmMultError(*table_p_, "astigmMultError");  
	ArrayColumn<double> illumOffset(*table_p_, "illumOffset");  
	ArrayColumn<double> illumOffsetError(*table_p_, "illumOffsetError");  
	ArrayColumn<double> fitRMS(*table_p_, "fitRMS");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		ambientTemperature.put(rowIndex, rows.at(i)->getAmbientTemperature().get());
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		focusMethod.put(rowIndex, CFocusMethod::name(rows.at(i)->getFocusMethod()));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		pointingDirection.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getPointingDirection()));
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		wereFixed.put(rowIndex, null1D<bool,null>(rows.at(i)->getWereFixed()));
		offset.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getOffset()));
		offsetError.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getOffsetError()));
		offsetWasTied.put(rowIndex, null2D<bool,null>(rows.at(i)->getOffsetWasTied()));
		reducedChiSquared.put(rowIndex, null2D<double,null>(rows.at(i)->getReducedChiSquared()));
		position.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getPosition()));
		if (rows.at(i)->isPolarizationsAveragedExists())
			polarizationsAveraged.put(rowIndex, rows.at(i)->getPolarizationsAveraged()null);
		if (rows.at(i)->isFocusCurveWidthExists())
			focusCurveWidth.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getFocusCurveWidth()));
		if (rows.at(i)->isFocusCurveWidthErrorExists())
			focusCurveWidthError.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getFocusCurveWidthError()));
		if (rows.at(i)->isFocusCurveWasFixedExists())
			focusCurveWasFixed.put(rowIndex, null1D<bool,null>(rows.at(i)->getFocusCurveWasFixed()));
		if (rows.at(i)->isOffIntensityExists())
			offIntensity.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getOffIntensity()));
		if (rows.at(i)->isOffIntensityErrorExists())
			offIntensityError.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getOffIntensityError()));
		if (rows.at(i)->isOffIntensityWasFixedExists())
			offIntensityWasFixed.put(rowIndex, rows.at(i)->getOffIntensityWasFixed()null);
		if (rows.at(i)->isPeakIntensityExists())
			peakIntensity.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getPeakIntensity()));
		if (rows.at(i)->isPeakIntensityErrorExists())
			peakIntensityError.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getPeakIntensityError()));
		if (rows.at(i)->isPeakIntensityWasFixedExists())
			peakIntensityWasFixed.put(rowIndex, rows.at(i)->getPeakIntensityWasFixed()null);
		if (rows.at(i)->isAstigmPlusExists())
			astigmPlus.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getAstigmPlus()));
		if (rows.at(i)->isAstigmPlusErrorExists())
			astigmPlusError.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getAstigmPlusError()));
		if (rows.at(i)->isAstigmMultExists())
			astigmMult.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getAstigmMult()));
		if (rows.at(i)->isAstigmMultErrorExists())
			astigmMultError.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getAstigmMultError()));
		if (rows.at(i)->isIllumOffsetExists())
			illumOffset.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getIllumOffset()));
		if (rows.at(i)->isIllumOffsetErrorExists())
			illumOffsetError.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getIllumOffsetError()));
		if (rows.at(i)->isFitRMSExists())
			fitRMS.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getFitRMS()));
		
		rowIndex++;		
	}
}


ASDM_CALFOCUSMODEL::ASDM_CALFOCUSMODEL() {
	name_ = "ASDM_CALFOCUSMODEL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalFocusModel table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCoeff", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSourceObs", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffFormula", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffValue", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffFixed", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("focusModel", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("reducedChiSquared", "blabla"));
}

ASDM_CALFOCUSMODEL::~ASDM_CALFOCUSMODEL() {
}

const TableDesc& ASDM_CALFOCUSMODEL::tableDesc() const {
  return tableDesc_;
}

#include "CalFocusModelTable.h"
#include "CalFocusModelRow.h"

using namespace ReceiverBandMod;
using namespace PolarizationTypeMod;
using namespace AntennaMakeMod;

void ASDM_CALFOCUSMODEL::fill(const ASDM& asdm) {
	vector<CalFocusModelRow*> rows = asdm.getCalFocusModel().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> polarizationType(*table_p_, "polarizationType");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<> numCoeff(*table_p_, "numCoeff");
	ScalarColumn<> numSourceObs(*table_p_, "numSourceObs");
	ArrayColumn<String> coeffName(*table_p_, "coeffName");
	ArrayColumn<String> coeffFormula(*table_p_, "coeffFormula");
	ArrayColumn<> coeffValue(*table_p_, "coeffValue");
	ArrayColumn<> coeffError(*table_p_, "coeffError");
	ArrayColumn<> coeffFixed(*table_p_, "coeffFixed");
	ScalarColumn<String> focusModel(*table_p_, "focusModel");
	ArrayColumn<double> focusRMS(*table_p_, "focusRMS");
	ScalarColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		polarizationType.put(rowIndex, CPolarizationType::name(rows.at(i)->getPolarizationType()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		numCoeff.put(rowIndex, rows.at(i)->getNumCoeff()null);
		numSourceObs.put(rowIndex, rows.at(i)->getNumSourceObs()null);
		coeffName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffName()));
		coeffFormula.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffFormula()));
		coeffValue.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffValue()));
		coeffError.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffError()));
		coeffFixed.put(rowIndex, null1D<bool,null>(rows.at(i)->getCoeffFixed()));
		focusModel.put(rowIndex, rows.at(i)->getFocusModel());
		focusRMS.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getFocusRMS()));
		reducedChiSquared.put(rowIndex, rows.at(i)->getReducedChiSquared()null);
		
		rowIndex++;		
	}
}


ASDM_CALGAIN::ASDM_CALGAIN() {
	name_ = "ASDM_CALGAIN";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalGain table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("gain", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("gainValid", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("fit", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("fitWeight", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("totalGainValid", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("totalFit", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("totalFitWeight", "blabla"));
}

ASDM_CALGAIN::~ASDM_CALGAIN() {
}

const TableDesc& ASDM_CALGAIN::tableDesc() const {
  return tableDesc_;
}

#include "CalGainTable.h"
#include "CalGainRow.h"


void ASDM_CALGAIN::fill(const ASDM& asdm) {
	vector<CalGainRow*> rows = asdm.getCalGain().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<> gain(*table_p_, "gain");
	ScalarColumn<> gainValid(*table_p_, "gainValid");
	ScalarColumn<> fit(*table_p_, "fit");
	ScalarColumn<> fitWeight(*table_p_, "fitWeight");
	ScalarColumn<> totalGainValid(*table_p_, "totalGainValid");
	ScalarColumn<> totalFit(*table_p_, "totalFit");
	ScalarColumn<> totalFitWeight(*table_p_, "totalFitWeight");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		gain.put(rowIndex, rows.at(i)->getGain()null);
		gainValid.put(rowIndex, rows.at(i)->getGainValid()null);
		fit.put(rowIndex, rows.at(i)->getFit()null);
		fitWeight.put(rowIndex, rows.at(i)->getFitWeight()null);
		totalGainValid.put(rowIndex, rows.at(i)->getTotalGainValid()null);
		totalFit.put(rowIndex, rows.at(i)->getTotalFit()null);
		totalFitWeight.put(rowIndex, rows.at(i)->getTotalFitWeight()null);
		
		rowIndex++;		
	}
}


ASDM_CALHOLOGRAPHY::ASDM_CALHOLOGRAPHY() {
	name_ = "ASDM_CALHOLOGRAPHY";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalHolography table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("ambientTemperature", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusPosition", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("illuminationTaper", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPanelModes", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("beamMapUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("rawRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("weightedRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("surfaceMapUID", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numScrew", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("screwName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("screwMotion", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("screwMotionError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("gravCorrection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("gravOptRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tempCorrection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tempOptRange", "blabla"));
}

ASDM_CALHOLOGRAPHY::~ASDM_CALHOLOGRAPHY() {
}

const TableDesc& ASDM_CALHOLOGRAPHY::tableDesc() const {
  return tableDesc_;
}

#include "CalHolographyTable.h"
#include "CalHolographyRow.h"

using namespace AntennaMakeMod;
using namespace PolarizationTypeMod;
using namespace ReceiverBandMod;

void ASDM_CALHOLOGRAPHY::fill(const ASDM& asdm) {
	vector<CalHolographyRow*> rows = asdm.getCalHolography().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<double> ambientTemperature(*table_p_, "ambientTemperature");
	ArrayColumn<double> focusPosition(*table_p_, "focusPosition");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<> illuminationTaper(*table_p_, "illuminationTaper");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ScalarColumn<> numPanelModes(*table_p_, "numPanelModes");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> beamMapUID(*table_p_, "beamMapUID");
	ScalarColumn<double> rawRMS(*table_p_, "rawRMS");
	ScalarColumn<double> weightedRMS(*table_p_, "weightedRMS");
	ScalarColumn<String> surfaceMapUID(*table_p_, "surfaceMapUID");
	ArrayColumn<double> direction(*table_p_, "direction");
	ScalarColumn<> numScrew(*table_p_, "numScrew");  
	ArrayColumn<String> screwName(*table_p_, "screwName");  
	ArrayColumn<double> screwMotion(*table_p_, "screwMotion");  
	ArrayColumn<double> screwMotionError(*table_p_, "screwMotionError");  
	ScalarColumn<> gravCorrection(*table_p_, "gravCorrection");  
	ArrayColumn<double> gravOptRange(*table_p_, "gravOptRange");  
	ScalarColumn<> tempCorrection(*table_p_, "tempCorrection");  
	ArrayColumn<double> tempOptRange(*table_p_, "tempOptRange");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		ambientTemperature.put(rowIndex, rows.at(i)->getAmbientTemperature().get());
		focusPosition.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getFocusPosition()));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		illuminationTaper.put(rowIndex, rows.at(i)->getIlluminationTaper()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		numPanelModes.put(rowIndex, rows.at(i)->getNumPanelModes()null);
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		beamMapUID.put(rowIndex, rows.at(i)->getBeamMapUID().toString());
		rawRMS.put(rowIndex, rows.at(i)->getRawRMS().get());
		weightedRMS.put(rowIndex, rows.at(i)->getWeightedRMS().get());
		surfaceMapUID.put(rowIndex, rows.at(i)->getSurfaceMapUID().toString());
		direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		if (rows.at(i)->isNumScrewExists())
			numScrew.put(rowIndex, rows.at(i)->getNumScrew()null);
		if (rows.at(i)->isScrewNameExists())
			screwName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getScrewName()));
		if (rows.at(i)->isScrewMotionExists())
			screwMotion.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getScrewMotion()));
		if (rows.at(i)->isScrewMotionErrorExists())
			screwMotionError.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getScrewMotionError()));
		if (rows.at(i)->isGravCorrectionExists())
			gravCorrection.put(rowIndex, rows.at(i)->getGravCorrection()null);
		if (rows.at(i)->isGravOptRangeExists())
			gravOptRange.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getGravOptRange()));
		if (rows.at(i)->isTempCorrectionExists())
			tempCorrection.put(rowIndex, rows.at(i)->getTempCorrection()null);
		if (rows.at(i)->isTempOptRangeExists())
			tempOptRange.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTempOptRange()));
		
		rowIndex++;		
	}
}


ASDM_CALPHASE::ASDM_CALPHASE() {
	name_ = "ASDM_CALPHASE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalPhase table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseline", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("ampli", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaNames", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("baselineLengths", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("decorrelationFactor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("integrationTime", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phase", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseRMS", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("statPhaseRMS", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("correctionValidity", "blabla"));
}

ASDM_CALPHASE::~ASDM_CALPHASE() {
}

const TableDesc& ASDM_CALPHASE::tableDesc() const {
  return tableDesc_;
}

#include "CalPhaseTable.h"
#include "CalPhaseRow.h"

using namespace BasebandNameMod;
using namespace ReceiverBandMod;
using namespace AtmPhaseCorrectionMod;
using namespace PolarizationTypeMod;

void ASDM_CALPHASE::fill(const ASDM& asdm) {
	vector<CalPhaseRow*> rows = asdm.getCalPhase().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<> numBaseline(*table_p_, "numBaseline");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> ampli(*table_p_, "ampli");
	ArrayColumn<String> antennaNames(*table_p_, "antennaNames");
	ArrayColumn<double> baselineLengths(*table_p_, "baselineLengths");
	ArrayColumn<> decorrelationFactor(*table_p_, "decorrelationFactor");
	ArrayColumn<double> direction(*table_p_, "direction");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<double> integrationTime(*table_p_, "integrationTime");
	ArrayColumn<> phase(*table_p_, "phase");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> phaseRMS(*table_p_, "phaseRMS");
	ArrayColumn<> statPhaseRMS(*table_p_, "statPhaseRMS");
	ArrayColumn<> correctionValidity(*table_p_, "correctionValidity");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		numBaseline.put(rowIndex, rows.at(i)->getNumBaseline()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		ampli.put(rowIndex, null2D<float,null>(rows.at(i)->getAmpli()));
		antennaNames.put(rowIndex, basic2CASA2D<string,String>(rows.at(i)->getAntennaNames()));
		baselineLengths.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getBaselineLengths()));
		decorrelationFactor.put(rowIndex, null2D<float,null>(rows.at(i)->getDecorrelationFactor()));
		direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		integrationTime.put(rowIndex, rows.at(i)->getIntegrationTime().get()/(1.0e9));
		phase.put(rowIndex, null2D<float,null>(rows.at(i)->getPhase()));
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		phaseRMS.put(rowIndex, null2D<float,null>(rows.at(i)->getPhaseRMS()));
		statPhaseRMS.put(rowIndex, null2D<float,null>(rows.at(i)->getStatPhaseRMS()));
		if (rows.at(i)->isCorrectionValidityExists())
			correctionValidity.put(rowIndex, null1D<bool,null>(rows.at(i)->getCorrectionValidity()));
		
		rowIndex++;		
	}
}


ASDM_CALPOINTING::ASDM_CALPOINTING() {
	name_ = "ASDM_CALPOINTING";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalPointing table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("ambientTemperature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("pointingModelMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("pointingMethod", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("collOffsetRelative", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("collOffsetAbsolute", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("collError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("collOffsetTied", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("averagedPolarizations", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("beamPA", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("beamPAError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("beamPAWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("beamWidth", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("beamWidthError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("beamWidthWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offIntensity", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offIntensityError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("offIntensityWasFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("peakIntensity", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("peakIntensityError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("peakIntensityWasFixed", "blabla"));
}

ASDM_CALPOINTING::~ASDM_CALPOINTING() {
}

const TableDesc& ASDM_CALPOINTING::tableDesc() const {
  return tableDesc_;
}

#include "CalPointingTable.h"
#include "CalPointingRow.h"

using namespace ReceiverBandMod;
using namespace AntennaMakeMod;
using namespace AtmPhaseCorrectionMod;
using namespace PointingModelModeMod;
using namespace PointingMethodMod;
using namespace PolarizationTypeMod;

void ASDM_CALPOINTING::fill(const ASDM& asdm) {
	vector<CalPointingRow*> rows = asdm.getCalPointing().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<double> ambientTemperature(*table_p_, "ambientTemperature");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ArrayColumn<double> direction(*table_p_, "direction");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<String> pointingModelMode(*table_p_, "pointingModelMode");
	ScalarColumn<String> pointingMethod(*table_p_, "pointingMethod");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<double> collOffsetRelative(*table_p_, "collOffsetRelative");
	ArrayColumn<double> collOffsetAbsolute(*table_p_, "collOffsetAbsolute");
	ArrayColumn<double> collError(*table_p_, "collError");
	ArrayColumn<> collOffsetTied(*table_p_, "collOffsetTied");
	ArrayColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ScalarColumn<> averagedPolarizations(*table_p_, "averagedPolarizations");  
	ArrayColumn<double> beamPA(*table_p_, "beamPA");  
	ArrayColumn<double> beamPAError(*table_p_, "beamPAError");  
	ScalarColumn<> beamPAWasFixed(*table_p_, "beamPAWasFixed");  
	ArrayColumn<double> beamWidth(*table_p_, "beamWidth");  
	ArrayColumn<double> beamWidthError(*table_p_, "beamWidthError");  
	ArrayColumn<> beamWidthWasFixed(*table_p_, "beamWidthWasFixed");  
	ArrayColumn<double> offIntensity(*table_p_, "offIntensity");  
	ArrayColumn<double> offIntensityError(*table_p_, "offIntensityError");  
	ScalarColumn<> offIntensityWasFixed(*table_p_, "offIntensityWasFixed");  
	ArrayColumn<double> peakIntensity(*table_p_, "peakIntensity");  
	ArrayColumn<double> peakIntensityError(*table_p_, "peakIntensityError");  
	ScalarColumn<> peakIntensityWasFixed(*table_p_, "peakIntensityWasFixed");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		ambientTemperature.put(rowIndex, rows.at(i)->getAmbientTemperature().get());
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		pointingModelMode.put(rowIndex, CPointingModelMode::name(rows.at(i)->getPointingModelMode()));
		pointingMethod.put(rowIndex, CPointingMethod::name(rows.at(i)->getPointingMethod()));
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		collOffsetRelative.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getCollOffsetRelative()));
		collOffsetAbsolute.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getCollOffsetAbsolute()));
		collError.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getCollError()));
		collOffsetTied.put(rowIndex, null2D<bool,null>(rows.at(i)->getCollOffsetTied()));
		reducedChiSquared.put(rowIndex, null1D<double,null>(rows.at(i)->getReducedChiSquared()));
		if (rows.at(i)->isAveragedPolarizationsExists())
			averagedPolarizations.put(rowIndex, rows.at(i)->getAveragedPolarizations()null);
		if (rows.at(i)->isBeamPAExists())
			beamPA.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getBeamPA()));
		if (rows.at(i)->isBeamPAErrorExists())
			beamPAError.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getBeamPAError()));
		if (rows.at(i)->isBeamPAWasFixedExists())
			beamPAWasFixed.put(rowIndex, rows.at(i)->getBeamPAWasFixed()null);
		if (rows.at(i)->isBeamWidthExists())
			beamWidth.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getBeamWidth()));
		if (rows.at(i)->isBeamWidthErrorExists())
			beamWidthError.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getBeamWidthError()));
		if (rows.at(i)->isBeamWidthWasFixedExists())
			beamWidthWasFixed.put(rowIndex, null1D<bool,null>(rows.at(i)->getBeamWidthWasFixed()));
		if (rows.at(i)->isOffIntensityExists())
			offIntensity.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getOffIntensity()));
		if (rows.at(i)->isOffIntensityErrorExists())
			offIntensityError.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getOffIntensityError()));
		if (rows.at(i)->isOffIntensityWasFixedExists())
			offIntensityWasFixed.put(rowIndex, rows.at(i)->getOffIntensityWasFixed()null);
		if (rows.at(i)->isPeakIntensityExists())
			peakIntensity.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getPeakIntensity()));
		if (rows.at(i)->isPeakIntensityErrorExists())
			peakIntensityError.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getPeakIntensityError()));
		if (rows.at(i)->isPeakIntensityWasFixedExists())
			peakIntensityWasFixed.put(rowIndex, rows.at(i)->getPeakIntensityWasFixed()null);
		
		rowIndex++;		
	}
}


ASDM_CALPOINTINGMODEL::ASDM_CALPOINTINGMODEL() {
	name_ = "ASDM_CALPOINTINGMODEL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalPointingModel table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("pointingModelMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCoeff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffVal", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffError", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffFixed", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("azimuthRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("elevationRms", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("skyRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numObs", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffFormula", "blabla"));
}

ASDM_CALPOINTINGMODEL::~ASDM_CALPOINTINGMODEL() {
}

const TableDesc& ASDM_CALPOINTINGMODEL::tableDesc() const {
  return tableDesc_;
}

#include "CalPointingModelTable.h"
#include "CalPointingModelRow.h"

using namespace ReceiverBandMod;
using namespace AntennaMakeMod;
using namespace PointingModelModeMod;
using namespace PolarizationTypeMod;

void ASDM_CALPOINTINGMODEL::fill(const ASDM& asdm) {
	vector<CalPointingModelRow*> rows = asdm.getCalPointingModel().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<String> pointingModelMode(*table_p_, "pointingModelMode");
	ScalarColumn<String> polarizationType(*table_p_, "polarizationType");
	ScalarColumn<> numCoeff(*table_p_, "numCoeff");
	ArrayColumn<String> coeffName(*table_p_, "coeffName");
	ArrayColumn<> coeffVal(*table_p_, "coeffVal");
	ArrayColumn<> coeffError(*table_p_, "coeffError");
	ArrayColumn<> coeffFixed(*table_p_, "coeffFixed");
	ScalarColumn<double> azimuthRMS(*table_p_, "azimuthRMS");
	ScalarColumn<double> elevationRms(*table_p_, "elevationRms");
	ScalarColumn<double> skyRMS(*table_p_, "skyRMS");
	ScalarColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ScalarColumn<> numObs(*table_p_, "numObs");  
	ArrayColumn<String> coeffFormula(*table_p_, "coeffFormula");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		pointingModelMode.put(rowIndex, CPointingModelMode::name(rows.at(i)->getPointingModelMode()));
		polarizationType.put(rowIndex, CPolarizationType::name(rows.at(i)->getPolarizationType()));
		numCoeff.put(rowIndex, rows.at(i)->getNumCoeff()null);
		coeffName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffName()));
		coeffVal.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffVal()));
		coeffError.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffError()));
		coeffFixed.put(rowIndex, null1D<bool,null>(rows.at(i)->getCoeffFixed()));
		azimuthRMS.put(rowIndex, rows.at(i)->getAzimuthRMS().get());
		elevationRms.put(rowIndex, rows.at(i)->getElevationRms().get());
		skyRMS.put(rowIndex, rows.at(i)->getSkyRMS().get());
		reducedChiSquared.put(rowIndex, rows.at(i)->getReducedChiSquared()null);
		if (rows.at(i)->isNumObsExists())
			numObs.put(rowIndex, rows.at(i)->getNumObs()null);
		if (rows.at(i)->isCoeffFormulaExists())
			coeffFormula.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffFormula()));
		
		rowIndex++;		
	}
}


ASDM_CALPOSITION::ASDM_CALPOSITION() {
	name_ = "ASDM_CALPOSITION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalPosition table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("antennaPosition", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("stationName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("stationPosition", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("positionMethod", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("refAntennaNames", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("axesOffset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("axesOffsetErr", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("axesOffsetFixed", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("positionOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("positionErr", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("reducedChiSquared", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("delayRms", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("phaseRms", "blabla"));
}

ASDM_CALPOSITION::~ASDM_CALPOSITION() {
}

const TableDesc& ASDM_CALPOSITION::tableDesc() const {
  return tableDesc_;
}

#include "CalPositionTable.h"
#include "CalPositionRow.h"

using namespace AtmPhaseCorrectionMod;
using namespace PositionMethodMod;
using namespace ReceiverBandMod;

void ASDM_CALPOSITION::fill(const ASDM& asdm) {
	vector<CalPositionRow*> rows = asdm.getCalPosition().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ArrayColumn<double> antennaPosition(*table_p_, "antennaPosition");
	ScalarColumn<String> stationName(*table_p_, "stationName");
	ArrayColumn<double> stationPosition(*table_p_, "stationPosition");
	ScalarColumn<String> positionMethod(*table_p_, "positionMethod");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ArrayColumn<String> refAntennaNames(*table_p_, "refAntennaNames");
	ScalarColumn<double> axesOffset(*table_p_, "axesOffset");
	ScalarColumn<double> axesOffsetErr(*table_p_, "axesOffsetErr");
	ScalarColumn<> axesOffsetFixed(*table_p_, "axesOffsetFixed");
	ArrayColumn<double> positionOffset(*table_p_, "positionOffset");
	ArrayColumn<double> positionErr(*table_p_, "positionErr");
	ScalarColumn<> reducedChiSquared(*table_p_, "reducedChiSquared");
	ScalarColumn<> delayRms(*table_p_, "delayRms");  
	ScalarColumn<double> phaseRms(*table_p_, "phaseRms");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		antennaPosition.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getAntennaPosition()));
		stationName.put(rowIndex, rows.at(i)->getStationName());
		stationPosition.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getStationPosition()));
		positionMethod.put(rowIndex, CPositionMethod::name(rows.at(i)->getPositionMethod()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		refAntennaNames.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getRefAntennaNames()));
		axesOffset.put(rowIndex, rows.at(i)->getAxesOffset().get());
		axesOffsetErr.put(rowIndex, rows.at(i)->getAxesOffsetErr().get());
		axesOffsetFixed.put(rowIndex, rows.at(i)->getAxesOffsetFixed()null);
		positionOffset.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPositionOffset()));
		positionErr.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPositionErr()));
		reducedChiSquared.put(rowIndex, rows.at(i)->getReducedChiSquared()null);
		if (rows.at(i)->isDelayRmsExists())
			delayRms.put(rowIndex, rows.at(i)->getDelayRms()null);
		if (rows.at(i)->isPhaseRmsExists())
			phaseRms.put(rowIndex, rows.at(i)->getPhaseRms().get());
		
		rowIndex++;		
	}
}


ASDM_CALPRIMARYBEAM::ASDM_CALPRIMARYBEAM() {
	name_ = "ASDM_CALPRIMARYBEAM";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalPrimaryBeam table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaMake", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSubband", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("mainBeamEfficiency", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("beamDescriptionUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("relativeAmplitudeRms", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("minValidDirection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("maxValidDirection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("descriptionType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("imageChannelNumber", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("imageNominalFrequency", "blabla"));
}

ASDM_CALPRIMARYBEAM::~ASDM_CALPRIMARYBEAM() {
}

const TableDesc& ASDM_CALPRIMARYBEAM::tableDesc() const {
  return tableDesc_;
}

#include "CalPrimaryBeamTable.h"
#include "CalPrimaryBeamRow.h"

using namespace ReceiverBandMod;
using namespace AntennaMakeMod;
using namespace PolarizationTypeMod;
using namespace PrimaryBeamDescriptionMod;

void ASDM_CALPRIMARYBEAM::fill(const ASDM& asdm) {
	vector<CalPrimaryBeamRow*> rows = asdm.getCalPrimaryBeam().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<String> antennaMake(*table_p_, "antennaMake");
	ScalarColumn<> numSubband(*table_p_, "numSubband");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<> mainBeamEfficiency(*table_p_, "mainBeamEfficiency");
	ScalarColumn<String> beamDescriptionUID(*table_p_, "beamDescriptionUID");
	ScalarColumn<> relativeAmplitudeRms(*table_p_, "relativeAmplitudeRms");
	ArrayColumn<double> direction(*table_p_, "direction");
	ArrayColumn<double> minValidDirection(*table_p_, "minValidDirection");
	ArrayColumn<double> maxValidDirection(*table_p_, "maxValidDirection");
	ScalarColumn<String> descriptionType(*table_p_, "descriptionType");
	ArrayColumn<> imageChannelNumber(*table_p_, "imageChannelNumber");
	ArrayColumn<double> imageNominalFrequency(*table_p_, "imageNominalFrequency");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		antennaMake.put(rowIndex, CAntennaMake::name(rows.at(i)->getAntennaMake()));
		numSubband.put(rowIndex, rows.at(i)->getNumSubband()null);
		frequencyRange.put(rowIndex, ext2CASA2D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		mainBeamEfficiency.put(rowIndex, null1D<double,null>(rows.at(i)->getMainBeamEfficiency()));
		beamDescriptionUID.put(rowIndex, rows.at(i)->getBeamDescriptionUID().toString());
		relativeAmplitudeRms.put(rowIndex, rows.at(i)->getRelativeAmplitudeRms()null);
		direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		minValidDirection.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getMinValidDirection()));
		maxValidDirection.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getMaxValidDirection()));
		descriptionType.put(rowIndex, CPrimaryBeamDescription::name(rows.at(i)->getDescriptionType()));
		imageChannelNumber.put(rowIndex, null1D<int,null>(rows.at(i)->getImageChannelNumber()));
		imageNominalFrequency.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getImageNominalFrequency()));
		
		rowIndex++;		
	}
}


ASDM_CALREDUCTION::ASDM_CALREDUCTION() {
	name_ = "ASDM_CALREDUCTION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalReduction table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numApplied", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("appliedCalibrations", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numParam", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("paramSet", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numInvalidConditions", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("invalidConditions", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("timeReduced", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("messages", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("software", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("softwareVersion", "blabla"));
}

ASDM_CALREDUCTION::~ASDM_CALREDUCTION() {
}

const TableDesc& ASDM_CALREDUCTION::tableDesc() const {
  return tableDesc_;
}

#include "CalReductionTable.h"
#include "CalReductionRow.h"

using namespace InvalidatingConditionMod;

void ASDM_CALREDUCTION::fill(const ASDM& asdm) {
	vector<CalReductionRow*> rows = asdm.getCalReduction().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<> numApplied(*table_p_, "numApplied");
	ArrayColumn<String> appliedCalibrations(*table_p_, "appliedCalibrations");
	ScalarColumn<> numParam(*table_p_, "numParam");
	ArrayColumn<String> paramSet(*table_p_, "paramSet");
	ScalarColumn<> numInvalidConditions(*table_p_, "numInvalidConditions");
	ArrayColumn<String> invalidConditions(*table_p_, "invalidConditions");
	ScalarColumn<double> timeReduced(*table_p_, "timeReduced");
	ScalarColumn<String> messages(*table_p_, "messages");
	ScalarColumn<String> software(*table_p_, "software");
	ScalarColumn<String> softwareVersion(*table_p_, "softwareVersion");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		numApplied.put(rowIndex, rows.at(i)->getNumApplied()null);
		appliedCalibrations.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getAppliedCalibrations()));
		numParam.put(rowIndex, rows.at(i)->getNumParam()null);
		paramSet.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getParamSet()));
		numInvalidConditions.put(rowIndex, rows.at(i)->getNumInvalidConditions()null);
		invalidConditions.put(rowIndex, enum2CASA1D<InvalidatingCondition,CInvalidatingCondition>(rows.at(i)->getInvalidConditions()));
		timeReduced.put(rowIndex, rows.at(i)->getTimeReduced().get()/(1.0e9));
		messages.put(rowIndex, rows.at(i)->getMessages());
		software.put(rowIndex, rows.at(i)->getSoftware());
		softwareVersion.put(rowIndex, rows.at(i)->getSoftwareVersion());
		
		rowIndex++;		
	}
}


ASDM_CALSEEING::ASDM_CALSEEING() {
	name_ = "ASDM_CALSEEING";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalSeeing table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyRange", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("integrationTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseLengths", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("baselineLengths", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("phaseRMS", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("seeing", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("seeingError", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("exponent", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("outerScale", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("outerScaleRMS", "blabla"));
}

ASDM_CALSEEING::~ASDM_CALSEEING() {
}

const TableDesc& ASDM_CALSEEING::tableDesc() const {
  return tableDesc_;
}

#include "CalSeeingTable.h"
#include "CalSeeingRow.h"

using namespace AtmPhaseCorrectionMod;

void ASDM_CALSEEING::fill(const ASDM& asdm) {
	vector<CalSeeingRow*> rows = asdm.getCalSeeing().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ArrayColumn<double> frequencyRange(*table_p_, "frequencyRange");
	ScalarColumn<double> integrationTime(*table_p_, "integrationTime");
	ScalarColumn<> numBaseLengths(*table_p_, "numBaseLengths");
	ArrayColumn<double> baselineLengths(*table_p_, "baselineLengths");
	ArrayColumn<double> phaseRMS(*table_p_, "phaseRMS");
	ScalarColumn<double> seeing(*table_p_, "seeing");
	ScalarColumn<double> seeingError(*table_p_, "seeingError");
	ScalarColumn<> exponent(*table_p_, "exponent");  
	ScalarColumn<double> outerScale(*table_p_, "outerScale");  
	ScalarColumn<double> outerScaleRMS(*table_p_, "outerScaleRMS");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		atmPhaseCorrection.put(rowIndex, CAtmPhaseCorrection::name(rows.at(i)->getAtmPhaseCorrection()));
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		frequencyRange.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyRange()));
		integrationTime.put(rowIndex, rows.at(i)->getIntegrationTime().get()/(1.0e9));
		numBaseLengths.put(rowIndex, rows.at(i)->getNumBaseLengths()null);
		baselineLengths.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getBaselineLengths()));
		phaseRMS.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getPhaseRMS()));
		seeing.put(rowIndex, rows.at(i)->getSeeing().get());
		seeingError.put(rowIndex, rows.at(i)->getSeeingError().get());
		if (rows.at(i)->isExponentExists())
			exponent.put(rowIndex, rows.at(i)->getExponent()null);
		if (rows.at(i)->isOuterScaleExists())
			outerScale.put(rowIndex, rows.at(i)->getOuterScale().get());
		if (rows.at(i)->isOuterScaleRMSExists())
			outerScaleRMS.put(rowIndex, rows.at(i)->getOuterScaleRMS().get());
		
		rowIndex++;		
	}
}


ASDM_CALWVR::ASDM_CALWVR() {
	name_ = "ASDM_CALWVR";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CalWVR table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDataId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calReductionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endValidTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("wvrMethod", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numInputAntennas", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("inputAntennaNames", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChan", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("chanFreq", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("chanWidth", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("refTemp", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("pathCoeff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("polyFreqLimits", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("wetPath", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("dryPath", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("water", "blabla"));
}

ASDM_CALWVR::~ASDM_CALWVR() {
}

const TableDesc& ASDM_CALWVR::tableDesc() const {
  return tableDesc_;
}

#include "CalWVRTable.h"
#include "CalWVRRow.h"

using namespace WVRMethodMod;

void ASDM_CALWVR::fill(const ASDM& asdm) {
	vector<CalWVRRow*> rows = asdm.getCalWVR().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaName(*table_p_, "antennaName");
	ScalarColumn<String> calDataId(*table_p_, "calDataId");
	ScalarColumn<String> calReductionId(*table_p_, "calReductionId");
	ScalarColumn<double> startValidTime(*table_p_, "startValidTime");
	ScalarColumn<double> endValidTime(*table_p_, "endValidTime");
	ScalarColumn<String> wvrMethod(*table_p_, "wvrMethod");
	ScalarColumn<> numInputAntennas(*table_p_, "numInputAntennas");
	ArrayColumn<String> inputAntennaNames(*table_p_, "inputAntennaNames");
	ScalarColumn<> numChan(*table_p_, "numChan");
	ArrayColumn<double> chanFreq(*table_p_, "chanFreq");
	ArrayColumn<double> chanWidth(*table_p_, "chanWidth");
	ArrayColumn<double> refTemp(*table_p_, "refTemp");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ArrayColumn<> pathCoeff(*table_p_, "pathCoeff");
	ArrayColumn<double> polyFreqLimits(*table_p_, "polyFreqLimits");
	ArrayColumn<> wetPath(*table_p_, "wetPath");
	ArrayColumn<> dryPath(*table_p_, "dryPath");
	ScalarColumn<double> water(*table_p_, "water");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaName.put(rowIndex, rows.at(i)->getAntennaName());
		calDataId.put(rowIndex, rows.at(i)->getCalDataId().toString());
		calReductionId.put(rowIndex, rows.at(i)->getCalReductionId().toString());
		startValidTime.put(rowIndex, rows.at(i)->getStartValidTime().get()/(1.0e9));
		endValidTime.put(rowIndex, rows.at(i)->getEndValidTime().get()/(1.0e9));
		wvrMethod.put(rowIndex, CWVRMethod::name(rows.at(i)->getWvrMethod()));
		numInputAntennas.put(rowIndex, rows.at(i)->getNumInputAntennas()null);
		inputAntennaNames.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getInputAntennaNames()));
		numChan.put(rowIndex, rows.at(i)->getNumChan()null);
		chanFreq.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getChanFreq()));
		chanWidth.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getChanWidth()));
		refTemp.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getRefTemp()));
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		pathCoeff.put(rowIndex, null3D<float,null>(rows.at(i)->getPathCoeff()));
		polyFreqLimits.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getPolyFreqLimits()));
		wetPath.put(rowIndex, null1D<float,null>(rows.at(i)->getWetPath()));
		dryPath.put(rowIndex, null1D<float,null>(rows.at(i)->getDryPath()));
		water.put(rowIndex, rows.at(i)->getWater().get());
		
		rowIndex++;		
	}
}


ASDM_CONFIGDESCRIPTION::ASDM_CONFIGDESCRIPTION() {
	name_ = "ASDM_CONFIGDESCRIPTION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset ConfigDescription table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("configDescriptionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numDataDescription", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numFeed", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("correlationMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAtmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("atmPhaseCorrection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("processorType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("switchCycleId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("dataDescriptionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("processorId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phasedArrayList", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAssocValues", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("assocNature", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("assocConfigDescriptionId", "blabla"));
}

ASDM_CONFIGDESCRIPTION::~ASDM_CONFIGDESCRIPTION() {
}

const TableDesc& ASDM_CONFIGDESCRIPTION::tableDesc() const {
  return tableDesc_;
}

#include "ConfigDescriptionTable.h"
#include "ConfigDescriptionRow.h"

using namespace CorrelationModeMod;
using namespace AtmPhaseCorrectionMod;
using namespace ProcessorTypeMod;
using namespace SpectralResolutionTypeMod;
using namespace SpectralResolutionTypeMod;

void ASDM_CONFIGDESCRIPTION::fill(const ASDM& asdm) {
	vector<ConfigDescriptionRow*> rows = asdm.getConfigDescription().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> configDescriptionId(*table_p_, "configDescriptionId");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ScalarColumn<> numDataDescription(*table_p_, "numDataDescription");
	ScalarColumn<> numFeed(*table_p_, "numFeed");
	ScalarColumn<String> correlationMode(*table_p_, "correlationMode");
	ScalarColumn<> numAtmPhaseCorrection(*table_p_, "numAtmPhaseCorrection");
	ArrayColumn<String> atmPhaseCorrection(*table_p_, "atmPhaseCorrection");
	ScalarColumn<String> processorType(*table_p_, "processorType");
	ScalarColumn<String> spectralType(*table_p_, "spectralType");
	ArrayColumn<String> antennaId(*table_p_, "antennaId");
	ArrayColumn<> feedId(*table_p_, "feedId");
	ArrayColumn<String> switchCycleId(*table_p_, "switchCycleId");
	ArrayColumn<String> dataDescriptionId(*table_p_, "dataDescriptionId");
	ScalarColumn<String> processorId(*table_p_, "processorId");
	ArrayColumn<> phasedArrayList(*table_p_, "phasedArrayList");  
	ScalarColumn<> numAssocValues(*table_p_, "numAssocValues");  
	ArrayColumn<String> assocNature(*table_p_, "assocNature");  
	ArrayColumn<String> assocConfigDescriptionId(*table_p_, "assocConfigDescriptionId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		configDescriptionId.put(rowIndex, rows.at(i)->getConfigDescriptionId().toString());
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		numDataDescription.put(rowIndex, rows.at(i)->getNumDataDescription()null);
		numFeed.put(rowIndex, rows.at(i)->getNumFeed()null);
		correlationMode.put(rowIndex, CCorrelationMode::name(rows.at(i)->getCorrelationMode()));
		numAtmPhaseCorrection.put(rowIndex, rows.at(i)->getNumAtmPhaseCorrection()null);
		atmPhaseCorrection.put(rowIndex, enum2CASA1D<AtmPhaseCorrection,CAtmPhaseCorrection>(rows.at(i)->getAtmPhaseCorrection()));
		processorType.put(rowIndex, CProcessorType::name(rows.at(i)->getProcessorType()));
		spectralType.put(rowIndex, CSpectralResolutionType::name(rows.at(i)->getSpectralType()));
		antennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAntennaId()));
		feedId.put(rowIndex, null1D<int,null>(rows.at(i)->getFeedId()));
		switchCycleId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getSwitchCycleId()));
		dataDescriptionId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getDataDescriptionId()));
		processorId.put(rowIndex, rows.at(i)->getProcessorId().toString());
		if (rows.at(i)->isPhasedArrayListExists())
			phasedArrayList.put(rowIndex, null1D<int,null>(rows.at(i)->getPhasedArrayList()));
		if (rows.at(i)->isNumAssocValuesExists())
			numAssocValues.put(rowIndex, rows.at(i)->getNumAssocValues()null);
		if (rows.at(i)->isAssocNatureExists())
			assocNature.put(rowIndex, enum2CASA1D<SpectralResolutionType,CSpectralResolutionType>(rows.at(i)->getAssocNature()));
		if (rows.at(i)->isAssocConfigDescriptionIdExists())
			assocConfigDescriptionId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAssocConfigDescriptionId()));
		
		rowIndex++;		
	}
}


ASDM_CORRELATORMODE::ASDM_CORRELATORMODE() {
	name_ = "ASDM_CORRELATORMODE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset CorrelatorMode table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("correlatorModeId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseband", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("basebandNames", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("basebandConfig", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("accumMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("binMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAxes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("axesOrderArray", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("filterMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("correlatorName", "blabla"));
}

ASDM_CORRELATORMODE::~ASDM_CORRELATORMODE() {
}

const TableDesc& ASDM_CORRELATORMODE::tableDesc() const {
  return tableDesc_;
}

#include "CorrelatorModeTable.h"
#include "CorrelatorModeRow.h"

using namespace BasebandNameMod;
using namespace AccumModeMod;
using namespace AxisNameMod;
using namespace FilterModeMod;
using namespace CorrelatorNameMod;

void ASDM_CORRELATORMODE::fill(const ASDM& asdm) {
	vector<CorrelatorModeRow*> rows = asdm.getCorrelatorMode().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> correlatorModeId(*table_p_, "correlatorModeId");
	ScalarColumn<> numBaseband(*table_p_, "numBaseband");
	ArrayColumn<String> basebandNames(*table_p_, "basebandNames");
	ArrayColumn<> basebandConfig(*table_p_, "basebandConfig");
	ScalarColumn<String> accumMode(*table_p_, "accumMode");
	ScalarColumn<> binMode(*table_p_, "binMode");
	ScalarColumn<> numAxes(*table_p_, "numAxes");
	ArrayColumn<String> axesOrderArray(*table_p_, "axesOrderArray");
	ArrayColumn<String> filterMode(*table_p_, "filterMode");
	ScalarColumn<String> correlatorName(*table_p_, "correlatorName");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		correlatorModeId.put(rowIndex, rows.at(i)->getCorrelatorModeId().toString());
		numBaseband.put(rowIndex, rows.at(i)->getNumBaseband()null);
		basebandNames.put(rowIndex, enum2CASA1D<BasebandName,CBasebandName>(rows.at(i)->getBasebandNames()));
		basebandConfig.put(rowIndex, null1D<int,null>(rows.at(i)->getBasebandConfig()));
		accumMode.put(rowIndex, CAccumMode::name(rows.at(i)->getAccumMode()));
		binMode.put(rowIndex, rows.at(i)->getBinMode()null);
		numAxes.put(rowIndex, rows.at(i)->getNumAxes()null);
		axesOrderArray.put(rowIndex, enum2CASA1D<AxisName,CAxisName>(rows.at(i)->getAxesOrderArray()));
		filterMode.put(rowIndex, enum2CASA1D<FilterMode,CFilterMode>(rows.at(i)->getFilterMode()));
		correlatorName.put(rowIndex, CCorrelatorName::name(rows.at(i)->getCorrelatorName()));
		
		rowIndex++;		
	}
}


ASDM_DATADESCRIPTION::ASDM_DATADESCRIPTION() {
	name_ = "ASDM_DATADESCRIPTION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset DataDescription table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("dataDescriptionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polOrHoloId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
}

ASDM_DATADESCRIPTION::~ASDM_DATADESCRIPTION() {
}

const TableDesc& ASDM_DATADESCRIPTION::tableDesc() const {
  return tableDesc_;
}

#include "DataDescriptionTable.h"
#include "DataDescriptionRow.h"


void ASDM_DATADESCRIPTION::fill(const ASDM& asdm) {
	vector<DataDescriptionRow*> rows = asdm.getDataDescription().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> dataDescriptionId(*table_p_, "dataDescriptionId");
	ScalarColumn<String> polOrHoloId(*table_p_, "polOrHoloId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		dataDescriptionId.put(rowIndex, rows.at(i)->getDataDescriptionId().toString());
		polOrHoloId.put(rowIndex, rows.at(i)->getPolOrHoloId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		
		rowIndex++;		
	}
}


ASDM_DELAYMODEL::ASDM_DELAYMODEL() {
	name_ = "ASDM_DELAYMODEL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset DelayModel table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseDelay", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseDelayRate", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("groupDelay", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("groupDelayRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("timeOrigin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("atmosphericGroupDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("atmosphericGroupDelayRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("geometricDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("geometricDelayRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numLO", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("LOOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("LOOffsetRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("dispersiveDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("dispersiveDelayRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("atmosphericDryDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("atmosphericWetDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("padDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("antennaDelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("electronicDelay", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("electronicDelayRate", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("receiverDelay", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("IFDelay", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("LODelay", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("crossPolarizationDelay", "blabla"));
}

ASDM_DELAYMODEL::~ASDM_DELAYMODEL() {
}

const TableDesc& ASDM_DELAYMODEL::tableDesc() const {
  return tableDesc_;
}

#include "DelayModelTable.h"
#include "DelayModelRow.h"

using namespace PolarizationTypeMod;

void ASDM_DELAYMODEL::fill(const ASDM& asdm) {
	vector<DelayModelRow*> rows = asdm.getDelayModel().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ArrayColumn<> phaseDelay(*table_p_, "phaseDelay");
	ArrayColumn<> phaseDelayRate(*table_p_, "phaseDelayRate");
	ArrayColumn<> groupDelay(*table_p_, "groupDelay");
	ArrayColumn<> groupDelayRate(*table_p_, "groupDelayRate");
	ScalarColumn<String> fieldId(*table_p_, "fieldId");
	ScalarColumn<double> timeOrigin(*table_p_, "timeOrigin");  
	ScalarColumn<> atmosphericGroupDelay(*table_p_, "atmosphericGroupDelay");  
	ScalarColumn<> atmosphericGroupDelayRate(*table_p_, "atmosphericGroupDelayRate");  
	ScalarColumn<> geometricDelay(*table_p_, "geometricDelay");  
	ScalarColumn<> geometricDelayRate(*table_p_, "geometricDelayRate");  
	ScalarColumn<> numLO(*table_p_, "numLO");  
	ArrayColumn<double> LOOffset(*table_p_, "LOOffset");  
	ArrayColumn<double> LOOffsetRate(*table_p_, "LOOffsetRate");  
	ScalarColumn<> dispersiveDelay(*table_p_, "dispersiveDelay");  
	ScalarColumn<> dispersiveDelayRate(*table_p_, "dispersiveDelayRate");  
	ScalarColumn<> atmosphericDryDelay(*table_p_, "atmosphericDryDelay");  
	ScalarColumn<> atmosphericWetDelay(*table_p_, "atmosphericWetDelay");  
	ScalarColumn<> padDelay(*table_p_, "padDelay");  
	ScalarColumn<> antennaDelay(*table_p_, "antennaDelay");  
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");  
	ArrayColumn<String> polarizationType(*table_p_, "polarizationType");  
	ArrayColumn<> electronicDelay(*table_p_, "electronicDelay");  
	ArrayColumn<> electronicDelayRate(*table_p_, "electronicDelayRate");  
	ArrayColumn<> receiverDelay(*table_p_, "receiverDelay");  
	ArrayColumn<> IFDelay(*table_p_, "IFDelay");  
	ArrayColumn<> LODelay(*table_p_, "LODelay");  
	ScalarColumn<> crossPolarizationDelay(*table_p_, "crossPolarizationDelay");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		phaseDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getPhaseDelay()));
		phaseDelayRate.put(rowIndex, null1D<double,null>(rows.at(i)->getPhaseDelayRate()));
		groupDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getGroupDelay()));
		groupDelayRate.put(rowIndex, null1D<double,null>(rows.at(i)->getGroupDelayRate()));
		fieldId.put(rowIndex, rows.at(i)->getFieldId().toString());
		if (rows.at(i)->isTimeOriginExists())
			timeOrigin.put(rowIndex, rows.at(i)->getTimeOrigin().get()/(1.0e9));
		if (rows.at(i)->isAtmosphericGroupDelayExists())
			atmosphericGroupDelay.put(rowIndex, rows.at(i)->getAtmosphericGroupDelay()null);
		if (rows.at(i)->isAtmosphericGroupDelayRateExists())
			atmosphericGroupDelayRate.put(rowIndex, rows.at(i)->getAtmosphericGroupDelayRate()null);
		if (rows.at(i)->isGeometricDelayExists())
			geometricDelay.put(rowIndex, rows.at(i)->getGeometricDelay()null);
		if (rows.at(i)->isGeometricDelayRateExists())
			geometricDelayRate.put(rowIndex, rows.at(i)->getGeometricDelayRate()null);
		if (rows.at(i)->isNumLOExists())
			numLO.put(rowIndex, rows.at(i)->getNumLO()null);
		if (rows.at(i)->isLOOffsetExists())
			LOOffset.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getLOOffset()));
		if (rows.at(i)->isLOOffsetRateExists())
			LOOffsetRate.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getLOOffsetRate()));
		if (rows.at(i)->isDispersiveDelayExists())
			dispersiveDelay.put(rowIndex, rows.at(i)->getDispersiveDelay()null);
		if (rows.at(i)->isDispersiveDelayRateExists())
			dispersiveDelayRate.put(rowIndex, rows.at(i)->getDispersiveDelayRate()null);
		if (rows.at(i)->isAtmosphericDryDelayExists())
			atmosphericDryDelay.put(rowIndex, rows.at(i)->getAtmosphericDryDelay()null);
		if (rows.at(i)->isAtmosphericWetDelayExists())
			atmosphericWetDelay.put(rowIndex, rows.at(i)->getAtmosphericWetDelay()null);
		if (rows.at(i)->isPadDelayExists())
			padDelay.put(rowIndex, rows.at(i)->getPadDelay()null);
		if (rows.at(i)->isAntennaDelayExists())
			antennaDelay.put(rowIndex, rows.at(i)->getAntennaDelay()null);
		if (rows.at(i)->isNumReceptorExists())
			numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		if (rows.at(i)->isPolarizationTypeExists())
			polarizationType.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationType()));
		if (rows.at(i)->isElectronicDelayExists())
			electronicDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getElectronicDelay()));
		if (rows.at(i)->isElectronicDelayRateExists())
			electronicDelayRate.put(rowIndex, null1D<double,null>(rows.at(i)->getElectronicDelayRate()));
		if (rows.at(i)->isReceiverDelayExists())
			receiverDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getReceiverDelay()));
		if (rows.at(i)->isIFDelayExists())
			IFDelay.put(rowIndex, null1D<double,null>(rows.at(i)->getIFDelay()));
		if (rows.at(i)->isLODelayExists())
			LODelay.put(rowIndex, null1D<double,null>(rows.at(i)->getLODelay()));
		if (rows.at(i)->isCrossPolarizationDelayExists())
			crossPolarizationDelay.put(rowIndex, rows.at(i)->getCrossPolarizationDelay()null);
		
		rowIndex++;		
	}
}


ASDM_DELAYMODELFIXEDPARAMETERS::ASDM_DELAYMODELFIXEDPARAMETERS() {
	name_ = "ASDM_DELAYMODELFIXEDPARAMETERS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset DelayModelFixedParameters table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("delayModelFixedParametersId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("delayModelVersion", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("gaussConstant", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("newtonianConstant", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("gravity", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("earthFlattening", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("earthRadius", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("moonEarthMassRatio", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("ephemerisEpoch", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("earthTideLag", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("earthGM", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("moonGM", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("sunGM", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("loveNumberH", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("loveNumberL", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("precessionConstant", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("lightTime1AU", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("speedOfLight", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("delayModelFlags", "blabla"));
}

ASDM_DELAYMODELFIXEDPARAMETERS::~ASDM_DELAYMODELFIXEDPARAMETERS() {
}

const TableDesc& ASDM_DELAYMODELFIXEDPARAMETERS::tableDesc() const {
  return tableDesc_;
}

#include "DelayModelFixedParametersTable.h"
#include "DelayModelFixedParametersRow.h"


void ASDM_DELAYMODELFIXEDPARAMETERS::fill(const ASDM& asdm) {
	vector<DelayModelFixedParametersRow*> rows = asdm.getDelayModelFixedParameters().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> delayModelFixedParametersId(*table_p_, "delayModelFixedParametersId");
	ScalarColumn<String> delayModelVersion(*table_p_, "delayModelVersion");
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<double> gaussConstant(*table_p_, "gaussConstant");  
	ScalarColumn<> newtonianConstant(*table_p_, "newtonianConstant");  
	ScalarColumn<> gravity(*table_p_, "gravity");  
	ScalarColumn<> earthFlattening(*table_p_, "earthFlattening");  
	ScalarColumn<double> earthRadius(*table_p_, "earthRadius");  
	ScalarColumn<> moonEarthMassRatio(*table_p_, "moonEarthMassRatio");  
	ScalarColumn<String> ephemerisEpoch(*table_p_, "ephemerisEpoch");  
	ScalarColumn<> earthTideLag(*table_p_, "earthTideLag");  
	ScalarColumn<> earthGM(*table_p_, "earthGM");  
	ScalarColumn<> moonGM(*table_p_, "moonGM");  
	ScalarColumn<> sunGM(*table_p_, "sunGM");  
	ScalarColumn<> loveNumberH(*table_p_, "loveNumberH");  
	ScalarColumn<> loveNumberL(*table_p_, "loveNumberL");  
	ScalarColumn<double> precessionConstant(*table_p_, "precessionConstant");  
	ScalarColumn<> lightTime1AU(*table_p_, "lightTime1AU");  
	ScalarColumn<double> speedOfLight(*table_p_, "speedOfLight");  
	ScalarColumn<String> delayModelFlags(*table_p_, "delayModelFlags");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		delayModelFixedParametersId.put(rowIndex, rows.at(i)->getDelayModelFixedParametersId().toString());
		delayModelVersion.put(rowIndex, rows.at(i)->getDelayModelVersion());
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		if (rows.at(i)->isGaussConstantExists())
			gaussConstant.put(rowIndex, rows.at(i)->getGaussConstant().get());
		if (rows.at(i)->isNewtonianConstantExists())
			newtonianConstant.put(rowIndex, rows.at(i)->getNewtonianConstant()null);
		if (rows.at(i)->isGravityExists())
			gravity.put(rowIndex, rows.at(i)->getGravity()null);
		if (rows.at(i)->isEarthFlatteningExists())
			earthFlattening.put(rowIndex, rows.at(i)->getEarthFlattening()null);
		if (rows.at(i)->isEarthRadiusExists())
			earthRadius.put(rowIndex, rows.at(i)->getEarthRadius().get());
		if (rows.at(i)->isMoonEarthMassRatioExists())
			moonEarthMassRatio.put(rowIndex, rows.at(i)->getMoonEarthMassRatio()null);
		if (rows.at(i)->isEphemerisEpochExists())
			ephemerisEpoch.put(rowIndex, rows.at(i)->getEphemerisEpoch());
		if (rows.at(i)->isEarthTideLagExists())
			earthTideLag.put(rowIndex, rows.at(i)->getEarthTideLag()null);
		if (rows.at(i)->isEarthGMExists())
			earthGM.put(rowIndex, rows.at(i)->getEarthGM()null);
		if (rows.at(i)->isMoonGMExists())
			moonGM.put(rowIndex, rows.at(i)->getMoonGM()null);
		if (rows.at(i)->isSunGMExists())
			sunGM.put(rowIndex, rows.at(i)->getSunGM()null);
		if (rows.at(i)->isLoveNumberHExists())
			loveNumberH.put(rowIndex, rows.at(i)->getLoveNumberH()null);
		if (rows.at(i)->isLoveNumberLExists())
			loveNumberL.put(rowIndex, rows.at(i)->getLoveNumberL()null);
		if (rows.at(i)->isPrecessionConstantExists())
			precessionConstant.put(rowIndex, rows.at(i)->getPrecessionConstant().get());
		if (rows.at(i)->isLightTime1AUExists())
			lightTime1AU.put(rowIndex, rows.at(i)->getLightTime1AU()null);
		if (rows.at(i)->isSpeedOfLightExists())
			speedOfLight.put(rowIndex, rows.at(i)->getSpeedOfLight().get());
		if (rows.at(i)->isDelayModelFlagsExists())
			delayModelFlags.put(rowIndex, rows.at(i)->getDelayModelFlags());
		
		rowIndex++;		
	}
}


ASDM_DELAYMODELVARIABLEPARAMETERS::ASDM_DELAYMODELVARIABLEPARAMETERS() {
	name_ = "ASDM_DELAYMODELVARIABLEPARAMETERS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset DelayModelVariableParameters table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("delayModelVariableParametersId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("ut1_utc", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("iat_utc", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("timeType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("gstAtUt0", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("earthRotationRate", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("polarOffsets", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarOffsetsType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("delayModelFixedParametersId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("nutationInLongitude", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("nutationInLongitudeRate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("nutationInObliquity", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("nutationInObliquityRate", "blabla"));
}

ASDM_DELAYMODELVARIABLEPARAMETERS::~ASDM_DELAYMODELVARIABLEPARAMETERS() {
}

const TableDesc& ASDM_DELAYMODELVARIABLEPARAMETERS::tableDesc() const {
  return tableDesc_;
}

#include "DelayModelVariableParametersTable.h"
#include "DelayModelVariableParametersRow.h"

using namespace DifferenceTypeMod;
using namespace DifferenceTypeMod;

void ASDM_DELAYMODELVARIABLEPARAMETERS::fill(const ASDM& asdm) {
	vector<DelayModelVariableParametersRow*> rows = asdm.getDelayModelVariableParameters().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> delayModelVariableParametersId(*table_p_, "delayModelVariableParametersId");
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<> ut1_utc(*table_p_, "ut1_utc");
	ScalarColumn<> iat_utc(*table_p_, "iat_utc");
	ScalarColumn<String> timeType(*table_p_, "timeType");
	ScalarColumn<double> gstAtUt0(*table_p_, "gstAtUt0");
	ScalarColumn<double> earthRotationRate(*table_p_, "earthRotationRate");
	ArrayColumn<> polarOffsets(*table_p_, "polarOffsets");
	ScalarColumn<String> polarOffsetsType(*table_p_, "polarOffsetsType");
	ScalarColumn<String> delayModelFixedParametersId(*table_p_, "delayModelFixedParametersId");
	ScalarColumn<double> nutationInLongitude(*table_p_, "nutationInLongitude");  
	ScalarColumn<double> nutationInLongitudeRate(*table_p_, "nutationInLongitudeRate");  
	ScalarColumn<double> nutationInObliquity(*table_p_, "nutationInObliquity");  
	ScalarColumn<double> nutationInObliquityRate(*table_p_, "nutationInObliquityRate");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		delayModelVariableParametersId.put(rowIndex, rows.at(i)->getDelayModelVariableParametersId().toString());
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		ut1_utc.put(rowIndex, rows.at(i)->getUt1_utc()null);
		iat_utc.put(rowIndex, rows.at(i)->getIat_utc()null);
		timeType.put(rowIndex, CDifferenceType::name(rows.at(i)->getTimeType()));
		gstAtUt0.put(rowIndex, rows.at(i)->getGstAtUt0().get());
		earthRotationRate.put(rowIndex, rows.at(i)->getEarthRotationRate().get());
		polarOffsets.put(rowIndex, null1D<double,null>(rows.at(i)->getPolarOffsets()));
		polarOffsetsType.put(rowIndex, CDifferenceType::name(rows.at(i)->getPolarOffsetsType()));
		delayModelFixedParametersId.put(rowIndex, rows.at(i)->getDelayModelFixedParametersId().toString());
		if (rows.at(i)->isNutationInLongitudeExists())
			nutationInLongitude.put(rowIndex, rows.at(i)->getNutationInLongitude().get());
		if (rows.at(i)->isNutationInLongitudeRateExists())
			nutationInLongitudeRate.put(rowIndex, rows.at(i)->getNutationInLongitudeRate().get());
		if (rows.at(i)->isNutationInObliquityExists())
			nutationInObliquity.put(rowIndex, rows.at(i)->getNutationInObliquity().get());
		if (rows.at(i)->isNutationInObliquityRateExists())
			nutationInObliquityRate.put(rowIndex, rows.at(i)->getNutationInObliquityRate().get());
		
		rowIndex++;		
	}
}


ASDM_DOPPLER::ASDM_DOPPLER() {
	name_ = "ASDM_DOPPLER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Doppler table";
	tableDesc_.addColumn(ScalarColumnDesc<>("dopplerId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("sourceId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("transitionIndex", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("velDef", "blabla"));
}

ASDM_DOPPLER::~ASDM_DOPPLER() {
}

const TableDesc& ASDM_DOPPLER::tableDesc() const {
  return tableDesc_;
}

#include "DopplerTable.h"
#include "DopplerRow.h"

using namespace DopplerReferenceCodeMod;

void ASDM_DOPPLER::fill(const ASDM& asdm) {
	vector<DopplerRow*> rows = asdm.getDoppler().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<> dopplerId(*table_p_, "dopplerId");
	ScalarColumn<> sourceId(*table_p_, "sourceId");
	ScalarColumn<> transitionIndex(*table_p_, "transitionIndex");
	ScalarColumn<String> velDef(*table_p_, "velDef");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		dopplerId.put(rowIndex, rows.at(i)->getDopplerId()null);
		sourceId.put(rowIndex, rows.at(i)->getSourceId()null);
		transitionIndex.put(rowIndex, rows.at(i)->getTransitionIndex()null);
		velDef.put(rowIndex, CDopplerReferenceCode::name(rows.at(i)->getVelDef()));
		
		rowIndex++;		
	}
}


ASDM_EPHEMERIS::ASDM_EPHEMERIS() {
	name_ = "ASDM_EPHEMERIS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Ephemeris table";
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("ephemerisId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("observerLocation", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("equinoxEquator", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPolyDir", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("dir", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPolyDist", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("distance", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("timeOrigin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("origin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPolyRadVel", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("radVel", "blabla"));
}

ASDM_EPHEMERIS::~ASDM_EPHEMERIS() {
}

const TableDesc& ASDM_EPHEMERIS::tableDesc() const {
  return tableDesc_;
}

#include "EphemerisTable.h"
#include "EphemerisRow.h"


void ASDM_EPHEMERIS::fill(const ASDM& asdm) {
	vector<EphemerisRow*> rows = asdm.getEphemeris().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> ephemerisId(*table_p_, "ephemerisId");
	ArrayColumn<> observerLocation(*table_p_, "observerLocation");
	ScalarColumn<> equinoxEquator(*table_p_, "equinoxEquator");
	ScalarColumn<> numPolyDir(*table_p_, "numPolyDir");
	ArrayColumn<> dir(*table_p_, "dir");
	ScalarColumn<> numPolyDist(*table_p_, "numPolyDist");
	ArrayColumn<> distance(*table_p_, "distance");
	ScalarColumn<double> timeOrigin(*table_p_, "timeOrigin");
	ScalarColumn<String> origin(*table_p_, "origin");
	ScalarColumn<> numPolyRadVel(*table_p_, "numPolyRadVel");  
	ArrayColumn<> radVel(*table_p_, "radVel");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		ephemerisId.put(rowIndex, rows.at(i)->getEphemerisId()null);
		observerLocation.put(rowIndex, null1D<double,null>(rows.at(i)->getObserverLocation()));
		equinoxEquator.put(rowIndex, rows.at(i)->getEquinoxEquator()null);
		numPolyDir.put(rowIndex, rows.at(i)->getNumPolyDir()null);
		dir.put(rowIndex, null2D<double,null>(rows.at(i)->getDir()));
		numPolyDist.put(rowIndex, rows.at(i)->getNumPolyDist()null);
		distance.put(rowIndex, null1D<double,null>(rows.at(i)->getDistance()));
		timeOrigin.put(rowIndex, rows.at(i)->getTimeOrigin().get()/(1.0e9));
		origin.put(rowIndex, rows.at(i)->getOrigin());
		if (rows.at(i)->isNumPolyRadVelExists())
			numPolyRadVel.put(rowIndex, rows.at(i)->getNumPolyRadVel()null);
		if (rows.at(i)->isRadVelExists())
			radVel.put(rowIndex, null1D<double,null>(rows.at(i)->getRadVel()));
		
		rowIndex++;		
	}
}


ASDM_EXECBLOCK::ASDM_EXECBLOCK() {
	name_ = "ASDM_EXECBLOCK";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset ExecBlock table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("execBlockNum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("projectUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("configName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("telescopeName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("observerName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numObservingLog", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("observingLog", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sessionReference", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("baseRangeMin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("baseRangeMax", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("baseRmsMinor", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("baseRmsMajor", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("basePa", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("aborted", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sBSummaryId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("releaseDate", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("schedulerMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("siteAltitude", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("siteLongitude", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("siteLatitude", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("observingScript", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("observingScriptUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("scaleId", "blabla"));
}

ASDM_EXECBLOCK::~ASDM_EXECBLOCK() {
}

const TableDesc& ASDM_EXECBLOCK::tableDesc() const {
  return tableDesc_;
}

#include "ExecBlockTable.h"
#include "ExecBlockRow.h"


void ASDM_EXECBLOCK::fill(const ASDM& asdm) {
	vector<ExecBlockRow*> rows = asdm.getExecBlock().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<double> startTime(*table_p_, "startTime");
	ScalarColumn<double> endTime(*table_p_, "endTime");
	ScalarColumn<> execBlockNum(*table_p_, "execBlockNum");
	ScalarColumn<String> execBlockUID(*table_p_, "execBlockUID");
	ScalarColumn<String> projectUID(*table_p_, "projectUID");
	ScalarColumn<String> configName(*table_p_, "configName");
	ScalarColumn<String> telescopeName(*table_p_, "telescopeName");
	ScalarColumn<String> observerName(*table_p_, "observerName");
	ScalarColumn<> numObservingLog(*table_p_, "numObservingLog");
	ArrayColumn<String> observingLog(*table_p_, "observingLog");
	ScalarColumn<String> sessionReference(*table_p_, "sessionReference");
	ScalarColumn<double> baseRangeMin(*table_p_, "baseRangeMin");
	ScalarColumn<double> baseRangeMax(*table_p_, "baseRangeMax");
	ScalarColumn<double> baseRmsMinor(*table_p_, "baseRmsMinor");
	ScalarColumn<double> baseRmsMajor(*table_p_, "baseRmsMajor");
	ScalarColumn<double> basePa(*table_p_, "basePa");
	ScalarColumn<> aborted(*table_p_, "aborted");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ArrayColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> sBSummaryId(*table_p_, "sBSummaryId");
	ScalarColumn<double> releaseDate(*table_p_, "releaseDate");  
	ScalarColumn<String> schedulerMode(*table_p_, "schedulerMode");  
	ScalarColumn<double> siteAltitude(*table_p_, "siteAltitude");  
	ScalarColumn<double> siteLongitude(*table_p_, "siteLongitude");  
	ScalarColumn<double> siteLatitude(*table_p_, "siteLatitude");  
	ScalarColumn<String> observingScript(*table_p_, "observingScript");  
	ScalarColumn<String> observingScriptUID(*table_p_, "observingScriptUID");  
	ScalarColumn<String> scaleId(*table_p_, "scaleId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		startTime.put(rowIndex, rows.at(i)->getStartTime().get()/(1.0e9));
		endTime.put(rowIndex, rows.at(i)->getEndTime().get()/(1.0e9));
		execBlockNum.put(rowIndex, rows.at(i)->getExecBlockNum()null);
		execBlockUID.put(rowIndex, rows.at(i)->getExecBlockUID().toString());
		projectUID.put(rowIndex, rows.at(i)->getProjectUID().toString());
		configName.put(rowIndex, rows.at(i)->getConfigName());
		telescopeName.put(rowIndex, rows.at(i)->getTelescopeName());
		observerName.put(rowIndex, rows.at(i)->getObserverName());
		numObservingLog.put(rowIndex, rows.at(i)->getNumObservingLog()null);
		observingLog.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getObservingLog()));
		sessionReference.put(rowIndex, rows.at(i)->getSessionReference().toString());
		baseRangeMin.put(rowIndex, rows.at(i)->getBaseRangeMin().get());
		baseRangeMax.put(rowIndex, rows.at(i)->getBaseRangeMax().get());
		baseRmsMinor.put(rowIndex, rows.at(i)->getBaseRmsMinor().get());
		baseRmsMajor.put(rowIndex, rows.at(i)->getBaseRmsMajor().get());
		basePa.put(rowIndex, rows.at(i)->getBasePa().get());
		aborted.put(rowIndex, rows.at(i)->getAborted()null);
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		antennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAntennaId()));
		sBSummaryId.put(rowIndex, rows.at(i)->getSBSummaryId().toString());
		if (rows.at(i)->isReleaseDateExists())
			releaseDate.put(rowIndex, rows.at(i)->getReleaseDate().get()/(1.0e9));
		if (rows.at(i)->isSchedulerModeExists())
			schedulerMode.put(rowIndex, rows.at(i)->getSchedulerMode());
		if (rows.at(i)->isSiteAltitudeExists())
			siteAltitude.put(rowIndex, rows.at(i)->getSiteAltitude().get());
		if (rows.at(i)->isSiteLongitudeExists())
			siteLongitude.put(rowIndex, rows.at(i)->getSiteLongitude().get());
		if (rows.at(i)->isSiteLatitudeExists())
			siteLatitude.put(rowIndex, rows.at(i)->getSiteLatitude().get());
		if (rows.at(i)->isObservingScriptExists())
			observingScript.put(rowIndex, rows.at(i)->getObservingScript());
		if (rows.at(i)->isObservingScriptUIDExists())
			observingScriptUID.put(rowIndex, rows.at(i)->getObservingScriptUID().toString());
		if (rows.at(i)->isScaleIdExists())
			scaleId.put(rowIndex, rows.at(i)->getScaleId().toString());
		
		rowIndex++;		
	}
}


ASDM_FEED::ASDM_FEED() {
	name_ = "ASDM_FEED";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Feed table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("beamOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusReference", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationTypes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polResponse", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("receptorAngle", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("receiverId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedNum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("illumOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("position", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("skyCoupling", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChan", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("skyCouplingSpectrum", "blabla"));
}

ASDM_FEED::~ASDM_FEED() {
}

const TableDesc& ASDM_FEED::tableDesc() const {
  return tableDesc_;
}

#include "FeedTable.h"
#include "FeedRow.h"

using namespace PolarizationTypeMod;

void ASDM_FEED::fill(const ASDM& asdm) {
	vector<FeedRow*> rows = asdm.getFeed().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> beamOffset(*table_p_, "beamOffset");
	ArrayColumn<double> focusReference(*table_p_, "focusReference");
	ArrayColumn<String> polarizationTypes(*table_p_, "polarizationTypes");
	ArrayColumn<String> polResponse(*table_p_, "polResponse");
	ArrayColumn<double> receptorAngle(*table_p_, "receptorAngle");
	ArrayColumn<> receiverId(*table_p_, "receiverId");
	ScalarColumn<> feedNum(*table_p_, "feedNum");  
	ArrayColumn<double> illumOffset(*table_p_, "illumOffset");  
	ArrayColumn<double> position(*table_p_, "position");  
	ScalarColumn<> skyCoupling(*table_p_, "skyCoupling");  
	ScalarColumn<> numChan(*table_p_, "numChan");  
	ArrayColumn<> skyCouplingSpectrum(*table_p_, "skyCouplingSpectrum");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		beamOffset.put(rowIndex, null2D<double,null>(rows.at(i)->getBeamOffset()));
		focusReference.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getFocusReference()));
		polarizationTypes.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationTypes()));
		polResponse.put(rowIndex, _2CASAString2D<asdm::Complex,String>(rows.at(i)->getPolResponse()));
		receptorAngle.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getReceptorAngle()));
		receiverId.put(rowIndex, null1D<int,null>(rows.at(i)->getReceiverId()));
		if (rows.at(i)->isFeedNumExists())
			feedNum.put(rowIndex, rows.at(i)->getFeedNum()null);
		if (rows.at(i)->isIllumOffsetExists())
			illumOffset.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getIllumOffset()));
		if (rows.at(i)->isPositionExists())
			position.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPosition()));
		if (rows.at(i)->isSkyCouplingExists())
			skyCoupling.put(rowIndex, rows.at(i)->getSkyCoupling()null);
		if (rows.at(i)->isNumChanExists())
			numChan.put(rowIndex, rows.at(i)->getNumChan()null);
		if (rows.at(i)->isSkyCouplingSpectrumExists())
			skyCouplingSpectrum.put(rowIndex, null1D<float,null>(rows.at(i)->getSkyCouplingSpectrum()));
		
		rowIndex++;		
	}
}


ASDM_FIELD::ASDM_FIELD() {
	name_ = "ASDM_FIELD";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Field table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("delayDir", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("phaseDir", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("referenceDir", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("code", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("directionCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("directionEquinox", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocNature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("ephemerisId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("sourceId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocFieldId", "blabla"));
}

ASDM_FIELD::~ASDM_FIELD() {
}

const TableDesc& ASDM_FIELD::tableDesc() const {
  return tableDesc_;
}

#include "FieldTable.h"
#include "FieldRow.h"

using namespace DirectionReferenceCodeMod;

void ASDM_FIELD::fill(const ASDM& asdm) {
	vector<FieldRow*> rows = asdm.getField().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> fieldId(*table_p_, "fieldId");
	ScalarColumn<String> fieldName(*table_p_, "fieldName");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ArrayColumn<double> delayDir(*table_p_, "delayDir");
	ArrayColumn<double> phaseDir(*table_p_, "phaseDir");
	ArrayColumn<double> referenceDir(*table_p_, "referenceDir");
	ScalarColumn<double> time(*table_p_, "time");  
	ScalarColumn<String> code(*table_p_, "code");  
	ScalarColumn<String> directionCode(*table_p_, "directionCode");  
	ScalarColumn<double> directionEquinox(*table_p_, "directionEquinox");  
	ScalarColumn<String> assocNature(*table_p_, "assocNature");  
	ScalarColumn<> ephemerisId(*table_p_, "ephemerisId");  
	ScalarColumn<> sourceId(*table_p_, "sourceId");  
	ScalarColumn<String> assocFieldId(*table_p_, "assocFieldId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		fieldId.put(rowIndex, rows.at(i)->getFieldId().toString());
		fieldName.put(rowIndex, rows.at(i)->getFieldName());
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		delayDir.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getDelayDir()));
		phaseDir.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getPhaseDir()));
		referenceDir.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getReferenceDir()));
		if (rows.at(i)->isTimeExists())
			time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		if (rows.at(i)->isCodeExists())
			code.put(rowIndex, rows.at(i)->getCode());
		if (rows.at(i)->isDirectionCodeExists())
			directionCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getDirectionCode()));
		if (rows.at(i)->isDirectionEquinoxExists())
			directionEquinox.put(rowIndex, rows.at(i)->getDirectionEquinox().get()/(1.0e9));
		if (rows.at(i)->isAssocNatureExists())
			assocNature.put(rowIndex, rows.at(i)->getAssocNature());
		if (rows.at(i)->isEphemerisIdExists())
			ephemerisId.put(rowIndex, rows.at(i)->getEphemerisId()null);
		if (rows.at(i)->isSourceIdExists())
			sourceId.put(rowIndex, rows.at(i)->getSourceId()null);
		if (rows.at(i)->isAssocFieldIdExists())
			assocFieldId.put(rowIndex, rows.at(i)->getAssocFieldId().toString());
		
		rowIndex++;		
	}
}


ASDM_FLAG::ASDM_FLAG() {
	name_ = "ASDM_FLAG";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Flag table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("flagId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("reason", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPolarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSpectralWindow", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPairedAntenna", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("pairedAntennaId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("spectralWindowId", "blabla"));
}

ASDM_FLAG::~ASDM_FLAG() {
}

const TableDesc& ASDM_FLAG::tableDesc() const {
  return tableDesc_;
}

#include "FlagTable.h"
#include "FlagRow.h"

using namespace PolarizationTypeMod;

void ASDM_FLAG::fill(const ASDM& asdm) {
	vector<FlagRow*> rows = asdm.getFlag().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> flagId(*table_p_, "flagId");
	ScalarColumn<double> startTime(*table_p_, "startTime");
	ScalarColumn<double> endTime(*table_p_, "endTime");
	ScalarColumn<String> reason(*table_p_, "reason");
	ScalarColumn<> numAntenna(*table_p_, "numAntenna");
	ArrayColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<> numPolarizationType(*table_p_, "numPolarizationType");  
	ScalarColumn<> numSpectralWindow(*table_p_, "numSpectralWindow");  
	ScalarColumn<> numPairedAntenna(*table_p_, "numPairedAntenna");  
	ArrayColumn<String> polarizationType(*table_p_, "polarizationType");  
	ArrayColumn<String> pairedAntennaId(*table_p_, "pairedAntennaId");  
	ArrayColumn<String> spectralWindowId(*table_p_, "spectralWindowId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		flagId.put(rowIndex, rows.at(i)->getFlagId().toString());
		startTime.put(rowIndex, rows.at(i)->getStartTime().get()/(1.0e9));
		endTime.put(rowIndex, rows.at(i)->getEndTime().get()/(1.0e9));
		reason.put(rowIndex, rows.at(i)->getReason());
		numAntenna.put(rowIndex, rows.at(i)->getNumAntenna()null);
		antennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAntennaId()));
		if (rows.at(i)->isNumPolarizationTypeExists())
			numPolarizationType.put(rowIndex, rows.at(i)->getNumPolarizationType()null);
		if (rows.at(i)->isNumSpectralWindowExists())
			numSpectralWindow.put(rowIndex, rows.at(i)->getNumSpectralWindow()null);
		if (rows.at(i)->isNumPairedAntennaExists())
			numPairedAntenna.put(rowIndex, rows.at(i)->getNumPairedAntenna()null);
		if (rows.at(i)->isPolarizationTypeExists())
			polarizationType.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationType()));
		if (rows.at(i)->isPairedAntennaIdExists())
			pairedAntennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getPairedAntennaId()));
		if (rows.at(i)->isSpectralWindowIdExists())
			spectralWindowId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getSpectralWindowId()));
		
		rowIndex++;		
	}
}


ASDM_FLAGCMD::ASDM_FLAGCMD() {
	name_ = "ASDM_FLAGCMD";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset FlagCmd table";
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("type", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("reason", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("level", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("severity", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("applied", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("command", "blabla"));
}

ASDM_FLAGCMD::~ASDM_FLAGCMD() {
}

const TableDesc& ASDM_FLAGCMD::tableDesc() const {
  return tableDesc_;
}

#include "FlagCmdTable.h"
#include "FlagCmdRow.h"


void ASDM_FLAGCMD::fill(const ASDM& asdm) {
	vector<FlagCmdRow*> rows = asdm.getFlagCmd().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<String> type(*table_p_, "type");
	ScalarColumn<String> reason(*table_p_, "reason");
	ScalarColumn<> level(*table_p_, "level");
	ScalarColumn<> severity(*table_p_, "severity");
	ScalarColumn<> applied(*table_p_, "applied");
	ScalarColumn<String> command(*table_p_, "command");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		type.put(rowIndex, rows.at(i)->getType());
		reason.put(rowIndex, rows.at(i)->getReason());
		level.put(rowIndex, rows.at(i)->getLevel()null);
		severity.put(rowIndex, rows.at(i)->getSeverity()null);
		applied.put(rowIndex, rows.at(i)->getApplied()null);
		command.put(rowIndex, rows.at(i)->getCommand());
		
		rowIndex++;		
	}
}


ASDM_FOCUS::ASDM_FOCUS() {
	name_ = "ASDM_FOCUS";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Focus table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("focusTracking", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusOffset", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("focusRotationOffset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("focusModelId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("measuredFocusPosition", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("measuredFocusRotation", "blabla"));
}

ASDM_FOCUS::~ASDM_FOCUS() {
}

const TableDesc& ASDM_FOCUS::tableDesc() const {
  return tableDesc_;
}

#include "FocusTable.h"
#include "FocusRow.h"


void ASDM_FOCUS::fill(const ASDM& asdm) {
	vector<FocusRow*> rows = asdm.getFocus().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> focusTracking(*table_p_, "focusTracking");
	ArrayColumn<double> focusOffset(*table_p_, "focusOffset");
	ArrayColumn<double> focusRotationOffset(*table_p_, "focusRotationOffset");
	ScalarColumn<> focusModelId(*table_p_, "focusModelId");
	ArrayColumn<double> measuredFocusPosition(*table_p_, "measuredFocusPosition");  
	ArrayColumn<double> measuredFocusRotation(*table_p_, "measuredFocusRotation");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		focusTracking.put(rowIndex, rows.at(i)->getFocusTracking()null);
		focusOffset.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getFocusOffset()));
		focusRotationOffset.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getFocusRotationOffset()));
		focusModelId.put(rowIndex, rows.at(i)->getFocusModelId()null);
		if (rows.at(i)->isMeasuredFocusPositionExists())
			measuredFocusPosition.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getMeasuredFocusPosition()));
		if (rows.at(i)->isMeasuredFocusRotationExists())
			measuredFocusRotation.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getMeasuredFocusRotation()));
		
		rowIndex++;		
	}
}


ASDM_FOCUSMODEL::ASDM_FOCUSMODEL() {
	name_ = "ASDM_FOCUSMODEL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset FocusModel table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("focusModelId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCoeff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffFormula", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffVal", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocNature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("assocFocusModelId", "blabla"));
}

ASDM_FOCUSMODEL::~ASDM_FOCUSMODEL() {
}

const TableDesc& ASDM_FOCUSMODEL::tableDesc() const {
  return tableDesc_;
}

#include "FocusModelTable.h"
#include "FocusModelRow.h"

using namespace PolarizationTypeMod;
using namespace ReceiverBandMod;

void ASDM_FOCUSMODEL::fill(const ASDM& asdm) {
	vector<FocusModelRow*> rows = asdm.getFocusModel().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<> focusModelId(*table_p_, "focusModelId");
	ScalarColumn<String> polarizationType(*table_p_, "polarizationType");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<> numCoeff(*table_p_, "numCoeff");
	ArrayColumn<String> coeffName(*table_p_, "coeffName");
	ArrayColumn<String> coeffFormula(*table_p_, "coeffFormula");
	ArrayColumn<> coeffVal(*table_p_, "coeffVal");
	ScalarColumn<String> assocNature(*table_p_, "assocNature");
	ScalarColumn<> assocFocusModelId(*table_p_, "assocFocusModelId");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		focusModelId.put(rowIndex, rows.at(i)->getFocusModelId()null);
		polarizationType.put(rowIndex, CPolarizationType::name(rows.at(i)->getPolarizationType()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		numCoeff.put(rowIndex, rows.at(i)->getNumCoeff()null);
		coeffName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffName()));
		coeffFormula.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffFormula()));
		coeffVal.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffVal()));
		assocNature.put(rowIndex, rows.at(i)->getAssocNature());
		assocFocusModelId.put(rowIndex, rows.at(i)->getAssocFocusModelId()null);
		
		rowIndex++;		
	}
}


ASDM_FREQOFFSET::ASDM_FREQOFFSET() {
	name_ = "ASDM_FREQOFFSET";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset FreqOffset table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("offset", "blabla"));
}

ASDM_FREQOFFSET::~ASDM_FREQOFFSET() {
}

const TableDesc& ASDM_FREQOFFSET::tableDesc() const {
  return tableDesc_;
}

#include "FreqOffsetTable.h"
#include "FreqOffsetRow.h"


void ASDM_FREQOFFSET::fill(const ASDM& asdm) {
	vector<FreqOffsetRow*> rows = asdm.getFreqOffset().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ScalarColumn<double> offset(*table_p_, "offset");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		offset.put(rowIndex, rows.at(i)->getOffset().get());
		
		rowIndex++;		
	}
}


ASDM_GAINTRACKING::ASDM_GAINTRACKING() {
	name_ = "ASDM_GAINTRACKING";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset GainTracking table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("attenuator", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("samplingLevel", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAttFreq", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("attFreq", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("attSpectrum", "blabla"));
}

ASDM_GAINTRACKING::~ASDM_GAINTRACKING() {
}

const TableDesc& ASDM_GAINTRACKING::tableDesc() const {
  return tableDesc_;
}

#include "GainTrackingTable.h"
#include "GainTrackingRow.h"

using namespace PolarizationTypeMod;

void ASDM_GAINTRACKING::fill(const ASDM& asdm) {
	vector<GainTrackingRow*> rows = asdm.getGainTracking().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> attenuator(*table_p_, "attenuator");
	ArrayColumn<String> polarizationType(*table_p_, "polarizationType");
	ScalarColumn<> samplingLevel(*table_p_, "samplingLevel");  
	ScalarColumn<> numAttFreq(*table_p_, "numAttFreq");  
	ArrayColumn<> attFreq(*table_p_, "attFreq");  
	ArrayColumn<String> attSpectrum(*table_p_, "attSpectrum");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		attenuator.put(rowIndex, null1D<float,null>(rows.at(i)->getAttenuator()));
		polarizationType.put(rowIndex, enum2CASA1D<PolarizationType,CPolarizationType>(rows.at(i)->getPolarizationType()));
		if (rows.at(i)->isSamplingLevelExists())
			samplingLevel.put(rowIndex, rows.at(i)->getSamplingLevel()null);
		if (rows.at(i)->isNumAttFreqExists())
			numAttFreq.put(rowIndex, rows.at(i)->getNumAttFreq()null);
		if (rows.at(i)->isAttFreqExists())
			attFreq.put(rowIndex, null1D<double,null>(rows.at(i)->getAttFreq()));
		if (rows.at(i)->isAttSpectrumExists())
			attSpectrum.put(rowIndex, _2CASAString1D<asdm::Complex,String>(rows.at(i)->getAttSpectrum()));
		
		rowIndex++;		
	}
}


ASDM_HISTORY::ASDM_HISTORY() {
	name_ = "ASDM_HISTORY";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset History table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("message", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("priority", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("origin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("objectId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("application", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("cliCommand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("appParms", "blabla"));
}

ASDM_HISTORY::~ASDM_HISTORY() {
}

const TableDesc& ASDM_HISTORY::tableDesc() const {
  return tableDesc_;
}

#include "HistoryTable.h"
#include "HistoryRow.h"


void ASDM_HISTORY::fill(const ASDM& asdm) {
	vector<HistoryRow*> rows = asdm.getHistory().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<String> message(*table_p_, "message");
	ScalarColumn<String> priority(*table_p_, "priority");
	ScalarColumn<String> origin(*table_p_, "origin");
	ScalarColumn<String> objectId(*table_p_, "objectId");
	ScalarColumn<String> application(*table_p_, "application");
	ScalarColumn<String> cliCommand(*table_p_, "cliCommand");
	ScalarColumn<String> appParms(*table_p_, "appParms");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		message.put(rowIndex, rows.at(i)->getMessage());
		priority.put(rowIndex, rows.at(i)->getPriority());
		origin.put(rowIndex, rows.at(i)->getOrigin());
		objectId.put(rowIndex, rows.at(i)->getObjectId());
		application.put(rowIndex, rows.at(i)->getApplication());
		cliCommand.put(rowIndex, rows.at(i)->getCliCommand());
		appParms.put(rowIndex, rows.at(i)->getAppParms());
		
		rowIndex++;		
	}
}


ASDM_HOLOGRAPHY::ASDM_HOLOGRAPHY() {
	name_ = "ASDM_HOLOGRAPHY";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Holography table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("holographyId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("distance", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("focus", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCorr", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("type", "blabla"));
}

ASDM_HOLOGRAPHY::~ASDM_HOLOGRAPHY() {
}

const TableDesc& ASDM_HOLOGRAPHY::tableDesc() const {
  return tableDesc_;
}

#include "HolographyTable.h"
#include "HolographyRow.h"

using namespace HolographyChannelTypeMod;

void ASDM_HOLOGRAPHY::fill(const ASDM& asdm) {
	vector<HolographyRow*> rows = asdm.getHolography().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> holographyId(*table_p_, "holographyId");
	ScalarColumn<double> distance(*table_p_, "distance");
	ScalarColumn<double> focus(*table_p_, "focus");
	ScalarColumn<> numCorr(*table_p_, "numCorr");
	ArrayColumn<String> type(*table_p_, "type");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		holographyId.put(rowIndex, rows.at(i)->getHolographyId().toString());
		distance.put(rowIndex, rows.at(i)->getDistance().get());
		focus.put(rowIndex, rows.at(i)->getFocus().get());
		numCorr.put(rowIndex, rows.at(i)->getNumCorr()null);
		type.put(rowIndex, enum2CASA1D<HolographyChannelType,CHolographyChannelType>(rows.at(i)->getType()));
		
		rowIndex++;		
	}
}


ASDM_OBSERVATION::ASDM_OBSERVATION() {
	name_ = "ASDM_OBSERVATION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Observation table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("observationId", "blabla"));
}

ASDM_OBSERVATION::~ASDM_OBSERVATION() {
}

const TableDesc& ASDM_OBSERVATION::tableDesc() const {
  return tableDesc_;
}

#include "ObservationTable.h"
#include "ObservationRow.h"


void ASDM_OBSERVATION::fill(const ASDM& asdm) {
	vector<ObservationRow*> rows = asdm.getObservation().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> observationId(*table_p_, "observationId");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		observationId.put(rowIndex, rows.at(i)->getObservationId().toString());
		
		rowIndex++;		
	}
}


ASDM_POINTING::ASDM_POINTING() {
	name_ = "ASDM_POINTING";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Pointing table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSample", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("encoder", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("pointingTracking", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("usePolynomials", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("timeOrigin", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numTerm", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("pointingDirection", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("target", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("offset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("pointingModelId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("overTheTop", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("sourceOffset", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceOffsetReferenceCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("sourceOffsetEquinox", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("sampledTimeInterval", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("atmosphericCorrection", "blabla"));
}

ASDM_POINTING::~ASDM_POINTING() {
}

const TableDesc& ASDM_POINTING::tableDesc() const {
  return tableDesc_;
}

#include "PointingTable.h"
#include "PointingRow.h"

using namespace DirectionReferenceCodeMod;

void ASDM_POINTING::fill(const ASDM& asdm) {
	vector<PointingRow*> rows = asdm.getPointing().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> numSample(*table_p_, "numSample");
	ArrayColumn<double> encoder(*table_p_, "encoder");
	ScalarColumn<> pointingTracking(*table_p_, "pointingTracking");
	ScalarColumn<> usePolynomials(*table_p_, "usePolynomials");
	ScalarColumn<double> timeOrigin(*table_p_, "timeOrigin");
	ScalarColumn<> numTerm(*table_p_, "numTerm");
	ArrayColumn<double> pointingDirection(*table_p_, "pointingDirection");
	ArrayColumn<double> target(*table_p_, "target");
	ArrayColumn<double> offset(*table_p_, "offset");
	ScalarColumn<> pointingModelId(*table_p_, "pointingModelId");
	ScalarColumn<> overTheTop(*table_p_, "overTheTop");  
	ArrayColumn<double> sourceOffset(*table_p_, "sourceOffset");  
	ScalarColumn<String> sourceOffsetReferenceCode(*table_p_, "sourceOffsetReferenceCode");  
	ScalarColumn<double> sourceOffsetEquinox(*table_p_, "sourceOffsetEquinox");  
	ArrayColumn<double> sampledTimeInterval(*table_p_, "sampledTimeInterval");  
	ArrayColumn<double> atmosphericCorrection(*table_p_, "atmosphericCorrection");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		numSample.put(rowIndex, rows.at(i)->getNumSample()null);
		encoder.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getEncoder()));
		pointingTracking.put(rowIndex, rows.at(i)->getPointingTracking()null);
		usePolynomials.put(rowIndex, rows.at(i)->getUsePolynomials()null);
		timeOrigin.put(rowIndex, rows.at(i)->getTimeOrigin().get()/(1.0e9));
		numTerm.put(rowIndex, rows.at(i)->getNumTerm()null);
		pointingDirection.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getPointingDirection()));
		target.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getTarget()));
		offset.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getOffset()));
		pointingModelId.put(rowIndex, rows.at(i)->getPointingModelId()null);
		if (rows.at(i)->isOverTheTopExists())
			overTheTop.put(rowIndex, rows.at(i)->getOverTheTop()null);
		if (rows.at(i)->isSourceOffsetExists())
			sourceOffset.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getSourceOffset()));
		if (rows.at(i)->isSourceOffsetReferenceCodeExists())
			sourceOffsetReferenceCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getSourceOffsetReferenceCode()));
		if (rows.at(i)->isSourceOffsetEquinoxExists())
			sourceOffsetEquinox.put(rowIndex, rows.at(i)->getSourceOffsetEquinox().get()/(1.0e9));
		if (rows.at(i)->isSampledTimeIntervalExists())
			sampledTimeInterval.put(rowIndex, ati2CASA2D<double>(rows.at(i)->getSampledTimeInterval()));
		if (rows.at(i)->isAtmosphericCorrectionExists())
			atmosphericCorrection.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getAtmosphericCorrection()));
		
		rowIndex++;		
	}
}


ASDM_POINTINGMODEL::ASDM_POINTINGMODEL() {
	name_ = "ASDM_POINTINGMODEL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset PointingModel table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("pointingModelId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCoeff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("coeffVal", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarizationType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("assocNature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("assocPointingModelId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("coeffFormula", "blabla"));
}

ASDM_POINTINGMODEL::~ASDM_POINTINGMODEL() {
}

const TableDesc& ASDM_POINTINGMODEL::tableDesc() const {
  return tableDesc_;
}

#include "PointingModelTable.h"
#include "PointingModelRow.h"

using namespace PolarizationTypeMod;
using namespace ReceiverBandMod;

void ASDM_POINTINGMODEL::fill(const ASDM& asdm) {
	vector<PointingModelRow*> rows = asdm.getPointingModel().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<> pointingModelId(*table_p_, "pointingModelId");
	ScalarColumn<> numCoeff(*table_p_, "numCoeff");
	ArrayColumn<String> coeffName(*table_p_, "coeffName");
	ArrayColumn<> coeffVal(*table_p_, "coeffVal");
	ScalarColumn<String> polarizationType(*table_p_, "polarizationType");
	ScalarColumn<String> receiverBand(*table_p_, "receiverBand");
	ScalarColumn<String> assocNature(*table_p_, "assocNature");
	ScalarColumn<> assocPointingModelId(*table_p_, "assocPointingModelId");
	ArrayColumn<String> coeffFormula(*table_p_, "coeffFormula");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		pointingModelId.put(rowIndex, rows.at(i)->getPointingModelId()null);
		numCoeff.put(rowIndex, rows.at(i)->getNumCoeff()null);
		coeffName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffName()));
		coeffVal.put(rowIndex, null1D<float,null>(rows.at(i)->getCoeffVal()));
		polarizationType.put(rowIndex, CPolarizationType::name(rows.at(i)->getPolarizationType()));
		receiverBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getReceiverBand()));
		assocNature.put(rowIndex, rows.at(i)->getAssocNature());
		assocPointingModelId.put(rowIndex, rows.at(i)->getAssocPointingModelId()null);
		if (rows.at(i)->isCoeffFormulaExists())
			coeffFormula.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getCoeffFormula()));
		
		rowIndex++;		
	}
}


ASDM_POLARIZATION::ASDM_POLARIZATION() {
	name_ = "ASDM_POLARIZATION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Polarization table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("polarizationId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numCorr", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("corrType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("corrProduct", "blabla"));
}

ASDM_POLARIZATION::~ASDM_POLARIZATION() {
}

const TableDesc& ASDM_POLARIZATION::tableDesc() const {
  return tableDesc_;
}

#include "PolarizationTable.h"
#include "PolarizationRow.h"

using namespace StokesParameterMod;
using namespace PolarizationTypeMod;

void ASDM_POLARIZATION::fill(const ASDM& asdm) {
	vector<PolarizationRow*> rows = asdm.getPolarization().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> polarizationId(*table_p_, "polarizationId");
	ScalarColumn<> numCorr(*table_p_, "numCorr");
	ArrayColumn<String> corrType(*table_p_, "corrType");
	ArrayColumn<String> corrProduct(*table_p_, "corrProduct");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		polarizationId.put(rowIndex, rows.at(i)->getPolarizationId().toString());
		numCorr.put(rowIndex, rows.at(i)->getNumCorr()null);
		corrType.put(rowIndex, enum2CASA1D<StokesParameter,CStokesParameter>(rows.at(i)->getCorrType()));
		corrProduct.put(rowIndex, enum2CASA2D<PolarizationType,CPolarizationType>(rows.at(i)->getCorrProduct()));
		
		rowIndex++;		
	}
}


ASDM_PROCESSOR::ASDM_PROCESSOR() {
	name_ = "ASDM_PROCESSOR";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Processor table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("processorId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("modeId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("processorType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("processorSubType", "blabla"));
}

ASDM_PROCESSOR::~ASDM_PROCESSOR() {
}

const TableDesc& ASDM_PROCESSOR::tableDesc() const {
  return tableDesc_;
}

#include "ProcessorTable.h"
#include "ProcessorRow.h"

using namespace ProcessorTypeMod;
using namespace ProcessorSubTypeMod;

void ASDM_PROCESSOR::fill(const ASDM& asdm) {
	vector<ProcessorRow*> rows = asdm.getProcessor().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> processorId(*table_p_, "processorId");
	ScalarColumn<String> modeId(*table_p_, "modeId");
	ScalarColumn<String> processorType(*table_p_, "processorType");
	ScalarColumn<String> processorSubType(*table_p_, "processorSubType");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		processorId.put(rowIndex, rows.at(i)->getProcessorId().toString());
		modeId.put(rowIndex, rows.at(i)->getModeId().toString());
		processorType.put(rowIndex, CProcessorType::name(rows.at(i)->getProcessorType()));
		processorSubType.put(rowIndex, CProcessorSubType::name(rows.at(i)->getProcessorSubType()));
		
		rowIndex++;		
	}
}


ASDM_RECEIVER::ASDM_RECEIVER() {
	name_ = "ASDM_RECEIVER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Receiver table";
	tableDesc_.addColumn(ScalarColumnDesc<>("receiverId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("name", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numLO", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("frequencyBand", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("freqLO", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("receiverSideband", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("sidebandLO", "blabla"));
}

ASDM_RECEIVER::~ASDM_RECEIVER() {
}

const TableDesc& ASDM_RECEIVER::tableDesc() const {
  return tableDesc_;
}

#include "ReceiverTable.h"
#include "ReceiverRow.h"

using namespace ReceiverBandMod;
using namespace ReceiverSidebandMod;
using namespace NetSidebandMod;

void ASDM_RECEIVER::fill(const ASDM& asdm) {
	vector<ReceiverRow*> rows = asdm.getReceiver().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<> receiverId(*table_p_, "receiverId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<String> name(*table_p_, "name");
	ScalarColumn<> numLO(*table_p_, "numLO");
	ScalarColumn<String> frequencyBand(*table_p_, "frequencyBand");
	ArrayColumn<double> freqLO(*table_p_, "freqLO");
	ScalarColumn<String> receiverSideband(*table_p_, "receiverSideband");
	ArrayColumn<String> sidebandLO(*table_p_, "sidebandLO");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		receiverId.put(rowIndex, rows.at(i)->getReceiverId()null);
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		name.put(rowIndex, rows.at(i)->getName());
		numLO.put(rowIndex, rows.at(i)->getNumLO()null);
		frequencyBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getFrequencyBand()));
		freqLO.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFreqLO()));
		receiverSideband.put(rowIndex, CReceiverSideband::name(rows.at(i)->getReceiverSideband()));
		sidebandLO.put(rowIndex, enum2CASA1D<NetSideband,CNetSideband>(rows.at(i)->getSidebandLO()));
		
		rowIndex++;		
	}
}


ASDM_SBSUMMARY::ASDM_SBSUMMARY() {
	name_ = "ASDM_SBSUMMARY";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SBSummary table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("sBSummaryId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sbSummaryUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("projectUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("obsUnitSetUID", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("frequency", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("frequencyBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sbType", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("sbDuration", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numObservingMode", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("observingMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numberRepeats", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numScienceGoal", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("scienceGoal", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numWeatherConstraint", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("weatherConstraint", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("centerDirection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("centerDirectionCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("centerDirectionEquinox", "blabla"));
}

ASDM_SBSUMMARY::~ASDM_SBSUMMARY() {
}

const TableDesc& ASDM_SBSUMMARY::tableDesc() const {
  return tableDesc_;
}

#include "SBSummaryTable.h"
#include "SBSummaryRow.h"

using namespace ReceiverBandMod;
using namespace SBTypeMod;
using namespace DirectionReferenceCodeMod;

void ASDM_SBSUMMARY::fill(const ASDM& asdm) {
	vector<SBSummaryRow*> rows = asdm.getSBSummary().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> sBSummaryId(*table_p_, "sBSummaryId");
	ScalarColumn<String> sbSummaryUID(*table_p_, "sbSummaryUID");
	ScalarColumn<String> projectUID(*table_p_, "projectUID");
	ScalarColumn<String> obsUnitSetUID(*table_p_, "obsUnitSetUID");
	ScalarColumn<> frequency(*table_p_, "frequency");
	ScalarColumn<String> frequencyBand(*table_p_, "frequencyBand");
	ScalarColumn<String> sbType(*table_p_, "sbType");
	ScalarColumn<double> sbDuration(*table_p_, "sbDuration");
	ScalarColumn<> numObservingMode(*table_p_, "numObservingMode");
	ArrayColumn<String> observingMode(*table_p_, "observingMode");
	ScalarColumn<> numberRepeats(*table_p_, "numberRepeats");
	ScalarColumn<> numScienceGoal(*table_p_, "numScienceGoal");
	ArrayColumn<String> scienceGoal(*table_p_, "scienceGoal");
	ScalarColumn<> numWeatherConstraint(*table_p_, "numWeatherConstraint");
	ArrayColumn<String> weatherConstraint(*table_p_, "weatherConstraint");
	ArrayColumn<double> centerDirection(*table_p_, "centerDirection");  
	ScalarColumn<String> centerDirectionCode(*table_p_, "centerDirectionCode");  
	ScalarColumn<double> centerDirectionEquinox(*table_p_, "centerDirectionEquinox");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		sBSummaryId.put(rowIndex, rows.at(i)->getSBSummaryId().toString());
		sbSummaryUID.put(rowIndex, rows.at(i)->getSbSummaryUID().toString());
		projectUID.put(rowIndex, rows.at(i)->getProjectUID().toString());
		obsUnitSetUID.put(rowIndex, rows.at(i)->getObsUnitSetUID().toString());
		frequency.put(rowIndex, rows.at(i)->getFrequency()null);
		frequencyBand.put(rowIndex, CReceiverBand::name(rows.at(i)->getFrequencyBand()));
		sbType.put(rowIndex, CSBType::name(rows.at(i)->getSbType()));
		sbDuration.put(rowIndex, rows.at(i)->getSbDuration().get()/(1.0e9));
		numObservingMode.put(rowIndex, rows.at(i)->getNumObservingMode()null);
		observingMode.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getObservingMode()));
		numberRepeats.put(rowIndex, rows.at(i)->getNumberRepeats()null);
		numScienceGoal.put(rowIndex, rows.at(i)->getNumScienceGoal()null);
		scienceGoal.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getScienceGoal()));
		numWeatherConstraint.put(rowIndex, rows.at(i)->getNumWeatherConstraint()null);
		weatherConstraint.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getWeatherConstraint()));
		if (rows.at(i)->isCenterDirectionExists())
			centerDirection.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getCenterDirection()));
		if (rows.at(i)->isCenterDirectionCodeExists())
			centerDirectionCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getCenterDirectionCode()));
		if (rows.at(i)->isCenterDirectionEquinoxExists())
			centerDirectionEquinox.put(rowIndex, rows.at(i)->getCenterDirectionEquinox().get()/(1.0e9));
		
		rowIndex++;		
	}
}


ASDM_SCALE::ASDM_SCALE() {
	name_ = "ASDM_SCALE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Scale table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("scaleId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("timeScale", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("crossDataScale", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("autoDataScale", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("weightType", "blabla"));
}

ASDM_SCALE::~ASDM_SCALE() {
}

const TableDesc& ASDM_SCALE::tableDesc() const {
  return tableDesc_;
}

#include "ScaleTable.h"
#include "ScaleRow.h"

using namespace TimeScaleMod;
using namespace DataScaleMod;
using namespace DataScaleMod;
using namespace WeightTypeMod;

void ASDM_SCALE::fill(const ASDM& asdm) {
	vector<ScaleRow*> rows = asdm.getScale().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> scaleId(*table_p_, "scaleId");
	ScalarColumn<String> timeScale(*table_p_, "timeScale");
	ScalarColumn<String> crossDataScale(*table_p_, "crossDataScale");
	ScalarColumn<String> autoDataScale(*table_p_, "autoDataScale");
	ScalarColumn<String> weightType(*table_p_, "weightType");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		scaleId.put(rowIndex, rows.at(i)->getScaleId().toString());
		timeScale.put(rowIndex, CTimeScale::name(rows.at(i)->getTimeScale()));
		crossDataScale.put(rowIndex, CDataScale::name(rows.at(i)->getCrossDataScale()));
		autoDataScale.put(rowIndex, CDataScale::name(rows.at(i)->getAutoDataScale()));
		weightType.put(rowIndex, CWeightType::name(rows.at(i)->getWeightType()));
		
		rowIndex++;		
	}
}


ASDM_SCAN::ASDM_SCAN() {
	name_ = "ASDM_SCAN";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Scan table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("scanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numIntent", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numSubscan", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("scanIntent", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("calDataType", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("calibrationOnLine", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("calibrationFunction", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("calibrationSet", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("calPattern", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numField", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("fieldName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceName", "blabla"));
}

ASDM_SCAN::~ASDM_SCAN() {
}

const TableDesc& ASDM_SCAN::tableDesc() const {
  return tableDesc_;
}

#include "ScanTable.h"
#include "ScanRow.h"

using namespace ScanIntentMod;
using namespace CalDataOriginMod;
using namespace CalibrationFunctionMod;
using namespace CalibrationSetMod;
using namespace AntennaMotionPatternMod;

void ASDM_SCAN::fill(const ASDM& asdm) {
	vector<ScanRow*> rows = asdm.getScan().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<> scanNumber(*table_p_, "scanNumber");
	ScalarColumn<double> startTime(*table_p_, "startTime");
	ScalarColumn<double> endTime(*table_p_, "endTime");
	ScalarColumn<> numIntent(*table_p_, "numIntent");
	ScalarColumn<> numSubscan(*table_p_, "numSubscan");
	ArrayColumn<String> scanIntent(*table_p_, "scanIntent");
	ArrayColumn<String> calDataType(*table_p_, "calDataType");
	ArrayColumn<> calibrationOnLine(*table_p_, "calibrationOnLine");
	ArrayColumn<String> calibrationFunction(*table_p_, "calibrationFunction");  
	ArrayColumn<String> calibrationSet(*table_p_, "calibrationSet");  
	ArrayColumn<String> calPattern(*table_p_, "calPattern");  
	ScalarColumn<> numField(*table_p_, "numField");  
	ArrayColumn<String> fieldName(*table_p_, "fieldName");  
	ScalarColumn<String> sourceName(*table_p_, "sourceName");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		scanNumber.put(rowIndex, rows.at(i)->getScanNumber()null);
		startTime.put(rowIndex, rows.at(i)->getStartTime().get()/(1.0e9));
		endTime.put(rowIndex, rows.at(i)->getEndTime().get()/(1.0e9));
		numIntent.put(rowIndex, rows.at(i)->getNumIntent()null);
		numSubscan.put(rowIndex, rows.at(i)->getNumSubscan()null);
		scanIntent.put(rowIndex, enum2CASA1D<ScanIntent,CScanIntent>(rows.at(i)->getScanIntent()));
		calDataType.put(rowIndex, enum2CASA1D<CalDataOrigin,CCalDataOrigin>(rows.at(i)->getCalDataType()));
		calibrationOnLine.put(rowIndex, null1D<bool,null>(rows.at(i)->getCalibrationOnLine()));
		if (rows.at(i)->isCalibrationFunctionExists())
			calibrationFunction.put(rowIndex, enum2CASA1D<CalibrationFunction,CCalibrationFunction>(rows.at(i)->getCalibrationFunction()));
		if (rows.at(i)->isCalibrationSetExists())
			calibrationSet.put(rowIndex, enum2CASA1D<CalibrationSet,CCalibrationSet>(rows.at(i)->getCalibrationSet()));
		if (rows.at(i)->isCalPatternExists())
			calPattern.put(rowIndex, enum2CASA1D<AntennaMotionPattern,CAntennaMotionPattern>(rows.at(i)->getCalPattern()));
		if (rows.at(i)->isNumFieldExists())
			numField.put(rowIndex, rows.at(i)->getNumField()null);
		if (rows.at(i)->isFieldNameExists())
			fieldName.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getFieldName()));
		if (rows.at(i)->isSourceNameExists())
			sourceName.put(rowIndex, rows.at(i)->getSourceName());
		
		rowIndex++;		
	}
}


ASDM_SEEING::ASDM_SEEING() {
	name_ = "ASDM_SEEING";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Seeing table";
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBaseLength", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("baseLength", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("phaseRms", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("seeing", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("exponent", "blabla"));
}

ASDM_SEEING::~ASDM_SEEING() {
}

const TableDesc& ASDM_SEEING::tableDesc() const {
  return tableDesc_;
}

#include "SeeingTable.h"
#include "SeeingRow.h"


void ASDM_SEEING::fill(const ASDM& asdm) {
	vector<SeeingRow*> rows = asdm.getSeeing().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> numBaseLength(*table_p_, "numBaseLength");
	ArrayColumn<double> baseLength(*table_p_, "baseLength");
	ArrayColumn<double> phaseRms(*table_p_, "phaseRms");
	ScalarColumn<> seeing(*table_p_, "seeing");
	ScalarColumn<> exponent(*table_p_, "exponent");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		numBaseLength.put(rowIndex, rows.at(i)->getNumBaseLength()null);
		baseLength.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getBaseLength()));
		phaseRms.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getPhaseRms()));
		seeing.put(rowIndex, rows.at(i)->getSeeing()null);
		exponent.put(rowIndex, rows.at(i)->getExponent()null);
		
		rowIndex++;		
	}
}


ASDM_SOURCE::ASDM_SOURCE() {
	name_ = "ASDM_SOURCE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Source table";
	tableDesc_.addColumn(ScalarColumnDesc<>("sourceId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("code", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("direction", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("properMotion", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("directionCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("directionEquinox", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("calibrationGroup", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("catalog", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("deltaVel", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("position", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numLines", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("transition", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("restFrequency", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("sysVel", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("rangeVel", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sourceModel", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("frequencyRefCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numFreq", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numStokes", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequency", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("frequencyInterval", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("stokesParameter", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("flux", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("fluxErr", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("positionAngle", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("positionAngleErr", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("size", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("sizeErr", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("velRefCode", "blabla"));
}

ASDM_SOURCE::~ASDM_SOURCE() {
}

const TableDesc& ASDM_SOURCE::tableDesc() const {
  return tableDesc_;
}

#include "SourceTable.h"
#include "SourceRow.h"

using namespace DirectionReferenceCodeMod;
using namespace SourceModelMod;
using namespace FrequencyReferenceCodeMod;
using namespace StokesParameterMod;
using namespace RadialVelocityReferenceCodeMod;

void ASDM_SOURCE::fill(const ASDM& asdm) {
	vector<SourceRow*> rows = asdm.getSource().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<> sourceId(*table_p_, "sourceId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ScalarColumn<String> code(*table_p_, "code");
	ArrayColumn<double> direction(*table_p_, "direction");
	ArrayColumn<double> properMotion(*table_p_, "properMotion");
	ScalarColumn<String> sourceName(*table_p_, "sourceName");
	ScalarColumn<String> directionCode(*table_p_, "directionCode");  
	ScalarColumn<double> directionEquinox(*table_p_, "directionEquinox");  
	ScalarColumn<> calibrationGroup(*table_p_, "calibrationGroup");  
	ScalarColumn<String> catalog(*table_p_, "catalog");  
	ScalarColumn<double> deltaVel(*table_p_, "deltaVel");  
	ArrayColumn<double> position(*table_p_, "position");  
	ScalarColumn<> numLines(*table_p_, "numLines");  
	ArrayColumn<String> transition(*table_p_, "transition");  
	ArrayColumn<double> restFrequency(*table_p_, "restFrequency");  
	ArrayColumn<double> sysVel(*table_p_, "sysVel");  
	ArrayColumn<double> rangeVel(*table_p_, "rangeVel");  
	ScalarColumn<String> sourceModel(*table_p_, "sourceModel");  
	ScalarColumn<String> frequencyRefCode(*table_p_, "frequencyRefCode");  
	ScalarColumn<> numFreq(*table_p_, "numFreq");  
	ScalarColumn<> numStokes(*table_p_, "numStokes");  
	ArrayColumn<double> frequency(*table_p_, "frequency");  
	ArrayColumn<double> frequencyInterval(*table_p_, "frequencyInterval");  
	ArrayColumn<String> stokesParameter(*table_p_, "stokesParameter");  
	ArrayColumn<double> flux(*table_p_, "flux");  
	ArrayColumn<double> fluxErr(*table_p_, "fluxErr");  
	ArrayColumn<double> positionAngle(*table_p_, "positionAngle");  
	ArrayColumn<double> positionAngleErr(*table_p_, "positionAngleErr");  
	ArrayColumn<double> size(*table_p_, "size");  
	ArrayColumn<double> sizeErr(*table_p_, "sizeErr");  
	ScalarColumn<String> velRefCode(*table_p_, "velRefCode");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		sourceId.put(rowIndex, rows.at(i)->getSourceId()null);
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		code.put(rowIndex, rows.at(i)->getCode());
		direction.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getDirection()));
		properMotion.put(rowIndex, ext2CASA1D<AngularRate,double>(rows.at(i)->getProperMotion()));
		sourceName.put(rowIndex, rows.at(i)->getSourceName());
		if (rows.at(i)->isDirectionCodeExists())
			directionCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getDirectionCode()));
		if (rows.at(i)->isDirectionEquinoxExists())
			directionEquinox.put(rowIndex, rows.at(i)->getDirectionEquinox().get()/(1.0e9));
		if (rows.at(i)->isCalibrationGroupExists())
			calibrationGroup.put(rowIndex, rows.at(i)->getCalibrationGroup()null);
		if (rows.at(i)->isCatalogExists())
			catalog.put(rowIndex, rows.at(i)->getCatalog());
		if (rows.at(i)->isDeltaVelExists())
			deltaVel.put(rowIndex, rows.at(i)->getDeltaVel().get());
		if (rows.at(i)->isPositionExists())
			position.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPosition()));
		if (rows.at(i)->isNumLinesExists())
			numLines.put(rowIndex, rows.at(i)->getNumLines()null);
		if (rows.at(i)->isTransitionExists())
			transition.put(rowIndex, basic2CASA1D<string,String>(rows.at(i)->getTransition()));
		if (rows.at(i)->isRestFrequencyExists())
			restFrequency.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getRestFrequency()));
		if (rows.at(i)->isSysVelExists())
			sysVel.put(rowIndex, ext2CASA1D<Speed,double>(rows.at(i)->getSysVel()));
		if (rows.at(i)->isRangeVelExists())
			rangeVel.put(rowIndex, ext2CASA1D<Speed,double>(rows.at(i)->getRangeVel()));
		if (rows.at(i)->isSourceModelExists())
			sourceModel.put(rowIndex, CSourceModel::name(rows.at(i)->getSourceModel()));
		if (rows.at(i)->isFrequencyRefCodeExists())
			frequencyRefCode.put(rowIndex, CFrequencyReferenceCode::name(rows.at(i)->getFrequencyRefCode()));
		if (rows.at(i)->isNumFreqExists())
			numFreq.put(rowIndex, rows.at(i)->getNumFreq()null);
		if (rows.at(i)->isNumStokesExists())
			numStokes.put(rowIndex, rows.at(i)->getNumStokes()null);
		if (rows.at(i)->isFrequencyExists())
			frequency.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequency()));
		if (rows.at(i)->isFrequencyIntervalExists())
			frequencyInterval.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFrequencyInterval()));
		if (rows.at(i)->isStokesParameterExists())
			stokesParameter.put(rowIndex, enum2CASA1D<StokesParameter,CStokesParameter>(rows.at(i)->getStokesParameter()));
		if (rows.at(i)->isFluxExists())
			flux.put(rowIndex, ext2CASA2D<Flux,double>(rows.at(i)->getFlux()));
		if (rows.at(i)->isFluxErrExists())
			fluxErr.put(rowIndex, ext2CASA2D<Flux,double>(rows.at(i)->getFluxErr()));
		if (rows.at(i)->isPositionAngleExists())
			positionAngle.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getPositionAngle()));
		if (rows.at(i)->isPositionAngleErrExists())
			positionAngleErr.put(rowIndex, ext2CASA1D<Angle,double>(rows.at(i)->getPositionAngleErr()));
		if (rows.at(i)->isSizeExists())
			size.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getSize()));
		if (rows.at(i)->isSizeErrExists())
			sizeErr.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getSizeErr()));
		if (rows.at(i)->isVelRefCodeExists())
			velRefCode.put(rowIndex, CRadialVelocityReferenceCode::name(rows.at(i)->getVelRefCode()));
		
		rowIndex++;		
	}
}


ASDM_SPECTRALWINDOW::ASDM_SPECTRALWINDOW() {
	name_ = "ASDM_SPECTRALWINDOW";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SpectralWindow table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("basebandName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("netSideband", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChan", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("refFreq", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("sidebandProcessingMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("totBandwidth", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("windowFunction", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("chanFreqStart", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("chanFreqStep", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("chanFreqArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("chanWidth", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("chanWidthArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("correlationBit", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("effectiveBw", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("effectiveBwArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("freqGroup", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("freqGroupName", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("lineArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("measFreqRef", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("name", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("oversampling", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("quantization", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("refChan", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("resolution", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("resolutionArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numAssocValues", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("assocNature", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("assocSpectralWindowId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("imageSpectralWindowId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("dopplerId", "blabla"));
}

ASDM_SPECTRALWINDOW::~ASDM_SPECTRALWINDOW() {
}

const TableDesc& ASDM_SPECTRALWINDOW::tableDesc() const {
  return tableDesc_;
}

#include "SpectralWindowTable.h"
#include "SpectralWindowRow.h"

using namespace BasebandNameMod;
using namespace NetSidebandMod;
using namespace SidebandProcessingModeMod;
using namespace WindowFunctionMod;
using namespace CorrelationBitMod;
using namespace FrequencyReferenceCodeMod;
using namespace SpectralResolutionTypeMod;

void ASDM_SPECTRALWINDOW::fill(const ASDM& asdm) {
	vector<SpectralWindowRow*> rows = asdm.getSpectralWindow().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ScalarColumn<String> basebandName(*table_p_, "basebandName");
	ScalarColumn<String> netSideband(*table_p_, "netSideband");
	ScalarColumn<> numChan(*table_p_, "numChan");
	ScalarColumn<double> refFreq(*table_p_, "refFreq");
	ScalarColumn<String> sidebandProcessingMode(*table_p_, "sidebandProcessingMode");
	ScalarColumn<double> totBandwidth(*table_p_, "totBandwidth");
	ScalarColumn<String> windowFunction(*table_p_, "windowFunction");
	ScalarColumn<double> chanFreqStart(*table_p_, "chanFreqStart");  
	ScalarColumn<double> chanFreqStep(*table_p_, "chanFreqStep");  
	ArrayColumn<double> chanFreqArray(*table_p_, "chanFreqArray");  
	ScalarColumn<double> chanWidth(*table_p_, "chanWidth");  
	ArrayColumn<double> chanWidthArray(*table_p_, "chanWidthArray");  
	ScalarColumn<String> correlationBit(*table_p_, "correlationBit");  
	ScalarColumn<double> effectiveBw(*table_p_, "effectiveBw");  
	ArrayColumn<double> effectiveBwArray(*table_p_, "effectiveBwArray");  
	ScalarColumn<> freqGroup(*table_p_, "freqGroup");  
	ScalarColumn<String> freqGroupName(*table_p_, "freqGroupName");  
	ArrayColumn<> lineArray(*table_p_, "lineArray");  
	ScalarColumn<String> measFreqRef(*table_p_, "measFreqRef");  
	ScalarColumn<String> name(*table_p_, "name");  
	ScalarColumn<> oversampling(*table_p_, "oversampling");  
	ScalarColumn<> quantization(*table_p_, "quantization");  
	ScalarColumn<> refChan(*table_p_, "refChan");  
	ScalarColumn<double> resolution(*table_p_, "resolution");  
	ArrayColumn<double> resolutionArray(*table_p_, "resolutionArray");  
	ScalarColumn<> numAssocValues(*table_p_, "numAssocValues");  
	ArrayColumn<String> assocNature(*table_p_, "assocNature");  
	ArrayColumn<String> assocSpectralWindowId(*table_p_, "assocSpectralWindowId");  
	ScalarColumn<String> imageSpectralWindowId(*table_p_, "imageSpectralWindowId");  
	ScalarColumn<> dopplerId(*table_p_, "dopplerId");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		basebandName.put(rowIndex, CBasebandName::name(rows.at(i)->getBasebandName()));
		netSideband.put(rowIndex, CNetSideband::name(rows.at(i)->getNetSideband()));
		numChan.put(rowIndex, rows.at(i)->getNumChan()null);
		refFreq.put(rowIndex, rows.at(i)->getRefFreq().get());
		sidebandProcessingMode.put(rowIndex, CSidebandProcessingMode::name(rows.at(i)->getSidebandProcessingMode()));
		totBandwidth.put(rowIndex, rows.at(i)->getTotBandwidth().get());
		windowFunction.put(rowIndex, CWindowFunction::name(rows.at(i)->getWindowFunction()));
		if (rows.at(i)->isChanFreqStartExists())
			chanFreqStart.put(rowIndex, rows.at(i)->getChanFreqStart().get());
		if (rows.at(i)->isChanFreqStepExists())
			chanFreqStep.put(rowIndex, rows.at(i)->getChanFreqStep().get());
		if (rows.at(i)->isChanFreqArrayExists())
			chanFreqArray.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getChanFreqArray()));
		if (rows.at(i)->isChanWidthExists())
			chanWidth.put(rowIndex, rows.at(i)->getChanWidth().get());
		if (rows.at(i)->isChanWidthArrayExists())
			chanWidthArray.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getChanWidthArray()));
		if (rows.at(i)->isCorrelationBitExists())
			correlationBit.put(rowIndex, CCorrelationBit::name(rows.at(i)->getCorrelationBit()));
		if (rows.at(i)->isEffectiveBwExists())
			effectiveBw.put(rowIndex, rows.at(i)->getEffectiveBw().get());
		if (rows.at(i)->isEffectiveBwArrayExists())
			effectiveBwArray.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getEffectiveBwArray()));
		if (rows.at(i)->isFreqGroupExists())
			freqGroup.put(rowIndex, rows.at(i)->getFreqGroup()null);
		if (rows.at(i)->isFreqGroupNameExists())
			freqGroupName.put(rowIndex, rows.at(i)->getFreqGroupName());
		if (rows.at(i)->isLineArrayExists())
			lineArray.put(rowIndex, null1D<bool,null>(rows.at(i)->getLineArray()));
		if (rows.at(i)->isMeasFreqRefExists())
			measFreqRef.put(rowIndex, CFrequencyReferenceCode::name(rows.at(i)->getMeasFreqRef()));
		if (rows.at(i)->isNameExists())
			name.put(rowIndex, rows.at(i)->getName());
		if (rows.at(i)->isOversamplingExists())
			oversampling.put(rowIndex, rows.at(i)->getOversampling()null);
		if (rows.at(i)->isQuantizationExists())
			quantization.put(rowIndex, rows.at(i)->getQuantization()null);
		if (rows.at(i)->isRefChanExists())
			refChan.put(rowIndex, rows.at(i)->getRefChan()null);
		if (rows.at(i)->isResolutionExists())
			resolution.put(rowIndex, rows.at(i)->getResolution().get());
		if (rows.at(i)->isResolutionArrayExists())
			resolutionArray.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getResolutionArray()));
		if (rows.at(i)->isNumAssocValuesExists())
			numAssocValues.put(rowIndex, rows.at(i)->getNumAssocValues()null);
		if (rows.at(i)->isAssocNatureExists())
			assocNature.put(rowIndex, enum2CASA1D<SpectralResolutionType,CSpectralResolutionType>(rows.at(i)->getAssocNature()));
		if (rows.at(i)->isAssocSpectralWindowIdExists())
			assocSpectralWindowId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getAssocSpectralWindowId()));
		if (rows.at(i)->isImageSpectralWindowIdExists())
			imageSpectralWindowId.put(rowIndex, rows.at(i)->getImageSpectralWindowId().toString());
		if (rows.at(i)->isDopplerIdExists())
			dopplerId.put(rowIndex, rows.at(i)->getDopplerId()null);
		
		rowIndex++;		
	}
}


ASDM_SQUARELAWDETECTOR::ASDM_SQUARELAWDETECTOR() {
	name_ = "ASDM_SQUARELAWDETECTOR";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SquareLawDetector table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("squareLawDetectorId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numBand", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("bandType", "blabla"));
}

ASDM_SQUARELAWDETECTOR::~ASDM_SQUARELAWDETECTOR() {
}

const TableDesc& ASDM_SQUARELAWDETECTOR::tableDesc() const {
  return tableDesc_;
}

#include "SquareLawDetectorTable.h"
#include "SquareLawDetectorRow.h"

using namespace DetectorBandTypeMod;

void ASDM_SQUARELAWDETECTOR::fill(const ASDM& asdm) {
	vector<SquareLawDetectorRow*> rows = asdm.getSquareLawDetector().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> squareLawDetectorId(*table_p_, "squareLawDetectorId");
	ScalarColumn<> numBand(*table_p_, "numBand");
	ScalarColumn<String> bandType(*table_p_, "bandType");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		squareLawDetectorId.put(rowIndex, rows.at(i)->getSquareLawDetectorId().toString());
		numBand.put(rowIndex, rows.at(i)->getNumBand()null);
		bandType.put(rowIndex, CDetectorBandType::name(rows.at(i)->getBandType()));
		
		rowIndex++;		
	}
}


ASDM_STATE::ASDM_STATE() {
	name_ = "ASDM_STATE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset State table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("stateId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("calDeviceName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("sig", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("ref", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("onSky", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("weight", "blabla"));
}

ASDM_STATE::~ASDM_STATE() {
}

const TableDesc& ASDM_STATE::tableDesc() const {
  return tableDesc_;
}

#include "StateTable.h"
#include "StateRow.h"

using namespace CalibrationDeviceMod;

void ASDM_STATE::fill(const ASDM& asdm) {
	vector<StateRow*> rows = asdm.getState().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> stateId(*table_p_, "stateId");
	ScalarColumn<String> calDeviceName(*table_p_, "calDeviceName");
	ScalarColumn<> sig(*table_p_, "sig");
	ScalarColumn<> ref(*table_p_, "ref");
	ScalarColumn<> onSky(*table_p_, "onSky");
	ScalarColumn<> weight(*table_p_, "weight");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		stateId.put(rowIndex, rows.at(i)->getStateId().toString());
		calDeviceName.put(rowIndex, CCalibrationDevice::name(rows.at(i)->getCalDeviceName()));
		sig.put(rowIndex, rows.at(i)->getSig()null);
		ref.put(rowIndex, rows.at(i)->getRef()null);
		onSky.put(rowIndex, rows.at(i)->getOnSky()null);
		if (rows.at(i)->isWeightExists())
			weight.put(rowIndex, rows.at(i)->getWeight()null);
		
		rowIndex++;		
	}
}


ASDM_STATION::ASDM_STATION() {
	name_ = "ASDM_STATION";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Station table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("stationId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("name", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("position", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("type", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
}

ASDM_STATION::~ASDM_STATION() {
}

const TableDesc& ASDM_STATION::tableDesc() const {
  return tableDesc_;
}

#include "StationTable.h"
#include "StationRow.h"

using namespace StationTypeMod;

void ASDM_STATION::fill(const ASDM& asdm) {
	vector<StationRow*> rows = asdm.getStation().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> stationId(*table_p_, "stationId");
	ScalarColumn<String> name(*table_p_, "name");
	ArrayColumn<double> position(*table_p_, "position");
	ScalarColumn<String> type(*table_p_, "type");
	ScalarColumn<double> time(*table_p_, "time");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		stationId.put(rowIndex, rows.at(i)->getStationId().toString());
		name.put(rowIndex, rows.at(i)->getName());
		position.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getPosition()));
		type.put(rowIndex, CStationType::name(rows.at(i)->getType()));
		if (rows.at(i)->isTimeExists())
			time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		
		rowIndex++;		
	}
}


ASDM_SUBSCAN::ASDM_SUBSCAN() {
	name_ = "ASDM_SUBSCAN";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Subscan table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("scanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("subscanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("startTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("endTime", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldName", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("subscanIntent", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numIntegration", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("numSubintegration", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("subscanMode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("correlatorCalibration", "blabla"));
}

ASDM_SUBSCAN::~ASDM_SUBSCAN() {
}

const TableDesc& ASDM_SUBSCAN::tableDesc() const {
  return tableDesc_;
}

#include "SubscanTable.h"
#include "SubscanRow.h"

using namespace SubscanIntentMod;
using namespace SwitchingModeMod;
using namespace CorrelatorCalibrationMod;

void ASDM_SUBSCAN::fill(const ASDM& asdm) {
	vector<SubscanRow*> rows = asdm.getSubscan().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<> scanNumber(*table_p_, "scanNumber");
	ScalarColumn<> subscanNumber(*table_p_, "subscanNumber");
	ScalarColumn<double> startTime(*table_p_, "startTime");
	ScalarColumn<double> endTime(*table_p_, "endTime");
	ScalarColumn<String> fieldName(*table_p_, "fieldName");
	ScalarColumn<String> subscanIntent(*table_p_, "subscanIntent");
	ScalarColumn<> numIntegration(*table_p_, "numIntegration");
	ArrayColumn<> numSubintegration(*table_p_, "numSubintegration");
	ScalarColumn<String> subscanMode(*table_p_, "subscanMode");  
	ScalarColumn<String> correlatorCalibration(*table_p_, "correlatorCalibration");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		scanNumber.put(rowIndex, rows.at(i)->getScanNumber()null);
		subscanNumber.put(rowIndex, rows.at(i)->getSubscanNumber()null);
		startTime.put(rowIndex, rows.at(i)->getStartTime().get()/(1.0e9));
		endTime.put(rowIndex, rows.at(i)->getEndTime().get()/(1.0e9));
		fieldName.put(rowIndex, rows.at(i)->getFieldName());
		subscanIntent.put(rowIndex, CSubscanIntent::name(rows.at(i)->getSubscanIntent()));
		numIntegration.put(rowIndex, rows.at(i)->getNumIntegration()null);
		numSubintegration.put(rowIndex, null1D<int,null>(rows.at(i)->getNumSubintegration()));
		if (rows.at(i)->isSubscanModeExists())
			subscanMode.put(rowIndex, CSwitchingMode::name(rows.at(i)->getSubscanMode()));
		if (rows.at(i)->isCorrelatorCalibrationExists())
			correlatorCalibration.put(rowIndex, CCorrelatorCalibration::name(rows.at(i)->getCorrelatorCalibration()));
		
		rowIndex++;		
	}
}


ASDM_SWITCHCYCLE::ASDM_SWITCHCYCLE() {
	name_ = "ASDM_SWITCHCYCLE";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SwitchCycle table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("switchCycleId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numStep", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("weightArray", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("dirOffsetArray", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("freqOffsetArray", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("stepDurationArray", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("directionCode", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("directionEquinox", "blabla"));
}

ASDM_SWITCHCYCLE::~ASDM_SWITCHCYCLE() {
}

const TableDesc& ASDM_SWITCHCYCLE::tableDesc() const {
  return tableDesc_;
}

#include "SwitchCycleTable.h"
#include "SwitchCycleRow.h"

using namespace DirectionReferenceCodeMod;

void ASDM_SWITCHCYCLE::fill(const ASDM& asdm) {
	vector<SwitchCycleRow*> rows = asdm.getSwitchCycle().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> switchCycleId(*table_p_, "switchCycleId");
	ScalarColumn<> numStep(*table_p_, "numStep");
	ArrayColumn<> weightArray(*table_p_, "weightArray");
	ArrayColumn<double> dirOffsetArray(*table_p_, "dirOffsetArray");
	ArrayColumn<double> freqOffsetArray(*table_p_, "freqOffsetArray");
	ArrayColumn<double> stepDurationArray(*table_p_, "stepDurationArray");
	ScalarColumn<String> directionCode(*table_p_, "directionCode");  
	ScalarColumn<double> directionEquinox(*table_p_, "directionEquinox");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		switchCycleId.put(rowIndex, rows.at(i)->getSwitchCycleId().toString());
		numStep.put(rowIndex, rows.at(i)->getNumStep()null);
		weightArray.put(rowIndex, null1D<float,null>(rows.at(i)->getWeightArray()));
		dirOffsetArray.put(rowIndex, ext2CASA2D<Angle,double>(rows.at(i)->getDirOffsetArray()));
		freqOffsetArray.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getFreqOffsetArray()));
		stepDurationArray.put(rowIndex, interval2CASA1D<Interval,double>(rows.at(i)->getStepDurationArray()));
		if (rows.at(i)->isDirectionCodeExists())
			directionCode.put(rowIndex, CDirectionReferenceCode::name(rows.at(i)->getDirectionCode()));
		if (rows.at(i)->isDirectionEquinoxExists())
			directionEquinox.put(rowIndex, rows.at(i)->getDirectionEquinox().get()/(1.0e9));
		
		rowIndex++;		
	}
}


ASDM_SYSCAL::ASDM_SYSCAL() {
	name_ = "ASDM_SYSCAL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SysCal table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChan", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tcalFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tcalSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("trxFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("trxSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tskyFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tskySpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tsysFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("tsysSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tantFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("tantSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("tantTsysFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("tantTsysSpectrum", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("phaseDiffFlag", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("phaseDiffSpectrum", "blabla"));
}

ASDM_SYSCAL::~ASDM_SYSCAL() {
}

const TableDesc& ASDM_SYSCAL::tableDesc() const {
  return tableDesc_;
}

#include "SysCalTable.h"
#include "SysCalRow.h"


void ASDM_SYSCAL::fill(const ASDM& asdm) {
	vector<SysCalRow*> rows = asdm.getSysCal().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ScalarColumn<> numChan(*table_p_, "numChan");
	ScalarColumn<> tcalFlag(*table_p_, "tcalFlag");  
	ArrayColumn<double> tcalSpectrum(*table_p_, "tcalSpectrum");  
	ScalarColumn<> trxFlag(*table_p_, "trxFlag");  
	ArrayColumn<double> trxSpectrum(*table_p_, "trxSpectrum");  
	ScalarColumn<> tskyFlag(*table_p_, "tskyFlag");  
	ArrayColumn<double> tskySpectrum(*table_p_, "tskySpectrum");  
	ScalarColumn<> tsysFlag(*table_p_, "tsysFlag");  
	ArrayColumn<double> tsysSpectrum(*table_p_, "tsysSpectrum");  
	ScalarColumn<> tantFlag(*table_p_, "tantFlag");  
	ArrayColumn<> tantSpectrum(*table_p_, "tantSpectrum");  
	ScalarColumn<> tantTsysFlag(*table_p_, "tantTsysFlag");  
	ArrayColumn<> tantTsysSpectrum(*table_p_, "tantTsysSpectrum");  
	ScalarColumn<> phaseDiffFlag(*table_p_, "phaseDiffFlag");  
	ArrayColumn<> phaseDiffSpectrum(*table_p_, "phaseDiffSpectrum");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		numChan.put(rowIndex, rows.at(i)->getNumChan()null);
		if (rows.at(i)->isTcalFlagExists())
			tcalFlag.put(rowIndex, rows.at(i)->getTcalFlag()null);
		if (rows.at(i)->isTcalSpectrumExists())
			tcalSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTcalSpectrum()));
		if (rows.at(i)->isTrxFlagExists())
			trxFlag.put(rowIndex, rows.at(i)->getTrxFlag()null);
		if (rows.at(i)->isTrxSpectrumExists())
			trxSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTrxSpectrum()));
		if (rows.at(i)->isTskyFlagExists())
			tskyFlag.put(rowIndex, rows.at(i)->getTskyFlag()null);
		if (rows.at(i)->isTskySpectrumExists())
			tskySpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTskySpectrum()));
		if (rows.at(i)->isTsysFlagExists())
			tsysFlag.put(rowIndex, rows.at(i)->getTsysFlag()null);
		if (rows.at(i)->isTsysSpectrumExists())
			tsysSpectrum.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getTsysSpectrum()));
		if (rows.at(i)->isTantFlagExists())
			tantFlag.put(rowIndex, rows.at(i)->getTantFlag()null);
		if (rows.at(i)->isTantSpectrumExists())
			tantSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getTantSpectrum()));
		if (rows.at(i)->isTantTsysFlagExists())
			tantTsysFlag.put(rowIndex, rows.at(i)->getTantTsysFlag()null);
		if (rows.at(i)->isTantTsysSpectrumExists())
			tantTsysSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getTantTsysSpectrum()));
		if (rows.at(i)->isPhaseDiffFlagExists())
			phaseDiffFlag.put(rowIndex, rows.at(i)->getPhaseDiffFlag()null);
		if (rows.at(i)->isPhaseDiffSpectrumExists())
			phaseDiffSpectrum.put(rowIndex, null2D<float,null>(rows.at(i)->getPhaseDiffSpectrum()));
		
		rowIndex++;		
	}
}


ASDM_SYSPOWER::ASDM_SYSPOWER() {
	name_ = "ASDM_SYSPOWER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset SysPower table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("feedId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numReceptor", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("switchedPowerDifference", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("switchedPowerSum", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("requantizerGain", "blabla"));
}

ASDM_SYSPOWER::~ASDM_SYSPOWER() {
}

const TableDesc& ASDM_SYSPOWER::tableDesc() const {
  return tableDesc_;
}

#include "SysPowerTable.h"
#include "SysPowerRow.h"


void ASDM_SYSPOWER::fill(const ASDM& asdm) {
	vector<SysPowerRow*> rows = asdm.getSysPower().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ScalarColumn<> feedId(*table_p_, "feedId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<> numReceptor(*table_p_, "numReceptor");
	ArrayColumn<> switchedPowerDifference(*table_p_, "switchedPowerDifference");  
	ArrayColumn<> switchedPowerSum(*table_p_, "switchedPowerSum");  
	ArrayColumn<> requantizerGain(*table_p_, "requantizerGain");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		feedId.put(rowIndex, rows.at(i)->getFeedId()null);
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		numReceptor.put(rowIndex, rows.at(i)->getNumReceptor()null);
		if (rows.at(i)->isSwitchedPowerDifferenceExists())
			switchedPowerDifference.put(rowIndex, null1D<float,null>(rows.at(i)->getSwitchedPowerDifference()));
		if (rows.at(i)->isSwitchedPowerSumExists())
			switchedPowerSum.put(rowIndex, null1D<float,null>(rows.at(i)->getSwitchedPowerSum()));
		if (rows.at(i)->isRequantizerGainExists())
			requantizerGain.put(rowIndex, null1D<float,null>(rows.at(i)->getRequantizerGain()));
		
		rowIndex++;		
	}
}


ASDM_TOTALPOWER::ASDM_TOTALPOWER() {
	name_ = "ASDM_TOTALPOWER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset TotalPower table";
	tableDesc_.addColumn(ScalarColumnDesc<double>("time", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("configDescriptionId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("fieldId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("scanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("subscanNumber", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("integrationNumber", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("uvw", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("exposure", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeCentroid", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("floatData", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("flagAnt", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("flagPol", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("interval", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("stateId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("execBlockId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("subintegrationNumber", "blabla"));
}

ASDM_TOTALPOWER::~ASDM_TOTALPOWER() {
}

const TableDesc& ASDM_TOTALPOWER::tableDesc() const {
  return tableDesc_;
}

#include "TotalPowerTable.h"
#include "TotalPowerRow.h"


void ASDM_TOTALPOWER::fill(const ASDM& asdm) {
	vector<TotalPowerRow*> rows = asdm.getTotalPower().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<double> time(*table_p_, "time");
	ScalarColumn<String> configDescriptionId(*table_p_, "configDescriptionId");
	ScalarColumn<String> fieldId(*table_p_, "fieldId");
	ScalarColumn<> scanNumber(*table_p_, "scanNumber");
	ScalarColumn<> subscanNumber(*table_p_, "subscanNumber");
	ScalarColumn<> integrationNumber(*table_p_, "integrationNumber");
	ArrayColumn<double> uvw(*table_p_, "uvw");
	ArrayColumn<double> exposure(*table_p_, "exposure");
	ArrayColumn<double> timeCentroid(*table_p_, "timeCentroid");
	ArrayColumn<> floatData(*table_p_, "floatData");
	ArrayColumn<> flagAnt(*table_p_, "flagAnt");
	ArrayColumn<> flagPol(*table_p_, "flagPol");
	ScalarColumn<double> interval(*table_p_, "interval");
	ArrayColumn<String> stateId(*table_p_, "stateId");
	ScalarColumn<String> execBlockId(*table_p_, "execBlockId");
	ScalarColumn<> subintegrationNumber(*table_p_, "subintegrationNumber");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		time.put(rowIndex, rows.at(i)->getTime().get()/(1.0e9));
		configDescriptionId.put(rowIndex, rows.at(i)->getConfigDescriptionId().toString());
		fieldId.put(rowIndex, rows.at(i)->getFieldId().toString());
		scanNumber.put(rowIndex, rows.at(i)->getScanNumber()null);
		subscanNumber.put(rowIndex, rows.at(i)->getSubscanNumber()null);
		integrationNumber.put(rowIndex, rows.at(i)->getIntegrationNumber()null);
		uvw.put(rowIndex, ext2CASA2D<Length,double>(rows.at(i)->getUvw()));
		exposure.put(rowIndex, interval2CASA2D<Interval,double>(rows.at(i)->getExposure()));
		timeCentroid.put(rowIndex, at2CASA2D<double>(rows.at(i)->getTimeCentroid()));
		floatData.put(rowIndex, null3D<float,null>(rows.at(i)->getFloatData()));
		flagAnt.put(rowIndex, null1D<int,null>(rows.at(i)->getFlagAnt()));
		flagPol.put(rowIndex, null2D<int,null>(rows.at(i)->getFlagPol()));
		interval.put(rowIndex, rows.at(i)->getInterval().get()/(1.0e9));
		stateId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getStateId()));
		execBlockId.put(rowIndex, rows.at(i)->getExecBlockId().toString());
		if (rows.at(i)->isSubintegrationNumberExists())
			subintegrationNumber.put(rowIndex, rows.at(i)->getSubintegrationNumber()null);
		
		rowIndex++;		
	}
}


ASDM_WVMCAL::ASDM_WVMCAL() {
	name_ = "ASDM_WVMCAL";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset WVMCal table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("antennaId", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("spectralWindowId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<String>("wvrMethod", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("polyFreqLimits", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numInputAntenna", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numChan", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numPoly", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<>("pathCoeff", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("refTemp", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<String>("inputAntennaId", "blabla"));
}

ASDM_WVMCAL::~ASDM_WVMCAL() {
}

const TableDesc& ASDM_WVMCAL::tableDesc() const {
  return tableDesc_;
}

#include "WVMCalTable.h"
#include "WVMCalRow.h"

using namespace WVRMethodMod;

void ASDM_WVMCAL::fill(const ASDM& asdm) {
	vector<WVMCalRow*> rows = asdm.getWVMCal().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> antennaId(*table_p_, "antennaId");
	ScalarColumn<String> spectralWindowId(*table_p_, "spectralWindowId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<String> wvrMethod(*table_p_, "wvrMethod");
	ArrayColumn<double> polyFreqLimits(*table_p_, "polyFreqLimits");
	ScalarColumn<> numInputAntenna(*table_p_, "numInputAntenna");
	ScalarColumn<> numChan(*table_p_, "numChan");
	ScalarColumn<> numPoly(*table_p_, "numPoly");
	ArrayColumn<> pathCoeff(*table_p_, "pathCoeff");
	ArrayColumn<double> refTemp(*table_p_, "refTemp");
	ArrayColumn<String> inputAntennaId(*table_p_, "inputAntennaId");
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		antennaId.put(rowIndex, rows.at(i)->getAntennaId().toString());
		spectralWindowId.put(rowIndex, rows.at(i)->getSpectralWindowId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		wvrMethod.put(rowIndex, CWVRMethod::name(rows.at(i)->getWvrMethod()));
		polyFreqLimits.put(rowIndex, ext2CASA1D<Frequency,double>(rows.at(i)->getPolyFreqLimits()));
		numInputAntenna.put(rowIndex, rows.at(i)->getNumInputAntenna()null);
		numChan.put(rowIndex, rows.at(i)->getNumChan()null);
		numPoly.put(rowIndex, rows.at(i)->getNumPoly()null);
		pathCoeff.put(rowIndex, null3D<float,null>(rows.at(i)->getPathCoeff()));
		refTemp.put(rowIndex, ext2CASA2D<Temperature,double>(rows.at(i)->getRefTemp()));
		inputAntennaId.put(rowIndex, _2CASAString1D<Tag,String>(rows.at(i)->getInputAntennaId()));
		
		rowIndex++;		
	}
}


ASDM_WEATHER::ASDM_WEATHER() {
	name_ = "ASDM_WEATHER";
	tableDesc_.comment() = "The verbatim copy of the ASDM's dataset Weather table";
	tableDesc_.addColumn(ScalarColumnDesc<String>("stationId", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("timeInterval", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("pressure", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("relHumidity", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("temperature", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("windDirection", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("windSpeed", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("windMax", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("dewPoint", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numLayer", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("layerHeight", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("temperatureProfile", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<double>("cloudMonitor", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("numWVR", "blabla"));
	tableDesc_.addColumn(ArrayColumnDesc<double>("wvrTemp", "blabla"));
	tableDesc_.addColumn(ScalarColumnDesc<>("water", "blabla"));
}

ASDM_WEATHER::~ASDM_WEATHER() {
}

const TableDesc& ASDM_WEATHER::tableDesc() const {
  return tableDesc_;
}

#include "WeatherTable.h"
#include "WeatherRow.h"


void ASDM_WEATHER::fill(const ASDM& asdm) {
	vector<WeatherRow*> rows = asdm.getWeather().get();
	unsigned int rowIndex = table_p_->nrow();
	table_p_->addRow(rows.size());
	ScalarColumn<String> stationId(*table_p_, "stationId");
	ArrayColumn<double> timeInterval(*table_p_, "timeInterval");
	ScalarColumn<double> pressure(*table_p_, "pressure");  
	ScalarColumn<double> relHumidity(*table_p_, "relHumidity");  
	ScalarColumn<double> temperature(*table_p_, "temperature");  
	ScalarColumn<double> windDirection(*table_p_, "windDirection");  
	ScalarColumn<double> windSpeed(*table_p_, "windSpeed");  
	ScalarColumn<double> windMax(*table_p_, "windMax");  
	ScalarColumn<double> dewPoint(*table_p_, "dewPoint");  
	ScalarColumn<> numLayer(*table_p_, "numLayer");  
	ArrayColumn<double> layerHeight(*table_p_, "layerHeight");  
	ArrayColumn<double> temperatureProfile(*table_p_, "temperatureProfile");  
	ScalarColumn<double> cloudMonitor(*table_p_, "cloudMonitor");  
	ScalarColumn<> numWVR(*table_p_, "numWVR");  
	ArrayColumn<double> wvrTemp(*table_p_, "wvrTemp");  
	ScalarColumn<> water(*table_p_, "water");  
	
	for (unsigned int i = 0; i < rows.size(); i++) {
		stationId.put(rowIndex, rows.at(i)->getStationId().toString());
		timeInterval.put(rowIndex, ati2CASA1D<double>(rows.at(i)->getTimeInterval()));
		if (rows.at(i)->isPressureExists())
			pressure.put(rowIndex, rows.at(i)->getPressure().get());
		if (rows.at(i)->isRelHumidityExists())
			relHumidity.put(rowIndex, rows.at(i)->getRelHumidity().get());
		if (rows.at(i)->isTemperatureExists())
			temperature.put(rowIndex, rows.at(i)->getTemperature().get());
		if (rows.at(i)->isWindDirectionExists())
			windDirection.put(rowIndex, rows.at(i)->getWindDirection().get());
		if (rows.at(i)->isWindSpeedExists())
			windSpeed.put(rowIndex, rows.at(i)->getWindSpeed().get());
		if (rows.at(i)->isWindMaxExists())
			windMax.put(rowIndex, rows.at(i)->getWindMax().get());
		if (rows.at(i)->isDewPointExists())
			dewPoint.put(rowIndex, rows.at(i)->getDewPoint().get());
		if (rows.at(i)->isNumLayerExists())
			numLayer.put(rowIndex, rows.at(i)->getNumLayer()null);
		if (rows.at(i)->isLayerHeightExists())
			layerHeight.put(rowIndex, ext2CASA1D<Length,double>(rows.at(i)->getLayerHeight()));
		if (rows.at(i)->isTemperatureProfileExists())
			temperatureProfile.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getTemperatureProfile()));
		if (rows.at(i)->isCloudMonitorExists())
			cloudMonitor.put(rowIndex, rows.at(i)->getCloudMonitor().get());
		if (rows.at(i)->isNumWVRExists())
			numWVR.put(rowIndex, rows.at(i)->getNumWVR()null);
		if (rows.at(i)->isWvrTempExists())
			wvrTemp.put(rowIndex, ext2CASA1D<Temperature,double>(rows.at(i)->getWvrTemp()));
		if (rows.at(i)->isWaterExists())
			water.put(rowIndex, rows.at(i)->getWater()null);
		
		rowIndex++;		
	}
}


