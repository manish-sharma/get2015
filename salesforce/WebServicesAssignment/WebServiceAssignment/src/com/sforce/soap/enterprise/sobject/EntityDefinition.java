/**
 * EntityDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class EntityDefinition  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult childRelationships;

    private java.lang.String defaultCompactLayoutId;

    private java.lang.String detailUrl;

    private java.lang.String developerName;

    private java.lang.String durableId;

    private java.lang.String editDefinitionUrl;

    private java.lang.String editUrl;

    private com.sforce.soap.enterprise.QueryResult fields;

    private java.lang.String helpSettingPageName;

    private java.lang.String helpSettingPageUrl;

    private java.lang.Boolean isApexTriggerable;

    private java.lang.Boolean isCompactLayoutable;

    private java.lang.Boolean isCustomSetting;

    private java.lang.Boolean isCustomizable;

    private java.lang.Boolean isDeprecatedAndHidden;

    private java.lang.Boolean isEverCreatable;

    private java.lang.Boolean isEverDeletable;

    private java.lang.Boolean isEverUpdatable;

    private java.lang.Boolean isFeedEnabled;

    private java.lang.Boolean isIdEnabled;

    private java.lang.Boolean isLayoutable;

    private java.lang.Boolean isQueryable;

    private java.lang.Boolean isReplicateable;

    private java.lang.Boolean isRetrieveable;

    private java.lang.Boolean isSearchLayoutable;

    private java.lang.Boolean isSearchable;

    private java.lang.Boolean isTriggerable;

    private java.lang.Boolean isWorkflowEnabled;

    private java.lang.String keyPrefix;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private java.lang.String newUrl;

    private com.sforce.soap.enterprise.QueryResult particles;

    private java.lang.String pluralLabel;

    private com.sforce.soap.enterprise.sobject.Publisher publisher;

    private java.lang.String publisherId;

    private java.lang.String qualifiedApiName;

    private com.sforce.soap.enterprise.RecordTypeInfo[] recordTypesSupported;

    private com.sforce.soap.enterprise.QueryResult relationshipDomains;

    private com.sforce.soap.enterprise.sobject.UserEntityAccess runningUserEntityAccess;

    private java.lang.String runningUserEntityAccessId;

    private com.sforce.soap.enterprise.QueryResult searchLayouts;

    public EntityDefinition() {
    }

    public EntityDefinition(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult childRelationships,
           java.lang.String defaultCompactLayoutId,
           java.lang.String detailUrl,
           java.lang.String developerName,
           java.lang.String durableId,
           java.lang.String editDefinitionUrl,
           java.lang.String editUrl,
           com.sforce.soap.enterprise.QueryResult fields,
           java.lang.String helpSettingPageName,
           java.lang.String helpSettingPageUrl,
           java.lang.Boolean isApexTriggerable,
           java.lang.Boolean isCompactLayoutable,
           java.lang.Boolean isCustomSetting,
           java.lang.Boolean isCustomizable,
           java.lang.Boolean isDeprecatedAndHidden,
           java.lang.Boolean isEverCreatable,
           java.lang.Boolean isEverDeletable,
           java.lang.Boolean isEverUpdatable,
           java.lang.Boolean isFeedEnabled,
           java.lang.Boolean isIdEnabled,
           java.lang.Boolean isLayoutable,
           java.lang.Boolean isQueryable,
           java.lang.Boolean isReplicateable,
           java.lang.Boolean isRetrieveable,
           java.lang.Boolean isSearchLayoutable,
           java.lang.Boolean isSearchable,
           java.lang.Boolean isTriggerable,
           java.lang.Boolean isWorkflowEnabled,
           java.lang.String keyPrefix,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           java.lang.String newUrl,
           com.sforce.soap.enterprise.QueryResult particles,
           java.lang.String pluralLabel,
           com.sforce.soap.enterprise.sobject.Publisher publisher,
           java.lang.String publisherId,
           java.lang.String qualifiedApiName,
           com.sforce.soap.enterprise.RecordTypeInfo[] recordTypesSupported,
           com.sforce.soap.enterprise.QueryResult relationshipDomains,
           com.sforce.soap.enterprise.sobject.UserEntityAccess runningUserEntityAccess,
           java.lang.String runningUserEntityAccessId,
           com.sforce.soap.enterprise.QueryResult searchLayouts) {
        super(
            fieldsToNull,
            id);
        this.childRelationships = childRelationships;
        this.defaultCompactLayoutId = defaultCompactLayoutId;
        this.detailUrl = detailUrl;
        this.developerName = developerName;
        this.durableId = durableId;
        this.editDefinitionUrl = editDefinitionUrl;
        this.editUrl = editUrl;
        this.fields = fields;
        this.helpSettingPageName = helpSettingPageName;
        this.helpSettingPageUrl = helpSettingPageUrl;
        this.isApexTriggerable = isApexTriggerable;
        this.isCompactLayoutable = isCompactLayoutable;
        this.isCustomSetting = isCustomSetting;
        this.isCustomizable = isCustomizable;
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
        this.isEverCreatable = isEverCreatable;
        this.isEverDeletable = isEverDeletable;
        this.isEverUpdatable = isEverUpdatable;
        this.isFeedEnabled = isFeedEnabled;
        this.isIdEnabled = isIdEnabled;
        this.isLayoutable = isLayoutable;
        this.isQueryable = isQueryable;
        this.isReplicateable = isReplicateable;
        this.isRetrieveable = isRetrieveable;
        this.isSearchLayoutable = isSearchLayoutable;
        this.isSearchable = isSearchable;
        this.isTriggerable = isTriggerable;
        this.isWorkflowEnabled = isWorkflowEnabled;
        this.keyPrefix = keyPrefix;
        this.label = label;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.newUrl = newUrl;
        this.particles = particles;
        this.pluralLabel = pluralLabel;
        this.publisher = publisher;
        this.publisherId = publisherId;
        this.qualifiedApiName = qualifiedApiName;
        this.recordTypesSupported = recordTypesSupported;
        this.relationshipDomains = relationshipDomains;
        this.runningUserEntityAccess = runningUserEntityAccess;
        this.runningUserEntityAccessId = runningUserEntityAccessId;
        this.searchLayouts = searchLayouts;
    }


    /**
     * Gets the childRelationships value for this EntityDefinition.
     * 
     * @return childRelationships
     */
    public com.sforce.soap.enterprise.QueryResult getChildRelationships() {
        return childRelationships;
    }


    /**
     * Sets the childRelationships value for this EntityDefinition.
     * 
     * @param childRelationships
     */
    public void setChildRelationships(com.sforce.soap.enterprise.QueryResult childRelationships) {
        this.childRelationships = childRelationships;
    }


    /**
     * Gets the defaultCompactLayoutId value for this EntityDefinition.
     * 
     * @return defaultCompactLayoutId
     */
    public java.lang.String getDefaultCompactLayoutId() {
        return defaultCompactLayoutId;
    }


    /**
     * Sets the defaultCompactLayoutId value for this EntityDefinition.
     * 
     * @param defaultCompactLayoutId
     */
    public void setDefaultCompactLayoutId(java.lang.String defaultCompactLayoutId) {
        this.defaultCompactLayoutId = defaultCompactLayoutId;
    }


    /**
     * Gets the detailUrl value for this EntityDefinition.
     * 
     * @return detailUrl
     */
    public java.lang.String getDetailUrl() {
        return detailUrl;
    }


    /**
     * Sets the detailUrl value for this EntityDefinition.
     * 
     * @param detailUrl
     */
    public void setDetailUrl(java.lang.String detailUrl) {
        this.detailUrl = detailUrl;
    }


    /**
     * Gets the developerName value for this EntityDefinition.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this EntityDefinition.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the durableId value for this EntityDefinition.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this EntityDefinition.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the editDefinitionUrl value for this EntityDefinition.
     * 
     * @return editDefinitionUrl
     */
    public java.lang.String getEditDefinitionUrl() {
        return editDefinitionUrl;
    }


    /**
     * Sets the editDefinitionUrl value for this EntityDefinition.
     * 
     * @param editDefinitionUrl
     */
    public void setEditDefinitionUrl(java.lang.String editDefinitionUrl) {
        this.editDefinitionUrl = editDefinitionUrl;
    }


    /**
     * Gets the editUrl value for this EntityDefinition.
     * 
     * @return editUrl
     */
    public java.lang.String getEditUrl() {
        return editUrl;
    }


    /**
     * Sets the editUrl value for this EntityDefinition.
     * 
     * @param editUrl
     */
    public void setEditUrl(java.lang.String editUrl) {
        this.editUrl = editUrl;
    }


    /**
     * Gets the fields value for this EntityDefinition.
     * 
     * @return fields
     */
    public com.sforce.soap.enterprise.QueryResult getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this EntityDefinition.
     * 
     * @param fields
     */
    public void setFields(com.sforce.soap.enterprise.QueryResult fields) {
        this.fields = fields;
    }


    /**
     * Gets the helpSettingPageName value for this EntityDefinition.
     * 
     * @return helpSettingPageName
     */
    public java.lang.String getHelpSettingPageName() {
        return helpSettingPageName;
    }


    /**
     * Sets the helpSettingPageName value for this EntityDefinition.
     * 
     * @param helpSettingPageName
     */
    public void setHelpSettingPageName(java.lang.String helpSettingPageName) {
        this.helpSettingPageName = helpSettingPageName;
    }


    /**
     * Gets the helpSettingPageUrl value for this EntityDefinition.
     * 
     * @return helpSettingPageUrl
     */
    public java.lang.String getHelpSettingPageUrl() {
        return helpSettingPageUrl;
    }


    /**
     * Sets the helpSettingPageUrl value for this EntityDefinition.
     * 
     * @param helpSettingPageUrl
     */
    public void setHelpSettingPageUrl(java.lang.String helpSettingPageUrl) {
        this.helpSettingPageUrl = helpSettingPageUrl;
    }


    /**
     * Gets the isApexTriggerable value for this EntityDefinition.
     * 
     * @return isApexTriggerable
     */
    public java.lang.Boolean getIsApexTriggerable() {
        return isApexTriggerable;
    }


    /**
     * Sets the isApexTriggerable value for this EntityDefinition.
     * 
     * @param isApexTriggerable
     */
    public void setIsApexTriggerable(java.lang.Boolean isApexTriggerable) {
        this.isApexTriggerable = isApexTriggerable;
    }


    /**
     * Gets the isCompactLayoutable value for this EntityDefinition.
     * 
     * @return isCompactLayoutable
     */
    public java.lang.Boolean getIsCompactLayoutable() {
        return isCompactLayoutable;
    }


    /**
     * Sets the isCompactLayoutable value for this EntityDefinition.
     * 
     * @param isCompactLayoutable
     */
    public void setIsCompactLayoutable(java.lang.Boolean isCompactLayoutable) {
        this.isCompactLayoutable = isCompactLayoutable;
    }


    /**
     * Gets the isCustomSetting value for this EntityDefinition.
     * 
     * @return isCustomSetting
     */
    public java.lang.Boolean getIsCustomSetting() {
        return isCustomSetting;
    }


    /**
     * Sets the isCustomSetting value for this EntityDefinition.
     * 
     * @param isCustomSetting
     */
    public void setIsCustomSetting(java.lang.Boolean isCustomSetting) {
        this.isCustomSetting = isCustomSetting;
    }


    /**
     * Gets the isCustomizable value for this EntityDefinition.
     * 
     * @return isCustomizable
     */
    public java.lang.Boolean getIsCustomizable() {
        return isCustomizable;
    }


    /**
     * Sets the isCustomizable value for this EntityDefinition.
     * 
     * @param isCustomizable
     */
    public void setIsCustomizable(java.lang.Boolean isCustomizable) {
        this.isCustomizable = isCustomizable;
    }


    /**
     * Gets the isDeprecatedAndHidden value for this EntityDefinition.
     * 
     * @return isDeprecatedAndHidden
     */
    public java.lang.Boolean getIsDeprecatedAndHidden() {
        return isDeprecatedAndHidden;
    }


    /**
     * Sets the isDeprecatedAndHidden value for this EntityDefinition.
     * 
     * @param isDeprecatedAndHidden
     */
    public void setIsDeprecatedAndHidden(java.lang.Boolean isDeprecatedAndHidden) {
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
    }


    /**
     * Gets the isEverCreatable value for this EntityDefinition.
     * 
     * @return isEverCreatable
     */
    public java.lang.Boolean getIsEverCreatable() {
        return isEverCreatable;
    }


    /**
     * Sets the isEverCreatable value for this EntityDefinition.
     * 
     * @param isEverCreatable
     */
    public void setIsEverCreatable(java.lang.Boolean isEverCreatable) {
        this.isEverCreatable = isEverCreatable;
    }


    /**
     * Gets the isEverDeletable value for this EntityDefinition.
     * 
     * @return isEverDeletable
     */
    public java.lang.Boolean getIsEverDeletable() {
        return isEverDeletable;
    }


    /**
     * Sets the isEverDeletable value for this EntityDefinition.
     * 
     * @param isEverDeletable
     */
    public void setIsEverDeletable(java.lang.Boolean isEverDeletable) {
        this.isEverDeletable = isEverDeletable;
    }


    /**
     * Gets the isEverUpdatable value for this EntityDefinition.
     * 
     * @return isEverUpdatable
     */
    public java.lang.Boolean getIsEverUpdatable() {
        return isEverUpdatable;
    }


    /**
     * Sets the isEverUpdatable value for this EntityDefinition.
     * 
     * @param isEverUpdatable
     */
    public void setIsEverUpdatable(java.lang.Boolean isEverUpdatable) {
        this.isEverUpdatable = isEverUpdatable;
    }


    /**
     * Gets the isFeedEnabled value for this EntityDefinition.
     * 
     * @return isFeedEnabled
     */
    public java.lang.Boolean getIsFeedEnabled() {
        return isFeedEnabled;
    }


    /**
     * Sets the isFeedEnabled value for this EntityDefinition.
     * 
     * @param isFeedEnabled
     */
    public void setIsFeedEnabled(java.lang.Boolean isFeedEnabled) {
        this.isFeedEnabled = isFeedEnabled;
    }


    /**
     * Gets the isIdEnabled value for this EntityDefinition.
     * 
     * @return isIdEnabled
     */
    public java.lang.Boolean getIsIdEnabled() {
        return isIdEnabled;
    }


    /**
     * Sets the isIdEnabled value for this EntityDefinition.
     * 
     * @param isIdEnabled
     */
    public void setIsIdEnabled(java.lang.Boolean isIdEnabled) {
        this.isIdEnabled = isIdEnabled;
    }


    /**
     * Gets the isLayoutable value for this EntityDefinition.
     * 
     * @return isLayoutable
     */
    public java.lang.Boolean getIsLayoutable() {
        return isLayoutable;
    }


    /**
     * Sets the isLayoutable value for this EntityDefinition.
     * 
     * @param isLayoutable
     */
    public void setIsLayoutable(java.lang.Boolean isLayoutable) {
        this.isLayoutable = isLayoutable;
    }


    /**
     * Gets the isQueryable value for this EntityDefinition.
     * 
     * @return isQueryable
     */
    public java.lang.Boolean getIsQueryable() {
        return isQueryable;
    }


    /**
     * Sets the isQueryable value for this EntityDefinition.
     * 
     * @param isQueryable
     */
    public void setIsQueryable(java.lang.Boolean isQueryable) {
        this.isQueryable = isQueryable;
    }


    /**
     * Gets the isReplicateable value for this EntityDefinition.
     * 
     * @return isReplicateable
     */
    public java.lang.Boolean getIsReplicateable() {
        return isReplicateable;
    }


    /**
     * Sets the isReplicateable value for this EntityDefinition.
     * 
     * @param isReplicateable
     */
    public void setIsReplicateable(java.lang.Boolean isReplicateable) {
        this.isReplicateable = isReplicateable;
    }


    /**
     * Gets the isRetrieveable value for this EntityDefinition.
     * 
     * @return isRetrieveable
     */
    public java.lang.Boolean getIsRetrieveable() {
        return isRetrieveable;
    }


    /**
     * Sets the isRetrieveable value for this EntityDefinition.
     * 
     * @param isRetrieveable
     */
    public void setIsRetrieveable(java.lang.Boolean isRetrieveable) {
        this.isRetrieveable = isRetrieveable;
    }


    /**
     * Gets the isSearchLayoutable value for this EntityDefinition.
     * 
     * @return isSearchLayoutable
     */
    public java.lang.Boolean getIsSearchLayoutable() {
        return isSearchLayoutable;
    }


    /**
     * Sets the isSearchLayoutable value for this EntityDefinition.
     * 
     * @param isSearchLayoutable
     */
    public void setIsSearchLayoutable(java.lang.Boolean isSearchLayoutable) {
        this.isSearchLayoutable = isSearchLayoutable;
    }


    /**
     * Gets the isSearchable value for this EntityDefinition.
     * 
     * @return isSearchable
     */
    public java.lang.Boolean getIsSearchable() {
        return isSearchable;
    }


    /**
     * Sets the isSearchable value for this EntityDefinition.
     * 
     * @param isSearchable
     */
    public void setIsSearchable(java.lang.Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }


    /**
     * Gets the isTriggerable value for this EntityDefinition.
     * 
     * @return isTriggerable
     */
    public java.lang.Boolean getIsTriggerable() {
        return isTriggerable;
    }


    /**
     * Sets the isTriggerable value for this EntityDefinition.
     * 
     * @param isTriggerable
     */
    public void setIsTriggerable(java.lang.Boolean isTriggerable) {
        this.isTriggerable = isTriggerable;
    }


    /**
     * Gets the isWorkflowEnabled value for this EntityDefinition.
     * 
     * @return isWorkflowEnabled
     */
    public java.lang.Boolean getIsWorkflowEnabled() {
        return isWorkflowEnabled;
    }


    /**
     * Sets the isWorkflowEnabled value for this EntityDefinition.
     * 
     * @param isWorkflowEnabled
     */
    public void setIsWorkflowEnabled(java.lang.Boolean isWorkflowEnabled) {
        this.isWorkflowEnabled = isWorkflowEnabled;
    }


    /**
     * Gets the keyPrefix value for this EntityDefinition.
     * 
     * @return keyPrefix
     */
    public java.lang.String getKeyPrefix() {
        return keyPrefix;
    }


    /**
     * Sets the keyPrefix value for this EntityDefinition.
     * 
     * @param keyPrefix
     */
    public void setKeyPrefix(java.lang.String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }


    /**
     * Gets the label value for this EntityDefinition.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this EntityDefinition.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedBy value for this EntityDefinition.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this EntityDefinition.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this EntityDefinition.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this EntityDefinition.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this EntityDefinition.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EntityDefinition.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the masterLabel value for this EntityDefinition.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EntityDefinition.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this EntityDefinition.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this EntityDefinition.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the newUrl value for this EntityDefinition.
     * 
     * @return newUrl
     */
    public java.lang.String getNewUrl() {
        return newUrl;
    }


    /**
     * Sets the newUrl value for this EntityDefinition.
     * 
     * @param newUrl
     */
    public void setNewUrl(java.lang.String newUrl) {
        this.newUrl = newUrl;
    }


    /**
     * Gets the particles value for this EntityDefinition.
     * 
     * @return particles
     */
    public com.sforce.soap.enterprise.QueryResult getParticles() {
        return particles;
    }


    /**
     * Sets the particles value for this EntityDefinition.
     * 
     * @param particles
     */
    public void setParticles(com.sforce.soap.enterprise.QueryResult particles) {
        this.particles = particles;
    }


    /**
     * Gets the pluralLabel value for this EntityDefinition.
     * 
     * @return pluralLabel
     */
    public java.lang.String getPluralLabel() {
        return pluralLabel;
    }


    /**
     * Sets the pluralLabel value for this EntityDefinition.
     * 
     * @param pluralLabel
     */
    public void setPluralLabel(java.lang.String pluralLabel) {
        this.pluralLabel = pluralLabel;
    }


    /**
     * Gets the publisher value for this EntityDefinition.
     * 
     * @return publisher
     */
    public com.sforce.soap.enterprise.sobject.Publisher getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this EntityDefinition.
     * 
     * @param publisher
     */
    public void setPublisher(com.sforce.soap.enterprise.sobject.Publisher publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the publisherId value for this EntityDefinition.
     * 
     * @return publisherId
     */
    public java.lang.String getPublisherId() {
        return publisherId;
    }


    /**
     * Sets the publisherId value for this EntityDefinition.
     * 
     * @param publisherId
     */
    public void setPublisherId(java.lang.String publisherId) {
        this.publisherId = publisherId;
    }


    /**
     * Gets the qualifiedApiName value for this EntityDefinition.
     * 
     * @return qualifiedApiName
     */
    public java.lang.String getQualifiedApiName() {
        return qualifiedApiName;
    }


    /**
     * Sets the qualifiedApiName value for this EntityDefinition.
     * 
     * @param qualifiedApiName
     */
    public void setQualifiedApiName(java.lang.String qualifiedApiName) {
        this.qualifiedApiName = qualifiedApiName;
    }


    /**
     * Gets the recordTypesSupported value for this EntityDefinition.
     * 
     * @return recordTypesSupported
     */
    public com.sforce.soap.enterprise.RecordTypeInfo[] getRecordTypesSupported() {
        return recordTypesSupported;
    }


    /**
     * Sets the recordTypesSupported value for this EntityDefinition.
     * 
     * @param recordTypesSupported
     */
    public void setRecordTypesSupported(com.sforce.soap.enterprise.RecordTypeInfo[] recordTypesSupported) {
        this.recordTypesSupported = recordTypesSupported;
    }


    /**
     * Gets the relationshipDomains value for this EntityDefinition.
     * 
     * @return relationshipDomains
     */
    public com.sforce.soap.enterprise.QueryResult getRelationshipDomains() {
        return relationshipDomains;
    }


    /**
     * Sets the relationshipDomains value for this EntityDefinition.
     * 
     * @param relationshipDomains
     */
    public void setRelationshipDomains(com.sforce.soap.enterprise.QueryResult relationshipDomains) {
        this.relationshipDomains = relationshipDomains;
    }


    /**
     * Gets the runningUserEntityAccess value for this EntityDefinition.
     * 
     * @return runningUserEntityAccess
     */
    public com.sforce.soap.enterprise.sobject.UserEntityAccess getRunningUserEntityAccess() {
        return runningUserEntityAccess;
    }


    /**
     * Sets the runningUserEntityAccess value for this EntityDefinition.
     * 
     * @param runningUserEntityAccess
     */
    public void setRunningUserEntityAccess(com.sforce.soap.enterprise.sobject.UserEntityAccess runningUserEntityAccess) {
        this.runningUserEntityAccess = runningUserEntityAccess;
    }


    /**
     * Gets the runningUserEntityAccessId value for this EntityDefinition.
     * 
     * @return runningUserEntityAccessId
     */
    public java.lang.String getRunningUserEntityAccessId() {
        return runningUserEntityAccessId;
    }


    /**
     * Sets the runningUserEntityAccessId value for this EntityDefinition.
     * 
     * @param runningUserEntityAccessId
     */
    public void setRunningUserEntityAccessId(java.lang.String runningUserEntityAccessId) {
        this.runningUserEntityAccessId = runningUserEntityAccessId;
    }


    /**
     * Gets the searchLayouts value for this EntityDefinition.
     * 
     * @return searchLayouts
     */
    public com.sforce.soap.enterprise.QueryResult getSearchLayouts() {
        return searchLayouts;
    }


    /**
     * Sets the searchLayouts value for this EntityDefinition.
     * 
     * @param searchLayouts
     */
    public void setSearchLayouts(com.sforce.soap.enterprise.QueryResult searchLayouts) {
        this.searchLayouts = searchLayouts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityDefinition)) return false;
        EntityDefinition other = (EntityDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.childRelationships==null && other.getChildRelationships()==null) || 
             (this.childRelationships!=null &&
              this.childRelationships.equals(other.getChildRelationships()))) &&
            ((this.defaultCompactLayoutId==null && other.getDefaultCompactLayoutId()==null) || 
             (this.defaultCompactLayoutId!=null &&
              this.defaultCompactLayoutId.equals(other.getDefaultCompactLayoutId()))) &&
            ((this.detailUrl==null && other.getDetailUrl()==null) || 
             (this.detailUrl!=null &&
              this.detailUrl.equals(other.getDetailUrl()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.editDefinitionUrl==null && other.getEditDefinitionUrl()==null) || 
             (this.editDefinitionUrl!=null &&
              this.editDefinitionUrl.equals(other.getEditDefinitionUrl()))) &&
            ((this.editUrl==null && other.getEditUrl()==null) || 
             (this.editUrl!=null &&
              this.editUrl.equals(other.getEditUrl()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              this.fields.equals(other.getFields()))) &&
            ((this.helpSettingPageName==null && other.getHelpSettingPageName()==null) || 
             (this.helpSettingPageName!=null &&
              this.helpSettingPageName.equals(other.getHelpSettingPageName()))) &&
            ((this.helpSettingPageUrl==null && other.getHelpSettingPageUrl()==null) || 
             (this.helpSettingPageUrl!=null &&
              this.helpSettingPageUrl.equals(other.getHelpSettingPageUrl()))) &&
            ((this.isApexTriggerable==null && other.getIsApexTriggerable()==null) || 
             (this.isApexTriggerable!=null &&
              this.isApexTriggerable.equals(other.getIsApexTriggerable()))) &&
            ((this.isCompactLayoutable==null && other.getIsCompactLayoutable()==null) || 
             (this.isCompactLayoutable!=null &&
              this.isCompactLayoutable.equals(other.getIsCompactLayoutable()))) &&
            ((this.isCustomSetting==null && other.getIsCustomSetting()==null) || 
             (this.isCustomSetting!=null &&
              this.isCustomSetting.equals(other.getIsCustomSetting()))) &&
            ((this.isCustomizable==null && other.getIsCustomizable()==null) || 
             (this.isCustomizable!=null &&
              this.isCustomizable.equals(other.getIsCustomizable()))) &&
            ((this.isDeprecatedAndHidden==null && other.getIsDeprecatedAndHidden()==null) || 
             (this.isDeprecatedAndHidden!=null &&
              this.isDeprecatedAndHidden.equals(other.getIsDeprecatedAndHidden()))) &&
            ((this.isEverCreatable==null && other.getIsEverCreatable()==null) || 
             (this.isEverCreatable!=null &&
              this.isEverCreatable.equals(other.getIsEverCreatable()))) &&
            ((this.isEverDeletable==null && other.getIsEverDeletable()==null) || 
             (this.isEverDeletable!=null &&
              this.isEverDeletable.equals(other.getIsEverDeletable()))) &&
            ((this.isEverUpdatable==null && other.getIsEverUpdatable()==null) || 
             (this.isEverUpdatable!=null &&
              this.isEverUpdatable.equals(other.getIsEverUpdatable()))) &&
            ((this.isFeedEnabled==null && other.getIsFeedEnabled()==null) || 
             (this.isFeedEnabled!=null &&
              this.isFeedEnabled.equals(other.getIsFeedEnabled()))) &&
            ((this.isIdEnabled==null && other.getIsIdEnabled()==null) || 
             (this.isIdEnabled!=null &&
              this.isIdEnabled.equals(other.getIsIdEnabled()))) &&
            ((this.isLayoutable==null && other.getIsLayoutable()==null) || 
             (this.isLayoutable!=null &&
              this.isLayoutable.equals(other.getIsLayoutable()))) &&
            ((this.isQueryable==null && other.getIsQueryable()==null) || 
             (this.isQueryable!=null &&
              this.isQueryable.equals(other.getIsQueryable()))) &&
            ((this.isReplicateable==null && other.getIsReplicateable()==null) || 
             (this.isReplicateable!=null &&
              this.isReplicateable.equals(other.getIsReplicateable()))) &&
            ((this.isRetrieveable==null && other.getIsRetrieveable()==null) || 
             (this.isRetrieveable!=null &&
              this.isRetrieveable.equals(other.getIsRetrieveable()))) &&
            ((this.isSearchLayoutable==null && other.getIsSearchLayoutable()==null) || 
             (this.isSearchLayoutable!=null &&
              this.isSearchLayoutable.equals(other.getIsSearchLayoutable()))) &&
            ((this.isSearchable==null && other.getIsSearchable()==null) || 
             (this.isSearchable!=null &&
              this.isSearchable.equals(other.getIsSearchable()))) &&
            ((this.isTriggerable==null && other.getIsTriggerable()==null) || 
             (this.isTriggerable!=null &&
              this.isTriggerable.equals(other.getIsTriggerable()))) &&
            ((this.isWorkflowEnabled==null && other.getIsWorkflowEnabled()==null) || 
             (this.isWorkflowEnabled!=null &&
              this.isWorkflowEnabled.equals(other.getIsWorkflowEnabled()))) &&
            ((this.keyPrefix==null && other.getKeyPrefix()==null) || 
             (this.keyPrefix!=null &&
              this.keyPrefix.equals(other.getKeyPrefix()))) &&
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
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.newUrl==null && other.getNewUrl()==null) || 
             (this.newUrl!=null &&
              this.newUrl.equals(other.getNewUrl()))) &&
            ((this.particles==null && other.getParticles()==null) || 
             (this.particles!=null &&
              this.particles.equals(other.getParticles()))) &&
            ((this.pluralLabel==null && other.getPluralLabel()==null) || 
             (this.pluralLabel!=null &&
              this.pluralLabel.equals(other.getPluralLabel()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.publisherId==null && other.getPublisherId()==null) || 
             (this.publisherId!=null &&
              this.publisherId.equals(other.getPublisherId()))) &&
            ((this.qualifiedApiName==null && other.getQualifiedApiName()==null) || 
             (this.qualifiedApiName!=null &&
              this.qualifiedApiName.equals(other.getQualifiedApiName()))) &&
            ((this.recordTypesSupported==null && other.getRecordTypesSupported()==null) || 
             (this.recordTypesSupported!=null &&
              java.util.Arrays.equals(this.recordTypesSupported, other.getRecordTypesSupported()))) &&
            ((this.relationshipDomains==null && other.getRelationshipDomains()==null) || 
             (this.relationshipDomains!=null &&
              this.relationshipDomains.equals(other.getRelationshipDomains()))) &&
            ((this.runningUserEntityAccess==null && other.getRunningUserEntityAccess()==null) || 
             (this.runningUserEntityAccess!=null &&
              this.runningUserEntityAccess.equals(other.getRunningUserEntityAccess()))) &&
            ((this.runningUserEntityAccessId==null && other.getRunningUserEntityAccessId()==null) || 
             (this.runningUserEntityAccessId!=null &&
              this.runningUserEntityAccessId.equals(other.getRunningUserEntityAccessId()))) &&
            ((this.searchLayouts==null && other.getSearchLayouts()==null) || 
             (this.searchLayouts!=null &&
              this.searchLayouts.equals(other.getSearchLayouts())));
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
        if (getChildRelationships() != null) {
            _hashCode += getChildRelationships().hashCode();
        }
        if (getDefaultCompactLayoutId() != null) {
            _hashCode += getDefaultCompactLayoutId().hashCode();
        }
        if (getDetailUrl() != null) {
            _hashCode += getDetailUrl().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEditDefinitionUrl() != null) {
            _hashCode += getEditDefinitionUrl().hashCode();
        }
        if (getEditUrl() != null) {
            _hashCode += getEditUrl().hashCode();
        }
        if (getFields() != null) {
            _hashCode += getFields().hashCode();
        }
        if (getHelpSettingPageName() != null) {
            _hashCode += getHelpSettingPageName().hashCode();
        }
        if (getHelpSettingPageUrl() != null) {
            _hashCode += getHelpSettingPageUrl().hashCode();
        }
        if (getIsApexTriggerable() != null) {
            _hashCode += getIsApexTriggerable().hashCode();
        }
        if (getIsCompactLayoutable() != null) {
            _hashCode += getIsCompactLayoutable().hashCode();
        }
        if (getIsCustomSetting() != null) {
            _hashCode += getIsCustomSetting().hashCode();
        }
        if (getIsCustomizable() != null) {
            _hashCode += getIsCustomizable().hashCode();
        }
        if (getIsDeprecatedAndHidden() != null) {
            _hashCode += getIsDeprecatedAndHidden().hashCode();
        }
        if (getIsEverCreatable() != null) {
            _hashCode += getIsEverCreatable().hashCode();
        }
        if (getIsEverDeletable() != null) {
            _hashCode += getIsEverDeletable().hashCode();
        }
        if (getIsEverUpdatable() != null) {
            _hashCode += getIsEverUpdatable().hashCode();
        }
        if (getIsFeedEnabled() != null) {
            _hashCode += getIsFeedEnabled().hashCode();
        }
        if (getIsIdEnabled() != null) {
            _hashCode += getIsIdEnabled().hashCode();
        }
        if (getIsLayoutable() != null) {
            _hashCode += getIsLayoutable().hashCode();
        }
        if (getIsQueryable() != null) {
            _hashCode += getIsQueryable().hashCode();
        }
        if (getIsReplicateable() != null) {
            _hashCode += getIsReplicateable().hashCode();
        }
        if (getIsRetrieveable() != null) {
            _hashCode += getIsRetrieveable().hashCode();
        }
        if (getIsSearchLayoutable() != null) {
            _hashCode += getIsSearchLayoutable().hashCode();
        }
        if (getIsSearchable() != null) {
            _hashCode += getIsSearchable().hashCode();
        }
        if (getIsTriggerable() != null) {
            _hashCode += getIsTriggerable().hashCode();
        }
        if (getIsWorkflowEnabled() != null) {
            _hashCode += getIsWorkflowEnabled().hashCode();
        }
        if (getKeyPrefix() != null) {
            _hashCode += getKeyPrefix().hashCode();
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
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getNewUrl() != null) {
            _hashCode += getNewUrl().hashCode();
        }
        if (getParticles() != null) {
            _hashCode += getParticles().hashCode();
        }
        if (getPluralLabel() != null) {
            _hashCode += getPluralLabel().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getPublisherId() != null) {
            _hashCode += getPublisherId().hashCode();
        }
        if (getQualifiedApiName() != null) {
            _hashCode += getQualifiedApiName().hashCode();
        }
        if (getRecordTypesSupported() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordTypesSupported());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordTypesSupported(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipDomains() != null) {
            _hashCode += getRelationshipDomains().hashCode();
        }
        if (getRunningUserEntityAccess() != null) {
            _hashCode += getRunningUserEntityAccess().hashCode();
        }
        if (getRunningUserEntityAccessId() != null) {
            _hashCode += getRunningUserEntityAccessId().hashCode();
        }
        if (getSearchLayouts() != null) {
            _hashCode += getSearchLayouts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChildRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCompactLayoutId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultCompactLayoutId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DetailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editDefinitionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EditDefinitionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EditUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpSettingPageName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HelpSettingPageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpSettingPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HelpSettingPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApexTriggerable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApexTriggerable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompactLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCompactLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCustomSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCustomSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCustomizable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCustomizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeprecatedAndHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeprecatedAndHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEverCreatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEverCreatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEverDeletable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEverDeletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEverUpdatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEverUpdatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFeedEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFeedEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIdEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsIdEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQueryable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsQueryable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReplicateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReplicateable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRetrieveable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRetrieveable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSearchLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsSearchLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSearchable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsSearchable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTriggerable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsTriggerable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWorkflowEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWorkflowEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KeyPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
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
        elemField.setFieldName("newUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Particles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluralLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PluralLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PublisherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedApiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QualifiedApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "recordTypeInfos"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipDomains");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipDomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUserEntityAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUserEntityAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserEntityAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUserEntityAccessId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUserEntityAccessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLayouts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SearchLayouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
