package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateDomainBody
 */
@lombok.Data
public final class CreateDomainBody  {

    /**
     * <p>域名。一次只能提交一个域名。域名请在工信部完成备案</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>域名类型，包含两种类型。</p>
     *
     * <p>- push：推流域名；</p>
     *
     * <p>- pull-flv：拉流域名，包含 RTMP、FLV、HLS 格式。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>区域，默认指为 cn，包含 4 种类型。</p>
     *
     * <p>- cn：中国大陆；</p>
     *
     * <p>- oversea：海外；</p>
     *
     * <p>- cn-global：全球；</p>
     *
     * <p>- cn-oversea：海外及港澳台。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    /**
     * <p>是否进行域名归属校验，不填默认需要校验</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VerifyCheck")
    private Boolean verifyCheck;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
