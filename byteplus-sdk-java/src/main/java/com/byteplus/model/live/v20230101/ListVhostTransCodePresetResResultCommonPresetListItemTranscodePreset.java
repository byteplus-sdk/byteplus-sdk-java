package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostTransCodePresetResResultCommonPresetListItemTranscodePreset
 */
@lombok.Data
public final class ListVhostTransCodePresetResResultCommonPresetListItemTranscodePreset  {

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
     * <p>音频编码格式，默认值为 `aac`，支持的取值及含义如下所示。</p>
     *
     * <p>- `aac`：使用 AAC 音频编码格式；</p>
     *
     * <p>- `opus`：使用 Opus 音频编码格式。</p>
     *
     * <p>- `copy`：不进行音频转码，所有音频编码参数不生效，音频编码参数包括音频码率（`AudioBitrate`）等。</p>
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
     * <p>视频分辨率自适应模式开关，默认值为 `0`。支持的取值及含义如下。</p>
     *
     * <p>- `0`：关闭视频分辨率自适应；</p>
     *
     * <p>- `1`：开启视频分辨率自适应。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 关闭视频分辨率自适应模式（`As` 取值为 `0`）时，转码配置的视频分辨率取视频宽度（`Width`）和视频高度（`Height`）的值对转码视频进行拉伸；</p>
     *
     * <p>- 开启视频分辨率自适应模式（`As` 取值为 `1`）时，转码配置的视频分辨率按照短边长度（`ShortSide`）、长边长度（`LongSide`）、视频宽度（`Width`）、视频高度（`Height`）的优先级取值，另一边等比缩放。</p>
     *
     * <p>:::</p>
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
     * <p>是否开启转码视频分辨率不超过源流分辨率，默认值为 `1` 表示开启。开启后，当源流分辨率低于转码配置分辨率时（即源流宽低于转码配置宽且源流高低于转码配置高时），将按源流视频分辨率进行转码。</p>
     *
     * <p>- `0`：关闭；</p>
     *
     * <p>- `1`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransResolution")
    private Integer autoTransResolution;

    /**
     * <p>是否开启转码视频码率不超过源流码率，默认值为 `1` 表示开启。开启后，当源流码率低于转码配置码率时，将按照源流视频码率进行转码。</p>
     *
     * <p>- `0`：关闭；</p>
     *
     * <p>- `1`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVb")
    private Integer autoTransVb;

    /**
     * <p>是否开启转码视频帧率不超过源流帧率，默认值为 `1` 表示开启。开启后，当源流帧率低于转码配置帧率时，将按照源流视频帧率进行转码。</p>
     *
     * <p>- `0`：关闭；</p>
     *
     * <p>- `1`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AutoTransVr")
    private Integer autoTransVr;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BCM")
    private Integer bCM;

    /**
     * <p>转码输出视频中 2 个参考帧之间的最大 B 帧数量，取值为 `0` 时表示去除 B 帧。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Describe")
    private String describe;

    /**
     * <p>视频帧率，单位为 fps，帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为秒。</p>
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
     * <p>视频高度。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，转码分辨率将取 `Width` 和 `Height` 的值对转码视频进行拉伸；</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，`Width` 和 `Height` 任一取值为 `0` 时，转码视频将保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>长边长度。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 当开启视频分辨率自适应模式时（`As` 取值为 `1`）时，参数生效，反之则不生效。</p>
     *
     * <p>- 当开启视频分辨率自适应模式时（`As` 取值为 `1`）时，如果 `LongSide` 、 `ShortSide` 、`Width` 、`Height` 同时取 `0`，表示保持源流尺寸。</p>
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
     * <p>转码配置名称。</p>
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
     * <p>转码类型是否为极智超清转码，默认值为 `false`，取值及含义如下。</p>
     *
     * <p>- `true`：极智超清转码；</p>
     *
     * <p>- `false`：标准转码。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>视频编码格式为 H.266 （`Vcodec` 取值为 `h266`）时，转码类型不支持极智超清转码。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SITI")
    private Boolean sITI;

    /**
     * <p>短边长度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当 `As` 的取值为 1 即开启宽高自适应时，参数生效，反之则不生效。</p>
     *
     * <p>- 当 `As` 的取值为 1 时，如果 `LongSide` 、 `ShortSide` 、`Width` 、`Height` 同时取 0，表示保持源流尺寸。</p>
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
     * <p>转码停止时长，支持触发方式为拉流转码（`TransType` 取值为 `Pull`）时设置，表示断开拉流后转码停止的时长，单位为秒，取值范围为 `-1` 和 [0,300]，`-1` 表示不停止转码，默认值为 `60`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StopInterval")
    private Integer stopInterval;

    /**
     * <p>转码流后缀名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Threads")
    private Integer threads;

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
     * <p>视频编码格式，支持的取值及含义如下所示。</p>
     *
     * <p>- `h264`：使用 H.264 视频编码格式；</p>
     *
     * <p>- `h265`：使用 H.265 视频编码格式；</p>
     *
     * <p>- `h266`：使用 H.266 视频编码格式；</p>
     *
     * <p>- `copy`：不进行视频转码，所有视频编码参数不生效，视频编码参数包括视频帧率（`FPS`）、视频码率（`VideoBitrate`）、分辨率设置（`As`、`Width`、`Height`、`ShortSide`、`LongSide`）、`GOP` 和 `BFrames` 等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>视频码率，单位为 kbps。</p>
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
     * <p>视频宽度。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，转码分辨率将取 `Width` 和 `Height` 的值对转码视频进行拉伸；</p>
     *
     * <p>- 当关闭视频分辨率自适应（`As` 取值为 `0`）时，`Width` 和 `Height` 任一取值为 `0` 时，转码视频将保持源流尺寸。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VPreset")
    private String vPreset;

    /**
     * <p>转码触发方式，支持的取值及含义如下。</p>
     *
     * <p>- `Push`：推流转码，直播推流后会自动启动转码任务，生成转码流；</p>
     *
     * <p>- `Pull`：拉流转码，直播推流后，需要主动播放转码流才会启动转码任务，生成转码流。</p>
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
     * <p>是否开启智能插帧，只对画质增强类型生效。开启智能插帧时，FPS 将根据源流的帧率进行调整，源流帧率小于等于 30 时，转阿米帧率翻倍，源流帧率大于 30 时，转码帧率将于源流保持一致。</p>
     *
     *
     *
     * <p>- 0：不开启</p>
     *
     * <p>- 1：开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FISwitch")
    private String fISwitch;

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
     * <p>使用场景，画质增强时生效</p>
     *
     * <p>football：足球场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
