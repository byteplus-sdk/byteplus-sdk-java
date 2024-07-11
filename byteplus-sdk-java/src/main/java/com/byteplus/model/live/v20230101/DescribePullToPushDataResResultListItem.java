package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribePullToPushDataResResultListItem
 */
@lombok.Data
public final class DescribePullToPushDataResResultListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s，例如，`2022-04-13T00:00:00+08:00`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    /**
     * <p>该时间片内的拉流转推总时长，单位分钟，保留小数点后 2 位</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Float value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
