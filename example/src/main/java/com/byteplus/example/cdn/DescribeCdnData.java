package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeCdnDataRequest req = new CDN.DescribeCdnDataRequest()
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime)
                    .setMetric("flux");

            CDN.DescribeCdnDataResponse resp = service.describeCdnData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
