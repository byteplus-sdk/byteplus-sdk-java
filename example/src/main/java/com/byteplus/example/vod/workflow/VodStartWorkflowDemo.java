package com.byteplus.example.vod.workflow;

import com.byteplus.service.vod.IVodService;
import com.byteplus.service.vod.impl.VodServiceImpl;
import com.byteplus.service.vod.model.business.WorkflowParams;
import com.byteplus.service.vod.model.request.VodStartWorkflowRequest;
import com.byteplus.service.vod.model.response.VodStartWorkflowResponse;

public class VodStartWorkflowDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.byteplus/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        WorkflowParams inputParams = WorkflowParams.newBuilder().build();

        VodStartWorkflowRequest vodStartWorkflowRequest = VodStartWorkflowRequest.newBuilder()
                .setVid("your vid")
                .setInput(inputParams)
                .setTemplateId("your template_id")
                .setPriority(0)
                .setCallbackArgs("your callback_args")
                .build();

        try {
            VodStartWorkflowResponse vodStartWorkflowResponse = vodService.StartWorkflow(vodStartWorkflowRequest);
            if (vodStartWorkflowResponse.getResponseMetadata().hasError()) {
                System.out.println(vodStartWorkflowResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodStartWorkflowResponse.toString());
            System.out.println(vodStartWorkflowResponse.getResult().getRunId());
            System.out.println(vodStartWorkflowResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
