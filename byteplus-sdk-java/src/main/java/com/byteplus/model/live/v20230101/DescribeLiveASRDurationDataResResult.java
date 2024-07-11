package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveASRDurationDataResResult
 */
@lombok.Data
public final class DescribeLiveASRDurationDataResResult  {

    /**
     * <p>域名列表.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>应用名称列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AppList")
    private List<String> appList;

    /**
     * <p>AI 语音转字幕时，语音的语言类型，取值及含义如下所示。</p>
     *
     * <p>- `ZH`：中文；</p>
     *
     * <p>- `EN`：英文；</p>
     *
     * <p>- `JA`：日文；</p>
     *
     * <p>- `KO`：韩文。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRSourceType")
    private String aSRSourceType;

    /**
     * <p>AI 语音转字幕时，字幕的语言类型，取值及含义如下所示。</p>
     *
     * <p>- `ZH`：中文；</p>
     *
     * <p>- `EN`：英文；</p>
     *
     * <p>- `JA`：日文；</p>
     *
     * <p>- `KO`：韩文。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRTargetTypeList")
    private List<String> aSRTargetTypeList;

    /**
     * <p>查询的起始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询的结束时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>数据聚合的时间粒度，单位为秒。</p>
     *
     *
     *
     * <p>- `300`：5 分钟；</p>
     *
     * <p>- `3600`：1 小时；</p>
     *
     * <p>- `86400`：1 天。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Aggregation")
    private Integer aggregation;

    /**
     * <p>AI 语音转字幕转码时长总量，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    /**
     * <p>所有时间粒度的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRDurationData")
    private List<DescribeLiveASRDurationDataResResultASRDurationDataItem> aSRDurationData;

    /**
     * <p>按语音转字幕语言类型进行拆分的时间粒度的详细数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ASRDurationDetailData")
    private List<DescribeLiveASRDurationDataResResultASRDurationDetailDataItem> aSRDurationDetailData;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
