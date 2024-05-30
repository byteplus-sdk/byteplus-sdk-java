package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListActionHistoryBody
 */
@lombok.Data
public final class ListActionHistoryBody  {

    /**
     * <p>页码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

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
     * <p>操作人ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private String userID;

    /**
     * <p>查询开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private Integer startTime;

    /**
     * <p>每页数量</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>查询结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private Integer endTime;

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
     * <p>配置平台：Vadmin, 火山引擎控制台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigPlatform")
    private String configPlatform;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetName")
    private String presetName;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
