/**
 * ListViewChartInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ListViewChartInstance  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String aggregateField;

    private java.lang.String aggregateType;

    private java.lang.String chartType;

    private java.lang.String dataQuery;

    private java.lang.String developerName;

    private java.lang.String externalId;

    private java.lang.String groupingField;

    private java.lang.Boolean isDeletable;

    private java.lang.Boolean isEditable;

    private java.lang.Boolean isLastViewed;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.ListViewChart listViewChart;

    private java.lang.String listViewChartId;

    private com.sforce.soap.enterprise.sobject.ListView listViewContext;

    private java.lang.String listViewContextId;

    private java.lang.String sourceEntity;

    public ListViewChartInstance() {
    }

    public ListViewChartInstance(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String aggregateField,
           java.lang.String aggregateType,
           java.lang.String chartType,
           java.lang.String dataQuery,
           java.lang.String developerName,
           java.lang.String externalId,
           java.lang.String groupingField,
           java.lang.Boolean isDeletable,
           java.lang.Boolean isEditable,
           java.lang.Boolean isLastViewed,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.ListViewChart listViewChart,
           java.lang.String listViewChartId,
           com.sforce.soap.enterprise.sobject.ListView listViewContext,
           java.lang.String listViewContextId,
           java.lang.String sourceEntity) {
        super(
            fieldsToNull,
            id);
        this.aggregateField = aggregateField;
        this.aggregateType = aggregateType;
        this.chartType = chartType;
        this.dataQuery = dataQuery;
        this.developerName = developerName;
        this.externalId = externalId;
        this.groupingField = groupingField;
        this.isDeletable = isDeletable;
        this.isEditable = isEditable;
        this.isLastViewed = isLastViewed;
        this.label = label;
        this.listViewChart = listViewChart;
        this.listViewChartId = listViewChartId;
        this.listViewContext = listViewContext;
        this.listViewContextId = listViewContextId;
        this.sourceEntity = sourceEntity;
    }


    /**
     * Gets the aggregateField value for this ListViewChartInstance.
     * 
     * @return aggregateField
     */
    public java.lang.String getAggregateField() {
        return aggregateField;
    }


    /**
     * Sets the aggregateField value for this ListViewChartInstance.
     * 
     * @param aggregateField
     */
    public void setAggregateField(java.lang.String aggregateField) {
        this.aggregateField = aggregateField;
    }


    /**
     * Gets the aggregateType value for this ListViewChartInstance.
     * 
     * @return aggregateType
     */
    public java.lang.String getAggregateType() {
        return aggregateType;
    }


    /**
     * Sets the aggregateType value for this ListViewChartInstance.
     * 
     * @param aggregateType
     */
    public void setAggregateType(java.lang.String aggregateType) {
        this.aggregateType = aggregateType;
    }


    /**
     * Gets the chartType value for this ListViewChartInstance.
     * 
     * @return chartType
     */
    public java.lang.String getChartType() {
        return chartType;
    }


    /**
     * Sets the chartType value for this ListViewChartInstance.
     * 
     * @param chartType
     */
    public void setChartType(java.lang.String chartType) {
        this.chartType = chartType;
    }


    /**
     * Gets the dataQuery value for this ListViewChartInstance.
     * 
     * @return dataQuery
     */
    public java.lang.String getDataQuery() {
        return dataQuery;
    }


    /**
     * Sets the dataQuery value for this ListViewChartInstance.
     * 
     * @param dataQuery
     */
    public void setDataQuery(java.lang.String dataQuery) {
        this.dataQuery = dataQuery;
    }


    /**
     * Gets the developerName value for this ListViewChartInstance.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this ListViewChartInstance.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the externalId value for this ListViewChartInstance.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ListViewChartInstance.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the groupingField value for this ListViewChartInstance.
     * 
     * @return groupingField
     */
    public java.lang.String getGroupingField() {
        return groupingField;
    }


    /**
     * Sets the groupingField value for this ListViewChartInstance.
     * 
     * @param groupingField
     */
    public void setGroupingField(java.lang.String groupingField) {
        this.groupingField = groupingField;
    }


    /**
     * Gets the isDeletable value for this ListViewChartInstance.
     * 
     * @return isDeletable
     */
    public java.lang.Boolean getIsDeletable() {
        return isDeletable;
    }


    /**
     * Sets the isDeletable value for this ListViewChartInstance.
     * 
     * @param isDeletable
     */
    public void setIsDeletable(java.lang.Boolean isDeletable) {
        this.isDeletable = isDeletable;
    }


    /**
     * Gets the isEditable value for this ListViewChartInstance.
     * 
     * @return isEditable
     */
    public java.lang.Boolean getIsEditable() {
        return isEditable;
    }


    /**
     * Sets the isEditable value for this ListViewChartInstance.
     * 
     * @param isEditable
     */
    public void setIsEditable(java.lang.Boolean isEditable) {
        this.isEditable = isEditable;
    }


    /**
     * Gets the isLastViewed value for this ListViewChartInstance.
     * 
     * @return isLastViewed
     */
    public java.lang.Boolean getIsLastViewed() {
        return isLastViewed;
    }


    /**
     * Sets the isLastViewed value for this ListViewChartInstance.
     * 
     * @param isLastViewed
     */
    public void setIsLastViewed(java.lang.Boolean isLastViewed) {
        this.isLastViewed = isLastViewed;
    }


    /**
     * Gets the label value for this ListViewChartInstance.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ListViewChartInstance.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the listViewChart value for this ListViewChartInstance.
     * 
     * @return listViewChart
     */
    public com.sforce.soap.enterprise.sobject.ListViewChart getListViewChart() {
        return listViewChart;
    }


    /**
     * Sets the listViewChart value for this ListViewChartInstance.
     * 
     * @param listViewChart
     */
    public void setListViewChart(com.sforce.soap.enterprise.sobject.ListViewChart listViewChart) {
        this.listViewChart = listViewChart;
    }


    /**
     * Gets the listViewChartId value for this ListViewChartInstance.
     * 
     * @return listViewChartId
     */
    public java.lang.String getListViewChartId() {
        return listViewChartId;
    }


    /**
     * Sets the listViewChartId value for this ListViewChartInstance.
     * 
     * @param listViewChartId
     */
    public void setListViewChartId(java.lang.String listViewChartId) {
        this.listViewChartId = listViewChartId;
    }


    /**
     * Gets the listViewContext value for this ListViewChartInstance.
     * 
     * @return listViewContext
     */
    public com.sforce.soap.enterprise.sobject.ListView getListViewContext() {
        return listViewContext;
    }


    /**
     * Sets the listViewContext value for this ListViewChartInstance.
     * 
     * @param listViewContext
     */
    public void setListViewContext(com.sforce.soap.enterprise.sobject.ListView listViewContext) {
        this.listViewContext = listViewContext;
    }


    /**
     * Gets the listViewContextId value for this ListViewChartInstance.
     * 
     * @return listViewContextId
     */
    public java.lang.String getListViewContextId() {
        return listViewContextId;
    }


    /**
     * Sets the listViewContextId value for this ListViewChartInstance.
     * 
     * @param listViewContextId
     */
    public void setListViewContextId(java.lang.String listViewContextId) {
        this.listViewContextId = listViewContextId;
    }


    /**
     * Gets the sourceEntity value for this ListViewChartInstance.
     * 
     * @return sourceEntity
     */
    public java.lang.String getSourceEntity() {
        return sourceEntity;
    }


    /**
     * Sets the sourceEntity value for this ListViewChartInstance.
     * 
     * @param sourceEntity
     */
    public void setSourceEntity(java.lang.String sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListViewChartInstance)) return false;
        ListViewChartInstance other = (ListViewChartInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aggregateField==null && other.getAggregateField()==null) || 
             (this.aggregateField!=null &&
              this.aggregateField.equals(other.getAggregateField()))) &&
            ((this.aggregateType==null && other.getAggregateType()==null) || 
             (this.aggregateType!=null &&
              this.aggregateType.equals(other.getAggregateType()))) &&
            ((this.chartType==null && other.getChartType()==null) || 
             (this.chartType!=null &&
              this.chartType.equals(other.getChartType()))) &&
            ((this.dataQuery==null && other.getDataQuery()==null) || 
             (this.dataQuery!=null &&
              this.dataQuery.equals(other.getDataQuery()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.groupingField==null && other.getGroupingField()==null) || 
             (this.groupingField!=null &&
              this.groupingField.equals(other.getGroupingField()))) &&
            ((this.isDeletable==null && other.getIsDeletable()==null) || 
             (this.isDeletable!=null &&
              this.isDeletable.equals(other.getIsDeletable()))) &&
            ((this.isEditable==null && other.getIsEditable()==null) || 
             (this.isEditable!=null &&
              this.isEditable.equals(other.getIsEditable()))) &&
            ((this.isLastViewed==null && other.getIsLastViewed()==null) || 
             (this.isLastViewed!=null &&
              this.isLastViewed.equals(other.getIsLastViewed()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.listViewChart==null && other.getListViewChart()==null) || 
             (this.listViewChart!=null &&
              this.listViewChart.equals(other.getListViewChart()))) &&
            ((this.listViewChartId==null && other.getListViewChartId()==null) || 
             (this.listViewChartId!=null &&
              this.listViewChartId.equals(other.getListViewChartId()))) &&
            ((this.listViewContext==null && other.getListViewContext()==null) || 
             (this.listViewContext!=null &&
              this.listViewContext.equals(other.getListViewContext()))) &&
            ((this.listViewContextId==null && other.getListViewContextId()==null) || 
             (this.listViewContextId!=null &&
              this.listViewContextId.equals(other.getListViewContextId()))) &&
            ((this.sourceEntity==null && other.getSourceEntity()==null) || 
             (this.sourceEntity!=null &&
              this.sourceEntity.equals(other.getSourceEntity())));
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
        if (getAggregateField() != null) {
            _hashCode += getAggregateField().hashCode();
        }
        if (getAggregateType() != null) {
            _hashCode += getAggregateType().hashCode();
        }
        if (getChartType() != null) {
            _hashCode += getChartType().hashCode();
        }
        if (getDataQuery() != null) {
            _hashCode += getDataQuery().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getGroupingField() != null) {
            _hashCode += getGroupingField().hashCode();
        }
        if (getIsDeletable() != null) {
            _hashCode += getIsDeletable().hashCode();
        }
        if (getIsEditable() != null) {
            _hashCode += getIsEditable().hashCode();
        }
        if (getIsLastViewed() != null) {
            _hashCode += getIsLastViewed().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getListViewChart() != null) {
            _hashCode += getListViewChart().hashCode();
        }
        if (getListViewChartId() != null) {
            _hashCode += getListViewChartId().hashCode();
        }
        if (getListViewContext() != null) {
            _hashCode += getListViewContext().hashCode();
        }
        if (getListViewContextId() != null) {
            _hashCode += getListViewContextId().hashCode();
        }
        if (getSourceEntity() != null) {
            _hashCode += getSourceEntity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListViewChartInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChartInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AggregateField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AggregateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chartType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChartType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataQuery"));
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupingField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupingField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isLastViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsLastViewed"));
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
        elemField.setFieldName("listViewChart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChart"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listViewChartId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChartId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listViewContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListView"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listViewContextId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewContextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SourceEntity"));
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
