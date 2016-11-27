/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Task  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private java.util.Date activityDate;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String callDisposition;

    private java.lang.Integer callDurationInSeconds;

    private java.lang.String callObject;

    private java.lang.String callType;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.Boolean isArchived;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isHighPriority;

    private java.lang.Boolean isRecurrence;

    private java.lang.Boolean isReminderSet;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.sobject.SObject owner;

    private java.lang.String ownerId;

    private java.lang.String priority;

    private java.lang.String recurrenceActivityId;

    private java.lang.Integer recurrenceDayOfMonth;

    private java.lang.Integer recurrenceDayOfWeekMask;

    private java.util.Date recurrenceEndDateOnly;

    private java.lang.String recurrenceInstance;

    private java.lang.Integer recurrenceInterval;

    private java.lang.String recurrenceMonthOfYear;

    private java.lang.String recurrenceRegeneratedType;

    private java.util.Date recurrenceStartDateOnly;

    private java.lang.String recurrenceTimeZoneSidKey;

    private java.lang.String recurrenceType;

    private com.sforce.soap.enterprise.QueryResult recurringTasks;

    private java.util.Calendar reminderDateTime;

    private java.lang.String status;

    private java.lang.String subject;

    private java.util.Calendar systemModstamp;

    private java.lang.String taskSubtype;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.SObject what;

    private java.lang.String whatId;

    private com.sforce.soap.enterprise.sobject.SObject who;

    private java.lang.String whoId;

    public Task() {
    }

    public Task(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           java.util.Date activityDate,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String callDisposition,
           java.lang.Integer callDurationInSeconds,
           java.lang.String callObject,
           java.lang.String callType,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.Boolean isArchived,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isHighPriority,
           java.lang.Boolean isRecurrence,
           java.lang.Boolean isReminderSet,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.sobject.SObject owner,
           java.lang.String ownerId,
           java.lang.String priority,
           java.lang.String recurrenceActivityId,
           java.lang.Integer recurrenceDayOfMonth,
           java.lang.Integer recurrenceDayOfWeekMask,
           java.util.Date recurrenceEndDateOnly,
           java.lang.String recurrenceInstance,
           java.lang.Integer recurrenceInterval,
           java.lang.String recurrenceMonthOfYear,
           java.lang.String recurrenceRegeneratedType,
           java.util.Date recurrenceStartDateOnly,
           java.lang.String recurrenceTimeZoneSidKey,
           java.lang.String recurrenceType,
           com.sforce.soap.enterprise.QueryResult recurringTasks,
           java.util.Calendar reminderDateTime,
           java.lang.String status,
           java.lang.String subject,
           java.util.Calendar systemModstamp,
           java.lang.String taskSubtype,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.SObject what,
           java.lang.String whatId,
           com.sforce.soap.enterprise.sobject.SObject who,
           java.lang.String whoId) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.activityDate = activityDate;
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.callDisposition = callDisposition;
        this.callDurationInSeconds = callDurationInSeconds;
        this.callObject = callObject;
        this.callType = callType;
        this.combinedAttachments = combinedAttachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.isArchived = isArchived;
        this.isClosed = isClosed;
        this.isDeleted = isDeleted;
        this.isHighPriority = isHighPriority;
        this.isRecurrence = isRecurrence;
        this.isReminderSet = isReminderSet;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.owner = owner;
        this.ownerId = ownerId;
        this.priority = priority;
        this.recurrenceActivityId = recurrenceActivityId;
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
        this.recurrenceInstance = recurrenceInstance;
        this.recurrenceInterval = recurrenceInterval;
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
        this.recurrenceRegeneratedType = recurrenceRegeneratedType;
        this.recurrenceStartDateOnly = recurrenceStartDateOnly;
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
        this.recurrenceType = recurrenceType;
        this.recurringTasks = recurringTasks;
        this.reminderDateTime = reminderDateTime;
        this.status = status;
        this.subject = subject;
        this.systemModstamp = systemModstamp;
        this.taskSubtype = taskSubtype;
        this.topicAssignments = topicAssignments;
        this.what = what;
        this.whatId = whatId;
        this.who = who;
        this.whoId = whoId;
    }


    /**
     * Gets the account value for this Task.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Task.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this Task.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Task.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the activityDate value for this Task.
     * 
     * @return activityDate
     */
    public java.util.Date getActivityDate() {
        return activityDate;
    }


    /**
     * Sets the activityDate value for this Task.
     * 
     * @param activityDate
     */
    public void setActivityDate(java.util.Date activityDate) {
        this.activityDate = activityDate;
    }


    /**
     * Gets the attachedContentDocuments value for this Task.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Task.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Task.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Task.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the callDisposition value for this Task.
     * 
     * @return callDisposition
     */
    public java.lang.String getCallDisposition() {
        return callDisposition;
    }


    /**
     * Sets the callDisposition value for this Task.
     * 
     * @param callDisposition
     */
    public void setCallDisposition(java.lang.String callDisposition) {
        this.callDisposition = callDisposition;
    }


    /**
     * Gets the callDurationInSeconds value for this Task.
     * 
     * @return callDurationInSeconds
     */
    public java.lang.Integer getCallDurationInSeconds() {
        return callDurationInSeconds;
    }


    /**
     * Sets the callDurationInSeconds value for this Task.
     * 
     * @param callDurationInSeconds
     */
    public void setCallDurationInSeconds(java.lang.Integer callDurationInSeconds) {
        this.callDurationInSeconds = callDurationInSeconds;
    }


    /**
     * Gets the callObject value for this Task.
     * 
     * @return callObject
     */
    public java.lang.String getCallObject() {
        return callObject;
    }


    /**
     * Sets the callObject value for this Task.
     * 
     * @param callObject
     */
    public void setCallObject(java.lang.String callObject) {
        this.callObject = callObject;
    }


    /**
     * Gets the callType value for this Task.
     * 
     * @return callType
     */
    public java.lang.String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this Task.
     * 
     * @param callType
     */
    public void setCallType(java.lang.String callType) {
        this.callType = callType;
    }


    /**
     * Gets the combinedAttachments value for this Task.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Task.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Task.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Task.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Task.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Task.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Task.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Task.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this Task.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Task.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Task.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Task.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Task.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Task.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the isArchived value for this Task.
     * 
     * @return isArchived
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Task.
     * 
     * @param isArchived
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the isClosed value for this Task.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this Task.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDeleted value for this Task.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Task.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isHighPriority value for this Task.
     * 
     * @return isHighPriority
     */
    public java.lang.Boolean getIsHighPriority() {
        return isHighPriority;
    }


    /**
     * Sets the isHighPriority value for this Task.
     * 
     * @param isHighPriority
     */
    public void setIsHighPriority(java.lang.Boolean isHighPriority) {
        this.isHighPriority = isHighPriority;
    }


    /**
     * Gets the isRecurrence value for this Task.
     * 
     * @return isRecurrence
     */
    public java.lang.Boolean getIsRecurrence() {
        return isRecurrence;
    }


    /**
     * Sets the isRecurrence value for this Task.
     * 
     * @param isRecurrence
     */
    public void setIsRecurrence(java.lang.Boolean isRecurrence) {
        this.isRecurrence = isRecurrence;
    }


    /**
     * Gets the isReminderSet value for this Task.
     * 
     * @return isReminderSet
     */
    public java.lang.Boolean getIsReminderSet() {
        return isReminderSet;
    }


    /**
     * Sets the isReminderSet value for this Task.
     * 
     * @param isReminderSet
     */
    public void setIsReminderSet(java.lang.Boolean isReminderSet) {
        this.isReminderSet = isReminderSet;
    }


    /**
     * Gets the lastModifiedBy value for this Task.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Task.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Task.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Task.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Task.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Task.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the owner value for this Task.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.SObject getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Task.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.SObject owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Task.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Task.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the priority value for this Task.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Task.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the recurrenceActivityId value for this Task.
     * 
     * @return recurrenceActivityId
     */
    public java.lang.String getRecurrenceActivityId() {
        return recurrenceActivityId;
    }


    /**
     * Sets the recurrenceActivityId value for this Task.
     * 
     * @param recurrenceActivityId
     */
    public void setRecurrenceActivityId(java.lang.String recurrenceActivityId) {
        this.recurrenceActivityId = recurrenceActivityId;
    }


    /**
     * Gets the recurrenceDayOfMonth value for this Task.
     * 
     * @return recurrenceDayOfMonth
     */
    public java.lang.Integer getRecurrenceDayOfMonth() {
        return recurrenceDayOfMonth;
    }


    /**
     * Sets the recurrenceDayOfMonth value for this Task.
     * 
     * @param recurrenceDayOfMonth
     */
    public void setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
        this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    }


    /**
     * Gets the recurrenceDayOfWeekMask value for this Task.
     * 
     * @return recurrenceDayOfWeekMask
     */
    public java.lang.Integer getRecurrenceDayOfWeekMask() {
        return recurrenceDayOfWeekMask;
    }


    /**
     * Sets the recurrenceDayOfWeekMask value for this Task.
     * 
     * @param recurrenceDayOfWeekMask
     */
    public void setRecurrenceDayOfWeekMask(java.lang.Integer recurrenceDayOfWeekMask) {
        this.recurrenceDayOfWeekMask = recurrenceDayOfWeekMask;
    }


    /**
     * Gets the recurrenceEndDateOnly value for this Task.
     * 
     * @return recurrenceEndDateOnly
     */
    public java.util.Date getRecurrenceEndDateOnly() {
        return recurrenceEndDateOnly;
    }


    /**
     * Sets the recurrenceEndDateOnly value for this Task.
     * 
     * @param recurrenceEndDateOnly
     */
    public void setRecurrenceEndDateOnly(java.util.Date recurrenceEndDateOnly) {
        this.recurrenceEndDateOnly = recurrenceEndDateOnly;
    }


    /**
     * Gets the recurrenceInstance value for this Task.
     * 
     * @return recurrenceInstance
     */
    public java.lang.String getRecurrenceInstance() {
        return recurrenceInstance;
    }


    /**
     * Sets the recurrenceInstance value for this Task.
     * 
     * @param recurrenceInstance
     */
    public void setRecurrenceInstance(java.lang.String recurrenceInstance) {
        this.recurrenceInstance = recurrenceInstance;
    }


    /**
     * Gets the recurrenceInterval value for this Task.
     * 
     * @return recurrenceInterval
     */
    public java.lang.Integer getRecurrenceInterval() {
        return recurrenceInterval;
    }


    /**
     * Sets the recurrenceInterval value for this Task.
     * 
     * @param recurrenceInterval
     */
    public void setRecurrenceInterval(java.lang.Integer recurrenceInterval) {
        this.recurrenceInterval = recurrenceInterval;
    }


    /**
     * Gets the recurrenceMonthOfYear value for this Task.
     * 
     * @return recurrenceMonthOfYear
     */
    public java.lang.String getRecurrenceMonthOfYear() {
        return recurrenceMonthOfYear;
    }


    /**
     * Sets the recurrenceMonthOfYear value for this Task.
     * 
     * @param recurrenceMonthOfYear
     */
    public void setRecurrenceMonthOfYear(java.lang.String recurrenceMonthOfYear) {
        this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    }


    /**
     * Gets the recurrenceRegeneratedType value for this Task.
     * 
     * @return recurrenceRegeneratedType
     */
    public java.lang.String getRecurrenceRegeneratedType() {
        return recurrenceRegeneratedType;
    }


    /**
     * Sets the recurrenceRegeneratedType value for this Task.
     * 
     * @param recurrenceRegeneratedType
     */
    public void setRecurrenceRegeneratedType(java.lang.String recurrenceRegeneratedType) {
        this.recurrenceRegeneratedType = recurrenceRegeneratedType;
    }


    /**
     * Gets the recurrenceStartDateOnly value for this Task.
     * 
     * @return recurrenceStartDateOnly
     */
    public java.util.Date getRecurrenceStartDateOnly() {
        return recurrenceStartDateOnly;
    }


    /**
     * Sets the recurrenceStartDateOnly value for this Task.
     * 
     * @param recurrenceStartDateOnly
     */
    public void setRecurrenceStartDateOnly(java.util.Date recurrenceStartDateOnly) {
        this.recurrenceStartDateOnly = recurrenceStartDateOnly;
    }


    /**
     * Gets the recurrenceTimeZoneSidKey value for this Task.
     * 
     * @return recurrenceTimeZoneSidKey
     */
    public java.lang.String getRecurrenceTimeZoneSidKey() {
        return recurrenceTimeZoneSidKey;
    }


    /**
     * Sets the recurrenceTimeZoneSidKey value for this Task.
     * 
     * @param recurrenceTimeZoneSidKey
     */
    public void setRecurrenceTimeZoneSidKey(java.lang.String recurrenceTimeZoneSidKey) {
        this.recurrenceTimeZoneSidKey = recurrenceTimeZoneSidKey;
    }


    /**
     * Gets the recurrenceType value for this Task.
     * 
     * @return recurrenceType
     */
    public java.lang.String getRecurrenceType() {
        return recurrenceType;
    }


    /**
     * Sets the recurrenceType value for this Task.
     * 
     * @param recurrenceType
     */
    public void setRecurrenceType(java.lang.String recurrenceType) {
        this.recurrenceType = recurrenceType;
    }


    /**
     * Gets the recurringTasks value for this Task.
     * 
     * @return recurringTasks
     */
    public com.sforce.soap.enterprise.QueryResult getRecurringTasks() {
        return recurringTasks;
    }


    /**
     * Sets the recurringTasks value for this Task.
     * 
     * @param recurringTasks
     */
    public void setRecurringTasks(com.sforce.soap.enterprise.QueryResult recurringTasks) {
        this.recurringTasks = recurringTasks;
    }


    /**
     * Gets the reminderDateTime value for this Task.
     * 
     * @return reminderDateTime
     */
    public java.util.Calendar getReminderDateTime() {
        return reminderDateTime;
    }


    /**
     * Sets the reminderDateTime value for this Task.
     * 
     * @param reminderDateTime
     */
    public void setReminderDateTime(java.util.Calendar reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }


    /**
     * Gets the status value for this Task.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Task.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the subject value for this Task.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Task.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the systemModstamp value for this Task.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Task.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the taskSubtype value for this Task.
     * 
     * @return taskSubtype
     */
    public java.lang.String getTaskSubtype() {
        return taskSubtype;
    }


    /**
     * Sets the taskSubtype value for this Task.
     * 
     * @param taskSubtype
     */
    public void setTaskSubtype(java.lang.String taskSubtype) {
        this.taskSubtype = taskSubtype;
    }


    /**
     * Gets the topicAssignments value for this Task.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Task.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the what value for this Task.
     * 
     * @return what
     */
    public com.sforce.soap.enterprise.sobject.SObject getWhat() {
        return what;
    }


    /**
     * Sets the what value for this Task.
     * 
     * @param what
     */
    public void setWhat(com.sforce.soap.enterprise.sobject.SObject what) {
        this.what = what;
    }


    /**
     * Gets the whatId value for this Task.
     * 
     * @return whatId
     */
    public java.lang.String getWhatId() {
        return whatId;
    }


    /**
     * Sets the whatId value for this Task.
     * 
     * @param whatId
     */
    public void setWhatId(java.lang.String whatId) {
        this.whatId = whatId;
    }


    /**
     * Gets the who value for this Task.
     * 
     * @return who
     */
    public com.sforce.soap.enterprise.sobject.SObject getWho() {
        return who;
    }


    /**
     * Sets the who value for this Task.
     * 
     * @param who
     */
    public void setWho(com.sforce.soap.enterprise.sobject.SObject who) {
        this.who = who;
    }


    /**
     * Gets the whoId value for this Task.
     * 
     * @return whoId
     */
    public java.lang.String getWhoId() {
        return whoId;
    }


    /**
     * Sets the whoId value for this Task.
     * 
     * @param whoId
     */
    public void setWhoId(java.lang.String whoId) {
        this.whoId = whoId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.activityDate==null && other.getActivityDate()==null) || 
             (this.activityDate!=null &&
              this.activityDate.equals(other.getActivityDate()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.callDisposition==null && other.getCallDisposition()==null) || 
             (this.callDisposition!=null &&
              this.callDisposition.equals(other.getCallDisposition()))) &&
            ((this.callDurationInSeconds==null && other.getCallDurationInSeconds()==null) || 
             (this.callDurationInSeconds!=null &&
              this.callDurationInSeconds.equals(other.getCallDurationInSeconds()))) &&
            ((this.callObject==null && other.getCallObject()==null) || 
             (this.callObject!=null &&
              this.callObject.equals(other.getCallObject()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isHighPriority==null && other.getIsHighPriority()==null) || 
             (this.isHighPriority!=null &&
              this.isHighPriority.equals(other.getIsHighPriority()))) &&
            ((this.isRecurrence==null && other.getIsRecurrence()==null) || 
             (this.isRecurrence!=null &&
              this.isRecurrence.equals(other.getIsRecurrence()))) &&
            ((this.isReminderSet==null && other.getIsReminderSet()==null) || 
             (this.isReminderSet!=null &&
              this.isReminderSet.equals(other.getIsReminderSet()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.recurrenceActivityId==null && other.getRecurrenceActivityId()==null) || 
             (this.recurrenceActivityId!=null &&
              this.recurrenceActivityId.equals(other.getRecurrenceActivityId()))) &&
            ((this.recurrenceDayOfMonth==null && other.getRecurrenceDayOfMonth()==null) || 
             (this.recurrenceDayOfMonth!=null &&
              this.recurrenceDayOfMonth.equals(other.getRecurrenceDayOfMonth()))) &&
            ((this.recurrenceDayOfWeekMask==null && other.getRecurrenceDayOfWeekMask()==null) || 
             (this.recurrenceDayOfWeekMask!=null &&
              this.recurrenceDayOfWeekMask.equals(other.getRecurrenceDayOfWeekMask()))) &&
            ((this.recurrenceEndDateOnly==null && other.getRecurrenceEndDateOnly()==null) || 
             (this.recurrenceEndDateOnly!=null &&
              this.recurrenceEndDateOnly.equals(other.getRecurrenceEndDateOnly()))) &&
            ((this.recurrenceInstance==null && other.getRecurrenceInstance()==null) || 
             (this.recurrenceInstance!=null &&
              this.recurrenceInstance.equals(other.getRecurrenceInstance()))) &&
            ((this.recurrenceInterval==null && other.getRecurrenceInterval()==null) || 
             (this.recurrenceInterval!=null &&
              this.recurrenceInterval.equals(other.getRecurrenceInterval()))) &&
            ((this.recurrenceMonthOfYear==null && other.getRecurrenceMonthOfYear()==null) || 
             (this.recurrenceMonthOfYear!=null &&
              this.recurrenceMonthOfYear.equals(other.getRecurrenceMonthOfYear()))) &&
            ((this.recurrenceRegeneratedType==null && other.getRecurrenceRegeneratedType()==null) || 
             (this.recurrenceRegeneratedType!=null &&
              this.recurrenceRegeneratedType.equals(other.getRecurrenceRegeneratedType()))) &&
            ((this.recurrenceStartDateOnly==null && other.getRecurrenceStartDateOnly()==null) || 
             (this.recurrenceStartDateOnly!=null &&
              this.recurrenceStartDateOnly.equals(other.getRecurrenceStartDateOnly()))) &&
            ((this.recurrenceTimeZoneSidKey==null && other.getRecurrenceTimeZoneSidKey()==null) || 
             (this.recurrenceTimeZoneSidKey!=null &&
              this.recurrenceTimeZoneSidKey.equals(other.getRecurrenceTimeZoneSidKey()))) &&
            ((this.recurrenceType==null && other.getRecurrenceType()==null) || 
             (this.recurrenceType!=null &&
              this.recurrenceType.equals(other.getRecurrenceType()))) &&
            ((this.recurringTasks==null && other.getRecurringTasks()==null) || 
             (this.recurringTasks!=null &&
              this.recurringTasks.equals(other.getRecurringTasks()))) &&
            ((this.reminderDateTime==null && other.getReminderDateTime()==null) || 
             (this.reminderDateTime!=null &&
              this.reminderDateTime.equals(other.getReminderDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.taskSubtype==null && other.getTaskSubtype()==null) || 
             (this.taskSubtype!=null &&
              this.taskSubtype.equals(other.getTaskSubtype()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.what==null && other.getWhat()==null) || 
             (this.what!=null &&
              this.what.equals(other.getWhat()))) &&
            ((this.whatId==null && other.getWhatId()==null) || 
             (this.whatId!=null &&
              this.whatId.equals(other.getWhatId()))) &&
            ((this.who==null && other.getWho()==null) || 
             (this.who!=null &&
              this.who.equals(other.getWho()))) &&
            ((this.whoId==null && other.getWhoId()==null) || 
             (this.whoId!=null &&
              this.whoId.equals(other.getWhoId())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActivityDate() != null) {
            _hashCode += getActivityDate().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCallDisposition() != null) {
            _hashCode += getCallDisposition().hashCode();
        }
        if (getCallDurationInSeconds() != null) {
            _hashCode += getCallDurationInSeconds().hashCode();
        }
        if (getCallObject() != null) {
            _hashCode += getCallObject().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsHighPriority() != null) {
            _hashCode += getIsHighPriority().hashCode();
        }
        if (getIsRecurrence() != null) {
            _hashCode += getIsRecurrence().hashCode();
        }
        if (getIsReminderSet() != null) {
            _hashCode += getIsReminderSet().hashCode();
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRecurrenceActivityId() != null) {
            _hashCode += getRecurrenceActivityId().hashCode();
        }
        if (getRecurrenceDayOfMonth() != null) {
            _hashCode += getRecurrenceDayOfMonth().hashCode();
        }
        if (getRecurrenceDayOfWeekMask() != null) {
            _hashCode += getRecurrenceDayOfWeekMask().hashCode();
        }
        if (getRecurrenceEndDateOnly() != null) {
            _hashCode += getRecurrenceEndDateOnly().hashCode();
        }
        if (getRecurrenceInstance() != null) {
            _hashCode += getRecurrenceInstance().hashCode();
        }
        if (getRecurrenceInterval() != null) {
            _hashCode += getRecurrenceInterval().hashCode();
        }
        if (getRecurrenceMonthOfYear() != null) {
            _hashCode += getRecurrenceMonthOfYear().hashCode();
        }
        if (getRecurrenceRegeneratedType() != null) {
            _hashCode += getRecurrenceRegeneratedType().hashCode();
        }
        if (getRecurrenceStartDateOnly() != null) {
            _hashCode += getRecurrenceStartDateOnly().hashCode();
        }
        if (getRecurrenceTimeZoneSidKey() != null) {
            _hashCode += getRecurrenceTimeZoneSidKey().hashCode();
        }
        if (getRecurrenceType() != null) {
            _hashCode += getRecurrenceType().hashCode();
        }
        if (getRecurringTasks() != null) {
            _hashCode += getRecurringTasks().hashCode();
        }
        if (getReminderDateTime() != null) {
            _hashCode += getReminderDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTaskSubtype() != null) {
            _hashCode += getTaskSubtype().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getWhat() != null) {
            _hashCode += getWhat().hashCode();
        }
        if (getWhatId() != null) {
            _hashCode += getWhatId().hashCode();
        }
        if (getWho() != null) {
            _hashCode += getWho().hashCode();
        }
        if (getWhoId() != null) {
            _hashCode += getWhoId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedContentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachedContentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDisposition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallDisposition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDurationInSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallDurationInSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CombinedAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
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
        elemField.setFieldName("isHighPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHighPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRecurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRecurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReminderSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReminderSet"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceActivityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceActivityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceDayOfWeekMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceDayOfWeekMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceEndDateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceEndDateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceMonthOfYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceMonthOfYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceRegeneratedType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceRegeneratedType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceStartDateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceStartDateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceTimeZoneSidKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceTimeZoneSidKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurrenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecurringTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReminderDateTime"));
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
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject"));
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
        elemField.setFieldName("taskSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskSubtype"));
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
        elemField.setFieldName("what");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "What"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whatId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("who");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Who"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WhoId"));
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
