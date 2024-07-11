package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigResResultDenyListItem
 */
@lombok.Data
public final class DescribeDenyConfigResResultDenyListItem  {

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>推拉流域名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>App的名称，由 1 到 30 位数字、字母、下划线及"-"和"."组成。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>配置详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyConfig")
    private List<DescribeDenyConfigResResultDenyListItemDenyConfigItem> denyConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
