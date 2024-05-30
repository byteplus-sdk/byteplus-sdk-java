package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DeleteDomainV2Body
 */
@lombok.Data
public final class DeleteDomainV2Body  {

    /**
     * <p>域名列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domains")
    private List<String> domains;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
