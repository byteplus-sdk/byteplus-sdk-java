package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveStreamStateQuery
 */
@lombok.Data
public final class DescribeLiveStreamStateQuery  {

    /**
     * <p>域名空间名称</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>`Vhost` 和 `Domain` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。由 1 到 100 位数字、字母、下划线及"-"和"."组成，如果指定 Stream，必须同时指定 App 的值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>分页大小，取值范围为 [1,1000]。.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>当前页码，取值范围为 [1,1000]。.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>流类型，缺省情况下表示全选。支持如下取值。</p>
     *
     * <p><li>Origin：原始流；</p>
     *
     * <p><li>trans：转码流。.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    /**
     * <p>想要查询的目标信息，使用英文逗号作为分隔符“,”，例如，bitrate,framerate。缺省情况下表示</p>
     *
     * <p>bitrate,framerate。支持如下取值。 <li>all：所有信息；</p>
     *
     * <p><li>onlineuser：在线人数；</p>
     *
     * <p><li>bandwidth：带宽信息;</p>
     *
     * <p><li>bitrate：码率信息；</p>
     *
     * <p><li>framerate：帧率信息；.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "InfoType")
    private String infoType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
