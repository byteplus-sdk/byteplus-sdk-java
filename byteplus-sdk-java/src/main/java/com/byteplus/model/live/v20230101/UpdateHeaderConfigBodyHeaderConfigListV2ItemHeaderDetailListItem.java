package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateHeaderConfigBodyHeaderConfigListV2ItemHeaderDetailListItem
 */
@lombok.Data
public final class UpdateHeaderConfigBodyHeaderConfigListV2ItemHeaderDetailListItem  {

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
