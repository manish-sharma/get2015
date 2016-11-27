/**
 * ContentFolderLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ContentFolderLink  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ContentFolder contentFolder;

    private java.lang.String contentFolderId;

    private java.lang.Boolean isDeleted;

    private java.lang.String parentEntityId;

    public ContentFolderLink() {
    }

    public ContentFolderLink(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ContentFolder contentFolder,
           java.lang.String contentFolderId,
           java.lang.Boolean isDeleted,
           java.lang.String parentEntityId) {
        super(
            fieldsToNull,
            id);
        this.contentFolder = contentFolder;
        this.contentFolderId = contentFolderId;
        this.isDeleted = isDeleted;
        this.parentEntityId = parentEntityId;
    }


    /**
     * Gets the contentFolder value for this ContentFolderLink.
     * 
     * @return contentFolder
     */
    public com.sforce.soap.enterprise.sobject.ContentFolder getContentFolder() {
        return contentFolder;
    }


    /**
     * Sets the contentFolder value for this ContentFolderLink.
     * 
     * @param contentFolder
     */
    public void setContentFolder(com.sforce.soap.enterprise.sobject.ContentFolder contentFolder) {
        this.contentFolder = contentFolder;
    }


    /**
     * Gets the contentFolderId value for this ContentFolderLink.
     * 
     * @return contentFolderId
     */
    public java.lang.String getContentFolderId() {
        return contentFolderId;
    }


    /**
     * Sets the contentFolderId value for this ContentFolderLink.
     * 
     * @param contentFolderId
     */
    public void setContentFolderId(java.lang.String contentFolderId) {
        this.contentFolderId = contentFolderId;
    }


    /**
     * Gets the isDeleted value for this ContentFolderLink.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ContentFolderLink.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the parentEntityId value for this ContentFolderLink.
     * 
     * @return parentEntityId
     */
    public java.lang.String getParentEntityId() {
        return parentEntityId;
    }


    /**
     * Sets the parentEntityId value for this ContentFolderLink.
     * 
     * @param parentEntityId
     */
    public void setParentEntityId(java.lang.String parentEntityId) {
        this.parentEntityId = parentEntityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentFolderLink)) return false;
        ContentFolderLink other = (ContentFolderLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentFolder==null && other.getContentFolder()==null) || 
             (this.contentFolder!=null &&
              this.contentFolder.equals(other.getContentFolder()))) &&
            ((this.contentFolderId==null && other.getContentFolderId()==null) || 
             (this.contentFolderId!=null &&
              this.contentFolderId.equals(other.getContentFolderId()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.parentEntityId==null && other.getParentEntityId()==null) || 
             (this.parentEntityId!=null &&
              this.parentEntityId.equals(other.getParentEntityId())));
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
        if (getContentFolder() != null) {
            _hashCode += getContentFolder().hashCode();
        }
        if (getContentFolderId() != null) {
            _hashCode += getContentFolderId().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getParentEntityId() != null) {
            _hashCode += getParentEntityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentFolderLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolderLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentEntityId"));
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
