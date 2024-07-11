package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetPatchByAdminBodyPresetListItem
 */
@lombok.Data
public final class CreateTranscodePresetPatchByAdminBodyPresetListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ALayout")
    private String aLayout;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AProfile")
    private String aProfile;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AR")
    private Integer aR;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AbrMode")
    private Integer abrMode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>音频编码格式。默认格式为 acc，支持以下 3 种类型。</p>
     *
     * <p>- aac：使用 aac 编码格式；</p>
     *
     * <p>- copy：不进行转码，所有音频编码参数不生效；</p>
     *
     * <p>- opus：使用 opus 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AdvancedParam")
    private String advancedParam;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowAudioCopy")
    private Integer allowAudioCopy;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowVideoCopy")
    private Integer allowVideoCopy;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "An")
    private Integer an;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>宽高自适应模式开关。默认值为 0。支持的取值包括。</p>
     *
     * <p>- 0：关闭宽高自适应，按照 `Width` 和 `Height` 的取值进行拉伸；</p>
     *
     * <p>- 1：开启宽高自适应，按照 `ShortSide` 或 `LongSide` 等比缩放。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "As")
    private String as;

    /**
     * <p>音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Integer audioBitrate;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransAb")
    private Integer autoTransAb;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransAl")
    private Integer autoTransAl;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransAr")
    private Integer autoTransAr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransResolution")
    private Integer autoTransResolution;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVb")
    private Integer autoTransVb;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVr")
    private Integer autoTransVr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BCM")
    private Integer bCM;

    /**
     * <p>2 个参考帧之间的最大 B 帧数。不同编码格式的取值存在差异。</p>
     *
     * <p>- H.264：取值范围为 [0,7]，默认值为 3；</p>
     *
     * <p>- H.265：取值范围为 [0,1,2,3,7,15]，默认值为 3；</p>
     *
     *
     *
     * <p>`BFrames` 取 0 时，表示去 B 帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Describe")
    private String describe;

    /**
     * <p>视频帧率，单位为 fps，取值范围为 [0,60]，默认为 25fps。帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为 s，默认值为 0，取值范围为 [0,1000]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GopMin")
    private Integer gopMin;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HVSPre")
    private Boolean hVSPre;

    /**
     * <p>视频高度。默认值为 0，取值范围为 [0,8192]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 时，参数生效；反之则不生效；</p>
     *
     * <p>- 当 `As` 的取值为 0 时，如果 `Width` 和 `Height` 任意取值为 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度。默认值为 0。</p>
     *
     * <p>- `Roi` 取 false 时，取值范围为 [0,8192]；</p>
     *
     * <p>- `Roi` 取 true 时，取值范围为 [0,1920]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果同时配置 `LongSide` 和 `ShortSide` 的值，则按照 `ShortSide` 进行等比缩放。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongSide")
    private Integer longSide;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LookAhead")
    private Integer lookAhead;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Modifier")
    private String modifier;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvBf")
    private Integer nvBf;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvCodec")
    private String nvCodec;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvGop")
    private Integer nvGop;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvHVSPre")
    private Boolean nvHVSPre;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvLookahead")
    private Integer nvLookahead;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvPercent")
    private Integer nvPercent;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvPreset")
    private String nvPreset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvPriority")
    private Integer nvPriority;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvProfile")
    private String nvProfile;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvRefs")
    private Integer nvRefs;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NvTempAQ")
    private Integer nvTempAQ;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Ocr")
    private Boolean ocr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetKind")
    private Integer presetKind;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetType")
    private Integer presetType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Qp")
    private Integer qp;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionConfig")
    private String regionConfig;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Revision")
    private String revision;

    /**
     * <p>是否极智超清转码。默认值为 false。</p>
     *
     * <p>- true：极智超清；</p>
     *
     * <p>- false：标准转码。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SITI")
    private Boolean sITI;

    /**
     * <p>短边长度。默认值为 0。</p>
     *
     * <p>- `Roi` 取 false 时，取值范围为 [0,4096]；</p>
     *
     * <p>- `Roi` 取 true 时，取值范围为 [0,1080]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 和 `ShortSide` 同时取 0，表示保持源流尺寸。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果同时配置 `LongSide` 和 `ShortSide` 的值，则按照 `ShortSide` 进行等比缩放。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortSide")
    private Integer shortSide;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopInterval")
    private Integer stopInterval;

    /**
     * <p>转码流后缀名。支持 10 个字符以内的大小写字母、下划线与中划线，常见后缀包括：_sd、_hd、_uhd </p>
     *
     * <p>例如，配置的转码流后缀名为 _hd，则拉转码流时转码的流名为 stream-123456789_hd。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Threads")
    private Integer threads;

    /**
     * <p>这个结构体vadmin的要填写</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeStruct")
    private CreateTranscodePresetPatchByAdminBodyPresetListItemTranscodeStruct transcodeStruct;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VBRatio")
    private Integer vBRatio;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VBVBufSize")
    private Integer vBVBufSize;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VBVMaxRate")
    private Integer vBVMaxRate;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VLevel")
    private String vLevel;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VPreset")
    private String vPreset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VProfile")
    private String vProfile;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBBframes")
    private Integer vRBBframes;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBHeightNum")
    private Integer vRBHeightNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBPreset")
    private String vRBPreset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBProfile")
    private String vRBProfile;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBSuffix")
    private String vRBSuffix;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBVb")
    private Integer vRBVb;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRBWidthNum")
    private Integer vRBWidthNum;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRGop")
    private Integer vRGop;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRGopDen")
    private Integer vRGopDen;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRHvspre")
    private String vRHvspre;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRProjection")
    private String vRProjection;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRRoi")
    private String vRRoi;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTBframes")
    private Integer vRTBframes;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTPreset")
    private String vRTPreset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTProfile")
    private String vRTProfile;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTSuffix")
    private String vRTSuffix;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTVb")
    private Integer vRTVb;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRTileMod")
    private Integer vRTileMod;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRVr")
    private Integer vRVr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VRateCtrl")
    private String vRateCtrl;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VbThreshold")
    private String vbThreshold;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vclass")
    private Boolean vclass;

    /**
     * <p>视频编码格式。</p>
     *
     * <p>- h264：使用 H.264 编码格式；</p>
     *
     * <p>- h265：使用 H.265 编码格式；</p>
     *
     * <p>- copy：不进行转码，所有视频编码参数不生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>视频码率，单位为 bps，取值范围为 [0,30000000]；默认值为 1000000；取 0 时，表示使用源流码率。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vn")
    private Integer vn;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Watermark")
    private String watermark;

    /**
     * <p>转码触发方式，默认为拉流转码，支持以下取值(给火山控制台使用)。</p>
     *
     *
     *
     * <p>- Push：推流转码，直播推流后会自动启动转码任务，生成转码流；</p>
     *
     * <p>- Pull：拉流转码，直播推流后，需要主动播放转码流才会启动转码任务，生成转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TransType")
    private String transType;

    /**
     * <p>动态范围，画质增强类型生效</p>
     *
     *
     *
     * <p>- SDR：输出为SDR</p>
     *
     * <p>- HDR：输出为HDR</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DynamicRange")
    private String dynamicRange;

    /**
     * <p>使用场景，画质增强时生效</p>
     *
     *
     *
     * <p>- football：足球场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    /**
     * <p>是否开启智能插帧，只对画质增强类型生效</p>
     *
     *
     *
     * <p>- 0：不开启</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FISwitch")
    private Integer fISwitch;

    /**
     * <p>转码模板参数的类型</p>
     *
     *
     *
     * <p>- hvq：表示使用画质增强</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamType")
    private String paramType;

    /**
     * <p>视频宽度。默认值为 0，取值范围为 [0,8192]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 0 时，参数生效；反之则不生效；</p>
     *
     * <p>- 当 `As` 的取值为 0 时，如果 `Width` 和 `Height` 任意取值为 0，表示保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
