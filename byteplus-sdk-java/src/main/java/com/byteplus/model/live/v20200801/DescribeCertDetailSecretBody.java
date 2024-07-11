package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * DescribeCertDetailSecretBody
 */
@lombok.Data
public final class DescribeCertDetailSecretBody  {

    /**
     * <p>证书 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainID")
    private String chainID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
