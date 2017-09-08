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
-- File createAndPopulateEnumerations.sql

--
-----------------------------------ACAPolarization---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ACAPolarization
CREATE TABLE ASDM_ENUM_ACAPolarization(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ACAPolarization (id, name) values (0, "ACA_STANDARD");,
INSERT INTO ASDM_ENUM_ACAPolarization (id, name) values (1, "ACA_XX_YY_SUM");,
INSERT INTO ASDM_ENUM_ACAPolarization (id, name) values (2, "ACA_XX_50");,
INSERT INTO ASDM_ENUM_ACAPolarization (id, name) values (3, "ACA_YY_50");
--
-----------------------------------AccumMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AccumMode
CREATE TABLE ASDM_ENUM_AccumMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AccumMode (id, name) values (0, "FAST");,
INSERT INTO ASDM_ENUM_AccumMode (id, name) values (1, "NORMAL");,
INSERT INTO ASDM_ENUM_AccumMode (id, name) values (2, "UNDEFINED");
--
-----------------------------------AntennaMake---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AntennaMake
CREATE TABLE ASDM_ENUM_AntennaMake(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (0, "AEM_12");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (1, "MITSUBISHI_7");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (2, "MITSUBISHI_12_A");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (3, "MITSUBISHI_12_B");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (4, "VERTEX_12_ATF");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (5, "AEM_12_ATF");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (6, "VERTEX_12");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (7, "IRAM_15");,
INSERT INTO ASDM_ENUM_AntennaMake (id, name) values (8, "UNDEFINED");
--
-----------------------------------AntennaMotionPattern---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AntennaMotionPattern
CREATE TABLE ASDM_ENUM_AntennaMotionPattern(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (0, "NONE");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (1, "CROSS_SCAN");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (2, "SPIRAL");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (3, "CIRCLE");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (4, "THREE_POINTS");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (5, "FOUR_POINTS");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (6, "FIVE_POINTS");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (7, "TEST");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (8, "UNSPECIFIED");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (9, "STAR");,
INSERT INTO ASDM_ENUM_AntennaMotionPattern (id, name) values (10, "LISSAJOUS");
--
-----------------------------------AntennaType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AntennaType
CREATE TABLE ASDM_ENUM_AntennaType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AntennaType (id, name) values (0, "GROUND_BASED");,
INSERT INTO ASDM_ENUM_AntennaType (id, name) values (1, "SPACE_BASED");,
INSERT INTO ASDM_ENUM_AntennaType (id, name) values (2, "TRACKING_STN");
--
-----------------------------------AssociatedCalNature---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AssociatedCalNature
CREATE TABLE ASDM_ENUM_AssociatedCalNature(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AssociatedCalNature (id, name) values (0, "ASSOCIATED_EXECBLOCK");
--
-----------------------------------AssociatedFieldNature---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AssociatedFieldNature
CREATE TABLE ASDM_ENUM_AssociatedFieldNature(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AssociatedFieldNature (id, name) values (0, "ON");,
INSERT INTO ASDM_ENUM_AssociatedFieldNature (id, name) values (1, "OFF");,
INSERT INTO ASDM_ENUM_AssociatedFieldNature (id, name) values (2, "PHASE_REFERENCE");
--
-----------------------------------AtmPhaseCorrection---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AtmPhaseCorrection
CREATE TABLE ASDM_ENUM_AtmPhaseCorrection(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AtmPhaseCorrection (id, name) values (0, "AP_UNCORRECTED");,
INSERT INTO ASDM_ENUM_AtmPhaseCorrection (id, name) values (1, "AP_CORRECTED");
--
-----------------------------------AxisName---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_AxisName
CREATE TABLE ASDM_ENUM_AxisName(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_AxisName (id, name) values (0, "TIM");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (1, "BAL");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (2, "ANT");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (3, "BAB");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (4, "SPW");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (5, "SIB");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (6, "SUB");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (7, "BIN");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (8, "APC");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (9, "SPP");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (10, "POL");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (11, "STO");,
INSERT INTO ASDM_ENUM_AxisName (id, name) values (12, "HOL");
--
-----------------------------------BasebandName---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_BasebandName
CREATE TABLE ASDM_ENUM_BasebandName(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (0, "NOBB");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (1, "BB_1");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (2, "BB_2");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (3, "BB_3");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (4, "BB_4");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (5, "BB_5");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (6, "BB_6");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (7, "BB_7");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (8, "BB_8");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (9, "BB_ALL");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (10, "A1C1_3BIT");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (11, "A2C2_3BIT");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (12, "AC_8BIT");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (13, "B1D1_3BIT");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (14, "B2D2_3BIT");,
INSERT INTO ASDM_ENUM_BasebandName (id, name) values (15, "BD_8BIT");
--
-----------------------------------BaselineReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_BaselineReferenceCode
CREATE TABLE ASDM_ENUM_BaselineReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (0, "J2000");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (1, "B1950");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (2, "GALACTIC");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (3, "SUPERGAL");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (4, "ECLIPTIC");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (5, "JMEAN");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (6, "JTRUE");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (7, "APP");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (8, "BMEAN");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (9, "BTRUE");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (10, "JNAT");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (11, "MECLIPTIC");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (12, "TECLIPTIC");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (13, "TOPO");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (14, "MERCURY");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (15, "VENUS");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (16, "MARS");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (17, "JUPITER");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (18, "SATURN");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (19, "NEPTUN");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (20, "SUN");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (21, "MOON");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (22, "HADEC");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (23, "AZEL");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (24, "AZELGEO");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (25, "AZELSW");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (26, "AZELNE");,
INSERT INTO ASDM_ENUM_BaselineReferenceCode (id, name) values (27, "ITRF");
--
-----------------------------------BinaryDataFlags---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_BinaryDataFlags
CREATE TABLE ASDM_ENUM_BinaryDataFlags(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (0, "INTEGRATION_FULLY_BLANKED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (1, "WVR_APC");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (2, "CORRELATOR_MISSING_STATUS");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (3, "MISSING_ANTENNA_EVENT");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (4, "DELTA_SIGMA_OVERFLOW");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (5, "DELAY_CORRECTION_NOT_APPLIED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (6, "SYNCRONIZATION_ERROR");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (7, "FFT_OVERFLOW");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (8, "TFB_SCALING_FACTOR_NOT_RETRIEVED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (9, "ZERO_LAG_NOT_RECEIVED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (10, "SIGMA_OVERFLOW");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (11, "UNUSABLE_CAI_OUTPUT");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (12, "QC_FAILED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (13, "NOISY_TDM_CHANNELS");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (14, "SPECTRAL_NORMALIZATION_FAILED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (15, "DROPPED_PACKETS");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (16, "DETECTOR_SATURATED");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (17, "NO_DATA_FROM_DIGITAL_POWER_METER");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (18, "RESERVED_18");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (19, "RESERVED_19");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (20, "RESERVED_20");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (21, "RESERVED_21");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (22, "RESERVED_22");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (23, "RESERVED_23");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (24, "RESERVED_24");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (25, "RESERVED_25");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (26, "RESERVED_26");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (27, "RESERVED_27");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (28, "RESERVED_28");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (29, "RESERVED_29");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (30, "RESERVED_30");,
INSERT INTO ASDM_ENUM_BinaryDataFlags (id, name) values (31, "ALL_PURPOSE_ERROR");
--
-----------------------------------CalCurveType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalCurveType
CREATE TABLE ASDM_ENUM_CalCurveType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalCurveType (id, name) values (0, "AMPLITUDE");,
INSERT INTO ASDM_ENUM_CalCurveType (id, name) values (1, "PHASE");,
INSERT INTO ASDM_ENUM_CalCurveType (id, name) values (2, "UNDEFINED");
--
-----------------------------------CalDataOrigin---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalDataOrigin
CREATE TABLE ASDM_ENUM_CalDataOrigin(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (0, "TOTAL_POWER");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (1, "WVR");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (2, "CHANNEL_AVERAGE_AUTO");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (3, "CHANNEL_AVERAGE_CROSS");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (4, "FULL_RESOLUTION_AUTO");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (5, "FULL_RESOLUTION_CROSS");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (6, "OPTICAL_POINTING");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (7, "HOLOGRAPHY");,
INSERT INTO ASDM_ENUM_CalDataOrigin (id, name) values (8, "NONE");
--
-----------------------------------CalibrationDevice---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalibrationDevice
CREATE TABLE ASDM_ENUM_CalibrationDevice(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (0, "AMBIENT_LOAD");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (1, "COLD_LOAD");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (2, "HOT_LOAD");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (3, "NOISE_TUBE_LOAD");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (4, "QUARTER_WAVE_PLATE");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (5, "SOLAR_FILTER");,
INSERT INTO ASDM_ENUM_CalibrationDevice (id, name) values (6, "NONE");
--
-----------------------------------CalibrationFunction---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalibrationFunction
CREATE TABLE ASDM_ENUM_CalibrationFunction(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalibrationFunction (id, name) values (0, "FIRST");,
INSERT INTO ASDM_ENUM_CalibrationFunction (id, name) values (1, "LAST");,
INSERT INTO ASDM_ENUM_CalibrationFunction (id, name) values (2, "UNSPECIFIED");
--
-----------------------------------CalibrationMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalibrationMode
CREATE TABLE ASDM_ENUM_CalibrationMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalibrationMode (id, name) values (0, "HOLOGRAPHY");,
INSERT INTO ASDM_ENUM_CalibrationMode (id, name) values (1, "INTERFEROMETRY");,
INSERT INTO ASDM_ENUM_CalibrationMode (id, name) values (2, "OPTICAL");,
INSERT INTO ASDM_ENUM_CalibrationMode (id, name) values (3, "RADIOMETRY");,
INSERT INTO ASDM_ENUM_CalibrationMode (id, name) values (4, "WVR");
--
-----------------------------------CalibrationSet---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalibrationSet
CREATE TABLE ASDM_ENUM_CalibrationSet(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (0, "NONE");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (1, "AMPLI_CURVE");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (2, "ANTENNA_POSITIONS");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (3, "PHASE_CURVE");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (4, "POINTING_MODEL");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (5, "ACCUMULATE");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (6, "TEST");,
INSERT INTO ASDM_ENUM_CalibrationSet (id, name) values (7, "UNSPECIFIED");
--
-----------------------------------CalType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CalType
CREATE TABLE ASDM_ENUM_CalType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CalType (id, name) values (0, "CAL_AMPLI");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (1, "CAL_ATMOSPHERE");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (2, "CAL_BANDPASS");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (3, "CAL_CURVE");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (4, "CAL_DELAY");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (5, "CAL_FLUX");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (6, "CAL_FOCUS");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (7, "CAL_FOCUS_MODEL");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (8, "CAL_GAIN");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (9, "CAL_HOLOGRAPHY");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (10, "CAL_PHASE");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (11, "CAL_POINTING");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (12, "CAL_POINTING_MODEL");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (13, "CAL_POSITION");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (14, "CAL_PRIMARY_BEAM");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (15, "CAL_SEEING");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (16, "CAL_WVR");,
INSERT INTO ASDM_ENUM_CalType (id, name) values (17, "CAL_APPPHASE");
--
-----------------------------------CorrelationBit---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CorrelationBit
CREATE TABLE ASDM_ENUM_CorrelationBit(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CorrelationBit (id, name) values (0, "BITS_2x2");,
INSERT INTO ASDM_ENUM_CorrelationBit (id, name) values (1, "BITS_3x3");,
INSERT INTO ASDM_ENUM_CorrelationBit (id, name) values (2, "BITS_4x4");
--
-----------------------------------CorrelationMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CorrelationMode
CREATE TABLE ASDM_ENUM_CorrelationMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CorrelationMode (id, name) values (0, "CROSS_ONLY");,
INSERT INTO ASDM_ENUM_CorrelationMode (id, name) values (1, "AUTO_ONLY");,
INSERT INTO ASDM_ENUM_CorrelationMode (id, name) values (2, "CROSS_AND_AUTO");
--
-----------------------------------CorrelatorCalibration---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CorrelatorCalibration
CREATE TABLE ASDM_ENUM_CorrelatorCalibration(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CorrelatorCalibration (id, name) values (0, "NONE");,
INSERT INTO ASDM_ENUM_CorrelatorCalibration (id, name) values (1, "CORRELATOR_CALIBRATION");,
INSERT INTO ASDM_ENUM_CorrelatorCalibration (id, name) values (2, "REAL_OBSERVATION");
--
-----------------------------------CorrelatorName---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CorrelatorName
CREATE TABLE ASDM_ENUM_CorrelatorName(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (0, "ALMA_ACA");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (1, "ALMA_BASELINE");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (2, "ALMA_BASELINE_ATF");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (3, "ALMA_BASELINE_PROTO_OSF");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (4, "HERSCHEL");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (5, "IRAM_PDB");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (6, "IRAM_30M_VESPA");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (7, "IRAM_WILMA");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (8, "NRAO_VLA");,
INSERT INTO ASDM_ENUM_CorrelatorName (id, name) values (9, "NRAO_WIDAR");
--
-----------------------------------CorrelatorType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_CorrelatorType
CREATE TABLE ASDM_ENUM_CorrelatorType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_CorrelatorType (id, name) values (0, "FX");,
INSERT INTO ASDM_ENUM_CorrelatorType (id, name) values (1, "XF");,
INSERT INTO ASDM_ENUM_CorrelatorType (id, name) values (2, "FXF");
--
-----------------------------------DataContent---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DataContent
CREATE TABLE ASDM_ENUM_DataContent(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DataContent (id, name) values (0, "CROSS_DATA");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (1, "AUTO_DATA");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (2, "ZERO_LAGS");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (3, "ACTUAL_TIMES");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (4, "ACTUAL_DURATIONS");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (5, "WEIGHTS");,
INSERT INTO ASDM_ENUM_DataContent (id, name) values (6, "FLAGS");
--
-----------------------------------DataScale---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DataScale
CREATE TABLE ASDM_ENUM_DataScale(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DataScale (id, name) values (0, "K");,
INSERT INTO ASDM_ENUM_DataScale (id, name) values (1, "JY");,
INSERT INTO ASDM_ENUM_DataScale (id, name) values (2, "CORRELATION");,
INSERT INTO ASDM_ENUM_DataScale (id, name) values (3, "CORRELATION_COEFFICIENT");
--
-----------------------------------DetectorBandType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DetectorBandType
CREATE TABLE ASDM_ENUM_DetectorBandType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DetectorBandType (id, name) values (0, "BASEBAND");,
INSERT INTO ASDM_ENUM_DetectorBandType (id, name) values (1, "DOWN_CONVERTER");,
INSERT INTO ASDM_ENUM_DetectorBandType (id, name) values (2, "HOLOGRAPHY_RECEIVER");,
INSERT INTO ASDM_ENUM_DetectorBandType (id, name) values (3, "SUBBAND");
--
-----------------------------------DifferenceType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DifferenceType
CREATE TABLE ASDM_ENUM_DifferenceType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DifferenceType (id, name) values (0, "PREDICTED");,
INSERT INTO ASDM_ENUM_DifferenceType (id, name) values (1, "PRELIMINARY");,
INSERT INTO ASDM_ENUM_DifferenceType (id, name) values (2, "RAPID");,
INSERT INTO ASDM_ENUM_DifferenceType (id, name) values (3, "FINAL");
--
-----------------------------------DirectionReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DirectionReferenceCode
CREATE TABLE ASDM_ENUM_DirectionReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (0, "J2000");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (1, "JMEAN");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (2, "JTRUE");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (3, "APP");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (4, "B1950");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (5, "B1950_VLA");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (6, "BMEAN");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (7, "BTRUE");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (8, "GALACTIC");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (9, "HADEC");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (10, "AZELSW");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (11, "AZELSWGEO");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (12, "AZELNE");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (13, "AZELNEGEO");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (14, "JNAT");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (15, "ECLIPTIC");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (16, "MECLIPTIC");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (17, "TECLIPTIC");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (18, "SUPERGAL");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (19, "ITRF");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (20, "TOPO");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (21, "ICRS");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (22, "MERCURY");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (23, "VENUS");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (24, "MARS");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (25, "JUPITER");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (26, "SATURN");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (27, "URANUS");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (28, "NEPTUNE");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (29, "PLUTO");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (30, "SUN");,
INSERT INTO ASDM_ENUM_DirectionReferenceCode (id, name) values (31, "MOON");
--
-----------------------------------DopplerReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DopplerReferenceCode
CREATE TABLE ASDM_ENUM_DopplerReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (0, "RADIO");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (1, "Z");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (2, "RATIO");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (3, "BETA");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (4, "GAMMA");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (5, "OPTICAL");,
INSERT INTO ASDM_ENUM_DopplerReferenceCode (id, name) values (6, "RELATIVISTIC");
--
-----------------------------------DopplerTrackingMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_DopplerTrackingMode
CREATE TABLE ASDM_ENUM_DopplerTrackingMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_DopplerTrackingMode (id, name) values (0, "NONE");,
INSERT INTO ASDM_ENUM_DopplerTrackingMode (id, name) values (1, "CONTINUOUS");,
INSERT INTO ASDM_ENUM_DopplerTrackingMode (id, name) values (2, "SCAN_BASED");,
INSERT INTO ASDM_ENUM_DopplerTrackingMode (id, name) values (3, "SB_BASED");
--
-----------------------------------FieldCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_FieldCode
CREATE TABLE ASDM_ENUM_FieldCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_FieldCode (id, name) values (0, "NONE");
--
-----------------------------------FilterMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_FilterMode
CREATE TABLE ASDM_ENUM_FilterMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_FilterMode (id, name) values (0, "FILTER_NA");,
INSERT INTO ASDM_ENUM_FilterMode (id, name) values (1, "FILTER_TDM");,
INSERT INTO ASDM_ENUM_FilterMode (id, name) values (2, "FILTER_TFB");,
INSERT INTO ASDM_ENUM_FilterMode (id, name) values (3, "UNDEFINED");
--
-----------------------------------FluxCalibrationMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_FluxCalibrationMethod
CREATE TABLE ASDM_ENUM_FluxCalibrationMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_FluxCalibrationMethod (id, name) values (0, "ABSOLUTE");,
INSERT INTO ASDM_ENUM_FluxCalibrationMethod (id, name) values (1, "RELATIVE");,
INSERT INTO ASDM_ENUM_FluxCalibrationMethod (id, name) values (2, "EFFICIENCY");
--
-----------------------------------FocusMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_FocusMethod
CREATE TABLE ASDM_ENUM_FocusMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_FocusMethod (id, name) values (0, "THREE_POINT");,
INSERT INTO ASDM_ENUM_FocusMethod (id, name) values (1, "FIVE_POINT");,
INSERT INTO ASDM_ENUM_FocusMethod (id, name) values (2, "HOLOGRAPHY");
--
-----------------------------------FrequencyReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_FrequencyReferenceCode
CREATE TABLE ASDM_ENUM_FrequencyReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (0, "LABREST");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (1, "LSRD");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (2, "LSRK");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (3, "BARY");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (4, "REST");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (5, "GEO");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (6, "GALACTO");,
INSERT INTO ASDM_ENUM_FrequencyReferenceCode (id, name) values (7, "TOPO");
--
-----------------------------------HolographyChannelType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_HolographyChannelType
CREATE TABLE ASDM_ENUM_HolographyChannelType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (0, "Q2");,
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (1, "QR");,
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (2, "QS");,
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (3, "R2");,
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (4, "RS");,
INSERT INTO ASDM_ENUM_HolographyChannelType (id, name) values (5, "S2");
--
-----------------------------------InvalidatingCondition---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_InvalidatingCondition
CREATE TABLE ASDM_ENUM_InvalidatingCondition(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_InvalidatingCondition (id, name) values (0, "ANTENNA_DISCONNECT");,
INSERT INTO ASDM_ENUM_InvalidatingCondition (id, name) values (1, "ANTENNA_MOVE");,
INSERT INTO ASDM_ENUM_InvalidatingCondition (id, name) values (2, "ANTENNA_POWER_DOWN");,
INSERT INTO ASDM_ENUM_InvalidatingCondition (id, name) values (3, "RECEIVER_EXCHANGE");,
INSERT INTO ASDM_ENUM_InvalidatingCondition (id, name) values (4, "RECEIVER_POWER_DOWN");
--
-----------------------------------NetSideband---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_NetSideband
CREATE TABLE ASDM_ENUM_NetSideband(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_NetSideband (id, name) values (0, "NOSB");,
INSERT INTO ASDM_ENUM_NetSideband (id, name) values (1, "LSB");,
INSERT INTO ASDM_ENUM_NetSideband (id, name) values (2, "USB");,
INSERT INTO ASDM_ENUM_NetSideband (id, name) values (3, "DSB");
--
-----------------------------------PointingMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PointingMethod
CREATE TABLE ASDM_ENUM_PointingMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (0, "THREE_POINT");,
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (1, "FOUR_POINT");,
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (2, "FIVE_POINT");,
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (3, "CROSS");,
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (4, "CIRCLE");,
INSERT INTO ASDM_ENUM_PointingMethod (id, name) values (5, "HOLOGRAPHY");
--
-----------------------------------PointingModelMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PointingModelMode
CREATE TABLE ASDM_ENUM_PointingModelMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PointingModelMode (id, name) values (0, "RADIO");,
INSERT INTO ASDM_ENUM_PointingModelMode (id, name) values (1, "OPTICAL");
--
-----------------------------------PolarizationType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PolarizationType
CREATE TABLE ASDM_ENUM_PolarizationType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PolarizationType (id, name) values (0, "R");,
INSERT INTO ASDM_ENUM_PolarizationType (id, name) values (1, "L");,
INSERT INTO ASDM_ENUM_PolarizationType (id, name) values (2, "X");,
INSERT INTO ASDM_ENUM_PolarizationType (id, name) values (3, "Y");,
INSERT INTO ASDM_ENUM_PolarizationType (id, name) values (4, "BOTH");
--
-----------------------------------PositionMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PositionMethod
CREATE TABLE ASDM_ENUM_PositionMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PositionMethod (id, name) values (0, "DELAY_FITTING");,
INSERT INTO ASDM_ENUM_PositionMethod (id, name) values (1, "PHASE_FITTING");
--
-----------------------------------PositionReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PositionReferenceCode
CREATE TABLE ASDM_ENUM_PositionReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (0, "ITRF");,
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (1, "WGS84");,
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (2, "SITE");,
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (3, "STATION");,
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (4, "YOKE");,
INSERT INTO ASDM_ENUM_PositionReferenceCode (id, name) values (5, "REFLECTOR");
--
-----------------------------------PrimaryBeamDescription---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PrimaryBeamDescription
CREATE TABLE ASDM_ENUM_PrimaryBeamDescription(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PrimaryBeamDescription (id, name) values (0, "COMPLEX_FIELD_PATTERN");,
INSERT INTO ASDM_ENUM_PrimaryBeamDescription (id, name) values (1, "APERTURE_FIELD_DISTRIBUTION");
--
-----------------------------------PrimitiveDataType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_PrimitiveDataType
CREATE TABLE ASDM_ENUM_PrimitiveDataType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_PrimitiveDataType (id, name) values (0, "INT16_TYPE");,
INSERT INTO ASDM_ENUM_PrimitiveDataType (id, name) values (1, "INT32_TYPE");,
INSERT INTO ASDM_ENUM_PrimitiveDataType (id, name) values (2, "INT64_TYPE");,
INSERT INTO ASDM_ENUM_PrimitiveDataType (id, name) values (3, "FLOAT32_TYPE");,
INSERT INTO ASDM_ENUM_PrimitiveDataType (id, name) values (4, "FLOAT64_TYPE");
--
-----------------------------------ProcessorSubType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ProcessorSubType
CREATE TABLE ASDM_ENUM_ProcessorSubType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ProcessorSubType (id, name) values (0, "ALMA_CORRELATOR_MODE");,
INSERT INTO ASDM_ENUM_ProcessorSubType (id, name) values (1, "SQUARE_LAW_DETECTOR");,
INSERT INTO ASDM_ENUM_ProcessorSubType (id, name) values (2, "HOLOGRAPHY");,
INSERT INTO ASDM_ENUM_ProcessorSubType (id, name) values (3, "ALMA_RADIOMETER");
--
-----------------------------------ProcessorType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ProcessorType
CREATE TABLE ASDM_ENUM_ProcessorType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ProcessorType (id, name) values (0, "CORRELATOR");,
INSERT INTO ASDM_ENUM_ProcessorType (id, name) values (1, "RADIOMETER");,
INSERT INTO ASDM_ENUM_ProcessorType (id, name) values (2, "SPECTROMETER");
--
-----------------------------------RadialVelocityReferenceCode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_RadialVelocityReferenceCode
CREATE TABLE ASDM_ENUM_RadialVelocityReferenceCode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (0, "LSRD");,
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (1, "LSRK");,
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (2, "GALACTO");,
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (3, "BARY");,
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (4, "GEO");,
INSERT INTO ASDM_ENUM_RadialVelocityReferenceCode (id, name) values (5, "TOPO");
--
-----------------------------------ReceiverBand---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ReceiverBand
CREATE TABLE ASDM_ENUM_ReceiverBand(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (0, "ALMA_RB_01");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (1, "ALMA_RB_02");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (2, "ALMA_RB_03");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (3, "ALMA_RB_04");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (4, "ALMA_RB_05");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (5, "ALMA_RB_06");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (6, "ALMA_RB_07");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (7, "ALMA_RB_08");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (8, "ALMA_RB_09");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (9, "ALMA_RB_10");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (10, "ALMA_RB_ALL");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (11, "ALMA_HOLOGRAPHY_RECEIVER");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (12, "BURE_01");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (13, "BURE_02");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (14, "BURE_03");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (15, "BURE_04");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (16, "EVLA_4");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (17, "EVLA_P");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (18, "EVLA_L");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (19, "EVLA_C");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (20, "EVLA_S");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (21, "EVLA_X");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (22, "EVLA_Ku");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (23, "EVLA_K");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (24, "EVLA_Ka");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (25, "EVLA_Q");,
INSERT INTO ASDM_ENUM_ReceiverBand (id, name) values (26, "UNSPECIFIED");
--
-----------------------------------ReceiverSideband---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ReceiverSideband
CREATE TABLE ASDM_ENUM_ReceiverSideband(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ReceiverSideband (id, name) values (0, "NOSB");,
INSERT INTO ASDM_ENUM_ReceiverSideband (id, name) values (1, "DSB");,
INSERT INTO ASDM_ENUM_ReceiverSideband (id, name) values (2, "SSB");,
INSERT INTO ASDM_ENUM_ReceiverSideband (id, name) values (3, "TSB");
--
-----------------------------------SBType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SBType
CREATE TABLE ASDM_ENUM_SBType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SBType (id, name) values (0, "OBSERVATORY");,
INSERT INTO ASDM_ENUM_SBType (id, name) values (1, "OBSERVER");,
INSERT INTO ASDM_ENUM_SBType (id, name) values (2, "EXPERT");
--
-----------------------------------ScanIntent---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_ScanIntent
CREATE TABLE ASDM_ENUM_ScanIntent(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (0, "CALIBRATE_AMPLI");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (1, "CALIBRATE_ATMOSPHERE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (2, "CALIBRATE_BANDPASS");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (3, "CALIBRATE_DELAY");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (4, "CALIBRATE_FLUX");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (5, "CALIBRATE_FOCUS");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (6, "CALIBRATE_FOCUS_X");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (7, "CALIBRATE_FOCUS_Y");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (8, "CALIBRATE_PHASE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (9, "CALIBRATE_POINTING");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (10, "CALIBRATE_POLARIZATION");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (11, "CALIBRATE_SIDEBAND_RATIO");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (12, "CALIBRATE_WVR");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (13, "DO_SKYDIP");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (14, "MAP_ANTENNA_SURFACE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (15, "MAP_PRIMARY_BEAM");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (16, "OBSERVE_TARGET");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (17, "CALIBRATE_POL_LEAKAGE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (18, "CALIBRATE_POL_ANGLE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (19, "TEST");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (20, "UNSPECIFIED");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (21, "CALIBRATE_ANTENNA_POSITION");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (22, "CALIBRATE_ANTENNA_PHASE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (23, "MEASURE_RFI");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (24, "CALIBRATE_ANTENNA_POINTING_MODEL");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (25, "SYSTEM_CONFIGURATION");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (26, "CALIBRATE_APPPHASE_ACTIVE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (27, "CALIBRATE_APPPHASE_PASSIVE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (28, "OBSERVE_CHECK_SOURCE");,
INSERT INTO ASDM_ENUM_ScanIntent (id, name) values (29, "CALIBRATE_DIFFGAIN");
--
-----------------------------------SchedulerMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SchedulerMode
CREATE TABLE ASDM_ENUM_SchedulerMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SchedulerMode (id, name) values (0, "DYNAMIC");,
INSERT INTO ASDM_ENUM_SchedulerMode (id, name) values (1, "INTERACTIVE");,
INSERT INTO ASDM_ENUM_SchedulerMode (id, name) values (2, "MANUAL");,
INSERT INTO ASDM_ENUM_SchedulerMode (id, name) values (3, "QUEUED");
--
-----------------------------------SidebandProcessingMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SidebandProcessingMode
CREATE TABLE ASDM_ENUM_SidebandProcessingMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SidebandProcessingMode (id, name) values (0, "NONE");,
INSERT INTO ASDM_ENUM_SidebandProcessingMode (id, name) values (1, "PHASE_SWITCH_SEPARATION");,
INSERT INTO ASDM_ENUM_SidebandProcessingMode (id, name) values (2, "FREQUENCY_OFFSET_SEPARATION");,
INSERT INTO ASDM_ENUM_SidebandProcessingMode (id, name) values (3, "PHASE_SWITCH_REJECTION");,
INSERT INTO ASDM_ENUM_SidebandProcessingMode (id, name) values (4, "FREQUENCY_OFFSET_REJECTION");
--
-----------------------------------SourceModel---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SourceModel
CREATE TABLE ASDM_ENUM_SourceModel(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SourceModel (id, name) values (0, "GAUSSIAN");,
INSERT INTO ASDM_ENUM_SourceModel (id, name) values (1, "POINT");,
INSERT INTO ASDM_ENUM_SourceModel (id, name) values (2, "DISK");
--
-----------------------------------SpectralResolutionType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SpectralResolutionType
CREATE TABLE ASDM_ENUM_SpectralResolutionType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SpectralResolutionType (id, name) values (0, "CHANNEL_AVERAGE");,
INSERT INTO ASDM_ENUM_SpectralResolutionType (id, name) values (1, "BASEBAND_WIDE");,
INSERT INTO ASDM_ENUM_SpectralResolutionType (id, name) values (2, "FULL_RESOLUTION");
--
-----------------------------------StationType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_StationType
CREATE TABLE ASDM_ENUM_StationType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_StationType (id, name) values (0, "ANTENNA_PAD");,
INSERT INTO ASDM_ENUM_StationType (id, name) values (1, "MAINTENANCE_PAD");,
INSERT INTO ASDM_ENUM_StationType (id, name) values (2, "WEATHER_STATION");
--
-----------------------------------StokesParameter---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_StokesParameter
CREATE TABLE ASDM_ENUM_StokesParameter(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (0, "I");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (1, "Q");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (2, "U");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (3, "V");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (4, "RR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (5, "RL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (6, "LR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (7, "LL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (8, "XX");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (9, "XY");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (10, "YX");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (11, "YY");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (12, "RX");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (13, "RY");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (14, "LX");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (15, "LY");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (16, "XR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (17, "XL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (18, "YR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (19, "YL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (20, "PP");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (21, "PQ");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (22, "QP");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (23, "QQ");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (24, "RCIRCULAR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (25, "LCIRCULAR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (26, "LINEAR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (27, "PTOTAL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (28, "PLINEAR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (29, "PFTOTAL");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (30, "PFLINEAR");,
INSERT INTO ASDM_ENUM_StokesParameter (id, name) values (31, "PANGLE");
--
-----------------------------------SubscanIntent---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SubscanIntent
CREATE TABLE ASDM_ENUM_SubscanIntent(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (0, "ON_SOURCE");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (1, "OFF_SOURCE");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (2, "MIXED");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (3, "REFERENCE");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (4, "SCANNING");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (5, "HOT");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (6, "AMBIENT");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (7, "SIGNAL");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (8, "IMAGE");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (9, "TEST");,
INSERT INTO ASDM_ENUM_SubscanIntent (id, name) values (10, "UNSPECIFIED");
--
-----------------------------------SwitchingMode---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SwitchingMode
CREATE TABLE ASDM_ENUM_SwitchingMode(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (0, "NO_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (1, "LOAD_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (2, "POSITION_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (3, "PHASE_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (4, "FREQUENCY_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (5, "NUTATOR_SWITCHING");,
INSERT INTO ASDM_ENUM_SwitchingMode (id, name) values (6, "CHOPPER_WHEEL");
--
-----------------------------------SynthProf---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SynthProf
CREATE TABLE ASDM_ENUM_SynthProf(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SynthProf (id, name) values (0, "NOSYNTH");,
INSERT INTO ASDM_ENUM_SynthProf (id, name) values (1, "ACACORR");,
INSERT INTO ASDM_ENUM_SynthProf (id, name) values (2, "ACA_CDP");
--
-----------------------------------SyscalMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_SyscalMethod
CREATE TABLE ASDM_ENUM_SyscalMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_SyscalMethod (id, name) values (0, "TEMPERATURE_SCALE");,
INSERT INTO ASDM_ENUM_SyscalMethod (id, name) values (1, "SKYDIP");,
INSERT INTO ASDM_ENUM_SyscalMethod (id, name) values (2, "SIDEBAND_RATIO");
--
-----------------------------------TimeSampling---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_TimeSampling
CREATE TABLE ASDM_ENUM_TimeSampling(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_TimeSampling (id, name) values (0, "SUBINTEGRATION");,
INSERT INTO ASDM_ENUM_TimeSampling (id, name) values (1, "INTEGRATION");
--
-----------------------------------TimeScale---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_TimeScale
CREATE TABLE ASDM_ENUM_TimeScale(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_TimeScale (id, name) values (0, "UTC");,
INSERT INTO ASDM_ENUM_TimeScale (id, name) values (1, "TAI");
--
-----------------------------------WeightType---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_WeightType
CREATE TABLE ASDM_ENUM_WeightType(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_WeightType (id, name) values (0, "K");,
INSERT INTO ASDM_ENUM_WeightType (id, name) values (1, "JY");,
INSERT INTO ASDM_ENUM_WeightType (id, name) values (2, "COUNT_WEIGHT");
--
-----------------------------------WindowFunction---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_WindowFunction
CREATE TABLE ASDM_ENUM_WindowFunction(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (0, "UNIFORM");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (1, "HANNING");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (2, "HAMMING");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (3, "BARTLETT");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (4, "BLACKMANN");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (5, "BLACKMANN_HARRIS");,
INSERT INTO ASDM_ENUM_WindowFunction (id, name) values (6, "WELCH");
--
-----------------------------------WVRMethod---------------------------------
--
DROP TABLE IF EXISTS ASDM_ENUM_WVRMethod
CREATE TABLE ASDM_ENUM_WVRMethod(
ID	NUMBER(19)	NOT NULL,
NAME			VARCHAR2(64)	NOT NULL,
DESCRIPTION			VARCHAR2(512)	NULL,
PRIMARY KEY(ID)
);
INSERT INTO ASDM_ENUM_WVRMethod (id, name) values (0, "ATM_MODEL");,
INSERT INTO ASDM_ENUM_WVRMethod (id, name) values (1, "EMPIRICAL");
