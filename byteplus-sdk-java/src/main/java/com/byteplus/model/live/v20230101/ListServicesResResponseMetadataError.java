package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListServicesResResponseMetadataError
 */
@lombok.Data
public final class ListServicesResResponseMetadataError  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Code")
    private String code;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Message")
    private String message;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
