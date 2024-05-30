package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVQScoreTaskResResult
 */
@lombok.Data
public final class ListVQScoreTaskResResult  {

    /**
     * <p>查询开始时间，UTC时间格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询结束时间，UTC时间格式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>条目总数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Integer total;

    /**
     * <p>测评任务列表明细</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskList")
    private List<ListVQScoreTaskResResultTaskListItem> taskList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
