/**
 * RelationshipInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class RelationshipInfo  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.EntityDefinition childSobject;

    private java.lang.String childSobjectId;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.FieldDefinition field;

    private java.lang.String fieldId;

    private java.lang.Boolean isCascadeDelete;

    private java.lang.Boolean isDeprecatedAndHidden;

    private java.lang.Boolean isRestrictedDelete;

    private java.lang.String junctionIdListName;

    private com.sforce.soap.enterprise.QueryResult relationshipDomains;

    public RelationshipInfo() {
    }

    public RelationshipInfo(
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
           com.sforce.soap.enterprise.QueryResult relationshipDomains) {
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
        this.relationshipDomains = relationshipDomains;
    }


    /**
     * Gets the childSobject value for this RelationshipInfo.
     * 
     * @return childSobject
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getChildSobject() {
        return childSobject;
    }


    /**
     * Sets the childSobject value for this RelationshipInfo.
     * 
     * @param childSobject
     */
    public void setChildSobject(com.sforce.soap.enterprise.sobject.EntityDefinition childSobject) {
        this.childSobject = childSobject;
    }


    /**
     * Gets the childSobjectId value for this RelationshipInfo.
     * 
     * @return childSobjectId
     */
    public java.lang.String getChildSobjectId() {
        return childSobjectId;
    }


    /**
     * Sets the childSobjectId value for this RelationshipInfo.
     * 
     * @param childSobjectId
     */
    public void setChildSobjectId(java.lang.String childSobjectId) {
        this.childSobjectId = childSobjectId;
    }


    /**
     * Gets the durableId value for this RelationshipInfo.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this RelationshipInfo.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the field value for this RelationshipInfo.
     * 
     * @return field
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getField() {
        return field;
    }


    /**
     * Sets the field value for this RelationshipInfo.
     * 
     * @param field
     */
    public void setField(com.sforce.soap.enterprise.sobject.FieldDefinition field) {
        this.field = field;
    }


    /**
     * Gets the fieldId value for this RelationshipInfo.
     * 
     * @return fieldId
     */
    public java.lang.String getFieldId() {
        return fieldId;
    }


    /**
     * Sets the fieldId value for this RelationshipInfo.
     * 
     * @param fieldId
     */
    public void setFieldId(java.lang.String fieldId) {
        this.fieldId = fieldId;
    }


    /**
     * Gets the isCascadeDelete value for this RelationshipInfo.
     * 
     * @return isCascadeDelete
     */
    public java.lang.Boolean getIsCascadeDelete() {
        return isCascadeDelete;
    }


    /**
     * Sets the isCascadeDelete value for this RelationshipInfo.
     * 
     * @param isCascadeDelete
     */
    public void setIsCascadeDelete(java.lang.Boolean isCascadeDelete) {
        this.isCascadeDelete = isCascadeDelete;
    }


    /**
     * Gets the isDeprecatedAndHidden value for this RelationshipInfo.
     * 
     * @return isDeprecatedAndHidden
     */
    public java.lang.Boolean getIsDeprecatedAndHidden() {
        return isDeprecatedAndHidden;
    }


    /**
     * Sets the isDeprecatedAndHidden value for this RelationshipInfo.
     * 
     * @param isDeprecatedAndHidden
     */
    public void setIsDeprecatedAndHidden(java.lang.Boolean isDeprecatedAndHidden) {
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
    }


    /**
     * Gets the isRestrictedDelete value for this RelationshipInfo.
     * 
     * @return isRestrictedDelete
     */
    public java.lang.Boolean getIsRestrictedDelete() {
        return isRestrictedDelete;
    }


    /**
     * Sets the isRestrictedDelete value for this RelationshipInfo.
     * 
     * @param isRestrictedDelete
     */
    public void setIsRestrictedDelete(java.lang.Boolean isRestrictedDelete) {
        this.isRestrictedDelete = isRestrictedDelete;
    }


    /**
     * Gets the junctionIdListName value for this RelationshipInfo.
     * 
     * @return junctionIdListName
     */
    public java.lang.String getJunctionIdListName() {
        return junctionIdListName;
    }


    /**
     * Sets the junctionIdListName value for this RelationshipInfo.
     * 
     * @param junctionIdListName
     */
    public void setJunctionIdListName(java.lang.String junctionIdListName) {
        this.junctionIdListName = junctionIdListName;
    }


    /**
     * Gets the relationshipDomains value for this RelationshipInfo.
     * 
     * @return relationshipDomains
     */
    public com.sforce.soap.enterprise.QueryResult getRelationshipDomains() {
        return relationshipDomains;
    }


    /**
     * Sets the relationshipDomains value for this RelationshipInfo.
     * 
     * @param relationshipDomains
     */
    public void setRelationshipDomains(com.sforce.soap.enterprise.QueryResult relationshipDomains) {
        this.relationshipDomains = relationshipDomains;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelationshipInfo)) return false;
        RelationshipInfo other = (RelationshipInfo) obj;
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
            ((this.relationshipDomains==null && other.getRelationshipDomains()==null) || 
             (this.relationshipDomains!=null &&
              this.relationshipDomains.equals(other.getRelationshipDomains())));
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
        if (getRelationshipDomains() != null) {
            _hashCode += getRelationshipDomains().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationshipInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipInfo"));
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
        elemField.setFieldName("relationshipDomains");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipDomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
