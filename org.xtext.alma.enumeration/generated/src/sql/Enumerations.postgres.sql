-- ALMA - Atacama Large Millimeter Array
-- (c) European Southern Observatory, 2002
-- (c) Associated Universities Inc., 2002
-- Copyright by ESO (in the framework of the ALMA collaboration),
-- Copyright by AUI (in the framework of the ALMA collaboration),
-- All rights reserved.
-- 
-- This library is free software; you can redistribute it and/or
-- modify it under the terms of the GNU Lesser General Public
-- License as published by the Free software Foundation; either
-- version 2.1 of the License, or (at your option) any later version.
-- 
-- This library is distributed in the hope that it will be useful,
-- but WITHOUT ANY WARRANTY, without even the implied warranty of
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
-- Lesser General Public License for more details.
-- 
-- You should have received a copy of the GNU Lesser General Public
-- License along with this library; if not, write to the Free Software
-- Foundation, Inc., 59 Temple Place, Suite 330, Boston,
-- MA 02111-1307  USA
-- 
-- /////////////////////////////////////////////////////////////////
-- // WARNING!  DO NOT MODIFY THIS FILE!                          //
-- //  ---------------------------------------------------------  //
-- // | This is generated code!  Do not modify this file.       | //
-- // | Any changes will be lost when the file is re-generated. | //
-- //  ---------------------------------------------------------  //
-- /////////////////////////////////////////////////////////////////
--
-- File Enumerations.postgres.sql



DROP TYPE IF EXISTS ACAPolarization ;
DROP TYPE IF EXISTS "ACAPolarization";
CREATE TYPE "ACAPolarization" AS ENUM (
	'ACA_STANDARD',
	'ACA_XX_YY_SUM',
	'ACA_XX_50',
	'ACA_YY_50'
);


DROP TYPE IF EXISTS AccumMode ;
DROP TYPE IF EXISTS "AccumMode";
CREATE TYPE "AccumMode" AS ENUM (
	'FAST',
	'NORMAL',
	'UNDEFINED'
);


DROP TYPE IF EXISTS AntennaMake ;
DROP TYPE IF EXISTS "AntennaMake";
CREATE TYPE "AntennaMake" AS ENUM (
	'AEM_12',
	'MITSUBISHI_7',
	'MITSUBISHI_12_A',
	'MITSUBISHI_12_B',
	'VERTEX_12_ATF',
	'AEM_12_ATF',
	'VERTEX_12',
	'IRAM_15',
	'UNDEFINED'
);


DROP TYPE IF EXISTS AntennaMotionPattern ;
DROP TYPE IF EXISTS "AntennaMotionPattern";
CREATE TYPE "AntennaMotionPattern" AS ENUM (
	'NONE',
	'CROSS_SCAN',
	'SPIRAL',
	'CIRCLE',
	'THREE_POINTS',
	'FOUR_POINTS',
	'FIVE_POINTS',
	'TEST',
	'UNSPECIFIED',
	'STAR',
	'LISSAJOUS'
);


DROP TYPE IF EXISTS AntennaType ;
DROP TYPE IF EXISTS "AntennaType";
CREATE TYPE "AntennaType" AS ENUM (
	'GROUND_BASED',
	'SPACE_BASED',
	'TRACKING_STN'
);


DROP TYPE IF EXISTS AssociatedCalNature ;
DROP TYPE IF EXISTS "AssociatedCalNature";
CREATE TYPE "AssociatedCalNature" AS ENUM (
	'ASSOCIATED_EXECBLOCK'
);


DROP TYPE IF EXISTS AssociatedFieldNature ;
DROP TYPE IF EXISTS "AssociatedFieldNature";
CREATE TYPE "AssociatedFieldNature" AS ENUM (
	'ON',
	'OFF',
	'PHASE_REFERENCE'
);


DROP TYPE IF EXISTS AtmPhaseCorrection ;
DROP TYPE IF EXISTS "AtmPhaseCorrection";
CREATE TYPE "AtmPhaseCorrection" AS ENUM (
	'AP_UNCORRECTED',
	'AP_CORRECTED'
);


