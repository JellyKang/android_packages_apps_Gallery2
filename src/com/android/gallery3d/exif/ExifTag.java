/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.gallery3d.exif;

public class ExifTag {
    public static interface TIFF_TAG {
        public static final short TAG_IMAGE_WIDTH = 0x100;
        public static final short TAG_IMAGE_HEIGHT = 0x101;
        public static final short TAG_BITS_PER_SAMPLE = 0x102;
        public static final short TAG_COMPRESSION = 0x103;
        public static final short TAG_PHOTOMETRIC_INTERPRETATION = 0x106;
        public static final short TAG_IMAGE_DESCRIPTION = 0x10E;
        public static final short TAG_MAKE = 0x10F;
        public static final short TAG_MODEL = 0x110;
        public static final short TAG_STRIP_OFFSETS = 0x111;
        public static final short TAG_ORIENTATION = 0x112;
        public static final short TAG_SAMPLES_PER_PIXEL = 0x115;
        public static final short TAG_ROWS_PER_STRIP = 0x116;
        public static final short TAG_STRIP_BYTE_COUNTS = 0x117;
        public static final short TAG_X_RESOLUTION = 0x11A;
        public static final short TAG_Y_RESOLUTION = 0x11B;
        public static final short TAG_PLANAR_CONFIGURATION = 0x11C;
        public static final short TAG_RESOLUTION_UNIT = 0x128;
        public static final short TAG_TRANSFER_FUNCTION = 0x12D;
        public static final short TAG_SOFTWARE = 0x131;
        public static final short TAG_DATE_TIME = 0x132;
        public static final short TAG_ARTIST = 0x13B;
        public static final short TAG_WHITE_POINT = 0x13E;
        public static final short TAG_PRIMARY_CHROMATICITIES = 0x13F;
        public static final short TAG_JPEG_INTERCHANGE_FORMAT = 0x201;
        public static final short TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = 0x202;
        public static final short TAG_Y_CB_CR_COEFFICIENTS = 0x211;
        public static final short TAG_Y_CB_CR_SUB_SAMPLING = 0x212;
        public static final short TAG_Y_CB_CR_POSITIONING = 0x213;
        public static final short TAG_REFERENCE_BLACK_WHITE = 0x214;
        public static final short TAG_COPYRIGHT = (short) 0x8298;
        public static final short TAG_EXIF_IFD = (short) 0x8769;
        public static final short TAG_GPS_IFD = (short) 0x8825;

        public static final short ORIENTATION_TOP_LEFT = 1;
        public static final short ORIENTATION_TOP_RIGHT = 2;
        public static final short ORIENTATION_BOTTOM_LEFT = 3;
        public static final short ORIENTATION_BOTTOM_RIGHT = 4;
        public static final short ORIENTATION_LEFT_TOP = 5;
        public static final short ORIENTATION_RIGHT_TOP = 6;
        public static final short ORIENTATION_LEFT_BOTTOM = 7;
        public static final short ORIENTATION_RIGHT_BOTTOM = 8;

        public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
        public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;

        public static final short COMPRESSION_UNCOMPRESSION = 1;
        public static final short COMPRESSION_JPEG = 6;

        public static final short RESOLUTION_UNIT_INCHES = 2;
        public static final short RESOLUTION_UNIT_CENTIMETERS = 3;

        public static final short PHOTOMETRIC_INTERPRETATION_RGB = 2;
        public static final short PHOTOMETRIC_INTERPRETATION_YCBCR = 6;

        public static final short PLANAR_CONFIGURATION_CHUNKY = 1;
        public static final short PLANAR_CONFIGURATION_PLANAR = 2;
    }

