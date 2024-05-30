package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteRelaySourceRewriteRes
 */
@lombok.Data
public final class DeleteRelaySourceRewriteRes  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ResponseMetadata")
    private DeleteRelaySourceRewriteResResponseMetadata responseMetadata;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Result")
    private DeleteRelaySourceRewriteResResult result;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
