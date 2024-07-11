package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretResResponseMetadata
 */
@lombok.Data
public final class DescribeCertDetailSecretResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Error")
    private DescribeCertDetailSecretResResponseMetadataError error;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Service")
    private String service;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Version")
    private String version;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestId")
    private String requestId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
