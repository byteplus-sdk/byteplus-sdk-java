package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListVQScoreTaskBody
 */
@lombok.Data
public final class ListVQScoreTaskBody  {

    /**
     * <p>查询开始时间，UTC时间格式，支持查询最近30天内的数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "StartTime")
    private String startTime;

    /**
     * <p>查询结束时间，UTC时间格式，支持查询最近30天内的数据</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "EndTime")
    private String endTime;

    /**
     * <p>当前页码，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageNum")
    private String pageNum;

    /**
     * <p>分页大小，取值范围为 [1,1000]。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PageSize")
    private String pageSize;

    /**
     * <p>测评状态，0：全部，1：测试中，2：成功，3：失败</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Status")
    private String status;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
