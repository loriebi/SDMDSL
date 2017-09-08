!
!  ALMA - Atacama Large Millimeter Array
!  (c) European Southern Observatory, 2002
!  (c) Associated Universities Inc., 2002
!  Copyright by ESO (in the framework of the ALMA collaboration),
!  Copyright by AUI (in the framework of the ALMA collaboration),
!  All rights reserved.
!  
!  This library is free software; you can redistribute it and/or
!  modify it under the terms of the GNU Lesser General Public
!  License as published by the Free software Foundation; either
!  version 2.1 of the License, or (at your option) any later version.
!  
!  This library is distributed in the hope that it will be useful,
!  but WITHOUT ANY WARRANTY, without even the implied warranty of
!  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
!  Lesser General Public License for more details.
!  
!  You should have received a copy of the GNU Lesser General Public
!  License along with this library; if not, write to the Free Software
!  Foundation, Inc., 59 Temple Place, Suite 330, Boston,
!  MA 02111-1307  USA
!  
!  /////////////////////////////////////////////////////////////////
!  // WARNING!  DO NOT MODIFY THIS FILE!                          //
!  //  ---------------------------------------------------------  //
!  // | This is generated code!  Do not modify this file.       | //
!  // | Any changes will be lost when the file is re-generated. | //
!  //  ---------------------------------------------------------  //
!  /////////////////////////////////////////////////////////////////
! 
!  File sdm_enumerations.f90
! 

module sdm_Enumerations

	
	integer, parameter :: ACAPolarization_ACA_STANDARD=0
	integer, parameter :: ACAPolarization_ACA_XX_YY_SUM=1
	integer, parameter :: ACAPolarization_ACA_XX_50=2
	integer, parameter :: ACAPolarization_ACA_YY_50=3
	
	
	integer, parameter :: AccumMode_FAST=0
	integer, parameter :: AccumMode_NORMAL=1
	integer, parameter :: AccumMode_UNDEFINED=2
	
	
	integer, parameter :: AntennaMake_AEM_12=0
	integer, parameter :: AntennaMake_MITSUBISHI_7=1
	integer, parameter :: AntennaMake_MITSUBISHI_12_A=2
	integer, parameter :: AntennaMake_MITSUBISHI_12_B=3
	integer, parameter :: AntennaMake_VERTEX_12_ATF=4
	integer, parameter :: AntennaMake_AEM_12_ATF=5
	integer, parameter :: AntennaMake_VERTEX_12=6
	integer, parameter :: AntennaMake_IRAM_15=7
	integer, parameter :: AntennaMake_UNDEFINED=8
	
	
	integer, parameter :: AntennaMotionPattern_NONE=0
	integer, parameter :: AntennaMotionPattern_CROSS_SCAN=1
	integer, parameter :: AntennaMotionPattern_SPIRAL=2
	integer, parameter :: AntennaMotionPattern_CIRCLE=3
	integer, parameter :: AntennaMotionPattern_THREE_POINTS=4
	integer, parameter :: AntennaMotionPattern_FOUR_POINTS=5
	integer, parameter :: AntennaMotionPattern_FIVE_POINTS=6
	integer, parameter :: AntennaMotionPattern_TEST=7
	integer, parameter :: AntennaMotionPattern_UNSPECIFIED=8
	integer, parameter :: AntennaMotionPattern_STAR=9
	integer, parameter :: AntennaMotionPattern_LISSAJOUS=10
	
	
	integer, parameter :: AntennaType_GROUND_BASED=0
	integer, parameter :: AntennaType_SPACE_BASED=1
	integer, parameter :: AntennaType_TRACKING_STN=2
	
	
	integer, parameter :: AssociatedCalNature_ASSOCIATED_EXECBLOCK=0
	
	
	integer, parameter :: AssociatedFieldNature_ON=0
	integer, parameter :: AssociatedFieldNature_OFF=1
	integer, parameter :: AssociatedFieldNature_PHASE_REFERENCE=2
	
	
	integer, parameter :: AtmPhaseCorrection_AP_UNCORRECTED=0
	integer, parameter :: AtmPhaseCorrection_AP_CORRECTED=1
	
	
	integer, parameter :: AxisName_TIM=0
	integer, parameter :: AxisName_BAL=1
	integer, parameter :: AxisName_ANT=2
	integer, parameter :: AxisName_BAB=3
	integer, parameter :: AxisName_SPW=4
	integer, parameter :: AxisName_SIB=5
	integer, parameter :: AxisName_SUB=6
	integer, parameter :: AxisName_BIN=7
	integer, parameter :: AxisName_APC=8
	integer, parameter :: AxisName_SPP=9
	integer, parameter :: AxisName_POL=10
	integer, parameter :: AxisName_STO=11
	integer, parameter :: AxisName_HOL=12
	
	
	integer, parameter :: BasebandName_NOBB=0
	integer, parameter :: BasebandName_BB_1=1
	integer, parameter :: BasebandName_BB_2=2
	integer, parameter :: BasebandName_BB_3=3
	integer, parameter :: BasebandName_BB_4=4
	integer, parameter :: BasebandName_BB_5=5
	integer, parameter :: BasebandName_BB_6=6
	integer, parameter :: BasebandName_BB_7=7
	integer, parameter :: BasebandName_BB_8=8
	integer, parameter :: BasebandName_BB_ALL=9
	integer, parameter :: BasebandName_A1C1_3BIT=10
	integer, parameter :: BasebandName_A2C2_3BIT=11
	integer, parameter :: BasebandName_AC_8BIT=12
	integer, parameter :: BasebandName_B1D1_3BIT=13
	integer, parameter :: BasebandName_B2D2_3BIT=14
	integer, parameter :: BasebandName_BD_8BIT=15
	
	
	integer, parameter :: BaselineReferenceCode_J2000=0
	integer, parameter :: BaselineReferenceCode_B1950=1
	integer, parameter :: BaselineReferenceCode_GALACTIC=2
	integer, parameter :: BaselineReferenceCode_SUPERGAL=3
	integer, parameter :: BaselineReferenceCode_ECLIPTIC=4
	integer, parameter :: BaselineReferenceCode_JMEAN=5
	integer, parameter :: BaselineReferenceCode_JTRUE=6
	integer, parameter :: BaselineReferenceCode_APP=7
	integer, parameter :: BaselineReferenceCode_BMEAN=8
	integer, parameter :: BaselineReferenceCode_BTRUE=9
	integer, parameter :: BaselineReferenceCode_JNAT=10
	integer, parameter :: BaselineReferenceCode_MECLIPTIC=11
	integer, parameter :: BaselineReferenceCode_TECLIPTIC=12
	integer, parameter :: BaselineReferenceCode_TOPO=13
	integer, parameter :: BaselineReferenceCode_MERCURY=14
	integer, parameter :: BaselineReferenceCode_VENUS=15
	integer, parameter :: BaselineReferenceCode_MARS=16
	integer, parameter :: BaselineReferenceCode_JUPITER=17
	integer, parameter :: BaselineReferenceCode_SATURN=18
	integer, parameter :: BaselineReferenceCode_NEPTUN=19
	integer, parameter :: BaselineReferenceCode_SUN=20
	integer, parameter :: BaselineReferenceCode_MOON=21
	integer, parameter :: BaselineReferenceCode_HADEC=22
	integer, parameter :: BaselineReferenceCode_AZEL=23
	integer, parameter :: BaselineReferenceCode_AZELGEO=24
	integer, parameter :: BaselineReferenceCode_AZELSW=25
	integer, parameter :: BaselineReferenceCode_AZELNE=26
	integer, parameter :: BaselineReferenceCode_ITRF=27
	
	
	integer, parameter :: BinaryDataFlags_INTEGRATION_FULLY_BLANKED=0
	integer, parameter :: BinaryDataFlags_WVR_APC=1
	integer, parameter :: BinaryDataFlags_CORRELATOR_MISSING_STATUS=2
	integer, parameter :: BinaryDataFlags_MISSING_ANTENNA_EVENT=3
	integer, parameter :: BinaryDataFlags_DELTA_SIGMA_OVERFLOW=4
	integer, parameter :: BinaryDataFlags_DELAY_CORRECTION_NOT_APPLIED=5
	integer, parameter :: BinaryDataFlags_SYNCRONIZATION_ERROR=6
	integer, parameter :: BinaryDataFlags_FFT_OVERFLOW=7
	integer, parameter :: BinaryDataFlags_TFB_SCALING_FACTOR_NOT_RETRIEVED=8
	integer, parameter :: BinaryDataFlags_ZERO_LAG_NOT_RECEIVED=9
	integer, parameter :: BinaryDataFlags_SIGMA_OVERFLOW=10
	integer, parameter :: BinaryDataFlags_UNUSABLE_CAI_OUTPUT=11
	integer, parameter :: BinaryDataFlags_QC_FAILED=12
	integer, parameter :: BinaryDataFlags_NOISY_TDM_CHANNELS=13
	integer, parameter :: BinaryDataFlags_SPECTRAL_NORMALIZATION_FAILED=14
	integer, parameter :: BinaryDataFlags_DROPPED_PACKETS=15
	integer, parameter :: BinaryDataFlags_DETECTOR_SATURATED=16
	integer, parameter :: BinaryDataFlags_NO_DATA_FROM_DIGITAL_POWER_METER=17
	integer, parameter :: BinaryDataFlags_RESERVED_18=18
	integer, parameter :: BinaryDataFlags_RESERVED_19=19
	integer, parameter :: BinaryDataFlags_RESERVED_20=20
	integer, parameter :: BinaryDataFlags_RESERVED_21=21
	integer, parameter :: BinaryDataFlags_RESERVED_22=22
	integer, parameter :: BinaryDataFlags_RESERVED_23=23
	integer, parameter :: BinaryDataFlags_RESERVED_24=24
	integer, parameter :: BinaryDataFlags_RESERVED_25=25
	integer, parameter :: BinaryDataFlags_RESERVED_26=26
	integer, parameter :: BinaryDataFlags_RESERVED_27=27
	integer, parameter :: BinaryDataFlags_RESERVED_28=28
	integer, parameter :: BinaryDataFlags_RESERVED_29=29
	integer, parameter :: BinaryDataFlags_RESERVED_30=30
	integer, parameter :: BinaryDataFlags_ALL_PURPOSE_ERROR=31
	
	
	integer, parameter :: CalCurveType_AMPLITUDE=0
	integer, parameter :: CalCurveType_PHASE=1
	integer, parameter :: CalCurveType_UNDEFINED=2
	
	
	integer, parameter :: CalDataOrigin_TOTAL_POWER=0
	integer, parameter :: CalDataOrigin_WVR=1
	integer, parameter :: CalDataOrigin_CHANNEL_AVERAGE_AUTO=2
	integer, parameter :: CalDataOrigin_CHANNEL_AVERAGE_CROSS=3
	integer, parameter :: CalDataOrigin_FULL_RESOLUTION_AUTO=4
	integer, parameter :: CalDataOrigin_FULL_RESOLUTION_CROSS=5
	integer, parameter :: CalDataOrigin_OPTICAL_POINTING=6
	integer, parameter :: CalDataOrigin_HOLOGRAPHY=7
	integer, parameter :: CalDataOrigin_NONE=8
	
	
	integer, parameter :: CalibrationDevice_AMBIENT_LOAD=0
	integer, parameter :: CalibrationDevice_COLD_LOAD=1
	integer, parameter :: CalibrationDevice_HOT_LOAD=2
	integer, parameter :: CalibrationDevice_NOISE_TUBE_LOAD=3
	integer, parameter :: CalibrationDevice_QUARTER_WAVE_PLATE=4
	integer, parameter :: CalibrationDevice_SOLAR_FILTER=5
	integer, parameter :: CalibrationDevice_NONE=6
	
	
	integer, parameter :: CalibrationFunction_FIRST=0
	integer, parameter :: CalibrationFunction_LAST=1
	integer, parameter :: CalibrationFunction_UNSPECIFIED=2
	
	
	integer, parameter :: CalibrationMode_HOLOGRAPHY=0
	integer, parameter :: CalibrationMode_INTERFEROMETRY=1
	integer, parameter :: CalibrationMode_OPTICAL=2
	integer, parameter :: CalibrationMode_RADIOMETRY=3
	integer, parameter :: CalibrationMode_WVR=4
	
	
	integer, parameter :: CalibrationSet_NONE=0
	integer, parameter :: CalibrationSet_AMPLI_CURVE=1
	integer, parameter :: CalibrationSet_ANTENNA_POSITIONS=2
	integer, parameter :: CalibrationSet_PHASE_CURVE=3
	integer, parameter :: CalibrationSet_POINTING_MODEL=4
	integer, parameter :: CalibrationSet_ACCUMULATE=5
	integer, parameter :: CalibrationSet_TEST=6
	integer, parameter :: CalibrationSet_UNSPECIFIED=7
	
	
	integer, parameter :: CalType_CAL_AMPLI=0
	integer, parameter :: CalType_CAL_ATMOSPHERE=1
	integer, parameter :: CalType_CAL_BANDPASS=2
	integer, parameter :: CalType_CAL_CURVE=3
	integer, parameter :: CalType_CAL_DELAY=4
	integer, parameter :: CalType_CAL_FLUX=5
	integer, parameter :: CalType_CAL_FOCUS=6
	integer, parameter :: CalType_CAL_FOCUS_MODEL=7
	integer, parameter :: CalType_CAL_GAIN=8
	integer, parameter :: CalType_CAL_HOLOGRAPHY=9
	integer, parameter :: CalType_CAL_PHASE=10
	integer, parameter :: CalType_CAL_POINTING=11
	integer, parameter :: CalType_CAL_POINTING_MODEL=12
	integer, parameter :: CalType_CAL_POSITION=13
	integer, parameter :: CalType_CAL_PRIMARY_BEAM=14
	integer, parameter :: CalType_CAL_SEEING=15
	integer, parameter :: CalType_CAL_WVR=16
	integer, parameter :: CalType_CAL_APPPHASE=17
	
	
	integer, parameter :: CorrelationBit_BITS_2x2=0
	integer, parameter :: CorrelationBit_BITS_3x3=1
	integer, parameter :: CorrelationBit_BITS_4x4=2
	
	
	integer, parameter :: CorrelationMode_CROSS_ONLY=0
	integer, parameter :: CorrelationMode_AUTO_ONLY=1
	integer, parameter :: CorrelationMode_CROSS_AND_AUTO=2
	
	
	integer, parameter :: CorrelatorCalibration_NONE=0
	integer, parameter :: CorrelatorCalibration_CORRELATOR_CALIBRATION=1
	integer, parameter :: CorrelatorCalibration_REAL_OBSERVATION=2
	
	
	integer, parameter :: CorrelatorName_ALMA_ACA=0
	integer, parameter :: CorrelatorName_ALMA_BASELINE=1
	integer, parameter :: CorrelatorName_ALMA_BASELINE_ATF=2
	integer, parameter :: CorrelatorName_ALMA_BASELINE_PROTO_OSF=3
	integer, parameter :: CorrelatorName_HERSCHEL=4
	integer, parameter :: CorrelatorName_IRAM_PDB=5
	integer, parameter :: CorrelatorName_IRAM_30M_VESPA=6
	integer, parameter :: CorrelatorName_IRAM_WILMA=7
	integer, parameter :: CorrelatorName_NRAO_VLA=8
	integer, parameter :: CorrelatorName_NRAO_WIDAR=9
	
	
	integer, parameter :: CorrelatorType_FX=0
	integer, parameter :: CorrelatorType_XF=1
	integer, parameter :: CorrelatorType_FXF=2
	
	
	integer, parameter :: DataContent_CROSS_DATA=0
	integer, parameter :: DataContent_AUTO_DATA=1
	integer, parameter :: DataContent_ZERO_LAGS=2
	integer, parameter :: DataContent_ACTUAL_TIMES=3
	integer, parameter :: DataContent_ACTUAL_DURATIONS=4
	integer, parameter :: DataContent_WEIGHTS=5
	integer, parameter :: DataContent_FLAGS=6
	
	
	integer, parameter :: DataScale_K=0
	integer, parameter :: DataScale_JY=1
	integer, parameter :: DataScale_CORRELATION=2
	integer, parameter :: DataScale_CORRELATION_COEFFICIENT=3
	
	
	integer, parameter :: DetectorBandType_BASEBAND=0
	integer, parameter :: DetectorBandType_DOWN_CONVERTER=1
	integer, parameter :: DetectorBandType_HOLOGRAPHY_RECEIVER=2
	integer, parameter :: DetectorBandType_SUBBAND=3
	
	
	integer, parameter :: DifferenceType_PREDICTED=0
	integer, parameter :: DifferenceType_PRELIMINARY=1
	integer, parameter :: DifferenceType_RAPID=2
	integer, parameter :: DifferenceType_FINAL=3
	
	
	integer, parameter :: DirectionReferenceCode_J2000=0
	integer, parameter :: DirectionReferenceCode_JMEAN=1
	integer, parameter :: DirectionReferenceCode_JTRUE=2
	integer, parameter :: DirectionReferenceCode_APP=3
	integer, parameter :: DirectionReferenceCode_B1950=4
	integer, parameter :: DirectionReferenceCode_B1950_VLA=5
	integer, parameter :: DirectionReferenceCode_BMEAN=6
	integer, parameter :: DirectionReferenceCode_BTRUE=7
	integer, parameter :: DirectionReferenceCode_GALACTIC=8
	integer, parameter :: DirectionReferenceCode_HADEC=9
	integer, parameter :: DirectionReferenceCode_AZELSW=10
	integer, parameter :: DirectionReferenceCode_AZELSWGEO=11
	integer, parameter :: DirectionReferenceCode_AZELNE=12
	integer, parameter :: DirectionReferenceCode_AZELNEGEO=13
	integer, parameter :: DirectionReferenceCode_JNAT=14
	integer, parameter :: DirectionReferenceCode_ECLIPTIC=15
	integer, parameter :: DirectionReferenceCode_MECLIPTIC=16
	integer, parameter :: DirectionReferenceCode_TECLIPTIC=17
	integer, parameter :: DirectionReferenceCode_SUPERGAL=18
	integer, parameter :: DirectionReferenceCode_ITRF=19
	integer, parameter :: DirectionReferenceCode_TOPO=20
	integer, parameter :: DirectionReferenceCode_ICRS=21
	integer, parameter :: DirectionReferenceCode_MERCURY=22
	integer, parameter :: DirectionReferenceCode_VENUS=23
	integer, parameter :: DirectionReferenceCode_MARS=24
	integer, parameter :: DirectionReferenceCode_JUPITER=25
	integer, parameter :: DirectionReferenceCode_SATURN=26
	integer, parameter :: DirectionReferenceCode_URANUS=27
	integer, parameter :: DirectionReferenceCode_NEPTUNE=28
	integer, parameter :: DirectionReferenceCode_PLUTO=29
	integer, parameter :: DirectionReferenceCode_SUN=30
	integer, parameter :: DirectionReferenceCode_MOON=31
	
	
	integer, parameter :: DopplerReferenceCode_RADIO=0
	integer, parameter :: DopplerReferenceCode_Z=1
	integer, parameter :: DopplerReferenceCode_RATIO=2
	integer, parameter :: DopplerReferenceCode_BETA=3
	integer, parameter :: DopplerReferenceCode_GAMMA=4
	integer, parameter :: DopplerReferenceCode_OPTICAL=5
	integer, parameter :: DopplerReferenceCode_RELATIVISTIC=6
	
	
	integer, parameter :: DopplerTrackingMode_NONE=0
	integer, parameter :: DopplerTrackingMode_CONTINUOUS=1
	integer, parameter :: DopplerTrackingMode_SCAN_BASED=2
	integer, parameter :: DopplerTrackingMode_SB_BASED=3
	
	
	integer, parameter :: FieldCode_NONE=0
	
	
	integer, parameter :: FilterMode_FILTER_NA=0
	integer, parameter :: FilterMode_FILTER_TDM=1
	integer, parameter :: FilterMode_FILTER_TFB=2
	integer, parameter :: FilterMode_UNDEFINED=3
	
	
	integer, parameter :: FluxCalibrationMethod_ABSOLUTE=0
	integer, parameter :: FluxCalibrationMethod_RELATIVE=1
	integer, parameter :: FluxCalibrationMethod_EFFICIENCY=2
	
	
	integer, parameter :: FocusMethod_THREE_POINT=0
	integer, parameter :: FocusMethod_FIVE_POINT=1
	integer, parameter :: FocusMethod_HOLOGRAPHY=2
	
	
	integer, parameter :: FrequencyReferenceCode_LABREST=0
	integer, parameter :: FrequencyReferenceCode_LSRD=1
	integer, parameter :: FrequencyReferenceCode_LSRK=2
	integer, parameter :: FrequencyReferenceCode_BARY=3
	integer, parameter :: FrequencyReferenceCode_REST=4
	integer, parameter :: FrequencyReferenceCode_GEO=5
	integer, parameter :: FrequencyReferenceCode_GALACTO=6
	integer, parameter :: FrequencyReferenceCode_TOPO=7
	
	
	integer, parameter :: HolographyChannelType_Q2=0
	integer, parameter :: HolographyChannelType_QR=1
	integer, parameter :: HolographyChannelType_QS=2
	integer, parameter :: HolographyChannelType_R2=3
	integer, parameter :: HolographyChannelType_RS=4
	integer, parameter :: HolographyChannelType_S2=5
	
	
	integer, parameter :: InvalidatingCondition_ANTENNA_DISCONNECT=0
	integer, parameter :: InvalidatingCondition_ANTENNA_MOVE=1
	integer, parameter :: InvalidatingCondition_ANTENNA_POWER_DOWN=2
	integer, parameter :: InvalidatingCondition_RECEIVER_EXCHANGE=3
	integer, parameter :: InvalidatingCondition_RECEIVER_POWER_DOWN=4
	
	
	integer, parameter :: NetSideband_NOSB=0
	integer, parameter :: NetSideband_LSB=1
	integer, parameter :: NetSideband_USB=2
	integer, parameter :: NetSideband_DSB=3
	
	
	integer, parameter :: PointingMethod_THREE_POINT=0
	integer, parameter :: PointingMethod_FOUR_POINT=1
	integer, parameter :: PointingMethod_FIVE_POINT=2
	integer, parameter :: PointingMethod_CROSS=3
	integer, parameter :: PointingMethod_CIRCLE=4
	integer, parameter :: PointingMethod_HOLOGRAPHY=5
	
	
	integer, parameter :: PointingModelMode_RADIO=0
	integer, parameter :: PointingModelMode_OPTICAL=1
	
	
	integer, parameter :: PolarizationType_R=0
	integer, parameter :: PolarizationType_L=1
	integer, parameter :: PolarizationType_X=2
	integer, parameter :: PolarizationType_Y=3
	integer, parameter :: PolarizationType_BOTH=4
	
	
	integer, parameter :: PositionMethod_DELAY_FITTING=0
	integer, parameter :: PositionMethod_PHASE_FITTING=1
	
	
	integer, parameter :: PositionReferenceCode_ITRF=0
	integer, parameter :: PositionReferenceCode_WGS84=1
	integer, parameter :: PositionReferenceCode_SITE=2
	integer, parameter :: PositionReferenceCode_STATION=3
	integer, parameter :: PositionReferenceCode_YOKE=4
	integer, parameter :: PositionReferenceCode_REFLECTOR=5
	
	
	integer, parameter :: PrimaryBeamDescription_COMPLEX_FIELD_PATTERN=0
	integer, parameter :: PrimaryBeamDescription_APERTURE_FIELD_DISTRIBUTION=1
	
	
	integer, parameter :: PrimitiveDataType_INT16_TYPE=0
	integer, parameter :: PrimitiveDataType_INT32_TYPE=1
	integer, parameter :: PrimitiveDataType_INT64_TYPE=2
	integer, parameter :: PrimitiveDataType_FLOAT32_TYPE=3
	integer, parameter :: PrimitiveDataType_FLOAT64_TYPE=4
	
	
	integer, parameter :: ProcessorSubType_ALMA_CORRELATOR_MODE=0
	integer, parameter :: ProcessorSubType_SQUARE_LAW_DETECTOR=1
	integer, parameter :: ProcessorSubType_HOLOGRAPHY=2
	integer, parameter :: ProcessorSubType_ALMA_RADIOMETER=3
	
	
	integer, parameter :: ProcessorType_CORRELATOR=0
	integer, parameter :: ProcessorType_RADIOMETER=1
	integer, parameter :: ProcessorType_SPECTROMETER=2
	
	
	integer, parameter :: RadialVelocityReferenceCode_LSRD=0
	integer, parameter :: RadialVelocityReferenceCode_LSRK=1
	integer, parameter :: RadialVelocityReferenceCode_GALACTO=2
	integer, parameter :: RadialVelocityReferenceCode_BARY=3
	integer, parameter :: RadialVelocityReferenceCode_GEO=4
	integer, parameter :: RadialVelocityReferenceCode_TOPO=5
	
	
	integer, parameter :: ReceiverBand_ALMA_RB_01=0
	integer, parameter :: ReceiverBand_ALMA_RB_02=1
	integer, parameter :: ReceiverBand_ALMA_RB_03=2
	integer, parameter :: ReceiverBand_ALMA_RB_04=3
	integer, parameter :: ReceiverBand_ALMA_RB_05=4
	integer, parameter :: ReceiverBand_ALMA_RB_06=5
	integer, parameter :: ReceiverBand_ALMA_RB_07=6
	integer, parameter :: ReceiverBand_ALMA_RB_08=7
	integer, parameter :: ReceiverBand_ALMA_RB_09=8
	integer, parameter :: ReceiverBand_ALMA_RB_10=9
	integer, parameter :: ReceiverBand_ALMA_RB_ALL=10
	integer, parameter :: ReceiverBand_ALMA_HOLOGRAPHY_RECEIVER=11
	integer, parameter :: ReceiverBand_BURE_01=12
	integer, parameter :: ReceiverBand_BURE_02=13
	integer, parameter :: ReceiverBand_BURE_03=14
	integer, parameter :: ReceiverBand_BURE_04=15
	integer, parameter :: ReceiverBand_EVLA_4=16
	integer, parameter :: ReceiverBand_EVLA_P=17
	integer, parameter :: ReceiverBand_EVLA_L=18
	integer, parameter :: ReceiverBand_EVLA_C=19
	integer, parameter :: ReceiverBand_EVLA_S=20
	integer, parameter :: ReceiverBand_EVLA_X=21
	integer, parameter :: ReceiverBand_EVLA_Ku=22
	integer, parameter :: ReceiverBand_EVLA_K=23
	integer, parameter :: ReceiverBand_EVLA_Ka=24
	integer, parameter :: ReceiverBand_EVLA_Q=25
	integer, parameter :: ReceiverBand_UNSPECIFIED=26
	
	
	integer, parameter :: ReceiverSideband_NOSB=0
	integer, parameter :: ReceiverSideband_DSB=1
	integer, parameter :: ReceiverSideband_SSB=2
	integer, parameter :: ReceiverSideband_TSB=3
	
	
	integer, parameter :: SBType_OBSERVATORY=0
	integer, parameter :: SBType_OBSERVER=1
	integer, parameter :: SBType_EXPERT=2
	
	
	integer, parameter :: ScanIntent_CALIBRATE_AMPLI=0
	integer, parameter :: ScanIntent_CALIBRATE_ATMOSPHERE=1
	integer, parameter :: ScanIntent_CALIBRATE_BANDPASS=2
	integer, parameter :: ScanIntent_CALIBRATE_DELAY=3
	integer, parameter :: ScanIntent_CALIBRATE_FLUX=4
	integer, parameter :: ScanIntent_CALIBRATE_FOCUS=5
	integer, parameter :: ScanIntent_CALIBRATE_FOCUS_X=6
	integer, parameter :: ScanIntent_CALIBRATE_FOCUS_Y=7
	integer, parameter :: ScanIntent_CALIBRATE_PHASE=8
	integer, parameter :: ScanIntent_CALIBRATE_POINTING=9
	integer, parameter :: ScanIntent_CALIBRATE_POLARIZATION=10
	integer, parameter :: ScanIntent_CALIBRATE_SIDEBAND_RATIO=11
	integer, parameter :: ScanIntent_CALIBRATE_WVR=12
	integer, parameter :: ScanIntent_DO_SKYDIP=13
	integer, parameter :: ScanIntent_MAP_ANTENNA_SURFACE=14
	integer, parameter :: ScanIntent_MAP_PRIMARY_BEAM=15
	integer, parameter :: ScanIntent_OBSERVE_TARGET=16
	integer, parameter :: ScanIntent_CALIBRATE_POL_LEAKAGE=17
	integer, parameter :: ScanIntent_CALIBRATE_POL_ANGLE=18
	integer, parameter :: ScanIntent_TEST=19
	integer, parameter :: ScanIntent_UNSPECIFIED=20
	integer, parameter :: ScanIntent_CALIBRATE_ANTENNA_POSITION=21
	integer, parameter :: ScanIntent_CALIBRATE_ANTENNA_PHASE=22
	integer, parameter :: ScanIntent_MEASURE_RFI=23
	integer, parameter :: ScanIntent_CALIBRATE_ANTENNA_POINTING_MODEL=24
	integer, parameter :: ScanIntent_SYSTEM_CONFIGURATION=25
	integer, parameter :: ScanIntent_CALIBRATE_APPPHASE_ACTIVE=26
	integer, parameter :: ScanIntent_CALIBRATE_APPPHASE_PASSIVE=27
	integer, parameter :: ScanIntent_OBSERVE_CHECK_SOURCE=28
	integer, parameter :: ScanIntent_CALIBRATE_DIFFGAIN=29
	
	
	integer, parameter :: SchedulerMode_DYNAMIC=0
	integer, parameter :: SchedulerMode_INTERACTIVE=1
	integer, parameter :: SchedulerMode_MANUAL=2
	integer, parameter :: SchedulerMode_QUEUED=3
	
	
	integer, parameter :: SidebandProcessingMode_NONE=0
	integer, parameter :: SidebandProcessingMode_PHASE_SWITCH_SEPARATION=1
	integer, parameter :: SidebandProcessingMode_FREQUENCY_OFFSET_SEPARATION=2
	integer, parameter :: SidebandProcessingMode_PHASE_SWITCH_REJECTION=3
	integer, parameter :: SidebandProcessingMode_FREQUENCY_OFFSET_REJECTION=4
	
	
	integer, parameter :: SourceModel_GAUSSIAN=0
	integer, parameter :: SourceModel_POINT=1
	integer, parameter :: SourceModel_DISK=2
	
	
	integer, parameter :: SpectralResolutionType_CHANNEL_AVERAGE=0
	integer, parameter :: SpectralResolutionType_BASEBAND_WIDE=1
	integer, parameter :: SpectralResolutionType_FULL_RESOLUTION=2
	
	
	integer, parameter :: StationType_ANTENNA_PAD=0
	integer, parameter :: StationType_MAINTENANCE_PAD=1
	integer, parameter :: StationType_WEATHER_STATION=2
	
	
	integer, parameter :: StokesParameter_I=0
	integer, parameter :: StokesParameter_Q=1
	integer, parameter :: StokesParameter_U=2
	integer, parameter :: StokesParameter_V=3
	integer, parameter :: StokesParameter_RR=4
	integer, parameter :: StokesParameter_RL=5
	integer, parameter :: StokesParameter_LR=6
	integer, parameter :: StokesParameter_LL=7
	integer, parameter :: StokesParameter_XX=8
	integer, parameter :: StokesParameter_XY=9
	integer, parameter :: StokesParameter_YX=10
	integer, parameter :: StokesParameter_YY=11
	integer, parameter :: StokesParameter_RX=12
	integer, parameter :: StokesParameter_RY=13
	integer, parameter :: StokesParameter_LX=14
	integer, parameter :: StokesParameter_LY=15
	integer, parameter :: StokesParameter_XR=16
	integer, parameter :: StokesParameter_XL=17
	integer, parameter :: StokesParameter_YR=18
	integer, parameter :: StokesParameter_YL=19
	integer, parameter :: StokesParameter_PP=20
	integer, parameter :: StokesParameter_PQ=21
	integer, parameter :: StokesParameter_QP=22
	integer, parameter :: StokesParameter_QQ=23
	integer, parameter :: StokesParameter_RCIRCULAR=24
	integer, parameter :: StokesParameter_LCIRCULAR=25
	integer, parameter :: StokesParameter_LINEAR=26
	integer, parameter :: StokesParameter_PTOTAL=27
	integer, parameter :: StokesParameter_PLINEAR=28
	integer, parameter :: StokesParameter_PFTOTAL=29
	integer, parameter :: StokesParameter_PFLINEAR=30
	integer, parameter :: StokesParameter_PANGLE=31
	
	
	integer, parameter :: SubscanIntent_ON_SOURCE=0
	integer, parameter :: SubscanIntent_OFF_SOURCE=1
	integer, parameter :: SubscanIntent_MIXED=2
	integer, parameter :: SubscanIntent_REFERENCE=3
	integer, parameter :: SubscanIntent_SCANNING=4
	integer, parameter :: SubscanIntent_HOT=5
	integer, parameter :: SubscanIntent_AMBIENT=6
	integer, parameter :: SubscanIntent_SIGNAL=7
	integer, parameter :: SubscanIntent_IMAGE=8
	integer, parameter :: SubscanIntent_TEST=9
	integer, parameter :: SubscanIntent_UNSPECIFIED=10
	
	
	integer, parameter :: SwitchingMode_NO_SWITCHING=0
	integer, parameter :: SwitchingMode_LOAD_SWITCHING=1
	integer, parameter :: SwitchingMode_POSITION_SWITCHING=2
	integer, parameter :: SwitchingMode_PHASE_SWITCHING=3
	integer, parameter :: SwitchingMode_FREQUENCY_SWITCHING=4
	integer, parameter :: SwitchingMode_NUTATOR_SWITCHING=5
	integer, parameter :: SwitchingMode_CHOPPER_WHEEL=6
	
	
	integer, parameter :: SynthProf_NOSYNTH=0
	integer, parameter :: SynthProf_ACACORR=1
	integer, parameter :: SynthProf_ACA_CDP=2
	
	
	integer, parameter :: SyscalMethod_TEMPERATURE_SCALE=0
	integer, parameter :: SyscalMethod_SKYDIP=1
	integer, parameter :: SyscalMethod_SIDEBAND_RATIO=2
	
	
	integer, parameter :: TimeSampling_SUBINTEGRATION=0
	integer, parameter :: TimeSampling_INTEGRATION=1
	
	
	integer, parameter :: TimeScale_UTC=0
	integer, parameter :: TimeScale_TAI=1
	
	
	integer, parameter :: WeightType_K=0
	integer, parameter :: WeightType_JY=1
	integer, parameter :: WeightType_COUNT_WEIGHT=2
	
	
	integer, parameter :: WindowFunction_UNIFORM=0
	integer, parameter :: WindowFunction_HANNING=1
	integer, parameter :: WindowFunction_HAMMING=2
	integer, parameter :: WindowFunction_BARTLETT=3
	integer, parameter :: WindowFunction_BLACKMANN=4
	integer, parameter :: WindowFunction_BLACKMANN_HARRIS=5
	integer, parameter :: WindowFunction_WELCH=6
	
	
	integer, parameter :: WVRMethod_ATM_MODEL=0
	integer, parameter :: WVRMethod_EMPIRICAL=1
	

