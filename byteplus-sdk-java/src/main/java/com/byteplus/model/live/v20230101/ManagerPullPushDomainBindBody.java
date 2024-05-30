package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ManagerPullPushDomainBindBody
 */
@lombok.Data
public final class ManagerPullPushDomainBindBody  {

    /**
     * <p>拉流域名。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PullDomain")
    private String pullDomain;

    /**
     * <p>需要绑定的推流域名。缺省情况下，表示**解除**推拉流域名的绑定关系。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PushDomain")
    private String pushDomain;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
