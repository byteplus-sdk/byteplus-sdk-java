package com.byteplus.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SmsCheckVerifyCodeRequest {
    @JSONField(name = "SmsAccount")
    String smsAccount;
    @JSONField(name = "PhoneNumber")
    String phoneNumber;
    @JSONField(name = "Scene")
    String scene;
    @JSONField(name = "Code")
    String code;
    @JSONField(name="EncryptName")
    String encryptName;
}
