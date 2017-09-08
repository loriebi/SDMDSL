//!
//! ALMA - Atacama Large Millimeter Array
//! (c) European Southern Observatory, 2002
//! (c) Associated Universities Inc., 2002
//! Copyright by ESO (in the framework of the ALMA collaboration),
//! Copyright by AUI (in the framework of the ALMA collaboration),
//! All rights reserved.
//! 
//! This library is free software; you can redistribute it and/or
//! modify it under the terms of the GNU Lesser General Public
//! License as published by the Free software Foundation; either
//! version 2.1 of the License, or (at your option) any later version.
//! 
//! This library is distributed in the hope that it will be useful,
//! but WITHOUT ANY WARRANTY, without even the implied warranty of
//! MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//! Lesser General Public License for more details.
//! 
//! You should have received a copy of the GNU Lesser General Public
//! License along with this library; if not, write to the Free Software
//! Foundation, Inc., 59 Temple Place, Suite 330, Boston,
//! MA 02111-1307  USA
//!
//! File sdm_modules.f90
//!
//!----------------------------------------------------------------------------
//! General types:
//!
//module sdm_Types
////type ArrayTimeInterval
//////sequence
//////integer*8 time
//////integer*8 interval
////end type ArrayTimeInterval
//end module sdm_Types

//! 
//! ===========================================================================
//! 
//! AlmaRadiometer Table: 
//! 
//module sdm_AlmaRadiometer
////use sdm_Types
////type AlmaRadiometerRow
//////integer:: dummy ! make sure it compiles...
////end type AlmaRadiometerRow
////type AlmaRadiometerKey
//////integer :: almaRadiometerId
////end type AlmaRadiometerKey
////type AlmaRadiometerOpt
//////integer :: numAntenna
//////integer, allocatable :: spectralWindowId(:)
////end type AlmaRadiometerOpt
////type AlmaRadiometer
//////integer, allocatable :: almaRadiometerId(:)
////end type AlmaRadiometer
//end module sdm_AlmaRadiometer
//! 
//! ===========================================================================
//! 
//! Annotation Table: 
//! 
//module sdm_Annotation
////use sdm_Types
////type AnnotationRow
//////integer*8 :: time
//////character*256 :: issue
//////character*256 :: details
////end type AnnotationRow
////type AnnotationKey
//////integer :: annotationId
////end type AnnotationKey
////type AnnotationOpt
//////integer :: numAntenna
//////integer, allocatable :: basebandName(:)
//////integer :: numBaseband
//////integer*8 :: interval
//////real*8 :: dValue
//////real*8, allocatable :: vdValue(:)
//////real*8, allocatable :: vvdValues(:,:)
//////integer*8 :: llValue
//////integer*8, allocatable :: vllValue(:)
//////integer*8, allocatable :: vvllValue(:,:)
//////integer, allocatable :: antennaId(:)
////end type AnnotationOpt
////type Annotation
//////integer, allocatable :: annotationId(:)
//////integer*8, allocatable :: time(:)
//////character*256, allocatable :: issue(:)
//////character*256, allocatable :: details(:)
////end type Annotation
//end module sdm_Annotation
//! 
//! ===========================================================================
//! 
//! Antenna Table: 
//! 
//module sdm_Antenna
////use sdm_Types
////type AntennaRow
//////character*256 :: name
//////integer :: antennaMake
//////integer :: antennaType
//////real*8 :: dishDiameter
//////real*8, allocatable :: position(:)
//////real*8, allocatable :: offset(:)
//////integer*8 :: time
//////integer :: stationId
////end type AntennaRow
////type AntennaKey
//////integer :: antennaId
////end type AntennaKey
////type AntennaOpt
//////integer :: assocAntennaId
////end type AntennaOpt
////type Antenna
//////integer, allocatable :: antennaId(:)
//////character*256, allocatable :: name(:)
//////integer, allocatable :: antennaMake(:)
//////integer, allocatable :: antennaType(:)
//////real*8, allocatable :: dishDiameter(:)
//////real*8, allocatable :: position(:,:)
//////real*8, allocatable :: offset(:,:)
//////integer*8, allocatable :: time(:)
//////integer, allocatable :: stationId(:)
////end type Antenna
//end module sdm_Antenna
//! 
//! ===========================================================================
//! 
//! CalAmpli Table: 
//! 
//module sdm_CalAmpli
////use sdm_Types
////type CalAmpliRow
//////integer :: numReceptor
//////integer, allocatable :: polarizationTypes(:)
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8, allocatable :: frequencyRange(:)
//////real, allocatable :: apertureEfficiency(:)
//////real, allocatable :: apertureEfficiencyError(:)
////end type CalAmpliRow
////type CalAmpliKey
//////character*256 :: antennaName
//////integer :: atmPhaseCorrection
//////integer :: receiverBand
//////integer :: basebandName
//////integer :: calDataId
//////integer :: calReductionId
////end type CalAmpliKey
////type CalAmpliOpt
//////logical*1 :: correctionValidity
////end type CalAmpliOpt
////type CalAmpli
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: frequencyRange(:,:)
//////real, allocatable :: apertureEfficiency(:,:)
//////real, allocatable :: apertureEfficiencyError(:,:)
////end type CalAmpli
//end module sdm_CalAmpli
//! 
//! ===========================================================================
//! 
//! CalAppPhase Table: 
//! 
//module sdm_CalAppPhase
////use sdm_Types
////type CalAppPhaseRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer*8 :: adjustTime
//////character*256 :: adjustToken
//////character*256 :: phasingMode
//////integer :: numPhasedAntennas
//////character*256, allocatable :: phasedAntennas(:)
//////integer :: refAntennaIndex
//////integer :: candRefAntennaIndex
//////character*256 :: phasePacking
//////integer :: numReceptors
//////integer :: numChannels
//////integer :: numPhaseValues
//////real, allocatable :: phaseValues(:)
//////integer :: numCompare
//////integer :: numEfficiencies
//////character*256, allocatable :: compareArray(:)
//////integer, allocatable :: efficiencyIndices(:)
//////real, allocatable :: efficiencies(:,:)
//////real, allocatable :: quality(:)
//////character*256 :: phasedSumAntenna
////end type CalAppPhaseRow
////type CalAppPhaseKey
//////integer :: basebandName
//////integer :: scanNumber
//////integer :: calDataId
//////integer :: calReductionId
////end type CalAppPhaseKey
////type CalAppPhaseOpt
//////character*256 :: typeSupports
//////integer :: numSupports
//////real, allocatable :: phaseSupports(:)
////end type CalAppPhaseOpt
////type CalAppPhase
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: scanNumber(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer*8, allocatable :: adjustTime(:)
//////character*256, allocatable :: adjustToken(:)
//////character*256, allocatable :: phasingMode(:)
//////integer, allocatable :: numPhasedAntennas(:)
//////character*256, allocatable :: phasedAntennas(:,:)
//////integer, allocatable :: refAntennaIndex(:)
//////integer, allocatable :: candRefAntennaIndex(:)
//////character*256, allocatable :: phasePacking(:)
//////integer, allocatable :: numReceptors(:)
//////integer, allocatable :: numChannels(:)
//////integer, allocatable :: numPhaseValues(:)
//////real, allocatable :: phaseValues(:,:)
//////integer, allocatable :: numCompare(:)
//////integer, allocatable :: numEfficiencies(:)
//////character*256, allocatable :: compareArray(:,:)
//////integer, allocatable :: efficiencyIndices(:,:)
//////real, allocatable :: efficiencies(:,:,:)
//////real, allocatable :: quality(:,:)
//////character*256, allocatable :: phasedSumAntenna(:)
////end type CalAppPhase
//end module sdm_CalAppPhase
//! 
//! ===========================================================================
//! 
//! CalAtmosphere Table: 
//! 
//module sdm_CalAtmosphere
////use sdm_Types
////type CalAtmosphereRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: numFreq
//////integer :: numLoad
//////integer :: numReceptor
//////real, allocatable :: forwardEffSpectrum(:,:)
//////real*8, allocatable :: frequencyRange(:)
//////real*8 :: groundPressure
//////real*8 :: groundRelHumidity
//////real*8, allocatable :: frequencySpectrum(:)
//////real*8 :: groundTemperature
//////integer, allocatable :: polarizationTypes(:)
//////real, allocatable :: powerSkySpectrum(:,:)
//////real, allocatable :: powerLoadSpectrum(:,:,:)
//////integer :: syscalType
//////real*8, allocatable :: tAtmSpectrum(:,:)
//////real*8, allocatable :: tRecSpectrum(:,:)
//////real*8, allocatable :: tSysSpectrum(:,:)
//////real, allocatable :: tauSpectrum(:,:)
//////real*8, allocatable :: tAtm(:)
//////real*8, allocatable :: tRec(:)
//////real*8, allocatable :: tSys(:)
//////real, allocatable :: tau(:)
//////real*8, allocatable :: water(:)
//////real*8, allocatable :: waterError(:)
////end type CalAtmosphereRow
////type CalAtmosphereKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: basebandName
//////integer :: calDataId
//////integer :: calReductionId
////end type CalAtmosphereKey
////type CalAtmosphereOpt
//////real, allocatable :: alphaSpectrum(:,:)
//////real, allocatable :: forwardEfficiency(:)
//////real*8, allocatable :: forwardEfficiencyError(:)
//////real, allocatable :: sbGain(:)
//////real, allocatable :: sbGainError(:)
//////real, allocatable :: sbGainSpectrum(:,:)
////end type CalAtmosphereOpt
////type CalAtmosphere
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: numFreq(:)
//////integer, allocatable :: numLoad(:)
//////integer, allocatable :: numReceptor(:)
//////real, allocatable :: forwardEffSpectrum(:,:,:)
//////real*8, allocatable :: frequencyRange(:,:)
//////real*8, allocatable :: groundPressure(:)
//////real*8, allocatable :: groundRelHumidity(:)
//////real*8, allocatable :: frequencySpectrum(:,:)
//////real*8, allocatable :: groundTemperature(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real, allocatable :: powerSkySpectrum(:,:,:)
//////real, allocatable :: powerLoadSpectrum(:,:,:,:)
//////integer, allocatable :: syscalType(:)
//////real*8, allocatable :: tAtmSpectrum(:,:,:)
//////real*8, allocatable :: tRecSpectrum(:,:,:)
//////real*8, allocatable :: tSysSpectrum(:,:,:)
//////real, allocatable :: tauSpectrum(:,:,:)
//////real*8, allocatable :: tAtm(:,:)
//////real*8, allocatable :: tRec(:,:)
//////real*8, allocatable :: tSys(:,:)
//////real, allocatable :: tau(:,:)
//////real*8, allocatable :: water(:,:)
//////real*8, allocatable :: waterError(:,:)
////end type CalAtmosphere
//end module sdm_CalAtmosphere
//! 
//! ===========================================================================
//! 
//! CalBandpass Table: 
//! 
//module sdm_CalBandpass
////use sdm_Types
////type CalBandpassRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: numAntenna
//////integer :: numPoly
//////integer :: numReceptor
//////character*256, allocatable :: antennaNames(:)
//////character*256 :: refAntennaName
//////real*8, allocatable :: freqLimits(:)
//////integer, allocatable :: polarizationTypes(:)
//////real, allocatable :: curve(:,:,:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalBandpassRow
////type CalBandpassKey
//////integer :: basebandName
//////integer :: sideband
//////integer :: atmPhaseCorrection
//////integer :: typeCurve
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalBandpassKey
////type CalBandpassOpt
//////integer :: numBaseline
//////real, allocatable :: rms(:,:)
////end type CalBandpassOpt
////type CalBandpass
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: sideband(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: typeCurve(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: numPoly(:)
//////integer, allocatable :: numReceptor(:)
//////character*256, allocatable :: antennaNames(:,:)
//////character*256, allocatable :: refAntennaName(:)
//////real*8, allocatable :: freqLimits(:,:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real, allocatable :: curve(:,:,:,:)
//////real*8, allocatable :: reducedChiSquared(:,:)
////end type CalBandpass
//end module sdm_CalBandpass
//! 
//! ===========================================================================
//! 
//! CalCurve Table: 
//! 
//module sdm_CalCurve
////use sdm_Types
////type CalCurveRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8, allocatable :: frequencyRange(:)
//////integer :: numAntenna
//////integer :: numPoly
//////integer :: numReceptor
//////character*256, allocatable :: antennaNames(:)
//////character*256 :: refAntennaName
//////integer, allocatable :: polarizationTypes(:)
//////real, allocatable :: curve(:,:,:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalCurveRow
////type CalCurveKey
//////integer :: atmPhaseCorrection
//////integer :: typeCurve
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalCurveKey
////type CalCurveOpt
//////integer :: numBaseline
//////real, allocatable :: rms(:,:)
////end type CalCurveOpt
////type CalCurve
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: typeCurve(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: frequencyRange(:,:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: numPoly(:)
//////integer, allocatable :: numReceptor(:)
//////character*256, allocatable :: antennaNames(:,:)
//////character*256, allocatable :: refAntennaName(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real, allocatable :: curve(:,:,:,:)
//////real*8, allocatable :: reducedChiSquared(:,:)
////end type CalCurve
//end module sdm_CalCurve
//! 
//! ===========================================================================
//! 
//! CalData Table: 
//! 
//module sdm_CalData
////use sdm_Types
////type CalDataRow
//////integer*8 :: startTimeObserved
//////integer*8 :: endTimeObserved
//////character*256 :: execBlockUID
//////integer :: calDataType
//////integer :: calType
//////integer :: numScan
//////integer, allocatable :: scanSet(:)
////end type CalDataRow
////type CalDataKey
//////integer :: calDataId
////end type CalDataKey
////type CalDataOpt
//////integer :: assocCalDataId
//////integer :: assocCalNature
//////character*256, allocatable :: fieldName(:)
//////character*256, allocatable :: sourceName(:)
//////character*256, allocatable :: sourceCode(:)
//////integer, allocatable :: scanIntent(:)
////end type CalDataOpt
////type CalData
//////integer, allocatable :: calDataId(:)
//////integer*8, allocatable :: startTimeObserved(:)
//////integer*8, allocatable :: endTimeObserved(:)
//////character*256, allocatable :: execBlockUID(:)
//////integer, allocatable :: calDataType(:)
//////integer, allocatable :: calType(:)
//////integer, allocatable :: numScan(:)
//////integer, allocatable :: scanSet(:,:)
////end type CalData
//end module sdm_CalData
//! 
//! ===========================================================================
//! 
//! CalDelay Table: 
//! 
//module sdm_CalDelay
////use sdm_Types
////type CalDelayRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////character*256 :: refAntennaName
//////integer :: numReceptor
//////real*8, allocatable :: delayError(:)
//////real*8, allocatable :: delayOffset(:)
//////integer, allocatable :: polarizationTypes(:)
//////real*8, allocatable :: reducedChiSquared(:)
//////real*8, allocatable :: appliedDelay(:)
////end type CalDelayRow
////type CalDelayKey
//////character*256 :: antennaName
//////integer :: atmPhaseCorrection
//////integer :: basebandName
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalDelayKey
////type CalDelayOpt
//////real*8 :: crossDelayOffset
//////real*8 :: crossDelayOffsetError
//////integer :: numSideband
//////real*8, allocatable :: refFreq(:)
//////real*8, allocatable :: refFreqPhase(:)
//////integer, allocatable :: sidebands(:)
////end type CalDelayOpt
////type CalDelay
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////character*256, allocatable :: refAntennaName(:)
//////integer, allocatable :: numReceptor(:)
//////real*8, allocatable :: delayError(:,:)
//////real*8, allocatable :: delayOffset(:,:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real*8, allocatable :: reducedChiSquared(:,:)
//////real*8, allocatable :: appliedDelay(:,:)
////end type CalDelay
//end module sdm_CalDelay
//! 
//! ===========================================================================
//! 
//! CalDevice Table: 
//! 
//module sdm_CalDevice
////use sdm_Types
////type CalDeviceRow
//////integer :: numCalload
//////integer, allocatable :: calLoadNames(:)
////end type CalDeviceRow
////type CalDeviceKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: feedId
////end type CalDeviceKey
////type CalDeviceOpt
//////integer :: numReceptor
//////real, allocatable :: calEff(:,:)
//////real*8, allocatable :: noiseCal(:)
//////real, allocatable :: coupledNoiseCal(:,:)
//////real*8, allocatable :: temperatureLoad(:)
////end type CalDeviceOpt
////type CalDevice
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: feedId(:)
//////integer, allocatable :: numCalload(:)
//////integer, allocatable :: calLoadNames(:,:)
////end type CalDevice
//end module sdm_CalDevice
//! 
//! ===========================================================================
//! 
//! CalFlux Table: 
//! 
//module sdm_CalFlux
////use sdm_Types
////type CalFluxRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: numFrequencyRanges
//////integer :: numStokes
//////real*8, allocatable :: frequencyRanges(:,:)
//////integer :: fluxMethod
//////real*8, allocatable :: flux(:,:)
//////real*8, allocatable :: fluxError(:,:)
//////integer, allocatable :: stokes(:)
////end type CalFluxRow
////type CalFluxKey
//////character*256 :: sourceName
//////integer :: calDataId
//////integer :: calReductionId
////end type CalFluxKey
////type CalFluxOpt
//////real*8, allocatable :: direction(:)
//////integer :: directionCode
//////real*8 :: directionEquinox
//////real*8, allocatable :: PA(:,:)
//////real*8, allocatable :: PAError(:,:)
//////real*8, allocatable :: size(:,:,:)
//////real*8, allocatable :: sizeError(:,:,:)
//////integer :: sourceModel
////end type CalFluxOpt
////type CalFlux
//////character*256, allocatable :: sourceName(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: numFrequencyRanges(:)
//////integer, allocatable :: numStokes(:)
//////real*8, allocatable :: frequencyRanges(:,:,:)
//////integer, allocatable :: fluxMethod(:)
//////real*8, allocatable :: flux(:,:,:)
//////real*8, allocatable :: fluxError(:,:,:)
//////integer, allocatable :: stokes(:,:)
////end type CalFlux
//end module sdm_CalFlux
//! 
//! ===========================================================================
//! 
//! CalFocusModel Table: 
//! 
//module sdm_CalFocusModel
////use sdm_Types
////type CalFocusModelRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: antennaMake
//////integer :: numCoeff
//////integer :: numSourceObs
//////character*256, allocatable :: coeffName(:)
//////character*256, allocatable :: coeffFormula(:)
//////real, allocatable :: coeffValue(:)
//////real, allocatable :: coeffError(:)
//////logical*1, allocatable :: coeffFixed(:)
//////character*256 :: focusModel
//////real*8, allocatable :: focusRMS(:)
//////real*8 :: reducedChiSquared
////end type CalFocusModelRow
////type CalFocusModelKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: polarizationType
//////integer :: calDataId
//////integer :: calReductionId
////end type CalFocusModelKey
////type CalFocusModel
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: polarizationType(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: antennaMake(:)
//////integer, allocatable :: numCoeff(:)
//////integer, allocatable :: numSourceObs(:)
//////character*256, allocatable :: coeffName(:,:)
//////character*256, allocatable :: coeffFormula(:,:)
//////real, allocatable :: coeffValue(:,:)
//////real, allocatable :: coeffError(:,:)
//////logical*1, allocatable :: coeffFixed(:,:)
//////character*256, allocatable :: focusModel(:)
//////real*8, allocatable :: focusRMS(:,:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalFocusModel
//end module sdm_CalFocusModel
//! 
//! ===========================================================================
//! 
//! CalFocus Table: 
//! 
//module sdm_CalFocus
////use sdm_Types
////type CalFocusRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8 :: ambientTemperature
//////integer :: atmPhaseCorrection
//////integer :: focusMethod
//////real*8, allocatable :: frequencyRange(:)
//////real*8, allocatable :: pointingDirection(:)
//////integer :: numReceptor
//////integer, allocatable :: polarizationTypes(:)
//////logical*1, allocatable :: wereFixed(:)
//////real*8, allocatable :: offset(:,:)
//////real*8, allocatable :: offsetError(:,:)
//////logical*1, allocatable :: offsetWasTied(:,:)
//////real*8, allocatable :: reducedChiSquared(:,:)
//////real*8, allocatable :: position(:,:)
////end type CalFocusRow
////type CalFocusKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalFocusKey
////type CalFocusOpt
//////logical*1 :: polarizationsAveraged
//////real*8, allocatable :: focusCurveWidth(:,:)
//////real*8, allocatable :: focusCurveWidthError(:,:)
//////logical*1, allocatable :: focusCurveWasFixed(:)
//////real*8, allocatable :: offIntensity(:)
//////real*8, allocatable :: offIntensityError(:)
//////logical*1 :: offIntensityWasFixed
//////real*8, allocatable :: peakIntensity(:)
//////real*8, allocatable :: peakIntensityError(:)
//////logical*1 :: peakIntensityWasFixed
//////real*8, allocatable :: astigmPlus(:)
//////real*8, allocatable :: astigmPlusError(:)
//////real*8, allocatable :: astigmMult(:)
//////real*8, allocatable :: astigmMultError(:)
//////real*8, allocatable :: illumOffset(:,:)
//////real*8, allocatable :: illumOffsetError(:,:)
//////real*8, allocatable :: fitRMS(:)
////end type CalFocusOpt
////type CalFocus
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: ambientTemperature(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: focusMethod(:)
//////real*8, allocatable :: frequencyRange(:,:)
//////real*8, allocatable :: pointingDirection(:,:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////logical*1, allocatable :: wereFixed(:,:)
//////real*8, allocatable :: offset(:,:,:)
//////real*8, allocatable :: offsetError(:,:,:)
//////logical*1, allocatable :: offsetWasTied(:,:,:)
//////real*8, allocatable :: reducedChiSquared(:,:,:)
//////real*8, allocatable :: position(:,:,:)
////end type CalFocus
//end module sdm_CalFocus
//! 
//! ===========================================================================
//! 
//! CalGain Table: 
//! 
//module sdm_CalGain
////use sdm_Types
////type CalGainRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real :: gain
//////logical*1 :: gainValid
//////real :: fit
//////real :: fitWeight
//////logical*1 :: totalGainValid
//////real :: totalFit
//////real :: totalFitWeight
////end type CalGainRow
////type CalGainKey
//////integer :: calDataId
//////integer :: calReductionId
////end type CalGainKey
////type CalGain
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real, allocatable :: gain(:)
//////logical*1, allocatable :: gainValid(:)
//////real, allocatable :: fit(:)
//////real, allocatable :: fitWeight(:)
//////logical*1, allocatable :: totalGainValid(:)
//////real, allocatable :: totalFit(:)
//////real, allocatable :: totalFitWeight(:)
////end type CalGain
//end module sdm_CalGain
//! 
//! ===========================================================================
//! 
//! CalHolography Table: 
//! 
//module sdm_CalHolography
////use sdm_Types
////type CalHolographyRow
//////integer :: antennaMake
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8 :: ambientTemperature
//////real*8, allocatable :: focusPosition(:)
//////real*8, allocatable :: frequencyRange(:)
//////real*8 :: illuminationTaper
//////integer :: numReceptor
//////integer, allocatable :: polarizationTypes(:)
//////integer :: numPanelModes
//////integer :: receiverBand
//////character*256 :: beamMapUID
//////real*8 :: rawRMS
//////real*8 :: weightedRMS
//////character*256 :: surfaceMapUID
//////real*8, allocatable :: direction(:)
////end type CalHolographyRow
////type CalHolographyKey
//////character*256 :: antennaName
//////integer :: calDataId
//////integer :: calReductionId
////end type CalHolographyKey
////type CalHolographyOpt
//////integer :: numScrew
//////character*256, allocatable :: screwName(:)
//////real*8, allocatable :: screwMotion(:)
//////real*8, allocatable :: screwMotionError(:)
//////logical*1 :: gravCorrection
//////real*8, allocatable :: gravOptRange(:)
//////logical*1 :: tempCorrection
//////real*8, allocatable :: tempOptRange(:)
////end type CalHolographyOpt
////type CalHolography
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer, allocatable :: antennaMake(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: ambientTemperature(:)
//////real*8, allocatable :: focusPosition(:,:)
//////real*8, allocatable :: frequencyRange(:,:)
//////real*8, allocatable :: illuminationTaper(:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////integer, allocatable :: numPanelModes(:)
//////integer, allocatable :: receiverBand(:)
//////character*256, allocatable :: beamMapUID(:)
//////real*8, allocatable :: rawRMS(:)
//////real*8, allocatable :: weightedRMS(:)
//////character*256, allocatable :: surfaceMapUID(:)
//////real*8, allocatable :: direction(:,:)
////end type CalHolography
//end module sdm_CalHolography
//! 
//! ===========================================================================
//! 
//! CalPhase Table: 
//! 
//module sdm_CalPhase
////use sdm_Types
////type CalPhaseRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: numBaseline
//////integer :: numReceptor
//////real, allocatable :: ampli(:,:)
//////character*256, allocatable :: antennaNames(:,:)
//////real*8, allocatable :: baselineLengths(:)
//////real, allocatable :: decorrelationFactor(:,:)
//////real*8, allocatable :: direction(:)
//////real*8, allocatable :: frequencyRange(:)
//////integer*8 :: integrationTime
//////real, allocatable :: phase(:,:)
//////integer, allocatable :: polarizationTypes(:)
//////real, allocatable :: phaseRMS(:,:)
//////real, allocatable :: statPhaseRMS(:,:)
////end type CalPhaseRow
////type CalPhaseKey
//////integer :: basebandName
//////integer :: receiverBand
//////integer :: atmPhaseCorrection
//////integer :: calDataId
//////integer :: calReductionId
////end type CalPhaseKey
////type CalPhaseOpt
//////logical*1, allocatable :: correctionValidity(:)
////end type CalPhaseOpt
////type CalPhase
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: numBaseline(:)
//////integer, allocatable :: numReceptor(:)
//////real, allocatable :: ampli(:,:,:)
//////character*256, allocatable :: antennaNames(:,:,:)
//////real*8, allocatable :: baselineLengths(:,:)
//////real, allocatable :: decorrelationFactor(:,:,:)
//////real*8, allocatable :: direction(:,:)
//////real*8, allocatable :: frequencyRange(:,:)
//////integer*8, allocatable :: integrationTime(:)
//////real, allocatable :: phase(:,:,:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real, allocatable :: phaseRMS(:,:,:)
//////real, allocatable :: statPhaseRMS(:,:,:)
////end type CalPhase
//end module sdm_CalPhase
//! 
//! ===========================================================================
//! 
//! CalPointingModel Table: 
//! 
//module sdm_CalPointingModel
////use sdm_Types
////type CalPointingModelRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: antennaMake
//////integer :: pointingModelMode
//////integer :: polarizationType
//////integer :: numCoeff
//////character*256, allocatable :: coeffName(:)
//////real, allocatable :: coeffVal(:)
//////real, allocatable :: coeffError(:)
//////logical*1, allocatable :: coeffFixed(:)
//////real*8 :: azimuthRMS
//////real*8 :: elevationRms
//////real*8 :: skyRMS
//////real*8 :: reducedChiSquared
////end type CalPointingModelRow
////type CalPointingModelKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalPointingModelKey
////type CalPointingModelOpt
//////integer :: numObs
//////character*256, allocatable :: coeffFormula(:)
////end type CalPointingModelOpt
////type CalPointingModel
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: antennaMake(:)
//////integer, allocatable :: pointingModelMode(:)
//////integer, allocatable :: polarizationType(:)
//////integer, allocatable :: numCoeff(:)
//////character*256, allocatable :: coeffName(:,:)
//////real, allocatable :: coeffVal(:,:)
//////real, allocatable :: coeffError(:,:)
//////logical*1, allocatable :: coeffFixed(:,:)
//////real*8, allocatable :: azimuthRMS(:)
//////real*8, allocatable :: elevationRms(:)
//////real*8, allocatable :: skyRMS(:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalPointingModel
//end module sdm_CalPointingModel
//! 
//! ===========================================================================
//! 
//! CalPointing Table: 
//! 
//module sdm_CalPointing
////use sdm_Types
////type CalPointingRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8 :: ambientTemperature
//////integer :: antennaMake
//////integer :: atmPhaseCorrection
//////real*8, allocatable :: direction(:)
//////real*8, allocatable :: frequencyRange(:)
//////integer :: pointingModelMode
//////integer :: pointingMethod
//////integer :: numReceptor
//////integer, allocatable :: polarizationTypes(:)
//////real*8, allocatable :: collOffsetRelative(:,:)
//////real*8, allocatable :: collOffsetAbsolute(:,:)
//////real*8, allocatable :: collError(:,:)
//////logical*1, allocatable :: collOffsetTied(:,:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalPointingRow
////type CalPointingKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalPointingKey
////type CalPointingOpt
//////logical*1 :: averagedPolarizations
//////real*8, allocatable :: beamPA(:)
//////real*8, allocatable :: beamPAError(:)
//////logical*1 :: beamPAWasFixed
//////real*8, allocatable :: beamWidth(:,:)
//////real*8, allocatable :: beamWidthError(:,:)
//////logical*1, allocatable :: beamWidthWasFixed(:)
//////real*8, allocatable :: offIntensity(:)
//////real*8, allocatable :: offIntensityError(:)
//////logical*1 :: offIntensityWasFixed
//////real*8, allocatable :: peakIntensity(:)
//////real*8, allocatable :: peakIntensityError(:)
//////logical*1 :: peakIntensityWasFixed
////end type CalPointingOpt
////type CalPointing
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: ambientTemperature(:)
//////integer, allocatable :: antennaMake(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////real*8, allocatable :: direction(:,:)
//////real*8, allocatable :: frequencyRange(:,:)
//////integer, allocatable :: pointingModelMode(:)
//////integer, allocatable :: pointingMethod(:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real*8, allocatable :: collOffsetRelative(:,:,:)
//////real*8, allocatable :: collOffsetAbsolute(:,:,:)
//////real*8, allocatable :: collError(:,:,:)
//////logical*1, allocatable :: collOffsetTied(:,:,:)
//////real*8, allocatable :: reducedChiSquared(:,:)
////end type CalPointing
//end module sdm_CalPointing
//! 
//! ===========================================================================
//! 
//! CalPosition Table: 
//! 
//module sdm_CalPosition
////use sdm_Types
////type CalPositionRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8, allocatable :: antennaPosition(:)
//////character*256 :: stationName
//////real*8, allocatable :: stationPosition(:)
//////integer :: positionMethod
//////integer :: receiverBand
//////integer :: numAntenna
//////character*256, allocatable :: refAntennaNames(:)
//////real*8 :: axesOffset
//////real*8 :: axesOffsetErr
//////logical*1 :: axesOffsetFixed
//////real*8, allocatable :: positionOffset(:)
//////real*8, allocatable :: positionErr(:)
//////real*8 :: reducedChiSquared
////end type CalPositionRow
////type CalPositionKey
//////character*256 :: antennaName
//////integer :: atmPhaseCorrection
//////integer :: calDataId
//////integer :: calReductionId
////end type CalPositionKey
////type CalPositionOpt
//////real*8 :: delayRms
//////real*8 :: phaseRms
////end type CalPositionOpt
////type CalPosition
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: antennaPosition(:,:)
//////character*256, allocatable :: stationName(:)
//////real*8, allocatable :: stationPosition(:,:)
//////integer, allocatable :: positionMethod(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: numAntenna(:)
//////character*256, allocatable :: refAntennaNames(:,:)
//////real*8, allocatable :: axesOffset(:)
//////real*8, allocatable :: axesOffsetErr(:)
//////logical*1, allocatable :: axesOffsetFixed(:)
//////real*8, allocatable :: positionOffset(:,:)
//////real*8, allocatable :: positionErr(:,:)
//////real*8, allocatable :: reducedChiSquared(:)
////end type CalPosition
//end module sdm_CalPosition
//! 
//! ===========================================================================
//! 
//! CalPrimaryBeam Table: 
//! 
//module sdm_CalPrimaryBeam
////use sdm_Types
////type CalPrimaryBeamRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: antennaMake
//////integer :: numSubband
//////real*8, allocatable :: frequencyRange(:,:)
//////integer :: numReceptor
//////integer, allocatable :: polarizationTypes(:)
//////real*8, allocatable :: mainBeamEfficiency(:)
//////character*256 :: beamDescriptionUID
//////real :: relativeAmplitudeRms
//////real*8, allocatable :: direction(:)
//////real*8, allocatable :: minValidDirection(:)
//////real*8, allocatable :: maxValidDirection(:)
//////integer :: descriptionType
//////integer, allocatable :: imageChannelNumber(:)
//////real*8, allocatable :: imageNominalFrequency(:)
////end type CalPrimaryBeamRow
////type CalPrimaryBeamKey
//////character*256 :: antennaName
//////integer :: receiverBand
//////integer :: calDataId
//////integer :: calReductionId
////end type CalPrimaryBeamKey
////type CalPrimaryBeam
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: antennaMake(:)
//////integer, allocatable :: numSubband(:)
//////real*8, allocatable :: frequencyRange(:,:,:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: polarizationTypes(:,:)
//////real*8, allocatable :: mainBeamEfficiency(:,:)
//////character*256, allocatable :: beamDescriptionUID(:)
//////real, allocatable :: relativeAmplitudeRms(:)
//////real*8, allocatable :: direction(:,:)
//////real*8, allocatable :: minValidDirection(:,:)
//////real*8, allocatable :: maxValidDirection(:,:)
//////integer, allocatable :: descriptionType(:)
//////integer, allocatable :: imageChannelNumber(:,:)
//////real*8, allocatable :: imageNominalFrequency(:,:)
////end type CalPrimaryBeam
//end module sdm_CalPrimaryBeam
//! 
//! ===========================================================================
//! 
//! CalReduction Table: 
//! 
//module sdm_CalReduction
////use sdm_Types
////type CalReductionRow
//////integer :: numApplied
//////character*256, allocatable :: appliedCalibrations(:)
//////integer :: numParam
//////character*256, allocatable :: paramSet(:)
//////integer :: numInvalidConditions
//////integer, allocatable :: invalidConditions(:)
//////integer*8 :: timeReduced
//////character*256 :: messages
//////character*256 :: software
//////character*256 :: softwareVersion
////end type CalReductionRow
////type CalReductionKey
//////integer :: calReductionId
////end type CalReductionKey
////type CalReduction
//////integer, allocatable :: calReductionId(:)
//////integer, allocatable :: numApplied(:)
//////character*256, allocatable :: appliedCalibrations(:,:)
//////integer, allocatable :: numParam(:)
//////character*256, allocatable :: paramSet(:,:)
//////integer, allocatable :: numInvalidConditions(:)
//////integer, allocatable :: invalidConditions(:,:)
//////integer*8, allocatable :: timeReduced(:)
//////character*256, allocatable :: messages(:)
//////character*256, allocatable :: software(:)
//////character*256, allocatable :: softwareVersion(:)
////end type CalReduction
//end module sdm_CalReduction
//! 
//! ===========================================================================
//! 
//! CalSeeing Table: 
//! 
//module sdm_CalSeeing
////use sdm_Types
////type CalSeeingRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////real*8, allocatable :: frequencyRange(:)
//////integer*8 :: integrationTime
//////integer :: numBaseLengths
//////real*8, allocatable :: baselineLengths(:)
//////real*8, allocatable :: phaseRMS(:)
//////real*8 :: seeing
//////real*8 :: seeingError
////end type CalSeeingRow
////type CalSeeingKey
//////integer :: atmPhaseCorrection
//////integer :: calDataId
//////integer :: calReductionId
////end type CalSeeingKey
////type CalSeeingOpt
//////real :: exponent
//////real*8 :: outerScale
//////real*8 :: outerScaleRMS
////end type CalSeeingOpt
////type CalSeeing
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////real*8, allocatable :: frequencyRange(:,:)
//////integer*8, allocatable :: integrationTime(:)
//////integer, allocatable :: numBaseLengths(:)
//////real*8, allocatable :: baselineLengths(:,:)
//////real*8, allocatable :: phaseRMS(:,:)
//////real*8, allocatable :: seeing(:)
//////real*8, allocatable :: seeingError(:)
////end type CalSeeing
//end module sdm_CalSeeing
//! 
//! ===========================================================================
//! 
//! CalWVR Table: 
//! 
//module sdm_CalWVR
////use sdm_Types
////type CalWVRRow
//////integer*8 :: startValidTime
//////integer*8 :: endValidTime
//////integer :: wvrMethod
//////integer :: numInputAntennas
//////character*256, allocatable :: inputAntennaNames(:)
//////integer :: numChan
//////real*8, allocatable :: chanFreq(:)
//////real*8, allocatable :: chanWidth(:)
//////real*8, allocatable :: refTemp(:,:)
//////integer :: numPoly
//////real, allocatable :: pathCoeff(:,:,:)
//////real*8, allocatable :: polyFreqLimits(:)
//////real, allocatable :: wetPath(:)
//////real, allocatable :: dryPath(:)
//////real*8 :: water
////end type CalWVRRow
////type CalWVRKey
//////character*256 :: antennaName
//////integer :: calDataId
//////integer :: calReductionId
////end type CalWVRKey
////type CalWVR
//////character*256, allocatable :: antennaName(:)
//////integer, allocatable :: calDataId(:)
//////integer, allocatable :: calReductionId(:)
//////integer*8, allocatable :: startValidTime(:)
//////integer*8, allocatable :: endValidTime(:)
//////integer, allocatable :: wvrMethod(:)
//////integer, allocatable :: numInputAntennas(:)
//////character*256, allocatable :: inputAntennaNames(:,:)
//////integer, allocatable :: numChan(:)
//////real*8, allocatable :: chanFreq(:,:)
//////real*8, allocatable :: chanWidth(:,:)
//////real*8, allocatable :: refTemp(:,:,:)
//////integer, allocatable :: numPoly(:)
//////real, allocatable :: pathCoeff(:,:,:,:)
//////real*8, allocatable :: polyFreqLimits(:,:)
//////real, allocatable :: wetPath(:,:)
//////real, allocatable :: dryPath(:,:)
//////real*8, allocatable :: water(:)
////end type CalWVR
//end module sdm_CalWVR
//! 
//! ===========================================================================
//! 
//! ConfigDescription Table: 
//! 
//module sdm_ConfigDescription
////use sdm_Types
////type ConfigDescriptionRow
//////integer :: numAntenna
//////integer :: numDataDescription
//////integer :: numFeed
//////integer :: correlationMode
//////integer :: numAtmPhaseCorrection
//////integer, allocatable :: atmPhaseCorrection(:)
//////integer :: processorType
//////integer :: spectralType
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: feedId(:)
//////integer, allocatable :: switchCycleId(:)
//////integer, allocatable :: dataDescriptionId(:)
//////integer :: processorId
////end type ConfigDescriptionRow
////type ConfigDescriptionKey
//////integer :: configDescriptionId
////end type ConfigDescriptionKey
////type ConfigDescriptionOpt
//////integer, allocatable :: phasedArrayList(:)
//////integer :: numAssocValues
//////integer, allocatable :: assocNature(:)
//////integer, allocatable :: assocConfigDescriptionId(:)
////end type ConfigDescriptionOpt
////type ConfigDescription
//////integer, allocatable :: configDescriptionId(:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: numDataDescription(:)
//////integer, allocatable :: numFeed(:)
//////integer, allocatable :: correlationMode(:)
//////integer, allocatable :: numAtmPhaseCorrection(:)
//////integer, allocatable :: atmPhaseCorrection(:,:)
//////integer, allocatable :: processorType(:)
//////integer, allocatable :: spectralType(:)
//////integer, allocatable :: antennaId(:,:)
//////integer, allocatable :: feedId(:,:)
//////integer, allocatable :: switchCycleId(:,:)
//////integer, allocatable :: dataDescriptionId(:,:)
//////integer, allocatable :: processorId(:)
////end type ConfigDescription
//end module sdm_ConfigDescription
//! 
//! ===========================================================================
//! 
//! CorrelatorMode Table: 
//! 
//module sdm_CorrelatorMode
////use sdm_Types
////type CorrelatorModeRow
//////integer :: numBaseband
//////integer, allocatable :: basebandNames(:)
//////integer, allocatable :: basebandConfig(:)
//////integer :: accumMode
//////integer :: binMode
//////integer :: numAxes
//////integer, allocatable :: axesOrderArray(:)
//////integer, allocatable :: filterMode(:)
//////integer :: correlatorName
////end type CorrelatorModeRow
////type CorrelatorModeKey
//////integer :: correlatorModeId
////end type CorrelatorModeKey
////type CorrelatorMode
//////integer, allocatable :: correlatorModeId(:)
//////integer, allocatable :: numBaseband(:)
//////integer, allocatable :: basebandNames(:,:)
//////integer, allocatable :: basebandConfig(:,:)
//////integer, allocatable :: accumMode(:)
//////integer, allocatable :: binMode(:)
//////integer, allocatable :: numAxes(:)
//////integer, allocatable :: axesOrderArray(:,:)
//////integer, allocatable :: filterMode(:,:)
//////integer, allocatable :: correlatorName(:)
////end type CorrelatorMode
//end module sdm_CorrelatorMode
//! 
//! ===========================================================================
//! 
//! DataDescription Table: 
//! 
//module sdm_DataDescription
////use sdm_Types
////type DataDescriptionRow
//////integer :: polOrHoloId
//////integer :: spectralWindowId
////end type DataDescriptionRow
////type DataDescriptionKey
//////integer :: dataDescriptionId
////end type DataDescriptionKey
////type DataDescription
//////integer, allocatable :: dataDescriptionId(:)
//////integer, allocatable :: polOrHoloId(:)
//////integer, allocatable :: spectralWindowId(:)
////end type DataDescription
//end module sdm_DataDescription
//! 
//! ===========================================================================
//! 
//! DelayModelFixedParameters Table: 
//! 
//module sdm_DelayModelFixedParameters
////use sdm_Types
////type DelayModelFixedParametersRow
//////character*256 :: delayModelVersion
//////integer :: execBlockId
////end type DelayModelFixedParametersRow
////type DelayModelFixedParametersKey
//////integer :: delayModelFixedParametersId
////end type DelayModelFixedParametersKey
////type DelayModelFixedParametersOpt
//////real*8 :: gaussConstant
//////real*8 :: newtonianConstant
//////real*8 :: gravity
//////real*8 :: earthFlattening
//////real*8 :: earthRadius
//////real*8 :: moonEarthMassRatio
//////character*256 :: ephemerisEpoch
//////real*8 :: earthTideLag
//////real*8 :: earthGM
//////real*8 :: moonGM
//////real*8 :: sunGM
//////real*8 :: loveNumberH
//////real*8 :: loveNumberL
//////real*8 :: precessionConstant
//////real*8 :: lightTime1AU
//////real*8 :: speedOfLight
//////character*256 :: delayModelFlags
////end type DelayModelFixedParametersOpt
////type DelayModelFixedParameters
//////integer, allocatable :: delayModelFixedParametersId(:)
//////character*256, allocatable :: delayModelVersion(:)
//////integer, allocatable :: execBlockId(:)
////end type DelayModelFixedParameters
//end module sdm_DelayModelFixedParameters
//! 
//! ===========================================================================
//! 
//! DelayModel Table: 
//! 
//module sdm_DelayModel
////use sdm_Types
////type DelayModelRow
//////integer :: numPoly
//////real*8, allocatable :: phaseDelay(:)
//////real*8, allocatable :: phaseDelayRate(:)
//////real*8, allocatable :: groupDelay(:)
//////real*8, allocatable :: groupDelayRate(:)
//////integer :: fieldId
////end type DelayModelRow
////type DelayModelKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
////end type DelayModelKey
////type DelayModelOpt
//////integer*8 :: timeOrigin
//////real*8 :: atmosphericGroupDelay
//////real*8 :: atmosphericGroupDelayRate
//////real*8 :: geometricDelay
//////real*8 :: geometricDelayRate
//////integer :: numLO
//////real*8, allocatable :: LOOffset(:)
//////real*8, allocatable :: LOOffsetRate(:)
//////real*8 :: dispersiveDelay
//////real*8 :: dispersiveDelayRate
//////real*8 :: atmosphericDryDelay
//////real*8 :: atmosphericWetDelay
//////real*8 :: padDelay
//////real*8 :: antennaDelay
//////integer :: numReceptor
//////integer, allocatable :: polarizationType(:)
//////real*8, allocatable :: electronicDelay(:)
//////real*8, allocatable :: electronicDelayRate(:)
//////real*8, allocatable :: receiverDelay(:)
//////real*8, allocatable :: IFDelay(:)
//////real*8, allocatable :: LODelay(:)
//////real*8 :: crossPolarizationDelay
////end type DelayModelOpt
////type DelayModel
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: numPoly(:)
//////real*8, allocatable :: phaseDelay(:,:)
//////real*8, allocatable :: phaseDelayRate(:,:)
//////real*8, allocatable :: groupDelay(:,:)
//////real*8, allocatable :: groupDelayRate(:,:)
//////integer, allocatable :: fieldId(:)
////end type DelayModel
//end module sdm_DelayModel
//! 
//! ===========================================================================
//! 
//! DelayModelVariableParameters Table: 
//! 
//module sdm_DelayModelVariableParameters
////use sdm_Types
////type DelayModelVariableParametersRow
//////integer*8 :: time
//////real*8 :: ut1_utc
//////real*8 :: iat_utc
//////integer :: timeType
//////real*8 :: gstAtUt0
//////real*8 :: earthRotationRate
//////real*8, allocatable :: polarOffsets(:)
//////integer :: polarOffsetsType
//////integer :: delayModelFixedParametersId
////end type DelayModelVariableParametersRow
////type DelayModelVariableParametersKey
//////integer :: delayModelVariableParametersId
////end type DelayModelVariableParametersKey
////type DelayModelVariableParametersOpt
//////real*8 :: nutationInLongitude
//////real*8 :: nutationInLongitudeRate
//////real*8 :: nutationInObliquity
//////real*8 :: nutationInObliquityRate
////end type DelayModelVariableParametersOpt
////type DelayModelVariableParameters
//////integer, allocatable :: delayModelVariableParametersId(:)
//////integer*8, allocatable :: time(:)
//////real*8, allocatable :: ut1_utc(:)
//////real*8, allocatable :: iat_utc(:)
//////integer, allocatable :: timeType(:)
//////real*8, allocatable :: gstAtUt0(:)
//////real*8, allocatable :: earthRotationRate(:)
//////real*8, allocatable :: polarOffsets(:,:)
//////integer, allocatable :: polarOffsetsType(:)
//////integer, allocatable :: delayModelFixedParametersId(:)
////end type DelayModelVariableParameters
//end module sdm_DelayModelVariableParameters
//! 
//! ===========================================================================
//! 
//! Doppler Table: 
//! 
//module sdm_Doppler
////use sdm_Types
////type DopplerRow
//////integer :: transitionIndex
//////integer :: velDef
////end type DopplerRow
////type DopplerKey
//////integer :: dopplerId
//////integer :: sourceId
////end type DopplerKey
////type Doppler
//////integer, allocatable :: dopplerId(:)
//////integer, allocatable :: sourceId(:)
//////integer, allocatable :: transitionIndex(:)
//////integer, allocatable :: velDef(:)
////end type Doppler
//end module sdm_Doppler
//! 
//! ===========================================================================
//! 
//! ExecBlock Table: 
//! 
//module sdm_ExecBlock
////use sdm_Types
////type ExecBlockRow
//////integer*8 :: startTime
//////integer*8 :: endTime
//////integer :: execBlockNum
//////character*256 :: execBlockUID
//////character*256 :: projectUID
//////character*256 :: configName
//////character*256 :: telescopeName
//////character*256 :: observerName
//////integer :: numObservingLog
//////character*256, allocatable :: observingLog(:)
//////character*256 :: sessionReference
//////real*8 :: baseRangeMin
//////real*8 :: baseRangeMax
//////real*8 :: baseRmsMinor
//////real*8 :: baseRmsMajor
//////real*8 :: basePa
//////logical*1 :: aborted
//////integer :: numAntenna
//////integer, allocatable :: antennaId(:)
//////integer :: sBSummaryId
////end type ExecBlockRow
////type ExecBlockKey
//////integer :: execBlockId
////end type ExecBlockKey
////type ExecBlockOpt
//////integer*8 :: releaseDate
//////character*256 :: schedulerMode
//////real*8 :: siteAltitude
//////real*8 :: siteLongitude
//////real*8 :: siteLatitude
//////character*256 :: observingScript
//////character*256 :: observingScriptUID
//////integer :: scaleId
////end type ExecBlockOpt
////type ExecBlock
//////integer, allocatable :: execBlockId(:)
//////integer*8, allocatable :: startTime(:)
//////integer*8, allocatable :: endTime(:)
//////integer, allocatable :: execBlockNum(:)
//////character*256, allocatable :: execBlockUID(:)
//////character*256, allocatable :: projectUID(:)
//////character*256, allocatable :: configName(:)
//////character*256, allocatable :: telescopeName(:)
//////character*256, allocatable :: observerName(:)
//////integer, allocatable :: numObservingLog(:)
//////character*256, allocatable :: observingLog(:,:)
//////character*256, allocatable :: sessionReference(:)
//////real*8, allocatable :: baseRangeMin(:)
//////real*8, allocatable :: baseRangeMax(:)
//////real*8, allocatable :: baseRmsMinor(:)
//////real*8, allocatable :: baseRmsMajor(:)
//////real*8, allocatable :: basePa(:)
//////logical*1, allocatable :: aborted(:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: antennaId(:,:)
//////integer, allocatable :: sBSummaryId(:)
////end type ExecBlock
//end module sdm_ExecBlock
//! 
//! ===========================================================================
//! 
//! Feed Table: 
//! 
//module sdm_Feed
////use sdm_Types
////type FeedRow
//////integer :: numReceptor
//////real*8, allocatable :: beamOffset(:,:)
//////real*8, allocatable :: focusReference(:,:)
//////integer, allocatable :: polarizationTypes(:)
//////complex*16, allocatable :: polResponse(:,:)
//////real*8, allocatable :: receptorAngle(:)
//////integer, allocatable :: receiverId(:)
////end type FeedRow
////type FeedKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: feedId
////end type FeedKey
////type FeedOpt
//////integer :: feedNum
//////real*8, allocatable :: illumOffset(:)
//////real*8, allocatable :: position(:)
//////real :: skyCoupling
//////integer :: numChan
//////real, allocatable :: skyCouplingSpectrum(:)
////end type FeedOpt
////type Feed
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: feedId(:)
//////integer, allocatable :: numReceptor(:)
//////real*8, allocatable :: beamOffset(:,:,:)
//////real*8, allocatable :: focusReference(:,:,:)
//////integer, allocatable :: polarizationTypes(:,:)
//////complex*16, allocatable :: polResponse(:,:,:)
//////real*8, allocatable :: receptorAngle(:,:)
//////integer, allocatable :: receiverId(:,:)
////end type Feed
//end module sdm_Feed
//! 
//! ===========================================================================
//! 
//! Field Table: 
//! 
//module sdm_Field
////use sdm_Types
////type FieldRow
//////character*256 :: fieldName
//////integer :: numPoly
//////real*8, allocatable :: delayDir(:,:)
//////real*8, allocatable :: phaseDir(:,:)
//////real*8, allocatable :: referenceDir(:,:)
////end type FieldRow
////type FieldKey
//////integer :: fieldId
////end type FieldKey
////type FieldOpt
//////integer*8 :: time
//////character*256 :: code
//////integer :: directionCode
//////integer*8 :: directionEquinox
//////character*256 :: assocNature
//////integer :: ephemerisId
//////integer :: sourceId
//////integer :: assocFieldId
////end type FieldOpt
////type Field
//////integer, allocatable :: fieldId(:)
//////character*256, allocatable :: fieldName(:)
//////integer, allocatable :: numPoly(:)
//////real*8, allocatable :: delayDir(:,:,:)
//////real*8, allocatable :: phaseDir(:,:,:)
//////real*8, allocatable :: referenceDir(:,:,:)
////end type Field
//end module sdm_Field
//! 
//! ===========================================================================
//! 
//! FlagCmd Table: 
//! 
//module sdm_FlagCmd
////use sdm_Types
////type FlagCmdRow
//////character*256 :: type
//////character*256 :: reason
//////integer :: level
//////integer :: severity
//////logical*1 :: applied
//////character*256 :: command
////end type FlagCmdRow
////type FlagCmdKey
//////type(ArrayTimeInterval) :: timeInterval
////end type FlagCmdKey
////type FlagCmd
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////character*256, allocatable :: type(:)
//////character*256, allocatable :: reason(:)
//////integer, allocatable :: level(:)
//////integer, allocatable :: severity(:)
//////logical*1, allocatable :: applied(:)
//////character*256, allocatable :: command(:)
////end type FlagCmd
//end module sdm_FlagCmd
//! 
//! ===========================================================================
//! 
//! Flag Table: 
//! 
//module sdm_Flag
////use sdm_Types
////type FlagRow
//////integer*8 :: startTime
//////integer*8 :: endTime
//////character*256 :: reason
//////integer :: numAntenna
//////integer, allocatable :: antennaId(:)
////end type FlagRow
////type FlagKey
//////integer :: flagId
////end type FlagKey
////type FlagOpt
//////integer :: numPolarizationType
//////integer :: numSpectralWindow
//////integer :: numPairedAntenna
//////integer, allocatable :: polarizationType(:)
//////integer, allocatable :: pairedAntennaId(:)
//////integer, allocatable :: spectralWindowId(:)
////end type FlagOpt
////type Flag
//////integer, allocatable :: flagId(:)
//////integer*8, allocatable :: startTime(:)
//////integer*8, allocatable :: endTime(:)
//////character*256, allocatable :: reason(:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: antennaId(:,:)
////end type Flag
//end module sdm_Flag
//! 
//! ===========================================================================
//! 
//! FocusModel Table: 
//! 
//module sdm_FocusModel
////use sdm_Types
////type FocusModelRow
//////integer :: polarizationType
//////integer :: receiverBand
//////integer :: numCoeff
//////character*256, allocatable :: coeffName(:)
//////character*256, allocatable :: coeffFormula(:)
//////real, allocatable :: coeffVal(:)
//////character*256 :: assocNature
//////integer :: assocFocusModelId
////end type FocusModelRow
////type FocusModelKey
//////integer :: antennaId
//////integer :: focusModelId
////end type FocusModelKey
////type FocusModel
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: focusModelId(:)
//////integer, allocatable :: polarizationType(:)
//////integer, allocatable :: receiverBand(:)
//////integer, allocatable :: numCoeff(:)
//////character*256, allocatable :: coeffName(:,:)
//////character*256, allocatable :: coeffFormula(:,:)
//////real, allocatable :: coeffVal(:,:)
//////character*256, allocatable :: assocNature(:)
//////integer, allocatable :: assocFocusModelId(:)
////end type FocusModel
//end module sdm_FocusModel
//! 
//! ===========================================================================
//! 
//! Focus Table: 
//! 
//module sdm_Focus
////use sdm_Types
////type FocusRow
//////logical*1 :: focusTracking
//////real*8, allocatable :: focusOffset(:)
//////real*8, allocatable :: focusRotationOffset(:)
//////integer :: focusModelId
////end type FocusRow
////type FocusKey
//////integer :: antennaId
//////type(ArrayTimeInterval) :: timeInterval
////end type FocusKey
////type FocusOpt
//////real*8, allocatable :: measuredFocusPosition(:)
//////real*8, allocatable :: measuredFocusRotation(:)
////end type FocusOpt
////type Focus
//////integer, allocatable :: antennaId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////logical*1, allocatable :: focusTracking(:)
//////real*8, allocatable :: focusOffset(:,:)
//////real*8, allocatable :: focusRotationOffset(:,:)
//////integer, allocatable :: focusModelId(:)
////end type Focus
//end module sdm_Focus
//! 
//! ===========================================================================
//! 
//! FreqOffset Table: 
//! 
//module sdm_FreqOffset
////use sdm_Types
////type FreqOffsetRow
//////real*8 :: offset
////end type FreqOffsetRow
////type FreqOffsetKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: feedId
////end type FreqOffsetKey
////type FreqOffset
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: feedId(:)
//////real*8, allocatable :: offset(:)
////end type FreqOffset
//end module sdm_FreqOffset
//! 
//! ===========================================================================
//! 
//! GainTracking Table: 
//! 
//module sdm_GainTracking
////use sdm_Types
////type GainTrackingRow
//////integer :: numReceptor
//////real, allocatable :: attenuator(:)
//////integer, allocatable :: polarizationType(:)
////end type GainTrackingRow
////type GainTrackingKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: feedId
////end type GainTrackingKey
////type GainTrackingOpt
//////real :: samplingLevel
//////integer :: numAttFreq
//////real*8, allocatable :: attFreq(:)
//////complex*16, allocatable :: attSpectrum(:)
////end type GainTrackingOpt
////type GainTracking
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: feedId(:)
//////integer, allocatable :: numReceptor(:)
//////real, allocatable :: attenuator(:,:)
//////integer, allocatable :: polarizationType(:,:)
////end type GainTracking
//end module sdm_GainTracking
//! 
//! ===========================================================================
//! 
//! History Table: 
//! 
//module sdm_History
////use sdm_Types
////type HistoryRow
//////character*256 :: message
//////character*256 :: priority
//////character*256 :: origin
//////character*256 :: objectId
//////character*256 :: application
//////character*256 :: cliCommand
//////character*256 :: appParms
////end type HistoryRow
////type HistoryKey
//////integer :: execBlockId
//////integer*8 :: time
////end type HistoryKey
////type History
//////integer, allocatable :: execBlockId(:)
//////integer*8, allocatable :: time(:)
//////character*256, allocatable :: message(:)
//////character*256, allocatable :: priority(:)
//////character*256, allocatable :: origin(:)
//////character*256, allocatable :: objectId(:)
//////character*256, allocatable :: application(:)
//////character*256, allocatable :: cliCommand(:)
//////character*256, allocatable :: appParms(:)
////end type History
//end module sdm_History
//! 
//! ===========================================================================
//! 
//! Holography Table: 
//! 
//module sdm_Holography
////use sdm_Types
////type HolographyRow
//////real*8 :: distance
//////real*8 :: focus
//////integer :: numCorr
//////integer, allocatable :: type(:)
////end type HolographyRow
////type HolographyKey
//////integer :: holographyId
////end type HolographyKey
////type Holography
//////integer, allocatable :: holographyId(:)
//////real*8, allocatable :: distance(:)
//////real*8, allocatable :: focus(:)
//////integer, allocatable :: numCorr(:)
//////integer, allocatable :: type(:,:)
////end type Holography
//end module sdm_Holography
//! 
//! ===========================================================================
//! 
//! Main Table: 
//! 
//module sdm_Main
////use sdm_Types
////type MainRow
//////integer :: numAntenna
//////integer :: timeSampling
//////integer*8 :: interval
//////integer :: numIntegration
//////integer :: scanNumber
//////integer :: subscanNumber
//////integer*8 :: dataSize
//////character*256 :: dataUID
//////integer, allocatable :: stateId(:)
//////integer :: execBlockId
////end type MainRow
////type MainKey
//////integer*8 :: time
//////integer :: configDescriptionId
//////integer :: fieldId
////end type MainKey
////type Main
//////integer*8, allocatable :: time(:)
//////integer, allocatable :: configDescriptionId(:)
//////integer, allocatable :: fieldId(:)
//////integer, allocatable :: numAntenna(:)
//////integer, allocatable :: timeSampling(:)
//////integer*8, allocatable :: interval(:)
//////integer, allocatable :: numIntegration(:)
//////integer, allocatable :: scanNumber(:)
//////integer, allocatable :: subscanNumber(:)
//////integer*8, allocatable :: dataSize(:)
//////character*256, allocatable :: dataUID(:)
//////integer, allocatable :: stateId(:,:)
//////integer, allocatable :: execBlockId(:)
////end type Main
//end module sdm_Main
//! 
//! ===========================================================================
//! 
//! PointingModel Table: 
//! 
//module sdm_PointingModel
////use sdm_Types
////type PointingModelRow
//////integer :: numCoeff
//////character*256, allocatable :: coeffName(:)
//////real, allocatable :: coeffVal(:)
//////integer :: polarizationType
//////integer :: receiverBand
//////character*256 :: assocNature
//////integer :: assocPointingModelId
////end type PointingModelRow
////type PointingModelKey
//////integer :: antennaId
//////integer :: pointingModelId
////end type PointingModelKey
////type PointingModelOpt
//////character*256, allocatable :: coeffFormula(:)
////end type PointingModelOpt
////type PointingModel
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: pointingModelId(:)
//////integer, allocatable :: numCoeff(:)
//////character*256, allocatable :: coeffName(:,:)
//////real, allocatable :: coeffVal(:,:)
//////integer, allocatable :: polarizationType(:)
//////integer, allocatable :: receiverBand(:)
//////character*256, allocatable :: assocNature(:)
//////integer, allocatable :: assocPointingModelId(:)
////end type PointingModel
//end module sdm_PointingModel
//! 
//! ===========================================================================
//! 
//! Pointing Table: 
//! 
//module sdm_Pointing
////use sdm_Types
////type PointingRow
//////integer :: numSample
//////real*8, allocatable :: encoder(:,:)
//////logical*1 :: pointingTracking
//////logical*1 :: usePolynomials
//////integer*8 :: timeOrigin
//////integer :: numTerm
//////real*8, allocatable :: pointingDirection(:,:)
//////real*8, allocatable :: target(:,:)
//////real*8, allocatable :: offset(:,:)
//////integer :: pointingModelId
////end type PointingRow
////type PointingKey
//////integer :: antennaId
//////type(ArrayTimeInterval) :: timeInterval
////end type PointingKey
////type PointingOpt
//////logical*1 :: overTheTop
//////real*8, allocatable :: sourceOffset(:,:)
//////integer :: sourceOffsetReferenceCode
//////integer*8 :: sourceOffsetEquinox
//////type(ArrayTimeInterval), allocatable :: sampledTimeInterval(:)
//////real*8, allocatable :: atmosphericCorrection(:,:)
////end type PointingOpt
////type Pointing
//////integer, allocatable :: antennaId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: numSample(:)
//////real*8, allocatable :: encoder(:,:,:)
//////logical*1, allocatable :: pointingTracking(:)
//////logical*1, allocatable :: usePolynomials(:)
//////integer*8, allocatable :: timeOrigin(:)
//////integer, allocatable :: numTerm(:)
//////real*8, allocatable :: pointingDirection(:,:,:)
//////real*8, allocatable :: target(:,:,:)
//////real*8, allocatable :: offset(:,:,:)
//////integer, allocatable :: pointingModelId(:)
////end type Pointing
//end module sdm_Pointing
//! 
//! ===========================================================================
//! 
//! Polarization Table: 
//! 
//module sdm_Polarization
////use sdm_Types
////type PolarizationRow
//////integer :: numCorr
//////integer, allocatable :: corrType(:)
//////integer, allocatable :: corrProduct(:,:)
////end type PolarizationRow
////type PolarizationKey
//////integer :: polarizationId
////end type PolarizationKey
////type Polarization
//////integer, allocatable :: polarizationId(:)
//////integer, allocatable :: numCorr(:)
//////integer, allocatable :: corrType(:,:)
//////integer, allocatable :: corrProduct(:,:,:)
////end type Polarization
//end module sdm_Polarization
//! 
//! ===========================================================================
//! 
//! Processor Table: 
//! 
//module sdm_Processor
////use sdm_Types
////type ProcessorRow
//////integer :: modeId
//////integer :: processorType
//////integer :: processorSubType
////end type ProcessorRow
////type ProcessorKey
//////integer :: processorId
////end type ProcessorKey
////type Processor
//////integer, allocatable :: processorId(:)
//////integer, allocatable :: modeId(:)
//////integer, allocatable :: processorType(:)
//////integer, allocatable :: processorSubType(:)
////end type Processor
//end module sdm_Processor
//! 
//! ===========================================================================
//! 
//! Receiver Table: 
//! 
//module sdm_Receiver
////use sdm_Types
////type ReceiverRow
//////character*256 :: name
//////integer :: numLO
//////integer :: frequencyBand
//////real*8, allocatable :: freqLO(:)
//////integer :: receiverSideband
//////integer, allocatable :: sidebandLO(:)
////end type ReceiverRow
////type ReceiverKey
//////integer :: receiverId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
////end type ReceiverKey
////type Receiver
//////integer, allocatable :: receiverId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////character*256, allocatable :: name(:)
//////integer, allocatable :: numLO(:)
//////integer, allocatable :: frequencyBand(:)
//////real*8, allocatable :: freqLO(:,:)
//////integer, allocatable :: receiverSideband(:)
//////integer, allocatable :: sidebandLO(:,:)
////end type Receiver
//end module sdm_Receiver
//! 
//! ===========================================================================
//! 
//! SBSummary Table: 
//! 
//module sdm_SBSummary
////use sdm_Types
////type SBSummaryRow
//////character*256 :: sbSummaryUID
//////character*256 :: projectUID
//////character*256 :: obsUnitSetUID
//////real*8 :: frequency
//////integer :: frequencyBand
//////integer :: sbType
//////integer*8 :: sbDuration
//////integer :: numObservingMode
//////character*256, allocatable :: observingMode(:)
//////integer :: numberRepeats
//////integer :: numScienceGoal
//////character*256, allocatable :: scienceGoal(:)
//////integer :: numWeatherConstraint
//////character*256, allocatable :: weatherConstraint(:)
////end type SBSummaryRow
////type SBSummaryKey
//////integer :: sBSummaryId
////end type SBSummaryKey
////type SBSummaryOpt
//////real*8, allocatable :: centerDirection(:)
//////integer :: centerDirectionCode
//////integer*8 :: centerDirectionEquinox
////end type SBSummaryOpt
////type SBSummary
//////integer, allocatable :: sBSummaryId(:)
//////character*256, allocatable :: sbSummaryUID(:)
//////character*256, allocatable :: projectUID(:)
//////character*256, allocatable :: obsUnitSetUID(:)
//////real*8, allocatable :: frequency(:)
//////integer, allocatable :: frequencyBand(:)
//////integer, allocatable :: sbType(:)
//////integer*8, allocatable :: sbDuration(:)
//////integer, allocatable :: numObservingMode(:)
//////character*256, allocatable :: observingMode(:,:)
//////integer, allocatable :: numberRepeats(:)
//////integer, allocatable :: numScienceGoal(:)
//////character*256, allocatable :: scienceGoal(:,:)
//////integer, allocatable :: numWeatherConstraint(:)
//////character*256, allocatable :: weatherConstraint(:,:)
////end type SBSummary
//end module sdm_SBSummary
//! 
//! ===========================================================================
//! 
//! Scale Table: 
//! 
//module sdm_Scale
////use sdm_Types
////type ScaleRow
//////integer :: timeScale
//////integer :: crossDataScale
//////integer :: autoDataScale
//////integer :: weightType
////end type ScaleRow
////type ScaleKey
//////integer :: scaleId
////end type ScaleKey
////type Scale
//////integer, allocatable :: scaleId(:)
//////integer, allocatable :: timeScale(:)
//////integer, allocatable :: crossDataScale(:)
//////integer, allocatable :: autoDataScale(:)
//////integer, allocatable :: weightType(:)
////end type Scale
//end module sdm_Scale
//! 
//! ===========================================================================
//! 
//! Scan Table: 
//! 
//module sdm_Scan
////use sdm_Types
////type ScanRow
//////integer*8 :: startTime
//////integer*8 :: endTime
//////integer :: numIntent
//////integer :: numSubscan
//////integer, allocatable :: scanIntent(:)
//////integer, allocatable :: calDataType(:)
//////logical*1, allocatable :: calibrationOnLine(:)
////end type ScanRow
////type ScanKey
//////integer :: execBlockId
//////integer :: scanNumber
////end type ScanKey
////type ScanOpt
//////integer, allocatable :: calibrationFunction(:)
//////integer, allocatable :: calibrationSet(:)
//////integer, allocatable :: calPattern(:)
//////integer :: numField
//////character*256, allocatable :: fieldName(:)
//////character*256 :: sourceName
////end type ScanOpt
////type Scan
//////integer, allocatable :: execBlockId(:)
//////integer, allocatable :: scanNumber(:)
//////integer*8, allocatable :: startTime(:)
//////integer*8, allocatable :: endTime(:)
//////integer, allocatable :: numIntent(:)
//////integer, allocatable :: numSubscan(:)
//////integer, allocatable :: scanIntent(:,:)
//////integer, allocatable :: calDataType(:,:)
//////logical*1, allocatable :: calibrationOnLine(:,:)
////end type Scan
//end module sdm_Scan
//! 
//! ===========================================================================
//! 
//! Seeing Table: 
//! 
//module sdm_Seeing
////use sdm_Types
////type SeeingRow
//////integer :: numBaseLength
//////real*8, allocatable :: baseLength(:)
//////real*8, allocatable :: phaseRms(:)
//////real :: seeing
//////real :: exponent
////end type SeeingRow
////type SeeingKey
//////type(ArrayTimeInterval) :: timeInterval
////end type SeeingKey
////type Seeing
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: numBaseLength(:)
//////real*8, allocatable :: baseLength(:,:)
//////real*8, allocatable :: phaseRms(:,:)
//////real, allocatable :: seeing(:)
//////real, allocatable :: exponent(:)
////end type Seeing
//end module sdm_Seeing
//! 
//! ===========================================================================
//! 
//! Source Table: 
//! 
//module sdm_Source
////use sdm_Types
////type SourceRow
//////character*256 :: code
//////real*8, allocatable :: direction(:)
//////real*8, allocatable :: properMotion(:)
//////character*256 :: sourceName
////end type SourceRow
////type SourceKey
//////integer :: sourceId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: spectralWindowId
////end type SourceKey
////type SourceOpt
//////integer :: directionCode
//////integer*8 :: directionEquinox
//////integer :: calibrationGroup
//////character*256 :: catalog
//////real*8 :: deltaVel
//////real*8, allocatable :: position(:)
//////integer :: numLines
//////character*256, allocatable :: transition(:)
//////real*8, allocatable :: restFrequency(:)
//////real*8, allocatable :: sysVel(:)
//////real*8, allocatable :: rangeVel(:)
//////integer :: sourceModel
//////integer :: frequencyRefCode
//////integer :: numFreq
//////integer :: numStokes
//////real*8, allocatable :: frequency(:)
//////real*8, allocatable :: frequencyInterval(:)
//////integer, allocatable :: stokesParameter(:)
//////real*8, allocatable :: flux(:,:)
//////real*8, allocatable :: fluxErr(:,:)
//////real*8, allocatable :: positionAngle(:)
//////real*8, allocatable :: positionAngleErr(:)
//////real*8, allocatable :: size(:,:)
//////real*8, allocatable :: sizeErr(:,:)
//////integer :: velRefCode
////end type SourceOpt
////type Source
//////integer, allocatable :: sourceId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: spectralWindowId(:)
//////character*256, allocatable :: code(:)
//////real*8, allocatable :: direction(:,:)
//////real*8, allocatable :: properMotion(:,:)
//////character*256, allocatable :: sourceName(:)
////end type Source
//end module sdm_Source
//! 
//! ===========================================================================
//! 
//! SpectralWindow Table: 
//! 
//module sdm_SpectralWindow
////use sdm_Types
////type SpectralWindowRow
//////integer :: basebandName
//////integer :: netSideband
//////integer :: numChan
//////real*8 :: refFreq
//////integer :: sidebandProcessingMode
//////real*8 :: totBandwidth
//////integer :: windowFunction
////end type SpectralWindowRow
////type SpectralWindowKey
//////integer :: spectralWindowId
////end type SpectralWindowKey
////type SpectralWindowOpt
//////real*8 :: chanFreqStart
//////real*8 :: chanFreqStep
//////real*8, allocatable :: chanFreqArray(:)
//////real*8 :: chanWidth
//////real*8, allocatable :: chanWidthArray(:)
//////integer :: correlationBit
//////real*8 :: effectiveBw
//////real*8, allocatable :: effectiveBwArray(:)
//////integer :: freqGroup
//////character*256 :: freqGroupName
//////logical*1, allocatable :: lineArray(:)
//////integer :: measFreqRef
//////character*256 :: name
//////logical*1 :: oversampling
//////logical*1 :: quantization
//////real*8 :: refChan
//////real*8 :: resolution
//////real*8, allocatable :: resolutionArray(:)
//////integer :: numAssocValues
//////integer, allocatable :: assocNature(:)
//////integer, allocatable :: assocSpectralWindowId(:)
//////integer :: imageSpectralWindowId
//////integer :: dopplerId
////end type SpectralWindowOpt
////type SpectralWindow
//////integer, allocatable :: spectralWindowId(:)
//////integer, allocatable :: basebandName(:)
//////integer, allocatable :: netSideband(:)
//////integer, allocatable :: numChan(:)
//////real*8, allocatable :: refFreq(:)
//////integer, allocatable :: sidebandProcessingMode(:)
//////real*8, allocatable :: totBandwidth(:)
//////integer, allocatable :: windowFunction(:)
////end type SpectralWindow
//end module sdm_SpectralWindow
//! 
//! ===========================================================================
//! 
//! SquareLawDetector Table: 
//! 
//module sdm_SquareLawDetector
////use sdm_Types
////type SquareLawDetectorRow
//////integer :: numBand
//////integer :: bandType
////end type SquareLawDetectorRow
////type SquareLawDetectorKey
//////integer :: squareLawDetectorId
////end type SquareLawDetectorKey
////type SquareLawDetector
//////integer, allocatable :: squareLawDetectorId(:)
//////integer, allocatable :: numBand(:)
//////integer, allocatable :: bandType(:)
////end type SquareLawDetector
//end module sdm_SquareLawDetector
//! 
//! ===========================================================================
//! 
//! State Table: 
//! 
//module sdm_State
////use sdm_Types
////type StateRow
//////integer :: calDeviceName
//////logical*1 :: sig
//////logical*1 :: ref
//////logical*1 :: onSky
////end type StateRow
////type StateKey
//////integer :: stateId
////end type StateKey
////type StateOpt
//////real :: weight
////end type StateOpt
////type State
//////integer, allocatable :: stateId(:)
//////integer, allocatable :: calDeviceName(:)
//////logical*1, allocatable :: sig(:)
//////logical*1, allocatable :: ref(:)
//////logical*1, allocatable :: onSky(:)
////end type State
//end module sdm_State
//! 
//! ===========================================================================
//! 
//! Station Table: 
//! 
//module sdm_Station
////use sdm_Types
////type StationRow
//////character*256 :: name
//////real*8, allocatable :: position(:)
//////integer :: type
////end type StationRow
////type StationKey
//////integer :: stationId
////end type StationKey
////type StationOpt
//////integer*8 :: time
////end type StationOpt
////type Station
//////integer, allocatable :: stationId(:)
//////character*256, allocatable :: name(:)
//////real*8, allocatable :: position(:,:)
//////integer, allocatable :: type(:)
////end type Station
//end module sdm_Station
//! 
//! ===========================================================================
//! 
//! Subscan Table: 
//! 
//module sdm_Subscan
////use sdm_Types
////type SubscanRow
//////integer*8 :: startTime
//////integer*8 :: endTime
//////character*256 :: fieldName
//////integer :: subscanIntent
//////integer :: numIntegration
//////integer, allocatable :: numSubintegration(:)
////end type SubscanRow
////type SubscanKey
//////integer :: execBlockId
//////integer :: scanNumber
//////integer :: subscanNumber
////end type SubscanKey
////type SubscanOpt
//////integer :: subscanMode
//////integer :: correlatorCalibration
////end type SubscanOpt
////type Subscan
//////integer, allocatable :: execBlockId(:)
//////integer, allocatable :: scanNumber(:)
//////integer, allocatable :: subscanNumber(:)
//////integer*8, allocatable :: startTime(:)
//////integer*8, allocatable :: endTime(:)
//////character*256, allocatable :: fieldName(:)
//////integer, allocatable :: subscanIntent(:)
//////integer, allocatable :: numIntegration(:)
//////integer, allocatable :: numSubintegration(:,:)
////end type Subscan
//end module sdm_Subscan
//! 
//! ===========================================================================
//! 
//! SwitchCycle Table: 
//! 
//module sdm_SwitchCycle
////use sdm_Types
////type SwitchCycleRow
//////integer :: numStep
//////real, allocatable :: weightArray(:)
//////real*8, allocatable :: dirOffsetArray(:,:)
//////real*8, allocatable :: freqOffsetArray(:)
//////integer*8, allocatable :: stepDurationArray(:)
////end type SwitchCycleRow
////type SwitchCycleKey
//////integer :: switchCycleId
////end type SwitchCycleKey
////type SwitchCycleOpt
//////integer :: directionCode
//////integer*8 :: directionEquinox
////end type SwitchCycleOpt
////type SwitchCycle
//////integer, allocatable :: switchCycleId(:)
//////integer, allocatable :: numStep(:)
//////real, allocatable :: weightArray(:,:)
//////real*8, allocatable :: dirOffsetArray(:,:,:)
//////real*8, allocatable :: freqOffsetArray(:,:)
//////integer*8, allocatable :: stepDurationArray(:,:)
////end type SwitchCycle
//end module sdm_SwitchCycle
//! 
//! ===========================================================================
//! 
//! SysCal Table: 
//! 
//module sdm_SysCal
////use sdm_Types
////type SysCalRow
//////integer :: numReceptor
//////integer :: numChan
////end type SysCalRow
////type SysCalKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
//////integer :: feedId
////end type SysCalKey
////type SysCalOpt
//////logical*1 :: tcalFlag
//////real*8, allocatable :: tcalSpectrum(:,:)
//////logical*1 :: trxFlag
//////real*8, allocatable :: trxSpectrum(:,:)
//////logical*1 :: tskyFlag
//////real*8, allocatable :: tskySpectrum(:,:)
//////logical*1 :: tsysFlag
//////real*8, allocatable :: tsysSpectrum(:,:)
//////logical*1 :: tantFlag
//////real, allocatable :: tantSpectrum(:,:)
//////logical*1 :: tantTsysFlag
//////real, allocatable :: tantTsysSpectrum(:,:)
//////logical*1 :: phaseDiffFlag
//////real, allocatable :: phaseDiffSpectrum(:,:)
////end type SysCalOpt
////type SysCal
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: feedId(:)
//////integer, allocatable :: numReceptor(:)
//////integer, allocatable :: numChan(:)
////end type SysCal
//end module sdm_SysCal
//! 
//! ===========================================================================
//! 
//! SysPower Table: 
//! 
//module sdm_SysPower
////use sdm_Types
////type SysPowerRow
//////integer :: numReceptor
////end type SysPowerRow
////type SysPowerKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////integer :: feedId
//////type(ArrayTimeInterval) :: timeInterval
////end type SysPowerKey
////type SysPowerOpt
//////real, allocatable :: switchedPowerDifference(:)
//////real, allocatable :: switchedPowerSum(:)
//////real, allocatable :: requantizerGain(:)
////end type SysPowerOpt
////type SysPower
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////integer, allocatable :: feedId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: numReceptor(:)
////end type SysPower
//end module sdm_SysPower
//! 
//! ===========================================================================
//! 
//! TotalPower Table: 
//! 
//module sdm_TotalPower
////use sdm_Types
////type TotalPowerRow
//////integer :: scanNumber
//////integer :: subscanNumber
//////integer :: integrationNumber
//////real*8, allocatable :: uvw(:,:)
//////integer*8, allocatable :: exposure(:,:)
//////integer*8, allocatable :: timeCentroid(:,:)
//////real, allocatable :: floatData(:,:,:)
//////integer, allocatable :: flagAnt(:)
//////integer, allocatable :: flagPol(:,:)
//////integer*8 :: interval
//////integer, allocatable :: stateId(:)
//////integer :: execBlockId
////end type TotalPowerRow
////type TotalPowerKey
//////integer*8 :: time
//////integer :: configDescriptionId
//////integer :: fieldId
////end type TotalPowerKey
////type TotalPowerOpt
//////integer :: subintegrationNumber
////end type TotalPowerOpt
////type TotalPower
//////integer*8, allocatable :: time(:)
//////integer, allocatable :: configDescriptionId(:)
//////integer, allocatable :: fieldId(:)
//////integer, allocatable :: scanNumber(:)
//////integer, allocatable :: subscanNumber(:)
//////integer, allocatable :: integrationNumber(:)
//////real*8, allocatable :: uvw(:,:,:)
//////integer*8, allocatable :: exposure(:,:,:)
//////integer*8, allocatable :: timeCentroid(:,:,:)
//////real, allocatable :: floatData(:,:,:,:)
//////integer, allocatable :: flagAnt(:,:)
//////integer, allocatable :: flagPol(:,:,:)
//////integer*8, allocatable :: interval(:)
//////integer, allocatable :: stateId(:,:)
//////integer, allocatable :: execBlockId(:)
////end type TotalPower
//end module sdm_TotalPower
//! 
//! ===========================================================================
//! 
//! Weather Table: 
//! 
//module sdm_Weather
////use sdm_Types
////type WeatherRow
//////integer:: dummy ! make sure it compiles...
////end type WeatherRow
////type WeatherKey
//////integer :: stationId
//////type(ArrayTimeInterval) :: timeInterval
////end type WeatherKey
////type WeatherOpt
//////real*8 :: pressure
//////real*8 :: relHumidity
//////real*8 :: temperature
//////real*8 :: windDirection
//////real*8 :: windSpeed
//////real*8 :: windMax
//////real*8 :: dewPoint
//////integer :: numLayer
//////real*8, allocatable :: layerHeight(:)
//////real*8, allocatable :: temperatureProfile(:)
//////real*8 :: cloudMonitor
//////integer :: numWVR
//////real*8, allocatable :: wvrTemp(:)
//////real*8 :: water
////end type WeatherOpt
////type Weather
//////integer, allocatable :: stationId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
////end type Weather
//end module sdm_Weather
//! 
//! ===========================================================================
//! 
//! WVMCal Table: 
//! 
//module sdm_WVMCal
////use sdm_Types
////type WVMCalRow
//////integer :: wvrMethod
//////real*8, allocatable :: polyFreqLimits(:)
//////integer :: numInputAntenna
//////integer :: numChan
//////integer :: numPoly
//////real, allocatable :: pathCoeff(:,:,:)
//////real*8, allocatable :: refTemp(:,:)
//////integer, allocatable :: inputAntennaId(:)
////end type WVMCalRow
////type WVMCalKey
//////integer :: antennaId
//////integer :: spectralWindowId
//////type(ArrayTimeInterval) :: timeInterval
////end type WVMCalKey
////type WVMCal
//////integer, allocatable :: antennaId(:)
//////integer, allocatable :: spectralWindowId(:)
//////type(ArrayTimeInterval), allocatable :: timeInterval(:)
//////integer, allocatable :: wvrMethod(:)
//////real*8, allocatable :: polyFreqLimits(:,:)
//////integer, allocatable :: numInputAntenna(:)
//////integer, allocatable :: numChan(:)
//////integer, allocatable :: numPoly(:)
//////real, allocatable :: pathCoeff(:,:,:,:)
//////real*8, allocatable :: refTemp(:,:,:)
//////integer, allocatable :: inputAntennaId(:,:)
////end type WVMCal
//end module sdm_WVMCal

