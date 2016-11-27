/**
 * BackgroundOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class BackgroundOperation  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String error;

    private java.lang.String executionGroup;

    private java.util.Calendar expiresAt;

    private java.util.Calendar finishedAt;

    private com.sforce.soap.enterprise.sobject.BackgroundOperation groupLeader;

    private java.lang.String groupLeaderId;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.QueryResult mergedOperations;

    private java.lang.String name;

    private java.lang.Integer numFollowers;

    private java.lang.String parentKey;

    private java.util.Calendar processAfter;

    private java.lang.Integer retryBackoff;

    private java.lang.Integer retryCount;

    private java.lang.Integer retryLimit;

    private java.lang.String sequenceGroup;

    private java.lang.Integer sequenceNumber;

    private java.util.Calendar startedAt;

    private java.lang.String status;

    private java.util.Calendar submittedAt;

    private java.util.Calendar systemModstamp;

    private java.lang.Integer timeout;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String workerUri;

    public BackgroundOperation() {
    }

    public BackgroundOperation(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String error,
           java.lang.String executionGroup,
           java.util.Calendar expiresAt,
           java.util.Calendar finishedAt,
           com.sforce.soap.enterprise.sobject.BackgroundOperation groupLeader,
           java.lang.String groupLeaderId,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.QueryResult mergedOperations,
           java.lang.String name,
           java.lang.Integer numFollowers,
           java.lang.String parentKey,
           java.util.Calendar processAfter,
           java.lang.Integer retryBackoff,
           java.lang.Integer retryCount,
           java.lang.Integer retryLimit,
           java.lang.String sequenceGroup,
           java.lang.Integer sequenceNumber,
           java.util.Calendar startedAt,
           java.lang.String status,
           java.util.Calendar submittedAt,
           java.util.Calendar systemModstamp,
           java.lang.Integer timeout,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String workerUri) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.error = error;
        this.executionGroup = executionGroup;
        this.expiresAt = expiresAt;
        this.finishedAt = finishedAt;
        this.groupLeader = groupLeader;
        this.groupLeaderId = groupLeaderId;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.mergedOperations = mergedOperations;
        this.name = name;
        this.numFollowers = numFollowers;
        this.parentKey = parentKey;
        this.processAfter = processAfter;
        this.retryBackoff = retryBackoff;
        this.retryCount = retryCount;
        this.retryLimit = retryLimit;
        this.sequenceGroup = sequenceGroup;
        this.sequenceNumber = sequenceNumber;
        this.startedAt = startedAt;
        this.status = status;
        this.submittedAt = submittedAt;
        this.systemModstamp = systemModstamp;
        this.timeout = timeout;
        this.userRecordAccess = userRecordAccess;
        this.workerUri = workerUri;
    }


    /**
     * Gets the createdBy value for this BackgroundOperation.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this BackgroundOperation.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this BackgroundOperation.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this BackgroundOperation.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this BackgroundOperation.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this BackgroundOperation.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the error value for this BackgroundOperation.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this BackgroundOperation.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the executionGroup value for this BackgroundOperation.
     * 
     * @return executionGroup
     */
    public java.lang.String getExecutionGroup() {
        return executionGroup;
    }


    /**
     * Sets the executionGroup value for this BackgroundOperation.
     * 
     * @param executionGroup
     */
    public void setExecutionGroup(java.lang.String executionGroup) {
        this.executionGroup = executionGroup;
    }


    /**
     * Gets the expiresAt value for this BackgroundOperation.
     * 
     * @return expiresAt
     */
    public java.util.Calendar getExpiresAt() {
        return expiresAt;
    }


    /**
     * Sets the expiresAt value for this BackgroundOperation.
     * 
     * @param expiresAt
     */
    public void setExpiresAt(java.util.Calendar expiresAt) {
        this.expiresAt = expiresAt;
    }


    /**
     * Gets the finishedAt value for this BackgroundOperation.
     * 
     * @return finishedAt
     */
    public java.util.Calendar getFinishedAt() {
        return finishedAt;
    }


    /**
     * Sets the finishedAt value for this BackgroundOperation.
     * 
     * @param finishedAt
     */
    public void setFinishedAt(java.util.Calendar finishedAt) {
        this.finishedAt = finishedAt;
    }


    /**
     * Gets the groupLeader value for this BackgroundOperation.
     * 
     * @return groupLeader
     */
    public com.sforce.soap.enterprise.sobject.BackgroundOperation getGroupLeader() {
        return groupLeader;
    }


    /**
     * Sets the groupLeader value for this BackgroundOperation.
     * 
     * @param groupLeader
     */
    public void setGroupLeader(com.sforce.soap.enterprise.sobject.BackgroundOperation groupLeader) {
        this.groupLeader = groupLeader;
    }


    /**
     * Gets the groupLeaderId value for this BackgroundOperation.
     * 
     * @return groupLeaderId
     */
    public java.lang.String getGroupLeaderId() {
        return groupLeaderId;
    }


    /**
     * Sets the groupLeaderId value for this BackgroundOperation.
     * 
     * @param groupLeaderId
     */
    public void setGroupLeaderId(java.lang.String groupLeaderId) {
        this.groupLeaderId = groupLeaderId;
    }


    /**
     * Gets the isDeleted value for this BackgroundOperation.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this BackgroundOperation.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this BackgroundOperation.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this BackgroundOperation.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this BackgroundOperation.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this BackgroundOperation.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this BackgroundOperation.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this BackgroundOperation.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mergedOperations value for this BackgroundOperation.
     * 
     * @return mergedOperations
     */
    public com.sforce.soap.enterprise.QueryResult getMergedOperations() {
        return mergedOperations;
    }


    /**
     * Sets the mergedOperations value for this BackgroundOperation.
     * 
     * @param mergedOperations
     */
    public void setMergedOperations(com.sforce.soap.enterprise.QueryResult mergedOperations) {
        this.mergedOperations = mergedOperations;
    }


    /**
     * Gets the name value for this BackgroundOperation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BackgroundOperation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numFollowers value for this BackgroundOperation.
     * 
     * @return numFollowers
     */
    public java.lang.Integer getNumFollowers() {
        return numFollowers;
    }


    /**
     * Sets the numFollowers value for this BackgroundOperation.
     * 
     * @param numFollowers
     */
    public void setNumFollowers(java.lang.Integer numFollowers) {
        this.numFollowers = numFollowers;
    }


    /**
     * Gets the parentKey value for this BackgroundOperation.
     * 
     * @return parentKey
     */
    public java.lang.String getParentKey() {
        return parentKey;
    }


    /**
     * Sets the parentKey value for this BackgroundOperation.
     * 
     * @param parentKey
     */
    public void setParentKey(java.lang.String parentKey) {
        this.parentKey = parentKey;
    }


    /**
     * Gets the processAfter value for this BackgroundOperation.
     * 
     * @return processAfter
     */
    public java.util.Calendar getProcessAfter() {
        return processAfter;
    }


    /**
     * Sets the processAfter value for this BackgroundOperation.
     * 
     * @param processAfter
     */
    public void setProcessAfter(java.util.Calendar processAfter) {
        this.processAfter = processAfter;
    }


    /**
     * Gets the retryBackoff value for this BackgroundOperation.
     * 
     * @return retryBackoff
     */
    public java.lang.Integer getRetryBackoff() {
        return retryBackoff;
    }


    /**
     * Sets the retryBackoff value for this BackgroundOperation.
     * 
     * @param retryBackoff
     */
    public void setRetryBackoff(java.lang.Integer retryBackoff) {
        this.retryBackoff = retryBackoff;
    }


    /**
     * Gets the retryCount value for this BackgroundOperation.
     * 
     * @return retryCount
     */
    public java.lang.Integer getRetryCount() {
        return retryCount;
    }


    /**
     * Sets the retryCount value for this BackgroundOperation.
     * 
     * @param retryCount
     */
    public void setRetryCount(java.lang.Integer retryCount) {
        this.retryCount = retryCount;
    }


    /**
     * Gets the retryLimit value for this BackgroundOperation.
     * 
     * @return retryLimit
     */
    public java.lang.Integer getRetryLimit() {
        return retryLimit;
    }


    /**
     * Sets the retryLimit value for this BackgroundOperation.
     * 
     * @param retryLimit
     */
    public void setRetryLimit(java.lang.Integer retryLimit) {
        this.retryLimit = retryLimit;
    }


    /**
     * Gets the sequenceGroup value for this BackgroundOperation.
     * 
     * @return sequenceGroup
     */
    public java.lang.String getSequenceGroup() {
        return sequenceGroup;
    }


    /**
     * Sets the sequenceGroup value for this BackgroundOperation.
     * 
     * @param sequenceGroup
     */
    public void setSequenceGroup(java.lang.String sequenceGroup) {
        this.sequenceGroup = sequenceGroup;
    }


    /**
     * Gets the sequenceNumber value for this BackgroundOperation.
     * 
     * @return sequenceNumber
     */
    public java.lang.Integer getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this BackgroundOperation.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(java.lang.Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the startedAt value for this BackgroundOperation.
     * 
     * @return startedAt
     */
    public java.util.Calendar getStartedAt() {
        return startedAt;
    }


    /**
     * Sets the startedAt value for this BackgroundOperation.
     * 
     * @param startedAt
     */
    public void setStartedAt(java.util.Calendar startedAt) {
        this.startedAt = startedAt;
    }


    /**
     * Gets the status value for this BackgroundOperation.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this BackgroundOperation.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the submittedAt value for this BackgroundOperation.
     * 
     * @return submittedAt
     */
    public java.util.Calendar getSubmittedAt() {
        return submittedAt;
    }


    /**
     * Sets the submittedAt value for this BackgroundOperation.
     * 
     * @param submittedAt
     */
    public void setSubmittedAt(java.util.Calendar submittedAt) {
        this.submittedAt = submittedAt;
    }


    /**
     * Gets the systemModstamp value for this BackgroundOperation.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this BackgroundOperation.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the timeout value for this BackgroundOperation.
     * 
     * @return timeout
     */
    public java.lang.Integer getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this BackgroundOperation.
     * 
     * @param timeout
     */
    public void setTimeout(java.lang.Integer timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the userRecordAccess value for this BackgroundOperation.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this BackgroundOperation.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the workerUri value for this BackgroundOperation.
     * 
     * @return workerUri
     */
    public java.lang.String getWorkerUri() {
        return workerUri;
    }


    /**
     * Sets the workerUri value for this BackgroundOperation.
     * 
     * @param workerUri
     */
    public void setWorkerUri(java.lang.String workerUri) {
        this.workerUri = workerUri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BackgroundOperation)) return false;
        BackgroundOperation other = (BackgroundOperation) obj;
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
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.executionGroup==null && other.getExecutionGroup()==null) || 
             (this.executionGroup!=null &&
              this.executionGroup.equals(other.getExecutionGroup()))) &&
            ((this.expiresAt==null && other.getExpiresAt()==null) || 
             (this.expiresAt!=null &&
              this.expiresAt.equals(other.getExpiresAt()))) &&
            ((this.finishedAt==null && other.getFinishedAt()==null) || 
             (this.finishedAt!=null &&
              this.finishedAt.equals(other.getFinishedAt()))) &&
            ((this.groupLeader==null && other.getGroupLeader()==null) || 
             (this.groupLeader!=null &&
              this.groupLeader.equals(other.getGroupLeader()))) &&
            ((this.groupLeaderId==null && other.getGroupLeaderId()==null) || 
             (this.groupLeaderId!=null &&
              this.groupLeaderId.equals(other.getGroupLeaderId()))) &&
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
            ((this.mergedOperations==null && other.getMergedOperations()==null) || 
             (this.mergedOperations!=null &&
              this.mergedOperations.equals(other.getMergedOperations()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numFollowers==null && other.getNumFollowers()==null) || 
             (this.numFollowers!=null &&
              this.numFollowers.equals(other.getNumFollowers()))) &&
            ((this.parentKey==null && other.getParentKey()==null) || 
             (this.parentKey!=null &&
              this.parentKey.equals(other.getParentKey()))) &&
            ((this.processAfter==null && other.getProcessAfter()==null) || 
             (this.processAfter!=null &&
              this.processAfter.equals(other.getProcessAfter()))) &&
            ((this.retryBackoff==null && other.getRetryBackoff()==null) || 
             (this.retryBackoff!=null &&
              this.retryBackoff.equals(other.getRetryBackoff()))) &&
            ((this.retryCount==null && other.getRetryCount()==null) || 
             (this.retryCount!=null &&
              this.retryCount.equals(other.getRetryCount()))) &&
            ((this.retryLimit==null && other.getRetryLimit()==null) || 
             (this.retryLimit!=null &&
              this.retryLimit.equals(other.getRetryLimit()))) &&
            ((this.sequenceGroup==null && other.getSequenceGroup()==null) || 
             (this.sequenceGroup!=null &&
              this.sequenceGroup.equals(other.getSequenceGroup()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.startedAt==null && other.getStartedAt()==null) || 
             (this.startedAt!=null &&
              this.startedAt.equals(other.getStartedAt()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.submittedAt==null && other.getSubmittedAt()==null) || 
             (this.submittedAt!=null &&
              this.submittedAt.equals(other.getSubmittedAt()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.workerUri==null && other.getWorkerUri()==null) || 
             (this.workerUri!=null &&
              this.workerUri.equals(other.getWorkerUri())));
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
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getExecutionGroup() != null) {
            _hashCode += getExecutionGroup().hashCode();
        }
        if (getExpiresAt() != null) {
            _hashCode += getExpiresAt().hashCode();
        }
        if (getFinishedAt() != null) {
            _hashCode += getFinishedAt().hashCode();
        }
        if (getGroupLeader() != null) {
            _hashCode += getGroupLeader().hashCode();
        }
        if (getGroupLeaderId() != null) {
            _hashCode += getGroupLeaderId().hashCode();
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
        if (getMergedOperations() != null) {
            _hashCode += getMergedOperations().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumFollowers() != null) {
            _hashCode += getNumFollowers().hashCode();
        }
        if (getParentKey() != null) {
            _hashCode += getParentKey().hashCode();
        }
        if (getProcessAfter() != null) {
            _hashCode += getProcessAfter().hashCode();
        }
        if (getRetryBackoff() != null) {
            _hashCode += getRetryBackoff().hashCode();
        }
        if (getRetryCount() != null) {
            _hashCode += getRetryCount().hashCode();
        }
        if (getRetryLimit() != null) {
            _hashCode += getRetryLimit().hashCode();
        }
        if (getSequenceGroup() != null) {
            _hashCode += getSequenceGroup().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getStartedAt() != null) {
            _hashCode += getStartedAt().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubmittedAt() != null) {
            _hashCode += getSubmittedAt().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getWorkerUri() != null) {
            _hashCode += getWorkerUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BackgroundOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BackgroundOperation"));
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
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExecutionGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiresAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExpiresAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FinishedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupLeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupLeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BackgroundOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupLeaderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupLeaderId"));
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
        elemField.setFieldName("mergedOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MergedOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("numFollowers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumFollowers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryBackoff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RetryBackoff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RetryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RetryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SequenceGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StartedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("submittedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SubmittedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workerUri");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WorkerUri"));
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
