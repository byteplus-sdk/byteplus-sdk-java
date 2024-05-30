package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteLiveAccountFeeConfigBody
 */
@lombok.Data
public final class DeleteLiveAccountFeeConfigBody  {

    /**
     * <p>如果id是0，表示创建，否则表示更新</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountId")
    private String accountId;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
