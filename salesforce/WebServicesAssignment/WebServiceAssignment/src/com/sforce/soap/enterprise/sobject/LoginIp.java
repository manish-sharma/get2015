/**
 * LoginIp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class LoginIp  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String challengeMethod;

    private java.util.Calendar challengeSentDate;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isAuthenticated;

    private java.lang.String sourceIp;

    private com.sforce.soap.enterprise.sobject.User users;

    private java.lang.String usersId;

    public LoginIp() {
    }

    public LoginIp(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String challengeMethod,
           java.util.Calendar challengeSentDate,
           java.util.Calendar createdDate,
           java.lang.Boolean isAuthenticated,
           java.lang.String sourceIp,
           com.sforce.soap.enterprise.sobject.User users,
           java.lang.String usersId) {
        super(
            fieldsToNull,
            id);
        this.challengeMethod = challengeMethod;
        this.challengeSentDate = challengeSentDate;
        this.createdDate = createdDate;
        this.isAuthenticated = isAuthenticated;
        this.sourceIp = sourceIp;
        this.users = users;
        this.usersId = usersId;
    }


    /**
     * Gets the challengeMethod value for this LoginIp.
     * 
     * @return challengeMethod
     */
    public java.lang.String getChallengeMethod() {
        return challengeMethod;
    }


    /**
     * Sets the challengeMethod value for this LoginIp.
     * 
     * @param challengeMethod
     */
    public void setChallengeMethod(java.lang.String challengeMethod) {
        this.challengeMethod = challengeMethod;
    }


    /**
     * Gets the challengeSentDate value for this LoginIp.
     * 
     * @return challengeSentDate
     */
    public java.util.Calendar getChallengeSentDate() {
        return challengeSentDate;
    }


    /**
     * Sets the challengeSentDate value for this LoginIp.
     * 
     * @param challengeSentDate
     */
    public void setChallengeSentDate(java.util.Calendar challengeSentDate) {
        this.challengeSentDate = challengeSentDate;
    }


    /**
     * Gets the createdDate value for this LoginIp.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this LoginIp.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isAuthenticated value for this LoginIp.
     * 
     * @return isAuthenticated
     */
    public java.lang.Boolean getIsAuthenticated() {
        return isAuthenticated;
    }


    /**
     * Sets the isAuthenticated value for this LoginIp.
     * 
     * @param isAuthenticated
     */
    public void setIsAuthenticated(java.lang.Boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }


    /**
     * Gets the sourceIp value for this LoginIp.
     * 
     * @return sourceIp
     */
    public java.lang.String getSourceIp() {
        return sourceIp;
    }


    /**
     * Sets the sourceIp value for this LoginIp.
     * 
     * @param sourceIp
     */
    public void setSourceIp(java.lang.String sourceIp) {
        this.sourceIp = sourceIp;
    }


    /**
     * Gets the users value for this LoginIp.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.sobject.User getUsers() {
        return users;
    }


    /**
     * Sets the users value for this LoginIp.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.sobject.User users) {
        this.users = users;
    }


    /**
     * Gets the usersId value for this LoginIp.
     * 
     * @return usersId
     */
    public java.lang.String getUsersId() {
        return usersId;
    }


    /**
     * Sets the usersId value for this LoginIp.
     * 
     * @param usersId
     */
    public void setUsersId(java.lang.String usersId) {
        this.usersId = usersId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginIp)) return false;
        LoginIp other = (LoginIp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.challengeMethod==null && other.getChallengeMethod()==null) || 
             (this.challengeMethod!=null &&
              this.challengeMethod.equals(other.getChallengeMethod()))) &&
            ((this.challengeSentDate==null && other.getChallengeSentDate()==null) || 
             (this.challengeSentDate!=null &&
              this.challengeSentDate.equals(other.getChallengeSentDate()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isAuthenticated==null && other.getIsAuthenticated()==null) || 
             (this.isAuthenticated!=null &&
              this.isAuthenticated.equals(other.getIsAuthenticated()))) &&
            ((this.sourceIp==null && other.getSourceIp()==null) || 
             (this.sourceIp!=null &&
              this.sourceIp.equals(other.getSourceIp()))) &&
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
        if (getChallengeMethod() != null) {
            _hashCode += getChallengeMethod().hashCode();
        }
        if (getChallengeSentDate() != null) {
            _hashCode += getChallengeSentDate().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIsAuthenticated() != null) {
            _hashCode += getIsAuthenticated().hashCode();
        }
        if (getSourceIp() != null) {
            _hashCode += getSourceIp().hashCode();
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
        new org.apache.axis.description.TypeDesc(LoginIp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginIp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChallengeMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChallengeSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("isAuthenticated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAuthenticated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
