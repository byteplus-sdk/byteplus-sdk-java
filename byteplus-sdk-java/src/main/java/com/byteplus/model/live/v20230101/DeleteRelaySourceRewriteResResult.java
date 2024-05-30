package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteRelaySourceRewriteResResult
 */
@lombok.Data
public final class DeleteRelaySourceRewriteResResult  {

    /**
     * <p>A list of rewrite rules deleted</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Items")
    private List<Object> items;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
