package com.byteplus.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateCarouselTaskBodyRuleOutputVideo
 */
@lombok.Data
public final class CreateCarouselTaskBodyRuleOutputVideo  {

    /**
     * <p>视频的码率，单位为 `bit`，取值必须小于或等于 `20`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "BitRate")
    private Integer bitRate;

    /**
     * <p>视频帧率，取值范围为 `[10, 60]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "FrameRate")
    private Integer frameRate;

    /**
     * <p>IDR 帧之间的最大间隔，单位为秒，默认值为 `2`，取值范围为 `[1,10]`。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "GOP")
    private Integer gOP;

    /**
     * <p>**编码档位（Encoding Preset）**</p>
     *
     * <p>该参数用于指定编码速度与压缩率的平衡，支持以下选项（从快到慢）：</p>
     *
     *
     *
     * <p>- **`ultrafast`**：编码速度最快，CPU 占用最低，但压缩率最低，文件体积最大。适用于对实时性要求极高的场景。</p>
     *
     * <p>- **`superfast`**：编码速度非常快，压缩率较低，适用于对延迟敏感但能接受较大文件体积的场景。</p>
     *
     * <p>- **`veryfast`**：编码速度较快，适用于对实时性要求较高的场景。</p>
     *
     * <p>- **`faster`**（默认）：编码速度较快，质量和压缩率均衡，适用于大多数直播或短视频场景。</p>
     *
     * <p>- **`fast`**：编码速度适中，压缩率较高，适用于对画质和文件大小有一定要求的场景。</p>
     *
     * <p>- **`medium`**：编码速度与压缩率平衡，适用于大部分常规视频处理任务。</p>
     *
     * <p>- **`slow`**：编码速度较慢，但压缩率更高，视频质量更好，适用于对画质要求较高的场景，如存档或高质量点播内容。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Preset")
    private String preset;

    /**
     * <p>视频宽度，单位为像素。支持的取值范围为 `[10, 2160]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Width")
    private Integer width;

    /**
     * <p>视频的高度（单位：像素），取值范围为 `[10, 2160]`。如果指定了 `Video` 对象，则该字段为必填项。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Height")
    private Integer height;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
