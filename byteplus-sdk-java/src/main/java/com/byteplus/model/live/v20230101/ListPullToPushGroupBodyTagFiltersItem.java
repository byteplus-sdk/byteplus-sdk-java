package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListPullToPushGroupBodyTagFiltersItem
 */
@lombok.Data
public final class ListPullToPushGroupBodyTagFiltersItem  {

    /**
     * <p>标签Key。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Key")
    private String key;

    /**
     * <p>标签Value。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Values")
    private List<String> values;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
