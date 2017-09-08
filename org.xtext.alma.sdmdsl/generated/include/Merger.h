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
#ifndef Merger_CLASS
#define Merger_CLASS
#include <map>

#include "ASDM.h"
#include "AlmaRadiometerTable.h"
#include "AlmaRadiometerRow.h"
#include "AnnotationTable.h"
#include "AnnotationRow.h"
#include "AntennaTable.h"
#include "AntennaRow.h"
#include "CalAmpliTable.h"
#include "CalAmpliRow.h"
#include "CalAppPhaseTable.h"
#include "CalAppPhaseRow.h"
#include "CalAtmosphereTable.h"
#include "CalAtmosphereRow.h"
#include "CalBandpassTable.h"
#include "CalBandpassRow.h"
#include "CalCurveTable.h"
#include "CalCurveRow.h"
#include "CalDataTable.h"
#include "CalDataRow.h"
#include "CalDelayTable.h"
#include "CalDelayRow.h"
#include "CalDeviceTable.h"
#include "CalDeviceRow.h"
#include "CalFluxTable.h"
#include "CalFluxRow.h"
#include "CalFocusModelTable.h"
#include "CalFocusModelRow.h"
#include "CalFocusTable.h"
#include "CalFocusRow.h"
#include "CalGainTable.h"
#include "CalGainRow.h"
#include "CalHolographyTable.h"
#include "CalHolographyRow.h"
#include "CalPhaseTable.h"
#include "CalPhaseRow.h"
#include "CalPointingModelTable.h"
#include "CalPointingModelRow.h"
#include "CalPointingTable.h"
#include "CalPointingRow.h"
#include "CalPositionTable.h"
#include "CalPositionRow.h"
#include "CalPrimaryBeamTable.h"
#include "CalPrimaryBeamRow.h"
#include "CalReductionTable.h"
#include "CalReductionRow.h"
#include "CalSeeingTable.h"
#include "CalSeeingRow.h"
#include "CalWVRTable.h"
#include "CalWVRRow.h"
#include "ConfigDescriptionTable.h"
#include "ConfigDescriptionRow.h"
#include "CorrelatorModeTable.h"
#include "CorrelatorModeRow.h"
#include "DataDescriptionTable.h"
#include "DataDescriptionRow.h"
#include "DelayModelFixedParametersTable.h"
#include "DelayModelFixedParametersRow.h"
#include "DelayModelTable.h"
#include "DelayModelRow.h"
#include "DelayModelVariableParametersTable.h"
#include "DelayModelVariableParametersRow.h"
#include "DopplerTable.h"
#include "DopplerRow.h"
#include "EphemerisTable.h"
#include "EphemerisRow.h"
#include "ExecBlockTable.h"
#include "ExecBlockRow.h"
#include "FeedTable.h"
#include "FeedRow.h"
#include "FieldTable.h"
#include "FieldRow.h"
#include "FlagCmdTable.h"
#include "FlagCmdRow.h"
#include "FlagTable.h"
#include "FlagRow.h"
#include "FocusModelTable.h"
#include "FocusModelRow.h"
#include "FocusTable.h"
#include "FocusRow.h"
#include "FreqOffsetTable.h"
#include "FreqOffsetRow.h"
#include "GainTrackingTable.h"
#include "GainTrackingRow.h"
#include "HistoryTable.h"
#include "HistoryRow.h"
#include "HolographyTable.h"
#include "HolographyRow.h"
#include "MainTable.h"
#include "MainRow.h"
#include "ObservationTable.h"
#include "ObservationRow.h"
#include "PointingModelTable.h"
#include "PointingModelRow.h"
#include "PointingTable.h"
#include "PointingRow.h"
#include "PolarizationTable.h"
#include "PolarizationRow.h"
#include "ProcessorTable.h"
#include "ProcessorRow.h"
#include "ReceiverTable.h"
#include "ReceiverRow.h"
#include "SBSummaryTable.h"
#include "SBSummaryRow.h"
#include "ScaleTable.h"
#include "ScaleRow.h"
#include "ScanTable.h"
#include "ScanRow.h"
#include "SeeingTable.h"
#include "SeeingRow.h"
#include "SourceTable.h"
#include "SourceRow.h"
#include "SpectralWindowTable.h"
#include "SpectralWindowRow.h"
#include "SquareLawDetectorTable.h"
#include "SquareLawDetectorRow.h"
#include "StateTable.h"
#include "StateRow.h"
#include "StationTable.h"
#include "StationRow.h"
#include "SubscanTable.h"
#include "SubscanRow.h"
#include "SwitchCycleTable.h"
#include "SwitchCycleRow.h"
#include "SysCalTable.h"
#include "SysCalRow.h"
#include "SysPowerTable.h"
#include "SysPowerRow.h"
#include "TotalPowerTable.h"
#include "TotalPowerRow.h"
#include "WeatherTable.h"
#include "WeatherRow.h"
#include "WVMCalTable.h"
#include "WVMCalRow.h"

