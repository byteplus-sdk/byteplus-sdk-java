package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsSendRequest;
import com.byteplus.model.request.SmsSendVerifyCodeRequest;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.SmsServiceInfoConfig;
import com.byteplus.service.sms.impl.SmsServiceImpl;
import org.apache.http.HttpHost;

import java.util.HashMap;
import java.util.Map;

public class SendSmsWithProxyDemo {

    private static final String schema = "http";

    // define your proxy address

    private static final String proxyAddress = "";
    private static final HttpHost proxy = HttpHost.create(proxyAddress);

    // define your byteplus host address
    private static final String host = "";
    private static SmsService smsService = SmsServiceImpl.getInstance(new SmsServiceInfoConfig("ak", "sk")
            .setScheme(schema).setProxy(proxy).setHost(host));


    public static void main(String[] args) {
        SmsSendRequest req = new SmsSendRequest();
        req.setFrom("BytePlus");
        req.setSmsAccount("smsAccount");
        req.setPhoneNumbers("phoneNo");
        req.setTemplateId("templateId");
        //req.setTemplateParam("param");//{"code":"1234"}
        Map<String, String> param = new HashMap<>();
        param.put("content", "第一行\n第二行");
        req.setTemplateParamByMap(new HashMap<>());
        req.setTag("tag");

        try {
            SmsSendResponse response = smsService.sendV2(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
