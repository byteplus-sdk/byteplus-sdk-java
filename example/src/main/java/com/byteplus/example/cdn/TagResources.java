package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class TagResources {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            List<String> resourceIds = new ArrayList<>();
            List<CDN.ResourceTag> resourceTags = new ArrayList<>();
            resourceIds.add("example.com");
            resourceTags.add((new CDN.ResourceTag()).setKey("k1").setValue("v1"));
            CDN.TagResourcesRequest req = new CDN.TagResourcesRequest().setResourceType("Domain").
                    setResourceIds(resourceIds).setTags(resourceTags);
            CDN.TagResourcesResponse resp = service.tagResources(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
