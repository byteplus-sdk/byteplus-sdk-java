package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * UpdateServiceBody
 */
@lombok.Data
public final class UpdateServiceBody  {

    /**
     * <p>用户账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>需要隐藏的面板</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetConfigHide")
    private List<UpdateServiceBodyPresetConfigHideItem> presetConfigHide;

    /**
     * <p>公司名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompanyName")
    private String companyName;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitConfig")
    private UpdateServiceBodyLimitConfig limitConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
