package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItemHeaderDetailListItem
 */
@lombok.Data
public final class DescribeHeaderConfigResResultHeaderConfigListV2ItemHeaderDetailListItemHeaderDetailListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
