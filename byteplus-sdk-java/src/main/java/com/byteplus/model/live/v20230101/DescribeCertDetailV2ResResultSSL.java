package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertDetailV2ResResultSSL
 */
@lombok.Data
public final class DescribeCertDetailV2ResResultSSL  {

    /**
     * <p>证书私钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    /**
     * <p>密钥类型，默认rsa</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyType")
    private String keyType;

    /**
     * <p>证书链。从叶子证书开始，到根证书。PEM编码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Chain")
    private List<String> chain;

    /**
     * <p>证书链解析后的证书链简短信息</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainBriefInfo")
    private List<DescribeCertDetailV2ResResultSSLChainBriefInfoItem> chainBriefInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
