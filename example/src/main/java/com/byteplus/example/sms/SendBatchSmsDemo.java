package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SmsBatchSendRequest;
import com.byteplus.model.request.SmsSendRequest;
import com.byteplus.model.response.SmsSendResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SendBatchSmsDemo {

    public static void main(String[] args) {
        SmsService smsService = SmsServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("ak");
        smsService.setSecretKey("sk");

        SmsBatchSendRequest req = new SmsBatchSendRequest();
        req.setSign("signature");
        req.setSmsAccount("smsAccount");
        req.setTemplateId("templateId");
        req.setTag("tag");

        List<SmsBatchSendRequest.BatchSmsMessage> messages = new ArrayList<>();
        messages.add(new SmsBatchSendRequest.BatchSmsMessage("phoneNo", "{\"code\":\"1234\"}"));
        req.setMessages(messages);
        try {
            SmsSendResponse response = smsService.batchSend(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}