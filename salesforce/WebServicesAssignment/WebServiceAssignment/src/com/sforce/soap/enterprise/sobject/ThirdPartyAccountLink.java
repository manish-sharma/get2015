/**
 * ThirdPartyAccountLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ThirdPartyAccountLink  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String handle;

    private java.lang.Boolean isNotSsoUsable;

    private java.lang.String provider;

    private java.lang.String remoteIdentifier;

    private com.sforce.soap.enterprise.sobject.AuthProvider ssoProvider;

    private java.lang.String ssoProviderId;

    private java.lang.String ssoProviderName;

    private java.lang.String thirdPartyAccountLinkKey;

    private com.sforce.soap.enterprise.sobject.User user;

    private java.lang.String userId;

    public ThirdPartyAccountLink() {
    }

    public ThirdPartyAccountLink(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String handle,
           java.lang.Boolean isNotSsoUsable,
           java.lang.String provider,
           java.lang.String remoteIdentifier,
           com.sforce.soap.enterprise.sobject.AuthProvider ssoProvider,
           java.lang.String ssoProviderId,
           java.lang.String ssoProviderName,
           java.lang.String thirdPartyAccountLinkKey,
           com.sforce.soap.enterprise.sobject.User user,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.handle = handle;
        this.isNotSsoUsable = isNotSsoUsable;
        this.provider = provider;
        this.remoteIdentifier = remoteIdentifier;
        this.ssoProvider = ssoProvider;
        this.ssoProviderId = ssoProviderId;
        this.ssoProviderName = ssoProviderName;
        this.thirdPartyAccountLinkKey = thirdPartyAccountLinkKey;
        this.user = user;
        this.userId = userId;
    }


    /**
     * Gets the handle value for this ThirdPartyAccountLink.
     * 
     * @return handle
     */
    public java.lang.String getHandle() {
        return handle;
    }


    /**
     * Sets the handle value for this ThirdPartyAccountLink.
     * 
     * @param handle
     */
    public void setHandle(java.lang.String handle) {
        this.handle = handle;
    }


    /**
     * Gets the isNotSsoUsable value for this ThirdPartyAccountLink.
     * 
     * @return isNotSsoUsable
     */
    public java.lang.Boolean getIsNotSsoUsable() {
        return isNotSsoUsable;
    }


    /**
     * Sets the isNotSsoUsable value for this ThirdPartyAccountLink.
     * 
     * @param isNotSsoUsable
     */
    public void setIsNotSsoUsable(java.lang.Boolean isNotSsoUsable) {
        this.isNotSsoUsable = isNotSsoUsable;
    }


    /**
     * Gets the provider value for this ThirdPartyAccountLink.
     * 
     * @return provider
     */
    public java.lang.String getProvider() {
        return provider;
    }


    /**
     * Sets the provider value for this ThirdPartyAccountLink.
     * 
     * @param provider
     */
    public void setProvider(java.lang.String provider) {
        this.provider = provider;
    }


    /**
     * Gets the remoteIdentifier value for this ThirdPartyAccountLink.
     * 
     * @return remoteIdentifier
     */
    public java.lang.String getRemoteIdentifier() {
        return remoteIdentifier;
    }


    /**
     * Sets the remoteIdentifier value for this ThirdPartyAccountLink.
     * 
     * @param remoteIdentifier
     */
    public void setRemoteIdentifier(java.lang.String remoteIdentifier) {
        this.remoteIdentifier = remoteIdentifier;
    }


    /**
     * Gets the ssoProvider value for this ThirdPartyAccountLink.
     * 
     * @return ssoProvider
     */
    public com.sforce.soap.enterprise.sobject.AuthProvider getSsoProvider() {
        return ssoProvider;
    }


    /**
     * Sets the ssoProvider value for this ThirdPartyAccountLink.
     * 
     * @param ssoProvider
     */
    public void setSsoProvider(com.sforce.soap.enterprise.sobject.AuthProvider ssoProvider) {
        this.ssoProvider = ssoProvider;
    }


    /**
     * Gets the ssoProviderId value for this ThirdPartyAccountLink.
     * 
     * @return ssoProviderId
     */
    public java.lang.String getSsoProviderId() {
        return ssoProviderId;
    }


    /**
     * Sets the ssoProviderId value for this ThirdPartyAccountLink.
     * 
     * @param ssoProviderId
     */
    public void setSsoProviderId(java.lang.String ssoProviderId) {
        this.ssoProviderId = ssoProviderId;
    }


    /**
     * Gets the ssoProviderName value for this ThirdPartyAccountLink.
     * 
     * @return ssoProviderName
     */
    public java.lang.String getSsoProviderName() {
        return ssoProviderName;
    }


    /**
     * Sets the ssoProviderName value for this ThirdPartyAccountLink.
     * 
     * @param ssoProviderName
     */
    public void setSsoProviderName(java.lang.String ssoProviderName) {
        this.ssoProviderName = ssoProviderName;
    }


    /**
     * Gets the thirdPartyAccountLinkKey value for this ThirdPartyAccountLink.
     * 
     * @return thirdPartyAccountLinkKey
     */
    public java.lang.String getThirdPartyAccountLinkKey() {
        return thirdPartyAccountLinkKey;
    }


    /**
     * Sets the thirdPartyAccountLinkKey value for this ThirdPartyAccountLink.
     * 
     * @param thirdPartyAccountLinkKey
     */
    public void setThirdPartyAccountLinkKey(java.lang.String thirdPartyAccountLinkKey) {
        this.thirdPartyAccountLinkKey = thirdPartyAccountLinkKey;
    }


    /**
     * Gets the user value for this ThirdPartyAccountLink.
     * 
     * @return user
     */
    public com.sforce.soap.enterprise.sobject.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this ThirdPartyAccountLink.
     * 
     * @param user
     */
    public void setUser(com.sforce.soap.enterprise.sobject.User user) {
        this.user = user;
    }


    /**
     * Gets the userId value for this ThirdPartyAccountLink.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ThirdPartyAccountLink.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThirdPartyAccountLink)) return false;
        ThirdPartyAccountLink other = (ThirdPartyAccountLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.handle==null && other.getHandle()==null) || 
             (this.handle!=null &&
              this.handle.equals(other.getHandle()))) &&
            ((this.isNotSsoUsable==null && other.getIsNotSsoUsable()==null) || 
             (this.isNotSsoUsable!=null &&
              this.isNotSsoUsable.equals(other.getIsNotSsoUsable()))) &&
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider()))) &&
            ((this.remoteIdentifier==null && other.getRemoteIdentifier()==null) || 
             (this.remoteIdentifier!=null &&
              this.remoteIdentifier.equals(other.getRemoteIdentifier()))) &&
            ((this.ssoProvider==null && other.getSsoProvider()==null) || 
             (this.ssoProvider!=null &&
              this.ssoProvider.equals(other.getSsoProvider()))) &&
            ((this.ssoProviderId==null && other.getSsoProviderId()==null) || 
             (this.ssoProviderId!=null &&
              this.ssoProviderId.equals(other.getSsoProviderId()))) &&
            ((this.ssoProviderName==null && other.getSsoProviderName()==null) || 
             (this.ssoProviderName!=null &&
              this.ssoProviderName.equals(other.getSsoProviderName()))) &&
            ((this.thirdPartyAccountLinkKey==null && other.getThirdPartyAccountLinkKey()==null) || 
             (this.thirdPartyAccountLinkKey!=null &&
              this.thirdPartyAccountLinkKey.equals(other.getThirdPartyAccountLinkKey()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getHandle() != null) {
            _hashCode += getHandle().hashCode();
        }
        if (getIsNotSsoUsable() != null) {
            _hashCode += getIsNotSsoUsable().hashCode();
        }
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        if (getRemoteIdentifier() != null) {
            _hashCode += getRemoteIdentifier().hashCode();
        }
        if (getSsoProvider() != null) {
            _hashCode += getSsoProvider().hashCode();
        }
        if (getSsoProviderId() != null) {
            _hashCode += getSsoProviderId().hashCode();
        }
        if (getSsoProviderName() != null) {
            _hashCode += getSsoProviderName().hashCode();
        }
        if (getThirdPartyAccountLinkKey() != null) {
            _hashCode += getThirdPartyAccountLinkKey().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThirdPartyAccountLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdPartyAccountLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Handle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNotSsoUsable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNotSsoUsable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provider");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Provider"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RemoteIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssoProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SsoProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssoProviderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SsoProviderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssoProviderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SsoProviderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAccountLinkKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdPartyAccountLinkKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserId"));
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
