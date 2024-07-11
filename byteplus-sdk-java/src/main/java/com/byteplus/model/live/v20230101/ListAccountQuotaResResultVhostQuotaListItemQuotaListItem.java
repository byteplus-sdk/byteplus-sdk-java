package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * ListAccountQuotaResResultVhostQuotaListItemQuotaListItem
 */
@lombok.Data
public final class ListAccountQuotaResResultVhostQuotaListItemQuotaListItem  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Type")
    private String type;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitNum")
    private Integer limitNum;

    /**
     * <p>仅对App和Domain进行统计，其他type始终为0。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CurrentNum")
    private Integer currentNum;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
