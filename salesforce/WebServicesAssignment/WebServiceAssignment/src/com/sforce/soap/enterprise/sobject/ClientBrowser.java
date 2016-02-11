/**
 * ClientBrowser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ClientBrowser  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.lang.String fullUserAgent;

    private java.util.Calendar lastUpdate;

    private java.lang.String proxyInfo;

    private com.sforce.soap.enterprise.sobject.User users;

    private java.lang.String usersId;

    public ClientBrowser() {
    }

    public ClientBrowser(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Calendar createdDate,
           java.lang.String fullUserAgent,
           java.util.Calendar lastUpdate,
           java.lang.String proxyInfo,
           com.sforce.soap.enterprise.sobject.User users,
           java.lang.String usersId) {
        super(
            fieldsToNull,
            id);
        this.createdDate = createdDate;
        this.fullUserAgent = fullUserAgent;
        this.lastUpdate = lastUpdate;
        this.proxyInfo = proxyInfo;
        this.users = users;
        this.usersId = usersId;
    }


    /**
     * Gets the createdDate value for this ClientBrowser.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ClientBrowser.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the fullUserAgent value for this ClientBrowser.
     * 
     * @return fullUserAgent
     */
    public java.lang.String getFullUserAgent() {
        return fullUserAgent;
    }


    /**
     * Sets the fullUserAgent value for this ClientBrowser.
     * 
     * @param fullUserAgent
     */
    public void setFullUserAgent(java.lang.String fullUserAgent) {
        this.fullUserAgent = fullUserAgent;
    }


    /**
     * Gets the lastUpdate value for this ClientBrowser.
     * 
     * @return lastUpdate
     */
    public java.util.Calendar getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this ClientBrowser.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.util.Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the proxyInfo value for this ClientBrowser.
     * 
     * @return proxyInfo
     */
    public java.lang.String getProxyInfo() {
        return proxyInfo;
    }


    /**
     * Sets the proxyInfo value for this ClientBrowser.
     * 
     * @param proxyInfo
     */
    public void setProxyInfo(java.lang.String proxyInfo) {
        this.proxyInfo = proxyInfo;
    }


    /**
     * Gets the users value for this ClientBrowser.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.sobject.User getUsers() {
        return users;
    }


    /**
     * Sets the users value for this ClientBrowser.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.sobject.User users) {
        this.users = users;
    }


    /**
     * Gets the usersId value for this ClientBrowser.
     * 
     * @return usersId
     */
    public java.lang.String getUsersId() {
        return usersId;
    }


    /**
     * Sets the usersId value for this ClientBrowser.
     * 
     * @param usersId
     */
    public void setUsersId(java.lang.String usersId) {
        this.usersId = usersId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientBrowser)) return false;
        ClientBrowser other = (ClientBrowser) obj;
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
            ((this.fullUserAgent==null && other.getFullUserAgent()==null) || 
             (this.fullUserAgent!=null &&
              this.fullUserAgent.equals(other.getFullUserAgent()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.proxyInfo==null && other.getProxyInfo()==null) || 
             (this.proxyInfo!=null &&
              this.proxyInfo.equals(other.getProxyInfo()))) &&
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
        if (getFullUserAgent() != null) {
            _hashCode += getFullUserAgent().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getProxyInfo() != null) {
            _hashCode += getProxyInfo().hashCode();
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
        new org.apache.axis.description.TypeDesc(ClientBrowser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ClientBrowser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullUserAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FullUserAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProxyInfo"));
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
