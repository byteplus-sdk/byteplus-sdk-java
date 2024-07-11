package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;
import java.util.Map;

/**
 * CreatePreorderBody
 */
@lombok.Data
public final class CreatePreorderBody  {

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private Integer accountID;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BindInstance")
    private Map<String, String> bindInstance;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ConfigItems")
    private List<CreatePreorderBodyConfigItemsItem> configItems;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Currency")
    private String currency;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "IsAtomized")
    private Boolean isAtomized;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Period")
    private String period;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ProviderCode")
    private String providerCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RuleCode")
    private String ruleCode;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "SkipOrderPermissionCheck")
    private Boolean skipOrderPermissionCheck;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Times")
    private Integer times;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UserID")
    private Integer userID;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
