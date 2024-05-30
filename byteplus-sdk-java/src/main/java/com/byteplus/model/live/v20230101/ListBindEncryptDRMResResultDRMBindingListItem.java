package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListBindEncryptDRMResResultDRMBindingListItem
 */
@lombok.Data
public final class ListBindEncryptDRMResResultDRMBindingListItem  {

    /**
     * <p>域名空间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>app</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>drm是否开启</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>进行drm加密的转码流的转码后缀</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptTranscodeList")
    private List<String> encryptTranscodeList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