DROP TYPE IF EXISTS AxisName ;
DROP TYPE IF EXISTS "AxisName";
CREATE TYPE "AxisName" AS ENUM (
	'TIM',
	'BAL',
	'ANT',
	'BAB',
	'SPW',
	'SIB',
	'SUB',
	'BIN',
	'APC',
	'SPP',
	'POL',
	'STO',
	'HOL'
);


DROP TYPE IF EXISTS BasebandName ;
DROP TYPE IF EXISTS "BasebandName";
CREATE TYPE "BasebandName" AS ENUM (
	'NOBB',
	'BB_1',
	'BB_2',
	'BB_3',
	'BB_4',
	'BB_5',
	'BB_6',
	'BB_7',
	'BB_8',
	'BB_ALL',
	'A1C1_3BIT',
	'A2C2_3BIT',
	'AC_8BIT',
	'B1D1_3BIT',
	'B2D2_3BIT',
	'BD_8BIT'
);


DROP TYPE IF EXISTS BaselineReferenceCode ;
DROP TYPE IF EXISTS "BaselineReferenceCode";
CREATE TYPE "BaselineReferenceCode" AS ENUM (
	'J2000',
	'B1950',
	'GALACTIC',
	'SUPERGAL',
	'ECLIPTIC',
	'JMEAN',
	'JTRUE',
	'APP',
	'BMEAN',
	'BTRUE',
	'JNAT',
	'MECLIPTIC',
	'TECLIPTIC',
	'TOPO',
	'MERCURY',
	'VENUS',
	'MARS',
	'JUPITER',
	'SATURN',
	'NEPTUN',
	'SUN',
	'MOON',
	'HADEC',
	'AZEL',
	'AZELGEO',
	'AZELSW',
	'AZELNE',
	'ITRF'
);


DROP TYPE IF EXISTS BinaryDataFlags ;
DROP TYPE IF EXISTS "BinaryDataFlags";
CREATE TYPE "BinaryDataFlags" AS ENUM (
	'INTEGRATION_FULLY_BLANKED',
	'WVR_APC',
	'CORRELATOR_MISSING_STATUS',
	'MISSING_ANTENNA_EVENT',
	'DELTA_SIGMA_OVERFLOW',
	'DELAY_CORRECTION_NOT_APPLIED',
	'SYNCRONIZATION_ERROR',
	'FFT_OVERFLOW',
	'TFB_SCALING_FACTOR_NOT_RETRIEVED',
	'ZERO_LAG_NOT_RECEIVED',
	'SIGMA_OVERFLOW',
	'UNUSABLE_CAI_OUTPUT',
	'QC_FAILED',
	'NOISY_TDM_CHANNELS',
	'SPECTRAL_NORMALIZATION_FAILED',
	'DROPPED_PACKETS',
	'DETECTOR_SATURATED',
	'NO_DATA_FROM_DIGITAL_POWER_METER',
	'RESERVED_18',
	'RESERVED_19',
	'RESERVED_20',
	'RESERVED_21',
	'RESERVED_22',
	'RESERVED_23',
	'RESERVED_24',
	'RESERVED_25',
	'RESERVED_26',
	'RESERVED_27',
	'RESERVED_28',
	'RESERVED_29',
	'RESERVED_30',
	'ALL_PURPOSE_ERROR'
);


DROP TYPE IF EXISTS CalCurveType ;
DROP TYPE IF EXISTS "CalCurveType";
CREATE TYPE "CalCurveType" AS ENUM (
	'AMPLITUDE',
	'PHASE',
	'UNDEFINED'
);


DROP TYPE IF EXISTS CalDataOrigin ;
DROP TYPE IF EXISTS "CalDataOrigin";
CREATE TYPE "CalDataOrigin" AS ENUM (
	'TOTAL_POWER',
	'WVR',
	'CHANNEL_AVERAGE_AUTO',
	'CHANNEL_AVERAGE_CROSS',
	'FULL_RESOLUTION_AUTO',
	'FULL_RESOLUTION_CROSS',
	'OPTICAL_POINTING',
	'HOLOGRAPHY',
	'NONE'
);


