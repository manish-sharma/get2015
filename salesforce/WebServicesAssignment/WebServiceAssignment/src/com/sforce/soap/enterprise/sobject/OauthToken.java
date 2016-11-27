/**
 * OauthToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class OauthToken  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String accessToken;

    private com.sforce.soap.enterprise.sobject.AppMenuItem appMenuItem;

    private java.lang.String appMenuItemId;

    private java.lang.String appName;

    private java.util.Calendar createdDate;

    private java.lang.String deleteToken;

    private java.util.Calendar lastUsedDate;

    private java.lang.String requestToken;

    private java.lang.Integer useCount;

    private com.sforce.soap.enterprise.sobject.User user;

    private java.lang.String userId;

    public OauthToken() {
    }

    public OauthToken(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accessToken,
           com.sforce.soap.enterprise.sobject.AppMenuItem appMenuItem,
           java.lang.String appMenuItemId,
           java.lang.String appName,
           java.util.Calendar createdDate,
           java.lang.String deleteToken,
           java.util.Calendar lastUsedDate,
           java.lang.String requestToken,
           java.lang.Integer useCount,
           com.sforce.soap.enterprise.sobject.User user,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.accessToken = accessToken;
        this.appMenuItem = appMenuItem;
        this.appMenuItemId = appMenuItemId;
        this.appName = appName;
        this.createdDate = createdDate;
        this.deleteToken = deleteToken;
        this.lastUsedDate = lastUsedDate;
        this.requestToken = requestToken;
        this.useCount = useCount;
        this.user = user;
        this.userId = userId;
    }


    /**
     * Gets the accessToken value for this OauthToken.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this OauthToken.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the appMenuItem value for this OauthToken.
     * 
     * @return appMenuItem
     */
    public com.sforce.soap.enterprise.sobject.AppMenuItem getAppMenuItem() {
        return appMenuItem;
    }


    /**
     * Sets the appMenuItem value for this OauthToken.
     * 
     * @param appMenuItem
     */
    public void setAppMenuItem(com.sforce.soap.enterprise.sobject.AppMenuItem appMenuItem) {
        this.appMenuItem = appMenuItem;
    }


    /**
     * Gets the appMenuItemId value for this OauthToken.
     * 
     * @return appMenuItemId
     */
    public java.lang.String getAppMenuItemId() {
        return appMenuItemId;
    }


    /**
     * Sets the appMenuItemId value for this OauthToken.
     * 
     * @param appMenuItemId
     */
    public void setAppMenuItemId(java.lang.String appMenuItemId) {
        this.appMenuItemId = appMenuItemId;
    }


    /**
     * Gets the appName value for this OauthToken.
     * 
     * @return appName
     */
    public java.lang.String getAppName() {
        return appName;
    }


    /**
     * Sets the appName value for this OauthToken.
     * 
     * @param appName
     */
    public void setAppName(java.lang.String appName) {
        this.appName = appName;
    }


    /**
     * Gets the createdDate value for this OauthToken.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this OauthToken.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the deleteToken value for this OauthToken.
     * 
     * @return deleteToken
     */
    public java.lang.String getDeleteToken() {
        return deleteToken;
    }


    /**
     * Sets the deleteToken value for this OauthToken.
     * 
     * @param deleteToken
     */
    public void setDeleteToken(java.lang.String deleteToken) {
        this.deleteToken = deleteToken;
    }


    /**
     * Gets the lastUsedDate value for this OauthToken.
     * 
     * @return lastUsedDate
     */
    public java.util.Calendar getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this OauthToken.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.util.Calendar lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the requestToken value for this OauthToken.
     * 
     * @return requestToken
     */
    public java.lang.String getRequestToken() {
        return requestToken;
    }


    /**
     * Sets the requestToken value for this OauthToken.
     * 
     * @param requestToken
     */
    public void setRequestToken(java.lang.String requestToken) {
        this.requestToken = requestToken;
    }


    /**
     * Gets the useCount value for this OauthToken.
     * 
     * @return useCount
     */
    public java.lang.Integer getUseCount() {
        return useCount;
    }


    /**
     * Sets the useCount value for this OauthToken.
     * 
     * @param useCount
     */
    public void setUseCount(java.lang.Integer useCount) {
        this.useCount = useCount;
    }


    /**
     * Gets the user value for this OauthToken.
     * 
     * @return user
     */
    public com.sforce.soap.enterprise.sobject.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this OauthToken.
     * 
     * @param user
     */
    public void setUser(com.sforce.soap.enterprise.sobject.User user) {
        this.user = user;
    }


    /**
     * Gets the userId value for this OauthToken.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this OauthToken.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OauthToken)) return false;
        OauthToken other = (OauthToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken()))) &&
            ((this.appMenuItem==null && other.getAppMenuItem()==null) || 
             (this.appMenuItem!=null &&
              this.appMenuItem.equals(other.getAppMenuItem()))) &&
            ((this.appMenuItemId==null && other.getAppMenuItemId()==null) || 
             (this.appMenuItemId!=null &&
              this.appMenuItemId.equals(other.getAppMenuItemId()))) &&
            ((this.appName==null && other.getAppName()==null) || 
             (this.appName!=null &&
              this.appName.equals(other.getAppName()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.deleteToken==null && other.getDeleteToken()==null) || 
             (this.deleteToken!=null &&
              this.deleteToken.equals(other.getDeleteToken()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
            ((this.requestToken==null && other.getRequestToken()==null) || 
             (this.requestToken!=null &&
              this.requestToken.equals(other.getRequestToken()))) &&
            ((this.useCount==null && other.getUseCount()==null) || 
             (this.useCount!=null &&
              this.useCount.equals(other.getUseCount()))) &&
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
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        if (getAppMenuItem() != null) {
            _hashCode += getAppMenuItem().hashCode();
        }
        if (getAppMenuItemId() != null) {
            _hashCode += getAppMenuItemId().hashCode();
        }
        if (getAppName() != null) {
            _hashCode += getAppName().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDeleteToken() != null) {
            _hashCode += getDeleteToken().hashCode();
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
        if (getRequestToken() != null) {
            _hashCode += getRequestToken().hashCode();
        }
        if (getUseCount() != null) {
            _hashCode += getUseCount().hashCode();
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
        new org.apache.axis.description.TypeDesc(OauthToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OauthToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appMenuItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appMenuItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppName"));
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
        elemField.setFieldName("deleteToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeleteToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RequestToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
