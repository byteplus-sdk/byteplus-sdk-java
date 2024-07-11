package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemPullToPushTaskDetail
 */
@lombok.Data
public final class ListPostProcessTaskDetailResResultListPostProcessTaskDetailResultListItemPullToPushTaskDetail  {

    /**
     * <p>拉流转推类型0直播，1点播</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private Long type;

    /**
     * <p>拉流转推标题</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Title")
    private String title;

    /**
     * <p>源地址的列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SrcAddrList")
    private List<String> srcAddrList;

    /**
     * <p>order集群中任务的id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SchedulerTaskId")
    private String schedulerTaskId;

    /**
     * <p>开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>目的地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DstAddr")
    private String dstAddr;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
