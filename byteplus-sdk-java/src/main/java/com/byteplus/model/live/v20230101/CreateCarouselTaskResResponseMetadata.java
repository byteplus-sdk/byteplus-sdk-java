package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskResResponseMetadata
 */
@lombok.Data
public final class CreateCarouselTaskResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestID")
    private String requestID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
