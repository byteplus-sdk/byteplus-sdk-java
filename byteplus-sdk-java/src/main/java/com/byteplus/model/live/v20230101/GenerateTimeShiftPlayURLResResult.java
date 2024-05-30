package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * GenerateTimeShiftPlayURLResResult
 */
@lombok.Data
public final class GenerateTimeShiftPlayURLResResult  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PlayURLList")
    private List<GenerateTimeShiftPlayURLResResultPlayURLListItem> playURLList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
