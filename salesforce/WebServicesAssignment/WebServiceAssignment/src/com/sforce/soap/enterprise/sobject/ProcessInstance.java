/**
 * ProcessInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ProcessInstance  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
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

    private com.sforce.soap.enterprise.QueryResult nodes;

    private com.sforce.soap.enterprise.sobject.ProcessDefinition processDefinition;

    private java.lang.String processDefinitionId;

    private java.lang.String status;

    private com.sforce.soap.enterprise.QueryResult steps;

    private com.sforce.soap.enterprise.QueryResult stepsAndWorkitems;

    private com.sforce.soap.enterprise.sobject.User submittedBy;

    private java.lang.String submittedById;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.sobject.SObject targetObject;

    private java.lang.String targetObjectId;

    private com.sforce.soap.enterprise.QueryResult workitems;

    public ProcessInstance() {
    }

    public ProcessInstance(
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
           com.sforce.soap.enterprise.QueryResult nodes,
           com.sforce.soap.enterprise.sobject.ProcessDefinition processDefinition,
           java.lang.String processDefinitionId,
           java.lang.String status,
           com.sforce.soap.enterprise.QueryResult steps,
           com.sforce.soap.enterprise.QueryResult stepsAndWorkitems,
           com.sforce.soap.enterprise.sobject.User submittedBy,
           java.lang.String submittedById,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.sobject.SObject targetObject,
           java.lang.String targetObjectId,
           com.sforce.soap.enterprise.QueryResult workitems) {
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
        this.nodes = nodes;
        this.processDefinition = processDefinition;
        this.processDefinitionId = processDefinitionId;
        this.status = status;
        this.steps = steps;
        this.stepsAndWorkitems = stepsAndWorkitems;
        this.submittedBy = submittedBy;
        this.submittedById = submittedById;
        this.systemModstamp = systemModstamp;
        this.targetObject = targetObject;
        this.targetObjectId = targetObjectId;
        this.workitems = workitems;
    }


    /**
     * Gets the completedDate value for this ProcessInstance.
     * 
     * @return completedDate
     */
    public java.util.Calendar getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this ProcessInstance.
     * 
     * @param completedDate
     */
    public void setCompletedDate(java.util.Calendar completedDate) {
        this.completedDate = completedDate;
    }


    /**
     * Gets the createdBy value for this ProcessInstance.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ProcessInstance.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ProcessInstance.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProcessInstance.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProcessInstance.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProcessInstance.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the elapsedTimeInDays value for this ProcessInstance.
     * 
     * @return elapsedTimeInDays
     */
    public java.lang.Double getElapsedTimeInDays() {
        return elapsedTimeInDays;
    }


    /**
     * Sets the elapsedTimeInDays value for this ProcessInstance.
     * 
     * @param elapsedTimeInDays
     */
    public void setElapsedTimeInDays(java.lang.Double elapsedTimeInDays) {
        this.elapsedTimeInDays = elapsedTimeInDays;
    }


    /**
     * Gets the elapsedTimeInHours value for this ProcessInstance.
     * 
     * @return elapsedTimeInHours
     */
    public java.lang.Double getElapsedTimeInHours() {
        return elapsedTimeInHours;
    }


    /**
     * Sets the elapsedTimeInHours value for this ProcessInstance.
     * 
     * @param elapsedTimeInHours
     */
    public void setElapsedTimeInHours(java.lang.Double elapsedTimeInHours) {
        this.elapsedTimeInHours = elapsedTimeInHours;
    }


    /**
     * Gets the elapsedTimeInMinutes value for this ProcessInstance.
     * 
     * @return elapsedTimeInMinutes
     */
    public java.lang.Double getElapsedTimeInMinutes() {
        return elapsedTimeInMinutes;
    }


    /**
     * Sets the elapsedTimeInMinutes value for this ProcessInstance.
     * 
     * @param elapsedTimeInMinutes
     */
    public void setElapsedTimeInMinutes(java.lang.Double elapsedTimeInMinutes) {
        this.elapsedTimeInMinutes = elapsedTimeInMinutes;
    }


    /**
     * Gets the isDeleted value for this ProcessInstance.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ProcessInstance.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastActor value for this ProcessInstance.
     * 
     * @return lastActor
     */
    public com.sforce.soap.enterprise.sobject.User getLastActor() {
        return lastActor;
    }


    /**
     * Sets the lastActor value for this ProcessInstance.
     * 
     * @param lastActor
     */
    public void setLastActor(com.sforce.soap.enterprise.sobject.User lastActor) {
        this.lastActor = lastActor;
    }


    /**
     * Gets the lastActorId value for this ProcessInstance.
     * 
     * @return lastActorId
     */
    public java.lang.String getLastActorId() {
        return lastActorId;
    }


    /**
     * Sets the lastActorId value for this ProcessInstance.
     * 
     * @param lastActorId
     */
    public void setLastActorId(java.lang.String lastActorId) {
        this.lastActorId = lastActorId;
    }


    /**
     * Gets the lastModifiedBy value for this ProcessInstance.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this ProcessInstance.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this ProcessInstance.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this ProcessInstance.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this ProcessInstance.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProcessInstance.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the nodes value for this ProcessInstance.
     * 
     * @return nodes
     */
    public com.sforce.soap.enterprise.QueryResult getNodes() {
        return nodes;
    }


    /**
     * Sets the nodes value for this ProcessInstance.
     * 
     * @param nodes
     */
    public void setNodes(com.sforce.soap.enterprise.QueryResult nodes) {
        this.nodes = nodes;
    }


    /**
     * Gets the processDefinition value for this ProcessInstance.
     * 
     * @return processDefinition
     */
    public com.sforce.soap.enterprise.sobject.ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }


    /**
     * Sets the processDefinition value for this ProcessInstance.
     * 
     * @param processDefinition
     */
    public void setProcessDefinition(com.sforce.soap.enterprise.sobject.ProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
    }


    /**
     * Gets the processDefinitionId value for this ProcessInstance.
     * 
     * @return processDefinitionId
     */
    public java.lang.String getProcessDefinitionId() {
        return processDefinitionId;
    }


    /**
     * Sets the processDefinitionId value for this ProcessInstance.
     * 
     * @param processDefinitionId
     */
    public void setProcessDefinitionId(java.lang.String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }


    /**
     * Gets the status value for this ProcessInstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProcessInstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the steps value for this ProcessInstance.
     * 
     * @return steps
     */
    public com.sforce.soap.enterprise.QueryResult getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this ProcessInstance.
     * 
     * @param steps
     */
    public void setSteps(com.sforce.soap.enterprise.QueryResult steps) {
        this.steps = steps;
    }


    /**
     * Gets the stepsAndWorkitems value for this ProcessInstance.
     * 
     * @return stepsAndWorkitems
     */
    public com.sforce.soap.enterprise.QueryResult getStepsAndWorkitems() {
        return stepsAndWorkitems;
    }


    /**
     * Sets the stepsAndWorkitems value for this ProcessInstance.
     * 
     * @param stepsAndWorkitems
     */
    public void setStepsAndWorkitems(com.sforce.soap.enterprise.QueryResult stepsAndWorkitems) {
        this.stepsAndWorkitems = stepsAndWorkitems;
    }


    /**
     * Gets the submittedBy value for this ProcessInstance.
     * 
     * @return submittedBy
     */
    public com.sforce.soap.enterprise.sobject.User getSubmittedBy() {
        return submittedBy;
    }


    /**
     * Sets the submittedBy value for this ProcessInstance.
     * 
     * @param submittedBy
     */
    public void setSubmittedBy(com.sforce.soap.enterprise.sobject.User submittedBy) {
        this.submittedBy = submittedBy;
    }


    /**
     * Gets the submittedById value for this ProcessInstance.
     * 
     * @return submittedById
     */
    public java.lang.String getSubmittedById() {
        return submittedById;
    }


    /**
     * Sets the submittedById value for this ProcessInstance.
     * 
     * @param submittedById
     */
    public void setSubmittedById(java.lang.String submittedById) {
        this.submittedById = submittedById;
    }


    /**
     * Gets the systemModstamp value for this ProcessInstance.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ProcessInstance.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the targetObject value for this ProcessInstance.
     * 
     * @return targetObject
     */
    public com.sforce.soap.enterprise.sobject.SObject getTargetObject() {
        return targetObject;
    }


    /**
     * Sets the targetObject value for this ProcessInstance.
     * 
     * @param targetObject
     */
    public void setTargetObject(com.sforce.soap.enterprise.sobject.SObject targetObject) {
        this.targetObject = targetObject;
    }


    /**
     * Gets the targetObjectId value for this ProcessInstance.
     * 
     * @return targetObjectId
     */
    public java.lang.String getTargetObjectId() {
        return targetObjectId;
    }


    /**
     * Sets the targetObjectId value for this ProcessInstance.
     * 
     * @param targetObjectId
     */
    public void setTargetObjectId(java.lang.String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }


    /**
     * Gets the workitems value for this ProcessInstance.
     * 
     * @return workitems
     */
    public com.sforce.soap.enterprise.QueryResult getWorkitems() {
        return workitems;
    }


    /**
     * Sets the workitems value for this ProcessInstance.
     * 
     * @param workitems
     */
    public void setWorkitems(com.sforce.soap.enterprise.QueryResult workitems) {
        this.workitems = workitems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessInstance)) return false;
        ProcessInstance other = (ProcessInstance) obj;
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
            ((this.nodes==null && other.getNodes()==null) || 
             (this.nodes!=null &&
              this.nodes.equals(other.getNodes()))) &&
            ((this.processDefinition==null && other.getProcessDefinition()==null) || 
             (this.processDefinition!=null &&
              this.processDefinition.equals(other.getProcessDefinition()))) &&
            ((this.processDefinitionId==null && other.getProcessDefinitionId()==null) || 
             (this.processDefinitionId!=null &&
              this.processDefinitionId.equals(other.getProcessDefinitionId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              this.steps.equals(other.getSteps()))) &&
            ((this.stepsAndWorkitems==null && other.getStepsAndWorkitems()==null) || 
             (this.stepsAndWorkitems!=null &&
              this.stepsAndWorkitems.equals(other.getStepsAndWorkitems()))) &&
            ((this.submittedBy==null && other.getSubmittedBy()==null) || 
             (this.submittedBy!=null &&
              this.submittedBy.equals(other.getSubmittedBy()))) &&
            ((this.submittedById==null && other.getSubmittedById()==null) || 
             (this.submittedById!=null &&
              this.submittedById.equals(other.getSubmittedById()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.targetObject==null && other.getTargetObject()==null) || 
             (this.targetObject!=null &&
              this.targetObject.equals(other.getTargetObject()))) &&
            ((this.targetObjectId==null && other.getTargetObjectId()==null) || 
             (this.targetObjectId!=null &&
              this.targetObjectId.equals(other.getTargetObjectId()))) &&
            ((this.workitems==null && other.getWorkitems()==null) || 
             (this.workitems!=null &&
              this.workitems.equals(other.getWorkitems())));
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
        if (getNodes() != null) {
            _hashCode += getNodes().hashCode();
        }
        if (getProcessDefinition() != null) {
            _hashCode += getProcessDefinition().hashCode();
        }
        if (getProcessDefinitionId() != null) {
            _hashCode += getProcessDefinitionId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSteps() != null) {
            _hashCode += getSteps().hashCode();
        }
        if (getStepsAndWorkitems() != null) {
            _hashCode += getStepsAndWorkitems().hashCode();
        }
        if (getSubmittedBy() != null) {
            _hashCode += getSubmittedBy().hashCode();
        }
        if (getSubmittedById() != null) {
            _hashCode += getSubmittedById().hashCode();
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
        if (getWorkitems() != null) {
            _hashCode += getWorkitems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance"));
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
        elemField.setFieldName("nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessDefinitionId"));
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
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepsAndWorkitems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StepsAndWorkitems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SubmittedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SubmittedById"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Workitems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
