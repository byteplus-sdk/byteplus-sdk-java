package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCallbackResResult
 */
@lombok.Data
public final class DescribeCallbackResResult  {

    /**
     * <p>回调列表。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CallbackList")
    private List<DescribeCallbackResResultCallbackListItem> callbackList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