    public static interface EXIF_TAG {
        public static final short TAG_EXPOSURE_TIME = (short) 0x829A;
        public static final short TAG_F_NUMBER = (short) 0x829D;
        public static final short TAG_EXPOSURE_PROGRAM = (short) 0x8822;
        public static final short TAG_SPECTRAL_SENSITIVITY = (short) 0x8824;
        public static final short TAG_ISO_SPEED_RATINGS = (short) 0x8827;
        public static final short TAG_OECF = (short) 0x8828;
        public static final short TAG_EXIF_VERSION = (short) 0x9000;
        public static final short TAG_DATE_TIME_ORIGINAL = (short) 0x9003;
        public static final short TAG_DATE_TIME_DIGITIZED = (short) 0x9004;
        public static final short TAG_COMPONENTS_CONFIGURATION = (short) 0x9101;
        public static final short TAG_COMPRESSED_BITS_PER_PIXEL = (short) 0x9102;
        public static final short TAG_SHUTTER_SPEED = (short) 0x9201;
        public static final short TAG_APERTURE_VALUE = (short) 0x9202;
        public static final short TAG_BRIGHTNESS_VALUE = (short) 0x9203;
        public static final short TAG_EXPOSURE_BIAS_VALUE = (short) 0x9204;
        public static final short TAG_MAX_APERTURE_VALUE = (short) 0x9205;
        public static final short TAG_SUBJECT_DISTANCE = (short) 0x9206;
        public static final short TAG_METERING_MODE = (short) 0x9207;
        public static final short TAG_LIGHT_SOURCE = (short) 0x9208;
        public static final short TAG_FLASH = (short) 0x9209;
        public static final short TAG_FOCAL_LENGTH = (short) 0x920A;
        public static final short TAG_SUBJECT_AREA = (short) 0x9214;
        public static final short TAG_MARER_NOTE = (short) 0x927C;
        public static final short TAG_USER_COMMENT = (short) 0x9286;
        public static final short TAG_SUB_SEC_TIME = (short) 0x9290;
        public static final short TAG_SUB_SEC_TIME_ORIGINAL = (short) 0x9291;
        public static final short TAG_SUB_SEC_TIME_DIGITIZED = (short) 0x9292;
        public static final short TAG_FLASHPIX_VERSION = (short) 0xA000;
        public static final short TAG_COLOR_SPACE = (short) 0xA001;
        public static final short TAG_PIXEL_X_DIMENSION = (short) 0xA002;
        public static final short TAG_PIXEL_Y_DIMENSION = (short) 0xA003;
        public static final short TAG_RELATED_SOUND_FILE = (short) 0xA004;
        public static final short TAG_INTEROPERABILITY_IFD = (short) 0xA005;
        public static final short TAG_FLASH_ENERGY = (short) 0xA20B;
        public static final short TAG_SPATIAL_FREQUENCY_REPSONSE = (short) 0xA20C;
        public static final short TAG_FOCAL_PLANE_X_RESOLUTION = (short) 0xA20E;
        public static final short TAG_FOCAL_PLANE_Y_RESOLUTION = (short) 0xA20F;
        public static final short TAG_FOCAL_PLANE_RESOLUTION_UNIT = (short) 0xA210;
        public static final short TAG_SUBJECT_LOCATION = (short) 0xA214;
        public static final short TAG_EXPOSURE_INDEX = (short) 0xA215;
        public static final short TAG_SENSING_METHOD = (short) 0xA217;
        public static final short TAG_FILE_SOURCE = (short) 0xA300;
        public static final short TAG_SCENE_TYPE = (short) 0xA301;
        public static final short TAG_CFA_PATTERN = (short) 0xA302;
        public static final short TAG_CUSTOM_RENDERED = (short) 0xA401;
        public static final short TAG_EXPOSURE_MODE = (short) 0xA402;
        public static final short TAG_WHITH_BALANCE = (short) 0xA403;
        public static final short TAG_DIGITAL_ZOOM_RATIO = (short) 0xA404;
        public static final short TAG_FOCAL_LENGTH_IN_35_MM_FILE = (short) 0xA405;
        public static final short TAG_SCENE_CAPTURE_TYPE = (short) 0xA406;
        public static final short TAG_GAIN_CONTROL = (short) 0xA407;
        public static final short TAG_CONTRAST = (short) 0xA408;
        public static final short TAG_SATURATION = (short) 0xA409;
        public static final short TAG_SHARPNESS = (short) 0xA40A;
        public static final short TAG_DEVICE_SETTING_DESCRIPTION = (short) 0xA40B;
        public static final short TAG_SUBJECT_DISTANCE_RANGE = (short) 0xA40C;
        public static final short TAG_IMAGE_UNIQUE_ID = (short) 0xA420;

        public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
        public static final short EXPOSURE_PROGRAM_MANUAL = 1;
        public static final short EXPOSURE_PROGRAM_NORMAL_PROGRAM = 2;
        public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
        public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
        public static final short EXPOSURE_PROGRAM_CREATIVE_PROGRAM = 5;
        public static final short EXPOSURE_PROGRAM_ACTION_PROGRAM = 6;
        public static final short EXPOSURE_PROGRAM_PROTRAIT_MODE = 7;
        public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;

        public static final short METERING_MODE_UNKNOWN = 0;
        public static final short METERING_MODE_AVERAGE = 1;
        public static final short METERING_MODE_CENTER_WEIGHTED_AVERAGE = 2;
        public static final short METERING_MODE_SPOT = 3;
        public static final short METERING_MODE_MULTISPOT = 4;
        public static final short METERING_MODE_PATTERN = 5;
        public static final short METERING_MODE_PARTAIL = 6;
        public static final short METERING_MODE_OTHER = 255;

