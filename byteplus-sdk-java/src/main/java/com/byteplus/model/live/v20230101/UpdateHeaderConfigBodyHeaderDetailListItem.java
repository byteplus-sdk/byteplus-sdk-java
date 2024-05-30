package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHeaderConfigBodyHeaderDetailListItem
 */
@lombok.Data
public final class UpdateHeaderConfigBodyHeaderDetailListItem  {

    /**
     * <p>key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>value</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
