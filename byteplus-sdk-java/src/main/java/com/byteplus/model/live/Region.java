package com.byteplus.model.live;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Region {
    @JSONField(name = "Area")
    String Area;
    @JSONField(name = "Country")
    String Country;
    @JSONField(name = "Province")
    String Province;
}
