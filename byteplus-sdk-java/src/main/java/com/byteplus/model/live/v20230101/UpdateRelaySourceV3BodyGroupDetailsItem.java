package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateRelaySourceV3BodyGroupDetailsItem
 */
@lombok.Data
public final class UpdateRelaySourceV3BodyGroupDetailsItem  {

    /**
     * <p>回源组名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Group")
    private String group;

    /**
     * <p>主还是备</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Backup")
    private Boolean backup;

    /**
     * <p>是否禁用</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Disable")
    private Boolean disable;

    /**
     * <p>权重</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Weight")
    private String weight;

    /**
     * <p>CDN类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CDN")
    private String cDN;

    /**
     * <p>Group 超时时间/s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Timeout")
    private String timeout;

    /**
     * <p>应用层超时时间/s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConnTimeout")
    private String connTimeout;

    /**
     * <p>传输层超时时间/s （不配置的话使用应用层时间）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DialTimeout")
    private String dialTimeout;

    /**
     * <p>server重试间隔/s</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInterval")
    private String retryInterval;

    /**
     * <p>server重试次数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private String retryTimes;

    /**
     * <p>server生效类型（order/rand/hot）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LBType")
    private String lBType;

    /**
     * <p>是否鉴权</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullAuth")
    private Boolean pullAuth;

    /**
     * <p>主secret key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PrimarySK")
    private String primarySK;

    /**
     * <p>副secret key</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecondSK")
    private String secondSK;

    /**
     * <p>鉴权有效时长</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private String validDuration;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthParams")
    private UpdateRelaySourceV3BodyGroupDetailsItemAuthParams authParams;

    /**
     * <p>回源规则</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Rule")
    private String rule;

    /**
     * <p>回源服务器配置列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Servers")
    private List<UpdateRelaySourceV3BodyGroupDetailsItemServersItem> servers;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
