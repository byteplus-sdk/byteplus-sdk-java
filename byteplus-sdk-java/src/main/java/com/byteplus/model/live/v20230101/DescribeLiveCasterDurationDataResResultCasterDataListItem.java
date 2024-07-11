package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveCasterDurationDataResResultCasterDataListItem
 */
@lombok.Data
public final class DescribeLiveCasterDurationDataResResultCasterDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>时长，单位分钟</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Float value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
