/**
 * CustomObjectUserLicenseMetrics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CustomObjectUserLicenseMetrics  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String customObjectId;

    private java.lang.String customObjectName;

    private java.lang.String customObjectType;

    private java.util.Date metricsDate;

    private java.lang.Integer objectCount;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.UserLicense userLicense;

    private java.lang.String userLicenseId;

    public CustomObjectUserLicenseMetrics() {
    }

    public CustomObjectUserLicenseMetrics(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String customObjectId,
           java.lang.String customObjectName,
           java.lang.String customObjectType,
           java.util.Date metricsDate,
           java.lang.Integer objectCount,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.UserLicense userLicense,
           java.lang.String userLicenseId) {
        super(
            fieldsToNull,
            id);
        this.customObjectId = customObjectId;
        this.customObjectName = customObjectName;
        this.customObjectType = customObjectType;
        this.metricsDate = metricsDate;
        this.objectCount = objectCount;
        this.systemModstamp = systemModstamp;
        this.userLicense = userLicense;
        this.userLicenseId = userLicenseId;
    }


    /**
     * Gets the customObjectId value for this CustomObjectUserLicenseMetrics.
     * 
     * @return customObjectId
     */
    public java.lang.String getCustomObjectId() {
        return customObjectId;
    }


    /**
     * Sets the customObjectId value for this CustomObjectUserLicenseMetrics.
     * 
     * @param customObjectId
     */
    public void setCustomObjectId(java.lang.String customObjectId) {
        this.customObjectId = customObjectId;
    }


    /**
     * Gets the customObjectName value for this CustomObjectUserLicenseMetrics.
     * 
     * @return customObjectName
     */
    public java.lang.String getCustomObjectName() {
        return customObjectName;
    }


    /**
     * Sets the customObjectName value for this CustomObjectUserLicenseMetrics.
     * 
     * @param customObjectName
     */
    public void setCustomObjectName(java.lang.String customObjectName) {
        this.customObjectName = customObjectName;
    }


    /**
     * Gets the customObjectType value for this CustomObjectUserLicenseMetrics.
     * 
     * @return customObjectType
     */
    public java.lang.String getCustomObjectType() {
        return customObjectType;
    }


    /**
     * Sets the customObjectType value for this CustomObjectUserLicenseMetrics.
     * 
     * @param customObjectType
     */
    public void setCustomObjectType(java.lang.String customObjectType) {
        this.customObjectType = customObjectType;
    }


    /**
     * Gets the metricsDate value for this CustomObjectUserLicenseMetrics.
     * 
     * @return metricsDate
     */
    public java.util.Date getMetricsDate() {
        return metricsDate;
    }


    /**
     * Sets the metricsDate value for this CustomObjectUserLicenseMetrics.
     * 
     * @param metricsDate
     */
    public void setMetricsDate(java.util.Date metricsDate) {
        this.metricsDate = metricsDate;
    }


    /**
     * Gets the objectCount value for this CustomObjectUserLicenseMetrics.
     * 
     * @return objectCount
     */
    public java.lang.Integer getObjectCount() {
        return objectCount;
    }


    /**
     * Sets the objectCount value for this CustomObjectUserLicenseMetrics.
     * 
     * @param objectCount
     */
    public void setObjectCount(java.lang.Integer objectCount) {
        this.objectCount = objectCount;
    }


    /**
     * Gets the systemModstamp value for this CustomObjectUserLicenseMetrics.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CustomObjectUserLicenseMetrics.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userLicense value for this CustomObjectUserLicenseMetrics.
     * 
     * @return userLicense
     */
    public com.sforce.soap.enterprise.sobject.UserLicense getUserLicense() {
        return userLicense;
    }


    /**
     * Sets the userLicense value for this CustomObjectUserLicenseMetrics.
     * 
     * @param userLicense
     */
    public void setUserLicense(com.sforce.soap.enterprise.sobject.UserLicense userLicense) {
        this.userLicense = userLicense;
    }


    /**
     * Gets the userLicenseId value for this CustomObjectUserLicenseMetrics.
     * 
     * @return userLicenseId
     */
    public java.lang.String getUserLicenseId() {
        return userLicenseId;
    }


    /**
     * Sets the userLicenseId value for this CustomObjectUserLicenseMetrics.
     * 
     * @param userLicenseId
     */
    public void setUserLicenseId(java.lang.String userLicenseId) {
        this.userLicenseId = userLicenseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomObjectUserLicenseMetrics)) return false;
        CustomObjectUserLicenseMetrics other = (CustomObjectUserLicenseMetrics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customObjectId==null && other.getCustomObjectId()==null) || 
             (this.customObjectId!=null &&
              this.customObjectId.equals(other.getCustomObjectId()))) &&
            ((this.customObjectName==null && other.getCustomObjectName()==null) || 
             (this.customObjectName!=null &&
              this.customObjectName.equals(other.getCustomObjectName()))) &&
            ((this.customObjectType==null && other.getCustomObjectType()==null) || 
             (this.customObjectType!=null &&
              this.customObjectType.equals(other.getCustomObjectType()))) &&
            ((this.metricsDate==null && other.getMetricsDate()==null) || 
             (this.metricsDate!=null &&
              this.metricsDate.equals(other.getMetricsDate()))) &&
            ((this.objectCount==null && other.getObjectCount()==null) || 
             (this.objectCount!=null &&
              this.objectCount.equals(other.getObjectCount()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userLicense==null && other.getUserLicense()==null) || 
             (this.userLicense!=null &&
              this.userLicense.equals(other.getUserLicense()))) &&
            ((this.userLicenseId==null && other.getUserLicenseId()==null) || 
             (this.userLicenseId!=null &&
              this.userLicenseId.equals(other.getUserLicenseId())));
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
        if (getCustomObjectId() != null) {
            _hashCode += getCustomObjectId().hashCode();
        }
        if (getCustomObjectName() != null) {
            _hashCode += getCustomObjectName().hashCode();
        }
        if (getCustomObjectType() != null) {
            _hashCode += getCustomObjectType().hashCode();
        }
        if (getMetricsDate() != null) {
            _hashCode += getMetricsDate().hashCode();
        }
        if (getObjectCount() != null) {
            _hashCode += getObjectCount().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserLicense() != null) {
            _hashCode += getUserLicense().hashCode();
        }
        if (getUserLicenseId() != null) {
            _hashCode += getUserLicenseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomObjectUserLicenseMetrics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomObjectUserLicenseMetrics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customObjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomObjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MetricsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ObjectCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("userLicense");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLicenseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicenseId"));
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
