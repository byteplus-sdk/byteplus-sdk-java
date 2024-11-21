package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class UntagResources {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            List<String> resourceIds = new ArrayList<>();
            List<String> tagKeys = new ArrayList<>();
            resourceIds.add("example.com");
            tagKeys.add("k1");
            CDN.UntagResourcesRequest req = new CDN.UntagResourcesRequest().setResourceType("Domain").
                    setResourceIds(resourceIds).setTagKeys(tagKeys);
            CDN.UntagResourcesResponse resp = service.untagResources(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
