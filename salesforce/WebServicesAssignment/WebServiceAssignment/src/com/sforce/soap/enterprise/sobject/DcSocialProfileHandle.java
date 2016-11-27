/**
 * DcSocialProfileHandle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class DcSocialProfileHandle  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.DcSocialProfile dcSocialProfile;

    private java.lang.String dcSocialProfileId;

    private java.lang.String externalId;

    private java.lang.String handle;

    private java.lang.String providerName;

    public DcSocialProfileHandle() {
    }

    public DcSocialProfileHandle(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.DcSocialProfile dcSocialProfile,
           java.lang.String dcSocialProfileId,
           java.lang.String externalId,
           java.lang.String handle,
           java.lang.String providerName) {
        super(
            fieldsToNull,
            id);
        this.dcSocialProfile = dcSocialProfile;
        this.dcSocialProfileId = dcSocialProfileId;
        this.externalId = externalId;
        this.handle = handle;
        this.providerName = providerName;
    }


    /**
     * Gets the dcSocialProfile value for this DcSocialProfileHandle.
     * 
     * @return dcSocialProfile
     */
    public com.sforce.soap.enterprise.sobject.DcSocialProfile getDcSocialProfile() {
        return dcSocialProfile;
    }


    /**
     * Sets the dcSocialProfile value for this DcSocialProfileHandle.
     * 
     * @param dcSocialProfile
     */
    public void setDcSocialProfile(com.sforce.soap.enterprise.sobject.DcSocialProfile dcSocialProfile) {
        this.dcSocialProfile = dcSocialProfile;
    }


    /**
     * Gets the dcSocialProfileId value for this DcSocialProfileHandle.
     * 
     * @return dcSocialProfileId
     */
    public java.lang.String getDcSocialProfileId() {
        return dcSocialProfileId;
    }


    /**
     * Sets the dcSocialProfileId value for this DcSocialProfileHandle.
     * 
     * @param dcSocialProfileId
     */
    public void setDcSocialProfileId(java.lang.String dcSocialProfileId) {
        this.dcSocialProfileId = dcSocialProfileId;
    }


    /**
     * Gets the externalId value for this DcSocialProfileHandle.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this DcSocialProfileHandle.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the handle value for this DcSocialProfileHandle.
     * 
     * @return handle
     */
    public java.lang.String getHandle() {
        return handle;
    }


    /**
     * Sets the handle value for this DcSocialProfileHandle.
     * 
     * @param handle
     */
    public void setHandle(java.lang.String handle) {
        this.handle = handle;
    }


    /**
     * Gets the providerName value for this DcSocialProfileHandle.
     * 
     * @return providerName
     */
    public java.lang.String getProviderName() {
        return providerName;
    }


    /**
     * Sets the providerName value for this DcSocialProfileHandle.
     * 
     * @param providerName
     */
    public void setProviderName(java.lang.String providerName) {
        this.providerName = providerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DcSocialProfileHandle)) return false;
        DcSocialProfileHandle other = (DcSocialProfileHandle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dcSocialProfile==null && other.getDcSocialProfile()==null) || 
             (this.dcSocialProfile!=null &&
              this.dcSocialProfile.equals(other.getDcSocialProfile()))) &&
            ((this.dcSocialProfileId==null && other.getDcSocialProfileId()==null) || 
             (this.dcSocialProfileId!=null &&
              this.dcSocialProfileId.equals(other.getDcSocialProfileId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.handle==null && other.getHandle()==null) || 
             (this.handle!=null &&
              this.handle.equals(other.getHandle()))) &&
            ((this.providerName==null && other.getProviderName()==null) || 
             (this.providerName!=null &&
              this.providerName.equals(other.getProviderName())));
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
        if (getDcSocialProfile() != null) {
            _hashCode += getDcSocialProfile().hashCode();
        }
        if (getDcSocialProfileId() != null) {
            _hashCode += getDcSocialProfileId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getHandle() != null) {
            _hashCode += getHandle().hashCode();
        }
        if (getProviderName() != null) {
            _hashCode += getProviderName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DcSocialProfileHandle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DcSocialProfileHandle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcSocialProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DcSocialProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DcSocialProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dcSocialProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DcSocialProfileId"));
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
        elemField.setFieldName("handle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Handle"));
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
