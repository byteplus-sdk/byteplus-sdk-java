package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveASRDurationDataResResultASRDurationDetailDataItemASRDurationDataItem
 */
@lombok.Data
public final class DescribeLiveASRDurationDataResResultASRDurationDetailDataItemASRDurationDataItem  {

    /**
     * <p>时间点</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>AI字幕时长，单位为分钟</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Float duration;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
