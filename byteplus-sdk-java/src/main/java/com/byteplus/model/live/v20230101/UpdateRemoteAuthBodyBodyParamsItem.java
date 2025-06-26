package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateRemoteAuthBodyBodyParamsItem
 */
@lombok.Data
public final class UpdateRemoteAuthBodyBodyParamsItem  {

    /**
     * <p>参数类型，取值及含义如下所示。</p>
     *
     * <p>- `const_string`：常量；</p>
     *
     * <p>- `header`：用户请求的 Header 参数；</p>
     *
     * <p>- `query`：用户请求的 URL 参数；</p>
     *
     * <p>- `vhost`：参数值为变量 vhost 的参数，表示拉流请求中拉流域名所属的域名空间；</p>
     *
     * <p>- `domain`：参数值为变量 domain 的参数，表示拉流请求中使用的拉流域名；</p>
     *
     * <p>- `app`：参数值为变量 app 的参数，表示拉流请求中使用的 AppName；</p>
     *
     * <p>- `stream`：参数值为变量 stream 的参数，表示拉流请求中使用的 StreamName；</p>
     *
     * <p>- `client_ip`：参数值为变量 client_ip 的参数，表示拉流客户端 IP 地址；</p>
     *
     * <p>- `server_ip`：参数值为变量 server_ip 的参数，表示响应拉流请求的 CDN 节点IP地址；</p>
     *
     * <p>- `request_uri`：参数值为变量 request_uri 的参数，拉流请求地址的 URI。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>参数名，最大长度为 100 个字符，不支持输入空格。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- 参数类型为常量时表示常量参数的参数名；</p>
     *
     * <p>- 参数类型为用户请求的 Header 参数或用户请求的 URL 参数时，表示指定用户请求中对应的参数名作为此处的参数名；</p>
     *
     * <p>- 参数类型为变量时不生效。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ParamName")
    private String paramName;

    /**
     * <p>参数名的映射参数名，最大长度为 100 个字符，不支持输入空格。</p>
     *
     * <p>:::tip</p>
     *
     * <p>- 参数类型为常量时不生效；</p>
     *
     * <p>- 参数类型为用户请求的 Header 参数或用户请求的 URL 参数时，表示鉴权请求时使用 ToName 值代替用户请求中对应的参数名；</p>
     *
     * <p>- 参数类型为变量时，表示使用 ToName 取值作为此变量的参数名。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ToName")
    private String toName;

    /**
     * <p>参数类型为常量时的参数值，最大长度为 100 个字符，不支持输入空格。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Value")
    private String value;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