DROP TYPE IF EXISTS CalibrationDevice ;
DROP TYPE IF EXISTS "CalibrationDevice";
CREATE TYPE "CalibrationDevice" AS ENUM (
	'AMBIENT_LOAD',
	'COLD_LOAD',
	'HOT_LOAD',
	'NOISE_TUBE_LOAD',
	'QUARTER_WAVE_PLATE',
	'SOLAR_FILTER',
	'NONE'
);


DROP TYPE IF EXISTS CalibrationFunction ;
DROP TYPE IF EXISTS "CalibrationFunction";
CREATE TYPE "CalibrationFunction" AS ENUM (
	'FIRST',
	'LAST',
	'UNSPECIFIED'
);


DROP TYPE IF EXISTS CalibrationMode ;
DROP TYPE IF EXISTS "CalibrationMode";
CREATE TYPE "CalibrationMode" AS ENUM (
	'HOLOGRAPHY',
	'INTERFEROMETRY',
	'OPTICAL',
	'RADIOMETRY',
	'WVR'
);


DROP TYPE IF EXISTS CalibrationSet ;
DROP TYPE IF EXISTS "CalibrationSet";
CREATE TYPE "CalibrationSet" AS ENUM (
	'NONE',
	'AMPLI_CURVE',
	'ANTENNA_POSITIONS',
	'PHASE_CURVE',
	'POINTING_MODEL',
	'ACCUMULATE',
	'TEST',
	'UNSPECIFIED'
);


DROP TYPE IF EXISTS CalType ;
DROP TYPE IF EXISTS "CalType";
CREATE TYPE "CalType" AS ENUM (
	'CAL_AMPLI',
	'CAL_ATMOSPHERE',
	'CAL_BANDPASS',
	'CAL_CURVE',
	'CAL_DELAY',
	'CAL_FLUX',
	'CAL_FOCUS',
	'CAL_FOCUS_MODEL',
	'CAL_GAIN',
	'CAL_HOLOGRAPHY',
	'CAL_PHASE',
	'CAL_POINTING',
	'CAL_POINTING_MODEL',
	'CAL_POSITION',
	'CAL_PRIMARY_BEAM',
	'CAL_SEEING',
	'CAL_WVR',
	'CAL_APPPHASE'
);


DROP TYPE IF EXISTS CorrelationBit ;
DROP TYPE IF EXISTS "CorrelationBit";
CREATE TYPE "CorrelationBit" AS ENUM (
	'BITS_2x2',
	'BITS_3x3',
	'BITS_4x4'
);


DROP TYPE IF EXISTS CorrelationMode ;
DROP TYPE IF EXISTS "CorrelationMode";
CREATE TYPE "CorrelationMode" AS ENUM (
	'CROSS_ONLY',
	'AUTO_ONLY',
	'CROSS_AND_AUTO'
);


DROP TYPE IF EXISTS CorrelatorCalibration ;
DROP TYPE IF EXISTS "CorrelatorCalibration";
CREATE TYPE "CorrelatorCalibration" AS ENUM (
	'NONE',
	'CORRELATOR_CALIBRATION',
	'REAL_OBSERVATION'
);


DROP TYPE IF EXISTS CorrelatorName ;
DROP TYPE IF EXISTS "CorrelatorName";
CREATE TYPE "CorrelatorName" AS ENUM (
	'ALMA_ACA',
	'ALMA_BASELINE',
	'ALMA_BASELINE_ATF',
	'ALMA_BASELINE_PROTO_OSF',
	'HERSCHEL',
	'IRAM_PDB',
	'IRAM_30M_VESPA',
	'IRAM_WILMA',
	'NRAO_VLA',
	'NRAO_WIDAR'
);


DROP TYPE IF EXISTS CorrelatorType ;
DROP TYPE IF EXISTS "CorrelatorType";
CREATE TYPE "CorrelatorType" AS ENUM (
	'FX',
	'XF',
	'FXF'
);


