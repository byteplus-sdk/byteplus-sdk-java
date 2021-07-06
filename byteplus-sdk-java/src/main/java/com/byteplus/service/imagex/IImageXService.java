package com.byteplus.service.imagex;

import com.byteplus.model.request.ApplyImageUploadRequest;
import com.byteplus.model.request.CommitImageUploadRequest;
import com.byteplus.model.request.DeleteImageReq;
import com.byteplus.model.request.UpdateImageFilesRequest;
import com.byteplus.model.response.ApplyImageUploadResponse;
import com.byteplus.model.response.CommitImageUploadResponse;
import com.byteplus.model.response.CommonResponse;
import com.byteplus.model.response.DeleteImageResp;
import com.byteplus.model.response.UpdateImageFilesResponse;
import com.byteplus.model.sts2.SecurityToken2;
import com.byteplus.service.IBaseService;

import java.util.List;
import java.util.Map;

/**
 * The interface ImageX service.
 */
public interface IImageXService extends IBaseService {

    /**
     * Apply upload image.
     *
     * @param applyUploadRequest the apply upload request
     * @return the apply upload response
     * @throws Exception the exception
     */
    ApplyImageUploadResponse applyImageUpload(ApplyImageUploadRequest applyUploadRequest) throws Exception;

    /**
     * Commit upload image.
     *
     * @param commitUploadRequest the commit upload request
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse commitImageUpload(CommitImageUploadRequest commitUploadRequest) throws Exception;

    /**
     * Upload image data.
     *
     * @param request the apply upload request
     * @param imageDatas image data array
     * @return the commit upload response
     * @throws Exception the exception
     */
    CommitImageUploadResponse uploadImages(ApplyImageUploadRequest request, List<byte[]> imageDatas) throws Exception;

    /**
     * Get image upload token.
     *
     * @param params the params
     * @return the upload token
     * @throws Exception the exception
     */
    String getUploadToken(Map<String, String> params) throws Exception;

    /**
     * Get image upload sts2 auth with default expire time (1 hour).
     *
     * @param serviceIds service id list allowed to upload image to
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2(List<String> serviceIds) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire expire time in milliseconds
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithExpire(List<String> serviceIds, long expire) throws Exception;

    /**
     * Get image upload sts2 auth.
     *
     * @param serviceIds service id list allowed to upload image to
     * @param expire expire time in milliseconds
     * @param keyPtn upload store key pattern, * for no restriction. default to empty.
     * @return the upload sts2 auth
     * @throws Exception the exception
     */
    SecurityToken2 getUploadSts2WithKeyPtn(List<String> serviceIds, long expire, String keyPtn) throws Exception;

    /**
     * Delete images.
     *
     * @param req delete image req
     * @return delete image resp
     * @throws Exception the exception
     */
    DeleteImageResp deleteImages(DeleteImageReq req) throws Exception;

    /**
     * Update image urls.
     *
     * @param req update image urls req
     * @return udpate image urls resp
     * @throws Exception the exception
     */
    UpdateImageFilesResponse updateImageUrls(UpdateImageFilesRequest req) throws Exception;

    /**
     * Request ImageX api with method GET.
     * @param action api action name
     * @param param api query param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse getImageX(String action, Map<String, String> param) throws Exception;

    /**
     * Request ImageX api with method POST.
     * @param action api action name
     * @param param api query param
     * @param req api json param
     * @return api response
     * @throws Exception the exception
     */
    CommonResponse postImageX(String action, Map<String, String> param, Object req) throws Exception;
}
