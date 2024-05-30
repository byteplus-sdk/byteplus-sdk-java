package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateDomainBody
 */
@lombok.Data
public final class UpdateDomainBody  {

    /**
     * <p>域名。一次只能提交一个域名。域名请在工信部完成备案。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>区域，包含四种类型。cn：中国大陆；oversea：海外；cn-global：全球；cn-oversea：海外及港澳台</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Region")
    private String region;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