contains


!
	function ACAPolarization_toString(i)
		integer :: i
		character*80 :: ACAPolarization_toString
		select case(i)
		case(ACAPolarization_ACA_STANDARD)
			ACAPolarization_toString = 'ACA_STANDARD'
		case(ACAPolarization_ACA_XX_YY_SUM)
			ACAPolarization_toString = 'ACA_XX_YY_SUM'
		case(ACAPolarization_ACA_XX_50)
			ACAPolarization_toString = 'ACA_XX_50'
		case(ACAPolarization_ACA_YY_50)
			ACAPolarization_toString = 'ACA_YY_50'
		end select
	end function ACAPolarization_toString

!
	function ACAPolarization_fromString(str)
		integer :: ACAPolarization_fromString
		character*80 :: str
		select case(str)
		case('ACA_STANDARD')
			ACAPolarization_fromString = ACAPolarization_ACA_STANDARD
		case('ACA_XX_YY_SUM')
			ACAPolarization_fromString = ACAPolarization_ACA_XX_YY_SUM
		case('ACA_XX_50')
			ACAPolarization_fromString = ACAPolarization_ACA_XX_50
		case('ACA_YY_50')
			ACAPolarization_fromString = ACAPolarization_ACA_YY_50
		end select
	end function ACAPolarization_fromString



!
	function AccumMode_toString(i)
		integer :: i
		character*80 :: AccumMode_toString
		select case(i)
		case(AccumMode_FAST)
			AccumMode_toString = 'FAST'
		case(AccumMode_NORMAL)
			AccumMode_toString = 'NORMAL'
		case(AccumMode_UNDEFINED)
			AccumMode_toString = 'UNDEFINED'
		end select
	end function AccumMode_toString

!
	function AccumMode_fromString(str)
		integer :: AccumMode_fromString
		character*80 :: str
		select case(str)
		case('FAST')
			AccumMode_fromString = AccumMode_FAST
		case('NORMAL')
			AccumMode_fromString = AccumMode_NORMAL
		case('UNDEFINED')
			AccumMode_fromString = AccumMode_UNDEFINED
		end select
	end function AccumMode_fromString



!
	function AntennaMake_toString(i)
		integer :: i
		character*80 :: AntennaMake_toString
		select case(i)
		case(AntennaMake_AEM_12)
			AntennaMake_toString = 'AEM_12'
		case(AntennaMake_MITSUBISHI_7)
			AntennaMake_toString = 'MITSUBISHI_7'
		case(AntennaMake_MITSUBISHI_12_A)
			AntennaMake_toString = 'MITSUBISHI_12_A'
		case(AntennaMake_MITSUBISHI_12_B)
			AntennaMake_toString = 'MITSUBISHI_12_B'
		case(AntennaMake_VERTEX_12_ATF)
			AntennaMake_toString = 'VERTEX_12_ATF'
		case(AntennaMake_AEM_12_ATF)
			AntennaMake_toString = 'AEM_12_ATF'
		case(AntennaMake_VERTEX_12)
			AntennaMake_toString = 'VERTEX_12'
		case(AntennaMake_IRAM_15)
			AntennaMake_toString = 'IRAM_15'
		case(AntennaMake_UNDEFINED)
			AntennaMake_toString = 'UNDEFINED'
		end select
	end function AntennaMake_toString

!
	function AntennaMake_fromString(str)
		integer :: AntennaMake_fromString
		character*80 :: str
		select case(str)
		case('AEM_12')
			AntennaMake_fromString = AntennaMake_AEM_12
		case('MITSUBISHI_7')
			AntennaMake_fromString = AntennaMake_MITSUBISHI_7
		case('MITSUBISHI_12_A')
			AntennaMake_fromString = AntennaMake_MITSUBISHI_12_A
		case('MITSUBISHI_12_B')
			AntennaMake_fromString = AntennaMake_MITSUBISHI_12_B
		case('VERTEX_12_ATF')
			AntennaMake_fromString = AntennaMake_VERTEX_12_ATF
		case('AEM_12_ATF')
			AntennaMake_fromString = AntennaMake_AEM_12_ATF
		case('VERTEX_12')
			AntennaMake_fromString = AntennaMake_VERTEX_12
		case('IRAM_15')
			AntennaMake_fromString = AntennaMake_IRAM_15
		case('UNDEFINED')
			AntennaMake_fromString = AntennaMake_UNDEFINED
		end select
	end function AntennaMake_fromString



