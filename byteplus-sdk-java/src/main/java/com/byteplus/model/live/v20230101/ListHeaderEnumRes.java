package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListHeaderEnumRes
 */
@lombok.Data
public final class ListHeaderEnumRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListHeaderEnumResResponseMetadata responseMetadata;

    /**
     * <p>视请求的接口而定</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListHeaderEnumResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
