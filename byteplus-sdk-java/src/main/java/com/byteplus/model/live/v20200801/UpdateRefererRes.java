package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateRefererRes
 */
@lombok.Data
public final class UpdateRefererRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateRefererResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private Map<String, Object> result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
