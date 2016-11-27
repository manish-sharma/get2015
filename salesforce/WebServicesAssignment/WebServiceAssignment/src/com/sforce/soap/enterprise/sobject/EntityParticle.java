/**
 * EntityParticle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class EntityParticle  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Integer byteLength;

    private java.lang.String dataType;

    private java.lang.String defaultValueFormula;

    private java.lang.String developerName;

    private java.lang.Integer digits;

    private java.lang.String durableId;

    private com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition;

    private java.lang.String entityDefinitionId;

    private java.lang.String extraTypeInfo;

    private com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition;

    private java.lang.String fieldDefinitionId;

    private java.lang.String inlineHelpText;

    private java.lang.Boolean isApiFilterable;

    private java.lang.Boolean isApiGroupable;

    private java.lang.Boolean isApiSortable;

    private java.lang.Boolean isAutonumber;

    private java.lang.Boolean isCalculated;

    private java.lang.Boolean isCaseSensitive;

    private java.lang.Boolean isCompactLayoutable;

    private java.lang.Boolean isCreatable;

    private java.lang.Boolean isDefaultedOnCreate;

    private java.lang.Boolean isDependentPicklist;

    private java.lang.Boolean isDeprecatedAndHidden;

    private java.lang.Boolean isDisplayLocationInDecimal;

    private java.lang.Boolean isEncrypted;

    private java.lang.Boolean isFieldHistoryTracked;

    private java.lang.Boolean isHighScaleNumber;

    private java.lang.Boolean isHtmlFormatted;

    private java.lang.Boolean isIdLookup;

    private java.lang.Boolean isLayoutable;

    private java.lang.Boolean isListVisible;

    private java.lang.Boolean isNameField;

    private java.lang.Boolean isNamePointing;

    private java.lang.Boolean isNillable;

    private java.lang.Boolean isPermissionable;

    private java.lang.Boolean isUnique;

    private java.lang.Boolean isUpdatable;

    private java.lang.Boolean isWorkflowFilterable;

    private java.lang.Boolean isWriteRequiresMasterRead;

    private java.lang.String label;

    private java.lang.Integer length;

    private java.lang.String mask;

    private java.lang.String maskType;

    private java.lang.String masterLabel;

    private java.lang.String name;

    private java.lang.String namespacePrefix;

    private com.sforce.soap.enterprise.QueryResult picklistValues;

    private java.lang.Integer precision;

    private java.lang.String qualifiedApiName;

    private java.lang.String referenceTargetField;

    private java.lang.String[] referenceTo;

    private java.lang.String relationshipName;

    private java.lang.Integer relationshipOrder;

    private java.lang.Integer scale;

    private com.sforce.soap.enterprise.sobject.DataType serviceDataType;

    private java.lang.String serviceDataTypeId;

    private com.sforce.soap.enterprise.sobject.DataType valueType;

    private java.lang.String valueTypeId;

    public EntityParticle() {
    }

    public EntityParticle(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Integer byteLength,
           java.lang.String dataType,
           java.lang.String defaultValueFormula,
           java.lang.String developerName,
           java.lang.Integer digits,
           java.lang.String durableId,
           com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition,
           java.lang.String entityDefinitionId,
           java.lang.String extraTypeInfo,
           com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition,
           java.lang.String fieldDefinitionId,
           java.lang.String inlineHelpText,
           java.lang.Boolean isApiFilterable,
           java.lang.Boolean isApiGroupable,
           java.lang.Boolean isApiSortable,
           java.lang.Boolean isAutonumber,
           java.lang.Boolean isCalculated,
           java.lang.Boolean isCaseSensitive,
           java.lang.Boolean isCompactLayoutable,
           java.lang.Boolean isCreatable,
           java.lang.Boolean isDefaultedOnCreate,
           java.lang.Boolean isDependentPicklist,
           java.lang.Boolean isDeprecatedAndHidden,
           java.lang.Boolean isDisplayLocationInDecimal,
           java.lang.Boolean isEncrypted,
           java.lang.Boolean isFieldHistoryTracked,
           java.lang.Boolean isHighScaleNumber,
           java.lang.Boolean isHtmlFormatted,
           java.lang.Boolean isIdLookup,
           java.lang.Boolean isLayoutable,
           java.lang.Boolean isListVisible,
           java.lang.Boolean isNameField,
           java.lang.Boolean isNamePointing,
           java.lang.Boolean isNillable,
           java.lang.Boolean isPermissionable,
           java.lang.Boolean isUnique,
           java.lang.Boolean isUpdatable,
           java.lang.Boolean isWorkflowFilterable,
           java.lang.Boolean isWriteRequiresMasterRead,
           java.lang.String label,
           java.lang.Integer length,
           java.lang.String mask,
           java.lang.String maskType,
           java.lang.String masterLabel,
           java.lang.String name,
           java.lang.String namespacePrefix,
           com.sforce.soap.enterprise.QueryResult picklistValues,
           java.lang.Integer precision,
           java.lang.String qualifiedApiName,
           java.lang.String referenceTargetField,
           java.lang.String[] referenceTo,
           java.lang.String relationshipName,
           java.lang.Integer relationshipOrder,
           java.lang.Integer scale,
           com.sforce.soap.enterprise.sobject.DataType serviceDataType,
           java.lang.String serviceDataTypeId,
           com.sforce.soap.enterprise.sobject.DataType valueType,
           java.lang.String valueTypeId) {
        super(
            fieldsToNull,
            id);
        this.byteLength = byteLength;
        this.dataType = dataType;
        this.defaultValueFormula = defaultValueFormula;
        this.developerName = developerName;
        this.digits = digits;
        this.durableId = durableId;
        this.entityDefinition = entityDefinition;
        this.entityDefinitionId = entityDefinitionId;
        this.extraTypeInfo = extraTypeInfo;
        this.fieldDefinition = fieldDefinition;
        this.fieldDefinitionId = fieldDefinitionId;
        this.inlineHelpText = inlineHelpText;
        this.isApiFilterable = isApiFilterable;
        this.isApiGroupable = isApiGroupable;
        this.isApiSortable = isApiSortable;
        this.isAutonumber = isAutonumber;
        this.isCalculated = isCalculated;
        this.isCaseSensitive = isCaseSensitive;
        this.isCompactLayoutable = isCompactLayoutable;
        this.isCreatable = isCreatable;
        this.isDefaultedOnCreate = isDefaultedOnCreate;
        this.isDependentPicklist = isDependentPicklist;
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
        this.isDisplayLocationInDecimal = isDisplayLocationInDecimal;
        this.isEncrypted = isEncrypted;
        this.isFieldHistoryTracked = isFieldHistoryTracked;
        this.isHighScaleNumber = isHighScaleNumber;
        this.isHtmlFormatted = isHtmlFormatted;
        this.isIdLookup = isIdLookup;
        this.isLayoutable = isLayoutable;
        this.isListVisible = isListVisible;
        this.isNameField = isNameField;
        this.isNamePointing = isNamePointing;
        this.isNillable = isNillable;
        this.isPermissionable = isPermissionable;
        this.isUnique = isUnique;
        this.isUpdatable = isUpdatable;
        this.isWorkflowFilterable = isWorkflowFilterable;
        this.isWriteRequiresMasterRead = isWriteRequiresMasterRead;
        this.label = label;
        this.length = length;
        this.mask = mask;
        this.maskType = maskType;
        this.masterLabel = masterLabel;
        this.name = name;
        this.namespacePrefix = namespacePrefix;
        this.picklistValues = picklistValues;
        this.precision = precision;
        this.qualifiedApiName = qualifiedApiName;
        this.referenceTargetField = referenceTargetField;
        this.referenceTo = referenceTo;
        this.relationshipName = relationshipName;
        this.relationshipOrder = relationshipOrder;
        this.scale = scale;
        this.serviceDataType = serviceDataType;
        this.serviceDataTypeId = serviceDataTypeId;
        this.valueType = valueType;
        this.valueTypeId = valueTypeId;
    }


    /**
     * Gets the byteLength value for this EntityParticle.
     * 
     * @return byteLength
     */
    public java.lang.Integer getByteLength() {
        return byteLength;
    }


    /**
     * Sets the byteLength value for this EntityParticle.
     * 
     * @param byteLength
     */
    public void setByteLength(java.lang.Integer byteLength) {
        this.byteLength = byteLength;
    }


    /**
     * Gets the dataType value for this EntityParticle.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this EntityParticle.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the defaultValueFormula value for this EntityParticle.
     * 
     * @return defaultValueFormula
     */
    public java.lang.String getDefaultValueFormula() {
        return defaultValueFormula;
    }


    /**
     * Sets the defaultValueFormula value for this EntityParticle.
     * 
     * @param defaultValueFormula
     */
    public void setDefaultValueFormula(java.lang.String defaultValueFormula) {
        this.defaultValueFormula = defaultValueFormula;
    }


    /**
     * Gets the developerName value for this EntityParticle.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this EntityParticle.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the digits value for this EntityParticle.
     * 
     * @return digits
     */
    public java.lang.Integer getDigits() {
        return digits;
    }


    /**
     * Sets the digits value for this EntityParticle.
     * 
     * @param digits
     */
    public void setDigits(java.lang.Integer digits) {
        this.digits = digits;
    }


    /**
     * Gets the durableId value for this EntityParticle.
     * 
     * @return durableId
     */
    public java.lang.String getDurableId() {
        return durableId;
    }


    /**
     * Sets the durableId value for this EntityParticle.
     * 
     * @param durableId
     */
    public void setDurableId(java.lang.String durableId) {
        this.durableId = durableId;
    }


    /**
     * Gets the entityDefinition value for this EntityParticle.
     * 
     * @return entityDefinition
     */
    public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
        return entityDefinition;
    }


    /**
     * Sets the entityDefinition value for this EntityParticle.
     * 
     * @param entityDefinition
     */
    public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition entityDefinition) {
        this.entityDefinition = entityDefinition;
    }


    /**
     * Gets the entityDefinitionId value for this EntityParticle.
     * 
     * @return entityDefinitionId
     */
    public java.lang.String getEntityDefinitionId() {
        return entityDefinitionId;
    }


    /**
     * Sets the entityDefinitionId value for this EntityParticle.
     * 
     * @param entityDefinitionId
     */
    public void setEntityDefinitionId(java.lang.String entityDefinitionId) {
        this.entityDefinitionId = entityDefinitionId;
    }


    /**
     * Gets the extraTypeInfo value for this EntityParticle.
     * 
     * @return extraTypeInfo
     */
    public java.lang.String getExtraTypeInfo() {
        return extraTypeInfo;
    }


    /**
     * Sets the extraTypeInfo value for this EntityParticle.
     * 
     * @param extraTypeInfo
     */
    public void setExtraTypeInfo(java.lang.String extraTypeInfo) {
        this.extraTypeInfo = extraTypeInfo;
    }


    /**
     * Gets the fieldDefinition value for this EntityParticle.
     * 
     * @return fieldDefinition
     */
    public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
        return fieldDefinition;
    }


    /**
     * Sets the fieldDefinition value for this EntityParticle.
     * 
     * @param fieldDefinition
     */
    public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }


    /**
     * Gets the fieldDefinitionId value for this EntityParticle.
     * 
     * @return fieldDefinitionId
     */
    public java.lang.String getFieldDefinitionId() {
        return fieldDefinitionId;
    }


    /**
     * Sets the fieldDefinitionId value for this EntityParticle.
     * 
     * @param fieldDefinitionId
     */
    public void setFieldDefinitionId(java.lang.String fieldDefinitionId) {
        this.fieldDefinitionId = fieldDefinitionId;
    }


    /**
     * Gets the inlineHelpText value for this EntityParticle.
     * 
     * @return inlineHelpText
     */
    public java.lang.String getInlineHelpText() {
        return inlineHelpText;
    }


    /**
     * Sets the inlineHelpText value for this EntityParticle.
     * 
     * @param inlineHelpText
     */
    public void setInlineHelpText(java.lang.String inlineHelpText) {
        this.inlineHelpText = inlineHelpText;
    }


    /**
     * Gets the isApiFilterable value for this EntityParticle.
     * 
     * @return isApiFilterable
     */
    public java.lang.Boolean getIsApiFilterable() {
        return isApiFilterable;
    }


    /**
     * Sets the isApiFilterable value for this EntityParticle.
     * 
     * @param isApiFilterable
     */
    public void setIsApiFilterable(java.lang.Boolean isApiFilterable) {
        this.isApiFilterable = isApiFilterable;
    }


    /**
     * Gets the isApiGroupable value for this EntityParticle.
     * 
     * @return isApiGroupable
     */
    public java.lang.Boolean getIsApiGroupable() {
        return isApiGroupable;
    }


    /**
     * Sets the isApiGroupable value for this EntityParticle.
     * 
     * @param isApiGroupable
     */
    public void setIsApiGroupable(java.lang.Boolean isApiGroupable) {
        this.isApiGroupable = isApiGroupable;
    }


    /**
     * Gets the isApiSortable value for this EntityParticle.
     * 
     * @return isApiSortable
     */
    public java.lang.Boolean getIsApiSortable() {
        return isApiSortable;
    }


    /**
     * Sets the isApiSortable value for this EntityParticle.
     * 
     * @param isApiSortable
     */
    public void setIsApiSortable(java.lang.Boolean isApiSortable) {
        this.isApiSortable = isApiSortable;
    }


    /**
     * Gets the isAutonumber value for this EntityParticle.
     * 
     * @return isAutonumber
     */
    public java.lang.Boolean getIsAutonumber() {
        return isAutonumber;
    }


    /**
     * Sets the isAutonumber value for this EntityParticle.
     * 
     * @param isAutonumber
     */
    public void setIsAutonumber(java.lang.Boolean isAutonumber) {
        this.isAutonumber = isAutonumber;
    }


    /**
     * Gets the isCalculated value for this EntityParticle.
     * 
     * @return isCalculated
     */
    public java.lang.Boolean getIsCalculated() {
        return isCalculated;
    }


    /**
     * Sets the isCalculated value for this EntityParticle.
     * 
     * @param isCalculated
     */
    public void setIsCalculated(java.lang.Boolean isCalculated) {
        this.isCalculated = isCalculated;
    }


    /**
     * Gets the isCaseSensitive value for this EntityParticle.
     * 
     * @return isCaseSensitive
     */
    public java.lang.Boolean getIsCaseSensitive() {
        return isCaseSensitive;
    }


    /**
     * Sets the isCaseSensitive value for this EntityParticle.
     * 
     * @param isCaseSensitive
     */
    public void setIsCaseSensitive(java.lang.Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
    }


    /**
     * Gets the isCompactLayoutable value for this EntityParticle.
     * 
     * @return isCompactLayoutable
     */
    public java.lang.Boolean getIsCompactLayoutable() {
        return isCompactLayoutable;
    }


    /**
     * Sets the isCompactLayoutable value for this EntityParticle.
     * 
     * @param isCompactLayoutable
     */
    public void setIsCompactLayoutable(java.lang.Boolean isCompactLayoutable) {
        this.isCompactLayoutable = isCompactLayoutable;
    }


    /**
     * Gets the isCreatable value for this EntityParticle.
     * 
     * @return isCreatable
     */
    public java.lang.Boolean getIsCreatable() {
        return isCreatable;
    }


    /**
     * Sets the isCreatable value for this EntityParticle.
     * 
     * @param isCreatable
     */
    public void setIsCreatable(java.lang.Boolean isCreatable) {
        this.isCreatable = isCreatable;
    }


    /**
     * Gets the isDefaultedOnCreate value for this EntityParticle.
     * 
     * @return isDefaultedOnCreate
     */
    public java.lang.Boolean getIsDefaultedOnCreate() {
        return isDefaultedOnCreate;
    }


    /**
     * Sets the isDefaultedOnCreate value for this EntityParticle.
     * 
     * @param isDefaultedOnCreate
     */
    public void setIsDefaultedOnCreate(java.lang.Boolean isDefaultedOnCreate) {
        this.isDefaultedOnCreate = isDefaultedOnCreate;
    }


    /**
     * Gets the isDependentPicklist value for this EntityParticle.
     * 
     * @return isDependentPicklist
     */
    public java.lang.Boolean getIsDependentPicklist() {
        return isDependentPicklist;
    }


    /**
     * Sets the isDependentPicklist value for this EntityParticle.
     * 
     * @param isDependentPicklist
     */
    public void setIsDependentPicklist(java.lang.Boolean isDependentPicklist) {
        this.isDependentPicklist = isDependentPicklist;
    }


    /**
     * Gets the isDeprecatedAndHidden value for this EntityParticle.
     * 
     * @return isDeprecatedAndHidden
     */
    public java.lang.Boolean getIsDeprecatedAndHidden() {
        return isDeprecatedAndHidden;
    }


    /**
     * Sets the isDeprecatedAndHidden value for this EntityParticle.
     * 
     * @param isDeprecatedAndHidden
     */
    public void setIsDeprecatedAndHidden(java.lang.Boolean isDeprecatedAndHidden) {
        this.isDeprecatedAndHidden = isDeprecatedAndHidden;
    }


    /**
     * Gets the isDisplayLocationInDecimal value for this EntityParticle.
     * 
     * @return isDisplayLocationInDecimal
     */
    public java.lang.Boolean getIsDisplayLocationInDecimal() {
        return isDisplayLocationInDecimal;
    }


    /**
     * Sets the isDisplayLocationInDecimal value for this EntityParticle.
     * 
     * @param isDisplayLocationInDecimal
     */
    public void setIsDisplayLocationInDecimal(java.lang.Boolean isDisplayLocationInDecimal) {
        this.isDisplayLocationInDecimal = isDisplayLocationInDecimal;
    }


    /**
     * Gets the isEncrypted value for this EntityParticle.
     * 
     * @return isEncrypted
     */
    public java.lang.Boolean getIsEncrypted() {
        return isEncrypted;
    }


    /**
     * Sets the isEncrypted value for this EntityParticle.
     * 
     * @param isEncrypted
     */
    public void setIsEncrypted(java.lang.Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }


    /**
     * Gets the isFieldHistoryTracked value for this EntityParticle.
     * 
     * @return isFieldHistoryTracked
     */
    public java.lang.Boolean getIsFieldHistoryTracked() {
        return isFieldHistoryTracked;
    }


    /**
     * Sets the isFieldHistoryTracked value for this EntityParticle.
     * 
     * @param isFieldHistoryTracked
     */
    public void setIsFieldHistoryTracked(java.lang.Boolean isFieldHistoryTracked) {
        this.isFieldHistoryTracked = isFieldHistoryTracked;
    }


    /**
     * Gets the isHighScaleNumber value for this EntityParticle.
     * 
     * @return isHighScaleNumber
     */
    public java.lang.Boolean getIsHighScaleNumber() {
        return isHighScaleNumber;
    }


    /**
     * Sets the isHighScaleNumber value for this EntityParticle.
     * 
     * @param isHighScaleNumber
     */
    public void setIsHighScaleNumber(java.lang.Boolean isHighScaleNumber) {
        this.isHighScaleNumber = isHighScaleNumber;
    }


    /**
     * Gets the isHtmlFormatted value for this EntityParticle.
     * 
     * @return isHtmlFormatted
     */
    public java.lang.Boolean getIsHtmlFormatted() {
        return isHtmlFormatted;
    }


    /**
     * Sets the isHtmlFormatted value for this EntityParticle.
     * 
     * @param isHtmlFormatted
     */
    public void setIsHtmlFormatted(java.lang.Boolean isHtmlFormatted) {
        this.isHtmlFormatted = isHtmlFormatted;
    }


    /**
     * Gets the isIdLookup value for this EntityParticle.
     * 
     * @return isIdLookup
     */
    public java.lang.Boolean getIsIdLookup() {
        return isIdLookup;
    }


    /**
     * Sets the isIdLookup value for this EntityParticle.
     * 
     * @param isIdLookup
     */
    public void setIsIdLookup(java.lang.Boolean isIdLookup) {
        this.isIdLookup = isIdLookup;
    }


    /**
     * Gets the isLayoutable value for this EntityParticle.
     * 
     * @return isLayoutable
     */
    public java.lang.Boolean getIsLayoutable() {
        return isLayoutable;
    }


    /**
     * Sets the isLayoutable value for this EntityParticle.
     * 
     * @param isLayoutable
     */
    public void setIsLayoutable(java.lang.Boolean isLayoutable) {
        this.isLayoutable = isLayoutable;
    }


    /**
     * Gets the isListVisible value for this EntityParticle.
     * 
     * @return isListVisible
     */
    public java.lang.Boolean getIsListVisible() {
        return isListVisible;
    }


    /**
     * Sets the isListVisible value for this EntityParticle.
     * 
     * @param isListVisible
     */
    public void setIsListVisible(java.lang.Boolean isListVisible) {
        this.isListVisible = isListVisible;
    }


    /**
     * Gets the isNameField value for this EntityParticle.
     * 
     * @return isNameField
     */
    public java.lang.Boolean getIsNameField() {
        return isNameField;
    }


    /**
     * Sets the isNameField value for this EntityParticle.
     * 
     * @param isNameField
     */
    public void setIsNameField(java.lang.Boolean isNameField) {
        this.isNameField = isNameField;
    }


    /**
     * Gets the isNamePointing value for this EntityParticle.
     * 
     * @return isNamePointing
     */
    public java.lang.Boolean getIsNamePointing() {
        return isNamePointing;
    }


    /**
     * Sets the isNamePointing value for this EntityParticle.
     * 
     * @param isNamePointing
     */
    public void setIsNamePointing(java.lang.Boolean isNamePointing) {
        this.isNamePointing = isNamePointing;
    }


    /**
     * Gets the isNillable value for this EntityParticle.
     * 
     * @return isNillable
     */
    public java.lang.Boolean getIsNillable() {
        return isNillable;
    }


    /**
     * Sets the isNillable value for this EntityParticle.
     * 
     * @param isNillable
     */
    public void setIsNillable(java.lang.Boolean isNillable) {
        this.isNillable = isNillable;
    }


    /**
     * Gets the isPermissionable value for this EntityParticle.
     * 
     * @return isPermissionable
     */
    public java.lang.Boolean getIsPermissionable() {
        return isPermissionable;
    }


    /**
     * Sets the isPermissionable value for this EntityParticle.
     * 
     * @param isPermissionable
     */
    public void setIsPermissionable(java.lang.Boolean isPermissionable) {
        this.isPermissionable = isPermissionable;
    }


    /**
     * Gets the isUnique value for this EntityParticle.
     * 
     * @return isUnique
     */
    public java.lang.Boolean getIsUnique() {
        return isUnique;
    }


    /**
     * Sets the isUnique value for this EntityParticle.
     * 
     * @param isUnique
     */
    public void setIsUnique(java.lang.Boolean isUnique) {
        this.isUnique = isUnique;
    }


    /**
     * Gets the isUpdatable value for this EntityParticle.
     * 
     * @return isUpdatable
     */
    public java.lang.Boolean getIsUpdatable() {
        return isUpdatable;
    }


    /**
     * Sets the isUpdatable value for this EntityParticle.
     * 
     * @param isUpdatable
     */
    public void setIsUpdatable(java.lang.Boolean isUpdatable) {
        this.isUpdatable = isUpdatable;
    }


    /**
     * Gets the isWorkflowFilterable value for this EntityParticle.
     * 
     * @return isWorkflowFilterable
     */
    public java.lang.Boolean getIsWorkflowFilterable() {
        return isWorkflowFilterable;
    }


    /**
     * Sets the isWorkflowFilterable value for this EntityParticle.
     * 
     * @param isWorkflowFilterable
     */
    public void setIsWorkflowFilterable(java.lang.Boolean isWorkflowFilterable) {
        this.isWorkflowFilterable = isWorkflowFilterable;
    }


    /**
     * Gets the isWriteRequiresMasterRead value for this EntityParticle.
     * 
     * @return isWriteRequiresMasterRead
     */
    public java.lang.Boolean getIsWriteRequiresMasterRead() {
        return isWriteRequiresMasterRead;
    }


    /**
     * Sets the isWriteRequiresMasterRead value for this EntityParticle.
     * 
     * @param isWriteRequiresMasterRead
     */
    public void setIsWriteRequiresMasterRead(java.lang.Boolean isWriteRequiresMasterRead) {
        this.isWriteRequiresMasterRead = isWriteRequiresMasterRead;
    }


    /**
     * Gets the label value for this EntityParticle.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this EntityParticle.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the length value for this EntityParticle.
     * 
     * @return length
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this EntityParticle.
     * 
     * @param length
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }


    /**
     * Gets the mask value for this EntityParticle.
     * 
     * @return mask
     */
    public java.lang.String getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this EntityParticle.
     * 
     * @param mask
     */
    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }


    /**
     * Gets the maskType value for this EntityParticle.
     * 
     * @return maskType
     */
    public java.lang.String getMaskType() {
        return maskType;
    }


    /**
     * Sets the maskType value for this EntityParticle.
     * 
     * @param maskType
     */
    public void setMaskType(java.lang.String maskType) {
        this.maskType = maskType;
    }


    /**
     * Gets the masterLabel value for this EntityParticle.
     * 
     * @return masterLabel
     */
    public java.lang.String getMasterLabel() {
        return masterLabel;
    }


    /**
     * Sets the masterLabel value for this EntityParticle.
     * 
     * @param masterLabel
     */
    public void setMasterLabel(java.lang.String masterLabel) {
        this.masterLabel = masterLabel;
    }


    /**
     * Gets the name value for this EntityParticle.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EntityParticle.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the namespacePrefix value for this EntityParticle.
     * 
     * @return namespacePrefix
     */
    public java.lang.String getNamespacePrefix() {
        return namespacePrefix;
    }


    /**
     * Sets the namespacePrefix value for this EntityParticle.
     * 
     * @param namespacePrefix
     */
    public void setNamespacePrefix(java.lang.String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }


    /**
     * Gets the picklistValues value for this EntityParticle.
     * 
     * @return picklistValues
     */
    public com.sforce.soap.enterprise.QueryResult getPicklistValues() {
        return picklistValues;
    }


    /**
     * Sets the picklistValues value for this EntityParticle.
     * 
     * @param picklistValues
     */
    public void setPicklistValues(com.sforce.soap.enterprise.QueryResult picklistValues) {
        this.picklistValues = picklistValues;
    }


    /**
     * Gets the precision value for this EntityParticle.
     * 
     * @return precision
     */
    public java.lang.Integer getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this EntityParticle.
     * 
     * @param precision
     */
    public void setPrecision(java.lang.Integer precision) {
        this.precision = precision;
    }


    /**
     * Gets the qualifiedApiName value for this EntityParticle.
     * 
     * @return qualifiedApiName
     */
    public java.lang.String getQualifiedApiName() {
        return qualifiedApiName;
    }


    /**
     * Sets the qualifiedApiName value for this EntityParticle.
     * 
     * @param qualifiedApiName
     */
    public void setQualifiedApiName(java.lang.String qualifiedApiName) {
        this.qualifiedApiName = qualifiedApiName;
    }


    /**
     * Gets the referenceTargetField value for this EntityParticle.
     * 
     * @return referenceTargetField
     */
    public java.lang.String getReferenceTargetField() {
        return referenceTargetField;
    }


    /**
     * Sets the referenceTargetField value for this EntityParticle.
     * 
     * @param referenceTargetField
     */
    public void setReferenceTargetField(java.lang.String referenceTargetField) {
        this.referenceTargetField = referenceTargetField;
    }


    /**
     * Gets the referenceTo value for this EntityParticle.
     * 
     * @return referenceTo
     */
    public java.lang.String[] getReferenceTo() {
        return referenceTo;
    }


    /**
     * Sets the referenceTo value for this EntityParticle.
     * 
     * @param referenceTo
     */
    public void setReferenceTo(java.lang.String[] referenceTo) {
        this.referenceTo = referenceTo;
    }


    /**
     * Gets the relationshipName value for this EntityParticle.
     * 
     * @return relationshipName
     */
    public java.lang.String getRelationshipName() {
        return relationshipName;
    }


    /**
     * Sets the relationshipName value for this EntityParticle.
     * 
     * @param relationshipName
     */
    public void setRelationshipName(java.lang.String relationshipName) {
        this.relationshipName = relationshipName;
    }


    /**
     * Gets the relationshipOrder value for this EntityParticle.
     * 
     * @return relationshipOrder
     */
    public java.lang.Integer getRelationshipOrder() {
        return relationshipOrder;
    }


    /**
     * Sets the relationshipOrder value for this EntityParticle.
     * 
     * @param relationshipOrder
     */
    public void setRelationshipOrder(java.lang.Integer relationshipOrder) {
        this.relationshipOrder = relationshipOrder;
    }


    /**
     * Gets the scale value for this EntityParticle.
     * 
     * @return scale
     */
    public java.lang.Integer getScale() {
        return scale;
    }


    /**
     * Sets the scale value for this EntityParticle.
     * 
     * @param scale
     */
    public void setScale(java.lang.Integer scale) {
        this.scale = scale;
    }


    /**
     * Gets the serviceDataType value for this EntityParticle.
     * 
     * @return serviceDataType
     */
    public com.sforce.soap.enterprise.sobject.DataType getServiceDataType() {
        return serviceDataType;
    }


    /**
     * Sets the serviceDataType value for this EntityParticle.
     * 
     * @param serviceDataType
     */
    public void setServiceDataType(com.sforce.soap.enterprise.sobject.DataType serviceDataType) {
        this.serviceDataType = serviceDataType;
    }


    /**
     * Gets the serviceDataTypeId value for this EntityParticle.
     * 
     * @return serviceDataTypeId
     */
    public java.lang.String getServiceDataTypeId() {
        return serviceDataTypeId;
    }


    /**
     * Sets the serviceDataTypeId value for this EntityParticle.
     * 
     * @param serviceDataTypeId
     */
    public void setServiceDataTypeId(java.lang.String serviceDataTypeId) {
        this.serviceDataTypeId = serviceDataTypeId;
    }


    /**
     * Gets the valueType value for this EntityParticle.
     * 
     * @return valueType
     */
    public com.sforce.soap.enterprise.sobject.DataType getValueType() {
        return valueType;
    }


    /**
     * Sets the valueType value for this EntityParticle.
     * 
     * @param valueType
     */
    public void setValueType(com.sforce.soap.enterprise.sobject.DataType valueType) {
        this.valueType = valueType;
    }


    /**
     * Gets the valueTypeId value for this EntityParticle.
     * 
     * @return valueTypeId
     */
    public java.lang.String getValueTypeId() {
        return valueTypeId;
    }


    /**
     * Sets the valueTypeId value for this EntityParticle.
     * 
     * @param valueTypeId
     */
    public void setValueTypeId(java.lang.String valueTypeId) {
        this.valueTypeId = valueTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityParticle)) return false;
        EntityParticle other = (EntityParticle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.byteLength==null && other.getByteLength()==null) || 
             (this.byteLength!=null &&
              this.byteLength.equals(other.getByteLength()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.defaultValueFormula==null && other.getDefaultValueFormula()==null) || 
             (this.defaultValueFormula!=null &&
              this.defaultValueFormula.equals(other.getDefaultValueFormula()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.digits==null && other.getDigits()==null) || 
             (this.digits!=null &&
              this.digits.equals(other.getDigits()))) &&
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
            ((this.fieldDefinition==null && other.getFieldDefinition()==null) || 
             (this.fieldDefinition!=null &&
              this.fieldDefinition.equals(other.getFieldDefinition()))) &&
            ((this.fieldDefinitionId==null && other.getFieldDefinitionId()==null) || 
             (this.fieldDefinitionId!=null &&
              this.fieldDefinitionId.equals(other.getFieldDefinitionId()))) &&
            ((this.inlineHelpText==null && other.getInlineHelpText()==null) || 
             (this.inlineHelpText!=null &&
              this.inlineHelpText.equals(other.getInlineHelpText()))) &&
            ((this.isApiFilterable==null && other.getIsApiFilterable()==null) || 
             (this.isApiFilterable!=null &&
              this.isApiFilterable.equals(other.getIsApiFilterable()))) &&
            ((this.isApiGroupable==null && other.getIsApiGroupable()==null) || 
             (this.isApiGroupable!=null &&
              this.isApiGroupable.equals(other.getIsApiGroupable()))) &&
            ((this.isApiSortable==null && other.getIsApiSortable()==null) || 
             (this.isApiSortable!=null &&
              this.isApiSortable.equals(other.getIsApiSortable()))) &&
            ((this.isAutonumber==null && other.getIsAutonumber()==null) || 
             (this.isAutonumber!=null &&
              this.isAutonumber.equals(other.getIsAutonumber()))) &&
            ((this.isCalculated==null && other.getIsCalculated()==null) || 
             (this.isCalculated!=null &&
              this.isCalculated.equals(other.getIsCalculated()))) &&
            ((this.isCaseSensitive==null && other.getIsCaseSensitive()==null) || 
             (this.isCaseSensitive!=null &&
              this.isCaseSensitive.equals(other.getIsCaseSensitive()))) &&
            ((this.isCompactLayoutable==null && other.getIsCompactLayoutable()==null) || 
             (this.isCompactLayoutable!=null &&
              this.isCompactLayoutable.equals(other.getIsCompactLayoutable()))) &&
            ((this.isCreatable==null && other.getIsCreatable()==null) || 
             (this.isCreatable!=null &&
              this.isCreatable.equals(other.getIsCreatable()))) &&
            ((this.isDefaultedOnCreate==null && other.getIsDefaultedOnCreate()==null) || 
             (this.isDefaultedOnCreate!=null &&
              this.isDefaultedOnCreate.equals(other.getIsDefaultedOnCreate()))) &&
            ((this.isDependentPicklist==null && other.getIsDependentPicklist()==null) || 
             (this.isDependentPicklist!=null &&
              this.isDependentPicklist.equals(other.getIsDependentPicklist()))) &&
            ((this.isDeprecatedAndHidden==null && other.getIsDeprecatedAndHidden()==null) || 
             (this.isDeprecatedAndHidden!=null &&
              this.isDeprecatedAndHidden.equals(other.getIsDeprecatedAndHidden()))) &&
            ((this.isDisplayLocationInDecimal==null && other.getIsDisplayLocationInDecimal()==null) || 
             (this.isDisplayLocationInDecimal!=null &&
              this.isDisplayLocationInDecimal.equals(other.getIsDisplayLocationInDecimal()))) &&
            ((this.isEncrypted==null && other.getIsEncrypted()==null) || 
             (this.isEncrypted!=null &&
              this.isEncrypted.equals(other.getIsEncrypted()))) &&
            ((this.isFieldHistoryTracked==null && other.getIsFieldHistoryTracked()==null) || 
             (this.isFieldHistoryTracked!=null &&
              this.isFieldHistoryTracked.equals(other.getIsFieldHistoryTracked()))) &&
            ((this.isHighScaleNumber==null && other.getIsHighScaleNumber()==null) || 
             (this.isHighScaleNumber!=null &&
              this.isHighScaleNumber.equals(other.getIsHighScaleNumber()))) &&
            ((this.isHtmlFormatted==null && other.getIsHtmlFormatted()==null) || 
             (this.isHtmlFormatted!=null &&
              this.isHtmlFormatted.equals(other.getIsHtmlFormatted()))) &&
            ((this.isIdLookup==null && other.getIsIdLookup()==null) || 
             (this.isIdLookup!=null &&
              this.isIdLookup.equals(other.getIsIdLookup()))) &&
            ((this.isLayoutable==null && other.getIsLayoutable()==null) || 
             (this.isLayoutable!=null &&
              this.isLayoutable.equals(other.getIsLayoutable()))) &&
            ((this.isListVisible==null && other.getIsListVisible()==null) || 
             (this.isListVisible!=null &&
              this.isListVisible.equals(other.getIsListVisible()))) &&
            ((this.isNameField==null && other.getIsNameField()==null) || 
             (this.isNameField!=null &&
              this.isNameField.equals(other.getIsNameField()))) &&
            ((this.isNamePointing==null && other.getIsNamePointing()==null) || 
             (this.isNamePointing!=null &&
              this.isNamePointing.equals(other.getIsNamePointing()))) &&
            ((this.isNillable==null && other.getIsNillable()==null) || 
             (this.isNillable!=null &&
              this.isNillable.equals(other.getIsNillable()))) &&
            ((this.isPermissionable==null && other.getIsPermissionable()==null) || 
             (this.isPermissionable!=null &&
              this.isPermissionable.equals(other.getIsPermissionable()))) &&
            ((this.isUnique==null && other.getIsUnique()==null) || 
             (this.isUnique!=null &&
              this.isUnique.equals(other.getIsUnique()))) &&
            ((this.isUpdatable==null && other.getIsUpdatable()==null) || 
             (this.isUpdatable!=null &&
              this.isUpdatable.equals(other.getIsUpdatable()))) &&
            ((this.isWorkflowFilterable==null && other.getIsWorkflowFilterable()==null) || 
             (this.isWorkflowFilterable!=null &&
              this.isWorkflowFilterable.equals(other.getIsWorkflowFilterable()))) &&
            ((this.isWriteRequiresMasterRead==null && other.getIsWriteRequiresMasterRead()==null) || 
             (this.isWriteRequiresMasterRead!=null &&
              this.isWriteRequiresMasterRead.equals(other.getIsWriteRequiresMasterRead()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              this.mask.equals(other.getMask()))) &&
            ((this.maskType==null && other.getMaskType()==null) || 
             (this.maskType!=null &&
              this.maskType.equals(other.getMaskType()))) &&
            ((this.masterLabel==null && other.getMasterLabel()==null) || 
             (this.masterLabel!=null &&
              this.masterLabel.equals(other.getMasterLabel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.namespacePrefix==null && other.getNamespacePrefix()==null) || 
             (this.namespacePrefix!=null &&
              this.namespacePrefix.equals(other.getNamespacePrefix()))) &&
            ((this.picklistValues==null && other.getPicklistValues()==null) || 
             (this.picklistValues!=null &&
              this.picklistValues.equals(other.getPicklistValues()))) &&
            ((this.precision==null && other.getPrecision()==null) || 
             (this.precision!=null &&
              this.precision.equals(other.getPrecision()))) &&
            ((this.qualifiedApiName==null && other.getQualifiedApiName()==null) || 
             (this.qualifiedApiName!=null &&
              this.qualifiedApiName.equals(other.getQualifiedApiName()))) &&
            ((this.referenceTargetField==null && other.getReferenceTargetField()==null) || 
             (this.referenceTargetField!=null &&
              this.referenceTargetField.equals(other.getReferenceTargetField()))) &&
            ((this.referenceTo==null && other.getReferenceTo()==null) || 
             (this.referenceTo!=null &&
              java.util.Arrays.equals(this.referenceTo, other.getReferenceTo()))) &&
            ((this.relationshipName==null && other.getRelationshipName()==null) || 
             (this.relationshipName!=null &&
              this.relationshipName.equals(other.getRelationshipName()))) &&
            ((this.relationshipOrder==null && other.getRelationshipOrder()==null) || 
             (this.relationshipOrder!=null &&
              this.relationshipOrder.equals(other.getRelationshipOrder()))) &&
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
        if (getByteLength() != null) {
            _hashCode += getByteLength().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getDefaultValueFormula() != null) {
            _hashCode += getDefaultValueFormula().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getDigits() != null) {
            _hashCode += getDigits().hashCode();
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
        if (getFieldDefinition() != null) {
            _hashCode += getFieldDefinition().hashCode();
        }
        if (getFieldDefinitionId() != null) {
            _hashCode += getFieldDefinitionId().hashCode();
        }
        if (getInlineHelpText() != null) {
            _hashCode += getInlineHelpText().hashCode();
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
        if (getIsAutonumber() != null) {
            _hashCode += getIsAutonumber().hashCode();
        }
        if (getIsCalculated() != null) {
            _hashCode += getIsCalculated().hashCode();
        }
        if (getIsCaseSensitive() != null) {
            _hashCode += getIsCaseSensitive().hashCode();
        }
        if (getIsCompactLayoutable() != null) {
            _hashCode += getIsCompactLayoutable().hashCode();
        }
        if (getIsCreatable() != null) {
            _hashCode += getIsCreatable().hashCode();
        }
        if (getIsDefaultedOnCreate() != null) {
            _hashCode += getIsDefaultedOnCreate().hashCode();
        }
        if (getIsDependentPicklist() != null) {
            _hashCode += getIsDependentPicklist().hashCode();
        }
        if (getIsDeprecatedAndHidden() != null) {
            _hashCode += getIsDeprecatedAndHidden().hashCode();
        }
        if (getIsDisplayLocationInDecimal() != null) {
            _hashCode += getIsDisplayLocationInDecimal().hashCode();
        }
        if (getIsEncrypted() != null) {
            _hashCode += getIsEncrypted().hashCode();
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
        if (getIsIdLookup() != null) {
            _hashCode += getIsIdLookup().hashCode();
        }
        if (getIsLayoutable() != null) {
            _hashCode += getIsLayoutable().hashCode();
        }
        if (getIsListVisible() != null) {
            _hashCode += getIsListVisible().hashCode();
        }
        if (getIsNameField() != null) {
            _hashCode += getIsNameField().hashCode();
        }
        if (getIsNamePointing() != null) {
            _hashCode += getIsNamePointing().hashCode();
        }
        if (getIsNillable() != null) {
            _hashCode += getIsNillable().hashCode();
        }
        if (getIsPermissionable() != null) {
            _hashCode += getIsPermissionable().hashCode();
        }
        if (getIsUnique() != null) {
            _hashCode += getIsUnique().hashCode();
        }
        if (getIsUpdatable() != null) {
            _hashCode += getIsUpdatable().hashCode();
        }
        if (getIsWorkflowFilterable() != null) {
            _hashCode += getIsWorkflowFilterable().hashCode();
        }
        if (getIsWriteRequiresMasterRead() != null) {
            _hashCode += getIsWriteRequiresMasterRead().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getMask() != null) {
            _hashCode += getMask().hashCode();
        }
        if (getMaskType() != null) {
            _hashCode += getMaskType().hashCode();
        }
        if (getMasterLabel() != null) {
            _hashCode += getMasterLabel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamespacePrefix() != null) {
            _hashCode += getNamespacePrefix().hashCode();
        }
        if (getPicklistValues() != null) {
            _hashCode += getPicklistValues().hashCode();
        }
        if (getPrecision() != null) {
            _hashCode += getPrecision().hashCode();
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
        if (getRelationshipName() != null) {
            _hashCode += getRelationshipName().hashCode();
        }
        if (getRelationshipOrder() != null) {
            _hashCode += getRelationshipOrder().hashCode();
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
        new org.apache.axis.description.TypeDesc(EntityParticle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byteLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ByteLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("defaultValueFormula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultValueFormula"));
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
        elemField.setFieldName("digits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("fieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inlineHelpText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InlineHelpText"));
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
        elemField.setFieldName("isAutonumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsAutonumber"));
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
        elemField.setFieldName("isCaseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCaseSensitive"));
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
        elemField.setFieldName("isCreatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsCreatable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultedOnCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDefaultedOnCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDependentPicklist");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDependentPicklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeprecatedAndHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeprecatedAndHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDisplayLocationInDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDisplayLocationInDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEncrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEncrypted"));
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
        elemField.setFieldName("isIdLookup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsIdLookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLayoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsLayoutable"));
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
        elemField.setFieldName("isNamePointing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsNamePointing"));
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
        elemField.setFieldName("isPermissionable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsPermissionable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUnique");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUnique"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpdatable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsUpdatable"));
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
        elemField.setFieldName("isWriteRequiresMasterRead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsWriteRequiresMasterRead"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("picklistValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PicklistValues"));
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
        elemField.setFieldName("relationshipName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
