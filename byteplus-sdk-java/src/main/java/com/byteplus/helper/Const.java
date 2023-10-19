package com.byteplus.helper;

public class Const {

    public static final String ACCESS_KEY = "BYTEPLUS_ACCESSKEY";
    public static final String SECRET_KEY = "BYTEPLUS_SECRETKEY";

    public static final String REGION_CN_NORTH_1 = "cn-north-1";
    public static final String REGION_AP_SINGAPORE_1 = "ap-singapore-1";
    public static final String REGION_US_EASE_1 = "us-east-1";

    public static final String INNER_REGION_CN_NORTH_1 = "cn-north-1-inner";
    public static final String INNER_REGION_AP_SINGAPORT_1 = "ap-singapore-1-inner";
    public static final String INNER_REGION_US_EAST_1 = "us-east-1-inner";

    public static final String TIME_FORMAT_V4 = "yyyyMMdd'T'HHmmss'Z'";

    public static final String CONNECTION_TIMEOUT = "ConnectionTimeout";
    public static final String SOCKET_TIMEOUT = "SocketTimeout";
    public static final String Scheme = "Scheme";
    public static final String Host = "Host";
    public static final String Header = "Header";
    public static final String Credentials = "Credentials";

    public static final String Method = "Method";
    public static final String Path = "Path";
    public static final String Query = "Query";
    public static final String Form = "Form";

    public static final String FORMAT_JPEG = "jpeg";
    public static final String FORMAT_PNG = "png";
    public static final String FORMAT_WEBP = "webp";
    public static final String FORMAT_AWEBP = "awebp";
    public static final String FORMAT_GIF = "gif";
    public static final String FORMAT_HEIC = "heic";
    public static final String FORMAT_ORIGINAL = "image";

    public static final String HTTP = "http";
    public static final String HTTPS = "https";

    // iam
    public static final String CreateUser = "CreateUser";
    public static final String ListUsers = "ListUsers";

    public static final String FILE_TYPE_VIDEO = "video";
    public static final String FILE_TYPE_IMAGE = "image";
    public static final String FILE_TYPE_OBJECT = "object";

    // vod
    public static final String VOD_TPL_OBJ = "tplv-vod-obj";
    public static final String VOD_TPL_NOOP = "tplv-vod-noop";
    public static final String VOD_TPL_RESIZE = "tplv-vod-rs";
    public static final String VOD_TPL_CENTER_CROP = "tplv-vod-cc";
    public static final String VOD_TPL_SMART_CROP = "tplv-vod-cs";
    public static final String VOD_TPL_SIG = "tplv-bd-sig";

    public static final String SpaceName = "SpaceName";
    public static final String GetPlayInfo = "GetPlayInfo";
    public static final String StartWorkflow = "StartWorkflow";
    public static final String UploadMediaByUrl = "UploadMediaByUrl";
    public static final String ApplyUploadInfo = "ApplyUploadInfo";
    public static final String CommitUploadInfo = "CommitUploadInfo";
    public static final String QueryUploadTaskInfo = "QueryUploadTaskInfo";
    public static final String UpdateMediaPublishStatus = "UpdateMediaPublishStatus";
    public static final String UpdateMediaInfo = "UpdateMediaInfo";
    public static final String GetMediaInfos = "GetMediaInfos";
    public static final String DeleteMedia = "DeleteMedia";
    public static final String DeleteTranscodes = "DeleteTranscodes";
    public static final String GetMediaList = "GetMediaList";
    public static final String GetHlsDecryptionKey = "GetHlsDecryptionKey";
    public static final String GetPrivateDrmPlayAuth = "GetPrivateDrmPlayAuth";
    public static final int MinChunkSize = 1024 * 1024 * 20;
    public static final int LargeFileSize = 1024 * 1024 * 50;
    public static final String FileTypeMedia = "media";
    public static final String FileTypeImage = "image";
    public static final String FileTypeObject = "object";
    public static final String CategoryVideo = "video";
    public static final String CategoryAudio = "audio";
    public static final String CategoryImage = "image";
    public static final String CategoryDynamicImg = "dynamic_img";
    public static final String CategorySubtitle = "subtitle";
    public static final String CategoryFont = "font";

    public static final String DSAHmacSha1 = "HMAC-SHA1";
    public static final String DSAHmacSha256 = "HMAC-SHA256";

