package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeRemoteAuthResResultDenyRule
 */
@lombok.Data
public final class DescribeRemoteAuthResResultDenyRule  {

    /**
     * <p>鉴权失败时鉴权服务器返回的状态码，所有状态码范围应在 [200,499] 之间，且和 AllowStatus 不重复。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyStatus")
    private List<Float> denyStatus;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
