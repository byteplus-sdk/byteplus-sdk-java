package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class SubmitUnblockTask {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.SubmitUnblockTaskRequest req = new CDN.SubmitUnblockTaskRequest()
                .setUrls(Utils.exampleUrl1);
            CDN.SubmitUnblockTaskResponse resp = service.submitUnblockTask(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