/*\file "Merger.h"
    \brief Generated from model's revision "-1", branch ""
*/
using namespace std;


namespace asdm {
	
	class Merger {
		public :
			Merger();
				virtual ~Merger();
				
				void merge(ASDM* ds1, ASDM* ds2);
		private:
			ASDM* ds1;
			ASDM* ds2;
			map<string, Tag> tagTag;
			Tag getTag(const Tag& t, void (Merger::*mergeTables)());
			
			map<string, int> idId;
			int getId(const string& tableName, int id, void (Merger::*mergeTables)());
			
			bool hasMergedAlmaRadiometer;	
			bool hasMergedAnnotation;	
			bool hasMergedAntenna;	
			bool hasMergedCalAmpli;	
			bool hasMergedCalAppPhase;	
			bool hasMergedCalAtmosphere;	
			bool hasMergedCalBandpass;	
			bool hasMergedCalCurve;	
			bool hasMergedCalData;	
			bool hasMergedCalDelay;	
			bool hasMergedCalDevice;	
			bool hasMergedCalFlux;	
			bool hasMergedCalFocusModel;	
			bool hasMergedCalFocus;	
			bool hasMergedCalGain;	
			bool hasMergedCalHolography;	
			bool hasMergedCalPhase;	
			bool hasMergedCalPointingModel;	
			bool hasMergedCalPointing;	
			bool hasMergedCalPosition;	
			bool hasMergedCalPrimaryBeam;	
			bool hasMergedCalReduction;	
			bool hasMergedCalSeeing;	
			bool hasMergedCalWVR;	
			bool hasMergedConfigDescription;	
			bool hasMergedCorrelatorMode;	
			bool hasMergedDataDescription;	
			bool hasMergedDelayModelFixedParameters;	
			bool hasMergedDelayModel;	
			bool hasMergedDelayModelVariableParameters;	
			bool hasMergedDoppler;	
			bool hasMergedEphemeris;	
			bool hasMergedExecBlock;	
			bool hasMergedFeed;	
			bool hasMergedField;	
			bool hasMergedFlagCmd;	
			bool hasMergedFlag;	
			bool hasMergedFocusModel;	
			bool hasMergedFocus;	
			bool hasMergedFreqOffset;	
			bool hasMergedGainTracking;	
			bool hasMergedHistory;	
			bool hasMergedHolography;	
			bool hasMergedMain;	
			bool hasMergedObservation;	
			bool hasMergedPointingModel;	
			bool hasMergedPointing;	
			bool hasMergedPolarization;	
			bool hasMergedProcessor;	
			bool hasMergedReceiver;	
			bool hasMergedSBSummary;	
			bool hasMergedScale;	
			bool hasMergedScan;	
			bool hasMergedSeeing;	
			bool hasMergedSource;	
			bool hasMergedSpectralWindow;	
			bool hasMergedSquareLawDetector;	
			bool hasMergedState;	
			bool hasMergedStation;	
			bool hasMergedSubscan;	
			bool hasMergedSwitchCycle;	
			bool hasMergedSysCal;	
			bool hasMergedSysPower;	
			bool hasMergedTotalPower;	
			bool hasMergedWeather;	
			bool hasMergedWVMCal;	
			
