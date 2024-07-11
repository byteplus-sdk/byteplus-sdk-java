package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveASRDurationDataResResultASRDurationDataItem
 */
@lombok.Data
public final class DescribeLiveASRDurationDataResResultASRDurationDataItem  {

    /**
     * <p>数据按时间粒度聚合时，每个时间粒度的开始时间，RFC3339 格式的时间戳，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>当前数据聚合时间粒度内的 AI 语音转字幕转换时长，单位为分钟。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
