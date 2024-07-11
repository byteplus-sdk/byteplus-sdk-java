package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveTimeShiftDataResResult
 */
@lombok.Data
public final class DescribeLiveTimeShiftDataResResult  {

    /**
     * <p>域名空间列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhosts")
    private List<String> vhosts;

    /**
     * <p>开始时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间天</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时移存储数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeShiftDataList")
    private List<DescribeLiveTimeShiftDataResResultTimeShiftDataListItem> timeShiftDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
