package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeTimeShiftPresetDetailResResultPresetDetailListItem
 */
@lombok.Data
public final class DescribeTimeShiftPresetDetailResResultPresetDetailListItem  {

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>描述</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Description")
    private String description;

    /**
     * <p>时移保存时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>点播空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VodNamespace")
    private String vodNamespace;

    /**
     * <p>时移的类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetType")
    private String presetType;

    /**
     * <p>tos bucket</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>上传路径</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordObject")
    private String recordObject;

    /**
     * <p>分发域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>nss配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NssConfig")
    private String nssConfig;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreatedAt")
    private Integer createdAt;

    /**
     * <p>更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdatedAt")
    private Integer updatedAt;

    /**
     * <p>删除时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DeletedAt")
    private Integer deletedAt;

    /**
     * <p>存储的集群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RPCCluster")
    private String rPCCluster;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
