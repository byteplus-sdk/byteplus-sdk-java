package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveBatchOnlineStreamMetricsBody
 */
@lombok.Data
public final class DescribeLiveBatchOnlineStreamMetricsBody  {

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示查询所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>流名称，取值与直播流地址中 StreamName 字段取值相同，默认为空表示查询所有流名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 100 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Stream")
    private String stream;

    /**
     * <p>在线流的类型，取值及含义如下所示。</p>
     *
     * <p>- `all`：所有类型；</p>
     *
     * <p>- `push`：直推流；</p>
     *
     * <p>- `relay`：回源流；</p>
     *
     * <p>- `transcode`：转码流。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StreamType")
    private String streamType;

    /**
     * <p>查询数据的页码，默认为 1，表示查询第一页的数据，取值范围为 [1,10000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private Integer pageNum;

    /**
     * <p>直播流使用的域名，默认为空，表示查询所有当前域名空间下的在线流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- VhostList 和 DomainList 不可同时传入。</p>
     *
     * <p>- VhostList 和 DomainList 均不传时，会先获取当前账号有权限的 Vhost，并从有权限的 Vhost 下获取有权限的 Domain，最终返回此 Domain 维度的在线流信息。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DomainList")
    private List<String> domainList;

    /**
     * <p>每页显示的数据条数，默认为 100，表示每页最多展示 100 条数据，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private Integer pageSize;

    /**
     * <p>使用流名称进行查询的方式，支持的取值及含义如下所示。</p>
     *
     * <p>- `fuzzy`：模糊匹配；</p>
     *
     * <p>- `strict`：（默认值）精准匹配。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QueryType")
    private String queryType;

    /**
     * <p>域名空间列表，即直播流地址的域名所属的域名空间，默认为空，表示查询所有域名空间下的在线流。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     *
     *
     *
     * <p>:::tip</p>
     *
     * <p>- VhostList 和 DomainList 不可同时传入。</p>
     *
     * <p>- VhostList 和 DomainList 均不传时，会先获取当前账号有权限的 Vhost，并从有权限的 Vhost 下获取有权限的 Domain，最终返回此 Domain 维度的在线流信息。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
