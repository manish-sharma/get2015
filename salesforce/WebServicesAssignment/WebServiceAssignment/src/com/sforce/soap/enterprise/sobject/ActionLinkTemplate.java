/**
 * ActionLinkTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ActionLinkTemplate  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate actionLinkGroupTemplate;

    private java.lang.String actionLinkGroupTemplateId;

    private java.lang.String actionUrl;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String headers;

    private java.lang.Boolean isConfirmationRequired;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isGroupDefault;

    private java.lang.String label;

    private java.lang.String labelKey;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String linkType;

    private java.lang.String method;

    private java.lang.Integer position;

    private java.lang.String requestBody;

    private java.util.Calendar systemModstamp;

    private java.lang.String userAlias;

    private java.lang.String userVisibility;

    public ActionLinkTemplate() {
    }

    public ActionLinkTemplate(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate actionLinkGroupTemplate,
           java.lang.String actionLinkGroupTemplateId,
           java.lang.String actionUrl,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String headers,
           java.lang.Boolean isConfirmationRequired,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isGroupDefault,
           java.lang.String label,
           java.lang.String labelKey,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String linkType,
           java.lang.String method,
           java.lang.Integer position,
           java.lang.String requestBody,
           java.util.Calendar systemModstamp,
           java.lang.String userAlias,
           java.lang.String userVisibility) {
        super(
            fieldsToNull,
            id);
        this.actionLinkGroupTemplate = actionLinkGroupTemplate;
        this.actionLinkGroupTemplateId = actionLinkGroupTemplateId;
        this.actionUrl = actionUrl;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.headers = headers;
        this.isConfirmationRequired = isConfirmationRequired;
        this.isDeleted = isDeleted;
        this.isGroupDefault = isGroupDefault;
        this.label = label;
        this.labelKey = labelKey;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.linkType = linkType;
        this.method = method;
        this.position = position;
        this.requestBody = requestBody;
        this.systemModstamp = systemModstamp;
        this.userAlias = userAlias;
        this.userVisibility = userVisibility;
    }


    /**
     * Gets the actionLinkGroupTemplate value for this ActionLinkTemplate.
     * 
     * @return actionLinkGroupTemplate
     */
    public com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate getActionLinkGroupTemplate() {
        return actionLinkGroupTemplate;
    }


    /**
     * Sets the actionLinkGroupTemplate value for this ActionLinkTemplate.
     * 
     * @param actionLinkGroupTemplate
     */
    public void setActionLinkGroupTemplate(com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate actionLinkGroupTemplate) {
        this.actionLinkGroupTemplate = actionLinkGroupTemplate;
    }


    /**
     * Gets the actionLinkGroupTemplateId value for this ActionLinkTemplate.
     * 
     * @return actionLinkGroupTemplateId
     */
    public java.lang.String getActionLinkGroupTemplateId() {
        return actionLinkGroupTemplateId;
    }


    /**
     * Sets the actionLinkGroupTemplateId value for this ActionLinkTemplate.
     * 
     * @param actionLinkGroupTemplateId
     */
    public void setActionLinkGroupTemplateId(java.lang.String actionLinkGroupTemplateId) {
        this.actionLinkGroupTemplateId = actionLinkGroupTemplateId;
    }


    /**
     * Gets the actionUrl value for this ActionLinkTemplate.
     * 
     * @return actionUrl
     */
    public java.lang.String getActionUrl() {
        return actionUrl;
    }


    /**
     * Sets the actionUrl value for this ActionLinkTemplate.
     * 
     * @param actionUrl
     */
    public void setActionUrl(java.lang.String actionUrl) {
        this.actionUrl = actionUrl;
    }


    /**
     * Gets the createdBy value for this ActionLinkTemplate.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ActionLinkTemplate.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ActionLinkTemplate.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ActionLinkTemplate.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ActionLinkTemplate.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ActionLinkTemplate.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the headers value for this ActionLinkTemplate.
     * 
     * @return headers
     */
    public java.lang.String getHeaders() {
        return headers;
    }


    /**
     * Sets the headers value for this ActionLinkTemplate.
     * 
     * @param headers
     */
    public void setHeaders(java.lang.String headers) {
        this.headers = headers;
    }


    /**
     * Gets the isConfirmationRequired value for this ActionLinkTemplate.
     * 
     * @return isConfirmationRequired
     */
    public java.lang.Boolean getIsConfirmationRequired() {
        return isConfirmationRequired;
    }


    /**
     * Sets the isConfirmationRequired value for this ActionLinkTemplate.
     * 
     * @param isConfirmationRequired
     */
    public void setIsConfirmationRequired(java.lang.Boolean isConfirmationRequired) {
        this.isConfirmationRequired = isConfirmationRequired;
    }


    /**
     * Gets the isDeleted value for this ActionLinkTemplate.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ActionLinkTemplate.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isGroupDefault value for this ActionLinkTemplate.
     * 
     * @return isGroupDefault
     */
    public java.lang.Boolean getIsGroupDefault() {
        return isGroupDefault;
    }


    /**
     * Sets the isGroupDefault value for this ActionLinkTemplate.
     * 
     * @param isGroupDefault
     */
    public void setIsGroupDefault(java.lang.Boolean isGroupDefault) {
        this.isGroupDefault = isGroupDefault;
    }


    /**
     * Gets the label value for this ActionLinkTemplate.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ActionLinkTemplate.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the labelKey value for this ActionLinkTemplate.
     * 
     * @return labelKey
     */
    public java.lang.String getLabelKey() {
        return labelKey;
    }


    /**
     * Sets the labelKey value for this ActionLinkTemplate.
     * 
     * @param labelKey
     */
    public void setLabelKey(java.lang.String labelKey) {
        this.labelKey = labelKey;
    }


    /**
     * Gets the lastModifiedBy value for this ActionLinkTemplate.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ActionLinkTemplate.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ActionLinkTemplate.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ActionLinkTemplate.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ActionLinkTemplate.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ActionLinkTemplate.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the linkType value for this ActionLinkTemplate.
     * 
     * @return linkType
     */
    public java.lang.String getLinkType() {
        return linkType;
    }


    /**
     * Sets the linkType value for this ActionLinkTemplate.
     * 
     * @param linkType
     */
    public void setLinkType(java.lang.String linkType) {
        this.linkType = linkType;
    }


    /**
     * Gets the method value for this ActionLinkTemplate.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this ActionLinkTemplate.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the position value for this ActionLinkTemplate.
     * 
     * @return position
     */
    public java.lang.Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this ActionLinkTemplate.
     * 
     * @param position
     */
    public void setPosition(java.lang.Integer position) {
        this.position = position;
    }


    /**
     * Gets the requestBody value for this ActionLinkTemplate.
     * 
     * @return requestBody
     */
    public java.lang.String getRequestBody() {
        return requestBody;
    }


    /**
     * Sets the requestBody value for this ActionLinkTemplate.
     * 
     * @param requestBody
     */
    public void setRequestBody(java.lang.String requestBody) {
        this.requestBody = requestBody;
    }


    /**
     * Gets the systemModstamp value for this ActionLinkTemplate.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ActionLinkTemplate.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userAlias value for this ActionLinkTemplate.
     * 
     * @return userAlias
     */
    public java.lang.String getUserAlias() {
        return userAlias;
    }


    /**
     * Sets the userAlias value for this ActionLinkTemplate.
     * 
     * @param userAlias
     */
    public void setUserAlias(java.lang.String userAlias) {
        this.userAlias = userAlias;
    }


    /**
     * Gets the userVisibility value for this ActionLinkTemplate.
     * 
     * @return userVisibility
     */
    public java.lang.String getUserVisibility() {
        return userVisibility;
    }


    /**
     * Sets the userVisibility value for this ActionLinkTemplate.
     * 
     * @param userVisibility
     */
    public void setUserVisibility(java.lang.String userVisibility) {
        this.userVisibility = userVisibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActionLinkTemplate)) return false;
        ActionLinkTemplate other = (ActionLinkTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionLinkGroupTemplate==null && other.getActionLinkGroupTemplate()==null) || 
             (this.actionLinkGroupTemplate!=null &&
              this.actionLinkGroupTemplate.equals(other.getActionLinkGroupTemplate()))) &&
            ((this.actionLinkGroupTemplateId==null && other.getActionLinkGroupTemplateId()==null) || 
             (this.actionLinkGroupTemplateId!=null &&
              this.actionLinkGroupTemplateId.equals(other.getActionLinkGroupTemplateId()))) &&
            ((this.actionUrl==null && other.getActionUrl()==null) || 
             (this.actionUrl!=null &&
              this.actionUrl.equals(other.getActionUrl()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.headers==null && other.getHeaders()==null) || 
             (this.headers!=null &&
              this.headers.equals(other.getHeaders()))) &&
            ((this.isConfirmationRequired==null && other.getIsConfirmationRequired()==null) || 
             (this.isConfirmationRequired!=null &&
              this.isConfirmationRequired.equals(other.getIsConfirmationRequired()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isGroupDefault==null && other.getIsGroupDefault()==null) || 
             (this.isGroupDefault!=null &&
              this.isGroupDefault.equals(other.getIsGroupDefault()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.labelKey==null && other.getLabelKey()==null) || 
             (this.labelKey!=null &&
              this.labelKey.equals(other.getLabelKey()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.linkType==null && other.getLinkType()==null) || 
             (this.linkType!=null &&
              this.linkType.equals(other.getLinkType()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.requestBody==null && other.getRequestBody()==null) || 
             (this.requestBody!=null &&
              this.requestBody.equals(other.getRequestBody()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userAlias==null && other.getUserAlias()==null) || 
             (this.userAlias!=null &&
              this.userAlias.equals(other.getUserAlias()))) &&
            ((this.userVisibility==null && other.getUserVisibility()==null) || 
             (this.userVisibility!=null &&
              this.userVisibility.equals(other.getUserVisibility())));
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
        if (getActionLinkGroupTemplate() != null) {
            _hashCode += getActionLinkGroupTemplate().hashCode();
        }
        if (getActionLinkGroupTemplateId() != null) {
            _hashCode += getActionLinkGroupTemplateId().hashCode();
        }
        if (getActionUrl() != null) {
            _hashCode += getActionUrl().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getHeaders() != null) {
            _hashCode += getHeaders().hashCode();
        }
        if (getIsConfirmationRequired() != null) {
            _hashCode += getIsConfirmationRequired().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsGroupDefault() != null) {
            _hashCode += getIsGroupDefault().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabelKey() != null) {
            _hashCode += getLabelKey().hashCode();
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
        if (getLinkType() != null) {
            _hashCode += getLinkType().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getRequestBody() != null) {
            _hashCode += getRequestBody().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserAlias() != null) {
            _hashCode += getUserAlias().hashCode();
        }
        if (getUserVisibility() != null) {
            _hashCode += getUserVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActionLinkTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionLinkGroupTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkGroupTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkGroupTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionLinkGroupTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkGroupTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("headers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Headers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isConfirmationRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsConfirmationRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("labelKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LabelKey"));
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
        elemField.setFieldName("linkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBody");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RequestBody"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserVisibility"));
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
