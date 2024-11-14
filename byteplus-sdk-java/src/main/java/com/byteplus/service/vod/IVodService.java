
// Code generated by protoc-gen-volcengine-sdk
// source: byteplus/vod/service/service_vod.proto
// DO NOT EDIT!

package com.byteplus.service.vod;

/**
 * The interface Vod service.
 */
public interface IVodService extends com.byteplus.service.IBaseService {

	/**
	 * Gets private drm auth token.
	 *
	 * @param input the params
	 * @param expireSeconds the params
	 * @return the private drm auth token
	 * @throws Exception the exception
	 */
	String getPrivateDrmAuthToken(com.byteplus.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input, Long expireSeconds) throws Exception;

	/**
	 * Gets hls auth token.
	 *
	 * @param expireSeconds the params
	 * @return the hls auth token
	 * @throws Exception the exception
	 */
	String createSha1HlsDrmAuthToken(Long expireSeconds) throws Exception;

	/**
	 * Gets subtitle auth token.
	 *
	 * @param input the params
	 * @return the play auth token
	 * @throws Exception the exception
	 */
	String getSubtitleAuthToken(com.byteplus.service.vod.model.request.VodGetSubtitleInfoListRequest input, Long expireSeconds) throws Exception;

	/**
	 * Gets play auth token.
	 *
	 * @param input the params
	 * @return the play auth token
	 * @throws Exception the exception
	 */
	String getPlayAuthToken(com.byteplus.service.vod.model.request.VodGetPlayInfoRequest input, Long expireSeconds) throws Exception;

	/**
	 * Gets third drm auth token.
	 *
	 * @param input the params
	 * @return the third drm auth token
	 * @throws Exception the exception
	 */
	String getThirdPartyDrmAuthToken(com.byteplus.service.vod.model.request.VodGetDrmLicenseRequest input, Long expireSeconds) throws Exception;

	/**
	 * Gets fairplay cert url.
	 *
	 * @param certId cert id
	 * @return the fairplay cert acquisition url
	 * @throws Exception the exception
	 */
	String getFairPlayCertUrl(String certId, Long expireSeconds) throws Exception;

	/**
	 * Get Upload Sts2 token.
	 *
	 * @return com.byteplus.model.sts2.SecurityToken2
	 * @throws Exception the exception
	 */
	com.byteplus.model.sts2.SecurityToken2 getUploadSts2() throws Exception;

	/**
	 * Get Upload Sts2 token with expired time.
	 *
	 * @param expire long
	 * @return com.byteplus.model.sts2.SecurityToken2
	 * @throws Exception the exception
	 */
	com.byteplus.model.sts2.SecurityToken2 getUploadSts2WithExpire(long expire) throws Exception;

	/**
	 * uploadMedia
	 *
	 * @param vodUploadMediaRequest com.byteplus.service.vod.model.request.VodUploadMediaRequest
	 * @return com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse uploadMedia(com.byteplus.service.vod.model.request.VodUploadMediaRequest vodUploadMediaRequest, com.byteplus.helper.VodUploadProgressListener listener) throws Exception;

	/**
	 * uploadMaterial
	 *
	 * @param vodUploadMaterialRequest
	 * @return
	 * @throws Exception
	 */
	com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse uploadMaterial(com.byteplus.service.vod.model.request.VodUploadMaterialRequest vodUploadMaterialRequest, com.byteplus.helper.VodUploadProgressListener listener) throws Exception;

