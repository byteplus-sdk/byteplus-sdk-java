package com.byteplus.service.vedit;

import com.byteplus.model.request.SubmitDirectEditTaskRequest;
import com.byteplus.model.request.SubmitTemplateTaskRequest;
import com.byteplus.model.request.GetDirectEditResultRequest;
import com.byteplus.model.response.SubmitDirectEditTaskAsyncResponse;
import com.byteplus.model.response.SubmitTemplateTaskAsyncResponse;
import com.byteplus.model.response.GetDirectEditResultResponse;
import com.byteplus.service.IBaseService;

/**
 * The interface Vedit service.
 */
public interface IVEditService extends IBaseService {

    /**
     * Submit DirectEditTask Async
     *
     * @param submitDirectEditTaskRequest submit DirectEditTask request
     * @return the submit response
     * @throws Exception the exception
     */
    SubmitDirectEditTaskAsyncResponse submitDirectEditTaskAsync(SubmitDirectEditTaskRequest submitDirectEditTaskRequest) throws Exception;

    /**
     * Submit TemplateTask Async
     *
     * @param submitTemplateTaskRequest submit TemplateTask request
     * @return the submit response
     * @throws Exception the exception
     */
    SubmitTemplateTaskAsyncResponse submitTemplateTaskAsync(SubmitTemplateTaskRequest submitTemplateTaskRequest) throws Exception;

    /**
     * Get EditResult
     *
     * @param getDirectEditResultRequest get EditResult request
     * @return the result response
     * @throws Exception the exception
     */
    GetDirectEditResultResponse getDirectEditResult(GetDirectEditResultRequest getDirectEditResultRequest) throws Exception;
}
