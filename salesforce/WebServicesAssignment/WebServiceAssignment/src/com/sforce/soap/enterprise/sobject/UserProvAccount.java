/**
 * UserProvAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserProvAccount  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp;

    private java.lang.String connectedAppId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.util.Calendar deletedDate;

    private java.lang.String externalEmail;

    private java.lang.String externalFirstName;

    private java.lang.String externalLastName;

    private java.lang.String externalUserId;

    private java.lang.String externalUsername;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isKnownLink;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String linkState;

    private java.lang.String name;

    private com.sforce.soap.enterprise.sobject.User salesforceUser;

    private java.lang.String salesforceUserId;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    public UserProvAccount() {
    }

    public UserProvAccount(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp,
           java.lang.String connectedAppId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.util.Calendar deletedDate,
           java.lang.String externalEmail,
           java.lang.String externalFirstName,
           java.lang.String externalLastName,
           java.lang.String externalUserId,
           java.lang.String externalUsername,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isKnownLink,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String linkState,
           java.lang.String name,
           com.sforce.soap.enterprise.sobject.User salesforceUser,
           java.lang.String salesforceUserId,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        super(
            fieldsToNull,
            id);
        this.connectedApp = connectedApp;
        this.connectedAppId = connectedAppId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.deletedDate = deletedDate;
        this.externalEmail = externalEmail;
        this.externalFirstName = externalFirstName;
        this.externalLastName = externalLastName;
        this.externalUserId = externalUserId;
        this.externalUsername = externalUsername;
        this.isDeleted = isDeleted;
        this.isKnownLink = isKnownLink;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.linkState = linkState;
        this.name = name;
        this.salesforceUser = salesforceUser;
        this.salesforceUserId = salesforceUserId;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the connectedApp value for this UserProvAccount.
     * 
     * @return connectedApp
     */
    public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
        return connectedApp;
    }


    /**
     * Sets the connectedApp value for this UserProvAccount.
     * 
     * @param connectedApp
     */
    public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication connectedApp) {
        this.connectedApp = connectedApp;
    }


    /**
     * Gets the connectedAppId value for this UserProvAccount.
     * 
     * @return connectedAppId
     */
    public java.lang.String getConnectedAppId() {
        return connectedAppId;
    }


    /**
     * Sets the connectedAppId value for this UserProvAccount.
     * 
     * @param connectedAppId
     */
    public void setConnectedAppId(java.lang.String connectedAppId) {
        this.connectedAppId = connectedAppId;
    }


    /**
     * Gets the createdBy value for this UserProvAccount.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this UserProvAccount.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this UserProvAccount.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this UserProvAccount.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this UserProvAccount.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this UserProvAccount.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the deletedDate value for this UserProvAccount.
     * 
     * @return deletedDate
     */
    public java.util.Calendar getDeletedDate() {
        return deletedDate;
    }


    /**
     * Sets the deletedDate value for this UserProvAccount.
     * 
     * @param deletedDate
     */
    public void setDeletedDate(java.util.Calendar deletedDate) {
        this.deletedDate = deletedDate;
    }


    /**
     * Gets the externalEmail value for this UserProvAccount.
     * 
     * @return externalEmail
     */
    public java.lang.String getExternalEmail() {
        return externalEmail;
    }


    /**
     * Sets the externalEmail value for this UserProvAccount.
     * 
     * @param externalEmail
     */
    public void setExternalEmail(java.lang.String externalEmail) {
        this.externalEmail = externalEmail;
    }


    /**
     * Gets the externalFirstName value for this UserProvAccount.
     * 
     * @return externalFirstName
     */
    public java.lang.String getExternalFirstName() {
        return externalFirstName;
    }


    /**
     * Sets the externalFirstName value for this UserProvAccount.
     * 
     * @param externalFirstName
     */
    public void setExternalFirstName(java.lang.String externalFirstName) {
        this.externalFirstName = externalFirstName;
    }


    /**
     * Gets the externalLastName value for this UserProvAccount.
     * 
     * @return externalLastName
     */
    public java.lang.String getExternalLastName() {
        return externalLastName;
    }


    /**
     * Sets the externalLastName value for this UserProvAccount.
     * 
     * @param externalLastName
     */
    public void setExternalLastName(java.lang.String externalLastName) {
        this.externalLastName = externalLastName;
    }


    /**
     * Gets the externalUserId value for this UserProvAccount.
     * 
     * @return externalUserId
     */
    public java.lang.String getExternalUserId() {
        return externalUserId;
    }


    /**
     * Sets the externalUserId value for this UserProvAccount.
     * 
     * @param externalUserId
     */
    public void setExternalUserId(java.lang.String externalUserId) {
        this.externalUserId = externalUserId;
    }


    /**
     * Gets the externalUsername value for this UserProvAccount.
     * 
     * @return externalUsername
     */
    public java.lang.String getExternalUsername() {
        return externalUsername;
    }


    /**
     * Sets the externalUsername value for this UserProvAccount.
     * 
     * @param externalUsername
     */
    public void setExternalUsername(java.lang.String externalUsername) {
        this.externalUsername = externalUsername;
    }


    /**
     * Gets the isDeleted value for this UserProvAccount.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this UserProvAccount.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isKnownLink value for this UserProvAccount.
     * 
     * @return isKnownLink
     */
    public java.lang.Boolean getIsKnownLink() {
        return isKnownLink;
    }


    /**
     * Sets the isKnownLink value for this UserProvAccount.
     * 
     * @param isKnownLink
     */
    public void setIsKnownLink(java.lang.Boolean isKnownLink) {
        this.isKnownLink = isKnownLink;
    }


    /**
     * Gets the lastModifiedBy value for this UserProvAccount.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this UserProvAccount.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this UserProvAccount.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this UserProvAccount.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this UserProvAccount.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this UserProvAccount.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the linkState value for this UserProvAccount.
     * 
     * @return linkState
     */
    public java.lang.String getLinkState() {
        return linkState;
    }


    /**
     * Sets the linkState value for this UserProvAccount.
     * 
     * @param linkState
     */
    public void setLinkState(java.lang.String linkState) {
        this.linkState = linkState;
    }


    /**
     * Gets the name value for this UserProvAccount.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserProvAccount.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the salesforceUser value for this UserProvAccount.
     * 
     * @return salesforceUser
     */
    public com.sforce.soap.enterprise.sobject.User getSalesforceUser() {
        return salesforceUser;
    }


    /**
     * Sets the salesforceUser value for this UserProvAccount.
     * 
     * @param salesforceUser
     */
    public void setSalesforceUser(com.sforce.soap.enterprise.sobject.User salesforceUser) {
        this.salesforceUser = salesforceUser;
    }


    /**
     * Gets the salesforceUserId value for this UserProvAccount.
     * 
     * @return salesforceUserId
     */
    public java.lang.String getSalesforceUserId() {
        return salesforceUserId;
    }


    /**
     * Sets the salesforceUserId value for this UserProvAccount.
     * 
     * @param salesforceUserId
     */
    public void setSalesforceUserId(java.lang.String salesforceUserId) {
        this.salesforceUserId = salesforceUserId;
    }


    /**
     * Gets the status value for this UserProvAccount.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserProvAccount.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this UserProvAccount.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this UserProvAccount.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userRecordAccess value for this UserProvAccount.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this UserProvAccount.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProvAccount)) return false;
        UserProvAccount other = (UserProvAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectedApp==null && other.getConnectedApp()==null) || 
             (this.connectedApp!=null &&
              this.connectedApp.equals(other.getConnectedApp()))) &&
            ((this.connectedAppId==null && other.getConnectedAppId()==null) || 
             (this.connectedAppId!=null &&
              this.connectedAppId.equals(other.getConnectedAppId()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.deletedDate==null && other.getDeletedDate()==null) || 
             (this.deletedDate!=null &&
              this.deletedDate.equals(other.getDeletedDate()))) &&
            ((this.externalEmail==null && other.getExternalEmail()==null) || 
             (this.externalEmail!=null &&
              this.externalEmail.equals(other.getExternalEmail()))) &&
            ((this.externalFirstName==null && other.getExternalFirstName()==null) || 
             (this.externalFirstName!=null &&
              this.externalFirstName.equals(other.getExternalFirstName()))) &&
            ((this.externalLastName==null && other.getExternalLastName()==null) || 
             (this.externalLastName!=null &&
              this.externalLastName.equals(other.getExternalLastName()))) &&
            ((this.externalUserId==null && other.getExternalUserId()==null) || 
             (this.externalUserId!=null &&
              this.externalUserId.equals(other.getExternalUserId()))) &&
            ((this.externalUsername==null && other.getExternalUsername()==null) || 
             (this.externalUsername!=null &&
              this.externalUsername.equals(other.getExternalUsername()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isKnownLink==null && other.getIsKnownLink()==null) || 
             (this.isKnownLink!=null &&
              this.isKnownLink.equals(other.getIsKnownLink()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.linkState==null && other.getLinkState()==null) || 
             (this.linkState!=null &&
              this.linkState.equals(other.getLinkState()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.salesforceUser==null && other.getSalesforceUser()==null) || 
             (this.salesforceUser!=null &&
              this.salesforceUser.equals(other.getSalesforceUser()))) &&
            ((this.salesforceUserId==null && other.getSalesforceUserId()==null) || 
             (this.salesforceUserId!=null &&
              this.salesforceUserId.equals(other.getSalesforceUserId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess())));
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
        if (getConnectedApp() != null) {
            _hashCode += getConnectedApp().hashCode();
        }
        if (getConnectedAppId() != null) {
            _hashCode += getConnectedAppId().hashCode();
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
        if (getDeletedDate() != null) {
            _hashCode += getDeletedDate().hashCode();
        }
        if (getExternalEmail() != null) {
            _hashCode += getExternalEmail().hashCode();
        }
        if (getExternalFirstName() != null) {
            _hashCode += getExternalFirstName().hashCode();
        }
        if (getExternalLastName() != null) {
            _hashCode += getExternalLastName().hashCode();
        }
        if (getExternalUserId() != null) {
            _hashCode += getExternalUserId().hashCode();
        }
        if (getExternalUsername() != null) {
            _hashCode += getExternalUsername().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsKnownLink() != null) {
            _hashCode += getIsKnownLink().hashCode();
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
        if (getLinkState() != null) {
            _hashCode += getLinkState().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSalesforceUser() != null) {
            _hashCode += getSalesforceUser().hashCode();
        }
        if (getSalesforceUserId() != null) {
            _hashCode += getSalesforceUserId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProvAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedApp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectedAppId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedAppId"));
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
        elemField.setFieldName("deletedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalUsername"));
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
        elemField.setFieldName("isKnownLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsKnownLink"));
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
        elemField.setFieldName("linkState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkState"));
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
        elemField.setFieldName("salesforceUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesforceUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesforceUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
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
        elemField.setFieldName("userRecordAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
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
