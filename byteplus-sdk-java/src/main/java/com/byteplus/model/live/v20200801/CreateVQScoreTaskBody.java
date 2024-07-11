package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * CreateVQScoreTaskBody
 */
@lombok.Data
public final class CreateVQScoreTaskBody  {

    /**
     * <p>主拉流地址。 支持输入FCDN拉流地址和第三方CDN拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "MainAddr")
    private String mainAddr;

    /**
     * <p>对比拉流地址。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContrastAddr")
    private String contrastAddr;

    /**
     * <p>抽帧间隔，目前只能密集抽帧模板控制，以模板为主。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameInterval")
    private String frameInterval;

    /**
     * <p>测评运行时间</p>
     *
     * <p>- 支持输入s整数</p>
     *
     * <p>- 最大支持7*24小时的测评任务</p>
     *
     * <p>- 最小支持1min的测评任务</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private String duration;

    /**
     * <p>测评算法，支持vqscore分数计算</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Algorithm")
    private String algorithm;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
