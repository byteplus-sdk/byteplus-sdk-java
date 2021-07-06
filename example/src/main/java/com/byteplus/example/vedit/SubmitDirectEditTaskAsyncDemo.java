package com.byteplus.example.vedit;

import com.alibaba.fastjson.JSON;
import com.byteplus.model.request.SubmitDirectEditTaskRequest;
import com.byteplus.model.response.SubmitDirectEditTaskAsyncResponse;
import com.byteplus.service.vedit.IVEditService;
import com.byteplus.service.vedit.impl.VEditServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class SubmitDirectEditTaskAsyncDemo {
    public static void main(String[] args) {
        IVEditService veditService = VEditServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        veditService.setAccessKey("your ak");
        veditService.setSecretKey("your sk");

        SubmitDirectEditTaskRequest req = new SubmitDirectEditTaskRequest();
        Map<String, Object> params = new HashMap<>();
        params.put("Upload", new HashMap<String, Object>(){{
            put("Uploader", "xxx");
            put("VideoName", "xxx");
        }});
        req.setEditParam(params);
        try {
            SubmitDirectEditTaskAsyncResponse response = veditService.submitDirectEditTaskAsync(req);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
