/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class User  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String aboutMe;

    private com.sforce.soap.enterprise.QueryResult acceptedEventRelations;

    private com.sforce.soap.enterprise.sobject.Account account;

    private com.sforce.soap.enterprise.QueryResult accountCleanInfoReviewers;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.Address address;

    private java.lang.String alias;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private java.lang.String badgeText;

    private java.lang.String callCenterId;

    private com.sforce.soap.enterprise.QueryResult campsite_Reservations__r;

    private java.lang.String city;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private java.lang.String communityNickname;

    private java.lang.String companyName;

    private com.sforce.soap.enterprise.sobject.Contact contact;

    private com.sforce.soap.enterprise.QueryResult contactCleanInfoReviewers;

    private java.lang.String contactId;

    private com.sforce.soap.enterprise.QueryResult contractsSigned;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult declinedEventRelations;

    private java.lang.String defaultGroupNotificationFrequency;

    private java.lang.String delegatedApproverId;

    private com.sforce.soap.enterprise.QueryResult delegatedUsers;

    private java.lang.String department;

    private java.lang.String digestFrequency;

    private java.lang.String division;

    private java.lang.String email;

    private java.lang.String emailEncodingKey;

    private java.lang.Boolean emailPreferencesAutoBcc;

    private java.lang.Boolean emailPreferencesAutoBccStayInTouch;

    private java.lang.Boolean emailPreferencesStayInTouchReminder;

    private java.lang.String employeeNumber;

    private com.sforce.soap.enterprise.QueryResult eventRelations;

    private java.lang.String extension;

    private com.sforce.soap.enterprise.QueryResult externalDataUserAuths;

    private java.lang.String fax;

    private java.lang.String federationIdentifier;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptions;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String firstName;

    private java.lang.Boolean forecastEnabled;

    private java.lang.String fullPhotoUrl;

    private java.lang.String geocodeAccuracy;

    private com.sforce.soap.enterprise.QueryResult groupMembershipRequests;

    private com.sforce.soap.enterprise.QueryResult groupMemberships;

    private com.sforce.soap.enterprise.QueryResult installedMobileApps;

    private java.lang.Boolean isActive;

    private java.lang.Integer jigsawImportLimitOverride;

    private java.lang.String languageLocaleKey;

    private java.util.Calendar lastLoginDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private java.util.Calendar lastPasswordChangeDate;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private java.lang.Double latitude;

    private com.sforce.soap.enterprise.QueryResult leadCleanInfoReviewers;

    private java.lang.String localeSidKey;

    private java.lang.Double longitude;

    private com.sforce.soap.enterprise.QueryResult managedUsers;

    private com.sforce.soap.enterprise.sobject.User manager;

    private java.lang.String managerId;

    private java.lang.String mobilePhone;

    private java.lang.String name;

    private java.util.Calendar offlinePdaTrialExpirationDate;

    private java.util.Calendar offlineTrialExpirationDate;

    private com.sforce.soap.enterprise.QueryResult ownedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult permissionSetAssignments;

    private com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private com.sforce.soap.enterprise.sobject.Profile profile;

    private java.lang.String profileId;

    private java.lang.Boolean receivesAdminInfoEmails;

    private java.lang.Boolean receivesInfoEmails;

    private java.lang.String senderEmail;

    private java.lang.String senderName;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.lang.String signature;

    private java.lang.String smallPhotoUrl;

    private java.lang.String state;

    private java.lang.String stayInTouchNote;

    private java.lang.String stayInTouchSignature;

    private java.lang.String stayInTouchSubject;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.lang.String timeZoneSidKey;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult undecidedEventRelations;

    private com.sforce.soap.enterprise.QueryResult userEntityAccessRights;

    private com.sforce.soap.enterprise.QueryResult userFieldAccessRights;

    private java.lang.Boolean userPermissionsCallCenterAutoLogin;

    private java.lang.Boolean userPermissionsChatterAnswersUser;

    private java.lang.Boolean userPermissionsInteractionUser;

    private java.lang.Boolean userPermissionsJigsawProspectingUser;

    private java.lang.Boolean userPermissionsKnowledgeUser;

    private java.lang.Boolean userPermissionsMarketingUser;

    private java.lang.Boolean userPermissionsMobileUser;

    private java.lang.Boolean userPermissionsOfflineUser;

    private java.lang.Boolean userPermissionsSFContentUser;

    private java.lang.Boolean userPermissionsSiteforceContributorUser;

    private java.lang.Boolean userPermissionsSiteforcePublisherUser;

    private java.lang.Boolean userPermissionsSupportUser;

    private java.lang.Boolean userPermissionsWorkDotComUserFeature;

    private com.sforce.soap.enterprise.QueryResult userPreferences;

    private java.lang.Boolean userPreferencesActivityRemindersPopup;

    private java.lang.Boolean userPreferencesApexPagesDeveloperMode;

    private java.lang.Boolean userPreferencesCacheDiagnostics;

    private java.lang.Boolean userPreferencesContentEmailAsAndWhen;

    private java.lang.Boolean userPreferencesContentNoEmail;

    private java.lang.Boolean userPreferencesDisCommentAfterLikeEmail;

    private java.lang.Boolean userPreferencesDisMentionsCommentEmail;

    private java.lang.Boolean userPreferencesDisProfPostCommentEmail;

    private java.lang.Boolean userPreferencesDisableAllFeedsEmail;

    private java.lang.Boolean userPreferencesDisableBookmarkEmail;

    private java.lang.Boolean userPreferencesDisableChangeCommentEmail;

    private java.lang.Boolean userPreferencesDisableEndorsementEmail;

    private java.lang.Boolean userPreferencesDisableFeedbackEmail;

    private java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi;

    private java.lang.Boolean userPreferencesDisableFollowersEmail;

    private java.lang.Boolean userPreferencesDisableLaterCommentEmail;

    private java.lang.Boolean userPreferencesDisableLikeEmail;

    private java.lang.Boolean userPreferencesDisableMentionsPostEmail;

    private java.lang.Boolean userPreferencesDisableMessageEmail;

    private java.lang.Boolean userPreferencesDisableProfilePostEmail;

    private java.lang.Boolean userPreferencesDisableSharePostEmail;

    private java.lang.Boolean userPreferencesDisableWorkEmail;

    private java.lang.Boolean userPreferencesEnableAutoSubForFeeds;

    private java.lang.Boolean userPreferencesEventRemindersCheckboxDefault;

    private java.lang.Boolean userPreferencesHideCSNDesktopTask;

    private java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask;

    private java.lang.Boolean userPreferencesHideChatterOnboardingSplash;

    private java.lang.Boolean userPreferencesHideS1BrowserUI;

    private java.lang.Boolean userPreferencesHideSecondChatterOnboardingSplash;

    private java.lang.Boolean userPreferencesJigsawListUser;

    private java.lang.Boolean userPreferencesLightningExperiencePreferred;

    private java.lang.Boolean userPreferencesPathAssistantCollapsed;

    private java.lang.Boolean userPreferencesReminderSoundOff;

    private java.lang.Boolean userPreferencesShowCityToExternalUsers;

    private java.lang.Boolean userPreferencesShowCityToGuestUsers;

    private java.lang.Boolean userPreferencesShowCountryToExternalUsers;

    private java.lang.Boolean userPreferencesShowCountryToGuestUsers;

    private java.lang.Boolean userPreferencesShowEmailToExternalUsers;

    private java.lang.Boolean userPreferencesShowEmailToGuestUsers;

    private java.lang.Boolean userPreferencesShowFaxToExternalUsers;

    private java.lang.Boolean userPreferencesShowFaxToGuestUsers;

    private java.lang.Boolean userPreferencesShowManagerToExternalUsers;

    private java.lang.Boolean userPreferencesShowManagerToGuestUsers;

    private java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers;

    private java.lang.Boolean userPreferencesShowMobilePhoneToGuestUsers;

    private java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers;

    private java.lang.Boolean userPreferencesShowPostalCodeToGuestUsers;

    private java.lang.Boolean userPreferencesShowProfilePicToGuestUsers;

    private java.lang.Boolean userPreferencesShowStateToExternalUsers;

    private java.lang.Boolean userPreferencesShowStateToGuestUsers;

    private java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers;

    private java.lang.Boolean userPreferencesShowStreetAddressToGuestUsers;

    private java.lang.Boolean userPreferencesShowTitleToExternalUsers;

    private java.lang.Boolean userPreferencesShowTitleToGuestUsers;

    private java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers;

    private java.lang.Boolean userPreferencesShowWorkPhoneToGuestUsers;

    private java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault;

    private com.sforce.soap.enterprise.sobject.UserRole userRole;

    private java.lang.String userRoleId;

    private com.sforce.soap.enterprise.QueryResult userSites;

    private java.lang.String userType;

    private java.lang.String username;

    public User() {
    }

    public User(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String aboutMe,
           com.sforce.soap.enterprise.QueryResult acceptedEventRelations,
           com.sforce.soap.enterprise.sobject.Account account,
           com.sforce.soap.enterprise.QueryResult accountCleanInfoReviewers,
           java.lang.String accountId,
           com.sforce.soap.enterprise.Address address,
           java.lang.String alias,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           java.lang.String badgeText,
           java.lang.String callCenterId,
           com.sforce.soap.enterprise.QueryResult campsite_Reservations__r,
           java.lang.String city,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           java.lang.String communityNickname,
           java.lang.String companyName,
           com.sforce.soap.enterprise.sobject.Contact contact,
           com.sforce.soap.enterprise.QueryResult contactCleanInfoReviewers,
           java.lang.String contactId,
           com.sforce.soap.enterprise.QueryResult contractsSigned,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult declinedEventRelations,
           java.lang.String defaultGroupNotificationFrequency,
           java.lang.String delegatedApproverId,
           com.sforce.soap.enterprise.QueryResult delegatedUsers,
           java.lang.String department,
           java.lang.String digestFrequency,
           java.lang.String division,
           java.lang.String email,
           java.lang.String emailEncodingKey,
           java.lang.Boolean emailPreferencesAutoBcc,
           java.lang.Boolean emailPreferencesAutoBccStayInTouch,
           java.lang.Boolean emailPreferencesStayInTouchReminder,
           java.lang.String employeeNumber,
           com.sforce.soap.enterprise.QueryResult eventRelations,
           java.lang.String extension,
           com.sforce.soap.enterprise.QueryResult externalDataUserAuths,
           java.lang.String fax,
           java.lang.String federationIdentifier,
           com.sforce.soap.enterprise.QueryResult feedSubscriptions,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String firstName,
           java.lang.Boolean forecastEnabled,
           java.lang.String fullPhotoUrl,
           java.lang.String geocodeAccuracy,
           com.sforce.soap.enterprise.QueryResult groupMembershipRequests,
           com.sforce.soap.enterprise.QueryResult groupMemberships,
           com.sforce.soap.enterprise.QueryResult installedMobileApps,
           java.lang.Boolean isActive,
           java.lang.Integer jigsawImportLimitOverride,
           java.lang.String languageLocaleKey,
           java.util.Calendar lastLoginDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           java.util.Calendar lastPasswordChangeDate,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           java.lang.Double latitude,
           com.sforce.soap.enterprise.QueryResult leadCleanInfoReviewers,
           java.lang.String localeSidKey,
           java.lang.Double longitude,
           com.sforce.soap.enterprise.QueryResult managedUsers,
           com.sforce.soap.enterprise.sobject.User manager,
           java.lang.String managerId,
           java.lang.String mobilePhone,
           java.lang.String name,
           java.util.Calendar offlinePdaTrialExpirationDate,
           java.util.Calendar offlineTrialExpirationDate,
           com.sforce.soap.enterprise.QueryResult ownedContentDocuments,
           com.sforce.soap.enterprise.QueryResult permissionSetAssignments,
           com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments,
           java.lang.String phone,
           java.lang.String postalCode,
           com.sforce.soap.enterprise.sobject.Profile profile,
           java.lang.String profileId,
           java.lang.Boolean receivesAdminInfoEmails,
           java.lang.Boolean receivesInfoEmails,
           java.lang.String senderEmail,
           java.lang.String senderName,
           com.sforce.soap.enterprise.QueryResult shares,
           java.lang.String signature,
           java.lang.String smallPhotoUrl,
           java.lang.String state,
           java.lang.String stayInTouchNote,
           java.lang.String stayInTouchSignature,
           java.lang.String stayInTouchSubject,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.lang.String timeZoneSidKey,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult undecidedEventRelations,
           com.sforce.soap.enterprise.QueryResult userEntityAccessRights,
           com.sforce.soap.enterprise.QueryResult userFieldAccessRights,
           java.lang.Boolean userPermissionsCallCenterAutoLogin,
           java.lang.Boolean userPermissionsChatterAnswersUser,
           java.lang.Boolean userPermissionsInteractionUser,
           java.lang.Boolean userPermissionsJigsawProspectingUser,
           java.lang.Boolean userPermissionsKnowledgeUser,
           java.lang.Boolean userPermissionsMarketingUser,
           java.lang.Boolean userPermissionsMobileUser,
           java.lang.Boolean userPermissionsOfflineUser,
           java.lang.Boolean userPermissionsSFContentUser,
           java.lang.Boolean userPermissionsSiteforceContributorUser,
           java.lang.Boolean userPermissionsSiteforcePublisherUser,
           java.lang.Boolean userPermissionsSupportUser,
           java.lang.Boolean userPermissionsWorkDotComUserFeature,
           com.sforce.soap.enterprise.QueryResult userPreferences,
           java.lang.Boolean userPreferencesActivityRemindersPopup,
           java.lang.Boolean userPreferencesApexPagesDeveloperMode,
           java.lang.Boolean userPreferencesCacheDiagnostics,
           java.lang.Boolean userPreferencesContentEmailAsAndWhen,
           java.lang.Boolean userPreferencesContentNoEmail,
           java.lang.Boolean userPreferencesDisCommentAfterLikeEmail,
           java.lang.Boolean userPreferencesDisMentionsCommentEmail,
           java.lang.Boolean userPreferencesDisProfPostCommentEmail,
           java.lang.Boolean userPreferencesDisableAllFeedsEmail,
           java.lang.Boolean userPreferencesDisableBookmarkEmail,
           java.lang.Boolean userPreferencesDisableChangeCommentEmail,
           java.lang.Boolean userPreferencesDisableEndorsementEmail,
           java.lang.Boolean userPreferencesDisableFeedbackEmail,
           java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi,
           java.lang.Boolean userPreferencesDisableFollowersEmail,
           java.lang.Boolean userPreferencesDisableLaterCommentEmail,
           java.lang.Boolean userPreferencesDisableLikeEmail,
           java.lang.Boolean userPreferencesDisableMentionsPostEmail,
           java.lang.Boolean userPreferencesDisableMessageEmail,
           java.lang.Boolean userPreferencesDisableProfilePostEmail,
           java.lang.Boolean userPreferencesDisableSharePostEmail,
           java.lang.Boolean userPreferencesDisableWorkEmail,
           java.lang.Boolean userPreferencesEnableAutoSubForFeeds,
           java.lang.Boolean userPreferencesEventRemindersCheckboxDefault,
           java.lang.Boolean userPreferencesHideCSNDesktopTask,
           java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask,
           java.lang.Boolean userPreferencesHideChatterOnboardingSplash,
           java.lang.Boolean userPreferencesHideS1BrowserUI,
           java.lang.Boolean userPreferencesHideSecondChatterOnboardingSplash,
           java.lang.Boolean userPreferencesJigsawListUser,
           java.lang.Boolean userPreferencesLightningExperiencePreferred,
           java.lang.Boolean userPreferencesPathAssistantCollapsed,
           java.lang.Boolean userPreferencesReminderSoundOff,
           java.lang.Boolean userPreferencesShowCityToExternalUsers,
           java.lang.Boolean userPreferencesShowCityToGuestUsers,
           java.lang.Boolean userPreferencesShowCountryToExternalUsers,
           java.lang.Boolean userPreferencesShowCountryToGuestUsers,
           java.lang.Boolean userPreferencesShowEmailToExternalUsers,
           java.lang.Boolean userPreferencesShowEmailToGuestUsers,
           java.lang.Boolean userPreferencesShowFaxToExternalUsers,
           java.lang.Boolean userPreferencesShowFaxToGuestUsers,
           java.lang.Boolean userPreferencesShowManagerToExternalUsers,
           java.lang.Boolean userPreferencesShowManagerToGuestUsers,
           java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers,
           java.lang.Boolean userPreferencesShowMobilePhoneToGuestUsers,
           java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers,
           java.lang.Boolean userPreferencesShowPostalCodeToGuestUsers,
           java.lang.Boolean userPreferencesShowProfilePicToGuestUsers,
           java.lang.Boolean userPreferencesShowStateToExternalUsers,
           java.lang.Boolean userPreferencesShowStateToGuestUsers,
           java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers,
           java.lang.Boolean userPreferencesShowStreetAddressToGuestUsers,
           java.lang.Boolean userPreferencesShowTitleToExternalUsers,
           java.lang.Boolean userPreferencesShowTitleToGuestUsers,
           java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers,
           java.lang.Boolean userPreferencesShowWorkPhoneToGuestUsers,
           java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault,
           com.sforce.soap.enterprise.sobject.UserRole userRole,
           java.lang.String userRoleId,
           com.sforce.soap.enterprise.QueryResult userSites,
           java.lang.String userType,
           java.lang.String username) {
        super(
            fieldsToNull,
            id);
        this.aboutMe = aboutMe;
        this.acceptedEventRelations = acceptedEventRelations;
        this.account = account;
        this.accountCleanInfoReviewers = accountCleanInfoReviewers;
        this.accountId = accountId;
        this.address = address;
        this.alias = alias;
        this.attachedContentDocuments = attachedContentDocuments;
        this.badgeText = badgeText;
        this.callCenterId = callCenterId;
        this.campsite_Reservations__r = campsite_Reservations__r;
        this.city = city;
        this.combinedAttachments = combinedAttachments;
        this.communityNickname = communityNickname;
        this.companyName = companyName;
        this.contact = contact;
        this.contactCleanInfoReviewers = contactCleanInfoReviewers;
        this.contactId = contactId;
        this.contractsSigned = contractsSigned;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.declinedEventRelations = declinedEventRelations;
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
        this.delegatedApproverId = delegatedApproverId;
        this.delegatedUsers = delegatedUsers;
        this.department = department;
        this.digestFrequency = digestFrequency;
        this.division = division;
        this.email = email;
        this.emailEncodingKey = emailEncodingKey;
        this.emailPreferencesAutoBcc = emailPreferencesAutoBcc;
        this.emailPreferencesAutoBccStayInTouch = emailPreferencesAutoBccStayInTouch;
        this.emailPreferencesStayInTouchReminder = emailPreferencesStayInTouchReminder;
        this.employeeNumber = employeeNumber;
        this.eventRelations = eventRelations;
        this.extension = extension;
        this.externalDataUserAuths = externalDataUserAuths;
        this.fax = fax;
        this.federationIdentifier = federationIdentifier;
        this.feedSubscriptions = feedSubscriptions;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.firstName = firstName;
        this.forecastEnabled = forecastEnabled;
        this.fullPhotoUrl = fullPhotoUrl;
        this.geocodeAccuracy = geocodeAccuracy;
        this.groupMembershipRequests = groupMembershipRequests;
        this.groupMemberships = groupMemberships;
        this.installedMobileApps = installedMobileApps;
        this.isActive = isActive;
        this.jigsawImportLimitOverride = jigsawImportLimitOverride;
        this.languageLocaleKey = languageLocaleKey;
        this.lastLoginDate = lastLoginDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastPasswordChangeDate = lastPasswordChangeDate;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.latitude = latitude;
        this.leadCleanInfoReviewers = leadCleanInfoReviewers;
        this.localeSidKey = localeSidKey;
        this.longitude = longitude;
        this.managedUsers = managedUsers;
        this.manager = manager;
        this.managerId = managerId;
        this.mobilePhone = mobilePhone;
        this.name = name;
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
        this.ownedContentDocuments = ownedContentDocuments;
        this.permissionSetAssignments = permissionSetAssignments;
        this.permissionSetLicenseAssignments = permissionSetLicenseAssignments;
        this.phone = phone;
        this.postalCode = postalCode;
        this.profile = profile;
        this.profileId = profileId;
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
        this.receivesInfoEmails = receivesInfoEmails;
        this.senderEmail = senderEmail;
        this.senderName = senderName;
        this.shares = shares;
        this.signature = signature;
        this.smallPhotoUrl = smallPhotoUrl;
        this.state = state;
        this.stayInTouchNote = stayInTouchNote;
        this.stayInTouchSignature = stayInTouchSignature;
        this.stayInTouchSubject = stayInTouchSubject;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.timeZoneSidKey = timeZoneSidKey;
        this.title = title;
        this.undecidedEventRelations = undecidedEventRelations;
        this.userEntityAccessRights = userEntityAccessRights;
        this.userFieldAccessRights = userFieldAccessRights;
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
        this.userPermissionsChatterAnswersUser = userPermissionsChatterAnswersUser;
        this.userPermissionsInteractionUser = userPermissionsInteractionUser;
        this.userPermissionsJigsawProspectingUser = userPermissionsJigsawProspectingUser;
        this.userPermissionsKnowledgeUser = userPermissionsKnowledgeUser;
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
        this.userPermissionsMobileUser = userPermissionsMobileUser;
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
        this.userPermissionsSiteforceContributorUser = userPermissionsSiteforceContributorUser;
        this.userPermissionsSiteforcePublisherUser = userPermissionsSiteforcePublisherUser;
        this.userPermissionsSupportUser = userPermissionsSupportUser;
        this.userPermissionsWorkDotComUserFeature = userPermissionsWorkDotComUserFeature;
        this.userPreferences = userPreferences;
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
        this.userPreferencesCacheDiagnostics = userPreferencesCacheDiagnostics;
        this.userPreferencesContentEmailAsAndWhen = userPreferencesContentEmailAsAndWhen;
        this.userPreferencesContentNoEmail = userPreferencesContentNoEmail;
        this.userPreferencesDisCommentAfterLikeEmail = userPreferencesDisCommentAfterLikeEmail;
        this.userPreferencesDisMentionsCommentEmail = userPreferencesDisMentionsCommentEmail;
        this.userPreferencesDisProfPostCommentEmail = userPreferencesDisProfPostCommentEmail;
        this.userPreferencesDisableAllFeedsEmail = userPreferencesDisableAllFeedsEmail;
        this.userPreferencesDisableBookmarkEmail = userPreferencesDisableBookmarkEmail;
        this.userPreferencesDisableChangeCommentEmail = userPreferencesDisableChangeCommentEmail;
        this.userPreferencesDisableEndorsementEmail = userPreferencesDisableEndorsementEmail;
        this.userPreferencesDisableFeedbackEmail = userPreferencesDisableFeedbackEmail;
        this.userPreferencesDisableFileShareNotificationsForApi = userPreferencesDisableFileShareNotificationsForApi;
        this.userPreferencesDisableFollowersEmail = userPreferencesDisableFollowersEmail;
        this.userPreferencesDisableLaterCommentEmail = userPreferencesDisableLaterCommentEmail;
        this.userPreferencesDisableLikeEmail = userPreferencesDisableLikeEmail;
        this.userPreferencesDisableMentionsPostEmail = userPreferencesDisableMentionsPostEmail;
        this.userPreferencesDisableMessageEmail = userPreferencesDisableMessageEmail;
        this.userPreferencesDisableProfilePostEmail = userPreferencesDisableProfilePostEmail;
        this.userPreferencesDisableSharePostEmail = userPreferencesDisableSharePostEmail;
        this.userPreferencesDisableWorkEmail = userPreferencesDisableWorkEmail;
        this.userPreferencesEnableAutoSubForFeeds = userPreferencesEnableAutoSubForFeeds;
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
        this.userPreferencesHideCSNDesktopTask = userPreferencesHideCSNDesktopTask;
        this.userPreferencesHideCSNGetChatterMobileTask = userPreferencesHideCSNGetChatterMobileTask;
        this.userPreferencesHideChatterOnboardingSplash = userPreferencesHideChatterOnboardingSplash;
        this.userPreferencesHideS1BrowserUI = userPreferencesHideS1BrowserUI;
        this.userPreferencesHideSecondChatterOnboardingSplash = userPreferencesHideSecondChatterOnboardingSplash;
        this.userPreferencesJigsawListUser = userPreferencesJigsawListUser;
        this.userPreferencesLightningExperiencePreferred = userPreferencesLightningExperiencePreferred;
        this.userPreferencesPathAssistantCollapsed = userPreferencesPathAssistantCollapsed;
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
        this.userPreferencesShowCityToExternalUsers = userPreferencesShowCityToExternalUsers;
        this.userPreferencesShowCityToGuestUsers = userPreferencesShowCityToGuestUsers;
        this.userPreferencesShowCountryToExternalUsers = userPreferencesShowCountryToExternalUsers;
        this.userPreferencesShowCountryToGuestUsers = userPreferencesShowCountryToGuestUsers;
        this.userPreferencesShowEmailToExternalUsers = userPreferencesShowEmailToExternalUsers;
        this.userPreferencesShowEmailToGuestUsers = userPreferencesShowEmailToGuestUsers;
        this.userPreferencesShowFaxToExternalUsers = userPreferencesShowFaxToExternalUsers;
        this.userPreferencesShowFaxToGuestUsers = userPreferencesShowFaxToGuestUsers;
        this.userPreferencesShowManagerToExternalUsers = userPreferencesShowManagerToExternalUsers;
        this.userPreferencesShowManagerToGuestUsers = userPreferencesShowManagerToGuestUsers;
        this.userPreferencesShowMobilePhoneToExternalUsers = userPreferencesShowMobilePhoneToExternalUsers;
        this.userPreferencesShowMobilePhoneToGuestUsers = userPreferencesShowMobilePhoneToGuestUsers;
        this.userPreferencesShowPostalCodeToExternalUsers = userPreferencesShowPostalCodeToExternalUsers;
        this.userPreferencesShowPostalCodeToGuestUsers = userPreferencesShowPostalCodeToGuestUsers;
        this.userPreferencesShowProfilePicToGuestUsers = userPreferencesShowProfilePicToGuestUsers;
        this.userPreferencesShowStateToExternalUsers = userPreferencesShowStateToExternalUsers;
        this.userPreferencesShowStateToGuestUsers = userPreferencesShowStateToGuestUsers;
        this.userPreferencesShowStreetAddressToExternalUsers = userPreferencesShowStreetAddressToExternalUsers;
        this.userPreferencesShowStreetAddressToGuestUsers = userPreferencesShowStreetAddressToGuestUsers;
        this.userPreferencesShowTitleToExternalUsers = userPreferencesShowTitleToExternalUsers;
        this.userPreferencesShowTitleToGuestUsers = userPreferencesShowTitleToGuestUsers;
        this.userPreferencesShowWorkPhoneToExternalUsers = userPreferencesShowWorkPhoneToExternalUsers;
        this.userPreferencesShowWorkPhoneToGuestUsers = userPreferencesShowWorkPhoneToGuestUsers;
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
        this.userRole = userRole;
        this.userRoleId = userRoleId;
        this.userSites = userSites;
        this.userType = userType;
        this.username = username;
    }


    /**
     * Gets the aboutMe value for this User.
     * 
     * @return aboutMe
     */
    public java.lang.String getAboutMe() {
        return aboutMe;
    }


    /**
     * Sets the aboutMe value for this User.
     * 
     * @param aboutMe
     */
    public void setAboutMe(java.lang.String aboutMe) {
        this.aboutMe = aboutMe;
    }


    /**
     * Gets the acceptedEventRelations value for this User.
     * 
     * @return acceptedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getAcceptedEventRelations() {
        return acceptedEventRelations;
    }


    /**
     * Sets the acceptedEventRelations value for this User.
     * 
     * @param acceptedEventRelations
     */
    public void setAcceptedEventRelations(com.sforce.soap.enterprise.QueryResult acceptedEventRelations) {
        this.acceptedEventRelations = acceptedEventRelations;
    }


    /**
     * Gets the account value for this User.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this User.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountCleanInfoReviewers value for this User.
     * 
     * @return accountCleanInfoReviewers
     */
    public com.sforce.soap.enterprise.QueryResult getAccountCleanInfoReviewers() {
        return accountCleanInfoReviewers;
    }


    /**
     * Sets the accountCleanInfoReviewers value for this User.
     * 
     * @param accountCleanInfoReviewers
     */
    public void setAccountCleanInfoReviewers(com.sforce.soap.enterprise.QueryResult accountCleanInfoReviewers) {
        this.accountCleanInfoReviewers = accountCleanInfoReviewers;
    }


    /**
     * Gets the accountId value for this User.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this User.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the address value for this User.
     * 
     * @return address
     */
    public com.sforce.soap.enterprise.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this User.
     * 
     * @param address
     */
    public void setAddress(com.sforce.soap.enterprise.Address address) {
        this.address = address;
    }


    /**
     * Gets the alias value for this User.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this User.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the attachedContentDocuments value for this User.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this User.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the badgeText value for this User.
     * 
     * @return badgeText
     */
    public java.lang.String getBadgeText() {
        return badgeText;
    }


    /**
     * Sets the badgeText value for this User.
     * 
     * @param badgeText
     */
    public void setBadgeText(java.lang.String badgeText) {
        this.badgeText = badgeText;
    }


    /**
     * Gets the callCenterId value for this User.
     * 
     * @return callCenterId
     */
    public java.lang.String getCallCenterId() {
        return callCenterId;
    }


    /**
     * Sets the callCenterId value for this User.
     * 
     * @param callCenterId
     */
    public void setCallCenterId(java.lang.String callCenterId) {
        this.callCenterId = callCenterId;
    }


    /**
     * Gets the campsite_Reservations__r value for this User.
     * 
     * @return campsite_Reservations__r
     */
    public com.sforce.soap.enterprise.QueryResult getCampsite_Reservations__r() {
        return campsite_Reservations__r;
    }


    /**
     * Sets the campsite_Reservations__r value for this User.
     * 
     * @param campsite_Reservations__r
     */
    public void setCampsite_Reservations__r(com.sforce.soap.enterprise.QueryResult campsite_Reservations__r) {
        this.campsite_Reservations__r = campsite_Reservations__r;
    }


    /**
     * Gets the city value for this User.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this User.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the combinedAttachments value for this User.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this User.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the communityNickname value for this User.
     * 
     * @return communityNickname
     */
    public java.lang.String getCommunityNickname() {
        return communityNickname;
    }


    /**
     * Sets the communityNickname value for this User.
     * 
     * @param communityNickname
     */
    public void setCommunityNickname(java.lang.String communityNickname) {
        this.communityNickname = communityNickname;
    }


    /**
     * Gets the companyName value for this User.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this User.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the contact value for this User.
     * 
     * @return contact
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this User.
     * 
     * @param contact
     */
    public void setContact(com.sforce.soap.enterprise.sobject.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactCleanInfoReviewers value for this User.
     * 
     * @return contactCleanInfoReviewers
     */
    public com.sforce.soap.enterprise.QueryResult getContactCleanInfoReviewers() {
        return contactCleanInfoReviewers;
    }


    /**
     * Sets the contactCleanInfoReviewers value for this User.
     * 
     * @param contactCleanInfoReviewers
     */
    public void setContactCleanInfoReviewers(com.sforce.soap.enterprise.QueryResult contactCleanInfoReviewers) {
        this.contactCleanInfoReviewers = contactCleanInfoReviewers;
    }


    /**
     * Gets the contactId value for this User.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this User.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the contractsSigned value for this User.
     * 
     * @return contractsSigned
     */
    public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
        return contractsSigned;
    }


    /**
     * Sets the contractsSigned value for this User.
     * 
     * @param contractsSigned
     */
    public void setContractsSigned(com.sforce.soap.enterprise.QueryResult contractsSigned) {
        this.contractsSigned = contractsSigned;
    }


    /**
     * Gets the country value for this User.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this User.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this User.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this User.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this User.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this User.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this User.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this User.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the declinedEventRelations value for this User.
     * 
     * @return declinedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getDeclinedEventRelations() {
        return declinedEventRelations;
    }


    /**
     * Sets the declinedEventRelations value for this User.
     * 
     * @param declinedEventRelations
     */
    public void setDeclinedEventRelations(com.sforce.soap.enterprise.QueryResult declinedEventRelations) {
        this.declinedEventRelations = declinedEventRelations;
    }


    /**
     * Gets the defaultGroupNotificationFrequency value for this User.
     * 
     * @return defaultGroupNotificationFrequency
     */
    public java.lang.String getDefaultGroupNotificationFrequency() {
        return defaultGroupNotificationFrequency;
    }


    /**
     * Sets the defaultGroupNotificationFrequency value for this User.
     * 
     * @param defaultGroupNotificationFrequency
     */
    public void setDefaultGroupNotificationFrequency(java.lang.String defaultGroupNotificationFrequency) {
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
    }


    /**
     * Gets the delegatedApproverId value for this User.
     * 
     * @return delegatedApproverId
     */
    public java.lang.String getDelegatedApproverId() {
        return delegatedApproverId;
    }


    /**
     * Sets the delegatedApproverId value for this User.
     * 
     * @param delegatedApproverId
     */
    public void setDelegatedApproverId(java.lang.String delegatedApproverId) {
        this.delegatedApproverId = delegatedApproverId;
    }


    /**
     * Gets the delegatedUsers value for this User.
     * 
     * @return delegatedUsers
     */
    public com.sforce.soap.enterprise.QueryResult getDelegatedUsers() {
        return delegatedUsers;
    }


    /**
     * Sets the delegatedUsers value for this User.
     * 
     * @param delegatedUsers
     */
    public void setDelegatedUsers(com.sforce.soap.enterprise.QueryResult delegatedUsers) {
        this.delegatedUsers = delegatedUsers;
    }


    /**
     * Gets the department value for this User.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this User.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the digestFrequency value for this User.
     * 
     * @return digestFrequency
     */
    public java.lang.String getDigestFrequency() {
        return digestFrequency;
    }


    /**
     * Sets the digestFrequency value for this User.
     * 
     * @param digestFrequency
     */
    public void setDigestFrequency(java.lang.String digestFrequency) {
        this.digestFrequency = digestFrequency;
    }


    /**
     * Gets the division value for this User.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this User.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailEncodingKey value for this User.
     * 
     * @return emailEncodingKey
     */
    public java.lang.String getEmailEncodingKey() {
        return emailEncodingKey;
    }


    /**
     * Sets the emailEncodingKey value for this User.
     * 
     * @param emailEncodingKey
     */
    public void setEmailEncodingKey(java.lang.String emailEncodingKey) {
        this.emailEncodingKey = emailEncodingKey;
    }


    /**
     * Gets the emailPreferencesAutoBcc value for this User.
     * 
     * @return emailPreferencesAutoBcc
     */
    public java.lang.Boolean getEmailPreferencesAutoBcc() {
        return emailPreferencesAutoBcc;
    }


    /**
     * Sets the emailPreferencesAutoBcc value for this User.
     * 
     * @param emailPreferencesAutoBcc
     */
    public void setEmailPreferencesAutoBcc(java.lang.Boolean emailPreferencesAutoBcc) {
        this.emailPreferencesAutoBcc = emailPreferencesAutoBcc;
    }


    /**
     * Gets the emailPreferencesAutoBccStayInTouch value for this User.
     * 
     * @return emailPreferencesAutoBccStayInTouch
     */
    public java.lang.Boolean getEmailPreferencesAutoBccStayInTouch() {
        return emailPreferencesAutoBccStayInTouch;
    }


    /**
     * Sets the emailPreferencesAutoBccStayInTouch value for this User.
     * 
     * @param emailPreferencesAutoBccStayInTouch
     */
    public void setEmailPreferencesAutoBccStayInTouch(java.lang.Boolean emailPreferencesAutoBccStayInTouch) {
        this.emailPreferencesAutoBccStayInTouch = emailPreferencesAutoBccStayInTouch;
    }


    /**
     * Gets the emailPreferencesStayInTouchReminder value for this User.
     * 
     * @return emailPreferencesStayInTouchReminder
     */
    public java.lang.Boolean getEmailPreferencesStayInTouchReminder() {
        return emailPreferencesStayInTouchReminder;
    }


    /**
     * Sets the emailPreferencesStayInTouchReminder value for this User.
     * 
     * @param emailPreferencesStayInTouchReminder
     */
    public void setEmailPreferencesStayInTouchReminder(java.lang.Boolean emailPreferencesStayInTouchReminder) {
        this.emailPreferencesStayInTouchReminder = emailPreferencesStayInTouchReminder;
    }


    /**
     * Gets the employeeNumber value for this User.
     * 
     * @return employeeNumber
     */
    public java.lang.String getEmployeeNumber() {
        return employeeNumber;
    }


    /**
     * Sets the employeeNumber value for this User.
     * 
     * @param employeeNumber
     */
    public void setEmployeeNumber(java.lang.String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }


    /**
     * Gets the eventRelations value for this User.
     * 
     * @return eventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getEventRelations() {
        return eventRelations;
    }


    /**
     * Sets the eventRelations value for this User.
     * 
     * @param eventRelations
     */
    public void setEventRelations(com.sforce.soap.enterprise.QueryResult eventRelations) {
        this.eventRelations = eventRelations;
    }


    /**
     * Gets the extension value for this User.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this User.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the externalDataUserAuths value for this User.
     * 
     * @return externalDataUserAuths
     */
    public com.sforce.soap.enterprise.QueryResult getExternalDataUserAuths() {
        return externalDataUserAuths;
    }


    /**
     * Sets the externalDataUserAuths value for this User.
     * 
     * @param externalDataUserAuths
     */
    public void setExternalDataUserAuths(com.sforce.soap.enterprise.QueryResult externalDataUserAuths) {
        this.externalDataUserAuths = externalDataUserAuths;
    }


    /**
     * Gets the fax value for this User.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this User.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the federationIdentifier value for this User.
     * 
     * @return federationIdentifier
     */
    public java.lang.String getFederationIdentifier() {
        return federationIdentifier;
    }


    /**
     * Sets the federationIdentifier value for this User.
     * 
     * @param federationIdentifier
     */
    public void setFederationIdentifier(java.lang.String federationIdentifier) {
        this.federationIdentifier = federationIdentifier;
    }


    /**
     * Gets the feedSubscriptions value for this User.
     * 
     * @return feedSubscriptions
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptions() {
        return feedSubscriptions;
    }


    /**
     * Sets the feedSubscriptions value for this User.
     * 
     * @param feedSubscriptions
     */
    public void setFeedSubscriptions(com.sforce.soap.enterprise.QueryResult feedSubscriptions) {
        this.feedSubscriptions = feedSubscriptions;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this User.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this User.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this User.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this User.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the firstName value for this User.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this User.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the forecastEnabled value for this User.
     * 
     * @return forecastEnabled
     */
    public java.lang.Boolean getForecastEnabled() {
        return forecastEnabled;
    }


    /**
     * Sets the forecastEnabled value for this User.
     * 
     * @param forecastEnabled
     */
    public void setForecastEnabled(java.lang.Boolean forecastEnabled) {
        this.forecastEnabled = forecastEnabled;
    }


    /**
     * Gets the fullPhotoUrl value for this User.
     * 
     * @return fullPhotoUrl
     */
    public java.lang.String getFullPhotoUrl() {
        return fullPhotoUrl;
    }


    /**
     * Sets the fullPhotoUrl value for this User.
     * 
     * @param fullPhotoUrl
     */
    public void setFullPhotoUrl(java.lang.String fullPhotoUrl) {
        this.fullPhotoUrl = fullPhotoUrl;
    }


    /**
     * Gets the geocodeAccuracy value for this User.
     * 
     * @return geocodeAccuracy
     */
    public java.lang.String getGeocodeAccuracy() {
        return geocodeAccuracy;
    }


    /**
     * Sets the geocodeAccuracy value for this User.
     * 
     * @param geocodeAccuracy
     */
    public void setGeocodeAccuracy(java.lang.String geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }


    /**
     * Gets the groupMembershipRequests value for this User.
     * 
     * @return groupMembershipRequests
     */
    public com.sforce.soap.enterprise.QueryResult getGroupMembershipRequests() {
        return groupMembershipRequests;
    }


    /**
     * Sets the groupMembershipRequests value for this User.
     * 
     * @param groupMembershipRequests
     */
    public void setGroupMembershipRequests(com.sforce.soap.enterprise.QueryResult groupMembershipRequests) {
        this.groupMembershipRequests = groupMembershipRequests;
    }


    /**
     * Gets the groupMemberships value for this User.
     * 
     * @return groupMemberships
     */
    public com.sforce.soap.enterprise.QueryResult getGroupMemberships() {
        return groupMemberships;
    }


    /**
     * Sets the groupMemberships value for this User.
     * 
     * @param groupMemberships
     */
    public void setGroupMemberships(com.sforce.soap.enterprise.QueryResult groupMemberships) {
        this.groupMemberships = groupMemberships;
    }


    /**
     * Gets the installedMobileApps value for this User.
     * 
     * @return installedMobileApps
     */
    public com.sforce.soap.enterprise.QueryResult getInstalledMobileApps() {
        return installedMobileApps;
    }


    /**
     * Sets the installedMobileApps value for this User.
     * 
     * @param installedMobileApps
     */
    public void setInstalledMobileApps(com.sforce.soap.enterprise.QueryResult installedMobileApps) {
        this.installedMobileApps = installedMobileApps;
    }


    /**
     * Gets the isActive value for this User.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this User.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the jigsawImportLimitOverride value for this User.
     * 
     * @return jigsawImportLimitOverride
     */
    public java.lang.Integer getJigsawImportLimitOverride() {
        return jigsawImportLimitOverride;
    }


    /**
     * Sets the jigsawImportLimitOverride value for this User.
     * 
     * @param jigsawImportLimitOverride
     */
    public void setJigsawImportLimitOverride(java.lang.Integer jigsawImportLimitOverride) {
        this.jigsawImportLimitOverride = jigsawImportLimitOverride;
    }


    /**
     * Gets the languageLocaleKey value for this User.
     * 
     * @return languageLocaleKey
     */
    public java.lang.String getLanguageLocaleKey() {
        return languageLocaleKey;
    }


    /**
     * Sets the languageLocaleKey value for this User.
     * 
     * @param languageLocaleKey
     */
    public void setLanguageLocaleKey(java.lang.String languageLocaleKey) {
        this.languageLocaleKey = languageLocaleKey;
    }


    /**
     * Gets the lastLoginDate value for this User.
     * 
     * @return lastLoginDate
     */
    public java.util.Calendar getLastLoginDate() {
        return lastLoginDate;
    }


    /**
     * Sets the lastLoginDate value for this User.
     * 
     * @param lastLoginDate
     */
    public void setLastLoginDate(java.util.Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


    /**
     * Gets the lastModifiedBy value for this User.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this User.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this User.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this User.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this User.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this User.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this User.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this User.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastPasswordChangeDate value for this User.
     * 
     * @return lastPasswordChangeDate
     */
    public java.util.Calendar getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }


    /**
     * Sets the lastPasswordChangeDate value for this User.
     * 
     * @param lastPasswordChangeDate
     */
    public void setLastPasswordChangeDate(java.util.Calendar lastPasswordChangeDate) {
        this.lastPasswordChangeDate = lastPasswordChangeDate;
    }


    /**
     * Gets the lastReferencedDate value for this User.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this User.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this User.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this User.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the latitude value for this User.
     * 
     * @return latitude
     */
    public java.lang.Double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this User.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the leadCleanInfoReviewers value for this User.
     * 
     * @return leadCleanInfoReviewers
     */
    public com.sforce.soap.enterprise.QueryResult getLeadCleanInfoReviewers() {
        return leadCleanInfoReviewers;
    }


    /**
     * Sets the leadCleanInfoReviewers value for this User.
     * 
     * @param leadCleanInfoReviewers
     */
    public void setLeadCleanInfoReviewers(com.sforce.soap.enterprise.QueryResult leadCleanInfoReviewers) {
        this.leadCleanInfoReviewers = leadCleanInfoReviewers;
    }


    /**
     * Gets the localeSidKey value for this User.
     * 
     * @return localeSidKey
     */
    public java.lang.String getLocaleSidKey() {
        return localeSidKey;
    }


    /**
     * Sets the localeSidKey value for this User.
     * 
     * @param localeSidKey
     */
    public void setLocaleSidKey(java.lang.String localeSidKey) {
        this.localeSidKey = localeSidKey;
    }


    /**
     * Gets the longitude value for this User.
     * 
     * @return longitude
     */
    public java.lang.Double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this User.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the managedUsers value for this User.
     * 
     * @return managedUsers
     */
    public com.sforce.soap.enterprise.QueryResult getManagedUsers() {
        return managedUsers;
    }


    /**
     * Sets the managedUsers value for this User.
     * 
     * @param managedUsers
     */
    public void setManagedUsers(com.sforce.soap.enterprise.QueryResult managedUsers) {
        this.managedUsers = managedUsers;
    }


    /**
     * Gets the manager value for this User.
     * 
     * @return manager
     */
    public com.sforce.soap.enterprise.sobject.User getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this User.
     * 
     * @param manager
     */
    public void setManager(com.sforce.soap.enterprise.sobject.User manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerId value for this User.
     * 
     * @return managerId
     */
    public java.lang.String getManagerId() {
        return managerId;
    }


    /**
     * Sets the managerId value for this User.
     * 
     * @param managerId
     */
    public void setManagerId(java.lang.String managerId) {
        this.managerId = managerId;
    }


    /**
     * Gets the mobilePhone value for this User.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this User.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the name value for this User.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @return offlinePdaTrialExpirationDate
     */
    public java.util.Calendar getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }


    /**
     * Sets the offlinePdaTrialExpirationDate value for this User.
     * 
     * @param offlinePdaTrialExpirationDate
     */
    public void setOfflinePdaTrialExpirationDate(java.util.Calendar offlinePdaTrialExpirationDate) {
        this.offlinePdaTrialExpirationDate = offlinePdaTrialExpirationDate;
    }


    /**
     * Gets the offlineTrialExpirationDate value for this User.
     * 
     * @return offlineTrialExpirationDate
     */
    public java.util.Calendar getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }


    /**
     * Sets the offlineTrialExpirationDate value for this User.
     * 
     * @param offlineTrialExpirationDate
     */
    public void setOfflineTrialExpirationDate(java.util.Calendar offlineTrialExpirationDate) {
        this.offlineTrialExpirationDate = offlineTrialExpirationDate;
    }


    /**
     * Gets the ownedContentDocuments value for this User.
     * 
     * @return ownedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getOwnedContentDocuments() {
        return ownedContentDocuments;
    }


    /**
     * Sets the ownedContentDocuments value for this User.
     * 
     * @param ownedContentDocuments
     */
    public void setOwnedContentDocuments(com.sforce.soap.enterprise.QueryResult ownedContentDocuments) {
        this.ownedContentDocuments = ownedContentDocuments;
    }


    /**
     * Gets the permissionSetAssignments value for this User.
     * 
     * @return permissionSetAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getPermissionSetAssignments() {
        return permissionSetAssignments;
    }


    /**
     * Sets the permissionSetAssignments value for this User.
     * 
     * @param permissionSetAssignments
     */
    public void setPermissionSetAssignments(com.sforce.soap.enterprise.QueryResult permissionSetAssignments) {
        this.permissionSetAssignments = permissionSetAssignments;
    }


    /**
     * Gets the permissionSetLicenseAssignments value for this User.
     * 
     * @return permissionSetLicenseAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getPermissionSetLicenseAssignments() {
        return permissionSetLicenseAssignments;
    }


    /**
     * Sets the permissionSetLicenseAssignments value for this User.
     * 
     * @param permissionSetLicenseAssignments
     */
    public void setPermissionSetLicenseAssignments(com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments) {
        this.permissionSetLicenseAssignments = permissionSetLicenseAssignments;
    }


    /**
     * Gets the phone value for this User.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this User.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this User.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this User.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the profile value for this User.
     * 
     * @return profile
     */
    public com.sforce.soap.enterprise.sobject.Profile getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this User.
     * 
     * @param profile
     */
    public void setProfile(com.sforce.soap.enterprise.sobject.Profile profile) {
        this.profile = profile;
    }


    /**
     * Gets the profileId value for this User.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this User.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the receivesAdminInfoEmails value for this User.
     * 
     * @return receivesAdminInfoEmails
     */
    public java.lang.Boolean getReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }


    /**
     * Sets the receivesAdminInfoEmails value for this User.
     * 
     * @param receivesAdminInfoEmails
     */
    public void setReceivesAdminInfoEmails(java.lang.Boolean receivesAdminInfoEmails) {
        this.receivesAdminInfoEmails = receivesAdminInfoEmails;
    }


    /**
     * Gets the receivesInfoEmails value for this User.
     * 
     * @return receivesInfoEmails
     */
    public java.lang.Boolean getReceivesInfoEmails() {
        return receivesInfoEmails;
    }


    /**
     * Sets the receivesInfoEmails value for this User.
     * 
     * @param receivesInfoEmails
     */
    public void setReceivesInfoEmails(java.lang.Boolean receivesInfoEmails) {
        this.receivesInfoEmails = receivesInfoEmails;
    }


    /**
     * Gets the senderEmail value for this User.
     * 
     * @return senderEmail
     */
    public java.lang.String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this User.
     * 
     * @param senderEmail
     */
    public void setSenderEmail(java.lang.String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the senderName value for this User.
     * 
     * @return senderName
     */
    public java.lang.String getSenderName() {
        return senderName;
    }


    /**
     * Sets the senderName value for this User.
     * 
     * @param senderName
     */
    public void setSenderName(java.lang.String senderName) {
        this.senderName = senderName;
    }


    /**
     * Gets the shares value for this User.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this User.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the signature value for this User.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this User.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the smallPhotoUrl value for this User.
     * 
     * @return smallPhotoUrl
     */
    public java.lang.String getSmallPhotoUrl() {
        return smallPhotoUrl;
    }


    /**
     * Sets the smallPhotoUrl value for this User.
     * 
     * @param smallPhotoUrl
     */
    public void setSmallPhotoUrl(java.lang.String smallPhotoUrl) {
        this.smallPhotoUrl = smallPhotoUrl;
    }


    /**
     * Gets the state value for this User.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this User.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stayInTouchNote value for this User.
     * 
     * @return stayInTouchNote
     */
    public java.lang.String getStayInTouchNote() {
        return stayInTouchNote;
    }


    /**
     * Sets the stayInTouchNote value for this User.
     * 
     * @param stayInTouchNote
     */
    public void setStayInTouchNote(java.lang.String stayInTouchNote) {
        this.stayInTouchNote = stayInTouchNote;
    }


    /**
     * Gets the stayInTouchSignature value for this User.
     * 
     * @return stayInTouchSignature
     */
    public java.lang.String getStayInTouchSignature() {
        return stayInTouchSignature;
    }


    /**
     * Sets the stayInTouchSignature value for this User.
     * 
     * @param stayInTouchSignature
     */
    public void setStayInTouchSignature(java.lang.String stayInTouchSignature) {
        this.stayInTouchSignature = stayInTouchSignature;
    }


    /**
     * Gets the stayInTouchSubject value for this User.
     * 
     * @return stayInTouchSubject
     */
    public java.lang.String getStayInTouchSubject() {
        return stayInTouchSubject;
    }


    /**
     * Sets the stayInTouchSubject value for this User.
     * 
     * @param stayInTouchSubject
     */
    public void setStayInTouchSubject(java.lang.String stayInTouchSubject) {
        this.stayInTouchSubject = stayInTouchSubject;
    }


    /**
     * Gets the street value for this User.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this User.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this User.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this User.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the timeZoneSidKey value for this User.
     * 
     * @return timeZoneSidKey
     */
    public java.lang.String getTimeZoneSidKey() {
        return timeZoneSidKey;
    }


    /**
     * Sets the timeZoneSidKey value for this User.
     * 
     * @param timeZoneSidKey
     */
    public void setTimeZoneSidKey(java.lang.String timeZoneSidKey) {
        this.timeZoneSidKey = timeZoneSidKey;
    }


    /**
     * Gets the title value for this User.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this User.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the undecidedEventRelations value for this User.
     * 
     * @return undecidedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getUndecidedEventRelations() {
        return undecidedEventRelations;
    }


    /**
     * Sets the undecidedEventRelations value for this User.
     * 
     * @param undecidedEventRelations
     */
    public void setUndecidedEventRelations(com.sforce.soap.enterprise.QueryResult undecidedEventRelations) {
        this.undecidedEventRelations = undecidedEventRelations;
    }


    /**
     * Gets the userEntityAccessRights value for this User.
     * 
     * @return userEntityAccessRights
     */
    public com.sforce.soap.enterprise.QueryResult getUserEntityAccessRights() {
        return userEntityAccessRights;
    }


    /**
     * Sets the userEntityAccessRights value for this User.
     * 
     * @param userEntityAccessRights
     */
    public void setUserEntityAccessRights(com.sforce.soap.enterprise.QueryResult userEntityAccessRights) {
        this.userEntityAccessRights = userEntityAccessRights;
    }


    /**
     * Gets the userFieldAccessRights value for this User.
     * 
     * @return userFieldAccessRights
     */
    public com.sforce.soap.enterprise.QueryResult getUserFieldAccessRights() {
        return userFieldAccessRights;
    }


    /**
     * Sets the userFieldAccessRights value for this User.
     * 
     * @param userFieldAccessRights
     */
    public void setUserFieldAccessRights(com.sforce.soap.enterprise.QueryResult userFieldAccessRights) {
        this.userFieldAccessRights = userFieldAccessRights;
    }


    /**
     * Gets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @return userPermissionsCallCenterAutoLogin
     */
    public java.lang.Boolean getUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }


    /**
     * Sets the userPermissionsCallCenterAutoLogin value for this User.
     * 
     * @param userPermissionsCallCenterAutoLogin
     */
    public void setUserPermissionsCallCenterAutoLogin(java.lang.Boolean userPermissionsCallCenterAutoLogin) {
        this.userPermissionsCallCenterAutoLogin = userPermissionsCallCenterAutoLogin;
    }


    /**
     * Gets the userPermissionsChatterAnswersUser value for this User.
     * 
     * @return userPermissionsChatterAnswersUser
     */
    public java.lang.Boolean getUserPermissionsChatterAnswersUser() {
        return userPermissionsChatterAnswersUser;
    }


    /**
     * Sets the userPermissionsChatterAnswersUser value for this User.
     * 
     * @param userPermissionsChatterAnswersUser
     */
    public void setUserPermissionsChatterAnswersUser(java.lang.Boolean userPermissionsChatterAnswersUser) {
        this.userPermissionsChatterAnswersUser = userPermissionsChatterAnswersUser;
    }


    /**
     * Gets the userPermissionsInteractionUser value for this User.
     * 
     * @return userPermissionsInteractionUser
     */
    public java.lang.Boolean getUserPermissionsInteractionUser() {
        return userPermissionsInteractionUser;
    }


    /**
     * Sets the userPermissionsInteractionUser value for this User.
     * 
     * @param userPermissionsInteractionUser
     */
    public void setUserPermissionsInteractionUser(java.lang.Boolean userPermissionsInteractionUser) {
        this.userPermissionsInteractionUser = userPermissionsInteractionUser;
    }


    /**
     * Gets the userPermissionsJigsawProspectingUser value for this User.
     * 
     * @return userPermissionsJigsawProspectingUser
     */
    public java.lang.Boolean getUserPermissionsJigsawProspectingUser() {
        return userPermissionsJigsawProspectingUser;
    }


    /**
     * Sets the userPermissionsJigsawProspectingUser value for this User.
     * 
     * @param userPermissionsJigsawProspectingUser
     */
    public void setUserPermissionsJigsawProspectingUser(java.lang.Boolean userPermissionsJigsawProspectingUser) {
        this.userPermissionsJigsawProspectingUser = userPermissionsJigsawProspectingUser;
    }


    /**
     * Gets the userPermissionsKnowledgeUser value for this User.
     * 
     * @return userPermissionsKnowledgeUser
     */
    public java.lang.Boolean getUserPermissionsKnowledgeUser() {
        return userPermissionsKnowledgeUser;
    }


    /**
     * Sets the userPermissionsKnowledgeUser value for this User.
     * 
     * @param userPermissionsKnowledgeUser
     */
    public void setUserPermissionsKnowledgeUser(java.lang.Boolean userPermissionsKnowledgeUser) {
        this.userPermissionsKnowledgeUser = userPermissionsKnowledgeUser;
    }


    /**
     * Gets the userPermissionsMarketingUser value for this User.
     * 
     * @return userPermissionsMarketingUser
     */
    public java.lang.Boolean getUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }


    /**
     * Sets the userPermissionsMarketingUser value for this User.
     * 
     * @param userPermissionsMarketingUser
     */
    public void setUserPermissionsMarketingUser(java.lang.Boolean userPermissionsMarketingUser) {
        this.userPermissionsMarketingUser = userPermissionsMarketingUser;
    }


    /**
     * Gets the userPermissionsMobileUser value for this User.
     * 
     * @return userPermissionsMobileUser
     */
    public java.lang.Boolean getUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }


    /**
     * Sets the userPermissionsMobileUser value for this User.
     * 
     * @param userPermissionsMobileUser
     */
    public void setUserPermissionsMobileUser(java.lang.Boolean userPermissionsMobileUser) {
        this.userPermissionsMobileUser = userPermissionsMobileUser;
    }


    /**
     * Gets the userPermissionsOfflineUser value for this User.
     * 
     * @return userPermissionsOfflineUser
     */
    public java.lang.Boolean getUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }


    /**
     * Sets the userPermissionsOfflineUser value for this User.
     * 
     * @param userPermissionsOfflineUser
     */
    public void setUserPermissionsOfflineUser(java.lang.Boolean userPermissionsOfflineUser) {
        this.userPermissionsOfflineUser = userPermissionsOfflineUser;
    }


    /**
     * Gets the userPermissionsSFContentUser value for this User.
     * 
     * @return userPermissionsSFContentUser
     */
    public java.lang.Boolean getUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }


    /**
     * Sets the userPermissionsSFContentUser value for this User.
     * 
     * @param userPermissionsSFContentUser
     */
    public void setUserPermissionsSFContentUser(java.lang.Boolean userPermissionsSFContentUser) {
        this.userPermissionsSFContentUser = userPermissionsSFContentUser;
    }


    /**
     * Gets the userPermissionsSiteforceContributorUser value for this User.
     * 
     * @return userPermissionsSiteforceContributorUser
     */
    public java.lang.Boolean getUserPermissionsSiteforceContributorUser() {
        return userPermissionsSiteforceContributorUser;
    }


    /**
     * Sets the userPermissionsSiteforceContributorUser value for this User.
     * 
     * @param userPermissionsSiteforceContributorUser
     */
    public void setUserPermissionsSiteforceContributorUser(java.lang.Boolean userPermissionsSiteforceContributorUser) {
        this.userPermissionsSiteforceContributorUser = userPermissionsSiteforceContributorUser;
    }


    /**
     * Gets the userPermissionsSiteforcePublisherUser value for this User.
     * 
     * @return userPermissionsSiteforcePublisherUser
     */
    public java.lang.Boolean getUserPermissionsSiteforcePublisherUser() {
        return userPermissionsSiteforcePublisherUser;
    }


    /**
     * Sets the userPermissionsSiteforcePublisherUser value for this User.
     * 
     * @param userPermissionsSiteforcePublisherUser
     */
    public void setUserPermissionsSiteforcePublisherUser(java.lang.Boolean userPermissionsSiteforcePublisherUser) {
        this.userPermissionsSiteforcePublisherUser = userPermissionsSiteforcePublisherUser;
    }


    /**
     * Gets the userPermissionsSupportUser value for this User.
     * 
     * @return userPermissionsSupportUser
     */
    public java.lang.Boolean getUserPermissionsSupportUser() {
        return userPermissionsSupportUser;
    }


    /**
     * Sets the userPermissionsSupportUser value for this User.
     * 
     * @param userPermissionsSupportUser
     */
    public void setUserPermissionsSupportUser(java.lang.Boolean userPermissionsSupportUser) {
        this.userPermissionsSupportUser = userPermissionsSupportUser;
    }


    /**
     * Gets the userPermissionsWorkDotComUserFeature value for this User.
     * 
     * @return userPermissionsWorkDotComUserFeature
     */
    public java.lang.Boolean getUserPermissionsWorkDotComUserFeature() {
        return userPermissionsWorkDotComUserFeature;
    }


    /**
     * Sets the userPermissionsWorkDotComUserFeature value for this User.
     * 
     * @param userPermissionsWorkDotComUserFeature
     */
    public void setUserPermissionsWorkDotComUserFeature(java.lang.Boolean userPermissionsWorkDotComUserFeature) {
        this.userPermissionsWorkDotComUserFeature = userPermissionsWorkDotComUserFeature;
    }


    /**
     * Gets the userPreferences value for this User.
     * 
     * @return userPreferences
     */
    public com.sforce.soap.enterprise.QueryResult getUserPreferences() {
        return userPreferences;
    }


    /**
     * Sets the userPreferences value for this User.
     * 
     * @param userPreferences
     */
    public void setUserPreferences(com.sforce.soap.enterprise.QueryResult userPreferences) {
        this.userPreferences = userPreferences;
    }


    /**
     * Gets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @return userPreferencesActivityRemindersPopup
     */
    public java.lang.Boolean getUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }


    /**
     * Sets the userPreferencesActivityRemindersPopup value for this User.
     * 
     * @param userPreferencesActivityRemindersPopup
     */
    public void setUserPreferencesActivityRemindersPopup(java.lang.Boolean userPreferencesActivityRemindersPopup) {
        this.userPreferencesActivityRemindersPopup = userPreferencesActivityRemindersPopup;
    }


    /**
     * Gets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @return userPreferencesApexPagesDeveloperMode
     */
    public java.lang.Boolean getUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Sets the userPreferencesApexPagesDeveloperMode value for this User.
     * 
     * @param userPreferencesApexPagesDeveloperMode
     */
    public void setUserPreferencesApexPagesDeveloperMode(java.lang.Boolean userPreferencesApexPagesDeveloperMode) {
        this.userPreferencesApexPagesDeveloperMode = userPreferencesApexPagesDeveloperMode;
    }


    /**
     * Gets the userPreferencesCacheDiagnostics value for this User.
     * 
     * @return userPreferencesCacheDiagnostics
     */
    public java.lang.Boolean getUserPreferencesCacheDiagnostics() {
        return userPreferencesCacheDiagnostics;
    }


    /**
     * Sets the userPreferencesCacheDiagnostics value for this User.
     * 
     * @param userPreferencesCacheDiagnostics
     */
    public void setUserPreferencesCacheDiagnostics(java.lang.Boolean userPreferencesCacheDiagnostics) {
        this.userPreferencesCacheDiagnostics = userPreferencesCacheDiagnostics;
    }


    /**
     * Gets the userPreferencesContentEmailAsAndWhen value for this User.
     * 
     * @return userPreferencesContentEmailAsAndWhen
     */
    public java.lang.Boolean getUserPreferencesContentEmailAsAndWhen() {
        return userPreferencesContentEmailAsAndWhen;
    }


    /**
     * Sets the userPreferencesContentEmailAsAndWhen value for this User.
     * 
     * @param userPreferencesContentEmailAsAndWhen
     */
    public void setUserPreferencesContentEmailAsAndWhen(java.lang.Boolean userPreferencesContentEmailAsAndWhen) {
        this.userPreferencesContentEmailAsAndWhen = userPreferencesContentEmailAsAndWhen;
    }


    /**
     * Gets the userPreferencesContentNoEmail value for this User.
     * 
     * @return userPreferencesContentNoEmail
     */
    public java.lang.Boolean getUserPreferencesContentNoEmail() {
        return userPreferencesContentNoEmail;
    }


    /**
     * Sets the userPreferencesContentNoEmail value for this User.
     * 
     * @param userPreferencesContentNoEmail
     */
    public void setUserPreferencesContentNoEmail(java.lang.Boolean userPreferencesContentNoEmail) {
        this.userPreferencesContentNoEmail = userPreferencesContentNoEmail;
    }


    /**
     * Gets the userPreferencesDisCommentAfterLikeEmail value for this User.
     * 
     * @return userPreferencesDisCommentAfterLikeEmail
     */
    public java.lang.Boolean getUserPreferencesDisCommentAfterLikeEmail() {
        return userPreferencesDisCommentAfterLikeEmail;
    }


    /**
     * Sets the userPreferencesDisCommentAfterLikeEmail value for this User.
     * 
     * @param userPreferencesDisCommentAfterLikeEmail
     */
    public void setUserPreferencesDisCommentAfterLikeEmail(java.lang.Boolean userPreferencesDisCommentAfterLikeEmail) {
        this.userPreferencesDisCommentAfterLikeEmail = userPreferencesDisCommentAfterLikeEmail;
    }


    /**
     * Gets the userPreferencesDisMentionsCommentEmail value for this User.
     * 
     * @return userPreferencesDisMentionsCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisMentionsCommentEmail() {
        return userPreferencesDisMentionsCommentEmail;
    }


    /**
     * Sets the userPreferencesDisMentionsCommentEmail value for this User.
     * 
     * @param userPreferencesDisMentionsCommentEmail
     */
    public void setUserPreferencesDisMentionsCommentEmail(java.lang.Boolean userPreferencesDisMentionsCommentEmail) {
        this.userPreferencesDisMentionsCommentEmail = userPreferencesDisMentionsCommentEmail;
    }


    /**
     * Gets the userPreferencesDisProfPostCommentEmail value for this User.
     * 
     * @return userPreferencesDisProfPostCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisProfPostCommentEmail() {
        return userPreferencesDisProfPostCommentEmail;
    }


    /**
     * Sets the userPreferencesDisProfPostCommentEmail value for this User.
     * 
     * @param userPreferencesDisProfPostCommentEmail
     */
    public void setUserPreferencesDisProfPostCommentEmail(java.lang.Boolean userPreferencesDisProfPostCommentEmail) {
        this.userPreferencesDisProfPostCommentEmail = userPreferencesDisProfPostCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableAllFeedsEmail value for this User.
     * 
     * @return userPreferencesDisableAllFeedsEmail
     */
    public java.lang.Boolean getUserPreferencesDisableAllFeedsEmail() {
        return userPreferencesDisableAllFeedsEmail;
    }


    /**
     * Sets the userPreferencesDisableAllFeedsEmail value for this User.
     * 
     * @param userPreferencesDisableAllFeedsEmail
     */
    public void setUserPreferencesDisableAllFeedsEmail(java.lang.Boolean userPreferencesDisableAllFeedsEmail) {
        this.userPreferencesDisableAllFeedsEmail = userPreferencesDisableAllFeedsEmail;
    }


    /**
     * Gets the userPreferencesDisableBookmarkEmail value for this User.
     * 
     * @return userPreferencesDisableBookmarkEmail
     */
    public java.lang.Boolean getUserPreferencesDisableBookmarkEmail() {
        return userPreferencesDisableBookmarkEmail;
    }


    /**
     * Sets the userPreferencesDisableBookmarkEmail value for this User.
     * 
     * @param userPreferencesDisableBookmarkEmail
     */
    public void setUserPreferencesDisableBookmarkEmail(java.lang.Boolean userPreferencesDisableBookmarkEmail) {
        this.userPreferencesDisableBookmarkEmail = userPreferencesDisableBookmarkEmail;
    }


    /**
     * Gets the userPreferencesDisableChangeCommentEmail value for this User.
     * 
     * @return userPreferencesDisableChangeCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisableChangeCommentEmail() {
        return userPreferencesDisableChangeCommentEmail;
    }


    /**
     * Sets the userPreferencesDisableChangeCommentEmail value for this User.
     * 
     * @param userPreferencesDisableChangeCommentEmail
     */
    public void setUserPreferencesDisableChangeCommentEmail(java.lang.Boolean userPreferencesDisableChangeCommentEmail) {
        this.userPreferencesDisableChangeCommentEmail = userPreferencesDisableChangeCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableEndorsementEmail value for this User.
     * 
     * @return userPreferencesDisableEndorsementEmail
     */
    public java.lang.Boolean getUserPreferencesDisableEndorsementEmail() {
        return userPreferencesDisableEndorsementEmail;
    }


    /**
     * Sets the userPreferencesDisableEndorsementEmail value for this User.
     * 
     * @param userPreferencesDisableEndorsementEmail
     */
    public void setUserPreferencesDisableEndorsementEmail(java.lang.Boolean userPreferencesDisableEndorsementEmail) {
        this.userPreferencesDisableEndorsementEmail = userPreferencesDisableEndorsementEmail;
    }


    /**
     * Gets the userPreferencesDisableFeedbackEmail value for this User.
     * 
     * @return userPreferencesDisableFeedbackEmail
     */
    public java.lang.Boolean getUserPreferencesDisableFeedbackEmail() {
        return userPreferencesDisableFeedbackEmail;
    }


    /**
     * Sets the userPreferencesDisableFeedbackEmail value for this User.
     * 
     * @param userPreferencesDisableFeedbackEmail
     */
    public void setUserPreferencesDisableFeedbackEmail(java.lang.Boolean userPreferencesDisableFeedbackEmail) {
        this.userPreferencesDisableFeedbackEmail = userPreferencesDisableFeedbackEmail;
    }


    /**
     * Gets the userPreferencesDisableFileShareNotificationsForApi value for this User.
     * 
     * @return userPreferencesDisableFileShareNotificationsForApi
     */
    public java.lang.Boolean getUserPreferencesDisableFileShareNotificationsForApi() {
        return userPreferencesDisableFileShareNotificationsForApi;
    }


    /**
     * Sets the userPreferencesDisableFileShareNotificationsForApi value for this User.
     * 
     * @param userPreferencesDisableFileShareNotificationsForApi
     */
    public void setUserPreferencesDisableFileShareNotificationsForApi(java.lang.Boolean userPreferencesDisableFileShareNotificationsForApi) {
        this.userPreferencesDisableFileShareNotificationsForApi = userPreferencesDisableFileShareNotificationsForApi;
    }


    /**
     * Gets the userPreferencesDisableFollowersEmail value for this User.
     * 
     * @return userPreferencesDisableFollowersEmail
     */
    public java.lang.Boolean getUserPreferencesDisableFollowersEmail() {
        return userPreferencesDisableFollowersEmail;
    }


    /**
     * Sets the userPreferencesDisableFollowersEmail value for this User.
     * 
     * @param userPreferencesDisableFollowersEmail
     */
    public void setUserPreferencesDisableFollowersEmail(java.lang.Boolean userPreferencesDisableFollowersEmail) {
        this.userPreferencesDisableFollowersEmail = userPreferencesDisableFollowersEmail;
    }


    /**
     * Gets the userPreferencesDisableLaterCommentEmail value for this User.
     * 
     * @return userPreferencesDisableLaterCommentEmail
     */
    public java.lang.Boolean getUserPreferencesDisableLaterCommentEmail() {
        return userPreferencesDisableLaterCommentEmail;
    }


    /**
     * Sets the userPreferencesDisableLaterCommentEmail value for this User.
     * 
     * @param userPreferencesDisableLaterCommentEmail
     */
    public void setUserPreferencesDisableLaterCommentEmail(java.lang.Boolean userPreferencesDisableLaterCommentEmail) {
        this.userPreferencesDisableLaterCommentEmail = userPreferencesDisableLaterCommentEmail;
    }


    /**
     * Gets the userPreferencesDisableLikeEmail value for this User.
     * 
     * @return userPreferencesDisableLikeEmail
     */
    public java.lang.Boolean getUserPreferencesDisableLikeEmail() {
        return userPreferencesDisableLikeEmail;
    }


    /**
     * Sets the userPreferencesDisableLikeEmail value for this User.
     * 
     * @param userPreferencesDisableLikeEmail
     */
    public void setUserPreferencesDisableLikeEmail(java.lang.Boolean userPreferencesDisableLikeEmail) {
        this.userPreferencesDisableLikeEmail = userPreferencesDisableLikeEmail;
    }


    /**
     * Gets the userPreferencesDisableMentionsPostEmail value for this User.
     * 
     * @return userPreferencesDisableMentionsPostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableMentionsPostEmail() {
        return userPreferencesDisableMentionsPostEmail;
    }


    /**
     * Sets the userPreferencesDisableMentionsPostEmail value for this User.
     * 
     * @param userPreferencesDisableMentionsPostEmail
     */
    public void setUserPreferencesDisableMentionsPostEmail(java.lang.Boolean userPreferencesDisableMentionsPostEmail) {
        this.userPreferencesDisableMentionsPostEmail = userPreferencesDisableMentionsPostEmail;
    }


    /**
     * Gets the userPreferencesDisableMessageEmail value for this User.
     * 
     * @return userPreferencesDisableMessageEmail
     */
    public java.lang.Boolean getUserPreferencesDisableMessageEmail() {
        return userPreferencesDisableMessageEmail;
    }


    /**
     * Sets the userPreferencesDisableMessageEmail value for this User.
     * 
     * @param userPreferencesDisableMessageEmail
     */
    public void setUserPreferencesDisableMessageEmail(java.lang.Boolean userPreferencesDisableMessageEmail) {
        this.userPreferencesDisableMessageEmail = userPreferencesDisableMessageEmail;
    }


    /**
     * Gets the userPreferencesDisableProfilePostEmail value for this User.
     * 
     * @return userPreferencesDisableProfilePostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableProfilePostEmail() {
        return userPreferencesDisableProfilePostEmail;
    }


    /**
     * Sets the userPreferencesDisableProfilePostEmail value for this User.
     * 
     * @param userPreferencesDisableProfilePostEmail
     */
    public void setUserPreferencesDisableProfilePostEmail(java.lang.Boolean userPreferencesDisableProfilePostEmail) {
        this.userPreferencesDisableProfilePostEmail = userPreferencesDisableProfilePostEmail;
    }


    /**
     * Gets the userPreferencesDisableSharePostEmail value for this User.
     * 
     * @return userPreferencesDisableSharePostEmail
     */
    public java.lang.Boolean getUserPreferencesDisableSharePostEmail() {
        return userPreferencesDisableSharePostEmail;
    }


    /**
     * Sets the userPreferencesDisableSharePostEmail value for this User.
     * 
     * @param userPreferencesDisableSharePostEmail
     */
    public void setUserPreferencesDisableSharePostEmail(java.lang.Boolean userPreferencesDisableSharePostEmail) {
        this.userPreferencesDisableSharePostEmail = userPreferencesDisableSharePostEmail;
    }


    /**
     * Gets the userPreferencesDisableWorkEmail value for this User.
     * 
     * @return userPreferencesDisableWorkEmail
     */
    public java.lang.Boolean getUserPreferencesDisableWorkEmail() {
        return userPreferencesDisableWorkEmail;
    }


    /**
     * Sets the userPreferencesDisableWorkEmail value for this User.
     * 
     * @param userPreferencesDisableWorkEmail
     */
    public void setUserPreferencesDisableWorkEmail(java.lang.Boolean userPreferencesDisableWorkEmail) {
        this.userPreferencesDisableWorkEmail = userPreferencesDisableWorkEmail;
    }


    /**
     * Gets the userPreferencesEnableAutoSubForFeeds value for this User.
     * 
     * @return userPreferencesEnableAutoSubForFeeds
     */
    public java.lang.Boolean getUserPreferencesEnableAutoSubForFeeds() {
        return userPreferencesEnableAutoSubForFeeds;
    }


    /**
     * Sets the userPreferencesEnableAutoSubForFeeds value for this User.
     * 
     * @param userPreferencesEnableAutoSubForFeeds
     */
    public void setUserPreferencesEnableAutoSubForFeeds(java.lang.Boolean userPreferencesEnableAutoSubForFeeds) {
        this.userPreferencesEnableAutoSubForFeeds = userPreferencesEnableAutoSubForFeeds;
    }


    /**
     * Gets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesEventRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesEventRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesEventRemindersCheckboxDefault
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(java.lang.Boolean userPreferencesEventRemindersCheckboxDefault) {
        this.userPreferencesEventRemindersCheckboxDefault = userPreferencesEventRemindersCheckboxDefault;
    }


    /**
     * Gets the userPreferencesHideCSNDesktopTask value for this User.
     * 
     * @return userPreferencesHideCSNDesktopTask
     */
    public java.lang.Boolean getUserPreferencesHideCSNDesktopTask() {
        return userPreferencesHideCSNDesktopTask;
    }


    /**
     * Sets the userPreferencesHideCSNDesktopTask value for this User.
     * 
     * @param userPreferencesHideCSNDesktopTask
     */
    public void setUserPreferencesHideCSNDesktopTask(java.lang.Boolean userPreferencesHideCSNDesktopTask) {
        this.userPreferencesHideCSNDesktopTask = userPreferencesHideCSNDesktopTask;
    }


    /**
     * Gets the userPreferencesHideCSNGetChatterMobileTask value for this User.
     * 
     * @return userPreferencesHideCSNGetChatterMobileTask
     */
    public java.lang.Boolean getUserPreferencesHideCSNGetChatterMobileTask() {
        return userPreferencesHideCSNGetChatterMobileTask;
    }


    /**
     * Sets the userPreferencesHideCSNGetChatterMobileTask value for this User.
     * 
     * @param userPreferencesHideCSNGetChatterMobileTask
     */
    public void setUserPreferencesHideCSNGetChatterMobileTask(java.lang.Boolean userPreferencesHideCSNGetChatterMobileTask) {
        this.userPreferencesHideCSNGetChatterMobileTask = userPreferencesHideCSNGetChatterMobileTask;
    }


    /**
     * Gets the userPreferencesHideChatterOnboardingSplash value for this User.
     * 
     * @return userPreferencesHideChatterOnboardingSplash
     */
    public java.lang.Boolean getUserPreferencesHideChatterOnboardingSplash() {
        return userPreferencesHideChatterOnboardingSplash;
    }


    /**
     * Sets the userPreferencesHideChatterOnboardingSplash value for this User.
     * 
     * @param userPreferencesHideChatterOnboardingSplash
     */
    public void setUserPreferencesHideChatterOnboardingSplash(java.lang.Boolean userPreferencesHideChatterOnboardingSplash) {
        this.userPreferencesHideChatterOnboardingSplash = userPreferencesHideChatterOnboardingSplash;
    }


    /**
     * Gets the userPreferencesHideS1BrowserUI value for this User.
     * 
     * @return userPreferencesHideS1BrowserUI
     */
    public java.lang.Boolean getUserPreferencesHideS1BrowserUI() {
        return userPreferencesHideS1BrowserUI;
    }


    /**
     * Sets the userPreferencesHideS1BrowserUI value for this User.
     * 
     * @param userPreferencesHideS1BrowserUI
     */
    public void setUserPreferencesHideS1BrowserUI(java.lang.Boolean userPreferencesHideS1BrowserUI) {
        this.userPreferencesHideS1BrowserUI = userPreferencesHideS1BrowserUI;
    }


    /**
     * Gets the userPreferencesHideSecondChatterOnboardingSplash value for this User.
     * 
     * @return userPreferencesHideSecondChatterOnboardingSplash
     */
    public java.lang.Boolean getUserPreferencesHideSecondChatterOnboardingSplash() {
        return userPreferencesHideSecondChatterOnboardingSplash;
    }


    /**
     * Sets the userPreferencesHideSecondChatterOnboardingSplash value for this User.
     * 
     * @param userPreferencesHideSecondChatterOnboardingSplash
     */
    public void setUserPreferencesHideSecondChatterOnboardingSplash(java.lang.Boolean userPreferencesHideSecondChatterOnboardingSplash) {
        this.userPreferencesHideSecondChatterOnboardingSplash = userPreferencesHideSecondChatterOnboardingSplash;
    }


    /**
     * Gets the userPreferencesJigsawListUser value for this User.
     * 
     * @return userPreferencesJigsawListUser
     */
    public java.lang.Boolean getUserPreferencesJigsawListUser() {
        return userPreferencesJigsawListUser;
    }


    /**
     * Sets the userPreferencesJigsawListUser value for this User.
     * 
     * @param userPreferencesJigsawListUser
     */
    public void setUserPreferencesJigsawListUser(java.lang.Boolean userPreferencesJigsawListUser) {
        this.userPreferencesJigsawListUser = userPreferencesJigsawListUser;
    }


    /**
     * Gets the userPreferencesLightningExperiencePreferred value for this User.
     * 
     * @return userPreferencesLightningExperiencePreferred
     */
    public java.lang.Boolean getUserPreferencesLightningExperiencePreferred() {
        return userPreferencesLightningExperiencePreferred;
    }


    /**
     * Sets the userPreferencesLightningExperiencePreferred value for this User.
     * 
     * @param userPreferencesLightningExperiencePreferred
     */
    public void setUserPreferencesLightningExperiencePreferred(java.lang.Boolean userPreferencesLightningExperiencePreferred) {
        this.userPreferencesLightningExperiencePreferred = userPreferencesLightningExperiencePreferred;
    }


    /**
     * Gets the userPreferencesPathAssistantCollapsed value for this User.
     * 
     * @return userPreferencesPathAssistantCollapsed
     */
    public java.lang.Boolean getUserPreferencesPathAssistantCollapsed() {
        return userPreferencesPathAssistantCollapsed;
    }


    /**
     * Sets the userPreferencesPathAssistantCollapsed value for this User.
     * 
     * @param userPreferencesPathAssistantCollapsed
     */
    public void setUserPreferencesPathAssistantCollapsed(java.lang.Boolean userPreferencesPathAssistantCollapsed) {
        this.userPreferencesPathAssistantCollapsed = userPreferencesPathAssistantCollapsed;
    }


    /**
     * Gets the userPreferencesReminderSoundOff value for this User.
     * 
     * @return userPreferencesReminderSoundOff
     */
    public java.lang.Boolean getUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }


    /**
     * Sets the userPreferencesReminderSoundOff value for this User.
     * 
     * @param userPreferencesReminderSoundOff
     */
    public void setUserPreferencesReminderSoundOff(java.lang.Boolean userPreferencesReminderSoundOff) {
        this.userPreferencesReminderSoundOff = userPreferencesReminderSoundOff;
    }


    /**
     * Gets the userPreferencesShowCityToExternalUsers value for this User.
     * 
     * @return userPreferencesShowCityToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowCityToExternalUsers() {
        return userPreferencesShowCityToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowCityToExternalUsers value for this User.
     * 
     * @param userPreferencesShowCityToExternalUsers
     */
    public void setUserPreferencesShowCityToExternalUsers(java.lang.Boolean userPreferencesShowCityToExternalUsers) {
        this.userPreferencesShowCityToExternalUsers = userPreferencesShowCityToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowCityToGuestUsers value for this User.
     * 
     * @return userPreferencesShowCityToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowCityToGuestUsers() {
        return userPreferencesShowCityToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowCityToGuestUsers value for this User.
     * 
     * @param userPreferencesShowCityToGuestUsers
     */
    public void setUserPreferencesShowCityToGuestUsers(java.lang.Boolean userPreferencesShowCityToGuestUsers) {
        this.userPreferencesShowCityToGuestUsers = userPreferencesShowCityToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowCountryToExternalUsers value for this User.
     * 
     * @return userPreferencesShowCountryToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowCountryToExternalUsers() {
        return userPreferencesShowCountryToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowCountryToExternalUsers value for this User.
     * 
     * @param userPreferencesShowCountryToExternalUsers
     */
    public void setUserPreferencesShowCountryToExternalUsers(java.lang.Boolean userPreferencesShowCountryToExternalUsers) {
        this.userPreferencesShowCountryToExternalUsers = userPreferencesShowCountryToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowCountryToGuestUsers value for this User.
     * 
     * @return userPreferencesShowCountryToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowCountryToGuestUsers() {
        return userPreferencesShowCountryToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowCountryToGuestUsers value for this User.
     * 
     * @param userPreferencesShowCountryToGuestUsers
     */
    public void setUserPreferencesShowCountryToGuestUsers(java.lang.Boolean userPreferencesShowCountryToGuestUsers) {
        this.userPreferencesShowCountryToGuestUsers = userPreferencesShowCountryToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowEmailToExternalUsers value for this User.
     * 
     * @return userPreferencesShowEmailToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowEmailToExternalUsers() {
        return userPreferencesShowEmailToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowEmailToExternalUsers value for this User.
     * 
     * @param userPreferencesShowEmailToExternalUsers
     */
    public void setUserPreferencesShowEmailToExternalUsers(java.lang.Boolean userPreferencesShowEmailToExternalUsers) {
        this.userPreferencesShowEmailToExternalUsers = userPreferencesShowEmailToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowEmailToGuestUsers value for this User.
     * 
     * @return userPreferencesShowEmailToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowEmailToGuestUsers() {
        return userPreferencesShowEmailToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowEmailToGuestUsers value for this User.
     * 
     * @param userPreferencesShowEmailToGuestUsers
     */
    public void setUserPreferencesShowEmailToGuestUsers(java.lang.Boolean userPreferencesShowEmailToGuestUsers) {
        this.userPreferencesShowEmailToGuestUsers = userPreferencesShowEmailToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowFaxToExternalUsers value for this User.
     * 
     * @return userPreferencesShowFaxToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowFaxToExternalUsers() {
        return userPreferencesShowFaxToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowFaxToExternalUsers value for this User.
     * 
     * @param userPreferencesShowFaxToExternalUsers
     */
    public void setUserPreferencesShowFaxToExternalUsers(java.lang.Boolean userPreferencesShowFaxToExternalUsers) {
        this.userPreferencesShowFaxToExternalUsers = userPreferencesShowFaxToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowFaxToGuestUsers value for this User.
     * 
     * @return userPreferencesShowFaxToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowFaxToGuestUsers() {
        return userPreferencesShowFaxToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowFaxToGuestUsers value for this User.
     * 
     * @param userPreferencesShowFaxToGuestUsers
     */
    public void setUserPreferencesShowFaxToGuestUsers(java.lang.Boolean userPreferencesShowFaxToGuestUsers) {
        this.userPreferencesShowFaxToGuestUsers = userPreferencesShowFaxToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowManagerToExternalUsers value for this User.
     * 
     * @return userPreferencesShowManagerToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowManagerToExternalUsers() {
        return userPreferencesShowManagerToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowManagerToExternalUsers value for this User.
     * 
     * @param userPreferencesShowManagerToExternalUsers
     */
    public void setUserPreferencesShowManagerToExternalUsers(java.lang.Boolean userPreferencesShowManagerToExternalUsers) {
        this.userPreferencesShowManagerToExternalUsers = userPreferencesShowManagerToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowManagerToGuestUsers value for this User.
     * 
     * @return userPreferencesShowManagerToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowManagerToGuestUsers() {
        return userPreferencesShowManagerToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowManagerToGuestUsers value for this User.
     * 
     * @param userPreferencesShowManagerToGuestUsers
     */
    public void setUserPreferencesShowManagerToGuestUsers(java.lang.Boolean userPreferencesShowManagerToGuestUsers) {
        this.userPreferencesShowManagerToGuestUsers = userPreferencesShowManagerToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowMobilePhoneToExternalUsers value for this User.
     * 
     * @return userPreferencesShowMobilePhoneToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowMobilePhoneToExternalUsers() {
        return userPreferencesShowMobilePhoneToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowMobilePhoneToExternalUsers value for this User.
     * 
     * @param userPreferencesShowMobilePhoneToExternalUsers
     */
    public void setUserPreferencesShowMobilePhoneToExternalUsers(java.lang.Boolean userPreferencesShowMobilePhoneToExternalUsers) {
        this.userPreferencesShowMobilePhoneToExternalUsers = userPreferencesShowMobilePhoneToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowMobilePhoneToGuestUsers value for this User.
     * 
     * @return userPreferencesShowMobilePhoneToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowMobilePhoneToGuestUsers() {
        return userPreferencesShowMobilePhoneToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowMobilePhoneToGuestUsers value for this User.
     * 
     * @param userPreferencesShowMobilePhoneToGuestUsers
     */
    public void setUserPreferencesShowMobilePhoneToGuestUsers(java.lang.Boolean userPreferencesShowMobilePhoneToGuestUsers) {
        this.userPreferencesShowMobilePhoneToGuestUsers = userPreferencesShowMobilePhoneToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowPostalCodeToExternalUsers value for this User.
     * 
     * @return userPreferencesShowPostalCodeToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowPostalCodeToExternalUsers() {
        return userPreferencesShowPostalCodeToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowPostalCodeToExternalUsers value for this User.
     * 
     * @param userPreferencesShowPostalCodeToExternalUsers
     */
    public void setUserPreferencesShowPostalCodeToExternalUsers(java.lang.Boolean userPreferencesShowPostalCodeToExternalUsers) {
        this.userPreferencesShowPostalCodeToExternalUsers = userPreferencesShowPostalCodeToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowPostalCodeToGuestUsers value for this User.
     * 
     * @return userPreferencesShowPostalCodeToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowPostalCodeToGuestUsers() {
        return userPreferencesShowPostalCodeToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowPostalCodeToGuestUsers value for this User.
     * 
     * @param userPreferencesShowPostalCodeToGuestUsers
     */
    public void setUserPreferencesShowPostalCodeToGuestUsers(java.lang.Boolean userPreferencesShowPostalCodeToGuestUsers) {
        this.userPreferencesShowPostalCodeToGuestUsers = userPreferencesShowPostalCodeToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowProfilePicToGuestUsers value for this User.
     * 
     * @return userPreferencesShowProfilePicToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowProfilePicToGuestUsers() {
        return userPreferencesShowProfilePicToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowProfilePicToGuestUsers value for this User.
     * 
     * @param userPreferencesShowProfilePicToGuestUsers
     */
    public void setUserPreferencesShowProfilePicToGuestUsers(java.lang.Boolean userPreferencesShowProfilePicToGuestUsers) {
        this.userPreferencesShowProfilePicToGuestUsers = userPreferencesShowProfilePicToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowStateToExternalUsers value for this User.
     * 
     * @return userPreferencesShowStateToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowStateToExternalUsers() {
        return userPreferencesShowStateToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowStateToExternalUsers value for this User.
     * 
     * @param userPreferencesShowStateToExternalUsers
     */
    public void setUserPreferencesShowStateToExternalUsers(java.lang.Boolean userPreferencesShowStateToExternalUsers) {
        this.userPreferencesShowStateToExternalUsers = userPreferencesShowStateToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowStateToGuestUsers value for this User.
     * 
     * @return userPreferencesShowStateToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowStateToGuestUsers() {
        return userPreferencesShowStateToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowStateToGuestUsers value for this User.
     * 
     * @param userPreferencesShowStateToGuestUsers
     */
    public void setUserPreferencesShowStateToGuestUsers(java.lang.Boolean userPreferencesShowStateToGuestUsers) {
        this.userPreferencesShowStateToGuestUsers = userPreferencesShowStateToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowStreetAddressToExternalUsers value for this User.
     * 
     * @return userPreferencesShowStreetAddressToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowStreetAddressToExternalUsers() {
        return userPreferencesShowStreetAddressToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowStreetAddressToExternalUsers value for this User.
     * 
     * @param userPreferencesShowStreetAddressToExternalUsers
     */
    public void setUserPreferencesShowStreetAddressToExternalUsers(java.lang.Boolean userPreferencesShowStreetAddressToExternalUsers) {
        this.userPreferencesShowStreetAddressToExternalUsers = userPreferencesShowStreetAddressToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowStreetAddressToGuestUsers value for this User.
     * 
     * @return userPreferencesShowStreetAddressToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowStreetAddressToGuestUsers() {
        return userPreferencesShowStreetAddressToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowStreetAddressToGuestUsers value for this User.
     * 
     * @param userPreferencesShowStreetAddressToGuestUsers
     */
    public void setUserPreferencesShowStreetAddressToGuestUsers(java.lang.Boolean userPreferencesShowStreetAddressToGuestUsers) {
        this.userPreferencesShowStreetAddressToGuestUsers = userPreferencesShowStreetAddressToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowTitleToExternalUsers value for this User.
     * 
     * @return userPreferencesShowTitleToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowTitleToExternalUsers() {
        return userPreferencesShowTitleToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowTitleToExternalUsers value for this User.
     * 
     * @param userPreferencesShowTitleToExternalUsers
     */
    public void setUserPreferencesShowTitleToExternalUsers(java.lang.Boolean userPreferencesShowTitleToExternalUsers) {
        this.userPreferencesShowTitleToExternalUsers = userPreferencesShowTitleToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowTitleToGuestUsers value for this User.
     * 
     * @return userPreferencesShowTitleToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowTitleToGuestUsers() {
        return userPreferencesShowTitleToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowTitleToGuestUsers value for this User.
     * 
     * @param userPreferencesShowTitleToGuestUsers
     */
    public void setUserPreferencesShowTitleToGuestUsers(java.lang.Boolean userPreferencesShowTitleToGuestUsers) {
        this.userPreferencesShowTitleToGuestUsers = userPreferencesShowTitleToGuestUsers;
    }


    /**
     * Gets the userPreferencesShowWorkPhoneToExternalUsers value for this User.
     * 
     * @return userPreferencesShowWorkPhoneToExternalUsers
     */
    public java.lang.Boolean getUserPreferencesShowWorkPhoneToExternalUsers() {
        return userPreferencesShowWorkPhoneToExternalUsers;
    }


    /**
     * Sets the userPreferencesShowWorkPhoneToExternalUsers value for this User.
     * 
     * @param userPreferencesShowWorkPhoneToExternalUsers
     */
    public void setUserPreferencesShowWorkPhoneToExternalUsers(java.lang.Boolean userPreferencesShowWorkPhoneToExternalUsers) {
        this.userPreferencesShowWorkPhoneToExternalUsers = userPreferencesShowWorkPhoneToExternalUsers;
    }


    /**
     * Gets the userPreferencesShowWorkPhoneToGuestUsers value for this User.
     * 
     * @return userPreferencesShowWorkPhoneToGuestUsers
     */
    public java.lang.Boolean getUserPreferencesShowWorkPhoneToGuestUsers() {
        return userPreferencesShowWorkPhoneToGuestUsers;
    }


    /**
     * Sets the userPreferencesShowWorkPhoneToGuestUsers value for this User.
     * 
     * @param userPreferencesShowWorkPhoneToGuestUsers
     */
    public void setUserPreferencesShowWorkPhoneToGuestUsers(java.lang.Boolean userPreferencesShowWorkPhoneToGuestUsers) {
        this.userPreferencesShowWorkPhoneToGuestUsers = userPreferencesShowWorkPhoneToGuestUsers;
    }


    /**
     * Gets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @return userPreferencesTaskRemindersCheckboxDefault
     */
    public java.lang.Boolean getUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Sets the userPreferencesTaskRemindersCheckboxDefault value for this User.
     * 
     * @param userPreferencesTaskRemindersCheckboxDefault
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(java.lang.Boolean userPreferencesTaskRemindersCheckboxDefault) {
        this.userPreferencesTaskRemindersCheckboxDefault = userPreferencesTaskRemindersCheckboxDefault;
    }


    /**
     * Gets the userRole value for this User.
     * 
     * @return userRole
     */
    public com.sforce.soap.enterprise.sobject.UserRole getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this User.
     * 
     * @param userRole
     */
    public void setUserRole(com.sforce.soap.enterprise.sobject.UserRole userRole) {
        this.userRole = userRole;
    }


    /**
     * Gets the userRoleId value for this User.
     * 
     * @return userRoleId
     */
    public java.lang.String getUserRoleId() {
        return userRoleId;
    }


    /**
     * Sets the userRoleId value for this User.
     * 
     * @param userRoleId
     */
    public void setUserRoleId(java.lang.String userRoleId) {
        this.userRoleId = userRoleId;
    }


    /**
     * Gets the userSites value for this User.
     * 
     * @return userSites
     */
    public com.sforce.soap.enterprise.QueryResult getUserSites() {
        return userSites;
    }


    /**
     * Sets the userSites value for this User.
     * 
     * @param userSites
     */
    public void setUserSites(com.sforce.soap.enterprise.QueryResult userSites) {
        this.userSites = userSites;
    }


    /**
     * Gets the userType value for this User.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this User.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the username value for this User.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this User.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aboutMe==null && other.getAboutMe()==null) || 
             (this.aboutMe!=null &&
              this.aboutMe.equals(other.getAboutMe()))) &&
            ((this.acceptedEventRelations==null && other.getAcceptedEventRelations()==null) || 
             (this.acceptedEventRelations!=null &&
              this.acceptedEventRelations.equals(other.getAcceptedEventRelations()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountCleanInfoReviewers==null && other.getAccountCleanInfoReviewers()==null) || 
             (this.accountCleanInfoReviewers!=null &&
              this.accountCleanInfoReviewers.equals(other.getAccountCleanInfoReviewers()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.badgeText==null && other.getBadgeText()==null) || 
             (this.badgeText!=null &&
              this.badgeText.equals(other.getBadgeText()))) &&
            ((this.callCenterId==null && other.getCallCenterId()==null) || 
             (this.callCenterId!=null &&
              this.callCenterId.equals(other.getCallCenterId()))) &&
            ((this.campsite_Reservations__r==null && other.getCampsite_Reservations__r()==null) || 
             (this.campsite_Reservations__r!=null &&
              this.campsite_Reservations__r.equals(other.getCampsite_Reservations__r()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.communityNickname==null && other.getCommunityNickname()==null) || 
             (this.communityNickname!=null &&
              this.communityNickname.equals(other.getCommunityNickname()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactCleanInfoReviewers==null && other.getContactCleanInfoReviewers()==null) || 
             (this.contactCleanInfoReviewers!=null &&
              this.contactCleanInfoReviewers.equals(other.getContactCleanInfoReviewers()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.contractsSigned==null && other.getContractsSigned()==null) || 
             (this.contractsSigned!=null &&
              this.contractsSigned.equals(other.getContractsSigned()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.declinedEventRelations==null && other.getDeclinedEventRelations()==null) || 
             (this.declinedEventRelations!=null &&
              this.declinedEventRelations.equals(other.getDeclinedEventRelations()))) &&
            ((this.defaultGroupNotificationFrequency==null && other.getDefaultGroupNotificationFrequency()==null) || 
             (this.defaultGroupNotificationFrequency!=null &&
              this.defaultGroupNotificationFrequency.equals(other.getDefaultGroupNotificationFrequency()))) &&
            ((this.delegatedApproverId==null && other.getDelegatedApproverId()==null) || 
             (this.delegatedApproverId!=null &&
              this.delegatedApproverId.equals(other.getDelegatedApproverId()))) &&
            ((this.delegatedUsers==null && other.getDelegatedUsers()==null) || 
             (this.delegatedUsers!=null &&
              this.delegatedUsers.equals(other.getDelegatedUsers()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.digestFrequency==null && other.getDigestFrequency()==null) || 
             (this.digestFrequency!=null &&
              this.digestFrequency.equals(other.getDigestFrequency()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailEncodingKey==null && other.getEmailEncodingKey()==null) || 
             (this.emailEncodingKey!=null &&
              this.emailEncodingKey.equals(other.getEmailEncodingKey()))) &&
            ((this.emailPreferencesAutoBcc==null && other.getEmailPreferencesAutoBcc()==null) || 
             (this.emailPreferencesAutoBcc!=null &&
              this.emailPreferencesAutoBcc.equals(other.getEmailPreferencesAutoBcc()))) &&
            ((this.emailPreferencesAutoBccStayInTouch==null && other.getEmailPreferencesAutoBccStayInTouch()==null) || 
             (this.emailPreferencesAutoBccStayInTouch!=null &&
              this.emailPreferencesAutoBccStayInTouch.equals(other.getEmailPreferencesAutoBccStayInTouch()))) &&
            ((this.emailPreferencesStayInTouchReminder==null && other.getEmailPreferencesStayInTouchReminder()==null) || 
             (this.emailPreferencesStayInTouchReminder!=null &&
              this.emailPreferencesStayInTouchReminder.equals(other.getEmailPreferencesStayInTouchReminder()))) &&
            ((this.employeeNumber==null && other.getEmployeeNumber()==null) || 
             (this.employeeNumber!=null &&
              this.employeeNumber.equals(other.getEmployeeNumber()))) &&
            ((this.eventRelations==null && other.getEventRelations()==null) || 
             (this.eventRelations!=null &&
              this.eventRelations.equals(other.getEventRelations()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            ((this.externalDataUserAuths==null && other.getExternalDataUserAuths()==null) || 
             (this.externalDataUserAuths!=null &&
              this.externalDataUserAuths.equals(other.getExternalDataUserAuths()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.federationIdentifier==null && other.getFederationIdentifier()==null) || 
             (this.federationIdentifier!=null &&
              this.federationIdentifier.equals(other.getFederationIdentifier()))) &&
            ((this.feedSubscriptions==null && other.getFeedSubscriptions()==null) || 
             (this.feedSubscriptions!=null &&
              this.feedSubscriptions.equals(other.getFeedSubscriptions()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.forecastEnabled==null && other.getForecastEnabled()==null) || 
             (this.forecastEnabled!=null &&
              this.forecastEnabled.equals(other.getForecastEnabled()))) &&
            ((this.fullPhotoUrl==null && other.getFullPhotoUrl()==null) || 
             (this.fullPhotoUrl!=null &&
              this.fullPhotoUrl.equals(other.getFullPhotoUrl()))) &&
            ((this.geocodeAccuracy==null && other.getGeocodeAccuracy()==null) || 
             (this.geocodeAccuracy!=null &&
              this.geocodeAccuracy.equals(other.getGeocodeAccuracy()))) &&
            ((this.groupMembershipRequests==null && other.getGroupMembershipRequests()==null) || 
             (this.groupMembershipRequests!=null &&
              this.groupMembershipRequests.equals(other.getGroupMembershipRequests()))) &&
            ((this.groupMemberships==null && other.getGroupMemberships()==null) || 
             (this.groupMemberships!=null &&
              this.groupMemberships.equals(other.getGroupMemberships()))) &&
            ((this.installedMobileApps==null && other.getInstalledMobileApps()==null) || 
             (this.installedMobileApps!=null &&
              this.installedMobileApps.equals(other.getInstalledMobileApps()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.jigsawImportLimitOverride==null && other.getJigsawImportLimitOverride()==null) || 
             (this.jigsawImportLimitOverride!=null &&
              this.jigsawImportLimitOverride.equals(other.getJigsawImportLimitOverride()))) &&
            ((this.languageLocaleKey==null && other.getLanguageLocaleKey()==null) || 
             (this.languageLocaleKey!=null &&
              this.languageLocaleKey.equals(other.getLanguageLocaleKey()))) &&
            ((this.lastLoginDate==null && other.getLastLoginDate()==null) || 
             (this.lastLoginDate!=null &&
              this.lastLoginDate.equals(other.getLastLoginDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastPasswordChangeDate==null && other.getLastPasswordChangeDate()==null) || 
             (this.lastPasswordChangeDate!=null &&
              this.lastPasswordChangeDate.equals(other.getLastPasswordChangeDate()))) &&
            ((this.lastReferencedDate==null && other.getLastReferencedDate()==null) || 
             (this.lastReferencedDate!=null &&
              this.lastReferencedDate.equals(other.getLastReferencedDate()))) &&
            ((this.lastViewedDate==null && other.getLastViewedDate()==null) || 
             (this.lastViewedDate!=null &&
              this.lastViewedDate.equals(other.getLastViewedDate()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.leadCleanInfoReviewers==null && other.getLeadCleanInfoReviewers()==null) || 
             (this.leadCleanInfoReviewers!=null &&
              this.leadCleanInfoReviewers.equals(other.getLeadCleanInfoReviewers()))) &&
            ((this.localeSidKey==null && other.getLocaleSidKey()==null) || 
             (this.localeSidKey!=null &&
              this.localeSidKey.equals(other.getLocaleSidKey()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.managedUsers==null && other.getManagedUsers()==null) || 
             (this.managedUsers!=null &&
              this.managedUsers.equals(other.getManagedUsers()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerId==null && other.getManagerId()==null) || 
             (this.managerId!=null &&
              this.managerId.equals(other.getManagerId()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.offlinePdaTrialExpirationDate==null && other.getOfflinePdaTrialExpirationDate()==null) || 
             (this.offlinePdaTrialExpirationDate!=null &&
              this.offlinePdaTrialExpirationDate.equals(other.getOfflinePdaTrialExpirationDate()))) &&
            ((this.offlineTrialExpirationDate==null && other.getOfflineTrialExpirationDate()==null) || 
             (this.offlineTrialExpirationDate!=null &&
              this.offlineTrialExpirationDate.equals(other.getOfflineTrialExpirationDate()))) &&
            ((this.ownedContentDocuments==null && other.getOwnedContentDocuments()==null) || 
             (this.ownedContentDocuments!=null &&
              this.ownedContentDocuments.equals(other.getOwnedContentDocuments()))) &&
            ((this.permissionSetAssignments==null && other.getPermissionSetAssignments()==null) || 
             (this.permissionSetAssignments!=null &&
              this.permissionSetAssignments.equals(other.getPermissionSetAssignments()))) &&
            ((this.permissionSetLicenseAssignments==null && other.getPermissionSetLicenseAssignments()==null) || 
             (this.permissionSetLicenseAssignments!=null &&
              this.permissionSetLicenseAssignments.equals(other.getPermissionSetLicenseAssignments()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.receivesAdminInfoEmails==null && other.getReceivesAdminInfoEmails()==null) || 
             (this.receivesAdminInfoEmails!=null &&
              this.receivesAdminInfoEmails.equals(other.getReceivesAdminInfoEmails()))) &&
            ((this.receivesInfoEmails==null && other.getReceivesInfoEmails()==null) || 
             (this.receivesInfoEmails!=null &&
              this.receivesInfoEmails.equals(other.getReceivesInfoEmails()))) &&
            ((this.senderEmail==null && other.getSenderEmail()==null) || 
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.senderName==null && other.getSenderName()==null) || 
             (this.senderName!=null &&
              this.senderName.equals(other.getSenderName()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.smallPhotoUrl==null && other.getSmallPhotoUrl()==null) || 
             (this.smallPhotoUrl!=null &&
              this.smallPhotoUrl.equals(other.getSmallPhotoUrl()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stayInTouchNote==null && other.getStayInTouchNote()==null) || 
             (this.stayInTouchNote!=null &&
              this.stayInTouchNote.equals(other.getStayInTouchNote()))) &&
            ((this.stayInTouchSignature==null && other.getStayInTouchSignature()==null) || 
             (this.stayInTouchSignature!=null &&
              this.stayInTouchSignature.equals(other.getStayInTouchSignature()))) &&
            ((this.stayInTouchSubject==null && other.getStayInTouchSubject()==null) || 
             (this.stayInTouchSubject!=null &&
              this.stayInTouchSubject.equals(other.getStayInTouchSubject()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.timeZoneSidKey==null && other.getTimeZoneSidKey()==null) || 
             (this.timeZoneSidKey!=null &&
              this.timeZoneSidKey.equals(other.getTimeZoneSidKey()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.undecidedEventRelations==null && other.getUndecidedEventRelations()==null) || 
             (this.undecidedEventRelations!=null &&
              this.undecidedEventRelations.equals(other.getUndecidedEventRelations()))) &&
            ((this.userEntityAccessRights==null && other.getUserEntityAccessRights()==null) || 
             (this.userEntityAccessRights!=null &&
              this.userEntityAccessRights.equals(other.getUserEntityAccessRights()))) &&
            ((this.userFieldAccessRights==null && other.getUserFieldAccessRights()==null) || 
             (this.userFieldAccessRights!=null &&
              this.userFieldAccessRights.equals(other.getUserFieldAccessRights()))) &&
            ((this.userPermissionsCallCenterAutoLogin==null && other.getUserPermissionsCallCenterAutoLogin()==null) || 
             (this.userPermissionsCallCenterAutoLogin!=null &&
              this.userPermissionsCallCenterAutoLogin.equals(other.getUserPermissionsCallCenterAutoLogin()))) &&
            ((this.userPermissionsChatterAnswersUser==null && other.getUserPermissionsChatterAnswersUser()==null) || 
             (this.userPermissionsChatterAnswersUser!=null &&
              this.userPermissionsChatterAnswersUser.equals(other.getUserPermissionsChatterAnswersUser()))) &&
            ((this.userPermissionsInteractionUser==null && other.getUserPermissionsInteractionUser()==null) || 
             (this.userPermissionsInteractionUser!=null &&
              this.userPermissionsInteractionUser.equals(other.getUserPermissionsInteractionUser()))) &&
            ((this.userPermissionsJigsawProspectingUser==null && other.getUserPermissionsJigsawProspectingUser()==null) || 
             (this.userPermissionsJigsawProspectingUser!=null &&
              this.userPermissionsJigsawProspectingUser.equals(other.getUserPermissionsJigsawProspectingUser()))) &&
            ((this.userPermissionsKnowledgeUser==null && other.getUserPermissionsKnowledgeUser()==null) || 
             (this.userPermissionsKnowledgeUser!=null &&
              this.userPermissionsKnowledgeUser.equals(other.getUserPermissionsKnowledgeUser()))) &&
            ((this.userPermissionsMarketingUser==null && other.getUserPermissionsMarketingUser()==null) || 
             (this.userPermissionsMarketingUser!=null &&
              this.userPermissionsMarketingUser.equals(other.getUserPermissionsMarketingUser()))) &&
            ((this.userPermissionsMobileUser==null && other.getUserPermissionsMobileUser()==null) || 
             (this.userPermissionsMobileUser!=null &&
              this.userPermissionsMobileUser.equals(other.getUserPermissionsMobileUser()))) &&
            ((this.userPermissionsOfflineUser==null && other.getUserPermissionsOfflineUser()==null) || 
             (this.userPermissionsOfflineUser!=null &&
              this.userPermissionsOfflineUser.equals(other.getUserPermissionsOfflineUser()))) &&
            ((this.userPermissionsSFContentUser==null && other.getUserPermissionsSFContentUser()==null) || 
             (this.userPermissionsSFContentUser!=null &&
              this.userPermissionsSFContentUser.equals(other.getUserPermissionsSFContentUser()))) &&
            ((this.userPermissionsSiteforceContributorUser==null && other.getUserPermissionsSiteforceContributorUser()==null) || 
             (this.userPermissionsSiteforceContributorUser!=null &&
              this.userPermissionsSiteforceContributorUser.equals(other.getUserPermissionsSiteforceContributorUser()))) &&
            ((this.userPermissionsSiteforcePublisherUser==null && other.getUserPermissionsSiteforcePublisherUser()==null) || 
             (this.userPermissionsSiteforcePublisherUser!=null &&
              this.userPermissionsSiteforcePublisherUser.equals(other.getUserPermissionsSiteforcePublisherUser()))) &&
            ((this.userPermissionsSupportUser==null && other.getUserPermissionsSupportUser()==null) || 
             (this.userPermissionsSupportUser!=null &&
              this.userPermissionsSupportUser.equals(other.getUserPermissionsSupportUser()))) &&
            ((this.userPermissionsWorkDotComUserFeature==null && other.getUserPermissionsWorkDotComUserFeature()==null) || 
             (this.userPermissionsWorkDotComUserFeature!=null &&
              this.userPermissionsWorkDotComUserFeature.equals(other.getUserPermissionsWorkDotComUserFeature()))) &&
            ((this.userPreferences==null && other.getUserPreferences()==null) || 
             (this.userPreferences!=null &&
              this.userPreferences.equals(other.getUserPreferences()))) &&
            ((this.userPreferencesActivityRemindersPopup==null && other.getUserPreferencesActivityRemindersPopup()==null) || 
             (this.userPreferencesActivityRemindersPopup!=null &&
              this.userPreferencesActivityRemindersPopup.equals(other.getUserPreferencesActivityRemindersPopup()))) &&
            ((this.userPreferencesApexPagesDeveloperMode==null && other.getUserPreferencesApexPagesDeveloperMode()==null) || 
             (this.userPreferencesApexPagesDeveloperMode!=null &&
              this.userPreferencesApexPagesDeveloperMode.equals(other.getUserPreferencesApexPagesDeveloperMode()))) &&
            ((this.userPreferencesCacheDiagnostics==null && other.getUserPreferencesCacheDiagnostics()==null) || 
             (this.userPreferencesCacheDiagnostics!=null &&
              this.userPreferencesCacheDiagnostics.equals(other.getUserPreferencesCacheDiagnostics()))) &&
            ((this.userPreferencesContentEmailAsAndWhen==null && other.getUserPreferencesContentEmailAsAndWhen()==null) || 
             (this.userPreferencesContentEmailAsAndWhen!=null &&
              this.userPreferencesContentEmailAsAndWhen.equals(other.getUserPreferencesContentEmailAsAndWhen()))) &&
            ((this.userPreferencesContentNoEmail==null && other.getUserPreferencesContentNoEmail()==null) || 
             (this.userPreferencesContentNoEmail!=null &&
              this.userPreferencesContentNoEmail.equals(other.getUserPreferencesContentNoEmail()))) &&
            ((this.userPreferencesDisCommentAfterLikeEmail==null && other.getUserPreferencesDisCommentAfterLikeEmail()==null) || 
             (this.userPreferencesDisCommentAfterLikeEmail!=null &&
              this.userPreferencesDisCommentAfterLikeEmail.equals(other.getUserPreferencesDisCommentAfterLikeEmail()))) &&
            ((this.userPreferencesDisMentionsCommentEmail==null && other.getUserPreferencesDisMentionsCommentEmail()==null) || 
             (this.userPreferencesDisMentionsCommentEmail!=null &&
              this.userPreferencesDisMentionsCommentEmail.equals(other.getUserPreferencesDisMentionsCommentEmail()))) &&
            ((this.userPreferencesDisProfPostCommentEmail==null && other.getUserPreferencesDisProfPostCommentEmail()==null) || 
             (this.userPreferencesDisProfPostCommentEmail!=null &&
              this.userPreferencesDisProfPostCommentEmail.equals(other.getUserPreferencesDisProfPostCommentEmail()))) &&
            ((this.userPreferencesDisableAllFeedsEmail==null && other.getUserPreferencesDisableAllFeedsEmail()==null) || 
             (this.userPreferencesDisableAllFeedsEmail!=null &&
              this.userPreferencesDisableAllFeedsEmail.equals(other.getUserPreferencesDisableAllFeedsEmail()))) &&
            ((this.userPreferencesDisableBookmarkEmail==null && other.getUserPreferencesDisableBookmarkEmail()==null) || 
             (this.userPreferencesDisableBookmarkEmail!=null &&
              this.userPreferencesDisableBookmarkEmail.equals(other.getUserPreferencesDisableBookmarkEmail()))) &&
            ((this.userPreferencesDisableChangeCommentEmail==null && other.getUserPreferencesDisableChangeCommentEmail()==null) || 
             (this.userPreferencesDisableChangeCommentEmail!=null &&
              this.userPreferencesDisableChangeCommentEmail.equals(other.getUserPreferencesDisableChangeCommentEmail()))) &&
            ((this.userPreferencesDisableEndorsementEmail==null && other.getUserPreferencesDisableEndorsementEmail()==null) || 
             (this.userPreferencesDisableEndorsementEmail!=null &&
              this.userPreferencesDisableEndorsementEmail.equals(other.getUserPreferencesDisableEndorsementEmail()))) &&
            ((this.userPreferencesDisableFeedbackEmail==null && other.getUserPreferencesDisableFeedbackEmail()==null) || 
             (this.userPreferencesDisableFeedbackEmail!=null &&
              this.userPreferencesDisableFeedbackEmail.equals(other.getUserPreferencesDisableFeedbackEmail()))) &&
            ((this.userPreferencesDisableFileShareNotificationsForApi==null && other.getUserPreferencesDisableFileShareNotificationsForApi()==null) || 
             (this.userPreferencesDisableFileShareNotificationsForApi!=null &&
              this.userPreferencesDisableFileShareNotificationsForApi.equals(other.getUserPreferencesDisableFileShareNotificationsForApi()))) &&
            ((this.userPreferencesDisableFollowersEmail==null && other.getUserPreferencesDisableFollowersEmail()==null) || 
             (this.userPreferencesDisableFollowersEmail!=null &&
              this.userPreferencesDisableFollowersEmail.equals(other.getUserPreferencesDisableFollowersEmail()))) &&
            ((this.userPreferencesDisableLaterCommentEmail==null && other.getUserPreferencesDisableLaterCommentEmail()==null) || 
             (this.userPreferencesDisableLaterCommentEmail!=null &&
              this.userPreferencesDisableLaterCommentEmail.equals(other.getUserPreferencesDisableLaterCommentEmail()))) &&
            ((this.userPreferencesDisableLikeEmail==null && other.getUserPreferencesDisableLikeEmail()==null) || 
             (this.userPreferencesDisableLikeEmail!=null &&
              this.userPreferencesDisableLikeEmail.equals(other.getUserPreferencesDisableLikeEmail()))) &&
            ((this.userPreferencesDisableMentionsPostEmail==null && other.getUserPreferencesDisableMentionsPostEmail()==null) || 
             (this.userPreferencesDisableMentionsPostEmail!=null &&
              this.userPreferencesDisableMentionsPostEmail.equals(other.getUserPreferencesDisableMentionsPostEmail()))) &&
            ((this.userPreferencesDisableMessageEmail==null && other.getUserPreferencesDisableMessageEmail()==null) || 
             (this.userPreferencesDisableMessageEmail!=null &&
              this.userPreferencesDisableMessageEmail.equals(other.getUserPreferencesDisableMessageEmail()))) &&
            ((this.userPreferencesDisableProfilePostEmail==null && other.getUserPreferencesDisableProfilePostEmail()==null) || 
             (this.userPreferencesDisableProfilePostEmail!=null &&
              this.userPreferencesDisableProfilePostEmail.equals(other.getUserPreferencesDisableProfilePostEmail()))) &&
            ((this.userPreferencesDisableSharePostEmail==null && other.getUserPreferencesDisableSharePostEmail()==null) || 
             (this.userPreferencesDisableSharePostEmail!=null &&
              this.userPreferencesDisableSharePostEmail.equals(other.getUserPreferencesDisableSharePostEmail()))) &&
            ((this.userPreferencesDisableWorkEmail==null && other.getUserPreferencesDisableWorkEmail()==null) || 
             (this.userPreferencesDisableWorkEmail!=null &&
              this.userPreferencesDisableWorkEmail.equals(other.getUserPreferencesDisableWorkEmail()))) &&
            ((this.userPreferencesEnableAutoSubForFeeds==null && other.getUserPreferencesEnableAutoSubForFeeds()==null) || 
             (this.userPreferencesEnableAutoSubForFeeds!=null &&
              this.userPreferencesEnableAutoSubForFeeds.equals(other.getUserPreferencesEnableAutoSubForFeeds()))) &&
            ((this.userPreferencesEventRemindersCheckboxDefault==null && other.getUserPreferencesEventRemindersCheckboxDefault()==null) || 
             (this.userPreferencesEventRemindersCheckboxDefault!=null &&
              this.userPreferencesEventRemindersCheckboxDefault.equals(other.getUserPreferencesEventRemindersCheckboxDefault()))) &&
            ((this.userPreferencesHideCSNDesktopTask==null && other.getUserPreferencesHideCSNDesktopTask()==null) || 
             (this.userPreferencesHideCSNDesktopTask!=null &&
              this.userPreferencesHideCSNDesktopTask.equals(other.getUserPreferencesHideCSNDesktopTask()))) &&
            ((this.userPreferencesHideCSNGetChatterMobileTask==null && other.getUserPreferencesHideCSNGetChatterMobileTask()==null) || 
             (this.userPreferencesHideCSNGetChatterMobileTask!=null &&
              this.userPreferencesHideCSNGetChatterMobileTask.equals(other.getUserPreferencesHideCSNGetChatterMobileTask()))) &&
            ((this.userPreferencesHideChatterOnboardingSplash==null && other.getUserPreferencesHideChatterOnboardingSplash()==null) || 
             (this.userPreferencesHideChatterOnboardingSplash!=null &&
              this.userPreferencesHideChatterOnboardingSplash.equals(other.getUserPreferencesHideChatterOnboardingSplash()))) &&
            ((this.userPreferencesHideS1BrowserUI==null && other.getUserPreferencesHideS1BrowserUI()==null) || 
             (this.userPreferencesHideS1BrowserUI!=null &&
              this.userPreferencesHideS1BrowserUI.equals(other.getUserPreferencesHideS1BrowserUI()))) &&
            ((this.userPreferencesHideSecondChatterOnboardingSplash==null && other.getUserPreferencesHideSecondChatterOnboardingSplash()==null) || 
             (this.userPreferencesHideSecondChatterOnboardingSplash!=null &&
              this.userPreferencesHideSecondChatterOnboardingSplash.equals(other.getUserPreferencesHideSecondChatterOnboardingSplash()))) &&
            ((this.userPreferencesJigsawListUser==null && other.getUserPreferencesJigsawListUser()==null) || 
             (this.userPreferencesJigsawListUser!=null &&
              this.userPreferencesJigsawListUser.equals(other.getUserPreferencesJigsawListUser()))) &&
            ((this.userPreferencesLightningExperiencePreferred==null && other.getUserPreferencesLightningExperiencePreferred()==null) || 
             (this.userPreferencesLightningExperiencePreferred!=null &&
              this.userPreferencesLightningExperiencePreferred.equals(other.getUserPreferencesLightningExperiencePreferred()))) &&
            ((this.userPreferencesPathAssistantCollapsed==null && other.getUserPreferencesPathAssistantCollapsed()==null) || 
             (this.userPreferencesPathAssistantCollapsed!=null &&
              this.userPreferencesPathAssistantCollapsed.equals(other.getUserPreferencesPathAssistantCollapsed()))) &&
            ((this.userPreferencesReminderSoundOff==null && other.getUserPreferencesReminderSoundOff()==null) || 
             (this.userPreferencesReminderSoundOff!=null &&
              this.userPreferencesReminderSoundOff.equals(other.getUserPreferencesReminderSoundOff()))) &&
            ((this.userPreferencesShowCityToExternalUsers==null && other.getUserPreferencesShowCityToExternalUsers()==null) || 
             (this.userPreferencesShowCityToExternalUsers!=null &&
              this.userPreferencesShowCityToExternalUsers.equals(other.getUserPreferencesShowCityToExternalUsers()))) &&
            ((this.userPreferencesShowCityToGuestUsers==null && other.getUserPreferencesShowCityToGuestUsers()==null) || 
             (this.userPreferencesShowCityToGuestUsers!=null &&
              this.userPreferencesShowCityToGuestUsers.equals(other.getUserPreferencesShowCityToGuestUsers()))) &&
            ((this.userPreferencesShowCountryToExternalUsers==null && other.getUserPreferencesShowCountryToExternalUsers()==null) || 
             (this.userPreferencesShowCountryToExternalUsers!=null &&
              this.userPreferencesShowCountryToExternalUsers.equals(other.getUserPreferencesShowCountryToExternalUsers()))) &&
            ((this.userPreferencesShowCountryToGuestUsers==null && other.getUserPreferencesShowCountryToGuestUsers()==null) || 
             (this.userPreferencesShowCountryToGuestUsers!=null &&
              this.userPreferencesShowCountryToGuestUsers.equals(other.getUserPreferencesShowCountryToGuestUsers()))) &&
            ((this.userPreferencesShowEmailToExternalUsers==null && other.getUserPreferencesShowEmailToExternalUsers()==null) || 
             (this.userPreferencesShowEmailToExternalUsers!=null &&
              this.userPreferencesShowEmailToExternalUsers.equals(other.getUserPreferencesShowEmailToExternalUsers()))) &&
            ((this.userPreferencesShowEmailToGuestUsers==null && other.getUserPreferencesShowEmailToGuestUsers()==null) || 
             (this.userPreferencesShowEmailToGuestUsers!=null &&
              this.userPreferencesShowEmailToGuestUsers.equals(other.getUserPreferencesShowEmailToGuestUsers()))) &&
            ((this.userPreferencesShowFaxToExternalUsers==null && other.getUserPreferencesShowFaxToExternalUsers()==null) || 
             (this.userPreferencesShowFaxToExternalUsers!=null &&
              this.userPreferencesShowFaxToExternalUsers.equals(other.getUserPreferencesShowFaxToExternalUsers()))) &&
            ((this.userPreferencesShowFaxToGuestUsers==null && other.getUserPreferencesShowFaxToGuestUsers()==null) || 
             (this.userPreferencesShowFaxToGuestUsers!=null &&
              this.userPreferencesShowFaxToGuestUsers.equals(other.getUserPreferencesShowFaxToGuestUsers()))) &&
            ((this.userPreferencesShowManagerToExternalUsers==null && other.getUserPreferencesShowManagerToExternalUsers()==null) || 
             (this.userPreferencesShowManagerToExternalUsers!=null &&
              this.userPreferencesShowManagerToExternalUsers.equals(other.getUserPreferencesShowManagerToExternalUsers()))) &&
            ((this.userPreferencesShowManagerToGuestUsers==null && other.getUserPreferencesShowManagerToGuestUsers()==null) || 
             (this.userPreferencesShowManagerToGuestUsers!=null &&
              this.userPreferencesShowManagerToGuestUsers.equals(other.getUserPreferencesShowManagerToGuestUsers()))) &&
            ((this.userPreferencesShowMobilePhoneToExternalUsers==null && other.getUserPreferencesShowMobilePhoneToExternalUsers()==null) || 
             (this.userPreferencesShowMobilePhoneToExternalUsers!=null &&
              this.userPreferencesShowMobilePhoneToExternalUsers.equals(other.getUserPreferencesShowMobilePhoneToExternalUsers()))) &&
            ((this.userPreferencesShowMobilePhoneToGuestUsers==null && other.getUserPreferencesShowMobilePhoneToGuestUsers()==null) || 
             (this.userPreferencesShowMobilePhoneToGuestUsers!=null &&
              this.userPreferencesShowMobilePhoneToGuestUsers.equals(other.getUserPreferencesShowMobilePhoneToGuestUsers()))) &&
            ((this.userPreferencesShowPostalCodeToExternalUsers==null && other.getUserPreferencesShowPostalCodeToExternalUsers()==null) || 
             (this.userPreferencesShowPostalCodeToExternalUsers!=null &&
              this.userPreferencesShowPostalCodeToExternalUsers.equals(other.getUserPreferencesShowPostalCodeToExternalUsers()))) &&
            ((this.userPreferencesShowPostalCodeToGuestUsers==null && other.getUserPreferencesShowPostalCodeToGuestUsers()==null) || 
             (this.userPreferencesShowPostalCodeToGuestUsers!=null &&
              this.userPreferencesShowPostalCodeToGuestUsers.equals(other.getUserPreferencesShowPostalCodeToGuestUsers()))) &&
            ((this.userPreferencesShowProfilePicToGuestUsers==null && other.getUserPreferencesShowProfilePicToGuestUsers()==null) || 
             (this.userPreferencesShowProfilePicToGuestUsers!=null &&
              this.userPreferencesShowProfilePicToGuestUsers.equals(other.getUserPreferencesShowProfilePicToGuestUsers()))) &&
            ((this.userPreferencesShowStateToExternalUsers==null && other.getUserPreferencesShowStateToExternalUsers()==null) || 
             (this.userPreferencesShowStateToExternalUsers!=null &&
              this.userPreferencesShowStateToExternalUsers.equals(other.getUserPreferencesShowStateToExternalUsers()))) &&
            ((this.userPreferencesShowStateToGuestUsers==null && other.getUserPreferencesShowStateToGuestUsers()==null) || 
             (this.userPreferencesShowStateToGuestUsers!=null &&
              this.userPreferencesShowStateToGuestUsers.equals(other.getUserPreferencesShowStateToGuestUsers()))) &&
            ((this.userPreferencesShowStreetAddressToExternalUsers==null && other.getUserPreferencesShowStreetAddressToExternalUsers()==null) || 
             (this.userPreferencesShowStreetAddressToExternalUsers!=null &&
              this.userPreferencesShowStreetAddressToExternalUsers.equals(other.getUserPreferencesShowStreetAddressToExternalUsers()))) &&
            ((this.userPreferencesShowStreetAddressToGuestUsers==null && other.getUserPreferencesShowStreetAddressToGuestUsers()==null) || 
             (this.userPreferencesShowStreetAddressToGuestUsers!=null &&
              this.userPreferencesShowStreetAddressToGuestUsers.equals(other.getUserPreferencesShowStreetAddressToGuestUsers()))) &&
            ((this.userPreferencesShowTitleToExternalUsers==null && other.getUserPreferencesShowTitleToExternalUsers()==null) || 
             (this.userPreferencesShowTitleToExternalUsers!=null &&
              this.userPreferencesShowTitleToExternalUsers.equals(other.getUserPreferencesShowTitleToExternalUsers()))) &&
            ((this.userPreferencesShowTitleToGuestUsers==null && other.getUserPreferencesShowTitleToGuestUsers()==null) || 
             (this.userPreferencesShowTitleToGuestUsers!=null &&
              this.userPreferencesShowTitleToGuestUsers.equals(other.getUserPreferencesShowTitleToGuestUsers()))) &&
            ((this.userPreferencesShowWorkPhoneToExternalUsers==null && other.getUserPreferencesShowWorkPhoneToExternalUsers()==null) || 
             (this.userPreferencesShowWorkPhoneToExternalUsers!=null &&
              this.userPreferencesShowWorkPhoneToExternalUsers.equals(other.getUserPreferencesShowWorkPhoneToExternalUsers()))) &&
            ((this.userPreferencesShowWorkPhoneToGuestUsers==null && other.getUserPreferencesShowWorkPhoneToGuestUsers()==null) || 
             (this.userPreferencesShowWorkPhoneToGuestUsers!=null &&
              this.userPreferencesShowWorkPhoneToGuestUsers.equals(other.getUserPreferencesShowWorkPhoneToGuestUsers()))) &&
            ((this.userPreferencesTaskRemindersCheckboxDefault==null && other.getUserPreferencesTaskRemindersCheckboxDefault()==null) || 
             (this.userPreferencesTaskRemindersCheckboxDefault!=null &&
              this.userPreferencesTaskRemindersCheckboxDefault.equals(other.getUserPreferencesTaskRemindersCheckboxDefault()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              this.userRole.equals(other.getUserRole()))) &&
            ((this.userRoleId==null && other.getUserRoleId()==null) || 
             (this.userRoleId!=null &&
              this.userRoleId.equals(other.getUserRoleId()))) &&
            ((this.userSites==null && other.getUserSites()==null) || 
             (this.userSites!=null &&
              this.userSites.equals(other.getUserSites()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAboutMe() != null) {
            _hashCode += getAboutMe().hashCode();
        }
        if (getAcceptedEventRelations() != null) {
            _hashCode += getAcceptedEventRelations().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountCleanInfoReviewers() != null) {
            _hashCode += getAccountCleanInfoReviewers().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getBadgeText() != null) {
            _hashCode += getBadgeText().hashCode();
        }
        if (getCallCenterId() != null) {
            _hashCode += getCallCenterId().hashCode();
        }
        if (getCampsite_Reservations__r() != null) {
            _hashCode += getCampsite_Reservations__r().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
        }
        if (getCommunityNickname() != null) {
            _hashCode += getCommunityNickname().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactCleanInfoReviewers() != null) {
            _hashCode += getContactCleanInfoReviewers().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getContractsSigned() != null) {
            _hashCode += getContractsSigned().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDeclinedEventRelations() != null) {
            _hashCode += getDeclinedEventRelations().hashCode();
        }
        if (getDefaultGroupNotificationFrequency() != null) {
            _hashCode += getDefaultGroupNotificationFrequency().hashCode();
        }
        if (getDelegatedApproverId() != null) {
            _hashCode += getDelegatedApproverId().hashCode();
        }
        if (getDelegatedUsers() != null) {
            _hashCode += getDelegatedUsers().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDigestFrequency() != null) {
            _hashCode += getDigestFrequency().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailEncodingKey() != null) {
            _hashCode += getEmailEncodingKey().hashCode();
        }
        if (getEmailPreferencesAutoBcc() != null) {
            _hashCode += getEmailPreferencesAutoBcc().hashCode();
        }
        if (getEmailPreferencesAutoBccStayInTouch() != null) {
            _hashCode += getEmailPreferencesAutoBccStayInTouch().hashCode();
        }
        if (getEmailPreferencesStayInTouchReminder() != null) {
            _hashCode += getEmailPreferencesStayInTouchReminder().hashCode();
        }
        if (getEmployeeNumber() != null) {
            _hashCode += getEmployeeNumber().hashCode();
        }
        if (getEventRelations() != null) {
            _hashCode += getEventRelations().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        if (getExternalDataUserAuths() != null) {
            _hashCode += getExternalDataUserAuths().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFederationIdentifier() != null) {
            _hashCode += getFederationIdentifier().hashCode();
        }
        if (getFeedSubscriptions() != null) {
            _hashCode += getFeedSubscriptions().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getForecastEnabled() != null) {
            _hashCode += getForecastEnabled().hashCode();
        }
        if (getFullPhotoUrl() != null) {
            _hashCode += getFullPhotoUrl().hashCode();
        }
        if (getGeocodeAccuracy() != null) {
            _hashCode += getGeocodeAccuracy().hashCode();
        }
        if (getGroupMembershipRequests() != null) {
            _hashCode += getGroupMembershipRequests().hashCode();
        }
        if (getGroupMemberships() != null) {
            _hashCode += getGroupMemberships().hashCode();
        }
        if (getInstalledMobileApps() != null) {
            _hashCode += getInstalledMobileApps().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getJigsawImportLimitOverride() != null) {
            _hashCode += getJigsawImportLimitOverride().hashCode();
        }
        if (getLanguageLocaleKey() != null) {
            _hashCode += getLanguageLocaleKey().hashCode();
        }
        if (getLastLoginDate() != null) {
            _hashCode += getLastLoginDate().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastPasswordChangeDate() != null) {
            _hashCode += getLastPasswordChangeDate().hashCode();
        }
        if (getLastReferencedDate() != null) {
            _hashCode += getLastReferencedDate().hashCode();
        }
        if (getLastViewedDate() != null) {
            _hashCode += getLastViewedDate().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLeadCleanInfoReviewers() != null) {
            _hashCode += getLeadCleanInfoReviewers().hashCode();
        }
        if (getLocaleSidKey() != null) {
            _hashCode += getLocaleSidKey().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getManagedUsers() != null) {
            _hashCode += getManagedUsers().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerId() != null) {
            _hashCode += getManagerId().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOfflinePdaTrialExpirationDate() != null) {
            _hashCode += getOfflinePdaTrialExpirationDate().hashCode();
        }
        if (getOfflineTrialExpirationDate() != null) {
            _hashCode += getOfflineTrialExpirationDate().hashCode();
        }
        if (getOwnedContentDocuments() != null) {
            _hashCode += getOwnedContentDocuments().hashCode();
        }
        if (getPermissionSetAssignments() != null) {
            _hashCode += getPermissionSetAssignments().hashCode();
        }
        if (getPermissionSetLicenseAssignments() != null) {
            _hashCode += getPermissionSetLicenseAssignments().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getReceivesAdminInfoEmails() != null) {
            _hashCode += getReceivesAdminInfoEmails().hashCode();
        }
        if (getReceivesInfoEmails() != null) {
            _hashCode += getReceivesInfoEmails().hashCode();
        }
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getSenderName() != null) {
            _hashCode += getSenderName().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSmallPhotoUrl() != null) {
            _hashCode += getSmallPhotoUrl().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStayInTouchNote() != null) {
            _hashCode += getStayInTouchNote().hashCode();
        }
        if (getStayInTouchSignature() != null) {
            _hashCode += getStayInTouchSignature().hashCode();
        }
        if (getStayInTouchSubject() != null) {
            _hashCode += getStayInTouchSubject().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTimeZoneSidKey() != null) {
            _hashCode += getTimeZoneSidKey().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUndecidedEventRelations() != null) {
            _hashCode += getUndecidedEventRelations().hashCode();
        }
        if (getUserEntityAccessRights() != null) {
            _hashCode += getUserEntityAccessRights().hashCode();
        }
        if (getUserFieldAccessRights() != null) {
            _hashCode += getUserFieldAccessRights().hashCode();
        }
        if (getUserPermissionsCallCenterAutoLogin() != null) {
            _hashCode += getUserPermissionsCallCenterAutoLogin().hashCode();
        }
        if (getUserPermissionsChatterAnswersUser() != null) {
            _hashCode += getUserPermissionsChatterAnswersUser().hashCode();
        }
        if (getUserPermissionsInteractionUser() != null) {
            _hashCode += getUserPermissionsInteractionUser().hashCode();
        }
        if (getUserPermissionsJigsawProspectingUser() != null) {
            _hashCode += getUserPermissionsJigsawProspectingUser().hashCode();
        }
        if (getUserPermissionsKnowledgeUser() != null) {
            _hashCode += getUserPermissionsKnowledgeUser().hashCode();
        }
        if (getUserPermissionsMarketingUser() != null) {
            _hashCode += getUserPermissionsMarketingUser().hashCode();
        }
        if (getUserPermissionsMobileUser() != null) {
            _hashCode += getUserPermissionsMobileUser().hashCode();
        }
        if (getUserPermissionsOfflineUser() != null) {
            _hashCode += getUserPermissionsOfflineUser().hashCode();
        }
        if (getUserPermissionsSFContentUser() != null) {
            _hashCode += getUserPermissionsSFContentUser().hashCode();
        }
        if (getUserPermissionsSiteforceContributorUser() != null) {
            _hashCode += getUserPermissionsSiteforceContributorUser().hashCode();
        }
        if (getUserPermissionsSiteforcePublisherUser() != null) {
            _hashCode += getUserPermissionsSiteforcePublisherUser().hashCode();
        }
        if (getUserPermissionsSupportUser() != null) {
            _hashCode += getUserPermissionsSupportUser().hashCode();
        }
        if (getUserPermissionsWorkDotComUserFeature() != null) {
            _hashCode += getUserPermissionsWorkDotComUserFeature().hashCode();
        }
        if (getUserPreferences() != null) {
            _hashCode += getUserPreferences().hashCode();
        }
        if (getUserPreferencesActivityRemindersPopup() != null) {
            _hashCode += getUserPreferencesActivityRemindersPopup().hashCode();
        }
        if (getUserPreferencesApexPagesDeveloperMode() != null) {
            _hashCode += getUserPreferencesApexPagesDeveloperMode().hashCode();
        }
        if (getUserPreferencesCacheDiagnostics() != null) {
            _hashCode += getUserPreferencesCacheDiagnostics().hashCode();
        }
        if (getUserPreferencesContentEmailAsAndWhen() != null) {
            _hashCode += getUserPreferencesContentEmailAsAndWhen().hashCode();
        }
        if (getUserPreferencesContentNoEmail() != null) {
            _hashCode += getUserPreferencesContentNoEmail().hashCode();
        }
        if (getUserPreferencesDisCommentAfterLikeEmail() != null) {
            _hashCode += getUserPreferencesDisCommentAfterLikeEmail().hashCode();
        }
        if (getUserPreferencesDisMentionsCommentEmail() != null) {
            _hashCode += getUserPreferencesDisMentionsCommentEmail().hashCode();
        }
        if (getUserPreferencesDisProfPostCommentEmail() != null) {
            _hashCode += getUserPreferencesDisProfPostCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableAllFeedsEmail() != null) {
            _hashCode += getUserPreferencesDisableAllFeedsEmail().hashCode();
        }
        if (getUserPreferencesDisableBookmarkEmail() != null) {
            _hashCode += getUserPreferencesDisableBookmarkEmail().hashCode();
        }
        if (getUserPreferencesDisableChangeCommentEmail() != null) {
            _hashCode += getUserPreferencesDisableChangeCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableEndorsementEmail() != null) {
            _hashCode += getUserPreferencesDisableEndorsementEmail().hashCode();
        }
        if (getUserPreferencesDisableFeedbackEmail() != null) {
            _hashCode += getUserPreferencesDisableFeedbackEmail().hashCode();
        }
        if (getUserPreferencesDisableFileShareNotificationsForApi() != null) {
            _hashCode += getUserPreferencesDisableFileShareNotificationsForApi().hashCode();
        }
        if (getUserPreferencesDisableFollowersEmail() != null) {
            _hashCode += getUserPreferencesDisableFollowersEmail().hashCode();
        }
        if (getUserPreferencesDisableLaterCommentEmail() != null) {
            _hashCode += getUserPreferencesDisableLaterCommentEmail().hashCode();
        }
        if (getUserPreferencesDisableLikeEmail() != null) {
            _hashCode += getUserPreferencesDisableLikeEmail().hashCode();
        }
        if (getUserPreferencesDisableMentionsPostEmail() != null) {
            _hashCode += getUserPreferencesDisableMentionsPostEmail().hashCode();
        }
        if (getUserPreferencesDisableMessageEmail() != null) {
            _hashCode += getUserPreferencesDisableMessageEmail().hashCode();
        }
        if (getUserPreferencesDisableProfilePostEmail() != null) {
            _hashCode += getUserPreferencesDisableProfilePostEmail().hashCode();
        }
        if (getUserPreferencesDisableSharePostEmail() != null) {
            _hashCode += getUserPreferencesDisableSharePostEmail().hashCode();
        }
        if (getUserPreferencesDisableWorkEmail() != null) {
            _hashCode += getUserPreferencesDisableWorkEmail().hashCode();
        }
        if (getUserPreferencesEnableAutoSubForFeeds() != null) {
            _hashCode += getUserPreferencesEnableAutoSubForFeeds().hashCode();
        }
        if (getUserPreferencesEventRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesEventRemindersCheckboxDefault().hashCode();
        }
        if (getUserPreferencesHideCSNDesktopTask() != null) {
            _hashCode += getUserPreferencesHideCSNDesktopTask().hashCode();
        }
        if (getUserPreferencesHideCSNGetChatterMobileTask() != null) {
            _hashCode += getUserPreferencesHideCSNGetChatterMobileTask().hashCode();
        }
        if (getUserPreferencesHideChatterOnboardingSplash() != null) {
            _hashCode += getUserPreferencesHideChatterOnboardingSplash().hashCode();
        }
        if (getUserPreferencesHideS1BrowserUI() != null) {
            _hashCode += getUserPreferencesHideS1BrowserUI().hashCode();
        }
        if (getUserPreferencesHideSecondChatterOnboardingSplash() != null) {
            _hashCode += getUserPreferencesHideSecondChatterOnboardingSplash().hashCode();
        }
        if (getUserPreferencesJigsawListUser() != null) {
            _hashCode += getUserPreferencesJigsawListUser().hashCode();
        }
        if (getUserPreferencesLightningExperiencePreferred() != null) {
            _hashCode += getUserPreferencesLightningExperiencePreferred().hashCode();
        }
        if (getUserPreferencesPathAssistantCollapsed() != null) {
            _hashCode += getUserPreferencesPathAssistantCollapsed().hashCode();
        }
        if (getUserPreferencesReminderSoundOff() != null) {
            _hashCode += getUserPreferencesReminderSoundOff().hashCode();
        }
        if (getUserPreferencesShowCityToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowCityToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowCityToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowCityToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowCountryToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowCountryToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowCountryToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowCountryToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowEmailToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowEmailToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowEmailToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowEmailToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowFaxToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowFaxToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowFaxToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowFaxToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowManagerToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowManagerToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowManagerToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowManagerToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowMobilePhoneToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowMobilePhoneToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowMobilePhoneToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowMobilePhoneToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowPostalCodeToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowPostalCodeToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowPostalCodeToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowPostalCodeToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowProfilePicToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowProfilePicToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowStateToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowStateToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowStateToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowStateToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowStreetAddressToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowStreetAddressToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowStreetAddressToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowStreetAddressToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowTitleToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowTitleToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowTitleToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowTitleToGuestUsers().hashCode();
        }
        if (getUserPreferencesShowWorkPhoneToExternalUsers() != null) {
            _hashCode += getUserPreferencesShowWorkPhoneToExternalUsers().hashCode();
        }
        if (getUserPreferencesShowWorkPhoneToGuestUsers() != null) {
            _hashCode += getUserPreferencesShowWorkPhoneToGuestUsers().hashCode();
        }
        if (getUserPreferencesTaskRemindersCheckboxDefault() != null) {
            _hashCode += getUserPreferencesTaskRemindersCheckboxDefault().hashCode();
        }
        if (getUserRole() != null) {
            _hashCode += getUserRole().hashCode();
        }
        if (getUserRoleId() != null) {
            _hashCode += getUserRoleId().hashCode();
        }
        if (getUserSites() != null) {
            _hashCode += getUserSites().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aboutMe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AboutMe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AcceptedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCleanInfoReviewers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountCleanInfoReviewers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedContentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachedContentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badgeText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BadgeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callCenterId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campsite_Reservations__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campsite_Reservations__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CombinedAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactCleanInfoReviewers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactCleanInfoReviewers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractsSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractsSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declinedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeclinedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultGroupNotificationFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultGroupNotificationFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegatedApproverId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedApproverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegatedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DelegatedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DigestFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailEncodingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailEncodingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreferencesAutoBcc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailPreferencesAutoBcc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreferencesAutoBccStayInTouch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailPreferencesAutoBccStayInTouch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailPreferencesStayInTouchReminder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailPreferencesStayInTouchReminder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Extension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalDataUserAuths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalDataUserAuths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FederationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FullPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geocodeAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GeocodeAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMembershipRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMembershipRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMemberships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMemberships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedMobileApps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InstalledMobileApps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsawImportLimitOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JigsawImportLimitOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageLocaleKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LanguageLocaleKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPasswordChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastPasswordChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReferencedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastReferencedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastViewedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadCleanInfoReviewers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadCleanInfoReviewers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LocaleSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlinePdaTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflinePdaTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineTrialExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OfflineTrialExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownedContentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnedContentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSetAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionSetLicenseAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicenseAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesAdminInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesAdminInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivesInfoEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReceivesInfoEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SenderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SenderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stayInTouchNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StayInTouchNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stayInTouchSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StayInTouchSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stayInTouchSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StayInTouchSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undecidedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UndecidedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEntityAccessRights");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserEntityAccessRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFieldAccessRights");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFieldAccessRights"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsCallCenterAutoLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsCallCenterAutoLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsChatterAnswersUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsChatterAnswersUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsInteractionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsInteractionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsJigsawProspectingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsJigsawProspectingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsKnowledgeUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsKnowledgeUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMarketingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMarketingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsMobileUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsMobileUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsOfflineUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsOfflineUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSFContentUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSFContentUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSiteforceContributorUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSiteforceContributorUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSiteforcePublisherUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSiteforcePublisherUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsSupportUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsSupportUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermissionsWorkDotComUserFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPermissionsWorkDotComUserFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesActivityRemindersPopup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesActivityRemindersPopup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesApexPagesDeveloperMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesApexPagesDeveloperMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesCacheDiagnostics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesCacheDiagnostics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesContentEmailAsAndWhen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesContentEmailAsAndWhen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesContentNoEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesContentNoEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisCommentAfterLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisCommentAfterLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisMentionsCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisMentionsCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisProfPostCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisProfPostCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableAllFeedsEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableAllFeedsEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableBookmarkEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableBookmarkEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableChangeCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableChangeCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableEndorsementEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableEndorsementEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableFeedbackEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableFeedbackEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableFileShareNotificationsForApi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableFileShareNotificationsForApi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableFollowersEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableFollowersEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableLaterCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableLaterCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableMentionsPostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableMentionsPostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableMessageEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableMessageEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableProfilePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableProfilePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableSharePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableSharePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesDisableWorkEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesDisableWorkEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesEnableAutoSubForFeeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesEnableAutoSubForFeeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesEventRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesEventRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideCSNDesktopTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideCSNDesktopTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideCSNGetChatterMobileTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideCSNGetChatterMobileTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideChatterOnboardingSplash");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideChatterOnboardingSplash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideS1BrowserUI");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideS1BrowserUI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesHideSecondChatterOnboardingSplash");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesHideSecondChatterOnboardingSplash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesJigsawListUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesJigsawListUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesLightningExperiencePreferred");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesLightningExperiencePreferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesPathAssistantCollapsed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesPathAssistantCollapsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesReminderSoundOff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesReminderSoundOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCityToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCityToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCityToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCityToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCountryToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCountryToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowCountryToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowCountryToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowEmailToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowEmailToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowEmailToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowEmailToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowFaxToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowFaxToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowFaxToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowFaxToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowManagerToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowManagerToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowManagerToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowManagerToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowMobilePhoneToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowMobilePhoneToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowMobilePhoneToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowMobilePhoneToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowPostalCodeToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowPostalCodeToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowPostalCodeToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowPostalCodeToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowProfilePicToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowProfilePicToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStateToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStateToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStateToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStateToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStreetAddressToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStreetAddressToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowStreetAddressToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowStreetAddressToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowTitleToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowTitleToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowTitleToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowTitleToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowWorkPhoneToExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowWorkPhoneToExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesShowWorkPhoneToGuestUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesShowWorkPhoneToGuestUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPreferencesTaskRemindersCheckboxDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreferencesTaskRemindersCheckboxDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSites");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserSites"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
