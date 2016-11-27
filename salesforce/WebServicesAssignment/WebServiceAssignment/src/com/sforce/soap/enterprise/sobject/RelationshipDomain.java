/**
 * RelationshipDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class RelationshipDomain  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.EntityDefinition childSobject;

    private java.lang.String childSobjectId;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.FieldDefinition field;

    private java.lang.String fieldId;

    private java.lang.Boolean isCascadeDelete;

    private java.lang.Boolean isDeprecatedAndHidden;

    private java.lang.Boolean isRestrictedDelete;

    private java.lang.String junctionIdListName;

    private com.sforce.soap.enterprise.sobject.EntityDefinition parentSobject;

    private java.lang.String parentSobjectId;

    private com.sforce.soap.enterprise.sobject.RelationshipInfo relationshipInfo;

    private java.lang.String relationshipInfoId;

    private java.lang.String relationshipName;

    public RelationshipDomain() {
    }

    public RelationshipDomain(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.EntityDefinition childSobject,
           java.lang.String childSobjectId,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.FieldDefinition field,
           java.lang.String fieldId,
           java.lang.Boolean isCascadeDelete,
           java.lang.Boolean isDeprecatedAndHidden,
           java.lang.Boolean isRestrictedDelete,
           java.lang.String junctionIdListName,
           com.sforce.soap.enterprise.sobject.EntityDefinition parentSobject,
           java.lang.String parentSobjectId,
           com.sforce.soap.enterprise.sobject.RelationshipInfo relationshipInfo,
           java.lang.String relationshipInfoId,
           java.lang.String relationshipName) {
        super(
            fieldsToNull,
            id);
        this.childSobject = childSobject;
        this.childSobjectId = childSobjectId;
        this.durableId = durableId;
        this.field = field;
        this.fieldId = fieldId;
        this.isCascadeDelete = isCascadeDelete;
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
        this.isRestrictedDelete = isRestrictedDelete;
        this.junctionIdListName = junctionIdListName;
        this.parentSobject = parentSobject;
        this.parentSobjectId = parentSobjectId;
        this.relationshipInfo = relationshipInfo;
        this.relationshipInfoId = relationshipInfoId;
        this.relationshipName = relationshipName;
    }


    /**
     * Gets the childSobject value for this RelationshipDomain.
     * 
     * @return childSobject
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getChildSobject() {
        return childSobject;
    }


    /**
     * Sets the childSobject value for this RelationshipDomain.
     * 
     * @param childSobject
     */
    public void setChildSobject(com.sforce.soap.enterprise.sobject.EntityDefinition childSobject) {
        this.childSobject = childSobject;
    }


    /**
     * Gets the childSobjectId value for this RelationshipDomain.
     * 
     * @return childSobjectId
     */
    public java.lang.String getChildSobjectId() {
        return childSobjectId;
    }


    /**
     * Sets the childSobjectId value for this RelationshipDomain.
     * 
     * @param childSobjectId
     */
    public void setChildSobjectId(java.lang.String childSobjectId) {
        this.childSobjectId = childSobjectId;
    }


    /**
     * Gets the durableId value for this RelationshipDomain.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this RelationshipDomain.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the field value for this RelationshipDomain.
     * 
     * @return field
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getField() {
        return field;
    }


    /**
     * Sets the field value for this RelationshipDomain.
     * 
     * @param field
     */
    public void setField(com.sforce.soap.enterprise.sobject.FieldDefinition field) {
        this.field = field;
    }


    /**
     * Gets the fieldId value for this RelationshipDomain.
     * 
     * @return fieldId
     */
    public java.lang.String getFieldId() {
        return fieldId;
    }


    /**
     * Sets the fieldId value for this RelationshipDomain.
     * 
     * @param fieldId
     */
    public void setFieldId(java.lang.String fieldId) {
        this.fieldId = fieldId;
    }


    /**
     * Gets the isCascadeDelete value for this RelationshipDomain.
     * 
     * @return isCascadeDelete
     */
    public java.lang.Boolean getIsCascadeDelete() {
        return isCascadeDelete;
    }


    /**
     * Sets the isCascadeDelete value for this RelationshipDomain.
     * 
     * @param isCascadeDelete
     */
    public void setIsCascadeDelete(java.lang.Boolean isCascadeDelete) {
        this.isCascadeDelete = isCascadeDelete;
    }


    /**
     * Gets the isDeprecatedAndHidden value for this RelationshipDomain.
     * 
     * @return isDeprecatedAndHidden
     */
    public java.lang.Boolean getIsDeprecatedAndHidden() {
        return isDeprecatedAndHidden;
    }


    /**
     * Sets the isDeprecatedAndHidden value for this RelationshipDomain.
     * 
     * @param isDeprecatedAndHidden
     */
    public void setIsDeprecatedAndHidden(java.lang.Boolean isDeprecatedAndHidden) {
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
    }


    /**
     * Gets the isRestrictedDelete value for this RelationshipDomain.
     * 
     * @return isRestrictedDelete
     */
    public java.lang.Boolean getIsRestrictedDelete() {
        return isRestrictedDelete;
    }


    /**
     * Sets the isRestrictedDelete value for this RelationshipDomain.
     * 
     * @param isRestrictedDelete
     */
    public void setIsRestrictedDelete(java.lang.Boolean isRestrictedDelete) {
        this.isRestrictedDelete = isRestrictedDelete;
    }


    /**
     * Gets the junctionIdListName value for this RelationshipDomain.
     * 
     * @return junctionIdListName
     */
    public java.lang.String getJunctionIdListName() {
        return junctionIdListName;
    }


    /**
     * Sets the junctionIdListName value for this RelationshipDomain.
     * 
     * @param junctionIdListName
     */
    public void setJunctionIdListName(java.lang.String junctionIdListName) {
        this.junctionIdListName = junctionIdListName;
    }


    /**
     * Gets the parentSobject value for this RelationshipDomain.
     * 
     * @return parentSobject
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getParentSobject() {
        return parentSobject;
    }


    /**
     * Sets the parentSobject value for this RelationshipDomain.
     * 
     * @param parentSobject
     */
    public void setParentSobject(com.sforce.soap.enterprise.sobject.EntityDefinition parentSobject) {
        this.parentSobject = parentSobject;
    }


    /**
     * Gets the parentSobjectId value for this RelationshipDomain.
     * 
     * @return parentSobjectId
     */
    public java.lang.String getParentSobjectId() {
        return parentSobjectId;
    }


    /**
     * Sets the parentSobjectId value for this RelationshipDomain.
     * 
     * @param parentSobjectId
     */
    public void setParentSobjectId(java.lang.String parentSobjectId) {
        this.parentSobjectId = parentSobjectId;
    }


    /**
     * Gets the relationshipInfo value for this RelationshipDomain.
     * 
     * @return relationshipInfo
     */
    public com.sforce.soap.enterprise.sobject.RelationshipInfo getRelationshipInfo() {
        return relationshipInfo;
    }


    /**
     * Sets the relationshipInfo value for this RelationshipDomain.
     * 
     * @param relationshipInfo
     */
    public void setRelationshipInfo(com.sforce.soap.enterprise.sobject.RelationshipInfo relationshipInfo) {
        this.relationshipInfo = relationshipInfo;
    }


    /**
     * Gets the relationshipInfoId value for this RelationshipDomain.
     * 
     * @return relationshipInfoId
     */
    public java.lang.String getRelationshipInfoId() {
        return relationshipInfoId;
    }


    /**
     * Sets the relationshipInfoId value for this RelationshipDomain.
     * 
     * @param relationshipInfoId
     */
    public void setRelationshipInfoId(java.lang.String relationshipInfoId) {
        this.relationshipInfoId = relationshipInfoId;
    }


    /**
     * Gets the relationshipName value for this RelationshipDomain.
     * 
     * @return relationshipName
     */
    public java.lang.String getRelationshipName() {
        return relationshipName;
    }


    /**
     * Sets the relationshipName value for this RelationshipDomain.
     * 
     * @param relationshipName
     */
    public void setRelationshipName(java.lang.String relationshipName) {
        this.relationshipName = relationshipName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationshipDomain)) return false;
        RelationshipDomain other = (RelationshipDomain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.childSobject==null && other.getChildSobject()==null) || 
             (this.childSobject!=null &&
              this.childSobject.equals(other.getChildSobject()))) &&
            ((this.childSobjectId==null && other.getChildSobjectId()==null) || 
             (this.childSobjectId!=null &&
              this.childSobjectId.equals(other.getChildSobjectId()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.fieldId==null && other.getFieldId()==null) || 
             (this.fieldId!=null &&
              this.fieldId.equals(other.getFieldId()))) &&
            ((this.isCascadeDelete==null && other.getIsCascadeDelete()==null) || 
             (this.isCascadeDelete!=null &&
              this.isCascadeDelete.equals(other.getIsCascadeDelete()))) &&
            ((this.isDeprecatedAndHidden==null && other.getIsDeprecatedAndHidden()==null) || 
             (this.isDeprecatedAndHidden!=null &&
              this.isDeprecatedAndHidden.equals(other.getIsDeprecatedAndHidden()))) &&
            ((this.isRestrictedDelete==null && other.getIsRestrictedDelete()==null) || 
             (this.isRestrictedDelete!=null &&
              this.isRestrictedDelete.equals(other.getIsRestrictedDelete()))) &&
            ((this.junctionIdListName==null && other.getJunctionIdListName()==null) || 
             (this.junctionIdListName!=null &&
              this.junctionIdListName.equals(other.getJunctionIdListName()))) &&
            ((this.parentSobject==null && other.getParentSobject()==null) || 
             (this.parentSobject!=null &&
              this.parentSobject.equals(other.getParentSobject()))) &&
            ((this.parentSobjectId==null && other.getParentSobjectId()==null) || 
             (this.parentSobjectId!=null &&
              this.parentSobjectId.equals(other.getParentSobjectId()))) &&
            ((this.relationshipInfo==null && other.getRelationshipInfo()==null) || 
             (this.relationshipInfo!=null &&
              this.relationshipInfo.equals(other.getRelationshipInfo()))) &&
            ((this.relationshipInfoId==null && other.getRelationshipInfoId()==null) || 
             (this.relationshipInfoId!=null &&
              this.relationshipInfoId.equals(other.getRelationshipInfoId()))) &&
            ((this.relationshipName==null && other.getRelationshipName()==null) || 
             (this.relationshipName!=null &&
              this.relationshipName.equals(other.getRelationshipName())));
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
        if (getChildSobject() != null) {
            _hashCode += getChildSobject().hashCode();
        }
        if (getChildSobjectId() != null) {
            _hashCode += getChildSobjectId().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getFieldId() != null) {
            _hashCode += getFieldId().hashCode();
        }
        if (getIsCascadeDelete() != null) {
            _hashCode += getIsCascadeDelete().hashCode();
        }
        if (getIsDeprecatedAndHidden() != null) {
            _hashCode += getIsDeprecatedAndHidden().hashCode();
        }
        if (getIsRestrictedDelete() != null) {
            _hashCode += getIsRestrictedDelete().hashCode();
        }
        if (getJunctionIdListName() != null) {
            _hashCode += getJunctionIdListName().hashCode();
        }
        if (getParentSobject() != null) {
            _hashCode += getParentSobject().hashCode();
        }
        if (getParentSobjectId() != null) {
            _hashCode += getParentSobjectId().hashCode();
        }
        if (getRelationshipInfo() != null) {
            _hashCode += getRelationshipInfo().hashCode();
        }
        if (getRelationshipInfoId() != null) {
            _hashCode += getRelationshipInfoId().hashCode();
        }
        if (getRelationshipName() != null) {
            _hashCode += getRelationshipName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationshipDomain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipDomain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSobject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChildSobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childSobjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChildSobjectId"));
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
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Field"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCascadeDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCascadeDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeprecatedAndHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeprecatedAndHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRestrictedDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRestrictedDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("junctionIdListName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JunctionIdListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentSobject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentSobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentSobjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentSobjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipName"));
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
