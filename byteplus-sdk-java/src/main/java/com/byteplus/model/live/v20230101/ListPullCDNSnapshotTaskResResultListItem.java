package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPullCDNSnapshotTaskResResultListItem
 */
@lombok.Data
public final class ListPullCDNSnapshotTaskResResultListItem  {

    /**
     * <p>任务ID，任务的唯一标识。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskId")
    private String taskId;

    /**
     * <p>截图任务的开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>截图任务的结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>域名空间名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推流/拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>任务状态，有以下几种状态：</p>
     *
     * <p>- 停用</p>
     *
     * <p>- 未开始</p>
     *
     * <p>- 生效中</p>
     *
     * <p>- 已结束</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
