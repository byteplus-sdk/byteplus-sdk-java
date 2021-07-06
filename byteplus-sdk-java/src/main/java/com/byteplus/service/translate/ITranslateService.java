package com.byteplus.service.translate;

import com.byteplus.model.request.LangDetectRequest;
import com.byteplus.model.request.TranslateImageRequest;
import com.byteplus.model.request.TranslateTextRequest;
import com.byteplus.model.response.LangDetectResponse;
import com.byteplus.model.response.TranslateImageResponse;
import com.byteplus.model.response.TranslateTextResponse;
import com.byteplus.service.IBaseService;

/**
 * The interface Translate service.
 */
public interface ITranslateService extends IBaseService {
    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception;

    /**
     * @param langDetectRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    TranslateTextResponse translateText(TranslateTextRequest langDetectRequest) throws Exception;

    /**
     *
     * @param translateImageRequest translateImageRequest
     * @return TranslateImageResponse
     * @throws Exception the exception
     */
    TranslateImageResponse translateImage(TranslateImageRequest translateImageRequest) throws Exception;
}
