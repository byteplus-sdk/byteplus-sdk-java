package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListAccountQuotasBody
 */
@lombok.Data
public final class ListAccountQuotasBody  {

    /**
     * <p>Quota Code 列表，枚举后面补充</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "QuotaCodes")
    private List<String> quotaCodes;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
