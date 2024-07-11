package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigV2ResResultDenyListItem
 */
@lombok.Data
public final class DescribeDenyConfigV2ResResultDenyListItem  {

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
     * <p>服务类型</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceType")
    private String serviceType;

    /**
     * <p>配置详情列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyConfigDetail")
    private List<DescribeDenyConfigV2ResResultDenyListItemDenyConfigDetailItem> denyConfigDetail;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
