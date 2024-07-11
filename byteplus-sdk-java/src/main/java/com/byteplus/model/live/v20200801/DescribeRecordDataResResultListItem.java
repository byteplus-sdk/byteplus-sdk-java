package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeRecordDataResResultListItem
 */
@lombok.Data
public final class DescribeRecordDataResResultListItem  {

    /**
     * <p>时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Time")
    private String time;

    /**
     * <p>录制峰值</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private Integer value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
