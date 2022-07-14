package com.byteplus.example.cdn;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.beans.CDN;
import com.byteplus.service.cdn.CDNService;
import com.byteplus.service.cdn.impl.CDNServiceImpl;

public class DescribeContentTasks {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey(Utils.ak);
        service.setSecretKey(Utils.sk);
        try {
            CDN.DescribeContentTasksRequest req = new CDN.DescribeContentTasksRequest()
                    .setTaskType("refresh_file")
                    .setStartTime(Utils.startTime)
                    .setEndTime(Utils.endTime);
            CDN.DescribeContentTasksResponse resp = service.describeContentTasks(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