	/**
	 * submitDirectEditTaskAsync.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest
	 * @return com.byteplus.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodSubmitDirectEditTaskAsyncResponse submitDirectEditTaskAsync(com.byteplus.service.vod.model.request.VodSubmitDirectEditTaskAsyncRequest input) throws Exception;

	/**
	 * getDirectEditResult.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest
	 * @return com.byteplus.service.vod.model.response.VodGetDirectEditResultResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetDirectEditResultResponse getDirectEditResult(com.byteplus.service.vod.model.request.VodGetDirectEditResultRequest input) throws Exception;

	/**
	 * getDirectEditProgress.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetDirectEditProgressRequest
	 * @return com.byteplus.service.vod.model.response.VodGetDirectEditProgressResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetDirectEditProgressResponse getDirectEditProgress(com.byteplus.service.vod.model.request.VodGetDirectEditProgressRequest input) throws Exception;



	/**
	 * getPlayInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetPlayInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodGetPlayInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetPlayInfoResponse getPlayInfo(com.byteplus.service.vod.model.request.VodGetPlayInfoRequest input) throws Exception;

	/**
	 * getPrivateDrmPlayAuth.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest
	 * @return com.byteplus.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetPrivateDrmPlayAuthResponse getPrivateDrmPlayAuth(com.byteplus.service.vod.model.request.VodGetPrivateDrmPlayAuthRequest input) throws Exception;

	/**
	 * getHlsDecryptionKey.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetHlsDecryptionKeyRequest
	 * @return com.byteplus.service.vod.model.response.VodGetHlsDecryptionKeyResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetHlsDecryptionKeyResponse getHlsDecryptionKey(com.byteplus.service.vod.model.request.VodGetHlsDecryptionKeyRequest input) throws Exception;

	/**
	 * getPlayInfoWithLiveTimeShiftScene.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest
	 * @return com.byteplus.service.vod.model.response.VodGetPlayInfoWithLiveTimeShiftSceneResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetPlayInfoWithLiveTimeShiftSceneResponse getPlayInfoWithLiveTimeShiftScene(com.byteplus.service.vod.model.request.VodGetPlayInfoWithLiveTimeShiftSceneRequest input) throws Exception;

	/**
	 * uploadMediaByUrl.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUrlUploadRequest
	 * @return com.byteplus.service.vod.model.response.VodUrlUploadResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUrlUploadResponse uploadMediaByUrl(com.byteplus.service.vod.model.request.VodUrlUploadRequest input) throws Exception;

	/**
	 * queryUploadTaskInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodQueryUploadTaskInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodQueryUploadTaskInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodQueryUploadTaskInfoResponse queryUploadTaskInfo(com.byteplus.service.vod.model.request.VodQueryUploadTaskInfoRequest input) throws Exception;

	/**
	 * applyUploadInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodApplyUploadInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodApplyUploadInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodApplyUploadInfoResponse applyUploadInfo(com.byteplus.service.vod.model.request.VodApplyUploadInfoRequest input) throws Exception;

	/**
	 * commitUploadInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCommitUploadInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCommitUploadInfoResponse commitUploadInfo(com.byteplus.service.vod.model.request.VodCommitUploadInfoRequest input) throws Exception;

	/**
	 * updateMediaInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateMediaInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateMediaInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateMediaInfoResponse updateMediaInfo(com.byteplus.service.vod.model.request.VodUpdateMediaInfoRequest input) throws Exception;

	/**
	 * updateMediaPublishStatus.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateMediaPublishStatusRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateMediaPublishStatusResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateMediaPublishStatusResponse updateMediaPublishStatus(com.byteplus.service.vod.model.request.VodUpdateMediaPublishStatusRequest input) throws Exception;

	/**
	 * updateMediaStorageClass.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateMediaStorageClassRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateMediaStorageClassResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateMediaStorageClassResponse updateMediaStorageClass(com.byteplus.service.vod.model.request.VodUpdateMediaStorageClassRequest input) throws Exception;

	/**
	 * getMediaInfos.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetMediaInfosRequest
	 * @return com.byteplus.service.vod.model.response.VodGetMediaInfosResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetMediaInfosResponse getMediaInfos(com.byteplus.service.vod.model.request.VodGetMediaInfosRequest input) throws Exception;

	/**
	 * getRecommendedPoster.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetRecommendedPosterRequest
	 * @return com.byteplus.service.vod.model.response.VodGetRecommendedPosterResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetRecommendedPosterResponse getRecommendedPoster(com.byteplus.service.vod.model.request.VodGetRecommendedPosterRequest input) throws Exception;

	/**
	 * deleteMedia.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDeleteMediaRequest
	 * @return com.byteplus.service.vod.model.response.VodDeleteMediaResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDeleteMediaResponse deleteMedia(com.byteplus.service.vod.model.request.VodDeleteMediaRequest input) throws Exception;

	/**
	 * deleteTranscodes.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDeleteTranscodesRequest
	 * @return com.byteplus.service.vod.model.response.VodDeleteTranscodesResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDeleteTranscodesResponse deleteTranscodes(com.byteplus.service.vod.model.request.VodDeleteTranscodesRequest input) throws Exception;

	/**
	 * getMediaList.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetMediaListRequest
	 * @return com.byteplus.service.vod.model.response.VodGetMediaListResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetMediaListResponse getMediaList(com.byteplus.service.vod.model.request.VodGetMediaListRequest input) throws Exception;

	/**
	 * getSubtitleInfoList.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetSubtitleInfoListRequest
	 * @return com.byteplus.service.vod.model.response.VodGetSubtitleInfoListResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetSubtitleInfoListResponse getSubtitleInfoList(com.byteplus.service.vod.model.request.VodGetSubtitleInfoListRequest input) throws Exception;

	/**
	 * updateSubtitleStatus.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateSubtitleStatusRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateSubtitleStatusResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateSubtitleStatusResponse updateSubtitleStatus(com.byteplus.service.vod.model.request.VodUpdateSubtitleStatusRequest input) throws Exception;

	/**
	 * updateSubtitleInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateSubtitleInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateSubtitleInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateSubtitleInfoResponse updateSubtitleInfo(com.byteplus.service.vod.model.request.VodUpdateSubtitleInfoRequest input) throws Exception;

	/**
	 * createPlaylist.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreatePlaylistRequest
	 * @return com.byteplus.service.vod.model.response.VodCreatePlaylistResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreatePlaylistResponse createPlaylist(com.byteplus.service.vod.model.request.VodCreatePlaylistRequest input) throws Exception;

	/**
	 * getPlaylists.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetPlaylistsRequest
	 * @return com.byteplus.service.vod.model.response.VodGetPlaylistsResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetPlaylistsResponse getPlaylists(com.byteplus.service.vod.model.request.VodGetPlaylistsRequest input) throws Exception;

	/**
	 * updatePlaylist.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdatePlaylistRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdatePlaylistResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdatePlaylistResponse updatePlaylist(com.byteplus.service.vod.model.request.VodUpdatePlaylistRequest input) throws Exception;

	/**
	 * deletePlaylist.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDeletePlaylistRequest
	 * @return com.byteplus.service.vod.model.response.VodDeletePlaylistResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDeletePlaylistResponse deletePlaylist(com.byteplus.service.vod.model.request.VodDeletePlaylistRequest input) throws Exception;

	/**
	 * createVideoClassification.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreateVideoClassificationRequest
	 * @return com.byteplus.service.vod.model.response.VodCreateVideoClassificationResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreateVideoClassificationResponse createVideoClassification(com.byteplus.service.vod.model.request.VodCreateVideoClassificationRequest input) throws Exception;

	/**
	 * updateVideoClassification.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateVideoClassificationRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateVideoClassificationResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateVideoClassificationResponse updateVideoClassification(com.byteplus.service.vod.model.request.VodUpdateVideoClassificationRequest input) throws Exception;

	/**
	 * deleteVideoClassification.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDeleteVideoClassificationRequest
	 * @return com.byteplus.service.vod.model.response.VodDeleteVideoClassificationResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDeleteVideoClassificationResponse deleteVideoClassification(com.byteplus.service.vod.model.request.VodDeleteVideoClassificationRequest input) throws Exception;

	/**
	 * listVideoClassifications.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListVideoClassificationsRequest
	 * @return com.byteplus.service.vod.model.response.VodListVideoClassificationsResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListVideoClassificationsResponse listVideoClassifications(com.byteplus.service.vod.model.request.VodListVideoClassificationsRequest input) throws Exception;

	/**
	 * listSnapshots.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListSnapshotsRequest
	 * @return com.byteplus.service.vod.model.response.VodListSnapshotsResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListSnapshotsResponse listSnapshots(com.byteplus.service.vod.model.request.VodListSnapshotsRequest input) throws Exception;

	/**
	 * startWorkflow.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodStartWorkflowRequest
	 * @return com.byteplus.service.vod.model.response.VodStartWorkflowResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodStartWorkflowResponse startWorkflow(com.byteplus.service.vod.model.request.VodStartWorkflowRequest input) throws Exception;

	/**
	 * retrieveTranscodeResult.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodRetrieveTranscodeResultRequest
	 * @return com.byteplus.service.vod.model.response.VodRetrieveTranscodeResultResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodRetrieveTranscodeResultResponse retrieveTranscodeResult(com.byteplus.service.vod.model.request.VodRetrieveTranscodeResultRequest input) throws Exception;

	/**
	 * GetWorkflowExecution.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetWorkflowExecutionStatusRequest
	 * @return com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetWorkflowExecutionStatusResponse GetWorkflowExecution(com.byteplus.service.vod.model.request.VodGetWorkflowExecutionStatusRequest input) throws Exception;

	/**
	 * createSpace.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreateSpaceRequest
	 * @return com.byteplus.service.vod.model.response.VodCreateSpaceResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreateSpaceResponse createSpace(com.byteplus.service.vod.model.request.VodCreateSpaceRequest input) throws Exception;

	/**
	 * listSpace.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListSpaceRequest
	 * @return com.byteplus.service.vod.model.response.VodListSpaceResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListSpaceResponse listSpace(com.byteplus.service.vod.model.request.VodListSpaceRequest input) throws Exception;

	/**
	 * getSpaceDetail.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetSpaceDetailRequest
	 * @return com.byteplus.service.vod.model.response.VodGetSpaceDetailResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetSpaceDetailResponse getSpaceDetail(com.byteplus.service.vod.model.request.VodGetSpaceDetailRequest input) throws Exception;

	/**
	 * updateSpaceUploadConfig.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateSpaceUploadConfigRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateSpaceUploadConfigResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateSpaceUploadConfigResponse updateSpaceUploadConfig(com.byteplus.service.vod.model.request.VodUpdateSpaceUploadConfigRequest input) throws Exception;

	/**
	 * describeVodSpaceStorageData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest
	 * @return com.byteplus.service.vod.model.response.VodDescribeVodSpaceStorageDataResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDescribeVodSpaceStorageDataResponse describeVodSpaceStorageData(com.byteplus.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest input) throws Exception;

	/**
	 * startDomain.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodStartDomainRequest
	 * @return com.byteplus.service.vod.model.response.VodStartDomainResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodStartDomainResponse startDomain(com.byteplus.service.vod.model.request.VodStartDomainRequest input) throws Exception;

	/**
	 * stopDomain.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodStopDomainRequest
	 * @return com.byteplus.service.vod.model.response.VodStopDomainResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodStopDomainResponse stopDomain(com.byteplus.service.vod.model.request.VodStopDomainRequest input) throws Exception;

	/**
	 * addDomainToScheduler.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodAddDomainToSchedulerRequest
	 * @return com.byteplus.service.vod.model.response.VodAddDomainToSchedulerResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodAddDomainToSchedulerResponse addDomainToScheduler(com.byteplus.service.vod.model.request.VodAddDomainToSchedulerRequest input) throws Exception;

	/**
	 * removeDomainFromScheduler.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodRemoveDomainFromSchedulerRequest
	 * @return com.byteplus.service.vod.model.response.VodRemoveDomainFromSchedulerResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodRemoveDomainFromSchedulerResponse removeDomainFromScheduler(com.byteplus.service.vod.model.request.VodRemoveDomainFromSchedulerRequest input) throws Exception;

	/**
	 * updateDomainPlayRule.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateDomainPlayRuleRequestRequest
	 * @return com.byteplus.service.vod.model.response.VodUpdateDomainPlayRuleResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateDomainPlayRuleResponse updateDomainPlayRule(com.byteplus.service.vod.model.request.VodUpdateDomainPlayRuleRequestRequest input) throws Exception;

	/**
	 * listDomain.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListDomainRequest
	 * @return com.byteplus.service.vod.model.response.VodListDomainResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListDomainResponse listDomain(com.byteplus.service.vod.model.request.VodListDomainRequest input) throws Exception;

	/**
	 * createCdnRefreshTask.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreateCdnRefreshTaskRequest
	 * @return com.byteplus.service.vod.model.response.VodCreateCdnRefreshTaskResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreateCdnRefreshTaskResponse createCdnRefreshTask(com.byteplus.service.vod.model.request.VodCreateCdnRefreshTaskRequest input) throws Exception;

	/**
	 * createCdnPreloadTask.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreateCdnPreloadTaskRequest
	 * @return com.byteplus.service.vod.model.response.VodCreateCdnPreloadTaskResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreateCdnPreloadTaskResponse createCdnPreloadTask(com.byteplus.service.vod.model.request.VodCreateCdnPreloadTaskRequest input) throws Exception;

	/**
	 * listCdnTasks.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnTasksRequest
	 * @return com.byteplus.service.vod.model.response.VodListCdnTasksResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListCdnTasksResponse listCdnTasks(com.byteplus.service.vod.model.request.VodListCdnTasksRequest input) throws Exception;

	/**
	 * listCdnAccessLog.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnAccessLogRequest
	 * @return com.byteplus.service.vod.model.response.VodListCdnAccessLogResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListCdnAccessLogResponse listCdnAccessLog(com.byteplus.service.vod.model.request.VodListCdnAccessLogRequest input) throws Exception;

	/**
	 * listCdnTopAccessUrl.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnTopAccessUrlRequest
	 * @return com.byteplus.service.vod.model.response.VodListCdnTopAccessUrlResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListCdnTopAccessUrlResponse listCdnTopAccessUrl(com.byteplus.service.vod.model.request.VodListCdnTopAccessUrlRequest input) throws Exception;

	/**
	 * describeVodDomainBandwidthData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest
	 * @return com.byteplus.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDescribeVodDomainBandwidthDataResponse describeVodDomainBandwidthData(com.byteplus.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest input) throws Exception;

	/**
	 * listCdnUsageData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnUsageDataRequest
	 * @return com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnUsageData(com.byteplus.service.vod.model.request.VodListCdnUsageDataRequest input) throws Exception;

	/**
	 * listCdnUsageDataDetail.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnUsageDataDetailRequest
	 * @return com.byteplus.service.vod.model.response.VodListCdnUsageDataDetailResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListCdnUsageDataDetailResponse listCdnUsageDataDetail(com.byteplus.service.vod.model.request.VodListCdnUsageDataDetailRequest input) throws Exception;

	/**
	 * listCdnStatusData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnStatusDataRequest
	 * @return com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnStatusData(com.byteplus.service.vod.model.request.VodListCdnStatusDataRequest input) throws Exception;

	/**
	 * listCdnStatusDataDetail.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnStatusDataDetailRequest
	 * @return com.byteplus.service.vod.model.response.VodListCdnStatusDataDetailResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodListCdnStatusDataDetailResponse listCdnStatusDataDetail(com.byteplus.service.vod.model.request.VodListCdnStatusDataDetailRequest input) throws Exception;

	/**
	 * describeIpInfo.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDescribeIPInfoRequest
	 * @return com.byteplus.service.vod.model.response.VodDescribeIPInfoResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDescribeIPInfoResponse describeIpInfo(com.byteplus.service.vod.model.request.VodDescribeIPInfoRequest input) throws Exception;

	/**
	 * describeVodDomainTrafficData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodDescribeVodDomainTrafficDataRequest
	 * @return com.byteplus.service.vod.model.response.VodDescribeVodDomainTrafficDataResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodDescribeVodDomainTrafficDataResponse describeVodDomainTrafficData(com.byteplus.service.vod.model.request.VodDescribeVodDomainTrafficDataRequest input) throws Exception;

	/**
	 * listCdnPvData.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodListCdnPvDataRequest
	 * @return com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCdnStatisticsCommonResponse listCdnPvData(com.byteplus.service.vod.model.request.VodListCdnPvDataRequest input) throws Exception;

	/**
	 * submitBlockTasks.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest
	 * @return com.byteplus.service.vod.model.response.VodSubmitBlockTasksResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodSubmitBlockTasksResponse submitBlockTasks(com.byteplus.service.vod.model.request.VodSubmitBlockTasksRequest input) throws Exception;

	/**
	 * getContentBlockTasks.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodGetContentBlockTasksRequest
	 * @return com.byteplus.service.vod.model.response.VodGetContentBlockTasksResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodGetContentBlockTasksResponse getContentBlockTasks(com.byteplus.service.vod.model.request.VodGetContentBlockTasksRequest input) throws Exception;

	/**
	 * createDomain.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodCreateDomainV2Request
	 * @return com.byteplus.service.vod.model.response.VodCreateDomainV2Response
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodCreateDomainV2Response createDomain(com.byteplus.service.vod.model.request.VodCreateDomainV2Request input) throws Exception;

	/**
	 * updateDomainExpire.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodUpdateDomainExpireV2Request
	 * @return com.byteplus.service.vod.model.response.VodUpdateDomainExpireV2Response
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodUpdateDomainExpireV2Response updateDomainExpire(com.byteplus.service.vod.model.request.VodUpdateDomainExpireV2Request input) throws Exception;

	/**
	 * addOrUpdateCertificate.
	 *
	 * @param input com.byteplus.service.vod.model.request.AddOrUpdateCertificateV2Request
	 * @return com.byteplus.service.vod.model.response.AddOrUpdateCertificateV2Response
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.AddOrUpdateCertificateV2Response addOrUpdateCertificate(com.byteplus.service.vod.model.request.AddOrUpdateCertificateV2Request input) throws Exception;

	/**
	 * addCallbackSubscription.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodAddCallbackSubscriptionRequest
	 * @return com.byteplus.service.vod.model.response.VodAddCallbackSubscriptionResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodAddCallbackSubscriptionResponse addCallbackSubscription(com.byteplus.service.vod.model.request.VodAddCallbackSubscriptionRequest input) throws Exception;

	/**
	 * setCallbackEvent.
	 *
	 * @param input com.byteplus.service.vod.model.request.VodSetCallbackEventRequest
	 * @return com.byteplus.service.vod.model.response.VodSetCallbackEventResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.VodSetCallbackEventResponse setCallbackEvent(com.byteplus.service.vod.model.request.VodSetCallbackEventRequest input) throws Exception;

	/**
	 * describeVodSpaceTranscodeData.
	 *
	 * @param input com.byteplus.service.vod.model.request.DescribeVodSpaceTranscodeDataRequest
	 * @return com.byteplus.service.vod.model.response.DescribeVodSpaceTranscodeDataResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.DescribeVodSpaceTranscodeDataResponse describeVodSpaceTranscodeData(com.byteplus.service.vod.model.request.DescribeVodSpaceTranscodeDataRequest input) throws Exception;

	/**
	 * describeVodSnapshotData.
	 *
	 * @param input com.byteplus.service.vod.model.request.DescribeVodSnapshotDataRequest
	 * @return com.byteplus.service.vod.model.response.DescribeVodSnapshotDataResponse
	 * @throws Exception the exception
	 */
	com.byteplus.service.vod.model.response.DescribeVodSnapshotDataResponse describeVodSnapshotData(com.byteplus.service.vod.model.request.DescribeVodSnapshotDataRequest input) throws Exception;

}  // end of service interface
