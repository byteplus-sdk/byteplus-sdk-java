package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListISPsRes
 */
@lombok.Data
public final class ListISPsRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListISPsResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListISPsResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
