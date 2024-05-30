package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVhostDetailResResultVhostListItemDomainListItemTags
 */
@lombok.Data
public final class ListVhostDetailResResultVhostListItemDomainListItemTags  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Category")
    private String category;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