!
	function AntennaMotionPattern_toString(i)
		integer :: i
		character*80 :: AntennaMotionPattern_toString
		select case(i)
		case(AntennaMotionPattern_NONE)
			AntennaMotionPattern_toString = 'NONE'
		case(AntennaMotionPattern_CROSS_SCAN)
			AntennaMotionPattern_toString = 'CROSS_SCAN'
		case(AntennaMotionPattern_SPIRAL)
			AntennaMotionPattern_toString = 'SPIRAL'
		case(AntennaMotionPattern_CIRCLE)
			AntennaMotionPattern_toString = 'CIRCLE'
		case(AntennaMotionPattern_THREE_POINTS)
			AntennaMotionPattern_toString = 'THREE_POINTS'
		case(AntennaMotionPattern_FOUR_POINTS)
			AntennaMotionPattern_toString = 'FOUR_POINTS'
		case(AntennaMotionPattern_FIVE_POINTS)
			AntennaMotionPattern_toString = 'FIVE_POINTS'
		case(AntennaMotionPattern_TEST)
			AntennaMotionPattern_toString = 'TEST'
		case(AntennaMotionPattern_UNSPECIFIED)
			AntennaMotionPattern_toString = 'UNSPECIFIED'
		case(AntennaMotionPattern_STAR)
			AntennaMotionPattern_toString = 'STAR'
		case(AntennaMotionPattern_LISSAJOUS)
			AntennaMotionPattern_toString = 'LISSAJOUS'
		end select
	end function AntennaMotionPattern_toString

!
	function AntennaMotionPattern_fromString(str)
		integer :: AntennaMotionPattern_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			AntennaMotionPattern_fromString = AntennaMotionPattern_NONE
		case('CROSS_SCAN')
			AntennaMotionPattern_fromString = AntennaMotionPattern_CROSS_SCAN
		case('SPIRAL')
			AntennaMotionPattern_fromString = AntennaMotionPattern_SPIRAL
		case('CIRCLE')
			AntennaMotionPattern_fromString = AntennaMotionPattern_CIRCLE
		case('THREE_POINTS')
			AntennaMotionPattern_fromString = AntennaMotionPattern_THREE_POINTS
		case('FOUR_POINTS')
			AntennaMotionPattern_fromString = AntennaMotionPattern_FOUR_POINTS
		case('FIVE_POINTS')
			AntennaMotionPattern_fromString = AntennaMotionPattern_FIVE_POINTS
		case('TEST')
			AntennaMotionPattern_fromString = AntennaMotionPattern_TEST
		case('UNSPECIFIED')
			AntennaMotionPattern_fromString = AntennaMotionPattern_UNSPECIFIED
		case('STAR')
			AntennaMotionPattern_fromString = AntennaMotionPattern_STAR
		case('LISSAJOUS')
			AntennaMotionPattern_fromString = AntennaMotionPattern_LISSAJOUS
		end select
	end function AntennaMotionPattern_fromString



!
	function AntennaType_toString(i)
		integer :: i
		character*80 :: AntennaType_toString
		select case(i)
		case(AntennaType_GROUND_BASED)
			AntennaType_toString = 'GROUND_BASED'
		case(AntennaType_SPACE_BASED)
			AntennaType_toString = 'SPACE_BASED'
		case(AntennaType_TRACKING_STN)
			AntennaType_toString = 'TRACKING_STN'
		end select
	end function AntennaType_toString

!
	function AntennaType_fromString(str)
		integer :: AntennaType_fromString
		character*80 :: str
		select case(str)
		case('GROUND_BASED')
			AntennaType_fromString = AntennaType_GROUND_BASED
		case('SPACE_BASED')
			AntennaType_fromString = AntennaType_SPACE_BASED
		case('TRACKING_STN')
			AntennaType_fromString = AntennaType_TRACKING_STN
		end select
	end function AntennaType_fromString



!
	function AssociatedCalNature_toString(i)
		integer :: i
		character*80 :: AssociatedCalNature_toString
		select case(i)
		case(AssociatedCalNature_ASSOCIATED_EXECBLOCK)
			AssociatedCalNature_toString = 'ASSOCIATED_EXECBLOCK'
		end select
	end function AssociatedCalNature_toString

!
	function AssociatedCalNature_fromString(str)
		integer :: AssociatedCalNature_fromString
		character*80 :: str
		select case(str)
		case('ASSOCIATED_EXECBLOCK')
			AssociatedCalNature_fromString = AssociatedCalNature_ASSOCIATED_EXECBLOCK
		end select
	end function AssociatedCalNature_fromString



!
	function AssociatedFieldNature_toString(i)
		integer :: i
		character*80 :: AssociatedFieldNature_toString
		select case(i)
		case(AssociatedFieldNature_ON)
			AssociatedFieldNature_toString = 'ON'
		case(AssociatedFieldNature_OFF)
			AssociatedFieldNature_toString = 'OFF'
		case(AssociatedFieldNature_PHASE_REFERENCE)
			AssociatedFieldNature_toString = 'PHASE_REFERENCE'
		end select
	end function AssociatedFieldNature_toString

!
	function AssociatedFieldNature_fromString(str)
		integer :: AssociatedFieldNature_fromString
		character*80 :: str
		select case(str)
		case('ON')
			AssociatedFieldNature_fromString = AssociatedFieldNature_ON
		case('OFF')
			AssociatedFieldNature_fromString = AssociatedFieldNature_OFF
		case('PHASE_REFERENCE')
			AssociatedFieldNature_fromString = AssociatedFieldNature_PHASE_REFERENCE
		end select
	end function AssociatedFieldNature_fromString



!
	function AtmPhaseCorrection_toString(i)
		integer :: i
		character*80 :: AtmPhaseCorrection_toString
		select case(i)
		case(AtmPhaseCorrection_AP_UNCORRECTED)
			AtmPhaseCorrection_toString = 'AP_UNCORRECTED'
		case(AtmPhaseCorrection_AP_CORRECTED)
			AtmPhaseCorrection_toString = 'AP_CORRECTED'
		end select
	end function AtmPhaseCorrection_toString

!
	function AtmPhaseCorrection_fromString(str)
		integer :: AtmPhaseCorrection_fromString
		character*80 :: str
		select case(str)
		case('AP_UNCORRECTED')
			AtmPhaseCorrection_fromString = AtmPhaseCorrection_AP_UNCORRECTED
		case('AP_CORRECTED')
			AtmPhaseCorrection_fromString = AtmPhaseCorrection_AP_CORRECTED
		end select
	end function AtmPhaseCorrection_fromString



!
	function AxisName_toString(i)
		integer :: i
		character*80 :: AxisName_toString
		select case(i)
		case(AxisName_TIM)
			AxisName_toString = 'TIM'
		case(AxisName_BAL)
			AxisName_toString = 'BAL'
		case(AxisName_ANT)
			AxisName_toString = 'ANT'
		case(AxisName_BAB)
			AxisName_toString = 'BAB'
		case(AxisName_SPW)
			AxisName_toString = 'SPW'
		case(AxisName_SIB)
			AxisName_toString = 'SIB'
		case(AxisName_SUB)
			AxisName_toString = 'SUB'
		case(AxisName_BIN)
			AxisName_toString = 'BIN'
		case(AxisName_APC)
			AxisName_toString = 'APC'
		case(AxisName_SPP)
			AxisName_toString = 'SPP'
		case(AxisName_POL)
			AxisName_toString = 'POL'
		case(AxisName_STO)
			AxisName_toString = 'STO'
		case(AxisName_HOL)
			AxisName_toString = 'HOL'
		end select
	end function AxisName_toString

!
	function AxisName_fromString(str)
		integer :: AxisName_fromString
		character*80 :: str
		select case(str)
		case('TIM')
			AxisName_fromString = AxisName_TIM
		case('BAL')
			AxisName_fromString = AxisName_BAL
		case('ANT')
			AxisName_fromString = AxisName_ANT
		case('BAB')
			AxisName_fromString = AxisName_BAB
		case('SPW')
			AxisName_fromString = AxisName_SPW
		case('SIB')
			AxisName_fromString = AxisName_SIB
		case('SUB')
			AxisName_fromString = AxisName_SUB
		case('BIN')
			AxisName_fromString = AxisName_BIN
		case('APC')
			AxisName_fromString = AxisName_APC
		case('SPP')
			AxisName_fromString = AxisName_SPP
		case('POL')
			AxisName_fromString = AxisName_POL
		case('STO')
			AxisName_fromString = AxisName_STO
		case('HOL')
			AxisName_fromString = AxisName_HOL
		end select
	end function AxisName_fromString



!
	function BasebandName_toString(i)
		integer :: i
		character*80 :: BasebandName_toString
		select case(i)
		case(BasebandName_NOBB)
			BasebandName_toString = 'NOBB'
		case(BasebandName_BB_1)
			BasebandName_toString = 'BB_1'
		case(BasebandName_BB_2)
			BasebandName_toString = 'BB_2'
		case(BasebandName_BB_3)
			BasebandName_toString = 'BB_3'
		case(BasebandName_BB_4)
			BasebandName_toString = 'BB_4'
		case(BasebandName_BB_5)
			BasebandName_toString = 'BB_5'
		case(BasebandName_BB_6)
			BasebandName_toString = 'BB_6'
		case(BasebandName_BB_7)
			BasebandName_toString = 'BB_7'
		case(BasebandName_BB_8)
			BasebandName_toString = 'BB_8'
		case(BasebandName_BB_ALL)
			BasebandName_toString = 'BB_ALL'
		case(BasebandName_A1C1_3BIT)
			BasebandName_toString = 'A1C1_3BIT'
		case(BasebandName_A2C2_3BIT)
			BasebandName_toString = 'A2C2_3BIT'
		case(BasebandName_AC_8BIT)
			BasebandName_toString = 'AC_8BIT'
		case(BasebandName_B1D1_3BIT)
			BasebandName_toString = 'B1D1_3BIT'
		case(BasebandName_B2D2_3BIT)
			BasebandName_toString = 'B2D2_3BIT'
		case(BasebandName_BD_8BIT)
			BasebandName_toString = 'BD_8BIT'
		end select
	end function BasebandName_toString

!
	function BasebandName_fromString(str)
		integer :: BasebandName_fromString
		character*80 :: str
		select case(str)
		case('NOBB')
			BasebandName_fromString = BasebandName_NOBB
		case('BB_1')
			BasebandName_fromString = BasebandName_BB_1
		case('BB_2')
			BasebandName_fromString = BasebandName_BB_2
		case('BB_3')
			BasebandName_fromString = BasebandName_BB_3
		case('BB_4')
			BasebandName_fromString = BasebandName_BB_4
		case('BB_5')
			BasebandName_fromString = BasebandName_BB_5
		case('BB_6')
			BasebandName_fromString = BasebandName_BB_6
		case('BB_7')
			BasebandName_fromString = BasebandName_BB_7
		case('BB_8')
			BasebandName_fromString = BasebandName_BB_8
		case('BB_ALL')
			BasebandName_fromString = BasebandName_BB_ALL
		case('A1C1_3BIT')
			BasebandName_fromString = BasebandName_A1C1_3BIT
		case('A2C2_3BIT')
			BasebandName_fromString = BasebandName_A2C2_3BIT
		case('AC_8BIT')
			BasebandName_fromString = BasebandName_AC_8BIT
		case('B1D1_3BIT')
			BasebandName_fromString = BasebandName_B1D1_3BIT
		case('B2D2_3BIT')
			BasebandName_fromString = BasebandName_B2D2_3BIT
		case('BD_8BIT')
			BasebandName_fromString = BasebandName_BD_8BIT
		end select
	end function BasebandName_fromString



!
	function BaselineReferenceCode_toString(i)
		integer :: i
		character*80 :: BaselineReferenceCode_toString
		select case(i)
		case(BaselineReferenceCode_J2000)
			BaselineReferenceCode_toString = 'J2000'
		case(BaselineReferenceCode_B1950)
			BaselineReferenceCode_toString = 'B1950'
		case(BaselineReferenceCode_GALACTIC)
			BaselineReferenceCode_toString = 'GALACTIC'
		case(BaselineReferenceCode_SUPERGAL)
			BaselineReferenceCode_toString = 'SUPERGAL'
		case(BaselineReferenceCode_ECLIPTIC)
			BaselineReferenceCode_toString = 'ECLIPTIC'
		case(BaselineReferenceCode_JMEAN)
			BaselineReferenceCode_toString = 'JMEAN'
		case(BaselineReferenceCode_JTRUE)
			BaselineReferenceCode_toString = 'JTRUE'
		case(BaselineReferenceCode_APP)
			BaselineReferenceCode_toString = 'APP'
		case(BaselineReferenceCode_BMEAN)
			BaselineReferenceCode_toString = 'BMEAN'
		case(BaselineReferenceCode_BTRUE)
			BaselineReferenceCode_toString = 'BTRUE'
		case(BaselineReferenceCode_JNAT)
			BaselineReferenceCode_toString = 'JNAT'
		case(BaselineReferenceCode_MECLIPTIC)
			BaselineReferenceCode_toString = 'MECLIPTIC'
		case(BaselineReferenceCode_TECLIPTIC)
			BaselineReferenceCode_toString = 'TECLIPTIC'
		case(BaselineReferenceCode_TOPO)
			BaselineReferenceCode_toString = 'TOPO'
		case(BaselineReferenceCode_MERCURY)
			BaselineReferenceCode_toString = 'MERCURY'
		case(BaselineReferenceCode_VENUS)
			BaselineReferenceCode_toString = 'VENUS'
		case(BaselineReferenceCode_MARS)
			BaselineReferenceCode_toString = 'MARS'
		case(BaselineReferenceCode_JUPITER)
			BaselineReferenceCode_toString = 'JUPITER'
		case(BaselineReferenceCode_SATURN)
			BaselineReferenceCode_toString = 'SATURN'
		case(BaselineReferenceCode_NEPTUN)
			BaselineReferenceCode_toString = 'NEPTUN'
		case(BaselineReferenceCode_SUN)
			BaselineReferenceCode_toString = 'SUN'
		case(BaselineReferenceCode_MOON)
			BaselineReferenceCode_toString = 'MOON'
		case(BaselineReferenceCode_HADEC)
			BaselineReferenceCode_toString = 'HADEC'
		case(BaselineReferenceCode_AZEL)
			BaselineReferenceCode_toString = 'AZEL'
		case(BaselineReferenceCode_AZELGEO)
			BaselineReferenceCode_toString = 'AZELGEO'
		case(BaselineReferenceCode_AZELSW)
			BaselineReferenceCode_toString = 'AZELSW'
		case(BaselineReferenceCode_AZELNE)
			BaselineReferenceCode_toString = 'AZELNE'
		case(BaselineReferenceCode_ITRF)
			BaselineReferenceCode_toString = 'ITRF'
		end select
	end function BaselineReferenceCode_toString

!
	function BaselineReferenceCode_fromString(str)
		integer :: BaselineReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('J2000')
			BaselineReferenceCode_fromString = BaselineReferenceCode_J2000
		case('B1950')
			BaselineReferenceCode_fromString = BaselineReferenceCode_B1950
		case('GALACTIC')
			BaselineReferenceCode_fromString = BaselineReferenceCode_GALACTIC
		case('SUPERGAL')
			BaselineReferenceCode_fromString = BaselineReferenceCode_SUPERGAL
		case('ECLIPTIC')
			BaselineReferenceCode_fromString = BaselineReferenceCode_ECLIPTIC
		case('JMEAN')
			BaselineReferenceCode_fromString = BaselineReferenceCode_JMEAN
		case('JTRUE')
			BaselineReferenceCode_fromString = BaselineReferenceCode_JTRUE
		case('APP')
			BaselineReferenceCode_fromString = BaselineReferenceCode_APP
		case('BMEAN')
			BaselineReferenceCode_fromString = BaselineReferenceCode_BMEAN
		case('BTRUE')
			BaselineReferenceCode_fromString = BaselineReferenceCode_BTRUE
		case('JNAT')
			BaselineReferenceCode_fromString = BaselineReferenceCode_JNAT
		case('MECLIPTIC')
			BaselineReferenceCode_fromString = BaselineReferenceCode_MECLIPTIC
		case('TECLIPTIC')
			BaselineReferenceCode_fromString = BaselineReferenceCode_TECLIPTIC
		case('TOPO')
			BaselineReferenceCode_fromString = BaselineReferenceCode_TOPO
		case('MERCURY')
			BaselineReferenceCode_fromString = BaselineReferenceCode_MERCURY
		case('VENUS')
			BaselineReferenceCode_fromString = BaselineReferenceCode_VENUS
		case('MARS')
			BaselineReferenceCode_fromString = BaselineReferenceCode_MARS
		case('JUPITER')
			BaselineReferenceCode_fromString = BaselineReferenceCode_JUPITER
		case('SATURN')
			BaselineReferenceCode_fromString = BaselineReferenceCode_SATURN
		case('NEPTUN')
			BaselineReferenceCode_fromString = BaselineReferenceCode_NEPTUN
		case('SUN')
			BaselineReferenceCode_fromString = BaselineReferenceCode_SUN
		case('MOON')
			BaselineReferenceCode_fromString = BaselineReferenceCode_MOON
		case('HADEC')
			BaselineReferenceCode_fromString = BaselineReferenceCode_HADEC
		case('AZEL')
			BaselineReferenceCode_fromString = BaselineReferenceCode_AZEL
		case('AZELGEO')
			BaselineReferenceCode_fromString = BaselineReferenceCode_AZELGEO
		case('AZELSW')
			BaselineReferenceCode_fromString = BaselineReferenceCode_AZELSW
		case('AZELNE')
			BaselineReferenceCode_fromString = BaselineReferenceCode_AZELNE
		case('ITRF')
			BaselineReferenceCode_fromString = BaselineReferenceCode_ITRF
		end select
	end function BaselineReferenceCode_fromString



