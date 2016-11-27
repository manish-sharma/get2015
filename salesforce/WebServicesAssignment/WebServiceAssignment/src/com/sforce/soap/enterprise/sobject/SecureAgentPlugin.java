/**
 * SecureAgentPlugin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class SecureAgentPlugin  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String pluginName;

    private java.lang.String pluginType;

    private java.lang.String requestedVersion;

    private com.sforce.soap.enterprise.sobject.SecureAgent secureAgent;

    private java.lang.String secureAgentId;

    private com.sforce.soap.enterprise.QueryResult secureAgentPluginProperties;

    private java.util.Calendar systemModstamp;

    private java.util.Calendar updateWindowEnd;

    private java.util.Calendar updateWindowStart;

    public SecureAgentPlugin() {
    }

    public SecureAgentPlugin(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String pluginName,
           java.lang.String pluginType,
           java.lang.String requestedVersion,
           com.sforce.soap.enterprise.sobject.SecureAgent secureAgent,
           java.lang.String secureAgentId,
           com.sforce.soap.enterprise.QueryResult secureAgentPluginProperties,
           java.util.Calendar systemModstamp,
           java.util.Calendar updateWindowEnd,
           java.util.Calendar updateWindowStart) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.pluginName = pluginName;
        this.pluginType = pluginType;
        this.requestedVersion = requestedVersion;
        this.secureAgent = secureAgent;
        this.secureAgentId = secureAgentId;
        this.secureAgentPluginProperties = secureAgentPluginProperties;
        this.systemModstamp = systemModstamp;
        this.updateWindowEnd = updateWindowEnd;
        this.updateWindowStart = updateWindowStart;
    }


    /**
     * Gets the createdBy value for this SecureAgentPlugin.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this SecureAgentPlugin.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this SecureAgentPlugin.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this SecureAgentPlugin.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this SecureAgentPlugin.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SecureAgentPlugin.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isDeleted value for this SecureAgentPlugin.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this SecureAgentPlugin.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this SecureAgentPlugin.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this SecureAgentPlugin.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this SecureAgentPlugin.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this SecureAgentPlugin.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this SecureAgentPlugin.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SecureAgentPlugin.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the pluginName value for this SecureAgentPlugin.
     * 
     * @return pluginName
     */
    public java.lang.String getPluginName() {
        return pluginName;
    }


    /**
     * Sets the pluginName value for this SecureAgentPlugin.
     * 
     * @param pluginName
     */
    public void setPluginName(java.lang.String pluginName) {
        this.pluginName = pluginName;
    }


    /**
     * Gets the pluginType value for this SecureAgentPlugin.
     * 
     * @return pluginType
     */
    public java.lang.String getPluginType() {
        return pluginType;
    }


    /**
     * Sets the pluginType value for this SecureAgentPlugin.
     * 
     * @param pluginType
     */
    public void setPluginType(java.lang.String pluginType) {
        this.pluginType = pluginType;
    }


    /**
     * Gets the requestedVersion value for this SecureAgentPlugin.
     * 
     * @return requestedVersion
     */
    public java.lang.String getRequestedVersion() {
        return requestedVersion;
    }


    /**
     * Sets the requestedVersion value for this SecureAgentPlugin.
     * 
     * @param requestedVersion
     */
    public void setRequestedVersion(java.lang.String requestedVersion) {
        this.requestedVersion = requestedVersion;
    }


    /**
     * Gets the secureAgent value for this SecureAgentPlugin.
     * 
     * @return secureAgent
     */
    public com.sforce.soap.enterprise.sobject.SecureAgent getSecureAgent() {
        return secureAgent;
    }


    /**
     * Sets the secureAgent value for this SecureAgentPlugin.
     * 
     * @param secureAgent
     */
    public void setSecureAgent(com.sforce.soap.enterprise.sobject.SecureAgent secureAgent) {
        this.secureAgent = secureAgent;
    }


    /**
     * Gets the secureAgentId value for this SecureAgentPlugin.
     * 
     * @return secureAgentId
     */
    public java.lang.String getSecureAgentId() {
        return secureAgentId;
    }


    /**
     * Sets the secureAgentId value for this SecureAgentPlugin.
     * 
     * @param secureAgentId
     */
    public void setSecureAgentId(java.lang.String secureAgentId) {
        this.secureAgentId = secureAgentId;
    }


    /**
     * Gets the secureAgentPluginProperties value for this SecureAgentPlugin.
     * 
     * @return secureAgentPluginProperties
     */
    public com.sforce.soap.enterprise.QueryResult getSecureAgentPluginProperties() {
        return secureAgentPluginProperties;
    }


    /**
     * Sets the secureAgentPluginProperties value for this SecureAgentPlugin.
     * 
     * @param secureAgentPluginProperties
     */
    public void setSecureAgentPluginProperties(com.sforce.soap.enterprise.QueryResult secureAgentPluginProperties) {
        this.secureAgentPluginProperties = secureAgentPluginProperties;
    }


    /**
     * Gets the systemModstamp value for this SecureAgentPlugin.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this SecureAgentPlugin.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the updateWindowEnd value for this SecureAgentPlugin.
     * 
     * @return updateWindowEnd
     */
    public java.util.Calendar getUpdateWindowEnd() {
        return updateWindowEnd;
    }


    /**
     * Sets the updateWindowEnd value for this SecureAgentPlugin.
     * 
     * @param updateWindowEnd
     */
    public void setUpdateWindowEnd(java.util.Calendar updateWindowEnd) {
        this.updateWindowEnd = updateWindowEnd;
    }


    /**
     * Gets the updateWindowStart value for this SecureAgentPlugin.
     * 
     * @return updateWindowStart
     */
    public java.util.Calendar getUpdateWindowStart() {
        return updateWindowStart;
    }


    /**
     * Sets the updateWindowStart value for this SecureAgentPlugin.
     * 
     * @param updateWindowStart
     */
    public void setUpdateWindowStart(java.util.Calendar updateWindowStart) {
        this.updateWindowStart = updateWindowStart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecureAgentPlugin)) return false;
        SecureAgentPlugin other = (SecureAgentPlugin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.pluginName==null && other.getPluginName()==null) || 
             (this.pluginName!=null &&
              this.pluginName.equals(other.getPluginName()))) &&
            ((this.pluginType==null && other.getPluginType()==null) || 
             (this.pluginType!=null &&
              this.pluginType.equals(other.getPluginType()))) &&
            ((this.requestedVersion==null && other.getRequestedVersion()==null) || 
             (this.requestedVersion!=null &&
              this.requestedVersion.equals(other.getRequestedVersion()))) &&
            ((this.secureAgent==null && other.getSecureAgent()==null) || 
             (this.secureAgent!=null &&
              this.secureAgent.equals(other.getSecureAgent()))) &&
            ((this.secureAgentId==null && other.getSecureAgentId()==null) || 
             (this.secureAgentId!=null &&
              this.secureAgentId.equals(other.getSecureAgentId()))) &&
            ((this.secureAgentPluginProperties==null && other.getSecureAgentPluginProperties()==null) || 
             (this.secureAgentPluginProperties!=null &&
              this.secureAgentPluginProperties.equals(other.getSecureAgentPluginProperties()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.updateWindowEnd==null && other.getUpdateWindowEnd()==null) || 
             (this.updateWindowEnd!=null &&
              this.updateWindowEnd.equals(other.getUpdateWindowEnd()))) &&
            ((this.updateWindowStart==null && other.getUpdateWindowStart()==null) || 
             (this.updateWindowStart!=null &&
              this.updateWindowStart.equals(other.getUpdateWindowStart())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
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
        if (getPluginName() != null) {
            _hashCode += getPluginName().hashCode();
        }
        if (getPluginType() != null) {
            _hashCode += getPluginType().hashCode();
        }
        if (getRequestedVersion() != null) {
            _hashCode += getRequestedVersion().hashCode();
        }
        if (getSecureAgent() != null) {
            _hashCode += getSecureAgent().hashCode();
        }
        if (getSecureAgentId() != null) {
            _hashCode += getSecureAgentId().hashCode();
        }
        if (getSecureAgentPluginProperties() != null) {
            _hashCode += getSecureAgentPluginProperties().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUpdateWindowEnd() != null) {
            _hashCode += getUpdateWindowEnd().hashCode();
        }
        if (getUpdateWindowStart() != null) {
            _hashCode += getUpdateWindowStart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecureAgentPlugin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgentPlugin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("pluginName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PluginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pluginType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PluginType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RequestedVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureAgentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureAgentPluginProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgentPluginProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateWindowEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpdateWindowEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpdateWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
