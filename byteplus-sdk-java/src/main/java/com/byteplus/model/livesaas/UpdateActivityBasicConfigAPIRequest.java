package com.byteplus.model.livesaas;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class UpdateActivityBasicConfigAPIRequest {
    @JSONField(name = "ActivityId")
    Long activityId;

    @JSONField(name = "Name")
    String name;

    @JSONField(name = "LiveTime")
    Long liveTime;

    @JSONField(name = "IsCoverImageEnable")
    Integer isCoverImageEnable;

    @JSONField(name = "CoverImageUrl")
    String coverImageUrl;

    @JSONField(name = "CoverImageUrlDefault")
    String coverImageUrlDefault;

    @JSONField(name = "VerticalCoverImageUrl")
    String verticalCoverImageUrl;

    @JSONField(name = "IsPcBackImageEnable")
    Integer isPcBackImageEnable;

    @JSONField(name = "PcBackImageUrl")
    String pcBackImageUrl;

    @JSONField(name = "PcBackImageUrlDefault")
    String pcBackImageUrlDefault;

    @JSONField(name = "BackgroundColor")
    String backgroundColor;

    @JSONField(name = "IsMobileBackImageEnable")
    Integer isMobileBackImageEnable;

    @JSONField(name = "MobileBackImageUrl")
    String mobileBackImageUrl;

    @JSONField(name = "MobileBackImageUrlDefault")
    String mobileBackImageUrlDefault;

    @JSONField(name = "MobileBackgroundColor")
    String mobileBackgroundColor;

    @JSONField(name = "IsPreviewVideoEnable")
    Integer isPreviewVideoEnable;

    @JSONField(name = "PreviewVideoVid")
    String previewVideoVid;

    @JSONField(name = "PreviewVideoUrl")
    String previewVideoUrl;

    @JSONField(name = "PreviewVideoVidDefault")
    String previewVideoVidDefault;

    @JSONField(name = "IsPeopleCountEnable")
    Integer isPeopleCountEnable;

    @JSONField(name = "IsHeaderImageEnable")
    Integer isHeaderImageEnable;

    @JSONField(name = "HeaderImageUrl")
    String headerImageUrl;

    @JSONField(name = "IsWatermarkImageEnable")
    Integer isWatermarkImageEnable;

    @JSONField(name = "WatermarkImageUrl")
    String watermarkImageUrl;

    @JSONField(name = "IsThumbUpEnable")
    Integer isThumbUpEnable;

    @JSONField(name = "ThumbUpUrl")
    String thumbUpUrl;

    @JSONField(name = "ThumbUpUrlDefault")
    String thumbUpUrlDefault;

    @JSONField(name = "IsShareIconEnable")
    Integer isShareIconEnable;

    @JSONField(name = "ShareIconUrl")
    String shareIconUrl;

    @JSONField(name = "ShareIconUrlDefault")
    String shareIconUrlDefault;

    @JSONField(name = "IsCommentTranslateEnable")
    Integer isCommentTranslateEnable;

    @JSONField(name = "IsAnnouncementEnable")
    Integer isAnnouncementEnable;

    @JSONField(name = "Announcement")
    String announcement;

    @JSONField(name = "InteractionColor")
    String interactionColor;

    @JSONField(name = "FontColor")
    String fontColor;

    @JSONField(name = "ColorThemeIndex")
    String colorThemeIndex;

    @JSONField(name = "IsPCHeaderImageEnable")
    Integer isPCHeaderImageEnable;

    @JSONField(name = "PCHeaderImageUrl")
    String pCHeaderImageUrl;

    @JSONField(name = "IsCountDownEnable")
    Integer isCountDownEnable;

    @JSONField(name = "IsAutoStartEnable")
    Integer isAutoStartEnable;

    @JSONField(name = "AutoStartType")
    Integer autoStartType;

    @JSONField(name = "IsPageLimitEnable")
    Integer isPageLimitEnable;

    @JSONField(name = "PageLimitType")
    String pageLimitType;

    @JSONField(name = "IsLanguageEnable")
    Integer isLanguageEnable;

    @JSONField(name = "LanguageType")
    List<Integer> languageType;

    @JSONField(name = "SiteTags")
    List<UpdateActivityBasicConfigAPIRequestActTag> siteTags;

    @JSONField(name = "TextSiteTags")
    List<UpdateActivityBasicConfigAPIRequestTextActTag> textSiteTags;

    @JSONField(name = "PreviewVideoId")
    Long previewVideoId;

    @JSONField(name = "AccountId")
    Long accountId;

    @JSONField(name = "PreviewVideoReviewStatus")
    Integer previewVideoReviewStatus;

    @JSONField(name = "DefaultSubtitleLanguage")
    String defaultSubtitleLanguage;

    @JSONField(name = "SourceSubtitleLanguage")
    String sourceSubtitleLanguage;

    @JSONField(name = "OpenLiveAvextractorTask")
    Integer openLiveAvextractorTask;

    @JSONField(name = "IsTimeShift")
    Integer isTimeShift;

    @JSONField(name = "PreviewVideoCoverImage")
    String previewVideoCoverImage;

    @JSONField(name = "PreviewVideoMediaName")
    String previewVideoMediaName;

    @JSONField(name = "IsPreviewPromptEnable")
    Integer isPreviewPromptEnable;

    @JSONField(name = "PreviewPrompt")
    String previewPrompt;

    @JSONField(name = "IsReservationEnable")
    Integer isReservationEnable;

    @JSONField(name = "ReservationTime")
    Integer reservationTime;

    @JSONField(name = "ReservationText")
    String reservationText;

    @JSONField(name = "WatermarkPosition")
    Integer watermarkPosition;

    @JSONField(name = "IsReplayBulletChat")
    Integer isReplayBulletChat;

    @JSONField(name = "PresenterChatColor")
    String presenterChatColor;

    @JSONField(name = "IsLiveBulletChat")
    Integer isLiveBulletChat;

    @JSONField(name = "IsBackgroundBlur")
    Integer isBackgroundBlur;

    @JSONField(name = "FeedbackMessage")
    String feedbackMessage;

    @JSONField(name = "IsFeedbackEnable")
    Integer isFeedbackEnable;

    @JSONField(name = "IsThumbUpNumberEnable")
    Integer isThumbUpNumberEnable;

    @JSONField(name = "SmsLanguage")
    Integer smsLanguage;

    @JSONField(name = "MobileChatBackgroundColor")
    String mobileChatBackgroundColor;

    @JSONField(name = "ConfigVersion")
    Integer configVersion;

    @JSONField(name = "LiveZone")
    Integer liveZone;

    @JSONField(name = "RiskWarningSetting")
    UpdateActivityBasicConfigAPIRequestRiskWarningSetting riskWarningSetting;

    @JSONField(name = "IsPlayerTopEnable")
    Integer isPlayerTopEnable;

    @JSONField(name = "PlayerTopType")
    List<Integer> playerTopType;

    @JSONField(name = "IsReplayAutoOnlineEnable")
    Integer isReplayAutoOnlineEnable;

    @JSONField(name = "IsReservationSmsEnable")
    Integer isReservationSmsEnable;

    @JSONField(name = "IsSDKPlayEnable")
    Integer isSDKPlayEnable;

    @JSONField(name = "SDKPlayStatus")
    Integer sDKPlayStatus;

    @Data
    static class UpdateActivityBasicConfigAPIRequestActTag {
        @JSONField(name = "Value")
        String value;

        @JSONField(name = "Index")
        Long index;
    }

    @Data
    static class UpdateActivityBasicConfigAPIRequestTextActTag {
        @JSONField(name = "Value")
        String value;

        @JSONField(name = "Index")
        Long index;
    }

    @Data
    static class UpdateActivityBasicConfigAPIRequestRiskWarningSetting {
        @JSONField(name = "IsRiskWarningEnable")
        Long isRiskWarningEnable;

        @JSONField(name = "RiskWarningButtonText")
        String riskWarningButtonText;

        @JSONField(name = "RiskWarningContent")
        String riskWarningContent;

        @JSONField(name = "RiskWarningTitle")
        String riskWarningTitle;

    }
}
