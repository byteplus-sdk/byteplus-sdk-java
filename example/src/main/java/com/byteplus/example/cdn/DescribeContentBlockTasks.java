package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeContentBlockTasks {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeContentBlockTasksRequest req = new CDN.DescribeContentBlockTasksRequest()
                    .setTaskType("block_url")
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime);
            CDN.DescribeContentBlockTasksResponse resp = service.describeContentBlockTasks(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
