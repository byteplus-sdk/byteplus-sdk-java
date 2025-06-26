package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListVhostRemoteAuthResResultRemoteAuthConfigListItem
 */
@lombok.Data
public final class ListVhostRemoteAuthResResultRemoteAuthConfigListItem  {

    /**
     * <p>是否启用当前远程鉴权配置，取值及含义如下所示。</p>
     *
     * <p>- `true`：启用；</p>
     *
     * <p>- `false`：禁用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>远程鉴权服务器地址，支持 HTTP/HTTPS 协议地址、支持填写服务器 IP 地址。远程鉴权服务器默认使用 80/443 端口，如使用非默认端口，支持以`域名:端口`或` IP:端口`的形式进行设置。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthURL")
    private String authURL;

    /**
     * <p>远程鉴权自定义请求路径，`UseUserRequest` 设置为 `false`时必填。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthURLPath")
    private String authURLPath;

    /**
     * <p>远程鉴权请求路径使用用户拉流请求路径还是自定义请求路径，取值及含义如下所示。</p>
     *
     * <p>- `true`：使用用户拉流请求路径，使用用户拉流请求的路径拼接到鉴权请求地址上。</p>
     *
     * <p>- `false`：自定义远程鉴权请求路径。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UseUserRequest")
    private Boolean useUserRequest;

    /**
     * <p>鉴权请求方法，取值及含义如下所示。</p>
     *
     * <p>- `POST`：请求的数据作为请求体发送给服务器；</p>
     *
     * <p>- `GET`：请求的数据包含在 URL 中。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Method")
    private String method;

    /**
     * <p>单次鉴权请求超时时长，默认为 `0`，单位为秒，取值范围为[0, 600]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timeout")
    private Float timeout;

    /**
     * <p>鉴权请求超时后的重试次数，默认为 `3` 次，取值范围为 [0,10]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private Float retryTimes;

    /**
     * <p>鉴权请求超时后进行重试的时间间隔，单位为秒，默认为 `10`，取值范围为 [1,30]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInterval")
    private Float retryInterval;

    /**
     * <p>鉴权失败时鉴权服务器返回的状态码，所有状态码范围应在 [200,499] 之间，且和 AllowStatus 不重复。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyRule")
    private ListVhostRemoteAuthResResultRemoteAuthConfigListItemDenyRule denyRule;

    /**
     * <p>鉴权失败时，视频直播服务端返回客户端的状态码，范围应在 [400,699] 之间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyReturnCode")
    private Float denyReturnCode;

    /**
     * <p>鉴权缓存配置，配置均为空时表示不使用缓存来判断鉴权结果。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CacheConfig")
    private ListVhostRemoteAuthResResultRemoteAuthConfigListItemCacheConfig cacheConfig;

    /**
     * <p>是否开启对 HLS 协议拉流请求的鉴权开关，取值及含义如下所示。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：（默认值）关闭。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableHLSAuth")
    private Boolean enableHLSAuth;

    /**
     * <p>是否开启对 HLS 协议流的 TS 分片进行远程鉴权，取值及含义如下所示。</p>
     *
     * <p>- `true`：开启。</p>
     *
     * <p>- `false`：（默认值）关闭。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>开启 HLS 协议拉流请求的远程鉴权开关时，必须开启对 TS 分片的远程鉴权。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EnableHLSTSAuth")
    private Boolean enableHLSTSAuth;

    /**
     * <p>鉴权请求 Header 参数中的 Host 字段值，指定了请求的目标主机名和端口号。默认为空，表示 Host 使用用户拉流请求中 Header 参数中的 Host 字段值，最大长度为 1024 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderHost")
    private String headerHost;

    /**
     * <p>鉴权请求 URL 参数配置，最多配置 50 个 URL 参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryParamConfig")
    private ListVhostRemoteAuthResResultRemoteAuthConfigListItemQueryParamConfig queryParamConfig;

    /**
     * <p>鉴权请求 Header 参数配置，最多配置 50 个 Header 参数。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderParamConfig")
    private ListVhostRemoteAuthResResultRemoteAuthConfigListItemHeaderParamConfig headerParamConfig;

    /**
     * <p>鉴权请求 Body 参数，最多配置 50 个 Body 参数。</p>
     *
     * <p>:::tip</p>
     *
     * <p>鉴权请求方法为 POST 时 Body 参数配置生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BodyParams")
    private List<ListVhostRemoteAuthResResultRemoteAuthConfigListItemBodyParamsItem> bodyParams;

    /**
     * <p>鉴权成功时鉴权服务器返回的状态码，所有状态码范围应在 [200,499] 之间，且和 DenyStatus 不重复。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AllowStatus")
    private List<Integer> allowStatus;

    /**
     * <p>请求异常时，按鉴权失败处理还是按鉴权成功处理，取值及含义如下所示。</p>
     *
     * <p>- `true`：鉴权失败；</p>
     *
     * <p>- `false`：鉴权成功。</p>
     *
     * <p>:::tip</p>
     *
     * <p>请求异常指请求超时、请求端口与鉴权服务器端口不匹配等请求未到达鉴权服务器的情况。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyOnFailed")
    private Boolean denyOnFailed;

    /**
     * <p>鉴权服务器返回的状态码，不在已定义的的鉴权成功或鉴权失败状态码中时，按鉴权成功还是鉴权失败处理，取值及含义如下所示。</p>
     *
     * <p>- `true`：鉴权失败；</p>
     *
     * <p>- `false`：鉴权成功。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyOtherStatus")
    private Boolean denyOtherStatus;

    /**
     * <p>鉴权请求 Header 参数是否保留大小写信息，取值及含义如下所示。</p>
     *
     * <p>- `true`：保留鉴权请求中 Header 参数大小写信息。</p>
     *
     * <p>- `false`：（默认值）Header 参数将转化为 MIME 格式，以便于服务能够正确处理接受到的数据。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderCaseSensitivity")
    private Boolean headerCaseSensitivity;

    /**
     * <p>域名空间，与添加远程鉴权配置时的取值一致。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>拉流域名，与添加远程鉴权配置时的取值一致。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>配置所属的app</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
