package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeOriginTopNrtData {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeOriginTopNrtDataRequest req = new CDN.DescribeOriginTopNrtDataRequest()
                    .setMetric("flux")
                    .setItem("domain")
                    .setDomain(Utils.exampleHost);
            CDN.DescribeOriginTopNrtDataResponse resp = service.describeOriginTopNrtData(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