        // Flash flag
        // LSB
        public static final short FLASH_DID_NOT_FIRED = 0;
        public static final short FLASH_FIRED = 1;
        // 1~2 bits
        public static final short FLASH_RETURN_NO_STROBE_RETURN_DETECTION_FUNCTION = 0 << 1;
        public static final short FLASH_RETURN_STROBE_RETURN_LIGHT_NOT_DETECTED = 2 << 1;
        public static final short FLASH_RETURN_STROBE_RETURN_LIGHT_DETECTED = 3 << 1;
        // 3~4 bits
        public static final short FLASH_MODE_UNKNOWN = 0 << 3;
        public static final short FLASH_MODE_COMPULSORY_FLASH_FIRING = 1 << 3;
        public static final short FLASH_MODE_COMPULSORY_FLASH_SUPPRESSION = 2 << 3;
        public static final short FLASH_MODE_AUTO_MODE = 3 << 3;
        // 5 bit
        public static final short FLASH_FUNCTION_PRESENT = 0 << 5;
        public static final short FLASH_FUNCTION_NO_FUNCTION = 1 << 5;
        // 6 bit
        public static final short FLASH_RED_EYE_REDUCTION_NO_OR_UNKNOWN = 0 << 6;
        public static final short FLASH_RED_EYE_REDUCTION_SUPPORT = 1 << 6;

        public static final short COLOR_SPACE_SRGB = 1;
        public static final short COLOR_SPACE_UNCALIBRATED = (short) 0xFFFF;

        public static final short EXPOSURE_MODE_AUTO_EXPOSURE = 0;
        public static final short EXPOSURE_MODE_MANUAL_EXPOSURE = 1;
        public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;

        public static final short WHITE_BALACE_MODE_AUTO = 0;
        public static final short WHITE_BALACE_MODE_MANUAL = 1;

        public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
        public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
        public static final short SCENE_CAPTURE_TYPE_PROTRAIT = 2;
        public static final short SCENE_CAPTURE_TYPE_NIGHT_SCENE = 3;

        public static final short COMPONENTS_CONFIGURATION_NOT_EXIST = 0;
        public static final short COMPONENTS_CONFIGURATION_Y = 1;
        public static final short COMPONENTS_CONFIGURATION_CB = 2;
        public static final short COMPONENTS_CONFIGURATION_CR = 3;
        public static final short COMPONENTS_CONFIGURATION_R = 4;
        public static final short COMPONENTS_CONFIGURATION_G = 5;
        public static final short COMPONENTS_CONFIGURATION_B = 6;

        public static final short LIGHT_SOURCE_UNKNOWN = 0;
        public static final short LIGHT_SOURCE_DAYLIGHT = 1;
        public static final short LIGHT_SOURCE_FLUORESCENT = 2;
        public static final short LIGHT_SOURCE_TUNGSTEN = 3;
        public static final short LIGHT_SOURCE_FLASH = 4;
        public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
        public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
        public static final short LIGHT_SOURCE_SHADE = 11;
        public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
        public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
        public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
        public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
        public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
        public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
        public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
        public static final short LIGHT_SOURCE_D55 = 20;
        public static final short LIGHT_SOURCE_D65 = 21;
        public static final short LIGHT_SOURCE_D75 = 22;
        public static final short LIGHT_SOURCE_D50 = 23;
        public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
        public static final short LIGHT_SOURCE_OTHER = 255;

        public static final short SENSING_METHOD_NOT_DEFINED = 1;
        public static final short SENSING_METHOD_ONE_CHIP_COLOR = 2;
        public static final short SENSING_METHOD_TWO_CHIP_COLOR = 3;
        public static final short SENSING_METHOD_THREE_CHIP_COLOR = 4;
        public static final short SENSING_METHOD_COLOR_SEQUENTIAL_AREA = 5;
        public static final short SENSING_METHOD_TRILINEAR = 7;
        public static final short SENSING_METHOD_COLOR_SEQUENTIAL_LINEAR = 8;

        public static final short FILE_SOURCE_DSC = 3;

        public static final short SCENE_TYPE_DIRECT_PHOTOGRAPHED = 1;

        public static final short GAIN_CONTROL_NONE = 0;
        public static final short GAIN_CONTROL_LOW_UP = 1;
        public static final short GAIN_CONTROL_HIGH_UP = 2;
        public static final short GAIN_CONTROL_LOW_DOWN = 3;
        public static final short GAIN_CONTROL_HIGH_DOWN = 4;

        public static final short CONTRAST_NORMAL = 0;
        public static final short CONTRAST_SOFT = 1;
        public static final short CONTRAST_HARD = 2;

        public static final short SATURATION_NORMAL = 0;
        public static final short SATURATION_LOW = 1;
        public static final short SATURATION_HIGH = 2;

        public static final short SHARPNESS_NORMAL = 0;
        public static final short SHARPNESS_SOFT = 1;
        public static final short SHARPNESS_HARD = 2;