!
	function BinaryDataFlags_toString(i)
		integer :: i
		character*80 :: BinaryDataFlags_toString
		select case(i)
		case(BinaryDataFlags_INTEGRATION_FULLY_BLANKED)
			BinaryDataFlags_toString = 'INTEGRATION_FULLY_BLANKED'
		case(BinaryDataFlags_WVR_APC)
			BinaryDataFlags_toString = 'WVR_APC'
		case(BinaryDataFlags_CORRELATOR_MISSING_STATUS)
			BinaryDataFlags_toString = 'CORRELATOR_MISSING_STATUS'
		case(BinaryDataFlags_MISSING_ANTENNA_EVENT)
			BinaryDataFlags_toString = 'MISSING_ANTENNA_EVENT'
		case(BinaryDataFlags_DELTA_SIGMA_OVERFLOW)
			BinaryDataFlags_toString = 'DELTA_SIGMA_OVERFLOW'
		case(BinaryDataFlags_DELAY_CORRECTION_NOT_APPLIED)
			BinaryDataFlags_toString = 'DELAY_CORRECTION_NOT_APPLIED'
		case(BinaryDataFlags_SYNCRONIZATION_ERROR)
			BinaryDataFlags_toString = 'SYNCRONIZATION_ERROR'
		case(BinaryDataFlags_FFT_OVERFLOW)
			BinaryDataFlags_toString = 'FFT_OVERFLOW'
		case(BinaryDataFlags_TFB_SCALING_FACTOR_NOT_RETRIEVED)
			BinaryDataFlags_toString = 'TFB_SCALING_FACTOR_NOT_RETRIEVED'
		case(BinaryDataFlags_ZERO_LAG_NOT_RECEIVED)
			BinaryDataFlags_toString = 'ZERO_LAG_NOT_RECEIVED'
		case(BinaryDataFlags_SIGMA_OVERFLOW)
			BinaryDataFlags_toString = 'SIGMA_OVERFLOW'
		case(BinaryDataFlags_UNUSABLE_CAI_OUTPUT)
			BinaryDataFlags_toString = 'UNUSABLE_CAI_OUTPUT'
		case(BinaryDataFlags_QC_FAILED)
			BinaryDataFlags_toString = 'QC_FAILED'
		case(BinaryDataFlags_NOISY_TDM_CHANNELS)
			BinaryDataFlags_toString = 'NOISY_TDM_CHANNELS'
		case(BinaryDataFlags_SPECTRAL_NORMALIZATION_FAILED)
			BinaryDataFlags_toString = 'SPECTRAL_NORMALIZATION_FAILED'
		case(BinaryDataFlags_DROPPED_PACKETS)
			BinaryDataFlags_toString = 'DROPPED_PACKETS'
		case(BinaryDataFlags_DETECTOR_SATURATED)
			BinaryDataFlags_toString = 'DETECTOR_SATURATED'
		case(BinaryDataFlags_NO_DATA_FROM_DIGITAL_POWER_METER)
			BinaryDataFlags_toString = 'NO_DATA_FROM_DIGITAL_POWER_METER'
		case(BinaryDataFlags_RESERVED_18)
			BinaryDataFlags_toString = 'RESERVED_18'
		case(BinaryDataFlags_RESERVED_19)
			BinaryDataFlags_toString = 'RESERVED_19'
		case(BinaryDataFlags_RESERVED_20)
			BinaryDataFlags_toString = 'RESERVED_20'
		case(BinaryDataFlags_RESERVED_21)
			BinaryDataFlags_toString = 'RESERVED_21'
		case(BinaryDataFlags_RESERVED_22)
			BinaryDataFlags_toString = 'RESERVED_22'
		case(BinaryDataFlags_RESERVED_23)
			BinaryDataFlags_toString = 'RESERVED_23'
		case(BinaryDataFlags_RESERVED_24)
			BinaryDataFlags_toString = 'RESERVED_24'
		case(BinaryDataFlags_RESERVED_25)
			BinaryDataFlags_toString = 'RESERVED_25'
		case(BinaryDataFlags_RESERVED_26)
			BinaryDataFlags_toString = 'RESERVED_26'
		case(BinaryDataFlags_RESERVED_27)
			BinaryDataFlags_toString = 'RESERVED_27'
		case(BinaryDataFlags_RESERVED_28)
			BinaryDataFlags_toString = 'RESERVED_28'
		case(BinaryDataFlags_RESERVED_29)
			BinaryDataFlags_toString = 'RESERVED_29'
		case(BinaryDataFlags_RESERVED_30)
			BinaryDataFlags_toString = 'RESERVED_30'
		case(BinaryDataFlags_ALL_PURPOSE_ERROR)
			BinaryDataFlags_toString = 'ALL_PURPOSE_ERROR'
		end select
	end function BinaryDataFlags_toString

!
	function BinaryDataFlags_fromString(str)
		integer :: BinaryDataFlags_fromString
		character*80 :: str
		select case(str)
		case('INTEGRATION_FULLY_BLANKED')
			BinaryDataFlags_fromString = BinaryDataFlags_INTEGRATION_FULLY_BLANKED
		case('WVR_APC')
			BinaryDataFlags_fromString = BinaryDataFlags_WVR_APC
		case('CORRELATOR_MISSING_STATUS')
			BinaryDataFlags_fromString = BinaryDataFlags_CORRELATOR_MISSING_STATUS
		case('MISSING_ANTENNA_EVENT')
			BinaryDataFlags_fromString = BinaryDataFlags_MISSING_ANTENNA_EVENT
		case('DELTA_SIGMA_OVERFLOW')
			BinaryDataFlags_fromString = BinaryDataFlags_DELTA_SIGMA_OVERFLOW
		case('DELAY_CORRECTION_NOT_APPLIED')
			BinaryDataFlags_fromString = BinaryDataFlags_DELAY_CORRECTION_NOT_APPLIED
		case('SYNCRONIZATION_ERROR')
			BinaryDataFlags_fromString = BinaryDataFlags_SYNCRONIZATION_ERROR
		case('FFT_OVERFLOW')
			BinaryDataFlags_fromString = BinaryDataFlags_FFT_OVERFLOW
		case('TFB_SCALING_FACTOR_NOT_RETRIEVED')
			BinaryDataFlags_fromString = BinaryDataFlags_TFB_SCALING_FACTOR_NOT_RETRIEVED
		case('ZERO_LAG_NOT_RECEIVED')
			BinaryDataFlags_fromString = BinaryDataFlags_ZERO_LAG_NOT_RECEIVED
		case('SIGMA_OVERFLOW')
			BinaryDataFlags_fromString = BinaryDataFlags_SIGMA_OVERFLOW
		case('UNUSABLE_CAI_OUTPUT')
			BinaryDataFlags_fromString = BinaryDataFlags_UNUSABLE_CAI_OUTPUT
		case('QC_FAILED')
			BinaryDataFlags_fromString = BinaryDataFlags_QC_FAILED
		case('NOISY_TDM_CHANNELS')
			BinaryDataFlags_fromString = BinaryDataFlags_NOISY_TDM_CHANNELS
		case('SPECTRAL_NORMALIZATION_FAILED')
			BinaryDataFlags_fromString = BinaryDataFlags_SPECTRAL_NORMALIZATION_FAILED
		case('DROPPED_PACKETS')
			BinaryDataFlags_fromString = BinaryDataFlags_DROPPED_PACKETS
		case('DETECTOR_SATURATED')
			BinaryDataFlags_fromString = BinaryDataFlags_DETECTOR_SATURATED
		case('NO_DATA_FROM_DIGITAL_POWER_METER')
			BinaryDataFlags_fromString = BinaryDataFlags_NO_DATA_FROM_DIGITAL_POWER_METER
		case('RESERVED_18')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_18
		case('RESERVED_19')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_19
		case('RESERVED_20')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_20
		case('RESERVED_21')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_21
		case('RESERVED_22')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_22
		case('RESERVED_23')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_23
		case('RESERVED_24')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_24
		case('RESERVED_25')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_25
		case('RESERVED_26')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_26
		case('RESERVED_27')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_27
		case('RESERVED_28')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_28
		case('RESERVED_29')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_29
		case('RESERVED_30')
			BinaryDataFlags_fromString = BinaryDataFlags_RESERVED_30
		case('ALL_PURPOSE_ERROR')
			BinaryDataFlags_fromString = BinaryDataFlags_ALL_PURPOSE_ERROR
		end select
	end function BinaryDataFlags_fromString



!
	function CalCurveType_toString(i)
		integer :: i
		character*80 :: CalCurveType_toString
		select case(i)
		case(CalCurveType_AMPLITUDE)
			CalCurveType_toString = 'AMPLITUDE'
		case(CalCurveType_PHASE)
			CalCurveType_toString = 'PHASE'
		case(CalCurveType_UNDEFINED)
			CalCurveType_toString = 'UNDEFINED'
		end select
	end function CalCurveType_toString

!
	function CalCurveType_fromString(str)
		integer :: CalCurveType_fromString
		character*80 :: str
		select case(str)
		case('AMPLITUDE')
			CalCurveType_fromString = CalCurveType_AMPLITUDE
		case('PHASE')
			CalCurveType_fromString = CalCurveType_PHASE
		case('UNDEFINED')
			CalCurveType_fromString = CalCurveType_UNDEFINED
		end select
	end function CalCurveType_fromString



!
	function CalDataOrigin_toString(i)
		integer :: i
		character*80 :: CalDataOrigin_toString
		select case(i)
		case(CalDataOrigin_TOTAL_POWER)
			CalDataOrigin_toString = 'TOTAL_POWER'
		case(CalDataOrigin_WVR)
			CalDataOrigin_toString = 'WVR'
		case(CalDataOrigin_CHANNEL_AVERAGE_AUTO)
			CalDataOrigin_toString = 'CHANNEL_AVERAGE_AUTO'
		case(CalDataOrigin_CHANNEL_AVERAGE_CROSS)
			CalDataOrigin_toString = 'CHANNEL_AVERAGE_CROSS'
		case(CalDataOrigin_FULL_RESOLUTION_AUTO)
			CalDataOrigin_toString = 'FULL_RESOLUTION_AUTO'
		case(CalDataOrigin_FULL_RESOLUTION_CROSS)
			CalDataOrigin_toString = 'FULL_RESOLUTION_CROSS'
		case(CalDataOrigin_OPTICAL_POINTING)
			CalDataOrigin_toString = 'OPTICAL_POINTING'
		case(CalDataOrigin_HOLOGRAPHY)
			CalDataOrigin_toString = 'HOLOGRAPHY'
		case(CalDataOrigin_NONE)
			CalDataOrigin_toString = 'NONE'
		end select
	end function CalDataOrigin_toString

!
	function CalDataOrigin_fromString(str)
		integer :: CalDataOrigin_fromString
		character*80 :: str
		select case(str)
		case('TOTAL_POWER')
			CalDataOrigin_fromString = CalDataOrigin_TOTAL_POWER
		case('WVR')
			CalDataOrigin_fromString = CalDataOrigin_WVR
		case('CHANNEL_AVERAGE_AUTO')
			CalDataOrigin_fromString = CalDataOrigin_CHANNEL_AVERAGE_AUTO
		case('CHANNEL_AVERAGE_CROSS')
			CalDataOrigin_fromString = CalDataOrigin_CHANNEL_AVERAGE_CROSS
		case('FULL_RESOLUTION_AUTO')
			CalDataOrigin_fromString = CalDataOrigin_FULL_RESOLUTION_AUTO
		case('FULL_RESOLUTION_CROSS')
			CalDataOrigin_fromString = CalDataOrigin_FULL_RESOLUTION_CROSS
		case('OPTICAL_POINTING')
			CalDataOrigin_fromString = CalDataOrigin_OPTICAL_POINTING
		case('HOLOGRAPHY')
			CalDataOrigin_fromString = CalDataOrigin_HOLOGRAPHY
		case('NONE')
			CalDataOrigin_fromString = CalDataOrigin_NONE
		end select
	end function CalDataOrigin_fromString



!
	function CalibrationDevice_toString(i)
		integer :: i
		character*80 :: CalibrationDevice_toString
		select case(i)
		case(CalibrationDevice_AMBIENT_LOAD)
			CalibrationDevice_toString = 'AMBIENT_LOAD'
		case(CalibrationDevice_COLD_LOAD)
			CalibrationDevice_toString = 'COLD_LOAD'
		case(CalibrationDevice_HOT_LOAD)
			CalibrationDevice_toString = 'HOT_LOAD'
		case(CalibrationDevice_NOISE_TUBE_LOAD)
			CalibrationDevice_toString = 'NOISE_TUBE_LOAD'
		case(CalibrationDevice_QUARTER_WAVE_PLATE)
			CalibrationDevice_toString = 'QUARTER_WAVE_PLATE'
		case(CalibrationDevice_SOLAR_FILTER)
			CalibrationDevice_toString = 'SOLAR_FILTER'
		case(CalibrationDevice_NONE)
			CalibrationDevice_toString = 'NONE'
		end select
	end function CalibrationDevice_toString

!
	function CalibrationDevice_fromString(str)
		integer :: CalibrationDevice_fromString
		character*80 :: str
		select case(str)
		case('AMBIENT_LOAD')
			CalibrationDevice_fromString = CalibrationDevice_AMBIENT_LOAD
		case('COLD_LOAD')
			CalibrationDevice_fromString = CalibrationDevice_COLD_LOAD
		case('HOT_LOAD')
			CalibrationDevice_fromString = CalibrationDevice_HOT_LOAD
		case('NOISE_TUBE_LOAD')
			CalibrationDevice_fromString = CalibrationDevice_NOISE_TUBE_LOAD
		case('QUARTER_WAVE_PLATE')
			CalibrationDevice_fromString = CalibrationDevice_QUARTER_WAVE_PLATE
		case('SOLAR_FILTER')
			CalibrationDevice_fromString = CalibrationDevice_SOLAR_FILTER
		case('NONE')
			CalibrationDevice_fromString = CalibrationDevice_NONE
		end select
	end function CalibrationDevice_fromString



!
	function CalibrationFunction_toString(i)
		integer :: i
		character*80 :: CalibrationFunction_toString
		select case(i)
		case(CalibrationFunction_FIRST)
			CalibrationFunction_toString = 'FIRST'
		case(CalibrationFunction_LAST)
			CalibrationFunction_toString = 'LAST'
		case(CalibrationFunction_UNSPECIFIED)
			CalibrationFunction_toString = 'UNSPECIFIED'
		end select
	end function CalibrationFunction_toString

!
	function CalibrationFunction_fromString(str)
		integer :: CalibrationFunction_fromString
		character*80 :: str
		select case(str)
		case('FIRST')
			CalibrationFunction_fromString = CalibrationFunction_FIRST
		case('LAST')
			CalibrationFunction_fromString = CalibrationFunction_LAST
		case('UNSPECIFIED')
			CalibrationFunction_fromString = CalibrationFunction_UNSPECIFIED
		end select
	end function CalibrationFunction_fromString



!
	function CalibrationMode_toString(i)
		integer :: i
		character*80 :: CalibrationMode_toString
		select case(i)
		case(CalibrationMode_HOLOGRAPHY)
			CalibrationMode_toString = 'HOLOGRAPHY'
		case(CalibrationMode_INTERFEROMETRY)
			CalibrationMode_toString = 'INTERFEROMETRY'
		case(CalibrationMode_OPTICAL)
			CalibrationMode_toString = 'OPTICAL'
		case(CalibrationMode_RADIOMETRY)
			CalibrationMode_toString = 'RADIOMETRY'
		case(CalibrationMode_WVR)
			CalibrationMode_toString = 'WVR'
		end select
	end function CalibrationMode_toString

!
	function CalibrationMode_fromString(str)
		integer :: CalibrationMode_fromString
		character*80 :: str
		select case(str)
		case('HOLOGRAPHY')
			CalibrationMode_fromString = CalibrationMode_HOLOGRAPHY
		case('INTERFEROMETRY')
			CalibrationMode_fromString = CalibrationMode_INTERFEROMETRY
		case('OPTICAL')
			CalibrationMode_fromString = CalibrationMode_OPTICAL
		case('RADIOMETRY')
			CalibrationMode_fromString = CalibrationMode_RADIOMETRY
		case('WVR')
			CalibrationMode_fromString = CalibrationMode_WVR
		end select
	end function CalibrationMode_fromString



!
	function CalibrationSet_toString(i)
		integer :: i
		character*80 :: CalibrationSet_toString
		select case(i)
		case(CalibrationSet_NONE)
			CalibrationSet_toString = 'NONE'
		case(CalibrationSet_AMPLI_CURVE)
			CalibrationSet_toString = 'AMPLI_CURVE'
		case(CalibrationSet_ANTENNA_POSITIONS)
			CalibrationSet_toString = 'ANTENNA_POSITIONS'
		case(CalibrationSet_PHASE_CURVE)
			CalibrationSet_toString = 'PHASE_CURVE'
		case(CalibrationSet_POINTING_MODEL)
			CalibrationSet_toString = 'POINTING_MODEL'
		case(CalibrationSet_ACCUMULATE)
			CalibrationSet_toString = 'ACCUMULATE'
		case(CalibrationSet_TEST)
			CalibrationSet_toString = 'TEST'
		case(CalibrationSet_UNSPECIFIED)
			CalibrationSet_toString = 'UNSPECIFIED'
		end select
	end function CalibrationSet_toString

!
	function CalibrationSet_fromString(str)
		integer :: CalibrationSet_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			CalibrationSet_fromString = CalibrationSet_NONE
		case('AMPLI_CURVE')
			CalibrationSet_fromString = CalibrationSet_AMPLI_CURVE
		case('ANTENNA_POSITIONS')
			CalibrationSet_fromString = CalibrationSet_ANTENNA_POSITIONS
		case('PHASE_CURVE')
			CalibrationSet_fromString = CalibrationSet_PHASE_CURVE
		case('POINTING_MODEL')
			CalibrationSet_fromString = CalibrationSet_POINTING_MODEL
		case('ACCUMULATE')
			CalibrationSet_fromString = CalibrationSet_ACCUMULATE
		case('TEST')
			CalibrationSet_fromString = CalibrationSet_TEST
		case('UNSPECIFIED')
			CalibrationSet_fromString = CalibrationSet_UNSPECIFIED
		end select
	end function CalibrationSet_fromString



!
	function CalType_toString(i)
		integer :: i
		character*80 :: CalType_toString
		select case(i)
		case(CalType_CAL_AMPLI)
			CalType_toString = 'CAL_AMPLI'
		case(CalType_CAL_ATMOSPHERE)
			CalType_toString = 'CAL_ATMOSPHERE'
		case(CalType_CAL_BANDPASS)
			CalType_toString = 'CAL_BANDPASS'
		case(CalType_CAL_CURVE)
			CalType_toString = 'CAL_CURVE'
		case(CalType_CAL_DELAY)
			CalType_toString = 'CAL_DELAY'
		case(CalType_CAL_FLUX)
			CalType_toString = 'CAL_FLUX'
		case(CalType_CAL_FOCUS)
			CalType_toString = 'CAL_FOCUS'
		case(CalType_CAL_FOCUS_MODEL)
			CalType_toString = 'CAL_FOCUS_MODEL'
		case(CalType_CAL_GAIN)
			CalType_toString = 'CAL_GAIN'
		case(CalType_CAL_HOLOGRAPHY)
			CalType_toString = 'CAL_HOLOGRAPHY'
		case(CalType_CAL_PHASE)
			CalType_toString = 'CAL_PHASE'
		case(CalType_CAL_POINTING)
			CalType_toString = 'CAL_POINTING'
		case(CalType_CAL_POINTING_MODEL)
			CalType_toString = 'CAL_POINTING_MODEL'
		case(CalType_CAL_POSITION)
			CalType_toString = 'CAL_POSITION'
		case(CalType_CAL_PRIMARY_BEAM)
			CalType_toString = 'CAL_PRIMARY_BEAM'
		case(CalType_CAL_SEEING)
			CalType_toString = 'CAL_SEEING'
		case(CalType_CAL_WVR)
			CalType_toString = 'CAL_WVR'
		case(CalType_CAL_APPPHASE)
			CalType_toString = 'CAL_APPPHASE'
		end select
	end function CalType_toString

!
	function CalType_fromString(str)
		integer :: CalType_fromString
		character*80 :: str
		select case(str)
		case('CAL_AMPLI')
			CalType_fromString = CalType_CAL_AMPLI
		case('CAL_ATMOSPHERE')
			CalType_fromString = CalType_CAL_ATMOSPHERE
		case('CAL_BANDPASS')
			CalType_fromString = CalType_CAL_BANDPASS
		case('CAL_CURVE')
			CalType_fromString = CalType_CAL_CURVE
		case('CAL_DELAY')
			CalType_fromString = CalType_CAL_DELAY
		case('CAL_FLUX')
			CalType_fromString = CalType_CAL_FLUX
		case('CAL_FOCUS')
			CalType_fromString = CalType_CAL_FOCUS
		case('CAL_FOCUS_MODEL')
			CalType_fromString = CalType_CAL_FOCUS_MODEL
		case('CAL_GAIN')
			CalType_fromString = CalType_CAL_GAIN
		case('CAL_HOLOGRAPHY')
			CalType_fromString = CalType_CAL_HOLOGRAPHY
		case('CAL_PHASE')
			CalType_fromString = CalType_CAL_PHASE
		case('CAL_POINTING')
			CalType_fromString = CalType_CAL_POINTING
		case('CAL_POINTING_MODEL')
			CalType_fromString = CalType_CAL_POINTING_MODEL
		case('CAL_POSITION')
			CalType_fromString = CalType_CAL_POSITION
		case('CAL_PRIMARY_BEAM')
			CalType_fromString = CalType_CAL_PRIMARY_BEAM
		case('CAL_SEEING')
			CalType_fromString = CalType_CAL_SEEING
		case('CAL_WVR')
			CalType_fromString = CalType_CAL_WVR
		case('CAL_APPPHASE')
			CalType_fromString = CalType_CAL_APPPHASE
		end select
	end function CalType_fromString



!
	function CorrelationBit_toString(i)
		integer :: i
		character*80 :: CorrelationBit_toString
		select case(i)
		case(CorrelationBit_BITS_2x2)
			CorrelationBit_toString = 'BITS_2x2'
		case(CorrelationBit_BITS_3x3)
			CorrelationBit_toString = 'BITS_3x3'
		case(CorrelationBit_BITS_4x4)
			CorrelationBit_toString = 'BITS_4x4'
		end select
	end function CorrelationBit_toString

