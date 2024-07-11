package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRecordPresetResResultPresetListItemSlicePresetItem
 */
@lombok.Data
public final class ListVhostRecordPresetResResultPresetListItemSlicePresetItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>状态开关。</p>
     *
     * <p><li>0：关闭；</p>
     *
     * <p><li>1：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>录制格式。</p>
     *
     * <p><li>hls</p>
     *
     * <p><li>mp4</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private List<String> format;

    /**
     * <p>单文件录制时长</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>ts 切片时长</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private String sliceDuration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetail")
    private List<ListVhostRecordPresetResResultPresetListItemSlicePresetItemCallbackDetailItem> callbackDetail;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>开启转码流录制，0-不开启，1-开启。默认不开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private String transcodeRecord;

    /**
     * <p>开启源流录制，0-不开启，1-开启。默认开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private String originRecord;

    /**
     * <p>实时录制文件时长，0-不开启，取值范围[300,21600] 或0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealtimeRecordDuration")
    private String realtimeRecordDuration;

    /**
     * <p>MP4工作流模板ID，若设置，录制MP4优先使用此ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowIDMP4")
    private String workflowIDMP4;

    /**
     * <p>录制转码流生效的后缀列表，仅在TranscodeRecord为1时生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeSuffixList")
    private List<String> transcodeSuffixList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