			void mergeAlmaRadiometer();
			void postMergeAlmaRadiometer();
			void mergeAnnotation();
			void postMergeAnnotation();
			void mergeAntenna();
			void postMergeAntenna();
			void mergeCalAmpli();
			void postMergeCalAmpli();
			void mergeCalAppPhase();
			void postMergeCalAppPhase();
			void mergeCalAtmosphere();
			void postMergeCalAtmosphere();
			void mergeCalBandpass();
			void postMergeCalBandpass();
			void mergeCalCurve();
			void postMergeCalCurve();
			void mergeCalData();
			void postMergeCalData();
			void mergeCalDelay();
			void postMergeCalDelay();
			void mergeCalDevice();
			void postMergeCalDevice();
			void mergeCalFlux();
			void postMergeCalFlux();
			void mergeCalFocusModel();
			void postMergeCalFocusModel();
			void mergeCalFocus();
			void postMergeCalFocus();
			void mergeCalGain();
			void postMergeCalGain();
			void mergeCalHolography();
			void postMergeCalHolography();
			void mergeCalPhase();
			void postMergeCalPhase();
			void mergeCalPointingModel();
			void postMergeCalPointingModel();
			void mergeCalPointing();
			void postMergeCalPointing();
			void mergeCalPosition();
			void postMergeCalPosition();
			void mergeCalPrimaryBeam();
			void postMergeCalPrimaryBeam();
			void mergeCalReduction();
			void postMergeCalReduction();
			void mergeCalSeeing();
			void postMergeCalSeeing();
			void mergeCalWVR();
			void postMergeCalWVR();
			void mergeConfigDescription();
			void postMergeConfigDescription();
			void mergeCorrelatorMode();
			void postMergeCorrelatorMode();
			void mergeDataDescription();
			void postMergeDataDescription();
			void mergeDelayModelFixedParameters();
			void postMergeDelayModelFixedParameters();
			void mergeDelayModel();
			void postMergeDelayModel();
			void mergeDelayModelVariableParameters();
			void postMergeDelayModelVariableParameters();
			void mergeDoppler();
			void postMergeDoppler();
			void mergeEphemeris();
			void postMergeEphemeris();
			void mergeExecBlock();
			void postMergeExecBlock();
			void mergeFeed();
			void postMergeFeed();
			void mergeField();
			void postMergeField();
			void mergeFlagCmd();
			void postMergeFlagCmd();
			void mergeFlag();
			void postMergeFlag();
			void mergeFocusModel();
			void postMergeFocusModel();
			void mergeFocus();
			void postMergeFocus();
			void mergeFreqOffset();
			void postMergeFreqOffset();
			void mergeGainTracking();
			void postMergeGainTracking();
			void mergeHistory();
			void postMergeHistory();
			void mergeHolography();
			void postMergeHolography();
			void mergeMain();
			void postMergeMain();
			void mergeObservation();
			void postMergeObservation();
			void mergePointingModel();
			void postMergePointingModel();
			void mergePointing();
			void postMergePointing();
			void mergePolarization();
			void postMergePolarization();
			void mergeProcessor();
			void postMergeProcessor();
			void mergeReceiver();
			void postMergeReceiver();
			void mergeSBSummary();
			void postMergeSBSummary();
			void mergeScale();
			void postMergeScale();
			void mergeScan();
			void postMergeScan();
			void mergeSeeing();
			void postMergeSeeing();
			void mergeSource();
			void postMergeSource();
			void mergeSpectralWindow();
			void postMergeSpectralWindow();
			void mergeSquareLawDetector();
			void postMergeSquareLawDetector();
			void mergeState();
			void postMergeState();
			void mergeStation();
			void postMergeStation();
			void mergeSubscan();
			void postMergeSubscan();
			void mergeSwitchCycle();
			void postMergeSwitchCycle();
			void mergeSysCal();
			void postMergeSysCal();
			void mergeSysPower();
			void postMergeSysPower();
			void mergeTotalPower();
			void postMergeTotalPower();
			void mergeWeather();
			void postMergeWeather();
			void mergeWVMCal();
			void postMergeWVMCal();
			
