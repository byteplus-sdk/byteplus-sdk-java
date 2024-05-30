package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3Body
 */
@lombok.Data
public final class UpdateRelaySourceV3Body  {

    /**
     * <p>域名空间，即直播流地址的域名所属的域名空间。您可以调用 [ListDomainDetail](https://www.volcengine.com/docs/6469/1126815) 接口或在视频直播控制台的[域名管理](https://console-stable.volcanicengine.com/live/main/domain/list)页面，查看直播流使用的域名所属的域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>应用名称，即直播流地址的 `AppName` 字段取值，默认为空，表示为当前域名空间的全局播放触发回源配置。支持由大小写字母（A - Z、a - z）、数字（0 - 9）、下划线（\_）、短横线（-）和句点（.）组成，长度为 1 到 30 个字符。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>组的重试间隔/s，不填默认为1 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInterval")
    private String retryInterval;

    /**
     * <p>组的重试次数，不填默认等于group数-1</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private String retryTimes;

    /**
     * <p>生效类型（order/rand/hot），不填默认order</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LBType")
    private String lBType;

    /**
     * <p>回源组配置详情。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GroupDetails")
    private List<UpdateRelaySourceV3BodyGroupDetailsItem> groupDetails;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
