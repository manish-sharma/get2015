/**
 * DatacloudDandBCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class DatacloudDandBCompany  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String companyCurrencyIsoCode;

    private java.lang.String companyId;

    private java.lang.String country;

    private java.lang.String countryAccessCode;

    private java.lang.String currencyCode;

    private java.lang.String description;

    private java.lang.String domesticUltimateBusinessName;

    private java.lang.String domesticUltimateDunsNumber;

    private java.lang.String dunsNumber;

    private java.lang.Double employeeQuantityGrowthRate;

    private java.lang.Double employeesHere;

    private java.lang.String employeesHereReliability;

    private java.lang.Double employeesTotal;

    private java.lang.String employeesTotalReliability;

    private java.lang.String externalId;

    private java.lang.Integer familyMembers;

    private java.lang.String fax;

    private java.lang.String fifthNaics;

    private java.lang.String fifthNaicsDesc;

    private java.lang.String fifthSic;

    private java.lang.String fifthSic8;

    private java.lang.String fifthSic8Desc;

    private java.lang.String fifthSicDesc;

    private java.lang.String fipsMsaCode;

    private java.lang.String fipsMsaDesc;

    private java.lang.Integer fortuneRank;

    private java.lang.String fourthNaics;

    private java.lang.String fourthNaicsDesc;

    private java.lang.String fourthSic;

    private java.lang.String fourthSic8;

    private java.lang.String fourthSic8Desc;

    private java.lang.String fourthSicDesc;

    private java.lang.String geoCodeAccuracy;

    private java.lang.String globalUltimateBusinessName;

    private java.lang.String globalUltimateDunsNumber;

    private java.lang.Double globalUltimateTotalEmployees;

    private java.lang.String importExportAgent;

    private java.lang.String includedInSnP500;

    private java.lang.Boolean isOwned;

    private java.lang.Boolean isParent;

    private java.lang.String latitude;

    private java.lang.String legalStatus;

    private java.lang.String locationStatus;

    private java.lang.String longitude;

    private java.lang.String mailingCity;

    private java.lang.String mailingCountry;

    private java.lang.String mailingState;

    private java.lang.String mailingStreet;

    private java.lang.String mailingZip;

    private java.lang.String marketingPreScreen;

    private java.lang.String marketingSegmentationCluster;

    private java.lang.String minorityOwned;

    private java.lang.String name;

    private java.lang.String nationalId;

    private java.lang.String nationalIdType;

    private java.lang.String outOfBusiness;

    private java.lang.String ownOrRent;

    private java.lang.String parentOrHqBusinessName;

    private java.lang.String parentOrHqDunsNumber;

    private java.lang.String phone;

    private java.lang.Integer premisesMeasure;

    private java.lang.String premisesMeasureReliability;

    private java.lang.String premisesMeasureUnit;

    private java.lang.String primaryNaics;

    private java.lang.String primaryNaicsDesc;

    private java.lang.String primarySic;

    private java.lang.String primarySic8;

    private java.lang.String primarySic8Desc;

    private java.lang.String primarySicDesc;

    private java.lang.Integer priorYearEmployees;

    private java.lang.Double priorYearRevenue;

    private java.lang.String publicIndicator;

    private java.lang.Double salesTurnoverGrowthRate;

    private java.lang.Double salesVolume;

    private java.lang.String salesVolumeReliability;

    private java.lang.String secondNaics;

    private java.lang.String secondNaicsDesc;

    private java.lang.String secondSic;

    private java.lang.String secondSic8;

    private java.lang.String secondSic8Desc;

    private java.lang.String secondSicDesc;

    private java.lang.String sixthNaics;

    private java.lang.String sixthNaicsDesc;

    private java.lang.String sixthSic;

    private java.lang.String sixthSic8;

    private java.lang.String sixthSic8Desc;

    private java.lang.String sixthSicDesc;

    private java.lang.String smallBusiness;

    private java.lang.String state;

    private java.lang.String stockExchange;

    private java.lang.String stockSymbol;

    private java.lang.String street;

    private java.lang.String subsidiary;

    private java.lang.String thirdNaics;

    private java.lang.String thirdNaicsDesc;

    private java.lang.String thirdSic;

    private java.lang.String thirdSic8;

    private java.lang.String thirdSic8Desc;

    private java.lang.String thirdSicDesc;

    private java.lang.String tradeStyle1;

    private java.lang.String tradeStyle2;

    private java.lang.String tradeStyle3;

    private java.lang.String tradeStyle4;

    private java.lang.String tradeStyle5;

    private java.lang.String URL;

    private java.lang.String usTaxId;

    private java.lang.String womenOwned;

    private java.lang.String yearStarted;

    private java.lang.String zip;

    public DatacloudDandBCompany() {
    }

    public DatacloudDandBCompany(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String city,
           java.lang.String companyCurrencyIsoCode,
           java.lang.String companyId,
           java.lang.String country,
           java.lang.String countryAccessCode,
           java.lang.String currencyCode,
           java.lang.String description,
           java.lang.String domesticUltimateBusinessName,
           java.lang.String domesticUltimateDunsNumber,
           java.lang.String dunsNumber,
           java.lang.Double employeeQuantityGrowthRate,
           java.lang.Double employeesHere,
           java.lang.String employeesHereReliability,
           java.lang.Double employeesTotal,
           java.lang.String employeesTotalReliability,
           java.lang.String externalId,
           java.lang.Integer familyMembers,
           java.lang.String fax,
           java.lang.String fifthNaics,
           java.lang.String fifthNaicsDesc,
           java.lang.String fifthSic,
           java.lang.String fifthSic8,
           java.lang.String fifthSic8Desc,
           java.lang.String fifthSicDesc,
           java.lang.String fipsMsaCode,
           java.lang.String fipsMsaDesc,
           java.lang.Integer fortuneRank,
           java.lang.String fourthNaics,
           java.lang.String fourthNaicsDesc,
           java.lang.String fourthSic,
           java.lang.String fourthSic8,
           java.lang.String fourthSic8Desc,
           java.lang.String fourthSicDesc,
           java.lang.String geoCodeAccuracy,
           java.lang.String globalUltimateBusinessName,
           java.lang.String globalUltimateDunsNumber,
           java.lang.Double globalUltimateTotalEmployees,
           java.lang.String importExportAgent,
           java.lang.String includedInSnP500,
           java.lang.Boolean isOwned,
           java.lang.Boolean isParent,
           java.lang.String latitude,
           java.lang.String legalStatus,
           java.lang.String locationStatus,
           java.lang.String longitude,
           java.lang.String mailingCity,
           java.lang.String mailingCountry,
           java.lang.String mailingState,
           java.lang.String mailingStreet,
           java.lang.String mailingZip,
           java.lang.String marketingPreScreen,
           java.lang.String marketingSegmentationCluster,
           java.lang.String minorityOwned,
           java.lang.String name,
           java.lang.String nationalId,
           java.lang.String nationalIdType,
           java.lang.String outOfBusiness,
           java.lang.String ownOrRent,
           java.lang.String parentOrHqBusinessName,
           java.lang.String parentOrHqDunsNumber,
           java.lang.String phone,
           java.lang.Integer premisesMeasure,
           java.lang.String premisesMeasureReliability,
           java.lang.String premisesMeasureUnit,
           java.lang.String primaryNaics,
           java.lang.String primaryNaicsDesc,
           java.lang.String primarySic,
           java.lang.String primarySic8,
           java.lang.String primarySic8Desc,
           java.lang.String primarySicDesc,
           java.lang.Integer priorYearEmployees,
           java.lang.Double priorYearRevenue,
           java.lang.String publicIndicator,
           java.lang.Double salesTurnoverGrowthRate,
           java.lang.Double salesVolume,
           java.lang.String salesVolumeReliability,
           java.lang.String secondNaics,
           java.lang.String secondNaicsDesc,
           java.lang.String secondSic,
           java.lang.String secondSic8,
           java.lang.String secondSic8Desc,
           java.lang.String secondSicDesc,
           java.lang.String sixthNaics,
           java.lang.String sixthNaicsDesc,
           java.lang.String sixthSic,
           java.lang.String sixthSic8,
           java.lang.String sixthSic8Desc,
           java.lang.String sixthSicDesc,
           java.lang.String smallBusiness,
           java.lang.String state,
           java.lang.String stockExchange,
           java.lang.String stockSymbol,
           java.lang.String street,
           java.lang.String subsidiary,
           java.lang.String thirdNaics,
           java.lang.String thirdNaicsDesc,
           java.lang.String thirdSic,
           java.lang.String thirdSic8,
           java.lang.String thirdSic8Desc,
           java.lang.String thirdSicDesc,
           java.lang.String tradeStyle1,
           java.lang.String tradeStyle2,
           java.lang.String tradeStyle3,
           java.lang.String tradeStyle4,
           java.lang.String tradeStyle5,
           java.lang.String URL,
           java.lang.String usTaxId,
           java.lang.String womenOwned,
           java.lang.String yearStarted,
           java.lang.String zip) {
        super(
            fieldsToNull,
            id);
        this.city = city;
        this.companyCurrencyIsoCode = companyCurrencyIsoCode;
        this.companyId = companyId;
        this.country = country;
        this.countryAccessCode = countryAccessCode;
        this.currencyCode = currencyCode;
        this.description = description;
        this.domesticUltimateBusinessName = domesticUltimateBusinessName;
        this.domesticUltimateDunsNumber = domesticUltimateDunsNumber;
        this.dunsNumber = dunsNumber;
        this.employeeQuantityGrowthRate = employeeQuantityGrowthRate;
        this.employeesHere = employeesHere;
        this.employeesHereReliability = employeesHereReliability;
        this.employeesTotal = employeesTotal;
        this.employeesTotalReliability = employeesTotalReliability;
        this.externalId = externalId;
        this.familyMembers = familyMembers;
        this.fax = fax;
        this.fifthNaics = fifthNaics;
        this.fifthNaicsDesc = fifthNaicsDesc;
        this.fifthSic = fifthSic;
        this.fifthSic8 = fifthSic8;
        this.fifthSic8Desc = fifthSic8Desc;
        this.fifthSicDesc = fifthSicDesc;
        this.fipsMsaCode = fipsMsaCode;
        this.fipsMsaDesc = fipsMsaDesc;
        this.fortuneRank = fortuneRank;
        this.fourthNaics = fourthNaics;
        this.fourthNaicsDesc = fourthNaicsDesc;
        this.fourthSic = fourthSic;
        this.fourthSic8 = fourthSic8;
        this.fourthSic8Desc = fourthSic8Desc;
        this.fourthSicDesc = fourthSicDesc;
        this.geoCodeAccuracy = geoCodeAccuracy;
        this.globalUltimateBusinessName = globalUltimateBusinessName;
        this.globalUltimateDunsNumber = globalUltimateDunsNumber;
        this.globalUltimateTotalEmployees = globalUltimateTotalEmployees;
        this.importExportAgent = importExportAgent;
        this.includedInSnP500 = includedInSnP500;
        this.isOwned = isOwned;
        this.isParent = isParent;
        this.latitude = latitude;
        this.legalStatus = legalStatus;
        this.locationStatus = locationStatus;
        this.longitude = longitude;
        this.mailingCity = mailingCity;
        this.mailingCountry = mailingCountry;
        this.mailingState = mailingState;
        this.mailingStreet = mailingStreet;
        this.mailingZip = mailingZip;
        this.marketingPreScreen = marketingPreScreen;
        this.marketingSegmentationCluster = marketingSegmentationCluster;
        this.minorityOwned = minorityOwned;
        this.name = name;
        this.nationalId = nationalId;
        this.nationalIdType = nationalIdType;
        this.outOfBusiness = outOfBusiness;
        this.ownOrRent = ownOrRent;
        this.parentOrHqBusinessName = parentOrHqBusinessName;
        this.parentOrHqDunsNumber = parentOrHqDunsNumber;
        this.phone = phone;
        this.premisesMeasure = premisesMeasure;
        this.premisesMeasureReliability = premisesMeasureReliability;
        this.premisesMeasureUnit = premisesMeasureUnit;
        this.primaryNaics = primaryNaics;
        this.primaryNaicsDesc = primaryNaicsDesc;
        this.primarySic = primarySic;
        this.primarySic8 = primarySic8;
        this.primarySic8Desc = primarySic8Desc;
        this.primarySicDesc = primarySicDesc;
        this.priorYearEmployees = priorYearEmployees;
        this.priorYearRevenue = priorYearRevenue;
        this.publicIndicator = publicIndicator;
        this.salesTurnoverGrowthRate = salesTurnoverGrowthRate;
        this.salesVolume = salesVolume;
        this.salesVolumeReliability = salesVolumeReliability;
        this.secondNaics = secondNaics;
        this.secondNaicsDesc = secondNaicsDesc;
        this.secondSic = secondSic;
        this.secondSic8 = secondSic8;
        this.secondSic8Desc = secondSic8Desc;
        this.secondSicDesc = secondSicDesc;
        this.sixthNaics = sixthNaics;
        this.sixthNaicsDesc = sixthNaicsDesc;
        this.sixthSic = sixthSic;
        this.sixthSic8 = sixthSic8;
        this.sixthSic8Desc = sixthSic8Desc;
        this.sixthSicDesc = sixthSicDesc;
        this.smallBusiness = smallBusiness;
        this.state = state;
        this.stockExchange = stockExchange;
        this.stockSymbol = stockSymbol;
        this.street = street;
        this.subsidiary = subsidiary;
        this.thirdNaics = thirdNaics;
        this.thirdNaicsDesc = thirdNaicsDesc;
        this.thirdSic = thirdSic;
        this.thirdSic8 = thirdSic8;
        this.thirdSic8Desc = thirdSic8Desc;
        this.thirdSicDesc = thirdSicDesc;
        this.tradeStyle1 = tradeStyle1;
        this.tradeStyle2 = tradeStyle2;
        this.tradeStyle3 = tradeStyle3;
        this.tradeStyle4 = tradeStyle4;
        this.tradeStyle5 = tradeStyle5;
        this.URL = URL;
        this.usTaxId = usTaxId;
        this.womenOwned = womenOwned;
        this.yearStarted = yearStarted;
        this.zip = zip;
    }


    /**
     * Gets the city value for this DatacloudDandBCompany.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DatacloudDandBCompany.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the companyCurrencyIsoCode value for this DatacloudDandBCompany.
     * 
     * @return companyCurrencyIsoCode
     */
    public java.lang.String getCompanyCurrencyIsoCode() {
        return companyCurrencyIsoCode;
    }


    /**
     * Sets the companyCurrencyIsoCode value for this DatacloudDandBCompany.
     * 
     * @param companyCurrencyIsoCode
     */
    public void setCompanyCurrencyIsoCode(java.lang.String companyCurrencyIsoCode) {
        this.companyCurrencyIsoCode = companyCurrencyIsoCode;
    }


    /**
     * Gets the companyId value for this DatacloudDandBCompany.
     * 
     * @return companyId
     */
    public java.lang.String getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this DatacloudDandBCompany.
     * 
     * @param companyId
     */
    public void setCompanyId(java.lang.String companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the country value for this DatacloudDandBCompany.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DatacloudDandBCompany.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the countryAccessCode value for this DatacloudDandBCompany.
     * 
     * @return countryAccessCode
     */
    public java.lang.String getCountryAccessCode() {
        return countryAccessCode;
    }


    /**
     * Sets the countryAccessCode value for this DatacloudDandBCompany.
     * 
     * @param countryAccessCode
     */
    public void setCountryAccessCode(java.lang.String countryAccessCode) {
        this.countryAccessCode = countryAccessCode;
    }


    /**
     * Gets the currencyCode value for this DatacloudDandBCompany.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this DatacloudDandBCompany.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the description value for this DatacloudDandBCompany.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DatacloudDandBCompany.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the domesticUltimateBusinessName value for this DatacloudDandBCompany.
     * 
     * @return domesticUltimateBusinessName
     */
    public java.lang.String getDomesticUltimateBusinessName() {
        return domesticUltimateBusinessName;
    }


    /**
     * Sets the domesticUltimateBusinessName value for this DatacloudDandBCompany.
     * 
     * @param domesticUltimateBusinessName
     */
    public void setDomesticUltimateBusinessName(java.lang.String domesticUltimateBusinessName) {
        this.domesticUltimateBusinessName = domesticUltimateBusinessName;
    }


    /**
     * Gets the domesticUltimateDunsNumber value for this DatacloudDandBCompany.
     * 
     * @return domesticUltimateDunsNumber
     */
    public java.lang.String getDomesticUltimateDunsNumber() {
        return domesticUltimateDunsNumber;
    }


    /**
     * Sets the domesticUltimateDunsNumber value for this DatacloudDandBCompany.
     * 
     * @param domesticUltimateDunsNumber
     */
    public void setDomesticUltimateDunsNumber(java.lang.String domesticUltimateDunsNumber) {
        this.domesticUltimateDunsNumber = domesticUltimateDunsNumber;
    }


    /**
     * Gets the dunsNumber value for this DatacloudDandBCompany.
     * 
     * @return dunsNumber
     */
    public java.lang.String getDunsNumber() {
        return dunsNumber;
    }


    /**
     * Sets the dunsNumber value for this DatacloudDandBCompany.
     * 
     * @param dunsNumber
     */
    public void setDunsNumber(java.lang.String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }


    /**
     * Gets the employeeQuantityGrowthRate value for this DatacloudDandBCompany.
     * 
     * @return employeeQuantityGrowthRate
     */
    public java.lang.Double getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }


    /**
     * Sets the employeeQuantityGrowthRate value for this DatacloudDandBCompany.
     * 
     * @param employeeQuantityGrowthRate
     */
    public void setEmployeeQuantityGrowthRate(java.lang.Double employeeQuantityGrowthRate) {
        this.employeeQuantityGrowthRate = employeeQuantityGrowthRate;
    }


    /**
     * Gets the employeesHere value for this DatacloudDandBCompany.
     * 
     * @return employeesHere
     */
    public java.lang.Double getEmployeesHere() {
        return employeesHere;
    }


    /**
     * Sets the employeesHere value for this DatacloudDandBCompany.
     * 
     * @param employeesHere
     */
    public void setEmployeesHere(java.lang.Double employeesHere) {
        this.employeesHere = employeesHere;
    }


    /**
     * Gets the employeesHereReliability value for this DatacloudDandBCompany.
     * 
     * @return employeesHereReliability
     */
    public java.lang.String getEmployeesHereReliability() {
        return employeesHereReliability;
    }


    /**
     * Sets the employeesHereReliability value for this DatacloudDandBCompany.
     * 
     * @param employeesHereReliability
     */
    public void setEmployeesHereReliability(java.lang.String employeesHereReliability) {
        this.employeesHereReliability = employeesHereReliability;
    }


    /**
     * Gets the employeesTotal value for this DatacloudDandBCompany.
     * 
     * @return employeesTotal
     */
    public java.lang.Double getEmployeesTotal() {
        return employeesTotal;
    }


    /**
     * Sets the employeesTotal value for this DatacloudDandBCompany.
     * 
     * @param employeesTotal
     */
    public void setEmployeesTotal(java.lang.Double employeesTotal) {
        this.employeesTotal = employeesTotal;
    }


    /**
     * Gets the employeesTotalReliability value for this DatacloudDandBCompany.
     * 
     * @return employeesTotalReliability
     */
    public java.lang.String getEmployeesTotalReliability() {
        return employeesTotalReliability;
    }


    /**
     * Sets the employeesTotalReliability value for this DatacloudDandBCompany.
     * 
     * @param employeesTotalReliability
     */
    public void setEmployeesTotalReliability(java.lang.String employeesTotalReliability) {
        this.employeesTotalReliability = employeesTotalReliability;
    }


    /**
     * Gets the externalId value for this DatacloudDandBCompany.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this DatacloudDandBCompany.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the familyMembers value for this DatacloudDandBCompany.
     * 
     * @return familyMembers
     */
    public java.lang.Integer getFamilyMembers() {
        return familyMembers;
    }


    /**
     * Sets the familyMembers value for this DatacloudDandBCompany.
     * 
     * @param familyMembers
     */
    public void setFamilyMembers(java.lang.Integer familyMembers) {
        this.familyMembers = familyMembers;
    }


    /**
     * Gets the fax value for this DatacloudDandBCompany.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this DatacloudDandBCompany.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the fifthNaics value for this DatacloudDandBCompany.
     * 
     * @return fifthNaics
     */
    public java.lang.String getFifthNaics() {
        return fifthNaics;
    }


    /**
     * Sets the fifthNaics value for this DatacloudDandBCompany.
     * 
     * @param fifthNaics
     */
    public void setFifthNaics(java.lang.String fifthNaics) {
        this.fifthNaics = fifthNaics;
    }


    /**
     * Gets the fifthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return fifthNaicsDesc
     */
    public java.lang.String getFifthNaicsDesc() {
        return fifthNaicsDesc;
    }


    /**
     * Sets the fifthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param fifthNaicsDesc
     */
    public void setFifthNaicsDesc(java.lang.String fifthNaicsDesc) {
        this.fifthNaicsDesc = fifthNaicsDesc;
    }


    /**
     * Gets the fifthSic value for this DatacloudDandBCompany.
     * 
     * @return fifthSic
     */
    public java.lang.String getFifthSic() {
        return fifthSic;
    }


    /**
     * Sets the fifthSic value for this DatacloudDandBCompany.
     * 
     * @param fifthSic
     */
    public void setFifthSic(java.lang.String fifthSic) {
        this.fifthSic = fifthSic;
    }


    /**
     * Gets the fifthSic8 value for this DatacloudDandBCompany.
     * 
     * @return fifthSic8
     */
    public java.lang.String getFifthSic8() {
        return fifthSic8;
    }


    /**
     * Sets the fifthSic8 value for this DatacloudDandBCompany.
     * 
     * @param fifthSic8
     */
    public void setFifthSic8(java.lang.String fifthSic8) {
        this.fifthSic8 = fifthSic8;
    }


    /**
     * Gets the fifthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @return fifthSic8Desc
     */
    public java.lang.String getFifthSic8Desc() {
        return fifthSic8Desc;
    }


    /**
     * Sets the fifthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @param fifthSic8Desc
     */
    public void setFifthSic8Desc(java.lang.String fifthSic8Desc) {
        this.fifthSic8Desc = fifthSic8Desc;
    }


    /**
     * Gets the fifthSicDesc value for this DatacloudDandBCompany.
     * 
     * @return fifthSicDesc
     */
    public java.lang.String getFifthSicDesc() {
        return fifthSicDesc;
    }


    /**
     * Sets the fifthSicDesc value for this DatacloudDandBCompany.
     * 
     * @param fifthSicDesc
     */
    public void setFifthSicDesc(java.lang.String fifthSicDesc) {
        this.fifthSicDesc = fifthSicDesc;
    }


    /**
     * Gets the fipsMsaCode value for this DatacloudDandBCompany.
     * 
     * @return fipsMsaCode
     */
    public java.lang.String getFipsMsaCode() {
        return fipsMsaCode;
    }


    /**
     * Sets the fipsMsaCode value for this DatacloudDandBCompany.
     * 
     * @param fipsMsaCode
     */
    public void setFipsMsaCode(java.lang.String fipsMsaCode) {
        this.fipsMsaCode = fipsMsaCode;
    }


    /**
     * Gets the fipsMsaDesc value for this DatacloudDandBCompany.
     * 
     * @return fipsMsaDesc
     */
    public java.lang.String getFipsMsaDesc() {
        return fipsMsaDesc;
    }


    /**
     * Sets the fipsMsaDesc value for this DatacloudDandBCompany.
     * 
     * @param fipsMsaDesc
     */
    public void setFipsMsaDesc(java.lang.String fipsMsaDesc) {
        this.fipsMsaDesc = fipsMsaDesc;
    }


    /**
     * Gets the fortuneRank value for this DatacloudDandBCompany.
     * 
     * @return fortuneRank
     */
    public java.lang.Integer getFortuneRank() {
        return fortuneRank;
    }


    /**
     * Sets the fortuneRank value for this DatacloudDandBCompany.
     * 
     * @param fortuneRank
     */
    public void setFortuneRank(java.lang.Integer fortuneRank) {
        this.fortuneRank = fortuneRank;
    }


    /**
     * Gets the fourthNaics value for this DatacloudDandBCompany.
     * 
     * @return fourthNaics
     */
    public java.lang.String getFourthNaics() {
        return fourthNaics;
    }


    /**
     * Sets the fourthNaics value for this DatacloudDandBCompany.
     * 
     * @param fourthNaics
     */
    public void setFourthNaics(java.lang.String fourthNaics) {
        this.fourthNaics = fourthNaics;
    }


    /**
     * Gets the fourthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return fourthNaicsDesc
     */
    public java.lang.String getFourthNaicsDesc() {
        return fourthNaicsDesc;
    }


    /**
     * Sets the fourthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param fourthNaicsDesc
     */
    public void setFourthNaicsDesc(java.lang.String fourthNaicsDesc) {
        this.fourthNaicsDesc = fourthNaicsDesc;
    }


    /**
     * Gets the fourthSic value for this DatacloudDandBCompany.
     * 
     * @return fourthSic
     */
    public java.lang.String getFourthSic() {
        return fourthSic;
    }


    /**
     * Sets the fourthSic value for this DatacloudDandBCompany.
     * 
     * @param fourthSic
     */
    public void setFourthSic(java.lang.String fourthSic) {
        this.fourthSic = fourthSic;
    }


    /**
     * Gets the fourthSic8 value for this DatacloudDandBCompany.
     * 
     * @return fourthSic8
     */
    public java.lang.String getFourthSic8() {
        return fourthSic8;
    }


    /**
     * Sets the fourthSic8 value for this DatacloudDandBCompany.
     * 
     * @param fourthSic8
     */
    public void setFourthSic8(java.lang.String fourthSic8) {
        this.fourthSic8 = fourthSic8;
    }


    /**
     * Gets the fourthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @return fourthSic8Desc
     */
    public java.lang.String getFourthSic8Desc() {
        return fourthSic8Desc;
    }


    /**
     * Sets the fourthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @param fourthSic8Desc
     */
    public void setFourthSic8Desc(java.lang.String fourthSic8Desc) {
        this.fourthSic8Desc = fourthSic8Desc;
    }


    /**
     * Gets the fourthSicDesc value for this DatacloudDandBCompany.
     * 
     * @return fourthSicDesc
     */
    public java.lang.String getFourthSicDesc() {
        return fourthSicDesc;
    }


    /**
     * Sets the fourthSicDesc value for this DatacloudDandBCompany.
     * 
     * @param fourthSicDesc
     */
    public void setFourthSicDesc(java.lang.String fourthSicDesc) {
        this.fourthSicDesc = fourthSicDesc;
    }


    /**
     * Gets the geoCodeAccuracy value for this DatacloudDandBCompany.
     * 
     * @return geoCodeAccuracy
     */
    public java.lang.String getGeoCodeAccuracy() {
        return geoCodeAccuracy;
    }


    /**
     * Sets the geoCodeAccuracy value for this DatacloudDandBCompany.
     * 
     * @param geoCodeAccuracy
     */
    public void setGeoCodeAccuracy(java.lang.String geoCodeAccuracy) {
        this.geoCodeAccuracy = geoCodeAccuracy;
    }


    /**
     * Gets the globalUltimateBusinessName value for this DatacloudDandBCompany.
     * 
     * @return globalUltimateBusinessName
     */
    public java.lang.String getGlobalUltimateBusinessName() {
        return globalUltimateBusinessName;
    }


    /**
     * Sets the globalUltimateBusinessName value for this DatacloudDandBCompany.
     * 
     * @param globalUltimateBusinessName
     */
    public void setGlobalUltimateBusinessName(java.lang.String globalUltimateBusinessName) {
        this.globalUltimateBusinessName = globalUltimateBusinessName;
    }


    /**
     * Gets the globalUltimateDunsNumber value for this DatacloudDandBCompany.
     * 
     * @return globalUltimateDunsNumber
     */
    public java.lang.String getGlobalUltimateDunsNumber() {
        return globalUltimateDunsNumber;
    }


    /**
     * Sets the globalUltimateDunsNumber value for this DatacloudDandBCompany.
     * 
     * @param globalUltimateDunsNumber
     */
    public void setGlobalUltimateDunsNumber(java.lang.String globalUltimateDunsNumber) {
        this.globalUltimateDunsNumber = globalUltimateDunsNumber;
    }


    /**
     * Gets the globalUltimateTotalEmployees value for this DatacloudDandBCompany.
     * 
     * @return globalUltimateTotalEmployees
     */
    public java.lang.Double getGlobalUltimateTotalEmployees() {
        return globalUltimateTotalEmployees;
    }


    /**
     * Sets the globalUltimateTotalEmployees value for this DatacloudDandBCompany.
     * 
     * @param globalUltimateTotalEmployees
     */
    public void setGlobalUltimateTotalEmployees(java.lang.Double globalUltimateTotalEmployees) {
        this.globalUltimateTotalEmployees = globalUltimateTotalEmployees;
    }


    /**
     * Gets the importExportAgent value for this DatacloudDandBCompany.
     * 
     * @return importExportAgent
     */
    public java.lang.String getImportExportAgent() {
        return importExportAgent;
    }


    /**
     * Sets the importExportAgent value for this DatacloudDandBCompany.
     * 
     * @param importExportAgent
     */
    public void setImportExportAgent(java.lang.String importExportAgent) {
        this.importExportAgent = importExportAgent;
    }


    /**
     * Gets the includedInSnP500 value for this DatacloudDandBCompany.
     * 
     * @return includedInSnP500
     */
    public java.lang.String getIncludedInSnP500() {
        return includedInSnP500;
    }


    /**
     * Sets the includedInSnP500 value for this DatacloudDandBCompany.
     * 
     * @param includedInSnP500
     */
    public void setIncludedInSnP500(java.lang.String includedInSnP500) {
        this.includedInSnP500 = includedInSnP500;
    }


    /**
     * Gets the isOwned value for this DatacloudDandBCompany.
     * 
     * @return isOwned
     */
    public java.lang.Boolean getIsOwned() {
        return isOwned;
    }


    /**
     * Sets the isOwned value for this DatacloudDandBCompany.
     * 
     * @param isOwned
     */
    public void setIsOwned(java.lang.Boolean isOwned) {
        this.isOwned = isOwned;
    }


    /**
     * Gets the isParent value for this DatacloudDandBCompany.
     * 
     * @return isParent
     */
    public java.lang.Boolean getIsParent() {
        return isParent;
    }


    /**
     * Sets the isParent value for this DatacloudDandBCompany.
     * 
     * @param isParent
     */
    public void setIsParent(java.lang.Boolean isParent) {
        this.isParent = isParent;
    }


    /**
     * Gets the latitude value for this DatacloudDandBCompany.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this DatacloudDandBCompany.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the legalStatus value for this DatacloudDandBCompany.
     * 
     * @return legalStatus
     */
    public java.lang.String getLegalStatus() {
        return legalStatus;
    }


    /**
     * Sets the legalStatus value for this DatacloudDandBCompany.
     * 
     * @param legalStatus
     */
    public void setLegalStatus(java.lang.String legalStatus) {
        this.legalStatus = legalStatus;
    }


    /**
     * Gets the locationStatus value for this DatacloudDandBCompany.
     * 
     * @return locationStatus
     */
    public java.lang.String getLocationStatus() {
        return locationStatus;
    }


    /**
     * Sets the locationStatus value for this DatacloudDandBCompany.
     * 
     * @param locationStatus
     */
    public void setLocationStatus(java.lang.String locationStatus) {
        this.locationStatus = locationStatus;
    }


    /**
     * Gets the longitude value for this DatacloudDandBCompany.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this DatacloudDandBCompany.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the mailingCity value for this DatacloudDandBCompany.
     * 
     * @return mailingCity
     */
    public java.lang.String getMailingCity() {
        return mailingCity;
    }


    /**
     * Sets the mailingCity value for this DatacloudDandBCompany.
     * 
     * @param mailingCity
     */
    public void setMailingCity(java.lang.String mailingCity) {
        this.mailingCity = mailingCity;
    }


    /**
     * Gets the mailingCountry value for this DatacloudDandBCompany.
     * 
     * @return mailingCountry
     */
    public java.lang.String getMailingCountry() {
        return mailingCountry;
    }


    /**
     * Sets the mailingCountry value for this DatacloudDandBCompany.
     * 
     * @param mailingCountry
     */
    public void setMailingCountry(java.lang.String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }


    /**
     * Gets the mailingState value for this DatacloudDandBCompany.
     * 
     * @return mailingState
     */
    public java.lang.String getMailingState() {
        return mailingState;
    }


    /**
     * Sets the mailingState value for this DatacloudDandBCompany.
     * 
     * @param mailingState
     */
    public void setMailingState(java.lang.String mailingState) {
        this.mailingState = mailingState;
    }


    /**
     * Gets the mailingStreet value for this DatacloudDandBCompany.
     * 
     * @return mailingStreet
     */
    public java.lang.String getMailingStreet() {
        return mailingStreet;
    }


    /**
     * Sets the mailingStreet value for this DatacloudDandBCompany.
     * 
     * @param mailingStreet
     */
    public void setMailingStreet(java.lang.String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }


    /**
     * Gets the mailingZip value for this DatacloudDandBCompany.
     * 
     * @return mailingZip
     */
    public java.lang.String getMailingZip() {
        return mailingZip;
    }


    /**
     * Sets the mailingZip value for this DatacloudDandBCompany.
     * 
     * @param mailingZip
     */
    public void setMailingZip(java.lang.String mailingZip) {
        this.mailingZip = mailingZip;
    }


    /**
     * Gets the marketingPreScreen value for this DatacloudDandBCompany.
     * 
     * @return marketingPreScreen
     */
    public java.lang.String getMarketingPreScreen() {
        return marketingPreScreen;
    }


    /**
     * Sets the marketingPreScreen value for this DatacloudDandBCompany.
     * 
     * @param marketingPreScreen
     */
    public void setMarketingPreScreen(java.lang.String marketingPreScreen) {
        this.marketingPreScreen = marketingPreScreen;
    }


    /**
     * Gets the marketingSegmentationCluster value for this DatacloudDandBCompany.
     * 
     * @return marketingSegmentationCluster
     */
    public java.lang.String getMarketingSegmentationCluster() {
        return marketingSegmentationCluster;
    }


    /**
     * Sets the marketingSegmentationCluster value for this DatacloudDandBCompany.
     * 
     * @param marketingSegmentationCluster
     */
    public void setMarketingSegmentationCluster(java.lang.String marketingSegmentationCluster) {
        this.marketingSegmentationCluster = marketingSegmentationCluster;
    }


    /**
     * Gets the minorityOwned value for this DatacloudDandBCompany.
     * 
     * @return minorityOwned
     */
    public java.lang.String getMinorityOwned() {
        return minorityOwned;
    }


    /**
     * Sets the minorityOwned value for this DatacloudDandBCompany.
     * 
     * @param minorityOwned
     */
    public void setMinorityOwned(java.lang.String minorityOwned) {
        this.minorityOwned = minorityOwned;
    }


    /**
     * Gets the name value for this DatacloudDandBCompany.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatacloudDandBCompany.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nationalId value for this DatacloudDandBCompany.
     * 
     * @return nationalId
     */
    public java.lang.String getNationalId() {
        return nationalId;
    }


    /**
     * Sets the nationalId value for this DatacloudDandBCompany.
     * 
     * @param nationalId
     */
    public void setNationalId(java.lang.String nationalId) {
        this.nationalId = nationalId;
    }


    /**
     * Gets the nationalIdType value for this DatacloudDandBCompany.
     * 
     * @return nationalIdType
     */
    public java.lang.String getNationalIdType() {
        return nationalIdType;
    }


    /**
     * Sets the nationalIdType value for this DatacloudDandBCompany.
     * 
     * @param nationalIdType
     */
    public void setNationalIdType(java.lang.String nationalIdType) {
        this.nationalIdType = nationalIdType;
    }


    /**
     * Gets the outOfBusiness value for this DatacloudDandBCompany.
     * 
     * @return outOfBusiness
     */
    public java.lang.String getOutOfBusiness() {
        return outOfBusiness;
    }


    /**
     * Sets the outOfBusiness value for this DatacloudDandBCompany.
     * 
     * @param outOfBusiness
     */
    public void setOutOfBusiness(java.lang.String outOfBusiness) {
        this.outOfBusiness = outOfBusiness;
    }


    /**
     * Gets the ownOrRent value for this DatacloudDandBCompany.
     * 
     * @return ownOrRent
     */
    public java.lang.String getOwnOrRent() {
        return ownOrRent;
    }


    /**
     * Sets the ownOrRent value for this DatacloudDandBCompany.
     * 
     * @param ownOrRent
     */
    public void setOwnOrRent(java.lang.String ownOrRent) {
        this.ownOrRent = ownOrRent;
    }


    /**
     * Gets the parentOrHqBusinessName value for this DatacloudDandBCompany.
     * 
     * @return parentOrHqBusinessName
     */
    public java.lang.String getParentOrHqBusinessName() {
        return parentOrHqBusinessName;
    }


    /**
     * Sets the parentOrHqBusinessName value for this DatacloudDandBCompany.
     * 
     * @param parentOrHqBusinessName
     */
    public void setParentOrHqBusinessName(java.lang.String parentOrHqBusinessName) {
        this.parentOrHqBusinessName = parentOrHqBusinessName;
    }


    /**
     * Gets the parentOrHqDunsNumber value for this DatacloudDandBCompany.
     * 
     * @return parentOrHqDunsNumber
     */
    public java.lang.String getParentOrHqDunsNumber() {
        return parentOrHqDunsNumber;
    }


    /**
     * Sets the parentOrHqDunsNumber value for this DatacloudDandBCompany.
     * 
     * @param parentOrHqDunsNumber
     */
    public void setParentOrHqDunsNumber(java.lang.String parentOrHqDunsNumber) {
        this.parentOrHqDunsNumber = parentOrHqDunsNumber;
    }


    /**
     * Gets the phone value for this DatacloudDandBCompany.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this DatacloudDandBCompany.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the premisesMeasure value for this DatacloudDandBCompany.
     * 
     * @return premisesMeasure
     */
    public java.lang.Integer getPremisesMeasure() {
        return premisesMeasure;
    }


    /**
     * Sets the premisesMeasure value for this DatacloudDandBCompany.
     * 
     * @param premisesMeasure
     */
    public void setPremisesMeasure(java.lang.Integer premisesMeasure) {
        this.premisesMeasure = premisesMeasure;
    }


    /**
     * Gets the premisesMeasureReliability value for this DatacloudDandBCompany.
     * 
     * @return premisesMeasureReliability
     */
    public java.lang.String getPremisesMeasureReliability() {
        return premisesMeasureReliability;
    }


    /**
     * Sets the premisesMeasureReliability value for this DatacloudDandBCompany.
     * 
     * @param premisesMeasureReliability
     */
    public void setPremisesMeasureReliability(java.lang.String premisesMeasureReliability) {
        this.premisesMeasureReliability = premisesMeasureReliability;
    }


    /**
     * Gets the premisesMeasureUnit value for this DatacloudDandBCompany.
     * 
     * @return premisesMeasureUnit
     */
    public java.lang.String getPremisesMeasureUnit() {
        return premisesMeasureUnit;
    }


    /**
     * Sets the premisesMeasureUnit value for this DatacloudDandBCompany.
     * 
     * @param premisesMeasureUnit
     */
    public void setPremisesMeasureUnit(java.lang.String premisesMeasureUnit) {
        this.premisesMeasureUnit = premisesMeasureUnit;
    }


    /**
     * Gets the primaryNaics value for this DatacloudDandBCompany.
     * 
     * @return primaryNaics
     */
    public java.lang.String getPrimaryNaics() {
        return primaryNaics;
    }


    /**
     * Sets the primaryNaics value for this DatacloudDandBCompany.
     * 
     * @param primaryNaics
     */
    public void setPrimaryNaics(java.lang.String primaryNaics) {
        this.primaryNaics = primaryNaics;
    }


    /**
     * Gets the primaryNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return primaryNaicsDesc
     */
    public java.lang.String getPrimaryNaicsDesc() {
        return primaryNaicsDesc;
    }


    /**
     * Sets the primaryNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param primaryNaicsDesc
     */
    public void setPrimaryNaicsDesc(java.lang.String primaryNaicsDesc) {
        this.primaryNaicsDesc = primaryNaicsDesc;
    }


    /**
     * Gets the primarySic value for this DatacloudDandBCompany.
     * 
     * @return primarySic
     */
    public java.lang.String getPrimarySic() {
        return primarySic;
    }


    /**
     * Sets the primarySic value for this DatacloudDandBCompany.
     * 
     * @param primarySic
     */
    public void setPrimarySic(java.lang.String primarySic) {
        this.primarySic = primarySic;
    }


    /**
     * Gets the primarySic8 value for this DatacloudDandBCompany.
     * 
     * @return primarySic8
     */
    public java.lang.String getPrimarySic8() {
        return primarySic8;
    }


    /**
     * Sets the primarySic8 value for this DatacloudDandBCompany.
     * 
     * @param primarySic8
     */
    public void setPrimarySic8(java.lang.String primarySic8) {
        this.primarySic8 = primarySic8;
    }


    /**
     * Gets the primarySic8Desc value for this DatacloudDandBCompany.
     * 
     * @return primarySic8Desc
     */
    public java.lang.String getPrimarySic8Desc() {
        return primarySic8Desc;
    }


    /**
     * Sets the primarySic8Desc value for this DatacloudDandBCompany.
     * 
     * @param primarySic8Desc
     */
    public void setPrimarySic8Desc(java.lang.String primarySic8Desc) {
        this.primarySic8Desc = primarySic8Desc;
    }


    /**
     * Gets the primarySicDesc value for this DatacloudDandBCompany.
     * 
     * @return primarySicDesc
     */
    public java.lang.String getPrimarySicDesc() {
        return primarySicDesc;
    }


    /**
     * Sets the primarySicDesc value for this DatacloudDandBCompany.
     * 
     * @param primarySicDesc
     */
    public void setPrimarySicDesc(java.lang.String primarySicDesc) {
        this.primarySicDesc = primarySicDesc;
    }


    /**
     * Gets the priorYearEmployees value for this DatacloudDandBCompany.
     * 
     * @return priorYearEmployees
     */
    public java.lang.Integer getPriorYearEmployees() {
        return priorYearEmployees;
    }


    /**
     * Sets the priorYearEmployees value for this DatacloudDandBCompany.
     * 
     * @param priorYearEmployees
     */
    public void setPriorYearEmployees(java.lang.Integer priorYearEmployees) {
        this.priorYearEmployees = priorYearEmployees;
    }


    /**
     * Gets the priorYearRevenue value for this DatacloudDandBCompany.
     * 
     * @return priorYearRevenue
     */
    public java.lang.Double getPriorYearRevenue() {
        return priorYearRevenue;
    }


    /**
     * Sets the priorYearRevenue value for this DatacloudDandBCompany.
     * 
     * @param priorYearRevenue
     */
    public void setPriorYearRevenue(java.lang.Double priorYearRevenue) {
        this.priorYearRevenue = priorYearRevenue;
    }


    /**
     * Gets the publicIndicator value for this DatacloudDandBCompany.
     * 
     * @return publicIndicator
     */
    public java.lang.String getPublicIndicator() {
        return publicIndicator;
    }


    /**
     * Sets the publicIndicator value for this DatacloudDandBCompany.
     * 
     * @param publicIndicator
     */
    public void setPublicIndicator(java.lang.String publicIndicator) {
        this.publicIndicator = publicIndicator;
    }


    /**
     * Gets the salesTurnoverGrowthRate value for this DatacloudDandBCompany.
     * 
     * @return salesTurnoverGrowthRate
     */
    public java.lang.Double getSalesTurnoverGrowthRate() {
        return salesTurnoverGrowthRate;
    }


    /**
     * Sets the salesTurnoverGrowthRate value for this DatacloudDandBCompany.
     * 
     * @param salesTurnoverGrowthRate
     */
    public void setSalesTurnoverGrowthRate(java.lang.Double salesTurnoverGrowthRate) {
        this.salesTurnoverGrowthRate = salesTurnoverGrowthRate;
    }


    /**
     * Gets the salesVolume value for this DatacloudDandBCompany.
     * 
     * @return salesVolume
     */
    public java.lang.Double getSalesVolume() {
        return salesVolume;
    }


    /**
     * Sets the salesVolume value for this DatacloudDandBCompany.
     * 
     * @param salesVolume
     */
    public void setSalesVolume(java.lang.Double salesVolume) {
        this.salesVolume = salesVolume;
    }


    /**
     * Gets the salesVolumeReliability value for this DatacloudDandBCompany.
     * 
     * @return salesVolumeReliability
     */
    public java.lang.String getSalesVolumeReliability() {
        return salesVolumeReliability;
    }


    /**
     * Sets the salesVolumeReliability value for this DatacloudDandBCompany.
     * 
     * @param salesVolumeReliability
     */
    public void setSalesVolumeReliability(java.lang.String salesVolumeReliability) {
        this.salesVolumeReliability = salesVolumeReliability;
    }


    /**
     * Gets the secondNaics value for this DatacloudDandBCompany.
     * 
     * @return secondNaics
     */
    public java.lang.String getSecondNaics() {
        return secondNaics;
    }


    /**
     * Sets the secondNaics value for this DatacloudDandBCompany.
     * 
     * @param secondNaics
     */
    public void setSecondNaics(java.lang.String secondNaics) {
        this.secondNaics = secondNaics;
    }


    /**
     * Gets the secondNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return secondNaicsDesc
     */
    public java.lang.String getSecondNaicsDesc() {
        return secondNaicsDesc;
    }


    /**
     * Sets the secondNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param secondNaicsDesc
     */
    public void setSecondNaicsDesc(java.lang.String secondNaicsDesc) {
        this.secondNaicsDesc = secondNaicsDesc;
    }


    /**
     * Gets the secondSic value for this DatacloudDandBCompany.
     * 
     * @return secondSic
     */
    public java.lang.String getSecondSic() {
        return secondSic;
    }


    /**
     * Sets the secondSic value for this DatacloudDandBCompany.
     * 
     * @param secondSic
     */
    public void setSecondSic(java.lang.String secondSic) {
        this.secondSic = secondSic;
    }


    /**
     * Gets the secondSic8 value for this DatacloudDandBCompany.
     * 
     * @return secondSic8
     */
    public java.lang.String getSecondSic8() {
        return secondSic8;
    }


    /**
     * Sets the secondSic8 value for this DatacloudDandBCompany.
     * 
     * @param secondSic8
     */
    public void setSecondSic8(java.lang.String secondSic8) {
        this.secondSic8 = secondSic8;
    }


    /**
     * Gets the secondSic8Desc value for this DatacloudDandBCompany.
     * 
     * @return secondSic8Desc
     */
    public java.lang.String getSecondSic8Desc() {
        return secondSic8Desc;
    }


    /**
     * Sets the secondSic8Desc value for this DatacloudDandBCompany.
     * 
     * @param secondSic8Desc
     */
    public void setSecondSic8Desc(java.lang.String secondSic8Desc) {
        this.secondSic8Desc = secondSic8Desc;
    }


    /**
     * Gets the secondSicDesc value for this DatacloudDandBCompany.
     * 
     * @return secondSicDesc
     */
    public java.lang.String getSecondSicDesc() {
        return secondSicDesc;
    }


    /**
     * Sets the secondSicDesc value for this DatacloudDandBCompany.
     * 
     * @param secondSicDesc
     */
    public void setSecondSicDesc(java.lang.String secondSicDesc) {
        this.secondSicDesc = secondSicDesc;
    }


    /**
     * Gets the sixthNaics value for this DatacloudDandBCompany.
     * 
     * @return sixthNaics
     */
    public java.lang.String getSixthNaics() {
        return sixthNaics;
    }


    /**
     * Sets the sixthNaics value for this DatacloudDandBCompany.
     * 
     * @param sixthNaics
     */
    public void setSixthNaics(java.lang.String sixthNaics) {
        this.sixthNaics = sixthNaics;
    }


    /**
     * Gets the sixthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return sixthNaicsDesc
     */
    public java.lang.String getSixthNaicsDesc() {
        return sixthNaicsDesc;
    }


    /**
     * Sets the sixthNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param sixthNaicsDesc
     */
    public void setSixthNaicsDesc(java.lang.String sixthNaicsDesc) {
        this.sixthNaicsDesc = sixthNaicsDesc;
    }


    /**
     * Gets the sixthSic value for this DatacloudDandBCompany.
     * 
     * @return sixthSic
     */
    public java.lang.String getSixthSic() {
        return sixthSic;
    }


    /**
     * Sets the sixthSic value for this DatacloudDandBCompany.
     * 
     * @param sixthSic
     */
    public void setSixthSic(java.lang.String sixthSic) {
        this.sixthSic = sixthSic;
    }


    /**
     * Gets the sixthSic8 value for this DatacloudDandBCompany.
     * 
     * @return sixthSic8
     */
    public java.lang.String getSixthSic8() {
        return sixthSic8;
    }


    /**
     * Sets the sixthSic8 value for this DatacloudDandBCompany.
     * 
     * @param sixthSic8
     */
    public void setSixthSic8(java.lang.String sixthSic8) {
        this.sixthSic8 = sixthSic8;
    }


    /**
     * Gets the sixthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @return sixthSic8Desc
     */
    public java.lang.String getSixthSic8Desc() {
        return sixthSic8Desc;
    }


    /**
     * Sets the sixthSic8Desc value for this DatacloudDandBCompany.
     * 
     * @param sixthSic8Desc
     */
    public void setSixthSic8Desc(java.lang.String sixthSic8Desc) {
        this.sixthSic8Desc = sixthSic8Desc;
    }


    /**
     * Gets the sixthSicDesc value for this DatacloudDandBCompany.
     * 
     * @return sixthSicDesc
     */
    public java.lang.String getSixthSicDesc() {
        return sixthSicDesc;
    }


    /**
     * Sets the sixthSicDesc value for this DatacloudDandBCompany.
     * 
     * @param sixthSicDesc
     */
    public void setSixthSicDesc(java.lang.String sixthSicDesc) {
        this.sixthSicDesc = sixthSicDesc;
    }


    /**
     * Gets the smallBusiness value for this DatacloudDandBCompany.
     * 
     * @return smallBusiness
     */
    public java.lang.String getSmallBusiness() {
        return smallBusiness;
    }


    /**
     * Sets the smallBusiness value for this DatacloudDandBCompany.
     * 
     * @param smallBusiness
     */
    public void setSmallBusiness(java.lang.String smallBusiness) {
        this.smallBusiness = smallBusiness;
    }


    /**
     * Gets the state value for this DatacloudDandBCompany.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this DatacloudDandBCompany.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the stockExchange value for this DatacloudDandBCompany.
     * 
     * @return stockExchange
     */
    public java.lang.String getStockExchange() {
        return stockExchange;
    }


    /**
     * Sets the stockExchange value for this DatacloudDandBCompany.
     * 
     * @param stockExchange
     */
    public void setStockExchange(java.lang.String stockExchange) {
        this.stockExchange = stockExchange;
    }


    /**
     * Gets the stockSymbol value for this DatacloudDandBCompany.
     * 
     * @return stockSymbol
     */
    public java.lang.String getStockSymbol() {
        return stockSymbol;
    }


    /**
     * Sets the stockSymbol value for this DatacloudDandBCompany.
     * 
     * @param stockSymbol
     */
    public void setStockSymbol(java.lang.String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }


    /**
     * Gets the street value for this DatacloudDandBCompany.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this DatacloudDandBCompany.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the subsidiary value for this DatacloudDandBCompany.
     * 
     * @return subsidiary
     */
    public java.lang.String getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this DatacloudDandBCompany.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(java.lang.String subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the thirdNaics value for this DatacloudDandBCompany.
     * 
     * @return thirdNaics
     */
    public java.lang.String getThirdNaics() {
        return thirdNaics;
    }


    /**
     * Sets the thirdNaics value for this DatacloudDandBCompany.
     * 
     * @param thirdNaics
     */
    public void setThirdNaics(java.lang.String thirdNaics) {
        this.thirdNaics = thirdNaics;
    }


    /**
     * Gets the thirdNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @return thirdNaicsDesc
     */
    public java.lang.String getThirdNaicsDesc() {
        return thirdNaicsDesc;
    }


    /**
     * Sets the thirdNaicsDesc value for this DatacloudDandBCompany.
     * 
     * @param thirdNaicsDesc
     */
    public void setThirdNaicsDesc(java.lang.String thirdNaicsDesc) {
        this.thirdNaicsDesc = thirdNaicsDesc;
    }


    /**
     * Gets the thirdSic value for this DatacloudDandBCompany.
     * 
     * @return thirdSic
     */
    public java.lang.String getThirdSic() {
        return thirdSic;
    }


    /**
     * Sets the thirdSic value for this DatacloudDandBCompany.
     * 
     * @param thirdSic
     */
    public void setThirdSic(java.lang.String thirdSic) {
        this.thirdSic = thirdSic;
    }


    /**
     * Gets the thirdSic8 value for this DatacloudDandBCompany.
     * 
     * @return thirdSic8
     */
    public java.lang.String getThirdSic8() {
        return thirdSic8;
    }


    /**
     * Sets the thirdSic8 value for this DatacloudDandBCompany.
     * 
     * @param thirdSic8
     */
    public void setThirdSic8(java.lang.String thirdSic8) {
        this.thirdSic8 = thirdSic8;
    }


    /**
     * Gets the thirdSic8Desc value for this DatacloudDandBCompany.
     * 
     * @return thirdSic8Desc
     */
    public java.lang.String getThirdSic8Desc() {
        return thirdSic8Desc;
    }


    /**
     * Sets the thirdSic8Desc value for this DatacloudDandBCompany.
     * 
     * @param thirdSic8Desc
     */
    public void setThirdSic8Desc(java.lang.String thirdSic8Desc) {
        this.thirdSic8Desc = thirdSic8Desc;
    }


    /**
     * Gets the thirdSicDesc value for this DatacloudDandBCompany.
     * 
     * @return thirdSicDesc
     */
    public java.lang.String getThirdSicDesc() {
        return thirdSicDesc;
    }


    /**
     * Sets the thirdSicDesc value for this DatacloudDandBCompany.
     * 
     * @param thirdSicDesc
     */
    public void setThirdSicDesc(java.lang.String thirdSicDesc) {
        this.thirdSicDesc = thirdSicDesc;
    }


    /**
     * Gets the tradeStyle1 value for this DatacloudDandBCompany.
     * 
     * @return tradeStyle1
     */
    public java.lang.String getTradeStyle1() {
        return tradeStyle1;
    }


    /**
     * Sets the tradeStyle1 value for this DatacloudDandBCompany.
     * 
     * @param tradeStyle1
     */
    public void setTradeStyle1(java.lang.String tradeStyle1) {
        this.tradeStyle1 = tradeStyle1;
    }


    /**
     * Gets the tradeStyle2 value for this DatacloudDandBCompany.
     * 
     * @return tradeStyle2
     */
    public java.lang.String getTradeStyle2() {
        return tradeStyle2;
    }


    /**
     * Sets the tradeStyle2 value for this DatacloudDandBCompany.
     * 
     * @param tradeStyle2
     */
    public void setTradeStyle2(java.lang.String tradeStyle2) {
        this.tradeStyle2 = tradeStyle2;
    }


    /**
     * Gets the tradeStyle3 value for this DatacloudDandBCompany.
     * 
     * @return tradeStyle3
     */
    public java.lang.String getTradeStyle3() {
        return tradeStyle3;
    }


    /**
     * Sets the tradeStyle3 value for this DatacloudDandBCompany.
     * 
     * @param tradeStyle3
     */
    public void setTradeStyle3(java.lang.String tradeStyle3) {
        this.tradeStyle3 = tradeStyle3;
    }


    /**
     * Gets the tradeStyle4 value for this DatacloudDandBCompany.
     * 
     * @return tradeStyle4
     */
    public java.lang.String getTradeStyle4() {
        return tradeStyle4;
    }


    /**
     * Sets the tradeStyle4 value for this DatacloudDandBCompany.
     * 
     * @param tradeStyle4
     */
    public void setTradeStyle4(java.lang.String tradeStyle4) {
        this.tradeStyle4 = tradeStyle4;
    }


    /**
     * Gets the tradeStyle5 value for this DatacloudDandBCompany.
     * 
     * @return tradeStyle5
     */
    public java.lang.String getTradeStyle5() {
        return tradeStyle5;
    }


    /**
     * Sets the tradeStyle5 value for this DatacloudDandBCompany.
     * 
     * @param tradeStyle5
     */
    public void setTradeStyle5(java.lang.String tradeStyle5) {
        this.tradeStyle5 = tradeStyle5;
    }


    /**
     * Gets the URL value for this DatacloudDandBCompany.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this DatacloudDandBCompany.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the usTaxId value for this DatacloudDandBCompany.
     * 
     * @return usTaxId
     */
    public java.lang.String getUsTaxId() {
        return usTaxId;
    }


    /**
     * Sets the usTaxId value for this DatacloudDandBCompany.
     * 
     * @param usTaxId
     */
    public void setUsTaxId(java.lang.String usTaxId) {
        this.usTaxId = usTaxId;
    }


    /**
     * Gets the womenOwned value for this DatacloudDandBCompany.
     * 
     * @return womenOwned
     */
    public java.lang.String getWomenOwned() {
        return womenOwned;
    }


    /**
     * Sets the womenOwned value for this DatacloudDandBCompany.
     * 
     * @param womenOwned
     */
    public void setWomenOwned(java.lang.String womenOwned) {
        this.womenOwned = womenOwned;
    }


    /**
     * Gets the yearStarted value for this DatacloudDandBCompany.
     * 
     * @return yearStarted
     */
    public java.lang.String getYearStarted() {
        return yearStarted;
    }


    /**
     * Sets the yearStarted value for this DatacloudDandBCompany.
     * 
     * @param yearStarted
     */
    public void setYearStarted(java.lang.String yearStarted) {
        this.yearStarted = yearStarted;
    }


    /**
     * Gets the zip value for this DatacloudDandBCompany.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this DatacloudDandBCompany.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacloudDandBCompany)) return false;
        DatacloudDandBCompany other = (DatacloudDandBCompany) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.companyCurrencyIsoCode==null && other.getCompanyCurrencyIsoCode()==null) || 
             (this.companyCurrencyIsoCode!=null &&
              this.companyCurrencyIsoCode.equals(other.getCompanyCurrencyIsoCode()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.countryAccessCode==null && other.getCountryAccessCode()==null) || 
             (this.countryAccessCode!=null &&
              this.countryAccessCode.equals(other.getCountryAccessCode()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.domesticUltimateBusinessName==null && other.getDomesticUltimateBusinessName()==null) || 
             (this.domesticUltimateBusinessName!=null &&
              this.domesticUltimateBusinessName.equals(other.getDomesticUltimateBusinessName()))) &&
            ((this.domesticUltimateDunsNumber==null && other.getDomesticUltimateDunsNumber()==null) || 
             (this.domesticUltimateDunsNumber!=null &&
              this.domesticUltimateDunsNumber.equals(other.getDomesticUltimateDunsNumber()))) &&
            ((this.dunsNumber==null && other.getDunsNumber()==null) || 
             (this.dunsNumber!=null &&
              this.dunsNumber.equals(other.getDunsNumber()))) &&
            ((this.employeeQuantityGrowthRate==null && other.getEmployeeQuantityGrowthRate()==null) || 
             (this.employeeQuantityGrowthRate!=null &&
              this.employeeQuantityGrowthRate.equals(other.getEmployeeQuantityGrowthRate()))) &&
            ((this.employeesHere==null && other.getEmployeesHere()==null) || 
             (this.employeesHere!=null &&
              this.employeesHere.equals(other.getEmployeesHere()))) &&
            ((this.employeesHereReliability==null && other.getEmployeesHereReliability()==null) || 
             (this.employeesHereReliability!=null &&
              this.employeesHereReliability.equals(other.getEmployeesHereReliability()))) &&
            ((this.employeesTotal==null && other.getEmployeesTotal()==null) || 
             (this.employeesTotal!=null &&
              this.employeesTotal.equals(other.getEmployeesTotal()))) &&
            ((this.employeesTotalReliability==null && other.getEmployeesTotalReliability()==null) || 
             (this.employeesTotalReliability!=null &&
              this.employeesTotalReliability.equals(other.getEmployeesTotalReliability()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.familyMembers==null && other.getFamilyMembers()==null) || 
             (this.familyMembers!=null &&
              this.familyMembers.equals(other.getFamilyMembers()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.fifthNaics==null && other.getFifthNaics()==null) || 
             (this.fifthNaics!=null &&
              this.fifthNaics.equals(other.getFifthNaics()))) &&
            ((this.fifthNaicsDesc==null && other.getFifthNaicsDesc()==null) || 
             (this.fifthNaicsDesc!=null &&
              this.fifthNaicsDesc.equals(other.getFifthNaicsDesc()))) &&
            ((this.fifthSic==null && other.getFifthSic()==null) || 
             (this.fifthSic!=null &&
              this.fifthSic.equals(other.getFifthSic()))) &&
            ((this.fifthSic8==null && other.getFifthSic8()==null) || 
             (this.fifthSic8!=null &&
              this.fifthSic8.equals(other.getFifthSic8()))) &&
            ((this.fifthSic8Desc==null && other.getFifthSic8Desc()==null) || 
             (this.fifthSic8Desc!=null &&
              this.fifthSic8Desc.equals(other.getFifthSic8Desc()))) &&
            ((this.fifthSicDesc==null && other.getFifthSicDesc()==null) || 
             (this.fifthSicDesc!=null &&
              this.fifthSicDesc.equals(other.getFifthSicDesc()))) &&
            ((this.fipsMsaCode==null && other.getFipsMsaCode()==null) || 
             (this.fipsMsaCode!=null &&
              this.fipsMsaCode.equals(other.getFipsMsaCode()))) &&
            ((this.fipsMsaDesc==null && other.getFipsMsaDesc()==null) || 
             (this.fipsMsaDesc!=null &&
              this.fipsMsaDesc.equals(other.getFipsMsaDesc()))) &&
            ((this.fortuneRank==null && other.getFortuneRank()==null) || 
             (this.fortuneRank!=null &&
              this.fortuneRank.equals(other.getFortuneRank()))) &&
            ((this.fourthNaics==null && other.getFourthNaics()==null) || 
             (this.fourthNaics!=null &&
              this.fourthNaics.equals(other.getFourthNaics()))) &&
            ((this.fourthNaicsDesc==null && other.getFourthNaicsDesc()==null) || 
             (this.fourthNaicsDesc!=null &&
              this.fourthNaicsDesc.equals(other.getFourthNaicsDesc()))) &&
            ((this.fourthSic==null && other.getFourthSic()==null) || 
             (this.fourthSic!=null &&
              this.fourthSic.equals(other.getFourthSic()))) &&
            ((this.fourthSic8==null && other.getFourthSic8()==null) || 
             (this.fourthSic8!=null &&
              this.fourthSic8.equals(other.getFourthSic8()))) &&
            ((this.fourthSic8Desc==null && other.getFourthSic8Desc()==null) || 
             (this.fourthSic8Desc!=null &&
              this.fourthSic8Desc.equals(other.getFourthSic8Desc()))) &&
            ((this.fourthSicDesc==null && other.getFourthSicDesc()==null) || 
             (this.fourthSicDesc!=null &&
              this.fourthSicDesc.equals(other.getFourthSicDesc()))) &&
            ((this.geoCodeAccuracy==null && other.getGeoCodeAccuracy()==null) || 
             (this.geoCodeAccuracy!=null &&
              this.geoCodeAccuracy.equals(other.getGeoCodeAccuracy()))) &&
            ((this.globalUltimateBusinessName==null && other.getGlobalUltimateBusinessName()==null) || 
             (this.globalUltimateBusinessName!=null &&
              this.globalUltimateBusinessName.equals(other.getGlobalUltimateBusinessName()))) &&
            ((this.globalUltimateDunsNumber==null && other.getGlobalUltimateDunsNumber()==null) || 
             (this.globalUltimateDunsNumber!=null &&
              this.globalUltimateDunsNumber.equals(other.getGlobalUltimateDunsNumber()))) &&
            ((this.globalUltimateTotalEmployees==null && other.getGlobalUltimateTotalEmployees()==null) || 
             (this.globalUltimateTotalEmployees!=null &&
              this.globalUltimateTotalEmployees.equals(other.getGlobalUltimateTotalEmployees()))) &&
            ((this.importExportAgent==null && other.getImportExportAgent()==null) || 
             (this.importExportAgent!=null &&
              this.importExportAgent.equals(other.getImportExportAgent()))) &&
            ((this.includedInSnP500==null && other.getIncludedInSnP500()==null) || 
             (this.includedInSnP500!=null &&
              this.includedInSnP500.equals(other.getIncludedInSnP500()))) &&
            ((this.isOwned==null && other.getIsOwned()==null) || 
             (this.isOwned!=null &&
              this.isOwned.equals(other.getIsOwned()))) &&
            ((this.isParent==null && other.getIsParent()==null) || 
             (this.isParent!=null &&
              this.isParent.equals(other.getIsParent()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.legalStatus==null && other.getLegalStatus()==null) || 
             (this.legalStatus!=null &&
              this.legalStatus.equals(other.getLegalStatus()))) &&
            ((this.locationStatus==null && other.getLocationStatus()==null) || 
             (this.locationStatus!=null &&
              this.locationStatus.equals(other.getLocationStatus()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.mailingCity==null && other.getMailingCity()==null) || 
             (this.mailingCity!=null &&
              this.mailingCity.equals(other.getMailingCity()))) &&
            ((this.mailingCountry==null && other.getMailingCountry()==null) || 
             (this.mailingCountry!=null &&
              this.mailingCountry.equals(other.getMailingCountry()))) &&
            ((this.mailingState==null && other.getMailingState()==null) || 
             (this.mailingState!=null &&
              this.mailingState.equals(other.getMailingState()))) &&
            ((this.mailingStreet==null && other.getMailingStreet()==null) || 
             (this.mailingStreet!=null &&
              this.mailingStreet.equals(other.getMailingStreet()))) &&
            ((this.mailingZip==null && other.getMailingZip()==null) || 
             (this.mailingZip!=null &&
              this.mailingZip.equals(other.getMailingZip()))) &&
            ((this.marketingPreScreen==null && other.getMarketingPreScreen()==null) || 
             (this.marketingPreScreen!=null &&
              this.marketingPreScreen.equals(other.getMarketingPreScreen()))) &&
            ((this.marketingSegmentationCluster==null && other.getMarketingSegmentationCluster()==null) || 
             (this.marketingSegmentationCluster!=null &&
              this.marketingSegmentationCluster.equals(other.getMarketingSegmentationCluster()))) &&
            ((this.minorityOwned==null && other.getMinorityOwned()==null) || 
             (this.minorityOwned!=null &&
              this.minorityOwned.equals(other.getMinorityOwned()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nationalId==null && other.getNationalId()==null) || 
             (this.nationalId!=null &&
              this.nationalId.equals(other.getNationalId()))) &&
            ((this.nationalIdType==null && other.getNationalIdType()==null) || 
             (this.nationalIdType!=null &&
              this.nationalIdType.equals(other.getNationalIdType()))) &&
            ((this.outOfBusiness==null && other.getOutOfBusiness()==null) || 
             (this.outOfBusiness!=null &&
              this.outOfBusiness.equals(other.getOutOfBusiness()))) &&
            ((this.ownOrRent==null && other.getOwnOrRent()==null) || 
             (this.ownOrRent!=null &&
              this.ownOrRent.equals(other.getOwnOrRent()))) &&
            ((this.parentOrHqBusinessName==null && other.getParentOrHqBusinessName()==null) || 
             (this.parentOrHqBusinessName!=null &&
              this.parentOrHqBusinessName.equals(other.getParentOrHqBusinessName()))) &&
            ((this.parentOrHqDunsNumber==null && other.getParentOrHqDunsNumber()==null) || 
             (this.parentOrHqDunsNumber!=null &&
              this.parentOrHqDunsNumber.equals(other.getParentOrHqDunsNumber()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.premisesMeasure==null && other.getPremisesMeasure()==null) || 
             (this.premisesMeasure!=null &&
              this.premisesMeasure.equals(other.getPremisesMeasure()))) &&
            ((this.premisesMeasureReliability==null && other.getPremisesMeasureReliability()==null) || 
             (this.premisesMeasureReliability!=null &&
              this.premisesMeasureReliability.equals(other.getPremisesMeasureReliability()))) &&
            ((this.premisesMeasureUnit==null && other.getPremisesMeasureUnit()==null) || 
             (this.premisesMeasureUnit!=null &&
              this.premisesMeasureUnit.equals(other.getPremisesMeasureUnit()))) &&
            ((this.primaryNaics==null && other.getPrimaryNaics()==null) || 
             (this.primaryNaics!=null &&
              this.primaryNaics.equals(other.getPrimaryNaics()))) &&
            ((this.primaryNaicsDesc==null && other.getPrimaryNaicsDesc()==null) || 
             (this.primaryNaicsDesc!=null &&
              this.primaryNaicsDesc.equals(other.getPrimaryNaicsDesc()))) &&
            ((this.primarySic==null && other.getPrimarySic()==null) || 
             (this.primarySic!=null &&
              this.primarySic.equals(other.getPrimarySic()))) &&
            ((this.primarySic8==null && other.getPrimarySic8()==null) || 
             (this.primarySic8!=null &&
              this.primarySic8.equals(other.getPrimarySic8()))) &&
            ((this.primarySic8Desc==null && other.getPrimarySic8Desc()==null) || 
             (this.primarySic8Desc!=null &&
              this.primarySic8Desc.equals(other.getPrimarySic8Desc()))) &&
            ((this.primarySicDesc==null && other.getPrimarySicDesc()==null) || 
             (this.primarySicDesc!=null &&
              this.primarySicDesc.equals(other.getPrimarySicDesc()))) &&
            ((this.priorYearEmployees==null && other.getPriorYearEmployees()==null) || 
             (this.priorYearEmployees!=null &&
              this.priorYearEmployees.equals(other.getPriorYearEmployees()))) &&
            ((this.priorYearRevenue==null && other.getPriorYearRevenue()==null) || 
             (this.priorYearRevenue!=null &&
              this.priorYearRevenue.equals(other.getPriorYearRevenue()))) &&
            ((this.publicIndicator==null && other.getPublicIndicator()==null) || 
             (this.publicIndicator!=null &&
              this.publicIndicator.equals(other.getPublicIndicator()))) &&
            ((this.salesTurnoverGrowthRate==null && other.getSalesTurnoverGrowthRate()==null) || 
             (this.salesTurnoverGrowthRate!=null &&
              this.salesTurnoverGrowthRate.equals(other.getSalesTurnoverGrowthRate()))) &&
            ((this.salesVolume==null && other.getSalesVolume()==null) || 
             (this.salesVolume!=null &&
              this.salesVolume.equals(other.getSalesVolume()))) &&
            ((this.salesVolumeReliability==null && other.getSalesVolumeReliability()==null) || 
             (this.salesVolumeReliability!=null &&
              this.salesVolumeReliability.equals(other.getSalesVolumeReliability()))) &&
            ((this.secondNaics==null && other.getSecondNaics()==null) || 
             (this.secondNaics!=null &&
              this.secondNaics.equals(other.getSecondNaics()))) &&
            ((this.secondNaicsDesc==null && other.getSecondNaicsDesc()==null) || 
             (this.secondNaicsDesc!=null &&
              this.secondNaicsDesc.equals(other.getSecondNaicsDesc()))) &&
            ((this.secondSic==null && other.getSecondSic()==null) || 
             (this.secondSic!=null &&
              this.secondSic.equals(other.getSecondSic()))) &&
            ((this.secondSic8==null && other.getSecondSic8()==null) || 
             (this.secondSic8!=null &&
              this.secondSic8.equals(other.getSecondSic8()))) &&
            ((this.secondSic8Desc==null && other.getSecondSic8Desc()==null) || 
             (this.secondSic8Desc!=null &&
              this.secondSic8Desc.equals(other.getSecondSic8Desc()))) &&
            ((this.secondSicDesc==null && other.getSecondSicDesc()==null) || 
             (this.secondSicDesc!=null &&
              this.secondSicDesc.equals(other.getSecondSicDesc()))) &&
            ((this.sixthNaics==null && other.getSixthNaics()==null) || 
             (this.sixthNaics!=null &&
              this.sixthNaics.equals(other.getSixthNaics()))) &&
            ((this.sixthNaicsDesc==null && other.getSixthNaicsDesc()==null) || 
             (this.sixthNaicsDesc!=null &&
              this.sixthNaicsDesc.equals(other.getSixthNaicsDesc()))) &&
            ((this.sixthSic==null && other.getSixthSic()==null) || 
             (this.sixthSic!=null &&
              this.sixthSic.equals(other.getSixthSic()))) &&
            ((this.sixthSic8==null && other.getSixthSic8()==null) || 
             (this.sixthSic8!=null &&
              this.sixthSic8.equals(other.getSixthSic8()))) &&
            ((this.sixthSic8Desc==null && other.getSixthSic8Desc()==null) || 
             (this.sixthSic8Desc!=null &&
              this.sixthSic8Desc.equals(other.getSixthSic8Desc()))) &&
            ((this.sixthSicDesc==null && other.getSixthSicDesc()==null) || 
             (this.sixthSicDesc!=null &&
              this.sixthSicDesc.equals(other.getSixthSicDesc()))) &&
            ((this.smallBusiness==null && other.getSmallBusiness()==null) || 
             (this.smallBusiness!=null &&
              this.smallBusiness.equals(other.getSmallBusiness()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stockExchange==null && other.getStockExchange()==null) || 
             (this.stockExchange!=null &&
              this.stockExchange.equals(other.getStockExchange()))) &&
            ((this.stockSymbol==null && other.getStockSymbol()==null) || 
             (this.stockSymbol!=null &&
              this.stockSymbol.equals(other.getStockSymbol()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.thirdNaics==null && other.getThirdNaics()==null) || 
             (this.thirdNaics!=null &&
              this.thirdNaics.equals(other.getThirdNaics()))) &&
            ((this.thirdNaicsDesc==null && other.getThirdNaicsDesc()==null) || 
             (this.thirdNaicsDesc!=null &&
              this.thirdNaicsDesc.equals(other.getThirdNaicsDesc()))) &&
            ((this.thirdSic==null && other.getThirdSic()==null) || 
             (this.thirdSic!=null &&
              this.thirdSic.equals(other.getThirdSic()))) &&
            ((this.thirdSic8==null && other.getThirdSic8()==null) || 
             (this.thirdSic8!=null &&
              this.thirdSic8.equals(other.getThirdSic8()))) &&
            ((this.thirdSic8Desc==null && other.getThirdSic8Desc()==null) || 
             (this.thirdSic8Desc!=null &&
              this.thirdSic8Desc.equals(other.getThirdSic8Desc()))) &&
            ((this.thirdSicDesc==null && other.getThirdSicDesc()==null) || 
             (this.thirdSicDesc!=null &&
              this.thirdSicDesc.equals(other.getThirdSicDesc()))) &&
            ((this.tradeStyle1==null && other.getTradeStyle1()==null) || 
             (this.tradeStyle1!=null &&
              this.tradeStyle1.equals(other.getTradeStyle1()))) &&
            ((this.tradeStyle2==null && other.getTradeStyle2()==null) || 
             (this.tradeStyle2!=null &&
              this.tradeStyle2.equals(other.getTradeStyle2()))) &&
            ((this.tradeStyle3==null && other.getTradeStyle3()==null) || 
             (this.tradeStyle3!=null &&
              this.tradeStyle3.equals(other.getTradeStyle3()))) &&
            ((this.tradeStyle4==null && other.getTradeStyle4()==null) || 
             (this.tradeStyle4!=null &&
              this.tradeStyle4.equals(other.getTradeStyle4()))) &&
            ((this.tradeStyle5==null && other.getTradeStyle5()==null) || 
             (this.tradeStyle5!=null &&
              this.tradeStyle5.equals(other.getTradeStyle5()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.usTaxId==null && other.getUsTaxId()==null) || 
             (this.usTaxId!=null &&
              this.usTaxId.equals(other.getUsTaxId()))) &&
            ((this.womenOwned==null && other.getWomenOwned()==null) || 
             (this.womenOwned!=null &&
              this.womenOwned.equals(other.getWomenOwned()))) &&
            ((this.yearStarted==null && other.getYearStarted()==null) || 
             (this.yearStarted!=null &&
              this.yearStarted.equals(other.getYearStarted()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip())));
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
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCompanyCurrencyIsoCode() != null) {
            _hashCode += getCompanyCurrencyIsoCode().hashCode();
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCountryAccessCode() != null) {
            _hashCode += getCountryAccessCode().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDomesticUltimateBusinessName() != null) {
            _hashCode += getDomesticUltimateBusinessName().hashCode();
        }
        if (getDomesticUltimateDunsNumber() != null) {
            _hashCode += getDomesticUltimateDunsNumber().hashCode();
        }
        if (getDunsNumber() != null) {
            _hashCode += getDunsNumber().hashCode();
        }
        if (getEmployeeQuantityGrowthRate() != null) {
            _hashCode += getEmployeeQuantityGrowthRate().hashCode();
        }
        if (getEmployeesHere() != null) {
            _hashCode += getEmployeesHere().hashCode();
        }
        if (getEmployeesHereReliability() != null) {
            _hashCode += getEmployeesHereReliability().hashCode();
        }
        if (getEmployeesTotal() != null) {
            _hashCode += getEmployeesTotal().hashCode();
        }
        if (getEmployeesTotalReliability() != null) {
            _hashCode += getEmployeesTotalReliability().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFamilyMembers() != null) {
            _hashCode += getFamilyMembers().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFifthNaics() != null) {
            _hashCode += getFifthNaics().hashCode();
        }
        if (getFifthNaicsDesc() != null) {
            _hashCode += getFifthNaicsDesc().hashCode();
        }
        if (getFifthSic() != null) {
            _hashCode += getFifthSic().hashCode();
        }
        if (getFifthSic8() != null) {
            _hashCode += getFifthSic8().hashCode();
        }
        if (getFifthSic8Desc() != null) {
            _hashCode += getFifthSic8Desc().hashCode();
        }
        if (getFifthSicDesc() != null) {
            _hashCode += getFifthSicDesc().hashCode();
        }
        if (getFipsMsaCode() != null) {
            _hashCode += getFipsMsaCode().hashCode();
        }
        if (getFipsMsaDesc() != null) {
            _hashCode += getFipsMsaDesc().hashCode();
        }
        if (getFortuneRank() != null) {
            _hashCode += getFortuneRank().hashCode();
        }
        if (getFourthNaics() != null) {
            _hashCode += getFourthNaics().hashCode();
        }
        if (getFourthNaicsDesc() != null) {
            _hashCode += getFourthNaicsDesc().hashCode();
        }
        if (getFourthSic() != null) {
            _hashCode += getFourthSic().hashCode();
        }
        if (getFourthSic8() != null) {
            _hashCode += getFourthSic8().hashCode();
        }
        if (getFourthSic8Desc() != null) {
            _hashCode += getFourthSic8Desc().hashCode();
        }
        if (getFourthSicDesc() != null) {
            _hashCode += getFourthSicDesc().hashCode();
        }
        if (getGeoCodeAccuracy() != null) {
            _hashCode += getGeoCodeAccuracy().hashCode();
        }
        if (getGlobalUltimateBusinessName() != null) {
            _hashCode += getGlobalUltimateBusinessName().hashCode();
        }
        if (getGlobalUltimateDunsNumber() != null) {
            _hashCode += getGlobalUltimateDunsNumber().hashCode();
        }
        if (getGlobalUltimateTotalEmployees() != null) {
            _hashCode += getGlobalUltimateTotalEmployees().hashCode();
        }
        if (getImportExportAgent() != null) {
            _hashCode += getImportExportAgent().hashCode();
        }
        if (getIncludedInSnP500() != null) {
            _hashCode += getIncludedInSnP500().hashCode();
        }
        if (getIsOwned() != null) {
            _hashCode += getIsOwned().hashCode();
        }
        if (getIsParent() != null) {
            _hashCode += getIsParent().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLegalStatus() != null) {
            _hashCode += getLegalStatus().hashCode();
        }
        if (getLocationStatus() != null) {
            _hashCode += getLocationStatus().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getMailingCity() != null) {
            _hashCode += getMailingCity().hashCode();
        }
        if (getMailingCountry() != null) {
            _hashCode += getMailingCountry().hashCode();
        }
        if (getMailingState() != null) {
            _hashCode += getMailingState().hashCode();
        }
        if (getMailingStreet() != null) {
            _hashCode += getMailingStreet().hashCode();
        }
        if (getMailingZip() != null) {
            _hashCode += getMailingZip().hashCode();
        }
        if (getMarketingPreScreen() != null) {
            _hashCode += getMarketingPreScreen().hashCode();
        }
        if (getMarketingSegmentationCluster() != null) {
            _hashCode += getMarketingSegmentationCluster().hashCode();
        }
        if (getMinorityOwned() != null) {
            _hashCode += getMinorityOwned().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNationalId() != null) {
            _hashCode += getNationalId().hashCode();
        }
        if (getNationalIdType() != null) {
            _hashCode += getNationalIdType().hashCode();
        }
        if (getOutOfBusiness() != null) {
            _hashCode += getOutOfBusiness().hashCode();
        }
        if (getOwnOrRent() != null) {
            _hashCode += getOwnOrRent().hashCode();
        }
        if (getParentOrHqBusinessName() != null) {
            _hashCode += getParentOrHqBusinessName().hashCode();
        }
        if (getParentOrHqDunsNumber() != null) {
            _hashCode += getParentOrHqDunsNumber().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPremisesMeasure() != null) {
            _hashCode += getPremisesMeasure().hashCode();
        }
        if (getPremisesMeasureReliability() != null) {
            _hashCode += getPremisesMeasureReliability().hashCode();
        }
        if (getPremisesMeasureUnit() != null) {
            _hashCode += getPremisesMeasureUnit().hashCode();
        }
        if (getPrimaryNaics() != null) {
            _hashCode += getPrimaryNaics().hashCode();
        }
        if (getPrimaryNaicsDesc() != null) {
            _hashCode += getPrimaryNaicsDesc().hashCode();
        }
        if (getPrimarySic() != null) {
            _hashCode += getPrimarySic().hashCode();
        }
        if (getPrimarySic8() != null) {
            _hashCode += getPrimarySic8().hashCode();
        }
        if (getPrimarySic8Desc() != null) {
            _hashCode += getPrimarySic8Desc().hashCode();
        }
        if (getPrimarySicDesc() != null) {
            _hashCode += getPrimarySicDesc().hashCode();
        }
        if (getPriorYearEmployees() != null) {
            _hashCode += getPriorYearEmployees().hashCode();
        }
        if (getPriorYearRevenue() != null) {
            _hashCode += getPriorYearRevenue().hashCode();
        }
        if (getPublicIndicator() != null) {
            _hashCode += getPublicIndicator().hashCode();
        }
        if (getSalesTurnoverGrowthRate() != null) {
            _hashCode += getSalesTurnoverGrowthRate().hashCode();
        }
        if (getSalesVolume() != null) {
            _hashCode += getSalesVolume().hashCode();
        }
        if (getSalesVolumeReliability() != null) {
            _hashCode += getSalesVolumeReliability().hashCode();
        }
        if (getSecondNaics() != null) {
            _hashCode += getSecondNaics().hashCode();
        }
        if (getSecondNaicsDesc() != null) {
            _hashCode += getSecondNaicsDesc().hashCode();
        }
        if (getSecondSic() != null) {
            _hashCode += getSecondSic().hashCode();
        }
        if (getSecondSic8() != null) {
            _hashCode += getSecondSic8().hashCode();
        }
        if (getSecondSic8Desc() != null) {
            _hashCode += getSecondSic8Desc().hashCode();
        }
        if (getSecondSicDesc() != null) {
            _hashCode += getSecondSicDesc().hashCode();
        }
        if (getSixthNaics() != null) {
            _hashCode += getSixthNaics().hashCode();
        }
        if (getSixthNaicsDesc() != null) {
            _hashCode += getSixthNaicsDesc().hashCode();
        }
        if (getSixthSic() != null) {
            _hashCode += getSixthSic().hashCode();
        }
        if (getSixthSic8() != null) {
            _hashCode += getSixthSic8().hashCode();
        }
        if (getSixthSic8Desc() != null) {
            _hashCode += getSixthSic8Desc().hashCode();
        }
        if (getSixthSicDesc() != null) {
            _hashCode += getSixthSicDesc().hashCode();
        }
        if (getSmallBusiness() != null) {
            _hashCode += getSmallBusiness().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStockExchange() != null) {
            _hashCode += getStockExchange().hashCode();
        }
        if (getStockSymbol() != null) {
            _hashCode += getStockSymbol().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getThirdNaics() != null) {
            _hashCode += getThirdNaics().hashCode();
        }
        if (getThirdNaicsDesc() != null) {
            _hashCode += getThirdNaicsDesc().hashCode();
        }
        if (getThirdSic() != null) {
            _hashCode += getThirdSic().hashCode();
        }
        if (getThirdSic8() != null) {
            _hashCode += getThirdSic8().hashCode();
        }
        if (getThirdSic8Desc() != null) {
            _hashCode += getThirdSic8Desc().hashCode();
        }
        if (getThirdSicDesc() != null) {
            _hashCode += getThirdSicDesc().hashCode();
        }
        if (getTradeStyle1() != null) {
            _hashCode += getTradeStyle1().hashCode();
        }
        if (getTradeStyle2() != null) {
            _hashCode += getTradeStyle2().hashCode();
        }
        if (getTradeStyle3() != null) {
            _hashCode += getTradeStyle3().hashCode();
        }
        if (getTradeStyle4() != null) {
            _hashCode += getTradeStyle4().hashCode();
        }
        if (getTradeStyle5() != null) {
            _hashCode += getTradeStyle5().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getUsTaxId() != null) {
            _hashCode += getUsTaxId().hashCode();
        }
        if (getWomenOwned() != null) {
            _hashCode += getWomenOwned().hashCode();
        }
        if (getYearStarted() != null) {
            _hashCode += getYearStarted().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacloudDandBCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudDandBCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCurrencyIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyCurrencyIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CompanyId"));
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
        elemField.setFieldName("countryAccessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CountryAccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CurrencyCode"));
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
        elemField.setFieldName("domesticUltimateBusinessName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DomesticUltimateBusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domesticUltimateDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DomesticUltimateDunsNumber"));
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
        elemField.setFieldName("employeeQuantityGrowthRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeeQuantityGrowthRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeesHere");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeesHere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeesHereReliability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeesHereReliability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeesTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeesTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeesTotalReliability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeesTotalReliability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FamilyMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("fifthNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fifthNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fifthSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fifthSic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthSic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fifthSic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthSic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fifthSicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FifthSicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fipsMsaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FipsMsaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fipsMsaDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FipsMsaDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fortuneRank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FortuneRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthSic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthSic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthSic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthSic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fourthSicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FourthSicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCodeAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GeoCodeAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalUltimateBusinessName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GlobalUltimateBusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalUltimateDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GlobalUltimateDunsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalUltimateTotalEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GlobalUltimateTotalEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importExportAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ImportExportAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includedInSnP500");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IncludedInSnP500"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOwned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsOwned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isParent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LegalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LocationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingPreScreen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MarketingPreScreen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingSegmentationCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MarketingSegmentationCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorityOwned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MinorityOwned"));
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
        elemField.setFieldName("nationalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NationalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NationalIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OutOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownOrRent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnOrRent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrHqBusinessName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentOrHqBusinessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOrHqDunsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentOrHqDunsNumber"));
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
        elemField.setFieldName("premisesMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PremisesMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premisesMeasureReliability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PremisesMeasureReliability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premisesMeasureUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PremisesMeasureUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimaryNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimaryNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimarySic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimarySic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimarySic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PrimarySicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorYearEmployees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PriorYearEmployees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorYearRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PriorYearRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PublicIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTurnoverGrowthRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesTurnoverGrowthRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesVolumeReliability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesVolumeReliability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondSic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondSic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondSic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondSic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondSicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecondSicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthSic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthSic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthSic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthSic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sixthSicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SixthSicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SmallBusiness"));
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
        elemField.setFieldName("stockExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StockExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StockSymbol"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdNaics");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdNaics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdNaicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdNaicsDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdSic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdSic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdSic8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdSic8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdSic8Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdSic8Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdSicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdSicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UsTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("womenOwned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WomenOwned"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zip"));
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