DROP TYPE IF EXISTS DataContent ;
DROP TYPE IF EXISTS "DataContent";
CREATE TYPE "DataContent" AS ENUM (
	'CROSS_DATA',
	'AUTO_DATA',
	'ZERO_LAGS',
	'ACTUAL_TIMES',
	'ACTUAL_DURATIONS',
	'WEIGHTS',
	'FLAGS'
);


DROP TYPE IF EXISTS DataScale ;
DROP TYPE IF EXISTS "DataScale";
CREATE TYPE "DataScale" AS ENUM (
	'K',
	'JY',
	'CORRELATION',
	'CORRELATION_COEFFICIENT'
);


DROP TYPE IF EXISTS DetectorBandType ;
DROP TYPE IF EXISTS "DetectorBandType";
CREATE TYPE "DetectorBandType" AS ENUM (
	'BASEBAND',
	'DOWN_CONVERTER',
	'HOLOGRAPHY_RECEIVER',
	'SUBBAND'
);


DROP TYPE IF EXISTS DifferenceType ;
DROP TYPE IF EXISTS "DifferenceType";
CREATE TYPE "DifferenceType" AS ENUM (
	'PREDICTED',
	'PRELIMINARY',
	'RAPID',
	'FINAL'
);


DROP TYPE IF EXISTS DirectionReferenceCode ;
DROP TYPE IF EXISTS "DirectionReferenceCode";
CREATE TYPE "DirectionReferenceCode" AS ENUM (
	'J2000',
	'JMEAN',
	'JTRUE',
	'APP',
	'B1950',
	'B1950_VLA',
	'BMEAN',
	'BTRUE',
	'GALACTIC',
	'HADEC',
	'AZELSW',
	'AZELSWGEO',
	'AZELNE',
	'AZELNEGEO',
	'JNAT',
	'ECLIPTIC',
	'MECLIPTIC',
	'TECLIPTIC',
	'SUPERGAL',
	'ITRF',
	'TOPO',
	'ICRS',
	'MERCURY',
	'VENUS',
	'MARS',
	'JUPITER',
	'SATURN',
	'URANUS',
	'NEPTUNE',
	'PLUTO',
	'SUN',
	'MOON'
);


DROP TYPE IF EXISTS DopplerReferenceCode ;
DROP TYPE IF EXISTS "DopplerReferenceCode";
CREATE TYPE "DopplerReferenceCode" AS ENUM (
	'RADIO',
	'Z',
	'RATIO',
	'BETA',
	'GAMMA',
	'OPTICAL',
	'RELATIVISTIC'
);


DROP TYPE IF EXISTS DopplerTrackingMode ;
DROP TYPE IF EXISTS "DopplerTrackingMode";
CREATE TYPE "DopplerTrackingMode" AS ENUM (
	'NONE',
	'CONTINUOUS',
	'SCAN_BASED',
	'SB_BASED'
);


DROP TYPE IF EXISTS FieldCode ;
DROP TYPE IF EXISTS "FieldCode";
CREATE TYPE "FieldCode" AS ENUM (
	'NONE'
);


DROP TYPE IF EXISTS FilterMode ;
DROP TYPE IF EXISTS "FilterMode";
CREATE TYPE "FilterMode" AS ENUM (
	'FILTER_NA',
	'FILTER_TDM',
	'FILTER_TFB',
	'UNDEFINED'
);


DROP TYPE IF EXISTS FluxCalibrationMethod ;
DROP TYPE IF EXISTS "FluxCalibrationMethod";
CREATE TYPE "FluxCalibrationMethod" AS ENUM (
	'ABSOLUTE',
	'RELATIVE',
	'EFFICIENCY'
);


DROP TYPE IF EXISTS FocusMethod ;
DROP TYPE IF EXISTS "FocusMethod";
CREATE TYPE "FocusMethod" AS ENUM (
	'THREE_POINT',
	'FIVE_POINT',
	'HOLOGRAPHY'
);


DROP TYPE IF EXISTS FrequencyReferenceCode ;
DROP TYPE IF EXISTS "FrequencyReferenceCode";
CREATE TYPE "FrequencyReferenceCode" AS ENUM (
	'LABREST',
	'LSRD',
	'LSRK',
	'BARY',
	'REST',
	'GEO',
	'GALACTO',
	'TOPO'
);


