package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListPullToPushTaskResResponseMetadataError
 */
@lombok.Data
public final class ListPullToPushTaskResResponseMetadataError  {

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
