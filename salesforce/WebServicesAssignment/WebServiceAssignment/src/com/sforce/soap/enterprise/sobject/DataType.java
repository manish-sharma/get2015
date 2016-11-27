/**
 * DataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class DataType  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String contextServiceDataTypeId;

    private java.lang.String contextWsdlDataTypeId;

    private java.lang.String developerName;

    private java.lang.String durableId;

    private java.lang.Boolean isComplex;

    public DataType() {
    }

    public DataType(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String contextServiceDataTypeId,
           java.lang.String contextWsdlDataTypeId,
           java.lang.String developerName,
           java.lang.String durableId,
           java.lang.Boolean isComplex) {
        super(
            fieldsToNull,
            id);
        this.contextServiceDataTypeId = contextServiceDataTypeId;
        this.contextWsdlDataTypeId = contextWsdlDataTypeId;
        this.developerName = developerName;
        this.durableId = durableId;
        this.isComplex = isComplex;
    }


    /**
     * Gets the contextServiceDataTypeId value for this DataType.
     * 
     * @return contextServiceDataTypeId
     */
    public java.lang.String getContextServiceDataTypeId() {
        return contextServiceDataTypeId;
    }


    /**
     * Sets the contextServiceDataTypeId value for this DataType.
     * 
     * @param contextServiceDataTypeId
     */
    public void setContextServiceDataTypeId(java.lang.String contextServiceDataTypeId) {
        this.contextServiceDataTypeId = contextServiceDataTypeId;
    }


    /**
     * Gets the contextWsdlDataTypeId value for this DataType.
     * 
     * @return contextWsdlDataTypeId
     */
    public java.lang.String getContextWsdlDataTypeId() {
        return contextWsdlDataTypeId;
    }


    /**
     * Sets the contextWsdlDataTypeId value for this DataType.
     * 
     * @param contextWsdlDataTypeId
     */
    public void setContextWsdlDataTypeId(java.lang.String contextWsdlDataTypeId) {
        this.contextWsdlDataTypeId = contextWsdlDataTypeId;
    }


    /**
     * Gets the developerName value for this DataType.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this DataType.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the durableId value for this DataType.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this DataType.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the isComplex value for this DataType.
     * 
     * @return isComplex
     */
    public java.lang.Boolean getIsComplex() {
        return isComplex;
    }


    /**
     * Sets the isComplex value for this DataType.
     * 
     * @param isComplex
     */
    public void setIsComplex(java.lang.Boolean isComplex) {
        this.isComplex = isComplex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataType)) return false;
        DataType other = (DataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contextServiceDataTypeId==null && other.getContextServiceDataTypeId()==null) || 
             (this.contextServiceDataTypeId!=null &&
              this.contextServiceDataTypeId.equals(other.getContextServiceDataTypeId()))) &&
            ((this.contextWsdlDataTypeId==null && other.getContextWsdlDataTypeId()==null) || 
             (this.contextWsdlDataTypeId!=null &&
              this.contextWsdlDataTypeId.equals(other.getContextWsdlDataTypeId()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.isComplex==null && other.getIsComplex()==null) || 
             (this.isComplex!=null &&
              this.isComplex.equals(other.getIsComplex())));
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
        if (getContextServiceDataTypeId() != null) {
            _hashCode += getContextServiceDataTypeId().hashCode();
        }
        if (getContextWsdlDataTypeId() != null) {
            _hashCode += getContextWsdlDataTypeId().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getIsComplex() != null) {
            _hashCode += getIsComplex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextServiceDataTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContextServiceDataTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextWsdlDataTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContextWsdlDataTypeId"));
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
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isComplex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsComplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
