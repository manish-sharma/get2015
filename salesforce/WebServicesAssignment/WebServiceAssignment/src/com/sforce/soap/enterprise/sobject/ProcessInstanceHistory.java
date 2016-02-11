/**
 * ProcessInstanceHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ProcessInstanceHistory  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.SObject actor;

    private java.lang.String actorId;

    private java.lang.String comments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Double elapsedTimeInDays;

    private java.lang.Double elapsedTimeInHours;

    private java.lang.Double elapsedTimeInMinutes;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isPending;

    private com.sforce.soap.enterprise.sobject.SObject originalActor;

    private java.lang.String originalActorId;

    private com.sforce.soap.enterprise.sobject.ProcessInstance processInstance;

    private java.lang.String processInstanceId;

    private com.sforce.soap.enterprise.sobject.ProcessNode processNode;

    private java.lang.String processNodeId;

    private java.lang.Integer remindersSent;

    private java.lang.String stepStatus;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.SObject targetObject;

    private java.lang.String targetObjectId;

    public ProcessInstanceHistory() {
    }

    public ProcessInstanceHistory(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.SObject actor,
           java.lang.String actorId,
           java.lang.String comments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Double elapsedTimeInDays,
           java.lang.Double elapsedTimeInHours,
           java.lang.Double elapsedTimeInMinutes,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isPending,
           com.sforce.soap.enterprise.sobject.SObject originalActor,
           java.lang.String originalActorId,
           com.sforce.soap.enterprise.sobject.ProcessInstance processInstance,
           java.lang.String processInstanceId,
           com.sforce.soap.enterprise.sobject.ProcessNode processNode,
           java.lang.String processNodeId,
           java.lang.Integer remindersSent,
           java.lang.String stepStatus,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.SObject targetObject,
           java.lang.String targetObjectId) {
        super(
            fieldsToNull,
            id);
        this.actor = actor;
        this.actorId = actorId;
        this.comments = comments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.elapsedTimeInDays = elapsedTimeInDays;
        this.elapsedTimeInHours = elapsedTimeInHours;
        this.elapsedTimeInMinutes = elapsedTimeInMinutes;
        this.isDeleted = isDeleted;
        this.isPending = isPending;
        this.originalActor = originalActor;
        this.originalActorId = originalActorId;
        this.processInstance = processInstance;
        this.processInstanceId = processInstanceId;
        this.processNode = processNode;
        this.processNodeId = processNodeId;
        this.remindersSent = remindersSent;
        this.stepStatus = stepStatus;
        this.systemModstamp = systemModstamp;
        this.targetObject = targetObject;
        this.targetObjectId = targetObjectId;
    }


    /**
     * Gets the actor value for this ProcessInstanceHistory.
     * 
     * @return actor
     */
    public com.sforce.soap.enterprise.sobject.SObject getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this ProcessInstanceHistory.
     * 
     * @param actor
     */
    public void setActor(com.sforce.soap.enterprise.sobject.SObject actor) {
        this.actor = actor;
    }


    /**
     * Gets the actorId value for this ProcessInstanceHistory.
     * 
     * @return actorId
     */
    public java.lang.String getActorId() {
        return actorId;
    }


    /**
     * Sets the actorId value for this ProcessInstanceHistory.
     * 
     * @param actorId
     */
    public void setActorId(java.lang.String actorId) {
        this.actorId = actorId;
    }


    /**
     * Gets the comments value for this ProcessInstanceHistory.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ProcessInstanceHistory.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the createdBy value for this ProcessInstanceHistory.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ProcessInstanceHistory.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ProcessInstanceHistory.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProcessInstanceHistory.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProcessInstanceHistory.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProcessInstanceHistory.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the elapsedTimeInDays value for this ProcessInstanceHistory.
     * 
     * @return elapsedTimeInDays
     */
    public java.lang.Double getElapsedTimeInDays() {
        return elapsedTimeInDays;
    }


    /**
     * Sets the elapsedTimeInDays value for this ProcessInstanceHistory.
     * 
     * @param elapsedTimeInDays
     */
    public void setElapsedTimeInDays(java.lang.Double elapsedTimeInDays) {
        this.elapsedTimeInDays = elapsedTimeInDays;
    }


    /**
     * Gets the elapsedTimeInHours value for this ProcessInstanceHistory.
     * 
     * @return elapsedTimeInHours
     */
    public java.lang.Double getElapsedTimeInHours() {
        return elapsedTimeInHours;
    }


    /**
     * Sets the elapsedTimeInHours value for this ProcessInstanceHistory.
     * 
     * @param elapsedTimeInHours
     */
    public void setElapsedTimeInHours(java.lang.Double elapsedTimeInHours) {
        this.elapsedTimeInHours = elapsedTimeInHours;
    }


    /**
     * Gets the elapsedTimeInMinutes value for this ProcessInstanceHistory.
     * 
     * @return elapsedTimeInMinutes
     */
    public java.lang.Double getElapsedTimeInMinutes() {
        return elapsedTimeInMinutes;
    }


    /**
     * Sets the elapsedTimeInMinutes value for this ProcessInstanceHistory.
     * 
     * @param elapsedTimeInMinutes
     */
    public void setElapsedTimeInMinutes(java.lang.Double elapsedTimeInMinutes) {
        this.elapsedTimeInMinutes = elapsedTimeInMinutes;
    }


    /**
     * Gets the isDeleted value for this ProcessInstanceHistory.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ProcessInstanceHistory.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isPending value for this ProcessInstanceHistory.
     * 
     * @return isPending
     */
    public java.lang.Boolean getIsPending() {
        return isPending;
    }


    /**
     * Sets the isPending value for this ProcessInstanceHistory.
     * 
     * @param isPending
     */
    public void setIsPending(java.lang.Boolean isPending) {
        this.isPending = isPending;
    }


    /**
     * Gets the originalActor value for this ProcessInstanceHistory.
     * 
     * @return originalActor
     */
    public com.sforce.soap.enterprise.sobject.SObject getOriginalActor() {
        return originalActor;
    }


    /**
     * Sets the originalActor value for this ProcessInstanceHistory.
     * 
     * @param originalActor
     */
    public void setOriginalActor(com.sforce.soap.enterprise.sobject.SObject originalActor) {
        this.originalActor = originalActor;
    }


    /**
     * Gets the originalActorId value for this ProcessInstanceHistory.
     * 
     * @return originalActorId
     */
    public java.lang.String getOriginalActorId() {
        return originalActorId;
    }


    /**
     * Sets the originalActorId value for this ProcessInstanceHistory.
     * 
     * @param originalActorId
     */
    public void setOriginalActorId(java.lang.String originalActorId) {
        this.originalActorId = originalActorId;
    }


    /**
     * Gets the processInstance value for this ProcessInstanceHistory.
     * 
     * @return processInstance
     */
    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
        return processInstance;
    }


    /**
     * Sets the processInstance value for this ProcessInstanceHistory.
     * 
     * @param processInstance
     */
    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance processInstance) {
        this.processInstance = processInstance;
    }


    /**
     * Gets the processInstanceId value for this ProcessInstanceHistory.
     * 
     * @return processInstanceId
     */
    public java.lang.String getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessInstanceHistory.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(java.lang.String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the processNode value for this ProcessInstanceHistory.
     * 
     * @return processNode
     */
    public com.sforce.soap.enterprise.sobject.ProcessNode getProcessNode() {
        return processNode;
    }


    /**
     * Sets the processNode value for this ProcessInstanceHistory.
     * 
     * @param processNode
     */
    public void setProcessNode(com.sforce.soap.enterprise.sobject.ProcessNode processNode) {
        this.processNode = processNode;
    }


    /**
     * Gets the processNodeId value for this ProcessInstanceHistory.
     * 
     * @return processNodeId
     */
    public java.lang.String getProcessNodeId() {
        return processNodeId;
    }


    /**
     * Sets the processNodeId value for this ProcessInstanceHistory.
     * 
     * @param processNodeId
     */
    public void setProcessNodeId(java.lang.String processNodeId) {
        this.processNodeId = processNodeId;
    }


    /**
     * Gets the remindersSent value for this ProcessInstanceHistory.
     * 
     * @return remindersSent
     */
    public java.lang.Integer getRemindersSent() {
        return remindersSent;
    }


    /**
     * Sets the remindersSent value for this ProcessInstanceHistory.
     * 
     * @param remindersSent
     */
    public void setRemindersSent(java.lang.Integer remindersSent) {
        this.remindersSent = remindersSent;
    }


    /**
     * Gets the stepStatus value for this ProcessInstanceHistory.
     * 
     * @return stepStatus
     */
    public java.lang.String getStepStatus() {
        return stepStatus;
    }


    /**
     * Sets the stepStatus value for this ProcessInstanceHistory.
     * 
     * @param stepStatus
     */
    public void setStepStatus(java.lang.String stepStatus) {
        this.stepStatus = stepStatus;
    }


    /**
     * Gets the systemModstamp value for this ProcessInstanceHistory.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ProcessInstanceHistory.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the targetObject value for this ProcessInstanceHistory.
     * 
     * @return targetObject
     */
    public com.sforce.soap.enterprise.sobject.SObject getTargetObject() {
        return targetObject;
    }


    /**
     * Sets the targetObject value for this ProcessInstanceHistory.
     * 
     * @param targetObject
     */
    public void setTargetObject(com.sforce.soap.enterprise.sobject.SObject targetObject) {
        this.targetObject = targetObject;
    }


    /**
     * Gets the targetObjectId value for this ProcessInstanceHistory.
     * 
     * @return targetObjectId
     */
    public java.lang.String getTargetObjectId() {
        return targetObjectId;
    }


    /**
     * Sets the targetObjectId value for this ProcessInstanceHistory.
     * 
     * @param targetObjectId
     */
    public void setTargetObjectId(java.lang.String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessInstanceHistory)) return false;
        ProcessInstanceHistory other = (ProcessInstanceHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              this.actor.equals(other.getActor()))) &&
            ((this.actorId==null && other.getActorId()==null) || 
             (this.actorId!=null &&
              this.actorId.equals(other.getActorId()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
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
            ((this.isPending==null && other.getIsPending()==null) || 
             (this.isPending!=null &&
              this.isPending.equals(other.getIsPending()))) &&
            ((this.originalActor==null && other.getOriginalActor()==null) || 
             (this.originalActor!=null &&
              this.originalActor.equals(other.getOriginalActor()))) &&
            ((this.originalActorId==null && other.getOriginalActorId()==null) || 
             (this.originalActorId!=null &&
              this.originalActorId.equals(other.getOriginalActorId()))) &&
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
            ((this.remindersSent==null && other.getRemindersSent()==null) || 
             (this.remindersSent!=null &&
              this.remindersSent.equals(other.getRemindersSent()))) &&
            ((this.stepStatus==null && other.getStepStatus()==null) || 
             (this.stepStatus!=null &&
              this.stepStatus.equals(other.getStepStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.targetObject==null && other.getTargetObject()==null) || 
             (this.targetObject!=null &&
              this.targetObject.equals(other.getTargetObject()))) &&
            ((this.targetObjectId==null && other.getTargetObjectId()==null) || 
             (this.targetObjectId!=null &&
              this.targetObjectId.equals(other.getTargetObjectId())));
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
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        if (getActorId() != null) {
            _hashCode += getActorId().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
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
        if (getIsPending() != null) {
            _hashCode += getIsPending().hashCode();
        }
        if (getOriginalActor() != null) {
            _hashCode += getOriginalActor().hashCode();
        }
        if (getOriginalActorId() != null) {
            _hashCode += getOriginalActorId().hashCode();
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
        if (getRemindersSent() != null) {
            _hashCode += getRemindersSent().hashCode();
        }
        if (getStepStatus() != null) {
            _hashCode += getStepStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTargetObject() != null) {
            _hashCode += getTargetObject().hashCode();
        }
        if (getTargetObjectId() != null) {
            _hashCode += getTargetObjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessInstanceHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments"));
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
        elemField.setFieldName("isPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalActor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OriginalActor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalActorId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OriginalActorId"));
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
        elemField.setFieldName("remindersSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RemindersSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StepStatus"));
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
        elemField.setFieldName("targetObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TargetObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TargetObjectId"));
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
