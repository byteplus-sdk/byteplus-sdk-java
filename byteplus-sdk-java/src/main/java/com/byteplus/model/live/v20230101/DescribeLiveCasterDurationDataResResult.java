package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveCasterDurationDataResResult
 */
@lombok.Data
public final class DescribeLiveCasterDurationDataResResult  {

    /**
     * <p>开始时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>结束时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>总时长，单位分钟</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TotalDuration")
    private Float totalDuration;

    /**
     * <p>所有时间粒度数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CasterDataList")
    private List<DescribeLiveCasterDurationDataResResultCasterDataListItem> casterDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
