package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVodNamespaceRes
 */
@lombok.Data
public final class ListVodNamespaceRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private ListVodNamespaceResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private ListVodNamespaceResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
