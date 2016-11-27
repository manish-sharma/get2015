/**
 * FeedComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class FeedComment  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String commentBody;

    private java.lang.String commentType;

    private com.sforce.soap.enterprise.sobject.SObject createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String feedItemId;

    private com.sforce.soap.enterprise.QueryResult feedRevisions;

    private com.sforce.soap.enterprise.sobject.User insertedBy;

    private java.lang.String insertedById;

    private java.lang.Boolean isDeleted;

    private java.lang.String lastEditById;

    private java.util.Calendar lastEditDate;

    private java.lang.String parentId;

    private java.lang.String relatedRecordId;

    private java.lang.Integer revision;

    public FeedComment() {
    }

    public FeedComment(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String commentBody,
           java.lang.String commentType,
           com.sforce.soap.enterprise.sobject.SObject createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String feedItemId,
           com.sforce.soap.enterprise.QueryResult feedRevisions,
           com.sforce.soap.enterprise.sobject.User insertedBy,
           java.lang.String insertedById,
           java.lang.Boolean isDeleted,
           java.lang.String lastEditById,
           java.util.Calendar lastEditDate,
           java.lang.String parentId,
           java.lang.String relatedRecordId,
           java.lang.Integer revision) {
        super(
            fieldsToNull,
            id);
        this.commentBody = commentBody;
        this.commentType = commentType;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedItemId = feedItemId;
        this.feedRevisions = feedRevisions;
        this.insertedBy = insertedBy;
        this.insertedById = insertedById;
        this.isDeleted = isDeleted;
        this.lastEditById = lastEditById;
        this.lastEditDate = lastEditDate;
        this.parentId = parentId;
        this.relatedRecordId = relatedRecordId;
        this.revision = revision;
    }


    /**
     * Gets the commentBody value for this FeedComment.
     * 
     * @return commentBody
     */
    public java.lang.String getCommentBody() {
        return commentBody;
    }


    /**
     * Sets the commentBody value for this FeedComment.
     * 
     * @param commentBody
     */
    public void setCommentBody(java.lang.String commentBody) {
        this.commentBody = commentBody;
    }


    /**
     * Gets the commentType value for this FeedComment.
     * 
     * @return commentType
     */
    public java.lang.String getCommentType() {
        return commentType;
    }


    /**
     * Sets the commentType value for this FeedComment.
     * 
     * @param commentType
     */
    public void setCommentType(java.lang.String commentType) {
        this.commentType = commentType;
    }


    /**
     * Gets the createdBy value for this FeedComment.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.SObject getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FeedComment.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.SObject createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this FeedComment.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this FeedComment.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this FeedComment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this FeedComment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedItemId value for this FeedComment.
     * 
     * @return feedItemId
     */
    public java.lang.String getFeedItemId() {
        return feedItemId;
    }


    /**
     * Sets the feedItemId value for this FeedComment.
     * 
     * @param feedItemId
     */
    public void setFeedItemId(java.lang.String feedItemId) {
        this.feedItemId = feedItemId;
    }


    /**
     * Gets the feedRevisions value for this FeedComment.
     * 
     * @return feedRevisions
     */
    public com.sforce.soap.enterprise.QueryResult getFeedRevisions() {
        return feedRevisions;
    }


    /**
     * Sets the feedRevisions value for this FeedComment.
     * 
     * @param feedRevisions
     */
    public void setFeedRevisions(com.sforce.soap.enterprise.QueryResult feedRevisions) {
        this.feedRevisions = feedRevisions;
    }


    /**
     * Gets the insertedBy value for this FeedComment.
     * 
     * @return insertedBy
     */
    public com.sforce.soap.enterprise.sobject.User getInsertedBy() {
        return insertedBy;
    }


    /**
     * Sets the insertedBy value for this FeedComment.
     * 
     * @param insertedBy
     */
    public void setInsertedBy(com.sforce.soap.enterprise.sobject.User insertedBy) {
        this.insertedBy = insertedBy;
    }


    /**
     * Gets the insertedById value for this FeedComment.
     * 
     * @return insertedById
     */
    public java.lang.String getInsertedById() {
        return insertedById;
    }


    /**
     * Sets the insertedById value for this FeedComment.
     * 
     * @param insertedById
     */
    public void setInsertedById(java.lang.String insertedById) {
        this.insertedById = insertedById;
    }


    /**
     * Gets the isDeleted value for this FeedComment.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this FeedComment.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastEditById value for this FeedComment.
     * 
     * @return lastEditById
     */
    public java.lang.String getLastEditById() {
        return lastEditById;
    }


    /**
     * Sets the lastEditById value for this FeedComment.
     * 
     * @param lastEditById
     */
    public void setLastEditById(java.lang.String lastEditById) {
        this.lastEditById = lastEditById;
    }


    /**
     * Gets the lastEditDate value for this FeedComment.
     * 
     * @return lastEditDate
     */
    public java.util.Calendar getLastEditDate() {
        return lastEditDate;
    }


    /**
     * Sets the lastEditDate value for this FeedComment.
     * 
     * @param lastEditDate
     */
    public void setLastEditDate(java.util.Calendar lastEditDate) {
        this.lastEditDate = lastEditDate;
    }


    /**
     * Gets the parentId value for this FeedComment.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this FeedComment.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the relatedRecordId value for this FeedComment.
     * 
     * @return relatedRecordId
     */
    public java.lang.String getRelatedRecordId() {
        return relatedRecordId;
    }


    /**
     * Sets the relatedRecordId value for this FeedComment.
     * 
     * @param relatedRecordId
     */
    public void setRelatedRecordId(java.lang.String relatedRecordId) {
        this.relatedRecordId = relatedRecordId;
    }


    /**
     * Gets the revision value for this FeedComment.
     * 
     * @return revision
     */
    public java.lang.Integer getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this FeedComment.
     * 
     * @param revision
     */
    public void setRevision(java.lang.Integer revision) {
        this.revision = revision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedComment)) return false;
        FeedComment other = (FeedComment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commentBody==null && other.getCommentBody()==null) || 
             (this.commentBody!=null &&
              this.commentBody.equals(other.getCommentBody()))) &&
            ((this.commentType==null && other.getCommentType()==null) || 
             (this.commentType!=null &&
              this.commentType.equals(other.getCommentType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedItemId==null && other.getFeedItemId()==null) || 
             (this.feedItemId!=null &&
              this.feedItemId.equals(other.getFeedItemId()))) &&
            ((this.feedRevisions==null && other.getFeedRevisions()==null) || 
             (this.feedRevisions!=null &&
              this.feedRevisions.equals(other.getFeedRevisions()))) &&
            ((this.insertedBy==null && other.getInsertedBy()==null) || 
             (this.insertedBy!=null &&
              this.insertedBy.equals(other.getInsertedBy()))) &&
            ((this.insertedById==null && other.getInsertedById()==null) || 
             (this.insertedById!=null &&
              this.insertedById.equals(other.getInsertedById()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.lastEditById==null && other.getLastEditById()==null) || 
             (this.lastEditById!=null &&
              this.lastEditById.equals(other.getLastEditById()))) &&
            ((this.lastEditDate==null && other.getLastEditDate()==null) || 
             (this.lastEditDate!=null &&
              this.lastEditDate.equals(other.getLastEditDate()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.relatedRecordId==null && other.getRelatedRecordId()==null) || 
             (this.relatedRecordId!=null &&
              this.relatedRecordId.equals(other.getRelatedRecordId()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision())));
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
        if (getCommentBody() != null) {
            _hashCode += getCommentBody().hashCode();
        }
        if (getCommentType() != null) {
            _hashCode += getCommentType().hashCode();
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
        if (getFeedItemId() != null) {
            _hashCode += getFeedItemId().hashCode();
        }
        if (getFeedRevisions() != null) {
            _hashCode += getFeedRevisions().hashCode();
        }
        if (getInsertedBy() != null) {
            _hashCode += getInsertedBy().hashCode();
        }
        if (getInsertedById() != null) {
            _hashCode += getInsertedById().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLastEditById() != null) {
            _hashCode += getLastEditById().hashCode();
        }
        if (getLastEditDate() != null) {
            _hashCode += getLastEditDate().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getRelatedRecordId() != null) {
            _hashCode += getRelatedRecordId().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentBody");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
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
        elemField.setFieldName("feedItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedRevisions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedRevisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InsertedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InsertedById"));
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
        elemField.setFieldName("lastEditById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastEditById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastEditDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastEditDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelatedRecordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Revision"));
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
