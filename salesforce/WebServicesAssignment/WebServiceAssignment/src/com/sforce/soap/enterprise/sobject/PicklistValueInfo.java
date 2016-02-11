/**
 * PicklistValueInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class PicklistValueInfo  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityParticle entityParticle;

    private java.lang.String entityParticleId;

    private java.lang.Boolean isActive;

    private java.lang.Boolean isDefaultValue;

    private java.lang.String label;

    private java.lang.String validFor;

    private java.lang.String value;

    public PicklistValueInfo() {
    }

    public PicklistValueInfo(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityParticle entityParticle,
           java.lang.String entityParticleId,
           java.lang.Boolean isActive,
           java.lang.Boolean isDefaultValue,
           java.lang.String label,
           java.lang.String validFor,
           java.lang.String value) {
        super(
            fieldsToNull,
            id);
        this.durableId = durableId;
        this.entityParticle = entityParticle;
        this.entityParticleId = entityParticleId;
        this.isActive = isActive;
        this.isDefaultValue = isDefaultValue;
        this.label = label;
        this.validFor = validFor;
        this.value = value;
    }


    /**
     * Gets the durableId value for this PicklistValueInfo.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this PicklistValueInfo.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityParticle value for this PicklistValueInfo.
     * 
     * @return entityParticle
     */
    public com.sforce.soap.enterprise.sobject.EntityParticle getEntityParticle() {
        return entityParticle;
    }


    /**
     * Sets the entityParticle value for this PicklistValueInfo.
     * 
     * @param entityParticle
     */
    public void setEntityParticle(com.sforce.soap.enterprise.sobject.EntityParticle entityParticle) {
        this.entityParticle = entityParticle;
    }


    /**
     * Gets the entityParticleId value for this PicklistValueInfo.
     * 
     * @return entityParticleId
     */
    public java.lang.String getEntityParticleId() {
        return entityParticleId;
    }


    /**
     * Sets the entityParticleId value for this PicklistValueInfo.
     * 
     * @param entityParticleId
     */
    public void setEntityParticleId(java.lang.String entityParticleId) {
        this.entityParticleId = entityParticleId;
    }


    /**
     * Gets the isActive value for this PicklistValueInfo.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this PicklistValueInfo.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isDefaultValue value for this PicklistValueInfo.
     * 
     * @return isDefaultValue
     */
    public java.lang.Boolean getIsDefaultValue() {
        return isDefaultValue;
    }


    /**
     * Sets the isDefaultValue value for this PicklistValueInfo.
     * 
     * @param isDefaultValue
     */
    public void setIsDefaultValue(java.lang.Boolean isDefaultValue) {
        this.isDefaultValue = isDefaultValue;
    }


    /**
     * Gets the label value for this PicklistValueInfo.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this PicklistValueInfo.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the validFor value for this PicklistValueInfo.
     * 
     * @return validFor
     */
    public java.lang.String getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this PicklistValueInfo.
     * 
     * @param validFor
     */
    public void setValidFor(java.lang.String validFor) {
        this.validFor = validFor;
    }


    /**
     * Gets the value value for this PicklistValueInfo.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PicklistValueInfo.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PicklistValueInfo)) return false;
        PicklistValueInfo other = (PicklistValueInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.entityParticle==null && other.getEntityParticle()==null) || 
             (this.entityParticle!=null &&
              this.entityParticle.equals(other.getEntityParticle()))) &&
            ((this.entityParticleId==null && other.getEntityParticleId()==null) || 
             (this.entityParticleId!=null &&
              this.entityParticleId.equals(other.getEntityParticleId()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isDefaultValue==null && other.getIsDefaultValue()==null) || 
             (this.isDefaultValue!=null &&
              this.isDefaultValue.equals(other.getIsDefaultValue()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEntityParticle() != null) {
            _hashCode += getEntityParticle().hashCode();
        }
        if (getEntityParticleId() != null) {
            _hashCode += getEntityParticleId().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsDefaultValue() != null) {
            _hashCode += getIsDefaultValue().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PicklistValueInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PicklistValueInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityParticle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityParticleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDefaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ValidFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Value"));
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
