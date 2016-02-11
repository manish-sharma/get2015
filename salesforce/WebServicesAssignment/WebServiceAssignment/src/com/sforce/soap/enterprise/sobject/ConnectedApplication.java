/**
 * ConnectedApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ConnectedApplication  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult installedMobileApps;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String mobileSessionTimeout;

    private java.lang.String mobileStartUrl;

    private java.lang.String name;

    private java.lang.Boolean optionsAllowAdminApprovedUsersOnly;

    private java.lang.Boolean optionsHasSessionLevelPolicy;

    private java.lang.Boolean optionsRefreshTokenValidityMetric;

    private java.lang.String pinLength;

    private java.lang.Integer refreshTokenValidityPeriod;

    private com.sforce.soap.enterprise.QueryResult setupEntityAccessItems;

    private java.lang.String startUrl;

    private java.util.Calendar systemModstamp;

    public ConnectedApplication() {
    }

    public ConnectedApplication(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult installedMobileApps,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String mobileSessionTimeout,
           java.lang.String mobileStartUrl,
           java.lang.String name,
           java.lang.Boolean optionsAllowAdminApprovedUsersOnly,
           java.lang.Boolean optionsHasSessionLevelPolicy,
           java.lang.Boolean optionsRefreshTokenValidityMetric,
           java.lang.String pinLength,
           java.lang.Integer refreshTokenValidityPeriod,
           com.sforce.soap.enterprise.QueryResult setupEntityAccessItems,
           java.lang.String startUrl,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.installedMobileApps = installedMobileApps;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.mobileSessionTimeout = mobileSessionTimeout;
        this.mobileStartUrl = mobileStartUrl;
        this.name = name;
        this.optionsAllowAdminApprovedUsersOnly = optionsAllowAdminApprovedUsersOnly;
        this.optionsHasSessionLevelPolicy = optionsHasSessionLevelPolicy;
        this.optionsRefreshTokenValidityMetric = optionsRefreshTokenValidityMetric;
        this.pinLength = pinLength;
        this.refreshTokenValidityPeriod = refreshTokenValidityPeriod;
        this.setupEntityAccessItems = setupEntityAccessItems;
        this.startUrl = startUrl;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the createdBy value for this ConnectedApplication.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ConnectedApplication.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ConnectedApplication.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ConnectedApplication.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ConnectedApplication.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ConnectedApplication.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the installedMobileApps value for this ConnectedApplication.
     * 
     * @return installedMobileApps
     */
    public com.sforce.soap.enterprise.QueryResult getInstalledMobileApps() {
        return installedMobileApps;
    }


    /**
     * Sets the installedMobileApps value for this ConnectedApplication.
     * 
     * @param installedMobileApps
     */
    public void setInstalledMobileApps(com.sforce.soap.enterprise.QueryResult installedMobileApps) {
        this.installedMobileApps = installedMobileApps;
    }


    /**
     * Gets the lastModifiedBy value for this ConnectedApplication.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ConnectedApplication.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ConnectedApplication.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ConnectedApplication.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ConnectedApplication.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ConnectedApplication.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mobileSessionTimeout value for this ConnectedApplication.
     * 
     * @return mobileSessionTimeout
     */
    public java.lang.String getMobileSessionTimeout() {
        return mobileSessionTimeout;
    }


    /**
     * Sets the mobileSessionTimeout value for this ConnectedApplication.
     * 
     * @param mobileSessionTimeout
     */
    public void setMobileSessionTimeout(java.lang.String mobileSessionTimeout) {
        this.mobileSessionTimeout = mobileSessionTimeout;
    }


    /**
     * Gets the mobileStartUrl value for this ConnectedApplication.
     * 
     * @return mobileStartUrl
     */
    public java.lang.String getMobileStartUrl() {
        return mobileStartUrl;
    }


    /**
     * Sets the mobileStartUrl value for this ConnectedApplication.
     * 
     * @param mobileStartUrl
     */
    public void setMobileStartUrl(java.lang.String mobileStartUrl) {
        this.mobileStartUrl = mobileStartUrl;
    }


    /**
     * Gets the name value for this ConnectedApplication.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConnectedApplication.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the optionsAllowAdminApprovedUsersOnly value for this ConnectedApplication.
     * 
     * @return optionsAllowAdminApprovedUsersOnly
     */
    public java.lang.Boolean getOptionsAllowAdminApprovedUsersOnly() {
        return optionsAllowAdminApprovedUsersOnly;
    }


    /**
     * Sets the optionsAllowAdminApprovedUsersOnly value for this ConnectedApplication.
     * 
     * @param optionsAllowAdminApprovedUsersOnly
     */
    public void setOptionsAllowAdminApprovedUsersOnly(java.lang.Boolean optionsAllowAdminApprovedUsersOnly) {
        this.optionsAllowAdminApprovedUsersOnly = optionsAllowAdminApprovedUsersOnly;
    }


    /**
     * Gets the optionsHasSessionLevelPolicy value for this ConnectedApplication.
     * 
     * @return optionsHasSessionLevelPolicy
     */
    public java.lang.Boolean getOptionsHasSessionLevelPolicy() {
        return optionsHasSessionLevelPolicy;
    }


    /**
     * Sets the optionsHasSessionLevelPolicy value for this ConnectedApplication.
     * 
     * @param optionsHasSessionLevelPolicy
     */
    public void setOptionsHasSessionLevelPolicy(java.lang.Boolean optionsHasSessionLevelPolicy) {
        this.optionsHasSessionLevelPolicy = optionsHasSessionLevelPolicy;
    }


    /**
     * Gets the optionsRefreshTokenValidityMetric value for this ConnectedApplication.
     * 
     * @return optionsRefreshTokenValidityMetric
     */
    public java.lang.Boolean getOptionsRefreshTokenValidityMetric() {
        return optionsRefreshTokenValidityMetric;
    }


    /**
     * Sets the optionsRefreshTokenValidityMetric value for this ConnectedApplication.
     * 
     * @param optionsRefreshTokenValidityMetric
     */
    public void setOptionsRefreshTokenValidityMetric(java.lang.Boolean optionsRefreshTokenValidityMetric) {
        this.optionsRefreshTokenValidityMetric = optionsRefreshTokenValidityMetric;
    }


    /**
     * Gets the pinLength value for this ConnectedApplication.
     * 
     * @return pinLength
     */
    public java.lang.String getPinLength() {
        return pinLength;
    }


    /**
     * Sets the pinLength value for this ConnectedApplication.
     * 
     * @param pinLength
     */
    public void setPinLength(java.lang.String pinLength) {
        this.pinLength = pinLength;
    }


    /**
     * Gets the refreshTokenValidityPeriod value for this ConnectedApplication.
     * 
     * @return refreshTokenValidityPeriod
     */
    public java.lang.Integer getRefreshTokenValidityPeriod() {
        return refreshTokenValidityPeriod;
    }


    /**
     * Sets the refreshTokenValidityPeriod value for this ConnectedApplication.
     * 
     * @param refreshTokenValidityPeriod
     */
    public void setRefreshTokenValidityPeriod(java.lang.Integer refreshTokenValidityPeriod) {
        this.refreshTokenValidityPeriod = refreshTokenValidityPeriod;
    }


    /**
     * Gets the setupEntityAccessItems value for this ConnectedApplication.
     * 
     * @return setupEntityAccessItems
     */
    public com.sforce.soap.enterprise.QueryResult getSetupEntityAccessItems() {
        return setupEntityAccessItems;
    }


    /**
     * Sets the setupEntityAccessItems value for this ConnectedApplication.
     * 
     * @param setupEntityAccessItems
     */
    public void setSetupEntityAccessItems(com.sforce.soap.enterprise.QueryResult setupEntityAccessItems) {
        this.setupEntityAccessItems = setupEntityAccessItems;
    }


    /**
     * Gets the startUrl value for this ConnectedApplication.
     * 
     * @return startUrl
     */
    public java.lang.String getStartUrl() {
        return startUrl;
    }


    /**
     * Sets the startUrl value for this ConnectedApplication.
     * 
     * @param startUrl
     */
    public void setStartUrl(java.lang.String startUrl) {
        this.startUrl = startUrl;
    }


    /**
     * Gets the systemModstamp value for this ConnectedApplication.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ConnectedApplication.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConnectedApplication)) return false;
        ConnectedApplication other = (ConnectedApplication) obj;
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
            ((this.installedMobileApps==null && other.getInstalledMobileApps()==null) || 
             (this.installedMobileApps!=null &&
              this.installedMobileApps.equals(other.getInstalledMobileApps()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.mobileSessionTimeout==null && other.getMobileSessionTimeout()==null) || 
             (this.mobileSessionTimeout!=null &&
              this.mobileSessionTimeout.equals(other.getMobileSessionTimeout()))) &&
            ((this.mobileStartUrl==null && other.getMobileStartUrl()==null) || 
             (this.mobileStartUrl!=null &&
              this.mobileStartUrl.equals(other.getMobileStartUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.optionsAllowAdminApprovedUsersOnly==null && other.getOptionsAllowAdminApprovedUsersOnly()==null) || 
             (this.optionsAllowAdminApprovedUsersOnly!=null &&
              this.optionsAllowAdminApprovedUsersOnly.equals(other.getOptionsAllowAdminApprovedUsersOnly()))) &&
            ((this.optionsHasSessionLevelPolicy==null && other.getOptionsHasSessionLevelPolicy()==null) || 
             (this.optionsHasSessionLevelPolicy!=null &&
              this.optionsHasSessionLevelPolicy.equals(other.getOptionsHasSessionLevelPolicy()))) &&
            ((this.optionsRefreshTokenValidityMetric==null && other.getOptionsRefreshTokenValidityMetric()==null) || 
             (this.optionsRefreshTokenValidityMetric!=null &&
              this.optionsRefreshTokenValidityMetric.equals(other.getOptionsRefreshTokenValidityMetric()))) &&
            ((this.pinLength==null && other.getPinLength()==null) || 
             (this.pinLength!=null &&
              this.pinLength.equals(other.getPinLength()))) &&
            ((this.refreshTokenValidityPeriod==null && other.getRefreshTokenValidityPeriod()==null) || 
             (this.refreshTokenValidityPeriod!=null &&
              this.refreshTokenValidityPeriod.equals(other.getRefreshTokenValidityPeriod()))) &&
            ((this.setupEntityAccessItems==null && other.getSetupEntityAccessItems()==null) || 
             (this.setupEntityAccessItems!=null &&
              this.setupEntityAccessItems.equals(other.getSetupEntityAccessItems()))) &&
            ((this.startUrl==null && other.getStartUrl()==null) || 
             (this.startUrl!=null &&
              this.startUrl.equals(other.getStartUrl()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
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
        if (getInstalledMobileApps() != null) {
            _hashCode += getInstalledMobileApps().hashCode();
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
        if (getMobileSessionTimeout() != null) {
            _hashCode += getMobileSessionTimeout().hashCode();
        }
        if (getMobileStartUrl() != null) {
            _hashCode += getMobileStartUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptionsAllowAdminApprovedUsersOnly() != null) {
            _hashCode += getOptionsAllowAdminApprovedUsersOnly().hashCode();
        }
        if (getOptionsHasSessionLevelPolicy() != null) {
            _hashCode += getOptionsHasSessionLevelPolicy().hashCode();
        }
        if (getOptionsRefreshTokenValidityMetric() != null) {
            _hashCode += getOptionsRefreshTokenValidityMetric().hashCode();
        }
        if (getPinLength() != null) {
            _hashCode += getPinLength().hashCode();
        }
        if (getRefreshTokenValidityPeriod() != null) {
            _hashCode += getRefreshTokenValidityPeriod().hashCode();
        }
        if (getSetupEntityAccessItems() != null) {
            _hashCode += getSetupEntityAccessItems().hashCode();
        }
        if (getStartUrl() != null) {
            _hashCode += getStartUrl().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConnectedApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication"));
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
        elemField.setFieldName("installedMobileApps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InstalledMobileApps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("mobileSessionTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileSessionTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileStartUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobileStartUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("optionsAllowAdminApprovedUsersOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowAdminApprovedUsersOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsHasSessionLevelPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsHasSessionLevelPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsRefreshTokenValidityMetric");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsRefreshTokenValidityMetric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PinLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshTokenValidityPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RefreshTokenValidityPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupEntityAccessItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccessItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
