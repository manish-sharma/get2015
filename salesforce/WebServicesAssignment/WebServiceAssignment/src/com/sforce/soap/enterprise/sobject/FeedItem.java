/**
 * FeedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class FeedItem  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.FeedComment bestComment;

    private java.lang.String bestCommentId;

    private java.lang.String body;

    private java.lang.Integer commentCount;

    private byte[] contentData;

    private java.lang.String contentDescription;

    private java.lang.String contentFileName;

    private java.lang.Integer contentSize;

    private java.lang.String contentType;

    private com.sforce.soap.enterprise.sobject.SObject createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedComments;

    private com.sforce.soap.enterprise.QueryResult feedLikes;

    private com.sforce.soap.enterprise.QueryResult feedRevisions;

    private com.sforce.soap.enterprise.QueryResult feedTrackedChanges;

    private java.lang.Boolean hasContent;

    private java.lang.Boolean hasLink;

    private com.sforce.soap.enterprise.sobject.SObject insertedBy;

    private java.lang.String insertedById;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isRichText;

    private java.lang.String lastEditById;

    private java.util.Calendar lastEditDate;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer likeCount;

    private java.lang.String linkUrl;

    private com.sforce.soap.enterprise.sobject.SObject parent;

    private java.lang.String parentId;

    private java.lang.String relatedRecordId;

    private java.lang.Integer revision;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private java.lang.String type;

    public FeedItem() {
    }

    public FeedItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.FeedComment bestComment,
           java.lang.String bestCommentId,
           java.lang.String body,
           java.lang.Integer commentCount,
           byte[] contentData,
           java.lang.String contentDescription,
           java.lang.String contentFileName,
           java.lang.Integer contentSize,
           java.lang.String contentType,
           com.sforce.soap.enterprise.sobject.SObject createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedComments,
           com.sforce.soap.enterprise.QueryResult feedLikes,
           com.sforce.soap.enterprise.QueryResult feedRevisions,
           com.sforce.soap.enterprise.QueryResult feedTrackedChanges,
           java.lang.Boolean hasContent,
           java.lang.Boolean hasLink,
           com.sforce.soap.enterprise.sobject.SObject insertedBy,
           java.lang.String insertedById,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isRichText,
           java.lang.String lastEditById,
           java.util.Calendar lastEditDate,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer likeCount,
           java.lang.String linkUrl,
           com.sforce.soap.enterprise.sobject.SObject parent,
           java.lang.String parentId,
           java.lang.String relatedRecordId,
           java.lang.Integer revision,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           java.lang.String type) {
        super(
            fieldsToNull,
            id);
        this.bestComment = bestComment;
        this.bestCommentId = bestCommentId;
        this.body = body;
        this.commentCount = commentCount;
        this.contentData = contentData;
        this.contentDescription = contentDescription;
        this.contentFileName = contentFileName;
        this.contentSize = contentSize;
        this.contentType = contentType;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedComments = feedComments;
        this.feedLikes = feedLikes;
        this.feedRevisions = feedRevisions;
        this.feedTrackedChanges = feedTrackedChanges;
        this.hasContent = hasContent;
        this.hasLink = hasLink;
        this.insertedBy = insertedBy;
        this.insertedById = insertedById;
        this.isDeleted = isDeleted;
        this.isRichText = isRichText;
        this.lastEditById = lastEditById;
        this.lastEditDate = lastEditDate;
        this.lastModifiedDate = lastModifiedDate;
        this.likeCount = likeCount;
        this.linkUrl = linkUrl;
        this.parent = parent;
        this.parentId = parentId;
        this.relatedRecordId = relatedRecordId;
        this.revision = revision;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.topicAssignments = topicAssignments;
        this.type = type;
    }


    /**
     * Gets the bestComment value for this FeedItem.
     * 
     * @return bestComment
     */
    public com.sforce.soap.enterprise.sobject.FeedComment getBestComment() {
        return bestComment;
    }


    /**
     * Sets the bestComment value for this FeedItem.
     * 
     * @param bestComment
     */
    public void setBestComment(com.sforce.soap.enterprise.sobject.FeedComment bestComment) {
        this.bestComment = bestComment;
    }


    /**
     * Gets the bestCommentId value for this FeedItem.
     * 
     * @return bestCommentId
     */
    public java.lang.String getBestCommentId() {
        return bestCommentId;
    }


    /**
     * Sets the bestCommentId value for this FeedItem.
     * 
     * @param bestCommentId
     */
    public void setBestCommentId(java.lang.String bestCommentId) {
        this.bestCommentId = bestCommentId;
    }


    /**
     * Gets the body value for this FeedItem.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this FeedItem.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the commentCount value for this FeedItem.
     * 
     * @return commentCount
     */
    public java.lang.Integer getCommentCount() {
        return commentCount;
    }


    /**
     * Sets the commentCount value for this FeedItem.
     * 
     * @param commentCount
     */
    public void setCommentCount(java.lang.Integer commentCount) {
        this.commentCount = commentCount;
    }


    /**
     * Gets the contentData value for this FeedItem.
     * 
     * @return contentData
     */
    public byte[] getContentData() {
        return contentData;
    }


    /**
     * Sets the contentData value for this FeedItem.
     * 
     * @param contentData
     */
    public void setContentData(byte[] contentData) {
        this.contentData = contentData;
    }


    /**
     * Gets the contentDescription value for this FeedItem.
     * 
     * @return contentDescription
     */
    public java.lang.String getContentDescription() {
        return contentDescription;
    }


    /**
     * Sets the contentDescription value for this FeedItem.
     * 
     * @param contentDescription
     */
    public void setContentDescription(java.lang.String contentDescription) {
        this.contentDescription = contentDescription;
    }


    /**
     * Gets the contentFileName value for this FeedItem.
     * 
     * @return contentFileName
     */
    public java.lang.String getContentFileName() {
        return contentFileName;
    }


    /**
     * Sets the contentFileName value for this FeedItem.
     * 
     * @param contentFileName
     */
    public void setContentFileName(java.lang.String contentFileName) {
        this.contentFileName = contentFileName;
    }


    /**
     * Gets the contentSize value for this FeedItem.
     * 
     * @return contentSize
     */
    public java.lang.Integer getContentSize() {
        return contentSize;
    }


    /**
     * Sets the contentSize value for this FeedItem.
     * 
     * @param contentSize
     */
    public void setContentSize(java.lang.Integer contentSize) {
        this.contentSize = contentSize;
    }


    /**
     * Gets the contentType value for this FeedItem.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this FeedItem.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the createdBy value for this FeedItem.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.SObject getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this FeedItem.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.SObject createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this FeedItem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this FeedItem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this FeedItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this FeedItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedComments value for this FeedItem.
     * 
     * @return feedComments
     */
    public com.sforce.soap.enterprise.QueryResult getFeedComments() {
        return feedComments;
    }


    /**
     * Sets the feedComments value for this FeedItem.
     * 
     * @param feedComments
     */
    public void setFeedComments(com.sforce.soap.enterprise.QueryResult feedComments) {
        this.feedComments = feedComments;
    }


    /**
     * Gets the feedLikes value for this FeedItem.
     * 
     * @return feedLikes
     */
    public com.sforce.soap.enterprise.QueryResult getFeedLikes() {
        return feedLikes;
    }


    /**
     * Sets the feedLikes value for this FeedItem.
     * 
     * @param feedLikes
     */
    public void setFeedLikes(com.sforce.soap.enterprise.QueryResult feedLikes) {
        this.feedLikes = feedLikes;
    }


    /**
     * Gets the feedRevisions value for this FeedItem.
     * 
     * @return feedRevisions
     */
    public com.sforce.soap.enterprise.QueryResult getFeedRevisions() {
        return feedRevisions;
    }


    /**
     * Sets the feedRevisions value for this FeedItem.
     * 
     * @param feedRevisions
     */
    public void setFeedRevisions(com.sforce.soap.enterprise.QueryResult feedRevisions) {
        this.feedRevisions = feedRevisions;
    }


    /**
     * Gets the feedTrackedChanges value for this FeedItem.
     * 
     * @return feedTrackedChanges
     */
    public com.sforce.soap.enterprise.QueryResult getFeedTrackedChanges() {
        return feedTrackedChanges;
    }


    /**
     * Sets the feedTrackedChanges value for this FeedItem.
     * 
     * @param feedTrackedChanges
     */
    public void setFeedTrackedChanges(com.sforce.soap.enterprise.QueryResult feedTrackedChanges) {
        this.feedTrackedChanges = feedTrackedChanges;
    }


    /**
     * Gets the hasContent value for this FeedItem.
     * 
     * @return hasContent
     */
    public java.lang.Boolean getHasContent() {
        return hasContent;
    }


    /**
     * Sets the hasContent value for this FeedItem.
     * 
     * @param hasContent
     */
    public void setHasContent(java.lang.Boolean hasContent) {
        this.hasContent = hasContent;
    }


    /**
     * Gets the hasLink value for this FeedItem.
     * 
     * @return hasLink
     */
    public java.lang.Boolean getHasLink() {
        return hasLink;
    }


    /**
     * Sets the hasLink value for this FeedItem.
     * 
     * @param hasLink
     */
    public void setHasLink(java.lang.Boolean hasLink) {
        this.hasLink = hasLink;
    }


    /**
     * Gets the insertedBy value for this FeedItem.
     * 
     * @return insertedBy
     */
    public com.sforce.soap.enterprise.sobject.SObject getInsertedBy() {
        return insertedBy;
    }


    /**
     * Sets the insertedBy value for this FeedItem.
     * 
     * @param insertedBy
     */
    public void setInsertedBy(com.sforce.soap.enterprise.sobject.SObject insertedBy) {
        this.insertedBy = insertedBy;
    }


    /**
     * Gets the insertedById value for this FeedItem.
     * 
     * @return insertedById
     */
    public java.lang.String getInsertedById() {
        return insertedById;
    }


    /**
     * Sets the insertedById value for this FeedItem.
     * 
     * @param insertedById
     */
    public void setInsertedById(java.lang.String insertedById) {
        this.insertedById = insertedById;
    }


    /**
     * Gets the isDeleted value for this FeedItem.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this FeedItem.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isRichText value for this FeedItem.
     * 
     * @return isRichText
     */
    public java.lang.Boolean getIsRichText() {
        return isRichText;
    }


    /**
     * Sets the isRichText value for this FeedItem.
     * 
     * @param isRichText
     */
    public void setIsRichText(java.lang.Boolean isRichText) {
        this.isRichText = isRichText;
    }


    /**
     * Gets the lastEditById value for this FeedItem.
     * 
     * @return lastEditById
     */
    public java.lang.String getLastEditById() {
        return lastEditById;
    }


    /**
     * Sets the lastEditById value for this FeedItem.
     * 
     * @param lastEditById
     */
    public void setLastEditById(java.lang.String lastEditById) {
        this.lastEditById = lastEditById;
    }


    /**
     * Gets the lastEditDate value for this FeedItem.
     * 
     * @return lastEditDate
     */
    public java.util.Calendar getLastEditDate() {
        return lastEditDate;
    }


    /**
     * Sets the lastEditDate value for this FeedItem.
     * 
     * @param lastEditDate
     */
    public void setLastEditDate(java.util.Calendar lastEditDate) {
        this.lastEditDate = lastEditDate;
    }


    /**
     * Gets the lastModifiedDate value for this FeedItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this FeedItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the likeCount value for this FeedItem.
     * 
     * @return likeCount
     */
    public java.lang.Integer getLikeCount() {
        return likeCount;
    }


    /**
     * Sets the likeCount value for this FeedItem.
     * 
     * @param likeCount
     */
    public void setLikeCount(java.lang.Integer likeCount) {
        this.likeCount = likeCount;
    }


    /**
     * Gets the linkUrl value for this FeedItem.
     * 
     * @return linkUrl
     */
    public java.lang.String getLinkUrl() {
        return linkUrl;
    }


    /**
     * Sets the linkUrl value for this FeedItem.
     * 
     * @param linkUrl
     */
    public void setLinkUrl(java.lang.String linkUrl) {
        this.linkUrl = linkUrl;
    }


    /**
     * Gets the parent value for this FeedItem.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.SObject getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this FeedItem.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.SObject parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this FeedItem.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this FeedItem.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the relatedRecordId value for this FeedItem.
     * 
     * @return relatedRecordId
     */
    public java.lang.String getRelatedRecordId() {
        return relatedRecordId;
    }


    /**
     * Sets the relatedRecordId value for this FeedItem.
     * 
     * @param relatedRecordId
     */
    public void setRelatedRecordId(java.lang.String relatedRecordId) {
        this.relatedRecordId = relatedRecordId;
    }


    /**
     * Gets the revision value for this FeedItem.
     * 
     * @return revision
     */
    public java.lang.Integer getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this FeedItem.
     * 
     * @param revision
     */
    public void setRevision(java.lang.Integer revision) {
        this.revision = revision;
    }


    /**
     * Gets the systemModstamp value for this FeedItem.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this FeedItem.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this FeedItem.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FeedItem.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the topicAssignments value for this FeedItem.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this FeedItem.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the type value for this FeedItem.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FeedItem.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItem)) return false;
        FeedItem other = (FeedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bestComment==null && other.getBestComment()==null) || 
             (this.bestComment!=null &&
              this.bestComment.equals(other.getBestComment()))) &&
            ((this.bestCommentId==null && other.getBestCommentId()==null) || 
             (this.bestCommentId!=null &&
              this.bestCommentId.equals(other.getBestCommentId()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.commentCount==null && other.getCommentCount()==null) || 
             (this.commentCount!=null &&
              this.commentCount.equals(other.getCommentCount()))) &&
            ((this.contentData==null && other.getContentData()==null) || 
             (this.contentData!=null &&
              java.util.Arrays.equals(this.contentData, other.getContentData()))) &&
            ((this.contentDescription==null && other.getContentDescription()==null) || 
             (this.contentDescription!=null &&
              this.contentDescription.equals(other.getContentDescription()))) &&
            ((this.contentFileName==null && other.getContentFileName()==null) || 
             (this.contentFileName!=null &&
              this.contentFileName.equals(other.getContentFileName()))) &&
            ((this.contentSize==null && other.getContentSize()==null) || 
             (this.contentSize!=null &&
              this.contentSize.equals(other.getContentSize()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedComments==null && other.getFeedComments()==null) || 
             (this.feedComments!=null &&
              this.feedComments.equals(other.getFeedComments()))) &&
            ((this.feedLikes==null && other.getFeedLikes()==null) || 
             (this.feedLikes!=null &&
              this.feedLikes.equals(other.getFeedLikes()))) &&
            ((this.feedRevisions==null && other.getFeedRevisions()==null) || 
             (this.feedRevisions!=null &&
              this.feedRevisions.equals(other.getFeedRevisions()))) &&
            ((this.feedTrackedChanges==null && other.getFeedTrackedChanges()==null) || 
             (this.feedTrackedChanges!=null &&
              this.feedTrackedChanges.equals(other.getFeedTrackedChanges()))) &&
            ((this.hasContent==null && other.getHasContent()==null) || 
             (this.hasContent!=null &&
              this.hasContent.equals(other.getHasContent()))) &&
            ((this.hasLink==null && other.getHasLink()==null) || 
             (this.hasLink!=null &&
              this.hasLink.equals(other.getHasLink()))) &&
            ((this.insertedBy==null && other.getInsertedBy()==null) || 
             (this.insertedBy!=null &&
              this.insertedBy.equals(other.getInsertedBy()))) &&
            ((this.insertedById==null && other.getInsertedById()==null) || 
             (this.insertedById!=null &&
              this.insertedById.equals(other.getInsertedById()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isRichText==null && other.getIsRichText()==null) || 
             (this.isRichText!=null &&
              this.isRichText.equals(other.getIsRichText()))) &&
            ((this.lastEditById==null && other.getLastEditById()==null) || 
             (this.lastEditById!=null &&
              this.lastEditById.equals(other.getLastEditById()))) &&
            ((this.lastEditDate==null && other.getLastEditDate()==null) || 
             (this.lastEditDate!=null &&
              this.lastEditDate.equals(other.getLastEditDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.likeCount==null && other.getLikeCount()==null) || 
             (this.likeCount!=null &&
              this.likeCount.equals(other.getLikeCount()))) &&
            ((this.linkUrl==null && other.getLinkUrl()==null) || 
             (this.linkUrl!=null &&
              this.linkUrl.equals(other.getLinkUrl()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.relatedRecordId==null && other.getRelatedRecordId()==null) || 
             (this.relatedRecordId!=null &&
              this.relatedRecordId.equals(other.getRelatedRecordId()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
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
        if (getBestComment() != null) {
            _hashCode += getBestComment().hashCode();
        }
        if (getBestCommentId() != null) {
            _hashCode += getBestCommentId().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getCommentCount() != null) {
            _hashCode += getCommentCount().hashCode();
        }
        if (getContentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentDescription() != null) {
            _hashCode += getContentDescription().hashCode();
        }
        if (getContentFileName() != null) {
            _hashCode += getContentFileName().hashCode();
        }
        if (getContentSize() != null) {
            _hashCode += getContentSize().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
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
        if (getFeedComments() != null) {
            _hashCode += getFeedComments().hashCode();
        }
        if (getFeedLikes() != null) {
            _hashCode += getFeedLikes().hashCode();
        }
        if (getFeedRevisions() != null) {
            _hashCode += getFeedRevisions().hashCode();
        }
        if (getFeedTrackedChanges() != null) {
            _hashCode += getFeedTrackedChanges().hashCode();
        }
        if (getHasContent() != null) {
            _hashCode += getHasContent().hashCode();
        }
        if (getHasLink() != null) {
            _hashCode += getHasLink().hashCode();
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
        if (getIsRichText() != null) {
            _hashCode += getIsRichText().hashCode();
        }
        if (getLastEditById() != null) {
            _hashCode += getLastEditById().hashCode();
        }
        if (getLastEditDate() != null) {
            _hashCode += getLastEditDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLikeCount() != null) {
            _hashCode += getLikeCount().hashCode();
        }
        if (getLinkUrl() != null) {
            _hashCode += getLinkUrl().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestComment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BestComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestCommentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BestCommentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentType"));
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
        elemField.setFieldName("feedComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedLikes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedLikes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("feedTrackedChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedTrackedChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasLink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HasLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InsertedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
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
        elemField.setFieldName("isRichText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRichText"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("likeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LikeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
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
        elemField.setFieldName("topicAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TopicAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
