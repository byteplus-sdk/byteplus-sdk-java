package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DeleteLiveAccountFeeConfigResResult
 */
@lombok.Data
public final class DeleteLiveAccountFeeConfigResResult  {

    /**
     * <p>配置id</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Id")
    private Integer id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
