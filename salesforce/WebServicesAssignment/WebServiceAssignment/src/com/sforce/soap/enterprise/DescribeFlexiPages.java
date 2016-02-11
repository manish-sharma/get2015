/**
 * DescribeFlexiPages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public class DescribeFlexiPages  implements java.io.Serializable {
    private java.lang.String[] flexiPages;

    private com.sforce.soap.enterprise.FlexipageContext[] contexts;

    public DescribeFlexiPages() {
    }

    public DescribeFlexiPages(
           java.lang.String[] flexiPages,
           com.sforce.soap.enterprise.FlexipageContext[] contexts) {
           this.flexiPages = flexiPages;
           this.contexts = contexts;
    }


    /**
     * Gets the flexiPages value for this DescribeFlexiPages.
     * 
     * @return flexiPages
     */
    public java.lang.String[] getFlexiPages() {
        return flexiPages;
    }


    /**
     * Sets the flexiPages value for this DescribeFlexiPages.
     * 
     * @param flexiPages
     */
    public void setFlexiPages(java.lang.String[] flexiPages) {
        this.flexiPages = flexiPages;
    }

    public java.lang.String getFlexiPages(int i) {
        return this.flexiPages[i];
    }

    public void setFlexiPages(int i, java.lang.String _value) {
        this.flexiPages[i] = _value;
    }


    /**
     * Gets the contexts value for this DescribeFlexiPages.
     * 
     * @return contexts
     */
    public com.sforce.soap.enterprise.FlexipageContext[] getContexts() {
        return contexts;
    }


    /**
     * Sets the contexts value for this DescribeFlexiPages.
     * 
     * @param contexts
     */
    public void setContexts(com.sforce.soap.enterprise.FlexipageContext[] contexts) {
        this.contexts = contexts;
    }

    public com.sforce.soap.enterprise.FlexipageContext getContexts(int i) {
        return this.contexts[i];
    }

    public void setContexts(int i, com.sforce.soap.enterprise.FlexipageContext _value) {
        this.contexts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeFlexiPages)) return false;
        DescribeFlexiPages other = (DescribeFlexiPages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flexiPages==null && other.getFlexiPages()==null) || 
             (this.flexiPages!=null &&
              java.util.Arrays.equals(this.flexiPages, other.getFlexiPages()))) &&
            ((this.contexts==null && other.getContexts()==null) || 
             (this.contexts!=null &&
              java.util.Arrays.equals(this.contexts, other.getContexts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFlexiPages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlexiPages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlexiPages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContexts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContexts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContexts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeFlexiPages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeFlexiPages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flexiPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "flexiPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contexts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "contexts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FlexipageContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
