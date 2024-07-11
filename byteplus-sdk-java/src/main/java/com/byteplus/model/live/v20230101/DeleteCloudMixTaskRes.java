package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteCloudMixTaskRes
 */
@lombok.Data
public final class DeleteCloudMixTaskRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteCloudMixTaskResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteCloudMixTaskResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
