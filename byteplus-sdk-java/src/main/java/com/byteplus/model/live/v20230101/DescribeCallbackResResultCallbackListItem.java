package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCallbackResResultCallbackListItem
 */
@lombok.Data
public final class DescribeCallbackResResultCallbackListItem  {

    /**
     * <p>应用名称。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>回调消息发送是否开启鉴权，默认为 `false`，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `false`：不开启；</p>
     *
     * <p>- `true`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthEnable")
    private Boolean authEnable;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthField")
    private DescribeCallbackResResultCallbackListItemAuthField authField;

    /**
     * <p>回调消息发送鉴权密钥，开启回调消息鉴权时生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeyPrimary")
    private String authKeyPrimary;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AuthKeySecond")
    private String authKeySecond;

    /**
     * <p>回调数据列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackDetailList")
    private List<DescribeCallbackResResultCallbackListItemCallbackDetailListItem> callbackDetailList;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackField")
    private List<String> callbackField;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptField")
    private List<String> encryptField;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptionAlgorithm")
    private String encryptionAlgorithm;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HttpMethod")
    private String httpMethod;

    /**
     * <p>回调的消息类型，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `push`：推流开始回调；</p>
     *
     * <p>- `push_end`：推流结束回调；</p>
     *
     * <p>- `snapshot`：截图回调；</p>
     *
     * <p>- `record`：录制回调；</p>
     *
     * <p>- `audit_snapshot`：截图审核回调。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MessageType")
    private String messageType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "NotUseVhost")
    private Boolean notUseVhost;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryInternalSecond")
    private Integer retryInternalSecond;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RetryTimes")
    private Integer retryTimes;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SecHandlerType")
    private String secHandlerType;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeoutSecond")
    private Integer timeoutSecond;

    /**
     * <p>是否开启转码流回调，默认为 0。取值及含义如下所示。</p>
     *
     *
     *
     * <p>- `0`：不开启；</p>
     *
     * <p>- `1`：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TranscodeCallback")
    private Integer transcodeCallback;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ValidDuration")
    private Integer validDuration;

    /**
     * <p>域名空间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>任务状态回调开关</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TaskStatusCallback")
    private Integer taskStatusCallback;

    /**
     * <p>回调配置创建时间。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>回调配置创建时间，格式为 RFC3339 的 UTC 时间，精度为秒。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTimeUTC")
    private String createTimeUTC;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
