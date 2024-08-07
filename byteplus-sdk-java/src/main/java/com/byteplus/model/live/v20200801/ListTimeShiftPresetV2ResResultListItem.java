package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListTimeShiftPresetV2ResResultListItem
 */
@lombok.Data
public final class ListTimeShiftPresetV2ResResultListItem  {

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>ToS 存储目录</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bucket")
    private String bucket;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MasterFormat")
    private String masterFormat;

    /**
     * <p>最大时移时长，即观看时移的最长时间，单位为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MaxShiftTime")
    private Integer maxShiftTime;

    /**
     * <p>模板名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Name")
    private String name;

    /**
     * <p>直播时移配置模版状态。</p>
     *
     * <p>- 0：配置中；</p>
     *
     * <p>- 1：已启用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private Integer status;

    /**
     * <p>类型。默认类型为 VoD。</p>
     *
     * <p>- VoD</p>
     *
     * <p>- ToS</p>
     *
     * <p>- fcdn-ToS</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>流名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>点播空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VODNamespace")
    private String vODNamespace;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
