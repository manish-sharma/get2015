/**
 * UserEntityAccess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserEntityAccess  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private java.lang.Boolean isActivateable;

    private java.lang.Boolean isCreatable;

    private java.lang.Boolean isDeletable;

    private java.lang.Boolean isEditable;

    private java.lang.Boolean isFlsUpdatable;

    private java.lang.Boolean isMergeable;

    private java.lang.Boolean isReadable;

    private java.lang.Boolean isUndeletable;

    private java.lang.Boolean isUpdatable;

    private com.sforce.soap.enterprise.sobject.User user;

    private java.lang.String userId;

    public UserEntityAccess() {
    }

    public UserEntityAccess(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           java.lang.Boolean isActivateable,
           java.lang.Boolean isCreatable,
           java.lang.Boolean isDeletable,
           java.lang.Boolean isEditable,
           java.lang.Boolean isFlsUpdatable,
           java.lang.Boolean isMergeable,
           java.lang.Boolean isReadable,
           java.lang.Boolean isUndeletable,
           java.lang.Boolean isUpdatable,
           com.sforce.soap.enterprise.sobject.User user,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.isActivateable = isActivateable;
        this.isCreatable = isCreatable;
        this.isDeletable = isDeletable;
        this.isEditable = isEditable;
        this.isFlsUpdatable = isFlsUpdatable;
        this.isMergeable = isMergeable;
        this.isReadable = isReadable;
        this.isUndeletable = isUndeletable;
        this.isUpdatable = isUpdatable;
        this.user = user;
        this.userId = userId;
    }


    /**
     * Gets the durableId value for this UserEntityAccess.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this UserEntityAccess.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this UserEntityAccess.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this UserEntityAccess.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this UserEntityAccess.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this UserEntityAccess.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the isActivateable value for this UserEntityAccess.
     * 
     * @return isActivateable
     */
    public java.lang.Boolean getIsActivateable() {
        return isActivateable;
    }


    /**
     * Sets the isActivateable value for this UserEntityAccess.
     * 
     * @param isActivateable
     */
    public void setIsActivateable(java.lang.Boolean isActivateable) {
        this.isActivateable = isActivateable;
    }


    /**
     * Gets the isCreatable value for this UserEntityAccess.
     * 
     * @return isCreatable
     */
    public java.lang.Boolean getIsCreatable() {
        return isCreatable;
    }


    /**
     * Sets the isCreatable value for this UserEntityAccess.
     * 
     * @param isCreatable
     */
    public void setIsCreatable(java.lang.Boolean isCreatable) {
        this.isCreatable = isCreatable;
    }


    /**
     * Gets the isDeletable value for this UserEntityAccess.
     * 
     * @return isDeletable
     */
    public java.lang.Boolean getIsDeletable() {
        return isDeletable;
    }


    /**
     * Sets the isDeletable value for this UserEntityAccess.
     * 
     * @param isDeletable
     */
    public void setIsDeletable(java.lang.Boolean isDeletable) {
        this.isDeletable = isDeletable;
    }


    /**
     * Gets the isEditable value for this UserEntityAccess.
     * 
     * @return isEditable
     */
    public java.lang.Boolean getIsEditable() {
        return isEditable;
    }


    /**
     * Sets the isEditable value for this UserEntityAccess.
     * 
     * @param isEditable
     */
    public void setIsEditable(java.lang.Boolean isEditable) {
        this.isEditable = isEditable;
    }


    /**
     * Gets the isFlsUpdatable value for this UserEntityAccess.
     * 
     * @return isFlsUpdatable
     */
    public java.lang.Boolean getIsFlsUpdatable() {
        return isFlsUpdatable;
    }


    /**
     * Sets the isFlsUpdatable value for this UserEntityAccess.
     * 
     * @param isFlsUpdatable
     */
    public void setIsFlsUpdatable(java.lang.Boolean isFlsUpdatable) {
        this.isFlsUpdatable = isFlsUpdatable;
    }


    /**
     * Gets the isMergeable value for this UserEntityAccess.
     * 
     * @return isMergeable
     */
    public java.lang.Boolean getIsMergeable() {
        return isMergeable;
    }


    /**
     * Sets the isMergeable value for this UserEntityAccess.
     * 
     * @param isMergeable
     */
    public void setIsMergeable(java.lang.Boolean isMergeable) {
        this.isMergeable = isMergeable;
    }


    /**
     * Gets the isReadable value for this UserEntityAccess.
     * 
     * @return isReadable
     */
    public java.lang.Boolean getIsReadable() {
        return isReadable;
    }


    /**
     * Sets the isReadable value for this UserEntityAccess.
     * 
     * @param isReadable
     */
    public void setIsReadable(java.lang.Boolean isReadable) {
        this.isReadable = isReadable;
    }


    /**
     * Gets the isUndeletable value for this UserEntityAccess.
     * 
     * @return isUndeletable
     */
    public java.lang.Boolean getIsUndeletable() {
        return isUndeletable;
    }


    /**
     * Sets the isUndeletable value for this UserEntityAccess.
     * 
     * @param isUndeletable
     */
    public void setIsUndeletable(java.lang.Boolean isUndeletable) {
        this.isUndeletable = isUndeletable;
    }


    /**
     * Gets the isUpdatable value for this UserEntityAccess.
     * 
     * @return isUpdatable
     */
    public java.lang.Boolean getIsUpdatable() {
        return isUpdatable;
    }


    /**
     * Sets the isUpdatable value for this UserEntityAccess.
     * 
     * @param isUpdatable
     */
    public void setIsUpdatable(java.lang.Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }


    /**
     * Gets the user value for this UserEntityAccess.
     * 
     * @return user
     */
    public com.sforce.soap.enterprise.sobject.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this UserEntityAccess.
     * 
     * @param user
     */
    public void setUser(com.sforce.soap.enterprise.sobject.User user) {
        this.user = user;
    }


    /**
     * Gets the userId value for this UserEntityAccess.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserEntityAccess.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserEntityAccess)) return false;
        UserEntityAccess other = (UserEntityAccess) obj;
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
            ((this.isActivateable==null && other.getIsActivateable()==null) || 
             (this.isActivateable!=null &&
              this.isActivateable.equals(other.getIsActivateable()))) &&
            ((this.isCreatable==null && other.getIsCreatable()==null) || 
             (this.isCreatable!=null &&
              this.isCreatable.equals(other.getIsCreatable()))) &&
            ((this.isDeletable==null && other.getIsDeletable()==null) || 
             (this.isDeletable!=null &&
              this.isDeletable.equals(other.getIsDeletable()))) &&
            ((this.isEditable==null && other.getIsEditable()==null) || 
             (this.isEditable!=null &&
              this.isEditable.equals(other.getIsEditable()))) &&
            ((this.isFlsUpdatable==null && other.getIsFlsUpdatable()==null) || 
             (this.isFlsUpdatable!=null &&
              this.isFlsUpdatable.equals(other.getIsFlsUpdatable()))) &&
            ((this.isMergeable==null && other.getIsMergeable()==null) || 
             (this.isMergeable!=null &&
              this.isMergeable.equals(other.getIsMergeable()))) &&
            ((this.isReadable==null && other.getIsReadable()==null) || 
             (this.isReadable!=null &&
              this.isReadable.equals(other.getIsReadable()))) &&
            ((this.isUndeletable==null && other.getIsUndeletable()==null) || 
             (this.isUndeletable!=null &&
              this.isUndeletable.equals(other.getIsUndeletable()))) &&
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
        if (getIsActivateable() != null) {
            _hashCode += getIsActivateable().hashCode();
        }
        if (getIsCreatable() != null) {
            _hashCode += getIsCreatable().hashCode();
        }
        if (getIsDeletable() != null) {
            _hashCode += getIsDeletable().hashCode();
        }
        if (getIsEditable() != null) {
            _hashCode += getIsEditable().hashCode();
        }
        if (getIsFlsUpdatable() != null) {
            _hashCode += getIsFlsUpdatable().hashCode();
        }
        if (getIsMergeable() != null) {
            _hashCode += getIsMergeable().hashCode();
        }
        if (getIsReadable() != null) {
            _hashCode += getIsReadable().hashCode();
        }
        if (getIsUndeletable() != null) {
            _hashCode += getIsUndeletable().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserEntityAccess.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserEntityAccess"));
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
        elemField.setFieldName("isActivateable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsActivateable"));
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
        elemField.setFieldName("isDeletable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeletable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEditable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEditable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlsUpdatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlsUpdatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMergeable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsMergeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReadable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReadable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUndeletable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUndeletable"));
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