        public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
        public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
        public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
        public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    }

    public static interface GPS_TAG {
        public static final short GPS_VERSION_ID = 0;
        public static final short GPS_LATITUDE_REF = 1;
        public static final short GPS_LATITUDE = 2;
        public static final short GPS_LONGITUDE_REF = 3;
        public static final short GPS_LONGITUDE = 4;
        public static final short GPS_ALTITUDE_REF = 5;
        public static final short GPS_ALTITUDE = 6;
        public static final short GPS_TIME_STAMP = 7;
        public static final short GPS_SATTELLITES = 8;
        public static final short GPS_STATUS = 9;
        public static final short GPS_MEASURE_MODE = 10;
        public static final short GPS_DOP = 11;
        public static final short GPS_SPEED_REF = 12;
        public static final short GPS_SPEED = 13;
        public static final short GPS_TRACK_REF = 14;
        public static final short GPS_TRACK = 15;
        public static final short GPS_IMG_DIRECTION_REF = 16;
        public static final short GPS_IMG_DIRECTION = 17;
        public static final short GPS_MAP_DATUM = 18;
        public static final short GPS_DEST_LATITUDE_REF = 19;
        public static final short GPS_DEST_LATITUDE = 20;
        public static final short GPS_DEST_LONGITUDE_REF = 21;
        public static final short GPS_DEST_LONGITUDE = 22;
        public static final short GPS_DEST_BEARING_REF = 23;
        public static final short GPS_DEST_BEARING = 24;
        public static final short GPS_DEST_DISTANCE_REF = 25;
        public static final short GPS_DEST_DISTANCE = 26;
        public static final short GPS_PROCESSING_METHOD = 27;
        public static final short GPS_AREA_INFORMATION = 28;
        public static final short GPS_DATA_STAMP = 29;
        public static final short GPS_DIFFERENTIAL = 30;

        public static final String GPS_REF_NORTH = "N";
        public static final String GPS_REF_SOUTH = "S";

        public static final String GPS_REF_EAST = "E";
        public static final String GPS_REF_WEST = "W";

        public static final short GPS_ALTITUDE_REF_SEA_LEVEL = 0;
        public static final short GPS_ALTITUDE_REF_SEA_LEVEL_NEGATIVE = 1;

        public static final String GPS_STATUS_IN_PROGRESS = "A";
        public static final String GPS_STATUS_INTEROPERABILITY = "V";

        public static final String GPS_MEASURE_MODE_2_DIMENSIONAL = "2";
        public static final String GPS_MEASURE_MODE_3_DIMENSIONAL = "3";

        public static final String GPS_REF_KILOMETERS = "K";
        public static final String GPS_REF_MILES = "M";
        public static final String GPS_REF_KNOTS = "N";

        public static final String GPS_REF_TRUE_DIRECTION = "T";
        public static final String GPS_REF_MAGNETIC_DIRECTION = "M";
    }

    public static interface INTEROPERABILITY_TAG {
        public static final short INTEROPERABILITY_INDEX = 1;
    }

    public static final short TYPE_BYTE = 1;
    public static final short TYPE_ASCII = 2;
    public static final short TYPE_SHORT = 3;
    public static final short TYPE_INT = 4;
    public static final short TYPE_RATIONAL = 5;
    public static final short TYPE_UNDEFINED = 7;
    public static final short TYPE_SINT = 9;
    public static final short TYPE_SRATIONAL = 10;

    private static final int TYPE_TO_SIZE_MAP[] = new int[11];
    static {
        TYPE_TO_SIZE_MAP[TYPE_BYTE] = 1;
        TYPE_TO_SIZE_MAP[TYPE_ASCII] = 1;
        TYPE_TO_SIZE_MAP[TYPE_SHORT] = 2;
        TYPE_TO_SIZE_MAP[TYPE_INT] = 4;
        TYPE_TO_SIZE_MAP[TYPE_RATIONAL] = 8;
        TYPE_TO_SIZE_MAP[TYPE_UNDEFINED] = 1;
        TYPE_TO_SIZE_MAP[TYPE_SINT] = 4;
        TYPE_TO_SIZE_MAP[TYPE_SRATIONAL] = 8;
    }

    public static int getElementSize(short type) {
        return TYPE_TO_SIZE_MAP[type];
    }

    private final short mTagId;
    private final short mDataType;
    private final int mDataCount;

    ExifTag(short tagId, short type, int dataCount) {
        mTagId = tagId;
        mDataType = type;
        mDataCount = dataCount;
    }

    public short getTagId() {
        return mTagId;
    }

    public short getDataType() {
        return mDataType;
    }

    public int getDataSize() {
        return getComponentCount() * getElementSize(getDataType());
    }

    public int getComponentCount() {
        return mDataCount;
    }
}