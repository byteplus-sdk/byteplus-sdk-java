package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetTagsResResultTagsItem
 */
@lombok.Data
public final class GetTagsResResultTagsItem  {

    /**
     * <p>标签Key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagKey")
    private String tagKey;

    /**
     * <p>标签value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TagValue")
    private String tagValue;

    /**
     * <p>标签类型：Custom, System</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