			void (Merger::*mergeAlmaRadiometerPtr) () ;
			void (Merger::*mergeAnnotationPtr) () ;
			void (Merger::*mergeAntennaPtr) () ;
			void (Merger::*mergeCalAmpliPtr) () ;
			void (Merger::*mergeCalAppPhasePtr) () ;
			void (Merger::*mergeCalAtmospherePtr) () ;
			void (Merger::*mergeCalBandpassPtr) () ;
			void (Merger::*mergeCalCurvePtr) () ;
			void (Merger::*mergeCalDataPtr) () ;
			void (Merger::*mergeCalDelayPtr) () ;
			void (Merger::*mergeCalDevicePtr) () ;
			void (Merger::*mergeCalFluxPtr) () ;
			void (Merger::*mergeCalFocusModelPtr) () ;
			void (Merger::*mergeCalFocusPtr) () ;
			void (Merger::*mergeCalGainPtr) () ;
			void (Merger::*mergeCalHolographyPtr) () ;
			void (Merger::*mergeCalPhasePtr) () ;
			void (Merger::*mergeCalPointingModelPtr) () ;
			void (Merger::*mergeCalPointingPtr) () ;
			void (Merger::*mergeCalPositionPtr) () ;
			void (Merger::*mergeCalPrimaryBeamPtr) () ;
			void (Merger::*mergeCalReductionPtr) () ;
			void (Merger::*mergeCalSeeingPtr) () ;
			void (Merger::*mergeCalWVRPtr) () ;
			void (Merger::*mergeConfigDescriptionPtr) () ;
			void (Merger::*mergeCorrelatorModePtr) () ;
			void (Merger::*mergeDataDescriptionPtr) () ;
			void (Merger::*mergeDelayModelFixedParametersPtr) () ;
			void (Merger::*mergeDelayModelPtr) () ;
			void (Merger::*mergeDelayModelVariableParametersPtr) () ;
			void (Merger::*mergeDopplerPtr) () ;
			void (Merger::*mergeEphemerisPtr) () ;
			void (Merger::*mergeExecBlockPtr) () ;
			void (Merger::*mergeFeedPtr) () ;
			void (Merger::*mergeFieldPtr) () ;
			void (Merger::*mergeFlagCmdPtr) () ;
			void (Merger::*mergeFlagPtr) () ;
			void (Merger::*mergeFocusModelPtr) () ;
			void (Merger::*mergeFocusPtr) () ;
			void (Merger::*mergeFreqOffsetPtr) () ;
			void (Merger::*mergeGainTrackingPtr) () ;
			void (Merger::*mergeHistoryPtr) () ;
			void (Merger::*mergeHolographyPtr) () ;
			void (Merger::*mergeMainPtr) () ;
			void (Merger::*mergeObservationPtr) () ;
			void (Merger::*mergePointingModelPtr) () ;
			void (Merger::*mergePointingPtr) () ;
			void (Merger::*mergePolarizationPtr) () ;
			void (Merger::*mergeProcessorPtr) () ;
			void (Merger::*mergeReceiverPtr) () ;
			void (Merger::*mergeSBSummaryPtr) () ;
			void (Merger::*mergeScalePtr) () ;
			void (Merger::*mergeScanPtr) () ;
			void (Merger::*mergeSeeingPtr) () ;
			void (Merger::*mergeSourcePtr) () ;
			void (Merger::*mergeSpectralWindowPtr) () ;
			void (Merger::*mergeSquareLawDetectorPtr) () ;
			void (Merger::*mergeStatePtr) () ;
			void (Merger::*mergeStationPtr) () ;
			void (Merger::*mergeSubscanPtr) () ;
			void (Merger::*mergeSwitchCyclePtr) () ;
			void (Merger::*mergeSysCalPtr) () ;
			void (Merger::*mergeSysPowerPtr) () ;
			void (Merger::*mergeTotalPowerPtr) () ;
			void (Merger::*mergeWeatherPtr) () ;
			void (Merger::*mergeWVMCalPtr) () ;
	};
	
} // End namespace asdm

#endif  /* Merger_CLASS */
