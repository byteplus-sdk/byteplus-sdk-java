package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * UpdateAuthKeyBodyAuthDetailListItem
 */
@lombok.Data
public final class UpdateAuthKeyBodyAuthDetailListItem  {

    /**
     * <p>旁路鉴权时，授权服务器的地址，缺省情况为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BypassAuthURL")
    private String bypassAuthURL;

    /**
     * <p>接收旁路鉴权失败消息的回调地址，缺省情况为空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BypassFailCallbackURL")
    private String bypassFailCallbackURL;

    /**
     * <p>重试时长，单位为 s，默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInternalSecond")
    private Integer retryInternalSecond;

    /**
     * <p>超时时长，单位为 s，默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeoutSecond")
    private Integer timeoutSecond;

    /**
     * <p>自定义鉴权密钥。支持数字和大小写字母，最大长度 100 个字符</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecretKey")
    private String secretKey;

    /**
     * <p>对称加密算法。仅支持 md5、md5\_custom</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>该参数在推/拉流鉴权时生效，表示自定义推拉流地址中，鉴权参数 `volcSecret` 和 `volcTime` 的名称。缺省情况下表示：</p>
     *
     *
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>		"volcSecret":"volcSecret",</p>
     *
     * <p>  	"volcTime":"volcTime"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     *
     *
     *
     * <p>您可以自定义参数名，例如，</p>
     *
     *
     *
     * <p>```json</p>
     *
     * <p>{</p>
     *
     * <p>		"volcSecret":"sign",</p>
     *
     * <p>  	"volcTime":"expire"</p>
     *
     * <p>}</p>
     *
     * <p>```</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private Map<String, String> authField;

    /**
     * <p>该参数在推/拉流鉴权时生效，表示加密字段。使用不同的对称加密算法 `EncryptionAlgorithm`，加密字段存在差异</p>
     *
     *
     *
     * <p>- 当使用 **md5** 时：默认加密字段为 `["AppName","StreamName","key","expireTime"]`，且不支持修改；</p>
     *
     * <p>- 当使用 **md5\_custom** 时：默认无加密字段，但推荐至少包含 `key` 和 `volcTime`。同时您还可以自定义 `Domain`、`AppName`、`StreamName` 等字段。</p>
     *
     *
     *
     * <p>例如，选择 `key`、`volcTime` 和 `Domain` 作为加密字段，则取值为 `["key","volcTime","Domain"]`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    /**
     * <p>重试次数，默认值为 0</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private Integer retryTimes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
