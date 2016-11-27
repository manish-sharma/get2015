/**
 * ExternalDataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ExternalDataSource  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String apiKey;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String customConfiguration;

    private java.lang.String developerName;

    private java.lang.String endpoint;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isWritable;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.StaticResource largeIcon;

    private java.lang.String largeIconId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private java.lang.String principalType;

    private java.lang.String repository;

    private com.sforce.soap.enterprise.QueryResult setupEntityAccessItems;

    private com.sforce.soap.enterprise.sobject.StaticResource smallIcon;

    private java.lang.String smallIconId;

    private java.util.Calendar systemModstamp;

    private java.lang.String type;

    private com.sforce.soap.enterprise.QueryResult userAuths;

    public ExternalDataSource() {
    }

    public ExternalDataSource(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String apiKey,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String customConfiguration,
           java.lang.String developerName,
           java.lang.String endpoint,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isWritable,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.StaticResource largeIcon,
           java.lang.String largeIconId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           java.lang.String principalType,
           java.lang.String repository,
           com.sforce.soap.enterprise.QueryResult setupEntityAccessItems,
           com.sforce.soap.enterprise.sobject.StaticResource smallIcon,
           java.lang.String smallIconId,
           java.util.Calendar systemModstamp,
           java.lang.String type,
           com.sforce.soap.enterprise.QueryResult userAuths) {
        super(
            fieldsToNull,
            id);
        this.apiKey = apiKey;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customConfiguration = customConfiguration;
        this.developerName = developerName;
        this.endpoint = endpoint;
        this.isDeleted = isDeleted;
        this.isWritable = isWritable;
        this.language = language;
        this.largeIcon = largeIcon;
        this.largeIconId = largeIconId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.principalType = principalType;
        this.repository = repository;
        this.setupEntityAccessItems = setupEntityAccessItems;
        this.smallIcon = smallIcon;
        this.smallIconId = smallIconId;
        this.systemModstamp = systemModstamp;
        this.type = type;
        this.userAuths = userAuths;
    }


    /**
     * Gets the apiKey value for this ExternalDataSource.
     * 
     * @return apiKey
     */
    public java.lang.String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this ExternalDataSource.
     * 
     * @param apiKey
     */
    public void setApiKey(java.lang.String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the createdBy value for this ExternalDataSource.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ExternalDataSource.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ExternalDataSource.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ExternalDataSource.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ExternalDataSource.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ExternalDataSource.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customConfiguration value for this ExternalDataSource.
     * 
     * @return customConfiguration
     */
    public java.lang.String getCustomConfiguration() {
        return customConfiguration;
    }


    /**
     * Sets the customConfiguration value for this ExternalDataSource.
     * 
     * @param customConfiguration
     */
    public void setCustomConfiguration(java.lang.String customConfiguration) {
        this.customConfiguration = customConfiguration;
    }


    /**
     * Gets the developerName value for this ExternalDataSource.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this ExternalDataSource.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the endpoint value for this ExternalDataSource.
     * 
     * @return endpoint
     */
    public java.lang.String getEndpoint() {
        return endpoint;
    }


    /**
     * Sets the endpoint value for this ExternalDataSource.
     * 
     * @param endpoint
     */
    public void setEndpoint(java.lang.String endpoint) {
        this.endpoint = endpoint;
    }


    /**
     * Gets the isDeleted value for this ExternalDataSource.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ExternalDataSource.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isWritable value for this ExternalDataSource.
     * 
     * @return isWritable
     */
    public java.lang.Boolean getIsWritable() {
        return isWritable;
    }


    /**
     * Sets the isWritable value for this ExternalDataSource.
     * 
     * @param isWritable
     */
    public void setIsWritable(java.lang.Boolean isWritable) {
        this.isWritable = isWritable;
    }


    /**
     * Gets the language value for this ExternalDataSource.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ExternalDataSource.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the largeIcon value for this ExternalDataSource.
     * 
     * @return largeIcon
     */
    public com.sforce.soap.enterprise.sobject.StaticResource getLargeIcon() {
        return largeIcon;
    }


    /**
     * Sets the largeIcon value for this ExternalDataSource.
     * 
     * @param largeIcon
     */
    public void setLargeIcon(com.sforce.soap.enterprise.sobject.StaticResource largeIcon) {
        this.largeIcon = largeIcon;
    }


    /**
     * Gets the largeIconId value for this ExternalDataSource.
     * 
     * @return largeIconId
     */
    public java.lang.String getLargeIconId() {
        return largeIconId;
    }


    /**
     * Sets the largeIconId value for this ExternalDataSource.
     * 
     * @param largeIconId
     */
    public void setLargeIconId(java.lang.String largeIconId) {
        this.largeIconId = largeIconId;
    }


    /**
     * Gets the lastModifiedBy value for this ExternalDataSource.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ExternalDataSource.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ExternalDataSource.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ExternalDataSource.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ExternalDataSource.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ExternalDataSource.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the masterLabel value for this ExternalDataSource.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this ExternalDataSource.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this ExternalDataSource.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this ExternalDataSource.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the principalType value for this ExternalDataSource.
     * 
     * @return principalType
     */
    public java.lang.String getPrincipalType() {
        return principalType;
    }


    /**
     * Sets the principalType value for this ExternalDataSource.
     * 
     * @param principalType
     */
    public void setPrincipalType(java.lang.String principalType) {
        this.principalType = principalType;
    }


    /**
     * Gets the repository value for this ExternalDataSource.
     * 
     * @return repository
     */
    public java.lang.String getRepository() {
        return repository;
    }


    /**
     * Sets the repository value for this ExternalDataSource.
     * 
     * @param repository
     */
    public void setRepository(java.lang.String repository) {
        this.repository = repository;
    }


    /**
     * Gets the setupEntityAccessItems value for this ExternalDataSource.
     * 
     * @return setupEntityAccessItems
     */
    public com.sforce.soap.enterprise.QueryResult getSetupEntityAccessItems() {
        return setupEntityAccessItems;
    }


    /**
     * Sets the setupEntityAccessItems value for this ExternalDataSource.
     * 
     * @param setupEntityAccessItems
     */
    public void setSetupEntityAccessItems(com.sforce.soap.enterprise.QueryResult setupEntityAccessItems) {
        this.setupEntityAccessItems = setupEntityAccessItems;
    }


    /**
     * Gets the smallIcon value for this ExternalDataSource.
     * 
     * @return smallIcon
     */
    public com.sforce.soap.enterprise.sobject.StaticResource getSmallIcon() {
        return smallIcon;
    }


    /**
     * Sets the smallIcon value for this ExternalDataSource.
     * 
     * @param smallIcon
     */
    public void setSmallIcon(com.sforce.soap.enterprise.sobject.StaticResource smallIcon) {
        this.smallIcon = smallIcon;
    }


    /**
     * Gets the smallIconId value for this ExternalDataSource.
     * 
     * @return smallIconId
     */
    public java.lang.String getSmallIconId() {
        return smallIconId;
    }


    /**
     * Sets the smallIconId value for this ExternalDataSource.
     * 
     * @param smallIconId
     */
    public void setSmallIconId(java.lang.String smallIconId) {
        this.smallIconId = smallIconId;
    }


    /**
     * Gets the systemModstamp value for this ExternalDataSource.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ExternalDataSource.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the type value for this ExternalDataSource.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ExternalDataSource.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userAuths value for this ExternalDataSource.
     * 
     * @return userAuths
     */
    public com.sforce.soap.enterprise.QueryResult getUserAuths() {
        return userAuths;
    }


    /**
     * Sets the userAuths value for this ExternalDataSource.
     * 
     * @param userAuths
     */
    public void setUserAuths(com.sforce.soap.enterprise.QueryResult userAuths) {
        this.userAuths = userAuths;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalDataSource)) return false;
        ExternalDataSource other = (ExternalDataSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apiKey==null && other.getApiKey()==null) || 
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customConfiguration==null && other.getCustomConfiguration()==null) || 
             (this.customConfiguration!=null &&
              this.customConfiguration.equals(other.getCustomConfiguration()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.endpoint==null && other.getEndpoint()==null) || 
             (this.endpoint!=null &&
              this.endpoint.equals(other.getEndpoint()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isWritable==null && other.getIsWritable()==null) || 
             (this.isWritable!=null &&
              this.isWritable.equals(other.getIsWritable()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.largeIcon==null && other.getLargeIcon()==null) || 
             (this.largeIcon!=null &&
              this.largeIcon.equals(other.getLargeIcon()))) &&
            ((this.largeIconId==null && other.getLargeIconId()==null) || 
             (this.largeIconId!=null &&
              this.largeIconId.equals(other.getLargeIconId()))) &&
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
            ((this.principalType==null && other.getPrincipalType()==null) || 
             (this.principalType!=null &&
              this.principalType.equals(other.getPrincipalType()))) &&
            ((this.repository==null && other.getRepository()==null) || 
             (this.repository!=null &&
              this.repository.equals(other.getRepository()))) &&
            ((this.setupEntityAccessItems==null && other.getSetupEntityAccessItems()==null) || 
             (this.setupEntityAccessItems!=null &&
              this.setupEntityAccessItems.equals(other.getSetupEntityAccessItems()))) &&
            ((this.smallIcon==null && other.getSmallIcon()==null) || 
             (this.smallIcon!=null &&
              this.smallIcon.equals(other.getSmallIcon()))) &&
            ((this.smallIconId==null && other.getSmallIconId()==null) || 
             (this.smallIconId!=null &&
              this.smallIconId.equals(other.getSmallIconId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userAuths==null && other.getUserAuths()==null) || 
             (this.userAuths!=null &&
              this.userAuths.equals(other.getUserAuths())));
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
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
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
        if (getCustomConfiguration() != null) {
            _hashCode += getCustomConfiguration().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getEndpoint() != null) {
            _hashCode += getEndpoint().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsWritable() != null) {
            _hashCode += getIsWritable().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLargeIcon() != null) {
            _hashCode += getLargeIcon().hashCode();
        }
        if (getLargeIconId() != null) {
            _hashCode += getLargeIconId().hashCode();
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
        if (getPrincipalType() != null) {
            _hashCode += getPrincipalType().hashCode();
        }
        if (getRepository() != null) {
            _hashCode += getRepository().hashCode();
        }
        if (getSetupEntityAccessItems() != null) {
            _hashCode += getSetupEntityAccessItems().hashCode();
        }
        if (getSmallIcon() != null) {
            _hashCode += getSmallIcon().hashCode();
        }
        if (getSmallIconId() != null) {
            _hashCode += getSmallIconId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserAuths() != null) {
            _hashCode += getUserAuths().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalDataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalDataSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApiKey"));
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
        elemField.setFieldName("customConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomConfiguration"));
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
        elemField.setFieldName("endpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Endpoint"));
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
        elemField.setFieldName("isWritable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWritable"));
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
        elemField.setFieldName("largeIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LargeIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StaticResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeIconId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LargeIconId"));
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
        elemField.setFieldName("principalType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrincipalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repository");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Repository"));
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
        elemField.setFieldName("smallIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StaticResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallIconId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallIconId"));
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
        elemField.setFieldName("userAuths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAuths"));
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