!
	function CorrelationBit_fromString(str)
		integer :: CorrelationBit_fromString
		character*80 :: str
		select case(str)
		case('BITS_2x2')
			CorrelationBit_fromString = CorrelationBit_BITS_2x2
		case('BITS_3x3')
			CorrelationBit_fromString = CorrelationBit_BITS_3x3
		case('BITS_4x4')
			CorrelationBit_fromString = CorrelationBit_BITS_4x4
		end select
	end function CorrelationBit_fromString



!
	function CorrelationMode_toString(i)
		integer :: i
		character*80 :: CorrelationMode_toString
		select case(i)
		case(CorrelationMode_CROSS_ONLY)
			CorrelationMode_toString = 'CROSS_ONLY'
		case(CorrelationMode_AUTO_ONLY)
			CorrelationMode_toString = 'AUTO_ONLY'
		case(CorrelationMode_CROSS_AND_AUTO)
			CorrelationMode_toString = 'CROSS_AND_AUTO'
		end select
	end function CorrelationMode_toString

!
	function CorrelationMode_fromString(str)
		integer :: CorrelationMode_fromString
		character*80 :: str
		select case(str)
		case('CROSS_ONLY')
			CorrelationMode_fromString = CorrelationMode_CROSS_ONLY
		case('AUTO_ONLY')
			CorrelationMode_fromString = CorrelationMode_AUTO_ONLY
		case('CROSS_AND_AUTO')
			CorrelationMode_fromString = CorrelationMode_CROSS_AND_AUTO
		end select
	end function CorrelationMode_fromString



!
	function CorrelatorCalibration_toString(i)
		integer :: i
		character*80 :: CorrelatorCalibration_toString
		select case(i)
		case(CorrelatorCalibration_NONE)
			CorrelatorCalibration_toString = 'NONE'
		case(CorrelatorCalibration_CORRELATOR_CALIBRATION)
			CorrelatorCalibration_toString = 'CORRELATOR_CALIBRATION'
		case(CorrelatorCalibration_REAL_OBSERVATION)
			CorrelatorCalibration_toString = 'REAL_OBSERVATION'
		end select
	end function CorrelatorCalibration_toString

!
	function CorrelatorCalibration_fromString(str)
		integer :: CorrelatorCalibration_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			CorrelatorCalibration_fromString = CorrelatorCalibration_NONE
		case('CORRELATOR_CALIBRATION')
			CorrelatorCalibration_fromString = CorrelatorCalibration_CORRELATOR_CALIBRATION
		case('REAL_OBSERVATION')
			CorrelatorCalibration_fromString = CorrelatorCalibration_REAL_OBSERVATION
		end select
	end function CorrelatorCalibration_fromString



!
	function CorrelatorName_toString(i)
		integer :: i
		character*80 :: CorrelatorName_toString
		select case(i)
		case(CorrelatorName_ALMA_ACA)
			CorrelatorName_toString = 'ALMA_ACA'
		case(CorrelatorName_ALMA_BASELINE)
			CorrelatorName_toString = 'ALMA_BASELINE'
		case(CorrelatorName_ALMA_BASELINE_ATF)
			CorrelatorName_toString = 'ALMA_BASELINE_ATF'
		case(CorrelatorName_ALMA_BASELINE_PROTO_OSF)
			CorrelatorName_toString = 'ALMA_BASELINE_PROTO_OSF'
		case(CorrelatorName_HERSCHEL)
			CorrelatorName_toString = 'HERSCHEL'
		case(CorrelatorName_IRAM_PDB)
			CorrelatorName_toString = 'IRAM_PDB'
		case(CorrelatorName_IRAM_30M_VESPA)
			CorrelatorName_toString = 'IRAM_30M_VESPA'
		case(CorrelatorName_IRAM_WILMA)
			CorrelatorName_toString = 'IRAM_WILMA'
		case(CorrelatorName_NRAO_VLA)
			CorrelatorName_toString = 'NRAO_VLA'
		case(CorrelatorName_NRAO_WIDAR)
			CorrelatorName_toString = 'NRAO_WIDAR'
		end select
	end function CorrelatorName_toString

!
	function CorrelatorName_fromString(str)
		integer :: CorrelatorName_fromString
		character*80 :: str
		select case(str)
		case('ALMA_ACA')
			CorrelatorName_fromString = CorrelatorName_ALMA_ACA
		case('ALMA_BASELINE')
			CorrelatorName_fromString = CorrelatorName_ALMA_BASELINE
		case('ALMA_BASELINE_ATF')
			CorrelatorName_fromString = CorrelatorName_ALMA_BASELINE_ATF
		case('ALMA_BASELINE_PROTO_OSF')
			CorrelatorName_fromString = CorrelatorName_ALMA_BASELINE_PROTO_OSF
		case('HERSCHEL')
			CorrelatorName_fromString = CorrelatorName_HERSCHEL
		case('IRAM_PDB')
			CorrelatorName_fromString = CorrelatorName_IRAM_PDB
		case('IRAM_30M_VESPA')
			CorrelatorName_fromString = CorrelatorName_IRAM_30M_VESPA
		case('IRAM_WILMA')
			CorrelatorName_fromString = CorrelatorName_IRAM_WILMA
		case('NRAO_VLA')
			CorrelatorName_fromString = CorrelatorName_NRAO_VLA
		case('NRAO_WIDAR')
			CorrelatorName_fromString = CorrelatorName_NRAO_WIDAR
		end select
	end function CorrelatorName_fromString



!
	function CorrelatorType_toString(i)
		integer :: i
		character*80 :: CorrelatorType_toString
		select case(i)
		case(CorrelatorType_FX)
			CorrelatorType_toString = 'FX'
		case(CorrelatorType_XF)
			CorrelatorType_toString = 'XF'
		case(CorrelatorType_FXF)
			CorrelatorType_toString = 'FXF'
		end select
	end function CorrelatorType_toString

!
	function CorrelatorType_fromString(str)
		integer :: CorrelatorType_fromString
		character*80 :: str
		select case(str)
		case('FX')
			CorrelatorType_fromString = CorrelatorType_FX
		case('XF')
			CorrelatorType_fromString = CorrelatorType_XF
		case('FXF')
			CorrelatorType_fromString = CorrelatorType_FXF
		end select
	end function CorrelatorType_fromString



!
	function DataContent_toString(i)
		integer :: i
		character*80 :: DataContent_toString
		select case(i)
		case(DataContent_CROSS_DATA)
			DataContent_toString = 'CROSS_DATA'
		case(DataContent_AUTO_DATA)
			DataContent_toString = 'AUTO_DATA'
		case(DataContent_ZERO_LAGS)
			DataContent_toString = 'ZERO_LAGS'
		case(DataContent_ACTUAL_TIMES)
			DataContent_toString = 'ACTUAL_TIMES'
		case(DataContent_ACTUAL_DURATIONS)
			DataContent_toString = 'ACTUAL_DURATIONS'
		case(DataContent_WEIGHTS)
			DataContent_toString = 'WEIGHTS'
		case(DataContent_FLAGS)
			DataContent_toString = 'FLAGS'
		end select
	end function DataContent_toString

!
	function DataContent_fromString(str)
		integer :: DataContent_fromString
		character*80 :: str
		select case(str)
		case('CROSS_DATA')
			DataContent_fromString = DataContent_CROSS_DATA
		case('AUTO_DATA')
			DataContent_fromString = DataContent_AUTO_DATA
		case('ZERO_LAGS')
			DataContent_fromString = DataContent_ZERO_LAGS
		case('ACTUAL_TIMES')
			DataContent_fromString = DataContent_ACTUAL_TIMES
		case('ACTUAL_DURATIONS')
			DataContent_fromString = DataContent_ACTUAL_DURATIONS
		case('WEIGHTS')
			DataContent_fromString = DataContent_WEIGHTS
		case('FLAGS')
			DataContent_fromString = DataContent_FLAGS
		end select
	end function DataContent_fromString



!
	function DataScale_toString(i)
		integer :: i
		character*80 :: DataScale_toString
		select case(i)
		case(DataScale_K)
			DataScale_toString = 'K'
		case(DataScale_JY)
			DataScale_toString = 'JY'
		case(DataScale_CORRELATION)
			DataScale_toString = 'CORRELATION'
		case(DataScale_CORRELATION_COEFFICIENT)
			DataScale_toString = 'CORRELATION_COEFFICIENT'
		end select
	end function DataScale_toString

!
	function DataScale_fromString(str)
		integer :: DataScale_fromString
		character*80 :: str
		select case(str)
		case('K')
			DataScale_fromString = DataScale_K
		case('JY')
			DataScale_fromString = DataScale_JY
		case('CORRELATION')
			DataScale_fromString = DataScale_CORRELATION
		case('CORRELATION_COEFFICIENT')
			DataScale_fromString = DataScale_CORRELATION_COEFFICIENT
		end select
	end function DataScale_fromString



!
	function DetectorBandType_toString(i)
		integer :: i
		character*80 :: DetectorBandType_toString
		select case(i)
		case(DetectorBandType_BASEBAND)
			DetectorBandType_toString = 'BASEBAND'
		case(DetectorBandType_DOWN_CONVERTER)
			DetectorBandType_toString = 'DOWN_CONVERTER'
		case(DetectorBandType_HOLOGRAPHY_RECEIVER)
			DetectorBandType_toString = 'HOLOGRAPHY_RECEIVER'
		case(DetectorBandType_SUBBAND)
			DetectorBandType_toString = 'SUBBAND'
		end select
	end function DetectorBandType_toString

!
	function DetectorBandType_fromString(str)
		integer :: DetectorBandType_fromString
		character*80 :: str
		select case(str)
		case('BASEBAND')
			DetectorBandType_fromString = DetectorBandType_BASEBAND
		case('DOWN_CONVERTER')
			DetectorBandType_fromString = DetectorBandType_DOWN_CONVERTER
		case('HOLOGRAPHY_RECEIVER')
			DetectorBandType_fromString = DetectorBandType_HOLOGRAPHY_RECEIVER
		case('SUBBAND')
			DetectorBandType_fromString = DetectorBandType_SUBBAND
		end select
	end function DetectorBandType_fromString



!
	function DifferenceType_toString(i)
		integer :: i
		character*80 :: DifferenceType_toString
		select case(i)
		case(DifferenceType_PREDICTED)
			DifferenceType_toString = 'PREDICTED'
		case(DifferenceType_PRELIMINARY)
			DifferenceType_toString = 'PRELIMINARY'
		case(DifferenceType_RAPID)
			DifferenceType_toString = 'RAPID'
		case(DifferenceType_FINAL)
			DifferenceType_toString = 'FINAL'
		end select
	end function DifferenceType_toString

!
	function DifferenceType_fromString(str)
		integer :: DifferenceType_fromString
		character*80 :: str
		select case(str)
		case('PREDICTED')
			DifferenceType_fromString = DifferenceType_PREDICTED
		case('PRELIMINARY')
			DifferenceType_fromString = DifferenceType_PRELIMINARY
		case('RAPID')
			DifferenceType_fromString = DifferenceType_RAPID
		case('FINAL')
			DifferenceType_fromString = DifferenceType_FINAL
		end select
	end function DifferenceType_fromString



!
	function DirectionReferenceCode_toString(i)
		integer :: i
		character*80 :: DirectionReferenceCode_toString
		select case(i)
		case(DirectionReferenceCode_J2000)
			DirectionReferenceCode_toString = 'J2000'
		case(DirectionReferenceCode_JMEAN)
			DirectionReferenceCode_toString = 'JMEAN'
		case(DirectionReferenceCode_JTRUE)
			DirectionReferenceCode_toString = 'JTRUE'
		case(DirectionReferenceCode_APP)
			DirectionReferenceCode_toString = 'APP'
		case(DirectionReferenceCode_B1950)
			DirectionReferenceCode_toString = 'B1950'
		case(DirectionReferenceCode_B1950_VLA)
			DirectionReferenceCode_toString = 'B1950_VLA'
		case(DirectionReferenceCode_BMEAN)
			DirectionReferenceCode_toString = 'BMEAN'
		case(DirectionReferenceCode_BTRUE)
			DirectionReferenceCode_toString = 'BTRUE'
		case(DirectionReferenceCode_GALACTIC)
			DirectionReferenceCode_toString = 'GALACTIC'
		case(DirectionReferenceCode_HADEC)
			DirectionReferenceCode_toString = 'HADEC'
		case(DirectionReferenceCode_AZELSW)
			DirectionReferenceCode_toString = 'AZELSW'
		case(DirectionReferenceCode_AZELSWGEO)
			DirectionReferenceCode_toString = 'AZELSWGEO'
		case(DirectionReferenceCode_AZELNE)
			DirectionReferenceCode_toString = 'AZELNE'
		case(DirectionReferenceCode_AZELNEGEO)
			DirectionReferenceCode_toString = 'AZELNEGEO'
		case(DirectionReferenceCode_JNAT)
			DirectionReferenceCode_toString = 'JNAT'
		case(DirectionReferenceCode_ECLIPTIC)
			DirectionReferenceCode_toString = 'ECLIPTIC'
		case(DirectionReferenceCode_MECLIPTIC)
			DirectionReferenceCode_toString = 'MECLIPTIC'
		case(DirectionReferenceCode_TECLIPTIC)
			DirectionReferenceCode_toString = 'TECLIPTIC'
		case(DirectionReferenceCode_SUPERGAL)
			DirectionReferenceCode_toString = 'SUPERGAL'
		case(DirectionReferenceCode_ITRF)
			DirectionReferenceCode_toString = 'ITRF'
		case(DirectionReferenceCode_TOPO)
			DirectionReferenceCode_toString = 'TOPO'
		case(DirectionReferenceCode_ICRS)
			DirectionReferenceCode_toString = 'ICRS'
		case(DirectionReferenceCode_MERCURY)
			DirectionReferenceCode_toString = 'MERCURY'
		case(DirectionReferenceCode_VENUS)
			DirectionReferenceCode_toString = 'VENUS'
		case(DirectionReferenceCode_MARS)
			DirectionReferenceCode_toString = 'MARS'
		case(DirectionReferenceCode_JUPITER)
			DirectionReferenceCode_toString = 'JUPITER'
		case(DirectionReferenceCode_SATURN)
			DirectionReferenceCode_toString = 'SATURN'
		case(DirectionReferenceCode_URANUS)
			DirectionReferenceCode_toString = 'URANUS'
		case(DirectionReferenceCode_NEPTUNE)
			DirectionReferenceCode_toString = 'NEPTUNE'
		case(DirectionReferenceCode_PLUTO)
			DirectionReferenceCode_toString = 'PLUTO'
		case(DirectionReferenceCode_SUN)
			DirectionReferenceCode_toString = 'SUN'
		case(DirectionReferenceCode_MOON)
			DirectionReferenceCode_toString = 'MOON'
		end select
	end function DirectionReferenceCode_toString

!
	function DirectionReferenceCode_fromString(str)
		integer :: DirectionReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('J2000')
			DirectionReferenceCode_fromString = DirectionReferenceCode_J2000
		case('JMEAN')
			DirectionReferenceCode_fromString = DirectionReferenceCode_JMEAN
		case('JTRUE')
			DirectionReferenceCode_fromString = DirectionReferenceCode_JTRUE
		case('APP')
			DirectionReferenceCode_fromString = DirectionReferenceCode_APP
		case('B1950')
			DirectionReferenceCode_fromString = DirectionReferenceCode_B1950
		case('B1950_VLA')
			DirectionReferenceCode_fromString = DirectionReferenceCode_B1950_VLA
		case('BMEAN')
			DirectionReferenceCode_fromString = DirectionReferenceCode_BMEAN
		case('BTRUE')
			DirectionReferenceCode_fromString = DirectionReferenceCode_BTRUE
		case('GALACTIC')
			DirectionReferenceCode_fromString = DirectionReferenceCode_GALACTIC
		case('HADEC')
			DirectionReferenceCode_fromString = DirectionReferenceCode_HADEC
		case('AZELSW')
			DirectionReferenceCode_fromString = DirectionReferenceCode_AZELSW
		case('AZELSWGEO')
			DirectionReferenceCode_fromString = DirectionReferenceCode_AZELSWGEO
		case('AZELNE')
			DirectionReferenceCode_fromString = DirectionReferenceCode_AZELNE
		case('AZELNEGEO')
			DirectionReferenceCode_fromString = DirectionReferenceCode_AZELNEGEO
		case('JNAT')
			DirectionReferenceCode_fromString = DirectionReferenceCode_JNAT
		case('ECLIPTIC')
			DirectionReferenceCode_fromString = DirectionReferenceCode_ECLIPTIC
		case('MECLIPTIC')
			DirectionReferenceCode_fromString = DirectionReferenceCode_MECLIPTIC
		case('TECLIPTIC')
			DirectionReferenceCode_fromString = DirectionReferenceCode_TECLIPTIC
		case('SUPERGAL')
			DirectionReferenceCode_fromString = DirectionReferenceCode_SUPERGAL
		case('ITRF')
			DirectionReferenceCode_fromString = DirectionReferenceCode_ITRF
		case('TOPO')
			DirectionReferenceCode_fromString = DirectionReferenceCode_TOPO
		case('ICRS')
			DirectionReferenceCode_fromString = DirectionReferenceCode_ICRS
		case('MERCURY')
			DirectionReferenceCode_fromString = DirectionReferenceCode_MERCURY
		case('VENUS')
			DirectionReferenceCode_fromString = DirectionReferenceCode_VENUS
		case('MARS')
			DirectionReferenceCode_fromString = DirectionReferenceCode_MARS
		case('JUPITER')
			DirectionReferenceCode_fromString = DirectionReferenceCode_JUPITER
		case('SATURN')
			DirectionReferenceCode_fromString = DirectionReferenceCode_SATURN
		case('URANUS')
			DirectionReferenceCode_fromString = DirectionReferenceCode_URANUS
		case('NEPTUNE')
			DirectionReferenceCode_fromString = DirectionReferenceCode_NEPTUNE
		case('PLUTO')
			DirectionReferenceCode_fromString = DirectionReferenceCode_PLUTO
		case('SUN')
			DirectionReferenceCode_fromString = DirectionReferenceCode_SUN
		case('MOON')
			DirectionReferenceCode_fromString = DirectionReferenceCode_MOON
		end select
	end function DirectionReferenceCode_fromString



!
	function DopplerReferenceCode_toString(i)
		integer :: i
		character*80 :: DopplerReferenceCode_toString
		select case(i)
		case(DopplerReferenceCode_RADIO)
			DopplerReferenceCode_toString = 'RADIO'
		case(DopplerReferenceCode_Z)
			DopplerReferenceCode_toString = 'Z'
		case(DopplerReferenceCode_RATIO)
			DopplerReferenceCode_toString = 'RATIO'
		case(DopplerReferenceCode_BETA)
			DopplerReferenceCode_toString = 'BETA'
		case(DopplerReferenceCode_GAMMA)
			DopplerReferenceCode_toString = 'GAMMA'
		case(DopplerReferenceCode_OPTICAL)
			DopplerReferenceCode_toString = 'OPTICAL'
		case(DopplerReferenceCode_RELATIVISTIC)
			DopplerReferenceCode_toString = 'RELATIVISTIC'
		end select
	end function DopplerReferenceCode_toString

!
	function DopplerReferenceCode_fromString(str)
		integer :: DopplerReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('RADIO')
			DopplerReferenceCode_fromString = DopplerReferenceCode_RADIO
		case('Z')
			DopplerReferenceCode_fromString = DopplerReferenceCode_Z
		case('RATIO')
			DopplerReferenceCode_fromString = DopplerReferenceCode_RATIO
		case('BETA')
			DopplerReferenceCode_fromString = DopplerReferenceCode_BETA
		case('GAMMA')
			DopplerReferenceCode_fromString = DopplerReferenceCode_GAMMA
		case('OPTICAL')
			DopplerReferenceCode_fromString = DopplerReferenceCode_OPTICAL
		case('RELATIVISTIC')
			DopplerReferenceCode_fromString = DopplerReferenceCode_RELATIVISTIC
		end select
	end function DopplerReferenceCode_fromString



