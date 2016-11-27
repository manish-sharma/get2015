/**
 * SearchLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class SearchLayout  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed buttonsDisplayed;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed fieldsDisplayed;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String layoutType;

    public SearchLayout() {
    }

    public SearchLayout(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed buttonsDisplayed,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed fieldsDisplayed,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String layoutType) {
        super(
            fieldsToNull,
            id);
        this.buttonsDisplayed = buttonsDisplayed;
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.fieldsDisplayed = fieldsDisplayed;
        this.label = label;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.layoutType = layoutType;
    }


    /**
     * Gets the buttonsDisplayed value for this SearchLayout.
     * 
     * @return buttonsDisplayed
     */
    public com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed getButtonsDisplayed() {
        return buttonsDisplayed;
    }


    /**
     * Sets the buttonsDisplayed value for this SearchLayout.
     * 
     * @param buttonsDisplayed
     */
    public void setButtonsDisplayed(com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed buttonsDisplayed) {
        this.buttonsDisplayed = buttonsDisplayed;
    }


    /**
     * Gets the durableId value for this SearchLayout.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this SearchLayout.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this SearchLayout.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this SearchLayout.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this SearchLayout.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this SearchLayout.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the fieldsDisplayed value for this SearchLayout.
     * 
     * @return fieldsDisplayed
     */
    public com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed getFieldsDisplayed() {
        return fieldsDisplayed;
    }


    /**
     * Sets the fieldsDisplayed value for this SearchLayout.
     * 
     * @param fieldsDisplayed
     */
    public void setFieldsDisplayed(com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed fieldsDisplayed) {
        this.fieldsDisplayed = fieldsDisplayed;
    }


    /**
     * Gets the label value for this SearchLayout.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this SearchLayout.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedBy value for this SearchLayout.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this SearchLayout.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this SearchLayout.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this SearchLayout.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this SearchLayout.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SearchLayout.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the layoutType value for this SearchLayout.
     * 
     * @return layoutType
     */
    public java.lang.String getLayoutType() {
        return layoutType;
    }


    /**
     * Sets the layoutType value for this SearchLayout.
     * 
     * @param layoutType
     */
    public void setLayoutType(java.lang.String layoutType) {
        this.layoutType = layoutType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchLayout)) return false;
        SearchLayout other = (SearchLayout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.buttonsDisplayed==null && other.getButtonsDisplayed()==null) || 
             (this.buttonsDisplayed!=null &&
              this.buttonsDisplayed.equals(other.getButtonsDisplayed()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.entityDefinition==null && other.getEntityDefinition()==null) || 
             (this.entityDefinition!=null &&
              this.entityDefinition.equals(other.getEntityDefinition()))) &&
            ((this.entityDefinitionId==null && other.getEntityDefinitionId()==null) || 
             (this.entityDefinitionId!=null &&
              this.entityDefinitionId.equals(other.getEntityDefinitionId()))) &&
            ((this.fieldsDisplayed==null && other.getFieldsDisplayed()==null) || 
             (this.fieldsDisplayed!=null &&
              this.fieldsDisplayed.equals(other.getFieldsDisplayed()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.layoutType==null && other.getLayoutType()==null) || 
             (this.layoutType!=null &&
              this.layoutType.equals(other.getLayoutType())));
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
        if (getButtonsDisplayed() != null) {
            _hashCode += getButtonsDisplayed().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEntityDefinition() != null) {
            _hashCode += getEntityDefinition().hashCode();
        }
        if (getEntityDefinitionId() != null) {
            _hashCode += getEntityDefinitionId().hashCode();
        }
        if (getFieldsDisplayed() != null) {
            _hashCode += getFieldsDisplayed().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLayoutType() != null) {
            _hashCode += getLayoutType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchLayout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SearchLayout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonsDisplayed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ButtonsDisplayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutButtonsDisplayed"));
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
        elemField.setFieldName("fieldsDisplayed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldsDisplayed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutFieldsDisplayed"));
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
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LayoutType"));
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
