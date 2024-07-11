package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * ListVodNamespaceResResponseMetadata
 */
@lombok.Data
public final class ListVodNamespaceResResponseMetadata  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Action")
    private String action;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Error")
    private Map<String, Object> error;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RequestID")
    private String requestID;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
