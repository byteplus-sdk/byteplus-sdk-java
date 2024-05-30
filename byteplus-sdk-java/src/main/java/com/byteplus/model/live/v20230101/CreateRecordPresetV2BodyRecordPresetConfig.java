package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * CreateRecordPresetV2BodyRecordPresetConfig
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfig  {

    /**
     * <p>是否录制转码流，默认值为 `0`，支持的取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制全部转码流；</p>
     *
     * <p>- `2`：通过转码流后缀列表，即`TranscodeSuffixList` 字段取值匹配转码流。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>转码流和源流需至少选一个进行录制，即是否录制转码流（`TranscodeRecord`）和是否录制源流（`OriginRecord`）的取值至少一个不为 0。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private Integer transcodeRecord;

    /**
     * <p>转码流后缀列表，转码流录制配置为根据转码流列表匹配（`TranscodeRecord` 取值为 `2`）时生效，`TranscodeSuffixList` 默认配置为空，效果等同于录制全部转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    /**
     * <p>是否源流录制，默认值为 `0`，支持的取值即含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不录制；</p>
     *
     * <p>- `1`：录制。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>转码流和源流需至少选一个进行录制，即是否录制转码流（`TranscodeRecord`）和是否录制源流（`OriginRecord`）的取值至少一个不为 0。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private Integer originRecord;

    /**
     * <p>录制为 HLS 格式时，单个 TS 切片时长，单位为秒，默认值为 `10`，取值范围为 [5,30]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>录制为 FLV 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FlvParam")
    private CreateRecordPresetV2BodyRecordPresetConfigFlvParam flvParam;

    /**
     * <p>录制为 HLS 合适时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HlsParam")
    private CreateRecordPresetV2BodyRecordPresetConfigHlsParam hlsParam;

    /**
     * <p>录制为 MP4 格式时的录制参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>您需至少配置一种录制格式，即 `FlvParam`、`HlsParam`、`Mp4Param` 至少开启一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Mp4Param")
    private CreateRecordPresetV2BodyRecordPresetConfigMp4Param mp4Param;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
