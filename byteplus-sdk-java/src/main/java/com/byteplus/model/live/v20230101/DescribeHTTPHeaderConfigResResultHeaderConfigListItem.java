package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHTTPHeaderConfigResResultHeaderConfigListItem
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigResResultHeaderConfigListItem  {

    /**
     * <p>The domain name space.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    /**
     * <p>The domain name.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Domain")
    private String domain;

    /**
     * <p>Whether the original headers is excluded.</p>
     *
     *
     *
     * <p>- `0`: Included.</p>
     *
     * <p>- `1`: Excluded.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BlockOriginal")
    private Integer blockOriginal;

    /**
     * <p>Whether the configuration is enabled.</p>
     *
     * <p>- `true`: Enabled.</p>
     *
     * <p>- `false`: Disabled.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>A list of HTTP headers you want to query.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<DescribeHTTPHeaderConfigResResultHeaderConfigListItemHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
