package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeDenyConfigV2ResResult
 */
@lombok.Data
public final class DescribeDenyConfigV2ResResult  {

    /**
     * <p>配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "DenyList")
    private List<DescribeDenyConfigV2ResResultDenyListItem> denyList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
