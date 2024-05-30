package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeVhostResResultVhostListItemTagsItem
 */
@lombok.Data
public final class DescribeVhostResResultVhostListItemTagsItem  {

    /**
     * <p>标签key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    /**
     * <p>标签类型，System, Custom</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
