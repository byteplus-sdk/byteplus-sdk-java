package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveRecordDataResResult
 */
@lombok.Data
public final class DescribeLiveRecordDataResResult  {

    /**
     * <p>域名列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>查询的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。  </p>
     *
     * <p>- `300`：5 分钟； </p>
     *
     * <p>- `3600`：1 小时； </p>
     *
     * <p>- `86400`：1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>数据拆分的维度，当前接口仅支持按 Domain 即域名维度进行数据拆分。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DetailField")
    private List<String> detailField;

    /**
     * <p>当前查询条件下的录制并发路数最大值。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordPeak")
    private Integer recordPeak;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDataList")
    private List<DescribeLiveRecordDataResResultRecordDataListItem> recordDataList;

    /**
     * <p>按维度拆分后的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RecordDetailDataList")
    private List<DescribeLiveRecordDataResResultRecordDetailDataListItem> recordDetailDataList;

    /**
     * <p>查询流粒度数据时的应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>查询流粒度数据时的流名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
