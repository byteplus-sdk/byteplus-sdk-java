package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateAuthKeyRes
 */
@lombok.Data
public final class UpdateAuthKeyRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateAuthKeyResResponseMetadata responseMetadata;

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
