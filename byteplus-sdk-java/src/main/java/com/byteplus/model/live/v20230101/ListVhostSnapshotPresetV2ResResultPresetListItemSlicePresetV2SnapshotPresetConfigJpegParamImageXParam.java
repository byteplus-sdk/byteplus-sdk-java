package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamImageXParam
 */
@lombok.Data
public final class ListVhostSnapshotPresetV2ResResultPresetListItemSlicePresetV2SnapshotPresetConfigJpegParamImageXParam  {

    /**
     * <p>截图是否使用 veImageX 存储，取值及含义如下所示。</p>
     *
     * <p>- `false`：不使用；</p>
     *
     * <p>- `true`：使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>使用 veImageX 存储截图时，对应的 veImageX 的服务 ID。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>存储方式为覆盖截图时的存储规则，支持以 {Domain}/{App}/{Stream} 样式设置存储规则，支持输入字母、数字、-、!、\_、.、\* 及占位符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverwriteObject")
    private String overwriteObject;

    /**
     * <p>存储方式为实时截图时的存储规则，支持以 {Domain}/{App}/{Stream}/{UnixTimestamp} 样式设置存储规则，支持输入字母、数字、-、!、\_、.、\* 及占位符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ExactObject")
    private String exactObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
