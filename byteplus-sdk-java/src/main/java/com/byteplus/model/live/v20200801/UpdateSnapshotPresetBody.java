package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateSnapshotPresetBody
 */
@lombok.Data
public final class UpdateSnapshotPresetBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ACL")
    private String aCL;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccessKey")
    private String accessKey;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AsShort")
    private Integer asShort;

    /**
     * <p>ToS 的存储 Bucket。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Bucket` 与 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Callback")
    private String callback;

    /**
     * <p>回调详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<UpdateSnapshotPresetBodyCallbackDetailListItem> callbackDetailList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Format")
    private List<String> format;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    /**
     * <p>截图间隔时间，单位为 s，默认值为 10，取值范围为正整数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Interval")
    private Integer interval;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NssConfig")
    private String nssConfig;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "OverwriteObject")
    private String overwriteObject;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlatformTypeList")
    private List<String> platformTypeList;

    /**
     * <p>截图模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Quality")
    private Integer quality;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordConfig")
    private String recordConfig;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordTob")
    private List<UpdateSnapshotPresetBodyRecordTobItem> recordTob;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RegionConfig")
    private String regionConfig;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ReserveDays")
    private Integer reserveDays;

    /**
     * <p>veImageX 的服务 ID。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Bucket` 与 `ServiceID` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceID")
    private String serviceID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SliceDuration")
    private Integer sliceDuration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotConfig")
    private String snapshotConfig;

    /**
     * <p>截图格式。支持如下取值。</p>
     *
     * <p>- jpeg</p>
     *
     * <p>- png</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotFormat")
    private String snapshotFormat;

    /**
     * <p>存储规则。存储在 ToS 时传，格式为`{PushDomain}/{App}/{Stream}/{UnixTimestamp}`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotObject")
    private String snapshotObject;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Splice")
    private Integer splice;

    /**
     * <p>截图模版状态。</p>
     *
     * <p>* 1：开启</p>
     *
     * <p>* 0：关闭</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>ToS 的存储目录，不传为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDir")
    private String storageDir;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosCluster")
    private String tosCluster;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosDC")
    private String tosDC;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TosPSM")
    private String tosPSM;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "WorkflowID")
    private String workflowID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
