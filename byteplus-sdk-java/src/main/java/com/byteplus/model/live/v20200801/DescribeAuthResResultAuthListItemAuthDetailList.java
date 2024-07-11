package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * DescribeAuthResResultAuthListItemAuthDetailList
 */
@lombok.Data
public final class DescribeAuthResResultAuthListItemAuthDetailList  {

    /**
     * <p>旁路鉴权时，授权服务器的地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BypassAuthURL")
    private String bypassAuthURL;

    /**
     * <p>接收旁路鉴权失败消息的回调地址</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BypassFailCallbackURL")
    private String bypassFailCallbackURL;

    /**
     * <p>旁路鉴权重试次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private Integer retryTimes;

    /**
     * <p>旁路鉴权重试时长，单位为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInternalSecond")
    private Integer retryInternalSecond;

    /**
     * <p>旁路鉴权超时时长，单位为 s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeoutSecond")
    private Integer timeoutSecond;

    /**
     * <p>自定义鉴权密钥</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecretKey")
    private String secretKey;

    /**
     * <p>对称加密算法</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>自定义推拉流地址中，鉴权参数 `volcSecret` 和 `volcTime` 的名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private Map<String, String> authField;

    /**
     * <p>加密字段</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
