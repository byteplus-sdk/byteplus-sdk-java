package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateTranscodePresetBatchBodyPresetListItem
 */
@lombok.Data
public final class CreateTranscodePresetBatchBodyPresetListItem  {

    /**
     * <p>音频编码格式。默认格式为 acc，支持以下 3 种类型。</p>
     *
     * <p>- `aac`：使用 aac 编码格式；</p>
     *
     * <p>- `copy`：不进行转码，所有音频编码参数不生效；</p>
     *
     * <p>- `opus`：使用 opus 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Acodec")
    private String acodec;

    /**
     * <p>直播流地址的 AppName 字段，支持由大小写字母（A - Z、a - z）、数字（0 - 9）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "As")
    private String as;

    /**
     * <p>音频码率，单位为 kbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AudioBitrate")
    private Integer audioBitrate;

    /**
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BFrames")
    private Integer bFrames;

    /**
     * <p>视频帧率，单位为 fps，取值范围为 [0,60]，默认为 25fps。帧率越大，画面越流畅。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FPS")
    private Integer fPS;

    /**
     * <p>IDR 帧之间的最大间隔，单位为 s，取值范围为 [1,30]。</p>
     *
     * <p>:::tip</p>
     *
     * <p>同一条流所有的 ABR 子流的 GOP 需配置相同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>视频高度，取值范围为 [150,1920]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LongSide")
    private Integer longSide;

    /**
     * <p>转码类型是否为极智超清转码，默认值为 `false`，取值及含义如下所示。</p>
     *
     * <p>- `true`：极智超清；</p>
     *
     * <p>- `false`：标准转码。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>同一条流所有的 ABR 子流的转码方式需配置相同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Roi")
    private Boolean roi;

    /**
     *
     *
     *
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ShortSide")
    private Integer shortSide;

    /**
     * <p>转码配置的后缀标识，支持由大小写字母（A - Z、a - z）、数字（0 - 9）和短横线（-）组成，长度为 1 到 10 个字符。</p>
     *
     * <p>转码后缀通常以流名称后缀的形式来使用，常见的标识有 `sd`、`hd`、`uhd`，例如，当转码配置的标识为 `hd` 时，拉取转码流时转码流的流名名称为 `源流的流名称_hd`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SuffixName")
    private String suffixName;

    /**
     * <p>视频编码格式。</p>
     *
     * <p>- `h264`：使用 H.264 编码格式；</p>
     *
     * <p>- `h265`：使用 H.265 编码格式；</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>同一条流所有的 ABR 子流的视频编码格式需配置相同。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vcodec")
    private String vcodec;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要转码的直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>视频码率，单位为 bps，取值范围为 [0,30000000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VideoBitrate")
    private Integer videoBitrate;

    /**
     * <p>视频宽度，取值范围为 [150,1920]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
