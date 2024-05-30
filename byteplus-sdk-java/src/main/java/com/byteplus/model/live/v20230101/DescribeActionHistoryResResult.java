package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeActionHistoryResResult
 */
@lombok.Data
public final class DescribeActionHistoryResResult  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>配置项名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigName")
    private String configName;

    /**
     * <p>配置项名称英文</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigNameEn")
    private String configNameEn;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>变更状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionStatus")
    private String actionStatus;

    /**
     * <p>变更回复</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Response")
    private String response;

    /**
     * <p>ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>配置平台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigPlatform")
    private String configPlatform;

    /**
     * <p>域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>操作接口名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>变更人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private String userID;

    /**
     * <p>action的操作时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionTime")
    private String actionTime;

    /**
     * <p>变更的内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Body")
    private String body;

    /**
     * <p>config的配置详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigInfo")
    private DescribeActionHistoryResResultConfigInfo configInfo;

    /**
     * <p>变更平台详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationInfo")
    private DescribeActionHistoryResResultApplicationInfo applicationInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
