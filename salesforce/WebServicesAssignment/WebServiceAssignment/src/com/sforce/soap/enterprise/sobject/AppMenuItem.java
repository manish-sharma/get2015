/**
 * AppMenuItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AppMenuItem  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String applicationId;

    private java.lang.String canvasAccessMethod;

    private java.lang.Boolean canvasEnabled;

    private java.lang.String canvasOptions;

    private java.lang.String canvasReferenceId;

    private java.lang.String canvasSelectedLocations;

    private java.lang.String canvasUrl;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.lang.String iconUrl;

    private java.lang.String infoUrl;

    private java.lang.Boolean isAccessible;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isRegisteredDeviceOnly;

    private java.lang.Boolean isUsingAdminAuthorization;

    private java.lang.Boolean isVisible;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String logoUrl;

    private java.lang.String mobileAppBinaryId;

    private java.lang.String mobileAppInstallUrl;

    private java.util.Calendar mobileAppInstalledDate;

    private java.lang.String mobileAppInstalledVersion;

    private java.lang.String mobileAppVer;

    private java.lang.String mobileDeviceType;

    private java.lang.String mobileMinOsVer;

    private java.lang.String mobilePlatform;

    private java.lang.String mobileStartUrl;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    private java.lang.Integer sortOrder;

    private java.lang.String startUrl;

    private java.util.Calendar systemModstamp;

    private java.lang.String type;

    private java.lang.Integer userSortOrder;

    public AppMenuItem() {
    }

    public AppMenuItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String applicationId,
           java.lang.String canvasAccessMethod,
           java.lang.Boolean canvasEnabled,
           java.lang.String canvasOptions,
           java.lang.String canvasReferenceId,
           java.lang.String canvasSelectedLocations,
           java.lang.String canvasUrl,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.lang.String iconUrl,
           java.lang.String infoUrl,
           java.lang.Boolean isAccessible,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isRegisteredDeviceOnly,
           java.lang.Boolean isUsingAdminAuthorization,
           java.lang.Boolean isVisible,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String logoUrl,
           java.lang.String mobileAppBinaryId,
           java.lang.String mobileAppInstallUrl,
           java.util.Calendar mobileAppInstalledDate,
           java.lang.String mobileAppInstalledVersion,
           java.lang.String mobileAppVer,
           java.lang.String mobileDeviceType,
           java.lang.String mobileMinOsVer,
           java.lang.String mobilePlatform,
           java.lang.String mobileStartUrl,
           java.lang.String name,
           java.lang.String namespacePrefix,
           java.lang.Integer sortOrder,
           java.lang.String startUrl,
           java.util.Calendar systemModstamp,
           java.lang.String type,
           java.lang.Integer userSortOrder) {
        super(
            fieldsToNull,
            id);
        this.applicationId = applicationId;
        this.canvasAccessMethod = canvasAccessMethod;
        this.canvasEnabled = canvasEnabled;
        this.canvasOptions = canvasOptions;
        this.canvasReferenceId = canvasReferenceId;
        this.canvasSelectedLocations = canvasSelectedLocations;
        this.canvasUrl = canvasUrl;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.iconUrl = iconUrl;
        this.infoUrl = infoUrl;
        this.isAccessible = isAccessible;
        this.isDeleted = isDeleted;
        this.isRegisteredDeviceOnly = isRegisteredDeviceOnly;
        this.isUsingAdminAuthorization = isUsingAdminAuthorization;
        this.isVisible = isVisible;
        this.label = label;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.logoUrl = logoUrl;
        this.mobileAppBinaryId = mobileAppBinaryId;
        this.mobileAppInstallUrl = mobileAppInstallUrl;
        this.mobileAppInstalledDate = mobileAppInstalledDate;
        this.mobileAppInstalledVersion = mobileAppInstalledVersion;
        this.mobileAppVer = mobileAppVer;
        this.mobileDeviceType = mobileDeviceType;
        this.mobileMinOsVer = mobileMinOsVer;
        this.mobilePlatform = mobilePlatform;
        this.mobileStartUrl = mobileStartUrl;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
        this.sortOrder = sortOrder;
        this.startUrl = startUrl;
        this.systemModstamp = systemModstamp;
        this.type = type;
        this.userSortOrder = userSortOrder;
    }


    /**
     * Gets the applicationId value for this AppMenuItem.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this AppMenuItem.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the canvasAccessMethod value for this AppMenuItem.
     * 
     * @return canvasAccessMethod
     */
    public java.lang.String getCanvasAccessMethod() {
        return canvasAccessMethod;
    }


    /**
     * Sets the canvasAccessMethod value for this AppMenuItem.
     * 
     * @param canvasAccessMethod
     */
    public void setCanvasAccessMethod(java.lang.String canvasAccessMethod) {
        this.canvasAccessMethod = canvasAccessMethod;
    }


    /**
     * Gets the canvasEnabled value for this AppMenuItem.
     * 
     * @return canvasEnabled
     */
    public java.lang.Boolean getCanvasEnabled() {
        return canvasEnabled;
    }


    /**
     * Sets the canvasEnabled value for this AppMenuItem.
     * 
     * @param canvasEnabled
     */
    public void setCanvasEnabled(java.lang.Boolean canvasEnabled) {
        this.canvasEnabled = canvasEnabled;
    }


    /**
     * Gets the canvasOptions value for this AppMenuItem.
     * 
     * @return canvasOptions
     */
    public java.lang.String getCanvasOptions() {
        return canvasOptions;
    }


    /**
     * Sets the canvasOptions value for this AppMenuItem.
     * 
     * @param canvasOptions
     */
    public void setCanvasOptions(java.lang.String canvasOptions) {
        this.canvasOptions = canvasOptions;
    }


    /**
     * Gets the canvasReferenceId value for this AppMenuItem.
     * 
     * @return canvasReferenceId
     */
    public java.lang.String getCanvasReferenceId() {
        return canvasReferenceId;
    }


    /**
     * Sets the canvasReferenceId value for this AppMenuItem.
     * 
     * @param canvasReferenceId
     */
    public void setCanvasReferenceId(java.lang.String canvasReferenceId) {
        this.canvasReferenceId = canvasReferenceId;
    }


    /**
     * Gets the canvasSelectedLocations value for this AppMenuItem.
     * 
     * @return canvasSelectedLocations
     */
    public java.lang.String getCanvasSelectedLocations() {
        return canvasSelectedLocations;
    }


    /**
     * Sets the canvasSelectedLocations value for this AppMenuItem.
     * 
     * @param canvasSelectedLocations
     */
    public void setCanvasSelectedLocations(java.lang.String canvasSelectedLocations) {
        this.canvasSelectedLocations = canvasSelectedLocations;
    }


    /**
     * Gets the canvasUrl value for this AppMenuItem.
     * 
     * @return canvasUrl
     */
    public java.lang.String getCanvasUrl() {
        return canvasUrl;
    }


    /**
     * Sets the canvasUrl value for this AppMenuItem.
     * 
     * @param canvasUrl
     */
    public void setCanvasUrl(java.lang.String canvasUrl) {
        this.canvasUrl = canvasUrl;
    }


    /**
     * Gets the createdBy value for this AppMenuItem.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this AppMenuItem.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this AppMenuItem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this AppMenuItem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this AppMenuItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AppMenuItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this AppMenuItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AppMenuItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the iconUrl value for this AppMenuItem.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this AppMenuItem.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the infoUrl value for this AppMenuItem.
     * 
     * @return infoUrl
     */
    public java.lang.String getInfoUrl() {
        return infoUrl;
    }


    /**
     * Sets the infoUrl value for this AppMenuItem.
     * 
     * @param infoUrl
     */
    public void setInfoUrl(java.lang.String infoUrl) {
        this.infoUrl = infoUrl;
    }


    /**
     * Gets the isAccessible value for this AppMenuItem.
     * 
     * @return isAccessible
     */
    public java.lang.Boolean getIsAccessible() {
        return isAccessible;
    }


    /**
     * Sets the isAccessible value for this AppMenuItem.
     * 
     * @param isAccessible
     */
    public void setIsAccessible(java.lang.Boolean isAccessible) {
        this.isAccessible = isAccessible;
    }


    /**
     * Gets the isDeleted value for this AppMenuItem.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this AppMenuItem.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isRegisteredDeviceOnly value for this AppMenuItem.
     * 
     * @return isRegisteredDeviceOnly
     */
    public java.lang.Boolean getIsRegisteredDeviceOnly() {
        return isRegisteredDeviceOnly;
    }


    /**
     * Sets the isRegisteredDeviceOnly value for this AppMenuItem.
     * 
     * @param isRegisteredDeviceOnly
     */
    public void setIsRegisteredDeviceOnly(java.lang.Boolean isRegisteredDeviceOnly) {
        this.isRegisteredDeviceOnly = isRegisteredDeviceOnly;
    }


    /**
     * Gets the isUsingAdminAuthorization value for this AppMenuItem.
     * 
     * @return isUsingAdminAuthorization
     */
    public java.lang.Boolean getIsUsingAdminAuthorization() {
        return isUsingAdminAuthorization;
    }


    /**
     * Sets the isUsingAdminAuthorization value for this AppMenuItem.
     * 
     * @param isUsingAdminAuthorization
     */
    public void setIsUsingAdminAuthorization(java.lang.Boolean isUsingAdminAuthorization) {
        this.isUsingAdminAuthorization = isUsingAdminAuthorization;
    }


    /**
     * Gets the isVisible value for this AppMenuItem.
     * 
     * @return isVisible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this AppMenuItem.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the label value for this AppMenuItem.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this AppMenuItem.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedBy value for this AppMenuItem.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this AppMenuItem.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this AppMenuItem.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this AppMenuItem.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this AppMenuItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AppMenuItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the logoUrl value for this AppMenuItem.
     * 
     * @return logoUrl
     */
    public java.lang.String getLogoUrl() {
        return logoUrl;
    }


    /**
     * Sets the logoUrl value for this AppMenuItem.
     * 
     * @param logoUrl
     */
    public void setLogoUrl(java.lang.String logoUrl) {
        this.logoUrl = logoUrl;
    }


    /**
     * Gets the mobileAppBinaryId value for this AppMenuItem.
     * 
     * @return mobileAppBinaryId
     */
    public java.lang.String getMobileAppBinaryId() {
        return mobileAppBinaryId;
    }


    /**
     * Sets the mobileAppBinaryId value for this AppMenuItem.
     * 
     * @param mobileAppBinaryId
     */
    public void setMobileAppBinaryId(java.lang.String mobileAppBinaryId) {
        this.mobileAppBinaryId = mobileAppBinaryId;
    }


    /**
     * Gets the mobileAppInstallUrl value for this AppMenuItem.
     * 
     * @return mobileAppInstallUrl
     */
    public java.lang.String getMobileAppInstallUrl() {
        return mobileAppInstallUrl;
    }


    /**
     * Sets the mobileAppInstallUrl value for this AppMenuItem.
     * 
     * @param mobileAppInstallUrl
     */
    public void setMobileAppInstallUrl(java.lang.String mobileAppInstallUrl) {
        this.mobileAppInstallUrl = mobileAppInstallUrl;
    }


    /**
     * Gets the mobileAppInstalledDate value for this AppMenuItem.
     * 
     * @return mobileAppInstalledDate
     */
    public java.util.Calendar getMobileAppInstalledDate() {
        return mobileAppInstalledDate;
    }


    /**
     * Sets the mobileAppInstalledDate value for this AppMenuItem.
     * 
     * @param mobileAppInstalledDate
     */
    public void setMobileAppInstalledDate(java.util.Calendar mobileAppInstalledDate) {
        this.mobileAppInstalledDate = mobileAppInstalledDate;
    }


    /**
     * Gets the mobileAppInstalledVersion value for this AppMenuItem.
     * 
     * @return mobileAppInstalledVersion
     */
    public java.lang.String getMobileAppInstalledVersion() {
        return mobileAppInstalledVersion;
    }


    /**
     * Sets the mobileAppInstalledVersion value for this AppMenuItem.
     * 
     * @param mobileAppInstalledVersion
     */
    public void setMobileAppInstalledVersion(java.lang.String mobileAppInstalledVersion) {
        this.mobileAppInstalledVersion = mobileAppInstalledVersion;
    }


    /**
     * Gets the mobileAppVer value for this AppMenuItem.
     * 
     * @return mobileAppVer
     */
    public java.lang.String getMobileAppVer() {
        return mobileAppVer;
    }


    /**
     * Sets the mobileAppVer value for this AppMenuItem.
     * 
     * @param mobileAppVer
     */
    public void setMobileAppVer(java.lang.String mobileAppVer) {
        this.mobileAppVer = mobileAppVer;
    }


    /**
     * Gets the mobileDeviceType value for this AppMenuItem.
     * 
     * @return mobileDeviceType
     */
    public java.lang.String getMobileDeviceType() {
        return mobileDeviceType;
    }


    /**
     * Sets the mobileDeviceType value for this AppMenuItem.
     * 
     * @param mobileDeviceType
     */
    public void setMobileDeviceType(java.lang.String mobileDeviceType) {
        this.mobileDeviceType = mobileDeviceType;
    }


    /**
     * Gets the mobileMinOsVer value for this AppMenuItem.
     * 
     * @return mobileMinOsVer
     */
    public java.lang.String getMobileMinOsVer() {
        return mobileMinOsVer;
    }


    /**
     * Sets the mobileMinOsVer value for this AppMenuItem.
     * 
     * @param mobileMinOsVer
     */
    public void setMobileMinOsVer(java.lang.String mobileMinOsVer) {
        this.mobileMinOsVer = mobileMinOsVer;
    }


    /**
     * Gets the mobilePlatform value for this AppMenuItem.
     * 
     * @return mobilePlatform
     */
    public java.lang.String getMobilePlatform() {
        return mobilePlatform;
    }


    /**
     * Sets the mobilePlatform value for this AppMenuItem.
     * 
     * @param mobilePlatform
     */
    public void setMobilePlatform(java.lang.String mobilePlatform) {
        this.mobilePlatform = mobilePlatform;
    }


    /**
     * Gets the mobileStartUrl value for this AppMenuItem.
     * 
     * @return mobileStartUrl
     */
    public java.lang.String getMobileStartUrl() {
        return mobileStartUrl;
    }


    /**
     * Sets the mobileStartUrl value for this AppMenuItem.
     * 
     * @param mobileStartUrl
     */
    public void setMobileStartUrl(java.lang.String mobileStartUrl) {
        this.mobileStartUrl = mobileStartUrl;
    }


    /**
     * Gets the name value for this AppMenuItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AppMenuItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this AppMenuItem.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this AppMenuItem.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the sortOrder value for this AppMenuItem.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this AppMenuItem.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startUrl value for this AppMenuItem.
     * 
     * @return startUrl
     */
    public java.lang.String getStartUrl() {
        return startUrl;
    }


    /**
     * Sets the startUrl value for this AppMenuItem.
     * 
     * @param startUrl
     */
    public void setStartUrl(java.lang.String startUrl) {
        this.startUrl = startUrl;
    }


    /**
     * Gets the systemModstamp value for this AppMenuItem.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this AppMenuItem.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the type value for this AppMenuItem.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this AppMenuItem.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userSortOrder value for this AppMenuItem.
     * 
     * @return userSortOrder
     */
    public java.lang.Integer getUserSortOrder() {
        return userSortOrder;
    }


    /**
     * Sets the userSortOrder value for this AppMenuItem.
     * 
     * @param userSortOrder
     */
    public void setUserSortOrder(java.lang.Integer userSortOrder) {
        this.userSortOrder = userSortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppMenuItem)) return false;
        AppMenuItem other = (AppMenuItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.canvasAccessMethod==null && other.getCanvasAccessMethod()==null) || 
             (this.canvasAccessMethod!=null &&
              this.canvasAccessMethod.equals(other.getCanvasAccessMethod()))) &&
            ((this.canvasEnabled==null && other.getCanvasEnabled()==null) || 
             (this.canvasEnabled!=null &&
              this.canvasEnabled.equals(other.getCanvasEnabled()))) &&
            ((this.canvasOptions==null && other.getCanvasOptions()==null) || 
             (this.canvasOptions!=null &&
              this.canvasOptions.equals(other.getCanvasOptions()))) &&
            ((this.canvasReferenceId==null && other.getCanvasReferenceId()==null) || 
             (this.canvasReferenceId!=null &&
              this.canvasReferenceId.equals(other.getCanvasReferenceId()))) &&
            ((this.canvasSelectedLocations==null && other.getCanvasSelectedLocations()==null) || 
             (this.canvasSelectedLocations!=null &&
              this.canvasSelectedLocations.equals(other.getCanvasSelectedLocations()))) &&
            ((this.canvasUrl==null && other.getCanvasUrl()==null) || 
             (this.canvasUrl!=null &&
              this.canvasUrl.equals(other.getCanvasUrl()))) &&
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
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.infoUrl==null && other.getInfoUrl()==null) || 
             (this.infoUrl!=null &&
              this.infoUrl.equals(other.getInfoUrl()))) &&
            ((this.isAccessible==null && other.getIsAccessible()==null) || 
             (this.isAccessible!=null &&
              this.isAccessible.equals(other.getIsAccessible()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isRegisteredDeviceOnly==null && other.getIsRegisteredDeviceOnly()==null) || 
             (this.isRegisteredDeviceOnly!=null &&
              this.isRegisteredDeviceOnly.equals(other.getIsRegisteredDeviceOnly()))) &&
            ((this.isUsingAdminAuthorization==null && other.getIsUsingAdminAuthorization()==null) || 
             (this.isUsingAdminAuthorization!=null &&
              this.isUsingAdminAuthorization.equals(other.getIsUsingAdminAuthorization()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
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
            ((this.logoUrl==null && other.getLogoUrl()==null) || 
             (this.logoUrl!=null &&
              this.logoUrl.equals(other.getLogoUrl()))) &&
            ((this.mobileAppBinaryId==null && other.getMobileAppBinaryId()==null) || 
             (this.mobileAppBinaryId!=null &&
              this.mobileAppBinaryId.equals(other.getMobileAppBinaryId()))) &&
            ((this.mobileAppInstallUrl==null && other.getMobileAppInstallUrl()==null) || 
             (this.mobileAppInstallUrl!=null &&
              this.mobileAppInstallUrl.equals(other.getMobileAppInstallUrl()))) &&
            ((this.mobileAppInstalledDate==null && other.getMobileAppInstalledDate()==null) || 
             (this.mobileAppInstalledDate!=null &&
              this.mobileAppInstalledDate.equals(other.getMobileAppInstalledDate()))) &&
            ((this.mobileAppInstalledVersion==null && other.getMobileAppInstalledVersion()==null) || 
             (this.mobileAppInstalledVersion!=null &&
              this.mobileAppInstalledVersion.equals(other.getMobileAppInstalledVersion()))) &&
            ((this.mobileAppVer==null && other.getMobileAppVer()==null) || 
             (this.mobileAppVer!=null &&
              this.mobileAppVer.equals(other.getMobileAppVer()))) &&
            ((this.mobileDeviceType==null && other.getMobileDeviceType()==null) || 
             (this.mobileDeviceType!=null &&
              this.mobileDeviceType.equals(other.getMobileDeviceType()))) &&
            ((this.mobileMinOsVer==null && other.getMobileMinOsVer()==null) || 
             (this.mobileMinOsVer!=null &&
              this.mobileMinOsVer.equals(other.getMobileMinOsVer()))) &&
            ((this.mobilePlatform==null && other.getMobilePlatform()==null) || 
             (this.mobilePlatform!=null &&
              this.mobilePlatform.equals(other.getMobilePlatform()))) &&
            ((this.mobileStartUrl==null && other.getMobileStartUrl()==null) || 
             (this.mobileStartUrl!=null &&
              this.mobileStartUrl.equals(other.getMobileStartUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startUrl==null && other.getStartUrl()==null) || 
             (this.startUrl!=null &&
              this.startUrl.equals(other.getStartUrl()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userSortOrder==null && other.getUserSortOrder()==null) || 
             (this.userSortOrder!=null &&
              this.userSortOrder.equals(other.getUserSortOrder())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getCanvasAccessMethod() != null) {
            _hashCode += getCanvasAccessMethod().hashCode();
        }
        if (getCanvasEnabled() != null) {
            _hashCode += getCanvasEnabled().hashCode();
        }
        if (getCanvasOptions() != null) {
            _hashCode += getCanvasOptions().hashCode();
        }
        if (getCanvasReferenceId() != null) {
            _hashCode += getCanvasReferenceId().hashCode();
        }
        if (getCanvasSelectedLocations() != null) {
            _hashCode += getCanvasSelectedLocations().hashCode();
        }
        if (getCanvasUrl() != null) {
            _hashCode += getCanvasUrl().hashCode();
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
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getInfoUrl() != null) {
            _hashCode += getInfoUrl().hashCode();
        }
        if (getIsAccessible() != null) {
            _hashCode += getIsAccessible().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsRegisteredDeviceOnly() != null) {
            _hashCode += getIsRegisteredDeviceOnly().hashCode();
        }
        if (getIsUsingAdminAuthorization() != null) {
            _hashCode += getIsUsingAdminAuthorization().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
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
        if (getLogoUrl() != null) {
            _hashCode += getLogoUrl().hashCode();
        }
        if (getMobileAppBinaryId() != null) {
            _hashCode += getMobileAppBinaryId().hashCode();
        }
        if (getMobileAppInstallUrl() != null) {
            _hashCode += getMobileAppInstallUrl().hashCode();
        }
        if (getMobileAppInstalledDate() != null) {
            _hashCode += getMobileAppInstalledDate().hashCode();
        }
        if (getMobileAppInstalledVersion() != null) {
            _hashCode += getMobileAppInstalledVersion().hashCode();
        }
        if (getMobileAppVer() != null) {
            _hashCode += getMobileAppVer().hashCode();
        }
        if (getMobileDeviceType() != null) {
            _hashCode += getMobileDeviceType().hashCode();
        }
        if (getMobileMinOsVer() != null) {
            _hashCode += getMobileMinOsVer().hashCode();
        }
        if (getMobilePlatform() != null) {
            _hashCode += getMobilePlatform().hashCode();
        }
        if (getMobileStartUrl() != null) {
            _hashCode += getMobileStartUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartUrl() != null) {
            _hashCode += getStartUrl().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserSortOrder() != null) {
            _hashCode += getUserSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppMenuItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasAccessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasAccessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasSelectedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasSelectedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CanvasUrl"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InfoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAccessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isRegisteredDeviceOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRegisteredDeviceOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUsingAdminAuthorization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUsingAdminAuthorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisible"));
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
        elemField.setFieldName("logoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LogoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppBinaryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileAppBinaryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppInstallUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileAppInstallUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppInstalledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileAppInstalledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppInstalledVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileAppInstalledVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileAppVer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileAppVer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDeviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileDeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileMinOsVer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileMinOsVer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileStartUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileStartUrl"));
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
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartUrl"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserSortOrder"));
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