DROP TYPE IF EXISTS HolographyChannelType ;
DROP TYPE IF EXISTS "HolographyChannelType";
CREATE TYPE "HolographyChannelType" AS ENUM (
	'Q2',
	'QR',
	'QS',
	'R2',
	'RS',
	'S2'
);


DROP TYPE IF EXISTS InvalidatingCondition ;
DROP TYPE IF EXISTS "InvalidatingCondition";
CREATE TYPE "InvalidatingCondition" AS ENUM (
	'ANTENNA_DISCONNECT',
	'ANTENNA_MOVE',
	'ANTENNA_POWER_DOWN',
	'RECEIVER_EXCHANGE',
	'RECEIVER_POWER_DOWN'
);


DROP TYPE IF EXISTS NetSideband ;
DROP TYPE IF EXISTS "NetSideband";
CREATE TYPE "NetSideband" AS ENUM (
	'NOSB',
	'LSB',
	'USB',
	'DSB'
);


DROP TYPE IF EXISTS PointingMethod ;
DROP TYPE IF EXISTS "PointingMethod";
CREATE TYPE "PointingMethod" AS ENUM (
	'THREE_POINT',
	'FOUR_POINT',
	'FIVE_POINT',
	'CROSS',
	'CIRCLE',
	'HOLOGRAPHY'
);


DROP TYPE IF EXISTS PointingModelMode ;
DROP TYPE IF EXISTS "PointingModelMode";
CREATE TYPE "PointingModelMode" AS ENUM (
	'RADIO',
	'OPTICAL'
);


DROP TYPE IF EXISTS PolarizationType ;
DROP TYPE IF EXISTS "PolarizationType";
CREATE TYPE "PolarizationType" AS ENUM (
	'R',
	'L',
	'X',
	'Y',
	'BOTH'
);


DROP TYPE IF EXISTS PositionMethod ;
DROP TYPE IF EXISTS "PositionMethod";
CREATE TYPE "PositionMethod" AS ENUM (
	'DELAY_FITTING',
	'PHASE_FITTING'
);


DROP TYPE IF EXISTS PositionReferenceCode ;
DROP TYPE IF EXISTS "PositionReferenceCode";
CREATE TYPE "PositionReferenceCode" AS ENUM (
	'ITRF',
	'WGS84',
	'SITE',
	'STATION',
	'YOKE',
	'REFLECTOR'
);


DROP TYPE IF EXISTS PrimaryBeamDescription ;
DROP TYPE IF EXISTS "PrimaryBeamDescription";
CREATE TYPE "PrimaryBeamDescription" AS ENUM (
	'COMPLEX_FIELD_PATTERN',
	'APERTURE_FIELD_DISTRIBUTION'
);


DROP TYPE IF EXISTS PrimitiveDataType ;
DROP TYPE IF EXISTS "PrimitiveDataType";
CREATE TYPE "PrimitiveDataType" AS ENUM (
	'INT16_TYPE',
	'INT32_TYPE',
	'INT64_TYPE',
	'FLOAT32_TYPE',
	'FLOAT64_TYPE'
);


DROP TYPE IF EXISTS ProcessorSubType ;
DROP TYPE IF EXISTS "ProcessorSubType";
CREATE TYPE "ProcessorSubType" AS ENUM (
	'ALMA_CORRELATOR_MODE',
	'SQUARE_LAW_DETECTOR',
	'HOLOGRAPHY',
	'ALMA_RADIOMETER'
);


DROP TYPE IF EXISTS ProcessorType ;
DROP TYPE IF EXISTS "ProcessorType";
CREATE TYPE "ProcessorType" AS ENUM (
	'CORRELATOR',
	'RADIOMETER',
	'SPECTROMETER'
);


DROP TYPE IF EXISTS RadialVelocityReferenceCode ;
DROP TYPE IF EXISTS "RadialVelocityReferenceCode";
CREATE TYPE "RadialVelocityReferenceCode" AS ENUM (
	'LSRD',
	'LSRK',
	'GALACTO',
	'BARY',
	'GEO',
	'TOPO'
);


