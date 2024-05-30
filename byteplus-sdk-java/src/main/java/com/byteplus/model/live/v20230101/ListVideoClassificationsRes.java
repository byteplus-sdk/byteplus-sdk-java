package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListVideoClassificationsRes
 */
@lombok.Data
public final class ListVideoClassificationsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVideoClassificationsResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVideoClassificationsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
