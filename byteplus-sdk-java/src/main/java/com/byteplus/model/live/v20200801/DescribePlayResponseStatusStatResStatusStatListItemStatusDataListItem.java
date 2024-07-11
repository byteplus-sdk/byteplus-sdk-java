package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribePlayResponseStatusStatResStatusStatListItemStatusDataListItem
 */
@lombok.Data
public final class DescribePlayResponseStatusStatResStatusStatListItemStatusDataListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Count")
    private Integer count;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Percent")
    private Integer percent;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StatusCode")
    private Integer statusCode;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
