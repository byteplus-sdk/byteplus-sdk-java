package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListActionHistoryResResultActionHistoryListItem
 */
@lombok.Data
public final class ListActionHistoryResResultActionHistoryListItem  {

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

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
     * <p>接口名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>变更状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionStatus")
    private String actionStatus;

    /**
     * <p>配置项名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigName")
    private String configName;

    /**
     * <p>**配置项名称英文**</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigNameEn")
    private String configNameEn;

    /**
     * <p>配置时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ActionTime")
    private String actionTime;

    /**
     * <p>操作人</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private String userID;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>操作内容</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Body")
    private String body;

    /**
     * <p>配置进度</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigProgress")
    private Float configProgress;

    /**
     * <p>变更工单ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationID")
    private String applicationID;

    /**
     * <p>变更平台链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplicationURL")
    private String applicationURL;

    /**
     * <p>配置平台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigPlatform")
    private String configPlatform;

    /**
     * <p>记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
