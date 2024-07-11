package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetBodyRecordTobItem
 */
@lombok.Data
public final class CreateRecordPresetBodyRecordTobItem  {

    /**
     * <p>录制格式。</p>
     *
     * <p><li>hls：适用于录制到 ToS 或 Vod；</p>
     *
     * <p><li>mp4：适用于录制到 ToS。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private String format;

    /**
     * <p>单文件录制时长，单位为秒。默认值为 7200，取值范围为 [30,86400]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>断流拼接间隔时长，单位为秒，默认值为 300。支持的取值如下所示。</p>
     *
     * <p><li>-1：一直拼接；</p>
     *
     * <p><li>0：不拼接；</p>
     *
     * <p><li>大于 0：断流拼接时间间隔。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Splice")
    private String splice;

    /**
     * <p>录制文件的存储位置。录制格式为</p>
     *
     * <p>`{PubDomain}/{App}/{Stream}/{StartTime}/{EndTime}`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
