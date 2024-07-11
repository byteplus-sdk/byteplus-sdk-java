package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRecordPresetBody
 */
@lombok.Data
public final class UpdateRecordPresetBody  {

    /**
     * <p>模版名称，可调用 ListVhostRecordPreset 接口，查询模版名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>App的名称，由 1 到 30</p>
     *
     * <p>位数字、字母、下划线及"-"和"."组成。domain和app二选一填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>单个 ts 切片时长，单位为秒，默认为 10，取值范围为 [1,60]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private String sliceDuration;

    /**
     * <p>存储空间，一般使用 CDN 对应的 Bucket。</p>
     *
     * <p>`Bucket` 和 `VodNamespace` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>ToS 存储目录，默认为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>录制详细配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordTob")
    private List<UpdateRecordPresetBodyRecordTobItem> recordTob;

    /**
     * <p>回调列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<UpdateRecordPresetBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>视频点播（VoD）空间名称。可登录视频点播控制台(https://console.volcengine.com/vod/)查询。</p>
     *
     * <p>`Bucket` 和 `VodNamespace` 传且仅传一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>工作流模版</p>
     *
     * <p>ID，可登录视频点播控制台(https://console.volcengine.com/vod/)获取。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    /**
     * <p>开启转码流录制，0-不开启，1-开启。默认不开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeRecord")
    private String transcodeRecord;

    /**
     * <p>开启实时录制，0-不开启，1-开启。默认不开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealtimeRecordDuration")
    private String realtimeRecordDuration;

    /**
     * <p>开启源流录制，0-不开启，1-开启。默认开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OriginRecord")
    private String originRecord;

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
