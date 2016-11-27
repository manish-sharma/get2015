/**
 * PlatformAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class PlatformAction  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String actionListContext;

    private java.lang.String actionTarget;

    private java.lang.String actionTargetType;

    private java.lang.String apiName;

    private java.lang.String category;

    private java.lang.String confirmationMessage;

    private java.lang.String deviceFormat;

    private java.lang.String externalId;

    private java.lang.String groupId;

    private java.lang.String iconContentType;

    private java.lang.Integer iconHeight;

    private java.lang.String iconUrl;

    private java.lang.Integer iconWidth;

    private java.lang.String invocationStatus;

    private com.sforce.soap.enterprise.sobject.User invokedByUser;

    private java.lang.String invokedByUserId;

    private java.lang.Boolean isGroupDefault;

    private java.lang.String label;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String primaryColor;

    private java.lang.String relatedSourceEntity;

    private java.lang.String section;

    private java.lang.String sourceEntity;

    private java.lang.String subtype;

    private java.lang.String type;

    public PlatformAction() {
    }

    public PlatformAction(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String actionListContext,
           java.lang.String actionTarget,
           java.lang.String actionTargetType,
           java.lang.String apiName,
           java.lang.String category,
           java.lang.String confirmationMessage,
           java.lang.String deviceFormat,
           java.lang.String externalId,
           java.lang.String groupId,
           java.lang.String iconContentType,
           java.lang.Integer iconHeight,
           java.lang.String iconUrl,
           java.lang.Integer iconWidth,
           java.lang.String invocationStatus,
           com.sforce.soap.enterprise.sobject.User invokedByUser,
           java.lang.String invokedByUserId,
           java.lang.Boolean isGroupDefault,
           java.lang.String label,
           java.util.Calendar lastModifiedDate,
           java.lang.String primaryColor,
           java.lang.String relatedSourceEntity,
           java.lang.String section,
           java.lang.String sourceEntity,
           java.lang.String subtype,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.actionListContext = actionListContext;
        this.actionTarget = actionTarget;
        this.actionTargetType = actionTargetType;
        this.apiName = apiName;
        this.category = category;
        this.confirmationMessage = confirmationMessage;
        this.deviceFormat = deviceFormat;
        this.externalId = externalId;
        this.groupId = groupId;
        this.iconContentType = iconContentType;
        this.iconHeight = iconHeight;
        this.iconUrl = iconUrl;
        this.iconWidth = iconWidth;
        this.invocationStatus = invocationStatus;
        this.invokedByUser = invokedByUser;
        this.invokedByUserId = invokedByUserId;
        this.isGroupDefault = isGroupDefault;
        this.label = label;
        this.lastModifiedDate = lastModifiedDate;
        this.primaryColor = primaryColor;
        this.relatedSourceEntity = relatedSourceEntity;
        this.section = section;
        this.sourceEntity = sourceEntity;
        this.subtype = subtype;
        this.type = type;
    }


    /**
     * Gets the actionListContext value for this PlatformAction.
     * 
     * @return actionListContext
     */
    public java.lang.String getActionListContext() {
        return actionListContext;
    }


    /**
     * Sets the actionListContext value for this PlatformAction.
     * 
     * @param actionListContext
     */
    public void setActionListContext(java.lang.String actionListContext) {
        this.actionListContext = actionListContext;
    }


    /**
     * Gets the actionTarget value for this PlatformAction.
     * 
     * @return actionTarget
     */
    public java.lang.String getActionTarget() {
        return actionTarget;
    }


    /**
     * Sets the actionTarget value for this PlatformAction.
     * 
     * @param actionTarget
     */
    public void setActionTarget(java.lang.String actionTarget) {
        this.actionTarget = actionTarget;
    }


    /**
     * Gets the actionTargetType value for this PlatformAction.
     * 
     * @return actionTargetType
     */
    public java.lang.String getActionTargetType() {
        return actionTargetType;
    }


    /**
     * Sets the actionTargetType value for this PlatformAction.
     * 
     * @param actionTargetType
     */
    public void setActionTargetType(java.lang.String actionTargetType) {
        this.actionTargetType = actionTargetType;
    }


    /**
     * Gets the apiName value for this PlatformAction.
     * 
     * @return apiName
     */
    public java.lang.String getApiName() {
        return apiName;
    }


    /**
     * Sets the apiName value for this PlatformAction.
     * 
     * @param apiName
     */
    public void setApiName(java.lang.String apiName) {
        this.apiName = apiName;
    }


    /**
     * Gets the category value for this PlatformAction.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this PlatformAction.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the confirmationMessage value for this PlatformAction.
     * 
     * @return confirmationMessage
     */
    public java.lang.String getConfirmationMessage() {
        return confirmationMessage;
    }


    /**
     * Sets the confirmationMessage value for this PlatformAction.
     * 
     * @param confirmationMessage
     */
    public void setConfirmationMessage(java.lang.String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }


    /**
     * Gets the deviceFormat value for this PlatformAction.
     * 
     * @return deviceFormat
     */
    public java.lang.String getDeviceFormat() {
        return deviceFormat;
    }


    /**
     * Sets the deviceFormat value for this PlatformAction.
     * 
     * @param deviceFormat
     */
    public void setDeviceFormat(java.lang.String deviceFormat) {
        this.deviceFormat = deviceFormat;
    }


    /**
     * Gets the externalId value for this PlatformAction.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PlatformAction.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the groupId value for this PlatformAction.
     * 
     * @return groupId
     */
    public java.lang.String getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this PlatformAction.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the iconContentType value for this PlatformAction.
     * 
     * @return iconContentType
     */
    public java.lang.String getIconContentType() {
        return iconContentType;
    }


    /**
     * Sets the iconContentType value for this PlatformAction.
     * 
     * @param iconContentType
     */
    public void setIconContentType(java.lang.String iconContentType) {
        this.iconContentType = iconContentType;
    }


    /**
     * Gets the iconHeight value for this PlatformAction.
     * 
     * @return iconHeight
     */
    public java.lang.Integer getIconHeight() {
        return iconHeight;
    }


    /**
     * Sets the iconHeight value for this PlatformAction.
     * 
     * @param iconHeight
     */
    public void setIconHeight(java.lang.Integer iconHeight) {
        this.iconHeight = iconHeight;
    }


    /**
     * Gets the iconUrl value for this PlatformAction.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this PlatformAction.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the iconWidth value for this PlatformAction.
     * 
     * @return iconWidth
     */
    public java.lang.Integer getIconWidth() {
        return iconWidth;
    }


    /**
     * Sets the iconWidth value for this PlatformAction.
     * 
     * @param iconWidth
     */
    public void setIconWidth(java.lang.Integer iconWidth) {
        this.iconWidth = iconWidth;
    }


    /**
     * Gets the invocationStatus value for this PlatformAction.
     * 
     * @return invocationStatus
     */
    public java.lang.String getInvocationStatus() {
        return invocationStatus;
    }


    /**
     * Sets the invocationStatus value for this PlatformAction.
     * 
     * @param invocationStatus
     */
    public void setInvocationStatus(java.lang.String invocationStatus) {
        this.invocationStatus = invocationStatus;
    }


    /**
     * Gets the invokedByUser value for this PlatformAction.
     * 
     * @return invokedByUser
     */
    public com.sforce.soap.enterprise.sobject.User getInvokedByUser() {
        return invokedByUser;
    }


    /**
     * Sets the invokedByUser value for this PlatformAction.
     * 
     * @param invokedByUser
     */
    public void setInvokedByUser(com.sforce.soap.enterprise.sobject.User invokedByUser) {
        this.invokedByUser = invokedByUser;
    }


    /**
     * Gets the invokedByUserId value for this PlatformAction.
     * 
     * @return invokedByUserId
     */
    public java.lang.String getInvokedByUserId() {
        return invokedByUserId;
    }


    /**
     * Sets the invokedByUserId value for this PlatformAction.
     * 
     * @param invokedByUserId
     */
    public void setInvokedByUserId(java.lang.String invokedByUserId) {
        this.invokedByUserId = invokedByUserId;
    }


    /**
     * Gets the isGroupDefault value for this PlatformAction.
     * 
     * @return isGroupDefault
     */
    public java.lang.Boolean getIsGroupDefault() {
        return isGroupDefault;
    }


    /**
     * Sets the isGroupDefault value for this PlatformAction.
     * 
     * @param isGroupDefault
     */
    public void setIsGroupDefault(java.lang.Boolean isGroupDefault) {
        this.isGroupDefault = isGroupDefault;
    }


    /**
     * Gets the label value for this PlatformAction.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this PlatformAction.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedDate value for this PlatformAction.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PlatformAction.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the primaryColor value for this PlatformAction.
     * 
     * @return primaryColor
     */
    public java.lang.String getPrimaryColor() {
        return primaryColor;
    }


    /**
     * Sets the primaryColor value for this PlatformAction.
     * 
     * @param primaryColor
     */
    public void setPrimaryColor(java.lang.String primaryColor) {
        this.primaryColor = primaryColor;
    }


    /**
     * Gets the relatedSourceEntity value for this PlatformAction.
     * 
     * @return relatedSourceEntity
     */
    public java.lang.String getRelatedSourceEntity() {
        return relatedSourceEntity;
    }


    /**
     * Sets the relatedSourceEntity value for this PlatformAction.
     * 
     * @param relatedSourceEntity
     */
    public void setRelatedSourceEntity(java.lang.String relatedSourceEntity) {
        this.relatedSourceEntity = relatedSourceEntity;
    }


    /**
     * Gets the section value for this PlatformAction.
     * 
     * @return section
     */
    public java.lang.String getSection() {
        return section;
    }


    /**
     * Sets the section value for this PlatformAction.
     * 
     * @param section
     */
    public void setSection(java.lang.String section) {
        this.section = section;
    }


    /**
     * Gets the sourceEntity value for this PlatformAction.
     * 
     * @return sourceEntity
     */
    public java.lang.String getSourceEntity() {
        return sourceEntity;
    }


    /**
     * Sets the sourceEntity value for this PlatformAction.
     * 
     * @param sourceEntity
     */
    public void setSourceEntity(java.lang.String sourceEntity) {
        this.sourceEntity = sourceEntity;
    }


    /**
     * Gets the subtype value for this PlatformAction.
     * 
     * @return subtype
     */
    public java.lang.String getSubtype() {
        return subtype;
    }


    /**
     * Sets the subtype value for this PlatformAction.
     * 
     * @param subtype
     */
    public void setSubtype(java.lang.String subtype) {
        this.subtype = subtype;
    }


    /**
     * Gets the type value for this PlatformAction.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PlatformAction.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlatformAction)) return false;
        PlatformAction other = (PlatformAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionListContext==null && other.getActionListContext()==null) || 
             (this.actionListContext!=null &&
              this.actionListContext.equals(other.getActionListContext()))) &&
            ((this.actionTarget==null && other.getActionTarget()==null) || 
             (this.actionTarget!=null &&
              this.actionTarget.equals(other.getActionTarget()))) &&
            ((this.actionTargetType==null && other.getActionTargetType()==null) || 
             (this.actionTargetType!=null &&
              this.actionTargetType.equals(other.getActionTargetType()))) &&
            ((this.apiName==null && other.getApiName()==null) || 
             (this.apiName!=null &&
              this.apiName.equals(other.getApiName()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.confirmationMessage==null && other.getConfirmationMessage()==null) || 
             (this.confirmationMessage!=null &&
              this.confirmationMessage.equals(other.getConfirmationMessage()))) &&
            ((this.deviceFormat==null && other.getDeviceFormat()==null) || 
             (this.deviceFormat!=null &&
              this.deviceFormat.equals(other.getDeviceFormat()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.iconContentType==null && other.getIconContentType()==null) || 
             (this.iconContentType!=null &&
              this.iconContentType.equals(other.getIconContentType()))) &&
            ((this.iconHeight==null && other.getIconHeight()==null) || 
             (this.iconHeight!=null &&
              this.iconHeight.equals(other.getIconHeight()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.iconWidth==null && other.getIconWidth()==null) || 
             (this.iconWidth!=null &&
              this.iconWidth.equals(other.getIconWidth()))) &&
            ((this.invocationStatus==null && other.getInvocationStatus()==null) || 
             (this.invocationStatus!=null &&
              this.invocationStatus.equals(other.getInvocationStatus()))) &&
            ((this.invokedByUser==null && other.getInvokedByUser()==null) || 
             (this.invokedByUser!=null &&
              this.invokedByUser.equals(other.getInvokedByUser()))) &&
            ((this.invokedByUserId==null && other.getInvokedByUserId()==null) || 
             (this.invokedByUserId!=null &&
              this.invokedByUserId.equals(other.getInvokedByUserId()))) &&
            ((this.isGroupDefault==null && other.getIsGroupDefault()==null) || 
             (this.isGroupDefault!=null &&
              this.isGroupDefault.equals(other.getIsGroupDefault()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.primaryColor==null && other.getPrimaryColor()==null) || 
             (this.primaryColor!=null &&
              this.primaryColor.equals(other.getPrimaryColor()))) &&
            ((this.relatedSourceEntity==null && other.getRelatedSourceEntity()==null) || 
             (this.relatedSourceEntity!=null &&
              this.relatedSourceEntity.equals(other.getRelatedSourceEntity()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.sourceEntity==null && other.getSourceEntity()==null) || 
             (this.sourceEntity!=null &&
              this.sourceEntity.equals(other.getSourceEntity()))) &&
            ((this.subtype==null && other.getSubtype()==null) || 
             (this.subtype!=null &&
              this.subtype.equals(other.getSubtype()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getActionListContext() != null) {
            _hashCode += getActionListContext().hashCode();
        }
        if (getActionTarget() != null) {
            _hashCode += getActionTarget().hashCode();
        }
        if (getActionTargetType() != null) {
            _hashCode += getActionTargetType().hashCode();
        }
        if (getApiName() != null) {
            _hashCode += getApiName().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getConfirmationMessage() != null) {
            _hashCode += getConfirmationMessage().hashCode();
        }
        if (getDeviceFormat() != null) {
            _hashCode += getDeviceFormat().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getIconContentType() != null) {
            _hashCode += getIconContentType().hashCode();
        }
        if (getIconHeight() != null) {
            _hashCode += getIconHeight().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getIconWidth() != null) {
            _hashCode += getIconWidth().hashCode();
        }
        if (getInvocationStatus() != null) {
            _hashCode += getInvocationStatus().hashCode();
        }
        if (getInvokedByUser() != null) {
            _hashCode += getInvokedByUser().hashCode();
        }
        if (getInvokedByUserId() != null) {
            _hashCode += getInvokedByUserId().hashCode();
        }
        if (getIsGroupDefault() != null) {
            _hashCode += getIsGroupDefault().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getPrimaryColor() != null) {
            _hashCode += getPrimaryColor().hashCode();
        }
        if (getRelatedSourceEntity() != null) {
            _hashCode += getRelatedSourceEntity().hashCode();
        }
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getSourceEntity() != null) {
            _hashCode += getSourceEntity().hashCode();
        }
        if (getSubtype() != null) {
            _hashCode += getSubtype().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlatformAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PlatformAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionListContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionListContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionTargetType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionTargetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConfirmationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeviceFormat"));
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
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconContentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IconContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IconHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("iconWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IconWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invocationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InvocationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InvokedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invokedByUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InvokedByUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGroupDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsGroupDefault"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimaryColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSourceEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelatedSourceEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Section"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subtype"));
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
