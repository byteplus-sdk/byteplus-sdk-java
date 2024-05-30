package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * BindEncryptDRMBody
 */
@lombok.Data
public final class BindEncryptDRMBody  {

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
     * <p>需要加密的转码模版后缀（源流默认加密）</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EncryptTranscodeList")
    private List<String> encryptTranscodeList;

    /**
     * <p>是否开启drm配置</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
