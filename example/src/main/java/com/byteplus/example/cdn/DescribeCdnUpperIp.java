package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeCdnUpperIp {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeCdnUpperIpRequest req = new CDN.DescribeCdnUpperIpRequest()
                    .setDomain(Utils.exampleHost);
            CDN.DescribeCdnUpperIpResponse resp = service.describeCdnUpperIp(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
