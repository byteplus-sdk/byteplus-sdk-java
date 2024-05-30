package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeLiveAccountFeeConfigResResult
 */
@lombok.Data
public final class DescribeLiveAccountFeeConfigResResult  {

    /**
     * <p>配置个数</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Total")
    private Float total;

    /**
     * <p>配置列表</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FeeConfigList")
    private List<DescribeLiveAccountFeeConfigResResultFeeConfigListItem> feeConfigList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
