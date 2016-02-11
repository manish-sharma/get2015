/**
 * UserFieldAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserFieldAccess  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition;

    private java.lang.String fieldDefinitionId;

    private java.lang.Boolean isAccessible;

    private java.lang.Boolean isCreatable;

    private java.lang.Boolean isUpdatable;

    private com.sforce.soap.enterprise.sobject.User user;

    private java.lang.String userId;

    public UserFieldAccess() {
    }

    public UserFieldAccess(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition,
           java.lang.String fieldDefinitionId,
           java.lang.Boolean isAccessible,
           java.lang.Boolean isCreatable,
           java.lang.Boolean isUpdatable,
           com.sforce.soap.enterprise.sobject.User user,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.fieldDefinition = fieldDefinition;
        this.fieldDefinitionId = fieldDefinitionId;
        this.isAccessible = isAccessible;
        this.isCreatable = isCreatable;
        this.isUpdatable = isUpdatable;
        this.user = user;
        this.userId = userId;
    }


    /**
     * Gets the durableId value for this UserFieldAccess.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this UserFieldAccess.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this UserFieldAccess.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this UserFieldAccess.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this UserFieldAccess.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this UserFieldAccess.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the fieldDefinition value for this UserFieldAccess.
     * 
     * @return fieldDefinition
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
        return fieldDefinition;
    }


    /**
     * Sets the fieldDefinition value for this UserFieldAccess.
     * 
     * @param fieldDefinition
     */
    public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }


    /**
     * Gets the fieldDefinitionId value for this UserFieldAccess.
     * 
     * @return fieldDefinitionId
     */
    public java.lang.String getFieldDefinitionId() {
        return fieldDefinitionId;
    }


    /**
     * Sets the fieldDefinitionId value for this UserFieldAccess.
     * 
     * @param fieldDefinitionId
     */
    public void setFieldDefinitionId(java.lang.String fieldDefinitionId) {
        this.fieldDefinitionId = fieldDefinitionId;
    }


    /**
     * Gets the isAccessible value for this UserFieldAccess.
     * 
     * @return isAccessible
     */
    public java.lang.Boolean getIsAccessible() {
        return isAccessible;
    }


    /**
     * Sets the isAccessible value for this UserFieldAccess.
     * 
     * @param isAccessible
     */
    public void setIsAccessible(java.lang.Boolean isAccessible) {
        this.isAccessible = isAccessible;
    }


    /**
     * Gets the isCreatable value for this UserFieldAccess.
     * 
     * @return isCreatable
     */
    public java.lang.Boolean getIsCreatable() {
        return isCreatable;
    }


    /**
     * Sets the isCreatable value for this UserFieldAccess.
     * 
     * @param isCreatable
     */
    public void setIsCreatable(java.lang.Boolean isCreatable) {
        this.isCreatable = isCreatable;
    }


    /**
     * Gets the isUpdatable value for this UserFieldAccess.
     * 
     * @return isUpdatable
     */
    public java.lang.Boolean getIsUpdatable() {
        return isUpdatable;
    }


    /**
     * Sets the isUpdatable value for this UserFieldAccess.
     * 
     * @param isUpdatable
     */
    public void setIsUpdatable(java.lang.Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }


    /**
     * Gets the user value for this UserFieldAccess.
     * 
     * @return user
     */
    public com.sforce.soap.enterprise.sobject.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this UserFieldAccess.
     * 
     * @param user
     */
    public void setUser(com.sforce.soap.enterprise.sobject.User user) {
        this.user = user;
    }


    /**
     * Gets the userId value for this UserFieldAccess.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserFieldAccess.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserFieldAccess)) return false;
        UserFieldAccess other = (UserFieldAccess) obj;
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
            ((this.entityDefinition==null && other.getEntityDefinition()==null) || 
             (this.entityDefinition!=null &&
              this.entityDefinition.equals(other.getEntityDefinition()))) &&
            ((this.entityDefinitionId==null && other.getEntityDefinitionId()==null) || 
             (this.entityDefinitionId!=null &&
              this.entityDefinitionId.equals(other.getEntityDefinitionId()))) &&
            ((this.fieldDefinition==null && other.getFieldDefinition()==null) || 
             (this.fieldDefinition!=null &&
              this.fieldDefinition.equals(other.getFieldDefinition()))) &&
            ((this.fieldDefinitionId==null && other.getFieldDefinitionId()==null) || 
             (this.fieldDefinitionId!=null &&
              this.fieldDefinitionId.equals(other.getFieldDefinitionId()))) &&
            ((this.isAccessible==null && other.getIsAccessible()==null) || 
             (this.isAccessible!=null &&
              this.isAccessible.equals(other.getIsAccessible()))) &&
            ((this.isCreatable==null && other.getIsCreatable()==null) || 
             (this.isCreatable!=null &&
              this.isCreatable.equals(other.getIsCreatable()))) &&
            ((this.isUpdatable==null && other.getIsUpdatable()==null) || 
             (this.isUpdatable!=null &&
              this.isUpdatable.equals(other.getIsUpdatable()))) &&
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
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEntityDefinition() != null) {
            _hashCode += getEntityDefinition().hashCode();
        }
        if (getEntityDefinitionId() != null) {
            _hashCode += getEntityDefinitionId().hashCode();
        }
        if (getFieldDefinition() != null) {
            _hashCode += getFieldDefinition().hashCode();
        }
        if (getFieldDefinitionId() != null) {
            _hashCode += getFieldDefinitionId().hashCode();
        }
        if (getIsAccessible() != null) {
            _hashCode += getIsAccessible().hashCode();
        }
        if (getIsCreatable() != null) {
            _hashCode += getIsCreatable().hashCode();
        }
        if (getIsUpdatable() != null) {
            _hashCode += getIsUpdatable().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserFieldAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFieldAccess"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccessible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAccessible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCreatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCreatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpdatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUpdatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
