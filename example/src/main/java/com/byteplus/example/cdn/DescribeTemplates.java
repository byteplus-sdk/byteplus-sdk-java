package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.ArrayList;
import java.util.Collections;


public class DescribeTemplates {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeTemplatesRequest req = new CDN.DescribeTemplatesRequest()
                .setPageNum(1L)
                .setPageSize(10L)
                .setFilters(Collections.singletonList(new CDN.Filter()
                    .setFuzzy(false)
                    .setName("type")
                    .setValue(new ArrayList<>(Collections.singletonList("service")))
                ));
            CDN.DescribeTemplatesResponse resp = service.describeTemplates(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
