package com.byteplus.example.sms;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.GetSmsTemplateAndOrderListRequest;
import com.byteplus.model.request.SubAccountRequest;
import com.byteplus.model.response.GetSmsTemplateAndOrderListResponse;
import com.byteplus.service.sms.SmsService;
import com.byteplus.service.sms.impl.SmsServiceImpl;

import static com.byteplus.helper.Const.AreaOverseas;

public class GetSmsTemplateAndOrderListDemo {
    public static void main(String[] args) throws Exception {
        SmsService smsService = SmsServiceImpl.getInstance("ap-singapore-1");

        // call below method if you dont set ak and sk in ～/.vcloud/config
        smsService.setAccessKey("AccessKey");
        smsService.setSecretKey("SecretKey");

        GetSmsTemplateAndOrderListRequest req = new GetSmsTemplateAndOrderListRequest();
        req.setSubAccount("SubAccount");
        req.setArea(AreaOverseas);
        req.setPageIndex(1);
        req.setPageSize(10);
        try {
            GetSmsTemplateAndOrderListResponse response = smsService.getSmsTemplateAndOrderList(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
