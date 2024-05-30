package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * UpdateServiceBodyPresetConfigHideItem
 */
@lombok.Data
public final class UpdateServiceBodyPresetConfigHideItem  {

    /**
     * <p>1: 录制是否隐藏TOS</p>
     *
     * <p>2: 截图是否隐藏TOS</p>
     *
     * <p>3: 时移是否隐藏VOD</p>
     *
     * <p>4: 云导播是否隐藏</p>
     *
     * <p>5：海外加速计费是否隐藏</p>
     *
     * <p>6：RTM单独加速计费是否隐藏</p>
     *
     * <p>7：基础版License申请是否隐藏</p>
     *
     * <p>8：高级版License申请是否隐藏</p>
     *
     * <p>9：固定回源是否隐藏</p>
     *
     * <p>10: 月结欠费关停是否处理，1表示处理</p>
     *
     * <p>11: IP限频是否隐藏</p>
     *
     * <p>12：URL限频是否隐藏</p>
     *
     * <p>13：URL参数限频是否隐藏</p>
     *
     * <p>14：IP访问相同URL限频是否隐藏</p>
     *
     * <p>15: 活动带宽计费是否隐藏</p>
     *
     * <p>16: 画质增强是否隐藏</p>
     *
     * <p>17: Quic加速计费是否隐藏</p>
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
