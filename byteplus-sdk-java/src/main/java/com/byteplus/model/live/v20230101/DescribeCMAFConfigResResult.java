package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCMAFConfigResResult
 */
@lombok.Data
public final class DescribeCMAFConfigResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CMAFConfigList")
    private List<DescribeCMAFConfigResResultCMAFConfigListItem> cMAFConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
