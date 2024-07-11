package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.Map;

/**
 * UpdateAccountQuotaConfigRes
 */
@lombok.Data
public final class UpdateAccountQuotaConfigRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private UpdateAccountQuotaConfigResResponseMetadata responseMetadata;

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
