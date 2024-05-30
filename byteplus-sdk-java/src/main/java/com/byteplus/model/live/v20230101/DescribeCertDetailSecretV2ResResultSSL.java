package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertDetailSecretV2ResResultSSL
 */
@lombok.Data
public final class DescribeCertDetailSecretV2ResResultSSL  {

    /**
     * <p>证书私钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrivateKey")
    private String privateKey;

    /**
     * <p>密钥类型，默认为 `rsa`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "KeyType")
    private String keyType;

    /**
     * <p>证书链，包括叶子证书（服务器证书）、中间证书（中间 CA 证书）以及根证书（根 CA 证书）。证书链中的证书使用 PEM 编码格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Chain")
    private List<String> chain;

    /**
     * <p>证书链解析后的证书链简短信息。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainBriefInfo")
    private List<DescribeCertDetailSecretV2ResResultSSLChainBriefInfoItem> chainBriefInfo;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
