package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSnapshotDataResResultListItem
 */
@lombok.Data
public final class DescribeSnapshotDataResResultListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s；例如，2022-04-13T00:00:00+08:00</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    /**
     * <p>截图总张数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
