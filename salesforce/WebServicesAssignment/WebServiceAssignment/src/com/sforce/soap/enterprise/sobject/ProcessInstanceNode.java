/**
 * ProcessInstanceNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ProcessInstanceNode  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.util.Calendar completedDate;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double elapsedTimeInDays;

    private java.lang.Double elapsedTimeInHours;

    private java.lang.Double elapsedTimeInMinutes;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastActor;

    private java.lang.String lastActorId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String nodeStatus;

    private com.sforce.soap.enterprise.sobject.ProcessInstance processInstance;

    private java.lang.String processInstanceId;

    private com.sforce.soap.enterprise.sobject.ProcessNode processNode;

    private java.lang.String processNodeId;

    private java.lang.String processNodeName;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    public ProcessInstanceNode() {
    }

    public ProcessInstanceNode(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.util.Calendar completedDate,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double elapsedTimeInDays,
           java.lang.Double elapsedTimeInHours,
           java.lang.Double elapsedTimeInMinutes,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastActor,
           java.lang.String lastActorId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String nodeStatus,
           com.sforce.soap.enterprise.sobject.ProcessInstance processInstance,
           java.lang.String processInstanceId,
           com.sforce.soap.enterprise.sobject.ProcessNode processNode,
           java.lang.String processNodeId,
           java.lang.String processNodeName,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        super(
            fieldsToNull,
            id);
        this.completedDate = completedDate;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.elapsedTimeInDays = elapsedTimeInDays;
        this.elapsedTimeInHours = elapsedTimeInHours;
        this.elapsedTimeInMinutes = elapsedTimeInMinutes;
        this.isDeleted = isDeleted;
        this.lastActor = lastActor;
        this.lastActorId = lastActorId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.nodeStatus = nodeStatus;
        this.processInstance = processInstance;
        this.processInstanceId = processInstanceId;
        this.processNode = processNode;
        this.processNodeId = processNodeId;
        this.processNodeName = processNodeName;
        this.systemModstamp = systemModstamp;
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the completedDate value for this ProcessInstanceNode.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this ProcessInstanceNode.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createdBy value for this ProcessInstanceNode.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ProcessInstanceNode.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ProcessInstanceNode.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProcessInstanceNode.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProcessInstanceNode.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProcessInstanceNode.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the elapsedTimeInDays value for this ProcessInstanceNode.
     * 
     * @return elapsedTimeInDays
     */
    public java.lang.Double getElapsedTimeInDays() {
        return elapsedTimeInDays;
    }


    /**
     * Sets the elapsedTimeInDays value for this ProcessInstanceNode.
     * 
     * @param elapsedTimeInDays
     */
    public void setElapsedTimeInDays(java.lang.Double elapsedTimeInDays) {
        this.elapsedTimeInDays = elapsedTimeInDays;
    }


    /**
     * Gets the elapsedTimeInHours value for this ProcessInstanceNode.
     * 
     * @return elapsedTimeInHours
     */
    public java.lang.Double getElapsedTimeInHours() {
        return elapsedTimeInHours;
    }


    /**
     * Sets the elapsedTimeInHours value for this ProcessInstanceNode.
     * 
     * @param elapsedTimeInHours
     */
    public void setElapsedTimeInHours(java.lang.Double elapsedTimeInHours) {
        this.elapsedTimeInHours = elapsedTimeInHours;
    }


    /**
     * Gets the elapsedTimeInMinutes value for this ProcessInstanceNode.
     * 
     * @return elapsedTimeInMinutes
     */
    public java.lang.Double getElapsedTimeInMinutes() {
        return elapsedTimeInMinutes;
    }


    /**
     * Sets the elapsedTimeInMinutes value for this ProcessInstanceNode.
     * 
     * @param elapsedTimeInMinutes
     */
    public void setElapsedTimeInMinutes(java.lang.Double elapsedTimeInMinutes) {
        this.elapsedTimeInMinutes = elapsedTimeInMinutes;
    }


    /**
     * Gets the isDeleted value for this ProcessInstanceNode.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ProcessInstanceNode.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActor value for this ProcessInstanceNode.
     * 
     * @return lastActor
     */
    public com.sforce.soap.enterprise.sobject.User getLastActor() {
        return lastActor;
    }


    /**
     * Sets the lastActor value for this ProcessInstanceNode.
     * 
     * @param lastActor
     */
    public void setLastActor(com.sforce.soap.enterprise.sobject.User lastActor) {
        this.lastActor = lastActor;
    }


    /**
     * Gets the lastActorId value for this ProcessInstanceNode.
     * 
     * @return lastActorId
     */
    public java.lang.String getLastActorId() {
        return lastActorId;
    }


    /**
     * Sets the lastActorId value for this ProcessInstanceNode.
     * 
     * @param lastActorId
     */
    public void setLastActorId(java.lang.String lastActorId) {
        this.lastActorId = lastActorId;
    }


    /**
     * Gets the lastModifiedBy value for this ProcessInstanceNode.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ProcessInstanceNode.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ProcessInstanceNode.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ProcessInstanceNode.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ProcessInstanceNode.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProcessInstanceNode.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nodeStatus value for this ProcessInstanceNode.
     * 
     * @return nodeStatus
     */
    public java.lang.String getNodeStatus() {
        return nodeStatus;
    }


    /**
     * Sets the nodeStatus value for this ProcessInstanceNode.
     * 
     * @param nodeStatus
     */
    public void setNodeStatus(java.lang.String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }


    /**
     * Gets the processInstance value for this ProcessInstanceNode.
     * 
     * @return processInstance
     */
    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
        return processInstance;
    }


    /**
     * Sets the processInstance value for this ProcessInstanceNode.
     * 
     * @param processInstance
     */
    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance processInstance) {
        this.processInstance = processInstance;
    }


    /**
     * Gets the processInstanceId value for this ProcessInstanceNode.
     * 
     * @return processInstanceId
     */
    public java.lang.String getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessInstanceNode.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(java.lang.String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the processNode value for this ProcessInstanceNode.
     * 
     * @return processNode
     */
    public com.sforce.soap.enterprise.sobject.ProcessNode getProcessNode() {
        return processNode;
    }


    /**
     * Sets the processNode value for this ProcessInstanceNode.
     * 
     * @param processNode
     */
    public void setProcessNode(com.sforce.soap.enterprise.sobject.ProcessNode processNode) {
        this.processNode = processNode;
    }


    /**
     * Gets the processNodeId value for this ProcessInstanceNode.
     * 
     * @return processNodeId
     */
    public java.lang.String getProcessNodeId() {
        return processNodeId;
    }


    /**
     * Sets the processNodeId value for this ProcessInstanceNode.
     * 
     * @param processNodeId
     */
    public void setProcessNodeId(java.lang.String processNodeId) {
        this.processNodeId = processNodeId;
    }


    /**
     * Gets the processNodeName value for this ProcessInstanceNode.
     * 
     * @return processNodeName
     */
    public java.lang.String getProcessNodeName() {
        return processNodeName;
    }


    /**
     * Sets the processNodeName value for this ProcessInstanceNode.
     * 
     * @param processNodeName
     */
    public void setProcessNodeName(java.lang.String processNodeName) {
        this.processNodeName = processNodeName;
    }


    /**
     * Gets the systemModstamp value for this ProcessInstanceNode.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ProcessInstanceNode.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the userRecordAccess value for this ProcessInstanceNode.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this ProcessInstanceNode.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessInstanceNode)) return false;
        ProcessInstanceNode other = (ProcessInstanceNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              this.completedDate.equals(other.getCompletedDate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.elapsedTimeInDays==null && other.getElapsedTimeInDays()==null) || 
             (this.elapsedTimeInDays!=null &&
              this.elapsedTimeInDays.equals(other.getElapsedTimeInDays()))) &&
            ((this.elapsedTimeInHours==null && other.getElapsedTimeInHours()==null) || 
             (this.elapsedTimeInHours!=null &&
              this.elapsedTimeInHours.equals(other.getElapsedTimeInHours()))) &&
            ((this.elapsedTimeInMinutes==null && other.getElapsedTimeInMinutes()==null) || 
             (this.elapsedTimeInMinutes!=null &&
              this.elapsedTimeInMinutes.equals(other.getElapsedTimeInMinutes()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastActor==null && other.getLastActor()==null) || 
             (this.lastActor!=null &&
              this.lastActor.equals(other.getLastActor()))) &&
            ((this.lastActorId==null && other.getLastActorId()==null) || 
             (this.lastActorId!=null &&
              this.lastActorId.equals(other.getLastActorId()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.nodeStatus==null && other.getNodeStatus()==null) || 
             (this.nodeStatus!=null &&
              this.nodeStatus.equals(other.getNodeStatus()))) &&
            ((this.processInstance==null && other.getProcessInstance()==null) || 
             (this.processInstance!=null &&
              this.processInstance.equals(other.getProcessInstance()))) &&
            ((this.processInstanceId==null && other.getProcessInstanceId()==null) || 
             (this.processInstanceId!=null &&
              this.processInstanceId.equals(other.getProcessInstanceId()))) &&
            ((this.processNode==null && other.getProcessNode()==null) || 
             (this.processNode!=null &&
              this.processNode.equals(other.getProcessNode()))) &&
            ((this.processNodeId==null && other.getProcessNodeId()==null) || 
             (this.processNodeId!=null &&
              this.processNodeId.equals(other.getProcessNodeId()))) &&
            ((this.processNodeName==null && other.getProcessNodeName()==null) || 
             (this.processNodeName!=null &&
              this.processNodeName.equals(other.getProcessNodeName()))) &&
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
        if (getCompletedDate() != null) {
            _hashCode += getCompletedDate().hashCode();
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
        if (getElapsedTimeInDays() != null) {
            _hashCode += getElapsedTimeInDays().hashCode();
        }
        if (getElapsedTimeInHours() != null) {
            _hashCode += getElapsedTimeInHours().hashCode();
        }
        if (getElapsedTimeInMinutes() != null) {
            _hashCode += getElapsedTimeInMinutes().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastActor() != null) {
            _hashCode += getLastActor().hashCode();
        }
        if (getLastActorId() != null) {
            _hashCode += getLastActorId().hashCode();
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
        if (getNodeStatus() != null) {
            _hashCode += getNodeStatus().hashCode();
        }
        if (getProcessInstance() != null) {
            _hashCode += getProcessInstance().hashCode();
        }
        if (getProcessInstanceId() != null) {
            _hashCode += getProcessInstanceId().hashCode();
        }
        if (getProcessNode() != null) {
            _hashCode += getProcessNode().hashCode();
        }
        if (getProcessNodeId() != null) {
            _hashCode += getProcessNodeId().hashCode();
        }
        if (getProcessNodeName() != null) {
            _hashCode += getProcessNodeName().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProcessInstanceNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompletedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("elapsedTimeInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ElapsedTimeInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTimeInHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ElapsedTimeInHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTimeInMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ElapsedTimeInMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("lastActor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActorId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActorId"));
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
        elemField.setFieldName("nodeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NodeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processNode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessNode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processNodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessNodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processNodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessNodeName"));
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
