package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnAccountingData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeAccountingDataRequest req = new CDN.DescribeAccountingDataRequest()
                .setDomain(Utils.exampleHost)
                .setStartTime(Utils.startTime)
                .setEndTime(Utils.endTime)
                .setMetric("flux");

            CDN.DescribeAccountingDataResponse resp = service.describeAccountingData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
