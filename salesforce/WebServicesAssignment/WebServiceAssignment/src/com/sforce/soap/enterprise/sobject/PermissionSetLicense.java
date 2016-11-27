/**
 * PermissionSetLicense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class PermissionSetLicense  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String developerName;

    private java.util.Date expirationDate;

    private com.sforce.soap.enterprise.QueryResult grantedByLicenses;

    private java.lang.Boolean isDeleted;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String masterLabel;

    private java.lang.Boolean maximumPermissionsActivateContract;

    private java.lang.Boolean maximumPermissionsActivateOrder;

    private java.lang.Boolean maximumPermissionsAllowEmailIC;

    private java.lang.Boolean maximumPermissionsAllowUniversalSearch;

    private java.lang.Boolean maximumPermissionsAllowViewKnowledge;

    private java.lang.Boolean maximumPermissionsApiEnabled;

    private java.lang.Boolean maximumPermissionsAssignPermissionSets;

    private java.lang.Boolean maximumPermissionsAssignTopics;

    private java.lang.Boolean maximumPermissionsAuthorApex;

    private java.lang.Boolean maximumPermissionsBulkApiHardDelete;

    private java.lang.Boolean maximumPermissionsBulkMacrosAllowed;

    private java.lang.Boolean maximumPermissionsCanInsertFeedSystemFields;

    private java.lang.Boolean maximumPermissionsCanUseNewDashboardBuilder;

    private java.lang.Boolean maximumPermissionsChatterEditOwnPost;

    private java.lang.Boolean maximumPermissionsChatterEditOwnRecordPost;

    private java.lang.Boolean maximumPermissionsChatterFileLink;

    private java.lang.Boolean maximumPermissionsChatterForSharePoint;

    private java.lang.Boolean maximumPermissionsChatterInternalUser;

    private java.lang.Boolean maximumPermissionsChatterInviteExternalUsers;

    private java.lang.Boolean maximumPermissionsChatterOwnGroups;

    private java.lang.Boolean maximumPermissionsConfigCustomRecs;

    private java.lang.Boolean maximumPermissionsConnectOrgToEnvironmentHub;

    private java.lang.Boolean maximumPermissionsContentAdministrator;

    private java.lang.Boolean maximumPermissionsConvertLeads;

    private java.lang.Boolean maximumPermissionsCreateCustomizeDashboards;

    private java.lang.Boolean maximumPermissionsCreateCustomizeFilters;

    private java.lang.Boolean maximumPermissionsCreateCustomizeReports;

    private java.lang.Boolean maximumPermissionsCreateDashboardFolders;

    private java.lang.Boolean maximumPermissionsCreatePackaging;

    private java.lang.Boolean maximumPermissionsCreateReportFolders;

    private java.lang.Boolean maximumPermissionsCreateTopics;

    private java.lang.Boolean maximumPermissionsCreateWorkspaces;

    private java.lang.Boolean maximumPermissionsCustomMobileAppsAccess;

    private java.lang.Boolean maximumPermissionsCustomSidebarOnAllPages;

    private java.lang.Boolean maximumPermissionsCustomizeApplication;

    private java.lang.Boolean maximumPermissionsDeleteActivatedContract;

    private java.lang.Boolean maximumPermissionsDeleteTopics;

    private java.lang.Boolean maximumPermissionsDistributeFromPersWksp;

    private java.lang.Boolean maximumPermissionsEditActivatedOrders;

    private java.lang.Boolean maximumPermissionsEditBrandTemplates;

    private java.lang.Boolean maximumPermissionsEditCaseComments;

    private java.lang.Boolean maximumPermissionsEditEvent;

    private java.lang.Boolean maximumPermissionsEditHtmlTemplates;

    private java.lang.Boolean maximumPermissionsEditKnowledge;

    private java.lang.Boolean maximumPermissionsEditMyDashboards;

    private java.lang.Boolean maximumPermissionsEditMyReports;

    private java.lang.Boolean maximumPermissionsEditOppLineItemUnitPrice;

    private java.lang.Boolean maximumPermissionsEditPublicDocuments;

    private java.lang.Boolean maximumPermissionsEditPublicTemplates;

    private java.lang.Boolean maximumPermissionsEditReadonlyFields;

    private java.lang.Boolean maximumPermissionsEditTask;

    private java.lang.Boolean maximumPermissionsEditTopics;

    private java.lang.Boolean maximumPermissionsEmailAdministration;

    private java.lang.Boolean maximumPermissionsEmailMass;

    private java.lang.Boolean maximumPermissionsEmailSingle;

    private java.lang.Boolean maximumPermissionsEmailTemplateManagement;

    private java.lang.Boolean maximumPermissionsEnableNotifications;

    private java.lang.Boolean maximumPermissionsExportReport;

    private java.lang.Boolean maximumPermissionsFlowUFLRequired;

    private java.lang.Boolean maximumPermissionsForceTwoFactor;

    private java.lang.Boolean maximumPermissionsGovernNetworks;

    private java.lang.Boolean maximumPermissionsIdentityConnect;

    private java.lang.Boolean maximumPermissionsIdentityEnabled;

    private java.lang.Boolean maximumPermissionsImportLeads;

    private java.lang.Boolean maximumPermissionsImportPersonal;

    private java.lang.Boolean maximumPermissionsInstallPackaging;

    private java.lang.Boolean maximumPermissionsLightningExperienceUser;

    private java.lang.Boolean maximumPermissionsManageAnalyticSnapshots;

    private java.lang.Boolean maximumPermissionsManageAuthProviders;

    private java.lang.Boolean maximumPermissionsManageBusinessHourHolidays;

    private java.lang.Boolean maximumPermissionsManageCallCenters;

    private java.lang.Boolean maximumPermissionsManageCases;

    private java.lang.Boolean maximumPermissionsManageCategories;

    private java.lang.Boolean maximumPermissionsManageChatterMessages;

    private java.lang.Boolean maximumPermissionsManageContentPermissions;

    private java.lang.Boolean maximumPermissionsManageContentProperties;

    private java.lang.Boolean maximumPermissionsManageContentTypes;

    private java.lang.Boolean maximumPermissionsManageCustomPermissions;

    private java.lang.Boolean maximumPermissionsManageCustomReportTypes;

    private java.lang.Boolean maximumPermissionsManageDashbdsInPubFolders;

    private java.lang.Boolean maximumPermissionsManageDataCategories;

    private java.lang.Boolean maximumPermissionsManageDataIntegrations;

    private java.lang.Boolean maximumPermissionsManageDynamicDashboards;

    private java.lang.Boolean maximumPermissionsManageEmailClientConfig;

    private java.lang.Boolean maximumPermissionsManageEncryptionKeys;

    private java.lang.Boolean maximumPermissionsManageExchangeConfig;

    private java.lang.Boolean maximumPermissionsManageInteraction;

    private java.lang.Boolean maximumPermissionsManageInternalUsers;

    private java.lang.Boolean maximumPermissionsManageIpAddresses;

    private java.lang.Boolean maximumPermissionsManageKnowledge;

    private java.lang.Boolean maximumPermissionsManageKnowledgeImportExport;

    private java.lang.Boolean maximumPermissionsManageLeads;

    private java.lang.Boolean maximumPermissionsManageLoginAccessPolicies;

    private java.lang.Boolean maximumPermissionsManageMobile;

    private java.lang.Boolean maximumPermissionsManageNetworks;

    private java.lang.Boolean maximumPermissionsManagePasswordPolicies;

    private java.lang.Boolean maximumPermissionsManageProfilesPermissionsets;

    private java.lang.Boolean maximumPermissionsManageRemoteAccess;

    private java.lang.Boolean maximumPermissionsManageReportsInPubFolders;

    private java.lang.Boolean maximumPermissionsManageRoles;

    private java.lang.Boolean maximumPermissionsManageSearchPromotionRules;

    private java.lang.Boolean maximumPermissionsManageSharing;

    private java.lang.Boolean maximumPermissionsManageSolutions;

    private java.lang.Boolean maximumPermissionsManageSynonyms;

    private java.lang.Boolean maximumPermissionsManageTwoFactor;

    private java.lang.Boolean maximumPermissionsManageUnlistedGroups;

    private java.lang.Boolean maximumPermissionsManageUsers;

    private java.lang.Boolean maximumPermissionsMassInlineEdit;

    private java.lang.Boolean maximumPermissionsMergeTopics;

    private java.lang.Boolean maximumPermissionsModerateChatter;

    private java.lang.Boolean maximumPermissionsModifyAllData;

    private java.lang.Boolean maximumPermissionsModifySecureAgents;

    private java.lang.Boolean maximumPermissionsNewReportBuilder;

    private java.lang.Boolean maximumPermissionsPasswordNeverExpires;

    private java.lang.Boolean maximumPermissionsPublishPackaging;

    private java.lang.Boolean maximumPermissionsResetPasswords;

    private java.lang.Boolean maximumPermissionsRunFlow;

    private java.lang.Boolean maximumPermissionsRunReports;

    private java.lang.Boolean maximumPermissionsSalesConsole;

    private java.lang.Boolean maximumPermissionsScheduleReports;

    private java.lang.Boolean maximumPermissionsSelectFilesFromSalesforce;

    private java.lang.Boolean maximumPermissionsSendSitRequests;

    private java.lang.Boolean maximumPermissionsShareInternalArticles;

    private java.lang.Boolean maximumPermissionsSolutionImport;

    private java.lang.Boolean maximumPermissionsSubmitMacrosAllowed;

    private java.lang.Boolean maximumPermissionsTransferAnyCase;

    private java.lang.Boolean maximumPermissionsTransferAnyEntity;

    private java.lang.Boolean maximumPermissionsTransferAnyLead;

    private java.lang.Boolean maximumPermissionsTwoFactorApi;

    private java.lang.Boolean maximumPermissionsUseTeamReassignWizards;

    private java.lang.Boolean maximumPermissionsViewAllData;

    private java.lang.Boolean maximumPermissionsViewAllUsers;

    private java.lang.Boolean maximumPermissionsViewContent;

    private java.lang.Boolean maximumPermissionsViewDataCategories;

    private java.lang.Boolean maximumPermissionsViewEncryptedData;

    private java.lang.Boolean maximumPermissionsViewEventLogFiles;

    private java.lang.Boolean maximumPermissionsViewHelpLink;

    private java.lang.Boolean maximumPermissionsViewMyTeamsDashboards;

    private java.lang.Boolean maximumPermissionsViewPublicDashboards;

    private java.lang.Boolean maximumPermissionsViewPublicReports;

    private java.lang.Boolean maximumPermissionsViewSetup;

    private java.lang.Boolean maximumPermissionsWorkCalibrationUser;

    private java.lang.Boolean maximumPermissionsWorkDotComUserPerm;

    private com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments;

    private java.lang.String permissionSetLicenseKey;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private java.lang.Integer totalLicenses;

    private java.lang.Integer usedLicenses;

    public PermissionSetLicense() {
    }

    public PermissionSetLicense(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String developerName,
           java.util.Date expirationDate,
           com.sforce.soap.enterprise.QueryResult grantedByLicenses,
           java.lang.Boolean isDeleted,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String masterLabel,
           java.lang.Boolean maximumPermissionsActivateContract,
           java.lang.Boolean maximumPermissionsActivateOrder,
           java.lang.Boolean maximumPermissionsAllowEmailIC,
           java.lang.Boolean maximumPermissionsAllowUniversalSearch,
           java.lang.Boolean maximumPermissionsAllowViewKnowledge,
           java.lang.Boolean maximumPermissionsApiEnabled,
           java.lang.Boolean maximumPermissionsAssignPermissionSets,
           java.lang.Boolean maximumPermissionsAssignTopics,
           java.lang.Boolean maximumPermissionsAuthorApex,
           java.lang.Boolean maximumPermissionsBulkApiHardDelete,
           java.lang.Boolean maximumPermissionsBulkMacrosAllowed,
           java.lang.Boolean maximumPermissionsCanInsertFeedSystemFields,
           java.lang.Boolean maximumPermissionsCanUseNewDashboardBuilder,
           java.lang.Boolean maximumPermissionsChatterEditOwnPost,
           java.lang.Boolean maximumPermissionsChatterEditOwnRecordPost,
           java.lang.Boolean maximumPermissionsChatterFileLink,
           java.lang.Boolean maximumPermissionsChatterForSharePoint,
           java.lang.Boolean maximumPermissionsChatterInternalUser,
           java.lang.Boolean maximumPermissionsChatterInviteExternalUsers,
           java.lang.Boolean maximumPermissionsChatterOwnGroups,
           java.lang.Boolean maximumPermissionsConfigCustomRecs,
           java.lang.Boolean maximumPermissionsConnectOrgToEnvironmentHub,
           java.lang.Boolean maximumPermissionsContentAdministrator,
           java.lang.Boolean maximumPermissionsConvertLeads,
           java.lang.Boolean maximumPermissionsCreateCustomizeDashboards,
           java.lang.Boolean maximumPermissionsCreateCustomizeFilters,
           java.lang.Boolean maximumPermissionsCreateCustomizeReports,
           java.lang.Boolean maximumPermissionsCreateDashboardFolders,
           java.lang.Boolean maximumPermissionsCreatePackaging,
           java.lang.Boolean maximumPermissionsCreateReportFolders,
           java.lang.Boolean maximumPermissionsCreateTopics,
           java.lang.Boolean maximumPermissionsCreateWorkspaces,
           java.lang.Boolean maximumPermissionsCustomMobileAppsAccess,
           java.lang.Boolean maximumPermissionsCustomSidebarOnAllPages,
           java.lang.Boolean maximumPermissionsCustomizeApplication,
           java.lang.Boolean maximumPermissionsDeleteActivatedContract,
           java.lang.Boolean maximumPermissionsDeleteTopics,
           java.lang.Boolean maximumPermissionsDistributeFromPersWksp,
           java.lang.Boolean maximumPermissionsEditActivatedOrders,
           java.lang.Boolean maximumPermissionsEditBrandTemplates,
           java.lang.Boolean maximumPermissionsEditCaseComments,
           java.lang.Boolean maximumPermissionsEditEvent,
           java.lang.Boolean maximumPermissionsEditHtmlTemplates,
           java.lang.Boolean maximumPermissionsEditKnowledge,
           java.lang.Boolean maximumPermissionsEditMyDashboards,
           java.lang.Boolean maximumPermissionsEditMyReports,
           java.lang.Boolean maximumPermissionsEditOppLineItemUnitPrice,
           java.lang.Boolean maximumPermissionsEditPublicDocuments,
           java.lang.Boolean maximumPermissionsEditPublicTemplates,
           java.lang.Boolean maximumPermissionsEditReadonlyFields,
           java.lang.Boolean maximumPermissionsEditTask,
           java.lang.Boolean maximumPermissionsEditTopics,
           java.lang.Boolean maximumPermissionsEmailAdministration,
           java.lang.Boolean maximumPermissionsEmailMass,
           java.lang.Boolean maximumPermissionsEmailSingle,
           java.lang.Boolean maximumPermissionsEmailTemplateManagement,
           java.lang.Boolean maximumPermissionsEnableNotifications,
           java.lang.Boolean maximumPermissionsExportReport,
           java.lang.Boolean maximumPermissionsFlowUFLRequired,
           java.lang.Boolean maximumPermissionsForceTwoFactor,
           java.lang.Boolean maximumPermissionsGovernNetworks,
           java.lang.Boolean maximumPermissionsIdentityConnect,
           java.lang.Boolean maximumPermissionsIdentityEnabled,
           java.lang.Boolean maximumPermissionsImportLeads,
           java.lang.Boolean maximumPermissionsImportPersonal,
           java.lang.Boolean maximumPermissionsInstallPackaging,
           java.lang.Boolean maximumPermissionsLightningExperienceUser,
           java.lang.Boolean maximumPermissionsManageAnalyticSnapshots,
           java.lang.Boolean maximumPermissionsManageAuthProviders,
           java.lang.Boolean maximumPermissionsManageBusinessHourHolidays,
           java.lang.Boolean maximumPermissionsManageCallCenters,
           java.lang.Boolean maximumPermissionsManageCases,
           java.lang.Boolean maximumPermissionsManageCategories,
           java.lang.Boolean maximumPermissionsManageChatterMessages,
           java.lang.Boolean maximumPermissionsManageContentPermissions,
           java.lang.Boolean maximumPermissionsManageContentProperties,
           java.lang.Boolean maximumPermissionsManageContentTypes,
           java.lang.Boolean maximumPermissionsManageCustomPermissions,
           java.lang.Boolean maximumPermissionsManageCustomReportTypes,
           java.lang.Boolean maximumPermissionsManageDashbdsInPubFolders,
           java.lang.Boolean maximumPermissionsManageDataCategories,
           java.lang.Boolean maximumPermissionsManageDataIntegrations,
           java.lang.Boolean maximumPermissionsManageDynamicDashboards,
           java.lang.Boolean maximumPermissionsManageEmailClientConfig,
           java.lang.Boolean maximumPermissionsManageEncryptionKeys,
           java.lang.Boolean maximumPermissionsManageExchangeConfig,
           java.lang.Boolean maximumPermissionsManageInteraction,
           java.lang.Boolean maximumPermissionsManageInternalUsers,
           java.lang.Boolean maximumPermissionsManageIpAddresses,
           java.lang.Boolean maximumPermissionsManageKnowledge,
           java.lang.Boolean maximumPermissionsManageKnowledgeImportExport,
           java.lang.Boolean maximumPermissionsManageLeads,
           java.lang.Boolean maximumPermissionsManageLoginAccessPolicies,
           java.lang.Boolean maximumPermissionsManageMobile,
           java.lang.Boolean maximumPermissionsManageNetworks,
           java.lang.Boolean maximumPermissionsManagePasswordPolicies,
           java.lang.Boolean maximumPermissionsManageProfilesPermissionsets,
           java.lang.Boolean maximumPermissionsManageRemoteAccess,
           java.lang.Boolean maximumPermissionsManageReportsInPubFolders,
           java.lang.Boolean maximumPermissionsManageRoles,
           java.lang.Boolean maximumPermissionsManageSearchPromotionRules,
           java.lang.Boolean maximumPermissionsManageSharing,
           java.lang.Boolean maximumPermissionsManageSolutions,
           java.lang.Boolean maximumPermissionsManageSynonyms,
           java.lang.Boolean maximumPermissionsManageTwoFactor,
           java.lang.Boolean maximumPermissionsManageUnlistedGroups,
           java.lang.Boolean maximumPermissionsManageUsers,
           java.lang.Boolean maximumPermissionsMassInlineEdit,
           java.lang.Boolean maximumPermissionsMergeTopics,
           java.lang.Boolean maximumPermissionsModerateChatter,
           java.lang.Boolean maximumPermissionsModifyAllData,
           java.lang.Boolean maximumPermissionsModifySecureAgents,
           java.lang.Boolean maximumPermissionsNewReportBuilder,
           java.lang.Boolean maximumPermissionsPasswordNeverExpires,
           java.lang.Boolean maximumPermissionsPublishPackaging,
           java.lang.Boolean maximumPermissionsResetPasswords,
           java.lang.Boolean maximumPermissionsRunFlow,
           java.lang.Boolean maximumPermissionsRunReports,
           java.lang.Boolean maximumPermissionsSalesConsole,
           java.lang.Boolean maximumPermissionsScheduleReports,
           java.lang.Boolean maximumPermissionsSelectFilesFromSalesforce,
           java.lang.Boolean maximumPermissionsSendSitRequests,
           java.lang.Boolean maximumPermissionsShareInternalArticles,
           java.lang.Boolean maximumPermissionsSolutionImport,
           java.lang.Boolean maximumPermissionsSubmitMacrosAllowed,
           java.lang.Boolean maximumPermissionsTransferAnyCase,
           java.lang.Boolean maximumPermissionsTransferAnyEntity,
           java.lang.Boolean maximumPermissionsTransferAnyLead,
           java.lang.Boolean maximumPermissionsTwoFactorApi,
           java.lang.Boolean maximumPermissionsUseTeamReassignWizards,
           java.lang.Boolean maximumPermissionsViewAllData,
           java.lang.Boolean maximumPermissionsViewAllUsers,
           java.lang.Boolean maximumPermissionsViewContent,
           java.lang.Boolean maximumPermissionsViewDataCategories,
           java.lang.Boolean maximumPermissionsViewEncryptedData,
           java.lang.Boolean maximumPermissionsViewEventLogFiles,
           java.lang.Boolean maximumPermissionsViewHelpLink,
           java.lang.Boolean maximumPermissionsViewMyTeamsDashboards,
           java.lang.Boolean maximumPermissionsViewPublicDashboards,
           java.lang.Boolean maximumPermissionsViewPublicReports,
           java.lang.Boolean maximumPermissionsViewSetup,
           java.lang.Boolean maximumPermissionsWorkCalibrationUser,
           java.lang.Boolean maximumPermissionsWorkDotComUserPerm,
           com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments,
           java.lang.String permissionSetLicenseKey,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           java.lang.Integer totalLicenses,
           java.lang.Integer usedLicenses) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.developerName = developerName;
        this.expirationDate = expirationDate;
        this.grantedByLicenses = grantedByLicenses;
        this.isDeleted = isDeleted;
        this.language = language;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.masterLabel = masterLabel;
        this.maximumPermissionsActivateContract = maximumPermissionsActivateContract;
        this.maximumPermissionsActivateOrder = maximumPermissionsActivateOrder;
        this.maximumPermissionsAllowEmailIC = maximumPermissionsAllowEmailIC;
        this.maximumPermissionsAllowUniversalSearch = maximumPermissionsAllowUniversalSearch;
        this.maximumPermissionsAllowViewKnowledge = maximumPermissionsAllowViewKnowledge;
        this.maximumPermissionsApiEnabled = maximumPermissionsApiEnabled;
        this.maximumPermissionsAssignPermissionSets = maximumPermissionsAssignPermissionSets;
        this.maximumPermissionsAssignTopics = maximumPermissionsAssignTopics;
        this.maximumPermissionsAuthorApex = maximumPermissionsAuthorApex;
        this.maximumPermissionsBulkApiHardDelete = maximumPermissionsBulkApiHardDelete;
        this.maximumPermissionsBulkMacrosAllowed = maximumPermissionsBulkMacrosAllowed;
        this.maximumPermissionsCanInsertFeedSystemFields = maximumPermissionsCanInsertFeedSystemFields;
        this.maximumPermissionsCanUseNewDashboardBuilder = maximumPermissionsCanUseNewDashboardBuilder;
        this.maximumPermissionsChatterEditOwnPost = maximumPermissionsChatterEditOwnPost;
        this.maximumPermissionsChatterEditOwnRecordPost = maximumPermissionsChatterEditOwnRecordPost;
        this.maximumPermissionsChatterFileLink = maximumPermissionsChatterFileLink;
        this.maximumPermissionsChatterForSharePoint = maximumPermissionsChatterForSharePoint;
        this.maximumPermissionsChatterInternalUser = maximumPermissionsChatterInternalUser;
        this.maximumPermissionsChatterInviteExternalUsers = maximumPermissionsChatterInviteExternalUsers;
        this.maximumPermissionsChatterOwnGroups = maximumPermissionsChatterOwnGroups;
        this.maximumPermissionsConfigCustomRecs = maximumPermissionsConfigCustomRecs;
        this.maximumPermissionsConnectOrgToEnvironmentHub = maximumPermissionsConnectOrgToEnvironmentHub;
        this.maximumPermissionsContentAdministrator = maximumPermissionsContentAdministrator;
        this.maximumPermissionsConvertLeads = maximumPermissionsConvertLeads;
        this.maximumPermissionsCreateCustomizeDashboards = maximumPermissionsCreateCustomizeDashboards;
        this.maximumPermissionsCreateCustomizeFilters = maximumPermissionsCreateCustomizeFilters;
        this.maximumPermissionsCreateCustomizeReports = maximumPermissionsCreateCustomizeReports;
        this.maximumPermissionsCreateDashboardFolders = maximumPermissionsCreateDashboardFolders;
        this.maximumPermissionsCreatePackaging = maximumPermissionsCreatePackaging;
        this.maximumPermissionsCreateReportFolders = maximumPermissionsCreateReportFolders;
        this.maximumPermissionsCreateTopics = maximumPermissionsCreateTopics;
        this.maximumPermissionsCreateWorkspaces = maximumPermissionsCreateWorkspaces;
        this.maximumPermissionsCustomMobileAppsAccess = maximumPermissionsCustomMobileAppsAccess;
        this.maximumPermissionsCustomSidebarOnAllPages = maximumPermissionsCustomSidebarOnAllPages;
        this.maximumPermissionsCustomizeApplication = maximumPermissionsCustomizeApplication;
        this.maximumPermissionsDeleteActivatedContract = maximumPermissionsDeleteActivatedContract;
        this.maximumPermissionsDeleteTopics = maximumPermissionsDeleteTopics;
        this.maximumPermissionsDistributeFromPersWksp = maximumPermissionsDistributeFromPersWksp;
        this.maximumPermissionsEditActivatedOrders = maximumPermissionsEditActivatedOrders;
        this.maximumPermissionsEditBrandTemplates = maximumPermissionsEditBrandTemplates;
        this.maximumPermissionsEditCaseComments = maximumPermissionsEditCaseComments;
        this.maximumPermissionsEditEvent = maximumPermissionsEditEvent;
        this.maximumPermissionsEditHtmlTemplates = maximumPermissionsEditHtmlTemplates;
        this.maximumPermissionsEditKnowledge = maximumPermissionsEditKnowledge;
        this.maximumPermissionsEditMyDashboards = maximumPermissionsEditMyDashboards;
        this.maximumPermissionsEditMyReports = maximumPermissionsEditMyReports;
        this.maximumPermissionsEditOppLineItemUnitPrice = maximumPermissionsEditOppLineItemUnitPrice;
        this.maximumPermissionsEditPublicDocuments = maximumPermissionsEditPublicDocuments;
        this.maximumPermissionsEditPublicTemplates = maximumPermissionsEditPublicTemplates;
        this.maximumPermissionsEditReadonlyFields = maximumPermissionsEditReadonlyFields;
        this.maximumPermissionsEditTask = maximumPermissionsEditTask;
        this.maximumPermissionsEditTopics = maximumPermissionsEditTopics;
        this.maximumPermissionsEmailAdministration = maximumPermissionsEmailAdministration;
        this.maximumPermissionsEmailMass = maximumPermissionsEmailMass;
        this.maximumPermissionsEmailSingle = maximumPermissionsEmailSingle;
        this.maximumPermissionsEmailTemplateManagement = maximumPermissionsEmailTemplateManagement;
        this.maximumPermissionsEnableNotifications = maximumPermissionsEnableNotifications;
        this.maximumPermissionsExportReport = maximumPermissionsExportReport;
        this.maximumPermissionsFlowUFLRequired = maximumPermissionsFlowUFLRequired;
        this.maximumPermissionsForceTwoFactor = maximumPermissionsForceTwoFactor;
        this.maximumPermissionsGovernNetworks = maximumPermissionsGovernNetworks;
        this.maximumPermissionsIdentityConnect = maximumPermissionsIdentityConnect;
        this.maximumPermissionsIdentityEnabled = maximumPermissionsIdentityEnabled;
        this.maximumPermissionsImportLeads = maximumPermissionsImportLeads;
        this.maximumPermissionsImportPersonal = maximumPermissionsImportPersonal;
        this.maximumPermissionsInstallPackaging = maximumPermissionsInstallPackaging;
        this.maximumPermissionsLightningExperienceUser = maximumPermissionsLightningExperienceUser;
        this.maximumPermissionsManageAnalyticSnapshots = maximumPermissionsManageAnalyticSnapshots;
        this.maximumPermissionsManageAuthProviders = maximumPermissionsManageAuthProviders;
        this.maximumPermissionsManageBusinessHourHolidays = maximumPermissionsManageBusinessHourHolidays;
        this.maximumPermissionsManageCallCenters = maximumPermissionsManageCallCenters;
        this.maximumPermissionsManageCases = maximumPermissionsManageCases;
        this.maximumPermissionsManageCategories = maximumPermissionsManageCategories;
        this.maximumPermissionsManageChatterMessages = maximumPermissionsManageChatterMessages;
        this.maximumPermissionsManageContentPermissions = maximumPermissionsManageContentPermissions;
        this.maximumPermissionsManageContentProperties = maximumPermissionsManageContentProperties;
        this.maximumPermissionsManageContentTypes = maximumPermissionsManageContentTypes;
        this.maximumPermissionsManageCustomPermissions = maximumPermissionsManageCustomPermissions;
        this.maximumPermissionsManageCustomReportTypes = maximumPermissionsManageCustomReportTypes;
        this.maximumPermissionsManageDashbdsInPubFolders = maximumPermissionsManageDashbdsInPubFolders;
        this.maximumPermissionsManageDataCategories = maximumPermissionsManageDataCategories;
        this.maximumPermissionsManageDataIntegrations = maximumPermissionsManageDataIntegrations;
        this.maximumPermissionsManageDynamicDashboards = maximumPermissionsManageDynamicDashboards;
        this.maximumPermissionsManageEmailClientConfig = maximumPermissionsManageEmailClientConfig;
        this.maximumPermissionsManageEncryptionKeys = maximumPermissionsManageEncryptionKeys;
        this.maximumPermissionsManageExchangeConfig = maximumPermissionsManageExchangeConfig;
        this.maximumPermissionsManageInteraction = maximumPermissionsManageInteraction;
        this.maximumPermissionsManageInternalUsers = maximumPermissionsManageInternalUsers;
        this.maximumPermissionsManageIpAddresses = maximumPermissionsManageIpAddresses;
        this.maximumPermissionsManageKnowledge = maximumPermissionsManageKnowledge;
        this.maximumPermissionsManageKnowledgeImportExport = maximumPermissionsManageKnowledgeImportExport;
        this.maximumPermissionsManageLeads = maximumPermissionsManageLeads;
        this.maximumPermissionsManageLoginAccessPolicies = maximumPermissionsManageLoginAccessPolicies;
        this.maximumPermissionsManageMobile = maximumPermissionsManageMobile;
        this.maximumPermissionsManageNetworks = maximumPermissionsManageNetworks;
        this.maximumPermissionsManagePasswordPolicies = maximumPermissionsManagePasswordPolicies;
        this.maximumPermissionsManageProfilesPermissionsets = maximumPermissionsManageProfilesPermissionsets;
        this.maximumPermissionsManageRemoteAccess = maximumPermissionsManageRemoteAccess;
        this.maximumPermissionsManageReportsInPubFolders = maximumPermissionsManageReportsInPubFolders;
        this.maximumPermissionsManageRoles = maximumPermissionsManageRoles;
        this.maximumPermissionsManageSearchPromotionRules = maximumPermissionsManageSearchPromotionRules;
        this.maximumPermissionsManageSharing = maximumPermissionsManageSharing;
        this.maximumPermissionsManageSolutions = maximumPermissionsManageSolutions;
        this.maximumPermissionsManageSynonyms = maximumPermissionsManageSynonyms;
        this.maximumPermissionsManageTwoFactor = maximumPermissionsManageTwoFactor;
        this.maximumPermissionsManageUnlistedGroups = maximumPermissionsManageUnlistedGroups;
        this.maximumPermissionsManageUsers = maximumPermissionsManageUsers;
        this.maximumPermissionsMassInlineEdit = maximumPermissionsMassInlineEdit;
        this.maximumPermissionsMergeTopics = maximumPermissionsMergeTopics;
        this.maximumPermissionsModerateChatter = maximumPermissionsModerateChatter;
        this.maximumPermissionsModifyAllData = maximumPermissionsModifyAllData;
        this.maximumPermissionsModifySecureAgents = maximumPermissionsModifySecureAgents;
        this.maximumPermissionsNewReportBuilder = maximumPermissionsNewReportBuilder;
        this.maximumPermissionsPasswordNeverExpires = maximumPermissionsPasswordNeverExpires;
        this.maximumPermissionsPublishPackaging = maximumPermissionsPublishPackaging;
        this.maximumPermissionsResetPasswords = maximumPermissionsResetPasswords;
        this.maximumPermissionsRunFlow = maximumPermissionsRunFlow;
        this.maximumPermissionsRunReports = maximumPermissionsRunReports;
        this.maximumPermissionsSalesConsole = maximumPermissionsSalesConsole;
        this.maximumPermissionsScheduleReports = maximumPermissionsScheduleReports;
        this.maximumPermissionsSelectFilesFromSalesforce = maximumPermissionsSelectFilesFromSalesforce;
        this.maximumPermissionsSendSitRequests = maximumPermissionsSendSitRequests;
        this.maximumPermissionsShareInternalArticles = maximumPermissionsShareInternalArticles;
        this.maximumPermissionsSolutionImport = maximumPermissionsSolutionImport;
        this.maximumPermissionsSubmitMacrosAllowed = maximumPermissionsSubmitMacrosAllowed;
        this.maximumPermissionsTransferAnyCase = maximumPermissionsTransferAnyCase;
        this.maximumPermissionsTransferAnyEntity = maximumPermissionsTransferAnyEntity;
        this.maximumPermissionsTransferAnyLead = maximumPermissionsTransferAnyLead;
        this.maximumPermissionsTwoFactorApi = maximumPermissionsTwoFactorApi;
        this.maximumPermissionsUseTeamReassignWizards = maximumPermissionsUseTeamReassignWizards;
        this.maximumPermissionsViewAllData = maximumPermissionsViewAllData;
        this.maximumPermissionsViewAllUsers = maximumPermissionsViewAllUsers;
        this.maximumPermissionsViewContent = maximumPermissionsViewContent;
        this.maximumPermissionsViewDataCategories = maximumPermissionsViewDataCategories;
        this.maximumPermissionsViewEncryptedData = maximumPermissionsViewEncryptedData;
        this.maximumPermissionsViewEventLogFiles = maximumPermissionsViewEventLogFiles;
        this.maximumPermissionsViewHelpLink = maximumPermissionsViewHelpLink;
        this.maximumPermissionsViewMyTeamsDashboards = maximumPermissionsViewMyTeamsDashboards;
        this.maximumPermissionsViewPublicDashboards = maximumPermissionsViewPublicDashboards;
        this.maximumPermissionsViewPublicReports = maximumPermissionsViewPublicReports;
        this.maximumPermissionsViewSetup = maximumPermissionsViewSetup;
        this.maximumPermissionsWorkCalibrationUser = maximumPermissionsWorkCalibrationUser;
        this.maximumPermissionsWorkDotComUserPerm = maximumPermissionsWorkDotComUserPerm;
        this.permissionSetLicenseAssignments = permissionSetLicenseAssignments;
        this.permissionSetLicenseKey = permissionSetLicenseKey;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.totalLicenses = totalLicenses;
        this.usedLicenses = usedLicenses;
    }


    /**
     * Gets the createdBy value for this PermissionSetLicense.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this PermissionSetLicense.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this PermissionSetLicense.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this PermissionSetLicense.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this PermissionSetLicense.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PermissionSetLicense.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the developerName value for this PermissionSetLicense.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this PermissionSetLicense.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the expirationDate value for this PermissionSetLicense.
     * 
     * @return expirationDate
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PermissionSetLicense.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the grantedByLicenses value for this PermissionSetLicense.
     * 
     * @return grantedByLicenses
     */
    public com.sforce.soap.enterprise.QueryResult getGrantedByLicenses() {
        return grantedByLicenses;
    }


    /**
     * Sets the grantedByLicenses value for this PermissionSetLicense.
     * 
     * @param grantedByLicenses
     */
    public void setGrantedByLicenses(com.sforce.soap.enterprise.QueryResult grantedByLicenses) {
        this.grantedByLicenses = grantedByLicenses;
    }


    /**
     * Gets the isDeleted value for this PermissionSetLicense.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this PermissionSetLicense.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the language value for this PermissionSetLicense.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PermissionSetLicense.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedBy value for this PermissionSetLicense.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this PermissionSetLicense.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this PermissionSetLicense.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this PermissionSetLicense.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this PermissionSetLicense.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PermissionSetLicense.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the masterLabel value for this PermissionSetLicense.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this PermissionSetLicense.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the maximumPermissionsActivateContract value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsActivateContract
     */
    public java.lang.Boolean getMaximumPermissionsActivateContract() {
        return maximumPermissionsActivateContract;
    }


    /**
     * Sets the maximumPermissionsActivateContract value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsActivateContract
     */
    public void setMaximumPermissionsActivateContract(java.lang.Boolean maximumPermissionsActivateContract) {
        this.maximumPermissionsActivateContract = maximumPermissionsActivateContract;
    }


    /**
     * Gets the maximumPermissionsActivateOrder value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsActivateOrder
     */
    public java.lang.Boolean getMaximumPermissionsActivateOrder() {
        return maximumPermissionsActivateOrder;
    }


    /**
     * Sets the maximumPermissionsActivateOrder value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsActivateOrder
     */
    public void setMaximumPermissionsActivateOrder(java.lang.Boolean maximumPermissionsActivateOrder) {
        this.maximumPermissionsActivateOrder = maximumPermissionsActivateOrder;
    }


    /**
     * Gets the maximumPermissionsAllowEmailIC value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAllowEmailIC
     */
    public java.lang.Boolean getMaximumPermissionsAllowEmailIC() {
        return maximumPermissionsAllowEmailIC;
    }


    /**
     * Sets the maximumPermissionsAllowEmailIC value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAllowEmailIC
     */
    public void setMaximumPermissionsAllowEmailIC(java.lang.Boolean maximumPermissionsAllowEmailIC) {
        this.maximumPermissionsAllowEmailIC = maximumPermissionsAllowEmailIC;
    }


    /**
     * Gets the maximumPermissionsAllowUniversalSearch value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAllowUniversalSearch
     */
    public java.lang.Boolean getMaximumPermissionsAllowUniversalSearch() {
        return maximumPermissionsAllowUniversalSearch;
    }


    /**
     * Sets the maximumPermissionsAllowUniversalSearch value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAllowUniversalSearch
     */
    public void setMaximumPermissionsAllowUniversalSearch(java.lang.Boolean maximumPermissionsAllowUniversalSearch) {
        this.maximumPermissionsAllowUniversalSearch = maximumPermissionsAllowUniversalSearch;
    }


    /**
     * Gets the maximumPermissionsAllowViewKnowledge value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAllowViewKnowledge
     */
    public java.lang.Boolean getMaximumPermissionsAllowViewKnowledge() {
        return maximumPermissionsAllowViewKnowledge;
    }


    /**
     * Sets the maximumPermissionsAllowViewKnowledge value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAllowViewKnowledge
     */
    public void setMaximumPermissionsAllowViewKnowledge(java.lang.Boolean maximumPermissionsAllowViewKnowledge) {
        this.maximumPermissionsAllowViewKnowledge = maximumPermissionsAllowViewKnowledge;
    }


    /**
     * Gets the maximumPermissionsApiEnabled value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsApiEnabled
     */
    public java.lang.Boolean getMaximumPermissionsApiEnabled() {
        return maximumPermissionsApiEnabled;
    }


    /**
     * Sets the maximumPermissionsApiEnabled value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsApiEnabled
     */
    public void setMaximumPermissionsApiEnabled(java.lang.Boolean maximumPermissionsApiEnabled) {
        this.maximumPermissionsApiEnabled = maximumPermissionsApiEnabled;
    }


    /**
     * Gets the maximumPermissionsAssignPermissionSets value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAssignPermissionSets
     */
    public java.lang.Boolean getMaximumPermissionsAssignPermissionSets() {
        return maximumPermissionsAssignPermissionSets;
    }


    /**
     * Sets the maximumPermissionsAssignPermissionSets value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAssignPermissionSets
     */
    public void setMaximumPermissionsAssignPermissionSets(java.lang.Boolean maximumPermissionsAssignPermissionSets) {
        this.maximumPermissionsAssignPermissionSets = maximumPermissionsAssignPermissionSets;
    }


    /**
     * Gets the maximumPermissionsAssignTopics value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAssignTopics
     */
    public java.lang.Boolean getMaximumPermissionsAssignTopics() {
        return maximumPermissionsAssignTopics;
    }


    /**
     * Sets the maximumPermissionsAssignTopics value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAssignTopics
     */
    public void setMaximumPermissionsAssignTopics(java.lang.Boolean maximumPermissionsAssignTopics) {
        this.maximumPermissionsAssignTopics = maximumPermissionsAssignTopics;
    }


    /**
     * Gets the maximumPermissionsAuthorApex value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsAuthorApex
     */
    public java.lang.Boolean getMaximumPermissionsAuthorApex() {
        return maximumPermissionsAuthorApex;
    }


    /**
     * Sets the maximumPermissionsAuthorApex value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsAuthorApex
     */
    public void setMaximumPermissionsAuthorApex(java.lang.Boolean maximumPermissionsAuthorApex) {
        this.maximumPermissionsAuthorApex = maximumPermissionsAuthorApex;
    }


    /**
     * Gets the maximumPermissionsBulkApiHardDelete value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsBulkApiHardDelete
     */
    public java.lang.Boolean getMaximumPermissionsBulkApiHardDelete() {
        return maximumPermissionsBulkApiHardDelete;
    }


    /**
     * Sets the maximumPermissionsBulkApiHardDelete value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsBulkApiHardDelete
     */
    public void setMaximumPermissionsBulkApiHardDelete(java.lang.Boolean maximumPermissionsBulkApiHardDelete) {
        this.maximumPermissionsBulkApiHardDelete = maximumPermissionsBulkApiHardDelete;
    }


    /**
     * Gets the maximumPermissionsBulkMacrosAllowed value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsBulkMacrosAllowed
     */
    public java.lang.Boolean getMaximumPermissionsBulkMacrosAllowed() {
        return maximumPermissionsBulkMacrosAllowed;
    }


    /**
     * Sets the maximumPermissionsBulkMacrosAllowed value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsBulkMacrosAllowed
     */
    public void setMaximumPermissionsBulkMacrosAllowed(java.lang.Boolean maximumPermissionsBulkMacrosAllowed) {
        this.maximumPermissionsBulkMacrosAllowed = maximumPermissionsBulkMacrosAllowed;
    }


    /**
     * Gets the maximumPermissionsCanInsertFeedSystemFields value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCanInsertFeedSystemFields
     */
    public java.lang.Boolean getMaximumPermissionsCanInsertFeedSystemFields() {
        return maximumPermissionsCanInsertFeedSystemFields;
    }


    /**
     * Sets the maximumPermissionsCanInsertFeedSystemFields value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCanInsertFeedSystemFields
     */
    public void setMaximumPermissionsCanInsertFeedSystemFields(java.lang.Boolean maximumPermissionsCanInsertFeedSystemFields) {
        this.maximumPermissionsCanInsertFeedSystemFields = maximumPermissionsCanInsertFeedSystemFields;
    }


    /**
     * Gets the maximumPermissionsCanUseNewDashboardBuilder value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCanUseNewDashboardBuilder
     */
    public java.lang.Boolean getMaximumPermissionsCanUseNewDashboardBuilder() {
        return maximumPermissionsCanUseNewDashboardBuilder;
    }


    /**
     * Sets the maximumPermissionsCanUseNewDashboardBuilder value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCanUseNewDashboardBuilder
     */
    public void setMaximumPermissionsCanUseNewDashboardBuilder(java.lang.Boolean maximumPermissionsCanUseNewDashboardBuilder) {
        this.maximumPermissionsCanUseNewDashboardBuilder = maximumPermissionsCanUseNewDashboardBuilder;
    }


    /**
     * Gets the maximumPermissionsChatterEditOwnPost value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterEditOwnPost
     */
    public java.lang.Boolean getMaximumPermissionsChatterEditOwnPost() {
        return maximumPermissionsChatterEditOwnPost;
    }


    /**
     * Sets the maximumPermissionsChatterEditOwnPost value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterEditOwnPost
     */
    public void setMaximumPermissionsChatterEditOwnPost(java.lang.Boolean maximumPermissionsChatterEditOwnPost) {
        this.maximumPermissionsChatterEditOwnPost = maximumPermissionsChatterEditOwnPost;
    }


    /**
     * Gets the maximumPermissionsChatterEditOwnRecordPost value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterEditOwnRecordPost
     */
    public java.lang.Boolean getMaximumPermissionsChatterEditOwnRecordPost() {
        return maximumPermissionsChatterEditOwnRecordPost;
    }


    /**
     * Sets the maximumPermissionsChatterEditOwnRecordPost value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterEditOwnRecordPost
     */
    public void setMaximumPermissionsChatterEditOwnRecordPost(java.lang.Boolean maximumPermissionsChatterEditOwnRecordPost) {
        this.maximumPermissionsChatterEditOwnRecordPost = maximumPermissionsChatterEditOwnRecordPost;
    }


    /**
     * Gets the maximumPermissionsChatterFileLink value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterFileLink
     */
    public java.lang.Boolean getMaximumPermissionsChatterFileLink() {
        return maximumPermissionsChatterFileLink;
    }


    /**
     * Sets the maximumPermissionsChatterFileLink value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterFileLink
     */
    public void setMaximumPermissionsChatterFileLink(java.lang.Boolean maximumPermissionsChatterFileLink) {
        this.maximumPermissionsChatterFileLink = maximumPermissionsChatterFileLink;
    }


    /**
     * Gets the maximumPermissionsChatterForSharePoint value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterForSharePoint
     */
    public java.lang.Boolean getMaximumPermissionsChatterForSharePoint() {
        return maximumPermissionsChatterForSharePoint;
    }


    /**
     * Sets the maximumPermissionsChatterForSharePoint value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterForSharePoint
     */
    public void setMaximumPermissionsChatterForSharePoint(java.lang.Boolean maximumPermissionsChatterForSharePoint) {
        this.maximumPermissionsChatterForSharePoint = maximumPermissionsChatterForSharePoint;
    }


    /**
     * Gets the maximumPermissionsChatterInternalUser value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterInternalUser
     */
    public java.lang.Boolean getMaximumPermissionsChatterInternalUser() {
        return maximumPermissionsChatterInternalUser;
    }


    /**
     * Sets the maximumPermissionsChatterInternalUser value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterInternalUser
     */
    public void setMaximumPermissionsChatterInternalUser(java.lang.Boolean maximumPermissionsChatterInternalUser) {
        this.maximumPermissionsChatterInternalUser = maximumPermissionsChatterInternalUser;
    }


    /**
     * Gets the maximumPermissionsChatterInviteExternalUsers value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterInviteExternalUsers
     */
    public java.lang.Boolean getMaximumPermissionsChatterInviteExternalUsers() {
        return maximumPermissionsChatterInviteExternalUsers;
    }


    /**
     * Sets the maximumPermissionsChatterInviteExternalUsers value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterInviteExternalUsers
     */
    public void setMaximumPermissionsChatterInviteExternalUsers(java.lang.Boolean maximumPermissionsChatterInviteExternalUsers) {
        this.maximumPermissionsChatterInviteExternalUsers = maximumPermissionsChatterInviteExternalUsers;
    }


    /**
     * Gets the maximumPermissionsChatterOwnGroups value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsChatterOwnGroups
     */
    public java.lang.Boolean getMaximumPermissionsChatterOwnGroups() {
        return maximumPermissionsChatterOwnGroups;
    }


    /**
     * Sets the maximumPermissionsChatterOwnGroups value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsChatterOwnGroups
     */
    public void setMaximumPermissionsChatterOwnGroups(java.lang.Boolean maximumPermissionsChatterOwnGroups) {
        this.maximumPermissionsChatterOwnGroups = maximumPermissionsChatterOwnGroups;
    }


    /**
     * Gets the maximumPermissionsConfigCustomRecs value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsConfigCustomRecs
     */
    public java.lang.Boolean getMaximumPermissionsConfigCustomRecs() {
        return maximumPermissionsConfigCustomRecs;
    }


    /**
     * Sets the maximumPermissionsConfigCustomRecs value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsConfigCustomRecs
     */
    public void setMaximumPermissionsConfigCustomRecs(java.lang.Boolean maximumPermissionsConfigCustomRecs) {
        this.maximumPermissionsConfigCustomRecs = maximumPermissionsConfigCustomRecs;
    }


    /**
     * Gets the maximumPermissionsConnectOrgToEnvironmentHub value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsConnectOrgToEnvironmentHub
     */
    public java.lang.Boolean getMaximumPermissionsConnectOrgToEnvironmentHub() {
        return maximumPermissionsConnectOrgToEnvironmentHub;
    }


    /**
     * Sets the maximumPermissionsConnectOrgToEnvironmentHub value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsConnectOrgToEnvironmentHub
     */
    public void setMaximumPermissionsConnectOrgToEnvironmentHub(java.lang.Boolean maximumPermissionsConnectOrgToEnvironmentHub) {
        this.maximumPermissionsConnectOrgToEnvironmentHub = maximumPermissionsConnectOrgToEnvironmentHub;
    }


    /**
     * Gets the maximumPermissionsContentAdministrator value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsContentAdministrator
     */
    public java.lang.Boolean getMaximumPermissionsContentAdministrator() {
        return maximumPermissionsContentAdministrator;
    }


    /**
     * Sets the maximumPermissionsContentAdministrator value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsContentAdministrator
     */
    public void setMaximumPermissionsContentAdministrator(java.lang.Boolean maximumPermissionsContentAdministrator) {
        this.maximumPermissionsContentAdministrator = maximumPermissionsContentAdministrator;
    }


    /**
     * Gets the maximumPermissionsConvertLeads value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsConvertLeads
     */
    public java.lang.Boolean getMaximumPermissionsConvertLeads() {
        return maximumPermissionsConvertLeads;
    }


    /**
     * Sets the maximumPermissionsConvertLeads value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsConvertLeads
     */
    public void setMaximumPermissionsConvertLeads(java.lang.Boolean maximumPermissionsConvertLeads) {
        this.maximumPermissionsConvertLeads = maximumPermissionsConvertLeads;
    }


    /**
     * Gets the maximumPermissionsCreateCustomizeDashboards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateCustomizeDashboards
     */
    public java.lang.Boolean getMaximumPermissionsCreateCustomizeDashboards() {
        return maximumPermissionsCreateCustomizeDashboards;
    }


    /**
     * Sets the maximumPermissionsCreateCustomizeDashboards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateCustomizeDashboards
     */
    public void setMaximumPermissionsCreateCustomizeDashboards(java.lang.Boolean maximumPermissionsCreateCustomizeDashboards) {
        this.maximumPermissionsCreateCustomizeDashboards = maximumPermissionsCreateCustomizeDashboards;
    }


    /**
     * Gets the maximumPermissionsCreateCustomizeFilters value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateCustomizeFilters
     */
    public java.lang.Boolean getMaximumPermissionsCreateCustomizeFilters() {
        return maximumPermissionsCreateCustomizeFilters;
    }


    /**
     * Sets the maximumPermissionsCreateCustomizeFilters value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateCustomizeFilters
     */
    public void setMaximumPermissionsCreateCustomizeFilters(java.lang.Boolean maximumPermissionsCreateCustomizeFilters) {
        this.maximumPermissionsCreateCustomizeFilters = maximumPermissionsCreateCustomizeFilters;
    }


    /**
     * Gets the maximumPermissionsCreateCustomizeReports value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateCustomizeReports
     */
    public java.lang.Boolean getMaximumPermissionsCreateCustomizeReports() {
        return maximumPermissionsCreateCustomizeReports;
    }


    /**
     * Sets the maximumPermissionsCreateCustomizeReports value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateCustomizeReports
     */
    public void setMaximumPermissionsCreateCustomizeReports(java.lang.Boolean maximumPermissionsCreateCustomizeReports) {
        this.maximumPermissionsCreateCustomizeReports = maximumPermissionsCreateCustomizeReports;
    }


    /**
     * Gets the maximumPermissionsCreateDashboardFolders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateDashboardFolders
     */
    public java.lang.Boolean getMaximumPermissionsCreateDashboardFolders() {
        return maximumPermissionsCreateDashboardFolders;
    }


    /**
     * Sets the maximumPermissionsCreateDashboardFolders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateDashboardFolders
     */
    public void setMaximumPermissionsCreateDashboardFolders(java.lang.Boolean maximumPermissionsCreateDashboardFolders) {
        this.maximumPermissionsCreateDashboardFolders = maximumPermissionsCreateDashboardFolders;
    }


    /**
     * Gets the maximumPermissionsCreatePackaging value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreatePackaging
     */
    public java.lang.Boolean getMaximumPermissionsCreatePackaging() {
        return maximumPermissionsCreatePackaging;
    }


    /**
     * Sets the maximumPermissionsCreatePackaging value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreatePackaging
     */
    public void setMaximumPermissionsCreatePackaging(java.lang.Boolean maximumPermissionsCreatePackaging) {
        this.maximumPermissionsCreatePackaging = maximumPermissionsCreatePackaging;
    }


    /**
     * Gets the maximumPermissionsCreateReportFolders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateReportFolders
     */
    public java.lang.Boolean getMaximumPermissionsCreateReportFolders() {
        return maximumPermissionsCreateReportFolders;
    }


    /**
     * Sets the maximumPermissionsCreateReportFolders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateReportFolders
     */
    public void setMaximumPermissionsCreateReportFolders(java.lang.Boolean maximumPermissionsCreateReportFolders) {
        this.maximumPermissionsCreateReportFolders = maximumPermissionsCreateReportFolders;
    }


    /**
     * Gets the maximumPermissionsCreateTopics value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateTopics
     */
    public java.lang.Boolean getMaximumPermissionsCreateTopics() {
        return maximumPermissionsCreateTopics;
    }


    /**
     * Sets the maximumPermissionsCreateTopics value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateTopics
     */
    public void setMaximumPermissionsCreateTopics(java.lang.Boolean maximumPermissionsCreateTopics) {
        this.maximumPermissionsCreateTopics = maximumPermissionsCreateTopics;
    }


    /**
     * Gets the maximumPermissionsCreateWorkspaces value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCreateWorkspaces
     */
    public java.lang.Boolean getMaximumPermissionsCreateWorkspaces() {
        return maximumPermissionsCreateWorkspaces;
    }


    /**
     * Sets the maximumPermissionsCreateWorkspaces value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCreateWorkspaces
     */
    public void setMaximumPermissionsCreateWorkspaces(java.lang.Boolean maximumPermissionsCreateWorkspaces) {
        this.maximumPermissionsCreateWorkspaces = maximumPermissionsCreateWorkspaces;
    }


    /**
     * Gets the maximumPermissionsCustomMobileAppsAccess value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCustomMobileAppsAccess
     */
    public java.lang.Boolean getMaximumPermissionsCustomMobileAppsAccess() {
        return maximumPermissionsCustomMobileAppsAccess;
    }


    /**
     * Sets the maximumPermissionsCustomMobileAppsAccess value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCustomMobileAppsAccess
     */
    public void setMaximumPermissionsCustomMobileAppsAccess(java.lang.Boolean maximumPermissionsCustomMobileAppsAccess) {
        this.maximumPermissionsCustomMobileAppsAccess = maximumPermissionsCustomMobileAppsAccess;
    }


    /**
     * Gets the maximumPermissionsCustomSidebarOnAllPages value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCustomSidebarOnAllPages
     */
    public java.lang.Boolean getMaximumPermissionsCustomSidebarOnAllPages() {
        return maximumPermissionsCustomSidebarOnAllPages;
    }


    /**
     * Sets the maximumPermissionsCustomSidebarOnAllPages value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCustomSidebarOnAllPages
     */
    public void setMaximumPermissionsCustomSidebarOnAllPages(java.lang.Boolean maximumPermissionsCustomSidebarOnAllPages) {
        this.maximumPermissionsCustomSidebarOnAllPages = maximumPermissionsCustomSidebarOnAllPages;
    }


    /**
     * Gets the maximumPermissionsCustomizeApplication value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsCustomizeApplication
     */
    public java.lang.Boolean getMaximumPermissionsCustomizeApplication() {
        return maximumPermissionsCustomizeApplication;
    }


    /**
     * Sets the maximumPermissionsCustomizeApplication value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsCustomizeApplication
     */
    public void setMaximumPermissionsCustomizeApplication(java.lang.Boolean maximumPermissionsCustomizeApplication) {
        this.maximumPermissionsCustomizeApplication = maximumPermissionsCustomizeApplication;
    }


    /**
     * Gets the maximumPermissionsDeleteActivatedContract value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsDeleteActivatedContract
     */
    public java.lang.Boolean getMaximumPermissionsDeleteActivatedContract() {
        return maximumPermissionsDeleteActivatedContract;
    }


    /**
     * Sets the maximumPermissionsDeleteActivatedContract value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsDeleteActivatedContract
     */
    public void setMaximumPermissionsDeleteActivatedContract(java.lang.Boolean maximumPermissionsDeleteActivatedContract) {
        this.maximumPermissionsDeleteActivatedContract = maximumPermissionsDeleteActivatedContract;
    }


    /**
     * Gets the maximumPermissionsDeleteTopics value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsDeleteTopics
     */
    public java.lang.Boolean getMaximumPermissionsDeleteTopics() {
        return maximumPermissionsDeleteTopics;
    }


    /**
     * Sets the maximumPermissionsDeleteTopics value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsDeleteTopics
     */
    public void setMaximumPermissionsDeleteTopics(java.lang.Boolean maximumPermissionsDeleteTopics) {
        this.maximumPermissionsDeleteTopics = maximumPermissionsDeleteTopics;
    }


    /**
     * Gets the maximumPermissionsDistributeFromPersWksp value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsDistributeFromPersWksp
     */
    public java.lang.Boolean getMaximumPermissionsDistributeFromPersWksp() {
        return maximumPermissionsDistributeFromPersWksp;
    }


    /**
     * Sets the maximumPermissionsDistributeFromPersWksp value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsDistributeFromPersWksp
     */
    public void setMaximumPermissionsDistributeFromPersWksp(java.lang.Boolean maximumPermissionsDistributeFromPersWksp) {
        this.maximumPermissionsDistributeFromPersWksp = maximumPermissionsDistributeFromPersWksp;
    }


    /**
     * Gets the maximumPermissionsEditActivatedOrders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditActivatedOrders
     */
    public java.lang.Boolean getMaximumPermissionsEditActivatedOrders() {
        return maximumPermissionsEditActivatedOrders;
    }


    /**
     * Sets the maximumPermissionsEditActivatedOrders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditActivatedOrders
     */
    public void setMaximumPermissionsEditActivatedOrders(java.lang.Boolean maximumPermissionsEditActivatedOrders) {
        this.maximumPermissionsEditActivatedOrders = maximumPermissionsEditActivatedOrders;
    }


    /**
     * Gets the maximumPermissionsEditBrandTemplates value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditBrandTemplates
     */
    public java.lang.Boolean getMaximumPermissionsEditBrandTemplates() {
        return maximumPermissionsEditBrandTemplates;
    }


    /**
     * Sets the maximumPermissionsEditBrandTemplates value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditBrandTemplates
     */
    public void setMaximumPermissionsEditBrandTemplates(java.lang.Boolean maximumPermissionsEditBrandTemplates) {
        this.maximumPermissionsEditBrandTemplates = maximumPermissionsEditBrandTemplates;
    }


    /**
     * Gets the maximumPermissionsEditCaseComments value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditCaseComments
     */
    public java.lang.Boolean getMaximumPermissionsEditCaseComments() {
        return maximumPermissionsEditCaseComments;
    }


    /**
     * Sets the maximumPermissionsEditCaseComments value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditCaseComments
     */
    public void setMaximumPermissionsEditCaseComments(java.lang.Boolean maximumPermissionsEditCaseComments) {
        this.maximumPermissionsEditCaseComments = maximumPermissionsEditCaseComments;
    }


    /**
     * Gets the maximumPermissionsEditEvent value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditEvent
     */
    public java.lang.Boolean getMaximumPermissionsEditEvent() {
        return maximumPermissionsEditEvent;
    }


    /**
     * Sets the maximumPermissionsEditEvent value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditEvent
     */
    public void setMaximumPermissionsEditEvent(java.lang.Boolean maximumPermissionsEditEvent) {
        this.maximumPermissionsEditEvent = maximumPermissionsEditEvent;
    }


    /**
     * Gets the maximumPermissionsEditHtmlTemplates value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditHtmlTemplates
     */
    public java.lang.Boolean getMaximumPermissionsEditHtmlTemplates() {
        return maximumPermissionsEditHtmlTemplates;
    }


    /**
     * Sets the maximumPermissionsEditHtmlTemplates value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditHtmlTemplates
     */
    public void setMaximumPermissionsEditHtmlTemplates(java.lang.Boolean maximumPermissionsEditHtmlTemplates) {
        this.maximumPermissionsEditHtmlTemplates = maximumPermissionsEditHtmlTemplates;
    }


    /**
     * Gets the maximumPermissionsEditKnowledge value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditKnowledge
     */
    public java.lang.Boolean getMaximumPermissionsEditKnowledge() {
        return maximumPermissionsEditKnowledge;
    }


    /**
     * Sets the maximumPermissionsEditKnowledge value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditKnowledge
     */
    public void setMaximumPermissionsEditKnowledge(java.lang.Boolean maximumPermissionsEditKnowledge) {
        this.maximumPermissionsEditKnowledge = maximumPermissionsEditKnowledge;
    }


    /**
     * Gets the maximumPermissionsEditMyDashboards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditMyDashboards
     */
    public java.lang.Boolean getMaximumPermissionsEditMyDashboards() {
        return maximumPermissionsEditMyDashboards;
    }


    /**
     * Sets the maximumPermissionsEditMyDashboards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditMyDashboards
     */
    public void setMaximumPermissionsEditMyDashboards(java.lang.Boolean maximumPermissionsEditMyDashboards) {
        this.maximumPermissionsEditMyDashboards = maximumPermissionsEditMyDashboards;
    }


    /**
     * Gets the maximumPermissionsEditMyReports value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditMyReports
     */
    public java.lang.Boolean getMaximumPermissionsEditMyReports() {
        return maximumPermissionsEditMyReports;
    }


    /**
     * Sets the maximumPermissionsEditMyReports value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditMyReports
     */
    public void setMaximumPermissionsEditMyReports(java.lang.Boolean maximumPermissionsEditMyReports) {
        this.maximumPermissionsEditMyReports = maximumPermissionsEditMyReports;
    }


    /**
     * Gets the maximumPermissionsEditOppLineItemUnitPrice value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditOppLineItemUnitPrice
     */
    public java.lang.Boolean getMaximumPermissionsEditOppLineItemUnitPrice() {
        return maximumPermissionsEditOppLineItemUnitPrice;
    }


    /**
     * Sets the maximumPermissionsEditOppLineItemUnitPrice value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditOppLineItemUnitPrice
     */
    public void setMaximumPermissionsEditOppLineItemUnitPrice(java.lang.Boolean maximumPermissionsEditOppLineItemUnitPrice) {
        this.maximumPermissionsEditOppLineItemUnitPrice = maximumPermissionsEditOppLineItemUnitPrice;
    }


    /**
     * Gets the maximumPermissionsEditPublicDocuments value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditPublicDocuments
     */
    public java.lang.Boolean getMaximumPermissionsEditPublicDocuments() {
        return maximumPermissionsEditPublicDocuments;
    }


    /**
     * Sets the maximumPermissionsEditPublicDocuments value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditPublicDocuments
     */
    public void setMaximumPermissionsEditPublicDocuments(java.lang.Boolean maximumPermissionsEditPublicDocuments) {
        this.maximumPermissionsEditPublicDocuments = maximumPermissionsEditPublicDocuments;
    }


    /**
     * Gets the maximumPermissionsEditPublicTemplates value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditPublicTemplates
     */
    public java.lang.Boolean getMaximumPermissionsEditPublicTemplates() {
        return maximumPermissionsEditPublicTemplates;
    }


    /**
     * Sets the maximumPermissionsEditPublicTemplates value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditPublicTemplates
     */
    public void setMaximumPermissionsEditPublicTemplates(java.lang.Boolean maximumPermissionsEditPublicTemplates) {
        this.maximumPermissionsEditPublicTemplates = maximumPermissionsEditPublicTemplates;
    }


    /**
     * Gets the maximumPermissionsEditReadonlyFields value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditReadonlyFields
     */
    public java.lang.Boolean getMaximumPermissionsEditReadonlyFields() {
        return maximumPermissionsEditReadonlyFields;
    }


    /**
     * Sets the maximumPermissionsEditReadonlyFields value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditReadonlyFields
     */
    public void setMaximumPermissionsEditReadonlyFields(java.lang.Boolean maximumPermissionsEditReadonlyFields) {
        this.maximumPermissionsEditReadonlyFields = maximumPermissionsEditReadonlyFields;
    }


    /**
     * Gets the maximumPermissionsEditTask value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditTask
     */
    public java.lang.Boolean getMaximumPermissionsEditTask() {
        return maximumPermissionsEditTask;
    }


    /**
     * Sets the maximumPermissionsEditTask value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditTask
     */
    public void setMaximumPermissionsEditTask(java.lang.Boolean maximumPermissionsEditTask) {
        this.maximumPermissionsEditTask = maximumPermissionsEditTask;
    }


    /**
     * Gets the maximumPermissionsEditTopics value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEditTopics
     */
    public java.lang.Boolean getMaximumPermissionsEditTopics() {
        return maximumPermissionsEditTopics;
    }


    /**
     * Sets the maximumPermissionsEditTopics value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEditTopics
     */
    public void setMaximumPermissionsEditTopics(java.lang.Boolean maximumPermissionsEditTopics) {
        this.maximumPermissionsEditTopics = maximumPermissionsEditTopics;
    }


    /**
     * Gets the maximumPermissionsEmailAdministration value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEmailAdministration
     */
    public java.lang.Boolean getMaximumPermissionsEmailAdministration() {
        return maximumPermissionsEmailAdministration;
    }


    /**
     * Sets the maximumPermissionsEmailAdministration value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEmailAdministration
     */
    public void setMaximumPermissionsEmailAdministration(java.lang.Boolean maximumPermissionsEmailAdministration) {
        this.maximumPermissionsEmailAdministration = maximumPermissionsEmailAdministration;
    }


    /**
     * Gets the maximumPermissionsEmailMass value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEmailMass
     */
    public java.lang.Boolean getMaximumPermissionsEmailMass() {
        return maximumPermissionsEmailMass;
    }


    /**
     * Sets the maximumPermissionsEmailMass value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEmailMass
     */
    public void setMaximumPermissionsEmailMass(java.lang.Boolean maximumPermissionsEmailMass) {
        this.maximumPermissionsEmailMass = maximumPermissionsEmailMass;
    }


    /**
     * Gets the maximumPermissionsEmailSingle value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEmailSingle
     */
    public java.lang.Boolean getMaximumPermissionsEmailSingle() {
        return maximumPermissionsEmailSingle;
    }


    /**
     * Sets the maximumPermissionsEmailSingle value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEmailSingle
     */
    public void setMaximumPermissionsEmailSingle(java.lang.Boolean maximumPermissionsEmailSingle) {
        this.maximumPermissionsEmailSingle = maximumPermissionsEmailSingle;
    }


    /**
     * Gets the maximumPermissionsEmailTemplateManagement value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEmailTemplateManagement
     */
    public java.lang.Boolean getMaximumPermissionsEmailTemplateManagement() {
        return maximumPermissionsEmailTemplateManagement;
    }


    /**
     * Sets the maximumPermissionsEmailTemplateManagement value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEmailTemplateManagement
     */
    public void setMaximumPermissionsEmailTemplateManagement(java.lang.Boolean maximumPermissionsEmailTemplateManagement) {
        this.maximumPermissionsEmailTemplateManagement = maximumPermissionsEmailTemplateManagement;
    }


    /**
     * Gets the maximumPermissionsEnableNotifications value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsEnableNotifications
     */
    public java.lang.Boolean getMaximumPermissionsEnableNotifications() {
        return maximumPermissionsEnableNotifications;
    }


    /**
     * Sets the maximumPermissionsEnableNotifications value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsEnableNotifications
     */
    public void setMaximumPermissionsEnableNotifications(java.lang.Boolean maximumPermissionsEnableNotifications) {
        this.maximumPermissionsEnableNotifications = maximumPermissionsEnableNotifications;
    }


    /**
     * Gets the maximumPermissionsExportReport value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsExportReport
     */
    public java.lang.Boolean getMaximumPermissionsExportReport() {
        return maximumPermissionsExportReport;
    }


    /**
     * Sets the maximumPermissionsExportReport value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsExportReport
     */
    public void setMaximumPermissionsExportReport(java.lang.Boolean maximumPermissionsExportReport) {
        this.maximumPermissionsExportReport = maximumPermissionsExportReport;
    }


    /**
     * Gets the maximumPermissionsFlowUFLRequired value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsFlowUFLRequired
     */
    public java.lang.Boolean getMaximumPermissionsFlowUFLRequired() {
        return maximumPermissionsFlowUFLRequired;
    }


    /**
     * Sets the maximumPermissionsFlowUFLRequired value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsFlowUFLRequired
     */
    public void setMaximumPermissionsFlowUFLRequired(java.lang.Boolean maximumPermissionsFlowUFLRequired) {
        this.maximumPermissionsFlowUFLRequired = maximumPermissionsFlowUFLRequired;
    }


    /**
     * Gets the maximumPermissionsForceTwoFactor value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsForceTwoFactor
     */
    public java.lang.Boolean getMaximumPermissionsForceTwoFactor() {
        return maximumPermissionsForceTwoFactor;
    }


    /**
     * Sets the maximumPermissionsForceTwoFactor value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsForceTwoFactor
     */
    public void setMaximumPermissionsForceTwoFactor(java.lang.Boolean maximumPermissionsForceTwoFactor) {
        this.maximumPermissionsForceTwoFactor = maximumPermissionsForceTwoFactor;
    }


    /**
     * Gets the maximumPermissionsGovernNetworks value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsGovernNetworks
     */
    public java.lang.Boolean getMaximumPermissionsGovernNetworks() {
        return maximumPermissionsGovernNetworks;
    }


    /**
     * Sets the maximumPermissionsGovernNetworks value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsGovernNetworks
     */
    public void setMaximumPermissionsGovernNetworks(java.lang.Boolean maximumPermissionsGovernNetworks) {
        this.maximumPermissionsGovernNetworks = maximumPermissionsGovernNetworks;
    }


    /**
     * Gets the maximumPermissionsIdentityConnect value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsIdentityConnect
     */
    public java.lang.Boolean getMaximumPermissionsIdentityConnect() {
        return maximumPermissionsIdentityConnect;
    }


    /**
     * Sets the maximumPermissionsIdentityConnect value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsIdentityConnect
     */
    public void setMaximumPermissionsIdentityConnect(java.lang.Boolean maximumPermissionsIdentityConnect) {
        this.maximumPermissionsIdentityConnect = maximumPermissionsIdentityConnect;
    }


    /**
     * Gets the maximumPermissionsIdentityEnabled value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsIdentityEnabled
     */
    public java.lang.Boolean getMaximumPermissionsIdentityEnabled() {
        return maximumPermissionsIdentityEnabled;
    }


    /**
     * Sets the maximumPermissionsIdentityEnabled value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsIdentityEnabled
     */
    public void setMaximumPermissionsIdentityEnabled(java.lang.Boolean maximumPermissionsIdentityEnabled) {
        this.maximumPermissionsIdentityEnabled = maximumPermissionsIdentityEnabled;
    }


    /**
     * Gets the maximumPermissionsImportLeads value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsImportLeads
     */
    public java.lang.Boolean getMaximumPermissionsImportLeads() {
        return maximumPermissionsImportLeads;
    }


    /**
     * Sets the maximumPermissionsImportLeads value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsImportLeads
     */
    public void setMaximumPermissionsImportLeads(java.lang.Boolean maximumPermissionsImportLeads) {
        this.maximumPermissionsImportLeads = maximumPermissionsImportLeads;
    }


    /**
     * Gets the maximumPermissionsImportPersonal value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsImportPersonal
     */
    public java.lang.Boolean getMaximumPermissionsImportPersonal() {
        return maximumPermissionsImportPersonal;
    }


    /**
     * Sets the maximumPermissionsImportPersonal value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsImportPersonal
     */
    public void setMaximumPermissionsImportPersonal(java.lang.Boolean maximumPermissionsImportPersonal) {
        this.maximumPermissionsImportPersonal = maximumPermissionsImportPersonal;
    }


    /**
     * Gets the maximumPermissionsInstallPackaging value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsInstallPackaging
     */
    public java.lang.Boolean getMaximumPermissionsInstallPackaging() {
        return maximumPermissionsInstallPackaging;
    }


    /**
     * Sets the maximumPermissionsInstallPackaging value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsInstallPackaging
     */
    public void setMaximumPermissionsInstallPackaging(java.lang.Boolean maximumPermissionsInstallPackaging) {
        this.maximumPermissionsInstallPackaging = maximumPermissionsInstallPackaging;
    }


    /**
     * Gets the maximumPermissionsLightningExperienceUser value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsLightningExperienceUser
     */
    public java.lang.Boolean getMaximumPermissionsLightningExperienceUser() {
        return maximumPermissionsLightningExperienceUser;
    }


    /**
     * Sets the maximumPermissionsLightningExperienceUser value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsLightningExperienceUser
     */
    public void setMaximumPermissionsLightningExperienceUser(java.lang.Boolean maximumPermissionsLightningExperienceUser) {
        this.maximumPermissionsLightningExperienceUser = maximumPermissionsLightningExperienceUser;
    }


    /**
     * Gets the maximumPermissionsManageAnalyticSnapshots value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageAnalyticSnapshots
     */
    public java.lang.Boolean getMaximumPermissionsManageAnalyticSnapshots() {
        return maximumPermissionsManageAnalyticSnapshots;
    }


    /**
     * Sets the maximumPermissionsManageAnalyticSnapshots value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageAnalyticSnapshots
     */
    public void setMaximumPermissionsManageAnalyticSnapshots(java.lang.Boolean maximumPermissionsManageAnalyticSnapshots) {
        this.maximumPermissionsManageAnalyticSnapshots = maximumPermissionsManageAnalyticSnapshots;
    }


    /**
     * Gets the maximumPermissionsManageAuthProviders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageAuthProviders
     */
    public java.lang.Boolean getMaximumPermissionsManageAuthProviders() {
        return maximumPermissionsManageAuthProviders;
    }


    /**
     * Sets the maximumPermissionsManageAuthProviders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageAuthProviders
     */
    public void setMaximumPermissionsManageAuthProviders(java.lang.Boolean maximumPermissionsManageAuthProviders) {
        this.maximumPermissionsManageAuthProviders = maximumPermissionsManageAuthProviders;
    }


    /**
     * Gets the maximumPermissionsManageBusinessHourHolidays value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageBusinessHourHolidays
     */
    public java.lang.Boolean getMaximumPermissionsManageBusinessHourHolidays() {
        return maximumPermissionsManageBusinessHourHolidays;
    }


    /**
     * Sets the maximumPermissionsManageBusinessHourHolidays value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageBusinessHourHolidays
     */
    public void setMaximumPermissionsManageBusinessHourHolidays(java.lang.Boolean maximumPermissionsManageBusinessHourHolidays) {
        this.maximumPermissionsManageBusinessHourHolidays = maximumPermissionsManageBusinessHourHolidays;
    }


    /**
     * Gets the maximumPermissionsManageCallCenters value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageCallCenters
     */
    public java.lang.Boolean getMaximumPermissionsManageCallCenters() {
        return maximumPermissionsManageCallCenters;
    }


    /**
     * Sets the maximumPermissionsManageCallCenters value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageCallCenters
     */
    public void setMaximumPermissionsManageCallCenters(java.lang.Boolean maximumPermissionsManageCallCenters) {
        this.maximumPermissionsManageCallCenters = maximumPermissionsManageCallCenters;
    }


    /**
     * Gets the maximumPermissionsManageCases value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageCases
     */
    public java.lang.Boolean getMaximumPermissionsManageCases() {
        return maximumPermissionsManageCases;
    }


    /**
     * Sets the maximumPermissionsManageCases value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageCases
     */
    public void setMaximumPermissionsManageCases(java.lang.Boolean maximumPermissionsManageCases) {
        this.maximumPermissionsManageCases = maximumPermissionsManageCases;
    }


    /**
     * Gets the maximumPermissionsManageCategories value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageCategories
     */
    public java.lang.Boolean getMaximumPermissionsManageCategories() {
        return maximumPermissionsManageCategories;
    }


    /**
     * Sets the maximumPermissionsManageCategories value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageCategories
     */
    public void setMaximumPermissionsManageCategories(java.lang.Boolean maximumPermissionsManageCategories) {
        this.maximumPermissionsManageCategories = maximumPermissionsManageCategories;
    }


    /**
     * Gets the maximumPermissionsManageChatterMessages value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageChatterMessages
     */
    public java.lang.Boolean getMaximumPermissionsManageChatterMessages() {
        return maximumPermissionsManageChatterMessages;
    }


    /**
     * Sets the maximumPermissionsManageChatterMessages value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageChatterMessages
     */
    public void setMaximumPermissionsManageChatterMessages(java.lang.Boolean maximumPermissionsManageChatterMessages) {
        this.maximumPermissionsManageChatterMessages = maximumPermissionsManageChatterMessages;
    }


    /**
     * Gets the maximumPermissionsManageContentPermissions value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageContentPermissions
     */
    public java.lang.Boolean getMaximumPermissionsManageContentPermissions() {
        return maximumPermissionsManageContentPermissions;
    }


    /**
     * Sets the maximumPermissionsManageContentPermissions value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageContentPermissions
     */
    public void setMaximumPermissionsManageContentPermissions(java.lang.Boolean maximumPermissionsManageContentPermissions) {
        this.maximumPermissionsManageContentPermissions = maximumPermissionsManageContentPermissions;
    }


    /**
     * Gets the maximumPermissionsManageContentProperties value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageContentProperties
     */
    public java.lang.Boolean getMaximumPermissionsManageContentProperties() {
        return maximumPermissionsManageContentProperties;
    }


    /**
     * Sets the maximumPermissionsManageContentProperties value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageContentProperties
     */
    public void setMaximumPermissionsManageContentProperties(java.lang.Boolean maximumPermissionsManageContentProperties) {
        this.maximumPermissionsManageContentProperties = maximumPermissionsManageContentProperties;
    }


    /**
     * Gets the maximumPermissionsManageContentTypes value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageContentTypes
     */
    public java.lang.Boolean getMaximumPermissionsManageContentTypes() {
        return maximumPermissionsManageContentTypes;
    }


    /**
     * Sets the maximumPermissionsManageContentTypes value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageContentTypes
     */
    public void setMaximumPermissionsManageContentTypes(java.lang.Boolean maximumPermissionsManageContentTypes) {
        this.maximumPermissionsManageContentTypes = maximumPermissionsManageContentTypes;
    }


    /**
     * Gets the maximumPermissionsManageCustomPermissions value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageCustomPermissions
     */
    public java.lang.Boolean getMaximumPermissionsManageCustomPermissions() {
        return maximumPermissionsManageCustomPermissions;
    }


    /**
     * Sets the maximumPermissionsManageCustomPermissions value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageCustomPermissions
     */
    public void setMaximumPermissionsManageCustomPermissions(java.lang.Boolean maximumPermissionsManageCustomPermissions) {
        this.maximumPermissionsManageCustomPermissions = maximumPermissionsManageCustomPermissions;
    }


    /**
     * Gets the maximumPermissionsManageCustomReportTypes value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageCustomReportTypes
     */
    public java.lang.Boolean getMaximumPermissionsManageCustomReportTypes() {
        return maximumPermissionsManageCustomReportTypes;
    }


    /**
     * Sets the maximumPermissionsManageCustomReportTypes value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageCustomReportTypes
     */
    public void setMaximumPermissionsManageCustomReportTypes(java.lang.Boolean maximumPermissionsManageCustomReportTypes) {
        this.maximumPermissionsManageCustomReportTypes = maximumPermissionsManageCustomReportTypes;
    }


    /**
     * Gets the maximumPermissionsManageDashbdsInPubFolders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageDashbdsInPubFolders
     */
    public java.lang.Boolean getMaximumPermissionsManageDashbdsInPubFolders() {
        return maximumPermissionsManageDashbdsInPubFolders;
    }


    /**
     * Sets the maximumPermissionsManageDashbdsInPubFolders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageDashbdsInPubFolders
     */
    public void setMaximumPermissionsManageDashbdsInPubFolders(java.lang.Boolean maximumPermissionsManageDashbdsInPubFolders) {
        this.maximumPermissionsManageDashbdsInPubFolders = maximumPermissionsManageDashbdsInPubFolders;
    }


    /**
     * Gets the maximumPermissionsManageDataCategories value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageDataCategories
     */
    public java.lang.Boolean getMaximumPermissionsManageDataCategories() {
        return maximumPermissionsManageDataCategories;
    }


    /**
     * Sets the maximumPermissionsManageDataCategories value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageDataCategories
     */
    public void setMaximumPermissionsManageDataCategories(java.lang.Boolean maximumPermissionsManageDataCategories) {
        this.maximumPermissionsManageDataCategories = maximumPermissionsManageDataCategories;
    }


    /**
     * Gets the maximumPermissionsManageDataIntegrations value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageDataIntegrations
     */
    public java.lang.Boolean getMaximumPermissionsManageDataIntegrations() {
        return maximumPermissionsManageDataIntegrations;
    }


    /**
     * Sets the maximumPermissionsManageDataIntegrations value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageDataIntegrations
     */
    public void setMaximumPermissionsManageDataIntegrations(java.lang.Boolean maximumPermissionsManageDataIntegrations) {
        this.maximumPermissionsManageDataIntegrations = maximumPermissionsManageDataIntegrations;
    }


    /**
     * Gets the maximumPermissionsManageDynamicDashboards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageDynamicDashboards
     */
    public java.lang.Boolean getMaximumPermissionsManageDynamicDashboards() {
        return maximumPermissionsManageDynamicDashboards;
    }


    /**
     * Sets the maximumPermissionsManageDynamicDashboards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageDynamicDashboards
     */
    public void setMaximumPermissionsManageDynamicDashboards(java.lang.Boolean maximumPermissionsManageDynamicDashboards) {
        this.maximumPermissionsManageDynamicDashboards = maximumPermissionsManageDynamicDashboards;
    }


    /**
     * Gets the maximumPermissionsManageEmailClientConfig value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageEmailClientConfig
     */
    public java.lang.Boolean getMaximumPermissionsManageEmailClientConfig() {
        return maximumPermissionsManageEmailClientConfig;
    }


    /**
     * Sets the maximumPermissionsManageEmailClientConfig value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageEmailClientConfig
     */
    public void setMaximumPermissionsManageEmailClientConfig(java.lang.Boolean maximumPermissionsManageEmailClientConfig) {
        this.maximumPermissionsManageEmailClientConfig = maximumPermissionsManageEmailClientConfig;
    }


    /**
     * Gets the maximumPermissionsManageEncryptionKeys value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageEncryptionKeys
     */
    public java.lang.Boolean getMaximumPermissionsManageEncryptionKeys() {
        return maximumPermissionsManageEncryptionKeys;
    }


    /**
     * Sets the maximumPermissionsManageEncryptionKeys value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageEncryptionKeys
     */
    public void setMaximumPermissionsManageEncryptionKeys(java.lang.Boolean maximumPermissionsManageEncryptionKeys) {
        this.maximumPermissionsManageEncryptionKeys = maximumPermissionsManageEncryptionKeys;
    }


    /**
     * Gets the maximumPermissionsManageExchangeConfig value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageExchangeConfig
     */
    public java.lang.Boolean getMaximumPermissionsManageExchangeConfig() {
        return maximumPermissionsManageExchangeConfig;
    }


    /**
     * Sets the maximumPermissionsManageExchangeConfig value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageExchangeConfig
     */
    public void setMaximumPermissionsManageExchangeConfig(java.lang.Boolean maximumPermissionsManageExchangeConfig) {
        this.maximumPermissionsManageExchangeConfig = maximumPermissionsManageExchangeConfig;
    }


    /**
     * Gets the maximumPermissionsManageInteraction value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageInteraction
     */
    public java.lang.Boolean getMaximumPermissionsManageInteraction() {
        return maximumPermissionsManageInteraction;
    }


    /**
     * Sets the maximumPermissionsManageInteraction value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageInteraction
     */
    public void setMaximumPermissionsManageInteraction(java.lang.Boolean maximumPermissionsManageInteraction) {
        this.maximumPermissionsManageInteraction = maximumPermissionsManageInteraction;
    }


    /**
     * Gets the maximumPermissionsManageInternalUsers value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageInternalUsers
     */
    public java.lang.Boolean getMaximumPermissionsManageInternalUsers() {
        return maximumPermissionsManageInternalUsers;
    }


    /**
     * Sets the maximumPermissionsManageInternalUsers value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageInternalUsers
     */
    public void setMaximumPermissionsManageInternalUsers(java.lang.Boolean maximumPermissionsManageInternalUsers) {
        this.maximumPermissionsManageInternalUsers = maximumPermissionsManageInternalUsers;
    }


    /**
     * Gets the maximumPermissionsManageIpAddresses value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageIpAddresses
     */
    public java.lang.Boolean getMaximumPermissionsManageIpAddresses() {
        return maximumPermissionsManageIpAddresses;
    }


    /**
     * Sets the maximumPermissionsManageIpAddresses value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageIpAddresses
     */
    public void setMaximumPermissionsManageIpAddresses(java.lang.Boolean maximumPermissionsManageIpAddresses) {
        this.maximumPermissionsManageIpAddresses = maximumPermissionsManageIpAddresses;
    }


    /**
     * Gets the maximumPermissionsManageKnowledge value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageKnowledge
     */
    public java.lang.Boolean getMaximumPermissionsManageKnowledge() {
        return maximumPermissionsManageKnowledge;
    }


    /**
     * Sets the maximumPermissionsManageKnowledge value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageKnowledge
     */
    public void setMaximumPermissionsManageKnowledge(java.lang.Boolean maximumPermissionsManageKnowledge) {
        this.maximumPermissionsManageKnowledge = maximumPermissionsManageKnowledge;
    }


    /**
     * Gets the maximumPermissionsManageKnowledgeImportExport value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageKnowledgeImportExport
     */
    public java.lang.Boolean getMaximumPermissionsManageKnowledgeImportExport() {
        return maximumPermissionsManageKnowledgeImportExport;
    }


    /**
     * Sets the maximumPermissionsManageKnowledgeImportExport value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageKnowledgeImportExport
     */
    public void setMaximumPermissionsManageKnowledgeImportExport(java.lang.Boolean maximumPermissionsManageKnowledgeImportExport) {
        this.maximumPermissionsManageKnowledgeImportExport = maximumPermissionsManageKnowledgeImportExport;
    }


    /**
     * Gets the maximumPermissionsManageLeads value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageLeads
     */
    public java.lang.Boolean getMaximumPermissionsManageLeads() {
        return maximumPermissionsManageLeads;
    }


    /**
     * Sets the maximumPermissionsManageLeads value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageLeads
     */
    public void setMaximumPermissionsManageLeads(java.lang.Boolean maximumPermissionsManageLeads) {
        this.maximumPermissionsManageLeads = maximumPermissionsManageLeads;
    }


    /**
     * Gets the maximumPermissionsManageLoginAccessPolicies value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageLoginAccessPolicies
     */
    public java.lang.Boolean getMaximumPermissionsManageLoginAccessPolicies() {
        return maximumPermissionsManageLoginAccessPolicies;
    }


    /**
     * Sets the maximumPermissionsManageLoginAccessPolicies value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageLoginAccessPolicies
     */
    public void setMaximumPermissionsManageLoginAccessPolicies(java.lang.Boolean maximumPermissionsManageLoginAccessPolicies) {
        this.maximumPermissionsManageLoginAccessPolicies = maximumPermissionsManageLoginAccessPolicies;
    }


    /**
     * Gets the maximumPermissionsManageMobile value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageMobile
     */
    public java.lang.Boolean getMaximumPermissionsManageMobile() {
        return maximumPermissionsManageMobile;
    }


    /**
     * Sets the maximumPermissionsManageMobile value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageMobile
     */
    public void setMaximumPermissionsManageMobile(java.lang.Boolean maximumPermissionsManageMobile) {
        this.maximumPermissionsManageMobile = maximumPermissionsManageMobile;
    }


    /**
     * Gets the maximumPermissionsManageNetworks value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageNetworks
     */
    public java.lang.Boolean getMaximumPermissionsManageNetworks() {
        return maximumPermissionsManageNetworks;
    }


    /**
     * Sets the maximumPermissionsManageNetworks value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageNetworks
     */
    public void setMaximumPermissionsManageNetworks(java.lang.Boolean maximumPermissionsManageNetworks) {
        this.maximumPermissionsManageNetworks = maximumPermissionsManageNetworks;
    }


    /**
     * Gets the maximumPermissionsManagePasswordPolicies value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManagePasswordPolicies
     */
    public java.lang.Boolean getMaximumPermissionsManagePasswordPolicies() {
        return maximumPermissionsManagePasswordPolicies;
    }


    /**
     * Sets the maximumPermissionsManagePasswordPolicies value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManagePasswordPolicies
     */
    public void setMaximumPermissionsManagePasswordPolicies(java.lang.Boolean maximumPermissionsManagePasswordPolicies) {
        this.maximumPermissionsManagePasswordPolicies = maximumPermissionsManagePasswordPolicies;
    }


    /**
     * Gets the maximumPermissionsManageProfilesPermissionsets value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageProfilesPermissionsets
     */
    public java.lang.Boolean getMaximumPermissionsManageProfilesPermissionsets() {
        return maximumPermissionsManageProfilesPermissionsets;
    }


    /**
     * Sets the maximumPermissionsManageProfilesPermissionsets value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageProfilesPermissionsets
     */
    public void setMaximumPermissionsManageProfilesPermissionsets(java.lang.Boolean maximumPermissionsManageProfilesPermissionsets) {
        this.maximumPermissionsManageProfilesPermissionsets = maximumPermissionsManageProfilesPermissionsets;
    }


    /**
     * Gets the maximumPermissionsManageRemoteAccess value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageRemoteAccess
     */
    public java.lang.Boolean getMaximumPermissionsManageRemoteAccess() {
        return maximumPermissionsManageRemoteAccess;
    }


    /**
     * Sets the maximumPermissionsManageRemoteAccess value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageRemoteAccess
     */
    public void setMaximumPermissionsManageRemoteAccess(java.lang.Boolean maximumPermissionsManageRemoteAccess) {
        this.maximumPermissionsManageRemoteAccess = maximumPermissionsManageRemoteAccess;
    }


    /**
     * Gets the maximumPermissionsManageReportsInPubFolders value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageReportsInPubFolders
     */
    public java.lang.Boolean getMaximumPermissionsManageReportsInPubFolders() {
        return maximumPermissionsManageReportsInPubFolders;
    }


    /**
     * Sets the maximumPermissionsManageReportsInPubFolders value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageReportsInPubFolders
     */
    public void setMaximumPermissionsManageReportsInPubFolders(java.lang.Boolean maximumPermissionsManageReportsInPubFolders) {
        this.maximumPermissionsManageReportsInPubFolders = maximumPermissionsManageReportsInPubFolders;
    }


    /**
     * Gets the maximumPermissionsManageRoles value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageRoles
     */
    public java.lang.Boolean getMaximumPermissionsManageRoles() {
        return maximumPermissionsManageRoles;
    }


    /**
     * Sets the maximumPermissionsManageRoles value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageRoles
     */
    public void setMaximumPermissionsManageRoles(java.lang.Boolean maximumPermissionsManageRoles) {
        this.maximumPermissionsManageRoles = maximumPermissionsManageRoles;
    }


    /**
     * Gets the maximumPermissionsManageSearchPromotionRules value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageSearchPromotionRules
     */
    public java.lang.Boolean getMaximumPermissionsManageSearchPromotionRules() {
        return maximumPermissionsManageSearchPromotionRules;
    }


    /**
     * Sets the maximumPermissionsManageSearchPromotionRules value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageSearchPromotionRules
     */
    public void setMaximumPermissionsManageSearchPromotionRules(java.lang.Boolean maximumPermissionsManageSearchPromotionRules) {
        this.maximumPermissionsManageSearchPromotionRules = maximumPermissionsManageSearchPromotionRules;
    }


    /**
     * Gets the maximumPermissionsManageSharing value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageSharing
     */
    public java.lang.Boolean getMaximumPermissionsManageSharing() {
        return maximumPermissionsManageSharing;
    }


    /**
     * Sets the maximumPermissionsManageSharing value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageSharing
     */
    public void setMaximumPermissionsManageSharing(java.lang.Boolean maximumPermissionsManageSharing) {
        this.maximumPermissionsManageSharing = maximumPermissionsManageSharing;
    }


    /**
     * Gets the maximumPermissionsManageSolutions value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageSolutions
     */
    public java.lang.Boolean getMaximumPermissionsManageSolutions() {
        return maximumPermissionsManageSolutions;
    }


    /**
     * Sets the maximumPermissionsManageSolutions value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageSolutions
     */
    public void setMaximumPermissionsManageSolutions(java.lang.Boolean maximumPermissionsManageSolutions) {
        this.maximumPermissionsManageSolutions = maximumPermissionsManageSolutions;
    }


    /**
     * Gets the maximumPermissionsManageSynonyms value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageSynonyms
     */
    public java.lang.Boolean getMaximumPermissionsManageSynonyms() {
        return maximumPermissionsManageSynonyms;
    }


    /**
     * Sets the maximumPermissionsManageSynonyms value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageSynonyms
     */
    public void setMaximumPermissionsManageSynonyms(java.lang.Boolean maximumPermissionsManageSynonyms) {
        this.maximumPermissionsManageSynonyms = maximumPermissionsManageSynonyms;
    }


    /**
     * Gets the maximumPermissionsManageTwoFactor value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageTwoFactor
     */
    public java.lang.Boolean getMaximumPermissionsManageTwoFactor() {
        return maximumPermissionsManageTwoFactor;
    }


    /**
     * Sets the maximumPermissionsManageTwoFactor value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageTwoFactor
     */
    public void setMaximumPermissionsManageTwoFactor(java.lang.Boolean maximumPermissionsManageTwoFactor) {
        this.maximumPermissionsManageTwoFactor = maximumPermissionsManageTwoFactor;
    }


    /**
     * Gets the maximumPermissionsManageUnlistedGroups value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageUnlistedGroups
     */
    public java.lang.Boolean getMaximumPermissionsManageUnlistedGroups() {
        return maximumPermissionsManageUnlistedGroups;
    }


    /**
     * Sets the maximumPermissionsManageUnlistedGroups value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageUnlistedGroups
     */
    public void setMaximumPermissionsManageUnlistedGroups(java.lang.Boolean maximumPermissionsManageUnlistedGroups) {
        this.maximumPermissionsManageUnlistedGroups = maximumPermissionsManageUnlistedGroups;
    }


    /**
     * Gets the maximumPermissionsManageUsers value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsManageUsers
     */
    public java.lang.Boolean getMaximumPermissionsManageUsers() {
        return maximumPermissionsManageUsers;
    }


    /**
     * Sets the maximumPermissionsManageUsers value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsManageUsers
     */
    public void setMaximumPermissionsManageUsers(java.lang.Boolean maximumPermissionsManageUsers) {
        this.maximumPermissionsManageUsers = maximumPermissionsManageUsers;
    }


    /**
     * Gets the maximumPermissionsMassInlineEdit value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsMassInlineEdit
     */
    public java.lang.Boolean getMaximumPermissionsMassInlineEdit() {
        return maximumPermissionsMassInlineEdit;
    }


    /**
     * Sets the maximumPermissionsMassInlineEdit value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsMassInlineEdit
     */
    public void setMaximumPermissionsMassInlineEdit(java.lang.Boolean maximumPermissionsMassInlineEdit) {
        this.maximumPermissionsMassInlineEdit = maximumPermissionsMassInlineEdit;
    }


    /**
     * Gets the maximumPermissionsMergeTopics value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsMergeTopics
     */
    public java.lang.Boolean getMaximumPermissionsMergeTopics() {
        return maximumPermissionsMergeTopics;
    }


    /**
     * Sets the maximumPermissionsMergeTopics value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsMergeTopics
     */
    public void setMaximumPermissionsMergeTopics(java.lang.Boolean maximumPermissionsMergeTopics) {
        this.maximumPermissionsMergeTopics = maximumPermissionsMergeTopics;
    }


    /**
     * Gets the maximumPermissionsModerateChatter value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsModerateChatter
     */
    public java.lang.Boolean getMaximumPermissionsModerateChatter() {
        return maximumPermissionsModerateChatter;
    }


    /**
     * Sets the maximumPermissionsModerateChatter value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsModerateChatter
     */
    public void setMaximumPermissionsModerateChatter(java.lang.Boolean maximumPermissionsModerateChatter) {
        this.maximumPermissionsModerateChatter = maximumPermissionsModerateChatter;
    }


    /**
     * Gets the maximumPermissionsModifyAllData value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsModifyAllData
     */
    public java.lang.Boolean getMaximumPermissionsModifyAllData() {
        return maximumPermissionsModifyAllData;
    }


    /**
     * Sets the maximumPermissionsModifyAllData value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsModifyAllData
     */
    public void setMaximumPermissionsModifyAllData(java.lang.Boolean maximumPermissionsModifyAllData) {
        this.maximumPermissionsModifyAllData = maximumPermissionsModifyAllData;
    }


    /**
     * Gets the maximumPermissionsModifySecureAgents value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsModifySecureAgents
     */
    public java.lang.Boolean getMaximumPermissionsModifySecureAgents() {
        return maximumPermissionsModifySecureAgents;
    }


    /**
     * Sets the maximumPermissionsModifySecureAgents value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsModifySecureAgents
     */
    public void setMaximumPermissionsModifySecureAgents(java.lang.Boolean maximumPermissionsModifySecureAgents) {
        this.maximumPermissionsModifySecureAgents = maximumPermissionsModifySecureAgents;
    }


    /**
     * Gets the maximumPermissionsNewReportBuilder value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsNewReportBuilder
     */
    public java.lang.Boolean getMaximumPermissionsNewReportBuilder() {
        return maximumPermissionsNewReportBuilder;
    }


    /**
     * Sets the maximumPermissionsNewReportBuilder value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsNewReportBuilder
     */
    public void setMaximumPermissionsNewReportBuilder(java.lang.Boolean maximumPermissionsNewReportBuilder) {
        this.maximumPermissionsNewReportBuilder = maximumPermissionsNewReportBuilder;
    }


    /**
     * Gets the maximumPermissionsPasswordNeverExpires value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsPasswordNeverExpires
     */
    public java.lang.Boolean getMaximumPermissionsPasswordNeverExpires() {
        return maximumPermissionsPasswordNeverExpires;
    }


    /**
     * Sets the maximumPermissionsPasswordNeverExpires value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsPasswordNeverExpires
     */
    public void setMaximumPermissionsPasswordNeverExpires(java.lang.Boolean maximumPermissionsPasswordNeverExpires) {
        this.maximumPermissionsPasswordNeverExpires = maximumPermissionsPasswordNeverExpires;
    }


    /**
     * Gets the maximumPermissionsPublishPackaging value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsPublishPackaging
     */
    public java.lang.Boolean getMaximumPermissionsPublishPackaging() {
        return maximumPermissionsPublishPackaging;
    }


    /**
     * Sets the maximumPermissionsPublishPackaging value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsPublishPackaging
     */
    public void setMaximumPermissionsPublishPackaging(java.lang.Boolean maximumPermissionsPublishPackaging) {
        this.maximumPermissionsPublishPackaging = maximumPermissionsPublishPackaging;
    }


    /**
     * Gets the maximumPermissionsResetPasswords value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsResetPasswords
     */
    public java.lang.Boolean getMaximumPermissionsResetPasswords() {
        return maximumPermissionsResetPasswords;
    }


    /**
     * Sets the maximumPermissionsResetPasswords value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsResetPasswords
     */
    public void setMaximumPermissionsResetPasswords(java.lang.Boolean maximumPermissionsResetPasswords) {
        this.maximumPermissionsResetPasswords = maximumPermissionsResetPasswords;
    }


    /**
     * Gets the maximumPermissionsRunFlow value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsRunFlow
     */
    public java.lang.Boolean getMaximumPermissionsRunFlow() {
        return maximumPermissionsRunFlow;
    }


    /**
     * Sets the maximumPermissionsRunFlow value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsRunFlow
     */
    public void setMaximumPermissionsRunFlow(java.lang.Boolean maximumPermissionsRunFlow) {
        this.maximumPermissionsRunFlow = maximumPermissionsRunFlow;
    }


    /**
     * Gets the maximumPermissionsRunReports value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsRunReports
     */
    public java.lang.Boolean getMaximumPermissionsRunReports() {
        return maximumPermissionsRunReports;
    }


    /**
     * Sets the maximumPermissionsRunReports value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsRunReports
     */
    public void setMaximumPermissionsRunReports(java.lang.Boolean maximumPermissionsRunReports) {
        this.maximumPermissionsRunReports = maximumPermissionsRunReports;
    }


    /**
     * Gets the maximumPermissionsSalesConsole value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsSalesConsole
     */
    public java.lang.Boolean getMaximumPermissionsSalesConsole() {
        return maximumPermissionsSalesConsole;
    }


    /**
     * Sets the maximumPermissionsSalesConsole value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsSalesConsole
     */
    public void setMaximumPermissionsSalesConsole(java.lang.Boolean maximumPermissionsSalesConsole) {
        this.maximumPermissionsSalesConsole = maximumPermissionsSalesConsole;
    }


    /**
     * Gets the maximumPermissionsScheduleReports value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsScheduleReports
     */
    public java.lang.Boolean getMaximumPermissionsScheduleReports() {
        return maximumPermissionsScheduleReports;
    }


    /**
     * Sets the maximumPermissionsScheduleReports value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsScheduleReports
     */
    public void setMaximumPermissionsScheduleReports(java.lang.Boolean maximumPermissionsScheduleReports) {
        this.maximumPermissionsScheduleReports = maximumPermissionsScheduleReports;
    }


    /**
     * Gets the maximumPermissionsSelectFilesFromSalesforce value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsSelectFilesFromSalesforce
     */
    public java.lang.Boolean getMaximumPermissionsSelectFilesFromSalesforce() {
        return maximumPermissionsSelectFilesFromSalesforce;
    }


    /**
     * Sets the maximumPermissionsSelectFilesFromSalesforce value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsSelectFilesFromSalesforce
     */
    public void setMaximumPermissionsSelectFilesFromSalesforce(java.lang.Boolean maximumPermissionsSelectFilesFromSalesforce) {
        this.maximumPermissionsSelectFilesFromSalesforce = maximumPermissionsSelectFilesFromSalesforce;
    }


    /**
     * Gets the maximumPermissionsSendSitRequests value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsSendSitRequests
     */
    public java.lang.Boolean getMaximumPermissionsSendSitRequests() {
        return maximumPermissionsSendSitRequests;
    }


    /**
     * Sets the maximumPermissionsSendSitRequests value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsSendSitRequests
     */
    public void setMaximumPermissionsSendSitRequests(java.lang.Boolean maximumPermissionsSendSitRequests) {
        this.maximumPermissionsSendSitRequests = maximumPermissionsSendSitRequests;
    }


    /**
     * Gets the maximumPermissionsShareInternalArticles value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsShareInternalArticles
     */
    public java.lang.Boolean getMaximumPermissionsShareInternalArticles() {
        return maximumPermissionsShareInternalArticles;
    }


    /**
     * Sets the maximumPermissionsShareInternalArticles value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsShareInternalArticles
     */
    public void setMaximumPermissionsShareInternalArticles(java.lang.Boolean maximumPermissionsShareInternalArticles) {
        this.maximumPermissionsShareInternalArticles = maximumPermissionsShareInternalArticles;
    }


    /**
     * Gets the maximumPermissionsSolutionImport value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsSolutionImport
     */
    public java.lang.Boolean getMaximumPermissionsSolutionImport() {
        return maximumPermissionsSolutionImport;
    }


    /**
     * Sets the maximumPermissionsSolutionImport value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsSolutionImport
     */
    public void setMaximumPermissionsSolutionImport(java.lang.Boolean maximumPermissionsSolutionImport) {
        this.maximumPermissionsSolutionImport = maximumPermissionsSolutionImport;
    }


    /**
     * Gets the maximumPermissionsSubmitMacrosAllowed value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsSubmitMacrosAllowed
     */
    public java.lang.Boolean getMaximumPermissionsSubmitMacrosAllowed() {
        return maximumPermissionsSubmitMacrosAllowed;
    }


    /**
     * Sets the maximumPermissionsSubmitMacrosAllowed value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsSubmitMacrosAllowed
     */
    public void setMaximumPermissionsSubmitMacrosAllowed(java.lang.Boolean maximumPermissionsSubmitMacrosAllowed) {
        this.maximumPermissionsSubmitMacrosAllowed = maximumPermissionsSubmitMacrosAllowed;
    }


    /**
     * Gets the maximumPermissionsTransferAnyCase value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsTransferAnyCase
     */
    public java.lang.Boolean getMaximumPermissionsTransferAnyCase() {
        return maximumPermissionsTransferAnyCase;
    }


    /**
     * Sets the maximumPermissionsTransferAnyCase value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsTransferAnyCase
     */
    public void setMaximumPermissionsTransferAnyCase(java.lang.Boolean maximumPermissionsTransferAnyCase) {
        this.maximumPermissionsTransferAnyCase = maximumPermissionsTransferAnyCase;
    }


    /**
     * Gets the maximumPermissionsTransferAnyEntity value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsTransferAnyEntity
     */
    public java.lang.Boolean getMaximumPermissionsTransferAnyEntity() {
        return maximumPermissionsTransferAnyEntity;
    }


    /**
     * Sets the maximumPermissionsTransferAnyEntity value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsTransferAnyEntity
     */
    public void setMaximumPermissionsTransferAnyEntity(java.lang.Boolean maximumPermissionsTransferAnyEntity) {
        this.maximumPermissionsTransferAnyEntity = maximumPermissionsTransferAnyEntity;
    }


    /**
     * Gets the maximumPermissionsTransferAnyLead value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsTransferAnyLead
     */
    public java.lang.Boolean getMaximumPermissionsTransferAnyLead() {
        return maximumPermissionsTransferAnyLead;
    }


    /**
     * Sets the maximumPermissionsTransferAnyLead value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsTransferAnyLead
     */
    public void setMaximumPermissionsTransferAnyLead(java.lang.Boolean maximumPermissionsTransferAnyLead) {
        this.maximumPermissionsTransferAnyLead = maximumPermissionsTransferAnyLead;
    }


    /**
     * Gets the maximumPermissionsTwoFactorApi value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsTwoFactorApi
     */
    public java.lang.Boolean getMaximumPermissionsTwoFactorApi() {
        return maximumPermissionsTwoFactorApi;
    }


    /**
     * Sets the maximumPermissionsTwoFactorApi value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsTwoFactorApi
     */
    public void setMaximumPermissionsTwoFactorApi(java.lang.Boolean maximumPermissionsTwoFactorApi) {
        this.maximumPermissionsTwoFactorApi = maximumPermissionsTwoFactorApi;
    }


    /**
     * Gets the maximumPermissionsUseTeamReassignWizards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsUseTeamReassignWizards
     */
    public java.lang.Boolean getMaximumPermissionsUseTeamReassignWizards() {
        return maximumPermissionsUseTeamReassignWizards;
    }


    /**
     * Sets the maximumPermissionsUseTeamReassignWizards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsUseTeamReassignWizards
     */
    public void setMaximumPermissionsUseTeamReassignWizards(java.lang.Boolean maximumPermissionsUseTeamReassignWizards) {
        this.maximumPermissionsUseTeamReassignWizards = maximumPermissionsUseTeamReassignWizards;
    }


    /**
     * Gets the maximumPermissionsViewAllData value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewAllData
     */
    public java.lang.Boolean getMaximumPermissionsViewAllData() {
        return maximumPermissionsViewAllData;
    }


    /**
     * Sets the maximumPermissionsViewAllData value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewAllData
     */
    public void setMaximumPermissionsViewAllData(java.lang.Boolean maximumPermissionsViewAllData) {
        this.maximumPermissionsViewAllData = maximumPermissionsViewAllData;
    }


    /**
     * Gets the maximumPermissionsViewAllUsers value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewAllUsers
     */
    public java.lang.Boolean getMaximumPermissionsViewAllUsers() {
        return maximumPermissionsViewAllUsers;
    }


    /**
     * Sets the maximumPermissionsViewAllUsers value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewAllUsers
     */
    public void setMaximumPermissionsViewAllUsers(java.lang.Boolean maximumPermissionsViewAllUsers) {
        this.maximumPermissionsViewAllUsers = maximumPermissionsViewAllUsers;
    }


    /**
     * Gets the maximumPermissionsViewContent value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewContent
     */
    public java.lang.Boolean getMaximumPermissionsViewContent() {
        return maximumPermissionsViewContent;
    }


    /**
     * Sets the maximumPermissionsViewContent value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewContent
     */
    public void setMaximumPermissionsViewContent(java.lang.Boolean maximumPermissionsViewContent) {
        this.maximumPermissionsViewContent = maximumPermissionsViewContent;
    }


    /**
     * Gets the maximumPermissionsViewDataCategories value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewDataCategories
     */
    public java.lang.Boolean getMaximumPermissionsViewDataCategories() {
        return maximumPermissionsViewDataCategories;
    }


    /**
     * Sets the maximumPermissionsViewDataCategories value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewDataCategories
     */
    public void setMaximumPermissionsViewDataCategories(java.lang.Boolean maximumPermissionsViewDataCategories) {
        this.maximumPermissionsViewDataCategories = maximumPermissionsViewDataCategories;
    }


    /**
     * Gets the maximumPermissionsViewEncryptedData value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewEncryptedData
     */
    public java.lang.Boolean getMaximumPermissionsViewEncryptedData() {
        return maximumPermissionsViewEncryptedData;
    }


    /**
     * Sets the maximumPermissionsViewEncryptedData value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewEncryptedData
     */
    public void setMaximumPermissionsViewEncryptedData(java.lang.Boolean maximumPermissionsViewEncryptedData) {
        this.maximumPermissionsViewEncryptedData = maximumPermissionsViewEncryptedData;
    }


    /**
     * Gets the maximumPermissionsViewEventLogFiles value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewEventLogFiles
     */
    public java.lang.Boolean getMaximumPermissionsViewEventLogFiles() {
        return maximumPermissionsViewEventLogFiles;
    }


    /**
     * Sets the maximumPermissionsViewEventLogFiles value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewEventLogFiles
     */
    public void setMaximumPermissionsViewEventLogFiles(java.lang.Boolean maximumPermissionsViewEventLogFiles) {
        this.maximumPermissionsViewEventLogFiles = maximumPermissionsViewEventLogFiles;
    }


    /**
     * Gets the maximumPermissionsViewHelpLink value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewHelpLink
     */
    public java.lang.Boolean getMaximumPermissionsViewHelpLink() {
        return maximumPermissionsViewHelpLink;
    }


    /**
     * Sets the maximumPermissionsViewHelpLink value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewHelpLink
     */
    public void setMaximumPermissionsViewHelpLink(java.lang.Boolean maximumPermissionsViewHelpLink) {
        this.maximumPermissionsViewHelpLink = maximumPermissionsViewHelpLink;
    }


    /**
     * Gets the maximumPermissionsViewMyTeamsDashboards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewMyTeamsDashboards
     */
    public java.lang.Boolean getMaximumPermissionsViewMyTeamsDashboards() {
        return maximumPermissionsViewMyTeamsDashboards;
    }


    /**
     * Sets the maximumPermissionsViewMyTeamsDashboards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewMyTeamsDashboards
     */
    public void setMaximumPermissionsViewMyTeamsDashboards(java.lang.Boolean maximumPermissionsViewMyTeamsDashboards) {
        this.maximumPermissionsViewMyTeamsDashboards = maximumPermissionsViewMyTeamsDashboards;
    }


    /**
     * Gets the maximumPermissionsViewPublicDashboards value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewPublicDashboards
     */
    public java.lang.Boolean getMaximumPermissionsViewPublicDashboards() {
        return maximumPermissionsViewPublicDashboards;
    }


    /**
     * Sets the maximumPermissionsViewPublicDashboards value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewPublicDashboards
     */
    public void setMaximumPermissionsViewPublicDashboards(java.lang.Boolean maximumPermissionsViewPublicDashboards) {
        this.maximumPermissionsViewPublicDashboards = maximumPermissionsViewPublicDashboards;
    }


    /**
     * Gets the maximumPermissionsViewPublicReports value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewPublicReports
     */
    public java.lang.Boolean getMaximumPermissionsViewPublicReports() {
        return maximumPermissionsViewPublicReports;
    }


    /**
     * Sets the maximumPermissionsViewPublicReports value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewPublicReports
     */
    public void setMaximumPermissionsViewPublicReports(java.lang.Boolean maximumPermissionsViewPublicReports) {
        this.maximumPermissionsViewPublicReports = maximumPermissionsViewPublicReports;
    }


    /**
     * Gets the maximumPermissionsViewSetup value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsViewSetup
     */
    public java.lang.Boolean getMaximumPermissionsViewSetup() {
        return maximumPermissionsViewSetup;
    }


    /**
     * Sets the maximumPermissionsViewSetup value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsViewSetup
     */
    public void setMaximumPermissionsViewSetup(java.lang.Boolean maximumPermissionsViewSetup) {
        this.maximumPermissionsViewSetup = maximumPermissionsViewSetup;
    }


    /**
     * Gets the maximumPermissionsWorkCalibrationUser value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsWorkCalibrationUser
     */
    public java.lang.Boolean getMaximumPermissionsWorkCalibrationUser() {
        return maximumPermissionsWorkCalibrationUser;
    }


    /**
     * Sets the maximumPermissionsWorkCalibrationUser value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsWorkCalibrationUser
     */
    public void setMaximumPermissionsWorkCalibrationUser(java.lang.Boolean maximumPermissionsWorkCalibrationUser) {
        this.maximumPermissionsWorkCalibrationUser = maximumPermissionsWorkCalibrationUser;
    }


    /**
     * Gets the maximumPermissionsWorkDotComUserPerm value for this PermissionSetLicense.
     * 
     * @return maximumPermissionsWorkDotComUserPerm
     */
    public java.lang.Boolean getMaximumPermissionsWorkDotComUserPerm() {
        return maximumPermissionsWorkDotComUserPerm;
    }


    /**
     * Sets the maximumPermissionsWorkDotComUserPerm value for this PermissionSetLicense.
     * 
     * @param maximumPermissionsWorkDotComUserPerm
     */
    public void setMaximumPermissionsWorkDotComUserPerm(java.lang.Boolean maximumPermissionsWorkDotComUserPerm) {
        this.maximumPermissionsWorkDotComUserPerm = maximumPermissionsWorkDotComUserPerm;
    }


    /**
     * Gets the permissionSetLicenseAssignments value for this PermissionSetLicense.
     * 
     * @return permissionSetLicenseAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getPermissionSetLicenseAssignments() {
        return permissionSetLicenseAssignments;
    }


    /**
     * Sets the permissionSetLicenseAssignments value for this PermissionSetLicense.
     * 
     * @param permissionSetLicenseAssignments
     */
    public void setPermissionSetLicenseAssignments(com.sforce.soap.enterprise.QueryResult permissionSetLicenseAssignments) {
        this.permissionSetLicenseAssignments = permissionSetLicenseAssignments;
    }


    /**
     * Gets the permissionSetLicenseKey value for this PermissionSetLicense.
     * 
     * @return permissionSetLicenseKey
     */
    public java.lang.String getPermissionSetLicenseKey() {
        return permissionSetLicenseKey;
    }


    /**
     * Sets the permissionSetLicenseKey value for this PermissionSetLicense.
     * 
     * @param permissionSetLicenseKey
     */
    public void setPermissionSetLicenseKey(java.lang.String permissionSetLicenseKey) {
        this.permissionSetLicenseKey = permissionSetLicenseKey;
    }


    /**
     * Gets the status value for this PermissionSetLicense.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PermissionSetLicense.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this PermissionSetLicense.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this PermissionSetLicense.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the totalLicenses value for this PermissionSetLicense.
     * 
     * @return totalLicenses
     */
    public java.lang.Integer getTotalLicenses() {
        return totalLicenses;
    }


    /**
     * Sets the totalLicenses value for this PermissionSetLicense.
     * 
     * @param totalLicenses
     */
    public void setTotalLicenses(java.lang.Integer totalLicenses) {
        this.totalLicenses = totalLicenses;
    }


    /**
     * Gets the usedLicenses value for this PermissionSetLicense.
     * 
     * @return usedLicenses
     */
    public java.lang.Integer getUsedLicenses() {
        return usedLicenses;
    }


    /**
     * Sets the usedLicenses value for this PermissionSetLicense.
     * 
     * @param usedLicenses
     */
    public void setUsedLicenses(java.lang.Integer usedLicenses) {
        this.usedLicenses = usedLicenses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSetLicense)) return false;
        PermissionSetLicense other = (PermissionSetLicense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.grantedByLicenses==null && other.getGrantedByLicenses()==null) || 
             (this.grantedByLicenses!=null &&
              this.grantedByLicenses.equals(other.getGrantedByLicenses()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.maximumPermissionsActivateContract==null && other.getMaximumPermissionsActivateContract()==null) || 
             (this.maximumPermissionsActivateContract!=null &&
              this.maximumPermissionsActivateContract.equals(other.getMaximumPermissionsActivateContract()))) &&
            ((this.maximumPermissionsActivateOrder==null && other.getMaximumPermissionsActivateOrder()==null) || 
             (this.maximumPermissionsActivateOrder!=null &&
              this.maximumPermissionsActivateOrder.equals(other.getMaximumPermissionsActivateOrder()))) &&
            ((this.maximumPermissionsAllowEmailIC==null && other.getMaximumPermissionsAllowEmailIC()==null) || 
             (this.maximumPermissionsAllowEmailIC!=null &&
              this.maximumPermissionsAllowEmailIC.equals(other.getMaximumPermissionsAllowEmailIC()))) &&
            ((this.maximumPermissionsAllowUniversalSearch==null && other.getMaximumPermissionsAllowUniversalSearch()==null) || 
             (this.maximumPermissionsAllowUniversalSearch!=null &&
              this.maximumPermissionsAllowUniversalSearch.equals(other.getMaximumPermissionsAllowUniversalSearch()))) &&
            ((this.maximumPermissionsAllowViewKnowledge==null && other.getMaximumPermissionsAllowViewKnowledge()==null) || 
             (this.maximumPermissionsAllowViewKnowledge!=null &&
              this.maximumPermissionsAllowViewKnowledge.equals(other.getMaximumPermissionsAllowViewKnowledge()))) &&
            ((this.maximumPermissionsApiEnabled==null && other.getMaximumPermissionsApiEnabled()==null) || 
             (this.maximumPermissionsApiEnabled!=null &&
              this.maximumPermissionsApiEnabled.equals(other.getMaximumPermissionsApiEnabled()))) &&
            ((this.maximumPermissionsAssignPermissionSets==null && other.getMaximumPermissionsAssignPermissionSets()==null) || 
             (this.maximumPermissionsAssignPermissionSets!=null &&
              this.maximumPermissionsAssignPermissionSets.equals(other.getMaximumPermissionsAssignPermissionSets()))) &&
            ((this.maximumPermissionsAssignTopics==null && other.getMaximumPermissionsAssignTopics()==null) || 
             (this.maximumPermissionsAssignTopics!=null &&
              this.maximumPermissionsAssignTopics.equals(other.getMaximumPermissionsAssignTopics()))) &&
            ((this.maximumPermissionsAuthorApex==null && other.getMaximumPermissionsAuthorApex()==null) || 
             (this.maximumPermissionsAuthorApex!=null &&
              this.maximumPermissionsAuthorApex.equals(other.getMaximumPermissionsAuthorApex()))) &&
            ((this.maximumPermissionsBulkApiHardDelete==null && other.getMaximumPermissionsBulkApiHardDelete()==null) || 
             (this.maximumPermissionsBulkApiHardDelete!=null &&
              this.maximumPermissionsBulkApiHardDelete.equals(other.getMaximumPermissionsBulkApiHardDelete()))) &&
            ((this.maximumPermissionsBulkMacrosAllowed==null && other.getMaximumPermissionsBulkMacrosAllowed()==null) || 
             (this.maximumPermissionsBulkMacrosAllowed!=null &&
              this.maximumPermissionsBulkMacrosAllowed.equals(other.getMaximumPermissionsBulkMacrosAllowed()))) &&
            ((this.maximumPermissionsCanInsertFeedSystemFields==null && other.getMaximumPermissionsCanInsertFeedSystemFields()==null) || 
             (this.maximumPermissionsCanInsertFeedSystemFields!=null &&
              this.maximumPermissionsCanInsertFeedSystemFields.equals(other.getMaximumPermissionsCanInsertFeedSystemFields()))) &&
            ((this.maximumPermissionsCanUseNewDashboardBuilder==null && other.getMaximumPermissionsCanUseNewDashboardBuilder()==null) || 
             (this.maximumPermissionsCanUseNewDashboardBuilder!=null &&
              this.maximumPermissionsCanUseNewDashboardBuilder.equals(other.getMaximumPermissionsCanUseNewDashboardBuilder()))) &&
            ((this.maximumPermissionsChatterEditOwnPost==null && other.getMaximumPermissionsChatterEditOwnPost()==null) || 
             (this.maximumPermissionsChatterEditOwnPost!=null &&
              this.maximumPermissionsChatterEditOwnPost.equals(other.getMaximumPermissionsChatterEditOwnPost()))) &&
            ((this.maximumPermissionsChatterEditOwnRecordPost==null && other.getMaximumPermissionsChatterEditOwnRecordPost()==null) || 
             (this.maximumPermissionsChatterEditOwnRecordPost!=null &&
              this.maximumPermissionsChatterEditOwnRecordPost.equals(other.getMaximumPermissionsChatterEditOwnRecordPost()))) &&
            ((this.maximumPermissionsChatterFileLink==null && other.getMaximumPermissionsChatterFileLink()==null) || 
             (this.maximumPermissionsChatterFileLink!=null &&
              this.maximumPermissionsChatterFileLink.equals(other.getMaximumPermissionsChatterFileLink()))) &&
            ((this.maximumPermissionsChatterForSharePoint==null && other.getMaximumPermissionsChatterForSharePoint()==null) || 
             (this.maximumPermissionsChatterForSharePoint!=null &&
              this.maximumPermissionsChatterForSharePoint.equals(other.getMaximumPermissionsChatterForSharePoint()))) &&
            ((this.maximumPermissionsChatterInternalUser==null && other.getMaximumPermissionsChatterInternalUser()==null) || 
             (this.maximumPermissionsChatterInternalUser!=null &&
              this.maximumPermissionsChatterInternalUser.equals(other.getMaximumPermissionsChatterInternalUser()))) &&
            ((this.maximumPermissionsChatterInviteExternalUsers==null && other.getMaximumPermissionsChatterInviteExternalUsers()==null) || 
             (this.maximumPermissionsChatterInviteExternalUsers!=null &&
              this.maximumPermissionsChatterInviteExternalUsers.equals(other.getMaximumPermissionsChatterInviteExternalUsers()))) &&
            ((this.maximumPermissionsChatterOwnGroups==null && other.getMaximumPermissionsChatterOwnGroups()==null) || 
             (this.maximumPermissionsChatterOwnGroups!=null &&
              this.maximumPermissionsChatterOwnGroups.equals(other.getMaximumPermissionsChatterOwnGroups()))) &&
            ((this.maximumPermissionsConfigCustomRecs==null && other.getMaximumPermissionsConfigCustomRecs()==null) || 
             (this.maximumPermissionsConfigCustomRecs!=null &&
              this.maximumPermissionsConfigCustomRecs.equals(other.getMaximumPermissionsConfigCustomRecs()))) &&
            ((this.maximumPermissionsConnectOrgToEnvironmentHub==null && other.getMaximumPermissionsConnectOrgToEnvironmentHub()==null) || 
             (this.maximumPermissionsConnectOrgToEnvironmentHub!=null &&
              this.maximumPermissionsConnectOrgToEnvironmentHub.equals(other.getMaximumPermissionsConnectOrgToEnvironmentHub()))) &&
            ((this.maximumPermissionsContentAdministrator==null && other.getMaximumPermissionsContentAdministrator()==null) || 
             (this.maximumPermissionsContentAdministrator!=null &&
              this.maximumPermissionsContentAdministrator.equals(other.getMaximumPermissionsContentAdministrator()))) &&
            ((this.maximumPermissionsConvertLeads==null && other.getMaximumPermissionsConvertLeads()==null) || 
             (this.maximumPermissionsConvertLeads!=null &&
              this.maximumPermissionsConvertLeads.equals(other.getMaximumPermissionsConvertLeads()))) &&
            ((this.maximumPermissionsCreateCustomizeDashboards==null && other.getMaximumPermissionsCreateCustomizeDashboards()==null) || 
             (this.maximumPermissionsCreateCustomizeDashboards!=null &&
              this.maximumPermissionsCreateCustomizeDashboards.equals(other.getMaximumPermissionsCreateCustomizeDashboards()))) &&
            ((this.maximumPermissionsCreateCustomizeFilters==null && other.getMaximumPermissionsCreateCustomizeFilters()==null) || 
             (this.maximumPermissionsCreateCustomizeFilters!=null &&
              this.maximumPermissionsCreateCustomizeFilters.equals(other.getMaximumPermissionsCreateCustomizeFilters()))) &&
            ((this.maximumPermissionsCreateCustomizeReports==null && other.getMaximumPermissionsCreateCustomizeReports()==null) || 
             (this.maximumPermissionsCreateCustomizeReports!=null &&
              this.maximumPermissionsCreateCustomizeReports.equals(other.getMaximumPermissionsCreateCustomizeReports()))) &&
            ((this.maximumPermissionsCreateDashboardFolders==null && other.getMaximumPermissionsCreateDashboardFolders()==null) || 
             (this.maximumPermissionsCreateDashboardFolders!=null &&
              this.maximumPermissionsCreateDashboardFolders.equals(other.getMaximumPermissionsCreateDashboardFolders()))) &&
            ((this.maximumPermissionsCreatePackaging==null && other.getMaximumPermissionsCreatePackaging()==null) || 
             (this.maximumPermissionsCreatePackaging!=null &&
              this.maximumPermissionsCreatePackaging.equals(other.getMaximumPermissionsCreatePackaging()))) &&
            ((this.maximumPermissionsCreateReportFolders==null && other.getMaximumPermissionsCreateReportFolders()==null) || 
             (this.maximumPermissionsCreateReportFolders!=null &&
              this.maximumPermissionsCreateReportFolders.equals(other.getMaximumPermissionsCreateReportFolders()))) &&
            ((this.maximumPermissionsCreateTopics==null && other.getMaximumPermissionsCreateTopics()==null) || 
             (this.maximumPermissionsCreateTopics!=null &&
              this.maximumPermissionsCreateTopics.equals(other.getMaximumPermissionsCreateTopics()))) &&
            ((this.maximumPermissionsCreateWorkspaces==null && other.getMaximumPermissionsCreateWorkspaces()==null) || 
             (this.maximumPermissionsCreateWorkspaces!=null &&
              this.maximumPermissionsCreateWorkspaces.equals(other.getMaximumPermissionsCreateWorkspaces()))) &&
            ((this.maximumPermissionsCustomMobileAppsAccess==null && other.getMaximumPermissionsCustomMobileAppsAccess()==null) || 
             (this.maximumPermissionsCustomMobileAppsAccess!=null &&
              this.maximumPermissionsCustomMobileAppsAccess.equals(other.getMaximumPermissionsCustomMobileAppsAccess()))) &&
            ((this.maximumPermissionsCustomSidebarOnAllPages==null && other.getMaximumPermissionsCustomSidebarOnAllPages()==null) || 
             (this.maximumPermissionsCustomSidebarOnAllPages!=null &&
              this.maximumPermissionsCustomSidebarOnAllPages.equals(other.getMaximumPermissionsCustomSidebarOnAllPages()))) &&
            ((this.maximumPermissionsCustomizeApplication==null && other.getMaximumPermissionsCustomizeApplication()==null) || 
             (this.maximumPermissionsCustomizeApplication!=null &&
              this.maximumPermissionsCustomizeApplication.equals(other.getMaximumPermissionsCustomizeApplication()))) &&
            ((this.maximumPermissionsDeleteActivatedContract==null && other.getMaximumPermissionsDeleteActivatedContract()==null) || 
             (this.maximumPermissionsDeleteActivatedContract!=null &&
              this.maximumPermissionsDeleteActivatedContract.equals(other.getMaximumPermissionsDeleteActivatedContract()))) &&
            ((this.maximumPermissionsDeleteTopics==null && other.getMaximumPermissionsDeleteTopics()==null) || 
             (this.maximumPermissionsDeleteTopics!=null &&
              this.maximumPermissionsDeleteTopics.equals(other.getMaximumPermissionsDeleteTopics()))) &&
            ((this.maximumPermissionsDistributeFromPersWksp==null && other.getMaximumPermissionsDistributeFromPersWksp()==null) || 
             (this.maximumPermissionsDistributeFromPersWksp!=null &&
              this.maximumPermissionsDistributeFromPersWksp.equals(other.getMaximumPermissionsDistributeFromPersWksp()))) &&
            ((this.maximumPermissionsEditActivatedOrders==null && other.getMaximumPermissionsEditActivatedOrders()==null) || 
             (this.maximumPermissionsEditActivatedOrders!=null &&
              this.maximumPermissionsEditActivatedOrders.equals(other.getMaximumPermissionsEditActivatedOrders()))) &&
            ((this.maximumPermissionsEditBrandTemplates==null && other.getMaximumPermissionsEditBrandTemplates()==null) || 
             (this.maximumPermissionsEditBrandTemplates!=null &&
              this.maximumPermissionsEditBrandTemplates.equals(other.getMaximumPermissionsEditBrandTemplates()))) &&
            ((this.maximumPermissionsEditCaseComments==null && other.getMaximumPermissionsEditCaseComments()==null) || 
             (this.maximumPermissionsEditCaseComments!=null &&
              this.maximumPermissionsEditCaseComments.equals(other.getMaximumPermissionsEditCaseComments()))) &&
            ((this.maximumPermissionsEditEvent==null && other.getMaximumPermissionsEditEvent()==null) || 
             (this.maximumPermissionsEditEvent!=null &&
              this.maximumPermissionsEditEvent.equals(other.getMaximumPermissionsEditEvent()))) &&
            ((this.maximumPermissionsEditHtmlTemplates==null && other.getMaximumPermissionsEditHtmlTemplates()==null) || 
             (this.maximumPermissionsEditHtmlTemplates!=null &&
              this.maximumPermissionsEditHtmlTemplates.equals(other.getMaximumPermissionsEditHtmlTemplates()))) &&
            ((this.maximumPermissionsEditKnowledge==null && other.getMaximumPermissionsEditKnowledge()==null) || 
             (this.maximumPermissionsEditKnowledge!=null &&
              this.maximumPermissionsEditKnowledge.equals(other.getMaximumPermissionsEditKnowledge()))) &&
            ((this.maximumPermissionsEditMyDashboards==null && other.getMaximumPermissionsEditMyDashboards()==null) || 
             (this.maximumPermissionsEditMyDashboards!=null &&
              this.maximumPermissionsEditMyDashboards.equals(other.getMaximumPermissionsEditMyDashboards()))) &&
            ((this.maximumPermissionsEditMyReports==null && other.getMaximumPermissionsEditMyReports()==null) || 
             (this.maximumPermissionsEditMyReports!=null &&
              this.maximumPermissionsEditMyReports.equals(other.getMaximumPermissionsEditMyReports()))) &&
            ((this.maximumPermissionsEditOppLineItemUnitPrice==null && other.getMaximumPermissionsEditOppLineItemUnitPrice()==null) || 
             (this.maximumPermissionsEditOppLineItemUnitPrice!=null &&
              this.maximumPermissionsEditOppLineItemUnitPrice.equals(other.getMaximumPermissionsEditOppLineItemUnitPrice()))) &&
            ((this.maximumPermissionsEditPublicDocuments==null && other.getMaximumPermissionsEditPublicDocuments()==null) || 
             (this.maximumPermissionsEditPublicDocuments!=null &&
              this.maximumPermissionsEditPublicDocuments.equals(other.getMaximumPermissionsEditPublicDocuments()))) &&
            ((this.maximumPermissionsEditPublicTemplates==null && other.getMaximumPermissionsEditPublicTemplates()==null) || 
             (this.maximumPermissionsEditPublicTemplates!=null &&
              this.maximumPermissionsEditPublicTemplates.equals(other.getMaximumPermissionsEditPublicTemplates()))) &&
            ((this.maximumPermissionsEditReadonlyFields==null && other.getMaximumPermissionsEditReadonlyFields()==null) || 
             (this.maximumPermissionsEditReadonlyFields!=null &&
              this.maximumPermissionsEditReadonlyFields.equals(other.getMaximumPermissionsEditReadonlyFields()))) &&
            ((this.maximumPermissionsEditTask==null && other.getMaximumPermissionsEditTask()==null) || 
             (this.maximumPermissionsEditTask!=null &&
              this.maximumPermissionsEditTask.equals(other.getMaximumPermissionsEditTask()))) &&
            ((this.maximumPermissionsEditTopics==null && other.getMaximumPermissionsEditTopics()==null) || 
             (this.maximumPermissionsEditTopics!=null &&
              this.maximumPermissionsEditTopics.equals(other.getMaximumPermissionsEditTopics()))) &&
            ((this.maximumPermissionsEmailAdministration==null && other.getMaximumPermissionsEmailAdministration()==null) || 
             (this.maximumPermissionsEmailAdministration!=null &&
              this.maximumPermissionsEmailAdministration.equals(other.getMaximumPermissionsEmailAdministration()))) &&
            ((this.maximumPermissionsEmailMass==null && other.getMaximumPermissionsEmailMass()==null) || 
             (this.maximumPermissionsEmailMass!=null &&
              this.maximumPermissionsEmailMass.equals(other.getMaximumPermissionsEmailMass()))) &&
            ((this.maximumPermissionsEmailSingle==null && other.getMaximumPermissionsEmailSingle()==null) || 
             (this.maximumPermissionsEmailSingle!=null &&
              this.maximumPermissionsEmailSingle.equals(other.getMaximumPermissionsEmailSingle()))) &&
            ((this.maximumPermissionsEmailTemplateManagement==null && other.getMaximumPermissionsEmailTemplateManagement()==null) || 
             (this.maximumPermissionsEmailTemplateManagement!=null &&
              this.maximumPermissionsEmailTemplateManagement.equals(other.getMaximumPermissionsEmailTemplateManagement()))) &&
            ((this.maximumPermissionsEnableNotifications==null && other.getMaximumPermissionsEnableNotifications()==null) || 
             (this.maximumPermissionsEnableNotifications!=null &&
              this.maximumPermissionsEnableNotifications.equals(other.getMaximumPermissionsEnableNotifications()))) &&
            ((this.maximumPermissionsExportReport==null && other.getMaximumPermissionsExportReport()==null) || 
             (this.maximumPermissionsExportReport!=null &&
              this.maximumPermissionsExportReport.equals(other.getMaximumPermissionsExportReport()))) &&
            ((this.maximumPermissionsFlowUFLRequired==null && other.getMaximumPermissionsFlowUFLRequired()==null) || 
             (this.maximumPermissionsFlowUFLRequired!=null &&
              this.maximumPermissionsFlowUFLRequired.equals(other.getMaximumPermissionsFlowUFLRequired()))) &&
            ((this.maximumPermissionsForceTwoFactor==null && other.getMaximumPermissionsForceTwoFactor()==null) || 
             (this.maximumPermissionsForceTwoFactor!=null &&
              this.maximumPermissionsForceTwoFactor.equals(other.getMaximumPermissionsForceTwoFactor()))) &&
            ((this.maximumPermissionsGovernNetworks==null && other.getMaximumPermissionsGovernNetworks()==null) || 
             (this.maximumPermissionsGovernNetworks!=null &&
              this.maximumPermissionsGovernNetworks.equals(other.getMaximumPermissionsGovernNetworks()))) &&
            ((this.maximumPermissionsIdentityConnect==null && other.getMaximumPermissionsIdentityConnect()==null) || 
             (this.maximumPermissionsIdentityConnect!=null &&
              this.maximumPermissionsIdentityConnect.equals(other.getMaximumPermissionsIdentityConnect()))) &&
            ((this.maximumPermissionsIdentityEnabled==null && other.getMaximumPermissionsIdentityEnabled()==null) || 
             (this.maximumPermissionsIdentityEnabled!=null &&
              this.maximumPermissionsIdentityEnabled.equals(other.getMaximumPermissionsIdentityEnabled()))) &&
            ((this.maximumPermissionsImportLeads==null && other.getMaximumPermissionsImportLeads()==null) || 
             (this.maximumPermissionsImportLeads!=null &&
              this.maximumPermissionsImportLeads.equals(other.getMaximumPermissionsImportLeads()))) &&
            ((this.maximumPermissionsImportPersonal==null && other.getMaximumPermissionsImportPersonal()==null) || 
             (this.maximumPermissionsImportPersonal!=null &&
              this.maximumPermissionsImportPersonal.equals(other.getMaximumPermissionsImportPersonal()))) &&
            ((this.maximumPermissionsInstallPackaging==null && other.getMaximumPermissionsInstallPackaging()==null) || 
             (this.maximumPermissionsInstallPackaging!=null &&
              this.maximumPermissionsInstallPackaging.equals(other.getMaximumPermissionsInstallPackaging()))) &&
            ((this.maximumPermissionsLightningExperienceUser==null && other.getMaximumPermissionsLightningExperienceUser()==null) || 
             (this.maximumPermissionsLightningExperienceUser!=null &&
              this.maximumPermissionsLightningExperienceUser.equals(other.getMaximumPermissionsLightningExperienceUser()))) &&
            ((this.maximumPermissionsManageAnalyticSnapshots==null && other.getMaximumPermissionsManageAnalyticSnapshots()==null) || 
             (this.maximumPermissionsManageAnalyticSnapshots!=null &&
              this.maximumPermissionsManageAnalyticSnapshots.equals(other.getMaximumPermissionsManageAnalyticSnapshots()))) &&
            ((this.maximumPermissionsManageAuthProviders==null && other.getMaximumPermissionsManageAuthProviders()==null) || 
             (this.maximumPermissionsManageAuthProviders!=null &&
              this.maximumPermissionsManageAuthProviders.equals(other.getMaximumPermissionsManageAuthProviders()))) &&
            ((this.maximumPermissionsManageBusinessHourHolidays==null && other.getMaximumPermissionsManageBusinessHourHolidays()==null) || 
             (this.maximumPermissionsManageBusinessHourHolidays!=null &&
              this.maximumPermissionsManageBusinessHourHolidays.equals(other.getMaximumPermissionsManageBusinessHourHolidays()))) &&
            ((this.maximumPermissionsManageCallCenters==null && other.getMaximumPermissionsManageCallCenters()==null) || 
             (this.maximumPermissionsManageCallCenters!=null &&
              this.maximumPermissionsManageCallCenters.equals(other.getMaximumPermissionsManageCallCenters()))) &&
            ((this.maximumPermissionsManageCases==null && other.getMaximumPermissionsManageCases()==null) || 
             (this.maximumPermissionsManageCases!=null &&
              this.maximumPermissionsManageCases.equals(other.getMaximumPermissionsManageCases()))) &&
            ((this.maximumPermissionsManageCategories==null && other.getMaximumPermissionsManageCategories()==null) || 
             (this.maximumPermissionsManageCategories!=null &&
              this.maximumPermissionsManageCategories.equals(other.getMaximumPermissionsManageCategories()))) &&
            ((this.maximumPermissionsManageChatterMessages==null && other.getMaximumPermissionsManageChatterMessages()==null) || 
             (this.maximumPermissionsManageChatterMessages!=null &&
              this.maximumPermissionsManageChatterMessages.equals(other.getMaximumPermissionsManageChatterMessages()))) &&
            ((this.maximumPermissionsManageContentPermissions==null && other.getMaximumPermissionsManageContentPermissions()==null) || 
             (this.maximumPermissionsManageContentPermissions!=null &&
              this.maximumPermissionsManageContentPermissions.equals(other.getMaximumPermissionsManageContentPermissions()))) &&
            ((this.maximumPermissionsManageContentProperties==null && other.getMaximumPermissionsManageContentProperties()==null) || 
             (this.maximumPermissionsManageContentProperties!=null &&
              this.maximumPermissionsManageContentProperties.equals(other.getMaximumPermissionsManageContentProperties()))) &&
            ((this.maximumPermissionsManageContentTypes==null && other.getMaximumPermissionsManageContentTypes()==null) || 
             (this.maximumPermissionsManageContentTypes!=null &&
              this.maximumPermissionsManageContentTypes.equals(other.getMaximumPermissionsManageContentTypes()))) &&
            ((this.maximumPermissionsManageCustomPermissions==null && other.getMaximumPermissionsManageCustomPermissions()==null) || 
             (this.maximumPermissionsManageCustomPermissions!=null &&
              this.maximumPermissionsManageCustomPermissions.equals(other.getMaximumPermissionsManageCustomPermissions()))) &&
            ((this.maximumPermissionsManageCustomReportTypes==null && other.getMaximumPermissionsManageCustomReportTypes()==null) || 
             (this.maximumPermissionsManageCustomReportTypes!=null &&
              this.maximumPermissionsManageCustomReportTypes.equals(other.getMaximumPermissionsManageCustomReportTypes()))) &&
            ((this.maximumPermissionsManageDashbdsInPubFolders==null && other.getMaximumPermissionsManageDashbdsInPubFolders()==null) || 
             (this.maximumPermissionsManageDashbdsInPubFolders!=null &&
              this.maximumPermissionsManageDashbdsInPubFolders.equals(other.getMaximumPermissionsManageDashbdsInPubFolders()))) &&
            ((this.maximumPermissionsManageDataCategories==null && other.getMaximumPermissionsManageDataCategories()==null) || 
             (this.maximumPermissionsManageDataCategories!=null &&
              this.maximumPermissionsManageDataCategories.equals(other.getMaximumPermissionsManageDataCategories()))) &&
            ((this.maximumPermissionsManageDataIntegrations==null && other.getMaximumPermissionsManageDataIntegrations()==null) || 
             (this.maximumPermissionsManageDataIntegrations!=null &&
              this.maximumPermissionsManageDataIntegrations.equals(other.getMaximumPermissionsManageDataIntegrations()))) &&
            ((this.maximumPermissionsManageDynamicDashboards==null && other.getMaximumPermissionsManageDynamicDashboards()==null) || 
             (this.maximumPermissionsManageDynamicDashboards!=null &&
              this.maximumPermissionsManageDynamicDashboards.equals(other.getMaximumPermissionsManageDynamicDashboards()))) &&
            ((this.maximumPermissionsManageEmailClientConfig==null && other.getMaximumPermissionsManageEmailClientConfig()==null) || 
             (this.maximumPermissionsManageEmailClientConfig!=null &&
              this.maximumPermissionsManageEmailClientConfig.equals(other.getMaximumPermissionsManageEmailClientConfig()))) &&
            ((this.maximumPermissionsManageEncryptionKeys==null && other.getMaximumPermissionsManageEncryptionKeys()==null) || 
             (this.maximumPermissionsManageEncryptionKeys!=null &&
              this.maximumPermissionsManageEncryptionKeys.equals(other.getMaximumPermissionsManageEncryptionKeys()))) &&
            ((this.maximumPermissionsManageExchangeConfig==null && other.getMaximumPermissionsManageExchangeConfig()==null) || 
             (this.maximumPermissionsManageExchangeConfig!=null &&
              this.maximumPermissionsManageExchangeConfig.equals(other.getMaximumPermissionsManageExchangeConfig()))) &&
            ((this.maximumPermissionsManageInteraction==null && other.getMaximumPermissionsManageInteraction()==null) || 
             (this.maximumPermissionsManageInteraction!=null &&
              this.maximumPermissionsManageInteraction.equals(other.getMaximumPermissionsManageInteraction()))) &&
            ((this.maximumPermissionsManageInternalUsers==null && other.getMaximumPermissionsManageInternalUsers()==null) || 
             (this.maximumPermissionsManageInternalUsers!=null &&
              this.maximumPermissionsManageInternalUsers.equals(other.getMaximumPermissionsManageInternalUsers()))) &&
            ((this.maximumPermissionsManageIpAddresses==null && other.getMaximumPermissionsManageIpAddresses()==null) || 
             (this.maximumPermissionsManageIpAddresses!=null &&
              this.maximumPermissionsManageIpAddresses.equals(other.getMaximumPermissionsManageIpAddresses()))) &&
            ((this.maximumPermissionsManageKnowledge==null && other.getMaximumPermissionsManageKnowledge()==null) || 
             (this.maximumPermissionsManageKnowledge!=null &&
              this.maximumPermissionsManageKnowledge.equals(other.getMaximumPermissionsManageKnowledge()))) &&
            ((this.maximumPermissionsManageKnowledgeImportExport==null && other.getMaximumPermissionsManageKnowledgeImportExport()==null) || 
             (this.maximumPermissionsManageKnowledgeImportExport!=null &&
              this.maximumPermissionsManageKnowledgeImportExport.equals(other.getMaximumPermissionsManageKnowledgeImportExport()))) &&
            ((this.maximumPermissionsManageLeads==null && other.getMaximumPermissionsManageLeads()==null) || 
             (this.maximumPermissionsManageLeads!=null &&
              this.maximumPermissionsManageLeads.equals(other.getMaximumPermissionsManageLeads()))) &&
            ((this.maximumPermissionsManageLoginAccessPolicies==null && other.getMaximumPermissionsManageLoginAccessPolicies()==null) || 
             (this.maximumPermissionsManageLoginAccessPolicies!=null &&
              this.maximumPermissionsManageLoginAccessPolicies.equals(other.getMaximumPermissionsManageLoginAccessPolicies()))) &&
            ((this.maximumPermissionsManageMobile==null && other.getMaximumPermissionsManageMobile()==null) || 
             (this.maximumPermissionsManageMobile!=null &&
              this.maximumPermissionsManageMobile.equals(other.getMaximumPermissionsManageMobile()))) &&
            ((this.maximumPermissionsManageNetworks==null && other.getMaximumPermissionsManageNetworks()==null) || 
             (this.maximumPermissionsManageNetworks!=null &&
              this.maximumPermissionsManageNetworks.equals(other.getMaximumPermissionsManageNetworks()))) &&
            ((this.maximumPermissionsManagePasswordPolicies==null && other.getMaximumPermissionsManagePasswordPolicies()==null) || 
             (this.maximumPermissionsManagePasswordPolicies!=null &&
              this.maximumPermissionsManagePasswordPolicies.equals(other.getMaximumPermissionsManagePasswordPolicies()))) &&
            ((this.maximumPermissionsManageProfilesPermissionsets==null && other.getMaximumPermissionsManageProfilesPermissionsets()==null) || 
             (this.maximumPermissionsManageProfilesPermissionsets!=null &&
              this.maximumPermissionsManageProfilesPermissionsets.equals(other.getMaximumPermissionsManageProfilesPermissionsets()))) &&
            ((this.maximumPermissionsManageRemoteAccess==null && other.getMaximumPermissionsManageRemoteAccess()==null) || 
             (this.maximumPermissionsManageRemoteAccess!=null &&
              this.maximumPermissionsManageRemoteAccess.equals(other.getMaximumPermissionsManageRemoteAccess()))) &&
            ((this.maximumPermissionsManageReportsInPubFolders==null && other.getMaximumPermissionsManageReportsInPubFolders()==null) || 
             (this.maximumPermissionsManageReportsInPubFolders!=null &&
              this.maximumPermissionsManageReportsInPubFolders.equals(other.getMaximumPermissionsManageReportsInPubFolders()))) &&
            ((this.maximumPermissionsManageRoles==null && other.getMaximumPermissionsManageRoles()==null) || 
             (this.maximumPermissionsManageRoles!=null &&
              this.maximumPermissionsManageRoles.equals(other.getMaximumPermissionsManageRoles()))) &&
            ((this.maximumPermissionsManageSearchPromotionRules==null && other.getMaximumPermissionsManageSearchPromotionRules()==null) || 
             (this.maximumPermissionsManageSearchPromotionRules!=null &&
              this.maximumPermissionsManageSearchPromotionRules.equals(other.getMaximumPermissionsManageSearchPromotionRules()))) &&
            ((this.maximumPermissionsManageSharing==null && other.getMaximumPermissionsManageSharing()==null) || 
             (this.maximumPermissionsManageSharing!=null &&
              this.maximumPermissionsManageSharing.equals(other.getMaximumPermissionsManageSharing()))) &&
            ((this.maximumPermissionsManageSolutions==null && other.getMaximumPermissionsManageSolutions()==null) || 
             (this.maximumPermissionsManageSolutions!=null &&
              this.maximumPermissionsManageSolutions.equals(other.getMaximumPermissionsManageSolutions()))) &&
            ((this.maximumPermissionsManageSynonyms==null && other.getMaximumPermissionsManageSynonyms()==null) || 
             (this.maximumPermissionsManageSynonyms!=null &&
              this.maximumPermissionsManageSynonyms.equals(other.getMaximumPermissionsManageSynonyms()))) &&
            ((this.maximumPermissionsManageTwoFactor==null && other.getMaximumPermissionsManageTwoFactor()==null) || 
             (this.maximumPermissionsManageTwoFactor!=null &&
              this.maximumPermissionsManageTwoFactor.equals(other.getMaximumPermissionsManageTwoFactor()))) &&
            ((this.maximumPermissionsManageUnlistedGroups==null && other.getMaximumPermissionsManageUnlistedGroups()==null) || 
             (this.maximumPermissionsManageUnlistedGroups!=null &&
              this.maximumPermissionsManageUnlistedGroups.equals(other.getMaximumPermissionsManageUnlistedGroups()))) &&
            ((this.maximumPermissionsManageUsers==null && other.getMaximumPermissionsManageUsers()==null) || 
             (this.maximumPermissionsManageUsers!=null &&
              this.maximumPermissionsManageUsers.equals(other.getMaximumPermissionsManageUsers()))) &&
            ((this.maximumPermissionsMassInlineEdit==null && other.getMaximumPermissionsMassInlineEdit()==null) || 
             (this.maximumPermissionsMassInlineEdit!=null &&
              this.maximumPermissionsMassInlineEdit.equals(other.getMaximumPermissionsMassInlineEdit()))) &&
            ((this.maximumPermissionsMergeTopics==null && other.getMaximumPermissionsMergeTopics()==null) || 
             (this.maximumPermissionsMergeTopics!=null &&
              this.maximumPermissionsMergeTopics.equals(other.getMaximumPermissionsMergeTopics()))) &&
            ((this.maximumPermissionsModerateChatter==null && other.getMaximumPermissionsModerateChatter()==null) || 
             (this.maximumPermissionsModerateChatter!=null &&
              this.maximumPermissionsModerateChatter.equals(other.getMaximumPermissionsModerateChatter()))) &&
            ((this.maximumPermissionsModifyAllData==null && other.getMaximumPermissionsModifyAllData()==null) || 
             (this.maximumPermissionsModifyAllData!=null &&
              this.maximumPermissionsModifyAllData.equals(other.getMaximumPermissionsModifyAllData()))) &&
            ((this.maximumPermissionsModifySecureAgents==null && other.getMaximumPermissionsModifySecureAgents()==null) || 
             (this.maximumPermissionsModifySecureAgents!=null &&
              this.maximumPermissionsModifySecureAgents.equals(other.getMaximumPermissionsModifySecureAgents()))) &&
            ((this.maximumPermissionsNewReportBuilder==null && other.getMaximumPermissionsNewReportBuilder()==null) || 
             (this.maximumPermissionsNewReportBuilder!=null &&
              this.maximumPermissionsNewReportBuilder.equals(other.getMaximumPermissionsNewReportBuilder()))) &&
            ((this.maximumPermissionsPasswordNeverExpires==null && other.getMaximumPermissionsPasswordNeverExpires()==null) || 
             (this.maximumPermissionsPasswordNeverExpires!=null &&
              this.maximumPermissionsPasswordNeverExpires.equals(other.getMaximumPermissionsPasswordNeverExpires()))) &&
            ((this.maximumPermissionsPublishPackaging==null && other.getMaximumPermissionsPublishPackaging()==null) || 
             (this.maximumPermissionsPublishPackaging!=null &&
              this.maximumPermissionsPublishPackaging.equals(other.getMaximumPermissionsPublishPackaging()))) &&
            ((this.maximumPermissionsResetPasswords==null && other.getMaximumPermissionsResetPasswords()==null) || 
             (this.maximumPermissionsResetPasswords!=null &&
              this.maximumPermissionsResetPasswords.equals(other.getMaximumPermissionsResetPasswords()))) &&
            ((this.maximumPermissionsRunFlow==null && other.getMaximumPermissionsRunFlow()==null) || 
             (this.maximumPermissionsRunFlow!=null &&
              this.maximumPermissionsRunFlow.equals(other.getMaximumPermissionsRunFlow()))) &&
            ((this.maximumPermissionsRunReports==null && other.getMaximumPermissionsRunReports()==null) || 
             (this.maximumPermissionsRunReports!=null &&
              this.maximumPermissionsRunReports.equals(other.getMaximumPermissionsRunReports()))) &&
            ((this.maximumPermissionsSalesConsole==null && other.getMaximumPermissionsSalesConsole()==null) || 
             (this.maximumPermissionsSalesConsole!=null &&
              this.maximumPermissionsSalesConsole.equals(other.getMaximumPermissionsSalesConsole()))) &&
            ((this.maximumPermissionsScheduleReports==null && other.getMaximumPermissionsScheduleReports()==null) || 
             (this.maximumPermissionsScheduleReports!=null &&
              this.maximumPermissionsScheduleReports.equals(other.getMaximumPermissionsScheduleReports()))) &&
            ((this.maximumPermissionsSelectFilesFromSalesforce==null && other.getMaximumPermissionsSelectFilesFromSalesforce()==null) || 
             (this.maximumPermissionsSelectFilesFromSalesforce!=null &&
              this.maximumPermissionsSelectFilesFromSalesforce.equals(other.getMaximumPermissionsSelectFilesFromSalesforce()))) &&
            ((this.maximumPermissionsSendSitRequests==null && other.getMaximumPermissionsSendSitRequests()==null) || 
             (this.maximumPermissionsSendSitRequests!=null &&
              this.maximumPermissionsSendSitRequests.equals(other.getMaximumPermissionsSendSitRequests()))) &&
            ((this.maximumPermissionsShareInternalArticles==null && other.getMaximumPermissionsShareInternalArticles()==null) || 
             (this.maximumPermissionsShareInternalArticles!=null &&
              this.maximumPermissionsShareInternalArticles.equals(other.getMaximumPermissionsShareInternalArticles()))) &&
            ((this.maximumPermissionsSolutionImport==null && other.getMaximumPermissionsSolutionImport()==null) || 
             (this.maximumPermissionsSolutionImport!=null &&
              this.maximumPermissionsSolutionImport.equals(other.getMaximumPermissionsSolutionImport()))) &&
            ((this.maximumPermissionsSubmitMacrosAllowed==null && other.getMaximumPermissionsSubmitMacrosAllowed()==null) || 
             (this.maximumPermissionsSubmitMacrosAllowed!=null &&
              this.maximumPermissionsSubmitMacrosAllowed.equals(other.getMaximumPermissionsSubmitMacrosAllowed()))) &&
            ((this.maximumPermissionsTransferAnyCase==null && other.getMaximumPermissionsTransferAnyCase()==null) || 
             (this.maximumPermissionsTransferAnyCase!=null &&
              this.maximumPermissionsTransferAnyCase.equals(other.getMaximumPermissionsTransferAnyCase()))) &&
            ((this.maximumPermissionsTransferAnyEntity==null && other.getMaximumPermissionsTransferAnyEntity()==null) || 
             (this.maximumPermissionsTransferAnyEntity!=null &&
              this.maximumPermissionsTransferAnyEntity.equals(other.getMaximumPermissionsTransferAnyEntity()))) &&
            ((this.maximumPermissionsTransferAnyLead==null && other.getMaximumPermissionsTransferAnyLead()==null) || 
             (this.maximumPermissionsTransferAnyLead!=null &&
              this.maximumPermissionsTransferAnyLead.equals(other.getMaximumPermissionsTransferAnyLead()))) &&
            ((this.maximumPermissionsTwoFactorApi==null && other.getMaximumPermissionsTwoFactorApi()==null) || 
             (this.maximumPermissionsTwoFactorApi!=null &&
              this.maximumPermissionsTwoFactorApi.equals(other.getMaximumPermissionsTwoFactorApi()))) &&
            ((this.maximumPermissionsUseTeamReassignWizards==null && other.getMaximumPermissionsUseTeamReassignWizards()==null) || 
             (this.maximumPermissionsUseTeamReassignWizards!=null &&
              this.maximumPermissionsUseTeamReassignWizards.equals(other.getMaximumPermissionsUseTeamReassignWizards()))) &&
            ((this.maximumPermissionsViewAllData==null && other.getMaximumPermissionsViewAllData()==null) || 
             (this.maximumPermissionsViewAllData!=null &&
              this.maximumPermissionsViewAllData.equals(other.getMaximumPermissionsViewAllData()))) &&
            ((this.maximumPermissionsViewAllUsers==null && other.getMaximumPermissionsViewAllUsers()==null) || 
             (this.maximumPermissionsViewAllUsers!=null &&
              this.maximumPermissionsViewAllUsers.equals(other.getMaximumPermissionsViewAllUsers()))) &&
            ((this.maximumPermissionsViewContent==null && other.getMaximumPermissionsViewContent()==null) || 
             (this.maximumPermissionsViewContent!=null &&
              this.maximumPermissionsViewContent.equals(other.getMaximumPermissionsViewContent()))) &&
            ((this.maximumPermissionsViewDataCategories==null && other.getMaximumPermissionsViewDataCategories()==null) || 
             (this.maximumPermissionsViewDataCategories!=null &&
              this.maximumPermissionsViewDataCategories.equals(other.getMaximumPermissionsViewDataCategories()))) &&
            ((this.maximumPermissionsViewEncryptedData==null && other.getMaximumPermissionsViewEncryptedData()==null) || 
             (this.maximumPermissionsViewEncryptedData!=null &&
              this.maximumPermissionsViewEncryptedData.equals(other.getMaximumPermissionsViewEncryptedData()))) &&
            ((this.maximumPermissionsViewEventLogFiles==null && other.getMaximumPermissionsViewEventLogFiles()==null) || 
             (this.maximumPermissionsViewEventLogFiles!=null &&
              this.maximumPermissionsViewEventLogFiles.equals(other.getMaximumPermissionsViewEventLogFiles()))) &&
            ((this.maximumPermissionsViewHelpLink==null && other.getMaximumPermissionsViewHelpLink()==null) || 
             (this.maximumPermissionsViewHelpLink!=null &&
              this.maximumPermissionsViewHelpLink.equals(other.getMaximumPermissionsViewHelpLink()))) &&
            ((this.maximumPermissionsViewMyTeamsDashboards==null && other.getMaximumPermissionsViewMyTeamsDashboards()==null) || 
             (this.maximumPermissionsViewMyTeamsDashboards!=null &&
              this.maximumPermissionsViewMyTeamsDashboards.equals(other.getMaximumPermissionsViewMyTeamsDashboards()))) &&
            ((this.maximumPermissionsViewPublicDashboards==null && other.getMaximumPermissionsViewPublicDashboards()==null) || 
             (this.maximumPermissionsViewPublicDashboards!=null &&
              this.maximumPermissionsViewPublicDashboards.equals(other.getMaximumPermissionsViewPublicDashboards()))) &&
            ((this.maximumPermissionsViewPublicReports==null && other.getMaximumPermissionsViewPublicReports()==null) || 
             (this.maximumPermissionsViewPublicReports!=null &&
              this.maximumPermissionsViewPublicReports.equals(other.getMaximumPermissionsViewPublicReports()))) &&
            ((this.maximumPermissionsViewSetup==null && other.getMaximumPermissionsViewSetup()==null) || 
             (this.maximumPermissionsViewSetup!=null &&
              this.maximumPermissionsViewSetup.equals(other.getMaximumPermissionsViewSetup()))) &&
            ((this.maximumPermissionsWorkCalibrationUser==null && other.getMaximumPermissionsWorkCalibrationUser()==null) || 
             (this.maximumPermissionsWorkCalibrationUser!=null &&
              this.maximumPermissionsWorkCalibrationUser.equals(other.getMaximumPermissionsWorkCalibrationUser()))) &&
            ((this.maximumPermissionsWorkDotComUserPerm==null && other.getMaximumPermissionsWorkDotComUserPerm()==null) || 
             (this.maximumPermissionsWorkDotComUserPerm!=null &&
              this.maximumPermissionsWorkDotComUserPerm.equals(other.getMaximumPermissionsWorkDotComUserPerm()))) &&
            ((this.permissionSetLicenseAssignments==null && other.getPermissionSetLicenseAssignments()==null) || 
             (this.permissionSetLicenseAssignments!=null &&
              this.permissionSetLicenseAssignments.equals(other.getPermissionSetLicenseAssignments()))) &&
            ((this.permissionSetLicenseKey==null && other.getPermissionSetLicenseKey()==null) || 
             (this.permissionSetLicenseKey!=null &&
              this.permissionSetLicenseKey.equals(other.getPermissionSetLicenseKey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.totalLicenses==null && other.getTotalLicenses()==null) || 
             (this.totalLicenses!=null &&
              this.totalLicenses.equals(other.getTotalLicenses()))) &&
            ((this.usedLicenses==null && other.getUsedLicenses()==null) || 
             (this.usedLicenses!=null &&
              this.usedLicenses.equals(other.getUsedLicenses())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getGrantedByLicenses() != null) {
            _hashCode += getGrantedByLicenses().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
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
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getMaximumPermissionsActivateContract() != null) {
            _hashCode += getMaximumPermissionsActivateContract().hashCode();
        }
        if (getMaximumPermissionsActivateOrder() != null) {
            _hashCode += getMaximumPermissionsActivateOrder().hashCode();
        }
        if (getMaximumPermissionsAllowEmailIC() != null) {
            _hashCode += getMaximumPermissionsAllowEmailIC().hashCode();
        }
        if (getMaximumPermissionsAllowUniversalSearch() != null) {
            _hashCode += getMaximumPermissionsAllowUniversalSearch().hashCode();
        }
        if (getMaximumPermissionsAllowViewKnowledge() != null) {
            _hashCode += getMaximumPermissionsAllowViewKnowledge().hashCode();
        }
        if (getMaximumPermissionsApiEnabled() != null) {
            _hashCode += getMaximumPermissionsApiEnabled().hashCode();
        }
        if (getMaximumPermissionsAssignPermissionSets() != null) {
            _hashCode += getMaximumPermissionsAssignPermissionSets().hashCode();
        }
        if (getMaximumPermissionsAssignTopics() != null) {
            _hashCode += getMaximumPermissionsAssignTopics().hashCode();
        }
        if (getMaximumPermissionsAuthorApex() != null) {
            _hashCode += getMaximumPermissionsAuthorApex().hashCode();
        }
        if (getMaximumPermissionsBulkApiHardDelete() != null) {
            _hashCode += getMaximumPermissionsBulkApiHardDelete().hashCode();
        }
        if (getMaximumPermissionsBulkMacrosAllowed() != null) {
            _hashCode += getMaximumPermissionsBulkMacrosAllowed().hashCode();
        }
        if (getMaximumPermissionsCanInsertFeedSystemFields() != null) {
            _hashCode += getMaximumPermissionsCanInsertFeedSystemFields().hashCode();
        }
        if (getMaximumPermissionsCanUseNewDashboardBuilder() != null) {
            _hashCode += getMaximumPermissionsCanUseNewDashboardBuilder().hashCode();
        }
        if (getMaximumPermissionsChatterEditOwnPost() != null) {
            _hashCode += getMaximumPermissionsChatterEditOwnPost().hashCode();
        }
        if (getMaximumPermissionsChatterEditOwnRecordPost() != null) {
            _hashCode += getMaximumPermissionsChatterEditOwnRecordPost().hashCode();
        }
        if (getMaximumPermissionsChatterFileLink() != null) {
            _hashCode += getMaximumPermissionsChatterFileLink().hashCode();
        }
        if (getMaximumPermissionsChatterForSharePoint() != null) {
            _hashCode += getMaximumPermissionsChatterForSharePoint().hashCode();
        }
        if (getMaximumPermissionsChatterInternalUser() != null) {
            _hashCode += getMaximumPermissionsChatterInternalUser().hashCode();
        }
        if (getMaximumPermissionsChatterInviteExternalUsers() != null) {
            _hashCode += getMaximumPermissionsChatterInviteExternalUsers().hashCode();
        }
        if (getMaximumPermissionsChatterOwnGroups() != null) {
            _hashCode += getMaximumPermissionsChatterOwnGroups().hashCode();
        }
        if (getMaximumPermissionsConfigCustomRecs() != null) {
            _hashCode += getMaximumPermissionsConfigCustomRecs().hashCode();
        }
        if (getMaximumPermissionsConnectOrgToEnvironmentHub() != null) {
            _hashCode += getMaximumPermissionsConnectOrgToEnvironmentHub().hashCode();
        }
        if (getMaximumPermissionsContentAdministrator() != null) {
            _hashCode += getMaximumPermissionsContentAdministrator().hashCode();
        }
        if (getMaximumPermissionsConvertLeads() != null) {
            _hashCode += getMaximumPermissionsConvertLeads().hashCode();
        }
        if (getMaximumPermissionsCreateCustomizeDashboards() != null) {
            _hashCode += getMaximumPermissionsCreateCustomizeDashboards().hashCode();
        }
        if (getMaximumPermissionsCreateCustomizeFilters() != null) {
            _hashCode += getMaximumPermissionsCreateCustomizeFilters().hashCode();
        }
        if (getMaximumPermissionsCreateCustomizeReports() != null) {
            _hashCode += getMaximumPermissionsCreateCustomizeReports().hashCode();
        }
        if (getMaximumPermissionsCreateDashboardFolders() != null) {
            _hashCode += getMaximumPermissionsCreateDashboardFolders().hashCode();
        }
        if (getMaximumPermissionsCreatePackaging() != null) {
            _hashCode += getMaximumPermissionsCreatePackaging().hashCode();
        }
        if (getMaximumPermissionsCreateReportFolders() != null) {
            _hashCode += getMaximumPermissionsCreateReportFolders().hashCode();
        }
        if (getMaximumPermissionsCreateTopics() != null) {
            _hashCode += getMaximumPermissionsCreateTopics().hashCode();
        }
        if (getMaximumPermissionsCreateWorkspaces() != null) {
            _hashCode += getMaximumPermissionsCreateWorkspaces().hashCode();
        }
        if (getMaximumPermissionsCustomMobileAppsAccess() != null) {
            _hashCode += getMaximumPermissionsCustomMobileAppsAccess().hashCode();
        }
        if (getMaximumPermissionsCustomSidebarOnAllPages() != null) {
            _hashCode += getMaximumPermissionsCustomSidebarOnAllPages().hashCode();
        }
        if (getMaximumPermissionsCustomizeApplication() != null) {
            _hashCode += getMaximumPermissionsCustomizeApplication().hashCode();
        }
        if (getMaximumPermissionsDeleteActivatedContract() != null) {
            _hashCode += getMaximumPermissionsDeleteActivatedContract().hashCode();
        }
        if (getMaximumPermissionsDeleteTopics() != null) {
            _hashCode += getMaximumPermissionsDeleteTopics().hashCode();
        }
        if (getMaximumPermissionsDistributeFromPersWksp() != null) {
            _hashCode += getMaximumPermissionsDistributeFromPersWksp().hashCode();
        }
        if (getMaximumPermissionsEditActivatedOrders() != null) {
            _hashCode += getMaximumPermissionsEditActivatedOrders().hashCode();
        }
        if (getMaximumPermissionsEditBrandTemplates() != null) {
            _hashCode += getMaximumPermissionsEditBrandTemplates().hashCode();
        }
        if (getMaximumPermissionsEditCaseComments() != null) {
            _hashCode += getMaximumPermissionsEditCaseComments().hashCode();
        }
        if (getMaximumPermissionsEditEvent() != null) {
            _hashCode += getMaximumPermissionsEditEvent().hashCode();
        }
        if (getMaximumPermissionsEditHtmlTemplates() != null) {
            _hashCode += getMaximumPermissionsEditHtmlTemplates().hashCode();
        }
        if (getMaximumPermissionsEditKnowledge() != null) {
            _hashCode += getMaximumPermissionsEditKnowledge().hashCode();
        }
        if (getMaximumPermissionsEditMyDashboards() != null) {
            _hashCode += getMaximumPermissionsEditMyDashboards().hashCode();
        }
        if (getMaximumPermissionsEditMyReports() != null) {
            _hashCode += getMaximumPermissionsEditMyReports().hashCode();
        }
        if (getMaximumPermissionsEditOppLineItemUnitPrice() != null) {
            _hashCode += getMaximumPermissionsEditOppLineItemUnitPrice().hashCode();
        }
        if (getMaximumPermissionsEditPublicDocuments() != null) {
            _hashCode += getMaximumPermissionsEditPublicDocuments().hashCode();
        }
        if (getMaximumPermissionsEditPublicTemplates() != null) {
            _hashCode += getMaximumPermissionsEditPublicTemplates().hashCode();
        }
        if (getMaximumPermissionsEditReadonlyFields() != null) {
            _hashCode += getMaximumPermissionsEditReadonlyFields().hashCode();
        }
        if (getMaximumPermissionsEditTask() != null) {
            _hashCode += getMaximumPermissionsEditTask().hashCode();
        }
        if (getMaximumPermissionsEditTopics() != null) {
            _hashCode += getMaximumPermissionsEditTopics().hashCode();
        }
        if (getMaximumPermissionsEmailAdministration() != null) {
            _hashCode += getMaximumPermissionsEmailAdministration().hashCode();
        }
        if (getMaximumPermissionsEmailMass() != null) {
            _hashCode += getMaximumPermissionsEmailMass().hashCode();
        }
        if (getMaximumPermissionsEmailSingle() != null) {
            _hashCode += getMaximumPermissionsEmailSingle().hashCode();
        }
        if (getMaximumPermissionsEmailTemplateManagement() != null) {
            _hashCode += getMaximumPermissionsEmailTemplateManagement().hashCode();
        }
        if (getMaximumPermissionsEnableNotifications() != null) {
            _hashCode += getMaximumPermissionsEnableNotifications().hashCode();
        }
        if (getMaximumPermissionsExportReport() != null) {
            _hashCode += getMaximumPermissionsExportReport().hashCode();
        }
        if (getMaximumPermissionsFlowUFLRequired() != null) {
            _hashCode += getMaximumPermissionsFlowUFLRequired().hashCode();
        }
        if (getMaximumPermissionsForceTwoFactor() != null) {
            _hashCode += getMaximumPermissionsForceTwoFactor().hashCode();
        }
        if (getMaximumPermissionsGovernNetworks() != null) {
            _hashCode += getMaximumPermissionsGovernNetworks().hashCode();
        }
        if (getMaximumPermissionsIdentityConnect() != null) {
            _hashCode += getMaximumPermissionsIdentityConnect().hashCode();
        }
        if (getMaximumPermissionsIdentityEnabled() != null) {
            _hashCode += getMaximumPermissionsIdentityEnabled().hashCode();
        }
        if (getMaximumPermissionsImportLeads() != null) {
            _hashCode += getMaximumPermissionsImportLeads().hashCode();
        }
        if (getMaximumPermissionsImportPersonal() != null) {
            _hashCode += getMaximumPermissionsImportPersonal().hashCode();
        }
        if (getMaximumPermissionsInstallPackaging() != null) {
            _hashCode += getMaximumPermissionsInstallPackaging().hashCode();
        }
        if (getMaximumPermissionsLightningExperienceUser() != null) {
            _hashCode += getMaximumPermissionsLightningExperienceUser().hashCode();
        }
        if (getMaximumPermissionsManageAnalyticSnapshots() != null) {
            _hashCode += getMaximumPermissionsManageAnalyticSnapshots().hashCode();
        }
        if (getMaximumPermissionsManageAuthProviders() != null) {
            _hashCode += getMaximumPermissionsManageAuthProviders().hashCode();
        }
        if (getMaximumPermissionsManageBusinessHourHolidays() != null) {
            _hashCode += getMaximumPermissionsManageBusinessHourHolidays().hashCode();
        }
        if (getMaximumPermissionsManageCallCenters() != null) {
            _hashCode += getMaximumPermissionsManageCallCenters().hashCode();
        }
        if (getMaximumPermissionsManageCases() != null) {
            _hashCode += getMaximumPermissionsManageCases().hashCode();
        }
        if (getMaximumPermissionsManageCategories() != null) {
            _hashCode += getMaximumPermissionsManageCategories().hashCode();
        }
        if (getMaximumPermissionsManageChatterMessages() != null) {
            _hashCode += getMaximumPermissionsManageChatterMessages().hashCode();
        }
        if (getMaximumPermissionsManageContentPermissions() != null) {
            _hashCode += getMaximumPermissionsManageContentPermissions().hashCode();
        }
        if (getMaximumPermissionsManageContentProperties() != null) {
            _hashCode += getMaximumPermissionsManageContentProperties().hashCode();
        }
        if (getMaximumPermissionsManageContentTypes() != null) {
            _hashCode += getMaximumPermissionsManageContentTypes().hashCode();
        }
        if (getMaximumPermissionsManageCustomPermissions() != null) {
            _hashCode += getMaximumPermissionsManageCustomPermissions().hashCode();
        }
        if (getMaximumPermissionsManageCustomReportTypes() != null) {
            _hashCode += getMaximumPermissionsManageCustomReportTypes().hashCode();
        }
        if (getMaximumPermissionsManageDashbdsInPubFolders() != null) {
            _hashCode += getMaximumPermissionsManageDashbdsInPubFolders().hashCode();
        }
        if (getMaximumPermissionsManageDataCategories() != null) {
            _hashCode += getMaximumPermissionsManageDataCategories().hashCode();
        }
        if (getMaximumPermissionsManageDataIntegrations() != null) {
            _hashCode += getMaximumPermissionsManageDataIntegrations().hashCode();
        }
        if (getMaximumPermissionsManageDynamicDashboards() != null) {
            _hashCode += getMaximumPermissionsManageDynamicDashboards().hashCode();
        }
        if (getMaximumPermissionsManageEmailClientConfig() != null) {
            _hashCode += getMaximumPermissionsManageEmailClientConfig().hashCode();
        }
        if (getMaximumPermissionsManageEncryptionKeys() != null) {
            _hashCode += getMaximumPermissionsManageEncryptionKeys().hashCode();
        }
        if (getMaximumPermissionsManageExchangeConfig() != null) {
            _hashCode += getMaximumPermissionsManageExchangeConfig().hashCode();
        }
        if (getMaximumPermissionsManageInteraction() != null) {
            _hashCode += getMaximumPermissionsManageInteraction().hashCode();
        }
        if (getMaximumPermissionsManageInternalUsers() != null) {
            _hashCode += getMaximumPermissionsManageInternalUsers().hashCode();
        }
        if (getMaximumPermissionsManageIpAddresses() != null) {
            _hashCode += getMaximumPermissionsManageIpAddresses().hashCode();
        }
        if (getMaximumPermissionsManageKnowledge() != null) {
            _hashCode += getMaximumPermissionsManageKnowledge().hashCode();
        }
        if (getMaximumPermissionsManageKnowledgeImportExport() != null) {
            _hashCode += getMaximumPermissionsManageKnowledgeImportExport().hashCode();
        }
        if (getMaximumPermissionsManageLeads() != null) {
            _hashCode += getMaximumPermissionsManageLeads().hashCode();
        }
        if (getMaximumPermissionsManageLoginAccessPolicies() != null) {
            _hashCode += getMaximumPermissionsManageLoginAccessPolicies().hashCode();
        }
        if (getMaximumPermissionsManageMobile() != null) {
            _hashCode += getMaximumPermissionsManageMobile().hashCode();
        }
        if (getMaximumPermissionsManageNetworks() != null) {
            _hashCode += getMaximumPermissionsManageNetworks().hashCode();
        }
        if (getMaximumPermissionsManagePasswordPolicies() != null) {
            _hashCode += getMaximumPermissionsManagePasswordPolicies().hashCode();
        }
        if (getMaximumPermissionsManageProfilesPermissionsets() != null) {
            _hashCode += getMaximumPermissionsManageProfilesPermissionsets().hashCode();
        }
        if (getMaximumPermissionsManageRemoteAccess() != null) {
            _hashCode += getMaximumPermissionsManageRemoteAccess().hashCode();
        }
        if (getMaximumPermissionsManageReportsInPubFolders() != null) {
            _hashCode += getMaximumPermissionsManageReportsInPubFolders().hashCode();
        }
        if (getMaximumPermissionsManageRoles() != null) {
            _hashCode += getMaximumPermissionsManageRoles().hashCode();
        }
        if (getMaximumPermissionsManageSearchPromotionRules() != null) {
            _hashCode += getMaximumPermissionsManageSearchPromotionRules().hashCode();
        }
        if (getMaximumPermissionsManageSharing() != null) {
            _hashCode += getMaximumPermissionsManageSharing().hashCode();
        }
        if (getMaximumPermissionsManageSolutions() != null) {
            _hashCode += getMaximumPermissionsManageSolutions().hashCode();
        }
        if (getMaximumPermissionsManageSynonyms() != null) {
            _hashCode += getMaximumPermissionsManageSynonyms().hashCode();
        }
        if (getMaximumPermissionsManageTwoFactor() != null) {
            _hashCode += getMaximumPermissionsManageTwoFactor().hashCode();
        }
        if (getMaximumPermissionsManageUnlistedGroups() != null) {
            _hashCode += getMaximumPermissionsManageUnlistedGroups().hashCode();
        }
        if (getMaximumPermissionsManageUsers() != null) {
            _hashCode += getMaximumPermissionsManageUsers().hashCode();
        }
        if (getMaximumPermissionsMassInlineEdit() != null) {
            _hashCode += getMaximumPermissionsMassInlineEdit().hashCode();
        }
        if (getMaximumPermissionsMergeTopics() != null) {
            _hashCode += getMaximumPermissionsMergeTopics().hashCode();
        }
        if (getMaximumPermissionsModerateChatter() != null) {
            _hashCode += getMaximumPermissionsModerateChatter().hashCode();
        }
        if (getMaximumPermissionsModifyAllData() != null) {
            _hashCode += getMaximumPermissionsModifyAllData().hashCode();
        }
        if (getMaximumPermissionsModifySecureAgents() != null) {
            _hashCode += getMaximumPermissionsModifySecureAgents().hashCode();
        }
        if (getMaximumPermissionsNewReportBuilder() != null) {
            _hashCode += getMaximumPermissionsNewReportBuilder().hashCode();
        }
        if (getMaximumPermissionsPasswordNeverExpires() != null) {
            _hashCode += getMaximumPermissionsPasswordNeverExpires().hashCode();
        }
        if (getMaximumPermissionsPublishPackaging() != null) {
            _hashCode += getMaximumPermissionsPublishPackaging().hashCode();
        }
        if (getMaximumPermissionsResetPasswords() != null) {
            _hashCode += getMaximumPermissionsResetPasswords().hashCode();
        }
        if (getMaximumPermissionsRunFlow() != null) {
            _hashCode += getMaximumPermissionsRunFlow().hashCode();
        }
        if (getMaximumPermissionsRunReports() != null) {
            _hashCode += getMaximumPermissionsRunReports().hashCode();
        }
        if (getMaximumPermissionsSalesConsole() != null) {
            _hashCode += getMaximumPermissionsSalesConsole().hashCode();
        }
        if (getMaximumPermissionsScheduleReports() != null) {
            _hashCode += getMaximumPermissionsScheduleReports().hashCode();
        }
        if (getMaximumPermissionsSelectFilesFromSalesforce() != null) {
            _hashCode += getMaximumPermissionsSelectFilesFromSalesforce().hashCode();
        }
        if (getMaximumPermissionsSendSitRequests() != null) {
            _hashCode += getMaximumPermissionsSendSitRequests().hashCode();
        }
        if (getMaximumPermissionsShareInternalArticles() != null) {
            _hashCode += getMaximumPermissionsShareInternalArticles().hashCode();
        }
        if (getMaximumPermissionsSolutionImport() != null) {
            _hashCode += getMaximumPermissionsSolutionImport().hashCode();
        }
        if (getMaximumPermissionsSubmitMacrosAllowed() != null) {
            _hashCode += getMaximumPermissionsSubmitMacrosAllowed().hashCode();
        }
        if (getMaximumPermissionsTransferAnyCase() != null) {
            _hashCode += getMaximumPermissionsTransferAnyCase().hashCode();
        }
        if (getMaximumPermissionsTransferAnyEntity() != null) {
            _hashCode += getMaximumPermissionsTransferAnyEntity().hashCode();
        }
        if (getMaximumPermissionsTransferAnyLead() != null) {
            _hashCode += getMaximumPermissionsTransferAnyLead().hashCode();
        }
        if (getMaximumPermissionsTwoFactorApi() != null) {
            _hashCode += getMaximumPermissionsTwoFactorApi().hashCode();
        }
        if (getMaximumPermissionsUseTeamReassignWizards() != null) {
            _hashCode += getMaximumPermissionsUseTeamReassignWizards().hashCode();
        }
        if (getMaximumPermissionsViewAllData() != null) {
            _hashCode += getMaximumPermissionsViewAllData().hashCode();
        }
        if (getMaximumPermissionsViewAllUsers() != null) {
            _hashCode += getMaximumPermissionsViewAllUsers().hashCode();
        }
        if (getMaximumPermissionsViewContent() != null) {
            _hashCode += getMaximumPermissionsViewContent().hashCode();
        }
        if (getMaximumPermissionsViewDataCategories() != null) {
            _hashCode += getMaximumPermissionsViewDataCategories().hashCode();
        }
        if (getMaximumPermissionsViewEncryptedData() != null) {
            _hashCode += getMaximumPermissionsViewEncryptedData().hashCode();
        }
        if (getMaximumPermissionsViewEventLogFiles() != null) {
            _hashCode += getMaximumPermissionsViewEventLogFiles().hashCode();
        }
        if (getMaximumPermissionsViewHelpLink() != null) {
            _hashCode += getMaximumPermissionsViewHelpLink().hashCode();
        }
        if (getMaximumPermissionsViewMyTeamsDashboards() != null) {
            _hashCode += getMaximumPermissionsViewMyTeamsDashboards().hashCode();
        }
        if (getMaximumPermissionsViewPublicDashboards() != null) {
            _hashCode += getMaximumPermissionsViewPublicDashboards().hashCode();
        }
        if (getMaximumPermissionsViewPublicReports() != null) {
            _hashCode += getMaximumPermissionsViewPublicReports().hashCode();
        }
        if (getMaximumPermissionsViewSetup() != null) {
            _hashCode += getMaximumPermissionsViewSetup().hashCode();
        }
        if (getMaximumPermissionsWorkCalibrationUser() != null) {
            _hashCode += getMaximumPermissionsWorkCalibrationUser().hashCode();
        }
        if (getMaximumPermissionsWorkDotComUserPerm() != null) {
            _hashCode += getMaximumPermissionsWorkDotComUserPerm().hashCode();
        }
        if (getPermissionSetLicenseAssignments() != null) {
            _hashCode += getPermissionSetLicenseAssignments().hashCode();
        }
        if (getPermissionSetLicenseKey() != null) {
            _hashCode += getPermissionSetLicenseKey().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTotalLicenses() != null) {
            _hashCode += getTotalLicenses().hashCode();
        }
        if (getUsedLicenses() != null) {
            _hashCode += getUsedLicenses().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSetLicense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantedByLicenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GrantedByLicenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsActivateContract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsActivateContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsActivateOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsActivateOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAllowEmailIC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAllowEmailIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAllowUniversalSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAllowUniversalSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAllowViewKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAllowViewKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsApiEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsApiEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAssignPermissionSets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAssignPermissionSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAssignTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAssignTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsAuthorApex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsAuthorApex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsBulkApiHardDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsBulkApiHardDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsBulkMacrosAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsBulkMacrosAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCanInsertFeedSystemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCanInsertFeedSystemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCanUseNewDashboardBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCanUseNewDashboardBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterEditOwnPost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterEditOwnPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterEditOwnRecordPost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterEditOwnRecordPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterFileLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterFileLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterForSharePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterForSharePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterInternalUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterInternalUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterInviteExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterInviteExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsChatterOwnGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsChatterOwnGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsConfigCustomRecs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsConfigCustomRecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsConnectOrgToEnvironmentHub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsConnectOrgToEnvironmentHub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsContentAdministrator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsContentAdministrator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsConvertLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsConvertLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateCustomizeDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateCustomizeDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateCustomizeFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateCustomizeFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateCustomizeReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateCustomizeReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateDashboardFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateDashboardFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreatePackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreatePackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateReportFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateReportFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCreateWorkspaces");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCreateWorkspaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCustomMobileAppsAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCustomMobileAppsAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCustomSidebarOnAllPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCustomSidebarOnAllPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsCustomizeApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsCustomizeApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsDeleteActivatedContract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsDeleteActivatedContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsDeleteTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsDeleteTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsDistributeFromPersWksp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsDistributeFromPersWksp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditActivatedOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditActivatedOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditBrandTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditBrandTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditCaseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditCaseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditHtmlTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditHtmlTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditMyDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditMyDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditMyReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditMyReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditOppLineItemUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditOppLineItemUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditPublicDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditPublicDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditPublicTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditPublicTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditReadonlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditReadonlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEditTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEditTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEmailAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEmailAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEmailMass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEmailMass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEmailSingle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEmailSingle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEmailTemplateManagement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEmailTemplateManagement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsEnableNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsEnableNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsExportReport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsExportReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsFlowUFLRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsFlowUFLRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsForceTwoFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsForceTwoFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsGovernNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsGovernNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsIdentityConnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsIdentityConnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsIdentityEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsIdentityEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsImportLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsImportLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsImportPersonal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsImportPersonal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsInstallPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsInstallPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsLightningExperienceUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsLightningExperienceUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageAnalyticSnapshots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageAnalyticSnapshots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageAuthProviders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageAuthProviders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageBusinessHourHolidays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageBusinessHourHolidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageCallCenters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageCallCenters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageCases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageChatterMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageChatterMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageContentPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageContentPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageContentProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageContentProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageContentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageContentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageCustomPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageCustomPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageCustomReportTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageCustomReportTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageDashbdsInPubFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageDashbdsInPubFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageDataIntegrations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageDataIntegrations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageDynamicDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageDynamicDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageEmailClientConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageEmailClientConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageEncryptionKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageEncryptionKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageExchangeConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageExchangeConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageInteraction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageInteraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageInternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageInternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageIpAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageIpAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageKnowledgeImportExport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageKnowledgeImportExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageLoginAccessPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageLoginAccessPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManagePasswordPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManagePasswordPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageProfilesPermissionsets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageProfilesPermissionsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageRemoteAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageRemoteAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageReportsInPubFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageReportsInPubFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageSearchPromotionRules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageSearchPromotionRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageSynonyms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageSynonyms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageTwoFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageTwoFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageUnlistedGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageUnlistedGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsManageUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsManageUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsMassInlineEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsMassInlineEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsMergeTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsMergeTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsModerateChatter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsModerateChatter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsModifyAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsModifyAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsModifySecureAgents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsModifySecureAgents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsNewReportBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsNewReportBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsPasswordNeverExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsPasswordNeverExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsPublishPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsPublishPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsResetPasswords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsResetPasswords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsRunFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsRunFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsRunReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsRunReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsSalesConsole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsSalesConsole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsScheduleReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsScheduleReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsSelectFilesFromSalesforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsSelectFilesFromSalesforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsSendSitRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsSendSitRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsShareInternalArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsShareInternalArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsSolutionImport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsSolutionImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsSubmitMacrosAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsSubmitMacrosAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsTransferAnyCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsTransferAnyCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsTransferAnyEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsTransferAnyEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsTransferAnyLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsTransferAnyLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsTwoFactorApi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsTwoFactorApi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsUseTeamReassignWizards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsUseTeamReassignWizards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewAllUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewAllUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewEncryptedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewEncryptedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewEventLogFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewEventLogFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewHelpLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewHelpLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewMyTeamsDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewMyTeamsDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewPublicDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewPublicDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewPublicReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewPublicReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsViewSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsViewSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsWorkCalibrationUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsWorkCalibrationUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPermissionsWorkDotComUserPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaximumPermissionsWorkDotComUserPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("permissionSetLicenseKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicenseKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
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
        elemField.setFieldName("totalLicenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TotalLicenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedLicenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsedLicenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
