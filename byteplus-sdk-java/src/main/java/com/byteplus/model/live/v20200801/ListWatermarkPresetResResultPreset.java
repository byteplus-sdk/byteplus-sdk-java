package com.byteplus.model.live.v20200801;


import com.alibaba.fastjson.JSON;

/**
 * ListWatermarkPresetResResultPreset
 */
@lombok.Data
public final class ListWatermarkPresetResResultPreset  {

    /**
     * <p>应用名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "App")
    private String app;

    /**
     * <p>直播画面方向。</p>
     *
     *
     *
     * <p>- vertical：竖屏；</p>
     *
     * <p>- horizontal：横屏。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Orientation")
    private String orientation;

    /**
     * <p>水印图片链接</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Picture")
    private String picture;

    /**
     * <p>水平偏移，表示水印左侧边与转码流画面左侧边之间的距离，使用相对比率，取值范围为 [0,1]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosX")
    private Float posX;

    /**
     * <p>垂直偏移，表示水印顶部边与转码流画面顶部边之间的距离，使用相对比率，取值范围为 [0,1]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PosY")
    private Float posY;

    /**
     * <p>水印相对宽度，水印宽度占直播转码流画面宽度的比例，取值范围为 [0,1]，水印高度会随宽度等比缩放</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RelativeWidth")
    private Float relativeWidth;

    /**
     * <p>火山引擎账号 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "AccountID")
    private String accountID;

    /**
     * <p>水印图片文件名</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "PictureKey")
    private String pictureKey;

    /**
     * <p>水印模版 ID</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ID")
    private String iD;

    /**
     * <p>域名空间名称</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Vhost")
    private String vhost;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
