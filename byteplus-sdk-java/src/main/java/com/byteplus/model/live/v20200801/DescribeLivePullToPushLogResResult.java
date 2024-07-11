package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLivePullToPushLogResResult
 */
@lombok.Data
public final class DescribeLivePullToPushLogResResult  {

    /**
     * <p>查询的起始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>日志文件信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LogList")
    private List<DescribeLivePullToPushLogResResultLogListItem> logList;

    /**
     * <p>分页数量信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Pagination")
    private DescribeLivePullToPushLogResResultPagination pagination;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
