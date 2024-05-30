package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeHTTPHeaderConfigResResult
 */
@lombok.Data
public final class DescribeHTTPHeaderConfigResResult  {

    /**
     * <p>A list of header configurations of the domain name.</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderConfigList")
    private List<DescribeHTTPHeaderConfigResResultHeaderConfigListItem> headerConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
