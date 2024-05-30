package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeNSSRewriteConfigResResult
 */
@lombok.Data
public final class DescribeNSSRewriteConfigResResult  {

    /**
     * <p>@描述：已购资源包总数</p>
     *
     * <p>    @场景：公有云</p>
     *
     * <p>    @示例值：4</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigList")
    private List<DescribeNSSRewriteConfigResResultConfigListItem> configList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
