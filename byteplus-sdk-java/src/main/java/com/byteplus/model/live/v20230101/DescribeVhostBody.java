package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeVhostBody
 */
@lombok.Data
public final class DescribeVhostBody  {

    /**
     * <p>域名空间名称列表，限制十</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
