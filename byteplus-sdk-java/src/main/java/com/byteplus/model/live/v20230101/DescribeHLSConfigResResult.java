package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHLSConfigResResult
 */
@lombok.Data
public final class DescribeHLSConfigResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HLSConfigList")
    private List<DescribeHLSConfigResResultHLSConfigListItem> hLSConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