!
	function DopplerTrackingMode_toString(i)
		integer :: i
		character*80 :: DopplerTrackingMode_toString
		select case(i)
		case(DopplerTrackingMode_NONE)
			DopplerTrackingMode_toString = 'NONE'
		case(DopplerTrackingMode_CONTINUOUS)
			DopplerTrackingMode_toString = 'CONTINUOUS'
		case(DopplerTrackingMode_SCAN_BASED)
			DopplerTrackingMode_toString = 'SCAN_BASED'
		case(DopplerTrackingMode_SB_BASED)
			DopplerTrackingMode_toString = 'SB_BASED'
		end select
	end function DopplerTrackingMode_toString

!
	function DopplerTrackingMode_fromString(str)
		integer :: DopplerTrackingMode_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			DopplerTrackingMode_fromString = DopplerTrackingMode_NONE
		case('CONTINUOUS')
			DopplerTrackingMode_fromString = DopplerTrackingMode_CONTINUOUS
		case('SCAN_BASED')
			DopplerTrackingMode_fromString = DopplerTrackingMode_SCAN_BASED
		case('SB_BASED')
			DopplerTrackingMode_fromString = DopplerTrackingMode_SB_BASED
		end select
	end function DopplerTrackingMode_fromString



!
	function FieldCode_toString(i)
		integer :: i
		character*80 :: FieldCode_toString
		select case(i)
		case(FieldCode_NONE)
			FieldCode_toString = 'NONE'
		end select
	end function FieldCode_toString

!
	function FieldCode_fromString(str)
		integer :: FieldCode_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			FieldCode_fromString = FieldCode_NONE
		end select
	end function FieldCode_fromString



!
	function FilterMode_toString(i)
		integer :: i
		character*80 :: FilterMode_toString
		select case(i)
		case(FilterMode_FILTER_NA)
			FilterMode_toString = 'FILTER_NA'
		case(FilterMode_FILTER_TDM)
			FilterMode_toString = 'FILTER_TDM'
		case(FilterMode_FILTER_TFB)
			FilterMode_toString = 'FILTER_TFB'
		case(FilterMode_UNDEFINED)
			FilterMode_toString = 'UNDEFINED'
		end select
	end function FilterMode_toString

!
	function FilterMode_fromString(str)
		integer :: FilterMode_fromString
		character*80 :: str
		select case(str)
		case('FILTER_NA')
			FilterMode_fromString = FilterMode_FILTER_NA
		case('FILTER_TDM')
			FilterMode_fromString = FilterMode_FILTER_TDM
		case('FILTER_TFB')
			FilterMode_fromString = FilterMode_FILTER_TFB
		case('UNDEFINED')
			FilterMode_fromString = FilterMode_UNDEFINED
		end select
	end function FilterMode_fromString



!
	function FluxCalibrationMethod_toString(i)
		integer :: i
		character*80 :: FluxCalibrationMethod_toString
		select case(i)
		case(FluxCalibrationMethod_ABSOLUTE)
			FluxCalibrationMethod_toString = 'ABSOLUTE'
		case(FluxCalibrationMethod_RELATIVE)
			FluxCalibrationMethod_toString = 'RELATIVE'
		case(FluxCalibrationMethod_EFFICIENCY)
			FluxCalibrationMethod_toString = 'EFFICIENCY'
		end select
	end function FluxCalibrationMethod_toString

!
	function FluxCalibrationMethod_fromString(str)
		integer :: FluxCalibrationMethod_fromString
		character*80 :: str
		select case(str)
		case('ABSOLUTE')
			FluxCalibrationMethod_fromString = FluxCalibrationMethod_ABSOLUTE
		case('RELATIVE')
			FluxCalibrationMethod_fromString = FluxCalibrationMethod_RELATIVE
		case('EFFICIENCY')
			FluxCalibrationMethod_fromString = FluxCalibrationMethod_EFFICIENCY
		end select
	end function FluxCalibrationMethod_fromString



!
	function FocusMethod_toString(i)
		integer :: i
		character*80 :: FocusMethod_toString
		select case(i)
		case(FocusMethod_THREE_POINT)
			FocusMethod_toString = 'THREE_POINT'
		case(FocusMethod_FIVE_POINT)
			FocusMethod_toString = 'FIVE_POINT'
		case(FocusMethod_HOLOGRAPHY)
			FocusMethod_toString = 'HOLOGRAPHY'
		end select
	end function FocusMethod_toString

!
	function FocusMethod_fromString(str)
		integer :: FocusMethod_fromString
		character*80 :: str
		select case(str)
		case('THREE_POINT')
			FocusMethod_fromString = FocusMethod_THREE_POINT
		case('FIVE_POINT')
			FocusMethod_fromString = FocusMethod_FIVE_POINT
		case('HOLOGRAPHY')
			FocusMethod_fromString = FocusMethod_HOLOGRAPHY
		end select
	end function FocusMethod_fromString



!
	function FrequencyReferenceCode_toString(i)
		integer :: i
		character*80 :: FrequencyReferenceCode_toString
		select case(i)
		case(FrequencyReferenceCode_LABREST)
			FrequencyReferenceCode_toString = 'LABREST'
		case(FrequencyReferenceCode_LSRD)
			FrequencyReferenceCode_toString = 'LSRD'
		case(FrequencyReferenceCode_LSRK)
			FrequencyReferenceCode_toString = 'LSRK'
		case(FrequencyReferenceCode_BARY)
			FrequencyReferenceCode_toString = 'BARY'
		case(FrequencyReferenceCode_REST)
			FrequencyReferenceCode_toString = 'REST'
		case(FrequencyReferenceCode_GEO)
			FrequencyReferenceCode_toString = 'GEO'
		case(FrequencyReferenceCode_GALACTO)
			FrequencyReferenceCode_toString = 'GALACTO'
		case(FrequencyReferenceCode_TOPO)
			FrequencyReferenceCode_toString = 'TOPO'
		end select
	end function FrequencyReferenceCode_toString

!
	function FrequencyReferenceCode_fromString(str)
		integer :: FrequencyReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('LABREST')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_LABREST
		case('LSRD')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_LSRD
		case('LSRK')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_LSRK
		case('BARY')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_BARY
		case('REST')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_REST
		case('GEO')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_GEO
		case('GALACTO')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_GALACTO
		case('TOPO')
			FrequencyReferenceCode_fromString = FrequencyReferenceCode_TOPO
		end select
	end function FrequencyReferenceCode_fromString



!
	function HolographyChannelType_toString(i)
		integer :: i
		character*80 :: HolographyChannelType_toString
		select case(i)
		case(HolographyChannelType_Q2)
			HolographyChannelType_toString = 'Q2'
		case(HolographyChannelType_QR)
			HolographyChannelType_toString = 'QR'
		case(HolographyChannelType_QS)
			HolographyChannelType_toString = 'QS'
		case(HolographyChannelType_R2)
			HolographyChannelType_toString = 'R2'
		case(HolographyChannelType_RS)
			HolographyChannelType_toString = 'RS'
		case(HolographyChannelType_S2)
			HolographyChannelType_toString = 'S2'
		end select
	end function HolographyChannelType_toString

!
	function HolographyChannelType_fromString(str)
		integer :: HolographyChannelType_fromString
		character*80 :: str
		select case(str)
		case('Q2')
			HolographyChannelType_fromString = HolographyChannelType_Q2
		case('QR')
			HolographyChannelType_fromString = HolographyChannelType_QR
		case('QS')
			HolographyChannelType_fromString = HolographyChannelType_QS
		case('R2')
			HolographyChannelType_fromString = HolographyChannelType_R2
		case('RS')
			HolographyChannelType_fromString = HolographyChannelType_RS
		case('S2')
			HolographyChannelType_fromString = HolographyChannelType_S2
		end select
	end function HolographyChannelType_fromString



!
	function InvalidatingCondition_toString(i)
		integer :: i
		character*80 :: InvalidatingCondition_toString
		select case(i)
		case(InvalidatingCondition_ANTENNA_DISCONNECT)
			InvalidatingCondition_toString = 'ANTENNA_DISCONNECT'
		case(InvalidatingCondition_ANTENNA_MOVE)
			InvalidatingCondition_toString = 'ANTENNA_MOVE'
		case(InvalidatingCondition_ANTENNA_POWER_DOWN)
			InvalidatingCondition_toString = 'ANTENNA_POWER_DOWN'
		case(InvalidatingCondition_RECEIVER_EXCHANGE)
			InvalidatingCondition_toString = 'RECEIVER_EXCHANGE'
		case(InvalidatingCondition_RECEIVER_POWER_DOWN)
			InvalidatingCondition_toString = 'RECEIVER_POWER_DOWN'
		end select
	end function InvalidatingCondition_toString

!
	function InvalidatingCondition_fromString(str)
		integer :: InvalidatingCondition_fromString
		character*80 :: str
		select case(str)
		case('ANTENNA_DISCONNECT')
			InvalidatingCondition_fromString = InvalidatingCondition_ANTENNA_DISCONNECT
		case('ANTENNA_MOVE')
			InvalidatingCondition_fromString = InvalidatingCondition_ANTENNA_MOVE
		case('ANTENNA_POWER_DOWN')
			InvalidatingCondition_fromString = InvalidatingCondition_ANTENNA_POWER_DOWN
		case('RECEIVER_EXCHANGE')
			InvalidatingCondition_fromString = InvalidatingCondition_RECEIVER_EXCHANGE
		case('RECEIVER_POWER_DOWN')
			InvalidatingCondition_fromString = InvalidatingCondition_RECEIVER_POWER_DOWN
		end select
	end function InvalidatingCondition_fromString



!
	function NetSideband_toString(i)
		integer :: i
		character*80 :: NetSideband_toString
		select case(i)
		case(NetSideband_NOSB)
			NetSideband_toString = 'NOSB'
		case(NetSideband_LSB)
			NetSideband_toString = 'LSB'
		case(NetSideband_USB)
			NetSideband_toString = 'USB'
		case(NetSideband_DSB)
			NetSideband_toString = 'DSB'
		end select
	end function NetSideband_toString

!
	function NetSideband_fromString(str)
		integer :: NetSideband_fromString
		character*80 :: str
		select case(str)
		case('NOSB')
			NetSideband_fromString = NetSideband_NOSB
		case('LSB')
			NetSideband_fromString = NetSideband_LSB
		case('USB')
			NetSideband_fromString = NetSideband_USB
		case('DSB')
			NetSideband_fromString = NetSideband_DSB
		end select
	end function NetSideband_fromString



!
	function PointingMethod_toString(i)
		integer :: i
		character*80 :: PointingMethod_toString
		select case(i)
		case(PointingMethod_THREE_POINT)
			PointingMethod_toString = 'THREE_POINT'
		case(PointingMethod_FOUR_POINT)
			PointingMethod_toString = 'FOUR_POINT'
		case(PointingMethod_FIVE_POINT)
			PointingMethod_toString = 'FIVE_POINT'
		case(PointingMethod_CROSS)
			PointingMethod_toString = 'CROSS'
		case(PointingMethod_CIRCLE)
			PointingMethod_toString = 'CIRCLE'
		case(PointingMethod_HOLOGRAPHY)
			PointingMethod_toString = 'HOLOGRAPHY'
		end select
	end function PointingMethod_toString

!
	function PointingMethod_fromString(str)
		integer :: PointingMethod_fromString
		character*80 :: str
		select case(str)
		case('THREE_POINT')
			PointingMethod_fromString = PointingMethod_THREE_POINT
		case('FOUR_POINT')
			PointingMethod_fromString = PointingMethod_FOUR_POINT
		case('FIVE_POINT')
			PointingMethod_fromString = PointingMethod_FIVE_POINT
		case('CROSS')
			PointingMethod_fromString = PointingMethod_CROSS
		case('CIRCLE')
			PointingMethod_fromString = PointingMethod_CIRCLE
		case('HOLOGRAPHY')
			PointingMethod_fromString = PointingMethod_HOLOGRAPHY
		end select
	end function PointingMethod_fromString



!
	function PointingModelMode_toString(i)
		integer :: i
		character*80 :: PointingModelMode_toString
		select case(i)
		case(PointingModelMode_RADIO)
			PointingModelMode_toString = 'RADIO'
		case(PointingModelMode_OPTICAL)
			PointingModelMode_toString = 'OPTICAL'
		end select
	end function PointingModelMode_toString

!
	function PointingModelMode_fromString(str)
		integer :: PointingModelMode_fromString
		character*80 :: str
		select case(str)
		case('RADIO')
			PointingModelMode_fromString = PointingModelMode_RADIO
		case('OPTICAL')
			PointingModelMode_fromString = PointingModelMode_OPTICAL
		end select
	end function PointingModelMode_fromString



!
	function PolarizationType_toString(i)
		integer :: i
		character*80 :: PolarizationType_toString
		select case(i)
		case(PolarizationType_R)
			PolarizationType_toString = 'R'
		case(PolarizationType_L)
			PolarizationType_toString = 'L'
		case(PolarizationType_X)
			PolarizationType_toString = 'X'
		case(PolarizationType_Y)
			PolarizationType_toString = 'Y'
		case(PolarizationType_BOTH)
			PolarizationType_toString = 'BOTH'
		end select
	end function PolarizationType_toString

!
	function PolarizationType_fromString(str)
		integer :: PolarizationType_fromString
		character*80 :: str
		select case(str)
		case('R')
			PolarizationType_fromString = PolarizationType_R
		case('L')
			PolarizationType_fromString = PolarizationType_L
		case('X')
			PolarizationType_fromString = PolarizationType_X
		case('Y')
			PolarizationType_fromString = PolarizationType_Y
		case('BOTH')
			PolarizationType_fromString = PolarizationType_BOTH
		end select
	end function PolarizationType_fromString



!
	function PositionMethod_toString(i)
		integer :: i
		character*80 :: PositionMethod_toString
		select case(i)
		case(PositionMethod_DELAY_FITTING)
			PositionMethod_toString = 'DELAY_FITTING'
		case(PositionMethod_PHASE_FITTING)
			PositionMethod_toString = 'PHASE_FITTING'
		end select
	end function PositionMethod_toString

!
	function PositionMethod_fromString(str)
		integer :: PositionMethod_fromString
		character*80 :: str
		select case(str)
		case('DELAY_FITTING')
			PositionMethod_fromString = PositionMethod_DELAY_FITTING
		case('PHASE_FITTING')
			PositionMethod_fromString = PositionMethod_PHASE_FITTING
		end select
	end function PositionMethod_fromString



!
	function PositionReferenceCode_toString(i)
		integer :: i
		character*80 :: PositionReferenceCode_toString
		select case(i)
		case(PositionReferenceCode_ITRF)
			PositionReferenceCode_toString = 'ITRF'
		case(PositionReferenceCode_WGS84)
			PositionReferenceCode_toString = 'WGS84'
		case(PositionReferenceCode_SITE)
			PositionReferenceCode_toString = 'SITE'
		case(PositionReferenceCode_STATION)
			PositionReferenceCode_toString = 'STATION'
		case(PositionReferenceCode_YOKE)
			PositionReferenceCode_toString = 'YOKE'
		case(PositionReferenceCode_REFLECTOR)
			PositionReferenceCode_toString = 'REFLECTOR'
		end select
	end function PositionReferenceCode_toString

!
	function PositionReferenceCode_fromString(str)
		integer :: PositionReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('ITRF')
			PositionReferenceCode_fromString = PositionReferenceCode_ITRF
		case('WGS84')
			PositionReferenceCode_fromString = PositionReferenceCode_WGS84
		case('SITE')
			PositionReferenceCode_fromString = PositionReferenceCode_SITE
		case('STATION')
			PositionReferenceCode_fromString = PositionReferenceCode_STATION
		case('YOKE')
			PositionReferenceCode_fromString = PositionReferenceCode_YOKE
		case('REFLECTOR')
			PositionReferenceCode_fromString = PositionReferenceCode_REFLECTOR
		end select
	end function PositionReferenceCode_fromString



!
	function PrimaryBeamDescription_toString(i)
		integer :: i
		character*80 :: PrimaryBeamDescription_toString
		select case(i)
		case(PrimaryBeamDescription_COMPLEX_FIELD_PATTERN)
			PrimaryBeamDescription_toString = 'COMPLEX_FIELD_PATTERN'
		case(PrimaryBeamDescription_APERTURE_FIELD_DISTRIBUTION)
			PrimaryBeamDescription_toString = 'APERTURE_FIELD_DISTRIBUTION'
		end select
	end function PrimaryBeamDescription_toString

!
	function PrimaryBeamDescription_fromString(str)
		integer :: PrimaryBeamDescription_fromString
		character*80 :: str
		select case(str)
		case('COMPLEX_FIELD_PATTERN')
			PrimaryBeamDescription_fromString = PrimaryBeamDescription_COMPLEX_FIELD_PATTERN
		case('APERTURE_FIELD_DISTRIBUTION')
			PrimaryBeamDescription_fromString = PrimaryBeamDescription_APERTURE_FIELD_DISTRIBUTION
		end select
	end function PrimaryBeamDescription_fromString



!
	function PrimitiveDataType_toString(i)
		integer :: i
		character*80 :: PrimitiveDataType_toString
		select case(i)
		case(PrimitiveDataType_INT16_TYPE)
			PrimitiveDataType_toString = 'INT16_TYPE'
		case(PrimitiveDataType_INT32_TYPE)
			PrimitiveDataType_toString = 'INT32_TYPE'
		case(PrimitiveDataType_INT64_TYPE)
			PrimitiveDataType_toString = 'INT64_TYPE'
		case(PrimitiveDataType_FLOAT32_TYPE)
			PrimitiveDataType_toString = 'FLOAT32_TYPE'
		case(PrimitiveDataType_FLOAT64_TYPE)
			PrimitiveDataType_toString = 'FLOAT64_TYPE'
		end select
	end function PrimitiveDataType_toString

!
	function PrimitiveDataType_fromString(str)
		integer :: PrimitiveDataType_fromString
		character*80 :: str
		select case(str)
		case('INT16_TYPE')
			PrimitiveDataType_fromString = PrimitiveDataType_INT16_TYPE
		case('INT32_TYPE')
			PrimitiveDataType_fromString = PrimitiveDataType_INT32_TYPE
		case('INT64_TYPE')
			PrimitiveDataType_fromString = PrimitiveDataType_INT64_TYPE
		case('FLOAT32_TYPE')
			PrimitiveDataType_fromString = PrimitiveDataType_FLOAT32_TYPE
		case('FLOAT64_TYPE')
			PrimitiveDataType_fromString = PrimitiveDataType_FLOAT64_TYPE
		end select
	end function PrimitiveDataType_fromString



!
	function ProcessorSubType_toString(i)
		integer :: i
		character*80 :: ProcessorSubType_toString
		select case(i)
		case(ProcessorSubType_ALMA_CORRELATOR_MODE)
			ProcessorSubType_toString = 'ALMA_CORRELATOR_MODE'
		case(ProcessorSubType_SQUARE_LAW_DETECTOR)
			ProcessorSubType_toString = 'SQUARE_LAW_DETECTOR'
		case(ProcessorSubType_HOLOGRAPHY)
			ProcessorSubType_toString = 'HOLOGRAPHY'
		case(ProcessorSubType_ALMA_RADIOMETER)
			ProcessorSubType_toString = 'ALMA_RADIOMETER'
		end select
	end function ProcessorSubType_toString

