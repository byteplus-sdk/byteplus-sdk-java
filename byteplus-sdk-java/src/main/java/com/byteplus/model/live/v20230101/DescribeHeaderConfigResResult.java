package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHeaderConfigResResult
 */
@lombok.Data
public final class DescribeHeaderConfigResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderConfigListV2")
    private List<DescribeHeaderConfigResResultHeaderConfigListV2Item> headerConfigListV2;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
