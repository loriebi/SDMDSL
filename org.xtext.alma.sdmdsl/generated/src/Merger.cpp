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
 * File Merger.h
 */
#include <Merger.h>

using namespace std;

namespace asdm {
	
	Merger::Merger() {
		this->ds1 = (ASDM *) 0;
		this->ds2 = (ASDM *) 0;
		
		Merger::mergeAlmaRadiometerPtr = &Merger::mergeAlmaRadiometer;
		Merger::mergeAnnotationPtr = &Merger::mergeAnnotation;
		Merger::mergeAntennaPtr = &Merger::mergeAntenna;
		Merger::mergeCalAmpliPtr = &Merger::mergeCalAmpli;
		Merger::mergeCalAppPhasePtr = &Merger::mergeCalAppPhase;
		Merger::mergeCalAtmospherePtr = &Merger::mergeCalAtmosphere;
		Merger::mergeCalBandpassPtr = &Merger::mergeCalBandpass;
		Merger::mergeCalCurvePtr = &Merger::mergeCalCurve;
		Merger::mergeCalDataPtr = &Merger::mergeCalData;
		Merger::mergeCalDelayPtr = &Merger::mergeCalDelay;
		Merger::mergeCalDevicePtr = &Merger::mergeCalDevice;
		Merger::mergeCalFluxPtr = &Merger::mergeCalFlux;
		Merger::mergeCalFocusModelPtr = &Merger::mergeCalFocusModel;
		Merger::mergeCalFocusPtr = &Merger::mergeCalFocus;
		Merger::mergeCalGainPtr = &Merger::mergeCalGain;
		Merger::mergeCalHolographyPtr = &Merger::mergeCalHolography;
		Merger::mergeCalPhasePtr = &Merger::mergeCalPhase;
		Merger::mergeCalPointingModelPtr = &Merger::mergeCalPointingModel;
		Merger::mergeCalPointingPtr = &Merger::mergeCalPointing;
		Merger::mergeCalPositionPtr = &Merger::mergeCalPosition;
		Merger::mergeCalPrimaryBeamPtr = &Merger::mergeCalPrimaryBeam;
		Merger::mergeCalReductionPtr = &Merger::mergeCalReduction;
		Merger::mergeCalSeeingPtr = &Merger::mergeCalSeeing;
		Merger::mergeCalWVRPtr = &Merger::mergeCalWVR;
		Merger::mergeConfigDescriptionPtr = &Merger::mergeConfigDescription;
		Merger::mergeCorrelatorModePtr = &Merger::mergeCorrelatorMode;
		Merger::mergeDataDescriptionPtr = &Merger::mergeDataDescription;
		Merger::mergeDelayModelFixedParametersPtr = &Merger::mergeDelayModelFixedParameters;
		Merger::mergeDelayModelPtr = &Merger::mergeDelayModel;
		Merger::mergeDelayModelVariableParametersPtr = &Merger::mergeDelayModelVariableParameters;
		Merger::mergeDopplerPtr = &Merger::mergeDoppler;
		Merger::mergeEphemerisPtr = &Merger::mergeEphemeris;
		Merger::mergeExecBlockPtr = &Merger::mergeExecBlock;
		Merger::mergeFeedPtr = &Merger::mergeFeed;
		Merger::mergeFieldPtr = &Merger::mergeField;
		Merger::mergeFlagCmdPtr = &Merger::mergeFlagCmd;
		Merger::mergeFlagPtr = &Merger::mergeFlag;
		Merger::mergeFocusModelPtr = &Merger::mergeFocusModel;
		Merger::mergeFocusPtr = &Merger::mergeFocus;
		Merger::mergeFreqOffsetPtr = &Merger::mergeFreqOffset;
		Merger::mergeGainTrackingPtr = &Merger::mergeGainTracking;
		Merger::mergeHistoryPtr = &Merger::mergeHistory;
		Merger::mergeHolographyPtr = &Merger::mergeHolography;
		Merger::mergeMainPtr = &Merger::mergeMain;
		Merger::mergeObservationPtr = &Merger::mergeObservation;
		Merger::mergePointingModelPtr = &Merger::mergePointingModel;
		Merger::mergePointingPtr = &Merger::mergePointing;
		Merger::mergePolarizationPtr = &Merger::mergePolarization;
		Merger::mergeProcessorPtr = &Merger::mergeProcessor;
		Merger::mergeReceiverPtr = &Merger::mergeReceiver;
		Merger::mergeSBSummaryPtr = &Merger::mergeSBSummary;
		Merger::mergeScalePtr = &Merger::mergeScale;
		Merger::mergeScanPtr = &Merger::mergeScan;
		Merger::mergeSeeingPtr = &Merger::mergeSeeing;
		Merger::mergeSourcePtr = &Merger::mergeSource;
		Merger::mergeSpectralWindowPtr = &Merger::mergeSpectralWindow;
		Merger::mergeSquareLawDetectorPtr = &Merger::mergeSquareLawDetector;
		Merger::mergeStatePtr = &Merger::mergeState;
		Merger::mergeStationPtr = &Merger::mergeStation;
		Merger::mergeSubscanPtr = &Merger::mergeSubscan;
		Merger::mergeSwitchCyclePtr = &Merger::mergeSwitchCycle;
		Merger::mergeSysCalPtr = &Merger::mergeSysCal;
		Merger::mergeSysPowerPtr = &Merger::mergeSysPower;
		Merger::mergeTotalPowerPtr = &Merger::mergeTotalPower;
		Merger::mergeWeatherPtr = &Merger::mergeWeather;
		Merger::mergeWVMCalPtr = &Merger::mergeWVMCal;
	}
	
	Merger::~Merger() {
	
	}
	
