/**
 * ContentDistribution.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ContentDistribution  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult contentDistributionViews;

    private java.lang.String contentDocumentId;

    private com.sforce.soap.enterprise.sobject.ContentVersion contentVersion;

    private java.lang.String contentVersionId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String distributionPublicUrl;

    private java.util.Calendar expiryDate;

    private java.util.Calendar firstViewDate;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastViewDate;

    private java.lang.String name;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.String password;

    private java.lang.Boolean preferencesAllowOriginalDownload;

    private java.lang.Boolean preferencesAllowPDFDownload;

    private java.lang.Boolean preferencesAllowViewInBrowser;

    private java.lang.Boolean preferencesExpires;

    private java.lang.Boolean preferencesLinkLatestVersion;

    private java.lang.Boolean preferencesNotifyOnVisit;

    private java.lang.Boolean preferencesNotifyRndtnComplete;

    private java.lang.Boolean preferencesPasswordRequired;

    private com.sforce.soap.enterprise.sobject.SObject relatedRecord;

    private java.lang.String relatedRecordId;

    private java.util.Calendar systemModstamp;

    private java.lang.Integer viewCount;

    public ContentDistribution() {
    }

    public ContentDistribution(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult contentDistributionViews,
           java.lang.String contentDocumentId,
           com.sforce.soap.enterprise.sobject.ContentVersion contentVersion,
           java.lang.String contentVersionId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String distributionPublicUrl,
           java.util.Calendar expiryDate,
           java.util.Calendar firstViewDate,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastViewDate,
           java.lang.String name,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.String password,
           java.lang.Boolean preferencesAllowOriginalDownload,
           java.lang.Boolean preferencesAllowPDFDownload,
           java.lang.Boolean preferencesAllowViewInBrowser,
           java.lang.Boolean preferencesExpires,
           java.lang.Boolean preferencesLinkLatestVersion,
           java.lang.Boolean preferencesNotifyOnVisit,
           java.lang.Boolean preferencesNotifyRndtnComplete,
           java.lang.Boolean preferencesPasswordRequired,
           com.sforce.soap.enterprise.sobject.SObject relatedRecord,
           java.lang.String relatedRecordId,
           java.util.Calendar systemModstamp,
           java.lang.Integer viewCount) {
        super(
            fieldsToNull,
            id);
        this.contentDistributionViews = contentDistributionViews;
        this.contentDocumentId = contentDocumentId;
        this.contentVersion = contentVersion;
        this.contentVersionId = contentVersionId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.distributionPublicUrl = distributionPublicUrl;
        this.expiryDate = expiryDate;
        this.firstViewDate = firstViewDate;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastViewDate = lastViewDate;
        this.name = name;
        this.owner = owner;
        this.ownerId = ownerId;
        this.password = password;
        this.preferencesAllowOriginalDownload = preferencesAllowOriginalDownload;
        this.preferencesAllowPDFDownload = preferencesAllowPDFDownload;
        this.preferencesAllowViewInBrowser = preferencesAllowViewInBrowser;
        this.preferencesExpires = preferencesExpires;
        this.preferencesLinkLatestVersion = preferencesLinkLatestVersion;
        this.preferencesNotifyOnVisit = preferencesNotifyOnVisit;
        this.preferencesNotifyRndtnComplete = preferencesNotifyRndtnComplete;
        this.preferencesPasswordRequired = preferencesPasswordRequired;
        this.relatedRecord = relatedRecord;
        this.relatedRecordId = relatedRecordId;
        this.systemModstamp = systemModstamp;
        this.viewCount = viewCount;
    }


    /**
     * Gets the contentDistributionViews value for this ContentDistribution.
     * 
     * @return contentDistributionViews
     */
    public com.sforce.soap.enterprise.QueryResult getContentDistributionViews() {
        return contentDistributionViews;
    }


    /**
     * Sets the contentDistributionViews value for this ContentDistribution.
     * 
     * @param contentDistributionViews
     */
    public void setContentDistributionViews(com.sforce.soap.enterprise.QueryResult contentDistributionViews) {
        this.contentDistributionViews = contentDistributionViews;
    }


    /**
     * Gets the contentDocumentId value for this ContentDistribution.
     * 
     * @return contentDocumentId
     */
    public java.lang.String getContentDocumentId() {
        return contentDocumentId;
    }


    /**
     * Sets the contentDocumentId value for this ContentDistribution.
     * 
     * @param contentDocumentId
     */
    public void setContentDocumentId(java.lang.String contentDocumentId) {
        this.contentDocumentId = contentDocumentId;
    }


    /**
     * Gets the contentVersion value for this ContentDistribution.
     * 
     * @return contentVersion
     */
    public com.sforce.soap.enterprise.sobject.ContentVersion getContentVersion() {
        return contentVersion;
    }


    /**
     * Sets the contentVersion value for this ContentDistribution.
     * 
     * @param contentVersion
     */
    public void setContentVersion(com.sforce.soap.enterprise.sobject.ContentVersion contentVersion) {
        this.contentVersion = contentVersion;
    }


    /**
     * Gets the contentVersionId value for this ContentDistribution.
     * 
     * @return contentVersionId
     */
    public java.lang.String getContentVersionId() {
        return contentVersionId;
    }


    /**
     * Sets the contentVersionId value for this ContentDistribution.
     * 
     * @param contentVersionId
     */
    public void setContentVersionId(java.lang.String contentVersionId) {
        this.contentVersionId = contentVersionId;
    }


    /**
     * Gets the createdBy value for this ContentDistribution.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ContentDistribution.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ContentDistribution.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ContentDistribution.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ContentDistribution.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ContentDistribution.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the distributionPublicUrl value for this ContentDistribution.
     * 
     * @return distributionPublicUrl
     */
    public java.lang.String getDistributionPublicUrl() {
        return distributionPublicUrl;
    }


    /**
     * Sets the distributionPublicUrl value for this ContentDistribution.
     * 
     * @param distributionPublicUrl
     */
    public void setDistributionPublicUrl(java.lang.String distributionPublicUrl) {
        this.distributionPublicUrl = distributionPublicUrl;
    }


    /**
     * Gets the expiryDate value for this ContentDistribution.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this ContentDistribution.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the firstViewDate value for this ContentDistribution.
     * 
     * @return firstViewDate
     */
    public java.util.Calendar getFirstViewDate() {
        return firstViewDate;
    }


    /**
     * Sets the firstViewDate value for this ContentDistribution.
     * 
     * @param firstViewDate
     */
    public void setFirstViewDate(java.util.Calendar firstViewDate) {
        this.firstViewDate = firstViewDate;
    }


    /**
     * Gets the isDeleted value for this ContentDistribution.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ContentDistribution.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this ContentDistribution.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ContentDistribution.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ContentDistribution.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ContentDistribution.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ContentDistribution.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ContentDistribution.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastViewDate value for this ContentDistribution.
     * 
     * @return lastViewDate
     */
    public java.util.Calendar getLastViewDate() {
        return lastViewDate;
    }


    /**
     * Sets the lastViewDate value for this ContentDistribution.
     * 
     * @param lastViewDate
     */
    public void setLastViewDate(java.util.Calendar lastViewDate) {
        this.lastViewDate = lastViewDate;
    }


    /**
     * Gets the name value for this ContentDistribution.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ContentDistribution.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this ContentDistribution.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ContentDistribution.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this ContentDistribution.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this ContentDistribution.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the password value for this ContentDistribution.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ContentDistribution.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the preferencesAllowOriginalDownload value for this ContentDistribution.
     * 
     * @return preferencesAllowOriginalDownload
     */
    public java.lang.Boolean getPreferencesAllowOriginalDownload() {
        return preferencesAllowOriginalDownload;
    }


    /**
     * Sets the preferencesAllowOriginalDownload value for this ContentDistribution.
     * 
     * @param preferencesAllowOriginalDownload
     */
    public void setPreferencesAllowOriginalDownload(java.lang.Boolean preferencesAllowOriginalDownload) {
        this.preferencesAllowOriginalDownload = preferencesAllowOriginalDownload;
    }


    /**
     * Gets the preferencesAllowPDFDownload value for this ContentDistribution.
     * 
     * @return preferencesAllowPDFDownload
     */
    public java.lang.Boolean getPreferencesAllowPDFDownload() {
        return preferencesAllowPDFDownload;
    }


    /**
     * Sets the preferencesAllowPDFDownload value for this ContentDistribution.
     * 
     * @param preferencesAllowPDFDownload
     */
    public void setPreferencesAllowPDFDownload(java.lang.Boolean preferencesAllowPDFDownload) {
        this.preferencesAllowPDFDownload = preferencesAllowPDFDownload;
    }


    /**
     * Gets the preferencesAllowViewInBrowser value for this ContentDistribution.
     * 
     * @return preferencesAllowViewInBrowser
     */
    public java.lang.Boolean getPreferencesAllowViewInBrowser() {
        return preferencesAllowViewInBrowser;
    }


    /**
     * Sets the preferencesAllowViewInBrowser value for this ContentDistribution.
     * 
     * @param preferencesAllowViewInBrowser
     */
    public void setPreferencesAllowViewInBrowser(java.lang.Boolean preferencesAllowViewInBrowser) {
        this.preferencesAllowViewInBrowser = preferencesAllowViewInBrowser;
    }


    /**
     * Gets the preferencesExpires value for this ContentDistribution.
     * 
     * @return preferencesExpires
     */
    public java.lang.Boolean getPreferencesExpires() {
        return preferencesExpires;
    }


    /**
     * Sets the preferencesExpires value for this ContentDistribution.
     * 
     * @param preferencesExpires
     */
    public void setPreferencesExpires(java.lang.Boolean preferencesExpires) {
        this.preferencesExpires = preferencesExpires;
    }


    /**
     * Gets the preferencesLinkLatestVersion value for this ContentDistribution.
     * 
     * @return preferencesLinkLatestVersion
     */
    public java.lang.Boolean getPreferencesLinkLatestVersion() {
        return preferencesLinkLatestVersion;
    }


    /**
     * Sets the preferencesLinkLatestVersion value for this ContentDistribution.
     * 
     * @param preferencesLinkLatestVersion
     */
    public void setPreferencesLinkLatestVersion(java.lang.Boolean preferencesLinkLatestVersion) {
        this.preferencesLinkLatestVersion = preferencesLinkLatestVersion;
    }


    /**
     * Gets the preferencesNotifyOnVisit value for this ContentDistribution.
     * 
     * @return preferencesNotifyOnVisit
     */
    public java.lang.Boolean getPreferencesNotifyOnVisit() {
        return preferencesNotifyOnVisit;
    }


    /**
     * Sets the preferencesNotifyOnVisit value for this ContentDistribution.
     * 
     * @param preferencesNotifyOnVisit
     */
    public void setPreferencesNotifyOnVisit(java.lang.Boolean preferencesNotifyOnVisit) {
        this.preferencesNotifyOnVisit = preferencesNotifyOnVisit;
    }


    /**
     * Gets the preferencesNotifyRndtnComplete value for this ContentDistribution.
     * 
     * @return preferencesNotifyRndtnComplete
     */
    public java.lang.Boolean getPreferencesNotifyRndtnComplete() {
        return preferencesNotifyRndtnComplete;
    }


    /**
     * Sets the preferencesNotifyRndtnComplete value for this ContentDistribution.
     * 
     * @param preferencesNotifyRndtnComplete
     */
    public void setPreferencesNotifyRndtnComplete(java.lang.Boolean preferencesNotifyRndtnComplete) {
        this.preferencesNotifyRndtnComplete = preferencesNotifyRndtnComplete;
    }


    /**
     * Gets the preferencesPasswordRequired value for this ContentDistribution.
     * 
     * @return preferencesPasswordRequired
     */
    public java.lang.Boolean getPreferencesPasswordRequired() {
        return preferencesPasswordRequired;
    }


    /**
     * Sets the preferencesPasswordRequired value for this ContentDistribution.
     * 
     * @param preferencesPasswordRequired
     */
    public void setPreferencesPasswordRequired(java.lang.Boolean preferencesPasswordRequired) {
        this.preferencesPasswordRequired = preferencesPasswordRequired;
    }


    /**
     * Gets the relatedRecord value for this ContentDistribution.
     * 
     * @return relatedRecord
     */
    public com.sforce.soap.enterprise.sobject.SObject getRelatedRecord() {
        return relatedRecord;
    }


    /**
     * Sets the relatedRecord value for this ContentDistribution.
     * 
     * @param relatedRecord
     */
    public void setRelatedRecord(com.sforce.soap.enterprise.sobject.SObject relatedRecord) {
        this.relatedRecord = relatedRecord;
    }


    /**
     * Gets the relatedRecordId value for this ContentDistribution.
     * 
     * @return relatedRecordId
     */
    public java.lang.String getRelatedRecordId() {
        return relatedRecordId;
    }


    /**
     * Sets the relatedRecordId value for this ContentDistribution.
     * 
     * @param relatedRecordId
     */
    public void setRelatedRecordId(java.lang.String relatedRecordId) {
        this.relatedRecordId = relatedRecordId;
    }


    /**
     * Gets the systemModstamp value for this ContentDistribution.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ContentDistribution.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the viewCount value for this ContentDistribution.
     * 
     * @return viewCount
     */
    public java.lang.Integer getViewCount() {
        return viewCount;
    }


    /**
     * Sets the viewCount value for this ContentDistribution.
     * 
     * @param viewCount
     */
    public void setViewCount(java.lang.Integer viewCount) {
        this.viewCount = viewCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentDistribution)) return false;
        ContentDistribution other = (ContentDistribution) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentDistributionViews==null && other.getContentDistributionViews()==null) || 
             (this.contentDistributionViews!=null &&
              this.contentDistributionViews.equals(other.getContentDistributionViews()))) &&
            ((this.contentDocumentId==null && other.getContentDocumentId()==null) || 
             (this.contentDocumentId!=null &&
              this.contentDocumentId.equals(other.getContentDocumentId()))) &&
            ((this.contentVersion==null && other.getContentVersion()==null) || 
             (this.contentVersion!=null &&
              this.contentVersion.equals(other.getContentVersion()))) &&
            ((this.contentVersionId==null && other.getContentVersionId()==null) || 
             (this.contentVersionId!=null &&
              this.contentVersionId.equals(other.getContentVersionId()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.distributionPublicUrl==null && other.getDistributionPublicUrl()==null) || 
             (this.distributionPublicUrl!=null &&
              this.distributionPublicUrl.equals(other.getDistributionPublicUrl()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.firstViewDate==null && other.getFirstViewDate()==null) || 
             (this.firstViewDate!=null &&
              this.firstViewDate.equals(other.getFirstViewDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastViewDate==null && other.getLastViewDate()==null) || 
             (this.lastViewDate!=null &&
              this.lastViewDate.equals(other.getLastViewDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.preferencesAllowOriginalDownload==null && other.getPreferencesAllowOriginalDownload()==null) || 
             (this.preferencesAllowOriginalDownload!=null &&
              this.preferencesAllowOriginalDownload.equals(other.getPreferencesAllowOriginalDownload()))) &&
            ((this.preferencesAllowPDFDownload==null && other.getPreferencesAllowPDFDownload()==null) || 
             (this.preferencesAllowPDFDownload!=null &&
              this.preferencesAllowPDFDownload.equals(other.getPreferencesAllowPDFDownload()))) &&
            ((this.preferencesAllowViewInBrowser==null && other.getPreferencesAllowViewInBrowser()==null) || 
             (this.preferencesAllowViewInBrowser!=null &&
              this.preferencesAllowViewInBrowser.equals(other.getPreferencesAllowViewInBrowser()))) &&
            ((this.preferencesExpires==null && other.getPreferencesExpires()==null) || 
             (this.preferencesExpires!=null &&
              this.preferencesExpires.equals(other.getPreferencesExpires()))) &&
            ((this.preferencesLinkLatestVersion==null && other.getPreferencesLinkLatestVersion()==null) || 
             (this.preferencesLinkLatestVersion!=null &&
              this.preferencesLinkLatestVersion.equals(other.getPreferencesLinkLatestVersion()))) &&
            ((this.preferencesNotifyOnVisit==null && other.getPreferencesNotifyOnVisit()==null) || 
             (this.preferencesNotifyOnVisit!=null &&
              this.preferencesNotifyOnVisit.equals(other.getPreferencesNotifyOnVisit()))) &&
            ((this.preferencesNotifyRndtnComplete==null && other.getPreferencesNotifyRndtnComplete()==null) || 
             (this.preferencesNotifyRndtnComplete!=null &&
              this.preferencesNotifyRndtnComplete.equals(other.getPreferencesNotifyRndtnComplete()))) &&
            ((this.preferencesPasswordRequired==null && other.getPreferencesPasswordRequired()==null) || 
             (this.preferencesPasswordRequired!=null &&
              this.preferencesPasswordRequired.equals(other.getPreferencesPasswordRequired()))) &&
            ((this.relatedRecord==null && other.getRelatedRecord()==null) || 
             (this.relatedRecord!=null &&
              this.relatedRecord.equals(other.getRelatedRecord()))) &&
            ((this.relatedRecordId==null && other.getRelatedRecordId()==null) || 
             (this.relatedRecordId!=null &&
              this.relatedRecordId.equals(other.getRelatedRecordId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.viewCount==null && other.getViewCount()==null) || 
             (this.viewCount!=null &&
              this.viewCount.equals(other.getViewCount())));
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
        if (getContentDistributionViews() != null) {
            _hashCode += getContentDistributionViews().hashCode();
        }
        if (getContentDocumentId() != null) {
            _hashCode += getContentDocumentId().hashCode();
        }
        if (getContentVersion() != null) {
            _hashCode += getContentVersion().hashCode();
        }
        if (getContentVersionId() != null) {
            _hashCode += getContentVersionId().hashCode();
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
        if (getDistributionPublicUrl() != null) {
            _hashCode += getDistributionPublicUrl().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getFirstViewDate() != null) {
            _hashCode += getFirstViewDate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
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
        if (getLastViewDate() != null) {
            _hashCode += getLastViewDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPreferencesAllowOriginalDownload() != null) {
            _hashCode += getPreferencesAllowOriginalDownload().hashCode();
        }
        if (getPreferencesAllowPDFDownload() != null) {
            _hashCode += getPreferencesAllowPDFDownload().hashCode();
        }
        if (getPreferencesAllowViewInBrowser() != null) {
            _hashCode += getPreferencesAllowViewInBrowser().hashCode();
        }
        if (getPreferencesExpires() != null) {
            _hashCode += getPreferencesExpires().hashCode();
        }
        if (getPreferencesLinkLatestVersion() != null) {
            _hashCode += getPreferencesLinkLatestVersion().hashCode();
        }
        if (getPreferencesNotifyOnVisit() != null) {
            _hashCode += getPreferencesNotifyOnVisit().hashCode();
        }
        if (getPreferencesNotifyRndtnComplete() != null) {
            _hashCode += getPreferencesNotifyRndtnComplete().hashCode();
        }
        if (getPreferencesPasswordRequired() != null) {
            _hashCode += getPreferencesPasswordRequired().hashCode();
        }
        if (getRelatedRecord() != null) {
            _hashCode += getRelatedRecord().hashCode();
        }
        if (getRelatedRecordId() != null) {
            _hashCode += getRelatedRecordId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getViewCount() != null) {
            _hashCode += getViewCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentDistribution.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDistribution"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDistributionViews");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDistributionViews"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDocumentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersionId"));
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
        elemField.setFieldName("distributionPublicUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DistributionPublicUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstViewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstViewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastViewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastViewDate"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesAllowOriginalDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesAllowOriginalDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesAllowPDFDownload");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesAllowPDFDownload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesAllowViewInBrowser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesAllowViewInBrowser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesExpires");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesExpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesLinkLatestVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesLinkLatestVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesNotifyOnVisit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesNotifyOnVisit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesNotifyRndtnComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesNotifyRndtnComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesPasswordRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesPasswordRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelatedRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelatedRecordId"));
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
        elemField.setFieldName("viewCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ViewCount"));
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