!
	function ProcessorSubType_fromString(str)
		integer :: ProcessorSubType_fromString
		character*80 :: str
		select case(str)
		case('ALMA_CORRELATOR_MODE')
			ProcessorSubType_fromString = ProcessorSubType_ALMA_CORRELATOR_MODE
		case('SQUARE_LAW_DETECTOR')
			ProcessorSubType_fromString = ProcessorSubType_SQUARE_LAW_DETECTOR
		case('HOLOGRAPHY')
			ProcessorSubType_fromString = ProcessorSubType_HOLOGRAPHY
		case('ALMA_RADIOMETER')
			ProcessorSubType_fromString = ProcessorSubType_ALMA_RADIOMETER
		end select
	end function ProcessorSubType_fromString



!
	function ProcessorType_toString(i)
		integer :: i
		character*80 :: ProcessorType_toString
		select case(i)
		case(ProcessorType_CORRELATOR)
			ProcessorType_toString = 'CORRELATOR'
		case(ProcessorType_RADIOMETER)
			ProcessorType_toString = 'RADIOMETER'
		case(ProcessorType_SPECTROMETER)
			ProcessorType_toString = 'SPECTROMETER'
		end select
	end function ProcessorType_toString

!
	function ProcessorType_fromString(str)
		integer :: ProcessorType_fromString
		character*80 :: str
		select case(str)
		case('CORRELATOR')
			ProcessorType_fromString = ProcessorType_CORRELATOR
		case('RADIOMETER')
			ProcessorType_fromString = ProcessorType_RADIOMETER
		case('SPECTROMETER')
			ProcessorType_fromString = ProcessorType_SPECTROMETER
		end select
	end function ProcessorType_fromString



!
	function RadialVelocityReferenceCode_toString(i)
		integer :: i
		character*80 :: RadialVelocityReferenceCode_toString
		select case(i)
		case(RadialVelocityReferenceCode_LSRD)
			RadialVelocityReferenceCode_toString = 'LSRD'
		case(RadialVelocityReferenceCode_LSRK)
			RadialVelocityReferenceCode_toString = 'LSRK'
		case(RadialVelocityReferenceCode_GALACTO)
			RadialVelocityReferenceCode_toString = 'GALACTO'
		case(RadialVelocityReferenceCode_BARY)
			RadialVelocityReferenceCode_toString = 'BARY'
		case(RadialVelocityReferenceCode_GEO)
			RadialVelocityReferenceCode_toString = 'GEO'
		case(RadialVelocityReferenceCode_TOPO)
			RadialVelocityReferenceCode_toString = 'TOPO'
		end select
	end function RadialVelocityReferenceCode_toString

!
	function RadialVelocityReferenceCode_fromString(str)
		integer :: RadialVelocityReferenceCode_fromString
		character*80 :: str
		select case(str)
		case('LSRD')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_LSRD
		case('LSRK')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_LSRK
		case('GALACTO')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_GALACTO
		case('BARY')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_BARY
		case('GEO')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_GEO
		case('TOPO')
			RadialVelocityReferenceCode_fromString = RadialVelocityReferenceCode_TOPO
		end select
	end function RadialVelocityReferenceCode_fromString



!
	function ReceiverBand_toString(i)
		integer :: i
		character*80 :: ReceiverBand_toString
		select case(i)
		case(ReceiverBand_ALMA_RB_01)
			ReceiverBand_toString = 'ALMA_RB_01'
		case(ReceiverBand_ALMA_RB_02)
			ReceiverBand_toString = 'ALMA_RB_02'
		case(ReceiverBand_ALMA_RB_03)
			ReceiverBand_toString = 'ALMA_RB_03'
		case(ReceiverBand_ALMA_RB_04)
			ReceiverBand_toString = 'ALMA_RB_04'
		case(ReceiverBand_ALMA_RB_05)
			ReceiverBand_toString = 'ALMA_RB_05'
		case(ReceiverBand_ALMA_RB_06)
			ReceiverBand_toString = 'ALMA_RB_06'
		case(ReceiverBand_ALMA_RB_07)
			ReceiverBand_toString = 'ALMA_RB_07'
		case(ReceiverBand_ALMA_RB_08)
			ReceiverBand_toString = 'ALMA_RB_08'
		case(ReceiverBand_ALMA_RB_09)
			ReceiverBand_toString = 'ALMA_RB_09'
		case(ReceiverBand_ALMA_RB_10)
			ReceiverBand_toString = 'ALMA_RB_10'
		case(ReceiverBand_ALMA_RB_ALL)
			ReceiverBand_toString = 'ALMA_RB_ALL'
		case(ReceiverBand_ALMA_HOLOGRAPHY_RECEIVER)
			ReceiverBand_toString = 'ALMA_HOLOGRAPHY_RECEIVER'
		case(ReceiverBand_BURE_01)
			ReceiverBand_toString = 'BURE_01'
		case(ReceiverBand_BURE_02)
			ReceiverBand_toString = 'BURE_02'
		case(ReceiverBand_BURE_03)
			ReceiverBand_toString = 'BURE_03'
		case(ReceiverBand_BURE_04)
			ReceiverBand_toString = 'BURE_04'
		case(ReceiverBand_EVLA_4)
			ReceiverBand_toString = 'EVLA_4'
		case(ReceiverBand_EVLA_P)
			ReceiverBand_toString = 'EVLA_P'
		case(ReceiverBand_EVLA_L)
			ReceiverBand_toString = 'EVLA_L'
		case(ReceiverBand_EVLA_C)
			ReceiverBand_toString = 'EVLA_C'
		case(ReceiverBand_EVLA_S)
			ReceiverBand_toString = 'EVLA_S'
		case(ReceiverBand_EVLA_X)
			ReceiverBand_toString = 'EVLA_X'
		case(ReceiverBand_EVLA_Ku)
			ReceiverBand_toString = 'EVLA_Ku'
		case(ReceiverBand_EVLA_K)
			ReceiverBand_toString = 'EVLA_K'
		case(ReceiverBand_EVLA_Ka)
			ReceiverBand_toString = 'EVLA_Ka'
		case(ReceiverBand_EVLA_Q)
			ReceiverBand_toString = 'EVLA_Q'
		case(ReceiverBand_UNSPECIFIED)
			ReceiverBand_toString = 'UNSPECIFIED'
		end select
	end function ReceiverBand_toString

!
	function ReceiverBand_fromString(str)
		integer :: ReceiverBand_fromString
		character*80 :: str
		select case(str)
		case('ALMA_RB_01')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_01
		case('ALMA_RB_02')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_02
		case('ALMA_RB_03')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_03
		case('ALMA_RB_04')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_04
		case('ALMA_RB_05')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_05
		case('ALMA_RB_06')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_06
		case('ALMA_RB_07')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_07
		case('ALMA_RB_08')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_08
		case('ALMA_RB_09')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_09
		case('ALMA_RB_10')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_10
		case('ALMA_RB_ALL')
			ReceiverBand_fromString = ReceiverBand_ALMA_RB_ALL
		case('ALMA_HOLOGRAPHY_RECEIVER')
			ReceiverBand_fromString = ReceiverBand_ALMA_HOLOGRAPHY_RECEIVER
		case('BURE_01')
			ReceiverBand_fromString = ReceiverBand_BURE_01
		case('BURE_02')
			ReceiverBand_fromString = ReceiverBand_BURE_02
		case('BURE_03')
			ReceiverBand_fromString = ReceiverBand_BURE_03
		case('BURE_04')
			ReceiverBand_fromString = ReceiverBand_BURE_04
		case('EVLA_4')
			ReceiverBand_fromString = ReceiverBand_EVLA_4
		case('EVLA_P')
			ReceiverBand_fromString = ReceiverBand_EVLA_P
		case('EVLA_L')
			ReceiverBand_fromString = ReceiverBand_EVLA_L
		case('EVLA_C')
			ReceiverBand_fromString = ReceiverBand_EVLA_C
		case('EVLA_S')
			ReceiverBand_fromString = ReceiverBand_EVLA_S
		case('EVLA_X')
			ReceiverBand_fromString = ReceiverBand_EVLA_X
		case('EVLA_Ku')
			ReceiverBand_fromString = ReceiverBand_EVLA_Ku
		case('EVLA_K')
			ReceiverBand_fromString = ReceiverBand_EVLA_K
		case('EVLA_Ka')
			ReceiverBand_fromString = ReceiverBand_EVLA_Ka
		case('EVLA_Q')
			ReceiverBand_fromString = ReceiverBand_EVLA_Q
		case('UNSPECIFIED')
			ReceiverBand_fromString = ReceiverBand_UNSPECIFIED
		end select
	end function ReceiverBand_fromString



!
	function ReceiverSideband_toString(i)
		integer :: i
		character*80 :: ReceiverSideband_toString
		select case(i)
		case(ReceiverSideband_NOSB)
			ReceiverSideband_toString = 'NOSB'
		case(ReceiverSideband_DSB)
			ReceiverSideband_toString = 'DSB'
		case(ReceiverSideband_SSB)
			ReceiverSideband_toString = 'SSB'
		case(ReceiverSideband_TSB)
			ReceiverSideband_toString = 'TSB'
		end select
	end function ReceiverSideband_toString

!
	function ReceiverSideband_fromString(str)
		integer :: ReceiverSideband_fromString
		character*80 :: str
		select case(str)
		case('NOSB')
			ReceiverSideband_fromString = ReceiverSideband_NOSB
		case('DSB')
			ReceiverSideband_fromString = ReceiverSideband_DSB
		case('SSB')
			ReceiverSideband_fromString = ReceiverSideband_SSB
		case('TSB')
			ReceiverSideband_fromString = ReceiverSideband_TSB
		end select
	end function ReceiverSideband_fromString



!
	function SBType_toString(i)
		integer :: i
		character*80 :: SBType_toString
		select case(i)
		case(SBType_OBSERVATORY)
			SBType_toString = 'OBSERVATORY'
		case(SBType_OBSERVER)
			SBType_toString = 'OBSERVER'
		case(SBType_EXPERT)
			SBType_toString = 'EXPERT'
		end select
	end function SBType_toString

!
	function SBType_fromString(str)
		integer :: SBType_fromString
		character*80 :: str
		select case(str)
		case('OBSERVATORY')
			SBType_fromString = SBType_OBSERVATORY
		case('OBSERVER')
			SBType_fromString = SBType_OBSERVER
		case('EXPERT')
			SBType_fromString = SBType_EXPERT
		end select
	end function SBType_fromString



!
	function ScanIntent_toString(i)
		integer :: i
		character*80 :: ScanIntent_toString
		select case(i)
		case(ScanIntent_CALIBRATE_AMPLI)
			ScanIntent_toString = 'CALIBRATE_AMPLI'
		case(ScanIntent_CALIBRATE_ATMOSPHERE)
			ScanIntent_toString = 'CALIBRATE_ATMOSPHERE'
		case(ScanIntent_CALIBRATE_BANDPASS)
			ScanIntent_toString = 'CALIBRATE_BANDPASS'
		case(ScanIntent_CALIBRATE_DELAY)
			ScanIntent_toString = 'CALIBRATE_DELAY'
		case(ScanIntent_CALIBRATE_FLUX)
			ScanIntent_toString = 'CALIBRATE_FLUX'
		case(ScanIntent_CALIBRATE_FOCUS)
			ScanIntent_toString = 'CALIBRATE_FOCUS'
		case(ScanIntent_CALIBRATE_FOCUS_X)
			ScanIntent_toString = 'CALIBRATE_FOCUS_X'
		case(ScanIntent_CALIBRATE_FOCUS_Y)
			ScanIntent_toString = 'CALIBRATE_FOCUS_Y'
		case(ScanIntent_CALIBRATE_PHASE)
			ScanIntent_toString = 'CALIBRATE_PHASE'
		case(ScanIntent_CALIBRATE_POINTING)
			ScanIntent_toString = 'CALIBRATE_POINTING'
		case(ScanIntent_CALIBRATE_POLARIZATION)
			ScanIntent_toString = 'CALIBRATE_POLARIZATION'
		case(ScanIntent_CALIBRATE_SIDEBAND_RATIO)
			ScanIntent_toString = 'CALIBRATE_SIDEBAND_RATIO'
		case(ScanIntent_CALIBRATE_WVR)
			ScanIntent_toString = 'CALIBRATE_WVR'
		case(ScanIntent_DO_SKYDIP)
			ScanIntent_toString = 'DO_SKYDIP'
		case(ScanIntent_MAP_ANTENNA_SURFACE)
			ScanIntent_toString = 'MAP_ANTENNA_SURFACE'
		case(ScanIntent_MAP_PRIMARY_BEAM)
			ScanIntent_toString = 'MAP_PRIMARY_BEAM'
		case(ScanIntent_OBSERVE_TARGET)
			ScanIntent_toString = 'OBSERVE_TARGET'
		case(ScanIntent_CALIBRATE_POL_LEAKAGE)
			ScanIntent_toString = 'CALIBRATE_POL_LEAKAGE'
		case(ScanIntent_CALIBRATE_POL_ANGLE)
			ScanIntent_toString = 'CALIBRATE_POL_ANGLE'
		case(ScanIntent_TEST)
			ScanIntent_toString = 'TEST'
		case(ScanIntent_UNSPECIFIED)
			ScanIntent_toString = 'UNSPECIFIED'
		case(ScanIntent_CALIBRATE_ANTENNA_POSITION)
			ScanIntent_toString = 'CALIBRATE_ANTENNA_POSITION'
		case(ScanIntent_CALIBRATE_ANTENNA_PHASE)
			ScanIntent_toString = 'CALIBRATE_ANTENNA_PHASE'
		case(ScanIntent_MEASURE_RFI)
			ScanIntent_toString = 'MEASURE_RFI'
		case(ScanIntent_CALIBRATE_ANTENNA_POINTING_MODEL)
			ScanIntent_toString = 'CALIBRATE_ANTENNA_POINTING_MODEL'
		case(ScanIntent_SYSTEM_CONFIGURATION)
			ScanIntent_toString = 'SYSTEM_CONFIGURATION'
		case(ScanIntent_CALIBRATE_APPPHASE_ACTIVE)
			ScanIntent_toString = 'CALIBRATE_APPPHASE_ACTIVE'
		case(ScanIntent_CALIBRATE_APPPHASE_PASSIVE)
			ScanIntent_toString = 'CALIBRATE_APPPHASE_PASSIVE'
		case(ScanIntent_OBSERVE_CHECK_SOURCE)
			ScanIntent_toString = 'OBSERVE_CHECK_SOURCE'
		case(ScanIntent_CALIBRATE_DIFFGAIN)
			ScanIntent_toString = 'CALIBRATE_DIFFGAIN'
		end select
	end function ScanIntent_toString

