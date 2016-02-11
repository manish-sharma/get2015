/**
 * UserAppMenuItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserAppMenuItem  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String appMenuItemId;

    private java.lang.String applicationId;

    private java.lang.String description;

    private java.lang.String iconUrl;

    private java.lang.String infoUrl;

    private java.lang.Boolean isUsingAdminAuthorization;

    private java.lang.Boolean isVisible;

    private java.lang.String label;

    private java.lang.String logoUrl;

    private java.lang.String mobileStartUrl;

    private java.lang.String name;

    private java.lang.Integer sortOrder;

    private java.lang.String startUrl;

    private java.lang.String type;

    private java.lang.Integer userSortOrder;

    public UserAppMenuItem() {
    }

    public UserAppMenuItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String appMenuItemId,
           java.lang.String applicationId,
           java.lang.String description,
           java.lang.String iconUrl,
           java.lang.String infoUrl,
           java.lang.Boolean isUsingAdminAuthorization,
           java.lang.Boolean isVisible,
           java.lang.String label,
           java.lang.String logoUrl,
           java.lang.String mobileStartUrl,
           java.lang.String name,
           java.lang.Integer sortOrder,
           java.lang.String startUrl,
           java.lang.String type,
           java.lang.Integer userSortOrder) {
        super(
            fieldsToNull,
            id);
        this.appMenuItemId = appMenuItemId;
        this.applicationId = applicationId;
        this.description = description;
        this.iconUrl = iconUrl;
        this.infoUrl = infoUrl;
        this.isUsingAdminAuthorization = isUsingAdminAuthorization;
        this.isVisible = isVisible;
        this.label = label;
        this.logoUrl = logoUrl;
        this.mobileStartUrl = mobileStartUrl;
        this.name = name;
        this.sortOrder = sortOrder;
        this.startUrl = startUrl;
        this.type = type;
        this.userSortOrder = userSortOrder;
    }


    /**
     * Gets the appMenuItemId value for this UserAppMenuItem.
     * 
     * @return appMenuItemId
     */
    public java.lang.String getAppMenuItemId() {
        return appMenuItemId;
    }


    /**
     * Sets the appMenuItemId value for this UserAppMenuItem.
     * 
     * @param appMenuItemId
     */
    public void setAppMenuItemId(java.lang.String appMenuItemId) {
        this.appMenuItemId = appMenuItemId;
    }


    /**
     * Gets the applicationId value for this UserAppMenuItem.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this UserAppMenuItem.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the description value for this UserAppMenuItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UserAppMenuItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the iconUrl value for this UserAppMenuItem.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this UserAppMenuItem.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the infoUrl value for this UserAppMenuItem.
     * 
     * @return infoUrl
     */
    public java.lang.String getInfoUrl() {
        return infoUrl;
    }


    /**
     * Sets the infoUrl value for this UserAppMenuItem.
     * 
     * @param infoUrl
     */
    public void setInfoUrl(java.lang.String infoUrl) {
        this.infoUrl = infoUrl;
    }


    /**
     * Gets the isUsingAdminAuthorization value for this UserAppMenuItem.
     * 
     * @return isUsingAdminAuthorization
     */
    public java.lang.Boolean getIsUsingAdminAuthorization() {
        return isUsingAdminAuthorization;
    }


    /**
     * Sets the isUsingAdminAuthorization value for this UserAppMenuItem.
     * 
     * @param isUsingAdminAuthorization
     */
    public void setIsUsingAdminAuthorization(java.lang.Boolean isUsingAdminAuthorization) {
        this.isUsingAdminAuthorization = isUsingAdminAuthorization;
    }


    /**
     * Gets the isVisible value for this UserAppMenuItem.
     * 
     * @return isVisible
     */
    public java.lang.Boolean getIsVisible() {
        return isVisible;
    }


    /**
     * Sets the isVisible value for this UserAppMenuItem.
     * 
     * @param isVisible
     */
    public void setIsVisible(java.lang.Boolean isVisible) {
        this.isVisible = isVisible;
    }


    /**
     * Gets the label value for this UserAppMenuItem.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this UserAppMenuItem.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the logoUrl value for this UserAppMenuItem.
     * 
     * @return logoUrl
     */
    public java.lang.String getLogoUrl() {
        return logoUrl;
    }


    /**
     * Sets the logoUrl value for this UserAppMenuItem.
     * 
     * @param logoUrl
     */
    public void setLogoUrl(java.lang.String logoUrl) {
        this.logoUrl = logoUrl;
    }


    /**
     * Gets the mobileStartUrl value for this UserAppMenuItem.
     * 
     * @return mobileStartUrl
     */
    public java.lang.String getMobileStartUrl() {
        return mobileStartUrl;
    }


    /**
     * Sets the mobileStartUrl value for this UserAppMenuItem.
     * 
     * @param mobileStartUrl
     */
    public void setMobileStartUrl(java.lang.String mobileStartUrl) {
        this.mobileStartUrl = mobileStartUrl;
    }


    /**
     * Gets the name value for this UserAppMenuItem.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserAppMenuItem.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sortOrder value for this UserAppMenuItem.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this UserAppMenuItem.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startUrl value for this UserAppMenuItem.
     * 
     * @return startUrl
     */
    public java.lang.String getStartUrl() {
        return startUrl;
    }


    /**
     * Sets the startUrl value for this UserAppMenuItem.
     * 
     * @param startUrl
     */
    public void setStartUrl(java.lang.String startUrl) {
        this.startUrl = startUrl;
    }


    /**
     * Gets the type value for this UserAppMenuItem.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this UserAppMenuItem.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userSortOrder value for this UserAppMenuItem.
     * 
     * @return userSortOrder
     */
    public java.lang.Integer getUserSortOrder() {
        return userSortOrder;
    }


    /**
     * Sets the userSortOrder value for this UserAppMenuItem.
     * 
     * @param userSortOrder
     */
    public void setUserSortOrder(java.lang.Integer userSortOrder) {
        this.userSortOrder = userSortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserAppMenuItem)) return false;
        UserAppMenuItem other = (UserAppMenuItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appMenuItemId==null && other.getAppMenuItemId()==null) || 
             (this.appMenuItemId!=null &&
              this.appMenuItemId.equals(other.getAppMenuItemId()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.infoUrl==null && other.getInfoUrl()==null) || 
             (this.infoUrl!=null &&
              this.infoUrl.equals(other.getInfoUrl()))) &&
            ((this.isUsingAdminAuthorization==null && other.getIsUsingAdminAuthorization()==null) || 
             (this.isUsingAdminAuthorization!=null &&
              this.isUsingAdminAuthorization.equals(other.getIsUsingAdminAuthorization()))) &&
            ((this.isVisible==null && other.getIsVisible()==null) || 
             (this.isVisible!=null &&
              this.isVisible.equals(other.getIsVisible()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.logoUrl==null && other.getLogoUrl()==null) || 
             (this.logoUrl!=null &&
              this.logoUrl.equals(other.getLogoUrl()))) &&
            ((this.mobileStartUrl==null && other.getMobileStartUrl()==null) || 
             (this.mobileStartUrl!=null &&
              this.mobileStartUrl.equals(other.getMobileStartUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startUrl==null && other.getStartUrl()==null) || 
             (this.startUrl!=null &&
              this.startUrl.equals(other.getStartUrl()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userSortOrder==null && other.getUserSortOrder()==null) || 
             (this.userSortOrder!=null &&
              this.userSortOrder.equals(other.getUserSortOrder())));
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
        if (getAppMenuItemId() != null) {
            _hashCode += getAppMenuItemId().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getInfoUrl() != null) {
            _hashCode += getInfoUrl().hashCode();
        }
        if (getIsUsingAdminAuthorization() != null) {
            _hashCode += getIsUsingAdminAuthorization().hashCode();
        }
        if (getIsVisible() != null) {
            _hashCode += getIsVisible().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLogoUrl() != null) {
            _hashCode += getLogoUrl().hashCode();
        }
        if (getMobileStartUrl() != null) {
            _hashCode += getMobileStartUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartUrl() != null) {
            _hashCode += getStartUrl().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserSortOrder() != null) {
            _hashCode += getUserSortOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAppMenuItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAppMenuItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appMenuItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InfoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUsingAdminAuthorization");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUsingAdminAuthorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsVisible"));
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
        elemField.setFieldName("logoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LogoUrl"));
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
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserSortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
