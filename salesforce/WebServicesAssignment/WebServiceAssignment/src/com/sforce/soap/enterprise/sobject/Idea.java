/**
 * Idea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Idea  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String body;

    private java.lang.String categories;

    private com.sforce.soap.enterprise.QueryResult comments;

    private com.sforce.soap.enterprise.sobject.Community community;

    private java.lang.String communityId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String creatorFullPhotoUrl;

    private java.lang.String creatorName;

    private java.lang.String creatorSmallPhotoUrl;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isHtml;

    private java.lang.Boolean isMerged;

    private com.sforce.soap.enterprise.sobject.IdeaComment lastComment;

    private java.util.Calendar lastCommentDate;

    private java.lang.String lastCommentId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private java.lang.Integer numComments;

    private com.sforce.soap.enterprise.sobject.Idea parentIdea;

    private java.lang.String parentIdeaId;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.Double voteScore;

    private java.lang.Double voteTotal;

    private com.sforce.soap.enterprise.QueryResult votes;

    public Idea() {
    }

    public Idea(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String body,
           java.lang.String categories,
           com.sforce.soap.enterprise.QueryResult comments,
           com.sforce.soap.enterprise.sobject.Community community,
           java.lang.String communityId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String creatorFullPhotoUrl,
           java.lang.String creatorName,
           java.lang.String creatorSmallPhotoUrl,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isHtml,
           java.lang.Boolean isMerged,
           com.sforce.soap.enterprise.sobject.IdeaComment lastComment,
           java.util.Calendar lastCommentDate,
           java.lang.String lastCommentId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           java.lang.Integer numComments,
           com.sforce.soap.enterprise.sobject.Idea parentIdea,
           java.lang.String parentIdeaId,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.Double voteScore,
           java.lang.Double voteTotal,
           com.sforce.soap.enterprise.QueryResult votes) {
        super(
            fieldsToNull,
            id);
        this.body = body;
        this.categories = categories;
        this.comments = comments;
        this.community = community;
        this.communityId = communityId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.creatorFullPhotoUrl = creatorFullPhotoUrl;
        this.creatorName = creatorName;
        this.creatorSmallPhotoUrl = creatorSmallPhotoUrl;
        this.isDeleted = isDeleted;
        this.isHtml = isHtml;
        this.isMerged = isMerged;
        this.lastComment = lastComment;
        this.lastCommentDate = lastCommentDate;
        this.lastCommentId = lastCommentId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.numComments = numComments;
        this.parentIdea = parentIdea;
        this.parentIdeaId = parentIdeaId;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.userRecordAccess = userRecordAccess;
        this.voteScore = voteScore;
        this.voteTotal = voteTotal;
        this.votes = votes;
    }


    /**
     * Gets the body value for this Idea.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Idea.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the categories value for this Idea.
     * 
     * @return categories
     */
    public java.lang.String getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this Idea.
     * 
     * @param categories
     */
    public void setCategories(java.lang.String categories) {
        this.categories = categories;
    }


    /**
     * Gets the comments value for this Idea.
     * 
     * @return comments
     */
    public com.sforce.soap.enterprise.QueryResult getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Idea.
     * 
     * @param comments
     */
    public void setComments(com.sforce.soap.enterprise.QueryResult comments) {
        this.comments = comments;
    }


    /**
     * Gets the community value for this Idea.
     * 
     * @return community
     */
    public com.sforce.soap.enterprise.sobject.Community getCommunity() {
        return community;
    }


    /**
     * Sets the community value for this Idea.
     * 
     * @param community
     */
    public void setCommunity(com.sforce.soap.enterprise.sobject.Community community) {
        this.community = community;
    }


    /**
     * Gets the communityId value for this Idea.
     * 
     * @return communityId
     */
    public java.lang.String getCommunityId() {
        return communityId;
    }


    /**
     * Sets the communityId value for this Idea.
     * 
     * @param communityId
     */
    public void setCommunityId(java.lang.String communityId) {
        this.communityId = communityId;
    }


    /**
     * Gets the createdBy value for this Idea.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Idea.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Idea.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Idea.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Idea.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Idea.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the creatorFullPhotoUrl value for this Idea.
     * 
     * @return creatorFullPhotoUrl
     */
    public java.lang.String getCreatorFullPhotoUrl() {
        return creatorFullPhotoUrl;
    }


    /**
     * Sets the creatorFullPhotoUrl value for this Idea.
     * 
     * @param creatorFullPhotoUrl
     */
    public void setCreatorFullPhotoUrl(java.lang.String creatorFullPhotoUrl) {
        this.creatorFullPhotoUrl = creatorFullPhotoUrl;
    }


    /**
     * Gets the creatorName value for this Idea.
     * 
     * @return creatorName
     */
    public java.lang.String getCreatorName() {
        return creatorName;
    }


    /**
     * Sets the creatorName value for this Idea.
     * 
     * @param creatorName
     */
    public void setCreatorName(java.lang.String creatorName) {
        this.creatorName = creatorName;
    }


    /**
     * Gets the creatorSmallPhotoUrl value for this Idea.
     * 
     * @return creatorSmallPhotoUrl
     */
    public java.lang.String getCreatorSmallPhotoUrl() {
        return creatorSmallPhotoUrl;
    }


    /**
     * Sets the creatorSmallPhotoUrl value for this Idea.
     * 
     * @param creatorSmallPhotoUrl
     */
    public void setCreatorSmallPhotoUrl(java.lang.String creatorSmallPhotoUrl) {
        this.creatorSmallPhotoUrl = creatorSmallPhotoUrl;
    }


    /**
     * Gets the isDeleted value for this Idea.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Idea.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isHtml value for this Idea.
     * 
     * @return isHtml
     */
    public java.lang.Boolean getIsHtml() {
        return isHtml;
    }


    /**
     * Sets the isHtml value for this Idea.
     * 
     * @param isHtml
     */
    public void setIsHtml(java.lang.Boolean isHtml) {
        this.isHtml = isHtml;
    }


    /**
     * Gets the isMerged value for this Idea.
     * 
     * @return isMerged
     */
    public java.lang.Boolean getIsMerged() {
        return isMerged;
    }


    /**
     * Sets the isMerged value for this Idea.
     * 
     * @param isMerged
     */
    public void setIsMerged(java.lang.Boolean isMerged) {
        this.isMerged = isMerged;
    }


    /**
     * Gets the lastComment value for this Idea.
     * 
     * @return lastComment
     */
    public com.sforce.soap.enterprise.sobject.IdeaComment getLastComment() {
        return lastComment;
    }


    /**
     * Sets the lastComment value for this Idea.
     * 
     * @param lastComment
     */
    public void setLastComment(com.sforce.soap.enterprise.sobject.IdeaComment lastComment) {
        this.lastComment = lastComment;
    }


    /**
     * Gets the lastCommentDate value for this Idea.
     * 
     * @return lastCommentDate
     */
    public java.util.Calendar getLastCommentDate() {
        return lastCommentDate;
    }


    /**
     * Sets the lastCommentDate value for this Idea.
     * 
     * @param lastCommentDate
     */
    public void setLastCommentDate(java.util.Calendar lastCommentDate) {
        this.lastCommentDate = lastCommentDate;
    }


    /**
     * Gets the lastCommentId value for this Idea.
     * 
     * @return lastCommentId
     */
    public java.lang.String getLastCommentId() {
        return lastCommentId;
    }


    /**
     * Sets the lastCommentId value for this Idea.
     * 
     * @param lastCommentId
     */
    public void setLastCommentId(java.lang.String lastCommentId) {
        this.lastCommentId = lastCommentId;
    }


    /**
     * Gets the lastModifiedBy value for this Idea.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Idea.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Idea.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Idea.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Idea.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Idea.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this Idea.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this Idea.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this Idea.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this Idea.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the numComments value for this Idea.
     * 
     * @return numComments
     */
    public java.lang.Integer getNumComments() {
        return numComments;
    }


    /**
     * Sets the numComments value for this Idea.
     * 
     * @param numComments
     */
    public void setNumComments(java.lang.Integer numComments) {
        this.numComments = numComments;
    }


    /**
     * Gets the parentIdea value for this Idea.
     * 
     * @return parentIdea
     */
    public com.sforce.soap.enterprise.sobject.Idea getParentIdea() {
        return parentIdea;
    }


    /**
     * Sets the parentIdea value for this Idea.
     * 
     * @param parentIdea
     */
    public void setParentIdea(com.sforce.soap.enterprise.sobject.Idea parentIdea) {
        this.parentIdea = parentIdea;
    }


    /**
     * Gets the parentIdeaId value for this Idea.
     * 
     * @return parentIdeaId
     */
    public java.lang.String getParentIdeaId() {
        return parentIdeaId;
    }


    /**
     * Sets the parentIdeaId value for this Idea.
     * 
     * @param parentIdeaId
     */
    public void setParentIdeaId(java.lang.String parentIdeaId) {
        this.parentIdeaId = parentIdeaId;
    }


    /**
     * Gets the recordType value for this Idea.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Idea.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Idea.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Idea.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the status value for this Idea.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Idea.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this Idea.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Idea.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this Idea.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Idea.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userRecordAccess value for this Idea.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Idea.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the voteScore value for this Idea.
     * 
     * @return voteScore
     */
    public java.lang.Double getVoteScore() {
        return voteScore;
    }


    /**
     * Sets the voteScore value for this Idea.
     * 
     * @param voteScore
     */
    public void setVoteScore(java.lang.Double voteScore) {
        this.voteScore = voteScore;
    }


    /**
     * Gets the voteTotal value for this Idea.
     * 
     * @return voteTotal
     */
    public java.lang.Double getVoteTotal() {
        return voteTotal;
    }


    /**
     * Sets the voteTotal value for this Idea.
     * 
     * @param voteTotal
     */
    public void setVoteTotal(java.lang.Double voteTotal) {
        this.voteTotal = voteTotal;
    }


    /**
     * Gets the votes value for this Idea.
     * 
     * @return votes
     */
    public com.sforce.soap.enterprise.QueryResult getVotes() {
        return votes;
    }


    /**
     * Sets the votes value for this Idea.
     * 
     * @param votes
     */
    public void setVotes(com.sforce.soap.enterprise.QueryResult votes) {
        this.votes = votes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Idea)) return false;
        Idea other = (Idea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              this.categories.equals(other.getCategories()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.community==null && other.getCommunity()==null) || 
             (this.community!=null &&
              this.community.equals(other.getCommunity()))) &&
            ((this.communityId==null && other.getCommunityId()==null) || 
             (this.communityId!=null &&
              this.communityId.equals(other.getCommunityId()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.creatorFullPhotoUrl==null && other.getCreatorFullPhotoUrl()==null) || 
             (this.creatorFullPhotoUrl!=null &&
              this.creatorFullPhotoUrl.equals(other.getCreatorFullPhotoUrl()))) &&
            ((this.creatorName==null && other.getCreatorName()==null) || 
             (this.creatorName!=null &&
              this.creatorName.equals(other.getCreatorName()))) &&
            ((this.creatorSmallPhotoUrl==null && other.getCreatorSmallPhotoUrl()==null) || 
             (this.creatorSmallPhotoUrl!=null &&
              this.creatorSmallPhotoUrl.equals(other.getCreatorSmallPhotoUrl()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isHtml==null && other.getIsHtml()==null) || 
             (this.isHtml!=null &&
              this.isHtml.equals(other.getIsHtml()))) &&
            ((this.isMerged==null && other.getIsMerged()==null) || 
             (this.isMerged!=null &&
              this.isMerged.equals(other.getIsMerged()))) &&
            ((this.lastComment==null && other.getLastComment()==null) || 
             (this.lastComment!=null &&
              this.lastComment.equals(other.getLastComment()))) &&
            ((this.lastCommentDate==null && other.getLastCommentDate()==null) || 
             (this.lastCommentDate!=null &&
              this.lastCommentDate.equals(other.getLastCommentDate()))) &&
            ((this.lastCommentId==null && other.getLastCommentId()==null) || 
             (this.lastCommentId!=null &&
              this.lastCommentId.equals(other.getLastCommentId()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastReferencedDate==null && other.getLastReferencedDate()==null) || 
             (this.lastReferencedDate!=null &&
              this.lastReferencedDate.equals(other.getLastReferencedDate()))) &&
            ((this.lastViewedDate==null && other.getLastViewedDate()==null) || 
             (this.lastViewedDate!=null &&
              this.lastViewedDate.equals(other.getLastViewedDate()))) &&
            ((this.numComments==null && other.getNumComments()==null) || 
             (this.numComments!=null &&
              this.numComments.equals(other.getNumComments()))) &&
            ((this.parentIdea==null && other.getParentIdea()==null) || 
             (this.parentIdea!=null &&
              this.parentIdea.equals(other.getParentIdea()))) &&
            ((this.parentIdeaId==null && other.getParentIdeaId()==null) || 
             (this.parentIdeaId!=null &&
              this.parentIdeaId.equals(other.getParentIdeaId()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.voteScore==null && other.getVoteScore()==null) || 
             (this.voteScore!=null &&
              this.voteScore.equals(other.getVoteScore()))) &&
            ((this.voteTotal==null && other.getVoteTotal()==null) || 
             (this.voteTotal!=null &&
              this.voteTotal.equals(other.getVoteTotal()))) &&
            ((this.votes==null && other.getVotes()==null) || 
             (this.votes!=null &&
              this.votes.equals(other.getVotes())));
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
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getCategories() != null) {
            _hashCode += getCategories().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCommunity() != null) {
            _hashCode += getCommunity().hashCode();
        }
        if (getCommunityId() != null) {
            _hashCode += getCommunityId().hashCode();
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
        if (getCreatorFullPhotoUrl() != null) {
            _hashCode += getCreatorFullPhotoUrl().hashCode();
        }
        if (getCreatorName() != null) {
            _hashCode += getCreatorName().hashCode();
        }
        if (getCreatorSmallPhotoUrl() != null) {
            _hashCode += getCreatorSmallPhotoUrl().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsHtml() != null) {
            _hashCode += getIsHtml().hashCode();
        }
        if (getIsMerged() != null) {
            _hashCode += getIsMerged().hashCode();
        }
        if (getLastComment() != null) {
            _hashCode += getLastComment().hashCode();
        }
        if (getLastCommentDate() != null) {
            _hashCode += getLastCommentDate().hashCode();
        }
        if (getLastCommentId() != null) {
            _hashCode += getLastCommentId().hashCode();
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
        if (getLastReferencedDate() != null) {
            _hashCode += getLastReferencedDate().hashCode();
        }
        if (getLastViewedDate() != null) {
            _hashCode += getLastViewedDate().hashCode();
        }
        if (getNumComments() != null) {
            _hashCode += getNumComments().hashCode();
        }
        if (getParentIdea() != null) {
            _hashCode += getParentIdea().hashCode();
        }
        if (getParentIdeaId() != null) {
            _hashCode += getParentIdeaId().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getVoteScore() != null) {
            _hashCode += getVoteScore().hashCode();
        }
        if (getVoteTotal() != null) {
            _hashCode += getVoteTotal().hashCode();
        }
        if (getVotes() != null) {
            _hashCode += getVotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Idea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("community");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommunityId"));
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
        elemField.setFieldName("creatorFullPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatorFullPhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorSmallPhotoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatorSmallPhotoUrl"));
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
        elemField.setFieldName("isHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMerged");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsMerged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeaComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCommentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCommentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCommentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCommentId"));
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
        elemField.setFieldName("lastReferencedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastReferencedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastViewedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentIdea"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentIdeaId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentIdeaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("voteScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VoteScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VoteTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("votes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Votes"));
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
