package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeCertBindStatusBody
 */
@lombok.Data
public final class DescribeCertBindStatusBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ChainIDList")
    private List<String> chainIDList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
