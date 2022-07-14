package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class SubmitBlockTask {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.SubmitBlockTaskRequest req = new CDN.SubmitBlockTaskRequest()
                    .setUrls(Utils.exampleUrl1);
            CDN.SubmitBlockTaskResponse resp = service.submitBlockTask(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
