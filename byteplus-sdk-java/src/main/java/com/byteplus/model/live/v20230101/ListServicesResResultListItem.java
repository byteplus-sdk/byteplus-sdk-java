package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ListServicesResResultListItem
 */
@lombok.Data
public final class ListServicesResResultListItem  {

    /**
     * <p>用户账号</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>审批状态</p>
     *
     * <p>- 0: 正常</p>
     *
     * <p>- 1: 未发起</p>
     *
     * <p>- 2: 未审批</p>
     *
     * <p>- 3: 审批未通过</p>
     *
     * <p>- 4：试用</p>
     *
     * <p>- 5：过期</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    /**
     * <p>服务状态</p>
     *
     * <p>服务状态（仅在状态为审批通过后生效）</p>
     *
     * <p>- 0: 正式</p>
     *
     * <p>- 1:  试用</p>
     *
     * <p>- 2: 过期状态</p>
     *
     * <p>- -1 表示空</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ServiceStatus")
    private String serviceStatus;

    /**
     * <p>计费方式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingType")
    private String billingType;

    /**
     * <p>订单状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingStatus")
    private String billingStatus;

    /**
     * <p>订单审批状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingBillingStatus")
    private String billingBillingStatus;

    /**
     * <p>公司名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CompanyName")
    private String companyName;

    /**
     * <p>联系人姓名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactPerson")
    private String contactPerson;

    /**
     * <p>联系人号码</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContactNumber")
    private String contactNumber;

    /**
     * <p>业务领域</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessArea")
    private String businessArea;

    /**
     * <p>业务场景</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BusinessScene")
    private String businessScene;

    /**
     * <p>申请功能</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApplyService")
    private String applyService;

    /**
     * <p>审批人ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproverID")
    private String approverID;

    /**
     * <p>审批人姓名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ApproverName")
    private String approverName;

    /**
     * <p>最新提交时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>处理时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "UpdateTime")
    private String updateTime;

    /**
     * <p>过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrailTime")
    private String trailTime;

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
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetConfigHide")
    private List<Integer> presetConfigHide;

    /**
     * <p>低延时直播计费方式</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BillingTypeRTM")
    private String billingTypeRTM;

    /**
     * <p>TODO</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "LimitConfig")
    private ListServicesResResultListItemLimitConfig limitConfig;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