DROP TYPE IF EXISTS ReceiverBand ;
DROP TYPE IF EXISTS "ReceiverBand";
CREATE TYPE "ReceiverBand" AS ENUM (
	'ALMA_RB_01',
	'ALMA_RB_02',
	'ALMA_RB_03',
	'ALMA_RB_04',
	'ALMA_RB_05',
	'ALMA_RB_06',
	'ALMA_RB_07',
	'ALMA_RB_08',
	'ALMA_RB_09',
	'ALMA_RB_10',
	'ALMA_RB_ALL',
	'ALMA_HOLOGRAPHY_RECEIVER',
	'BURE_01',
	'BURE_02',
	'BURE_03',
	'BURE_04',
	'EVLA_4',
	'EVLA_P',
	'EVLA_L',
	'EVLA_C',
	'EVLA_S',
	'EVLA_X',
	'EVLA_Ku',
	'EVLA_K',
	'EVLA_Ka',
	'EVLA_Q',
	'UNSPECIFIED'
);


DROP TYPE IF EXISTS ReceiverSideband ;
DROP TYPE IF EXISTS "ReceiverSideband";
CREATE TYPE "ReceiverSideband" AS ENUM (
	'NOSB',
	'DSB',
	'SSB',
	'TSB'
);


DROP TYPE IF EXISTS SBType ;
DROP TYPE IF EXISTS "SBType";
CREATE TYPE "SBType" AS ENUM (
	'OBSERVATORY',
	'OBSERVER',
	'EXPERT'
);


DROP TYPE IF EXISTS ScanIntent ;
DROP TYPE IF EXISTS "ScanIntent";
CREATE TYPE "ScanIntent" AS ENUM (
	'CALIBRATE_AMPLI',
	'CALIBRATE_ATMOSPHERE',
	'CALIBRATE_BANDPASS',
	'CALIBRATE_DELAY',
	'CALIBRATE_FLUX',
	'CALIBRATE_FOCUS',
	'CALIBRATE_FOCUS_X',
	'CALIBRATE_FOCUS_Y',
	'CALIBRATE_PHASE',
	'CALIBRATE_POINTING',
	'CALIBRATE_POLARIZATION',
	'CALIBRATE_SIDEBAND_RATIO',
	'CALIBRATE_WVR',
	'DO_SKYDIP',
	'MAP_ANTENNA_SURFACE',
	'MAP_PRIMARY_BEAM',
	'OBSERVE_TARGET',
	'CALIBRATE_POL_LEAKAGE',
	'CALIBRATE_POL_ANGLE',
	'TEST',
	'UNSPECIFIED',
	'CALIBRATE_ANTENNA_POSITION',
	'CALIBRATE_ANTENNA_PHASE',
	'MEASURE_RFI',
	'CALIBRATE_ANTENNA_POINTING_MODEL',
	'SYSTEM_CONFIGURATION',
	'CALIBRATE_APPPHASE_ACTIVE',
	'CALIBRATE_APPPHASE_PASSIVE',
	'OBSERVE_CHECK_SOURCE',
	'CALIBRATE_DIFFGAIN'
);


DROP TYPE IF EXISTS SchedulerMode ;
DROP TYPE IF EXISTS "SchedulerMode";
CREATE TYPE "SchedulerMode" AS ENUM (
	'DYNAMIC',
	'INTERACTIVE',
	'MANUAL',
	'QUEUED'
);


DROP TYPE IF EXISTS SidebandProcessingMode ;
DROP TYPE IF EXISTS "SidebandProcessingMode";
CREATE TYPE "SidebandProcessingMode" AS ENUM (
	'NONE',
	'PHASE_SWITCH_SEPARATION',
	'FREQUENCY_OFFSET_SEPARATION',
	'PHASE_SWITCH_REJECTION',
	'FREQUENCY_OFFSET_REJECTION'
);


DROP TYPE IF EXISTS SourceModel ;
DROP TYPE IF EXISTS "SourceModel";
CREATE TYPE "SourceModel" AS ENUM (
	'GAUSSIAN',
	'POINT',
	'DISK'
);


