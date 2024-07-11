package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVodWorkflowRes
 */
@lombok.Data
public final class ListVodWorkflowRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVodWorkflowResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVodWorkflowResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
