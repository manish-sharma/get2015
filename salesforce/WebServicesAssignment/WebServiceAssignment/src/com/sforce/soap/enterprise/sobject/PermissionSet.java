/**
 * PermissionSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class PermissionSet  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult assignments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult fieldPerms;

    private java.lang.Boolean isOwnedByProfile;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    private com.sforce.soap.enterprise.QueryResult objectPerms;

    private java.lang.Boolean permissionsActivateContract;

    private java.lang.Boolean permissionsActivateOrder;

    private java.lang.Boolean permissionsAllowEmailIC;

    private java.lang.Boolean permissionsAllowUniversalSearch;

    private java.lang.Boolean permissionsAllowViewKnowledge;

    private java.lang.Boolean permissionsApiEnabled;

    private java.lang.Boolean permissionsAssignPermissionSets;

    private java.lang.Boolean permissionsAssignTopics;

    private java.lang.Boolean permissionsAuthorApex;

    private java.lang.Boolean permissionsBulkApiHardDelete;

    private java.lang.Boolean permissionsBulkMacrosAllowed;

    private java.lang.Boolean permissionsCanInsertFeedSystemFields;

    private java.lang.Boolean permissionsCanUseNewDashboardBuilder;

    private java.lang.Boolean permissionsChatterEditOwnPost;

    private java.lang.Boolean permissionsChatterEditOwnRecordPost;

    private java.lang.Boolean permissionsChatterFileLink;

    private java.lang.Boolean permissionsChatterForSharePoint;

    private java.lang.Boolean permissionsChatterInternalUser;

    private java.lang.Boolean permissionsChatterInviteExternalUsers;

    private java.lang.Boolean permissionsChatterOwnGroups;

    private java.lang.Boolean permissionsConfigCustomRecs;

    private java.lang.Boolean permissionsConnectOrgToEnvironmentHub;

    private java.lang.Boolean permissionsContentAdministrator;

    private java.lang.Boolean permissionsConvertLeads;

    private java.lang.Boolean permissionsCreateCustomizeDashboards;

    private java.lang.Boolean permissionsCreateCustomizeFilters;

    private java.lang.Boolean permissionsCreateCustomizeReports;

    private java.lang.Boolean permissionsCreateDashboardFolders;

    private java.lang.Boolean permissionsCreatePackaging;

    private java.lang.Boolean permissionsCreateReportFolders;

    private java.lang.Boolean permissionsCreateTopics;

    private java.lang.Boolean permissionsCreateWorkspaces;

    private java.lang.Boolean permissionsCustomMobileAppsAccess;

    private java.lang.Boolean permissionsCustomSidebarOnAllPages;

    private java.lang.Boolean permissionsCustomizeApplication;

    private java.lang.Boolean permissionsDeleteActivatedContract;

    private java.lang.Boolean permissionsDeleteTopics;

    private java.lang.Boolean permissionsDistributeFromPersWksp;

    private java.lang.Boolean permissionsEditActivatedOrders;

    private java.lang.Boolean permissionsEditBrandTemplates;

    private java.lang.Boolean permissionsEditCaseComments;

    private java.lang.Boolean permissionsEditEvent;

    private java.lang.Boolean permissionsEditHtmlTemplates;

    private java.lang.Boolean permissionsEditKnowledge;

    private java.lang.Boolean permissionsEditMyDashboards;

    private java.lang.Boolean permissionsEditMyReports;

    private java.lang.Boolean permissionsEditOppLineItemUnitPrice;

    private java.lang.Boolean permissionsEditPublicDocuments;

    private java.lang.Boolean permissionsEditPublicTemplates;

    private java.lang.Boolean permissionsEditReadonlyFields;

    private java.lang.Boolean permissionsEditTask;

    private java.lang.Boolean permissionsEditTopics;

    private java.lang.Boolean permissionsEmailAdministration;

    private java.lang.Boolean permissionsEmailMass;

    private java.lang.Boolean permissionsEmailSingle;

    private java.lang.Boolean permissionsEmailTemplateManagement;

    private java.lang.Boolean permissionsEnableNotifications;

    private java.lang.Boolean permissionsExportReport;

    private java.lang.Boolean permissionsFlowUFLRequired;

    private java.lang.Boolean permissionsForceTwoFactor;

    private java.lang.Boolean permissionsGovernNetworks;

    private java.lang.Boolean permissionsIdentityConnect;

    private java.lang.Boolean permissionsIdentityEnabled;

    private java.lang.Boolean permissionsImportLeads;

    private java.lang.Boolean permissionsImportPersonal;

    private java.lang.Boolean permissionsInstallPackaging;

    private java.lang.Boolean permissionsLightningExperienceUser;

    private java.lang.Boolean permissionsManageAnalyticSnapshots;

    private java.lang.Boolean permissionsManageAuthProviders;

    private java.lang.Boolean permissionsManageBusinessHourHolidays;

    private java.lang.Boolean permissionsManageCallCenters;

    private java.lang.Boolean permissionsManageCases;

    private java.lang.Boolean permissionsManageCategories;

    private java.lang.Boolean permissionsManageChatterMessages;

    private java.lang.Boolean permissionsManageContentPermissions;

    private java.lang.Boolean permissionsManageContentProperties;

    private java.lang.Boolean permissionsManageContentTypes;

    private java.lang.Boolean permissionsManageCustomPermissions;

    private java.lang.Boolean permissionsManageCustomReportTypes;

    private java.lang.Boolean permissionsManageDashbdsInPubFolders;

    private java.lang.Boolean permissionsManageDataCategories;

    private java.lang.Boolean permissionsManageDataIntegrations;

    private java.lang.Boolean permissionsManageDynamicDashboards;

    private java.lang.Boolean permissionsManageEmailClientConfig;

    private java.lang.Boolean permissionsManageEncryptionKeys;

    private java.lang.Boolean permissionsManageExchangeConfig;

    private java.lang.Boolean permissionsManageInteraction;

    private java.lang.Boolean permissionsManageInternalUsers;

    private java.lang.Boolean permissionsManageIpAddresses;

    private java.lang.Boolean permissionsManageKnowledge;

    private java.lang.Boolean permissionsManageKnowledgeImportExport;

    private java.lang.Boolean permissionsManageLeads;

    private java.lang.Boolean permissionsManageLoginAccessPolicies;

    private java.lang.Boolean permissionsManageMobile;

    private java.lang.Boolean permissionsManageNetworks;

    private java.lang.Boolean permissionsManagePasswordPolicies;

    private java.lang.Boolean permissionsManageProfilesPermissionsets;

    private java.lang.Boolean permissionsManageRemoteAccess;

    private java.lang.Boolean permissionsManageReportsInPubFolders;

    private java.lang.Boolean permissionsManageRoles;

    private java.lang.Boolean permissionsManageSearchPromotionRules;

    private java.lang.Boolean permissionsManageSharing;

    private java.lang.Boolean permissionsManageSolutions;

    private java.lang.Boolean permissionsManageSynonyms;

    private java.lang.Boolean permissionsManageTwoFactor;

    private java.lang.Boolean permissionsManageUnlistedGroups;

    private java.lang.Boolean permissionsManageUsers;

    private java.lang.Boolean permissionsMassInlineEdit;

    private java.lang.Boolean permissionsMergeTopics;

    private java.lang.Boolean permissionsModerateChatter;

    private java.lang.Boolean permissionsModifyAllData;

    private java.lang.Boolean permissionsModifySecureAgents;

    private java.lang.Boolean permissionsNewReportBuilder;

    private java.lang.Boolean permissionsPasswordNeverExpires;

    private java.lang.Boolean permissionsPublishPackaging;

    private java.lang.Boolean permissionsResetPasswords;

    private java.lang.Boolean permissionsRunFlow;

    private java.lang.Boolean permissionsRunReports;

    private java.lang.Boolean permissionsSalesConsole;

    private java.lang.Boolean permissionsScheduleReports;

    private java.lang.Boolean permissionsSelectFilesFromSalesforce;

    private java.lang.Boolean permissionsSendSitRequests;

    private java.lang.Boolean permissionsShareInternalArticles;

    private java.lang.Boolean permissionsSolutionImport;

    private java.lang.Boolean permissionsSubmitMacrosAllowed;

    private java.lang.Boolean permissionsTransferAnyCase;

    private java.lang.Boolean permissionsTransferAnyEntity;

    private java.lang.Boolean permissionsTransferAnyLead;

    private java.lang.Boolean permissionsTwoFactorApi;

    private java.lang.Boolean permissionsUseTeamReassignWizards;

    private java.lang.Boolean permissionsViewAllData;

    private java.lang.Boolean permissionsViewAllUsers;

    private java.lang.Boolean permissionsViewContent;

    private java.lang.Boolean permissionsViewDataCategories;

    private java.lang.Boolean permissionsViewEncryptedData;

    private java.lang.Boolean permissionsViewEventLogFiles;

    private java.lang.Boolean permissionsViewHelpLink;

    private java.lang.Boolean permissionsViewMyTeamsDashboards;

    private java.lang.Boolean permissionsViewPublicDashboards;

    private java.lang.Boolean permissionsViewPublicReports;

    private java.lang.Boolean permissionsViewSetup;

    private java.lang.Boolean permissionsWorkCalibrationUser;

    private java.lang.Boolean permissionsWorkDotComUserPerm;

    private com.sforce.soap.enterprise.sobject.Profile profile;

    private java.lang.String profileId;

    private com.sforce.soap.enterprise.QueryResult setupEntityAccessItems;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.UserLicense userLicense;

    private java.lang.String userLicenseId;

    public PermissionSet() {
    }

    public PermissionSet(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult assignments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult fieldPerms,
           java.lang.Boolean isOwnedByProfile,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String name,
           java.lang.String namespacePrefix,
           com.sforce.soap.enterprise.QueryResult objectPerms,
           java.lang.Boolean permissionsActivateContract,
           java.lang.Boolean permissionsActivateOrder,
           java.lang.Boolean permissionsAllowEmailIC,
           java.lang.Boolean permissionsAllowUniversalSearch,
           java.lang.Boolean permissionsAllowViewKnowledge,
           java.lang.Boolean permissionsApiEnabled,
           java.lang.Boolean permissionsAssignPermissionSets,
           java.lang.Boolean permissionsAssignTopics,
           java.lang.Boolean permissionsAuthorApex,
           java.lang.Boolean permissionsBulkApiHardDelete,
           java.lang.Boolean permissionsBulkMacrosAllowed,
           java.lang.Boolean permissionsCanInsertFeedSystemFields,
           java.lang.Boolean permissionsCanUseNewDashboardBuilder,
           java.lang.Boolean permissionsChatterEditOwnPost,
           java.lang.Boolean permissionsChatterEditOwnRecordPost,
           java.lang.Boolean permissionsChatterFileLink,
           java.lang.Boolean permissionsChatterForSharePoint,
           java.lang.Boolean permissionsChatterInternalUser,
           java.lang.Boolean permissionsChatterInviteExternalUsers,
           java.lang.Boolean permissionsChatterOwnGroups,
           java.lang.Boolean permissionsConfigCustomRecs,
           java.lang.Boolean permissionsConnectOrgToEnvironmentHub,
           java.lang.Boolean permissionsContentAdministrator,
           java.lang.Boolean permissionsConvertLeads,
           java.lang.Boolean permissionsCreateCustomizeDashboards,
           java.lang.Boolean permissionsCreateCustomizeFilters,
           java.lang.Boolean permissionsCreateCustomizeReports,
           java.lang.Boolean permissionsCreateDashboardFolders,
           java.lang.Boolean permissionsCreatePackaging,
           java.lang.Boolean permissionsCreateReportFolders,
           java.lang.Boolean permissionsCreateTopics,
           java.lang.Boolean permissionsCreateWorkspaces,
           java.lang.Boolean permissionsCustomMobileAppsAccess,
           java.lang.Boolean permissionsCustomSidebarOnAllPages,
           java.lang.Boolean permissionsCustomizeApplication,
           java.lang.Boolean permissionsDeleteActivatedContract,
           java.lang.Boolean permissionsDeleteTopics,
           java.lang.Boolean permissionsDistributeFromPersWksp,
           java.lang.Boolean permissionsEditActivatedOrders,
           java.lang.Boolean permissionsEditBrandTemplates,
           java.lang.Boolean permissionsEditCaseComments,
           java.lang.Boolean permissionsEditEvent,
           java.lang.Boolean permissionsEditHtmlTemplates,
           java.lang.Boolean permissionsEditKnowledge,
           java.lang.Boolean permissionsEditMyDashboards,
           java.lang.Boolean permissionsEditMyReports,
           java.lang.Boolean permissionsEditOppLineItemUnitPrice,
           java.lang.Boolean permissionsEditPublicDocuments,
           java.lang.Boolean permissionsEditPublicTemplates,
           java.lang.Boolean permissionsEditReadonlyFields,
           java.lang.Boolean permissionsEditTask,
           java.lang.Boolean permissionsEditTopics,
           java.lang.Boolean permissionsEmailAdministration,
           java.lang.Boolean permissionsEmailMass,
           java.lang.Boolean permissionsEmailSingle,
           java.lang.Boolean permissionsEmailTemplateManagement,
           java.lang.Boolean permissionsEnableNotifications,
           java.lang.Boolean permissionsExportReport,
           java.lang.Boolean permissionsFlowUFLRequired,
           java.lang.Boolean permissionsForceTwoFactor,
           java.lang.Boolean permissionsGovernNetworks,
           java.lang.Boolean permissionsIdentityConnect,
           java.lang.Boolean permissionsIdentityEnabled,
           java.lang.Boolean permissionsImportLeads,
           java.lang.Boolean permissionsImportPersonal,
           java.lang.Boolean permissionsInstallPackaging,
           java.lang.Boolean permissionsLightningExperienceUser,
           java.lang.Boolean permissionsManageAnalyticSnapshots,
           java.lang.Boolean permissionsManageAuthProviders,
           java.lang.Boolean permissionsManageBusinessHourHolidays,
           java.lang.Boolean permissionsManageCallCenters,
           java.lang.Boolean permissionsManageCases,
           java.lang.Boolean permissionsManageCategories,
           java.lang.Boolean permissionsManageChatterMessages,
           java.lang.Boolean permissionsManageContentPermissions,
           java.lang.Boolean permissionsManageContentProperties,
           java.lang.Boolean permissionsManageContentTypes,
           java.lang.Boolean permissionsManageCustomPermissions,
           java.lang.Boolean permissionsManageCustomReportTypes,
           java.lang.Boolean permissionsManageDashbdsInPubFolders,
           java.lang.Boolean permissionsManageDataCategories,
           java.lang.Boolean permissionsManageDataIntegrations,
           java.lang.Boolean permissionsManageDynamicDashboards,
           java.lang.Boolean permissionsManageEmailClientConfig,
           java.lang.Boolean permissionsManageEncryptionKeys,
           java.lang.Boolean permissionsManageExchangeConfig,
           java.lang.Boolean permissionsManageInteraction,
           java.lang.Boolean permissionsManageInternalUsers,
           java.lang.Boolean permissionsManageIpAddresses,
           java.lang.Boolean permissionsManageKnowledge,
           java.lang.Boolean permissionsManageKnowledgeImportExport,
           java.lang.Boolean permissionsManageLeads,
           java.lang.Boolean permissionsManageLoginAccessPolicies,
           java.lang.Boolean permissionsManageMobile,
           java.lang.Boolean permissionsManageNetworks,
           java.lang.Boolean permissionsManagePasswordPolicies,
           java.lang.Boolean permissionsManageProfilesPermissionsets,
           java.lang.Boolean permissionsManageRemoteAccess,
           java.lang.Boolean permissionsManageReportsInPubFolders,
           java.lang.Boolean permissionsManageRoles,
           java.lang.Boolean permissionsManageSearchPromotionRules,
           java.lang.Boolean permissionsManageSharing,
           java.lang.Boolean permissionsManageSolutions,
           java.lang.Boolean permissionsManageSynonyms,
           java.lang.Boolean permissionsManageTwoFactor,
           java.lang.Boolean permissionsManageUnlistedGroups,
           java.lang.Boolean permissionsManageUsers,
           java.lang.Boolean permissionsMassInlineEdit,
           java.lang.Boolean permissionsMergeTopics,
           java.lang.Boolean permissionsModerateChatter,
           java.lang.Boolean permissionsModifyAllData,
           java.lang.Boolean permissionsModifySecureAgents,
           java.lang.Boolean permissionsNewReportBuilder,
           java.lang.Boolean permissionsPasswordNeverExpires,
           java.lang.Boolean permissionsPublishPackaging,
           java.lang.Boolean permissionsResetPasswords,
           java.lang.Boolean permissionsRunFlow,
           java.lang.Boolean permissionsRunReports,
           java.lang.Boolean permissionsSalesConsole,
           java.lang.Boolean permissionsScheduleReports,
           java.lang.Boolean permissionsSelectFilesFromSalesforce,
           java.lang.Boolean permissionsSendSitRequests,
           java.lang.Boolean permissionsShareInternalArticles,
           java.lang.Boolean permissionsSolutionImport,
           java.lang.Boolean permissionsSubmitMacrosAllowed,
           java.lang.Boolean permissionsTransferAnyCase,
           java.lang.Boolean permissionsTransferAnyEntity,
           java.lang.Boolean permissionsTransferAnyLead,
           java.lang.Boolean permissionsTwoFactorApi,
           java.lang.Boolean permissionsUseTeamReassignWizards,
           java.lang.Boolean permissionsViewAllData,
           java.lang.Boolean permissionsViewAllUsers,
           java.lang.Boolean permissionsViewContent,
           java.lang.Boolean permissionsViewDataCategories,
           java.lang.Boolean permissionsViewEncryptedData,
           java.lang.Boolean permissionsViewEventLogFiles,
           java.lang.Boolean permissionsViewHelpLink,
           java.lang.Boolean permissionsViewMyTeamsDashboards,
           java.lang.Boolean permissionsViewPublicDashboards,
           java.lang.Boolean permissionsViewPublicReports,
           java.lang.Boolean permissionsViewSetup,
           java.lang.Boolean permissionsWorkCalibrationUser,
           java.lang.Boolean permissionsWorkDotComUserPerm,
           com.sforce.soap.enterprise.sobject.Profile profile,
           java.lang.String profileId,
           com.sforce.soap.enterprise.QueryResult setupEntityAccessItems,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.UserLicense userLicense,
           java.lang.String userLicenseId) {
        super(
            fieldsToNull,
            id);
        this.assignments = assignments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.fieldPerms = fieldPerms;
        this.isOwnedByProfile = isOwnedByProfile;
        this.label = label;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
        this.objectPerms = objectPerms;
        this.permissionsActivateContract = permissionsActivateContract;
        this.permissionsActivateOrder = permissionsActivateOrder;
        this.permissionsAllowEmailIC = permissionsAllowEmailIC;
        this.permissionsAllowUniversalSearch = permissionsAllowUniversalSearch;
        this.permissionsAllowViewKnowledge = permissionsAllowViewKnowledge;
        this.permissionsApiEnabled = permissionsApiEnabled;
        this.permissionsAssignPermissionSets = permissionsAssignPermissionSets;
        this.permissionsAssignTopics = permissionsAssignTopics;
        this.permissionsAuthorApex = permissionsAuthorApex;
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
        this.permissionsBulkMacrosAllowed = permissionsBulkMacrosAllowed;
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
        this.permissionsCanUseNewDashboardBuilder = permissionsCanUseNewDashboardBuilder;
        this.permissionsChatterEditOwnPost = permissionsChatterEditOwnPost;
        this.permissionsChatterEditOwnRecordPost = permissionsChatterEditOwnRecordPost;
        this.permissionsChatterFileLink = permissionsChatterFileLink;
        this.permissionsChatterForSharePoint = permissionsChatterForSharePoint;
        this.permissionsChatterInternalUser = permissionsChatterInternalUser;
        this.permissionsChatterInviteExternalUsers = permissionsChatterInviteExternalUsers;
        this.permissionsChatterOwnGroups = permissionsChatterOwnGroups;
        this.permissionsConfigCustomRecs = permissionsConfigCustomRecs;
        this.permissionsConnectOrgToEnvironmentHub = permissionsConnectOrgToEnvironmentHub;
        this.permissionsContentAdministrator = permissionsContentAdministrator;
        this.permissionsConvertLeads = permissionsConvertLeads;
        this.permissionsCreateCustomizeDashboards = permissionsCreateCustomizeDashboards;
        this.permissionsCreateCustomizeFilters = permissionsCreateCustomizeFilters;
        this.permissionsCreateCustomizeReports = permissionsCreateCustomizeReports;
        this.permissionsCreateDashboardFolders = permissionsCreateDashboardFolders;
        this.permissionsCreatePackaging = permissionsCreatePackaging;
        this.permissionsCreateReportFolders = permissionsCreateReportFolders;
        this.permissionsCreateTopics = permissionsCreateTopics;
        this.permissionsCreateWorkspaces = permissionsCreateWorkspaces;
        this.permissionsCustomMobileAppsAccess = permissionsCustomMobileAppsAccess;
        this.permissionsCustomSidebarOnAllPages = permissionsCustomSidebarOnAllPages;
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
        this.permissionsDeleteActivatedContract = permissionsDeleteActivatedContract;
        this.permissionsDeleteTopics = permissionsDeleteTopics;
        this.permissionsDistributeFromPersWksp = permissionsDistributeFromPersWksp;
        this.permissionsEditActivatedOrders = permissionsEditActivatedOrders;
        this.permissionsEditBrandTemplates = permissionsEditBrandTemplates;
        this.permissionsEditCaseComments = permissionsEditCaseComments;
        this.permissionsEditEvent = permissionsEditEvent;
        this.permissionsEditHtmlTemplates = permissionsEditHtmlTemplates;
        this.permissionsEditKnowledge = permissionsEditKnowledge;
        this.permissionsEditMyDashboards = permissionsEditMyDashboards;
        this.permissionsEditMyReports = permissionsEditMyReports;
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
        this.permissionsEditPublicTemplates = permissionsEditPublicTemplates;
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
        this.permissionsEditTask = permissionsEditTask;
        this.permissionsEditTopics = permissionsEditTopics;
        this.permissionsEmailAdministration = permissionsEmailAdministration;
        this.permissionsEmailMass = permissionsEmailMass;
        this.permissionsEmailSingle = permissionsEmailSingle;
        this.permissionsEmailTemplateManagement = permissionsEmailTemplateManagement;
        this.permissionsEnableNotifications = permissionsEnableNotifications;
        this.permissionsExportReport = permissionsExportReport;
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
        this.permissionsForceTwoFactor = permissionsForceTwoFactor;
        this.permissionsGovernNetworks = permissionsGovernNetworks;
        this.permissionsIdentityConnect = permissionsIdentityConnect;
        this.permissionsIdentityEnabled = permissionsIdentityEnabled;
        this.permissionsImportLeads = permissionsImportLeads;
        this.permissionsImportPersonal = permissionsImportPersonal;
        this.permissionsInstallPackaging = permissionsInstallPackaging;
        this.permissionsLightningExperienceUser = permissionsLightningExperienceUser;
        this.permissionsManageAnalyticSnapshots = permissionsManageAnalyticSnapshots;
        this.permissionsManageAuthProviders = permissionsManageAuthProviders;
        this.permissionsManageBusinessHourHolidays = permissionsManageBusinessHourHolidays;
        this.permissionsManageCallCenters = permissionsManageCallCenters;
        this.permissionsManageCases = permissionsManageCases;
        this.permissionsManageCategories = permissionsManageCategories;
        this.permissionsManageChatterMessages = permissionsManageChatterMessages;
        this.permissionsManageContentPermissions = permissionsManageContentPermissions;
        this.permissionsManageContentProperties = permissionsManageContentProperties;
        this.permissionsManageContentTypes = permissionsManageContentTypes;
        this.permissionsManageCustomPermissions = permissionsManageCustomPermissions;
        this.permissionsManageCustomReportTypes = permissionsManageCustomReportTypes;
        this.permissionsManageDashbdsInPubFolders = permissionsManageDashbdsInPubFolders;
        this.permissionsManageDataCategories = permissionsManageDataCategories;
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
        this.permissionsManageDynamicDashboards = permissionsManageDynamicDashboards;
        this.permissionsManageEmailClientConfig = permissionsManageEmailClientConfig;
        this.permissionsManageEncryptionKeys = permissionsManageEncryptionKeys;
        this.permissionsManageExchangeConfig = permissionsManageExchangeConfig;
        this.permissionsManageInteraction = permissionsManageInteraction;
        this.permissionsManageInternalUsers = permissionsManageInternalUsers;
        this.permissionsManageIpAddresses = permissionsManageIpAddresses;
        this.permissionsManageKnowledge = permissionsManageKnowledge;
        this.permissionsManageKnowledgeImportExport = permissionsManageKnowledgeImportExport;
        this.permissionsManageLeads = permissionsManageLeads;
        this.permissionsManageLoginAccessPolicies = permissionsManageLoginAccessPolicies;
        this.permissionsManageMobile = permissionsManageMobile;
        this.permissionsManageNetworks = permissionsManageNetworks;
        this.permissionsManagePasswordPolicies = permissionsManagePasswordPolicies;
        this.permissionsManageProfilesPermissionsets = permissionsManageProfilesPermissionsets;
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
        this.permissionsManageReportsInPubFolders = permissionsManageReportsInPubFolders;
        this.permissionsManageRoles = permissionsManageRoles;
        this.permissionsManageSearchPromotionRules = permissionsManageSearchPromotionRules;
        this.permissionsManageSharing = permissionsManageSharing;
        this.permissionsManageSolutions = permissionsManageSolutions;
        this.permissionsManageSynonyms = permissionsManageSynonyms;
        this.permissionsManageTwoFactor = permissionsManageTwoFactor;
        this.permissionsManageUnlistedGroups = permissionsManageUnlistedGroups;
        this.permissionsManageUsers = permissionsManageUsers;
        this.permissionsMassInlineEdit = permissionsMassInlineEdit;
        this.permissionsMergeTopics = permissionsMergeTopics;
        this.permissionsModerateChatter = permissionsModerateChatter;
        this.permissionsModifyAllData = permissionsModifyAllData;
        this.permissionsModifySecureAgents = permissionsModifySecureAgents;
        this.permissionsNewReportBuilder = permissionsNewReportBuilder;
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
        this.permissionsPublishPackaging = permissionsPublishPackaging;
        this.permissionsResetPasswords = permissionsResetPasswords;
        this.permissionsRunFlow = permissionsRunFlow;
        this.permissionsRunReports = permissionsRunReports;
        this.permissionsSalesConsole = permissionsSalesConsole;
        this.permissionsScheduleReports = permissionsScheduleReports;
        this.permissionsSelectFilesFromSalesforce = permissionsSelectFilesFromSalesforce;
        this.permissionsSendSitRequests = permissionsSendSitRequests;
        this.permissionsShareInternalArticles = permissionsShareInternalArticles;
        this.permissionsSolutionImport = permissionsSolutionImport;
        this.permissionsSubmitMacrosAllowed = permissionsSubmitMacrosAllowed;
        this.permissionsTransferAnyCase = permissionsTransferAnyCase;
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
        this.permissionsTwoFactorApi = permissionsTwoFactorApi;
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
        this.permissionsViewAllData = permissionsViewAllData;
        this.permissionsViewAllUsers = permissionsViewAllUsers;
        this.permissionsViewContent = permissionsViewContent;
        this.permissionsViewDataCategories = permissionsViewDataCategories;
        this.permissionsViewEncryptedData = permissionsViewEncryptedData;
        this.permissionsViewEventLogFiles = permissionsViewEventLogFiles;
        this.permissionsViewHelpLink = permissionsViewHelpLink;
        this.permissionsViewMyTeamsDashboards = permissionsViewMyTeamsDashboards;
        this.permissionsViewPublicDashboards = permissionsViewPublicDashboards;
        this.permissionsViewPublicReports = permissionsViewPublicReports;
        this.permissionsViewSetup = permissionsViewSetup;
        this.permissionsWorkCalibrationUser = permissionsWorkCalibrationUser;
        this.permissionsWorkDotComUserPerm = permissionsWorkDotComUserPerm;
        this.profile = profile;
        this.profileId = profileId;
        this.setupEntityAccessItems = setupEntityAccessItems;
        this.systemModstamp = systemModstamp;
        this.userLicense = userLicense;
        this.userLicenseId = userLicenseId;
    }


    /**
     * Gets the assignments value for this PermissionSet.
     * 
     * @return assignments
     */
    public com.sforce.soap.enterprise.QueryResult getAssignments() {
        return assignments;
    }


    /**
     * Sets the assignments value for this PermissionSet.
     * 
     * @param assignments
     */
    public void setAssignments(com.sforce.soap.enterprise.QueryResult assignments) {
        this.assignments = assignments;
    }


    /**
     * Gets the createdBy value for this PermissionSet.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this PermissionSet.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this PermissionSet.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this PermissionSet.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this PermissionSet.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this PermissionSet.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this PermissionSet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PermissionSet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the fieldPerms value for this PermissionSet.
     * 
     * @return fieldPerms
     */
    public com.sforce.soap.enterprise.QueryResult getFieldPerms() {
        return fieldPerms;
    }


    /**
     * Sets the fieldPerms value for this PermissionSet.
     * 
     * @param fieldPerms
     */
    public void setFieldPerms(com.sforce.soap.enterprise.QueryResult fieldPerms) {
        this.fieldPerms = fieldPerms;
    }


    /**
     * Gets the isOwnedByProfile value for this PermissionSet.
     * 
     * @return isOwnedByProfile
     */
    public java.lang.Boolean getIsOwnedByProfile() {
        return isOwnedByProfile;
    }


    /**
     * Sets the isOwnedByProfile value for this PermissionSet.
     * 
     * @param isOwnedByProfile
     */
    public void setIsOwnedByProfile(java.lang.Boolean isOwnedByProfile) {
        this.isOwnedByProfile = isOwnedByProfile;
    }


    /**
     * Gets the label value for this PermissionSet.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this PermissionSet.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedBy value for this PermissionSet.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this PermissionSet.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this PermissionSet.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this PermissionSet.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this PermissionSet.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PermissionSet.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the name value for this PermissionSet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PermissionSet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this PermissionSet.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this PermissionSet.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the objectPerms value for this PermissionSet.
     * 
     * @return objectPerms
     */
    public com.sforce.soap.enterprise.QueryResult getObjectPerms() {
        return objectPerms;
    }


    /**
     * Sets the objectPerms value for this PermissionSet.
     * 
     * @param objectPerms
     */
    public void setObjectPerms(com.sforce.soap.enterprise.QueryResult objectPerms) {
        this.objectPerms = objectPerms;
    }


    /**
     * Gets the permissionsActivateContract value for this PermissionSet.
     * 
     * @return permissionsActivateContract
     */
    public java.lang.Boolean getPermissionsActivateContract() {
        return permissionsActivateContract;
    }


    /**
     * Sets the permissionsActivateContract value for this PermissionSet.
     * 
     * @param permissionsActivateContract
     */
    public void setPermissionsActivateContract(java.lang.Boolean permissionsActivateContract) {
        this.permissionsActivateContract = permissionsActivateContract;
    }


    /**
     * Gets the permissionsActivateOrder value for this PermissionSet.
     * 
     * @return permissionsActivateOrder
     */
    public java.lang.Boolean getPermissionsActivateOrder() {
        return permissionsActivateOrder;
    }


    /**
     * Sets the permissionsActivateOrder value for this PermissionSet.
     * 
     * @param permissionsActivateOrder
     */
    public void setPermissionsActivateOrder(java.lang.Boolean permissionsActivateOrder) {
        this.permissionsActivateOrder = permissionsActivateOrder;
    }


    /**
     * Gets the permissionsAllowEmailIC value for this PermissionSet.
     * 
     * @return permissionsAllowEmailIC
     */
    public java.lang.Boolean getPermissionsAllowEmailIC() {
        return permissionsAllowEmailIC;
    }


    /**
     * Sets the permissionsAllowEmailIC value for this PermissionSet.
     * 
     * @param permissionsAllowEmailIC
     */
    public void setPermissionsAllowEmailIC(java.lang.Boolean permissionsAllowEmailIC) {
        this.permissionsAllowEmailIC = permissionsAllowEmailIC;
    }


    /**
     * Gets the permissionsAllowUniversalSearch value for this PermissionSet.
     * 
     * @return permissionsAllowUniversalSearch
     */
    public java.lang.Boolean getPermissionsAllowUniversalSearch() {
        return permissionsAllowUniversalSearch;
    }


    /**
     * Sets the permissionsAllowUniversalSearch value for this PermissionSet.
     * 
     * @param permissionsAllowUniversalSearch
     */
    public void setPermissionsAllowUniversalSearch(java.lang.Boolean permissionsAllowUniversalSearch) {
        this.permissionsAllowUniversalSearch = permissionsAllowUniversalSearch;
    }


    /**
     * Gets the permissionsAllowViewKnowledge value for this PermissionSet.
     * 
     * @return permissionsAllowViewKnowledge
     */
    public java.lang.Boolean getPermissionsAllowViewKnowledge() {
        return permissionsAllowViewKnowledge;
    }


    /**
     * Sets the permissionsAllowViewKnowledge value for this PermissionSet.
     * 
     * @param permissionsAllowViewKnowledge
     */
    public void setPermissionsAllowViewKnowledge(java.lang.Boolean permissionsAllowViewKnowledge) {
        this.permissionsAllowViewKnowledge = permissionsAllowViewKnowledge;
    }


    /**
     * Gets the permissionsApiEnabled value for this PermissionSet.
     * 
     * @return permissionsApiEnabled
     */
    public java.lang.Boolean getPermissionsApiEnabled() {
        return permissionsApiEnabled;
    }


    /**
     * Sets the permissionsApiEnabled value for this PermissionSet.
     * 
     * @param permissionsApiEnabled
     */
    public void setPermissionsApiEnabled(java.lang.Boolean permissionsApiEnabled) {
        this.permissionsApiEnabled = permissionsApiEnabled;
    }


    /**
     * Gets the permissionsAssignPermissionSets value for this PermissionSet.
     * 
     * @return permissionsAssignPermissionSets
     */
    public java.lang.Boolean getPermissionsAssignPermissionSets() {
        return permissionsAssignPermissionSets;
    }


    /**
     * Sets the permissionsAssignPermissionSets value for this PermissionSet.
     * 
     * @param permissionsAssignPermissionSets
     */
    public void setPermissionsAssignPermissionSets(java.lang.Boolean permissionsAssignPermissionSets) {
        this.permissionsAssignPermissionSets = permissionsAssignPermissionSets;
    }


    /**
     * Gets the permissionsAssignTopics value for this PermissionSet.
     * 
     * @return permissionsAssignTopics
     */
    public java.lang.Boolean getPermissionsAssignTopics() {
        return permissionsAssignTopics;
    }


    /**
     * Sets the permissionsAssignTopics value for this PermissionSet.
     * 
     * @param permissionsAssignTopics
     */
    public void setPermissionsAssignTopics(java.lang.Boolean permissionsAssignTopics) {
        this.permissionsAssignTopics = permissionsAssignTopics;
    }


    /**
     * Gets the permissionsAuthorApex value for this PermissionSet.
     * 
     * @return permissionsAuthorApex
     */
    public java.lang.Boolean getPermissionsAuthorApex() {
        return permissionsAuthorApex;
    }


    /**
     * Sets the permissionsAuthorApex value for this PermissionSet.
     * 
     * @param permissionsAuthorApex
     */
    public void setPermissionsAuthorApex(java.lang.Boolean permissionsAuthorApex) {
        this.permissionsAuthorApex = permissionsAuthorApex;
    }


    /**
     * Gets the permissionsBulkApiHardDelete value for this PermissionSet.
     * 
     * @return permissionsBulkApiHardDelete
     */
    public java.lang.Boolean getPermissionsBulkApiHardDelete() {
        return permissionsBulkApiHardDelete;
    }


    /**
     * Sets the permissionsBulkApiHardDelete value for this PermissionSet.
     * 
     * @param permissionsBulkApiHardDelete
     */
    public void setPermissionsBulkApiHardDelete(java.lang.Boolean permissionsBulkApiHardDelete) {
        this.permissionsBulkApiHardDelete = permissionsBulkApiHardDelete;
    }


    /**
     * Gets the permissionsBulkMacrosAllowed value for this PermissionSet.
     * 
     * @return permissionsBulkMacrosAllowed
     */
    public java.lang.Boolean getPermissionsBulkMacrosAllowed() {
        return permissionsBulkMacrosAllowed;
    }


    /**
     * Sets the permissionsBulkMacrosAllowed value for this PermissionSet.
     * 
     * @param permissionsBulkMacrosAllowed
     */
    public void setPermissionsBulkMacrosAllowed(java.lang.Boolean permissionsBulkMacrosAllowed) {
        this.permissionsBulkMacrosAllowed = permissionsBulkMacrosAllowed;
    }


    /**
     * Gets the permissionsCanInsertFeedSystemFields value for this PermissionSet.
     * 
     * @return permissionsCanInsertFeedSystemFields
     */
    public java.lang.Boolean getPermissionsCanInsertFeedSystemFields() {
        return permissionsCanInsertFeedSystemFields;
    }


    /**
     * Sets the permissionsCanInsertFeedSystemFields value for this PermissionSet.
     * 
     * @param permissionsCanInsertFeedSystemFields
     */
    public void setPermissionsCanInsertFeedSystemFields(java.lang.Boolean permissionsCanInsertFeedSystemFields) {
        this.permissionsCanInsertFeedSystemFields = permissionsCanInsertFeedSystemFields;
    }


    /**
     * Gets the permissionsCanUseNewDashboardBuilder value for this PermissionSet.
     * 
     * @return permissionsCanUseNewDashboardBuilder
     */
    public java.lang.Boolean getPermissionsCanUseNewDashboardBuilder() {
        return permissionsCanUseNewDashboardBuilder;
    }


    /**
     * Sets the permissionsCanUseNewDashboardBuilder value for this PermissionSet.
     * 
     * @param permissionsCanUseNewDashboardBuilder
     */
    public void setPermissionsCanUseNewDashboardBuilder(java.lang.Boolean permissionsCanUseNewDashboardBuilder) {
        this.permissionsCanUseNewDashboardBuilder = permissionsCanUseNewDashboardBuilder;
    }


    /**
     * Gets the permissionsChatterEditOwnPost value for this PermissionSet.
     * 
     * @return permissionsChatterEditOwnPost
     */
    public java.lang.Boolean getPermissionsChatterEditOwnPost() {
        return permissionsChatterEditOwnPost;
    }


    /**
     * Sets the permissionsChatterEditOwnPost value for this PermissionSet.
     * 
     * @param permissionsChatterEditOwnPost
     */
    public void setPermissionsChatterEditOwnPost(java.lang.Boolean permissionsChatterEditOwnPost) {
        this.permissionsChatterEditOwnPost = permissionsChatterEditOwnPost;
    }


    /**
     * Gets the permissionsChatterEditOwnRecordPost value for this PermissionSet.
     * 
     * @return permissionsChatterEditOwnRecordPost
     */
    public java.lang.Boolean getPermissionsChatterEditOwnRecordPost() {
        return permissionsChatterEditOwnRecordPost;
    }


    /**
     * Sets the permissionsChatterEditOwnRecordPost value for this PermissionSet.
     * 
     * @param permissionsChatterEditOwnRecordPost
     */
    public void setPermissionsChatterEditOwnRecordPost(java.lang.Boolean permissionsChatterEditOwnRecordPost) {
        this.permissionsChatterEditOwnRecordPost = permissionsChatterEditOwnRecordPost;
    }


    /**
     * Gets the permissionsChatterFileLink value for this PermissionSet.
     * 
     * @return permissionsChatterFileLink
     */
    public java.lang.Boolean getPermissionsChatterFileLink() {
        return permissionsChatterFileLink;
    }


    /**
     * Sets the permissionsChatterFileLink value for this PermissionSet.
     * 
     * @param permissionsChatterFileLink
     */
    public void setPermissionsChatterFileLink(java.lang.Boolean permissionsChatterFileLink) {
        this.permissionsChatterFileLink = permissionsChatterFileLink;
    }


    /**
     * Gets the permissionsChatterForSharePoint value for this PermissionSet.
     * 
     * @return permissionsChatterForSharePoint
     */
    public java.lang.Boolean getPermissionsChatterForSharePoint() {
        return permissionsChatterForSharePoint;
    }


    /**
     * Sets the permissionsChatterForSharePoint value for this PermissionSet.
     * 
     * @param permissionsChatterForSharePoint
     */
    public void setPermissionsChatterForSharePoint(java.lang.Boolean permissionsChatterForSharePoint) {
        this.permissionsChatterForSharePoint = permissionsChatterForSharePoint;
    }


    /**
     * Gets the permissionsChatterInternalUser value for this PermissionSet.
     * 
     * @return permissionsChatterInternalUser
     */
    public java.lang.Boolean getPermissionsChatterInternalUser() {
        return permissionsChatterInternalUser;
    }


    /**
     * Sets the permissionsChatterInternalUser value for this PermissionSet.
     * 
     * @param permissionsChatterInternalUser
     */
    public void setPermissionsChatterInternalUser(java.lang.Boolean permissionsChatterInternalUser) {
        this.permissionsChatterInternalUser = permissionsChatterInternalUser;
    }


    /**
     * Gets the permissionsChatterInviteExternalUsers value for this PermissionSet.
     * 
     * @return permissionsChatterInviteExternalUsers
     */
    public java.lang.Boolean getPermissionsChatterInviteExternalUsers() {
        return permissionsChatterInviteExternalUsers;
    }


    /**
     * Sets the permissionsChatterInviteExternalUsers value for this PermissionSet.
     * 
     * @param permissionsChatterInviteExternalUsers
     */
    public void setPermissionsChatterInviteExternalUsers(java.lang.Boolean permissionsChatterInviteExternalUsers) {
        this.permissionsChatterInviteExternalUsers = permissionsChatterInviteExternalUsers;
    }


    /**
     * Gets the permissionsChatterOwnGroups value for this PermissionSet.
     * 
     * @return permissionsChatterOwnGroups
     */
    public java.lang.Boolean getPermissionsChatterOwnGroups() {
        return permissionsChatterOwnGroups;
    }


    /**
     * Sets the permissionsChatterOwnGroups value for this PermissionSet.
     * 
     * @param permissionsChatterOwnGroups
     */
    public void setPermissionsChatterOwnGroups(java.lang.Boolean permissionsChatterOwnGroups) {
        this.permissionsChatterOwnGroups = permissionsChatterOwnGroups;
    }


    /**
     * Gets the permissionsConfigCustomRecs value for this PermissionSet.
     * 
     * @return permissionsConfigCustomRecs
     */
    public java.lang.Boolean getPermissionsConfigCustomRecs() {
        return permissionsConfigCustomRecs;
    }


    /**
     * Sets the permissionsConfigCustomRecs value for this PermissionSet.
     * 
     * @param permissionsConfigCustomRecs
     */
    public void setPermissionsConfigCustomRecs(java.lang.Boolean permissionsConfigCustomRecs) {
        this.permissionsConfigCustomRecs = permissionsConfigCustomRecs;
    }


    /**
     * Gets the permissionsConnectOrgToEnvironmentHub value for this PermissionSet.
     * 
     * @return permissionsConnectOrgToEnvironmentHub
     */
    public java.lang.Boolean getPermissionsConnectOrgToEnvironmentHub() {
        return permissionsConnectOrgToEnvironmentHub;
    }


    /**
     * Sets the permissionsConnectOrgToEnvironmentHub value for this PermissionSet.
     * 
     * @param permissionsConnectOrgToEnvironmentHub
     */
    public void setPermissionsConnectOrgToEnvironmentHub(java.lang.Boolean permissionsConnectOrgToEnvironmentHub) {
        this.permissionsConnectOrgToEnvironmentHub = permissionsConnectOrgToEnvironmentHub;
    }


    /**
     * Gets the permissionsContentAdministrator value for this PermissionSet.
     * 
     * @return permissionsContentAdministrator
     */
    public java.lang.Boolean getPermissionsContentAdministrator() {
        return permissionsContentAdministrator;
    }


    /**
     * Sets the permissionsContentAdministrator value for this PermissionSet.
     * 
     * @param permissionsContentAdministrator
     */
    public void setPermissionsContentAdministrator(java.lang.Boolean permissionsContentAdministrator) {
        this.permissionsContentAdministrator = permissionsContentAdministrator;
    }


    /**
     * Gets the permissionsConvertLeads value for this PermissionSet.
     * 
     * @return permissionsConvertLeads
     */
    public java.lang.Boolean getPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }


    /**
     * Sets the permissionsConvertLeads value for this PermissionSet.
     * 
     * @param permissionsConvertLeads
     */
    public void setPermissionsConvertLeads(java.lang.Boolean permissionsConvertLeads) {
        this.permissionsConvertLeads = permissionsConvertLeads;
    }


    /**
     * Gets the permissionsCreateCustomizeDashboards value for this PermissionSet.
     * 
     * @return permissionsCreateCustomizeDashboards
     */
    public java.lang.Boolean getPermissionsCreateCustomizeDashboards() {
        return permissionsCreateCustomizeDashboards;
    }


    /**
     * Sets the permissionsCreateCustomizeDashboards value for this PermissionSet.
     * 
     * @param permissionsCreateCustomizeDashboards
     */
    public void setPermissionsCreateCustomizeDashboards(java.lang.Boolean permissionsCreateCustomizeDashboards) {
        this.permissionsCreateCustomizeDashboards = permissionsCreateCustomizeDashboards;
    }


    /**
     * Gets the permissionsCreateCustomizeFilters value for this PermissionSet.
     * 
     * @return permissionsCreateCustomizeFilters
     */
    public java.lang.Boolean getPermissionsCreateCustomizeFilters() {
        return permissionsCreateCustomizeFilters;
    }


    /**
     * Sets the permissionsCreateCustomizeFilters value for this PermissionSet.
     * 
     * @param permissionsCreateCustomizeFilters
     */
    public void setPermissionsCreateCustomizeFilters(java.lang.Boolean permissionsCreateCustomizeFilters) {
        this.permissionsCreateCustomizeFilters = permissionsCreateCustomizeFilters;
    }


    /**
     * Gets the permissionsCreateCustomizeReports value for this PermissionSet.
     * 
     * @return permissionsCreateCustomizeReports
     */
    public java.lang.Boolean getPermissionsCreateCustomizeReports() {
        return permissionsCreateCustomizeReports;
    }


    /**
     * Sets the permissionsCreateCustomizeReports value for this PermissionSet.
     * 
     * @param permissionsCreateCustomizeReports
     */
    public void setPermissionsCreateCustomizeReports(java.lang.Boolean permissionsCreateCustomizeReports) {
        this.permissionsCreateCustomizeReports = permissionsCreateCustomizeReports;
    }


    /**
     * Gets the permissionsCreateDashboardFolders value for this PermissionSet.
     * 
     * @return permissionsCreateDashboardFolders
     */
    public java.lang.Boolean getPermissionsCreateDashboardFolders() {
        return permissionsCreateDashboardFolders;
    }


    /**
     * Sets the permissionsCreateDashboardFolders value for this PermissionSet.
     * 
     * @param permissionsCreateDashboardFolders
     */
    public void setPermissionsCreateDashboardFolders(java.lang.Boolean permissionsCreateDashboardFolders) {
        this.permissionsCreateDashboardFolders = permissionsCreateDashboardFolders;
    }


    /**
     * Gets the permissionsCreatePackaging value for this PermissionSet.
     * 
     * @return permissionsCreatePackaging
     */
    public java.lang.Boolean getPermissionsCreatePackaging() {
        return permissionsCreatePackaging;
    }


    /**
     * Sets the permissionsCreatePackaging value for this PermissionSet.
     * 
     * @param permissionsCreatePackaging
     */
    public void setPermissionsCreatePackaging(java.lang.Boolean permissionsCreatePackaging) {
        this.permissionsCreatePackaging = permissionsCreatePackaging;
    }


    /**
     * Gets the permissionsCreateReportFolders value for this PermissionSet.
     * 
     * @return permissionsCreateReportFolders
     */
    public java.lang.Boolean getPermissionsCreateReportFolders() {
        return permissionsCreateReportFolders;
    }


    /**
     * Sets the permissionsCreateReportFolders value for this PermissionSet.
     * 
     * @param permissionsCreateReportFolders
     */
    public void setPermissionsCreateReportFolders(java.lang.Boolean permissionsCreateReportFolders) {
        this.permissionsCreateReportFolders = permissionsCreateReportFolders;
    }


    /**
     * Gets the permissionsCreateTopics value for this PermissionSet.
     * 
     * @return permissionsCreateTopics
     */
    public java.lang.Boolean getPermissionsCreateTopics() {
        return permissionsCreateTopics;
    }


    /**
     * Sets the permissionsCreateTopics value for this PermissionSet.
     * 
     * @param permissionsCreateTopics
     */
    public void setPermissionsCreateTopics(java.lang.Boolean permissionsCreateTopics) {
        this.permissionsCreateTopics = permissionsCreateTopics;
    }


    /**
     * Gets the permissionsCreateWorkspaces value for this PermissionSet.
     * 
     * @return permissionsCreateWorkspaces
     */
    public java.lang.Boolean getPermissionsCreateWorkspaces() {
        return permissionsCreateWorkspaces;
    }


    /**
     * Sets the permissionsCreateWorkspaces value for this PermissionSet.
     * 
     * @param permissionsCreateWorkspaces
     */
    public void setPermissionsCreateWorkspaces(java.lang.Boolean permissionsCreateWorkspaces) {
        this.permissionsCreateWorkspaces = permissionsCreateWorkspaces;
    }


    /**
     * Gets the permissionsCustomMobileAppsAccess value for this PermissionSet.
     * 
     * @return permissionsCustomMobileAppsAccess
     */
    public java.lang.Boolean getPermissionsCustomMobileAppsAccess() {
        return permissionsCustomMobileAppsAccess;
    }


    /**
     * Sets the permissionsCustomMobileAppsAccess value for this PermissionSet.
     * 
     * @param permissionsCustomMobileAppsAccess
     */
    public void setPermissionsCustomMobileAppsAccess(java.lang.Boolean permissionsCustomMobileAppsAccess) {
        this.permissionsCustomMobileAppsAccess = permissionsCustomMobileAppsAccess;
    }


    /**
     * Gets the permissionsCustomSidebarOnAllPages value for this PermissionSet.
     * 
     * @return permissionsCustomSidebarOnAllPages
     */
    public java.lang.Boolean getPermissionsCustomSidebarOnAllPages() {
        return permissionsCustomSidebarOnAllPages;
    }


    /**
     * Sets the permissionsCustomSidebarOnAllPages value for this PermissionSet.
     * 
     * @param permissionsCustomSidebarOnAllPages
     */
    public void setPermissionsCustomSidebarOnAllPages(java.lang.Boolean permissionsCustomSidebarOnAllPages) {
        this.permissionsCustomSidebarOnAllPages = permissionsCustomSidebarOnAllPages;
    }


    /**
     * Gets the permissionsCustomizeApplication value for this PermissionSet.
     * 
     * @return permissionsCustomizeApplication
     */
    public java.lang.Boolean getPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }


    /**
     * Sets the permissionsCustomizeApplication value for this PermissionSet.
     * 
     * @param permissionsCustomizeApplication
     */
    public void setPermissionsCustomizeApplication(java.lang.Boolean permissionsCustomizeApplication) {
        this.permissionsCustomizeApplication = permissionsCustomizeApplication;
    }


    /**
     * Gets the permissionsDeleteActivatedContract value for this PermissionSet.
     * 
     * @return permissionsDeleteActivatedContract
     */
    public java.lang.Boolean getPermissionsDeleteActivatedContract() {
        return permissionsDeleteActivatedContract;
    }


    /**
     * Sets the permissionsDeleteActivatedContract value for this PermissionSet.
     * 
     * @param permissionsDeleteActivatedContract
     */
    public void setPermissionsDeleteActivatedContract(java.lang.Boolean permissionsDeleteActivatedContract) {
        this.permissionsDeleteActivatedContract = permissionsDeleteActivatedContract;
    }


    /**
     * Gets the permissionsDeleteTopics value for this PermissionSet.
     * 
     * @return permissionsDeleteTopics
     */
    public java.lang.Boolean getPermissionsDeleteTopics() {
        return permissionsDeleteTopics;
    }


    /**
     * Sets the permissionsDeleteTopics value for this PermissionSet.
     * 
     * @param permissionsDeleteTopics
     */
    public void setPermissionsDeleteTopics(java.lang.Boolean permissionsDeleteTopics) {
        this.permissionsDeleteTopics = permissionsDeleteTopics;
    }


    /**
     * Gets the permissionsDistributeFromPersWksp value for this PermissionSet.
     * 
     * @return permissionsDistributeFromPersWksp
     */
    public java.lang.Boolean getPermissionsDistributeFromPersWksp() {
        return permissionsDistributeFromPersWksp;
    }


    /**
     * Sets the permissionsDistributeFromPersWksp value for this PermissionSet.
     * 
     * @param permissionsDistributeFromPersWksp
     */
    public void setPermissionsDistributeFromPersWksp(java.lang.Boolean permissionsDistributeFromPersWksp) {
        this.permissionsDistributeFromPersWksp = permissionsDistributeFromPersWksp;
    }


    /**
     * Gets the permissionsEditActivatedOrders value for this PermissionSet.
     * 
     * @return permissionsEditActivatedOrders
     */
    public java.lang.Boolean getPermissionsEditActivatedOrders() {
        return permissionsEditActivatedOrders;
    }


    /**
     * Sets the permissionsEditActivatedOrders value for this PermissionSet.
     * 
     * @param permissionsEditActivatedOrders
     */
    public void setPermissionsEditActivatedOrders(java.lang.Boolean permissionsEditActivatedOrders) {
        this.permissionsEditActivatedOrders = permissionsEditActivatedOrders;
    }


    /**
     * Gets the permissionsEditBrandTemplates value for this PermissionSet.
     * 
     * @return permissionsEditBrandTemplates
     */
    public java.lang.Boolean getPermissionsEditBrandTemplates() {
        return permissionsEditBrandTemplates;
    }


    /**
     * Sets the permissionsEditBrandTemplates value for this PermissionSet.
     * 
     * @param permissionsEditBrandTemplates
     */
    public void setPermissionsEditBrandTemplates(java.lang.Boolean permissionsEditBrandTemplates) {
        this.permissionsEditBrandTemplates = permissionsEditBrandTemplates;
    }


    /**
     * Gets the permissionsEditCaseComments value for this PermissionSet.
     * 
     * @return permissionsEditCaseComments
     */
    public java.lang.Boolean getPermissionsEditCaseComments() {
        return permissionsEditCaseComments;
    }


    /**
     * Sets the permissionsEditCaseComments value for this PermissionSet.
     * 
     * @param permissionsEditCaseComments
     */
    public void setPermissionsEditCaseComments(java.lang.Boolean permissionsEditCaseComments) {
        this.permissionsEditCaseComments = permissionsEditCaseComments;
    }


    /**
     * Gets the permissionsEditEvent value for this PermissionSet.
     * 
     * @return permissionsEditEvent
     */
    public java.lang.Boolean getPermissionsEditEvent() {
        return permissionsEditEvent;
    }


    /**
     * Sets the permissionsEditEvent value for this PermissionSet.
     * 
     * @param permissionsEditEvent
     */
    public void setPermissionsEditEvent(java.lang.Boolean permissionsEditEvent) {
        this.permissionsEditEvent = permissionsEditEvent;
    }


    /**
     * Gets the permissionsEditHtmlTemplates value for this PermissionSet.
     * 
     * @return permissionsEditHtmlTemplates
     */
    public java.lang.Boolean getPermissionsEditHtmlTemplates() {
        return permissionsEditHtmlTemplates;
    }


    /**
     * Sets the permissionsEditHtmlTemplates value for this PermissionSet.
     * 
     * @param permissionsEditHtmlTemplates
     */
    public void setPermissionsEditHtmlTemplates(java.lang.Boolean permissionsEditHtmlTemplates) {
        this.permissionsEditHtmlTemplates = permissionsEditHtmlTemplates;
    }


    /**
     * Gets the permissionsEditKnowledge value for this PermissionSet.
     * 
     * @return permissionsEditKnowledge
     */
    public java.lang.Boolean getPermissionsEditKnowledge() {
        return permissionsEditKnowledge;
    }


    /**
     * Sets the permissionsEditKnowledge value for this PermissionSet.
     * 
     * @param permissionsEditKnowledge
     */
    public void setPermissionsEditKnowledge(java.lang.Boolean permissionsEditKnowledge) {
        this.permissionsEditKnowledge = permissionsEditKnowledge;
    }


    /**
     * Gets the permissionsEditMyDashboards value for this PermissionSet.
     * 
     * @return permissionsEditMyDashboards
     */
    public java.lang.Boolean getPermissionsEditMyDashboards() {
        return permissionsEditMyDashboards;
    }


    /**
     * Sets the permissionsEditMyDashboards value for this PermissionSet.
     * 
     * @param permissionsEditMyDashboards
     */
    public void setPermissionsEditMyDashboards(java.lang.Boolean permissionsEditMyDashboards) {
        this.permissionsEditMyDashboards = permissionsEditMyDashboards;
    }


    /**
     * Gets the permissionsEditMyReports value for this PermissionSet.
     * 
     * @return permissionsEditMyReports
     */
    public java.lang.Boolean getPermissionsEditMyReports() {
        return permissionsEditMyReports;
    }


    /**
     * Sets the permissionsEditMyReports value for this PermissionSet.
     * 
     * @param permissionsEditMyReports
     */
    public void setPermissionsEditMyReports(java.lang.Boolean permissionsEditMyReports) {
        this.permissionsEditMyReports = permissionsEditMyReports;
    }


    /**
     * Gets the permissionsEditOppLineItemUnitPrice value for this PermissionSet.
     * 
     * @return permissionsEditOppLineItemUnitPrice
     */
    public java.lang.Boolean getPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Sets the permissionsEditOppLineItemUnitPrice value for this PermissionSet.
     * 
     * @param permissionsEditOppLineItemUnitPrice
     */
    public void setPermissionsEditOppLineItemUnitPrice(java.lang.Boolean permissionsEditOppLineItemUnitPrice) {
        this.permissionsEditOppLineItemUnitPrice = permissionsEditOppLineItemUnitPrice;
    }


    /**
     * Gets the permissionsEditPublicDocuments value for this PermissionSet.
     * 
     * @return permissionsEditPublicDocuments
     */
    public java.lang.Boolean getPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }


    /**
     * Sets the permissionsEditPublicDocuments value for this PermissionSet.
     * 
     * @param permissionsEditPublicDocuments
     */
    public void setPermissionsEditPublicDocuments(java.lang.Boolean permissionsEditPublicDocuments) {
        this.permissionsEditPublicDocuments = permissionsEditPublicDocuments;
    }


    /**
     * Gets the permissionsEditPublicTemplates value for this PermissionSet.
     * 
     * @return permissionsEditPublicTemplates
     */
    public java.lang.Boolean getPermissionsEditPublicTemplates() {
        return permissionsEditPublicTemplates;
    }


    /**
     * Sets the permissionsEditPublicTemplates value for this PermissionSet.
     * 
     * @param permissionsEditPublicTemplates
     */
    public void setPermissionsEditPublicTemplates(java.lang.Boolean permissionsEditPublicTemplates) {
        this.permissionsEditPublicTemplates = permissionsEditPublicTemplates;
    }


    /**
     * Gets the permissionsEditReadonlyFields value for this PermissionSet.
     * 
     * @return permissionsEditReadonlyFields
     */
    public java.lang.Boolean getPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }


    /**
     * Sets the permissionsEditReadonlyFields value for this PermissionSet.
     * 
     * @param permissionsEditReadonlyFields
     */
    public void setPermissionsEditReadonlyFields(java.lang.Boolean permissionsEditReadonlyFields) {
        this.permissionsEditReadonlyFields = permissionsEditReadonlyFields;
    }


    /**
     * Gets the permissionsEditTask value for this PermissionSet.
     * 
     * @return permissionsEditTask
     */
    public java.lang.Boolean getPermissionsEditTask() {
        return permissionsEditTask;
    }


    /**
     * Sets the permissionsEditTask value for this PermissionSet.
     * 
     * @param permissionsEditTask
     */
    public void setPermissionsEditTask(java.lang.Boolean permissionsEditTask) {
        this.permissionsEditTask = permissionsEditTask;
    }


    /**
     * Gets the permissionsEditTopics value for this PermissionSet.
     * 
     * @return permissionsEditTopics
     */
    public java.lang.Boolean getPermissionsEditTopics() {
        return permissionsEditTopics;
    }


    /**
     * Sets the permissionsEditTopics value for this PermissionSet.
     * 
     * @param permissionsEditTopics
     */
    public void setPermissionsEditTopics(java.lang.Boolean permissionsEditTopics) {
        this.permissionsEditTopics = permissionsEditTopics;
    }


    /**
     * Gets the permissionsEmailAdministration value for this PermissionSet.
     * 
     * @return permissionsEmailAdministration
     */
    public java.lang.Boolean getPermissionsEmailAdministration() {
        return permissionsEmailAdministration;
    }


    /**
     * Sets the permissionsEmailAdministration value for this PermissionSet.
     * 
     * @param permissionsEmailAdministration
     */
    public void setPermissionsEmailAdministration(java.lang.Boolean permissionsEmailAdministration) {
        this.permissionsEmailAdministration = permissionsEmailAdministration;
    }


    /**
     * Gets the permissionsEmailMass value for this PermissionSet.
     * 
     * @return permissionsEmailMass
     */
    public java.lang.Boolean getPermissionsEmailMass() {
        return permissionsEmailMass;
    }


    /**
     * Sets the permissionsEmailMass value for this PermissionSet.
     * 
     * @param permissionsEmailMass
     */
    public void setPermissionsEmailMass(java.lang.Boolean permissionsEmailMass) {
        this.permissionsEmailMass = permissionsEmailMass;
    }


    /**
     * Gets the permissionsEmailSingle value for this PermissionSet.
     * 
     * @return permissionsEmailSingle
     */
    public java.lang.Boolean getPermissionsEmailSingle() {
        return permissionsEmailSingle;
    }


    /**
     * Sets the permissionsEmailSingle value for this PermissionSet.
     * 
     * @param permissionsEmailSingle
     */
    public void setPermissionsEmailSingle(java.lang.Boolean permissionsEmailSingle) {
        this.permissionsEmailSingle = permissionsEmailSingle;
    }


    /**
     * Gets the permissionsEmailTemplateManagement value for this PermissionSet.
     * 
     * @return permissionsEmailTemplateManagement
     */
    public java.lang.Boolean getPermissionsEmailTemplateManagement() {
        return permissionsEmailTemplateManagement;
    }


    /**
     * Sets the permissionsEmailTemplateManagement value for this PermissionSet.
     * 
     * @param permissionsEmailTemplateManagement
     */
    public void setPermissionsEmailTemplateManagement(java.lang.Boolean permissionsEmailTemplateManagement) {
        this.permissionsEmailTemplateManagement = permissionsEmailTemplateManagement;
    }


    /**
     * Gets the permissionsEnableNotifications value for this PermissionSet.
     * 
     * @return permissionsEnableNotifications
     */
    public java.lang.Boolean getPermissionsEnableNotifications() {
        return permissionsEnableNotifications;
    }


    /**
     * Sets the permissionsEnableNotifications value for this PermissionSet.
     * 
     * @param permissionsEnableNotifications
     */
    public void setPermissionsEnableNotifications(java.lang.Boolean permissionsEnableNotifications) {
        this.permissionsEnableNotifications = permissionsEnableNotifications;
    }


    /**
     * Gets the permissionsExportReport value for this PermissionSet.
     * 
     * @return permissionsExportReport
     */
    public java.lang.Boolean getPermissionsExportReport() {
        return permissionsExportReport;
    }


    /**
     * Sets the permissionsExportReport value for this PermissionSet.
     * 
     * @param permissionsExportReport
     */
    public void setPermissionsExportReport(java.lang.Boolean permissionsExportReport) {
        this.permissionsExportReport = permissionsExportReport;
    }


    /**
     * Gets the permissionsFlowUFLRequired value for this PermissionSet.
     * 
     * @return permissionsFlowUFLRequired
     */
    public java.lang.Boolean getPermissionsFlowUFLRequired() {
        return permissionsFlowUFLRequired;
    }


    /**
     * Sets the permissionsFlowUFLRequired value for this PermissionSet.
     * 
     * @param permissionsFlowUFLRequired
     */
    public void setPermissionsFlowUFLRequired(java.lang.Boolean permissionsFlowUFLRequired) {
        this.permissionsFlowUFLRequired = permissionsFlowUFLRequired;
    }


    /**
     * Gets the permissionsForceTwoFactor value for this PermissionSet.
     * 
     * @return permissionsForceTwoFactor
     */
    public java.lang.Boolean getPermissionsForceTwoFactor() {
        return permissionsForceTwoFactor;
    }


    /**
     * Sets the permissionsForceTwoFactor value for this PermissionSet.
     * 
     * @param permissionsForceTwoFactor
     */
    public void setPermissionsForceTwoFactor(java.lang.Boolean permissionsForceTwoFactor) {
        this.permissionsForceTwoFactor = permissionsForceTwoFactor;
    }


    /**
     * Gets the permissionsGovernNetworks value for this PermissionSet.
     * 
     * @return permissionsGovernNetworks
     */
    public java.lang.Boolean getPermissionsGovernNetworks() {
        return permissionsGovernNetworks;
    }


    /**
     * Sets the permissionsGovernNetworks value for this PermissionSet.
     * 
     * @param permissionsGovernNetworks
     */
    public void setPermissionsGovernNetworks(java.lang.Boolean permissionsGovernNetworks) {
        this.permissionsGovernNetworks = permissionsGovernNetworks;
    }


    /**
     * Gets the permissionsIdentityConnect value for this PermissionSet.
     * 
     * @return permissionsIdentityConnect
     */
    public java.lang.Boolean getPermissionsIdentityConnect() {
        return permissionsIdentityConnect;
    }


    /**
     * Sets the permissionsIdentityConnect value for this PermissionSet.
     * 
     * @param permissionsIdentityConnect
     */
    public void setPermissionsIdentityConnect(java.lang.Boolean permissionsIdentityConnect) {
        this.permissionsIdentityConnect = permissionsIdentityConnect;
    }


    /**
     * Gets the permissionsIdentityEnabled value for this PermissionSet.
     * 
     * @return permissionsIdentityEnabled
     */
    public java.lang.Boolean getPermissionsIdentityEnabled() {
        return permissionsIdentityEnabled;
    }


    /**
     * Sets the permissionsIdentityEnabled value for this PermissionSet.
     * 
     * @param permissionsIdentityEnabled
     */
    public void setPermissionsIdentityEnabled(java.lang.Boolean permissionsIdentityEnabled) {
        this.permissionsIdentityEnabled = permissionsIdentityEnabled;
    }


    /**
     * Gets the permissionsImportLeads value for this PermissionSet.
     * 
     * @return permissionsImportLeads
     */
    public java.lang.Boolean getPermissionsImportLeads() {
        return permissionsImportLeads;
    }


    /**
     * Sets the permissionsImportLeads value for this PermissionSet.
     * 
     * @param permissionsImportLeads
     */
    public void setPermissionsImportLeads(java.lang.Boolean permissionsImportLeads) {
        this.permissionsImportLeads = permissionsImportLeads;
    }


    /**
     * Gets the permissionsImportPersonal value for this PermissionSet.
     * 
     * @return permissionsImportPersonal
     */
    public java.lang.Boolean getPermissionsImportPersonal() {
        return permissionsImportPersonal;
    }


    /**
     * Sets the permissionsImportPersonal value for this PermissionSet.
     * 
     * @param permissionsImportPersonal
     */
    public void setPermissionsImportPersonal(java.lang.Boolean permissionsImportPersonal) {
        this.permissionsImportPersonal = permissionsImportPersonal;
    }


    /**
     * Gets the permissionsInstallPackaging value for this PermissionSet.
     * 
     * @return permissionsInstallPackaging
     */
    public java.lang.Boolean getPermissionsInstallPackaging() {
        return permissionsInstallPackaging;
    }


    /**
     * Sets the permissionsInstallPackaging value for this PermissionSet.
     * 
     * @param permissionsInstallPackaging
     */
    public void setPermissionsInstallPackaging(java.lang.Boolean permissionsInstallPackaging) {
        this.permissionsInstallPackaging = permissionsInstallPackaging;
    }


    /**
     * Gets the permissionsLightningExperienceUser value for this PermissionSet.
     * 
     * @return permissionsLightningExperienceUser
     */
    public java.lang.Boolean getPermissionsLightningExperienceUser() {
        return permissionsLightningExperienceUser;
    }


    /**
     * Sets the permissionsLightningExperienceUser value for this PermissionSet.
     * 
     * @param permissionsLightningExperienceUser
     */
    public void setPermissionsLightningExperienceUser(java.lang.Boolean permissionsLightningExperienceUser) {
        this.permissionsLightningExperienceUser = permissionsLightningExperienceUser;
    }


    /**
     * Gets the permissionsManageAnalyticSnapshots value for this PermissionSet.
     * 
     * @return permissionsManageAnalyticSnapshots
     */
    public java.lang.Boolean getPermissionsManageAnalyticSnapshots() {
        return permissionsManageAnalyticSnapshots;
    }


    /**
     * Sets the permissionsManageAnalyticSnapshots value for this PermissionSet.
     * 
     * @param permissionsManageAnalyticSnapshots
     */
    public void setPermissionsManageAnalyticSnapshots(java.lang.Boolean permissionsManageAnalyticSnapshots) {
        this.permissionsManageAnalyticSnapshots = permissionsManageAnalyticSnapshots;
    }


    /**
     * Gets the permissionsManageAuthProviders value for this PermissionSet.
     * 
     * @return permissionsManageAuthProviders
     */
    public java.lang.Boolean getPermissionsManageAuthProviders() {
        return permissionsManageAuthProviders;
    }


    /**
     * Sets the permissionsManageAuthProviders value for this PermissionSet.
     * 
     * @param permissionsManageAuthProviders
     */
    public void setPermissionsManageAuthProviders(java.lang.Boolean permissionsManageAuthProviders) {
        this.permissionsManageAuthProviders = permissionsManageAuthProviders;
    }


    /**
     * Gets the permissionsManageBusinessHourHolidays value for this PermissionSet.
     * 
     * @return permissionsManageBusinessHourHolidays
     */
    public java.lang.Boolean getPermissionsManageBusinessHourHolidays() {
        return permissionsManageBusinessHourHolidays;
    }


    /**
     * Sets the permissionsManageBusinessHourHolidays value for this PermissionSet.
     * 
     * @param permissionsManageBusinessHourHolidays
     */
    public void setPermissionsManageBusinessHourHolidays(java.lang.Boolean permissionsManageBusinessHourHolidays) {
        this.permissionsManageBusinessHourHolidays = permissionsManageBusinessHourHolidays;
    }


    /**
     * Gets the permissionsManageCallCenters value for this PermissionSet.
     * 
     * @return permissionsManageCallCenters
     */
    public java.lang.Boolean getPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }


    /**
     * Sets the permissionsManageCallCenters value for this PermissionSet.
     * 
     * @param permissionsManageCallCenters
     */
    public void setPermissionsManageCallCenters(java.lang.Boolean permissionsManageCallCenters) {
        this.permissionsManageCallCenters = permissionsManageCallCenters;
    }


    /**
     * Gets the permissionsManageCases value for this PermissionSet.
     * 
     * @return permissionsManageCases
     */
    public java.lang.Boolean getPermissionsManageCases() {
        return permissionsManageCases;
    }


    /**
     * Sets the permissionsManageCases value for this PermissionSet.
     * 
     * @param permissionsManageCases
     */
    public void setPermissionsManageCases(java.lang.Boolean permissionsManageCases) {
        this.permissionsManageCases = permissionsManageCases;
    }


    /**
     * Gets the permissionsManageCategories value for this PermissionSet.
     * 
     * @return permissionsManageCategories
     */
    public java.lang.Boolean getPermissionsManageCategories() {
        return permissionsManageCategories;
    }


    /**
     * Sets the permissionsManageCategories value for this PermissionSet.
     * 
     * @param permissionsManageCategories
     */
    public void setPermissionsManageCategories(java.lang.Boolean permissionsManageCategories) {
        this.permissionsManageCategories = permissionsManageCategories;
    }


    /**
     * Gets the permissionsManageChatterMessages value for this PermissionSet.
     * 
     * @return permissionsManageChatterMessages
     */
    public java.lang.Boolean getPermissionsManageChatterMessages() {
        return permissionsManageChatterMessages;
    }


    /**
     * Sets the permissionsManageChatterMessages value for this PermissionSet.
     * 
     * @param permissionsManageChatterMessages
     */
    public void setPermissionsManageChatterMessages(java.lang.Boolean permissionsManageChatterMessages) {
        this.permissionsManageChatterMessages = permissionsManageChatterMessages;
    }


    /**
     * Gets the permissionsManageContentPermissions value for this PermissionSet.
     * 
     * @return permissionsManageContentPermissions
     */
    public java.lang.Boolean getPermissionsManageContentPermissions() {
        return permissionsManageContentPermissions;
    }


    /**
     * Sets the permissionsManageContentPermissions value for this PermissionSet.
     * 
     * @param permissionsManageContentPermissions
     */
    public void setPermissionsManageContentPermissions(java.lang.Boolean permissionsManageContentPermissions) {
        this.permissionsManageContentPermissions = permissionsManageContentPermissions;
    }


    /**
     * Gets the permissionsManageContentProperties value for this PermissionSet.
     * 
     * @return permissionsManageContentProperties
     */
    public java.lang.Boolean getPermissionsManageContentProperties() {
        return permissionsManageContentProperties;
    }


    /**
     * Sets the permissionsManageContentProperties value for this PermissionSet.
     * 
     * @param permissionsManageContentProperties
     */
    public void setPermissionsManageContentProperties(java.lang.Boolean permissionsManageContentProperties) {
        this.permissionsManageContentProperties = permissionsManageContentProperties;
    }


    /**
     * Gets the permissionsManageContentTypes value for this PermissionSet.
     * 
     * @return permissionsManageContentTypes
     */
    public java.lang.Boolean getPermissionsManageContentTypes() {
        return permissionsManageContentTypes;
    }


    /**
     * Sets the permissionsManageContentTypes value for this PermissionSet.
     * 
     * @param permissionsManageContentTypes
     */
    public void setPermissionsManageContentTypes(java.lang.Boolean permissionsManageContentTypes) {
        this.permissionsManageContentTypes = permissionsManageContentTypes;
    }


    /**
     * Gets the permissionsManageCustomPermissions value for this PermissionSet.
     * 
     * @return permissionsManageCustomPermissions
     */
    public java.lang.Boolean getPermissionsManageCustomPermissions() {
        return permissionsManageCustomPermissions;
    }


    /**
     * Sets the permissionsManageCustomPermissions value for this PermissionSet.
     * 
     * @param permissionsManageCustomPermissions
     */
    public void setPermissionsManageCustomPermissions(java.lang.Boolean permissionsManageCustomPermissions) {
        this.permissionsManageCustomPermissions = permissionsManageCustomPermissions;
    }


    /**
     * Gets the permissionsManageCustomReportTypes value for this PermissionSet.
     * 
     * @return permissionsManageCustomReportTypes
     */
    public java.lang.Boolean getPermissionsManageCustomReportTypes() {
        return permissionsManageCustomReportTypes;
    }


    /**
     * Sets the permissionsManageCustomReportTypes value for this PermissionSet.
     * 
     * @param permissionsManageCustomReportTypes
     */
    public void setPermissionsManageCustomReportTypes(java.lang.Boolean permissionsManageCustomReportTypes) {
        this.permissionsManageCustomReportTypes = permissionsManageCustomReportTypes;
    }


    /**
     * Gets the permissionsManageDashbdsInPubFolders value for this PermissionSet.
     * 
     * @return permissionsManageDashbdsInPubFolders
     */
    public java.lang.Boolean getPermissionsManageDashbdsInPubFolders() {
        return permissionsManageDashbdsInPubFolders;
    }


    /**
     * Sets the permissionsManageDashbdsInPubFolders value for this PermissionSet.
     * 
     * @param permissionsManageDashbdsInPubFolders
     */
    public void setPermissionsManageDashbdsInPubFolders(java.lang.Boolean permissionsManageDashbdsInPubFolders) {
        this.permissionsManageDashbdsInPubFolders = permissionsManageDashbdsInPubFolders;
    }


    /**
     * Gets the permissionsManageDataCategories value for this PermissionSet.
     * 
     * @return permissionsManageDataCategories
     */
    public java.lang.Boolean getPermissionsManageDataCategories() {
        return permissionsManageDataCategories;
    }


    /**
     * Sets the permissionsManageDataCategories value for this PermissionSet.
     * 
     * @param permissionsManageDataCategories
     */
    public void setPermissionsManageDataCategories(java.lang.Boolean permissionsManageDataCategories) {
        this.permissionsManageDataCategories = permissionsManageDataCategories;
    }


    /**
     * Gets the permissionsManageDataIntegrations value for this PermissionSet.
     * 
     * @return permissionsManageDataIntegrations
     */
    public java.lang.Boolean getPermissionsManageDataIntegrations() {
        return permissionsManageDataIntegrations;
    }


    /**
     * Sets the permissionsManageDataIntegrations value for this PermissionSet.
     * 
     * @param permissionsManageDataIntegrations
     */
    public void setPermissionsManageDataIntegrations(java.lang.Boolean permissionsManageDataIntegrations) {
        this.permissionsManageDataIntegrations = permissionsManageDataIntegrations;
    }


    /**
     * Gets the permissionsManageDynamicDashboards value for this PermissionSet.
     * 
     * @return permissionsManageDynamicDashboards
     */
    public java.lang.Boolean getPermissionsManageDynamicDashboards() {
        return permissionsManageDynamicDashboards;
    }


    /**
     * Sets the permissionsManageDynamicDashboards value for this PermissionSet.
     * 
     * @param permissionsManageDynamicDashboards
     */
    public void setPermissionsManageDynamicDashboards(java.lang.Boolean permissionsManageDynamicDashboards) {
        this.permissionsManageDynamicDashboards = permissionsManageDynamicDashboards;
    }


    /**
     * Gets the permissionsManageEmailClientConfig value for this PermissionSet.
     * 
     * @return permissionsManageEmailClientConfig
     */
    public java.lang.Boolean getPermissionsManageEmailClientConfig() {
        return permissionsManageEmailClientConfig;
    }


    /**
     * Sets the permissionsManageEmailClientConfig value for this PermissionSet.
     * 
     * @param permissionsManageEmailClientConfig
     */
    public void setPermissionsManageEmailClientConfig(java.lang.Boolean permissionsManageEmailClientConfig) {
        this.permissionsManageEmailClientConfig = permissionsManageEmailClientConfig;
    }


    /**
     * Gets the permissionsManageEncryptionKeys value for this PermissionSet.
     * 
     * @return permissionsManageEncryptionKeys
     */
    public java.lang.Boolean getPermissionsManageEncryptionKeys() {
        return permissionsManageEncryptionKeys;
    }


    /**
     * Sets the permissionsManageEncryptionKeys value for this PermissionSet.
     * 
     * @param permissionsManageEncryptionKeys
     */
    public void setPermissionsManageEncryptionKeys(java.lang.Boolean permissionsManageEncryptionKeys) {
        this.permissionsManageEncryptionKeys = permissionsManageEncryptionKeys;
    }


    /**
     * Gets the permissionsManageExchangeConfig value for this PermissionSet.
     * 
     * @return permissionsManageExchangeConfig
     */
    public java.lang.Boolean getPermissionsManageExchangeConfig() {
        return permissionsManageExchangeConfig;
    }


    /**
     * Sets the permissionsManageExchangeConfig value for this PermissionSet.
     * 
     * @param permissionsManageExchangeConfig
     */
    public void setPermissionsManageExchangeConfig(java.lang.Boolean permissionsManageExchangeConfig) {
        this.permissionsManageExchangeConfig = permissionsManageExchangeConfig;
    }


    /**
     * Gets the permissionsManageInteraction value for this PermissionSet.
     * 
     * @return permissionsManageInteraction
     */
    public java.lang.Boolean getPermissionsManageInteraction() {
        return permissionsManageInteraction;
    }


    /**
     * Sets the permissionsManageInteraction value for this PermissionSet.
     * 
     * @param permissionsManageInteraction
     */
    public void setPermissionsManageInteraction(java.lang.Boolean permissionsManageInteraction) {
        this.permissionsManageInteraction = permissionsManageInteraction;
    }


    /**
     * Gets the permissionsManageInternalUsers value for this PermissionSet.
     * 
     * @return permissionsManageInternalUsers
     */
    public java.lang.Boolean getPermissionsManageInternalUsers() {
        return permissionsManageInternalUsers;
    }


    /**
     * Sets the permissionsManageInternalUsers value for this PermissionSet.
     * 
     * @param permissionsManageInternalUsers
     */
    public void setPermissionsManageInternalUsers(java.lang.Boolean permissionsManageInternalUsers) {
        this.permissionsManageInternalUsers = permissionsManageInternalUsers;
    }


    /**
     * Gets the permissionsManageIpAddresses value for this PermissionSet.
     * 
     * @return permissionsManageIpAddresses
     */
    public java.lang.Boolean getPermissionsManageIpAddresses() {
        return permissionsManageIpAddresses;
    }


    /**
     * Sets the permissionsManageIpAddresses value for this PermissionSet.
     * 
     * @param permissionsManageIpAddresses
     */
    public void setPermissionsManageIpAddresses(java.lang.Boolean permissionsManageIpAddresses) {
        this.permissionsManageIpAddresses = permissionsManageIpAddresses;
    }


    /**
     * Gets the permissionsManageKnowledge value for this PermissionSet.
     * 
     * @return permissionsManageKnowledge
     */
    public java.lang.Boolean getPermissionsManageKnowledge() {
        return permissionsManageKnowledge;
    }


    /**
     * Sets the permissionsManageKnowledge value for this PermissionSet.
     * 
     * @param permissionsManageKnowledge
     */
    public void setPermissionsManageKnowledge(java.lang.Boolean permissionsManageKnowledge) {
        this.permissionsManageKnowledge = permissionsManageKnowledge;
    }


    /**
     * Gets the permissionsManageKnowledgeImportExport value for this PermissionSet.
     * 
     * @return permissionsManageKnowledgeImportExport
     */
    public java.lang.Boolean getPermissionsManageKnowledgeImportExport() {
        return permissionsManageKnowledgeImportExport;
    }


    /**
     * Sets the permissionsManageKnowledgeImportExport value for this PermissionSet.
     * 
     * @param permissionsManageKnowledgeImportExport
     */
    public void setPermissionsManageKnowledgeImportExport(java.lang.Boolean permissionsManageKnowledgeImportExport) {
        this.permissionsManageKnowledgeImportExport = permissionsManageKnowledgeImportExport;
    }


    /**
     * Gets the permissionsManageLeads value for this PermissionSet.
     * 
     * @return permissionsManageLeads
     */
    public java.lang.Boolean getPermissionsManageLeads() {
        return permissionsManageLeads;
    }


    /**
     * Sets the permissionsManageLeads value for this PermissionSet.
     * 
     * @param permissionsManageLeads
     */
    public void setPermissionsManageLeads(java.lang.Boolean permissionsManageLeads) {
        this.permissionsManageLeads = permissionsManageLeads;
    }


    /**
     * Gets the permissionsManageLoginAccessPolicies value for this PermissionSet.
     * 
     * @return permissionsManageLoginAccessPolicies
     */
    public java.lang.Boolean getPermissionsManageLoginAccessPolicies() {
        return permissionsManageLoginAccessPolicies;
    }


    /**
     * Sets the permissionsManageLoginAccessPolicies value for this PermissionSet.
     * 
     * @param permissionsManageLoginAccessPolicies
     */
    public void setPermissionsManageLoginAccessPolicies(java.lang.Boolean permissionsManageLoginAccessPolicies) {
        this.permissionsManageLoginAccessPolicies = permissionsManageLoginAccessPolicies;
    }


    /**
     * Gets the permissionsManageMobile value for this PermissionSet.
     * 
     * @return permissionsManageMobile
     */
    public java.lang.Boolean getPermissionsManageMobile() {
        return permissionsManageMobile;
    }


    /**
     * Sets the permissionsManageMobile value for this PermissionSet.
     * 
     * @param permissionsManageMobile
     */
    public void setPermissionsManageMobile(java.lang.Boolean permissionsManageMobile) {
        this.permissionsManageMobile = permissionsManageMobile;
    }


    /**
     * Gets the permissionsManageNetworks value for this PermissionSet.
     * 
     * @return permissionsManageNetworks
     */
    public java.lang.Boolean getPermissionsManageNetworks() {
        return permissionsManageNetworks;
    }


    /**
     * Sets the permissionsManageNetworks value for this PermissionSet.
     * 
     * @param permissionsManageNetworks
     */
    public void setPermissionsManageNetworks(java.lang.Boolean permissionsManageNetworks) {
        this.permissionsManageNetworks = permissionsManageNetworks;
    }


    /**
     * Gets the permissionsManagePasswordPolicies value for this PermissionSet.
     * 
     * @return permissionsManagePasswordPolicies
     */
    public java.lang.Boolean getPermissionsManagePasswordPolicies() {
        return permissionsManagePasswordPolicies;
    }


    /**
     * Sets the permissionsManagePasswordPolicies value for this PermissionSet.
     * 
     * @param permissionsManagePasswordPolicies
     */
    public void setPermissionsManagePasswordPolicies(java.lang.Boolean permissionsManagePasswordPolicies) {
        this.permissionsManagePasswordPolicies = permissionsManagePasswordPolicies;
    }


    /**
     * Gets the permissionsManageProfilesPermissionsets value for this PermissionSet.
     * 
     * @return permissionsManageProfilesPermissionsets
     */
    public java.lang.Boolean getPermissionsManageProfilesPermissionsets() {
        return permissionsManageProfilesPermissionsets;
    }


    /**
     * Sets the permissionsManageProfilesPermissionsets value for this PermissionSet.
     * 
     * @param permissionsManageProfilesPermissionsets
     */
    public void setPermissionsManageProfilesPermissionsets(java.lang.Boolean permissionsManageProfilesPermissionsets) {
        this.permissionsManageProfilesPermissionsets = permissionsManageProfilesPermissionsets;
    }


    /**
     * Gets the permissionsManageRemoteAccess value for this PermissionSet.
     * 
     * @return permissionsManageRemoteAccess
     */
    public java.lang.Boolean getPermissionsManageRemoteAccess() {
        return permissionsManageRemoteAccess;
    }


    /**
     * Sets the permissionsManageRemoteAccess value for this PermissionSet.
     * 
     * @param permissionsManageRemoteAccess
     */
    public void setPermissionsManageRemoteAccess(java.lang.Boolean permissionsManageRemoteAccess) {
        this.permissionsManageRemoteAccess = permissionsManageRemoteAccess;
    }


    /**
     * Gets the permissionsManageReportsInPubFolders value for this PermissionSet.
     * 
     * @return permissionsManageReportsInPubFolders
     */
    public java.lang.Boolean getPermissionsManageReportsInPubFolders() {
        return permissionsManageReportsInPubFolders;
    }


    /**
     * Sets the permissionsManageReportsInPubFolders value for this PermissionSet.
     * 
     * @param permissionsManageReportsInPubFolders
     */
    public void setPermissionsManageReportsInPubFolders(java.lang.Boolean permissionsManageReportsInPubFolders) {
        this.permissionsManageReportsInPubFolders = permissionsManageReportsInPubFolders;
    }


    /**
     * Gets the permissionsManageRoles value for this PermissionSet.
     * 
     * @return permissionsManageRoles
     */
    public java.lang.Boolean getPermissionsManageRoles() {
        return permissionsManageRoles;
    }


    /**
     * Sets the permissionsManageRoles value for this PermissionSet.
     * 
     * @param permissionsManageRoles
     */
    public void setPermissionsManageRoles(java.lang.Boolean permissionsManageRoles) {
        this.permissionsManageRoles = permissionsManageRoles;
    }


    /**
     * Gets the permissionsManageSearchPromotionRules value for this PermissionSet.
     * 
     * @return permissionsManageSearchPromotionRules
     */
    public java.lang.Boolean getPermissionsManageSearchPromotionRules() {
        return permissionsManageSearchPromotionRules;
    }


    /**
     * Sets the permissionsManageSearchPromotionRules value for this PermissionSet.
     * 
     * @param permissionsManageSearchPromotionRules
     */
    public void setPermissionsManageSearchPromotionRules(java.lang.Boolean permissionsManageSearchPromotionRules) {
        this.permissionsManageSearchPromotionRules = permissionsManageSearchPromotionRules;
    }


    /**
     * Gets the permissionsManageSharing value for this PermissionSet.
     * 
     * @return permissionsManageSharing
     */
    public java.lang.Boolean getPermissionsManageSharing() {
        return permissionsManageSharing;
    }


    /**
     * Sets the permissionsManageSharing value for this PermissionSet.
     * 
     * @param permissionsManageSharing
     */
    public void setPermissionsManageSharing(java.lang.Boolean permissionsManageSharing) {
        this.permissionsManageSharing = permissionsManageSharing;
    }


    /**
     * Gets the permissionsManageSolutions value for this PermissionSet.
     * 
     * @return permissionsManageSolutions
     */
    public java.lang.Boolean getPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }


    /**
     * Sets the permissionsManageSolutions value for this PermissionSet.
     * 
     * @param permissionsManageSolutions
     */
    public void setPermissionsManageSolutions(java.lang.Boolean permissionsManageSolutions) {
        this.permissionsManageSolutions = permissionsManageSolutions;
    }


    /**
     * Gets the permissionsManageSynonyms value for this PermissionSet.
     * 
     * @return permissionsManageSynonyms
     */
    public java.lang.Boolean getPermissionsManageSynonyms() {
        return permissionsManageSynonyms;
    }


    /**
     * Sets the permissionsManageSynonyms value for this PermissionSet.
     * 
     * @param permissionsManageSynonyms
     */
    public void setPermissionsManageSynonyms(java.lang.Boolean permissionsManageSynonyms) {
        this.permissionsManageSynonyms = permissionsManageSynonyms;
    }


    /**
     * Gets the permissionsManageTwoFactor value for this PermissionSet.
     * 
     * @return permissionsManageTwoFactor
     */
    public java.lang.Boolean getPermissionsManageTwoFactor() {
        return permissionsManageTwoFactor;
    }


    /**
     * Sets the permissionsManageTwoFactor value for this PermissionSet.
     * 
     * @param permissionsManageTwoFactor
     */
    public void setPermissionsManageTwoFactor(java.lang.Boolean permissionsManageTwoFactor) {
        this.permissionsManageTwoFactor = permissionsManageTwoFactor;
    }


    /**
     * Gets the permissionsManageUnlistedGroups value for this PermissionSet.
     * 
     * @return permissionsManageUnlistedGroups
     */
    public java.lang.Boolean getPermissionsManageUnlistedGroups() {
        return permissionsManageUnlistedGroups;
    }


    /**
     * Sets the permissionsManageUnlistedGroups value for this PermissionSet.
     * 
     * @param permissionsManageUnlistedGroups
     */
    public void setPermissionsManageUnlistedGroups(java.lang.Boolean permissionsManageUnlistedGroups) {
        this.permissionsManageUnlistedGroups = permissionsManageUnlistedGroups;
    }


    /**
     * Gets the permissionsManageUsers value for this PermissionSet.
     * 
     * @return permissionsManageUsers
     */
    public java.lang.Boolean getPermissionsManageUsers() {
        return permissionsManageUsers;
    }


    /**
     * Sets the permissionsManageUsers value for this PermissionSet.
     * 
     * @param permissionsManageUsers
     */
    public void setPermissionsManageUsers(java.lang.Boolean permissionsManageUsers) {
        this.permissionsManageUsers = permissionsManageUsers;
    }


    /**
     * Gets the permissionsMassInlineEdit value for this PermissionSet.
     * 
     * @return permissionsMassInlineEdit
     */
    public java.lang.Boolean getPermissionsMassInlineEdit() {
        return permissionsMassInlineEdit;
    }


    /**
     * Sets the permissionsMassInlineEdit value for this PermissionSet.
     * 
     * @param permissionsMassInlineEdit
     */
    public void setPermissionsMassInlineEdit(java.lang.Boolean permissionsMassInlineEdit) {
        this.permissionsMassInlineEdit = permissionsMassInlineEdit;
    }


    /**
     * Gets the permissionsMergeTopics value for this PermissionSet.
     * 
     * @return permissionsMergeTopics
     */
    public java.lang.Boolean getPermissionsMergeTopics() {
        return permissionsMergeTopics;
    }


    /**
     * Sets the permissionsMergeTopics value for this PermissionSet.
     * 
     * @param permissionsMergeTopics
     */
    public void setPermissionsMergeTopics(java.lang.Boolean permissionsMergeTopics) {
        this.permissionsMergeTopics = permissionsMergeTopics;
    }


    /**
     * Gets the permissionsModerateChatter value for this PermissionSet.
     * 
     * @return permissionsModerateChatter
     */
    public java.lang.Boolean getPermissionsModerateChatter() {
        return permissionsModerateChatter;
    }


    /**
     * Sets the permissionsModerateChatter value for this PermissionSet.
     * 
     * @param permissionsModerateChatter
     */
    public void setPermissionsModerateChatter(java.lang.Boolean permissionsModerateChatter) {
        this.permissionsModerateChatter = permissionsModerateChatter;
    }


    /**
     * Gets the permissionsModifyAllData value for this PermissionSet.
     * 
     * @return permissionsModifyAllData
     */
    public java.lang.Boolean getPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }


    /**
     * Sets the permissionsModifyAllData value for this PermissionSet.
     * 
     * @param permissionsModifyAllData
     */
    public void setPermissionsModifyAllData(java.lang.Boolean permissionsModifyAllData) {
        this.permissionsModifyAllData = permissionsModifyAllData;
    }


    /**
     * Gets the permissionsModifySecureAgents value for this PermissionSet.
     * 
     * @return permissionsModifySecureAgents
     */
    public java.lang.Boolean getPermissionsModifySecureAgents() {
        return permissionsModifySecureAgents;
    }


    /**
     * Sets the permissionsModifySecureAgents value for this PermissionSet.
     * 
     * @param permissionsModifySecureAgents
     */
    public void setPermissionsModifySecureAgents(java.lang.Boolean permissionsModifySecureAgents) {
        this.permissionsModifySecureAgents = permissionsModifySecureAgents;
    }


    /**
     * Gets the permissionsNewReportBuilder value for this PermissionSet.
     * 
     * @return permissionsNewReportBuilder
     */
    public java.lang.Boolean getPermissionsNewReportBuilder() {
        return permissionsNewReportBuilder;
    }


    /**
     * Sets the permissionsNewReportBuilder value for this PermissionSet.
     * 
     * @param permissionsNewReportBuilder
     */
    public void setPermissionsNewReportBuilder(java.lang.Boolean permissionsNewReportBuilder) {
        this.permissionsNewReportBuilder = permissionsNewReportBuilder;
    }


    /**
     * Gets the permissionsPasswordNeverExpires value for this PermissionSet.
     * 
     * @return permissionsPasswordNeverExpires
     */
    public java.lang.Boolean getPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }


    /**
     * Sets the permissionsPasswordNeverExpires value for this PermissionSet.
     * 
     * @param permissionsPasswordNeverExpires
     */
    public void setPermissionsPasswordNeverExpires(java.lang.Boolean permissionsPasswordNeverExpires) {
        this.permissionsPasswordNeverExpires = permissionsPasswordNeverExpires;
    }


    /**
     * Gets the permissionsPublishPackaging value for this PermissionSet.
     * 
     * @return permissionsPublishPackaging
     */
    public java.lang.Boolean getPermissionsPublishPackaging() {
        return permissionsPublishPackaging;
    }


    /**
     * Sets the permissionsPublishPackaging value for this PermissionSet.
     * 
     * @param permissionsPublishPackaging
     */
    public void setPermissionsPublishPackaging(java.lang.Boolean permissionsPublishPackaging) {
        this.permissionsPublishPackaging = permissionsPublishPackaging;
    }


    /**
     * Gets the permissionsResetPasswords value for this PermissionSet.
     * 
     * @return permissionsResetPasswords
     */
    public java.lang.Boolean getPermissionsResetPasswords() {
        return permissionsResetPasswords;
    }


    /**
     * Sets the permissionsResetPasswords value for this PermissionSet.
     * 
     * @param permissionsResetPasswords
     */
    public void setPermissionsResetPasswords(java.lang.Boolean permissionsResetPasswords) {
        this.permissionsResetPasswords = permissionsResetPasswords;
    }


    /**
     * Gets the permissionsRunFlow value for this PermissionSet.
     * 
     * @return permissionsRunFlow
     */
    public java.lang.Boolean getPermissionsRunFlow() {
        return permissionsRunFlow;
    }


    /**
     * Sets the permissionsRunFlow value for this PermissionSet.
     * 
     * @param permissionsRunFlow
     */
    public void setPermissionsRunFlow(java.lang.Boolean permissionsRunFlow) {
        this.permissionsRunFlow = permissionsRunFlow;
    }


    /**
     * Gets the permissionsRunReports value for this PermissionSet.
     * 
     * @return permissionsRunReports
     */
    public java.lang.Boolean getPermissionsRunReports() {
        return permissionsRunReports;
    }


    /**
     * Sets the permissionsRunReports value for this PermissionSet.
     * 
     * @param permissionsRunReports
     */
    public void setPermissionsRunReports(java.lang.Boolean permissionsRunReports) {
        this.permissionsRunReports = permissionsRunReports;
    }


    /**
     * Gets the permissionsSalesConsole value for this PermissionSet.
     * 
     * @return permissionsSalesConsole
     */
    public java.lang.Boolean getPermissionsSalesConsole() {
        return permissionsSalesConsole;
    }


    /**
     * Sets the permissionsSalesConsole value for this PermissionSet.
     * 
     * @param permissionsSalesConsole
     */
    public void setPermissionsSalesConsole(java.lang.Boolean permissionsSalesConsole) {
        this.permissionsSalesConsole = permissionsSalesConsole;
    }


    /**
     * Gets the permissionsScheduleReports value for this PermissionSet.
     * 
     * @return permissionsScheduleReports
     */
    public java.lang.Boolean getPermissionsScheduleReports() {
        return permissionsScheduleReports;
    }


    /**
     * Sets the permissionsScheduleReports value for this PermissionSet.
     * 
     * @param permissionsScheduleReports
     */
    public void setPermissionsScheduleReports(java.lang.Boolean permissionsScheduleReports) {
        this.permissionsScheduleReports = permissionsScheduleReports;
    }


    /**
     * Gets the permissionsSelectFilesFromSalesforce value for this PermissionSet.
     * 
     * @return permissionsSelectFilesFromSalesforce
     */
    public java.lang.Boolean getPermissionsSelectFilesFromSalesforce() {
        return permissionsSelectFilesFromSalesforce;
    }


    /**
     * Sets the permissionsSelectFilesFromSalesforce value for this PermissionSet.
     * 
     * @param permissionsSelectFilesFromSalesforce
     */
    public void setPermissionsSelectFilesFromSalesforce(java.lang.Boolean permissionsSelectFilesFromSalesforce) {
        this.permissionsSelectFilesFromSalesforce = permissionsSelectFilesFromSalesforce;
    }


    /**
     * Gets the permissionsSendSitRequests value for this PermissionSet.
     * 
     * @return permissionsSendSitRequests
     */
    public java.lang.Boolean getPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }


    /**
     * Sets the permissionsSendSitRequests value for this PermissionSet.
     * 
     * @param permissionsSendSitRequests
     */
    public void setPermissionsSendSitRequests(java.lang.Boolean permissionsSendSitRequests) {
        this.permissionsSendSitRequests = permissionsSendSitRequests;
    }


    /**
     * Gets the permissionsShareInternalArticles value for this PermissionSet.
     * 
     * @return permissionsShareInternalArticles
     */
    public java.lang.Boolean getPermissionsShareInternalArticles() {
        return permissionsShareInternalArticles;
    }


    /**
     * Sets the permissionsShareInternalArticles value for this PermissionSet.
     * 
     * @param permissionsShareInternalArticles
     */
    public void setPermissionsShareInternalArticles(java.lang.Boolean permissionsShareInternalArticles) {
        this.permissionsShareInternalArticles = permissionsShareInternalArticles;
    }


    /**
     * Gets the permissionsSolutionImport value for this PermissionSet.
     * 
     * @return permissionsSolutionImport
     */
    public java.lang.Boolean getPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }


    /**
     * Sets the permissionsSolutionImport value for this PermissionSet.
     * 
     * @param permissionsSolutionImport
     */
    public void setPermissionsSolutionImport(java.lang.Boolean permissionsSolutionImport) {
        this.permissionsSolutionImport = permissionsSolutionImport;
    }


    /**
     * Gets the permissionsSubmitMacrosAllowed value for this PermissionSet.
     * 
     * @return permissionsSubmitMacrosAllowed
     */
    public java.lang.Boolean getPermissionsSubmitMacrosAllowed() {
        return permissionsSubmitMacrosAllowed;
    }


    /**
     * Sets the permissionsSubmitMacrosAllowed value for this PermissionSet.
     * 
     * @param permissionsSubmitMacrosAllowed
     */
    public void setPermissionsSubmitMacrosAllowed(java.lang.Boolean permissionsSubmitMacrosAllowed) {
        this.permissionsSubmitMacrosAllowed = permissionsSubmitMacrosAllowed;
    }


    /**
     * Gets the permissionsTransferAnyCase value for this PermissionSet.
     * 
     * @return permissionsTransferAnyCase
     */
    public java.lang.Boolean getPermissionsTransferAnyCase() {
        return permissionsTransferAnyCase;
    }


    /**
     * Sets the permissionsTransferAnyCase value for this PermissionSet.
     * 
     * @param permissionsTransferAnyCase
     */
    public void setPermissionsTransferAnyCase(java.lang.Boolean permissionsTransferAnyCase) {
        this.permissionsTransferAnyCase = permissionsTransferAnyCase;
    }


    /**
     * Gets the permissionsTransferAnyEntity value for this PermissionSet.
     * 
     * @return permissionsTransferAnyEntity
     */
    public java.lang.Boolean getPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }


    /**
     * Sets the permissionsTransferAnyEntity value for this PermissionSet.
     * 
     * @param permissionsTransferAnyEntity
     */
    public void setPermissionsTransferAnyEntity(java.lang.Boolean permissionsTransferAnyEntity) {
        this.permissionsTransferAnyEntity = permissionsTransferAnyEntity;
    }


    /**
     * Gets the permissionsTransferAnyLead value for this PermissionSet.
     * 
     * @return permissionsTransferAnyLead
     */
    public java.lang.Boolean getPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }


    /**
     * Sets the permissionsTransferAnyLead value for this PermissionSet.
     * 
     * @param permissionsTransferAnyLead
     */
    public void setPermissionsTransferAnyLead(java.lang.Boolean permissionsTransferAnyLead) {
        this.permissionsTransferAnyLead = permissionsTransferAnyLead;
    }


    /**
     * Gets the permissionsTwoFactorApi value for this PermissionSet.
     * 
     * @return permissionsTwoFactorApi
     */
    public java.lang.Boolean getPermissionsTwoFactorApi() {
        return permissionsTwoFactorApi;
    }


    /**
     * Sets the permissionsTwoFactorApi value for this PermissionSet.
     * 
     * @param permissionsTwoFactorApi
     */
    public void setPermissionsTwoFactorApi(java.lang.Boolean permissionsTwoFactorApi) {
        this.permissionsTwoFactorApi = permissionsTwoFactorApi;
    }


    /**
     * Gets the permissionsUseTeamReassignWizards value for this PermissionSet.
     * 
     * @return permissionsUseTeamReassignWizards
     */
    public java.lang.Boolean getPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }


    /**
     * Sets the permissionsUseTeamReassignWizards value for this PermissionSet.
     * 
     * @param permissionsUseTeamReassignWizards
     */
    public void setPermissionsUseTeamReassignWizards(java.lang.Boolean permissionsUseTeamReassignWizards) {
        this.permissionsUseTeamReassignWizards = permissionsUseTeamReassignWizards;
    }


    /**
     * Gets the permissionsViewAllData value for this PermissionSet.
     * 
     * @return permissionsViewAllData
     */
    public java.lang.Boolean getPermissionsViewAllData() {
        return permissionsViewAllData;
    }


    /**
     * Sets the permissionsViewAllData value for this PermissionSet.
     * 
     * @param permissionsViewAllData
     */
    public void setPermissionsViewAllData(java.lang.Boolean permissionsViewAllData) {
        this.permissionsViewAllData = permissionsViewAllData;
    }


    /**
     * Gets the permissionsViewAllUsers value for this PermissionSet.
     * 
     * @return permissionsViewAllUsers
     */
    public java.lang.Boolean getPermissionsViewAllUsers() {
        return permissionsViewAllUsers;
    }


    /**
     * Sets the permissionsViewAllUsers value for this PermissionSet.
     * 
     * @param permissionsViewAllUsers
     */
    public void setPermissionsViewAllUsers(java.lang.Boolean permissionsViewAllUsers) {
        this.permissionsViewAllUsers = permissionsViewAllUsers;
    }


    /**
     * Gets the permissionsViewContent value for this PermissionSet.
     * 
     * @return permissionsViewContent
     */
    public java.lang.Boolean getPermissionsViewContent() {
        return permissionsViewContent;
    }


    /**
     * Sets the permissionsViewContent value for this PermissionSet.
     * 
     * @param permissionsViewContent
     */
    public void setPermissionsViewContent(java.lang.Boolean permissionsViewContent) {
        this.permissionsViewContent = permissionsViewContent;
    }


    /**
     * Gets the permissionsViewDataCategories value for this PermissionSet.
     * 
     * @return permissionsViewDataCategories
     */
    public java.lang.Boolean getPermissionsViewDataCategories() {
        return permissionsViewDataCategories;
    }


    /**
     * Sets the permissionsViewDataCategories value for this PermissionSet.
     * 
     * @param permissionsViewDataCategories
     */
    public void setPermissionsViewDataCategories(java.lang.Boolean permissionsViewDataCategories) {
        this.permissionsViewDataCategories = permissionsViewDataCategories;
    }


    /**
     * Gets the permissionsViewEncryptedData value for this PermissionSet.
     * 
     * @return permissionsViewEncryptedData
     */
    public java.lang.Boolean getPermissionsViewEncryptedData() {
        return permissionsViewEncryptedData;
    }


    /**
     * Sets the permissionsViewEncryptedData value for this PermissionSet.
     * 
     * @param permissionsViewEncryptedData
     */
    public void setPermissionsViewEncryptedData(java.lang.Boolean permissionsViewEncryptedData) {
        this.permissionsViewEncryptedData = permissionsViewEncryptedData;
    }


    /**
     * Gets the permissionsViewEventLogFiles value for this PermissionSet.
     * 
     * @return permissionsViewEventLogFiles
     */
    public java.lang.Boolean getPermissionsViewEventLogFiles() {
        return permissionsViewEventLogFiles;
    }


    /**
     * Sets the permissionsViewEventLogFiles value for this PermissionSet.
     * 
     * @param permissionsViewEventLogFiles
     */
    public void setPermissionsViewEventLogFiles(java.lang.Boolean permissionsViewEventLogFiles) {
        this.permissionsViewEventLogFiles = permissionsViewEventLogFiles;
    }


    /**
     * Gets the permissionsViewHelpLink value for this PermissionSet.
     * 
     * @return permissionsViewHelpLink
     */
    public java.lang.Boolean getPermissionsViewHelpLink() {
        return permissionsViewHelpLink;
    }


    /**
     * Sets the permissionsViewHelpLink value for this PermissionSet.
     * 
     * @param permissionsViewHelpLink
     */
    public void setPermissionsViewHelpLink(java.lang.Boolean permissionsViewHelpLink) {
        this.permissionsViewHelpLink = permissionsViewHelpLink;
    }


    /**
     * Gets the permissionsViewMyTeamsDashboards value for this PermissionSet.
     * 
     * @return permissionsViewMyTeamsDashboards
     */
    public java.lang.Boolean getPermissionsViewMyTeamsDashboards() {
        return permissionsViewMyTeamsDashboards;
    }


    /**
     * Sets the permissionsViewMyTeamsDashboards value for this PermissionSet.
     * 
     * @param permissionsViewMyTeamsDashboards
     */
    public void setPermissionsViewMyTeamsDashboards(java.lang.Boolean permissionsViewMyTeamsDashboards) {
        this.permissionsViewMyTeamsDashboards = permissionsViewMyTeamsDashboards;
    }


    /**
     * Gets the permissionsViewPublicDashboards value for this PermissionSet.
     * 
     * @return permissionsViewPublicDashboards
     */
    public java.lang.Boolean getPermissionsViewPublicDashboards() {
        return permissionsViewPublicDashboards;
    }


    /**
     * Sets the permissionsViewPublicDashboards value for this PermissionSet.
     * 
     * @param permissionsViewPublicDashboards
     */
    public void setPermissionsViewPublicDashboards(java.lang.Boolean permissionsViewPublicDashboards) {
        this.permissionsViewPublicDashboards = permissionsViewPublicDashboards;
    }


    /**
     * Gets the permissionsViewPublicReports value for this PermissionSet.
     * 
     * @return permissionsViewPublicReports
     */
    public java.lang.Boolean getPermissionsViewPublicReports() {
        return permissionsViewPublicReports;
    }


    /**
     * Sets the permissionsViewPublicReports value for this PermissionSet.
     * 
     * @param permissionsViewPublicReports
     */
    public void setPermissionsViewPublicReports(java.lang.Boolean permissionsViewPublicReports) {
        this.permissionsViewPublicReports = permissionsViewPublicReports;
    }


    /**
     * Gets the permissionsViewSetup value for this PermissionSet.
     * 
     * @return permissionsViewSetup
     */
    public java.lang.Boolean getPermissionsViewSetup() {
        return permissionsViewSetup;
    }


    /**
     * Sets the permissionsViewSetup value for this PermissionSet.
     * 
     * @param permissionsViewSetup
     */
    public void setPermissionsViewSetup(java.lang.Boolean permissionsViewSetup) {
        this.permissionsViewSetup = permissionsViewSetup;
    }


    /**
     * Gets the permissionsWorkCalibrationUser value for this PermissionSet.
     * 
     * @return permissionsWorkCalibrationUser
     */
    public java.lang.Boolean getPermissionsWorkCalibrationUser() {
        return permissionsWorkCalibrationUser;
    }


    /**
     * Sets the permissionsWorkCalibrationUser value for this PermissionSet.
     * 
     * @param permissionsWorkCalibrationUser
     */
    public void setPermissionsWorkCalibrationUser(java.lang.Boolean permissionsWorkCalibrationUser) {
        this.permissionsWorkCalibrationUser = permissionsWorkCalibrationUser;
    }


    /**
     * Gets the permissionsWorkDotComUserPerm value for this PermissionSet.
     * 
     * @return permissionsWorkDotComUserPerm
     */
    public java.lang.Boolean getPermissionsWorkDotComUserPerm() {
        return permissionsWorkDotComUserPerm;
    }


    /**
     * Sets the permissionsWorkDotComUserPerm value for this PermissionSet.
     * 
     * @param permissionsWorkDotComUserPerm
     */
    public void setPermissionsWorkDotComUserPerm(java.lang.Boolean permissionsWorkDotComUserPerm) {
        this.permissionsWorkDotComUserPerm = permissionsWorkDotComUserPerm;
    }


    /**
     * Gets the profile value for this PermissionSet.
     * 
     * @return profile
     */
    public com.sforce.soap.enterprise.sobject.Profile getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this PermissionSet.
     * 
     * @param profile
     */
    public void setProfile(com.sforce.soap.enterprise.sobject.Profile profile) {
        this.profile = profile;
    }


    /**
     * Gets the profileId value for this PermissionSet.
     * 
     * @return profileId
     */
    public java.lang.String getProfileId() {
        return profileId;
    }


    /**
     * Sets the profileId value for this PermissionSet.
     * 
     * @param profileId
     */
    public void setProfileId(java.lang.String profileId) {
        this.profileId = profileId;
    }


    /**
     * Gets the setupEntityAccessItems value for this PermissionSet.
     * 
     * @return setupEntityAccessItems
     */
    public com.sforce.soap.enterprise.QueryResult getSetupEntityAccessItems() {
        return setupEntityAccessItems;
    }


    /**
     * Sets the setupEntityAccessItems value for this PermissionSet.
     * 
     * @param setupEntityAccessItems
     */
    public void setSetupEntityAccessItems(com.sforce.soap.enterprise.QueryResult setupEntityAccessItems) {
        this.setupEntityAccessItems = setupEntityAccessItems;
    }


    /**
     * Gets the systemModstamp value for this PermissionSet.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this PermissionSet.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userLicense value for this PermissionSet.
     * 
     * @return userLicense
     */
    public com.sforce.soap.enterprise.sobject.UserLicense getUserLicense() {
        return userLicense;
    }


    /**
     * Sets the userLicense value for this PermissionSet.
     * 
     * @param userLicense
     */
    public void setUserLicense(com.sforce.soap.enterprise.sobject.UserLicense userLicense) {
        this.userLicense = userLicense;
    }


    /**
     * Gets the userLicenseId value for this PermissionSet.
     * 
     * @return userLicenseId
     */
    public java.lang.String getUserLicenseId() {
        return userLicenseId;
    }


    /**
     * Sets the userLicenseId value for this PermissionSet.
     * 
     * @param userLicenseId
     */
    public void setUserLicenseId(java.lang.String userLicenseId) {
        this.userLicenseId = userLicenseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermissionSet)) return false;
        PermissionSet other = (PermissionSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignments==null && other.getAssignments()==null) || 
             (this.assignments!=null &&
              this.assignments.equals(other.getAssignments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.fieldPerms==null && other.getFieldPerms()==null) || 
             (this.fieldPerms!=null &&
              this.fieldPerms.equals(other.getFieldPerms()))) &&
            ((this.isOwnedByProfile==null && other.getIsOwnedByProfile()==null) || 
             (this.isOwnedByProfile!=null &&
              this.isOwnedByProfile.equals(other.getIsOwnedByProfile()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.objectPerms==null && other.getObjectPerms()==null) || 
             (this.objectPerms!=null &&
              this.objectPerms.equals(other.getObjectPerms()))) &&
            ((this.permissionsActivateContract==null && other.getPermissionsActivateContract()==null) || 
             (this.permissionsActivateContract!=null &&
              this.permissionsActivateContract.equals(other.getPermissionsActivateContract()))) &&
            ((this.permissionsActivateOrder==null && other.getPermissionsActivateOrder()==null) || 
             (this.permissionsActivateOrder!=null &&
              this.permissionsActivateOrder.equals(other.getPermissionsActivateOrder()))) &&
            ((this.permissionsAllowEmailIC==null && other.getPermissionsAllowEmailIC()==null) || 
             (this.permissionsAllowEmailIC!=null &&
              this.permissionsAllowEmailIC.equals(other.getPermissionsAllowEmailIC()))) &&
            ((this.permissionsAllowUniversalSearch==null && other.getPermissionsAllowUniversalSearch()==null) || 
             (this.permissionsAllowUniversalSearch!=null &&
              this.permissionsAllowUniversalSearch.equals(other.getPermissionsAllowUniversalSearch()))) &&
            ((this.permissionsAllowViewKnowledge==null && other.getPermissionsAllowViewKnowledge()==null) || 
             (this.permissionsAllowViewKnowledge!=null &&
              this.permissionsAllowViewKnowledge.equals(other.getPermissionsAllowViewKnowledge()))) &&
            ((this.permissionsApiEnabled==null && other.getPermissionsApiEnabled()==null) || 
             (this.permissionsApiEnabled!=null &&
              this.permissionsApiEnabled.equals(other.getPermissionsApiEnabled()))) &&
            ((this.permissionsAssignPermissionSets==null && other.getPermissionsAssignPermissionSets()==null) || 
             (this.permissionsAssignPermissionSets!=null &&
              this.permissionsAssignPermissionSets.equals(other.getPermissionsAssignPermissionSets()))) &&
            ((this.permissionsAssignTopics==null && other.getPermissionsAssignTopics()==null) || 
             (this.permissionsAssignTopics!=null &&
              this.permissionsAssignTopics.equals(other.getPermissionsAssignTopics()))) &&
            ((this.permissionsAuthorApex==null && other.getPermissionsAuthorApex()==null) || 
             (this.permissionsAuthorApex!=null &&
              this.permissionsAuthorApex.equals(other.getPermissionsAuthorApex()))) &&
            ((this.permissionsBulkApiHardDelete==null && other.getPermissionsBulkApiHardDelete()==null) || 
             (this.permissionsBulkApiHardDelete!=null &&
              this.permissionsBulkApiHardDelete.equals(other.getPermissionsBulkApiHardDelete()))) &&
            ((this.permissionsBulkMacrosAllowed==null && other.getPermissionsBulkMacrosAllowed()==null) || 
             (this.permissionsBulkMacrosAllowed!=null &&
              this.permissionsBulkMacrosAllowed.equals(other.getPermissionsBulkMacrosAllowed()))) &&
            ((this.permissionsCanInsertFeedSystemFields==null && other.getPermissionsCanInsertFeedSystemFields()==null) || 
             (this.permissionsCanInsertFeedSystemFields!=null &&
              this.permissionsCanInsertFeedSystemFields.equals(other.getPermissionsCanInsertFeedSystemFields()))) &&
            ((this.permissionsCanUseNewDashboardBuilder==null && other.getPermissionsCanUseNewDashboardBuilder()==null) || 
             (this.permissionsCanUseNewDashboardBuilder!=null &&
              this.permissionsCanUseNewDashboardBuilder.equals(other.getPermissionsCanUseNewDashboardBuilder()))) &&
            ((this.permissionsChatterEditOwnPost==null && other.getPermissionsChatterEditOwnPost()==null) || 
             (this.permissionsChatterEditOwnPost!=null &&
              this.permissionsChatterEditOwnPost.equals(other.getPermissionsChatterEditOwnPost()))) &&
            ((this.permissionsChatterEditOwnRecordPost==null && other.getPermissionsChatterEditOwnRecordPost()==null) || 
             (this.permissionsChatterEditOwnRecordPost!=null &&
              this.permissionsChatterEditOwnRecordPost.equals(other.getPermissionsChatterEditOwnRecordPost()))) &&
            ((this.permissionsChatterFileLink==null && other.getPermissionsChatterFileLink()==null) || 
             (this.permissionsChatterFileLink!=null &&
              this.permissionsChatterFileLink.equals(other.getPermissionsChatterFileLink()))) &&
            ((this.permissionsChatterForSharePoint==null && other.getPermissionsChatterForSharePoint()==null) || 
             (this.permissionsChatterForSharePoint!=null &&
              this.permissionsChatterForSharePoint.equals(other.getPermissionsChatterForSharePoint()))) &&
            ((this.permissionsChatterInternalUser==null && other.getPermissionsChatterInternalUser()==null) || 
             (this.permissionsChatterInternalUser!=null &&
              this.permissionsChatterInternalUser.equals(other.getPermissionsChatterInternalUser()))) &&
            ((this.permissionsChatterInviteExternalUsers==null && other.getPermissionsChatterInviteExternalUsers()==null) || 
             (this.permissionsChatterInviteExternalUsers!=null &&
              this.permissionsChatterInviteExternalUsers.equals(other.getPermissionsChatterInviteExternalUsers()))) &&
            ((this.permissionsChatterOwnGroups==null && other.getPermissionsChatterOwnGroups()==null) || 
             (this.permissionsChatterOwnGroups!=null &&
              this.permissionsChatterOwnGroups.equals(other.getPermissionsChatterOwnGroups()))) &&
            ((this.permissionsConfigCustomRecs==null && other.getPermissionsConfigCustomRecs()==null) || 
             (this.permissionsConfigCustomRecs!=null &&
              this.permissionsConfigCustomRecs.equals(other.getPermissionsConfigCustomRecs()))) &&
            ((this.permissionsConnectOrgToEnvironmentHub==null && other.getPermissionsConnectOrgToEnvironmentHub()==null) || 
             (this.permissionsConnectOrgToEnvironmentHub!=null &&
              this.permissionsConnectOrgToEnvironmentHub.equals(other.getPermissionsConnectOrgToEnvironmentHub()))) &&
            ((this.permissionsContentAdministrator==null && other.getPermissionsContentAdministrator()==null) || 
             (this.permissionsContentAdministrator!=null &&
              this.permissionsContentAdministrator.equals(other.getPermissionsContentAdministrator()))) &&
            ((this.permissionsConvertLeads==null && other.getPermissionsConvertLeads()==null) || 
             (this.permissionsConvertLeads!=null &&
              this.permissionsConvertLeads.equals(other.getPermissionsConvertLeads()))) &&
            ((this.permissionsCreateCustomizeDashboards==null && other.getPermissionsCreateCustomizeDashboards()==null) || 
             (this.permissionsCreateCustomizeDashboards!=null &&
              this.permissionsCreateCustomizeDashboards.equals(other.getPermissionsCreateCustomizeDashboards()))) &&
            ((this.permissionsCreateCustomizeFilters==null && other.getPermissionsCreateCustomizeFilters()==null) || 
             (this.permissionsCreateCustomizeFilters!=null &&
              this.permissionsCreateCustomizeFilters.equals(other.getPermissionsCreateCustomizeFilters()))) &&
            ((this.permissionsCreateCustomizeReports==null && other.getPermissionsCreateCustomizeReports()==null) || 
             (this.permissionsCreateCustomizeReports!=null &&
              this.permissionsCreateCustomizeReports.equals(other.getPermissionsCreateCustomizeReports()))) &&
            ((this.permissionsCreateDashboardFolders==null && other.getPermissionsCreateDashboardFolders()==null) || 
             (this.permissionsCreateDashboardFolders!=null &&
              this.permissionsCreateDashboardFolders.equals(other.getPermissionsCreateDashboardFolders()))) &&
            ((this.permissionsCreatePackaging==null && other.getPermissionsCreatePackaging()==null) || 
             (this.permissionsCreatePackaging!=null &&
              this.permissionsCreatePackaging.equals(other.getPermissionsCreatePackaging()))) &&
            ((this.permissionsCreateReportFolders==null && other.getPermissionsCreateReportFolders()==null) || 
             (this.permissionsCreateReportFolders!=null &&
              this.permissionsCreateReportFolders.equals(other.getPermissionsCreateReportFolders()))) &&
            ((this.permissionsCreateTopics==null && other.getPermissionsCreateTopics()==null) || 
             (this.permissionsCreateTopics!=null &&
              this.permissionsCreateTopics.equals(other.getPermissionsCreateTopics()))) &&
            ((this.permissionsCreateWorkspaces==null && other.getPermissionsCreateWorkspaces()==null) || 
             (this.permissionsCreateWorkspaces!=null &&
              this.permissionsCreateWorkspaces.equals(other.getPermissionsCreateWorkspaces()))) &&
            ((this.permissionsCustomMobileAppsAccess==null && other.getPermissionsCustomMobileAppsAccess()==null) || 
             (this.permissionsCustomMobileAppsAccess!=null &&
              this.permissionsCustomMobileAppsAccess.equals(other.getPermissionsCustomMobileAppsAccess()))) &&
            ((this.permissionsCustomSidebarOnAllPages==null && other.getPermissionsCustomSidebarOnAllPages()==null) || 
             (this.permissionsCustomSidebarOnAllPages!=null &&
              this.permissionsCustomSidebarOnAllPages.equals(other.getPermissionsCustomSidebarOnAllPages()))) &&
            ((this.permissionsCustomizeApplication==null && other.getPermissionsCustomizeApplication()==null) || 
             (this.permissionsCustomizeApplication!=null &&
              this.permissionsCustomizeApplication.equals(other.getPermissionsCustomizeApplication()))) &&
            ((this.permissionsDeleteActivatedContract==null && other.getPermissionsDeleteActivatedContract()==null) || 
             (this.permissionsDeleteActivatedContract!=null &&
              this.permissionsDeleteActivatedContract.equals(other.getPermissionsDeleteActivatedContract()))) &&
            ((this.permissionsDeleteTopics==null && other.getPermissionsDeleteTopics()==null) || 
             (this.permissionsDeleteTopics!=null &&
              this.permissionsDeleteTopics.equals(other.getPermissionsDeleteTopics()))) &&
            ((this.permissionsDistributeFromPersWksp==null && other.getPermissionsDistributeFromPersWksp()==null) || 
             (this.permissionsDistributeFromPersWksp!=null &&
              this.permissionsDistributeFromPersWksp.equals(other.getPermissionsDistributeFromPersWksp()))) &&
            ((this.permissionsEditActivatedOrders==null && other.getPermissionsEditActivatedOrders()==null) || 
             (this.permissionsEditActivatedOrders!=null &&
              this.permissionsEditActivatedOrders.equals(other.getPermissionsEditActivatedOrders()))) &&
            ((this.permissionsEditBrandTemplates==null && other.getPermissionsEditBrandTemplates()==null) || 
             (this.permissionsEditBrandTemplates!=null &&
              this.permissionsEditBrandTemplates.equals(other.getPermissionsEditBrandTemplates()))) &&
            ((this.permissionsEditCaseComments==null && other.getPermissionsEditCaseComments()==null) || 
             (this.permissionsEditCaseComments!=null &&
              this.permissionsEditCaseComments.equals(other.getPermissionsEditCaseComments()))) &&
            ((this.permissionsEditEvent==null && other.getPermissionsEditEvent()==null) || 
             (this.permissionsEditEvent!=null &&
              this.permissionsEditEvent.equals(other.getPermissionsEditEvent()))) &&
            ((this.permissionsEditHtmlTemplates==null && other.getPermissionsEditHtmlTemplates()==null) || 
             (this.permissionsEditHtmlTemplates!=null &&
              this.permissionsEditHtmlTemplates.equals(other.getPermissionsEditHtmlTemplates()))) &&
            ((this.permissionsEditKnowledge==null && other.getPermissionsEditKnowledge()==null) || 
             (this.permissionsEditKnowledge!=null &&
              this.permissionsEditKnowledge.equals(other.getPermissionsEditKnowledge()))) &&
            ((this.permissionsEditMyDashboards==null && other.getPermissionsEditMyDashboards()==null) || 
             (this.permissionsEditMyDashboards!=null &&
              this.permissionsEditMyDashboards.equals(other.getPermissionsEditMyDashboards()))) &&
            ((this.permissionsEditMyReports==null && other.getPermissionsEditMyReports()==null) || 
             (this.permissionsEditMyReports!=null &&
              this.permissionsEditMyReports.equals(other.getPermissionsEditMyReports()))) &&
            ((this.permissionsEditOppLineItemUnitPrice==null && other.getPermissionsEditOppLineItemUnitPrice()==null) || 
             (this.permissionsEditOppLineItemUnitPrice!=null &&
              this.permissionsEditOppLineItemUnitPrice.equals(other.getPermissionsEditOppLineItemUnitPrice()))) &&
            ((this.permissionsEditPublicDocuments==null && other.getPermissionsEditPublicDocuments()==null) || 
             (this.permissionsEditPublicDocuments!=null &&
              this.permissionsEditPublicDocuments.equals(other.getPermissionsEditPublicDocuments()))) &&
            ((this.permissionsEditPublicTemplates==null && other.getPermissionsEditPublicTemplates()==null) || 
             (this.permissionsEditPublicTemplates!=null &&
              this.permissionsEditPublicTemplates.equals(other.getPermissionsEditPublicTemplates()))) &&
            ((this.permissionsEditReadonlyFields==null && other.getPermissionsEditReadonlyFields()==null) || 
             (this.permissionsEditReadonlyFields!=null &&
              this.permissionsEditReadonlyFields.equals(other.getPermissionsEditReadonlyFields()))) &&
            ((this.permissionsEditTask==null && other.getPermissionsEditTask()==null) || 
             (this.permissionsEditTask!=null &&
              this.permissionsEditTask.equals(other.getPermissionsEditTask()))) &&
            ((this.permissionsEditTopics==null && other.getPermissionsEditTopics()==null) || 
             (this.permissionsEditTopics!=null &&
              this.permissionsEditTopics.equals(other.getPermissionsEditTopics()))) &&
            ((this.permissionsEmailAdministration==null && other.getPermissionsEmailAdministration()==null) || 
             (this.permissionsEmailAdministration!=null &&
              this.permissionsEmailAdministration.equals(other.getPermissionsEmailAdministration()))) &&
            ((this.permissionsEmailMass==null && other.getPermissionsEmailMass()==null) || 
             (this.permissionsEmailMass!=null &&
              this.permissionsEmailMass.equals(other.getPermissionsEmailMass()))) &&
            ((this.permissionsEmailSingle==null && other.getPermissionsEmailSingle()==null) || 
             (this.permissionsEmailSingle!=null &&
              this.permissionsEmailSingle.equals(other.getPermissionsEmailSingle()))) &&
            ((this.permissionsEmailTemplateManagement==null && other.getPermissionsEmailTemplateManagement()==null) || 
             (this.permissionsEmailTemplateManagement!=null &&
              this.permissionsEmailTemplateManagement.equals(other.getPermissionsEmailTemplateManagement()))) &&
            ((this.permissionsEnableNotifications==null && other.getPermissionsEnableNotifications()==null) || 
             (this.permissionsEnableNotifications!=null &&
              this.permissionsEnableNotifications.equals(other.getPermissionsEnableNotifications()))) &&
            ((this.permissionsExportReport==null && other.getPermissionsExportReport()==null) || 
             (this.permissionsExportReport!=null &&
              this.permissionsExportReport.equals(other.getPermissionsExportReport()))) &&
            ((this.permissionsFlowUFLRequired==null && other.getPermissionsFlowUFLRequired()==null) || 
             (this.permissionsFlowUFLRequired!=null &&
              this.permissionsFlowUFLRequired.equals(other.getPermissionsFlowUFLRequired()))) &&
            ((this.permissionsForceTwoFactor==null && other.getPermissionsForceTwoFactor()==null) || 
             (this.permissionsForceTwoFactor!=null &&
              this.permissionsForceTwoFactor.equals(other.getPermissionsForceTwoFactor()))) &&
            ((this.permissionsGovernNetworks==null && other.getPermissionsGovernNetworks()==null) || 
             (this.permissionsGovernNetworks!=null &&
              this.permissionsGovernNetworks.equals(other.getPermissionsGovernNetworks()))) &&
            ((this.permissionsIdentityConnect==null && other.getPermissionsIdentityConnect()==null) || 
             (this.permissionsIdentityConnect!=null &&
              this.permissionsIdentityConnect.equals(other.getPermissionsIdentityConnect()))) &&
            ((this.permissionsIdentityEnabled==null && other.getPermissionsIdentityEnabled()==null) || 
             (this.permissionsIdentityEnabled!=null &&
              this.permissionsIdentityEnabled.equals(other.getPermissionsIdentityEnabled()))) &&
            ((this.permissionsImportLeads==null && other.getPermissionsImportLeads()==null) || 
             (this.permissionsImportLeads!=null &&
              this.permissionsImportLeads.equals(other.getPermissionsImportLeads()))) &&
            ((this.permissionsImportPersonal==null && other.getPermissionsImportPersonal()==null) || 
             (this.permissionsImportPersonal!=null &&
              this.permissionsImportPersonal.equals(other.getPermissionsImportPersonal()))) &&
            ((this.permissionsInstallPackaging==null && other.getPermissionsInstallPackaging()==null) || 
             (this.permissionsInstallPackaging!=null &&
              this.permissionsInstallPackaging.equals(other.getPermissionsInstallPackaging()))) &&
            ((this.permissionsLightningExperienceUser==null && other.getPermissionsLightningExperienceUser()==null) || 
             (this.permissionsLightningExperienceUser!=null &&
              this.permissionsLightningExperienceUser.equals(other.getPermissionsLightningExperienceUser()))) &&
            ((this.permissionsManageAnalyticSnapshots==null && other.getPermissionsManageAnalyticSnapshots()==null) || 
             (this.permissionsManageAnalyticSnapshots!=null &&
              this.permissionsManageAnalyticSnapshots.equals(other.getPermissionsManageAnalyticSnapshots()))) &&
            ((this.permissionsManageAuthProviders==null && other.getPermissionsManageAuthProviders()==null) || 
             (this.permissionsManageAuthProviders!=null &&
              this.permissionsManageAuthProviders.equals(other.getPermissionsManageAuthProviders()))) &&
            ((this.permissionsManageBusinessHourHolidays==null && other.getPermissionsManageBusinessHourHolidays()==null) || 
             (this.permissionsManageBusinessHourHolidays!=null &&
              this.permissionsManageBusinessHourHolidays.equals(other.getPermissionsManageBusinessHourHolidays()))) &&
            ((this.permissionsManageCallCenters==null && other.getPermissionsManageCallCenters()==null) || 
             (this.permissionsManageCallCenters!=null &&
              this.permissionsManageCallCenters.equals(other.getPermissionsManageCallCenters()))) &&
            ((this.permissionsManageCases==null && other.getPermissionsManageCases()==null) || 
             (this.permissionsManageCases!=null &&
              this.permissionsManageCases.equals(other.getPermissionsManageCases()))) &&
            ((this.permissionsManageCategories==null && other.getPermissionsManageCategories()==null) || 
             (this.permissionsManageCategories!=null &&
              this.permissionsManageCategories.equals(other.getPermissionsManageCategories()))) &&
            ((this.permissionsManageChatterMessages==null && other.getPermissionsManageChatterMessages()==null) || 
             (this.permissionsManageChatterMessages!=null &&
              this.permissionsManageChatterMessages.equals(other.getPermissionsManageChatterMessages()))) &&
            ((this.permissionsManageContentPermissions==null && other.getPermissionsManageContentPermissions()==null) || 
             (this.permissionsManageContentPermissions!=null &&
              this.permissionsManageContentPermissions.equals(other.getPermissionsManageContentPermissions()))) &&
            ((this.permissionsManageContentProperties==null && other.getPermissionsManageContentProperties()==null) || 
             (this.permissionsManageContentProperties!=null &&
              this.permissionsManageContentProperties.equals(other.getPermissionsManageContentProperties()))) &&
            ((this.permissionsManageContentTypes==null && other.getPermissionsManageContentTypes()==null) || 
             (this.permissionsManageContentTypes!=null &&
              this.permissionsManageContentTypes.equals(other.getPermissionsManageContentTypes()))) &&
            ((this.permissionsManageCustomPermissions==null && other.getPermissionsManageCustomPermissions()==null) || 
             (this.permissionsManageCustomPermissions!=null &&
              this.permissionsManageCustomPermissions.equals(other.getPermissionsManageCustomPermissions()))) &&
            ((this.permissionsManageCustomReportTypes==null && other.getPermissionsManageCustomReportTypes()==null) || 
             (this.permissionsManageCustomReportTypes!=null &&
              this.permissionsManageCustomReportTypes.equals(other.getPermissionsManageCustomReportTypes()))) &&
            ((this.permissionsManageDashbdsInPubFolders==null && other.getPermissionsManageDashbdsInPubFolders()==null) || 
             (this.permissionsManageDashbdsInPubFolders!=null &&
              this.permissionsManageDashbdsInPubFolders.equals(other.getPermissionsManageDashbdsInPubFolders()))) &&
            ((this.permissionsManageDataCategories==null && other.getPermissionsManageDataCategories()==null) || 
             (this.permissionsManageDataCategories!=null &&
              this.permissionsManageDataCategories.equals(other.getPermissionsManageDataCategories()))) &&
            ((this.permissionsManageDataIntegrations==null && other.getPermissionsManageDataIntegrations()==null) || 
             (this.permissionsManageDataIntegrations!=null &&
              this.permissionsManageDataIntegrations.equals(other.getPermissionsManageDataIntegrations()))) &&
            ((this.permissionsManageDynamicDashboards==null && other.getPermissionsManageDynamicDashboards()==null) || 
             (this.permissionsManageDynamicDashboards!=null &&
              this.permissionsManageDynamicDashboards.equals(other.getPermissionsManageDynamicDashboards()))) &&
            ((this.permissionsManageEmailClientConfig==null && other.getPermissionsManageEmailClientConfig()==null) || 
             (this.permissionsManageEmailClientConfig!=null &&
              this.permissionsManageEmailClientConfig.equals(other.getPermissionsManageEmailClientConfig()))) &&
            ((this.permissionsManageEncryptionKeys==null && other.getPermissionsManageEncryptionKeys()==null) || 
             (this.permissionsManageEncryptionKeys!=null &&
              this.permissionsManageEncryptionKeys.equals(other.getPermissionsManageEncryptionKeys()))) &&
            ((this.permissionsManageExchangeConfig==null && other.getPermissionsManageExchangeConfig()==null) || 
             (this.permissionsManageExchangeConfig!=null &&
              this.permissionsManageExchangeConfig.equals(other.getPermissionsManageExchangeConfig()))) &&
            ((this.permissionsManageInteraction==null && other.getPermissionsManageInteraction()==null) || 
             (this.permissionsManageInteraction!=null &&
              this.permissionsManageInteraction.equals(other.getPermissionsManageInteraction()))) &&
            ((this.permissionsManageInternalUsers==null && other.getPermissionsManageInternalUsers()==null) || 
             (this.permissionsManageInternalUsers!=null &&
              this.permissionsManageInternalUsers.equals(other.getPermissionsManageInternalUsers()))) &&
            ((this.permissionsManageIpAddresses==null && other.getPermissionsManageIpAddresses()==null) || 
             (this.permissionsManageIpAddresses!=null &&
              this.permissionsManageIpAddresses.equals(other.getPermissionsManageIpAddresses()))) &&
            ((this.permissionsManageKnowledge==null && other.getPermissionsManageKnowledge()==null) || 
             (this.permissionsManageKnowledge!=null &&
              this.permissionsManageKnowledge.equals(other.getPermissionsManageKnowledge()))) &&
            ((this.permissionsManageKnowledgeImportExport==null && other.getPermissionsManageKnowledgeImportExport()==null) || 
             (this.permissionsManageKnowledgeImportExport!=null &&
              this.permissionsManageKnowledgeImportExport.equals(other.getPermissionsManageKnowledgeImportExport()))) &&
            ((this.permissionsManageLeads==null && other.getPermissionsManageLeads()==null) || 
             (this.permissionsManageLeads!=null &&
              this.permissionsManageLeads.equals(other.getPermissionsManageLeads()))) &&
            ((this.permissionsManageLoginAccessPolicies==null && other.getPermissionsManageLoginAccessPolicies()==null) || 
             (this.permissionsManageLoginAccessPolicies!=null &&
              this.permissionsManageLoginAccessPolicies.equals(other.getPermissionsManageLoginAccessPolicies()))) &&
            ((this.permissionsManageMobile==null && other.getPermissionsManageMobile()==null) || 
             (this.permissionsManageMobile!=null &&
              this.permissionsManageMobile.equals(other.getPermissionsManageMobile()))) &&
            ((this.permissionsManageNetworks==null && other.getPermissionsManageNetworks()==null) || 
             (this.permissionsManageNetworks!=null &&
              this.permissionsManageNetworks.equals(other.getPermissionsManageNetworks()))) &&
            ((this.permissionsManagePasswordPolicies==null && other.getPermissionsManagePasswordPolicies()==null) || 
             (this.permissionsManagePasswordPolicies!=null &&
              this.permissionsManagePasswordPolicies.equals(other.getPermissionsManagePasswordPolicies()))) &&
            ((this.permissionsManageProfilesPermissionsets==null && other.getPermissionsManageProfilesPermissionsets()==null) || 
             (this.permissionsManageProfilesPermissionsets!=null &&
              this.permissionsManageProfilesPermissionsets.equals(other.getPermissionsManageProfilesPermissionsets()))) &&
            ((this.permissionsManageRemoteAccess==null && other.getPermissionsManageRemoteAccess()==null) || 
             (this.permissionsManageRemoteAccess!=null &&
              this.permissionsManageRemoteAccess.equals(other.getPermissionsManageRemoteAccess()))) &&
            ((this.permissionsManageReportsInPubFolders==null && other.getPermissionsManageReportsInPubFolders()==null) || 
             (this.permissionsManageReportsInPubFolders!=null &&
              this.permissionsManageReportsInPubFolders.equals(other.getPermissionsManageReportsInPubFolders()))) &&
            ((this.permissionsManageRoles==null && other.getPermissionsManageRoles()==null) || 
             (this.permissionsManageRoles!=null &&
              this.permissionsManageRoles.equals(other.getPermissionsManageRoles()))) &&
            ((this.permissionsManageSearchPromotionRules==null && other.getPermissionsManageSearchPromotionRules()==null) || 
             (this.permissionsManageSearchPromotionRules!=null &&
              this.permissionsManageSearchPromotionRules.equals(other.getPermissionsManageSearchPromotionRules()))) &&
            ((this.permissionsManageSharing==null && other.getPermissionsManageSharing()==null) || 
             (this.permissionsManageSharing!=null &&
              this.permissionsManageSharing.equals(other.getPermissionsManageSharing()))) &&
            ((this.permissionsManageSolutions==null && other.getPermissionsManageSolutions()==null) || 
             (this.permissionsManageSolutions!=null &&
              this.permissionsManageSolutions.equals(other.getPermissionsManageSolutions()))) &&
            ((this.permissionsManageSynonyms==null && other.getPermissionsManageSynonyms()==null) || 
             (this.permissionsManageSynonyms!=null &&
              this.permissionsManageSynonyms.equals(other.getPermissionsManageSynonyms()))) &&
            ((this.permissionsManageTwoFactor==null && other.getPermissionsManageTwoFactor()==null) || 
             (this.permissionsManageTwoFactor!=null &&
              this.permissionsManageTwoFactor.equals(other.getPermissionsManageTwoFactor()))) &&
            ((this.permissionsManageUnlistedGroups==null && other.getPermissionsManageUnlistedGroups()==null) || 
             (this.permissionsManageUnlistedGroups!=null &&
              this.permissionsManageUnlistedGroups.equals(other.getPermissionsManageUnlistedGroups()))) &&
            ((this.permissionsManageUsers==null && other.getPermissionsManageUsers()==null) || 
             (this.permissionsManageUsers!=null &&
              this.permissionsManageUsers.equals(other.getPermissionsManageUsers()))) &&
            ((this.permissionsMassInlineEdit==null && other.getPermissionsMassInlineEdit()==null) || 
             (this.permissionsMassInlineEdit!=null &&
              this.permissionsMassInlineEdit.equals(other.getPermissionsMassInlineEdit()))) &&
            ((this.permissionsMergeTopics==null && other.getPermissionsMergeTopics()==null) || 
             (this.permissionsMergeTopics!=null &&
              this.permissionsMergeTopics.equals(other.getPermissionsMergeTopics()))) &&
            ((this.permissionsModerateChatter==null && other.getPermissionsModerateChatter()==null) || 
             (this.permissionsModerateChatter!=null &&
              this.permissionsModerateChatter.equals(other.getPermissionsModerateChatter()))) &&
            ((this.permissionsModifyAllData==null && other.getPermissionsModifyAllData()==null) || 
             (this.permissionsModifyAllData!=null &&
              this.permissionsModifyAllData.equals(other.getPermissionsModifyAllData()))) &&
            ((this.permissionsModifySecureAgents==null && other.getPermissionsModifySecureAgents()==null) || 
             (this.permissionsModifySecureAgents!=null &&
              this.permissionsModifySecureAgents.equals(other.getPermissionsModifySecureAgents()))) &&
            ((this.permissionsNewReportBuilder==null && other.getPermissionsNewReportBuilder()==null) || 
             (this.permissionsNewReportBuilder!=null &&
              this.permissionsNewReportBuilder.equals(other.getPermissionsNewReportBuilder()))) &&
            ((this.permissionsPasswordNeverExpires==null && other.getPermissionsPasswordNeverExpires()==null) || 
             (this.permissionsPasswordNeverExpires!=null &&
              this.permissionsPasswordNeverExpires.equals(other.getPermissionsPasswordNeverExpires()))) &&
            ((this.permissionsPublishPackaging==null && other.getPermissionsPublishPackaging()==null) || 
             (this.permissionsPublishPackaging!=null &&
              this.permissionsPublishPackaging.equals(other.getPermissionsPublishPackaging()))) &&
            ((this.permissionsResetPasswords==null && other.getPermissionsResetPasswords()==null) || 
             (this.permissionsResetPasswords!=null &&
              this.permissionsResetPasswords.equals(other.getPermissionsResetPasswords()))) &&
            ((this.permissionsRunFlow==null && other.getPermissionsRunFlow()==null) || 
             (this.permissionsRunFlow!=null &&
              this.permissionsRunFlow.equals(other.getPermissionsRunFlow()))) &&
            ((this.permissionsRunReports==null && other.getPermissionsRunReports()==null) || 
             (this.permissionsRunReports!=null &&
              this.permissionsRunReports.equals(other.getPermissionsRunReports()))) &&
            ((this.permissionsSalesConsole==null && other.getPermissionsSalesConsole()==null) || 
             (this.permissionsSalesConsole!=null &&
              this.permissionsSalesConsole.equals(other.getPermissionsSalesConsole()))) &&
            ((this.permissionsScheduleReports==null && other.getPermissionsScheduleReports()==null) || 
             (this.permissionsScheduleReports!=null &&
              this.permissionsScheduleReports.equals(other.getPermissionsScheduleReports()))) &&
            ((this.permissionsSelectFilesFromSalesforce==null && other.getPermissionsSelectFilesFromSalesforce()==null) || 
             (this.permissionsSelectFilesFromSalesforce!=null &&
              this.permissionsSelectFilesFromSalesforce.equals(other.getPermissionsSelectFilesFromSalesforce()))) &&
            ((this.permissionsSendSitRequests==null && other.getPermissionsSendSitRequests()==null) || 
             (this.permissionsSendSitRequests!=null &&
              this.permissionsSendSitRequests.equals(other.getPermissionsSendSitRequests()))) &&
            ((this.permissionsShareInternalArticles==null && other.getPermissionsShareInternalArticles()==null) || 
             (this.permissionsShareInternalArticles!=null &&
              this.permissionsShareInternalArticles.equals(other.getPermissionsShareInternalArticles()))) &&
            ((this.permissionsSolutionImport==null && other.getPermissionsSolutionImport()==null) || 
             (this.permissionsSolutionImport!=null &&
              this.permissionsSolutionImport.equals(other.getPermissionsSolutionImport()))) &&
            ((this.permissionsSubmitMacrosAllowed==null && other.getPermissionsSubmitMacrosAllowed()==null) || 
             (this.permissionsSubmitMacrosAllowed!=null &&
              this.permissionsSubmitMacrosAllowed.equals(other.getPermissionsSubmitMacrosAllowed()))) &&
            ((this.permissionsTransferAnyCase==null && other.getPermissionsTransferAnyCase()==null) || 
             (this.permissionsTransferAnyCase!=null &&
              this.permissionsTransferAnyCase.equals(other.getPermissionsTransferAnyCase()))) &&
            ((this.permissionsTransferAnyEntity==null && other.getPermissionsTransferAnyEntity()==null) || 
             (this.permissionsTransferAnyEntity!=null &&
              this.permissionsTransferAnyEntity.equals(other.getPermissionsTransferAnyEntity()))) &&
            ((this.permissionsTransferAnyLead==null && other.getPermissionsTransferAnyLead()==null) || 
             (this.permissionsTransferAnyLead!=null &&
              this.permissionsTransferAnyLead.equals(other.getPermissionsTransferAnyLead()))) &&
            ((this.permissionsTwoFactorApi==null && other.getPermissionsTwoFactorApi()==null) || 
             (this.permissionsTwoFactorApi!=null &&
              this.permissionsTwoFactorApi.equals(other.getPermissionsTwoFactorApi()))) &&
            ((this.permissionsUseTeamReassignWizards==null && other.getPermissionsUseTeamReassignWizards()==null) || 
             (this.permissionsUseTeamReassignWizards!=null &&
              this.permissionsUseTeamReassignWizards.equals(other.getPermissionsUseTeamReassignWizards()))) &&
            ((this.permissionsViewAllData==null && other.getPermissionsViewAllData()==null) || 
             (this.permissionsViewAllData!=null &&
              this.permissionsViewAllData.equals(other.getPermissionsViewAllData()))) &&
            ((this.permissionsViewAllUsers==null && other.getPermissionsViewAllUsers()==null) || 
             (this.permissionsViewAllUsers!=null &&
              this.permissionsViewAllUsers.equals(other.getPermissionsViewAllUsers()))) &&
            ((this.permissionsViewContent==null && other.getPermissionsViewContent()==null) || 
             (this.permissionsViewContent!=null &&
              this.permissionsViewContent.equals(other.getPermissionsViewContent()))) &&
            ((this.permissionsViewDataCategories==null && other.getPermissionsViewDataCategories()==null) || 
             (this.permissionsViewDataCategories!=null &&
              this.permissionsViewDataCategories.equals(other.getPermissionsViewDataCategories()))) &&
            ((this.permissionsViewEncryptedData==null && other.getPermissionsViewEncryptedData()==null) || 
             (this.permissionsViewEncryptedData!=null &&
              this.permissionsViewEncryptedData.equals(other.getPermissionsViewEncryptedData()))) &&
            ((this.permissionsViewEventLogFiles==null && other.getPermissionsViewEventLogFiles()==null) || 
             (this.permissionsViewEventLogFiles!=null &&
              this.permissionsViewEventLogFiles.equals(other.getPermissionsViewEventLogFiles()))) &&
            ((this.permissionsViewHelpLink==null && other.getPermissionsViewHelpLink()==null) || 
             (this.permissionsViewHelpLink!=null &&
              this.permissionsViewHelpLink.equals(other.getPermissionsViewHelpLink()))) &&
            ((this.permissionsViewMyTeamsDashboards==null && other.getPermissionsViewMyTeamsDashboards()==null) || 
             (this.permissionsViewMyTeamsDashboards!=null &&
              this.permissionsViewMyTeamsDashboards.equals(other.getPermissionsViewMyTeamsDashboards()))) &&
            ((this.permissionsViewPublicDashboards==null && other.getPermissionsViewPublicDashboards()==null) || 
             (this.permissionsViewPublicDashboards!=null &&
              this.permissionsViewPublicDashboards.equals(other.getPermissionsViewPublicDashboards()))) &&
            ((this.permissionsViewPublicReports==null && other.getPermissionsViewPublicReports()==null) || 
             (this.permissionsViewPublicReports!=null &&
              this.permissionsViewPublicReports.equals(other.getPermissionsViewPublicReports()))) &&
            ((this.permissionsViewSetup==null && other.getPermissionsViewSetup()==null) || 
             (this.permissionsViewSetup!=null &&
              this.permissionsViewSetup.equals(other.getPermissionsViewSetup()))) &&
            ((this.permissionsWorkCalibrationUser==null && other.getPermissionsWorkCalibrationUser()==null) || 
             (this.permissionsWorkCalibrationUser!=null &&
              this.permissionsWorkCalibrationUser.equals(other.getPermissionsWorkCalibrationUser()))) &&
            ((this.permissionsWorkDotComUserPerm==null && other.getPermissionsWorkDotComUserPerm()==null) || 
             (this.permissionsWorkDotComUserPerm!=null &&
              this.permissionsWorkDotComUserPerm.equals(other.getPermissionsWorkDotComUserPerm()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.profileId==null && other.getProfileId()==null) || 
             (this.profileId!=null &&
              this.profileId.equals(other.getProfileId()))) &&
            ((this.setupEntityAccessItems==null && other.getSetupEntityAccessItems()==null) || 
             (this.setupEntityAccessItems!=null &&
              this.setupEntityAccessItems.equals(other.getSetupEntityAccessItems()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userLicense==null && other.getUserLicense()==null) || 
             (this.userLicense!=null &&
              this.userLicense.equals(other.getUserLicense()))) &&
            ((this.userLicenseId==null && other.getUserLicenseId()==null) || 
             (this.userLicenseId!=null &&
              this.userLicenseId.equals(other.getUserLicenseId())));
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
        if (getAssignments() != null) {
            _hashCode += getAssignments().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFieldPerms() != null) {
            _hashCode += getFieldPerms().hashCode();
        }
        if (getIsOwnedByProfile() != null) {
            _hashCode += getIsOwnedByProfile().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getObjectPerms() != null) {
            _hashCode += getObjectPerms().hashCode();
        }
        if (getPermissionsActivateContract() != null) {
            _hashCode += getPermissionsActivateContract().hashCode();
        }
        if (getPermissionsActivateOrder() != null) {
            _hashCode += getPermissionsActivateOrder().hashCode();
        }
        if (getPermissionsAllowEmailIC() != null) {
            _hashCode += getPermissionsAllowEmailIC().hashCode();
        }
        if (getPermissionsAllowUniversalSearch() != null) {
            _hashCode += getPermissionsAllowUniversalSearch().hashCode();
        }
        if (getPermissionsAllowViewKnowledge() != null) {
            _hashCode += getPermissionsAllowViewKnowledge().hashCode();
        }
        if (getPermissionsApiEnabled() != null) {
            _hashCode += getPermissionsApiEnabled().hashCode();
        }
        if (getPermissionsAssignPermissionSets() != null) {
            _hashCode += getPermissionsAssignPermissionSets().hashCode();
        }
        if (getPermissionsAssignTopics() != null) {
            _hashCode += getPermissionsAssignTopics().hashCode();
        }
        if (getPermissionsAuthorApex() != null) {
            _hashCode += getPermissionsAuthorApex().hashCode();
        }
        if (getPermissionsBulkApiHardDelete() != null) {
            _hashCode += getPermissionsBulkApiHardDelete().hashCode();
        }
        if (getPermissionsBulkMacrosAllowed() != null) {
            _hashCode += getPermissionsBulkMacrosAllowed().hashCode();
        }
        if (getPermissionsCanInsertFeedSystemFields() != null) {
            _hashCode += getPermissionsCanInsertFeedSystemFields().hashCode();
        }
        if (getPermissionsCanUseNewDashboardBuilder() != null) {
            _hashCode += getPermissionsCanUseNewDashboardBuilder().hashCode();
        }
        if (getPermissionsChatterEditOwnPost() != null) {
            _hashCode += getPermissionsChatterEditOwnPost().hashCode();
        }
        if (getPermissionsChatterEditOwnRecordPost() != null) {
            _hashCode += getPermissionsChatterEditOwnRecordPost().hashCode();
        }
        if (getPermissionsChatterFileLink() != null) {
            _hashCode += getPermissionsChatterFileLink().hashCode();
        }
        if (getPermissionsChatterForSharePoint() != null) {
            _hashCode += getPermissionsChatterForSharePoint().hashCode();
        }
        if (getPermissionsChatterInternalUser() != null) {
            _hashCode += getPermissionsChatterInternalUser().hashCode();
        }
        if (getPermissionsChatterInviteExternalUsers() != null) {
            _hashCode += getPermissionsChatterInviteExternalUsers().hashCode();
        }
        if (getPermissionsChatterOwnGroups() != null) {
            _hashCode += getPermissionsChatterOwnGroups().hashCode();
        }
        if (getPermissionsConfigCustomRecs() != null) {
            _hashCode += getPermissionsConfigCustomRecs().hashCode();
        }
        if (getPermissionsConnectOrgToEnvironmentHub() != null) {
            _hashCode += getPermissionsConnectOrgToEnvironmentHub().hashCode();
        }
        if (getPermissionsContentAdministrator() != null) {
            _hashCode += getPermissionsContentAdministrator().hashCode();
        }
        if (getPermissionsConvertLeads() != null) {
            _hashCode += getPermissionsConvertLeads().hashCode();
        }
        if (getPermissionsCreateCustomizeDashboards() != null) {
            _hashCode += getPermissionsCreateCustomizeDashboards().hashCode();
        }
        if (getPermissionsCreateCustomizeFilters() != null) {
            _hashCode += getPermissionsCreateCustomizeFilters().hashCode();
        }
        if (getPermissionsCreateCustomizeReports() != null) {
            _hashCode += getPermissionsCreateCustomizeReports().hashCode();
        }
        if (getPermissionsCreateDashboardFolders() != null) {
            _hashCode += getPermissionsCreateDashboardFolders().hashCode();
        }
        if (getPermissionsCreatePackaging() != null) {
            _hashCode += getPermissionsCreatePackaging().hashCode();
        }
        if (getPermissionsCreateReportFolders() != null) {
            _hashCode += getPermissionsCreateReportFolders().hashCode();
        }
        if (getPermissionsCreateTopics() != null) {
            _hashCode += getPermissionsCreateTopics().hashCode();
        }
        if (getPermissionsCreateWorkspaces() != null) {
            _hashCode += getPermissionsCreateWorkspaces().hashCode();
        }
        if (getPermissionsCustomMobileAppsAccess() != null) {
            _hashCode += getPermissionsCustomMobileAppsAccess().hashCode();
        }
        if (getPermissionsCustomSidebarOnAllPages() != null) {
            _hashCode += getPermissionsCustomSidebarOnAllPages().hashCode();
        }
        if (getPermissionsCustomizeApplication() != null) {
            _hashCode += getPermissionsCustomizeApplication().hashCode();
        }
        if (getPermissionsDeleteActivatedContract() != null) {
            _hashCode += getPermissionsDeleteActivatedContract().hashCode();
        }
        if (getPermissionsDeleteTopics() != null) {
            _hashCode += getPermissionsDeleteTopics().hashCode();
        }
        if (getPermissionsDistributeFromPersWksp() != null) {
            _hashCode += getPermissionsDistributeFromPersWksp().hashCode();
        }
        if (getPermissionsEditActivatedOrders() != null) {
            _hashCode += getPermissionsEditActivatedOrders().hashCode();
        }
        if (getPermissionsEditBrandTemplates() != null) {
            _hashCode += getPermissionsEditBrandTemplates().hashCode();
        }
        if (getPermissionsEditCaseComments() != null) {
            _hashCode += getPermissionsEditCaseComments().hashCode();
        }
        if (getPermissionsEditEvent() != null) {
            _hashCode += getPermissionsEditEvent().hashCode();
        }
        if (getPermissionsEditHtmlTemplates() != null) {
            _hashCode += getPermissionsEditHtmlTemplates().hashCode();
        }
        if (getPermissionsEditKnowledge() != null) {
            _hashCode += getPermissionsEditKnowledge().hashCode();
        }
        if (getPermissionsEditMyDashboards() != null) {
            _hashCode += getPermissionsEditMyDashboards().hashCode();
        }
        if (getPermissionsEditMyReports() != null) {
            _hashCode += getPermissionsEditMyReports().hashCode();
        }
        if (getPermissionsEditOppLineItemUnitPrice() != null) {
            _hashCode += getPermissionsEditOppLineItemUnitPrice().hashCode();
        }
        if (getPermissionsEditPublicDocuments() != null) {
            _hashCode += getPermissionsEditPublicDocuments().hashCode();
        }
        if (getPermissionsEditPublicTemplates() != null) {
            _hashCode += getPermissionsEditPublicTemplates().hashCode();
        }
        if (getPermissionsEditReadonlyFields() != null) {
            _hashCode += getPermissionsEditReadonlyFields().hashCode();
        }
        if (getPermissionsEditTask() != null) {
            _hashCode += getPermissionsEditTask().hashCode();
        }
        if (getPermissionsEditTopics() != null) {
            _hashCode += getPermissionsEditTopics().hashCode();
        }
        if (getPermissionsEmailAdministration() != null) {
            _hashCode += getPermissionsEmailAdministration().hashCode();
        }
        if (getPermissionsEmailMass() != null) {
            _hashCode += getPermissionsEmailMass().hashCode();
        }
        if (getPermissionsEmailSingle() != null) {
            _hashCode += getPermissionsEmailSingle().hashCode();
        }
        if (getPermissionsEmailTemplateManagement() != null) {
            _hashCode += getPermissionsEmailTemplateManagement().hashCode();
        }
        if (getPermissionsEnableNotifications() != null) {
            _hashCode += getPermissionsEnableNotifications().hashCode();
        }
        if (getPermissionsExportReport() != null) {
            _hashCode += getPermissionsExportReport().hashCode();
        }
        if (getPermissionsFlowUFLRequired() != null) {
            _hashCode += getPermissionsFlowUFLRequired().hashCode();
        }
        if (getPermissionsForceTwoFactor() != null) {
            _hashCode += getPermissionsForceTwoFactor().hashCode();
        }
        if (getPermissionsGovernNetworks() != null) {
            _hashCode += getPermissionsGovernNetworks().hashCode();
        }
        if (getPermissionsIdentityConnect() != null) {
            _hashCode += getPermissionsIdentityConnect().hashCode();
        }
        if (getPermissionsIdentityEnabled() != null) {
            _hashCode += getPermissionsIdentityEnabled().hashCode();
        }
        if (getPermissionsImportLeads() != null) {
            _hashCode += getPermissionsImportLeads().hashCode();
        }
        if (getPermissionsImportPersonal() != null) {
            _hashCode += getPermissionsImportPersonal().hashCode();
        }
        if (getPermissionsInstallPackaging() != null) {
            _hashCode += getPermissionsInstallPackaging().hashCode();
        }
        if (getPermissionsLightningExperienceUser() != null) {
            _hashCode += getPermissionsLightningExperienceUser().hashCode();
        }
        if (getPermissionsManageAnalyticSnapshots() != null) {
            _hashCode += getPermissionsManageAnalyticSnapshots().hashCode();
        }
        if (getPermissionsManageAuthProviders() != null) {
            _hashCode += getPermissionsManageAuthProviders().hashCode();
        }
        if (getPermissionsManageBusinessHourHolidays() != null) {
            _hashCode += getPermissionsManageBusinessHourHolidays().hashCode();
        }
        if (getPermissionsManageCallCenters() != null) {
            _hashCode += getPermissionsManageCallCenters().hashCode();
        }
        if (getPermissionsManageCases() != null) {
            _hashCode += getPermissionsManageCases().hashCode();
        }
        if (getPermissionsManageCategories() != null) {
            _hashCode += getPermissionsManageCategories().hashCode();
        }
        if (getPermissionsManageChatterMessages() != null) {
            _hashCode += getPermissionsManageChatterMessages().hashCode();
        }
        if (getPermissionsManageContentPermissions() != null) {
            _hashCode += getPermissionsManageContentPermissions().hashCode();
        }
        if (getPermissionsManageContentProperties() != null) {
            _hashCode += getPermissionsManageContentProperties().hashCode();
        }
        if (getPermissionsManageContentTypes() != null) {
            _hashCode += getPermissionsManageContentTypes().hashCode();
        }
        if (getPermissionsManageCustomPermissions() != null) {
            _hashCode += getPermissionsManageCustomPermissions().hashCode();
        }
        if (getPermissionsManageCustomReportTypes() != null) {
            _hashCode += getPermissionsManageCustomReportTypes().hashCode();
        }
        if (getPermissionsManageDashbdsInPubFolders() != null) {
            _hashCode += getPermissionsManageDashbdsInPubFolders().hashCode();
        }
        if (getPermissionsManageDataCategories() != null) {
            _hashCode += getPermissionsManageDataCategories().hashCode();
        }
        if (getPermissionsManageDataIntegrations() != null) {
            _hashCode += getPermissionsManageDataIntegrations().hashCode();
        }
        if (getPermissionsManageDynamicDashboards() != null) {
            _hashCode += getPermissionsManageDynamicDashboards().hashCode();
        }
        if (getPermissionsManageEmailClientConfig() != null) {
            _hashCode += getPermissionsManageEmailClientConfig().hashCode();
        }
        if (getPermissionsManageEncryptionKeys() != null) {
            _hashCode += getPermissionsManageEncryptionKeys().hashCode();
        }
        if (getPermissionsManageExchangeConfig() != null) {
            _hashCode += getPermissionsManageExchangeConfig().hashCode();
        }
        if (getPermissionsManageInteraction() != null) {
            _hashCode += getPermissionsManageInteraction().hashCode();
        }
        if (getPermissionsManageInternalUsers() != null) {
            _hashCode += getPermissionsManageInternalUsers().hashCode();
        }
        if (getPermissionsManageIpAddresses() != null) {
            _hashCode += getPermissionsManageIpAddresses().hashCode();
        }
        if (getPermissionsManageKnowledge() != null) {
            _hashCode += getPermissionsManageKnowledge().hashCode();
        }
        if (getPermissionsManageKnowledgeImportExport() != null) {
            _hashCode += getPermissionsManageKnowledgeImportExport().hashCode();
        }
        if (getPermissionsManageLeads() != null) {
            _hashCode += getPermissionsManageLeads().hashCode();
        }
        if (getPermissionsManageLoginAccessPolicies() != null) {
            _hashCode += getPermissionsManageLoginAccessPolicies().hashCode();
        }
        if (getPermissionsManageMobile() != null) {
            _hashCode += getPermissionsManageMobile().hashCode();
        }
        if (getPermissionsManageNetworks() != null) {
            _hashCode += getPermissionsManageNetworks().hashCode();
        }
        if (getPermissionsManagePasswordPolicies() != null) {
            _hashCode += getPermissionsManagePasswordPolicies().hashCode();
        }
        if (getPermissionsManageProfilesPermissionsets() != null) {
            _hashCode += getPermissionsManageProfilesPermissionsets().hashCode();
        }
        if (getPermissionsManageRemoteAccess() != null) {
            _hashCode += getPermissionsManageRemoteAccess().hashCode();
        }
        if (getPermissionsManageReportsInPubFolders() != null) {
            _hashCode += getPermissionsManageReportsInPubFolders().hashCode();
        }
        if (getPermissionsManageRoles() != null) {
            _hashCode += getPermissionsManageRoles().hashCode();
        }
        if (getPermissionsManageSearchPromotionRules() != null) {
            _hashCode += getPermissionsManageSearchPromotionRules().hashCode();
        }
        if (getPermissionsManageSharing() != null) {
            _hashCode += getPermissionsManageSharing().hashCode();
        }
        if (getPermissionsManageSolutions() != null) {
            _hashCode += getPermissionsManageSolutions().hashCode();
        }
        if (getPermissionsManageSynonyms() != null) {
            _hashCode += getPermissionsManageSynonyms().hashCode();
        }
        if (getPermissionsManageTwoFactor() != null) {
            _hashCode += getPermissionsManageTwoFactor().hashCode();
        }
        if (getPermissionsManageUnlistedGroups() != null) {
            _hashCode += getPermissionsManageUnlistedGroups().hashCode();
        }
        if (getPermissionsManageUsers() != null) {
            _hashCode += getPermissionsManageUsers().hashCode();
        }
        if (getPermissionsMassInlineEdit() != null) {
            _hashCode += getPermissionsMassInlineEdit().hashCode();
        }
        if (getPermissionsMergeTopics() != null) {
            _hashCode += getPermissionsMergeTopics().hashCode();
        }
        if (getPermissionsModerateChatter() != null) {
            _hashCode += getPermissionsModerateChatter().hashCode();
        }
        if (getPermissionsModifyAllData() != null) {
            _hashCode += getPermissionsModifyAllData().hashCode();
        }
        if (getPermissionsModifySecureAgents() != null) {
            _hashCode += getPermissionsModifySecureAgents().hashCode();
        }
        if (getPermissionsNewReportBuilder() != null) {
            _hashCode += getPermissionsNewReportBuilder().hashCode();
        }
        if (getPermissionsPasswordNeverExpires() != null) {
            _hashCode += getPermissionsPasswordNeverExpires().hashCode();
        }
        if (getPermissionsPublishPackaging() != null) {
            _hashCode += getPermissionsPublishPackaging().hashCode();
        }
        if (getPermissionsResetPasswords() != null) {
            _hashCode += getPermissionsResetPasswords().hashCode();
        }
        if (getPermissionsRunFlow() != null) {
            _hashCode += getPermissionsRunFlow().hashCode();
        }
        if (getPermissionsRunReports() != null) {
            _hashCode += getPermissionsRunReports().hashCode();
        }
        if (getPermissionsSalesConsole() != null) {
            _hashCode += getPermissionsSalesConsole().hashCode();
        }
        if (getPermissionsScheduleReports() != null) {
            _hashCode += getPermissionsScheduleReports().hashCode();
        }
        if (getPermissionsSelectFilesFromSalesforce() != null) {
            _hashCode += getPermissionsSelectFilesFromSalesforce().hashCode();
        }
        if (getPermissionsSendSitRequests() != null) {
            _hashCode += getPermissionsSendSitRequests().hashCode();
        }
        if (getPermissionsShareInternalArticles() != null) {
            _hashCode += getPermissionsShareInternalArticles().hashCode();
        }
        if (getPermissionsSolutionImport() != null) {
            _hashCode += getPermissionsSolutionImport().hashCode();
        }
        if (getPermissionsSubmitMacrosAllowed() != null) {
            _hashCode += getPermissionsSubmitMacrosAllowed().hashCode();
        }
        if (getPermissionsTransferAnyCase() != null) {
            _hashCode += getPermissionsTransferAnyCase().hashCode();
        }
        if (getPermissionsTransferAnyEntity() != null) {
            _hashCode += getPermissionsTransferAnyEntity().hashCode();
        }
        if (getPermissionsTransferAnyLead() != null) {
            _hashCode += getPermissionsTransferAnyLead().hashCode();
        }
        if (getPermissionsTwoFactorApi() != null) {
            _hashCode += getPermissionsTwoFactorApi().hashCode();
        }
        if (getPermissionsUseTeamReassignWizards() != null) {
            _hashCode += getPermissionsUseTeamReassignWizards().hashCode();
        }
        if (getPermissionsViewAllData() != null) {
            _hashCode += getPermissionsViewAllData().hashCode();
        }
        if (getPermissionsViewAllUsers() != null) {
            _hashCode += getPermissionsViewAllUsers().hashCode();
        }
        if (getPermissionsViewContent() != null) {
            _hashCode += getPermissionsViewContent().hashCode();
        }
        if (getPermissionsViewDataCategories() != null) {
            _hashCode += getPermissionsViewDataCategories().hashCode();
        }
        if (getPermissionsViewEncryptedData() != null) {
            _hashCode += getPermissionsViewEncryptedData().hashCode();
        }
        if (getPermissionsViewEventLogFiles() != null) {
            _hashCode += getPermissionsViewEventLogFiles().hashCode();
        }
        if (getPermissionsViewHelpLink() != null) {
            _hashCode += getPermissionsViewHelpLink().hashCode();
        }
        if (getPermissionsViewMyTeamsDashboards() != null) {
            _hashCode += getPermissionsViewMyTeamsDashboards().hashCode();
        }
        if (getPermissionsViewPublicDashboards() != null) {
            _hashCode += getPermissionsViewPublicDashboards().hashCode();
        }
        if (getPermissionsViewPublicReports() != null) {
            _hashCode += getPermissionsViewPublicReports().hashCode();
        }
        if (getPermissionsViewSetup() != null) {
            _hashCode += getPermissionsViewSetup().hashCode();
        }
        if (getPermissionsWorkCalibrationUser() != null) {
            _hashCode += getPermissionsWorkCalibrationUser().hashCode();
        }
        if (getPermissionsWorkDotComUserPerm() != null) {
            _hashCode += getPermissionsWorkDotComUserPerm().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getProfileId() != null) {
            _hashCode += getProfileId().hashCode();
        }
        if (getSetupEntityAccessItems() != null) {
            _hashCode += getSetupEntityAccessItems().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserLicense() != null) {
            _hashCode += getUserLicense().hashCode();
        }
        if (getUserLicenseId() != null) {
            _hashCode += getUserLicenseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermissionSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldPerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwnedByProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsOwnedByProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Label"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectPerms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ObjectPerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsActivateContract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsActivateContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsActivateOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsActivateOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAllowEmailIC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAllowEmailIC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAllowUniversalSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAllowUniversalSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAllowViewKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAllowViewKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsApiEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsApiEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAssignPermissionSets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAssignPermissionSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAssignTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAssignTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsAuthorApex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsAuthorApex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsBulkApiHardDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsBulkApiHardDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsBulkMacrosAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsBulkMacrosAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCanInsertFeedSystemFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCanInsertFeedSystemFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCanUseNewDashboardBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCanUseNewDashboardBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterEditOwnPost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterEditOwnPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterEditOwnRecordPost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterEditOwnRecordPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterFileLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterFileLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterForSharePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterForSharePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterInternalUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterInternalUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterInviteExternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterInviteExternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsChatterOwnGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsChatterOwnGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsConfigCustomRecs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsConfigCustomRecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsConnectOrgToEnvironmentHub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsConnectOrgToEnvironmentHub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsContentAdministrator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsContentAdministrator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsConvertLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsConvertLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateCustomizeDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateCustomizeDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateCustomizeFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateCustomizeFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateCustomizeReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateCustomizeReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateDashboardFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateDashboardFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreatePackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreatePackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateReportFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateReportFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCreateWorkspaces");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCreateWorkspaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCustomMobileAppsAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCustomMobileAppsAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCustomSidebarOnAllPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCustomSidebarOnAllPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsCustomizeApplication");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsCustomizeApplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDeleteActivatedContract");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDeleteActivatedContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDeleteTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDeleteTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsDistributeFromPersWksp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsDistributeFromPersWksp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditActivatedOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditActivatedOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditBrandTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditBrandTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditCaseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditCaseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditHtmlTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditHtmlTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditMyDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditMyDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditMyReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditMyReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditOppLineItemUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditOppLineItemUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditPublicDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditPublicDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditPublicTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditPublicTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditReadonlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditReadonlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEditTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEditTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailAdministration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailAdministration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailMass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailMass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailSingle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailSingle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEmailTemplateManagement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEmailTemplateManagement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsEnableNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsEnableNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsExportReport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsExportReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsFlowUFLRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsFlowUFLRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsForceTwoFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsForceTwoFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsGovernNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsGovernNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsIdentityConnect");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsIdentityConnect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsIdentityEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsIdentityEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsImportLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsImportLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsImportPersonal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsImportPersonal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsInstallPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsInstallPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsLightningExperienceUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsLightningExperienceUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageAnalyticSnapshots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageAnalyticSnapshots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageAuthProviders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageAuthProviders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageBusinessHourHolidays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageBusinessHourHolidays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCallCenters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCallCenters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageChatterMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageChatterMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageContentPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageContentPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageContentProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageContentProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageContentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageContentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCustomPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCustomPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageCustomReportTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageCustomReportTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDashbdsInPubFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDashbdsInPubFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDataIntegrations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDataIntegrations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageDynamicDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageDynamicDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageEmailClientConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageEmailClientConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageEncryptionKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageEncryptionKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageExchangeConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageExchangeConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageInteraction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageInteraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageInternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageInternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageIpAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageIpAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageKnowledgeImportExport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageKnowledgeImportExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageLeads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageLeads"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageLoginAccessPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageLoginAccessPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManagePasswordPolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManagePasswordPolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageProfilesPermissionsets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageProfilesPermissionsets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageRemoteAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageRemoteAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageReportsInPubFolders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageReportsInPubFolders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSearchPromotionRules");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSearchPromotionRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSolutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageSynonyms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageSynonyms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageTwoFactor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageTwoFactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageUnlistedGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageUnlistedGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsManageUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsManageUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsMassInlineEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsMassInlineEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsMergeTopics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsMergeTopics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModerateChatter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModerateChatter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModifyAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModifyAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsModifySecureAgents");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsModifySecureAgents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsNewReportBuilder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsNewReportBuilder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPasswordNeverExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPasswordNeverExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsPublishPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsPublishPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsResetPasswords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsResetPasswords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRunFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRunFlow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsRunReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsRunReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSalesConsole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSalesConsole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsScheduleReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsScheduleReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSelectFilesFromSalesforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSelectFilesFromSalesforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSendSitRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSendSitRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsShareInternalArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsShareInternalArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSolutionImport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSolutionImport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsSubmitMacrosAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsSubmitMacrosAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyCase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTransferAnyLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTransferAnyLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsTwoFactorApi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsTwoFactorApi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsUseTeamReassignWizards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsUseTeamReassignWizards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewAllUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewAllUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewDataCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewDataCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewEncryptedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewEncryptedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewEventLogFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewEventLogFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewHelpLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewHelpLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewMyTeamsDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewMyTeamsDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewPublicDashboards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewPublicDashboards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewPublicReports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewPublicReports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsViewSetup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsViewSetup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsWorkCalibrationUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsWorkCalibrationUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissionsWorkDotComUserPerm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionsWorkDotComUserPerm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("setupEntityAccessItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccessItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("userLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicenseId"));
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
