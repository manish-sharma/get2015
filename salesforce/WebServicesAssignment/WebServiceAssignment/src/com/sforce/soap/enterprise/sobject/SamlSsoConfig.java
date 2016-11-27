/**
 * SamlSsoConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class SamlSsoConfig  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String attributeFormat;

    private java.lang.String attributeName;

    private java.lang.String audience;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String developerName;

    private java.lang.String errorUrl;

    private com.sforce.soap.enterprise.sobject.User executionUser;

    private java.lang.String executionUserId;

    private java.lang.String identityLocation;

    private java.lang.String identityMapping;

    private java.lang.Boolean isDeleted;

    private java.lang.String issuer;

    private java.lang.String language;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String loginUrl;

    private java.lang.String logoutUrl;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private java.lang.Boolean optionsSpInitBinding;

    private java.lang.Boolean optionsUserProvisioning;

    private java.lang.String requestSignatureMethod;

    private com.sforce.soap.enterprise.sobject.ApexClass samlJitHandler;

    private java.lang.String samlJitHandlerId;

    private java.util.Calendar systemModstamp;

    private java.lang.String validationCert;

    private java.lang.String version;

    public SamlSsoConfig() {
    }

    public SamlSsoConfig(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String attributeFormat,
           java.lang.String attributeName,
           java.lang.String audience,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String developerName,
           java.lang.String errorUrl,
           com.sforce.soap.enterprise.sobject.User executionUser,
           java.lang.String executionUserId,
           java.lang.String identityLocation,
           java.lang.String identityMapping,
           java.lang.Boolean isDeleted,
           java.lang.String issuer,
           java.lang.String language,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String loginUrl,
           java.lang.String logoutUrl,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           java.lang.Boolean optionsSpInitBinding,
           java.lang.Boolean optionsUserProvisioning,
           java.lang.String requestSignatureMethod,
           com.sforce.soap.enterprise.sobject.ApexClass samlJitHandler,
           java.lang.String samlJitHandlerId,
           java.util.Calendar systemModstamp,
           java.lang.String validationCert,
           java.lang.String version) {
        super(
            fieldsToNull,
            id);
        this.attributeFormat = attributeFormat;
        this.attributeName = attributeName;
        this.audience = audience;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.developerName = developerName;
        this.errorUrl = errorUrl;
        this.executionUser = executionUser;
        this.executionUserId = executionUserId;
        this.identityLocation = identityLocation;
        this.identityMapping = identityMapping;
        this.isDeleted = isDeleted;
        this.issuer = issuer;
        this.language = language;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.loginUrl = loginUrl;
        this.logoutUrl = logoutUrl;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.optionsSpInitBinding = optionsSpInitBinding;
        this.optionsUserProvisioning = optionsUserProvisioning;
        this.requestSignatureMethod = requestSignatureMethod;
        this.samlJitHandler = samlJitHandler;
        this.samlJitHandlerId = samlJitHandlerId;
        this.systemModstamp = systemModstamp;
        this.validationCert = validationCert;
        this.version = version;
    }


    /**
     * Gets the attributeFormat value for this SamlSsoConfig.
     * 
     * @return attributeFormat
     */
    public java.lang.String getAttributeFormat() {
        return attributeFormat;
    }


    /**
     * Sets the attributeFormat value for this SamlSsoConfig.
     * 
     * @param attributeFormat
     */
    public void setAttributeFormat(java.lang.String attributeFormat) {
        this.attributeFormat = attributeFormat;
    }


    /**
     * Gets the attributeName value for this SamlSsoConfig.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this SamlSsoConfig.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the audience value for this SamlSsoConfig.
     * 
     * @return audience
     */
    public java.lang.String getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this SamlSsoConfig.
     * 
     * @param audience
     */
    public void setAudience(java.lang.String audience) {
        this.audience = audience;
    }


    /**
     * Gets the createdBy value for this SamlSsoConfig.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this SamlSsoConfig.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this SamlSsoConfig.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this SamlSsoConfig.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this SamlSsoConfig.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SamlSsoConfig.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the developerName value for this SamlSsoConfig.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this SamlSsoConfig.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the errorUrl value for this SamlSsoConfig.
     * 
     * @return errorUrl
     */
    public java.lang.String getErrorUrl() {
        return errorUrl;
    }


    /**
     * Sets the errorUrl value for this SamlSsoConfig.
     * 
     * @param errorUrl
     */
    public void setErrorUrl(java.lang.String errorUrl) {
        this.errorUrl = errorUrl;
    }


    /**
     * Gets the executionUser value for this SamlSsoConfig.
     * 
     * @return executionUser
     */
    public com.sforce.soap.enterprise.sobject.User getExecutionUser() {
        return executionUser;
    }


    /**
     * Sets the executionUser value for this SamlSsoConfig.
     * 
     * @param executionUser
     */
    public void setExecutionUser(com.sforce.soap.enterprise.sobject.User executionUser) {
        this.executionUser = executionUser;
    }


    /**
     * Gets the executionUserId value for this SamlSsoConfig.
     * 
     * @return executionUserId
     */
    public java.lang.String getExecutionUserId() {
        return executionUserId;
    }


    /**
     * Sets the executionUserId value for this SamlSsoConfig.
     * 
     * @param executionUserId
     */
    public void setExecutionUserId(java.lang.String executionUserId) {
        this.executionUserId = executionUserId;
    }


    /**
     * Gets the identityLocation value for this SamlSsoConfig.
     * 
     * @return identityLocation
     */
    public java.lang.String getIdentityLocation() {
        return identityLocation;
    }


    /**
     * Sets the identityLocation value for this SamlSsoConfig.
     * 
     * @param identityLocation
     */
    public void setIdentityLocation(java.lang.String identityLocation) {
        this.identityLocation = identityLocation;
    }


    /**
     * Gets the identityMapping value for this SamlSsoConfig.
     * 
     * @return identityMapping
     */
    public java.lang.String getIdentityMapping() {
        return identityMapping;
    }


    /**
     * Sets the identityMapping value for this SamlSsoConfig.
     * 
     * @param identityMapping
     */
    public void setIdentityMapping(java.lang.String identityMapping) {
        this.identityMapping = identityMapping;
    }


    /**
     * Gets the isDeleted value for this SamlSsoConfig.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this SamlSsoConfig.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the issuer value for this SamlSsoConfig.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this SamlSsoConfig.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the language value for this SamlSsoConfig.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this SamlSsoConfig.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedBy value for this SamlSsoConfig.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this SamlSsoConfig.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this SamlSsoConfig.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this SamlSsoConfig.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this SamlSsoConfig.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SamlSsoConfig.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the loginUrl value for this SamlSsoConfig.
     * 
     * @return loginUrl
     */
    public java.lang.String getLoginUrl() {
        return loginUrl;
    }


    /**
     * Sets the loginUrl value for this SamlSsoConfig.
     * 
     * @param loginUrl
     */
    public void setLoginUrl(java.lang.String loginUrl) {
        this.loginUrl = loginUrl;
    }


    /**
     * Gets the logoutUrl value for this SamlSsoConfig.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this SamlSsoConfig.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the masterLabel value for this SamlSsoConfig.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this SamlSsoConfig.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this SamlSsoConfig.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this SamlSsoConfig.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the optionsSpInitBinding value for this SamlSsoConfig.
     * 
     * @return optionsSpInitBinding
     */
    public java.lang.Boolean getOptionsSpInitBinding() {
        return optionsSpInitBinding;
    }


    /**
     * Sets the optionsSpInitBinding value for this SamlSsoConfig.
     * 
     * @param optionsSpInitBinding
     */
    public void setOptionsSpInitBinding(java.lang.Boolean optionsSpInitBinding) {
        this.optionsSpInitBinding = optionsSpInitBinding;
    }


    /**
     * Gets the optionsUserProvisioning value for this SamlSsoConfig.
     * 
     * @return optionsUserProvisioning
     */
    public java.lang.Boolean getOptionsUserProvisioning() {
        return optionsUserProvisioning;
    }


    /**
     * Sets the optionsUserProvisioning value for this SamlSsoConfig.
     * 
     * @param optionsUserProvisioning
     */
    public void setOptionsUserProvisioning(java.lang.Boolean optionsUserProvisioning) {
        this.optionsUserProvisioning = optionsUserProvisioning;
    }


    /**
     * Gets the requestSignatureMethod value for this SamlSsoConfig.
     * 
     * @return requestSignatureMethod
     */
    public java.lang.String getRequestSignatureMethod() {
        return requestSignatureMethod;
    }


    /**
     * Sets the requestSignatureMethod value for this SamlSsoConfig.
     * 
     * @param requestSignatureMethod
     */
    public void setRequestSignatureMethod(java.lang.String requestSignatureMethod) {
        this.requestSignatureMethod = requestSignatureMethod;
    }


    /**
     * Gets the samlJitHandler value for this SamlSsoConfig.
     * 
     * @return samlJitHandler
     */
    public com.sforce.soap.enterprise.sobject.ApexClass getSamlJitHandler() {
        return samlJitHandler;
    }


    /**
     * Sets the samlJitHandler value for this SamlSsoConfig.
     * 
     * @param samlJitHandler
     */
    public void setSamlJitHandler(com.sforce.soap.enterprise.sobject.ApexClass samlJitHandler) {
        this.samlJitHandler = samlJitHandler;
    }


    /**
     * Gets the samlJitHandlerId value for this SamlSsoConfig.
     * 
     * @return samlJitHandlerId
     */
    public java.lang.String getSamlJitHandlerId() {
        return samlJitHandlerId;
    }


    /**
     * Sets the samlJitHandlerId value for this SamlSsoConfig.
     * 
     * @param samlJitHandlerId
     */
    public void setSamlJitHandlerId(java.lang.String samlJitHandlerId) {
        this.samlJitHandlerId = samlJitHandlerId;
    }


    /**
     * Gets the systemModstamp value for this SamlSsoConfig.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this SamlSsoConfig.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the validationCert value for this SamlSsoConfig.
     * 
     * @return validationCert
     */
    public java.lang.String getValidationCert() {
        return validationCert;
    }


    /**
     * Sets the validationCert value for this SamlSsoConfig.
     * 
     * @param validationCert
     */
    public void setValidationCert(java.lang.String validationCert) {
        this.validationCert = validationCert;
    }


    /**
     * Gets the version value for this SamlSsoConfig.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SamlSsoConfig.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SamlSsoConfig)) return false;
        SamlSsoConfig other = (SamlSsoConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attributeFormat==null && other.getAttributeFormat()==null) || 
             (this.attributeFormat!=null &&
              this.attributeFormat.equals(other.getAttributeFormat()))) &&
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              this.audience.equals(other.getAudience()))) &&
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
            ((this.errorUrl==null && other.getErrorUrl()==null) || 
             (this.errorUrl!=null &&
              this.errorUrl.equals(other.getErrorUrl()))) &&
            ((this.executionUser==null && other.getExecutionUser()==null) || 
             (this.executionUser!=null &&
              this.executionUser.equals(other.getExecutionUser()))) &&
            ((this.executionUserId==null && other.getExecutionUserId()==null) || 
             (this.executionUserId!=null &&
              this.executionUserId.equals(other.getExecutionUserId()))) &&
            ((this.identityLocation==null && other.getIdentityLocation()==null) || 
             (this.identityLocation!=null &&
              this.identityLocation.equals(other.getIdentityLocation()))) &&
            ((this.identityMapping==null && other.getIdentityMapping()==null) || 
             (this.identityMapping!=null &&
              this.identityMapping.equals(other.getIdentityMapping()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
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
            ((this.loginUrl==null && other.getLoginUrl()==null) || 
             (this.loginUrl!=null &&
              this.loginUrl.equals(other.getLoginUrl()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.optionsSpInitBinding==null && other.getOptionsSpInitBinding()==null) || 
             (this.optionsSpInitBinding!=null &&
              this.optionsSpInitBinding.equals(other.getOptionsSpInitBinding()))) &&
            ((this.optionsUserProvisioning==null && other.getOptionsUserProvisioning()==null) || 
             (this.optionsUserProvisioning!=null &&
              this.optionsUserProvisioning.equals(other.getOptionsUserProvisioning()))) &&
            ((this.requestSignatureMethod==null && other.getRequestSignatureMethod()==null) || 
             (this.requestSignatureMethod!=null &&
              this.requestSignatureMethod.equals(other.getRequestSignatureMethod()))) &&
            ((this.samlJitHandler==null && other.getSamlJitHandler()==null) || 
             (this.samlJitHandler!=null &&
              this.samlJitHandler.equals(other.getSamlJitHandler()))) &&
            ((this.samlJitHandlerId==null && other.getSamlJitHandlerId()==null) || 
             (this.samlJitHandlerId!=null &&
              this.samlJitHandlerId.equals(other.getSamlJitHandlerId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.validationCert==null && other.getValidationCert()==null) || 
             (this.validationCert!=null &&
              this.validationCert.equals(other.getValidationCert()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getAttributeFormat() != null) {
            _hashCode += getAttributeFormat().hashCode();
        }
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getAudience() != null) {
            _hashCode += getAudience().hashCode();
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
        if (getErrorUrl() != null) {
            _hashCode += getErrorUrl().hashCode();
        }
        if (getExecutionUser() != null) {
            _hashCode += getExecutionUser().hashCode();
        }
        if (getExecutionUserId() != null) {
            _hashCode += getExecutionUserId().hashCode();
        }
        if (getIdentityLocation() != null) {
            _hashCode += getIdentityLocation().hashCode();
        }
        if (getIdentityMapping() != null) {
            _hashCode += getIdentityMapping().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
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
        if (getLoginUrl() != null) {
            _hashCode += getLoginUrl().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getOptionsSpInitBinding() != null) {
            _hashCode += getOptionsSpInitBinding().hashCode();
        }
        if (getOptionsUserProvisioning() != null) {
            _hashCode += getOptionsUserProvisioning().hashCode();
        }
        if (getRequestSignatureMethod() != null) {
            _hashCode += getRequestSignatureMethod().hashCode();
        }
        if (getSamlJitHandler() != null) {
            _hashCode += getSamlJitHandler().hashCode();
        }
        if (getSamlJitHandlerId() != null) {
            _hashCode += getSamlJitHandlerId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getValidationCert() != null) {
            _hashCode += getValidationCert().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SamlSsoConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SamlSsoConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttributeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Audience"));
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
        elemField.setFieldName("errorUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ErrorUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExecutionUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExecutionUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdentityLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdentityMapping"));
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
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("loginUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LogoutUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("optionsSpInitBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSpInitBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsUserProvisioning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsUserProvisioning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSignatureMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RequestSignatureMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlJitHandler");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SamlJitHandler"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlJitHandlerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SamlJitHandlerId"));
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
        elemField.setFieldName("validationCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ValidationCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Version"));
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
