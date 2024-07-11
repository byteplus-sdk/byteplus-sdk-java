package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateAuthKeyBody
 */
@lombok.Data
public final class UpdateAuthKeyBody  {

    /**
     * <p>应用名称，取值与直播流地址中 AppName 字段取值相同，默认为空，表示所有应用名称。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>鉴权配置参数，包括鉴权密钥、鉴权字段、加密字符串生成算法等。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthDetailList")
    private List<UpdateAuthKeyBodyAuthDetailListItem> authDetailList;

    /**
     * <p>直播流使用的域名。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看直播流使用的域名。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>是否开启 URL 地址鉴权，取值及含义如下所示。</p>
     *
     * <p>- `false`：关闭（默认值）；</p>
     *
     * <p>- `true`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushPullEnable")
    private Boolean pushPullEnable;

    /**
     * <p>鉴权场景类型，取值及含义如下所示。</p>
     *
     * <p>- `push`：推流鉴权；</p>
     *
     * <p>- `pull`：拉流鉴权。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SceneType")
    private String sceneType;

    /**
     * <p>鉴权生效时长，单位为秒，默认值为 604800，取值范围为 [60,2592000]，超出生效时长后 URL 无法使用。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console.volcengine.com/live/main/domain/list)页面，查看需要查询的直播流使用的域名所属的域名空间。</p>
     *
     * <p>:::tip</p>
     *
     * <p>参数 `Domain` 和 `Vhost` 传且仅传一个。</p>
     *
     * <p>:::</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