!
	function ScanIntent_fromString(str)
		integer :: ScanIntent_fromString
		character*80 :: str
		select case(str)
		case('CALIBRATE_AMPLI')
			ScanIntent_fromString = ScanIntent_CALIBRATE_AMPLI
		case('CALIBRATE_ATMOSPHERE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_ATMOSPHERE
		case('CALIBRATE_BANDPASS')
			ScanIntent_fromString = ScanIntent_CALIBRATE_BANDPASS
		case('CALIBRATE_DELAY')
			ScanIntent_fromString = ScanIntent_CALIBRATE_DELAY
		case('CALIBRATE_FLUX')
			ScanIntent_fromString = ScanIntent_CALIBRATE_FLUX
		case('CALIBRATE_FOCUS')
			ScanIntent_fromString = ScanIntent_CALIBRATE_FOCUS
		case('CALIBRATE_FOCUS_X')
			ScanIntent_fromString = ScanIntent_CALIBRATE_FOCUS_X
		case('CALIBRATE_FOCUS_Y')
			ScanIntent_fromString = ScanIntent_CALIBRATE_FOCUS_Y
		case('CALIBRATE_PHASE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_PHASE
		case('CALIBRATE_POINTING')
			ScanIntent_fromString = ScanIntent_CALIBRATE_POINTING
		case('CALIBRATE_POLARIZATION')
			ScanIntent_fromString = ScanIntent_CALIBRATE_POLARIZATION
		case('CALIBRATE_SIDEBAND_RATIO')
			ScanIntent_fromString = ScanIntent_CALIBRATE_SIDEBAND_RATIO
		case('CALIBRATE_WVR')
			ScanIntent_fromString = ScanIntent_CALIBRATE_WVR
		case('DO_SKYDIP')
			ScanIntent_fromString = ScanIntent_DO_SKYDIP
		case('MAP_ANTENNA_SURFACE')
			ScanIntent_fromString = ScanIntent_MAP_ANTENNA_SURFACE
		case('MAP_PRIMARY_BEAM')
			ScanIntent_fromString = ScanIntent_MAP_PRIMARY_BEAM
		case('OBSERVE_TARGET')
			ScanIntent_fromString = ScanIntent_OBSERVE_TARGET
		case('CALIBRATE_POL_LEAKAGE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_POL_LEAKAGE
		case('CALIBRATE_POL_ANGLE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_POL_ANGLE
		case('TEST')
			ScanIntent_fromString = ScanIntent_TEST
		case('UNSPECIFIED')
			ScanIntent_fromString = ScanIntent_UNSPECIFIED
		case('CALIBRATE_ANTENNA_POSITION')
			ScanIntent_fromString = ScanIntent_CALIBRATE_ANTENNA_POSITION
		case('CALIBRATE_ANTENNA_PHASE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_ANTENNA_PHASE
		case('MEASURE_RFI')
			ScanIntent_fromString = ScanIntent_MEASURE_RFI
		case('CALIBRATE_ANTENNA_POINTING_MODEL')
			ScanIntent_fromString = ScanIntent_CALIBRATE_ANTENNA_POINTING_MODEL
		case('SYSTEM_CONFIGURATION')
			ScanIntent_fromString = ScanIntent_SYSTEM_CONFIGURATION
		case('CALIBRATE_APPPHASE_ACTIVE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_APPPHASE_ACTIVE
		case('CALIBRATE_APPPHASE_PASSIVE')
			ScanIntent_fromString = ScanIntent_CALIBRATE_APPPHASE_PASSIVE
		case('OBSERVE_CHECK_SOURCE')
			ScanIntent_fromString = ScanIntent_OBSERVE_CHECK_SOURCE
		case('CALIBRATE_DIFFGAIN')
			ScanIntent_fromString = ScanIntent_CALIBRATE_DIFFGAIN
		end select
	end function ScanIntent_fromString



!
	function SchedulerMode_toString(i)
		integer :: i
		character*80 :: SchedulerMode_toString
		select case(i)
		case(SchedulerMode_DYNAMIC)
			SchedulerMode_toString = 'DYNAMIC'
		case(SchedulerMode_INTERACTIVE)
			SchedulerMode_toString = 'INTERACTIVE'
		case(SchedulerMode_MANUAL)
			SchedulerMode_toString = 'MANUAL'
		case(SchedulerMode_QUEUED)
			SchedulerMode_toString = 'QUEUED'
		end select
	end function SchedulerMode_toString

!
	function SchedulerMode_fromString(str)
		integer :: SchedulerMode_fromString
		character*80 :: str
		select case(str)
		case('DYNAMIC')
			SchedulerMode_fromString = SchedulerMode_DYNAMIC
		case('INTERACTIVE')
			SchedulerMode_fromString = SchedulerMode_INTERACTIVE
		case('MANUAL')
			SchedulerMode_fromString = SchedulerMode_MANUAL
		case('QUEUED')
			SchedulerMode_fromString = SchedulerMode_QUEUED
		end select
	end function SchedulerMode_fromString



!
	function SidebandProcessingMode_toString(i)
		integer :: i
		character*80 :: SidebandProcessingMode_toString
		select case(i)
		case(SidebandProcessingMode_NONE)
			SidebandProcessingMode_toString = 'NONE'
		case(SidebandProcessingMode_PHASE_SWITCH_SEPARATION)
			SidebandProcessingMode_toString = 'PHASE_SWITCH_SEPARATION'
		case(SidebandProcessingMode_FREQUENCY_OFFSET_SEPARATION)
			SidebandProcessingMode_toString = 'FREQUENCY_OFFSET_SEPARATION'
		case(SidebandProcessingMode_PHASE_SWITCH_REJECTION)
			SidebandProcessingMode_toString = 'PHASE_SWITCH_REJECTION'
		case(SidebandProcessingMode_FREQUENCY_OFFSET_REJECTION)
			SidebandProcessingMode_toString = 'FREQUENCY_OFFSET_REJECTION'
		end select
	end function SidebandProcessingMode_toString

!
	function SidebandProcessingMode_fromString(str)
		integer :: SidebandProcessingMode_fromString
		character*80 :: str
		select case(str)
		case('NONE')
			SidebandProcessingMode_fromString = SidebandProcessingMode_NONE
		case('PHASE_SWITCH_SEPARATION')
			SidebandProcessingMode_fromString = SidebandProcessingMode_PHASE_SWITCH_SEPARATION
		case('FREQUENCY_OFFSET_SEPARATION')
			SidebandProcessingMode_fromString = SidebandProcessingMode_FREQUENCY_OFFSET_SEPARATION
		case('PHASE_SWITCH_REJECTION')
			SidebandProcessingMode_fromString = SidebandProcessingMode_PHASE_SWITCH_REJECTION
		case('FREQUENCY_OFFSET_REJECTION')
			SidebandProcessingMode_fromString = SidebandProcessingMode_FREQUENCY_OFFSET_REJECTION
		end select
	end function SidebandProcessingMode_fromString



!
	function SourceModel_toString(i)
		integer :: i
		character*80 :: SourceModel_toString
		select case(i)
		case(SourceModel_GAUSSIAN)
			SourceModel_toString = 'GAUSSIAN'
		case(SourceModel_POINT)
			SourceModel_toString = 'POINT'
		case(SourceModel_DISK)
			SourceModel_toString = 'DISK'
		end select
	end function SourceModel_toString

!
	function SourceModel_fromString(str)
		integer :: SourceModel_fromString
		character*80 :: str
		select case(str)
		case('GAUSSIAN')
			SourceModel_fromString = SourceModel_GAUSSIAN
		case('POINT')
			SourceModel_fromString = SourceModel_POINT
		case('DISK')
			SourceModel_fromString = SourceModel_DISK
		end select
	end function SourceModel_fromString



!
	function SpectralResolutionType_toString(i)
		integer :: i
		character*80 :: SpectralResolutionType_toString
		select case(i)
		case(SpectralResolutionType_CHANNEL_AVERAGE)
			SpectralResolutionType_toString = 'CHANNEL_AVERAGE'
		case(SpectralResolutionType_BASEBAND_WIDE)
			SpectralResolutionType_toString = 'BASEBAND_WIDE'
		case(SpectralResolutionType_FULL_RESOLUTION)
			SpectralResolutionType_toString = 'FULL_RESOLUTION'
		end select
	end function SpectralResolutionType_toString

!
	function SpectralResolutionType_fromString(str)
		integer :: SpectralResolutionType_fromString
		character*80 :: str
		select case(str)
		case('CHANNEL_AVERAGE')
			SpectralResolutionType_fromString = SpectralResolutionType_CHANNEL_AVERAGE
		case('BASEBAND_WIDE')
			SpectralResolutionType_fromString = SpectralResolutionType_BASEBAND_WIDE
		case('FULL_RESOLUTION')
			SpectralResolutionType_fromString = SpectralResolutionType_FULL_RESOLUTION
		end select
	end function SpectralResolutionType_fromString



!
	function StationType_toString(i)
		integer :: i
		character*80 :: StationType_toString
		select case(i)
		case(StationType_ANTENNA_PAD)
			StationType_toString = 'ANTENNA_PAD'
		case(StationType_MAINTENANCE_PAD)
			StationType_toString = 'MAINTENANCE_PAD'
		case(StationType_WEATHER_STATION)
			StationType_toString = 'WEATHER_STATION'
		end select
	end function StationType_toString

!
	function StationType_fromString(str)
		integer :: StationType_fromString
		character*80 :: str
		select case(str)
		case('ANTENNA_PAD')
			StationType_fromString = StationType_ANTENNA_PAD
		case('MAINTENANCE_PAD')
			StationType_fromString = StationType_MAINTENANCE_PAD
		case('WEATHER_STATION')
			StationType_fromString = StationType_WEATHER_STATION
		end select
	end function StationType_fromString



!
	function StokesParameter_toString(i)
		integer :: i
		character*80 :: StokesParameter_toString
		select case(i)
		case(StokesParameter_I)
			StokesParameter_toString = 'I'
		case(StokesParameter_Q)
			StokesParameter_toString = 'Q'
		case(StokesParameter_U)
			StokesParameter_toString = 'U'
		case(StokesParameter_V)
			StokesParameter_toString = 'V'
		case(StokesParameter_RR)
			StokesParameter_toString = 'RR'
		case(StokesParameter_RL)
			StokesParameter_toString = 'RL'
		case(StokesParameter_LR)
			StokesParameter_toString = 'LR'
		case(StokesParameter_LL)
			StokesParameter_toString = 'LL'
		case(StokesParameter_XX)
			StokesParameter_toString = 'XX'
		case(StokesParameter_XY)
			StokesParameter_toString = 'XY'
		case(StokesParameter_YX)
			StokesParameter_toString = 'YX'
		case(StokesParameter_YY)
			StokesParameter_toString = 'YY'
		case(StokesParameter_RX)
			StokesParameter_toString = 'RX'
		case(StokesParameter_RY)
			StokesParameter_toString = 'RY'
		case(StokesParameter_LX)
			StokesParameter_toString = 'LX'
		case(StokesParameter_LY)
			StokesParameter_toString = 'LY'
		case(StokesParameter_XR)
			StokesParameter_toString = 'XR'
		case(StokesParameter_XL)
			StokesParameter_toString = 'XL'
		case(StokesParameter_YR)
			StokesParameter_toString = 'YR'
		case(StokesParameter_YL)
			StokesParameter_toString = 'YL'
		case(StokesParameter_PP)
			StokesParameter_toString = 'PP'
		case(StokesParameter_PQ)
			StokesParameter_toString = 'PQ'
		case(StokesParameter_QP)
			StokesParameter_toString = 'QP'
		case(StokesParameter_QQ)
			StokesParameter_toString = 'QQ'
		case(StokesParameter_RCIRCULAR)
			StokesParameter_toString = 'RCIRCULAR'
		case(StokesParameter_LCIRCULAR)
			StokesParameter_toString = 'LCIRCULAR'
		case(StokesParameter_LINEAR)
			StokesParameter_toString = 'LINEAR'
		case(StokesParameter_PTOTAL)
			StokesParameter_toString = 'PTOTAL'
		case(StokesParameter_PLINEAR)
			StokesParameter_toString = 'PLINEAR'
		case(StokesParameter_PFTOTAL)
			StokesParameter_toString = 'PFTOTAL'
		case(StokesParameter_PFLINEAR)
			StokesParameter_toString = 'PFLINEAR'
		case(StokesParameter_PANGLE)
			StokesParameter_toString = 'PANGLE'
		end select
	end function StokesParameter_toString

!
	function StokesParameter_fromString(str)
		integer :: StokesParameter_fromString
		character*80 :: str
		select case(str)
		case('I')
			StokesParameter_fromString = StokesParameter_I
		case('Q')
			StokesParameter_fromString = StokesParameter_Q
		case('U')
			StokesParameter_fromString = StokesParameter_U
		case('V')
			StokesParameter_fromString = StokesParameter_V
		case('RR')
			StokesParameter_fromString = StokesParameter_RR
		case('RL')
			StokesParameter_fromString = StokesParameter_RL
		case('LR')
			StokesParameter_fromString = StokesParameter_LR
		case('LL')
			StokesParameter_fromString = StokesParameter_LL
		case('XX')
			StokesParameter_fromString = StokesParameter_XX
		case('XY')
			StokesParameter_fromString = StokesParameter_XY
		case('YX')
			StokesParameter_fromString = StokesParameter_YX
		case('YY')
			StokesParameter_fromString = StokesParameter_YY
		case('RX')
			StokesParameter_fromString = StokesParameter_RX
		case('RY')
			StokesParameter_fromString = StokesParameter_RY
		case('LX')
			StokesParameter_fromString = StokesParameter_LX
		case('LY')
			StokesParameter_fromString = StokesParameter_LY
		case('XR')
			StokesParameter_fromString = StokesParameter_XR
		case('XL')
			StokesParameter_fromString = StokesParameter_XL
		case('YR')
			StokesParameter_fromString = StokesParameter_YR
		case('YL')
			StokesParameter_fromString = StokesParameter_YL
		case('PP')
			StokesParameter_fromString = StokesParameter_PP
		case('PQ')
			StokesParameter_fromString = StokesParameter_PQ
		case('QP')
			StokesParameter_fromString = StokesParameter_QP
		case('QQ')
			StokesParameter_fromString = StokesParameter_QQ
		case('RCIRCULAR')
			StokesParameter_fromString = StokesParameter_RCIRCULAR
		case('LCIRCULAR')
			StokesParameter_fromString = StokesParameter_LCIRCULAR
		case('LINEAR')
			StokesParameter_fromString = StokesParameter_LINEAR
		case('PTOTAL')
			StokesParameter_fromString = StokesParameter_PTOTAL
		case('PLINEAR')
			StokesParameter_fromString = StokesParameter_PLINEAR
		case('PFTOTAL')
			StokesParameter_fromString = StokesParameter_PFTOTAL
		case('PFLINEAR')
			StokesParameter_fromString = StokesParameter_PFLINEAR
		case('PANGLE')
			StokesParameter_fromString = StokesParameter_PANGLE
		end select
	end function StokesParameter_fromString



!
	function SubscanIntent_toString(i)
		integer :: i
		character*80 :: SubscanIntent_toString
		select case(i)
		case(SubscanIntent_ON_SOURCE)
			SubscanIntent_toString = 'ON_SOURCE'
		case(SubscanIntent_OFF_SOURCE)
			SubscanIntent_toString = 'OFF_SOURCE'
		case(SubscanIntent_MIXED)
			SubscanIntent_toString = 'MIXED'
		case(SubscanIntent_REFERENCE)
			SubscanIntent_toString = 'REFERENCE'
		case(SubscanIntent_SCANNING)
			SubscanIntent_toString = 'SCANNING'
		case(SubscanIntent_HOT)
			SubscanIntent_toString = 'HOT'
		case(SubscanIntent_AMBIENT)
			SubscanIntent_toString = 'AMBIENT'
		case(SubscanIntent_SIGNAL)
			SubscanIntent_toString = 'SIGNAL'
		case(SubscanIntent_IMAGE)
			SubscanIntent_toString = 'IMAGE'
		case(SubscanIntent_TEST)
			SubscanIntent_toString = 'TEST'
		case(SubscanIntent_UNSPECIFIED)
			SubscanIntent_toString = 'UNSPECIFIED'
		end select
	end function SubscanIntent_toString

!
	function SubscanIntent_fromString(str)
		integer :: SubscanIntent_fromString
		character*80 :: str
		select case(str)
		case('ON_SOURCE')
			SubscanIntent_fromString = SubscanIntent_ON_SOURCE
		case('OFF_SOURCE')
			SubscanIntent_fromString = SubscanIntent_OFF_SOURCE
		case('MIXED')
			SubscanIntent_fromString = SubscanIntent_MIXED
		case('REFERENCE')
			SubscanIntent_fromString = SubscanIntent_REFERENCE
		case('SCANNING')
			SubscanIntent_fromString = SubscanIntent_SCANNING
		case('HOT')
			SubscanIntent_fromString = SubscanIntent_HOT
		case('AMBIENT')
			SubscanIntent_fromString = SubscanIntent_AMBIENT
		case('SIGNAL')
			SubscanIntent_fromString = SubscanIntent_SIGNAL
		case('IMAGE')
			SubscanIntent_fromString = SubscanIntent_IMAGE
		case('TEST')
			SubscanIntent_fromString = SubscanIntent_TEST
		case('UNSPECIFIED')
			SubscanIntent_fromString = SubscanIntent_UNSPECIFIED
		end select
	end function SubscanIntent_fromString



!
	function SwitchingMode_toString(i)
		integer :: i
		character*80 :: SwitchingMode_toString
		select case(i)
		case(SwitchingMode_NO_SWITCHING)
			SwitchingMode_toString = 'NO_SWITCHING'
		case(SwitchingMode_LOAD_SWITCHING)
			SwitchingMode_toString = 'LOAD_SWITCHING'
		case(SwitchingMode_POSITION_SWITCHING)
			SwitchingMode_toString = 'POSITION_SWITCHING'
		case(SwitchingMode_PHASE_SWITCHING)
			SwitchingMode_toString = 'PHASE_SWITCHING'
		case(SwitchingMode_FREQUENCY_SWITCHING)
			SwitchingMode_toString = 'FREQUENCY_SWITCHING'
		case(SwitchingMode_NUTATOR_SWITCHING)
			SwitchingMode_toString = 'NUTATOR_SWITCHING'
		case(SwitchingMode_CHOPPER_WHEEL)
			SwitchingMode_toString = 'CHOPPER_WHEEL'
		end select
	end function SwitchingMode_toString

!
	function SwitchingMode_fromString(str)
		integer :: SwitchingMode_fromString
		character*80 :: str
		select case(str)
		case('NO_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_NO_SWITCHING
		case('LOAD_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_LOAD_SWITCHING
		case('POSITION_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_POSITION_SWITCHING
		case('PHASE_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_PHASE_SWITCHING
		case('FREQUENCY_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_FREQUENCY_SWITCHING
		case('NUTATOR_SWITCHING')
			SwitchingMode_fromString = SwitchingMode_NUTATOR_SWITCHING
		case('CHOPPER_WHEEL')
			SwitchingMode_fromString = SwitchingMode_CHOPPER_WHEEL
		end select
	end function SwitchingMode_fromString



!
	function SynthProf_toString(i)
		integer :: i
		character*80 :: SynthProf_toString
		select case(i)
		case(SynthProf_NOSYNTH)
			SynthProf_toString = 'NOSYNTH'
		case(SynthProf_ACACORR)
			SynthProf_toString = 'ACACORR'
		case(SynthProf_ACA_CDP)
			SynthProf_toString = 'ACA_CDP'
		end select
	end function SynthProf_toString

!
	function SynthProf_fromString(str)
		integer :: SynthProf_fromString
		character*80 :: str
		select case(str)
		case('NOSYNTH')
			SynthProf_fromString = SynthProf_NOSYNTH
		case('ACACORR')
			SynthProf_fromString = SynthProf_ACACORR
		case('ACA_CDP')
			SynthProf_fromString = SynthProf_ACA_CDP
		end select
	end function SynthProf_fromString



!
	function SyscalMethod_toString(i)
		integer :: i
		character*80 :: SyscalMethod_toString
		select case(i)
		case(SyscalMethod_TEMPERATURE_SCALE)
			SyscalMethod_toString = 'TEMPERATURE_SCALE'
		case(SyscalMethod_SKYDIP)
			SyscalMethod_toString = 'SKYDIP'
		case(SyscalMethod_SIDEBAND_RATIO)
			SyscalMethod_toString = 'SIDEBAND_RATIO'
		end select
	end function SyscalMethod_toString

!
	function SyscalMethod_fromString(str)
		integer :: SyscalMethod_fromString
		character*80 :: str
		select case(str)
		case('TEMPERATURE_SCALE')
			SyscalMethod_fromString = SyscalMethod_TEMPERATURE_SCALE
		case('SKYDIP')
			SyscalMethod_fromString = SyscalMethod_SKYDIP
		case('SIDEBAND_RATIO')
			SyscalMethod_fromString = SyscalMethod_SIDEBAND_RATIO
		end select
	end function SyscalMethod_fromString



!
	function TimeSampling_toString(i)
		integer :: i
		character*80 :: TimeSampling_toString
		select case(i)
		case(TimeSampling_SUBINTEGRATION)
			TimeSampling_toString = 'SUBINTEGRATION'
		case(TimeSampling_INTEGRATION)
			TimeSampling_toString = 'INTEGRATION'
		end select
	end function TimeSampling_toString

!
	function TimeSampling_fromString(str)
		integer :: TimeSampling_fromString
		character*80 :: str
		select case(str)
		case('SUBINTEGRATION')
			TimeSampling_fromString = TimeSampling_SUBINTEGRATION
		case('INTEGRATION')
			TimeSampling_fromString = TimeSampling_INTEGRATION
		end select
	end function TimeSampling_fromString



!
	function TimeScale_toString(i)
		integer :: i
		character*80 :: TimeScale_toString
		select case(i)
		case(TimeScale_UTC)
			TimeScale_toString = 'UTC'
		case(TimeScale_TAI)
			TimeScale_toString = 'TAI'
		end select
	end function TimeScale_toString

!
	function TimeScale_fromString(str)
		integer :: TimeScale_fromString
		character*80 :: str
		select case(str)
		case('UTC')
			TimeScale_fromString = TimeScale_UTC
		case('TAI')
			TimeScale_fromString = TimeScale_TAI
		end select
	end function TimeScale_fromString



!
	function WeightType_toString(i)
		integer :: i
		character*80 :: WeightType_toString
		select case(i)
		case(WeightType_K)
			WeightType_toString = 'K'
		case(WeightType_JY)
			WeightType_toString = 'JY'
		case(WeightType_COUNT_WEIGHT)
			WeightType_toString = 'COUNT_WEIGHT'
		end select
	end function WeightType_toString

!
	function WeightType_fromString(str)
		integer :: WeightType_fromString
		character*80 :: str
		select case(str)
		case('K')
			WeightType_fromString = WeightType_K
		case('JY')
			WeightType_fromString = WeightType_JY
		case('COUNT_WEIGHT')
			WeightType_fromString = WeightType_COUNT_WEIGHT
		end select
	end function WeightType_fromString



!
	function WindowFunction_toString(i)
		integer :: i
		character*80 :: WindowFunction_toString
		select case(i)
		case(WindowFunction_UNIFORM)
			WindowFunction_toString = 'UNIFORM'
		case(WindowFunction_HANNING)
			WindowFunction_toString = 'HANNING'
		case(WindowFunction_HAMMING)
			WindowFunction_toString = 'HAMMING'
		case(WindowFunction_BARTLETT)
			WindowFunction_toString = 'BARTLETT'
		case(WindowFunction_BLACKMANN)
			WindowFunction_toString = 'BLACKMANN'
		case(WindowFunction_BLACKMANN_HARRIS)
			WindowFunction_toString = 'BLACKMANN_HARRIS'
		case(WindowFunction_WELCH)
			WindowFunction_toString = 'WELCH'
		end select
	end function WindowFunction_toString

!
	function WindowFunction_fromString(str)
		integer :: WindowFunction_fromString
		character*80 :: str
		select case(str)
		case('UNIFORM')
			WindowFunction_fromString = WindowFunction_UNIFORM
		case('HANNING')
			WindowFunction_fromString = WindowFunction_HANNING
		case('HAMMING')
			WindowFunction_fromString = WindowFunction_HAMMING
		case('BARTLETT')
			WindowFunction_fromString = WindowFunction_BARTLETT
		case('BLACKMANN')
			WindowFunction_fromString = WindowFunction_BLACKMANN
		case('BLACKMANN_HARRIS')
			WindowFunction_fromString = WindowFunction_BLACKMANN_HARRIS
		case('WELCH')
			WindowFunction_fromString = WindowFunction_WELCH
		end select
	end function WindowFunction_fromString



!
	function WVRMethod_toString(i)
		integer :: i
		character*80 :: WVRMethod_toString
		select case(i)
		case(WVRMethod_ATM_MODEL)
			WVRMethod_toString = 'ATM_MODEL'
		case(WVRMethod_EMPIRICAL)
			WVRMethod_toString = 'EMPIRICAL'
		end select
	end function WVRMethod_toString

!
	function WVRMethod_fromString(str)
		integer :: WVRMethod_fromString
		character*80 :: str
		select case(str)
		case('ATM_MODEL')
			WVRMethod_fromString = WVRMethod_ATM_MODEL
		case('EMPIRICAL')
			WVRMethod_fromString = WVRMethod_EMPIRICAL
		end select
	end function WVRMethod_fromString



end module sdm_Enumerations

