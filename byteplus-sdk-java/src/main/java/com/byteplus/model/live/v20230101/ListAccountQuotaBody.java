package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAccountQuotaBody
 */
@lombok.Data
public final class ListAccountQuotaBody  {

    /**
     * <p>不填默认查询所有</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VhostList")
    private List<String> vhostList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
