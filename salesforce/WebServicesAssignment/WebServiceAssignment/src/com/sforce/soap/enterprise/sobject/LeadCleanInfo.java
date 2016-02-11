/**
 * LeadCleanInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class LeadCleanInfo  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.Address address;

    private java.lang.Double annualRevenue;

    private java.lang.String city;

    private java.lang.Boolean cleanedByJob;

    private java.lang.Boolean cleanedByUser;

    private java.lang.String companyDunsNumber;

    private java.lang.String companyName;

    private java.lang.String contactStatusDataDotCom;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String dandBCompanyDunsNumber;

    private java.lang.String dataDotComCompanyId;

    private java.lang.String dataDotComId;

    private java.lang.String email;

    private java.lang.String firstName;

    private java.lang.String geocodeAccuracy;

    private java.lang.String industry;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isDifferentAnnualRevenue;

    private java.lang.Boolean isDifferentCity;

    private java.lang.Boolean isDifferentCompanyDunsNumber;

    private java.lang.Boolean isDifferentCompanyName;

    private java.lang.Boolean isDifferentCountry;

    private java.lang.Boolean isDifferentCountryCode;

    private java.lang.Boolean isDifferentDandBCompanyDunsNumber;

    private java.lang.Boolean isDifferentEmail;

    private java.lang.Boolean isDifferentFirstName;

    private java.lang.Boolean isDifferentIndustry;

    private java.lang.Boolean isDifferentLastName;

    private java.lang.Boolean isDifferentNumberOfEmployees;

    private java.lang.Boolean isDifferentPhone;

    private java.lang.Boolean isDifferentPostalCode;

    private java.lang.Boolean isDifferentState;

    private java.lang.Boolean isDifferentStateCode;

    private java.lang.Boolean isDifferentStreet;

    private java.lang.Boolean isDifferentTitle;

    private java.lang.Boolean isFlaggedWrongAddress;

    private java.lang.Boolean isFlaggedWrongAnnualRevenue;

    private java.lang.Boolean isFlaggedWrongCompanyDunsNumber;

    private java.lang.Boolean isFlaggedWrongCompanyName;

    private java.lang.Boolean isFlaggedWrongEmail;

    private java.lang.Boolean isFlaggedWrongIndustry;

    private java.lang.Boolean isFlaggedWrongName;

    private java.lang.Boolean isFlaggedWrongNumberOfEmployees;

    private java.lang.Boolean isFlaggedWrongPhone;

    private java.lang.Boolean isFlaggedWrongTitle;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean isReviewedAddress;

    private java.lang.Boolean isReviewedAnnualRevenue;

    private java.lang.Boolean isReviewedCompanyDunsNumber;

    private java.lang.Boolean isReviewedCompanyName;

    private java.lang.Boolean isReviewedDandBCompanyDunsNumber;

    private java.lang.Boolean isReviewedEmail;

    private java.lang.Boolean isReviewedIndustry;

    private java.lang.Boolean isReviewedName;

    private java.lang.Boolean isReviewedNumberOfEmployees;

    private java.lang.Boolean isReviewedPhone;

    private java.lang.Boolean isReviewedTitle;

    private java.util.Calendar lastMatchedDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private com.sforce.soap.enterprise.sobject.User lastStatusChangedBy;

    private java.lang.String lastStatusChangedById;

    private java.util.Calendar lastStatusChangedDate;

    private java.lang.Double latitude;

    private com.sforce.soap.enterprise.sobject.Lead lead;

    private java.lang.String leadId;

    private java.lang.Double longitude;

    private java.lang.String name;

    private java.lang.Integer numberOfEmployees;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private java.lang.String state;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    public LeadCleanInfo() {
    }

    public LeadCleanInfo(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.Address address,
           java.lang.Double annualRevenue,
           java.lang.String city,
           java.lang.Boolean cleanedByJob,
           java.lang.Boolean cleanedByUser,
           java.lang.String companyDunsNumber,
           java.lang.String companyName,
           java.lang.String contactStatusDataDotCom,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String dandBCompanyDunsNumber,
           java.lang.String dataDotComCompanyId,
           java.lang.String dataDotComId,
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String geocodeAccuracy,
           java.lang.String industry,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isDifferentAnnualRevenue,
           java.lang.Boolean isDifferentCity,
           java.lang.Boolean isDifferentCompanyDunsNumber,
           java.lang.Boolean isDifferentCompanyName,
           java.lang.Boolean isDifferentCountry,
           java.lang.Boolean isDifferentCountryCode,
           java.lang.Boolean isDifferentDandBCompanyDunsNumber,
           java.lang.Boolean isDifferentEmail,
           java.lang.Boolean isDifferentFirstName,
           java.lang.Boolean isDifferentIndustry,
           java.lang.Boolean isDifferentLastName,
           java.lang.Boolean isDifferentNumberOfEmployees,
           java.lang.Boolean isDifferentPhone,
           java.lang.Boolean isDifferentPostalCode,
           java.lang.Boolean isDifferentState,
           java.lang.Boolean isDifferentStateCode,
           java.lang.Boolean isDifferentStreet,
           java.lang.Boolean isDifferentTitle,
           java.lang.Boolean isFlaggedWrongAddress,
           java.lang.Boolean isFlaggedWrongAnnualRevenue,
           java.lang.Boolean isFlaggedWrongCompanyDunsNumber,
           java.lang.Boolean isFlaggedWrongCompanyName,
           java.lang.Boolean isFlaggedWrongEmail,
           java.lang.Boolean isFlaggedWrongIndustry,
           java.lang.Boolean isFlaggedWrongName,
           java.lang.Boolean isFlaggedWrongNumberOfEmployees,
           java.lang.Boolean isFlaggedWrongPhone,
           java.lang.Boolean isFlaggedWrongTitle,
           java.lang.Boolean isInactive,
           java.lang.Boolean isReviewedAddress,
           java.lang.Boolean isReviewedAnnualRevenue,
           java.lang.Boolean isReviewedCompanyDunsNumber,
           java.lang.Boolean isReviewedCompanyName,
           java.lang.Boolean isReviewedDandBCompanyDunsNumber,
           java.lang.Boolean isReviewedEmail,
           java.lang.Boolean isReviewedIndustry,
           java.lang.Boolean isReviewedName,
           java.lang.Boolean isReviewedNumberOfEmployees,
           java.lang.Boolean isReviewedPhone,
           java.lang.Boolean isReviewedTitle,
           java.util.Calendar lastMatchedDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           com.sforce.soap.enterprise.sobject.User lastStatusChangedBy,
           java.lang.String lastStatusChangedById,
           java.util.Calendar lastStatusChangedDate,
           java.lang.Double latitude,
           com.sforce.soap.enterprise.sobject.Lead lead,
           java.lang.String leadId,
           java.lang.Double longitude,
           java.lang.String name,
           java.lang.Integer numberOfEmployees,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.String state,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        super(
            fieldsToNull,
            id);
        this.address = address;
        this.annualRevenue = annualRevenue;
        this.city = city;
        this.cleanedByJob = cleanedByJob;
        this.cleanedByUser = cleanedByUser;
        this.companyDunsNumber = companyDunsNumber;
        this.companyName = companyName;
        this.contactStatusDataDotCom = contactStatusDataDotCom;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dandBCompanyDunsNumber = dandBCompanyDunsNumber;
        this.dataDotComCompanyId = dataDotComCompanyId;
        this.dataDotComId = dataDotComId;
        this.email = email;
        this.firstName = firstName;
        this.geocodeAccuracy = geocodeAccuracy;
        this.industry = industry;
        this.isDeleted = isDeleted;
        this.isDifferentAnnualRevenue = isDifferentAnnualRevenue;
        this.isDifferentCity = isDifferentCity;
        this.isDifferentCompanyDunsNumber = isDifferentCompanyDunsNumber;
        this.isDifferentCompanyName = isDifferentCompanyName;
        this.isDifferentCountry = isDifferentCountry;
        this.isDifferentCountryCode = isDifferentCountryCode;
        this.isDifferentDandBCompanyDunsNumber = isDifferentDandBCompanyDunsNumber;
        this.isDifferentEmail = isDifferentEmail;
        this.isDifferentFirstName = isDifferentFirstName;
        this.isDifferentIndustry = isDifferentIndustry;
        this.isDifferentLastName = isDifferentLastName;
        this.isDifferentNumberOfEmployees = isDifferentNumberOfEmployees;
        this.isDifferentPhone = isDifferentPhone;
        this.isDifferentPostalCode = isDifferentPostalCode;
        this.isDifferentState = isDifferentState;
        this.isDifferentStateCode = isDifferentStateCode;
        this.isDifferentStreet = isDifferentStreet;
        this.isDifferentTitle = isDifferentTitle;
        this.isFlaggedWrongAddress = isFlaggedWrongAddress;
        this.isFlaggedWrongAnnualRevenue = isFlaggedWrongAnnualRevenue;
        this.isFlaggedWrongCompanyDunsNumber = isFlaggedWrongCompanyDunsNumber;
        this.isFlaggedWrongCompanyName = isFlaggedWrongCompanyName;
        this.isFlaggedWrongEmail = isFlaggedWrongEmail;
        this.isFlaggedWrongIndustry = isFlaggedWrongIndustry;
        this.isFlaggedWrongName = isFlaggedWrongName;
        this.isFlaggedWrongNumberOfEmployees = isFlaggedWrongNumberOfEmployees;
        this.isFlaggedWrongPhone = isFlaggedWrongPhone;
        this.isFlaggedWrongTitle = isFlaggedWrongTitle;
        this.isInactive = isInactive;
        this.isReviewedAddress = isReviewedAddress;
        this.isReviewedAnnualRevenue = isReviewedAnnualRevenue;
        this.isReviewedCompanyDunsNumber = isReviewedCompanyDunsNumber;
        this.isReviewedCompanyName = isReviewedCompanyName;
        this.isReviewedDandBCompanyDunsNumber = isReviewedDandBCompanyDunsNumber;
        this.isReviewedEmail = isReviewedEmail;
        this.isReviewedIndustry = isReviewedIndustry;
        this.isReviewedName = isReviewedName;
        this.isReviewedNumberOfEmployees = isReviewedNumberOfEmployees;
        this.isReviewedPhone = isReviewedPhone;
        this.isReviewedTitle = isReviewedTitle;
        this.lastMatchedDate = lastMatchedDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastStatusChangedBy = lastStatusChangedBy;
        this.lastStatusChangedById = lastStatusChangedById;
        this.lastStatusChangedDate = lastStatusChangedDate;
        this.latitude = latitude;
        this.lead = lead;
        this.leadId = leadId;
        this.longitude = longitude;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.phone = phone;
        this.postalCode = postalCode;
        this.state = state;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the address value for this LeadCleanInfo.
     * 
     * @return address
     */
    public com.sforce.soap.enterprise.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this LeadCleanInfo.
     * 
     * @param address
     */
    public void setAddress(com.sforce.soap.enterprise.Address address) {
        this.address = address;
    }


    /**
     * Gets the annualRevenue value for this LeadCleanInfo.
     * 
     * @return annualRevenue
     */
    public java.lang.Double getAnnualRevenue() {
        return annualRevenue;
    }


    /**
     * Sets the annualRevenue value for this LeadCleanInfo.
     * 
     * @param annualRevenue
     */
    public void setAnnualRevenue(java.lang.Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }


    /**
     * Gets the city value for this LeadCleanInfo.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LeadCleanInfo.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the cleanedByJob value for this LeadCleanInfo.
     * 
     * @return cleanedByJob
     */
    public java.lang.Boolean getCleanedByJob() {
        return cleanedByJob;
    }


    /**
     * Sets the cleanedByJob value for this LeadCleanInfo.
     * 
     * @param cleanedByJob
     */
    public void setCleanedByJob(java.lang.Boolean cleanedByJob) {
        this.cleanedByJob = cleanedByJob;
    }


    /**
     * Gets the cleanedByUser value for this LeadCleanInfo.
     * 
     * @return cleanedByUser
     */
    public java.lang.Boolean getCleanedByUser() {
        return cleanedByUser;
    }


    /**
     * Sets the cleanedByUser value for this LeadCleanInfo.
     * 
     * @param cleanedByUser
     */
    public void setCleanedByUser(java.lang.Boolean cleanedByUser) {
        this.cleanedByUser = cleanedByUser;
    }


    /**
     * Gets the companyDunsNumber value for this LeadCleanInfo.
     * 
     * @return companyDunsNumber
     */
    public java.lang.String getCompanyDunsNumber() {
        return companyDunsNumber;
    }


    /**
     * Sets the companyDunsNumber value for this LeadCleanInfo.
     * 
     * @param companyDunsNumber
     */
    public void setCompanyDunsNumber(java.lang.String companyDunsNumber) {
        this.companyDunsNumber = companyDunsNumber;
    }


    /**
     * Gets the companyName value for this LeadCleanInfo.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this LeadCleanInfo.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the contactStatusDataDotCom value for this LeadCleanInfo.
     * 
     * @return contactStatusDataDotCom
     */
    public java.lang.String getContactStatusDataDotCom() {
        return contactStatusDataDotCom;
    }


    /**
     * Sets the contactStatusDataDotCom value for this LeadCleanInfo.
     * 
     * @param contactStatusDataDotCom
     */
    public void setContactStatusDataDotCom(java.lang.String contactStatusDataDotCom) {
        this.contactStatusDataDotCom = contactStatusDataDotCom;
    }


    /**
     * Gets the country value for this LeadCleanInfo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LeadCleanInfo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this LeadCleanInfo.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this LeadCleanInfo.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this LeadCleanInfo.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this LeadCleanInfo.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this LeadCleanInfo.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this LeadCleanInfo.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return dandBCompanyDunsNumber
     */
    public java.lang.String getDandBCompanyDunsNumber() {
        return dandBCompanyDunsNumber;
    }


    /**
     * Sets the dandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param dandBCompanyDunsNumber
     */
    public void setDandBCompanyDunsNumber(java.lang.String dandBCompanyDunsNumber) {
        this.dandBCompanyDunsNumber = dandBCompanyDunsNumber;
    }


    /**
     * Gets the dataDotComCompanyId value for this LeadCleanInfo.
     * 
     * @return dataDotComCompanyId
     */
    public java.lang.String getDataDotComCompanyId() {
        return dataDotComCompanyId;
    }


    /**
     * Sets the dataDotComCompanyId value for this LeadCleanInfo.
     * 
     * @param dataDotComCompanyId
     */
    public void setDataDotComCompanyId(java.lang.String dataDotComCompanyId) {
        this.dataDotComCompanyId = dataDotComCompanyId;
    }


    /**
     * Gets the dataDotComId value for this LeadCleanInfo.
     * 
     * @return dataDotComId
     */
    public java.lang.String getDataDotComId() {
        return dataDotComId;
    }


    /**
     * Sets the dataDotComId value for this LeadCleanInfo.
     * 
     * @param dataDotComId
     */
    public void setDataDotComId(java.lang.String dataDotComId) {
        this.dataDotComId = dataDotComId;
    }


    /**
     * Gets the email value for this LeadCleanInfo.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this LeadCleanInfo.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstName value for this LeadCleanInfo.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this LeadCleanInfo.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the geocodeAccuracy value for this LeadCleanInfo.
     * 
     * @return geocodeAccuracy
     */
    public java.lang.String getGeocodeAccuracy() {
        return geocodeAccuracy;
    }


    /**
     * Sets the geocodeAccuracy value for this LeadCleanInfo.
     * 
     * @param geocodeAccuracy
     */
    public void setGeocodeAccuracy(java.lang.String geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }


    /**
     * Gets the industry value for this LeadCleanInfo.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this LeadCleanInfo.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the isDeleted value for this LeadCleanInfo.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this LeadCleanInfo.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isDifferentAnnualRevenue value for this LeadCleanInfo.
     * 
     * @return isDifferentAnnualRevenue
     */
    public java.lang.Boolean getIsDifferentAnnualRevenue() {
        return isDifferentAnnualRevenue;
    }


    /**
     * Sets the isDifferentAnnualRevenue value for this LeadCleanInfo.
     * 
     * @param isDifferentAnnualRevenue
     */
    public void setIsDifferentAnnualRevenue(java.lang.Boolean isDifferentAnnualRevenue) {
        this.isDifferentAnnualRevenue = isDifferentAnnualRevenue;
    }


    /**
     * Gets the isDifferentCity value for this LeadCleanInfo.
     * 
     * @return isDifferentCity
     */
    public java.lang.Boolean getIsDifferentCity() {
        return isDifferentCity;
    }


    /**
     * Sets the isDifferentCity value for this LeadCleanInfo.
     * 
     * @param isDifferentCity
     */
    public void setIsDifferentCity(java.lang.Boolean isDifferentCity) {
        this.isDifferentCity = isDifferentCity;
    }


    /**
     * Gets the isDifferentCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return isDifferentCompanyDunsNumber
     */
    public java.lang.Boolean getIsDifferentCompanyDunsNumber() {
        return isDifferentCompanyDunsNumber;
    }


    /**
     * Sets the isDifferentCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param isDifferentCompanyDunsNumber
     */
    public void setIsDifferentCompanyDunsNumber(java.lang.Boolean isDifferentCompanyDunsNumber) {
        this.isDifferentCompanyDunsNumber = isDifferentCompanyDunsNumber;
    }


    /**
     * Gets the isDifferentCompanyName value for this LeadCleanInfo.
     * 
     * @return isDifferentCompanyName
     */
    public java.lang.Boolean getIsDifferentCompanyName() {
        return isDifferentCompanyName;
    }


    /**
     * Sets the isDifferentCompanyName value for this LeadCleanInfo.
     * 
     * @param isDifferentCompanyName
     */
    public void setIsDifferentCompanyName(java.lang.Boolean isDifferentCompanyName) {
        this.isDifferentCompanyName = isDifferentCompanyName;
    }


    /**
     * Gets the isDifferentCountry value for this LeadCleanInfo.
     * 
     * @return isDifferentCountry
     */
    public java.lang.Boolean getIsDifferentCountry() {
        return isDifferentCountry;
    }


    /**
     * Sets the isDifferentCountry value for this LeadCleanInfo.
     * 
     * @param isDifferentCountry
     */
    public void setIsDifferentCountry(java.lang.Boolean isDifferentCountry) {
        this.isDifferentCountry = isDifferentCountry;
    }


    /**
     * Gets the isDifferentCountryCode value for this LeadCleanInfo.
     * 
     * @return isDifferentCountryCode
     */
    public java.lang.Boolean getIsDifferentCountryCode() {
        return isDifferentCountryCode;
    }


    /**
     * Sets the isDifferentCountryCode value for this LeadCleanInfo.
     * 
     * @param isDifferentCountryCode
     */
    public void setIsDifferentCountryCode(java.lang.Boolean isDifferentCountryCode) {
        this.isDifferentCountryCode = isDifferentCountryCode;
    }


    /**
     * Gets the isDifferentDandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return isDifferentDandBCompanyDunsNumber
     */
    public java.lang.Boolean getIsDifferentDandBCompanyDunsNumber() {
        return isDifferentDandBCompanyDunsNumber;
    }


    /**
     * Sets the isDifferentDandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param isDifferentDandBCompanyDunsNumber
     */
    public void setIsDifferentDandBCompanyDunsNumber(java.lang.Boolean isDifferentDandBCompanyDunsNumber) {
        this.isDifferentDandBCompanyDunsNumber = isDifferentDandBCompanyDunsNumber;
    }


    /**
     * Gets the isDifferentEmail value for this LeadCleanInfo.
     * 
     * @return isDifferentEmail
     */
    public java.lang.Boolean getIsDifferentEmail() {
        return isDifferentEmail;
    }


    /**
     * Sets the isDifferentEmail value for this LeadCleanInfo.
     * 
     * @param isDifferentEmail
     */
    public void setIsDifferentEmail(java.lang.Boolean isDifferentEmail) {
        this.isDifferentEmail = isDifferentEmail;
    }


    /**
     * Gets the isDifferentFirstName value for this LeadCleanInfo.
     * 
     * @return isDifferentFirstName
     */
    public java.lang.Boolean getIsDifferentFirstName() {
        return isDifferentFirstName;
    }


    /**
     * Sets the isDifferentFirstName value for this LeadCleanInfo.
     * 
     * @param isDifferentFirstName
     */
    public void setIsDifferentFirstName(java.lang.Boolean isDifferentFirstName) {
        this.isDifferentFirstName = isDifferentFirstName;
    }


    /**
     * Gets the isDifferentIndustry value for this LeadCleanInfo.
     * 
     * @return isDifferentIndustry
     */
    public java.lang.Boolean getIsDifferentIndustry() {
        return isDifferentIndustry;
    }


    /**
     * Sets the isDifferentIndustry value for this LeadCleanInfo.
     * 
     * @param isDifferentIndustry
     */
    public void setIsDifferentIndustry(java.lang.Boolean isDifferentIndustry) {
        this.isDifferentIndustry = isDifferentIndustry;
    }


    /**
     * Gets the isDifferentLastName value for this LeadCleanInfo.
     * 
     * @return isDifferentLastName
     */
    public java.lang.Boolean getIsDifferentLastName() {
        return isDifferentLastName;
    }


    /**
     * Sets the isDifferentLastName value for this LeadCleanInfo.
     * 
     * @param isDifferentLastName
     */
    public void setIsDifferentLastName(java.lang.Boolean isDifferentLastName) {
        this.isDifferentLastName = isDifferentLastName;
    }


    /**
     * Gets the isDifferentNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @return isDifferentNumberOfEmployees
     */
    public java.lang.Boolean getIsDifferentNumberOfEmployees() {
        return isDifferentNumberOfEmployees;
    }


    /**
     * Sets the isDifferentNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @param isDifferentNumberOfEmployees
     */
    public void setIsDifferentNumberOfEmployees(java.lang.Boolean isDifferentNumberOfEmployees) {
        this.isDifferentNumberOfEmployees = isDifferentNumberOfEmployees;
    }


    /**
     * Gets the isDifferentPhone value for this LeadCleanInfo.
     * 
     * @return isDifferentPhone
     */
    public java.lang.Boolean getIsDifferentPhone() {
        return isDifferentPhone;
    }


    /**
     * Sets the isDifferentPhone value for this LeadCleanInfo.
     * 
     * @param isDifferentPhone
     */
    public void setIsDifferentPhone(java.lang.Boolean isDifferentPhone) {
        this.isDifferentPhone = isDifferentPhone;
    }


    /**
     * Gets the isDifferentPostalCode value for this LeadCleanInfo.
     * 
     * @return isDifferentPostalCode
     */
    public java.lang.Boolean getIsDifferentPostalCode() {
        return isDifferentPostalCode;
    }


    /**
     * Sets the isDifferentPostalCode value for this LeadCleanInfo.
     * 
     * @param isDifferentPostalCode
     */
    public void setIsDifferentPostalCode(java.lang.Boolean isDifferentPostalCode) {
        this.isDifferentPostalCode = isDifferentPostalCode;
    }


    /**
     * Gets the isDifferentState value for this LeadCleanInfo.
     * 
     * @return isDifferentState
     */
    public java.lang.Boolean getIsDifferentState() {
        return isDifferentState;
    }


    /**
     * Sets the isDifferentState value for this LeadCleanInfo.
     * 
     * @param isDifferentState
     */
    public void setIsDifferentState(java.lang.Boolean isDifferentState) {
        this.isDifferentState = isDifferentState;
    }


    /**
     * Gets the isDifferentStateCode value for this LeadCleanInfo.
     * 
     * @return isDifferentStateCode
     */
    public java.lang.Boolean getIsDifferentStateCode() {
        return isDifferentStateCode;
    }


    /**
     * Sets the isDifferentStateCode value for this LeadCleanInfo.
     * 
     * @param isDifferentStateCode
     */
    public void setIsDifferentStateCode(java.lang.Boolean isDifferentStateCode) {
        this.isDifferentStateCode = isDifferentStateCode;
    }


    /**
     * Gets the isDifferentStreet value for this LeadCleanInfo.
     * 
     * @return isDifferentStreet
     */
    public java.lang.Boolean getIsDifferentStreet() {
        return isDifferentStreet;
    }


    /**
     * Sets the isDifferentStreet value for this LeadCleanInfo.
     * 
     * @param isDifferentStreet
     */
    public void setIsDifferentStreet(java.lang.Boolean isDifferentStreet) {
        this.isDifferentStreet = isDifferentStreet;
    }


    /**
     * Gets the isDifferentTitle value for this LeadCleanInfo.
     * 
     * @return isDifferentTitle
     */
    public java.lang.Boolean getIsDifferentTitle() {
        return isDifferentTitle;
    }


    /**
     * Sets the isDifferentTitle value for this LeadCleanInfo.
     * 
     * @param isDifferentTitle
     */
    public void setIsDifferentTitle(java.lang.Boolean isDifferentTitle) {
        this.isDifferentTitle = isDifferentTitle;
    }


    /**
     * Gets the isFlaggedWrongAddress value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongAddress
     */
    public java.lang.Boolean getIsFlaggedWrongAddress() {
        return isFlaggedWrongAddress;
    }


    /**
     * Sets the isFlaggedWrongAddress value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongAddress
     */
    public void setIsFlaggedWrongAddress(java.lang.Boolean isFlaggedWrongAddress) {
        this.isFlaggedWrongAddress = isFlaggedWrongAddress;
    }


    /**
     * Gets the isFlaggedWrongAnnualRevenue value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongAnnualRevenue
     */
    public java.lang.Boolean getIsFlaggedWrongAnnualRevenue() {
        return isFlaggedWrongAnnualRevenue;
    }


    /**
     * Sets the isFlaggedWrongAnnualRevenue value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongAnnualRevenue
     */
    public void setIsFlaggedWrongAnnualRevenue(java.lang.Boolean isFlaggedWrongAnnualRevenue) {
        this.isFlaggedWrongAnnualRevenue = isFlaggedWrongAnnualRevenue;
    }


    /**
     * Gets the isFlaggedWrongCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongCompanyDunsNumber
     */
    public java.lang.Boolean getIsFlaggedWrongCompanyDunsNumber() {
        return isFlaggedWrongCompanyDunsNumber;
    }


    /**
     * Sets the isFlaggedWrongCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongCompanyDunsNumber
     */
    public void setIsFlaggedWrongCompanyDunsNumber(java.lang.Boolean isFlaggedWrongCompanyDunsNumber) {
        this.isFlaggedWrongCompanyDunsNumber = isFlaggedWrongCompanyDunsNumber;
    }


    /**
     * Gets the isFlaggedWrongCompanyName value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongCompanyName
     */
    public java.lang.Boolean getIsFlaggedWrongCompanyName() {
        return isFlaggedWrongCompanyName;
    }


    /**
     * Sets the isFlaggedWrongCompanyName value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongCompanyName
     */
    public void setIsFlaggedWrongCompanyName(java.lang.Boolean isFlaggedWrongCompanyName) {
        this.isFlaggedWrongCompanyName = isFlaggedWrongCompanyName;
    }


    /**
     * Gets the isFlaggedWrongEmail value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongEmail
     */
    public java.lang.Boolean getIsFlaggedWrongEmail() {
        return isFlaggedWrongEmail;
    }


    /**
     * Sets the isFlaggedWrongEmail value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongEmail
     */
    public void setIsFlaggedWrongEmail(java.lang.Boolean isFlaggedWrongEmail) {
        this.isFlaggedWrongEmail = isFlaggedWrongEmail;
    }


    /**
     * Gets the isFlaggedWrongIndustry value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongIndustry
     */
    public java.lang.Boolean getIsFlaggedWrongIndustry() {
        return isFlaggedWrongIndustry;
    }


    /**
     * Sets the isFlaggedWrongIndustry value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongIndustry
     */
    public void setIsFlaggedWrongIndustry(java.lang.Boolean isFlaggedWrongIndustry) {
        this.isFlaggedWrongIndustry = isFlaggedWrongIndustry;
    }


    /**
     * Gets the isFlaggedWrongName value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongName
     */
    public java.lang.Boolean getIsFlaggedWrongName() {
        return isFlaggedWrongName;
    }


    /**
     * Sets the isFlaggedWrongName value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongName
     */
    public void setIsFlaggedWrongName(java.lang.Boolean isFlaggedWrongName) {
        this.isFlaggedWrongName = isFlaggedWrongName;
    }


    /**
     * Gets the isFlaggedWrongNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongNumberOfEmployees
     */
    public java.lang.Boolean getIsFlaggedWrongNumberOfEmployees() {
        return isFlaggedWrongNumberOfEmployees;
    }


    /**
     * Sets the isFlaggedWrongNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongNumberOfEmployees
     */
    public void setIsFlaggedWrongNumberOfEmployees(java.lang.Boolean isFlaggedWrongNumberOfEmployees) {
        this.isFlaggedWrongNumberOfEmployees = isFlaggedWrongNumberOfEmployees;
    }


    /**
     * Gets the isFlaggedWrongPhone value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongPhone
     */
    public java.lang.Boolean getIsFlaggedWrongPhone() {
        return isFlaggedWrongPhone;
    }


    /**
     * Sets the isFlaggedWrongPhone value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongPhone
     */
    public void setIsFlaggedWrongPhone(java.lang.Boolean isFlaggedWrongPhone) {
        this.isFlaggedWrongPhone = isFlaggedWrongPhone;
    }


    /**
     * Gets the isFlaggedWrongTitle value for this LeadCleanInfo.
     * 
     * @return isFlaggedWrongTitle
     */
    public java.lang.Boolean getIsFlaggedWrongTitle() {
        return isFlaggedWrongTitle;
    }


    /**
     * Sets the isFlaggedWrongTitle value for this LeadCleanInfo.
     * 
     * @param isFlaggedWrongTitle
     */
    public void setIsFlaggedWrongTitle(java.lang.Boolean isFlaggedWrongTitle) {
        this.isFlaggedWrongTitle = isFlaggedWrongTitle;
    }


    /**
     * Gets the isInactive value for this LeadCleanInfo.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this LeadCleanInfo.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isReviewedAddress value for this LeadCleanInfo.
     * 
     * @return isReviewedAddress
     */
    public java.lang.Boolean getIsReviewedAddress() {
        return isReviewedAddress;
    }


    /**
     * Sets the isReviewedAddress value for this LeadCleanInfo.
     * 
     * @param isReviewedAddress
     */
    public void setIsReviewedAddress(java.lang.Boolean isReviewedAddress) {
        this.isReviewedAddress = isReviewedAddress;
    }


    /**
     * Gets the isReviewedAnnualRevenue value for this LeadCleanInfo.
     * 
     * @return isReviewedAnnualRevenue
     */
    public java.lang.Boolean getIsReviewedAnnualRevenue() {
        return isReviewedAnnualRevenue;
    }


    /**
     * Sets the isReviewedAnnualRevenue value for this LeadCleanInfo.
     * 
     * @param isReviewedAnnualRevenue
     */
    public void setIsReviewedAnnualRevenue(java.lang.Boolean isReviewedAnnualRevenue) {
        this.isReviewedAnnualRevenue = isReviewedAnnualRevenue;
    }


    /**
     * Gets the isReviewedCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return isReviewedCompanyDunsNumber
     */
    public java.lang.Boolean getIsReviewedCompanyDunsNumber() {
        return isReviewedCompanyDunsNumber;
    }


    /**
     * Sets the isReviewedCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param isReviewedCompanyDunsNumber
     */
    public void setIsReviewedCompanyDunsNumber(java.lang.Boolean isReviewedCompanyDunsNumber) {
        this.isReviewedCompanyDunsNumber = isReviewedCompanyDunsNumber;
    }


    /**
     * Gets the isReviewedCompanyName value for this LeadCleanInfo.
     * 
     * @return isReviewedCompanyName
     */
    public java.lang.Boolean getIsReviewedCompanyName() {
        return isReviewedCompanyName;
    }


    /**
     * Sets the isReviewedCompanyName value for this LeadCleanInfo.
     * 
     * @param isReviewedCompanyName
     */
    public void setIsReviewedCompanyName(java.lang.Boolean isReviewedCompanyName) {
        this.isReviewedCompanyName = isReviewedCompanyName;
    }


    /**
     * Gets the isReviewedDandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @return isReviewedDandBCompanyDunsNumber
     */
    public java.lang.Boolean getIsReviewedDandBCompanyDunsNumber() {
        return isReviewedDandBCompanyDunsNumber;
    }


    /**
     * Sets the isReviewedDandBCompanyDunsNumber value for this LeadCleanInfo.
     * 
     * @param isReviewedDandBCompanyDunsNumber
     */
    public void setIsReviewedDandBCompanyDunsNumber(java.lang.Boolean isReviewedDandBCompanyDunsNumber) {
        this.isReviewedDandBCompanyDunsNumber = isReviewedDandBCompanyDunsNumber;
    }


    /**
     * Gets the isReviewedEmail value for this LeadCleanInfo.
     * 
     * @return isReviewedEmail
     */
    public java.lang.Boolean getIsReviewedEmail() {
        return isReviewedEmail;
    }


    /**
     * Sets the isReviewedEmail value for this LeadCleanInfo.
     * 
     * @param isReviewedEmail
     */
    public void setIsReviewedEmail(java.lang.Boolean isReviewedEmail) {
        this.isReviewedEmail = isReviewedEmail;
    }


    /**
     * Gets the isReviewedIndustry value for this LeadCleanInfo.
     * 
     * @return isReviewedIndustry
     */
    public java.lang.Boolean getIsReviewedIndustry() {
        return isReviewedIndustry;
    }


    /**
     * Sets the isReviewedIndustry value for this LeadCleanInfo.
     * 
     * @param isReviewedIndustry
     */
    public void setIsReviewedIndustry(java.lang.Boolean isReviewedIndustry) {
        this.isReviewedIndustry = isReviewedIndustry;
    }


    /**
     * Gets the isReviewedName value for this LeadCleanInfo.
     * 
     * @return isReviewedName
     */
    public java.lang.Boolean getIsReviewedName() {
        return isReviewedName;
    }


    /**
     * Sets the isReviewedName value for this LeadCleanInfo.
     * 
     * @param isReviewedName
     */
    public void setIsReviewedName(java.lang.Boolean isReviewedName) {
        this.isReviewedName = isReviewedName;
    }


    /**
     * Gets the isReviewedNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @return isReviewedNumberOfEmployees
     */
    public java.lang.Boolean getIsReviewedNumberOfEmployees() {
        return isReviewedNumberOfEmployees;
    }


    /**
     * Sets the isReviewedNumberOfEmployees value for this LeadCleanInfo.
     * 
     * @param isReviewedNumberOfEmployees
     */
    public void setIsReviewedNumberOfEmployees(java.lang.Boolean isReviewedNumberOfEmployees) {
        this.isReviewedNumberOfEmployees = isReviewedNumberOfEmployees;
    }


    /**
     * Gets the isReviewedPhone value for this LeadCleanInfo.
     * 
     * @return isReviewedPhone
     */
    public java.lang.Boolean getIsReviewedPhone() {
        return isReviewedPhone;
    }


    /**
     * Sets the isReviewedPhone value for this LeadCleanInfo.
     * 
     * @param isReviewedPhone
     */
    public void setIsReviewedPhone(java.lang.Boolean isReviewedPhone) {
        this.isReviewedPhone = isReviewedPhone;
    }


    /**
     * Gets the isReviewedTitle value for this LeadCleanInfo.
     * 
     * @return isReviewedTitle
     */
    public java.lang.Boolean getIsReviewedTitle() {
        return isReviewedTitle;
    }


    /**
     * Sets the isReviewedTitle value for this LeadCleanInfo.
     * 
     * @param isReviewedTitle
     */
    public void setIsReviewedTitle(java.lang.Boolean isReviewedTitle) {
        this.isReviewedTitle = isReviewedTitle;
    }


    /**
     * Gets the lastMatchedDate value for this LeadCleanInfo.
     * 
     * @return lastMatchedDate
     */
    public java.util.Calendar getLastMatchedDate() {
        return lastMatchedDate;
    }


    /**
     * Sets the lastMatchedDate value for this LeadCleanInfo.
     * 
     * @param lastMatchedDate
     */
    public void setLastMatchedDate(java.util.Calendar lastMatchedDate) {
        this.lastMatchedDate = lastMatchedDate;
    }


    /**
     * Gets the lastModifiedBy value for this LeadCleanInfo.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this LeadCleanInfo.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this LeadCleanInfo.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this LeadCleanInfo.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this LeadCleanInfo.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this LeadCleanInfo.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this LeadCleanInfo.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this LeadCleanInfo.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastStatusChangedBy value for this LeadCleanInfo.
     * 
     * @return lastStatusChangedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastStatusChangedBy() {
        return lastStatusChangedBy;
    }


    /**
     * Sets the lastStatusChangedBy value for this LeadCleanInfo.
     * 
     * @param lastStatusChangedBy
     */
    public void setLastStatusChangedBy(com.sforce.soap.enterprise.sobject.User lastStatusChangedBy) {
        this.lastStatusChangedBy = lastStatusChangedBy;
    }


    /**
     * Gets the lastStatusChangedById value for this LeadCleanInfo.
     * 
     * @return lastStatusChangedById
     */
    public java.lang.String getLastStatusChangedById() {
        return lastStatusChangedById;
    }


    /**
     * Sets the lastStatusChangedById value for this LeadCleanInfo.
     * 
     * @param lastStatusChangedById
     */
    public void setLastStatusChangedById(java.lang.String lastStatusChangedById) {
        this.lastStatusChangedById = lastStatusChangedById;
    }


    /**
     * Gets the lastStatusChangedDate value for this LeadCleanInfo.
     * 
     * @return lastStatusChangedDate
     */
    public java.util.Calendar getLastStatusChangedDate() {
        return lastStatusChangedDate;
    }


    /**
     * Sets the lastStatusChangedDate value for this LeadCleanInfo.
     * 
     * @param lastStatusChangedDate
     */
    public void setLastStatusChangedDate(java.util.Calendar lastStatusChangedDate) {
        this.lastStatusChangedDate = lastStatusChangedDate;
    }


    /**
     * Gets the latitude value for this LeadCleanInfo.
     * 
     * @return latitude
     */
    public java.lang.Double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LeadCleanInfo.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the lead value for this LeadCleanInfo.
     * 
     * @return lead
     */
    public com.sforce.soap.enterprise.sobject.Lead getLead() {
        return lead;
    }


    /**
     * Sets the lead value for this LeadCleanInfo.
     * 
     * @param lead
     */
    public void setLead(com.sforce.soap.enterprise.sobject.Lead lead) {
        this.lead = lead;
    }


    /**
     * Gets the leadId value for this LeadCleanInfo.
     * 
     * @return leadId
     */
    public java.lang.String getLeadId() {
        return leadId;
    }


    /**
     * Sets the leadId value for this LeadCleanInfo.
     * 
     * @param leadId
     */
    public void setLeadId(java.lang.String leadId) {
        this.leadId = leadId;
    }


    /**
     * Gets the longitude value for this LeadCleanInfo.
     * 
     * @return longitude
     */
    public java.lang.Double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LeadCleanInfo.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the name value for this LeadCleanInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LeadCleanInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfEmployees value for this LeadCleanInfo.
     * 
     * @return numberOfEmployees
     */
    public java.lang.Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    /**
     * Sets the numberOfEmployees value for this LeadCleanInfo.
     * 
     * @param numberOfEmployees
     */
    public void setNumberOfEmployees(java.lang.Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    /**
     * Gets the phone value for this LeadCleanInfo.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this LeadCleanInfo.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this LeadCleanInfo.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this LeadCleanInfo.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the state value for this LeadCleanInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this LeadCleanInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this LeadCleanInfo.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this LeadCleanInfo.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this LeadCleanInfo.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this LeadCleanInfo.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this LeadCleanInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this LeadCleanInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userRecordAccess value for this LeadCleanInfo.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this LeadCleanInfo.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LeadCleanInfo)) return false;
        LeadCleanInfo other = (LeadCleanInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.annualRevenue==null && other.getAnnualRevenue()==null) || 
             (this.annualRevenue!=null &&
              this.annualRevenue.equals(other.getAnnualRevenue()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.cleanedByJob==null && other.getCleanedByJob()==null) || 
             (this.cleanedByJob!=null &&
              this.cleanedByJob.equals(other.getCleanedByJob()))) &&
            ((this.cleanedByUser==null && other.getCleanedByUser()==null) || 
             (this.cleanedByUser!=null &&
              this.cleanedByUser.equals(other.getCleanedByUser()))) &&
            ((this.companyDunsNumber==null && other.getCompanyDunsNumber()==null) || 
             (this.companyDunsNumber!=null &&
              this.companyDunsNumber.equals(other.getCompanyDunsNumber()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.contactStatusDataDotCom==null && other.getContactStatusDataDotCom()==null) || 
             (this.contactStatusDataDotCom!=null &&
              this.contactStatusDataDotCom.equals(other.getContactStatusDataDotCom()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dandBCompanyDunsNumber==null && other.getDandBCompanyDunsNumber()==null) || 
             (this.dandBCompanyDunsNumber!=null &&
              this.dandBCompanyDunsNumber.equals(other.getDandBCompanyDunsNumber()))) &&
            ((this.dataDotComCompanyId==null && other.getDataDotComCompanyId()==null) || 
             (this.dataDotComCompanyId!=null &&
              this.dataDotComCompanyId.equals(other.getDataDotComCompanyId()))) &&
            ((this.dataDotComId==null && other.getDataDotComId()==null) || 
             (this.dataDotComId!=null &&
              this.dataDotComId.equals(other.getDataDotComId()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.geocodeAccuracy==null && other.getGeocodeAccuracy()==null) || 
             (this.geocodeAccuracy!=null &&
              this.geocodeAccuracy.equals(other.getGeocodeAccuracy()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isDifferentAnnualRevenue==null && other.getIsDifferentAnnualRevenue()==null) || 
             (this.isDifferentAnnualRevenue!=null &&
              this.isDifferentAnnualRevenue.equals(other.getIsDifferentAnnualRevenue()))) &&
            ((this.isDifferentCity==null && other.getIsDifferentCity()==null) || 
             (this.isDifferentCity!=null &&
              this.isDifferentCity.equals(other.getIsDifferentCity()))) &&
            ((this.isDifferentCompanyDunsNumber==null && other.getIsDifferentCompanyDunsNumber()==null) || 
             (this.isDifferentCompanyDunsNumber!=null &&
              this.isDifferentCompanyDunsNumber.equals(other.getIsDifferentCompanyDunsNumber()))) &&
            ((this.isDifferentCompanyName==null && other.getIsDifferentCompanyName()==null) || 
             (this.isDifferentCompanyName!=null &&
              this.isDifferentCompanyName.equals(other.getIsDifferentCompanyName()))) &&
            ((this.isDifferentCountry==null && other.getIsDifferentCountry()==null) || 
             (this.isDifferentCountry!=null &&
              this.isDifferentCountry.equals(other.getIsDifferentCountry()))) &&
            ((this.isDifferentCountryCode==null && other.getIsDifferentCountryCode()==null) || 
             (this.isDifferentCountryCode!=null &&
              this.isDifferentCountryCode.equals(other.getIsDifferentCountryCode()))) &&
            ((this.isDifferentDandBCompanyDunsNumber==null && other.getIsDifferentDandBCompanyDunsNumber()==null) || 
             (this.isDifferentDandBCompanyDunsNumber!=null &&
              this.isDifferentDandBCompanyDunsNumber.equals(other.getIsDifferentDandBCompanyDunsNumber()))) &&
            ((this.isDifferentEmail==null && other.getIsDifferentEmail()==null) || 
             (this.isDifferentEmail!=null &&
              this.isDifferentEmail.equals(other.getIsDifferentEmail()))) &&
            ((this.isDifferentFirstName==null && other.getIsDifferentFirstName()==null) || 
             (this.isDifferentFirstName!=null &&
              this.isDifferentFirstName.equals(other.getIsDifferentFirstName()))) &&
            ((this.isDifferentIndustry==null && other.getIsDifferentIndustry()==null) || 
             (this.isDifferentIndustry!=null &&
              this.isDifferentIndustry.equals(other.getIsDifferentIndustry()))) &&
            ((this.isDifferentLastName==null && other.getIsDifferentLastName()==null) || 
             (this.isDifferentLastName!=null &&
              this.isDifferentLastName.equals(other.getIsDifferentLastName()))) &&
            ((this.isDifferentNumberOfEmployees==null && other.getIsDifferentNumberOfEmployees()==null) || 
             (this.isDifferentNumberOfEmployees!=null &&
              this.isDifferentNumberOfEmployees.equals(other.getIsDifferentNumberOfEmployees()))) &&
            ((this.isDifferentPhone==null && other.getIsDifferentPhone()==null) || 
             (this.isDifferentPhone!=null &&
              this.isDifferentPhone.equals(other.getIsDifferentPhone()))) &&
            ((this.isDifferentPostalCode==null && other.getIsDifferentPostalCode()==null) || 
             (this.isDifferentPostalCode!=null &&
              this.isDifferentPostalCode.equals(other.getIsDifferentPostalCode()))) &&
            ((this.isDifferentState==null && other.getIsDifferentState()==null) || 
             (this.isDifferentState!=null &&
              this.isDifferentState.equals(other.getIsDifferentState()))) &&
            ((this.isDifferentStateCode==null && other.getIsDifferentStateCode()==null) || 
             (this.isDifferentStateCode!=null &&
              this.isDifferentStateCode.equals(other.getIsDifferentStateCode()))) &&
            ((this.isDifferentStreet==null && other.getIsDifferentStreet()==null) || 
             (this.isDifferentStreet!=null &&
              this.isDifferentStreet.equals(other.getIsDifferentStreet()))) &&
            ((this.isDifferentTitle==null && other.getIsDifferentTitle()==null) || 
             (this.isDifferentTitle!=null &&
              this.isDifferentTitle.equals(other.getIsDifferentTitle()))) &&
            ((this.isFlaggedWrongAddress==null && other.getIsFlaggedWrongAddress()==null) || 
             (this.isFlaggedWrongAddress!=null &&
              this.isFlaggedWrongAddress.equals(other.getIsFlaggedWrongAddress()))) &&
            ((this.isFlaggedWrongAnnualRevenue==null && other.getIsFlaggedWrongAnnualRevenue()==null) || 
             (this.isFlaggedWrongAnnualRevenue!=null &&
              this.isFlaggedWrongAnnualRevenue.equals(other.getIsFlaggedWrongAnnualRevenue()))) &&
            ((this.isFlaggedWrongCompanyDunsNumber==null && other.getIsFlaggedWrongCompanyDunsNumber()==null) || 
             (this.isFlaggedWrongCompanyDunsNumber!=null &&
              this.isFlaggedWrongCompanyDunsNumber.equals(other.getIsFlaggedWrongCompanyDunsNumber()))) &&
            ((this.isFlaggedWrongCompanyName==null && other.getIsFlaggedWrongCompanyName()==null) || 
             (this.isFlaggedWrongCompanyName!=null &&
              this.isFlaggedWrongCompanyName.equals(other.getIsFlaggedWrongCompanyName()))) &&
            ((this.isFlaggedWrongEmail==null && other.getIsFlaggedWrongEmail()==null) || 
             (this.isFlaggedWrongEmail!=null &&
              this.isFlaggedWrongEmail.equals(other.getIsFlaggedWrongEmail()))) &&
            ((this.isFlaggedWrongIndustry==null && other.getIsFlaggedWrongIndustry()==null) || 
             (this.isFlaggedWrongIndustry!=null &&
              this.isFlaggedWrongIndustry.equals(other.getIsFlaggedWrongIndustry()))) &&
            ((this.isFlaggedWrongName==null && other.getIsFlaggedWrongName()==null) || 
             (this.isFlaggedWrongName!=null &&
              this.isFlaggedWrongName.equals(other.getIsFlaggedWrongName()))) &&
            ((this.isFlaggedWrongNumberOfEmployees==null && other.getIsFlaggedWrongNumberOfEmployees()==null) || 
             (this.isFlaggedWrongNumberOfEmployees!=null &&
              this.isFlaggedWrongNumberOfEmployees.equals(other.getIsFlaggedWrongNumberOfEmployees()))) &&
            ((this.isFlaggedWrongPhone==null && other.getIsFlaggedWrongPhone()==null) || 
             (this.isFlaggedWrongPhone!=null &&
              this.isFlaggedWrongPhone.equals(other.getIsFlaggedWrongPhone()))) &&
            ((this.isFlaggedWrongTitle==null && other.getIsFlaggedWrongTitle()==null) || 
             (this.isFlaggedWrongTitle!=null &&
              this.isFlaggedWrongTitle.equals(other.getIsFlaggedWrongTitle()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isReviewedAddress==null && other.getIsReviewedAddress()==null) || 
             (this.isReviewedAddress!=null &&
              this.isReviewedAddress.equals(other.getIsReviewedAddress()))) &&
            ((this.isReviewedAnnualRevenue==null && other.getIsReviewedAnnualRevenue()==null) || 
             (this.isReviewedAnnualRevenue!=null &&
              this.isReviewedAnnualRevenue.equals(other.getIsReviewedAnnualRevenue()))) &&
            ((this.isReviewedCompanyDunsNumber==null && other.getIsReviewedCompanyDunsNumber()==null) || 
             (this.isReviewedCompanyDunsNumber!=null &&
              this.isReviewedCompanyDunsNumber.equals(other.getIsReviewedCompanyDunsNumber()))) &&
            ((this.isReviewedCompanyName==null && other.getIsReviewedCompanyName()==null) || 
             (this.isReviewedCompanyName!=null &&
              this.isReviewedCompanyName.equals(other.getIsReviewedCompanyName()))) &&
            ((this.isReviewedDandBCompanyDunsNumber==null && other.getIsReviewedDandBCompanyDunsNumber()==null) || 
             (this.isReviewedDandBCompanyDunsNumber!=null &&
              this.isReviewedDandBCompanyDunsNumber.equals(other.getIsReviewedDandBCompanyDunsNumber()))) &&
            ((this.isReviewedEmail==null && other.getIsReviewedEmail()==null) || 
             (this.isReviewedEmail!=null &&
              this.isReviewedEmail.equals(other.getIsReviewedEmail()))) &&
            ((this.isReviewedIndustry==null && other.getIsReviewedIndustry()==null) || 
             (this.isReviewedIndustry!=null &&
              this.isReviewedIndustry.equals(other.getIsReviewedIndustry()))) &&
            ((this.isReviewedName==null && other.getIsReviewedName()==null) || 
             (this.isReviewedName!=null &&
              this.isReviewedName.equals(other.getIsReviewedName()))) &&
            ((this.isReviewedNumberOfEmployees==null && other.getIsReviewedNumberOfEmployees()==null) || 
             (this.isReviewedNumberOfEmployees!=null &&
              this.isReviewedNumberOfEmployees.equals(other.getIsReviewedNumberOfEmployees()))) &&
            ((this.isReviewedPhone==null && other.getIsReviewedPhone()==null) || 
             (this.isReviewedPhone!=null &&
              this.isReviewedPhone.equals(other.getIsReviewedPhone()))) &&
            ((this.isReviewedTitle==null && other.getIsReviewedTitle()==null) || 
             (this.isReviewedTitle!=null &&
              this.isReviewedTitle.equals(other.getIsReviewedTitle()))) &&
            ((this.lastMatchedDate==null && other.getLastMatchedDate()==null) || 
             (this.lastMatchedDate!=null &&
              this.lastMatchedDate.equals(other.getLastMatchedDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastStatusChangedBy==null && other.getLastStatusChangedBy()==null) || 
             (this.lastStatusChangedBy!=null &&
              this.lastStatusChangedBy.equals(other.getLastStatusChangedBy()))) &&
            ((this.lastStatusChangedById==null && other.getLastStatusChangedById()==null) || 
             (this.lastStatusChangedById!=null &&
              this.lastStatusChangedById.equals(other.getLastStatusChangedById()))) &&
            ((this.lastStatusChangedDate==null && other.getLastStatusChangedDate()==null) || 
             (this.lastStatusChangedDate!=null &&
              this.lastStatusChangedDate.equals(other.getLastStatusChangedDate()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.lead==null && other.getLead()==null) || 
             (this.lead!=null &&
              this.lead.equals(other.getLead()))) &&
            ((this.leadId==null && other.getLeadId()==null) || 
             (this.leadId!=null &&
              this.leadId.equals(other.getLeadId()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberOfEmployees==null && other.getNumberOfEmployees()==null) || 
             (this.numberOfEmployees!=null &&
              this.numberOfEmployees.equals(other.getNumberOfEmployees()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAnnualRevenue() != null) {
            _hashCode += getAnnualRevenue().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCleanedByJob() != null) {
            _hashCode += getCleanedByJob().hashCode();
        }
        if (getCleanedByUser() != null) {
            _hashCode += getCleanedByUser().hashCode();
        }
        if (getCompanyDunsNumber() != null) {
            _hashCode += getCompanyDunsNumber().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getContactStatusDataDotCom() != null) {
            _hashCode += getContactStatusDataDotCom().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
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
        if (getDandBCompanyDunsNumber() != null) {
            _hashCode += getDandBCompanyDunsNumber().hashCode();
        }
        if (getDataDotComCompanyId() != null) {
            _hashCode += getDataDotComCompanyId().hashCode();
        }
        if (getDataDotComId() != null) {
            _hashCode += getDataDotComId().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGeocodeAccuracy() != null) {
            _hashCode += getGeocodeAccuracy().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsDifferentAnnualRevenue() != null) {
            _hashCode += getIsDifferentAnnualRevenue().hashCode();
        }
        if (getIsDifferentCity() != null) {
            _hashCode += getIsDifferentCity().hashCode();
        }
        if (getIsDifferentCompanyDunsNumber() != null) {
            _hashCode += getIsDifferentCompanyDunsNumber().hashCode();
        }
        if (getIsDifferentCompanyName() != null) {
            _hashCode += getIsDifferentCompanyName().hashCode();
        }
        if (getIsDifferentCountry() != null) {
            _hashCode += getIsDifferentCountry().hashCode();
        }
        if (getIsDifferentCountryCode() != null) {
            _hashCode += getIsDifferentCountryCode().hashCode();
        }
        if (getIsDifferentDandBCompanyDunsNumber() != null) {
            _hashCode += getIsDifferentDandBCompanyDunsNumber().hashCode();
        }
        if (getIsDifferentEmail() != null) {
            _hashCode += getIsDifferentEmail().hashCode();
        }
        if (getIsDifferentFirstName() != null) {
            _hashCode += getIsDifferentFirstName().hashCode();
        }
        if (getIsDifferentIndustry() != null) {
            _hashCode += getIsDifferentIndustry().hashCode();
        }
        if (getIsDifferentLastName() != null) {
            _hashCode += getIsDifferentLastName().hashCode();
        }
        if (getIsDifferentNumberOfEmployees() != null) {
            _hashCode += getIsDifferentNumberOfEmployees().hashCode();
        }
        if (getIsDifferentPhone() != null) {
            _hashCode += getIsDifferentPhone().hashCode();
        }
        if (getIsDifferentPostalCode() != null) {
            _hashCode += getIsDifferentPostalCode().hashCode();
        }
        if (getIsDifferentState() != null) {
            _hashCode += getIsDifferentState().hashCode();
        }
        if (getIsDifferentStateCode() != null) {
            _hashCode += getIsDifferentStateCode().hashCode();
        }
        if (getIsDifferentStreet() != null) {
            _hashCode += getIsDifferentStreet().hashCode();
        }
        if (getIsDifferentTitle() != null) {
            _hashCode += getIsDifferentTitle().hashCode();
        }
        if (getIsFlaggedWrongAddress() != null) {
            _hashCode += getIsFlaggedWrongAddress().hashCode();
        }
        if (getIsFlaggedWrongAnnualRevenue() != null) {
            _hashCode += getIsFlaggedWrongAnnualRevenue().hashCode();
        }
        if (getIsFlaggedWrongCompanyDunsNumber() != null) {
            _hashCode += getIsFlaggedWrongCompanyDunsNumber().hashCode();
        }
        if (getIsFlaggedWrongCompanyName() != null) {
            _hashCode += getIsFlaggedWrongCompanyName().hashCode();
        }
        if (getIsFlaggedWrongEmail() != null) {
            _hashCode += getIsFlaggedWrongEmail().hashCode();
        }
        if (getIsFlaggedWrongIndustry() != null) {
            _hashCode += getIsFlaggedWrongIndustry().hashCode();
        }
        if (getIsFlaggedWrongName() != null) {
            _hashCode += getIsFlaggedWrongName().hashCode();
        }
        if (getIsFlaggedWrongNumberOfEmployees() != null) {
            _hashCode += getIsFlaggedWrongNumberOfEmployees().hashCode();
        }
        if (getIsFlaggedWrongPhone() != null) {
            _hashCode += getIsFlaggedWrongPhone().hashCode();
        }
        if (getIsFlaggedWrongTitle() != null) {
            _hashCode += getIsFlaggedWrongTitle().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsReviewedAddress() != null) {
            _hashCode += getIsReviewedAddress().hashCode();
        }
        if (getIsReviewedAnnualRevenue() != null) {
            _hashCode += getIsReviewedAnnualRevenue().hashCode();
        }
        if (getIsReviewedCompanyDunsNumber() != null) {
            _hashCode += getIsReviewedCompanyDunsNumber().hashCode();
        }
        if (getIsReviewedCompanyName() != null) {
            _hashCode += getIsReviewedCompanyName().hashCode();
        }
        if (getIsReviewedDandBCompanyDunsNumber() != null) {
            _hashCode += getIsReviewedDandBCompanyDunsNumber().hashCode();
        }
        if (getIsReviewedEmail() != null) {
            _hashCode += getIsReviewedEmail().hashCode();
        }
        if (getIsReviewedIndustry() != null) {
            _hashCode += getIsReviewedIndustry().hashCode();
        }
        if (getIsReviewedName() != null) {
            _hashCode += getIsReviewedName().hashCode();
        }
        if (getIsReviewedNumberOfEmployees() != null) {
            _hashCode += getIsReviewedNumberOfEmployees().hashCode();
        }
        if (getIsReviewedPhone() != null) {
            _hashCode += getIsReviewedPhone().hashCode();
        }
        if (getIsReviewedTitle() != null) {
            _hashCode += getIsReviewedTitle().hashCode();
        }
        if (getLastMatchedDate() != null) {
            _hashCode += getLastMatchedDate().hashCode();
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
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastStatusChangedBy() != null) {
            _hashCode += getLastStatusChangedBy().hashCode();
        }
        if (getLastStatusChangedById() != null) {
            _hashCode += getLastStatusChangedById().hashCode();
        }
        if (getLastStatusChangedDate() != null) {
            _hashCode += getLastStatusChangedDate().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLead() != null) {
            _hashCode += getLead().hashCode();
        }
        if (getLeadId() != null) {
            _hashCode += getLeadId().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberOfEmployees() != null) {
            _hashCode += getNumberOfEmployees().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LeadCleanInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadCleanInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AnnualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanedByJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CleanedByJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CleanedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactStatusDataDotCom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactStatusDataDotCom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Country"));
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
        elemField.setFieldName("dandBCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DandBCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDotComCompanyId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataDotComCompanyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDotComId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataDotComId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geocodeAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GeocodeAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Industry"));
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
        elemField.setFieldName("isDifferentAnnualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentAnnualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentDandBCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentDandBCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentIndustry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentIndustry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentNumberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentNumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentStateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentStateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongAnnualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongAnnualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongIndustry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongIndustry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongNumberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongNumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedAnnualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedAnnualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedDandBCompanyDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedDandBCompanyDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedIndustry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedIndustry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedNumberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedNumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMatchedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastMatchedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChangedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastStatusChangedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChangedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastStatusChangedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChangedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastStatusChangedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("numberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Street"));
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
