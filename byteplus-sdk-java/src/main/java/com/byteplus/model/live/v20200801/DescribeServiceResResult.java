package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * DescribeServiceResResult
 */
@lombok.Data
public final class DescribeServiceResResult  {

    /**
     * <p>审核状态</p>
     *
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
     * <p>上一个状态</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PreStatus")
    private String preStatus;

    /**
     * <p>创建时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "CreateTime")
    private String createTime;

    /**
     * <p>过期时间</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TrailTime")
    private String trailTime;

    /**
     * <p>隐藏的面板ID, 1: 录制，2:截图，3: 时移,</p>
     *
     * <p>4:云导播，5：域名调度域，6：RTM单独计费</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PresetConfigHide")
    private List<Integer> presetConfigHide;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
