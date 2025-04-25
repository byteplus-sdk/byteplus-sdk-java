package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveStorageSpaceDataResResult
 */
@lombok.Data
public final class DescribeLiveStorageSpaceDataResResult  {

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
     * <p>聚合时间粒度。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Boolean aggregation;

    /**
     * <p>域名空间列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Buckets")
    private List<String> buckets;

    /**
     * <p>时移存储数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StorageDataList")
    private List<DescribeLiveStorageSpaceDataResResultStorageDataListItem> storageDataList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
