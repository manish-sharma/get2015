/**
 * AuthProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AuthProvider  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String authorizeUrl;

    private java.lang.String consumerKey;

    private java.lang.String consumerSecret;

    private java.util.Calendar createdDate;

    private java.lang.String defaultScopes;

    private java.lang.String developerName;

    private java.lang.String errorUrl;

    private java.lang.String executionUserId;

    private java.lang.String friendlyName;

    private java.lang.String iconUrl;

    private java.lang.String idTokenIssuer;

    private java.lang.String logoutUrl;

    private java.lang.Boolean optionsIncludeOrgIdInId;

    private java.lang.Boolean optionsSendAccessTokenInHeader;

    private java.lang.Boolean optionsSendClientCredentialsInHeader;

    private java.lang.String providerType;

    private java.lang.String registrationHandlerId;

    private java.lang.String tokenUrl;

    private java.lang.String userInfoUrl;

    public AuthProvider() {
    }

    public AuthProvider(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String authorizeUrl,
           java.lang.String consumerKey,
           java.lang.String consumerSecret,
           java.util.Calendar createdDate,
           java.lang.String defaultScopes,
           java.lang.String developerName,
           java.lang.String errorUrl,
           java.lang.String executionUserId,
           java.lang.String friendlyName,
           java.lang.String iconUrl,
           java.lang.String idTokenIssuer,
           java.lang.String logoutUrl,
           java.lang.Boolean optionsIncludeOrgIdInId,
           java.lang.Boolean optionsSendAccessTokenInHeader,
           java.lang.Boolean optionsSendClientCredentialsInHeader,
           java.lang.String providerType,
           java.lang.String registrationHandlerId,
           java.lang.String tokenUrl,
           java.lang.String userInfoUrl) {
        super(
            fieldsToNull,
            id);
        this.authorizeUrl = authorizeUrl;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.createdDate = createdDate;
        this.defaultScopes = defaultScopes;
        this.developerName = developerName;
        this.errorUrl = errorUrl;
        this.executionUserId = executionUserId;
        this.friendlyName = friendlyName;
        this.iconUrl = iconUrl;
        this.idTokenIssuer = idTokenIssuer;
        this.logoutUrl = logoutUrl;
        this.optionsIncludeOrgIdInId = optionsIncludeOrgIdInId;
        this.optionsSendAccessTokenInHeader = optionsSendAccessTokenInHeader;
        this.optionsSendClientCredentialsInHeader = optionsSendClientCredentialsInHeader;
        this.providerType = providerType;
        this.registrationHandlerId = registrationHandlerId;
        this.tokenUrl = tokenUrl;
        this.userInfoUrl = userInfoUrl;
    }


    /**
     * Gets the authorizeUrl value for this AuthProvider.
     * 
     * @return authorizeUrl
     */
    public java.lang.String getAuthorizeUrl() {
        return authorizeUrl;
    }


    /**
     * Sets the authorizeUrl value for this AuthProvider.
     * 
     * @param authorizeUrl
     */
    public void setAuthorizeUrl(java.lang.String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }


    /**
     * Gets the consumerKey value for this AuthProvider.
     * 
     * @return consumerKey
     */
    public java.lang.String getConsumerKey() {
        return consumerKey;
    }


    /**
     * Sets the consumerKey value for this AuthProvider.
     * 
     * @param consumerKey
     */
    public void setConsumerKey(java.lang.String consumerKey) {
        this.consumerKey = consumerKey;
    }


    /**
     * Gets the consumerSecret value for this AuthProvider.
     * 
     * @return consumerSecret
     */
    public java.lang.String getConsumerSecret() {
        return consumerSecret;
    }


    /**
     * Sets the consumerSecret value for this AuthProvider.
     * 
     * @param consumerSecret
     */
    public void setConsumerSecret(java.lang.String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


    /**
     * Gets the createdDate value for this AuthProvider.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AuthProvider.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultScopes value for this AuthProvider.
     * 
     * @return defaultScopes
     */
    public java.lang.String getDefaultScopes() {
        return defaultScopes;
    }


    /**
     * Sets the defaultScopes value for this AuthProvider.
     * 
     * @param defaultScopes
     */
    public void setDefaultScopes(java.lang.String defaultScopes) {
        this.defaultScopes = defaultScopes;
    }


    /**
     * Gets the developerName value for this AuthProvider.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this AuthProvider.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the errorUrl value for this AuthProvider.
     * 
     * @return errorUrl
     */
    public java.lang.String getErrorUrl() {
        return errorUrl;
    }


    /**
     * Sets the errorUrl value for this AuthProvider.
     * 
     * @param errorUrl
     */
    public void setErrorUrl(java.lang.String errorUrl) {
        this.errorUrl = errorUrl;
    }


    /**
     * Gets the executionUserId value for this AuthProvider.
     * 
     * @return executionUserId
     */
    public java.lang.String getExecutionUserId() {
        return executionUserId;
    }


    /**
     * Sets the executionUserId value for this AuthProvider.
     * 
     * @param executionUserId
     */
    public void setExecutionUserId(java.lang.String executionUserId) {
        this.executionUserId = executionUserId;
    }


    /**
     * Gets the friendlyName value for this AuthProvider.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this AuthProvider.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the iconUrl value for this AuthProvider.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this AuthProvider.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the idTokenIssuer value for this AuthProvider.
     * 
     * @return idTokenIssuer
     */
    public java.lang.String getIdTokenIssuer() {
        return idTokenIssuer;
    }


    /**
     * Sets the idTokenIssuer value for this AuthProvider.
     * 
     * @param idTokenIssuer
     */
    public void setIdTokenIssuer(java.lang.String idTokenIssuer) {
        this.idTokenIssuer = idTokenIssuer;
    }


    /**
     * Gets the logoutUrl value for this AuthProvider.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this AuthProvider.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the optionsIncludeOrgIdInId value for this AuthProvider.
     * 
     * @return optionsIncludeOrgIdInId
     */
    public java.lang.Boolean getOptionsIncludeOrgIdInId() {
        return optionsIncludeOrgIdInId;
    }


    /**
     * Sets the optionsIncludeOrgIdInId value for this AuthProvider.
     * 
     * @param optionsIncludeOrgIdInId
     */
    public void setOptionsIncludeOrgIdInId(java.lang.Boolean optionsIncludeOrgIdInId) {
        this.optionsIncludeOrgIdInId = optionsIncludeOrgIdInId;
    }


    /**
     * Gets the optionsSendAccessTokenInHeader value for this AuthProvider.
     * 
     * @return optionsSendAccessTokenInHeader
     */
    public java.lang.Boolean getOptionsSendAccessTokenInHeader() {
        return optionsSendAccessTokenInHeader;
    }


    /**
     * Sets the optionsSendAccessTokenInHeader value for this AuthProvider.
     * 
     * @param optionsSendAccessTokenInHeader
     */
    public void setOptionsSendAccessTokenInHeader(java.lang.Boolean optionsSendAccessTokenInHeader) {
        this.optionsSendAccessTokenInHeader = optionsSendAccessTokenInHeader;
    }


    /**
     * Gets the optionsSendClientCredentialsInHeader value for this AuthProvider.
     * 
     * @return optionsSendClientCredentialsInHeader
     */
    public java.lang.Boolean getOptionsSendClientCredentialsInHeader() {
        return optionsSendClientCredentialsInHeader;
    }


    /**
     * Sets the optionsSendClientCredentialsInHeader value for this AuthProvider.
     * 
     * @param optionsSendClientCredentialsInHeader
     */
    public void setOptionsSendClientCredentialsInHeader(java.lang.Boolean optionsSendClientCredentialsInHeader) {
        this.optionsSendClientCredentialsInHeader = optionsSendClientCredentialsInHeader;
    }


    /**
     * Gets the providerType value for this AuthProvider.
     * 
     * @return providerType
     */
    public java.lang.String getProviderType() {
        return providerType;
    }


    /**
     * Sets the providerType value for this AuthProvider.
     * 
     * @param providerType
     */
    public void setProviderType(java.lang.String providerType) {
        this.providerType = providerType;
    }


    /**
     * Gets the registrationHandlerId value for this AuthProvider.
     * 
     * @return registrationHandlerId
     */
    public java.lang.String getRegistrationHandlerId() {
        return registrationHandlerId;
    }


    /**
     * Sets the registrationHandlerId value for this AuthProvider.
     * 
     * @param registrationHandlerId
     */
    public void setRegistrationHandlerId(java.lang.String registrationHandlerId) {
        this.registrationHandlerId = registrationHandlerId;
    }


    /**
     * Gets the tokenUrl value for this AuthProvider.
     * 
     * @return tokenUrl
     */
    public java.lang.String getTokenUrl() {
        return tokenUrl;
    }


    /**
     * Sets the tokenUrl value for this AuthProvider.
     * 
     * @param tokenUrl
     */
    public void setTokenUrl(java.lang.String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }


    /**
     * Gets the userInfoUrl value for this AuthProvider.
     * 
     * @return userInfoUrl
     */
    public java.lang.String getUserInfoUrl() {
        return userInfoUrl;
    }


    /**
     * Sets the userInfoUrl value for this AuthProvider.
     * 
     * @param userInfoUrl
     */
    public void setUserInfoUrl(java.lang.String userInfoUrl) {
        this.userInfoUrl = userInfoUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthProvider)) return false;
        AuthProvider other = (AuthProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizeUrl==null && other.getAuthorizeUrl()==null) || 
             (this.authorizeUrl!=null &&
              this.authorizeUrl.equals(other.getAuthorizeUrl()))) &&
            ((this.consumerKey==null && other.getConsumerKey()==null) || 
             (this.consumerKey!=null &&
              this.consumerKey.equals(other.getConsumerKey()))) &&
            ((this.consumerSecret==null && other.getConsumerSecret()==null) || 
             (this.consumerSecret!=null &&
              this.consumerSecret.equals(other.getConsumerSecret()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultScopes==null && other.getDefaultScopes()==null) || 
             (this.defaultScopes!=null &&
              this.defaultScopes.equals(other.getDefaultScopes()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.errorUrl==null && other.getErrorUrl()==null) || 
             (this.errorUrl!=null &&
              this.errorUrl.equals(other.getErrorUrl()))) &&
            ((this.executionUserId==null && other.getExecutionUserId()==null) || 
             (this.executionUserId!=null &&
              this.executionUserId.equals(other.getExecutionUserId()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.idTokenIssuer==null && other.getIdTokenIssuer()==null) || 
             (this.idTokenIssuer!=null &&
              this.idTokenIssuer.equals(other.getIdTokenIssuer()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.optionsIncludeOrgIdInId==null && other.getOptionsIncludeOrgIdInId()==null) || 
             (this.optionsIncludeOrgIdInId!=null &&
              this.optionsIncludeOrgIdInId.equals(other.getOptionsIncludeOrgIdInId()))) &&
            ((this.optionsSendAccessTokenInHeader==null && other.getOptionsSendAccessTokenInHeader()==null) || 
             (this.optionsSendAccessTokenInHeader!=null &&
              this.optionsSendAccessTokenInHeader.equals(other.getOptionsSendAccessTokenInHeader()))) &&
            ((this.optionsSendClientCredentialsInHeader==null && other.getOptionsSendClientCredentialsInHeader()==null) || 
             (this.optionsSendClientCredentialsInHeader!=null &&
              this.optionsSendClientCredentialsInHeader.equals(other.getOptionsSendClientCredentialsInHeader()))) &&
            ((this.providerType==null && other.getProviderType()==null) || 
             (this.providerType!=null &&
              this.providerType.equals(other.getProviderType()))) &&
            ((this.registrationHandlerId==null && other.getRegistrationHandlerId()==null) || 
             (this.registrationHandlerId!=null &&
              this.registrationHandlerId.equals(other.getRegistrationHandlerId()))) &&
            ((this.tokenUrl==null && other.getTokenUrl()==null) || 
             (this.tokenUrl!=null &&
              this.tokenUrl.equals(other.getTokenUrl()))) &&
            ((this.userInfoUrl==null && other.getUserInfoUrl()==null) || 
             (this.userInfoUrl!=null &&
              this.userInfoUrl.equals(other.getUserInfoUrl())));
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
        if (getAuthorizeUrl() != null) {
            _hashCode += getAuthorizeUrl().hashCode();
        }
        if (getConsumerKey() != null) {
            _hashCode += getConsumerKey().hashCode();
        }
        if (getConsumerSecret() != null) {
            _hashCode += getConsumerSecret().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDefaultScopes() != null) {
            _hashCode += getDefaultScopes().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getErrorUrl() != null) {
            _hashCode += getErrorUrl().hashCode();
        }
        if (getExecutionUserId() != null) {
            _hashCode += getExecutionUserId().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getIdTokenIssuer() != null) {
            _hashCode += getIdTokenIssuer().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getOptionsIncludeOrgIdInId() != null) {
            _hashCode += getOptionsIncludeOrgIdInId().hashCode();
        }
        if (getOptionsSendAccessTokenInHeader() != null) {
            _hashCode += getOptionsSendAccessTokenInHeader().hashCode();
        }
        if (getOptionsSendClientCredentialsInHeader() != null) {
            _hashCode += getOptionsSendClientCredentialsInHeader().hashCode();
        }
        if (getProviderType() != null) {
            _hashCode += getProviderType().hashCode();
        }
        if (getRegistrationHandlerId() != null) {
            _hashCode += getRegistrationHandlerId().hashCode();
        }
        if (getTokenUrl() != null) {
            _hashCode += getTokenUrl().hashCode();
        }
        if (getUserInfoUrl() != null) {
            _hashCode += getUserInfoUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizeUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthorizeUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConsumerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConsumerSecret"));
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
        elemField.setFieldName("defaultScopes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultScopes"));
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
        elemField.setFieldName("errorUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ErrorUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FriendlyName"));
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
        elemField.setFieldName("idTokenIssuer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdTokenIssuer"));
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
        elemField.setFieldName("optionsIncludeOrgIdInId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsIncludeOrgIdInId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsSendAccessTokenInHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSendAccessTokenInHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsSendClientCredentialsInHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSendClientCredentialsInHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProviderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationHandlerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegistrationHandlerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TokenUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserInfoUrl"));
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
