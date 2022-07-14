package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnAccessLog {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeCdnAccessLogRequest req = new CDN.DescribeCdnAccessLogRequest()
                .setStartTime(Utils.startTime)
                .setEndTime(Utils.endTime)
                .setDomain(Utils.exampleHost);
            CDN.DescribeCdnAccessLogResponse resp = service.describeCdnAccessLog(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
