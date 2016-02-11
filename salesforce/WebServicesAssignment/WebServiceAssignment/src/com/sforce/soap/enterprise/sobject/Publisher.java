/**
 * Publisher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Publisher  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String durableId;

    private com.sforce.soap.enterprise.QueryResult installedEntityDefinitions;

    private com.sforce.soap.enterprise.QueryResult installedFieldDefinitions;

    private java.lang.Boolean isSalesforce;

    private java.lang.Integer majorVersion;

    private java.lang.Integer minorVersion;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    public Publisher() {
    }

    public Publisher(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String durableId,
           com.sforce.soap.enterprise.QueryResult installedEntityDefinitions,
           com.sforce.soap.enterprise.QueryResult installedFieldDefinitions,
           java.lang.Boolean isSalesforce,
           java.lang.Integer majorVersion,
           java.lang.Integer minorVersion,
           java.lang.String name,
           java.lang.String namespacePrefix) {
        super(
            fieldsToNull,
            id);
        this.durableId = durableId;
        this.installedEntityDefinitions = installedEntityDefinitions;
        this.installedFieldDefinitions = installedFieldDefinitions;
        this.isSalesforce = isSalesforce;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the durableId value for this Publisher.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this Publisher.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the installedEntityDefinitions value for this Publisher.
     * 
     * @return installedEntityDefinitions
     */
    public com.sforce.soap.enterprise.QueryResult getInstalledEntityDefinitions() {
        return installedEntityDefinitions;
    }


    /**
     * Sets the installedEntityDefinitions value for this Publisher.
     * 
     * @param installedEntityDefinitions
     */
    public void setInstalledEntityDefinitions(com.sforce.soap.enterprise.QueryResult installedEntityDefinitions) {
        this.installedEntityDefinitions = installedEntityDefinitions;
    }


    /**
     * Gets the installedFieldDefinitions value for this Publisher.
     * 
     * @return installedFieldDefinitions
     */
    public com.sforce.soap.enterprise.QueryResult getInstalledFieldDefinitions() {
        return installedFieldDefinitions;
    }


    /**
     * Sets the installedFieldDefinitions value for this Publisher.
     * 
     * @param installedFieldDefinitions
     */
    public void setInstalledFieldDefinitions(com.sforce.soap.enterprise.QueryResult installedFieldDefinitions) {
        this.installedFieldDefinitions = installedFieldDefinitions;
    }


    /**
     * Gets the isSalesforce value for this Publisher.
     * 
     * @return isSalesforce
     */
    public java.lang.Boolean getIsSalesforce() {
        return isSalesforce;
    }


    /**
     * Sets the isSalesforce value for this Publisher.
     * 
     * @param isSalesforce
     */
    public void setIsSalesforce(java.lang.Boolean isSalesforce) {
        this.isSalesforce = isSalesforce;
    }


    /**
     * Gets the majorVersion value for this Publisher.
     * 
     * @return majorVersion
     */
    public java.lang.Integer getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this Publisher.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(java.lang.Integer majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this Publisher.
     * 
     * @return minorVersion
     */
    public java.lang.Integer getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this Publisher.
     * 
     * @param minorVersion
     */
    public void setMinorVersion(java.lang.Integer minorVersion) {
        this.minorVersion = minorVersion;
    }


    /**
     * Gets the name value for this Publisher.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Publisher.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this Publisher.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this Publisher.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Publisher)) return false;
        Publisher other = (Publisher) obj;
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
            ((this.installedEntityDefinitions==null && other.getInstalledEntityDefinitions()==null) || 
             (this.installedEntityDefinitions!=null &&
              this.installedEntityDefinitions.equals(other.getInstalledEntityDefinitions()))) &&
            ((this.installedFieldDefinitions==null && other.getInstalledFieldDefinitions()==null) || 
             (this.installedFieldDefinitions!=null &&
              this.installedFieldDefinitions.equals(other.getInstalledFieldDefinitions()))) &&
            ((this.isSalesforce==null && other.getIsSalesforce()==null) || 
             (this.isSalesforce!=null &&
              this.isSalesforce.equals(other.getIsSalesforce()))) &&
            ((this.majorVersion==null && other.getMajorVersion()==null) || 
             (this.majorVersion!=null &&
              this.majorVersion.equals(other.getMajorVersion()))) &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix())));
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
        if (getInstalledEntityDefinitions() != null) {
            _hashCode += getInstalledEntityDefinitions().hashCode();
        }
        if (getInstalledFieldDefinitions() != null) {
            _hashCode += getInstalledFieldDefinitions().hashCode();
        }
        if (getIsSalesforce() != null) {
            _hashCode += getIsSalesforce().hashCode();
        }
        if (getMajorVersion() != null) {
            _hashCode += getMajorVersion().hashCode();
        }
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Publisher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedEntityDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InstalledEntityDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installedFieldDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InstalledFieldDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesforce");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsSalesforce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MajorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MinorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
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