    public static final String SmsChannelTypeCnOTP = "CN_OTP";
    public static final String SmsChannelTypeCnNTC = "CN_NTC";
    public static final String SmsChannelTypeCnMKT = "CN_MKT";
    public static final String SmsChannelTypeI18nOTP = "I18N_OTP";
    public static final String SmsChannelTypeI18nMKT = "I18N_MKT";

    public static final String EnableStatusNotEnabled = "0";
    public static final String EnableStatusEnabled = "1";

    public static final String AreaCN = "cn";
    public static final String AreaOverseas = "overseas";
    public static final String AreaAll = "all";


    //live
    public static final String LiveSDKVersion = "2020-08-01";
    public static final String ListCommonTransPresetDetail = "ListCommonTransPresetDetail";
    public static final String UpdateCallback = "UpdateCallback";
    public static final String DescribeCallback = "DescribeCallback";
    public static final String DeleteCallback = "DeleteCallback";
    public static final String CreateDomain = "CreateDomain";
    public static final String DeleteDomain = "DeleteDomain";
    public static final String ListDomainDetail = "ListDomainDetail";
    public static final String DescribeDomain = "DescribeDomain";
    public static final String EnableDomain = "EnableDomain";
    public static final String DisableDomain = "DisableDomain";
    public static final String ManagerPullPushDomainBind = "ManagerPullPushDomainBind";
    public static final String UpdateAuthKey = "UpdateAuthKey";
    public static final String EnableAuth = "EnableAuth";
    public static final String DisableAuth = "DisableAuth";
    public static final String DescribeAuth = "DescribeAuth";
    public static final String ForbidStream = "ForbidStream";
    public static final String ResumeStream = "ResumeStream";
    public static final String ListCert = "ListCert";
    public static final String CreateCert = "CreateCert";
    public static final String DescribeCertDetailSecret = "DescribeCertDetailSecret";
    public static final String UpdateCert = "UpdateCert";
    public static final String BindCert = "BindCert";
    public static final String UnbindCert = "UnbindCert";
    public static final String DeleteCert = "DeleteCert";
    public static final String UpdateReferer = "UpdateReferer";
    public static final String DeleteReferer = "DeleteReferer";
    public static final String DescribeReferer = "DescribeReferer";
    public static final String CreateRecordPreset = "CreateRecordPreset";
    public static final String UpdateRecordPreset = "UpdateRecordPreset";
    public static final String DeleteRecordPreset = "DeleteRecordPreset";
    public static final String ListVhostRecordPreset = "ListVhostRecordPreset";
    public static final String CreateTranscodePreset = "CreateTranscodePreset";
    public static final String UpdateTranscodePreset = "UpdateTranscodePreset";
    public static final String DeleteTranscodePreset = "DeleteTranscodePreset";
    public static final String ListVhostTransCodePreset = "ListVhostTransCodePreset";
    public static final String CreateSnapshotPreset = "CreateSnapshotPreset";
    public static final String UpdateSnapshotPreset = "UpdateSnapshotPreset";
    public static final String DeleteSnapshotPreset = "DeleteSnapshotPreset";
    public static final String ListVhostSnapshotPreset = "ListVhostSnapshotPreset";
    public static final String DescribeLiveBandwidthData = "DescribeLiveBandwidthData";
    public static final String DescribeLiveTrafficData = "DescribeLiveTrafficData";
    public static final String DescribeLiveP95PeakBandwidthData = "DescribeLiveP95PeakBandwidthData";
    public static final String DescribeTranscodeData = "DescribeTranscodeData";
    public static final String DescribeSnapshotData = "DescribeSnapshotData";
    public static final String DescribeRecordData = "DescribeRecordData";
    public static final String DescribeLiveTimeShiftData = "DescribeLiveTimeShiftData";
    public static final String DescribePushStreamMetrics = "DescribePushStreamMetrics";
    public static final String DescribeLiveDomainLog = "DescribeLiveDomainLog";
    public static final String DescribeLiveMetricTrafficData = "DescribeLiveMetricTrafficData";
    public static final String DescribeLiveMetricBandwidthData = "DescribeLiveMetricBandwidthData";
    public static final String DescribePullToPushBandwidthData = "DescribePullToPushBandwidthData";
    public static final String ListStorageSpace = "ListStorageSpace";
    public static final String DescribeLiveStorageSpaceData = "DescribeLiveStorageSpaceData";
    public static final String GeneratePushURL = "GeneratePushURL";
    public static final String GeneratePlayURL = "GeneratePlayURL";
}