	void Merger::merge(ASDM* ds1, ASDM* ds2) {
		this->ds1 = ds1;
		this->ds2 = ds2;
		
		hasMergedAlmaRadiometer = false;
		mergeAlmaRadiometer( );
		postMergeAlmaRadiometer( );
		hasMergedAnnotation = false;
		mergeAnnotation( );
		postMergeAnnotation( );
		hasMergedAntenna = false;
		mergeAntenna( );
		postMergeAntenna( );
		hasMergedCalAmpli = false;
		mergeCalAmpli( );
		postMergeCalAmpli( );
		hasMergedCalAppPhase = false;
		mergeCalAppPhase( );
		postMergeCalAppPhase( );
		hasMergedCalAtmosphere = false;
		mergeCalAtmosphere( );
		postMergeCalAtmosphere( );
		hasMergedCalBandpass = false;
		mergeCalBandpass( );
		postMergeCalBandpass( );
		hasMergedCalCurve = false;
		mergeCalCurve( );
		postMergeCalCurve( );
		hasMergedCalData = false;
		mergeCalData( );
		postMergeCalData( );
		hasMergedCalDelay = false;
		mergeCalDelay( );
		postMergeCalDelay( );
		hasMergedCalDevice = false;
		mergeCalDevice( );
		postMergeCalDevice( );
		hasMergedCalFlux = false;
		mergeCalFlux( );
		postMergeCalFlux( );
		hasMergedCalFocusModel = false;
		mergeCalFocusModel( );
		postMergeCalFocusModel( );
		hasMergedCalFocus = false;
		mergeCalFocus( );
		postMergeCalFocus( );
		hasMergedCalGain = false;
		mergeCalGain( );
		postMergeCalGain( );
		hasMergedCalHolography = false;
		mergeCalHolography( );
		postMergeCalHolography( );
		hasMergedCalPhase = false;
		mergeCalPhase( );
		postMergeCalPhase( );
		hasMergedCalPointingModel = false;
		mergeCalPointingModel( );
		postMergeCalPointingModel( );
		hasMergedCalPointing = false;
		mergeCalPointing( );
		postMergeCalPointing( );
		hasMergedCalPosition = false;
		mergeCalPosition( );
		postMergeCalPosition( );
		hasMergedCalPrimaryBeam = false;
		mergeCalPrimaryBeam( );
		postMergeCalPrimaryBeam( );
		hasMergedCalReduction = false;
		mergeCalReduction( );
		postMergeCalReduction( );
		hasMergedCalSeeing = false;
		mergeCalSeeing( );
		postMergeCalSeeing( );
		hasMergedCalWVR = false;
		mergeCalWVR( );
		postMergeCalWVR( );
		hasMergedConfigDescription = false;
		mergeConfigDescription( );
		postMergeConfigDescription( );
		hasMergedCorrelatorMode = false;
		mergeCorrelatorMode( );
		postMergeCorrelatorMode( );
		hasMergedDataDescription = false;
		mergeDataDescription( );
		postMergeDataDescription( );
		hasMergedDelayModelFixedParameters = false;
		mergeDelayModelFixedParameters( );
		postMergeDelayModelFixedParameters( );
		hasMergedDelayModel = false;
		mergeDelayModel( );
		postMergeDelayModel( );
		hasMergedDelayModelVariableParameters = false;
		mergeDelayModelVariableParameters( );
		postMergeDelayModelVariableParameters( );
		hasMergedDoppler = false;
		mergeDoppler( );
		postMergeDoppler( );
		hasMergedEphemeris = false;
		mergeEphemeris( );
		postMergeEphemeris( );
		hasMergedExecBlock = false;
		mergeExecBlock( );
		postMergeExecBlock( );
		hasMergedFeed = false;
		mergeFeed( );
		postMergeFeed( );
		hasMergedField = false;
		mergeField( );
		postMergeField( );
		hasMergedFlagCmd = false;
		mergeFlagCmd( );
		postMergeFlagCmd( );
		hasMergedFlag = false;
		mergeFlag( );
		postMergeFlag( );
		hasMergedFocusModel = false;
		mergeFocusModel( );
		postMergeFocusModel( );
		hasMergedFocus = false;
		mergeFocus( );
		postMergeFocus( );
		hasMergedFreqOffset = false;
		mergeFreqOffset( );
		postMergeFreqOffset( );
		hasMergedGainTracking = false;
		mergeGainTracking( );
		postMergeGainTracking( );
		hasMergedHistory = false;
		mergeHistory( );
		postMergeHistory( );
		hasMergedHolography = false;
		mergeHolography( );
		postMergeHolography( );
		hasMergedMain = false;
		mergeMain( );
		postMergeMain( );
		hasMergedObservation = false;
		mergeObservation( );
		postMergeObservation( );
		hasMergedPointingModel = false;
		mergePointingModel( );
		postMergePointingModel( );
		hasMergedPointing = false;
		mergePointing( );
		postMergePointing( );
		hasMergedPolarization = false;
		mergePolarization( );
		postMergePolarization( );
		hasMergedProcessor = false;
		mergeProcessor( );
		postMergeProcessor( );
		hasMergedReceiver = false;
		mergeReceiver( );
		postMergeReceiver( );
		hasMergedSBSummary = false;
		mergeSBSummary( );
		postMergeSBSummary( );
		hasMergedScale = false;
		mergeScale( );
		postMergeScale( );
		hasMergedScan = false;
		mergeScan( );
		postMergeScan( );
		hasMergedSeeing = false;
		mergeSeeing( );
		postMergeSeeing( );
		hasMergedSource = false;
		mergeSource( );
		postMergeSource( );
		hasMergedSpectralWindow = false;
		mergeSpectralWindow( );
		postMergeSpectralWindow( );
		hasMergedSquareLawDetector = false;
		mergeSquareLawDetector( );
		postMergeSquareLawDetector( );
		hasMergedState = false;
		mergeState( );
		postMergeState( );
		hasMergedStation = false;
		mergeStation( );
		postMergeStation( );
		hasMergedSubscan = false;
		mergeSubscan( );
		postMergeSubscan( );
		hasMergedSwitchCycle = false;
		mergeSwitchCycle( );
		postMergeSwitchCycle( );
		hasMergedSysCal = false;
		mergeSysCal( );
		postMergeSysCal( );
		hasMergedSysPower = false;
		mergeSysPower( );
		postMergeSysPower( );
		hasMergedTotalPower = false;
		mergeTotalPower( );
		postMergeTotalPower( );
		hasMergedWeather = false;
		mergeWeather( );
		postMergeWeather( );
		hasMergedWVMCal = false;
		mergeWVMCal( );
		postMergeWVMCal( );
	}
	
	
	void Merger::mergeAlmaRadiometer() {
		cout << "Entering Merger::mergeAlmaRadiometer" << endl;
		if (hasMergedAlmaRadiometer) {
			cout << "Exiting Merger::mergeAlmaRadiometer" << endl;
			return;
		}
		
		vector <AlmaRadiometerRow *> rows2 = ds2->getAlmaRadiometer().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeAlmaRadiometer merging row #" << i << endl;
			AlmaRadiometerRow * row = ds1->getAlmaRadiometer().newRow(rows2.at(i));
			
			
			AlmaRadiometerRow * retRow = ds1->getAlmaRadiometer().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getAlmaRadiometerId().toString(), retRow->getAlmaRadiometerId()));
		}
		
		hasMergedAlmaRadiometer = true;
		cout << "Exiting Merger::mergeAlmaRadiometer" << endl;
	}
	
	void Merger::postMergeAlmaRadiometer() {
		cout << "Entering Merger::postMergeAlmaRadiometer" << endl;
		
		vector <AlmaRadiometerRow *> rows1 = ds1->getAlmaRadiometer().get();
		AlmaRadiometerRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isSpectralWindowIdExists()) {
				
				vector<vector<Tag> > spectralWindowId1 = row1->getSpectralWindowId();
				vector<vector<Tag> > spectralWindowId1_new;
				for (unsigned int j = 0; j < spectralWindowId1.size(); j++) {
				}
				row1->setSpectralWindowId(	spectralWindowId1_new);
			}
		}
		cout << "Exiting Merger::postMergeAlmaRadiometer" << endl;
	}
	void Merger::mergeAnnotation() {
		cout << "Entering Merger::mergeAnnotation" << endl;
		if (hasMergedAnnotation) {
			cout << "Exiting Merger::mergeAnnotation" << endl;
			return;
		}
		
		vector <AnnotationRow *> rows2 = ds2->getAnnotation().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeAnnotation merging row #" << i << endl;
			AnnotationRow * row = ds1->getAnnotation().newRow(rows2.at(i));
			
			
			AnnotationRow * retRow = ds1->getAnnotation().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getAnnotationId().toString(), retRow->getAnnotationId()));
		}
		
		hasMergedAnnotation = true;
		cout << "Exiting Merger::mergeAnnotation" << endl;
	}
	
	void Merger::postMergeAnnotation() {
		cout << "Entering Merger::postMergeAnnotation" << endl;
		
		vector <AnnotationRow *> rows1 = ds1->getAnnotation().get();
		AnnotationRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isAntennaIdExists()) {
				
				vector<vector<Tag> > antennaId1 = row1->getAntennaId();
				vector<vector<Tag> > antennaId1_new;
				for (unsigned int j = 0; j < antennaId1.size(); j++) {
				}
				row1->setAntennaId(	antennaId1_new);
			}
		}
		cout << "Exiting Merger::postMergeAnnotation" << endl;
	}
	void Merger::mergeAntenna() {
		cout << "Entering Merger::mergeAntenna" << endl;
		if (hasMergedAntenna) {
			cout << "Exiting Merger::mergeAntenna" << endl;
			return;
		}
		
		vector <AntennaRow *> rows2 = ds2->getAntenna().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeAntenna merging row #" << i << endl;
			AntennaRow * row = ds1->getAntenna().newRow(rows2.at(i));
			
			
			Tag stationIdTag = getTag(row->getStationId(), mergeStationPtr);
			row->setStationId(stationIdTag);
			
			AntennaRow * retRow = ds1->getAntenna().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getAntennaId().toString(), retRow->getAntennaId()));
		}
		
		hasMergedAntenna = true;
		cout << "Exiting Merger::mergeAntenna" << endl;
	}
	
	void Merger::postMergeAntenna() {
		cout << "Entering Merger::postMergeAntenna" << endl;
		
		vector <AntennaRow *> rows1 = ds1->getAntenna().get();
		AntennaRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isAssocAntennaIdExists()) {
				
					
					row1->setAssocAntennaId(getTag(row1->getAssocAntennaId(), 0));
			}
		}
		cout << "Exiting Merger::postMergeAntenna" << endl;
	}
	void Merger::mergeCalAmpli() {
		cout << "Entering Merger::mergeCalAmpli" << endl;
		if (hasMergedCalAmpli) {
			cout << "Exiting Merger::mergeCalAmpli" << endl;
			return;
		}
		
		vector <CalAmpliRow *> rows2 = ds2->getCalAmpli().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalAmpli merging row #" << i << endl;
			CalAmpliRow * row = ds1->getCalAmpli().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalAmpliRow * retRow = ds1->getCalAmpli().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalAmpli = true;
		cout << "Exiting Merger::mergeCalAmpli" << endl;
	}
	
	void Merger::postMergeCalAmpli() {
		cout << "Entering Merger::postMergeCalAmpli" << endl;
		
		cout << "Exiting Merger::postMergeCalAmpli" << endl;
	}
	void Merger::mergeCalAppPhase() {
		cout << "Entering Merger::mergeCalAppPhase" << endl;
		if (hasMergedCalAppPhase) {
			cout << "Exiting Merger::mergeCalAppPhase" << endl;
			return;
		}
		
		vector <CalAppPhaseRow *> rows2 = ds2->getCalAppPhase().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalAppPhase merging row #" << i << endl;
			CalAppPhaseRow * row = ds1->getCalAppPhase().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalAppPhaseRow * retRow = ds1->getCalAppPhase().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalAppPhase = true;
		cout << "Exiting Merger::mergeCalAppPhase" << endl;
	}
	
	void Merger::postMergeCalAppPhase() {
		cout << "Entering Merger::postMergeCalAppPhase" << endl;
		
		cout << "Exiting Merger::postMergeCalAppPhase" << endl;
	}
	void Merger::mergeCalAtmosphere() {
		cout << "Entering Merger::mergeCalAtmosphere" << endl;
		if (hasMergedCalAtmosphere) {
			cout << "Exiting Merger::mergeCalAtmosphere" << endl;
			return;
		}
		
		vector <CalAtmosphereRow *> rows2 = ds2->getCalAtmosphere().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalAtmosphere merging row #" << i << endl;
			CalAtmosphereRow * row = ds1->getCalAtmosphere().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalAtmosphereRow * retRow = ds1->getCalAtmosphere().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalAtmosphere = true;
		cout << "Exiting Merger::mergeCalAtmosphere" << endl;
	}
	
	void Merger::postMergeCalAtmosphere() {
		cout << "Entering Merger::postMergeCalAtmosphere" << endl;
		
		cout << "Exiting Merger::postMergeCalAtmosphere" << endl;
	}
	void Merger::mergeCalBandpass() {
		cout << "Entering Merger::mergeCalBandpass" << endl;
		if (hasMergedCalBandpass) {
			cout << "Exiting Merger::mergeCalBandpass" << endl;
			return;
		}
		
		vector <CalBandpassRow *> rows2 = ds2->getCalBandpass().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalBandpass merging row #" << i << endl;
			CalBandpassRow * row = ds1->getCalBandpass().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalBandpassRow * retRow = ds1->getCalBandpass().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalBandpass = true;
		cout << "Exiting Merger::mergeCalBandpass" << endl;
	}
	
	void Merger::postMergeCalBandpass() {
		cout << "Entering Merger::postMergeCalBandpass" << endl;
		
		cout << "Exiting Merger::postMergeCalBandpass" << endl;
	}
	void Merger::mergeCalCurve() {
		cout << "Entering Merger::mergeCalCurve" << endl;
		if (hasMergedCalCurve) {
			cout << "Exiting Merger::mergeCalCurve" << endl;
			return;
		}
		
		vector <CalCurveRow *> rows2 = ds2->getCalCurve().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalCurve merging row #" << i << endl;
			CalCurveRow * row = ds1->getCalCurve().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalCurveRow * retRow = ds1->getCalCurve().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalCurve = true;
		cout << "Exiting Merger::mergeCalCurve" << endl;
	}
	
	void Merger::postMergeCalCurve() {
		cout << "Entering Merger::postMergeCalCurve" << endl;
		
		cout << "Exiting Merger::postMergeCalCurve" << endl;
	}
	void Merger::mergeCalData() {
		cout << "Entering Merger::mergeCalData" << endl;
		if (hasMergedCalData) {
			cout << "Exiting Merger::mergeCalData" << endl;
			return;
		}
		
		vector <CalDataRow *> rows2 = ds2->getCalData().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalData merging row #" << i << endl;
			CalDataRow * row = ds1->getCalData().newRow(rows2.at(i));
			
			
			CalDataRow * retRow = ds1->getCalData().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getCalDataId().toString(), retRow->getCalDataId()));
		}
		
		hasMergedCalData = true;
		cout << "Exiting Merger::mergeCalData" << endl;
	}
	
	void Merger::postMergeCalData() {
		cout << "Entering Merger::postMergeCalData" << endl;
		
		cout << "Exiting Merger::postMergeCalData" << endl;
	}
	void Merger::mergeCalDelay() {
		cout << "Entering Merger::mergeCalDelay" << endl;
		if (hasMergedCalDelay) {
			cout << "Exiting Merger::mergeCalDelay" << endl;
			return;
		}
		
		vector <CalDelayRow *> rows2 = ds2->getCalDelay().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalDelay merging row #" << i << endl;
			CalDelayRow * row = ds1->getCalDelay().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalDelayRow * retRow = ds1->getCalDelay().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalDelay = true;
		cout << "Exiting Merger::mergeCalDelay" << endl;
	}
	
	void Merger::postMergeCalDelay() {
		cout << "Entering Merger::postMergeCalDelay" << endl;
		
		cout << "Exiting Merger::postMergeCalDelay" << endl;
	}
	void Merger::mergeCalDevice() {
		cout << "Entering Merger::mergeCalDevice" << endl;
		if (hasMergedCalDevice) {
			cout << "Exiting Merger::mergeCalDevice" << endl;
			return;
		}
		
		vector <CalDeviceRow *> rows2 = ds2->getCalDevice().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalDevice merging row #" << i << endl;
			CalDeviceRow * row = ds1->getCalDevice().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			CalDeviceRow * retRow = ds1->getCalDevice().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalDevice = true;
		cout << "Exiting Merger::mergeCalDevice" << endl;
	}
	
	void Merger::postMergeCalDevice() {
		cout << "Entering Merger::postMergeCalDevice" << endl;
		
		cout << "Exiting Merger::postMergeCalDevice" << endl;
	}
	void Merger::mergeCalFlux() {
		cout << "Entering Merger::mergeCalFlux" << endl;
		if (hasMergedCalFlux) {
			cout << "Exiting Merger::mergeCalFlux" << endl;
			return;
		}
		
		vector <CalFluxRow *> rows2 = ds2->getCalFlux().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalFlux merging row #" << i << endl;
			CalFluxRow * row = ds1->getCalFlux().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalFluxRow * retRow = ds1->getCalFlux().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalFlux = true;
		cout << "Exiting Merger::mergeCalFlux" << endl;
	}
	
	void Merger::postMergeCalFlux() {
		cout << "Entering Merger::postMergeCalFlux" << endl;
		
		cout << "Exiting Merger::postMergeCalFlux" << endl;
	}
	void Merger::mergeCalFocusModel() {
		cout << "Entering Merger::mergeCalFocusModel" << endl;
		if (hasMergedCalFocusModel) {
			cout << "Exiting Merger::mergeCalFocusModel" << endl;
			return;
		}
		
		vector <CalFocusModelRow *> rows2 = ds2->getCalFocusModel().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalFocusModel merging row #" << i << endl;
			CalFocusModelRow * row = ds1->getCalFocusModel().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalFocusModelRow * retRow = ds1->getCalFocusModel().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalFocusModel = true;
		cout << "Exiting Merger::mergeCalFocusModel" << endl;
	}
	
	void Merger::postMergeCalFocusModel() {
		cout << "Entering Merger::postMergeCalFocusModel" << endl;
		
		cout << "Exiting Merger::postMergeCalFocusModel" << endl;
	}
	void Merger::mergeCalFocus() {
		cout << "Entering Merger::mergeCalFocus" << endl;
		if (hasMergedCalFocus) {
			cout << "Exiting Merger::mergeCalFocus" << endl;
			return;
		}
		
		vector <CalFocusRow *> rows2 = ds2->getCalFocus().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalFocus merging row #" << i << endl;
			CalFocusRow * row = ds1->getCalFocus().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalFocusRow * retRow = ds1->getCalFocus().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalFocus = true;
		cout << "Exiting Merger::mergeCalFocus" << endl;
	}
	
	void Merger::postMergeCalFocus() {
		cout << "Entering Merger::postMergeCalFocus" << endl;
		
		cout << "Exiting Merger::postMergeCalFocus" << endl;
	}
	void Merger::mergeCalGain() {
		cout << "Entering Merger::mergeCalGain" << endl;
		if (hasMergedCalGain) {
			cout << "Exiting Merger::mergeCalGain" << endl;
			return;
		}
		
		vector <CalGainRow *> rows2 = ds2->getCalGain().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalGain merging row #" << i << endl;
			CalGainRow * row = ds1->getCalGain().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalGainRow * retRow = ds1->getCalGain().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalGain = true;
		cout << "Exiting Merger::mergeCalGain" << endl;
	}
	
	void Merger::postMergeCalGain() {
		cout << "Entering Merger::postMergeCalGain" << endl;
		
		cout << "Exiting Merger::postMergeCalGain" << endl;
	}
	void Merger::mergeCalHolography() {
		cout << "Entering Merger::mergeCalHolography" << endl;
		if (hasMergedCalHolography) {
			cout << "Exiting Merger::mergeCalHolography" << endl;
			return;
		}
		
		vector <CalHolographyRow *> rows2 = ds2->getCalHolography().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalHolography merging row #" << i << endl;
			CalHolographyRow * row = ds1->getCalHolography().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalHolographyRow * retRow = ds1->getCalHolography().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalHolography = true;
		cout << "Exiting Merger::mergeCalHolography" << endl;
	}
	
	void Merger::postMergeCalHolography() {
		cout << "Entering Merger::postMergeCalHolography" << endl;
		
		cout << "Exiting Merger::postMergeCalHolography" << endl;
	}
	void Merger::mergeCalPhase() {
		cout << "Entering Merger::mergeCalPhase" << endl;
		if (hasMergedCalPhase) {
			cout << "Exiting Merger::mergeCalPhase" << endl;
			return;
		}
		
		vector <CalPhaseRow *> rows2 = ds2->getCalPhase().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalPhase merging row #" << i << endl;
			CalPhaseRow * row = ds1->getCalPhase().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalPhaseRow * retRow = ds1->getCalPhase().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalPhase = true;
		cout << "Exiting Merger::mergeCalPhase" << endl;
	}
	
	void Merger::postMergeCalPhase() {
		cout << "Entering Merger::postMergeCalPhase" << endl;
		
		cout << "Exiting Merger::postMergeCalPhase" << endl;
	}
	void Merger::mergeCalPointingModel() {
		cout << "Entering Merger::mergeCalPointingModel" << endl;
		if (hasMergedCalPointingModel) {
			cout << "Exiting Merger::mergeCalPointingModel" << endl;
			return;
		}
		
		vector <CalPointingModelRow *> rows2 = ds2->getCalPointingModel().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalPointingModel merging row #" << i << endl;
			CalPointingModelRow * row = ds1->getCalPointingModel().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalPointingModelRow * retRow = ds1->getCalPointingModel().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalPointingModel = true;
		cout << "Exiting Merger::mergeCalPointingModel" << endl;
	}
	
	void Merger::postMergeCalPointingModel() {
		cout << "Entering Merger::postMergeCalPointingModel" << endl;
		
		cout << "Exiting Merger::postMergeCalPointingModel" << endl;
	}
	void Merger::mergeCalPointing() {
		cout << "Entering Merger::mergeCalPointing" << endl;
		if (hasMergedCalPointing) {
			cout << "Exiting Merger::mergeCalPointing" << endl;
			return;
		}
		
		vector <CalPointingRow *> rows2 = ds2->getCalPointing().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalPointing merging row #" << i << endl;
			CalPointingRow * row = ds1->getCalPointing().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalPointingRow * retRow = ds1->getCalPointing().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalPointing = true;
		cout << "Exiting Merger::mergeCalPointing" << endl;
	}
	
	void Merger::postMergeCalPointing() {
		cout << "Entering Merger::postMergeCalPointing" << endl;
		
		cout << "Exiting Merger::postMergeCalPointing" << endl;
	}
	void Merger::mergeCalPosition() {
		cout << "Entering Merger::mergeCalPosition" << endl;
		if (hasMergedCalPosition) {
			cout << "Exiting Merger::mergeCalPosition" << endl;
			return;
		}
		
		vector <CalPositionRow *> rows2 = ds2->getCalPosition().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalPosition merging row #" << i << endl;
			CalPositionRow * row = ds1->getCalPosition().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalPositionRow * retRow = ds1->getCalPosition().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalPosition = true;
		cout << "Exiting Merger::mergeCalPosition" << endl;
	}
	
	void Merger::postMergeCalPosition() {
		cout << "Entering Merger::postMergeCalPosition" << endl;
		
		cout << "Exiting Merger::postMergeCalPosition" << endl;
	}
	void Merger::mergeCalPrimaryBeam() {
		cout << "Entering Merger::mergeCalPrimaryBeam" << endl;
		if (hasMergedCalPrimaryBeam) {
			cout << "Exiting Merger::mergeCalPrimaryBeam" << endl;
			return;
		}
		
		vector <CalPrimaryBeamRow *> rows2 = ds2->getCalPrimaryBeam().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalPrimaryBeam merging row #" << i << endl;
			CalPrimaryBeamRow * row = ds1->getCalPrimaryBeam().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalPrimaryBeamRow * retRow = ds1->getCalPrimaryBeam().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalPrimaryBeam = true;
		cout << "Exiting Merger::mergeCalPrimaryBeam" << endl;
	}
	
	void Merger::postMergeCalPrimaryBeam() {
		cout << "Entering Merger::postMergeCalPrimaryBeam" << endl;
		
		cout << "Exiting Merger::postMergeCalPrimaryBeam" << endl;
	}
	void Merger::mergeCalReduction() {
		cout << "Entering Merger::mergeCalReduction" << endl;
		if (hasMergedCalReduction) {
			cout << "Exiting Merger::mergeCalReduction" << endl;
			return;
		}
		
		vector <CalReductionRow *> rows2 = ds2->getCalReduction().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalReduction merging row #" << i << endl;
			CalReductionRow * row = ds1->getCalReduction().newRow(rows2.at(i));
			
			
			CalReductionRow * retRow = ds1->getCalReduction().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getCalReductionId().toString(), retRow->getCalReductionId()));
		}
		
		hasMergedCalReduction = true;
		cout << "Exiting Merger::mergeCalReduction" << endl;
	}
	
	void Merger::postMergeCalReduction() {
		cout << "Entering Merger::postMergeCalReduction" << endl;
		
		cout << "Exiting Merger::postMergeCalReduction" << endl;
	}
	void Merger::mergeCalSeeing() {
		cout << "Entering Merger::mergeCalSeeing" << endl;
		if (hasMergedCalSeeing) {
			cout << "Exiting Merger::mergeCalSeeing" << endl;
			return;
		}
		
		vector <CalSeeingRow *> rows2 = ds2->getCalSeeing().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalSeeing merging row #" << i << endl;
			CalSeeingRow * row = ds1->getCalSeeing().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalSeeingRow * retRow = ds1->getCalSeeing().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalSeeing = true;
		cout << "Exiting Merger::mergeCalSeeing" << endl;
	}
	
	void Merger::postMergeCalSeeing() {
		cout << "Entering Merger::postMergeCalSeeing" << endl;
		
		cout << "Exiting Merger::postMergeCalSeeing" << endl;
	}
	void Merger::mergeCalWVR() {
		cout << "Entering Merger::mergeCalWVR" << endl;
		if (hasMergedCalWVR) {
			cout << "Exiting Merger::mergeCalWVR" << endl;
			return;
		}
		
		vector <CalWVRRow *> rows2 = ds2->getCalWVR().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCalWVR merging row #" << i << endl;
			CalWVRRow * row = ds1->getCalWVR().newRow(rows2.at(i));
			
			
			Tag calDataIdTag = getTag(row->getCalDataId(), mergeCalDataPtr);
			row->setCalDataId(calDataIdTag);
			
			Tag calReductionIdTag = getTag(row->getCalReductionId(), mergeCalReductionPtr);
			row->setCalReductionId(calReductionIdTag);
			
			CalWVRRow * retRow = ds1->getCalWVR().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedCalWVR = true;
		cout << "Exiting Merger::mergeCalWVR" << endl;
	}
	
	void Merger::postMergeCalWVR() {
		cout << "Entering Merger::postMergeCalWVR" << endl;
		
		cout << "Exiting Merger::postMergeCalWVR" << endl;
	}
	void Merger::mergeConfigDescription() {
		cout << "Entering Merger::mergeConfigDescription" << endl;
		if (hasMergedConfigDescription) {
			cout << "Exiting Merger::mergeConfigDescription" << endl;
			return;
		}
		
		vector <ConfigDescriptionRow *> rows2 = ds2->getConfigDescription().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeConfigDescription merging row #" << i << endl;
			ConfigDescriptionRow * row = ds1->getConfigDescription().newRow(rows2.at(i));
			
			
			vector<vector<Tag> > antennaId2 = rows2.at(i)->getAntennaId();
			vector<vector<Tag> > antennaId1;
			for (unsigned int j = 0; j < antennaId2.size(); j++)
			row->setAntennaId(	antennaId1);
			
			vector<vector<Tag> > dataDescriptionId2 = rows2.at(i)->getDataDescriptionId();
			vector<vector<Tag> > dataDescriptionId1;
			for (unsigned int j = 0; j < dataDescriptionId2.size(); j++)
			row->setDataDescriptionId(	dataDescriptionId1);
			
			vector<vector<int> > feedId2 = rows2.at(i)->getFeedId();
			vector<vector<int> > feedId1;
			for (unsigned int j = 0; j < feedId2.size(); j++)
			row->setFeedId(	feedId1);
			
			Tag processorIdTag = getTag(row->getProcessorId(), mergeProcessorPtr);
			row->setProcessorId(processorIdTag);
			
			vector<vector<Tag> > switchCycleId2 = rows2.at(i)->getSwitchCycleId();
			vector<vector<Tag> > switchCycleId1;
			for (unsigned int j = 0; j < switchCycleId2.size(); j++)
			row->setSwitchCycleId(	switchCycleId1);
			
			ConfigDescriptionRow * retRow = ds1->getConfigDescription().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getConfigDescriptionId().toString(), retRow->getConfigDescriptionId()));
		}
		
		hasMergedConfigDescription = true;
		cout << "Exiting Merger::mergeConfigDescription" << endl;
	}
	
	void Merger::postMergeConfigDescription() {
		cout << "Entering Merger::postMergeConfigDescription" << endl;
		
		vector <ConfigDescriptionRow *> rows1 = ds1->getConfigDescription().get();
		ConfigDescriptionRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isAssocConfigDescriptionIdExists()) {
				
				vector<vector<Tag> > assocConfigDescriptionId1 = row1->getAssocConfigDescriptionId();
				vector<vector<Tag> > assocConfigDescriptionId1_new;
				for (unsigned int j = 0; j < assocConfigDescriptionId1.size(); j++) {
				}
				row1->setAssocConfigDescriptionId(	assocConfigDescriptionId1_new);
			}
		}
		cout << "Exiting Merger::postMergeConfigDescription" << endl;
	}
	void Merger::mergeCorrelatorMode() {
		cout << "Entering Merger::mergeCorrelatorMode" << endl;
		if (hasMergedCorrelatorMode) {
			cout << "Exiting Merger::mergeCorrelatorMode" << endl;
			return;
		}
		
		vector <CorrelatorModeRow *> rows2 = ds2->getCorrelatorMode().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeCorrelatorMode merging row #" << i << endl;
			CorrelatorModeRow * row = ds1->getCorrelatorMode().newRow(rows2.at(i));
			
			
			CorrelatorModeRow * retRow = ds1->getCorrelatorMode().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getCorrelatorModeId().toString(), retRow->getCorrelatorModeId()));
		}
		
		hasMergedCorrelatorMode = true;
		cout << "Exiting Merger::mergeCorrelatorMode" << endl;
	}
	
	void Merger::postMergeCorrelatorMode() {
		cout << "Entering Merger::postMergeCorrelatorMode" << endl;
		
		cout << "Exiting Merger::postMergeCorrelatorMode" << endl;
	}
	void Merger::mergeDataDescription() {
		cout << "Entering Merger::mergeDataDescription" << endl;
		if (hasMergedDataDescription) {
			cout << "Exiting Merger::mergeDataDescription" << endl;
			return;
		}
		
		vector <DataDescriptionRow *> rows2 = ds2->getDataDescription().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeDataDescription merging row #" << i << endl;
			DataDescriptionRow * row = ds1->getDataDescription().newRow(rows2.at(i));
			
			
			Tag polOrHoloIdTag = getTag(row->getPolOrHoloId(), mergePolOrHoloPtr);
			row->setPolOrHoloId(polOrHoloIdTag);
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			DataDescriptionRow * retRow = ds1->getDataDescription().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getDataDescriptionId().toString(), retRow->getDataDescriptionId()));
		}
		
		hasMergedDataDescription = true;
		cout << "Exiting Merger::mergeDataDescription" << endl;
	}
	
	void Merger::postMergeDataDescription() {
		cout << "Entering Merger::postMergeDataDescription" << endl;
		
		cout << "Exiting Merger::postMergeDataDescription" << endl;
	}
	void Merger::mergeDelayModelFixedParameters() {
		cout << "Entering Merger::mergeDelayModelFixedParameters" << endl;
		if (hasMergedDelayModelFixedParameters) {
			cout << "Exiting Merger::mergeDelayModelFixedParameters" << endl;
			return;
		}
		
		vector <DelayModelFixedParametersRow *> rows2 = ds2->getDelayModelFixedParameters().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeDelayModelFixedParameters merging row #" << i << endl;
			DelayModelFixedParametersRow * row = ds1->getDelayModelFixedParameters().newRow(rows2.at(i));
			
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			DelayModelFixedParametersRow * retRow = ds1->getDelayModelFixedParameters().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getDelayModelFixedParametersId().toString(), retRow->getDelayModelFixedParametersId()));
		}
		
		hasMergedDelayModelFixedParameters = true;
		cout << "Exiting Merger::mergeDelayModelFixedParameters" << endl;
	}
	
	void Merger::postMergeDelayModelFixedParameters() {
		cout << "Entering Merger::postMergeDelayModelFixedParameters" << endl;
		
		cout << "Exiting Merger::postMergeDelayModelFixedParameters" << endl;
	}
	void Merger::mergeDelayModel() {
		cout << "Entering Merger::mergeDelayModel" << endl;
		if (hasMergedDelayModel) {
			cout << "Exiting Merger::mergeDelayModel" << endl;
			return;
		}
		
		vector <DelayModelRow *> rows2 = ds2->getDelayModel().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeDelayModel merging row #" << i << endl;
			DelayModelRow * row = ds1->getDelayModel().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			Tag fieldIdTag = getTag(row->getFieldId(), mergeFieldPtr);
			row->setFieldId(fieldIdTag);
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			DelayModelRow * retRow = ds1->getDelayModel().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedDelayModel = true;
		cout << "Exiting Merger::mergeDelayModel" << endl;
	}
	
	void Merger::postMergeDelayModel() {
		cout << "Entering Merger::postMergeDelayModel" << endl;
		
		cout << "Exiting Merger::postMergeDelayModel" << endl;
	}
	void Merger::mergeDelayModelVariableParameters() {
		cout << "Entering Merger::mergeDelayModelVariableParameters" << endl;
		if (hasMergedDelayModelVariableParameters) {
			cout << "Exiting Merger::mergeDelayModelVariableParameters" << endl;
			return;
		}
		
		vector <DelayModelVariableParametersRow *> rows2 = ds2->getDelayModelVariableParameters().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeDelayModelVariableParameters merging row #" << i << endl;
			DelayModelVariableParametersRow * row = ds1->getDelayModelVariableParameters().newRow(rows2.at(i));
			
			
			Tag delayModelFixedParametersIdTag = getTag(row->getDelayModelFixedParametersId(), mergeDelayModelFixedParametersPtr);
			row->setDelayModelFixedParametersId(delayModelFixedParametersIdTag);
			
			DelayModelVariableParametersRow * retRow = ds1->getDelayModelVariableParameters().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getDelayModelVariableParametersId().toString(), retRow->getDelayModelVariableParametersId()));
		}
		
		hasMergedDelayModelVariableParameters = true;
		cout << "Exiting Merger::mergeDelayModelVariableParameters" << endl;
	}
	
	void Merger::postMergeDelayModelVariableParameters() {
		cout << "Entering Merger::postMergeDelayModelVariableParameters" << endl;
		
		cout << "Exiting Merger::postMergeDelayModelVariableParameters" << endl;
	}
	void Merger::mergeDoppler() {
		cout << "Entering Merger::mergeDoppler" << endl;
		if (hasMergedDoppler) {
			cout << "Exiting Merger::mergeDoppler" << endl;
			return;
		}
		
		vector <DopplerRow *> rows2 = ds2->getDoppler().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeDoppler merging row #" << i << endl;
			DopplerRow * row = ds1->getDoppler().newRow(rows2.at(i));
			
			
			
			DopplerRow * retRow = ds1->getDoppler().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("Doppler_"+Integer::toString(rows2.at(i)->getDopplerId()), retRow->getDopplerId()));
		}
		
		hasMergedDoppler = true;
		cout << "Exiting Merger::mergeDoppler" << endl;
	}
	
	void Merger::postMergeDoppler() {
		cout << "Entering Merger::postMergeDoppler" << endl;
		
		cout << "Exiting Merger::postMergeDoppler" << endl;
	}
	void Merger::mergeEphemeris() {
		cout << "Entering Merger::mergeEphemeris" << endl;
		if (hasMergedEphemeris) {
			cout << "Exiting Merger::mergeEphemeris" << endl;
			return;
		}
		
		vector <EphemerisRow *> rows2 = ds2->getEphemeris().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeEphemeris merging row #" << i << endl;
			EphemerisRow * row = ds1->getEphemeris().newRow(rows2.at(i));
			
			
			EphemerisRow * retRow = ds1->getEphemeris().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedEphemeris = true;
		cout << "Exiting Merger::mergeEphemeris" << endl;
	}
	
	void Merger::postMergeEphemeris() {
		cout << "Entering Merger::postMergeEphemeris" << endl;
		
		cout << "Exiting Merger::postMergeEphemeris" << endl;
	}
	void Merger::mergeExecBlock() {
		cout << "Entering Merger::mergeExecBlock" << endl;
		if (hasMergedExecBlock) {
			cout << "Exiting Merger::mergeExecBlock" << endl;
			return;
		}
		
		vector <ExecBlockRow *> rows2 = ds2->getExecBlock().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeExecBlock merging row #" << i << endl;
			ExecBlockRow * row = ds1->getExecBlock().newRow(rows2.at(i));
			
			
			vector<vector<Tag> > antennaId2 = rows2.at(i)->getAntennaId();
			vector<vector<Tag> > antennaId1;
			for (unsigned int j = 0; j < antennaId2.size(); j++)
			row->setAntennaId(	antennaId1);
			
			Tag sBSummaryIdTag = getTag(row->getSBSummaryId(), mergeSBSummaryPtr);
			row->setSBSummaryId(sBSummaryIdTag);
			
			ExecBlockRow * retRow = ds1->getExecBlock().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getExecBlockId().toString(), retRow->getExecBlockId()));
		}
		
		hasMergedExecBlock = true;
		cout << "Exiting Merger::mergeExecBlock" << endl;
	}
	
	void Merger::postMergeExecBlock() {
		cout << "Entering Merger::postMergeExecBlock" << endl;
		
		vector <ExecBlockRow *> rows1 = ds1->getExecBlock().get();
		ExecBlockRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isScaleIdExists()) {
				
					
					row1->setScaleId(getTag(row1->getScaleId(), 0));
			}
		}
		cout << "Exiting Merger::postMergeExecBlock" << endl;
	}
	void Merger::mergeFeed() {
		cout << "Entering Merger::mergeFeed" << endl;
		if (hasMergedFeed) {
			cout << "Exiting Merger::mergeFeed" << endl;
			return;
		}
		
		vector <FeedRow *> rows2 = ds2->getFeed().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFeed merging row #" << i << endl;
			FeedRow * row = ds1->getFeed().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			vector<vector<int> > receiverId2 = rows2.at(i)->getReceiverId();
			vector<vector<int> > receiverId1;
			for (unsigned int j = 0; j < receiverId2.size(); j++)
			row->setReceiverId(	receiverId1);
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			FeedRow * retRow = ds1->getFeed().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("Feed_"+Integer::toString(rows2.at(i)->getFeedId()), retRow->getFeedId()));
		}
		
		hasMergedFeed = true;
		cout << "Exiting Merger::mergeFeed" << endl;
	}
	
	void Merger::postMergeFeed() {
		cout << "Entering Merger::postMergeFeed" << endl;
		
		cout << "Exiting Merger::postMergeFeed" << endl;
	}
	void Merger::mergeField() {
		cout << "Entering Merger::mergeField" << endl;
		if (hasMergedField) {
			cout << "Exiting Merger::mergeField" << endl;
			return;
		}
		
		vector <FieldRow *> rows2 = ds2->getField().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeField merging row #" << i << endl;
			FieldRow * row = ds1->getField().newRow(rows2.at(i));
			
			
			FieldRow * retRow = ds1->getField().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getFieldId().toString(), retRow->getFieldId()));
		}
		
		hasMergedField = true;
		cout << "Exiting Merger::mergeField" << endl;
	}
	
	void Merger::postMergeField() {
		cout << "Entering Merger::postMergeField" << endl;
		
		vector <FieldRow *> rows1 = ds1->getField().get();
		FieldRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isAssocFieldIdExists()) {
				
					
					row1->setAssocFieldId(getTag(row1->getAssocFieldId(), 0));
			}
			if (row1->isEphemerisIdExists()) {
				
					
			}
			if (row1->isSourceIdExists()) {
				
					
			}
		}
		cout << "Exiting Merger::postMergeField" << endl;
	}
	void Merger::mergeFlagCmd() {
		cout << "Entering Merger::mergeFlagCmd" << endl;
		if (hasMergedFlagCmd) {
			cout << "Exiting Merger::mergeFlagCmd" << endl;
			return;
		}
		
		vector <FlagCmdRow *> rows2 = ds2->getFlagCmd().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFlagCmd merging row #" << i << endl;
			FlagCmdRow * row = ds1->getFlagCmd().newRow(rows2.at(i));
			
			
			FlagCmdRow * retRow = ds1->getFlagCmd().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedFlagCmd = true;
		cout << "Exiting Merger::mergeFlagCmd" << endl;
	}
	
	void Merger::postMergeFlagCmd() {
		cout << "Entering Merger::postMergeFlagCmd" << endl;
		
		cout << "Exiting Merger::postMergeFlagCmd" << endl;
	}
	void Merger::mergeFlag() {
		cout << "Entering Merger::mergeFlag" << endl;
		if (hasMergedFlag) {
			cout << "Exiting Merger::mergeFlag" << endl;
			return;
		}
		
		vector <FlagRow *> rows2 = ds2->getFlag().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFlag merging row #" << i << endl;
			FlagRow * row = ds1->getFlag().newRow(rows2.at(i));
			
			
			vector<vector<Tag> > antennaId2 = rows2.at(i)->getAntennaId();
			vector<vector<Tag> > antennaId1;
			for (unsigned int j = 0; j < antennaId2.size(); j++)
			row->setAntennaId(	antennaId1);
			
			FlagRow * retRow = ds1->getFlag().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getFlagId().toString(), retRow->getFlagId()));
		}
		
		hasMergedFlag = true;
		cout << "Exiting Merger::mergeFlag" << endl;
	}
	
	void Merger::postMergeFlag() {
		cout << "Entering Merger::postMergeFlag" << endl;
		
		vector <FlagRow *> rows1 = ds1->getFlag().get();
		FlagRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isPairedAntennaIdExists()) {
				
				vector<vector<Tag> > pairedAntennaId1 = row1->getPairedAntennaId();
				vector<vector<Tag> > pairedAntennaId1_new;
				for (unsigned int j = 0; j < pairedAntennaId1.size(); j++) {
				}
				row1->setPairedAntennaId(	pairedAntennaId1_new);
			}
			if (row1->isSpectralWindowIdExists()) {
				
				vector<vector<Tag> > spectralWindowId1 = row1->getSpectralWindowId();
				vector<vector<Tag> > spectralWindowId1_new;
				for (unsigned int j = 0; j < spectralWindowId1.size(); j++) {
				}
				row1->setSpectralWindowId(	spectralWindowId1_new);
			}
		}
		cout << "Exiting Merger::postMergeFlag" << endl;
	}
	void Merger::mergeFocusModel() {
		cout << "Entering Merger::mergeFocusModel" << endl;
		if (hasMergedFocusModel) {
			cout << "Exiting Merger::mergeFocusModel" << endl;
			return;
		}
		
		vector <FocusModelRow *> rows2 = ds2->getFocusModel().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFocusModel merging row #" << i << endl;
			FocusModelRow * row = ds1->getFocusModel().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			FocusModelRow * retRow = ds1->getFocusModel().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("FocusModel_"+Integer::toString(rows2.at(i)->getFocusModelId()), retRow->getFocusModelId()));
		}
		
		hasMergedFocusModel = true;
		cout << "Exiting Merger::mergeFocusModel" << endl;
	}
	
	void Merger::postMergeFocusModel() {
		cout << "Entering Merger::postMergeFocusModel" << endl;
		
		cout << "Exiting Merger::postMergeFocusModel" << endl;
	}
	void Merger::mergeFocus() {
		cout << "Entering Merger::mergeFocus" << endl;
		if (hasMergedFocus) {
			cout << "Exiting Merger::mergeFocus" << endl;
			return;
		}
		
		vector <FocusRow *> rows2 = ds2->getFocus().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFocus merging row #" << i << endl;
			FocusRow * row = ds1->getFocus().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			FocusRow * retRow = ds1->getFocus().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedFocus = true;
		cout << "Exiting Merger::mergeFocus" << endl;
	}
	
	void Merger::postMergeFocus() {
		cout << "Entering Merger::postMergeFocus" << endl;
		
		cout << "Exiting Merger::postMergeFocus" << endl;
	}
	void Merger::mergeFreqOffset() {
		cout << "Entering Merger::mergeFreqOffset" << endl;
		if (hasMergedFreqOffset) {
			cout << "Exiting Merger::mergeFreqOffset" << endl;
			return;
		}
		
		vector <FreqOffsetRow *> rows2 = ds2->getFreqOffset().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeFreqOffset merging row #" << i << endl;
			FreqOffsetRow * row = ds1->getFreqOffset().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			FreqOffsetRow * retRow = ds1->getFreqOffset().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedFreqOffset = true;
		cout << "Exiting Merger::mergeFreqOffset" << endl;
	}
	
	void Merger::postMergeFreqOffset() {
		cout << "Entering Merger::postMergeFreqOffset" << endl;
		
		cout << "Exiting Merger::postMergeFreqOffset" << endl;
	}
	void Merger::mergeGainTracking() {
		cout << "Entering Merger::mergeGainTracking" << endl;
		if (hasMergedGainTracking) {
			cout << "Exiting Merger::mergeGainTracking" << endl;
			return;
		}
		
		vector <GainTrackingRow *> rows2 = ds2->getGainTracking().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeGainTracking merging row #" << i << endl;
			GainTrackingRow * row = ds1->getGainTracking().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			GainTrackingRow * retRow = ds1->getGainTracking().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedGainTracking = true;
		cout << "Exiting Merger::mergeGainTracking" << endl;
	}
	
	void Merger::postMergeGainTracking() {
		cout << "Entering Merger::postMergeGainTracking" << endl;
		
		cout << "Exiting Merger::postMergeGainTracking" << endl;
	}
	void Merger::mergeHistory() {
		cout << "Entering Merger::mergeHistory" << endl;
		if (hasMergedHistory) {
			cout << "Exiting Merger::mergeHistory" << endl;
			return;
		}
		
		vector <HistoryRow *> rows2 = ds2->getHistory().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeHistory merging row #" << i << endl;
			HistoryRow * row = ds1->getHistory().newRow(rows2.at(i));
			
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			HistoryRow * retRow = ds1->getHistory().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedHistory = true;
		cout << "Exiting Merger::mergeHistory" << endl;
	}
	
	void Merger::postMergeHistory() {
		cout << "Entering Merger::postMergeHistory" << endl;
		
		cout << "Exiting Merger::postMergeHistory" << endl;
	}
	void Merger::mergeHolography() {
		cout << "Entering Merger::mergeHolography" << endl;
		if (hasMergedHolography) {
			cout << "Exiting Merger::mergeHolography" << endl;
			return;
		}
		
		vector <HolographyRow *> rows2 = ds2->getHolography().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeHolography merging row #" << i << endl;
			HolographyRow * row = ds1->getHolography().newRow(rows2.at(i));
			
			
			HolographyRow * retRow = ds1->getHolography().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getHolographyId().toString(), retRow->getHolographyId()));
		}
		
		hasMergedHolography = true;
		cout << "Exiting Merger::mergeHolography" << endl;
	}
	
	void Merger::postMergeHolography() {
		cout << "Entering Merger::postMergeHolography" << endl;
		
		cout << "Exiting Merger::postMergeHolography" << endl;
	}
	void Merger::mergeMain() {
		cout << "Entering Merger::mergeMain" << endl;
		if (hasMergedMain) {
			cout << "Exiting Merger::mergeMain" << endl;
			return;
		}
		
		vector <MainRow *> rows2 = ds2->getMain().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeMain merging row #" << i << endl;
			MainRow * row = ds1->getMain().newRow(rows2.at(i));
			
			
			Tag configDescriptionIdTag = getTag(row->getConfigDescriptionId(), mergeConfigDescriptionPtr);
			row->setConfigDescriptionId(configDescriptionIdTag);
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			Tag fieldIdTag = getTag(row->getFieldId(), mergeFieldPtr);
			row->setFieldId(fieldIdTag);
			
			vector<vector<Tag> > stateId2 = rows2.at(i)->getStateId();
			vector<vector<Tag> > stateId1;
			for (unsigned int j = 0; j < stateId2.size(); j++)
			row->setStateId(	stateId1);
			
			MainRow * retRow = ds1->getMain().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedMain = true;
		cout << "Exiting Merger::mergeMain" << endl;
	}
	
	void Merger::postMergeMain() {
		cout << "Entering Merger::postMergeMain" << endl;
		
		cout << "Exiting Merger::postMergeMain" << endl;
	}
	void Merger::mergeObservation() {
		cout << "Entering Merger::mergeObservation" << endl;
		if (hasMergedObservation) {
			cout << "Exiting Merger::mergeObservation" << endl;
			return;
		}
		
		vector <ObservationRow *> rows2 = ds2->getObservation().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeObservation merging row #" << i << endl;
			ObservationRow * row = ds1->getObservation().newRow(rows2.at(i));
			
			
			ObservationRow * retRow = ds1->getObservation().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getObservationId().toString(), retRow->getObservationId()));
		}
		
		hasMergedObservation = true;
		cout << "Exiting Merger::mergeObservation" << endl;
	}
	
	void Merger::postMergeObservation() {
		cout << "Entering Merger::postMergeObservation" << endl;
		
		cout << "Exiting Merger::postMergeObservation" << endl;
	}
	void Merger::mergePointingModel() {
		cout << "Entering Merger::mergePointingModel" << endl;
		if (hasMergedPointingModel) {
			cout << "Exiting Merger::mergePointingModel" << endl;
			return;
		}
		
		vector <PointingModelRow *> rows2 = ds2->getPointingModel().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergePointingModel merging row #" << i << endl;
			PointingModelRow * row = ds1->getPointingModel().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			PointingModelRow * retRow = ds1->getPointingModel().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("PointingModel_"+Integer::toString(rows2.at(i)->getPointingModelId()), retRow->getPointingModelId()));
		}
		
		hasMergedPointingModel = true;
		cout << "Exiting Merger::mergePointingModel" << endl;
	}
	
	void Merger::postMergePointingModel() {
		cout << "Entering Merger::postMergePointingModel" << endl;
		
		cout << "Exiting Merger::postMergePointingModel" << endl;
	}
	void Merger::mergePointing() {
		cout << "Entering Merger::mergePointing" << endl;
		if (hasMergedPointing) {
			cout << "Exiting Merger::mergePointing" << endl;
			return;
		}
		
		vector <PointingRow *> rows2 = ds2->getPointing().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergePointing merging row #" << i << endl;
			PointingRow * row = ds1->getPointing().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			PointingRow * retRow = ds1->getPointing().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedPointing = true;
		cout << "Exiting Merger::mergePointing" << endl;
	}
	
	void Merger::postMergePointing() {
		cout << "Entering Merger::postMergePointing" << endl;
		
		cout << "Exiting Merger::postMergePointing" << endl;
	}
	void Merger::mergePolarization() {
		cout << "Entering Merger::mergePolarization" << endl;
		if (hasMergedPolarization) {
			cout << "Exiting Merger::mergePolarization" << endl;
			return;
		}
		
		vector <PolarizationRow *> rows2 = ds2->getPolarization().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergePolarization merging row #" << i << endl;
			PolarizationRow * row = ds1->getPolarization().newRow(rows2.at(i));
			
			
			PolarizationRow * retRow = ds1->getPolarization().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getPolarizationId().toString(), retRow->getPolarizationId()));
		}
		
		hasMergedPolarization = true;
		cout << "Exiting Merger::mergePolarization" << endl;
	}
	
	void Merger::postMergePolarization() {
		cout << "Entering Merger::postMergePolarization" << endl;
		
		cout << "Exiting Merger::postMergePolarization" << endl;
	}
	void Merger::mergeProcessor() {
		cout << "Entering Merger::mergeProcessor" << endl;
		if (hasMergedProcessor) {
			cout << "Exiting Merger::mergeProcessor" << endl;
			return;
		}
		
		vector <ProcessorRow *> rows2 = ds2->getProcessor().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeProcessor merging row #" << i << endl;
			ProcessorRow * row = ds1->getProcessor().newRow(rows2.at(i));
			
			
			ProcessorRow * retRow = ds1->getProcessor().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getProcessorId().toString(), retRow->getProcessorId()));
		}
		
		hasMergedProcessor = true;
		cout << "Exiting Merger::mergeProcessor" << endl;
	}
	
	void Merger::postMergeProcessor() {
		cout << "Entering Merger::postMergeProcessor" << endl;
		
		cout << "Exiting Merger::postMergeProcessor" << endl;
	}
	void Merger::mergeReceiver() {
		cout << "Entering Merger::mergeReceiver" << endl;
		if (hasMergedReceiver) {
			cout << "Exiting Merger::mergeReceiver" << endl;
			return;
		}
		
		vector <ReceiverRow *> rows2 = ds2->getReceiver().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeReceiver merging row #" << i << endl;
			ReceiverRow * row = ds1->getReceiver().newRow(rows2.at(i));
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			ReceiverRow * retRow = ds1->getReceiver().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("Receiver_"+Integer::toString(rows2.at(i)->getReceiverId()), retRow->getReceiverId()));
		}
		
		hasMergedReceiver = true;
		cout << "Exiting Merger::mergeReceiver" << endl;
	}
	
	void Merger::postMergeReceiver() {
		cout << "Entering Merger::postMergeReceiver" << endl;
		
		cout << "Exiting Merger::postMergeReceiver" << endl;
	}
	void Merger::mergeSBSummary() {
		cout << "Entering Merger::mergeSBSummary" << endl;
		if (hasMergedSBSummary) {
			cout << "Exiting Merger::mergeSBSummary" << endl;
			return;
		}
		
		vector <SBSummaryRow *> rows2 = ds2->getSBSummary().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSBSummary merging row #" << i << endl;
			SBSummaryRow * row = ds1->getSBSummary().newRow(rows2.at(i));
			
			
			SBSummaryRow * retRow = ds1->getSBSummary().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getSBSummaryId().toString(), retRow->getSBSummaryId()));
		}
		
		hasMergedSBSummary = true;
		cout << "Exiting Merger::mergeSBSummary" << endl;
	}
	
	void Merger::postMergeSBSummary() {
		cout << "Entering Merger::postMergeSBSummary" << endl;
		
		cout << "Exiting Merger::postMergeSBSummary" << endl;
	}
	void Merger::mergeScale() {
		cout << "Entering Merger::mergeScale" << endl;
		if (hasMergedScale) {
			cout << "Exiting Merger::mergeScale" << endl;
			return;
		}
		
		vector <ScaleRow *> rows2 = ds2->getScale().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeScale merging row #" << i << endl;
			ScaleRow * row = ds1->getScale().newRow(rows2.at(i));
			
			
			ScaleRow * retRow = ds1->getScale().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getScaleId().toString(), retRow->getScaleId()));
		}
		
		hasMergedScale = true;
		cout << "Exiting Merger::mergeScale" << endl;
	}
	
	void Merger::postMergeScale() {
		cout << "Entering Merger::postMergeScale" << endl;
		
		cout << "Exiting Merger::postMergeScale" << endl;
	}
	void Merger::mergeScan() {
		cout << "Entering Merger::mergeScan" << endl;
		if (hasMergedScan) {
			cout << "Exiting Merger::mergeScan" << endl;
			return;
		}
		
		vector <ScanRow *> rows2 = ds2->getScan().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeScan merging row #" << i << endl;
			ScanRow * row = ds1->getScan().newRow(rows2.at(i));
			
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			ScanRow * retRow = ds1->getScan().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedScan = true;
		cout << "Exiting Merger::mergeScan" << endl;
	}
	
	void Merger::postMergeScan() {
		cout << "Entering Merger::postMergeScan" << endl;
		
		cout << "Exiting Merger::postMergeScan" << endl;
	}
	void Merger::mergeSeeing() {
		cout << "Entering Merger::mergeSeeing" << endl;
		if (hasMergedSeeing) {
			cout << "Exiting Merger::mergeSeeing" << endl;
			return;
		}
		
		vector <SeeingRow *> rows2 = ds2->getSeeing().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSeeing merging row #" << i << endl;
			SeeingRow * row = ds1->getSeeing().newRow(rows2.at(i));
			
			
			SeeingRow * retRow = ds1->getSeeing().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedSeeing = true;
		cout << "Exiting Merger::mergeSeeing" << endl;
	}
	
	void Merger::postMergeSeeing() {
		cout << "Entering Merger::postMergeSeeing" << endl;
		
		cout << "Exiting Merger::postMergeSeeing" << endl;
	}
	void Merger::mergeSource() {
		cout << "Entering Merger::mergeSource" << endl;
		if (hasMergedSource) {
			cout << "Exiting Merger::mergeSource" << endl;
			return;
		}
		
		vector <SourceRow *> rows2 = ds2->getSource().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSource merging row #" << i << endl;
			SourceRow * row = ds1->getSource().newRow(rows2.at(i));
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			SourceRow * retRow = ds1->getSource().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			idId.insert(make_pair("Source_"+Integer::toString(rows2.at(i)->getSourceId()), retRow->getSourceId()));
		}
		
		hasMergedSource = true;
		cout << "Exiting Merger::mergeSource" << endl;
	}
	
	void Merger::postMergeSource() {
		cout << "Entering Merger::postMergeSource" << endl;
		
		cout << "Exiting Merger::postMergeSource" << endl;
	}
	void Merger::mergeSpectralWindow() {
		cout << "Entering Merger::mergeSpectralWindow" << endl;
		if (hasMergedSpectralWindow) {
			cout << "Exiting Merger::mergeSpectralWindow" << endl;
			return;
		}
		
		vector <SpectralWindowRow *> rows2 = ds2->getSpectralWindow().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSpectralWindow merging row #" << i << endl;
			SpectralWindowRow * row = ds1->getSpectralWindow().newRow(rows2.at(i));
			
			
			SpectralWindowRow * retRow = ds1->getSpectralWindow().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getSpectralWindowId().toString(), retRow->getSpectralWindowId()));
		}
		
		hasMergedSpectralWindow = true;
		cout << "Exiting Merger::mergeSpectralWindow" << endl;
	}
	
	void Merger::postMergeSpectralWindow() {
		cout << "Entering Merger::postMergeSpectralWindow" << endl;
		
		vector <SpectralWindowRow *> rows1 = ds1->getSpectralWindow().get();
		SpectralWindowRow *row1 = 0;
		
		for (unsigned int i = 0; i < rows1.size(); i++) {
			row1 = rows1.at(i);
			
			if (row1->isAssocSpectralWindowIdExists()) {
				
				vector<vector<Tag> > assocSpectralWindowId1 = row1->getAssocSpectralWindowId();
				vector<vector<Tag> > assocSpectralWindowId1_new;
				for (unsigned int j = 0; j < assocSpectralWindowId1.size(); j++) {
				}
				row1->setAssocSpectralWindowId(	assocSpectralWindowId1_new);
			}
			if (row1->isDopplerIdExists()) {
				
					
			}
			if (row1->isImageSpectralWindowIdExists()) {
				
					
					row1->setImageSpectralWindowId(getTag(row1->getImageSpectralWindowId(), 0));
			}
		}
		cout << "Exiting Merger::postMergeSpectralWindow" << endl;
	}
	void Merger::mergeSquareLawDetector() {
		cout << "Entering Merger::mergeSquareLawDetector" << endl;
		if (hasMergedSquareLawDetector) {
			cout << "Exiting Merger::mergeSquareLawDetector" << endl;
			return;
		}
		
		vector <SquareLawDetectorRow *> rows2 = ds2->getSquareLawDetector().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSquareLawDetector merging row #" << i << endl;
			SquareLawDetectorRow * row = ds1->getSquareLawDetector().newRow(rows2.at(i));
			
			
			SquareLawDetectorRow * retRow = ds1->getSquareLawDetector().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getSquareLawDetectorId().toString(), retRow->getSquareLawDetectorId()));
		}
		
		hasMergedSquareLawDetector = true;
		cout << "Exiting Merger::mergeSquareLawDetector" << endl;
	}
	
	void Merger::postMergeSquareLawDetector() {
		cout << "Entering Merger::postMergeSquareLawDetector" << endl;
		
		cout << "Exiting Merger::postMergeSquareLawDetector" << endl;
	}
	void Merger::mergeState() {
		cout << "Entering Merger::mergeState" << endl;
		if (hasMergedState) {
			cout << "Exiting Merger::mergeState" << endl;
			return;
		}
		
		vector <StateRow *> rows2 = ds2->getState().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeState merging row #" << i << endl;
			StateRow * row = ds1->getState().newRow(rows2.at(i));
			
			
			StateRow * retRow = ds1->getState().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getStateId().toString(), retRow->getStateId()));
		}
		
		hasMergedState = true;
		cout << "Exiting Merger::mergeState" << endl;
	}
	
	void Merger::postMergeState() {
		cout << "Entering Merger::postMergeState" << endl;
		
		cout << "Exiting Merger::postMergeState" << endl;
	}
	void Merger::mergeStation() {
		cout << "Entering Merger::mergeStation" << endl;
		if (hasMergedStation) {
			cout << "Exiting Merger::mergeStation" << endl;
			return;
		}
		
		vector <StationRow *> rows2 = ds2->getStation().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeStation merging row #" << i << endl;
			StationRow * row = ds1->getStation().newRow(rows2.at(i));
			
			
			StationRow * retRow = ds1->getStation().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getStationId().toString(), retRow->getStationId()));
		}
		
		hasMergedStation = true;
		cout << "Exiting Merger::mergeStation" << endl;
	}
	
	void Merger::postMergeStation() {
		cout << "Entering Merger::postMergeStation" << endl;
		
		cout << "Exiting Merger::postMergeStation" << endl;
	}
	void Merger::mergeSubscan() {
		cout << "Entering Merger::mergeSubscan" << endl;
		if (hasMergedSubscan) {
			cout << "Exiting Merger::mergeSubscan" << endl;
			return;
		}
		
		vector <SubscanRow *> rows2 = ds2->getSubscan().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSubscan merging row #" << i << endl;
			SubscanRow * row = ds1->getSubscan().newRow(rows2.at(i));
			
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			SubscanRow * retRow = ds1->getSubscan().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedSubscan = true;
		cout << "Exiting Merger::mergeSubscan" << endl;
	}
	
	void Merger::postMergeSubscan() {
		cout << "Entering Merger::postMergeSubscan" << endl;
		
		cout << "Exiting Merger::postMergeSubscan" << endl;
	}
	void Merger::mergeSwitchCycle() {
		cout << "Entering Merger::mergeSwitchCycle" << endl;
		if (hasMergedSwitchCycle) {
			cout << "Exiting Merger::mergeSwitchCycle" << endl;
			return;
		}
		
		vector <SwitchCycleRow *> rows2 = ds2->getSwitchCycle().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSwitchCycle merging row #" << i << endl;
			SwitchCycleRow * row = ds1->getSwitchCycle().newRow(rows2.at(i));
			
			
			SwitchCycleRow * retRow = ds1->getSwitchCycle().add(row);
			if (false) cout << (unsigned long long) retRow;
			
			tagTag.insert(make_pair(rows2.at(i)->getSwitchCycleId().toString(), retRow->getSwitchCycleId()));
		}
		
		hasMergedSwitchCycle = true;
		cout << "Exiting Merger::mergeSwitchCycle" << endl;
	}
	
	void Merger::postMergeSwitchCycle() {
		cout << "Entering Merger::postMergeSwitchCycle" << endl;
		
		cout << "Exiting Merger::postMergeSwitchCycle" << endl;
	}
	void Merger::mergeSysCal() {
		cout << "Entering Merger::mergeSysCal" << endl;
		if (hasMergedSysCal) {
			cout << "Exiting Merger::mergeSysCal" << endl;
			return;
		}
		
		vector <SysCalRow *> rows2 = ds2->getSysCal().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSysCal merging row #" << i << endl;
			SysCalRow * row = ds1->getSysCal().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			SysCalRow * retRow = ds1->getSysCal().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedSysCal = true;
		cout << "Exiting Merger::mergeSysCal" << endl;
	}
	
	void Merger::postMergeSysCal() {
		cout << "Entering Merger::postMergeSysCal" << endl;
		
		cout << "Exiting Merger::postMergeSysCal" << endl;
	}
	void Merger::mergeSysPower() {
		cout << "Entering Merger::mergeSysPower" << endl;
		if (hasMergedSysPower) {
			cout << "Exiting Merger::mergeSysPower" << endl;
			return;
		}
		
		vector <SysPowerRow *> rows2 = ds2->getSysPower().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeSysPower merging row #" << i << endl;
			SysPowerRow * row = ds1->getSysPower().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			SysPowerRow * retRow = ds1->getSysPower().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedSysPower = true;
		cout << "Exiting Merger::mergeSysPower" << endl;
	}
	
	void Merger::postMergeSysPower() {
		cout << "Entering Merger::postMergeSysPower" << endl;
		
		cout << "Exiting Merger::postMergeSysPower" << endl;
	}
	void Merger::mergeTotalPower() {
		cout << "Entering Merger::mergeTotalPower" << endl;
		if (hasMergedTotalPower) {
			cout << "Exiting Merger::mergeTotalPower" << endl;
			return;
		}
		
		vector <TotalPowerRow *> rows2 = ds2->getTotalPower().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeTotalPower merging row #" << i << endl;
			TotalPowerRow * row = ds1->getTotalPower().newRow(rows2.at(i));
			
			
			Tag configDescriptionIdTag = getTag(row->getConfigDescriptionId(), mergeConfigDescriptionPtr);
			row->setConfigDescriptionId(configDescriptionIdTag);
			
			Tag execBlockIdTag = getTag(row->getExecBlockId(), mergeExecBlockPtr);
			row->setExecBlockId(execBlockIdTag);
			
			Tag fieldIdTag = getTag(row->getFieldId(), mergeFieldPtr);
			row->setFieldId(fieldIdTag);
			
			vector<vector<Tag> > stateId2 = rows2.at(i)->getStateId();
			vector<vector<Tag> > stateId1;
			for (unsigned int j = 0; j < stateId2.size(); j++)
			row->setStateId(	stateId1);
			
			TotalPowerRow * retRow = ds1->getTotalPower().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedTotalPower = true;
		cout << "Exiting Merger::mergeTotalPower" << endl;
	}
	
	void Merger::postMergeTotalPower() {
		cout << "Entering Merger::postMergeTotalPower" << endl;
		
		cout << "Exiting Merger::postMergeTotalPower" << endl;
	}
	void Merger::mergeWeather() {
		cout << "Entering Merger::mergeWeather" << endl;
		if (hasMergedWeather) {
			cout << "Exiting Merger::mergeWeather" << endl;
			return;
		}
		
		vector <WeatherRow *> rows2 = ds2->getWeather().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeWeather merging row #" << i << endl;
			WeatherRow * row = ds1->getWeather().newRow(rows2.at(i));
			
			
			Tag stationIdTag = getTag(row->getStationId(), mergeStationPtr);
			row->setStationId(stationIdTag);
			
			WeatherRow * retRow = ds1->getWeather().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedWeather = true;
		cout << "Exiting Merger::mergeWeather" << endl;
	}
	
	void Merger::postMergeWeather() {
		cout << "Entering Merger::postMergeWeather" << endl;
		
		cout << "Exiting Merger::postMergeWeather" << endl;
	}
	void Merger::mergeWVMCal() {
		cout << "Entering Merger::mergeWVMCal" << endl;
		if (hasMergedWVMCal) {
			cout << "Exiting Merger::mergeWVMCal" << endl;
			return;
		}
		
		vector <WVMCalRow *> rows2 = ds2->getWVMCal().get();
		
		for (unsigned int i = 0; i < rows2.size(); i++) {
			cout << "Merger::mergeWVMCal merging row #" << i << endl;
			WVMCalRow * row = ds1->getWVMCal().newRow(rows2.at(i));
			
			
			Tag antennaIdTag = getTag(row->getAntennaId(), mergeAntennaPtr);
			row->setAntennaId(antennaIdTag);
			
			vector<vector<Tag> > inputAntennaId2 = rows2.at(i)->getInputAntennaId();
			vector<vector<Tag> > inputAntennaId1;
			for (unsigned int j = 0; j < inputAntennaId2.size(); j++)
			row->setInputAntennaId(	inputAntennaId1);
			
			Tag spectralWindowIdTag = getTag(row->getSpectralWindowId(), mergeSpectralWindowPtr);
			row->setSpectralWindowId(spectralWindowIdTag);
			
			WVMCalRow * retRow = ds1->getWVMCal().add(row);
			if (false) cout << (unsigned long long) retRow;
			
		}
		
		hasMergedWVMCal = true;
		cout << "Exiting Merger::mergeWVMCal" << endl;
	}
	
	void Merger::postMergeWVMCal() {
		cout << "Entering Merger::postMergeWVMCal" << endl;
		
		cout << "Exiting Merger::postMergeWVMCal" << endl;
	}
	
	Tag Merger::getTag(const Tag& t, void (Merger::*mergeTables)()) {
		if (mergeTables != 0) (this->*mergeTables)();
		
		
		
		map<string, Tag>::iterator iter = tagTag.find(t.toString());
		if (iter!=tagTag.end()) return iter->second;
		
		// Should throw an exception here.
		cout << "Could not find the mapped Tag for " << t.toString() << endl;
		return Tag();
	}
	
	int Merger::getId(const string& tableName, int id, void (Merger::*mergeTables)()) {
		if (mergeTables != 0) (this->*mergeTables)();
		
		map<string, int>::iterator iter = idId.find(tableName+"_"+Integer::toString(id));
		if (iter != idId.end()) return iter->second;
		
		// Should throw an exception here.
		cout << "Could not find the mapped Id for " << id << endl;
		return -1;
	}
	
} // End of namespace asdm
