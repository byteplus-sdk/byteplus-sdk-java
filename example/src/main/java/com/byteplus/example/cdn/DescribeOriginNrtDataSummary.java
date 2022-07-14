package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeOriginNrtDataSummary {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeOriginNrtDataSummaryRequest req = new CDN.DescribeOriginNrtDataSummaryRequest()
                .setStartTime(Utils.startTime)
                .setEndTime(Utils.endTime)
                .setMetric("flux");

            CDN.DescribeOriginNrtDataSummaryResponse resp = service.describeOriginNrtDataSummary(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
