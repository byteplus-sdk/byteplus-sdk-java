package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem  {

    /**
     * <p>The header name.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderKey")
    private String headerKey;

    /**
     * <p>The header value. The header value can be a constant or one of the following variables:</p>
     *
     * <p>For the header in a response, the header value can be the following variables:</p>
     *
     *
     *
     * <p>- `${domain}`: The domain name in the client request. Example: `example.com`</p>
     *
     * <p>- `${uri}`: The path of the client request excluding the query parameters. If the client request is rewritten, this variable represents the rewritten path. Example: `/dir/sample.php`</p>
     *
     * <p>- `${args}`: The query parameters in the client request. If the client request is rewritten, this variable represents the rewritten parameters. Example: `color=red&n=10`</p>
     *
     * <p>- `${remote_addr}`: The IP address of the client sending the request. Example: `10.10.10.10`</p>
     *
     * <p>- `${server_addr}`: The IP address of the edge server responding to the client request. Example: `10.10.10.10`</p>
     *
     *
     *
     * <p>For the header in a request, the header value can be the following variables:</p>
     *
     *
     *
     * <p>- `${upstream_host}`: The domain name in the origin-pull request. Example: `example.com`</p>
     *
     * <p>- `${upstream_uri}`: The path of the origin-pull request excluding the query parameters. If the request is rewritten, this variable represents the rewritten path. Example: `/dir/sample.php`</p>
     *
     * <p>- `${upstream_args}`: The query parameters in the origin-pull request. If the request is rewritten, this variable represents the rewritten parameters. Example: `color=red&n=10`</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderValue")
    private String headerValue;

    /**
     * <p>The type of the header value:</p>
     *
     *
     *
     * <p>- `0`: Constant</p>
     *
     * <p>- `1`: Variable</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderFieldType")
    private Integer headerFieldType;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
