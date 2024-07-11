package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItem
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItem  {

    /**
     * <p>记录ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>任务ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskID")
    private String taskID;

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
     * <p>App名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>Stream名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>任务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskType")
    private String taskType;

    /**
     * <p>任务状态,init\fetched\pending\doing\prestop\done 初始化、预取中、待执行、执行中、暂停、完成</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStatus")
    private String taskStatus;

    /**
     * <p>机房</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IDC")
    private String iDC;

    /**
     * <p>集群</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Cluster")
    private String cluster;

    /**
     * <p>任务创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>任务更新时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>错误码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrCode")
    private String errCode;

    /**
     * <p>错误信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ErrMsg")
    private String errMsg;

    /**
     * <p>ResType</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResType")
    private String resType;

    /**
     * <p>录制任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordTaskDetail")
    private ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemRecordTaskDetail recordTaskDetail;

    /**
     * <p>转码任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeTaskDetail")
    private ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemTranscodeTaskDetail transcodeTaskDetail;

    /**
     * <p>密集抽帧任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SnapshotTaskDetail")
    private ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemSnapshotTaskDetail snapshotTaskDetail;

    /**
     * <p>拉流转推任务详情</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullToPushTaskDetail")
    private ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemPullToPushTaskDetail pullToPushTaskDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
