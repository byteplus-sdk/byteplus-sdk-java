package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListAccountQuotasRes
 */
@lombok.Data
public final class ListAccountQuotasRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListAccountQuotasResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListAccountQuotasResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
