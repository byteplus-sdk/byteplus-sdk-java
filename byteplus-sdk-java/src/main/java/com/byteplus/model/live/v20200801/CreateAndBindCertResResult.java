package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateAndBindCertResResult
 */
@lombok.Data
public final class CreateAndBindCertResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