DROP TYPE IF EXISTS SpectralResolutionType ;
DROP TYPE IF EXISTS "SpectralResolutionType";
CREATE TYPE "SpectralResolutionType" AS ENUM (
	'CHANNEL_AVERAGE',
	'BASEBAND_WIDE',
	'FULL_RESOLUTION'
);


DROP TYPE IF EXISTS StationType ;
DROP TYPE IF EXISTS "StationType";
CREATE TYPE "StationType" AS ENUM (
	'ANTENNA_PAD',
	'MAINTENANCE_PAD',
	'WEATHER_STATION'
);


DROP TYPE IF EXISTS StokesParameter ;
DROP TYPE IF EXISTS "StokesParameter";
CREATE TYPE "StokesParameter" AS ENUM (
	'I',
	'Q',
	'U',
	'V',
	'RR',
	'RL',
	'LR',
	'LL',
	'XX',
	'XY',
	'YX',
	'YY',
	'RX',
	'RY',
	'LX',
	'LY',
	'XR',
	'XL',
	'YR',
	'YL',
	'PP',
	'PQ',
	'QP',
	'QQ',
	'RCIRCULAR',
	'LCIRCULAR',
	'LINEAR',
	'PTOTAL',
	'PLINEAR',
	'PFTOTAL',
	'PFLINEAR',
	'PANGLE'
);


DROP TYPE IF EXISTS SubscanIntent ;
DROP TYPE IF EXISTS "SubscanIntent";
CREATE TYPE "SubscanIntent" AS ENUM (
	'ON_SOURCE',
	'OFF_SOURCE',
	'MIXED',
	'REFERENCE',
	'SCANNING',
	'HOT',
	'AMBIENT',
	'SIGNAL',
	'IMAGE',
	'TEST',
	'UNSPECIFIED'
);


DROP TYPE IF EXISTS SwitchingMode ;
DROP TYPE IF EXISTS "SwitchingMode";
CREATE TYPE "SwitchingMode" AS ENUM (
	'NO_SWITCHING',
	'LOAD_SWITCHING',
	'POSITION_SWITCHING',
	'PHASE_SWITCHING',
	'FREQUENCY_SWITCHING',
	'NUTATOR_SWITCHING',
	'CHOPPER_WHEEL'
);


DROP TYPE IF EXISTS SynthProf ;
DROP TYPE IF EXISTS "SynthProf";
CREATE TYPE "SynthProf" AS ENUM (
	'NOSYNTH',
	'ACACORR',
	'ACA_CDP'
);


DROP TYPE IF EXISTS SyscalMethod ;
DROP TYPE IF EXISTS "SyscalMethod";
CREATE TYPE "SyscalMethod" AS ENUM (
	'TEMPERATURE_SCALE',
	'SKYDIP',
	'SIDEBAND_RATIO'
);


DROP TYPE IF EXISTS TimeSampling ;
DROP TYPE IF EXISTS "TimeSampling";
CREATE TYPE "TimeSampling" AS ENUM (
	'SUBINTEGRATION',
	'INTEGRATION'
);


DROP TYPE IF EXISTS TimeScale ;
DROP TYPE IF EXISTS "TimeScale";
CREATE TYPE "TimeScale" AS ENUM (
	'UTC',
	'TAI'
);


DROP TYPE IF EXISTS WeightType ;
DROP TYPE IF EXISTS "WeightType";
CREATE TYPE "WeightType" AS ENUM (
	'K',
	'JY',
	'COUNT_WEIGHT'
);


DROP TYPE IF EXISTS WindowFunction ;
DROP TYPE IF EXISTS "WindowFunction";
CREATE TYPE "WindowFunction" AS ENUM (
	'UNIFORM',
	'HANNING',
	'HAMMING',
	'BARTLETT',
	'BLACKMANN',
	'BLACKMANN_HARRIS',
	'WELCH'
);


DROP TYPE IF EXISTS WVRMethod ;
DROP TYPE IF EXISTS "WVRMethod";
CREATE TYPE "WVRMethod" AS ENUM (
	'ATM_MODEL',
	'EMPIRICAL'
);

