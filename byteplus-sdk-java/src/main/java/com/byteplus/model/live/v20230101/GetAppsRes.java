package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * GetAppsRes
 */
@lombok.Data
public final class GetAppsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private GetAppsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private GetAppsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
