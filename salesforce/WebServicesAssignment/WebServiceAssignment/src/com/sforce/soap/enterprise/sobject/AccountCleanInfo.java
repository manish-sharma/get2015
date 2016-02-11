/**
 * AccountCleanInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AccountCleanInfo  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private java.lang.String accountSite;

    private com.sforce.soap.enterprise.Address address;

    private java.lang.Double annualRevenue;

    private java.lang.String city;

    private java.lang.Boolean cleanedByJob;

    private java.lang.Boolean cleanedByUser;

    private java.lang.String companyName;

    private java.lang.String companyStatusDataDotCom;

    private java.lang.String country;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String dandBCompanyDunsNumber;

    private java.lang.String dataDotComId;

    private java.lang.String description;

    private java.lang.String dunsNumber;

    private java.lang.Integer dunsRightMatchConfidence;

    private java.lang.String dunsRightMatchGrade;

    private java.lang.String fax;

    private java.lang.String geocodeAccuracy;

    private java.lang.String industry;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isDifferentAccountSite;

    private java.lang.Boolean isDifferentAnnualRevenue;

    private java.lang.Boolean isDifferentCity;

    private java.lang.Boolean isDifferentCompanyName;

    private java.lang.Boolean isDifferentCountry;

    private java.lang.Boolean isDifferentCountryCode;

    private java.lang.Boolean isDifferentDandBCompanyDunsNumber;

    private java.lang.Boolean isDifferentDescription;

    private java.lang.Boolean isDifferentDunsNumber;

    private java.lang.Boolean isDifferentFax;

    private java.lang.Boolean isDifferentIndustry;

    private java.lang.Boolean isDifferentNaicsCode;

    private java.lang.Boolean isDifferentNaicsDescription;

    private java.lang.Boolean isDifferentNumberOfEmployees;

    private java.lang.Boolean isDifferentOwnership;

    private java.lang.Boolean isDifferentPhone;

    private java.lang.Boolean isDifferentPostalCode;

    private java.lang.Boolean isDifferentSic;

    private java.lang.Boolean isDifferentSicDescription;

    private java.lang.Boolean isDifferentState;

    private java.lang.Boolean isDifferentStateCode;

    private java.lang.Boolean isDifferentStreet;

    private java.lang.Boolean isDifferentTickerSymbol;

    private java.lang.Boolean isDifferentTradestyle;

    private java.lang.Boolean isDifferentWebsite;

    private java.lang.Boolean isDifferentYearStarted;

    private java.lang.Boolean isFlaggedWrongAccountSite;

    private java.lang.Boolean isFlaggedWrongAddress;

    private java.lang.Boolean isFlaggedWrongAnnualRevenue;

    private java.lang.Boolean isFlaggedWrongCompanyName;

    private java.lang.Boolean isFlaggedWrongDescription;

    private java.lang.Boolean isFlaggedWrongDunsNumber;

    private java.lang.Boolean isFlaggedWrongFax;

    private java.lang.Boolean isFlaggedWrongIndustry;

    private java.lang.Boolean isFlaggedWrongNaicsCode;

    private java.lang.Boolean isFlaggedWrongNaicsDescription;

    private java.lang.Boolean isFlaggedWrongNumberOfEmployees;

    private java.lang.Boolean isFlaggedWrongOwnership;

    private java.lang.Boolean isFlaggedWrongPhone;

    private java.lang.Boolean isFlaggedWrongSic;

    private java.lang.Boolean isFlaggedWrongSicDescription;

    private java.lang.Boolean isFlaggedWrongTickerSymbol;

    private java.lang.Boolean isFlaggedWrongTradestyle;

    private java.lang.Boolean isFlaggedWrongWebsite;

    private java.lang.Boolean isFlaggedWrongYearStarted;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean isReviewedAccountSite;

    private java.lang.Boolean isReviewedAddress;

    private java.lang.Boolean isReviewedAnnualRevenue;

    private java.lang.Boolean isReviewedCompanyName;

    private java.lang.Boolean isReviewedDandBCompanyDunsNumber;

    private java.lang.Boolean isReviewedDescription;

    private java.lang.Boolean isReviewedDunsNumber;

    private java.lang.Boolean isReviewedFax;

    private java.lang.Boolean isReviewedIndustry;

    private java.lang.Boolean isReviewedNaicsCode;

    private java.lang.Boolean isReviewedNaicsDescription;

    private java.lang.Boolean isReviewedNumberOfEmployees;

    private java.lang.Boolean isReviewedOwnership;

    private java.lang.Boolean isReviewedPhone;

    private java.lang.Boolean isReviewedSic;

    private java.lang.Boolean isReviewedSicDescription;

    private java.lang.Boolean isReviewedTickerSymbol;

    private java.lang.Boolean isReviewedTradestyle;

    private java.lang.Boolean isReviewedWebsite;

    private java.lang.Boolean isReviewedYearStarted;

    private java.util.Calendar lastMatchedDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private com.sforce.soap.enterprise.sobject.User lastStatusChangedBy;

    private java.lang.String lastStatusChangedById;

    private java.util.Calendar lastStatusChangedDate;

    private java.lang.Double latitude;

    private java.lang.Double longitude;

    private java.lang.String naicsCode;

    private java.lang.String naicsDescription;

    private java.lang.String name;

    private java.lang.Integer numberOfEmployees;

    private java.lang.String ownership;

    private java.lang.String phone;

    private java.lang.String postalCode;

    private java.lang.String sic;

    private java.lang.String sicDescription;

    private java.lang.String state;

    private java.lang.String street;

    private java.util.Calendar systemModstamp;

    private java.lang.String tickerSymbol;

    private java.lang.String tradestyle;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String website;

    private java.lang.String yearStarted;

    public AccountCleanInfo() {
    }

    public AccountCleanInfo(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           java.lang.String accountSite,
           com.sforce.soap.enterprise.Address address,
           java.lang.Double annualRevenue,
           java.lang.String city,
           java.lang.Boolean cleanedByJob,
           java.lang.Boolean cleanedByUser,
           java.lang.String companyName,
           java.lang.String companyStatusDataDotCom,
           java.lang.String country,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String dandBCompanyDunsNumber,
           java.lang.String dataDotComId,
           java.lang.String description,
           java.lang.String dunsNumber,
           java.lang.Integer dunsRightMatchConfidence,
           java.lang.String dunsRightMatchGrade,
           java.lang.String fax,
           java.lang.String geocodeAccuracy,
           java.lang.String industry,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isDifferentAccountSite,
           java.lang.Boolean isDifferentAnnualRevenue,
           java.lang.Boolean isDifferentCity,
           java.lang.Boolean isDifferentCompanyName,
           java.lang.Boolean isDifferentCountry,
           java.lang.Boolean isDifferentCountryCode,
           java.lang.Boolean isDifferentDandBCompanyDunsNumber,
           java.lang.Boolean isDifferentDescription,
           java.lang.Boolean isDifferentDunsNumber,
           java.lang.Boolean isDifferentFax,
           java.lang.Boolean isDifferentIndustry,
           java.lang.Boolean isDifferentNaicsCode,
           java.lang.Boolean isDifferentNaicsDescription,
           java.lang.Boolean isDifferentNumberOfEmployees,
           java.lang.Boolean isDifferentOwnership,
           java.lang.Boolean isDifferentPhone,
           java.lang.Boolean isDifferentPostalCode,
           java.lang.Boolean isDifferentSic,
           java.lang.Boolean isDifferentSicDescription,
           java.lang.Boolean isDifferentState,
           java.lang.Boolean isDifferentStateCode,
           java.lang.Boolean isDifferentStreet,
           java.lang.Boolean isDifferentTickerSymbol,
           java.lang.Boolean isDifferentTradestyle,
           java.lang.Boolean isDifferentWebsite,
           java.lang.Boolean isDifferentYearStarted,
           java.lang.Boolean isFlaggedWrongAccountSite,
           java.lang.Boolean isFlaggedWrongAddress,
           java.lang.Boolean isFlaggedWrongAnnualRevenue,
           java.lang.Boolean isFlaggedWrongCompanyName,
           java.lang.Boolean isFlaggedWrongDescription,
           java.lang.Boolean isFlaggedWrongDunsNumber,
           java.lang.Boolean isFlaggedWrongFax,
           java.lang.Boolean isFlaggedWrongIndustry,
           java.lang.Boolean isFlaggedWrongNaicsCode,
           java.lang.Boolean isFlaggedWrongNaicsDescription,
           java.lang.Boolean isFlaggedWrongNumberOfEmployees,
           java.lang.Boolean isFlaggedWrongOwnership,
           java.lang.Boolean isFlaggedWrongPhone,
           java.lang.Boolean isFlaggedWrongSic,
           java.lang.Boolean isFlaggedWrongSicDescription,
           java.lang.Boolean isFlaggedWrongTickerSymbol,
           java.lang.Boolean isFlaggedWrongTradestyle,
           java.lang.Boolean isFlaggedWrongWebsite,
           java.lang.Boolean isFlaggedWrongYearStarted,
           java.lang.Boolean isInactive,
           java.lang.Boolean isReviewedAccountSite,
           java.lang.Boolean isReviewedAddress,
           java.lang.Boolean isReviewedAnnualRevenue,
           java.lang.Boolean isReviewedCompanyName,
           java.lang.Boolean isReviewedDandBCompanyDunsNumber,
           java.lang.Boolean isReviewedDescription,
           java.lang.Boolean isReviewedDunsNumber,
           java.lang.Boolean isReviewedFax,
           java.lang.Boolean isReviewedIndustry,
           java.lang.Boolean isReviewedNaicsCode,
           java.lang.Boolean isReviewedNaicsDescription,
           java.lang.Boolean isReviewedNumberOfEmployees,
           java.lang.Boolean isReviewedOwnership,
           java.lang.Boolean isReviewedPhone,
           java.lang.Boolean isReviewedSic,
           java.lang.Boolean isReviewedSicDescription,
           java.lang.Boolean isReviewedTickerSymbol,
           java.lang.Boolean isReviewedTradestyle,
           java.lang.Boolean isReviewedWebsite,
           java.lang.Boolean isReviewedYearStarted,
           java.util.Calendar lastMatchedDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           com.sforce.soap.enterprise.sobject.User lastStatusChangedBy,
           java.lang.String lastStatusChangedById,
           java.util.Calendar lastStatusChangedDate,
           java.lang.Double latitude,
           java.lang.Double longitude,
           java.lang.String naicsCode,
           java.lang.String naicsDescription,
           java.lang.String name,
           java.lang.Integer numberOfEmployees,
           java.lang.String ownership,
           java.lang.String phone,
           java.lang.String postalCode,
           java.lang.String sic,
           java.lang.String sicDescription,
           java.lang.String state,
           java.lang.String street,
           java.util.Calendar systemModstamp,
           java.lang.String tickerSymbol,
           java.lang.String tradestyle,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String website,
           java.lang.String yearStarted) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.accountSite = accountSite;
        this.address = address;
        this.annualRevenue = annualRevenue;
        this.city = city;
        this.cleanedByJob = cleanedByJob;
        this.cleanedByUser = cleanedByUser;
        this.companyName = companyName;
        this.companyStatusDataDotCom = companyStatusDataDotCom;
        this.country = country;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.dandBCompanyDunsNumber = dandBCompanyDunsNumber;
        this.dataDotComId = dataDotComId;
        this.description = description;
        this.dunsNumber = dunsNumber;
        this.dunsRightMatchConfidence = dunsRightMatchConfidence;
        this.dunsRightMatchGrade = dunsRightMatchGrade;
        this.fax = fax;
        this.geocodeAccuracy = geocodeAccuracy;
        this.industry = industry;
        this.isDeleted = isDeleted;
        this.isDifferentAccountSite = isDifferentAccountSite;
        this.isDifferentAnnualRevenue = isDifferentAnnualRevenue;
        this.isDifferentCity = isDifferentCity;
        this.isDifferentCompanyName = isDifferentCompanyName;
        this.isDifferentCountry = isDifferentCountry;
        this.isDifferentCountryCode = isDifferentCountryCode;
        this.isDifferentDandBCompanyDunsNumber = isDifferentDandBCompanyDunsNumber;
        this.isDifferentDescription = isDifferentDescription;
        this.isDifferentDunsNumber = isDifferentDunsNumber;
        this.isDifferentFax = isDifferentFax;
        this.isDifferentIndustry = isDifferentIndustry;
        this.isDifferentNaicsCode = isDifferentNaicsCode;
        this.isDifferentNaicsDescription = isDifferentNaicsDescription;
        this.isDifferentNumberOfEmployees = isDifferentNumberOfEmployees;
        this.isDifferentOwnership = isDifferentOwnership;
        this.isDifferentPhone = isDifferentPhone;
        this.isDifferentPostalCode = isDifferentPostalCode;
        this.isDifferentSic = isDifferentSic;
        this.isDifferentSicDescription = isDifferentSicDescription;
        this.isDifferentState = isDifferentState;
        this.isDifferentStateCode = isDifferentStateCode;
        this.isDifferentStreet = isDifferentStreet;
        this.isDifferentTickerSymbol = isDifferentTickerSymbol;
        this.isDifferentTradestyle = isDifferentTradestyle;
        this.isDifferentWebsite = isDifferentWebsite;
        this.isDifferentYearStarted = isDifferentYearStarted;
        this.isFlaggedWrongAccountSite = isFlaggedWrongAccountSite;
        this.isFlaggedWrongAddress = isFlaggedWrongAddress;
        this.isFlaggedWrongAnnualRevenue = isFlaggedWrongAnnualRevenue;
        this.isFlaggedWrongCompanyName = isFlaggedWrongCompanyName;
        this.isFlaggedWrongDescription = isFlaggedWrongDescription;
        this.isFlaggedWrongDunsNumber = isFlaggedWrongDunsNumber;
        this.isFlaggedWrongFax = isFlaggedWrongFax;
        this.isFlaggedWrongIndustry = isFlaggedWrongIndustry;
        this.isFlaggedWrongNaicsCode = isFlaggedWrongNaicsCode;
        this.isFlaggedWrongNaicsDescription = isFlaggedWrongNaicsDescription;
        this.isFlaggedWrongNumberOfEmployees = isFlaggedWrongNumberOfEmployees;
        this.isFlaggedWrongOwnership = isFlaggedWrongOwnership;
        this.isFlaggedWrongPhone = isFlaggedWrongPhone;
        this.isFlaggedWrongSic = isFlaggedWrongSic;
        this.isFlaggedWrongSicDescription = isFlaggedWrongSicDescription;
        this.isFlaggedWrongTickerSymbol = isFlaggedWrongTickerSymbol;
        this.isFlaggedWrongTradestyle = isFlaggedWrongTradestyle;
        this.isFlaggedWrongWebsite = isFlaggedWrongWebsite;
        this.isFlaggedWrongYearStarted = isFlaggedWrongYearStarted;
        this.isInactive = isInactive;
        this.isReviewedAccountSite = isReviewedAccountSite;
        this.isReviewedAddress = isReviewedAddress;
        this.isReviewedAnnualRevenue = isReviewedAnnualRevenue;
        this.isReviewedCompanyName = isReviewedCompanyName;
        this.isReviewedDandBCompanyDunsNumber = isReviewedDandBCompanyDunsNumber;
        this.isReviewedDescription = isReviewedDescription;
        this.isReviewedDunsNumber = isReviewedDunsNumber;
        this.isReviewedFax = isReviewedFax;
        this.isReviewedIndustry = isReviewedIndustry;
        this.isReviewedNaicsCode = isReviewedNaicsCode;
        this.isReviewedNaicsDescription = isReviewedNaicsDescription;
        this.isReviewedNumberOfEmployees = isReviewedNumberOfEmployees;
        this.isReviewedOwnership = isReviewedOwnership;
        this.isReviewedPhone = isReviewedPhone;
        this.isReviewedSic = isReviewedSic;
        this.isReviewedSicDescription = isReviewedSicDescription;
        this.isReviewedTickerSymbol = isReviewedTickerSymbol;
        this.isReviewedTradestyle = isReviewedTradestyle;
        this.isReviewedWebsite = isReviewedWebsite;
        this.isReviewedYearStarted = isReviewedYearStarted;
        this.lastMatchedDate = lastMatchedDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastStatusChangedBy = lastStatusChangedBy;
        this.lastStatusChangedById = lastStatusChangedById;
        this.lastStatusChangedDate = lastStatusChangedDate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.naicsCode = naicsCode;
        this.naicsDescription = naicsDescription;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.ownership = ownership;
        this.phone = phone;
        this.postalCode = postalCode;
        this.sic = sic;
        this.sicDescription = sicDescription;
        this.state = state;
        this.street = street;
        this.systemModstamp = systemModstamp;
        this.tickerSymbol = tickerSymbol;
        this.tradestyle = tradestyle;
        this.userRecordAccess = userRecordAccess;
        this.website = website;
        this.yearStarted = yearStarted;
    }


    /**
     * Gets the account value for this AccountCleanInfo.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this AccountCleanInfo.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this AccountCleanInfo.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AccountCleanInfo.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountSite value for this AccountCleanInfo.
     * 
     * @return accountSite
     */
    public java.lang.String getAccountSite() {
        return accountSite;
    }


    /**
     * Sets the accountSite value for this AccountCleanInfo.
     * 
     * @param accountSite
     */
    public void setAccountSite(java.lang.String accountSite) {
        this.accountSite = accountSite;
    }


    /**
     * Gets the address value for this AccountCleanInfo.
     * 
     * @return address
     */
    public com.sforce.soap.enterprise.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AccountCleanInfo.
     * 
     * @param address
     */
    public void setAddress(com.sforce.soap.enterprise.Address address) {
        this.address = address;
    }


    /**
     * Gets the annualRevenue value for this AccountCleanInfo.
     * 
     * @return annualRevenue
     */
    public java.lang.Double getAnnualRevenue() {
        return annualRevenue;
    }


    /**
     * Sets the annualRevenue value for this AccountCleanInfo.
     * 
     * @param annualRevenue
     */
    public void setAnnualRevenue(java.lang.Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }


    /**
     * Gets the city value for this AccountCleanInfo.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this AccountCleanInfo.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the cleanedByJob value for this AccountCleanInfo.
     * 
     * @return cleanedByJob
     */
    public java.lang.Boolean getCleanedByJob() {
        return cleanedByJob;
    }


    /**
     * Sets the cleanedByJob value for this AccountCleanInfo.
     * 
     * @param cleanedByJob
     */
    public void setCleanedByJob(java.lang.Boolean cleanedByJob) {
        this.cleanedByJob = cleanedByJob;
    }


    /**
     * Gets the cleanedByUser value for this AccountCleanInfo.
     * 
     * @return cleanedByUser
     */
    public java.lang.Boolean getCleanedByUser() {
        return cleanedByUser;
    }


    /**
     * Sets the cleanedByUser value for this AccountCleanInfo.
     * 
     * @param cleanedByUser
     */
    public void setCleanedByUser(java.lang.Boolean cleanedByUser) {
        this.cleanedByUser = cleanedByUser;
    }


    /**
     * Gets the companyName value for this AccountCleanInfo.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this AccountCleanInfo.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the companyStatusDataDotCom value for this AccountCleanInfo.
     * 
     * @return companyStatusDataDotCom
     */
    public java.lang.String getCompanyStatusDataDotCom() {
        return companyStatusDataDotCom;
    }


    /**
     * Sets the companyStatusDataDotCom value for this AccountCleanInfo.
     * 
     * @param companyStatusDataDotCom
     */
    public void setCompanyStatusDataDotCom(java.lang.String companyStatusDataDotCom) {
        this.companyStatusDataDotCom = companyStatusDataDotCom;
    }


    /**
     * Gets the country value for this AccountCleanInfo.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this AccountCleanInfo.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the createdBy value for this AccountCleanInfo.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this AccountCleanInfo.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this AccountCleanInfo.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this AccountCleanInfo.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this AccountCleanInfo.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AccountCleanInfo.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @return dandBCompanyDunsNumber
     */
    public java.lang.String getDandBCompanyDunsNumber() {
        return dandBCompanyDunsNumber;
    }


    /**
     * Sets the dandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @param dandBCompanyDunsNumber
     */
    public void setDandBCompanyDunsNumber(java.lang.String dandBCompanyDunsNumber) {
        this.dandBCompanyDunsNumber = dandBCompanyDunsNumber;
    }


    /**
     * Gets the dataDotComId value for this AccountCleanInfo.
     * 
     * @return dataDotComId
     */
    public java.lang.String getDataDotComId() {
        return dataDotComId;
    }


    /**
     * Sets the dataDotComId value for this AccountCleanInfo.
     * 
     * @param dataDotComId
     */
    public void setDataDotComId(java.lang.String dataDotComId) {
        this.dataDotComId = dataDotComId;
    }


    /**
     * Gets the description value for this AccountCleanInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AccountCleanInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dunsNumber value for this AccountCleanInfo.
     * 
     * @return dunsNumber
     */
    public java.lang.String getDunsNumber() {
        return dunsNumber;
    }


    /**
     * Sets the dunsNumber value for this AccountCleanInfo.
     * 
     * @param dunsNumber
     */
    public void setDunsNumber(java.lang.String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }


    /**
     * Gets the dunsRightMatchConfidence value for this AccountCleanInfo.
     * 
     * @return dunsRightMatchConfidence
     */
    public java.lang.Integer getDunsRightMatchConfidence() {
        return dunsRightMatchConfidence;
    }


    /**
     * Sets the dunsRightMatchConfidence value for this AccountCleanInfo.
     * 
     * @param dunsRightMatchConfidence
     */
    public void setDunsRightMatchConfidence(java.lang.Integer dunsRightMatchConfidence) {
        this.dunsRightMatchConfidence = dunsRightMatchConfidence;
    }


    /**
     * Gets the dunsRightMatchGrade value for this AccountCleanInfo.
     * 
     * @return dunsRightMatchGrade
     */
    public java.lang.String getDunsRightMatchGrade() {
        return dunsRightMatchGrade;
    }


    /**
     * Sets the dunsRightMatchGrade value for this AccountCleanInfo.
     * 
     * @param dunsRightMatchGrade
     */
    public void setDunsRightMatchGrade(java.lang.String dunsRightMatchGrade) {
        this.dunsRightMatchGrade = dunsRightMatchGrade;
    }


    /**
     * Gets the fax value for this AccountCleanInfo.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this AccountCleanInfo.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the geocodeAccuracy value for this AccountCleanInfo.
     * 
     * @return geocodeAccuracy
     */
    public java.lang.String getGeocodeAccuracy() {
        return geocodeAccuracy;
    }


    /**
     * Sets the geocodeAccuracy value for this AccountCleanInfo.
     * 
     * @param geocodeAccuracy
     */
    public void setGeocodeAccuracy(java.lang.String geocodeAccuracy) {
        this.geocodeAccuracy = geocodeAccuracy;
    }


    /**
     * Gets the industry value for this AccountCleanInfo.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this AccountCleanInfo.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the isDeleted value for this AccountCleanInfo.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this AccountCleanInfo.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isDifferentAccountSite value for this AccountCleanInfo.
     * 
     * @return isDifferentAccountSite
     */
    public java.lang.Boolean getIsDifferentAccountSite() {
        return isDifferentAccountSite;
    }


    /**
     * Sets the isDifferentAccountSite value for this AccountCleanInfo.
     * 
     * @param isDifferentAccountSite
     */
    public void setIsDifferentAccountSite(java.lang.Boolean isDifferentAccountSite) {
        this.isDifferentAccountSite = isDifferentAccountSite;
    }


    /**
     * Gets the isDifferentAnnualRevenue value for this AccountCleanInfo.
     * 
     * @return isDifferentAnnualRevenue
     */
    public java.lang.Boolean getIsDifferentAnnualRevenue() {
        return isDifferentAnnualRevenue;
    }


    /**
     * Sets the isDifferentAnnualRevenue value for this AccountCleanInfo.
     * 
     * @param isDifferentAnnualRevenue
     */
    public void setIsDifferentAnnualRevenue(java.lang.Boolean isDifferentAnnualRevenue) {
        this.isDifferentAnnualRevenue = isDifferentAnnualRevenue;
    }


    /**
     * Gets the isDifferentCity value for this AccountCleanInfo.
     * 
     * @return isDifferentCity
     */
    public java.lang.Boolean getIsDifferentCity() {
        return isDifferentCity;
    }


    /**
     * Sets the isDifferentCity value for this AccountCleanInfo.
     * 
     * @param isDifferentCity
     */
    public void setIsDifferentCity(java.lang.Boolean isDifferentCity) {
        this.isDifferentCity = isDifferentCity;
    }


    /**
     * Gets the isDifferentCompanyName value for this AccountCleanInfo.
     * 
     * @return isDifferentCompanyName
     */
    public java.lang.Boolean getIsDifferentCompanyName() {
        return isDifferentCompanyName;
    }


    /**
     * Sets the isDifferentCompanyName value for this AccountCleanInfo.
     * 
     * @param isDifferentCompanyName
     */
    public void setIsDifferentCompanyName(java.lang.Boolean isDifferentCompanyName) {
        this.isDifferentCompanyName = isDifferentCompanyName;
    }


    /**
     * Gets the isDifferentCountry value for this AccountCleanInfo.
     * 
     * @return isDifferentCountry
     */
    public java.lang.Boolean getIsDifferentCountry() {
        return isDifferentCountry;
    }


    /**
     * Sets the isDifferentCountry value for this AccountCleanInfo.
     * 
     * @param isDifferentCountry
     */
    public void setIsDifferentCountry(java.lang.Boolean isDifferentCountry) {
        this.isDifferentCountry = isDifferentCountry;
    }


    /**
     * Gets the isDifferentCountryCode value for this AccountCleanInfo.
     * 
     * @return isDifferentCountryCode
     */
    public java.lang.Boolean getIsDifferentCountryCode() {
        return isDifferentCountryCode;
    }


    /**
     * Sets the isDifferentCountryCode value for this AccountCleanInfo.
     * 
     * @param isDifferentCountryCode
     */
    public void setIsDifferentCountryCode(java.lang.Boolean isDifferentCountryCode) {
        this.isDifferentCountryCode = isDifferentCountryCode;
    }


    /**
     * Gets the isDifferentDandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @return isDifferentDandBCompanyDunsNumber
     */
    public java.lang.Boolean getIsDifferentDandBCompanyDunsNumber() {
        return isDifferentDandBCompanyDunsNumber;
    }


    /**
     * Sets the isDifferentDandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @param isDifferentDandBCompanyDunsNumber
     */
    public void setIsDifferentDandBCompanyDunsNumber(java.lang.Boolean isDifferentDandBCompanyDunsNumber) {
        this.isDifferentDandBCompanyDunsNumber = isDifferentDandBCompanyDunsNumber;
    }


    /**
     * Gets the isDifferentDescription value for this AccountCleanInfo.
     * 
     * @return isDifferentDescription
     */
    public java.lang.Boolean getIsDifferentDescription() {
        return isDifferentDescription;
    }


    /**
     * Sets the isDifferentDescription value for this AccountCleanInfo.
     * 
     * @param isDifferentDescription
     */
    public void setIsDifferentDescription(java.lang.Boolean isDifferentDescription) {
        this.isDifferentDescription = isDifferentDescription;
    }


    /**
     * Gets the isDifferentDunsNumber value for this AccountCleanInfo.
     * 
     * @return isDifferentDunsNumber
     */
    public java.lang.Boolean getIsDifferentDunsNumber() {
        return isDifferentDunsNumber;
    }


    /**
     * Sets the isDifferentDunsNumber value for this AccountCleanInfo.
     * 
     * @param isDifferentDunsNumber
     */
    public void setIsDifferentDunsNumber(java.lang.Boolean isDifferentDunsNumber) {
        this.isDifferentDunsNumber = isDifferentDunsNumber;
    }


    /**
     * Gets the isDifferentFax value for this AccountCleanInfo.
     * 
     * @return isDifferentFax
     */
    public java.lang.Boolean getIsDifferentFax() {
        return isDifferentFax;
    }


    /**
     * Sets the isDifferentFax value for this AccountCleanInfo.
     * 
     * @param isDifferentFax
     */
    public void setIsDifferentFax(java.lang.Boolean isDifferentFax) {
        this.isDifferentFax = isDifferentFax;
    }


    /**
     * Gets the isDifferentIndustry value for this AccountCleanInfo.
     * 
     * @return isDifferentIndustry
     */
    public java.lang.Boolean getIsDifferentIndustry() {
        return isDifferentIndustry;
    }


    /**
     * Sets the isDifferentIndustry value for this AccountCleanInfo.
     * 
     * @param isDifferentIndustry
     */
    public void setIsDifferentIndustry(java.lang.Boolean isDifferentIndustry) {
        this.isDifferentIndustry = isDifferentIndustry;
    }


    /**
     * Gets the isDifferentNaicsCode value for this AccountCleanInfo.
     * 
     * @return isDifferentNaicsCode
     */
    public java.lang.Boolean getIsDifferentNaicsCode() {
        return isDifferentNaicsCode;
    }


    /**
     * Sets the isDifferentNaicsCode value for this AccountCleanInfo.
     * 
     * @param isDifferentNaicsCode
     */
    public void setIsDifferentNaicsCode(java.lang.Boolean isDifferentNaicsCode) {
        this.isDifferentNaicsCode = isDifferentNaicsCode;
    }


    /**
     * Gets the isDifferentNaicsDescription value for this AccountCleanInfo.
     * 
     * @return isDifferentNaicsDescription
     */
    public java.lang.Boolean getIsDifferentNaicsDescription() {
        return isDifferentNaicsDescription;
    }


    /**
     * Sets the isDifferentNaicsDescription value for this AccountCleanInfo.
     * 
     * @param isDifferentNaicsDescription
     */
    public void setIsDifferentNaicsDescription(java.lang.Boolean isDifferentNaicsDescription) {
        this.isDifferentNaicsDescription = isDifferentNaicsDescription;
    }


    /**
     * Gets the isDifferentNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @return isDifferentNumberOfEmployees
     */
    public java.lang.Boolean getIsDifferentNumberOfEmployees() {
        return isDifferentNumberOfEmployees;
    }


    /**
     * Sets the isDifferentNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @param isDifferentNumberOfEmployees
     */
    public void setIsDifferentNumberOfEmployees(java.lang.Boolean isDifferentNumberOfEmployees) {
        this.isDifferentNumberOfEmployees = isDifferentNumberOfEmployees;
    }


    /**
     * Gets the isDifferentOwnership value for this AccountCleanInfo.
     * 
     * @return isDifferentOwnership
     */
    public java.lang.Boolean getIsDifferentOwnership() {
        return isDifferentOwnership;
    }


    /**
     * Sets the isDifferentOwnership value for this AccountCleanInfo.
     * 
     * @param isDifferentOwnership
     */
    public void setIsDifferentOwnership(java.lang.Boolean isDifferentOwnership) {
        this.isDifferentOwnership = isDifferentOwnership;
    }


    /**
     * Gets the isDifferentPhone value for this AccountCleanInfo.
     * 
     * @return isDifferentPhone
     */
    public java.lang.Boolean getIsDifferentPhone() {
        return isDifferentPhone;
    }


    /**
     * Sets the isDifferentPhone value for this AccountCleanInfo.
     * 
     * @param isDifferentPhone
     */
    public void setIsDifferentPhone(java.lang.Boolean isDifferentPhone) {
        this.isDifferentPhone = isDifferentPhone;
    }


    /**
     * Gets the isDifferentPostalCode value for this AccountCleanInfo.
     * 
     * @return isDifferentPostalCode
     */
    public java.lang.Boolean getIsDifferentPostalCode() {
        return isDifferentPostalCode;
    }


    /**
     * Sets the isDifferentPostalCode value for this AccountCleanInfo.
     * 
     * @param isDifferentPostalCode
     */
    public void setIsDifferentPostalCode(java.lang.Boolean isDifferentPostalCode) {
        this.isDifferentPostalCode = isDifferentPostalCode;
    }


    /**
     * Gets the isDifferentSic value for this AccountCleanInfo.
     * 
     * @return isDifferentSic
     */
    public java.lang.Boolean getIsDifferentSic() {
        return isDifferentSic;
    }


    /**
     * Sets the isDifferentSic value for this AccountCleanInfo.
     * 
     * @param isDifferentSic
     */
    public void setIsDifferentSic(java.lang.Boolean isDifferentSic) {
        this.isDifferentSic = isDifferentSic;
    }


    /**
     * Gets the isDifferentSicDescription value for this AccountCleanInfo.
     * 
     * @return isDifferentSicDescription
     */
    public java.lang.Boolean getIsDifferentSicDescription() {
        return isDifferentSicDescription;
    }


    /**
     * Sets the isDifferentSicDescription value for this AccountCleanInfo.
     * 
     * @param isDifferentSicDescription
     */
    public void setIsDifferentSicDescription(java.lang.Boolean isDifferentSicDescription) {
        this.isDifferentSicDescription = isDifferentSicDescription;
    }


    /**
     * Gets the isDifferentState value for this AccountCleanInfo.
     * 
     * @return isDifferentState
     */
    public java.lang.Boolean getIsDifferentState() {
        return isDifferentState;
    }


    /**
     * Sets the isDifferentState value for this AccountCleanInfo.
     * 
     * @param isDifferentState
     */
    public void setIsDifferentState(java.lang.Boolean isDifferentState) {
        this.isDifferentState = isDifferentState;
    }


    /**
     * Gets the isDifferentStateCode value for this AccountCleanInfo.
     * 
     * @return isDifferentStateCode
     */
    public java.lang.Boolean getIsDifferentStateCode() {
        return isDifferentStateCode;
    }


    /**
     * Sets the isDifferentStateCode value for this AccountCleanInfo.
     * 
     * @param isDifferentStateCode
     */
    public void setIsDifferentStateCode(java.lang.Boolean isDifferentStateCode) {
        this.isDifferentStateCode = isDifferentStateCode;
    }


    /**
     * Gets the isDifferentStreet value for this AccountCleanInfo.
     * 
     * @return isDifferentStreet
     */
    public java.lang.Boolean getIsDifferentStreet() {
        return isDifferentStreet;
    }


    /**
     * Sets the isDifferentStreet value for this AccountCleanInfo.
     * 
     * @param isDifferentStreet
     */
    public void setIsDifferentStreet(java.lang.Boolean isDifferentStreet) {
        this.isDifferentStreet = isDifferentStreet;
    }


    /**
     * Gets the isDifferentTickerSymbol value for this AccountCleanInfo.
     * 
     * @return isDifferentTickerSymbol
     */
    public java.lang.Boolean getIsDifferentTickerSymbol() {
        return isDifferentTickerSymbol;
    }


    /**
     * Sets the isDifferentTickerSymbol value for this AccountCleanInfo.
     * 
     * @param isDifferentTickerSymbol
     */
    public void setIsDifferentTickerSymbol(java.lang.Boolean isDifferentTickerSymbol) {
        this.isDifferentTickerSymbol = isDifferentTickerSymbol;
    }


    /**
     * Gets the isDifferentTradestyle value for this AccountCleanInfo.
     * 
     * @return isDifferentTradestyle
     */
    public java.lang.Boolean getIsDifferentTradestyle() {
        return isDifferentTradestyle;
    }


    /**
     * Sets the isDifferentTradestyle value for this AccountCleanInfo.
     * 
     * @param isDifferentTradestyle
     */
    public void setIsDifferentTradestyle(java.lang.Boolean isDifferentTradestyle) {
        this.isDifferentTradestyle = isDifferentTradestyle;
    }


    /**
     * Gets the isDifferentWebsite value for this AccountCleanInfo.
     * 
     * @return isDifferentWebsite
     */
    public java.lang.Boolean getIsDifferentWebsite() {
        return isDifferentWebsite;
    }


    /**
     * Sets the isDifferentWebsite value for this AccountCleanInfo.
     * 
     * @param isDifferentWebsite
     */
    public void setIsDifferentWebsite(java.lang.Boolean isDifferentWebsite) {
        this.isDifferentWebsite = isDifferentWebsite;
    }


    /**
     * Gets the isDifferentYearStarted value for this AccountCleanInfo.
     * 
     * @return isDifferentYearStarted
     */
    public java.lang.Boolean getIsDifferentYearStarted() {
        return isDifferentYearStarted;
    }


    /**
     * Sets the isDifferentYearStarted value for this AccountCleanInfo.
     * 
     * @param isDifferentYearStarted
     */
    public void setIsDifferentYearStarted(java.lang.Boolean isDifferentYearStarted) {
        this.isDifferentYearStarted = isDifferentYearStarted;
    }


    /**
     * Gets the isFlaggedWrongAccountSite value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongAccountSite
     */
    public java.lang.Boolean getIsFlaggedWrongAccountSite() {
        return isFlaggedWrongAccountSite;
    }


    /**
     * Sets the isFlaggedWrongAccountSite value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongAccountSite
     */
    public void setIsFlaggedWrongAccountSite(java.lang.Boolean isFlaggedWrongAccountSite) {
        this.isFlaggedWrongAccountSite = isFlaggedWrongAccountSite;
    }


    /**
     * Gets the isFlaggedWrongAddress value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongAddress
     */
    public java.lang.Boolean getIsFlaggedWrongAddress() {
        return isFlaggedWrongAddress;
    }


    /**
     * Sets the isFlaggedWrongAddress value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongAddress
     */
    public void setIsFlaggedWrongAddress(java.lang.Boolean isFlaggedWrongAddress) {
        this.isFlaggedWrongAddress = isFlaggedWrongAddress;
    }


    /**
     * Gets the isFlaggedWrongAnnualRevenue value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongAnnualRevenue
     */
    public java.lang.Boolean getIsFlaggedWrongAnnualRevenue() {
        return isFlaggedWrongAnnualRevenue;
    }


    /**
     * Sets the isFlaggedWrongAnnualRevenue value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongAnnualRevenue
     */
    public void setIsFlaggedWrongAnnualRevenue(java.lang.Boolean isFlaggedWrongAnnualRevenue) {
        this.isFlaggedWrongAnnualRevenue = isFlaggedWrongAnnualRevenue;
    }


    /**
     * Gets the isFlaggedWrongCompanyName value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongCompanyName
     */
    public java.lang.Boolean getIsFlaggedWrongCompanyName() {
        return isFlaggedWrongCompanyName;
    }


    /**
     * Sets the isFlaggedWrongCompanyName value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongCompanyName
     */
    public void setIsFlaggedWrongCompanyName(java.lang.Boolean isFlaggedWrongCompanyName) {
        this.isFlaggedWrongCompanyName = isFlaggedWrongCompanyName;
    }


    /**
     * Gets the isFlaggedWrongDescription value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongDescription
     */
    public java.lang.Boolean getIsFlaggedWrongDescription() {
        return isFlaggedWrongDescription;
    }


    /**
     * Sets the isFlaggedWrongDescription value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongDescription
     */
    public void setIsFlaggedWrongDescription(java.lang.Boolean isFlaggedWrongDescription) {
        this.isFlaggedWrongDescription = isFlaggedWrongDescription;
    }


    /**
     * Gets the isFlaggedWrongDunsNumber value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongDunsNumber
     */
    public java.lang.Boolean getIsFlaggedWrongDunsNumber() {
        return isFlaggedWrongDunsNumber;
    }


    /**
     * Sets the isFlaggedWrongDunsNumber value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongDunsNumber
     */
    public void setIsFlaggedWrongDunsNumber(java.lang.Boolean isFlaggedWrongDunsNumber) {
        this.isFlaggedWrongDunsNumber = isFlaggedWrongDunsNumber;
    }


    /**
     * Gets the isFlaggedWrongFax value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongFax
     */
    public java.lang.Boolean getIsFlaggedWrongFax() {
        return isFlaggedWrongFax;
    }


    /**
     * Sets the isFlaggedWrongFax value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongFax
     */
    public void setIsFlaggedWrongFax(java.lang.Boolean isFlaggedWrongFax) {
        this.isFlaggedWrongFax = isFlaggedWrongFax;
    }


    /**
     * Gets the isFlaggedWrongIndustry value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongIndustry
     */
    public java.lang.Boolean getIsFlaggedWrongIndustry() {
        return isFlaggedWrongIndustry;
    }


    /**
     * Sets the isFlaggedWrongIndustry value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongIndustry
     */
    public void setIsFlaggedWrongIndustry(java.lang.Boolean isFlaggedWrongIndustry) {
        this.isFlaggedWrongIndustry = isFlaggedWrongIndustry;
    }


    /**
     * Gets the isFlaggedWrongNaicsCode value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongNaicsCode
     */
    public java.lang.Boolean getIsFlaggedWrongNaicsCode() {
        return isFlaggedWrongNaicsCode;
    }


    /**
     * Sets the isFlaggedWrongNaicsCode value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongNaicsCode
     */
    public void setIsFlaggedWrongNaicsCode(java.lang.Boolean isFlaggedWrongNaicsCode) {
        this.isFlaggedWrongNaicsCode = isFlaggedWrongNaicsCode;
    }


    /**
     * Gets the isFlaggedWrongNaicsDescription value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongNaicsDescription
     */
    public java.lang.Boolean getIsFlaggedWrongNaicsDescription() {
        return isFlaggedWrongNaicsDescription;
    }


    /**
     * Sets the isFlaggedWrongNaicsDescription value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongNaicsDescription
     */
    public void setIsFlaggedWrongNaicsDescription(java.lang.Boolean isFlaggedWrongNaicsDescription) {
        this.isFlaggedWrongNaicsDescription = isFlaggedWrongNaicsDescription;
    }


    /**
     * Gets the isFlaggedWrongNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongNumberOfEmployees
     */
    public java.lang.Boolean getIsFlaggedWrongNumberOfEmployees() {
        return isFlaggedWrongNumberOfEmployees;
    }


    /**
     * Sets the isFlaggedWrongNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongNumberOfEmployees
     */
    public void setIsFlaggedWrongNumberOfEmployees(java.lang.Boolean isFlaggedWrongNumberOfEmployees) {
        this.isFlaggedWrongNumberOfEmployees = isFlaggedWrongNumberOfEmployees;
    }


    /**
     * Gets the isFlaggedWrongOwnership value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongOwnership
     */
    public java.lang.Boolean getIsFlaggedWrongOwnership() {
        return isFlaggedWrongOwnership;
    }


    /**
     * Sets the isFlaggedWrongOwnership value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongOwnership
     */
    public void setIsFlaggedWrongOwnership(java.lang.Boolean isFlaggedWrongOwnership) {
        this.isFlaggedWrongOwnership = isFlaggedWrongOwnership;
    }


    /**
     * Gets the isFlaggedWrongPhone value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongPhone
     */
    public java.lang.Boolean getIsFlaggedWrongPhone() {
        return isFlaggedWrongPhone;
    }


    /**
     * Sets the isFlaggedWrongPhone value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongPhone
     */
    public void setIsFlaggedWrongPhone(java.lang.Boolean isFlaggedWrongPhone) {
        this.isFlaggedWrongPhone = isFlaggedWrongPhone;
    }


    /**
     * Gets the isFlaggedWrongSic value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongSic
     */
    public java.lang.Boolean getIsFlaggedWrongSic() {
        return isFlaggedWrongSic;
    }


    /**
     * Sets the isFlaggedWrongSic value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongSic
     */
    public void setIsFlaggedWrongSic(java.lang.Boolean isFlaggedWrongSic) {
        this.isFlaggedWrongSic = isFlaggedWrongSic;
    }


    /**
     * Gets the isFlaggedWrongSicDescription value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongSicDescription
     */
    public java.lang.Boolean getIsFlaggedWrongSicDescription() {
        return isFlaggedWrongSicDescription;
    }


    /**
     * Sets the isFlaggedWrongSicDescription value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongSicDescription
     */
    public void setIsFlaggedWrongSicDescription(java.lang.Boolean isFlaggedWrongSicDescription) {
        this.isFlaggedWrongSicDescription = isFlaggedWrongSicDescription;
    }


    /**
     * Gets the isFlaggedWrongTickerSymbol value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongTickerSymbol
     */
    public java.lang.Boolean getIsFlaggedWrongTickerSymbol() {
        return isFlaggedWrongTickerSymbol;
    }


    /**
     * Sets the isFlaggedWrongTickerSymbol value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongTickerSymbol
     */
    public void setIsFlaggedWrongTickerSymbol(java.lang.Boolean isFlaggedWrongTickerSymbol) {
        this.isFlaggedWrongTickerSymbol = isFlaggedWrongTickerSymbol;
    }


    /**
     * Gets the isFlaggedWrongTradestyle value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongTradestyle
     */
    public java.lang.Boolean getIsFlaggedWrongTradestyle() {
        return isFlaggedWrongTradestyle;
    }


    /**
     * Sets the isFlaggedWrongTradestyle value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongTradestyle
     */
    public void setIsFlaggedWrongTradestyle(java.lang.Boolean isFlaggedWrongTradestyle) {
        this.isFlaggedWrongTradestyle = isFlaggedWrongTradestyle;
    }


    /**
     * Gets the isFlaggedWrongWebsite value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongWebsite
     */
    public java.lang.Boolean getIsFlaggedWrongWebsite() {
        return isFlaggedWrongWebsite;
    }


    /**
     * Sets the isFlaggedWrongWebsite value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongWebsite
     */
    public void setIsFlaggedWrongWebsite(java.lang.Boolean isFlaggedWrongWebsite) {
        this.isFlaggedWrongWebsite = isFlaggedWrongWebsite;
    }


    /**
     * Gets the isFlaggedWrongYearStarted value for this AccountCleanInfo.
     * 
     * @return isFlaggedWrongYearStarted
     */
    public java.lang.Boolean getIsFlaggedWrongYearStarted() {
        return isFlaggedWrongYearStarted;
    }


    /**
     * Sets the isFlaggedWrongYearStarted value for this AccountCleanInfo.
     * 
     * @param isFlaggedWrongYearStarted
     */
    public void setIsFlaggedWrongYearStarted(java.lang.Boolean isFlaggedWrongYearStarted) {
        this.isFlaggedWrongYearStarted = isFlaggedWrongYearStarted;
    }


    /**
     * Gets the isInactive value for this AccountCleanInfo.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this AccountCleanInfo.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isReviewedAccountSite value for this AccountCleanInfo.
     * 
     * @return isReviewedAccountSite
     */
    public java.lang.Boolean getIsReviewedAccountSite() {
        return isReviewedAccountSite;
    }


    /**
     * Sets the isReviewedAccountSite value for this AccountCleanInfo.
     * 
     * @param isReviewedAccountSite
     */
    public void setIsReviewedAccountSite(java.lang.Boolean isReviewedAccountSite) {
        this.isReviewedAccountSite = isReviewedAccountSite;
    }


    /**
     * Gets the isReviewedAddress value for this AccountCleanInfo.
     * 
     * @return isReviewedAddress
     */
    public java.lang.Boolean getIsReviewedAddress() {
        return isReviewedAddress;
    }


    /**
     * Sets the isReviewedAddress value for this AccountCleanInfo.
     * 
     * @param isReviewedAddress
     */
    public void setIsReviewedAddress(java.lang.Boolean isReviewedAddress) {
        this.isReviewedAddress = isReviewedAddress;
    }


    /**
     * Gets the isReviewedAnnualRevenue value for this AccountCleanInfo.
     * 
     * @return isReviewedAnnualRevenue
     */
    public java.lang.Boolean getIsReviewedAnnualRevenue() {
        return isReviewedAnnualRevenue;
    }


    /**
     * Sets the isReviewedAnnualRevenue value for this AccountCleanInfo.
     * 
     * @param isReviewedAnnualRevenue
     */
    public void setIsReviewedAnnualRevenue(java.lang.Boolean isReviewedAnnualRevenue) {
        this.isReviewedAnnualRevenue = isReviewedAnnualRevenue;
    }


    /**
     * Gets the isReviewedCompanyName value for this AccountCleanInfo.
     * 
     * @return isReviewedCompanyName
     */
    public java.lang.Boolean getIsReviewedCompanyName() {
        return isReviewedCompanyName;
    }


    /**
     * Sets the isReviewedCompanyName value for this AccountCleanInfo.
     * 
     * @param isReviewedCompanyName
     */
    public void setIsReviewedCompanyName(java.lang.Boolean isReviewedCompanyName) {
        this.isReviewedCompanyName = isReviewedCompanyName;
    }


    /**
     * Gets the isReviewedDandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @return isReviewedDandBCompanyDunsNumber
     */
    public java.lang.Boolean getIsReviewedDandBCompanyDunsNumber() {
        return isReviewedDandBCompanyDunsNumber;
    }


    /**
     * Sets the isReviewedDandBCompanyDunsNumber value for this AccountCleanInfo.
     * 
     * @param isReviewedDandBCompanyDunsNumber
     */
    public void setIsReviewedDandBCompanyDunsNumber(java.lang.Boolean isReviewedDandBCompanyDunsNumber) {
        this.isReviewedDandBCompanyDunsNumber = isReviewedDandBCompanyDunsNumber;
    }


    /**
     * Gets the isReviewedDescription value for this AccountCleanInfo.
     * 
     * @return isReviewedDescription
     */
    public java.lang.Boolean getIsReviewedDescription() {
        return isReviewedDescription;
    }


    /**
     * Sets the isReviewedDescription value for this AccountCleanInfo.
     * 
     * @param isReviewedDescription
     */
    public void setIsReviewedDescription(java.lang.Boolean isReviewedDescription) {
        this.isReviewedDescription = isReviewedDescription;
    }


    /**
     * Gets the isReviewedDunsNumber value for this AccountCleanInfo.
     * 
     * @return isReviewedDunsNumber
     */
    public java.lang.Boolean getIsReviewedDunsNumber() {
        return isReviewedDunsNumber;
    }


    /**
     * Sets the isReviewedDunsNumber value for this AccountCleanInfo.
     * 
     * @param isReviewedDunsNumber
     */
    public void setIsReviewedDunsNumber(java.lang.Boolean isReviewedDunsNumber) {
        this.isReviewedDunsNumber = isReviewedDunsNumber;
    }


    /**
     * Gets the isReviewedFax value for this AccountCleanInfo.
     * 
     * @return isReviewedFax
     */
    public java.lang.Boolean getIsReviewedFax() {
        return isReviewedFax;
    }


    /**
     * Sets the isReviewedFax value for this AccountCleanInfo.
     * 
     * @param isReviewedFax
     */
    public void setIsReviewedFax(java.lang.Boolean isReviewedFax) {
        this.isReviewedFax = isReviewedFax;
    }


    /**
     * Gets the isReviewedIndustry value for this AccountCleanInfo.
     * 
     * @return isReviewedIndustry
     */
    public java.lang.Boolean getIsReviewedIndustry() {
        return isReviewedIndustry;
    }


    /**
     * Sets the isReviewedIndustry value for this AccountCleanInfo.
     * 
     * @param isReviewedIndustry
     */
    public void setIsReviewedIndustry(java.lang.Boolean isReviewedIndustry) {
        this.isReviewedIndustry = isReviewedIndustry;
    }


    /**
     * Gets the isReviewedNaicsCode value for this AccountCleanInfo.
     * 
     * @return isReviewedNaicsCode
     */
    public java.lang.Boolean getIsReviewedNaicsCode() {
        return isReviewedNaicsCode;
    }


    /**
     * Sets the isReviewedNaicsCode value for this AccountCleanInfo.
     * 
     * @param isReviewedNaicsCode
     */
    public void setIsReviewedNaicsCode(java.lang.Boolean isReviewedNaicsCode) {
        this.isReviewedNaicsCode = isReviewedNaicsCode;
    }


    /**
     * Gets the isReviewedNaicsDescription value for this AccountCleanInfo.
     * 
     * @return isReviewedNaicsDescription
     */
    public java.lang.Boolean getIsReviewedNaicsDescription() {
        return isReviewedNaicsDescription;
    }


    /**
     * Sets the isReviewedNaicsDescription value for this AccountCleanInfo.
     * 
     * @param isReviewedNaicsDescription
     */
    public void setIsReviewedNaicsDescription(java.lang.Boolean isReviewedNaicsDescription) {
        this.isReviewedNaicsDescription = isReviewedNaicsDescription;
    }


    /**
     * Gets the isReviewedNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @return isReviewedNumberOfEmployees
     */
    public java.lang.Boolean getIsReviewedNumberOfEmployees() {
        return isReviewedNumberOfEmployees;
    }


    /**
     * Sets the isReviewedNumberOfEmployees value for this AccountCleanInfo.
     * 
     * @param isReviewedNumberOfEmployees
     */
    public void setIsReviewedNumberOfEmployees(java.lang.Boolean isReviewedNumberOfEmployees) {
        this.isReviewedNumberOfEmployees = isReviewedNumberOfEmployees;
    }


    /**
     * Gets the isReviewedOwnership value for this AccountCleanInfo.
     * 
     * @return isReviewedOwnership
     */
    public java.lang.Boolean getIsReviewedOwnership() {
        return isReviewedOwnership;
    }


    /**
     * Sets the isReviewedOwnership value for this AccountCleanInfo.
     * 
     * @param isReviewedOwnership
     */
    public void setIsReviewedOwnership(java.lang.Boolean isReviewedOwnership) {
        this.isReviewedOwnership = isReviewedOwnership;
    }


    /**
     * Gets the isReviewedPhone value for this AccountCleanInfo.
     * 
     * @return isReviewedPhone
     */
    public java.lang.Boolean getIsReviewedPhone() {
        return isReviewedPhone;
    }


    /**
     * Sets the isReviewedPhone value for this AccountCleanInfo.
     * 
     * @param isReviewedPhone
     */
    public void setIsReviewedPhone(java.lang.Boolean isReviewedPhone) {
        this.isReviewedPhone = isReviewedPhone;
    }


    /**
     * Gets the isReviewedSic value for this AccountCleanInfo.
     * 
     * @return isReviewedSic
     */
    public java.lang.Boolean getIsReviewedSic() {
        return isReviewedSic;
    }


    /**
     * Sets the isReviewedSic value for this AccountCleanInfo.
     * 
     * @param isReviewedSic
     */
    public void setIsReviewedSic(java.lang.Boolean isReviewedSic) {
        this.isReviewedSic = isReviewedSic;
    }


    /**
     * Gets the isReviewedSicDescription value for this AccountCleanInfo.
     * 
     * @return isReviewedSicDescription
     */
    public java.lang.Boolean getIsReviewedSicDescription() {
        return isReviewedSicDescription;
    }


    /**
     * Sets the isReviewedSicDescription value for this AccountCleanInfo.
     * 
     * @param isReviewedSicDescription
     */
    public void setIsReviewedSicDescription(java.lang.Boolean isReviewedSicDescription) {
        this.isReviewedSicDescription = isReviewedSicDescription;
    }


    /**
     * Gets the isReviewedTickerSymbol value for this AccountCleanInfo.
     * 
     * @return isReviewedTickerSymbol
     */
    public java.lang.Boolean getIsReviewedTickerSymbol() {
        return isReviewedTickerSymbol;
    }


    /**
     * Sets the isReviewedTickerSymbol value for this AccountCleanInfo.
     * 
     * @param isReviewedTickerSymbol
     */
    public void setIsReviewedTickerSymbol(java.lang.Boolean isReviewedTickerSymbol) {
        this.isReviewedTickerSymbol = isReviewedTickerSymbol;
    }


    /**
     * Gets the isReviewedTradestyle value for this AccountCleanInfo.
     * 
     * @return isReviewedTradestyle
     */
    public java.lang.Boolean getIsReviewedTradestyle() {
        return isReviewedTradestyle;
    }


    /**
     * Sets the isReviewedTradestyle value for this AccountCleanInfo.
     * 
     * @param isReviewedTradestyle
     */
    public void setIsReviewedTradestyle(java.lang.Boolean isReviewedTradestyle) {
        this.isReviewedTradestyle = isReviewedTradestyle;
    }


    /**
     * Gets the isReviewedWebsite value for this AccountCleanInfo.
     * 
     * @return isReviewedWebsite
     */
    public java.lang.Boolean getIsReviewedWebsite() {
        return isReviewedWebsite;
    }


    /**
     * Sets the isReviewedWebsite value for this AccountCleanInfo.
     * 
     * @param isReviewedWebsite
     */
    public void setIsReviewedWebsite(java.lang.Boolean isReviewedWebsite) {
        this.isReviewedWebsite = isReviewedWebsite;
    }


    /**
     * Gets the isReviewedYearStarted value for this AccountCleanInfo.
     * 
     * @return isReviewedYearStarted
     */
    public java.lang.Boolean getIsReviewedYearStarted() {
        return isReviewedYearStarted;
    }


    /**
     * Sets the isReviewedYearStarted value for this AccountCleanInfo.
     * 
     * @param isReviewedYearStarted
     */
    public void setIsReviewedYearStarted(java.lang.Boolean isReviewedYearStarted) {
        this.isReviewedYearStarted = isReviewedYearStarted;
    }


    /**
     * Gets the lastMatchedDate value for this AccountCleanInfo.
     * 
     * @return lastMatchedDate
     */
    public java.util.Calendar getLastMatchedDate() {
        return lastMatchedDate;
    }


    /**
     * Sets the lastMatchedDate value for this AccountCleanInfo.
     * 
     * @param lastMatchedDate
     */
    public void setLastMatchedDate(java.util.Calendar lastMatchedDate) {
        this.lastMatchedDate = lastMatchedDate;
    }


    /**
     * Gets the lastModifiedBy value for this AccountCleanInfo.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this AccountCleanInfo.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this AccountCleanInfo.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this AccountCleanInfo.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this AccountCleanInfo.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this AccountCleanInfo.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastStatusChangedBy value for this AccountCleanInfo.
     * 
     * @return lastStatusChangedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastStatusChangedBy() {
        return lastStatusChangedBy;
    }


    /**
     * Sets the lastStatusChangedBy value for this AccountCleanInfo.
     * 
     * @param lastStatusChangedBy
     */
    public void setLastStatusChangedBy(com.sforce.soap.enterprise.sobject.User lastStatusChangedBy) {
        this.lastStatusChangedBy = lastStatusChangedBy;
    }


    /**
     * Gets the lastStatusChangedById value for this AccountCleanInfo.
     * 
     * @return lastStatusChangedById
     */
    public java.lang.String getLastStatusChangedById() {
        return lastStatusChangedById;
    }


    /**
     * Sets the lastStatusChangedById value for this AccountCleanInfo.
     * 
     * @param lastStatusChangedById
     */
    public void setLastStatusChangedById(java.lang.String lastStatusChangedById) {
        this.lastStatusChangedById = lastStatusChangedById;
    }


    /**
     * Gets the lastStatusChangedDate value for this AccountCleanInfo.
     * 
     * @return lastStatusChangedDate
     */
    public java.util.Calendar getLastStatusChangedDate() {
        return lastStatusChangedDate;
    }


    /**
     * Sets the lastStatusChangedDate value for this AccountCleanInfo.
     * 
     * @param lastStatusChangedDate
     */
    public void setLastStatusChangedDate(java.util.Calendar lastStatusChangedDate) {
        this.lastStatusChangedDate = lastStatusChangedDate;
    }


    /**
     * Gets the latitude value for this AccountCleanInfo.
     * 
     * @return latitude
     */
    public java.lang.Double getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this AccountCleanInfo.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.Double latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this AccountCleanInfo.
     * 
     * @return longitude
     */
    public java.lang.Double getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this AccountCleanInfo.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.Double longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the naicsCode value for this AccountCleanInfo.
     * 
     * @return naicsCode
     */
    public java.lang.String getNaicsCode() {
        return naicsCode;
    }


    /**
     * Sets the naicsCode value for this AccountCleanInfo.
     * 
     * @param naicsCode
     */
    public void setNaicsCode(java.lang.String naicsCode) {
        this.naicsCode = naicsCode;
    }


    /**
     * Gets the naicsDescription value for this AccountCleanInfo.
     * 
     * @return naicsDescription
     */
    public java.lang.String getNaicsDescription() {
        return naicsDescription;
    }


    /**
     * Sets the naicsDescription value for this AccountCleanInfo.
     * 
     * @param naicsDescription
     */
    public void setNaicsDescription(java.lang.String naicsDescription) {
        this.naicsDescription = naicsDescription;
    }


    /**
     * Gets the name value for this AccountCleanInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountCleanInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfEmployees value for this AccountCleanInfo.
     * 
     * @return numberOfEmployees
     */
    public java.lang.Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    /**
     * Sets the numberOfEmployees value for this AccountCleanInfo.
     * 
     * @param numberOfEmployees
     */
    public void setNumberOfEmployees(java.lang.Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    /**
     * Gets the ownership value for this AccountCleanInfo.
     * 
     * @return ownership
     */
    public java.lang.String getOwnership() {
        return ownership;
    }


    /**
     * Sets the ownership value for this AccountCleanInfo.
     * 
     * @param ownership
     */
    public void setOwnership(java.lang.String ownership) {
        this.ownership = ownership;
    }


    /**
     * Gets the phone value for this AccountCleanInfo.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this AccountCleanInfo.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postalCode value for this AccountCleanInfo.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this AccountCleanInfo.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the sic value for this AccountCleanInfo.
     * 
     * @return sic
     */
    public java.lang.String getSic() {
        return sic;
    }


    /**
     * Sets the sic value for this AccountCleanInfo.
     * 
     * @param sic
     */
    public void setSic(java.lang.String sic) {
        this.sic = sic;
    }


    /**
     * Gets the sicDescription value for this AccountCleanInfo.
     * 
     * @return sicDescription
     */
    public java.lang.String getSicDescription() {
        return sicDescription;
    }


    /**
     * Sets the sicDescription value for this AccountCleanInfo.
     * 
     * @param sicDescription
     */
    public void setSicDescription(java.lang.String sicDescription) {
        this.sicDescription = sicDescription;
    }


    /**
     * Gets the state value for this AccountCleanInfo.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this AccountCleanInfo.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this AccountCleanInfo.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this AccountCleanInfo.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the systemModstamp value for this AccountCleanInfo.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this AccountCleanInfo.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tickerSymbol value for this AccountCleanInfo.
     * 
     * @return tickerSymbol
     */
    public java.lang.String getTickerSymbol() {
        return tickerSymbol;
    }


    /**
     * Sets the tickerSymbol value for this AccountCleanInfo.
     * 
     * @param tickerSymbol
     */
    public void setTickerSymbol(java.lang.String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }


    /**
     * Gets the tradestyle value for this AccountCleanInfo.
     * 
     * @return tradestyle
     */
    public java.lang.String getTradestyle() {
        return tradestyle;
    }


    /**
     * Sets the tradestyle value for this AccountCleanInfo.
     * 
     * @param tradestyle
     */
    public void setTradestyle(java.lang.String tradestyle) {
        this.tradestyle = tradestyle;
    }


    /**
     * Gets the userRecordAccess value for this AccountCleanInfo.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this AccountCleanInfo.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the website value for this AccountCleanInfo.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this AccountCleanInfo.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the yearStarted value for this AccountCleanInfo.
     * 
     * @return yearStarted
     */
    public java.lang.String getYearStarted() {
        return yearStarted;
    }


    /**
     * Sets the yearStarted value for this AccountCleanInfo.
     * 
     * @param yearStarted
     */
    public void setYearStarted(java.lang.String yearStarted) {
        this.yearStarted = yearStarted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountCleanInfo)) return false;
        AccountCleanInfo other = (AccountCleanInfo) obj;
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
            ((this.accountSite==null && other.getAccountSite()==null) || 
             (this.accountSite!=null &&
              this.accountSite.equals(other.getAccountSite()))) &&
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
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.companyStatusDataDotCom==null && other.getCompanyStatusDataDotCom()==null) || 
             (this.companyStatusDataDotCom!=null &&
              this.companyStatusDataDotCom.equals(other.getCompanyStatusDataDotCom()))) &&
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
            ((this.dataDotComId==null && other.getDataDotComId()==null) || 
             (this.dataDotComId!=null &&
              this.dataDotComId.equals(other.getDataDotComId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dunsNumber==null && other.getDunsNumber()==null) || 
             (this.dunsNumber!=null &&
              this.dunsNumber.equals(other.getDunsNumber()))) &&
            ((this.dunsRightMatchConfidence==null && other.getDunsRightMatchConfidence()==null) || 
             (this.dunsRightMatchConfidence!=null &&
              this.dunsRightMatchConfidence.equals(other.getDunsRightMatchConfidence()))) &&
            ((this.dunsRightMatchGrade==null && other.getDunsRightMatchGrade()==null) || 
             (this.dunsRightMatchGrade!=null &&
              this.dunsRightMatchGrade.equals(other.getDunsRightMatchGrade()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.geocodeAccuracy==null && other.getGeocodeAccuracy()==null) || 
             (this.geocodeAccuracy!=null &&
              this.geocodeAccuracy.equals(other.getGeocodeAccuracy()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isDifferentAccountSite==null && other.getIsDifferentAccountSite()==null) || 
             (this.isDifferentAccountSite!=null &&
              this.isDifferentAccountSite.equals(other.getIsDifferentAccountSite()))) &&
            ((this.isDifferentAnnualRevenue==null && other.getIsDifferentAnnualRevenue()==null) || 
             (this.isDifferentAnnualRevenue!=null &&
              this.isDifferentAnnualRevenue.equals(other.getIsDifferentAnnualRevenue()))) &&
            ((this.isDifferentCity==null && other.getIsDifferentCity()==null) || 
             (this.isDifferentCity!=null &&
              this.isDifferentCity.equals(other.getIsDifferentCity()))) &&
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
            ((this.isDifferentDescription==null && other.getIsDifferentDescription()==null) || 
             (this.isDifferentDescription!=null &&
              this.isDifferentDescription.equals(other.getIsDifferentDescription()))) &&
            ((this.isDifferentDunsNumber==null && other.getIsDifferentDunsNumber()==null) || 
             (this.isDifferentDunsNumber!=null &&
              this.isDifferentDunsNumber.equals(other.getIsDifferentDunsNumber()))) &&
            ((this.isDifferentFax==null && other.getIsDifferentFax()==null) || 
             (this.isDifferentFax!=null &&
              this.isDifferentFax.equals(other.getIsDifferentFax()))) &&
            ((this.isDifferentIndustry==null && other.getIsDifferentIndustry()==null) || 
             (this.isDifferentIndustry!=null &&
              this.isDifferentIndustry.equals(other.getIsDifferentIndustry()))) &&
            ((this.isDifferentNaicsCode==null && other.getIsDifferentNaicsCode()==null) || 
             (this.isDifferentNaicsCode!=null &&
              this.isDifferentNaicsCode.equals(other.getIsDifferentNaicsCode()))) &&
            ((this.isDifferentNaicsDescription==null && other.getIsDifferentNaicsDescription()==null) || 
             (this.isDifferentNaicsDescription!=null &&
              this.isDifferentNaicsDescription.equals(other.getIsDifferentNaicsDescription()))) &&
            ((this.isDifferentNumberOfEmployees==null && other.getIsDifferentNumberOfEmployees()==null) || 
             (this.isDifferentNumberOfEmployees!=null &&
              this.isDifferentNumberOfEmployees.equals(other.getIsDifferentNumberOfEmployees()))) &&
            ((this.isDifferentOwnership==null && other.getIsDifferentOwnership()==null) || 
             (this.isDifferentOwnership!=null &&
              this.isDifferentOwnership.equals(other.getIsDifferentOwnership()))) &&
            ((this.isDifferentPhone==null && other.getIsDifferentPhone()==null) || 
             (this.isDifferentPhone!=null &&
              this.isDifferentPhone.equals(other.getIsDifferentPhone()))) &&
            ((this.isDifferentPostalCode==null && other.getIsDifferentPostalCode()==null) || 
             (this.isDifferentPostalCode!=null &&
              this.isDifferentPostalCode.equals(other.getIsDifferentPostalCode()))) &&
            ((this.isDifferentSic==null && other.getIsDifferentSic()==null) || 
             (this.isDifferentSic!=null &&
              this.isDifferentSic.equals(other.getIsDifferentSic()))) &&
            ((this.isDifferentSicDescription==null && other.getIsDifferentSicDescription()==null) || 
             (this.isDifferentSicDescription!=null &&
              this.isDifferentSicDescription.equals(other.getIsDifferentSicDescription()))) &&
            ((this.isDifferentState==null && other.getIsDifferentState()==null) || 
             (this.isDifferentState!=null &&
              this.isDifferentState.equals(other.getIsDifferentState()))) &&
            ((this.isDifferentStateCode==null && other.getIsDifferentStateCode()==null) || 
             (this.isDifferentStateCode!=null &&
              this.isDifferentStateCode.equals(other.getIsDifferentStateCode()))) &&
            ((this.isDifferentStreet==null && other.getIsDifferentStreet()==null) || 
             (this.isDifferentStreet!=null &&
              this.isDifferentStreet.equals(other.getIsDifferentStreet()))) &&
            ((this.isDifferentTickerSymbol==null && other.getIsDifferentTickerSymbol()==null) || 
             (this.isDifferentTickerSymbol!=null &&
              this.isDifferentTickerSymbol.equals(other.getIsDifferentTickerSymbol()))) &&
            ((this.isDifferentTradestyle==null && other.getIsDifferentTradestyle()==null) || 
             (this.isDifferentTradestyle!=null &&
              this.isDifferentTradestyle.equals(other.getIsDifferentTradestyle()))) &&
            ((this.isDifferentWebsite==null && other.getIsDifferentWebsite()==null) || 
             (this.isDifferentWebsite!=null &&
              this.isDifferentWebsite.equals(other.getIsDifferentWebsite()))) &&
            ((this.isDifferentYearStarted==null && other.getIsDifferentYearStarted()==null) || 
             (this.isDifferentYearStarted!=null &&
              this.isDifferentYearStarted.equals(other.getIsDifferentYearStarted()))) &&
            ((this.isFlaggedWrongAccountSite==null && other.getIsFlaggedWrongAccountSite()==null) || 
             (this.isFlaggedWrongAccountSite!=null &&
              this.isFlaggedWrongAccountSite.equals(other.getIsFlaggedWrongAccountSite()))) &&
            ((this.isFlaggedWrongAddress==null && other.getIsFlaggedWrongAddress()==null) || 
             (this.isFlaggedWrongAddress!=null &&
              this.isFlaggedWrongAddress.equals(other.getIsFlaggedWrongAddress()))) &&
            ((this.isFlaggedWrongAnnualRevenue==null && other.getIsFlaggedWrongAnnualRevenue()==null) || 
             (this.isFlaggedWrongAnnualRevenue!=null &&
              this.isFlaggedWrongAnnualRevenue.equals(other.getIsFlaggedWrongAnnualRevenue()))) &&
            ((this.isFlaggedWrongCompanyName==null && other.getIsFlaggedWrongCompanyName()==null) || 
             (this.isFlaggedWrongCompanyName!=null &&
              this.isFlaggedWrongCompanyName.equals(other.getIsFlaggedWrongCompanyName()))) &&
            ((this.isFlaggedWrongDescription==null && other.getIsFlaggedWrongDescription()==null) || 
             (this.isFlaggedWrongDescription!=null &&
              this.isFlaggedWrongDescription.equals(other.getIsFlaggedWrongDescription()))) &&
            ((this.isFlaggedWrongDunsNumber==null && other.getIsFlaggedWrongDunsNumber()==null) || 
             (this.isFlaggedWrongDunsNumber!=null &&
              this.isFlaggedWrongDunsNumber.equals(other.getIsFlaggedWrongDunsNumber()))) &&
            ((this.isFlaggedWrongFax==null && other.getIsFlaggedWrongFax()==null) || 
             (this.isFlaggedWrongFax!=null &&
              this.isFlaggedWrongFax.equals(other.getIsFlaggedWrongFax()))) &&
            ((this.isFlaggedWrongIndustry==null && other.getIsFlaggedWrongIndustry()==null) || 
             (this.isFlaggedWrongIndustry!=null &&
              this.isFlaggedWrongIndustry.equals(other.getIsFlaggedWrongIndustry()))) &&
            ((this.isFlaggedWrongNaicsCode==null && other.getIsFlaggedWrongNaicsCode()==null) || 
             (this.isFlaggedWrongNaicsCode!=null &&
              this.isFlaggedWrongNaicsCode.equals(other.getIsFlaggedWrongNaicsCode()))) &&
            ((this.isFlaggedWrongNaicsDescription==null && other.getIsFlaggedWrongNaicsDescription()==null) || 
             (this.isFlaggedWrongNaicsDescription!=null &&
              this.isFlaggedWrongNaicsDescription.equals(other.getIsFlaggedWrongNaicsDescription()))) &&
            ((this.isFlaggedWrongNumberOfEmployees==null && other.getIsFlaggedWrongNumberOfEmployees()==null) || 
             (this.isFlaggedWrongNumberOfEmployees!=null &&
              this.isFlaggedWrongNumberOfEmployees.equals(other.getIsFlaggedWrongNumberOfEmployees()))) &&
            ((this.isFlaggedWrongOwnership==null && other.getIsFlaggedWrongOwnership()==null) || 
             (this.isFlaggedWrongOwnership!=null &&
              this.isFlaggedWrongOwnership.equals(other.getIsFlaggedWrongOwnership()))) &&
            ((this.isFlaggedWrongPhone==null && other.getIsFlaggedWrongPhone()==null) || 
             (this.isFlaggedWrongPhone!=null &&
              this.isFlaggedWrongPhone.equals(other.getIsFlaggedWrongPhone()))) &&
            ((this.isFlaggedWrongSic==null && other.getIsFlaggedWrongSic()==null) || 
             (this.isFlaggedWrongSic!=null &&
              this.isFlaggedWrongSic.equals(other.getIsFlaggedWrongSic()))) &&
            ((this.isFlaggedWrongSicDescription==null && other.getIsFlaggedWrongSicDescription()==null) || 
             (this.isFlaggedWrongSicDescription!=null &&
              this.isFlaggedWrongSicDescription.equals(other.getIsFlaggedWrongSicDescription()))) &&
            ((this.isFlaggedWrongTickerSymbol==null && other.getIsFlaggedWrongTickerSymbol()==null) || 
             (this.isFlaggedWrongTickerSymbol!=null &&
              this.isFlaggedWrongTickerSymbol.equals(other.getIsFlaggedWrongTickerSymbol()))) &&
            ((this.isFlaggedWrongTradestyle==null && other.getIsFlaggedWrongTradestyle()==null) || 
             (this.isFlaggedWrongTradestyle!=null &&
              this.isFlaggedWrongTradestyle.equals(other.getIsFlaggedWrongTradestyle()))) &&
            ((this.isFlaggedWrongWebsite==null && other.getIsFlaggedWrongWebsite()==null) || 
             (this.isFlaggedWrongWebsite!=null &&
              this.isFlaggedWrongWebsite.equals(other.getIsFlaggedWrongWebsite()))) &&
            ((this.isFlaggedWrongYearStarted==null && other.getIsFlaggedWrongYearStarted()==null) || 
             (this.isFlaggedWrongYearStarted!=null &&
              this.isFlaggedWrongYearStarted.equals(other.getIsFlaggedWrongYearStarted()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isReviewedAccountSite==null && other.getIsReviewedAccountSite()==null) || 
             (this.isReviewedAccountSite!=null &&
              this.isReviewedAccountSite.equals(other.getIsReviewedAccountSite()))) &&
            ((this.isReviewedAddress==null && other.getIsReviewedAddress()==null) || 
             (this.isReviewedAddress!=null &&
              this.isReviewedAddress.equals(other.getIsReviewedAddress()))) &&
            ((this.isReviewedAnnualRevenue==null && other.getIsReviewedAnnualRevenue()==null) || 
             (this.isReviewedAnnualRevenue!=null &&
              this.isReviewedAnnualRevenue.equals(other.getIsReviewedAnnualRevenue()))) &&
            ((this.isReviewedCompanyName==null && other.getIsReviewedCompanyName()==null) || 
             (this.isReviewedCompanyName!=null &&
              this.isReviewedCompanyName.equals(other.getIsReviewedCompanyName()))) &&
            ((this.isReviewedDandBCompanyDunsNumber==null && other.getIsReviewedDandBCompanyDunsNumber()==null) || 
             (this.isReviewedDandBCompanyDunsNumber!=null &&
              this.isReviewedDandBCompanyDunsNumber.equals(other.getIsReviewedDandBCompanyDunsNumber()))) &&
            ((this.isReviewedDescription==null && other.getIsReviewedDescription()==null) || 
             (this.isReviewedDescription!=null &&
              this.isReviewedDescription.equals(other.getIsReviewedDescription()))) &&
            ((this.isReviewedDunsNumber==null && other.getIsReviewedDunsNumber()==null) || 
             (this.isReviewedDunsNumber!=null &&
              this.isReviewedDunsNumber.equals(other.getIsReviewedDunsNumber()))) &&
            ((this.isReviewedFax==null && other.getIsReviewedFax()==null) || 
             (this.isReviewedFax!=null &&
              this.isReviewedFax.equals(other.getIsReviewedFax()))) &&
            ((this.isReviewedIndustry==null && other.getIsReviewedIndustry()==null) || 
             (this.isReviewedIndustry!=null &&
              this.isReviewedIndustry.equals(other.getIsReviewedIndustry()))) &&
            ((this.isReviewedNaicsCode==null && other.getIsReviewedNaicsCode()==null) || 
             (this.isReviewedNaicsCode!=null &&
              this.isReviewedNaicsCode.equals(other.getIsReviewedNaicsCode()))) &&
            ((this.isReviewedNaicsDescription==null && other.getIsReviewedNaicsDescription()==null) || 
             (this.isReviewedNaicsDescription!=null &&
              this.isReviewedNaicsDescription.equals(other.getIsReviewedNaicsDescription()))) &&
            ((this.isReviewedNumberOfEmployees==null && other.getIsReviewedNumberOfEmployees()==null) || 
             (this.isReviewedNumberOfEmployees!=null &&
              this.isReviewedNumberOfEmployees.equals(other.getIsReviewedNumberOfEmployees()))) &&
            ((this.isReviewedOwnership==null && other.getIsReviewedOwnership()==null) || 
             (this.isReviewedOwnership!=null &&
              this.isReviewedOwnership.equals(other.getIsReviewedOwnership()))) &&
            ((this.isReviewedPhone==null && other.getIsReviewedPhone()==null) || 
             (this.isReviewedPhone!=null &&
              this.isReviewedPhone.equals(other.getIsReviewedPhone()))) &&
            ((this.isReviewedSic==null && other.getIsReviewedSic()==null) || 
             (this.isReviewedSic!=null &&
              this.isReviewedSic.equals(other.getIsReviewedSic()))) &&
            ((this.isReviewedSicDescription==null && other.getIsReviewedSicDescription()==null) || 
             (this.isReviewedSicDescription!=null &&
              this.isReviewedSicDescription.equals(other.getIsReviewedSicDescription()))) &&
            ((this.isReviewedTickerSymbol==null && other.getIsReviewedTickerSymbol()==null) || 
             (this.isReviewedTickerSymbol!=null &&
              this.isReviewedTickerSymbol.equals(other.getIsReviewedTickerSymbol()))) &&
            ((this.isReviewedTradestyle==null && other.getIsReviewedTradestyle()==null) || 
             (this.isReviewedTradestyle!=null &&
              this.isReviewedTradestyle.equals(other.getIsReviewedTradestyle()))) &&
            ((this.isReviewedWebsite==null && other.getIsReviewedWebsite()==null) || 
             (this.isReviewedWebsite!=null &&
              this.isReviewedWebsite.equals(other.getIsReviewedWebsite()))) &&
            ((this.isReviewedYearStarted==null && other.getIsReviewedYearStarted()==null) || 
             (this.isReviewedYearStarted!=null &&
              this.isReviewedYearStarted.equals(other.getIsReviewedYearStarted()))) &&
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
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.naicsCode==null && other.getNaicsCode()==null) || 
             (this.naicsCode!=null &&
              this.naicsCode.equals(other.getNaicsCode()))) &&
            ((this.naicsDescription==null && other.getNaicsDescription()==null) || 
             (this.naicsDescription!=null &&
              this.naicsDescription.equals(other.getNaicsDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberOfEmployees==null && other.getNumberOfEmployees()==null) || 
             (this.numberOfEmployees!=null &&
              this.numberOfEmployees.equals(other.getNumberOfEmployees()))) &&
            ((this.ownership==null && other.getOwnership()==null) || 
             (this.ownership!=null &&
              this.ownership.equals(other.getOwnership()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.sic==null && other.getSic()==null) || 
             (this.sic!=null &&
              this.sic.equals(other.getSic()))) &&
            ((this.sicDescription==null && other.getSicDescription()==null) || 
             (this.sicDescription!=null &&
              this.sicDescription.equals(other.getSicDescription()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tickerSymbol==null && other.getTickerSymbol()==null) || 
             (this.tickerSymbol!=null &&
              this.tickerSymbol.equals(other.getTickerSymbol()))) &&
            ((this.tradestyle==null && other.getTradestyle()==null) || 
             (this.tradestyle!=null &&
              this.tradestyle.equals(other.getTradestyle()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.yearStarted==null && other.getYearStarted()==null) || 
             (this.yearStarted!=null &&
              this.yearStarted.equals(other.getYearStarted())));
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
        if (getAccountSite() != null) {
            _hashCode += getAccountSite().hashCode();
        }
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
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getCompanyStatusDataDotCom() != null) {
            _hashCode += getCompanyStatusDataDotCom().hashCode();
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
        if (getDataDotComId() != null) {
            _hashCode += getDataDotComId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDunsNumber() != null) {
            _hashCode += getDunsNumber().hashCode();
        }
        if (getDunsRightMatchConfidence() != null) {
            _hashCode += getDunsRightMatchConfidence().hashCode();
        }
        if (getDunsRightMatchGrade() != null) {
            _hashCode += getDunsRightMatchGrade().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
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
        if (getIsDifferentAccountSite() != null) {
            _hashCode += getIsDifferentAccountSite().hashCode();
        }
        if (getIsDifferentAnnualRevenue() != null) {
            _hashCode += getIsDifferentAnnualRevenue().hashCode();
        }
        if (getIsDifferentCity() != null) {
            _hashCode += getIsDifferentCity().hashCode();
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
        if (getIsDifferentDescription() != null) {
            _hashCode += getIsDifferentDescription().hashCode();
        }
        if (getIsDifferentDunsNumber() != null) {
            _hashCode += getIsDifferentDunsNumber().hashCode();
        }
        if (getIsDifferentFax() != null) {
            _hashCode += getIsDifferentFax().hashCode();
        }
        if (getIsDifferentIndustry() != null) {
            _hashCode += getIsDifferentIndustry().hashCode();
        }
        if (getIsDifferentNaicsCode() != null) {
            _hashCode += getIsDifferentNaicsCode().hashCode();
        }
        if (getIsDifferentNaicsDescription() != null) {
            _hashCode += getIsDifferentNaicsDescription().hashCode();
        }
        if (getIsDifferentNumberOfEmployees() != null) {
            _hashCode += getIsDifferentNumberOfEmployees().hashCode();
        }
        if (getIsDifferentOwnership() != null) {
            _hashCode += getIsDifferentOwnership().hashCode();
        }
        if (getIsDifferentPhone() != null) {
            _hashCode += getIsDifferentPhone().hashCode();
        }
        if (getIsDifferentPostalCode() != null) {
            _hashCode += getIsDifferentPostalCode().hashCode();
        }
        if (getIsDifferentSic() != null) {
            _hashCode += getIsDifferentSic().hashCode();
        }
        if (getIsDifferentSicDescription() != null) {
            _hashCode += getIsDifferentSicDescription().hashCode();
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
        if (getIsDifferentTickerSymbol() != null) {
            _hashCode += getIsDifferentTickerSymbol().hashCode();
        }
        if (getIsDifferentTradestyle() != null) {
            _hashCode += getIsDifferentTradestyle().hashCode();
        }
        if (getIsDifferentWebsite() != null) {
            _hashCode += getIsDifferentWebsite().hashCode();
        }
        if (getIsDifferentYearStarted() != null) {
            _hashCode += getIsDifferentYearStarted().hashCode();
        }
        if (getIsFlaggedWrongAccountSite() != null) {
            _hashCode += getIsFlaggedWrongAccountSite().hashCode();
        }
        if (getIsFlaggedWrongAddress() != null) {
            _hashCode += getIsFlaggedWrongAddress().hashCode();
        }
        if (getIsFlaggedWrongAnnualRevenue() != null) {
            _hashCode += getIsFlaggedWrongAnnualRevenue().hashCode();
        }
        if (getIsFlaggedWrongCompanyName() != null) {
            _hashCode += getIsFlaggedWrongCompanyName().hashCode();
        }
        if (getIsFlaggedWrongDescription() != null) {
            _hashCode += getIsFlaggedWrongDescription().hashCode();
        }
        if (getIsFlaggedWrongDunsNumber() != null) {
            _hashCode += getIsFlaggedWrongDunsNumber().hashCode();
        }
        if (getIsFlaggedWrongFax() != null) {
            _hashCode += getIsFlaggedWrongFax().hashCode();
        }
        if (getIsFlaggedWrongIndustry() != null) {
            _hashCode += getIsFlaggedWrongIndustry().hashCode();
        }
        if (getIsFlaggedWrongNaicsCode() != null) {
            _hashCode += getIsFlaggedWrongNaicsCode().hashCode();
        }
        if (getIsFlaggedWrongNaicsDescription() != null) {
            _hashCode += getIsFlaggedWrongNaicsDescription().hashCode();
        }
        if (getIsFlaggedWrongNumberOfEmployees() != null) {
            _hashCode += getIsFlaggedWrongNumberOfEmployees().hashCode();
        }
        if (getIsFlaggedWrongOwnership() != null) {
            _hashCode += getIsFlaggedWrongOwnership().hashCode();
        }
        if (getIsFlaggedWrongPhone() != null) {
            _hashCode += getIsFlaggedWrongPhone().hashCode();
        }
        if (getIsFlaggedWrongSic() != null) {
            _hashCode += getIsFlaggedWrongSic().hashCode();
        }
        if (getIsFlaggedWrongSicDescription() != null) {
            _hashCode += getIsFlaggedWrongSicDescription().hashCode();
        }
        if (getIsFlaggedWrongTickerSymbol() != null) {
            _hashCode += getIsFlaggedWrongTickerSymbol().hashCode();
        }
        if (getIsFlaggedWrongTradestyle() != null) {
            _hashCode += getIsFlaggedWrongTradestyle().hashCode();
        }
        if (getIsFlaggedWrongWebsite() != null) {
            _hashCode += getIsFlaggedWrongWebsite().hashCode();
        }
        if (getIsFlaggedWrongYearStarted() != null) {
            _hashCode += getIsFlaggedWrongYearStarted().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsReviewedAccountSite() != null) {
            _hashCode += getIsReviewedAccountSite().hashCode();
        }
        if (getIsReviewedAddress() != null) {
            _hashCode += getIsReviewedAddress().hashCode();
        }
        if (getIsReviewedAnnualRevenue() != null) {
            _hashCode += getIsReviewedAnnualRevenue().hashCode();
        }
        if (getIsReviewedCompanyName() != null) {
            _hashCode += getIsReviewedCompanyName().hashCode();
        }
        if (getIsReviewedDandBCompanyDunsNumber() != null) {
            _hashCode += getIsReviewedDandBCompanyDunsNumber().hashCode();
        }
        if (getIsReviewedDescription() != null) {
            _hashCode += getIsReviewedDescription().hashCode();
        }
        if (getIsReviewedDunsNumber() != null) {
            _hashCode += getIsReviewedDunsNumber().hashCode();
        }
        if (getIsReviewedFax() != null) {
            _hashCode += getIsReviewedFax().hashCode();
        }
        if (getIsReviewedIndustry() != null) {
            _hashCode += getIsReviewedIndustry().hashCode();
        }
        if (getIsReviewedNaicsCode() != null) {
            _hashCode += getIsReviewedNaicsCode().hashCode();
        }
        if (getIsReviewedNaicsDescription() != null) {
            _hashCode += getIsReviewedNaicsDescription().hashCode();
        }
        if (getIsReviewedNumberOfEmployees() != null) {
            _hashCode += getIsReviewedNumberOfEmployees().hashCode();
        }
        if (getIsReviewedOwnership() != null) {
            _hashCode += getIsReviewedOwnership().hashCode();
        }
        if (getIsReviewedPhone() != null) {
            _hashCode += getIsReviewedPhone().hashCode();
        }
        if (getIsReviewedSic() != null) {
            _hashCode += getIsReviewedSic().hashCode();
        }
        if (getIsReviewedSicDescription() != null) {
            _hashCode += getIsReviewedSicDescription().hashCode();
        }
        if (getIsReviewedTickerSymbol() != null) {
            _hashCode += getIsReviewedTickerSymbol().hashCode();
        }
        if (getIsReviewedTradestyle() != null) {
            _hashCode += getIsReviewedTradestyle().hashCode();
        }
        if (getIsReviewedWebsite() != null) {
            _hashCode += getIsReviewedWebsite().hashCode();
        }
        if (getIsReviewedYearStarted() != null) {
            _hashCode += getIsReviewedYearStarted().hashCode();
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
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getNaicsCode() != null) {
            _hashCode += getNaicsCode().hashCode();
        }
        if (getNaicsDescription() != null) {
            _hashCode += getNaicsDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberOfEmployees() != null) {
            _hashCode += getNumberOfEmployees().hashCode();
        }
        if (getOwnership() != null) {
            _hashCode += getOwnership().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getSic() != null) {
            _hashCode += getSic().hashCode();
        }
        if (getSicDescription() != null) {
            _hashCode += getSicDescription().hashCode();
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
        if (getTickerSymbol() != null) {
            _hashCode += getTickerSymbol().hashCode();
        }
        if (getTradestyle() != null) {
            _hashCode += getTradestyle().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getYearStarted() != null) {
            _hashCode += getYearStarted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountCleanInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountCleanInfo"));
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
        elemField.setFieldName("accountSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyStatusDataDotCom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyStatusDataDotCom"));
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
        elemField.setFieldName("dataDotComId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataDotComId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("dunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunsRightMatchConfidence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DunsRightMatchConfidence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dunsRightMatchGrade");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DunsRightMatchGrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
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
        elemField.setFieldName("isDifferentAccountSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentAccountSite"));
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
        elemField.setFieldName("isDifferentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentFax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentFax"));
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
        elemField.setFieldName("isDifferentNaicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentNaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentNaicsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentNaicsDescription"));
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
        elemField.setFieldName("isDifferentOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentOwnership"));
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
        elemField.setFieldName("isDifferentSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentSicDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentSicDescription"));
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
        elemField.setFieldName("isDifferentTickerSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentTickerSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentTradestyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentTradestyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentWebsite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentWebsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDifferentYearStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDifferentYearStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongAccountSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongAccountSite"));
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
        elemField.setFieldName("isFlaggedWrongCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongFax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongFax"));
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
        elemField.setFieldName("isFlaggedWrongNaicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongNaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongNaicsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongNaicsDescription"));
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
        elemField.setFieldName("isFlaggedWrongOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongOwnership"));
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
        elemField.setFieldName("isFlaggedWrongSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongSicDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongSicDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongTickerSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongTickerSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongTradestyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongTradestyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongWebsite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongWebsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFlaggedWrongYearStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsFlaggedWrongYearStarted"));
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
        elemField.setFieldName("isReviewedAccountSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedAccountSite"));
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
        elemField.setFieldName("isReviewedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedFax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedFax"));
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
        elemField.setFieldName("isReviewedNaicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedNaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedNaicsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedNaicsDescription"));
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
        elemField.setFieldName("isReviewedOwnership");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedOwnership"));
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
        elemField.setFieldName("isReviewedSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedSicDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedSicDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedTickerSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedTickerSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedTradestyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedTradestyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedWebsite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedWebsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReviewedYearStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsReviewedYearStarted"));
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
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naicsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsDescription"));
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
        elemField.setFieldName("numberOfEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NumberOfEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownership");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ownership"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("sic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sicDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SicDescription"));
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
        elemField.setFieldName("tickerSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TickerSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradestyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tradestyle"));
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
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YearStarted"));
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
