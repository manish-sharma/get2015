/**
 * FieldDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class FieldDefinition  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.QueryResult controlledFields;

    private com.sforce.soap.enterprise.sobject.FieldDefinition controllingFieldDefinition;

    private java.lang.String controllingFieldDefinitionId;

    private java.lang.String dataType;

    private java.lang.String developerName;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private java.lang.String extraTypeInfo;

    private java.lang.Boolean isApiFilterable;

    private java.lang.Boolean isApiGroupable;

    private java.lang.Boolean isApiSortable;

    private java.lang.Boolean isCalculated;

    private java.lang.Boolean isCompactLayoutable;

    private java.lang.Boolean isFieldHistoryTracked;

    private java.lang.Boolean isHighScaleNumber;

    private java.lang.Boolean isHtmlFormatted;

    private java.lang.Boolean isIndexed;

    private java.lang.Boolean isListFilterable;

    private java.lang.Boolean isListSortable;

    private java.lang.Boolean isListVisible;

    private java.lang.Boolean isNameField;

    private java.lang.Boolean isNillable;

    private java.lang.Boolean isWorkflowFilterable;

    private java.lang.String label;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer length;

    private java.lang.String masterLabel;

    private java.lang.String namespacePrefix;

    private com.sforce.soap.enterprise.QueryResult particles;

    private java.lang.Integer precision;

    private com.sforce.soap.enterprise.sobject.Publisher publisher;

    private java.lang.String publisherId;

    private java.lang.String qualifiedApiName;

    private java.lang.String referenceTargetField;

    private java.lang.String[] referenceTo;

    private com.sforce.soap.enterprise.QueryResult relationshipDomains;

    private java.lang.String relationshipName;

    private com.sforce.soap.enterprise.sobject.UserFieldAccess runningUserFieldAccess;

    private java.lang.String runningUserFieldAccessId;

    private java.lang.Integer scale;

    private com.sforce.soap.enterprise.sobject.DataType serviceDataType;

    private java.lang.String serviceDataTypeId;

    private com.sforce.soap.enterprise.sobject.DataType valueType;

    private java.lang.String valueTypeId;

    public FieldDefinition() {
    }

    public FieldDefinition(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.QueryResult controlledFields,
           com.sforce.soap.enterprise.sobject.FieldDefinition controllingFieldDefinition,
           java.lang.String controllingFieldDefinitionId,
           java.lang.String dataType,
           java.lang.String developerName,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           java.lang.String extraTypeInfo,
           java.lang.Boolean isApiFilterable,
           java.lang.Boolean isApiGroupable,
           java.lang.Boolean isApiSortable,
           java.lang.Boolean isCalculated,
           java.lang.Boolean isCompactLayoutable,
           java.lang.Boolean isFieldHistoryTracked,
           java.lang.Boolean isHighScaleNumber,
           java.lang.Boolean isHtmlFormatted,
           java.lang.Boolean isIndexed,
           java.lang.Boolean isListFilterable,
           java.lang.Boolean isListSortable,
           java.lang.Boolean isListVisible,
           java.lang.Boolean isNameField,
           java.lang.Boolean isNillable,
           java.lang.Boolean isWorkflowFilterable,
           java.lang.String label,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer length,
           java.lang.String masterLabel,
           java.lang.String namespacePrefix,
           com.sforce.soap.enterprise.QueryResult particles,
           java.lang.Integer precision,
           com.sforce.soap.enterprise.sobject.Publisher publisher,
           java.lang.String publisherId,
           java.lang.String qualifiedApiName,
           java.lang.String referenceTargetField,
           java.lang.String[] referenceTo,
           com.sforce.soap.enterprise.QueryResult relationshipDomains,
           java.lang.String relationshipName,
           com.sforce.soap.enterprise.sobject.UserFieldAccess runningUserFieldAccess,
           java.lang.String runningUserFieldAccessId,
           java.lang.Integer scale,
           com.sforce.soap.enterprise.sobject.DataType serviceDataType,
           java.lang.String serviceDataTypeId,
           com.sforce.soap.enterprise.sobject.DataType valueType,
           java.lang.String valueTypeId) {
        super(
            fieldsToNull,
            id);
        this.controlledFields = controlledFields;
        this.controllingFieldDefinition = controllingFieldDefinition;
        this.controllingFieldDefinitionId = controllingFieldDefinitionId;
        this.dataType = dataType;
        this.developerName = developerName;
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.extraTypeInfo = extraTypeInfo;
        this.isApiFilterable = isApiFilterable;
        this.isApiGroupable = isApiGroupable;
        this.isApiSortable = isApiSortable;
        this.isCalculated = isCalculated;
        this.isCompactLayoutable = isCompactLayoutable;
        this.isFieldHistoryTracked = isFieldHistoryTracked;
        this.isHighScaleNumber = isHighScaleNumber;
        this.isHtmlFormatted = isHtmlFormatted;
        this.isIndexed = isIndexed;
        this.isListFilterable = isListFilterable;
        this.isListSortable = isListSortable;
        this.isListVisible = isListVisible;
        this.isNameField = isNameField;
        this.isNillable = isNillable;
        this.isWorkflowFilterable = isWorkflowFilterable;
        this.label = label;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.length = length;
        this.masterLabel = masterLabel;
        this.namespacePrefix = namespacePrefix;
        this.particles = particles;
        this.precision = precision;
        this.publisher = publisher;
        this.publisherId = publisherId;
        this.qualifiedApiName = qualifiedApiName;
        this.referenceTargetField = referenceTargetField;
        this.referenceTo = referenceTo;
        this.relationshipDomains = relationshipDomains;
        this.relationshipName = relationshipName;
        this.runningUserFieldAccess = runningUserFieldAccess;
        this.runningUserFieldAccessId = runningUserFieldAccessId;
        this.scale = scale;
        this.serviceDataType = serviceDataType;
        this.serviceDataTypeId = serviceDataTypeId;
        this.valueType = valueType;
        this.valueTypeId = valueTypeId;
    }


    /**
     * Gets the controlledFields value for this FieldDefinition.
     * 
     * @return controlledFields
     */
    public com.sforce.soap.enterprise.QueryResult getControlledFields() {
        return controlledFields;
    }


    /**
     * Sets the controlledFields value for this FieldDefinition.
     * 
     * @param controlledFields
     */
    public void setControlledFields(com.sforce.soap.enterprise.QueryResult controlledFields) {
        this.controlledFields = controlledFields;
    }


    /**
     * Gets the controllingFieldDefinition value for this FieldDefinition.
     * 
     * @return controllingFieldDefinition
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getControllingFieldDefinition() {
        return controllingFieldDefinition;
    }


    /**
     * Sets the controllingFieldDefinition value for this FieldDefinition.
     * 
     * @param controllingFieldDefinition
     */
    public void setControllingFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition controllingFieldDefinition) {
        this.controllingFieldDefinition = controllingFieldDefinition;
    }


    /**
     * Gets the controllingFieldDefinitionId value for this FieldDefinition.
     * 
     * @return controllingFieldDefinitionId
     */
    public java.lang.String getControllingFieldDefinitionId() {
        return controllingFieldDefinitionId;
    }


    /**
     * Sets the controllingFieldDefinitionId value for this FieldDefinition.
     * 
     * @param controllingFieldDefinitionId
     */
    public void setControllingFieldDefinitionId(java.lang.String controllingFieldDefinitionId) {
        this.controllingFieldDefinitionId = controllingFieldDefinitionId;
    }


    /**
     * Gets the dataType value for this FieldDefinition.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FieldDefinition.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the developerName value for this FieldDefinition.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this FieldDefinition.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the durableId value for this FieldDefinition.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this FieldDefinition.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this FieldDefinition.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this FieldDefinition.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this FieldDefinition.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this FieldDefinition.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the extraTypeInfo value for this FieldDefinition.
     * 
     * @return extraTypeInfo
     */
    public java.lang.String getExtraTypeInfo() {
        return extraTypeInfo;
    }


    /**
     * Sets the extraTypeInfo value for this FieldDefinition.
     * 
     * @param extraTypeInfo
     */
    public void setExtraTypeInfo(java.lang.String extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }


    /**
     * Gets the isApiFilterable value for this FieldDefinition.
     * 
     * @return isApiFilterable
     */
    public java.lang.Boolean getIsApiFilterable() {
        return isApiFilterable;
    }


    /**
     * Sets the isApiFilterable value for this FieldDefinition.
     * 
     * @param isApiFilterable
     */
    public void setIsApiFilterable(java.lang.Boolean isApiFilterable) {
        this.isApiFilterable = isApiFilterable;
    }


    /**
     * Gets the isApiGroupable value for this FieldDefinition.
     * 
     * @return isApiGroupable
     */
    public java.lang.Boolean getIsApiGroupable() {
        return isApiGroupable;
    }


    /**
     * Sets the isApiGroupable value for this FieldDefinition.
     * 
     * @param isApiGroupable
     */
    public void setIsApiGroupable(java.lang.Boolean isApiGroupable) {
        this.isApiGroupable = isApiGroupable;
    }


    /**
     * Gets the isApiSortable value for this FieldDefinition.
     * 
     * @return isApiSortable
     */
    public java.lang.Boolean getIsApiSortable() {
        return isApiSortable;
    }


    /**
     * Sets the isApiSortable value for this FieldDefinition.
     * 
     * @param isApiSortable
     */
    public void setIsApiSortable(java.lang.Boolean isApiSortable) {
        this.isApiSortable = isApiSortable;
    }


    /**
     * Gets the isCalculated value for this FieldDefinition.
     * 
     * @return isCalculated
     */
    public java.lang.Boolean getIsCalculated() {
        return isCalculated;
    }


    /**
     * Sets the isCalculated value for this FieldDefinition.
     * 
     * @param isCalculated
     */
    public void setIsCalculated(java.lang.Boolean isCalculated) {
        this.isCalculated = isCalculated;
    }


    /**
     * Gets the isCompactLayoutable value for this FieldDefinition.
     * 
     * @return isCompactLayoutable
     */
    public java.lang.Boolean getIsCompactLayoutable() {
        return isCompactLayoutable;
    }


    /**
     * Sets the isCompactLayoutable value for this FieldDefinition.
     * 
     * @param isCompactLayoutable
     */
    public void setIsCompactLayoutable(java.lang.Boolean isCompactLayoutable) {
        this.isCompactLayoutable = isCompactLayoutable;
    }


    /**
     * Gets the isFieldHistoryTracked value for this FieldDefinition.
     * 
     * @return isFieldHistoryTracked
     */
    public java.lang.Boolean getIsFieldHistoryTracked() {
        return isFieldHistoryTracked;
    }


    /**
     * Sets the isFieldHistoryTracked value for this FieldDefinition.
     * 
     * @param isFieldHistoryTracked
     */
    public void setIsFieldHistoryTracked(java.lang.Boolean isFieldHistoryTracked) {
        this.isFieldHistoryTracked = isFieldHistoryTracked;
    }


    /**
     * Gets the isHighScaleNumber value for this FieldDefinition.
     * 
     * @return isHighScaleNumber
     */
    public java.lang.Boolean getIsHighScaleNumber() {
        return isHighScaleNumber;
    }


    /**
     * Sets the isHighScaleNumber value for this FieldDefinition.
     * 
     * @param isHighScaleNumber
     */
    public void setIsHighScaleNumber(java.lang.Boolean isHighScaleNumber) {
        this.isHighScaleNumber = isHighScaleNumber;
    }


    /**
     * Gets the isHtmlFormatted value for this FieldDefinition.
     * 
     * @return isHtmlFormatted
     */
    public java.lang.Boolean getIsHtmlFormatted() {
        return isHtmlFormatted;
    }


    /**
     * Sets the isHtmlFormatted value for this FieldDefinition.
     * 
     * @param isHtmlFormatted
     */
    public void setIsHtmlFormatted(java.lang.Boolean isHtmlFormatted) {
        this.isHtmlFormatted = isHtmlFormatted;
    }


    /**
     * Gets the isIndexed value for this FieldDefinition.
     * 
     * @return isIndexed
     */
    public java.lang.Boolean getIsIndexed() {
        return isIndexed;
    }


    /**
     * Sets the isIndexed value for this FieldDefinition.
     * 
     * @param isIndexed
     */
    public void setIsIndexed(java.lang.Boolean isIndexed) {
        this.isIndexed = isIndexed;
    }


    /**
     * Gets the isListFilterable value for this FieldDefinition.
     * 
     * @return isListFilterable
     */
    public java.lang.Boolean getIsListFilterable() {
        return isListFilterable;
    }


    /**
     * Sets the isListFilterable value for this FieldDefinition.
     * 
     * @param isListFilterable
     */
    public void setIsListFilterable(java.lang.Boolean isListFilterable) {
        this.isListFilterable = isListFilterable;
    }


    /**
     * Gets the isListSortable value for this FieldDefinition.
     * 
     * @return isListSortable
     */
    public java.lang.Boolean getIsListSortable() {
        return isListSortable;
    }


    /**
     * Sets the isListSortable value for this FieldDefinition.
     * 
     * @param isListSortable
     */
    public void setIsListSortable(java.lang.Boolean isListSortable) {
        this.isListSortable = isListSortable;
    }


    /**
     * Gets the isListVisible value for this FieldDefinition.
     * 
     * @return isListVisible
     */
    public java.lang.Boolean getIsListVisible() {
        return isListVisible;
    }


    /**
     * Sets the isListVisible value for this FieldDefinition.
     * 
     * @param isListVisible
     */
    public void setIsListVisible(java.lang.Boolean isListVisible) {
        this.isListVisible = isListVisible;
    }


    /**
     * Gets the isNameField value for this FieldDefinition.
     * 
     * @return isNameField
     */
    public java.lang.Boolean getIsNameField() {
        return isNameField;
    }


    /**
     * Sets the isNameField value for this FieldDefinition.
     * 
     * @param isNameField
     */
    public void setIsNameField(java.lang.Boolean isNameField) {
        this.isNameField = isNameField;
    }


    /**
     * Gets the isNillable value for this FieldDefinition.
     * 
     * @return isNillable
     */
    public java.lang.Boolean getIsNillable() {
        return isNillable;
    }


    /**
     * Sets the isNillable value for this FieldDefinition.
     * 
     * @param isNillable
     */
    public void setIsNillable(java.lang.Boolean isNillable) {
        this.isNillable = isNillable;
    }


    /**
     * Gets the isWorkflowFilterable value for this FieldDefinition.
     * 
     * @return isWorkflowFilterable
     */
    public java.lang.Boolean getIsWorkflowFilterable() {
        return isWorkflowFilterable;
    }


    /**
     * Sets the isWorkflowFilterable value for this FieldDefinition.
     * 
     * @param isWorkflowFilterable
     */
    public void setIsWorkflowFilterable(java.lang.Boolean isWorkflowFilterable) {
        this.isWorkflowFilterable = isWorkflowFilterable;
    }


    /**
     * Gets the label value for this FieldDefinition.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FieldDefinition.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the lastModifiedBy value for this FieldDefinition.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this FieldDefinition.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this FieldDefinition.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this FieldDefinition.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this FieldDefinition.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this FieldDefinition.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the length value for this FieldDefinition.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this FieldDefinition.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the masterLabel value for this FieldDefinition.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this FieldDefinition.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the namespacePrefix value for this FieldDefinition.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this FieldDefinition.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the particles value for this FieldDefinition.
     * 
     * @return particles
     */
    public com.sforce.soap.enterprise.QueryResult getParticles() {
        return particles;
    }


    /**
     * Sets the particles value for this FieldDefinition.
     * 
     * @param particles
     */
    public void setParticles(com.sforce.soap.enterprise.QueryResult particles) {
        this.particles = particles;
    }


    /**
     * Gets the precision value for this FieldDefinition.
     * 
     * @return precision
     */
    public java.lang.Integer getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this FieldDefinition.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.Integer precision) {
        this.precision = precision;
    }


    /**
     * Gets the publisher value for this FieldDefinition.
     * 
     * @return publisher
     */
    public com.sforce.soap.enterprise.sobject.Publisher getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this FieldDefinition.
     * 
     * @param publisher
     */
    public void setPublisher(com.sforce.soap.enterprise.sobject.Publisher publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the publisherId value for this FieldDefinition.
     * 
     * @return publisherId
     */
    public java.lang.String getPublisherId() {
        return publisherId;
    }


    /**
     * Sets the publisherId value for this FieldDefinition.
     * 
     * @param publisherId
     */
    public void setPublisherId(java.lang.String publisherId) {
        this.publisherId = publisherId;
    }


    /**
     * Gets the qualifiedApiName value for this FieldDefinition.
     * 
     * @return qualifiedApiName
     */
    public java.lang.String getQualifiedApiName() {
        return qualifiedApiName;
    }


    /**
     * Sets the qualifiedApiName value for this FieldDefinition.
     * 
     * @param qualifiedApiName
     */
    public void setQualifiedApiName(java.lang.String qualifiedApiName) {
        this.qualifiedApiName = qualifiedApiName;
    }


    /**
     * Gets the referenceTargetField value for this FieldDefinition.
     * 
     * @return referenceTargetField
     */
    public java.lang.String getReferenceTargetField() {
        return referenceTargetField;
    }


    /**
     * Sets the referenceTargetField value for this FieldDefinition.
     * 
     * @param referenceTargetField
     */
    public void setReferenceTargetField(java.lang.String referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }


    /**
     * Gets the referenceTo value for this FieldDefinition.
     * 
     * @return referenceTo
     */
    public java.lang.String[] getReferenceTo() {
        return referenceTo;
    }


    /**
     * Sets the referenceTo value for this FieldDefinition.
     * 
     * @param referenceTo
     */
    public void setReferenceTo(java.lang.String[] referenceTo) {
        this.referenceTo = referenceTo;
    }


    /**
     * Gets the relationshipDomains value for this FieldDefinition.
     * 
     * @return relationshipDomains
     */
    public com.sforce.soap.enterprise.QueryResult getRelationshipDomains() {
        return relationshipDomains;
    }


    /**
     * Sets the relationshipDomains value for this FieldDefinition.
     * 
     * @param relationshipDomains
     */
    public void setRelationshipDomains(com.sforce.soap.enterprise.QueryResult relationshipDomains) {
        this.relationshipDomains = relationshipDomains;
    }


    /**
     * Gets the relationshipName value for this FieldDefinition.
     * 
     * @return relationshipName
     */
    public java.lang.String getRelationshipName() {
        return relationshipName;
    }


    /**
     * Sets the relationshipName value for this FieldDefinition.
     * 
     * @param relationshipName
     */
    public void setRelationshipName(java.lang.String relationshipName) {
        this.relationshipName = relationshipName;
    }


    /**
     * Gets the runningUserFieldAccess value for this FieldDefinition.
     * 
     * @return runningUserFieldAccess
     */
    public com.sforce.soap.enterprise.sobject.UserFieldAccess getRunningUserFieldAccess() {
        return runningUserFieldAccess;
    }


    /**
     * Sets the runningUserFieldAccess value for this FieldDefinition.
     * 
     * @param runningUserFieldAccess
     */
    public void setRunningUserFieldAccess(com.sforce.soap.enterprise.sobject.UserFieldAccess runningUserFieldAccess) {
        this.runningUserFieldAccess = runningUserFieldAccess;
    }


    /**
     * Gets the runningUserFieldAccessId value for this FieldDefinition.
     * 
     * @return runningUserFieldAccessId
     */
    public java.lang.String getRunningUserFieldAccessId() {
        return runningUserFieldAccessId;
    }


    /**
     * Sets the runningUserFieldAccessId value for this FieldDefinition.
     * 
     * @param runningUserFieldAccessId
     */
    public void setRunningUserFieldAccessId(java.lang.String runningUserFieldAccessId) {
        this.runningUserFieldAccessId = runningUserFieldAccessId;
    }


    /**
     * Gets the scale value for this FieldDefinition.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this FieldDefinition.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the serviceDataType value for this FieldDefinition.
     * 
     * @return serviceDataType
     */
    public com.sforce.soap.enterprise.sobject.DataType getServiceDataType() {
        return serviceDataType;
    }


    /**
     * Sets the serviceDataType value for this FieldDefinition.
     * 
     * @param serviceDataType
     */
    public void setServiceDataType(com.sforce.soap.enterprise.sobject.DataType serviceDataType) {
        this.serviceDataType = serviceDataType;
    }


    /**
     * Gets the serviceDataTypeId value for this FieldDefinition.
     * 
     * @return serviceDataTypeId
     */
    public java.lang.String getServiceDataTypeId() {
        return serviceDataTypeId;
    }


    /**
     * Sets the serviceDataTypeId value for this FieldDefinition.
     * 
     * @param serviceDataTypeId
     */
    public void setServiceDataTypeId(java.lang.String serviceDataTypeId) {
        this.serviceDataTypeId = serviceDataTypeId;
    }


    /**
     * Gets the valueType value for this FieldDefinition.
     * 
     * @return valueType
     */
    public com.sforce.soap.enterprise.sobject.DataType getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this FieldDefinition.
     * 
     * @param valueType
     */
    public void setValueType(com.sforce.soap.enterprise.sobject.DataType valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the valueTypeId value for this FieldDefinition.
     * 
     * @return valueTypeId
     */
    public java.lang.String getValueTypeId() {
        return valueTypeId;
    }


    /**
     * Sets the valueTypeId value for this FieldDefinition.
     * 
     * @param valueTypeId
     */
    public void setValueTypeId(java.lang.String valueTypeId) {
        this.valueTypeId = valueTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldDefinition)) return false;
        FieldDefinition other = (FieldDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.controlledFields==null && other.getControlledFields()==null) || 
             (this.controlledFields!=null &&
              this.controlledFields.equals(other.getControlledFields()))) &&
            ((this.controllingFieldDefinition==null && other.getControllingFieldDefinition()==null) || 
             (this.controllingFieldDefinition!=null &&
              this.controllingFieldDefinition.equals(other.getControllingFieldDefinition()))) &&
            ((this.controllingFieldDefinitionId==null && other.getControllingFieldDefinitionId()==null) || 
             (this.controllingFieldDefinitionId!=null &&
              this.controllingFieldDefinitionId.equals(other.getControllingFieldDefinitionId()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.durableId==null && other.getDurableId()==null) || 
             (this.durableId!=null &&
              this.durableId.equals(other.getDurableId()))) &&
            ((this.entityDefinition==null && other.getEntityDefinition()==null) || 
             (this.entityDefinition!=null &&
              this.entityDefinition.equals(other.getEntityDefinition()))) &&
            ((this.entityDefinitionId==null && other.getEntityDefinitionId()==null) || 
             (this.entityDefinitionId!=null &&
              this.entityDefinitionId.equals(other.getEntityDefinitionId()))) &&
            ((this.extraTypeInfo==null && other.getExtraTypeInfo()==null) || 
             (this.extraTypeInfo!=null &&
              this.extraTypeInfo.equals(other.getExtraTypeInfo()))) &&
            ((this.isApiFilterable==null && other.getIsApiFilterable()==null) || 
             (this.isApiFilterable!=null &&
              this.isApiFilterable.equals(other.getIsApiFilterable()))) &&
            ((this.isApiGroupable==null && other.getIsApiGroupable()==null) || 
             (this.isApiGroupable!=null &&
              this.isApiGroupable.equals(other.getIsApiGroupable()))) &&
            ((this.isApiSortable==null && other.getIsApiSortable()==null) || 
             (this.isApiSortable!=null &&
              this.isApiSortable.equals(other.getIsApiSortable()))) &&
            ((this.isCalculated==null && other.getIsCalculated()==null) || 
             (this.isCalculated!=null &&
              this.isCalculated.equals(other.getIsCalculated()))) &&
            ((this.isCompactLayoutable==null && other.getIsCompactLayoutable()==null) || 
             (this.isCompactLayoutable!=null &&
              this.isCompactLayoutable.equals(other.getIsCompactLayoutable()))) &&
            ((this.isFieldHistoryTracked==null && other.getIsFieldHistoryTracked()==null) || 
             (this.isFieldHistoryTracked!=null &&
              this.isFieldHistoryTracked.equals(other.getIsFieldHistoryTracked()))) &&
            ((this.isHighScaleNumber==null && other.getIsHighScaleNumber()==null) || 
             (this.isHighScaleNumber!=null &&
              this.isHighScaleNumber.equals(other.getIsHighScaleNumber()))) &&
            ((this.isHtmlFormatted==null && other.getIsHtmlFormatted()==null) || 
             (this.isHtmlFormatted!=null &&
              this.isHtmlFormatted.equals(other.getIsHtmlFormatted()))) &&
            ((this.isIndexed==null && other.getIsIndexed()==null) || 
             (this.isIndexed!=null &&
              this.isIndexed.equals(other.getIsIndexed()))) &&
            ((this.isListFilterable==null && other.getIsListFilterable()==null) || 
             (this.isListFilterable!=null &&
              this.isListFilterable.equals(other.getIsListFilterable()))) &&
            ((this.isListSortable==null && other.getIsListSortable()==null) || 
             (this.isListSortable!=null &&
              this.isListSortable.equals(other.getIsListSortable()))) &&
            ((this.isListVisible==null && other.getIsListVisible()==null) || 
             (this.isListVisible!=null &&
              this.isListVisible.equals(other.getIsListVisible()))) &&
            ((this.isNameField==null && other.getIsNameField()==null) || 
             (this.isNameField!=null &&
              this.isNameField.equals(other.getIsNameField()))) &&
            ((this.isNillable==null && other.getIsNillable()==null) || 
             (this.isNillable!=null &&
              this.isNillable.equals(other.getIsNillable()))) &&
            ((this.isWorkflowFilterable==null && other.getIsWorkflowFilterable()==null) || 
             (this.isWorkflowFilterable!=null &&
              this.isWorkflowFilterable.equals(other.getIsWorkflowFilterable()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.particles==null && other.getParticles()==null) || 
             (this.particles!=null &&
              this.particles.equals(other.getParticles()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.publisherId==null && other.getPublisherId()==null) || 
             (this.publisherId!=null &&
              this.publisherId.equals(other.getPublisherId()))) &&
            ((this.qualifiedApiName==null && other.getQualifiedApiName()==null) || 
             (this.qualifiedApiName!=null &&
              this.qualifiedApiName.equals(other.getQualifiedApiName()))) &&
            ((this.referenceTargetField==null && other.getReferenceTargetField()==null) || 
             (this.referenceTargetField!=null &&
              this.referenceTargetField.equals(other.getReferenceTargetField()))) &&
            ((this.referenceTo==null && other.getReferenceTo()==null) || 
             (this.referenceTo!=null &&
              java.util.Arrays.equals(this.referenceTo, other.getReferenceTo()))) &&
            ((this.relationshipDomains==null && other.getRelationshipDomains()==null) || 
             (this.relationshipDomains!=null &&
              this.relationshipDomains.equals(other.getRelationshipDomains()))) &&
            ((this.relationshipName==null && other.getRelationshipName()==null) || 
             (this.relationshipName!=null &&
              this.relationshipName.equals(other.getRelationshipName()))) &&
            ((this.runningUserFieldAccess==null && other.getRunningUserFieldAccess()==null) || 
             (this.runningUserFieldAccess!=null &&
              this.runningUserFieldAccess.equals(other.getRunningUserFieldAccess()))) &&
            ((this.runningUserFieldAccessId==null && other.getRunningUserFieldAccessId()==null) || 
             (this.runningUserFieldAccessId!=null &&
              this.runningUserFieldAccessId.equals(other.getRunningUserFieldAccessId()))) &&
            ((this.scale==null && other.getScale()==null) || 
             (this.scale!=null &&
              this.scale.equals(other.getScale()))) &&
            ((this.serviceDataType==null && other.getServiceDataType()==null) || 
             (this.serviceDataType!=null &&
              this.serviceDataType.equals(other.getServiceDataType()))) &&
            ((this.serviceDataTypeId==null && other.getServiceDataTypeId()==null) || 
             (this.serviceDataTypeId!=null &&
              this.serviceDataTypeId.equals(other.getServiceDataTypeId()))) &&
            ((this.valueType==null && other.getValueType()==null) || 
             (this.valueType!=null &&
              this.valueType.equals(other.getValueType()))) &&
            ((this.valueTypeId==null && other.getValueTypeId()==null) || 
             (this.valueTypeId!=null &&
              this.valueTypeId.equals(other.getValueTypeId())));
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
        if (getControlledFields() != null) {
            _hashCode += getControlledFields().hashCode();
        }
        if (getControllingFieldDefinition() != null) {
            _hashCode += getControllingFieldDefinition().hashCode();
        }
        if (getControllingFieldDefinitionId() != null) {
            _hashCode += getControllingFieldDefinitionId().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getDurableId() != null) {
            _hashCode += getDurableId().hashCode();
        }
        if (getEntityDefinition() != null) {
            _hashCode += getEntityDefinition().hashCode();
        }
        if (getEntityDefinitionId() != null) {
            _hashCode += getEntityDefinitionId().hashCode();
        }
        if (getExtraTypeInfo() != null) {
            _hashCode += getExtraTypeInfo().hashCode();
        }
        if (getIsApiFilterable() != null) {
            _hashCode += getIsApiFilterable().hashCode();
        }
        if (getIsApiGroupable() != null) {
            _hashCode += getIsApiGroupable().hashCode();
        }
        if (getIsApiSortable() != null) {
            _hashCode += getIsApiSortable().hashCode();
        }
        if (getIsCalculated() != null) {
            _hashCode += getIsCalculated().hashCode();
        }
        if (getIsCompactLayoutable() != null) {
            _hashCode += getIsCompactLayoutable().hashCode();
        }
        if (getIsFieldHistoryTracked() != null) {
            _hashCode += getIsFieldHistoryTracked().hashCode();
        }
        if (getIsHighScaleNumber() != null) {
            _hashCode += getIsHighScaleNumber().hashCode();
        }
        if (getIsHtmlFormatted() != null) {
            _hashCode += getIsHtmlFormatted().hashCode();
        }
        if (getIsIndexed() != null) {
            _hashCode += getIsIndexed().hashCode();
        }
        if (getIsListFilterable() != null) {
            _hashCode += getIsListFilterable().hashCode();
        }
        if (getIsListSortable() != null) {
            _hashCode += getIsListSortable().hashCode();
        }
        if (getIsListVisible() != null) {
            _hashCode += getIsListVisible().hashCode();
        }
        if (getIsNameField() != null) {
            _hashCode += getIsNameField().hashCode();
        }
        if (getIsNillable() != null) {
            _hashCode += getIsNillable().hashCode();
        }
        if (getIsWorkflowFilterable() != null) {
            _hashCode += getIsWorkflowFilterable().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
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
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getParticles() != null) {
            _hashCode += getParticles().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getPublisherId() != null) {
            _hashCode += getPublisherId().hashCode();
        }
        if (getQualifiedApiName() != null) {
            _hashCode += getQualifiedApiName().hashCode();
        }
        if (getReferenceTargetField() != null) {
            _hashCode += getReferenceTargetField().hashCode();
        }
        if (getReferenceTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceTo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelationshipDomains() != null) {
            _hashCode += getRelationshipDomains().hashCode();
        }
        if (getRelationshipName() != null) {
            _hashCode += getRelationshipName().hashCode();
        }
        if (getRunningUserFieldAccess() != null) {
            _hashCode += getRunningUserFieldAccess().hashCode();
        }
        if (getRunningUserFieldAccessId() != null) {
            _hashCode += getRunningUserFieldAccessId().hashCode();
        }
        if (getScale() != null) {
            _hashCode += getScale().hashCode();
        }
        if (getServiceDataType() != null) {
            _hashCode += getServiceDataType().hashCode();
        }
        if (getServiceDataTypeId() != null) {
            _hashCode += getServiceDataTypeId().hashCode();
        }
        if (getValueType() != null) {
            _hashCode += getValueType().hashCode();
        }
        if (getValueTypeId() != null) {
            _hashCode += getValueTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlledFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ControlledFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingFieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ControllingFieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controllingFieldDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ControllingFieldDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeveloperName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durableId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DurableId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExtraTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApiFilterable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiFilterable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApiGroupable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiGroupable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isApiSortable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsApiSortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCalculated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCalculated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompactLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCompactLayoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFieldHistoryTracked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFieldHistoryTracked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHighScaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHighScaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHtmlFormatted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsHtmlFormatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIndexed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsIndexed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isListFilterable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsListFilterable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isListSortable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsListSortable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isListVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsListVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNameField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNameField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWorkflowFilterable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWorkflowFilterable"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namespacePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamespacePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("particles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Particles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisherId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PublisherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedApiName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QualifiedApiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTargetField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReferenceTargetField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReferenceTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "referenceTo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipDomains");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipDomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUserFieldAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUserFieldAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFieldAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningUserFieldAccessId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RunningUserFieldAccessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDataTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceDataTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ValueTypeId"));
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
