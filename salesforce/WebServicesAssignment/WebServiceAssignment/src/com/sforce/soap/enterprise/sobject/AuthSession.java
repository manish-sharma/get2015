/**
 * AuthSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AuthSession  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.sobject.LoginGeo loginGeo;

    private java.lang.String loginGeoId;

    private com.sforce.soap.enterprise.sobject.LoginHistory loginHistory;

    private java.lang.String loginHistoryId;

    private java.lang.String loginType;

    private java.lang.String logoutUrl;

    private java.lang.Integer numSecondsValid;

    private java.lang.String parentId;

    private java.lang.String sessionSecurityLevel;

    private java.lang.String sessionType;

    private java.lang.String sourceIp;

    private java.lang.String userType;

    private com.sforce.soap.enterprise.sobject.User users;

    private java.lang.String usersId;

    public AuthSession() {
    }

    public AuthSession(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.sobject.LoginGeo loginGeo,
           java.lang.String loginGeoId,
           com.sforce.soap.enterprise.sobject.LoginHistory loginHistory,
           java.lang.String loginHistoryId,
           java.lang.String loginType,
           java.lang.String logoutUrl,
           java.lang.Integer numSecondsValid,
           java.lang.String parentId,
           java.lang.String sessionSecurityLevel,
           java.lang.String sessionType,
           java.lang.String sourceIp,
           java.lang.String userType,
           com.sforce.soap.enterprise.sobject.User users,
           java.lang.String usersId) {
        super(
            fieldsToNull,
            id);
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.loginGeo = loginGeo;
        this.loginGeoId = loginGeoId;
        this.loginHistory = loginHistory;
        this.loginHistoryId = loginHistoryId;
        this.loginType = loginType;
        this.logoutUrl = logoutUrl;
        this.numSecondsValid = numSecondsValid;
        this.parentId = parentId;
        this.sessionSecurityLevel = sessionSecurityLevel;
        this.sessionType = sessionType;
        this.sourceIp = sourceIp;
        this.userType = userType;
        this.users = users;
        this.usersId = usersId;
    }


    /**
     * Gets the createdDate value for this AuthSession.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AuthSession.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this AuthSession.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AuthSession.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the loginGeo value for this AuthSession.
     * 
     * @return loginGeo
     */
    public com.sforce.soap.enterprise.sobject.LoginGeo getLoginGeo() {
        return loginGeo;
    }


    /**
     * Sets the loginGeo value for this AuthSession.
     * 
     * @param loginGeo
     */
    public void setLoginGeo(com.sforce.soap.enterprise.sobject.LoginGeo loginGeo) {
        this.loginGeo = loginGeo;
    }


    /**
     * Gets the loginGeoId value for this AuthSession.
     * 
     * @return loginGeoId
     */
    public java.lang.String getLoginGeoId() {
        return loginGeoId;
    }


    /**
     * Sets the loginGeoId value for this AuthSession.
     * 
     * @param loginGeoId
     */
    public void setLoginGeoId(java.lang.String loginGeoId) {
        this.loginGeoId = loginGeoId;
    }


    /**
     * Gets the loginHistory value for this AuthSession.
     * 
     * @return loginHistory
     */
    public com.sforce.soap.enterprise.sobject.LoginHistory getLoginHistory() {
        return loginHistory;
    }


    /**
     * Sets the loginHistory value for this AuthSession.
     * 
     * @param loginHistory
     */
    public void setLoginHistory(com.sforce.soap.enterprise.sobject.LoginHistory loginHistory) {
        this.loginHistory = loginHistory;
    }


    /**
     * Gets the loginHistoryId value for this AuthSession.
     * 
     * @return loginHistoryId
     */
    public java.lang.String getLoginHistoryId() {
        return loginHistoryId;
    }


    /**
     * Sets the loginHistoryId value for this AuthSession.
     * 
     * @param loginHistoryId
     */
    public void setLoginHistoryId(java.lang.String loginHistoryId) {
        this.loginHistoryId = loginHistoryId;
    }


    /**
     * Gets the loginType value for this AuthSession.
     * 
     * @return loginType
     */
    public java.lang.String getLoginType() {
        return loginType;
    }


    /**
     * Sets the loginType value for this AuthSession.
     * 
     * @param loginType
     */
    public void setLoginType(java.lang.String loginType) {
        this.loginType = loginType;
    }


    /**
     * Gets the logoutUrl value for this AuthSession.
     * 
     * @return logoutUrl
     */
    public java.lang.String getLogoutUrl() {
        return logoutUrl;
    }


    /**
     * Sets the logoutUrl value for this AuthSession.
     * 
     * @param logoutUrl
     */
    public void setLogoutUrl(java.lang.String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }


    /**
     * Gets the numSecondsValid value for this AuthSession.
     * 
     * @return numSecondsValid
     */
    public java.lang.Integer getNumSecondsValid() {
        return numSecondsValid;
    }


    /**
     * Sets the numSecondsValid value for this AuthSession.
     * 
     * @param numSecondsValid
     */
    public void setNumSecondsValid(java.lang.Integer numSecondsValid) {
        this.numSecondsValid = numSecondsValid;
    }


    /**
     * Gets the parentId value for this AuthSession.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this AuthSession.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the sessionSecurityLevel value for this AuthSession.
     * 
     * @return sessionSecurityLevel
     */
    public java.lang.String getSessionSecurityLevel() {
        return sessionSecurityLevel;
    }


    /**
     * Sets the sessionSecurityLevel value for this AuthSession.
     * 
     * @param sessionSecurityLevel
     */
    public void setSessionSecurityLevel(java.lang.String sessionSecurityLevel) {
        this.sessionSecurityLevel = sessionSecurityLevel;
    }


    /**
     * Gets the sessionType value for this AuthSession.
     * 
     * @return sessionType
     */
    public java.lang.String getSessionType() {
        return sessionType;
    }


    /**
     * Sets the sessionType value for this AuthSession.
     * 
     * @param sessionType
     */
    public void setSessionType(java.lang.String sessionType) {
        this.sessionType = sessionType;
    }


    /**
     * Gets the sourceIp value for this AuthSession.
     * 
     * @return sourceIp
     */
    public java.lang.String getSourceIp() {
        return sourceIp;
    }


    /**
     * Sets the sourceIp value for this AuthSession.
     * 
     * @param sourceIp
     */
    public void setSourceIp(java.lang.String sourceIp) {
        this.sourceIp = sourceIp;
    }


    /**
     * Gets the userType value for this AuthSession.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this AuthSession.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the users value for this AuthSession.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.sobject.User getUsers() {
        return users;
    }


    /**
     * Sets the users value for this AuthSession.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.sobject.User users) {
        this.users = users;
    }


    /**
     * Gets the usersId value for this AuthSession.
     * 
     * @return usersId
     */
    public java.lang.String getUsersId() {
        return usersId;
    }


    /**
     * Sets the usersId value for this AuthSession.
     * 
     * @param usersId
     */
    public void setUsersId(java.lang.String usersId) {
        this.usersId = usersId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthSession)) return false;
        AuthSession other = (AuthSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.loginGeo==null && other.getLoginGeo()==null) || 
             (this.loginGeo!=null &&
              this.loginGeo.equals(other.getLoginGeo()))) &&
            ((this.loginGeoId==null && other.getLoginGeoId()==null) || 
             (this.loginGeoId!=null &&
              this.loginGeoId.equals(other.getLoginGeoId()))) &&
            ((this.loginHistory==null && other.getLoginHistory()==null) || 
             (this.loginHistory!=null &&
              this.loginHistory.equals(other.getLoginHistory()))) &&
            ((this.loginHistoryId==null && other.getLoginHistoryId()==null) || 
             (this.loginHistoryId!=null &&
              this.loginHistoryId.equals(other.getLoginHistoryId()))) &&
            ((this.loginType==null && other.getLoginType()==null) || 
             (this.loginType!=null &&
              this.loginType.equals(other.getLoginType()))) &&
            ((this.logoutUrl==null && other.getLogoutUrl()==null) || 
             (this.logoutUrl!=null &&
              this.logoutUrl.equals(other.getLogoutUrl()))) &&
            ((this.numSecondsValid==null && other.getNumSecondsValid()==null) || 
             (this.numSecondsValid!=null &&
              this.numSecondsValid.equals(other.getNumSecondsValid()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.sessionSecurityLevel==null && other.getSessionSecurityLevel()==null) || 
             (this.sessionSecurityLevel!=null &&
              this.sessionSecurityLevel.equals(other.getSessionSecurityLevel()))) &&
            ((this.sessionType==null && other.getSessionType()==null) || 
             (this.sessionType!=null &&
              this.sessionType.equals(other.getSessionType()))) &&
            ((this.sourceIp==null && other.getSourceIp()==null) || 
             (this.sourceIp!=null &&
              this.sourceIp.equals(other.getSourceIp()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              this.users.equals(other.getUsers()))) &&
            ((this.usersId==null && other.getUsersId()==null) || 
             (this.usersId!=null &&
              this.usersId.equals(other.getUsersId())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLoginGeo() != null) {
            _hashCode += getLoginGeo().hashCode();
        }
        if (getLoginGeoId() != null) {
            _hashCode += getLoginGeoId().hashCode();
        }
        if (getLoginHistory() != null) {
            _hashCode += getLoginHistory().hashCode();
        }
        if (getLoginHistoryId() != null) {
            _hashCode += getLoginHistoryId().hashCode();
        }
        if (getLoginType() != null) {
            _hashCode += getLoginType().hashCode();
        }
        if (getLogoutUrl() != null) {
            _hashCode += getLogoutUrl().hashCode();
        }
        if (getNumSecondsValid() != null) {
            _hashCode += getNumSecondsValid().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getSessionSecurityLevel() != null) {
            _hashCode += getSessionSecurityLevel().hashCode();
        }
        if (getSessionType() != null) {
            _hashCode += getSessionType().hashCode();
        }
        if (getSourceIp() != null) {
            _hashCode += getSourceIp().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getUsers() != null) {
            _hashCode += getUsers().hashCode();
        }
        if (getUsersId() != null) {
            _hashCode += getUsersId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("loginGeo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginGeo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginGeo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginGeoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginGeoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginHistoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginType"));
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
        elemField.setFieldName("numSecondsValid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumSecondsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionSecurityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SessionSecurityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SessionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SourceIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsersId"));
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
