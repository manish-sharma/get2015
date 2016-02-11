/**
 * DatacloudSocialHandle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class DatacloudSocialHandle  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.DatacloudContact datacloudContact;

    private java.lang.String datacloudContactId;

    private java.lang.String externalId;

    private java.lang.String providerName;

    private java.lang.String socialId;

    private java.lang.String url;

    public DatacloudSocialHandle() {
    }

    public DatacloudSocialHandle(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.DatacloudContact datacloudContact,
           java.lang.String datacloudContactId,
           java.lang.String externalId,
           java.lang.String providerName,
           java.lang.String socialId,
           java.lang.String url) {
        super(
            fieldsToNull,
            id);
        this.datacloudContact = datacloudContact;
        this.datacloudContactId = datacloudContactId;
        this.externalId = externalId;
        this.providerName = providerName;
        this.socialId = socialId;
        this.url = url;
    }


    /**
     * Gets the datacloudContact value for this DatacloudSocialHandle.
     * 
     * @return datacloudContact
     */
    public com.sforce.soap.enterprise.sobject.DatacloudContact getDatacloudContact() {
        return datacloudContact;
    }


    /**
     * Sets the datacloudContact value for this DatacloudSocialHandle.
     * 
     * @param datacloudContact
     */
    public void setDatacloudContact(com.sforce.soap.enterprise.sobject.DatacloudContact datacloudContact) {
        this.datacloudContact = datacloudContact;
    }


    /**
     * Gets the datacloudContactId value for this DatacloudSocialHandle.
     * 
     * @return datacloudContactId
     */
    public java.lang.String getDatacloudContactId() {
        return datacloudContactId;
    }


    /**
     * Sets the datacloudContactId value for this DatacloudSocialHandle.
     * 
     * @param datacloudContactId
     */
    public void setDatacloudContactId(java.lang.String datacloudContactId) {
        this.datacloudContactId = datacloudContactId;
    }


    /**
     * Gets the externalId value for this DatacloudSocialHandle.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this DatacloudSocialHandle.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the providerName value for this DatacloudSocialHandle.
     * 
     * @return providerName
     */
    public java.lang.String getProviderName() {
        return providerName;
    }


    /**
     * Sets the providerName value for this DatacloudSocialHandle.
     * 
     * @param providerName
     */
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }


    /**
     * Gets the socialId value for this DatacloudSocialHandle.
     * 
     * @return socialId
     */
    public java.lang.String getSocialId() {
        return socialId;
    }


    /**
     * Sets the socialId value for this DatacloudSocialHandle.
     * 
     * @param socialId
     */
    public void setSocialId(java.lang.String socialId) {
        this.socialId = socialId;
    }


    /**
     * Gets the url value for this DatacloudSocialHandle.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this DatacloudSocialHandle.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacloudSocialHandle)) return false;
        DatacloudSocialHandle other = (DatacloudSocialHandle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datacloudContact==null && other.getDatacloudContact()==null) || 
             (this.datacloudContact!=null &&
              this.datacloudContact.equals(other.getDatacloudContact()))) &&
            ((this.datacloudContactId==null && other.getDatacloudContactId()==null) || 
             (this.datacloudContactId!=null &&
              this.datacloudContactId.equals(other.getDatacloudContactId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.providerName==null && other.getProviderName()==null) || 
             (this.providerName!=null &&
              this.providerName.equals(other.getProviderName()))) &&
            ((this.socialId==null && other.getSocialId()==null) || 
             (this.socialId!=null &&
              this.socialId.equals(other.getSocialId()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getDatacloudContact() != null) {
            _hashCode += getDatacloudContact().hashCode();
        }
        if (getDatacloudContactId() != null) {
            _hashCode += getDatacloudContactId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getProviderName() != null) {
            _hashCode += getProviderName().hashCode();
        }
        if (getSocialId() != null) {
            _hashCode += getSocialId().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacloudSocialHandle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudSocialHandle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacloudContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacloudContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProviderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Url"));
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
