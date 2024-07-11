package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListAccountQuotaRes
 */
@lombok.Data
public final class ListAccountQuotaRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListAccountQuotaResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListAccountQuotaResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
