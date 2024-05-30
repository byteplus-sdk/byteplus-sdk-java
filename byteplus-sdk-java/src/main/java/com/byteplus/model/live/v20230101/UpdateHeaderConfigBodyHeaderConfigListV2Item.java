package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateHeaderConfigBodyHeaderConfigListV2Item
 */
@lombok.Data
public final class UpdateHeaderConfigBodyHeaderConfigListV2Item  {

    /**
     * <p>header的类型，hls,flv,dash</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderType")
    private String headerType;

    /**
     * <p>header配置映射</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "HeaderDetailList")
    private List<UpdateHeaderConfigBodyHeaderConfigListV2ItemHeaderDetailListItem> headerDetailList;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
