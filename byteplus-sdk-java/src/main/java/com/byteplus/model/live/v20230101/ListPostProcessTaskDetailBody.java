package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailBody
 */
@lombok.Data
public final class ListPostProcessTaskDetailBody  {

    /**
     * <p>当前页码，大于等于1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>分页大小，取值范围为 [1,50]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>域名名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>app名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>stream 名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>集群名称，all表示查询全部集群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cluster")
    private String cluster;

    /**
     * <p>任务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>创建时间：[开始时间戳,结束时间戳]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>更新时间：[开始时间戳,结束时间戳]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
