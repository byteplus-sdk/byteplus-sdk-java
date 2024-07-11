package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * UpdateServiceBodyPresetConfigHideItem
 */
@lombok.Data
public final class UpdateServiceBodyPresetConfigHideItem  {

    /**
     * <p>1: 录制，2:截图，3: 时移, 4:云导播，5：域名调度域，6：RTM单独计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigID")
    private Integer configID;

    /**
     * <p>是否隐藏</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsHide")
    private Boolean isHide;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
