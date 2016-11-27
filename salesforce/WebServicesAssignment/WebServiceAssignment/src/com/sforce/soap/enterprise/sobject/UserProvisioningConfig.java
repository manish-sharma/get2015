/**
 * UserProvisioningConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserProvisioningConfig  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String approvalRequired;

    private com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp;

    private java.lang.String connectedAppId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String developerName;

    private java.lang.Boolean enabled;

    private java.lang.String enabledOperations;

    private java.lang.Boolean isDeleted;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastReconDateTime;

    private java.lang.String masterLabel;

    private com.sforce.soap.enterprise.sobject.NamedCredential namedCredential;

    private java.lang.String namedCredentialId;

    private java.lang.String namespacePrefix;

    private java.lang.String notes;

    private java.lang.String onUpdateAttributes;

    private java.lang.String reconFilter;

    private java.util.Calendar systemModstamp;

    private java.lang.String userAccountMapping;

    public UserProvisioningConfig() {
    }

    public UserProvisioningConfig(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String approvalRequired,
           com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp,
           java.lang.String connectedAppId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String developerName,
           java.lang.Boolean enabled,
           java.lang.String enabledOperations,
           java.lang.Boolean isDeleted,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastReconDateTime,
           java.lang.String masterLabel,
           com.sforce.soap.enterprise.sobject.NamedCredential namedCredential,
           java.lang.String namedCredentialId,
           java.lang.String namespacePrefix,
           java.lang.String notes,
           java.lang.String onUpdateAttributes,
           java.lang.String reconFilter,
           java.util.Calendar systemModstamp,
           java.lang.String userAccountMapping) {
        super(
            fieldsToNull,
            id);
        this.approvalRequired = approvalRequired;
        this.connectedApp = connectedApp;
        this.connectedAppId = connectedAppId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.developerName = developerName;
        this.enabled = enabled;
        this.enabledOperations = enabledOperations;
        this.isDeleted = isDeleted;
        this.language = language;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReconDateTime = lastReconDateTime;
        this.masterLabel = masterLabel;
        this.namedCredential = namedCredential;
        this.namedCredentialId = namedCredentialId;
        this.namespacePrefix = namespacePrefix;
        this.notes = notes;
        this.onUpdateAttributes = onUpdateAttributes;
        this.reconFilter = reconFilter;
        this.systemModstamp = systemModstamp;
        this.userAccountMapping = userAccountMapping;
    }


    /**
     * Gets the approvalRequired value for this UserProvisioningConfig.
     * 
     * @return approvalRequired
     */
    public java.lang.String getApprovalRequired() {
        return approvalRequired;
    }


    /**
     * Sets the approvalRequired value for this UserProvisioningConfig.
     * 
     * @param approvalRequired
     */
    public void setApprovalRequired(java.lang.String approvalRequired) {
        this.approvalRequired = approvalRequired;
    }


    /**
     * Gets the connectedApp value for this UserProvisioningConfig.
     * 
     * @return connectedApp
     */
    public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
        return connectedApp;
    }


    /**
     * Sets the connectedApp value for this UserProvisioningConfig.
     * 
     * @param connectedApp
     */
    public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp) {
        this.connectedApp = connectedApp;
    }


    /**
     * Gets the connectedAppId value for this UserProvisioningConfig.
     * 
     * @return connectedAppId
     */
    public java.lang.String getConnectedAppId() {
        return connectedAppId;
    }


    /**
     * Sets the connectedAppId value for this UserProvisioningConfig.
     * 
     * @param connectedAppId
     */
    public void setConnectedAppId(java.lang.String connectedAppId) {
        this.connectedAppId = connectedAppId;
    }


    /**
     * Gets the createdBy value for this UserProvisioningConfig.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this UserProvisioningConfig.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this UserProvisioningConfig.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this UserProvisioningConfig.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this UserProvisioningConfig.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this UserProvisioningConfig.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the developerName value for this UserProvisioningConfig.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this UserProvisioningConfig.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the enabled value for this UserProvisioningConfig.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this UserProvisioningConfig.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the enabledOperations value for this UserProvisioningConfig.
     * 
     * @return enabledOperations
     */
    public java.lang.String getEnabledOperations() {
        return enabledOperations;
    }


    /**
     * Sets the enabledOperations value for this UserProvisioningConfig.
     * 
     * @param enabledOperations
     */
    public void setEnabledOperations(java.lang.String enabledOperations) {
        this.enabledOperations = enabledOperations;
    }


    /**
     * Gets the isDeleted value for this UserProvisioningConfig.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this UserProvisioningConfig.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the language value for this UserProvisioningConfig.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this UserProvisioningConfig.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedBy value for this UserProvisioningConfig.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this UserProvisioningConfig.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this UserProvisioningConfig.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this UserProvisioningConfig.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this UserProvisioningConfig.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this UserProvisioningConfig.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReconDateTime value for this UserProvisioningConfig.
     * 
     * @return lastReconDateTime
     */
    public java.util.Calendar getLastReconDateTime() {
        return lastReconDateTime;
    }


    /**
     * Sets the lastReconDateTime value for this UserProvisioningConfig.
     * 
     * @param lastReconDateTime
     */
    public void setLastReconDateTime(java.util.Calendar lastReconDateTime) {
        this.lastReconDateTime = lastReconDateTime;
    }


    /**
     * Gets the masterLabel value for this UserProvisioningConfig.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this UserProvisioningConfig.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namedCredential value for this UserProvisioningConfig.
     * 
     * @return namedCredential
     */
    public com.sforce.soap.enterprise.sobject.NamedCredential getNamedCredential() {
        return namedCredential;
    }


    /**
     * Sets the namedCredential value for this UserProvisioningConfig.
     * 
     * @param namedCredential
     */
    public void setNamedCredential(com.sforce.soap.enterprise.sobject.NamedCredential namedCredential) {
        this.namedCredential = namedCredential;
    }


    /**
     * Gets the namedCredentialId value for this UserProvisioningConfig.
     * 
     * @return namedCredentialId
     */
    public java.lang.String getNamedCredentialId() {
        return namedCredentialId;
    }


    /**
     * Sets the namedCredentialId value for this UserProvisioningConfig.
     * 
     * @param namedCredentialId
     */
    public void setNamedCredentialId(java.lang.String namedCredentialId) {
        this.namedCredentialId = namedCredentialId;
    }


    /**
     * Gets the namespacePrefix value for this UserProvisioningConfig.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this UserProvisioningConfig.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the notes value for this UserProvisioningConfig.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this UserProvisioningConfig.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the onUpdateAttributes value for this UserProvisioningConfig.
     * 
     * @return onUpdateAttributes
     */
    public java.lang.String getOnUpdateAttributes() {
        return onUpdateAttributes;
    }


    /**
     * Sets the onUpdateAttributes value for this UserProvisioningConfig.
     * 
     * @param onUpdateAttributes
     */
    public void setOnUpdateAttributes(java.lang.String onUpdateAttributes) {
        this.onUpdateAttributes = onUpdateAttributes;
    }


    /**
     * Gets the reconFilter value for this UserProvisioningConfig.
     * 
     * @return reconFilter
     */
    public java.lang.String getReconFilter() {
        return reconFilter;
    }


    /**
     * Sets the reconFilter value for this UserProvisioningConfig.
     * 
     * @param reconFilter
     */
    public void setReconFilter(java.lang.String reconFilter) {
        this.reconFilter = reconFilter;
    }


    /**
     * Gets the systemModstamp value for this UserProvisioningConfig.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this UserProvisioningConfig.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userAccountMapping value for this UserProvisioningConfig.
     * 
     * @return userAccountMapping
     */
    public java.lang.String getUserAccountMapping() {
        return userAccountMapping;
    }


    /**
     * Sets the userAccountMapping value for this UserProvisioningConfig.
     * 
     * @param userAccountMapping
     */
    public void setUserAccountMapping(java.lang.String userAccountMapping) {
        this.userAccountMapping = userAccountMapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProvisioningConfig)) return false;
        UserProvisioningConfig other = (UserProvisioningConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approvalRequired==null && other.getApprovalRequired()==null) || 
             (this.approvalRequired!=null &&
              this.approvalRequired.equals(other.getApprovalRequired()))) &&
            ((this.connectedApp==null && other.getConnectedApp()==null) || 
             (this.connectedApp!=null &&
              this.connectedApp.equals(other.getConnectedApp()))) &&
            ((this.connectedAppId==null && other.getConnectedAppId()==null) || 
             (this.connectedAppId!=null &&
              this.connectedAppId.equals(other.getConnectedAppId()))) &&
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
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.enabledOperations==null && other.getEnabledOperations()==null) || 
             (this.enabledOperations!=null &&
              this.enabledOperations.equals(other.getEnabledOperations()))) &&
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
            ((this.lastReconDateTime==null && other.getLastReconDateTime()==null) || 
             (this.lastReconDateTime!=null &&
              this.lastReconDateTime.equals(other.getLastReconDateTime()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.namedCredential==null && other.getNamedCredential()==null) || 
             (this.namedCredential!=null &&
              this.namedCredential.equals(other.getNamedCredential()))) &&
            ((this.namedCredentialId==null && other.getNamedCredentialId()==null) || 
             (this.namedCredentialId!=null &&
              this.namedCredentialId.equals(other.getNamedCredentialId()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.onUpdateAttributes==null && other.getOnUpdateAttributes()==null) || 
             (this.onUpdateAttributes!=null &&
              this.onUpdateAttributes.equals(other.getOnUpdateAttributes()))) &&
            ((this.reconFilter==null && other.getReconFilter()==null) || 
             (this.reconFilter!=null &&
              this.reconFilter.equals(other.getReconFilter()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userAccountMapping==null && other.getUserAccountMapping()==null) || 
             (this.userAccountMapping!=null &&
              this.userAccountMapping.equals(other.getUserAccountMapping())));
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
        if (getApprovalRequired() != null) {
            _hashCode += getApprovalRequired().hashCode();
        }
        if (getConnectedApp() != null) {
            _hashCode += getConnectedApp().hashCode();
        }
        if (getConnectedAppId() != null) {
            _hashCode += getConnectedAppId().hashCode();
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
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getEnabledOperations() != null) {
            _hashCode += getEnabledOperations().hashCode();
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
        if (getLastReconDateTime() != null) {
            _hashCode += getLastReconDateTime().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNamedCredential() != null) {
            _hashCode += getNamedCredential().hashCode();
        }
        if (getNamedCredentialId() != null) {
            _hashCode += getNamedCredentialId().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOnUpdateAttributes() != null) {
            _hashCode += getOnUpdateAttributes().hashCode();
        }
        if (getReconFilter() != null) {
            _hashCode += getReconFilter().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserAccountMapping() != null) {
            _hashCode += getUserAccountMapping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProvisioningConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvisioningConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApprovalRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedApp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedAppId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedAppId"));
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
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EnabledOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lastReconDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastReconDateTime"));
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
        elemField.setFieldName("namedCredential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamedCredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamedCredential"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedCredentialId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamedCredentialId"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onUpdateAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OnUpdateAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReconFilter"));
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
        elemField.setFieldName("userAccountMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAccountMapping"));
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
