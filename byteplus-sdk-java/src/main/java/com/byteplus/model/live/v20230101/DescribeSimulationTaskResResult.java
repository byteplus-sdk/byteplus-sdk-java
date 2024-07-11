package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeSimulationTaskResResult
 */
@lombok.Data
public final class DescribeSimulationTaskResResult  {

    /**
     * <p>当前模拟剩余的时间，单位s，返回0表示模拟已经结束。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RemainSecond")
    private Integer remainSecond;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
