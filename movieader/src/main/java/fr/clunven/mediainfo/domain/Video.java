package fr.clunven.mediainfo.domain;

/**
 * Identifier for Video metadata.
 *
 * @author Cedrick Lunven (@clunven)</a>
 */
public enum Video {
    
    ID("ID/String"),
    UNIQUEID("UniqueID/String"),
    MENU_ID("MenuID/String"),
    
    FORMAT("Format"),
    FORMAT_INFO("Format/Info"),
    FORMAT_COMMERCIAL("Format_Commercial_IfAny"),
    FORMAT_VERSION("Format_Version"),
    FORMAT_PROFILE("Format_Profile"),
    MULTIVIEW_BASEPROFILE("MultiView_BaseProfile"),
    MULTIVIEW_COUNT("MultiView_Count"),
    MULTIVIEW_LAYOUT("MultiView_Layout"),
    FORMAT_SETTINGS_BVOP_STRING("Format_Settings_BVOP/String"),
    FORMAT_SETTINGS_QPEL_STRING("Format_Settings_QPel/String"),
    FORMAT_SETTINGS_GMC_STRING("Format_Settings_GMC/String"),
    FORMAT_SETTINGS_MATRIX_STRING("Format_Settings_Matrix/String"),
    FORMAT_SETTINGS_CABAC_STRING("Format_Settings_CABAC/String"),
    FORMAT_SETTINGS_REFFRAMES_STRING("Format_Settings_RefFrames/String"),
    FORMAT_SETTINGS_PULLDOWN("Format_Settings_Pulldown"),
    FORMAT_SETTINGS_FRAMEMODE("Format_Settings_FrameMode"),
    FORMAT_SETTINGS_GOP("Format_Settings_GOP"),
    FORMAT_SETTINGS_PICTURESTRUCTURE("Format_Settings_PictureStructure"),
    FORMAT_SETTINGS_WRAPPING("Format_Settings_Wrapping"),
    MUXINGMODE("MuxingMode"),
    CODECID("CodecID"),
    CODECID_STRING("CodecID/String"),
    CODECID_INFO("CodecID/Info"),
    CODECID_HINT("CodecID/Hint"),
    CODECID_DESCRIPTION("CodecID_Description"),
    DURATION_STRING("Duration/String"),
    DURATION_FIRSTFRAME_STRING("Duration_FirstFrame/String"),
    DURATION_LASTFRAME_STRING("Duration_LastFrame/String"),
    SOURCE_DURATION_STRING("Source_Duration/String"),
    SOURCE_DURATION_FIRSTFRAME_STRING("Source_Duration_FirstFrame/String"),
    SOURCE_DURATION_LASTFRAME_STRING("Source_Duration_LastFrame/String"),
    BITRATE_MODE_STRING("BitRate_Mode/String"),
    BITRATE_STRING("BitRate/String"),
    BITRATE_MINIMUM_STRING("BitRate_Minimum/String"),
    BITRATE_NOMINAL_STRING("BitRate_Nominal/String"),
    BITRATE_MAXIMUM_STRING("BitRate_Maximum/String"),
    BITRATE_ENCODED_STRING("BitRate_Encoded/String"),
    WIDTH_STRING("Width/String"),
    WIDTH_ORIGINAL_STRING("Width_Original/String"),
    WIDTH_CLEANAPERTURE_STRING("Width_CleanAperture/String"),
    HEIGHT_STRING("Height/String"),
    HEIGHT_ORIGINAL_STRING("Height_Original/String"),
    HEIGHT_CLEANAPERTURE_STRING("Height_CleanAperture/String"),
    DISPLAYASPECTRATIO_STRING("DisplayAspectRatio/String"),
    DISPLAYASPECTRATIO_ORIGINAL_STRING("DisplayAspectRatio_Original/String"),
    DISPLAYASPECTRATIO_CLEANAPERTURE_STRING("DisplayAspectRatio_CleanAperture/String"),
    ACTIVEFORMATDESCRIPTION_STRING("ActiveFormatDescription/String"),
    ROTATION_STRING("Rotation/String"),
    FRAMERATE_MODE_STRING("FrameRate_Mode/String"),
    FRAMERATE_MODE_ORIGINAL_STRING("FrameRate_Mode_Original/String"),
    FRAMERATE_STRING("FrameRate/String"),
    FRAMERATE_ORIGINAL_STRING("FrameRate_Original/String"),
    FRAMERATE_MINIMUM_STRING("FrameRate_Minimum/String"),
    FRAMERATE_NOMINAL_STRING("FrameRate_Nominal/String"),
    FRAMERATE_MAXIMUM_STRING("FrameRate_Maximum/String"),
    STANDARD("Standard"),
    COLORSPACE("ColorSpace"),
    CHROMASUBSAMPLING("ChromaSubsampling"),
    BITDEPTH_STRING("BitDepth/String"),
    SCANTYPE_STRING("ScanType/String"),
    SCANTYPE_ORIGINAL_STRING("ScanType_Original/String"),
    SCANTYPE_STOREMETHOD_STRING("ScanType_StoreMethod/String"),
    SCANORDER_STRING("ScanOrder/String"),
    SCANORDER_STORED_STRING("ScanOrder_Stored/String"),
    SCANORDER_ORIGINAL_STRING("ScanOrder_Original/String"),
    COMPRESSION_MODE_STRING("Compression_Mode/String"),
    COMPRESSION_RATIO("Compression_Ratio"),
    TIMESTAMP_FIRSTFRAME_STRING("TimeStamp_FirstFrame/String"),
    TIMECODE_FIRSTFRAME("TimeCode_FirstFrame"),
    TIMECODE_SETTINGS("TimeCode_Settings"),
    TIMECODE_SOURCE("TimeCode_Source"),
    GOP_OPENCLOSED_STRING("Gop_OpenClosed/String"),
    GOP_OPENCLOSED_FIRSTFRAME_STRING("Gop_OpenClosed_FirstFrame/String"),
    STREAMSIZE_STRING("StreamSize/String"),
    SOURCE_STREAMSIZE_STRING("Source_StreamSize/String"),
    STREAMSIZE_ENCODED_STRING("StreamSize_Encoded/String"),
    SOURCE_STREAMSIZE_ENCODED_STRING("Source_StreamSize_Encoded/String"),
    ALIGNMENT("Alignment"),
    TITLE("Title"),
    ENCODED_APPLICATION_STRING("Encoded_Application/String"),
    ENCODED_LIBRARY_STRING("Encoded_Library/String"),
    ENCODED_LIBRARY_SETTINGS("Encoded_Library_Settings"),
    LANGUAGE_STRING("Language/String"),
    LANGUAGE_MORE("Language_More"),
    DEFAULT_STRING("Default/String"),
    FORCED_STRING("Forced/String"),
    ENCODED_DATE("Encoded_Date"),
    TAGGED_DATE("Tagged_Date"),
    ENCRYPTION("Encryption"),
    COLOUR_RANGE("colour_range"),
    COLOUR_PRIMARIES("colour_primaries"),
    TRANSFER_CHARACTERISTICS("transfer_characteristics"),
    MATRIX_COEFFICIENTS("matrix_coefficients"),
    COLOUR_PRIMARIES_ORIGINAL("colour_primaries_Original"),
    TRANSFER_CHARACTERISTICS_ORIGINAL("transfer_characteristics_Original"),
    MATRIX_COEFFICIENTS_ORIGINAL("matrix_coefficients_Original"); 
   
    private String key;
    
    private Video(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }


}
