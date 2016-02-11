/**
 * DatacloudCompany.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class DatacloudCompany  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Integer activeContacts;

    private java.lang.Double annualRevenue;

    private java.lang.String city;

    private java.lang.String companyId;

    private java.lang.String country;

    private java.lang.String description;

    private java.lang.String dunsNumber;

    private java.lang.Double employeeQuantityGrowthRate;

    private java.lang.String externalId;

    private java.lang.String fax;

    private java.lang.Integer fortuneRank;

    private java.lang.String includedInSnP500;

    private java.lang.String industry;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean isOwned;

    private java.lang.String naicsCode;

    private java.lang.String naicsDesc;

    private java.lang.String name;

    private java.lang.Integer numberOfEmployees;

    private java.lang.String ownership;

    private java.lang.String phone;

    private java.lang.Integer premisesMeasure;

    private java.lang.String premisesMeasureReliability;

    private java.lang.String premisesMeasureUnit;

    private java.lang.Integer priorYearEmployees;

    private java.lang.Double priorYearRevenue;

    private java.lang.Double salesTurnoverGrowthRate;

    private java.lang.String sic;

    private java.lang.String sicDesc;

    private java.lang.String site;

    private java.lang.String state;

    private java.lang.String street;

    private java.lang.String tickerSymbol;

    private java.lang.String tradeStyle;

    private java.util.Calendar updatedDate;

    private java.lang.String website;

    private java.lang.String yearStarted;

    private java.lang.String zip;

    public DatacloudCompany() {
    }

    public DatacloudCompany(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Integer activeContacts,
           java.lang.Double annualRevenue,
           java.lang.String city,
           java.lang.String companyId,
           java.lang.String country,
           java.lang.String description,
           java.lang.String dunsNumber,
           java.lang.Double employeeQuantityGrowthRate,
           java.lang.String externalId,
           java.lang.String fax,
           java.lang.Integer fortuneRank,
           java.lang.String includedInSnP500,
           java.lang.String industry,
           java.lang.Boolean isInactive,
           java.lang.Boolean isOwned,
           java.lang.String naicsCode,
           java.lang.String naicsDesc,
           java.lang.String name,
           java.lang.Integer numberOfEmployees,
           java.lang.String ownership,
           java.lang.String phone,
           java.lang.Integer premisesMeasure,
           java.lang.String premisesMeasureReliability,
           java.lang.String premisesMeasureUnit,
           java.lang.Integer priorYearEmployees,
           java.lang.Double priorYearRevenue,
           java.lang.Double salesTurnoverGrowthRate,
           java.lang.String sic,
           java.lang.String sicDesc,
           java.lang.String site,
           java.lang.String state,
           java.lang.String street,
           java.lang.String tickerSymbol,
           java.lang.String tradeStyle,
           java.util.Calendar updatedDate,
           java.lang.String website,
           java.lang.String yearStarted,
           java.lang.String zip) {
        super(
            fieldsToNull,
            id);
        this.activeContacts = activeContacts;
        this.annualRevenue = annualRevenue;
        this.city = city;
        this.companyId = companyId;
        this.country = country;
        this.description = description;
        this.dunsNumber = dunsNumber;
        this.employeeQuantityGrowthRate = employeeQuantityGrowthRate;
        this.externalId = externalId;
        this.fax = fax;
        this.fortuneRank = fortuneRank;
        this.includedInSnP500 = includedInSnP500;
        this.industry = industry;
        this.isInactive = isInactive;
        this.isOwned = isOwned;
        this.naicsCode = naicsCode;
        this.naicsDesc = naicsDesc;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.ownership = ownership;
        this.phone = phone;
        this.premisesMeasure = premisesMeasure;
        this.premisesMeasureReliability = premisesMeasureReliability;
        this.premisesMeasureUnit = premisesMeasureUnit;
        this.priorYearEmployees = priorYearEmployees;
        this.priorYearRevenue = priorYearRevenue;
        this.salesTurnoverGrowthRate = salesTurnoverGrowthRate;
        this.sic = sic;
        this.sicDesc = sicDesc;
        this.site = site;
        this.state = state;
        this.street = street;
        this.tickerSymbol = tickerSymbol;
        this.tradeStyle = tradeStyle;
        this.updatedDate = updatedDate;
        this.website = website;
        this.yearStarted = yearStarted;
        this.zip = zip;
    }


    /**
     * Gets the activeContacts value for this DatacloudCompany.
     * 
     * @return activeContacts
     */
    public java.lang.Integer getActiveContacts() {
        return activeContacts;
    }


    /**
     * Sets the activeContacts value for this DatacloudCompany.
     * 
     * @param activeContacts
     */
    public void setActiveContacts(java.lang.Integer activeContacts) {
        this.activeContacts = activeContacts;
    }


    /**
     * Gets the annualRevenue value for this DatacloudCompany.
     * 
     * @return annualRevenue
     */
    public java.lang.Double getAnnualRevenue() {
        return annualRevenue;
    }


    /**
     * Sets the annualRevenue value for this DatacloudCompany.
     * 
     * @param annualRevenue
     */
    public void setAnnualRevenue(java.lang.Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }


    /**
     * Gets the city value for this DatacloudCompany.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DatacloudCompany.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the companyId value for this DatacloudCompany.
     * 
     * @return companyId
     */
    public java.lang.String getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this DatacloudCompany.
     * 
     * @param companyId
     */
    public void setCompanyId(java.lang.String companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the country value for this DatacloudCompany.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DatacloudCompany.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the description value for this DatacloudCompany.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DatacloudCompany.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dunsNumber value for this DatacloudCompany.
     * 
     * @return dunsNumber
     */
    public java.lang.String getDunsNumber() {
        return dunsNumber;
    }


    /**
     * Sets the dunsNumber value for this DatacloudCompany.
     * 
     * @param dunsNumber
     */
    public void setDunsNumber(java.lang.String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }


    /**
     * Gets the employeeQuantityGrowthRate value for this DatacloudCompany.
     * 
     * @return employeeQuantityGrowthRate
     */
    public java.lang.Double getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }


    /**
     * Sets the employeeQuantityGrowthRate value for this DatacloudCompany.
     * 
     * @param employeeQuantityGrowthRate
     */
    public void setEmployeeQuantityGrowthRate(java.lang.Double employeeQuantityGrowthRate) {
        this.employeeQuantityGrowthRate = employeeQuantityGrowthRate;
    }


    /**
     * Gets the externalId value for this DatacloudCompany.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this DatacloudCompany.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the fax value for this DatacloudCompany.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this DatacloudCompany.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the fortuneRank value for this DatacloudCompany.
     * 
     * @return fortuneRank
     */
    public java.lang.Integer getFortuneRank() {
        return fortuneRank;
    }


    /**
     * Sets the fortuneRank value for this DatacloudCompany.
     * 
     * @param fortuneRank
     */
    public void setFortuneRank(java.lang.Integer fortuneRank) {
        this.fortuneRank = fortuneRank;
    }


    /**
     * Gets the includedInSnP500 value for this DatacloudCompany.
     * 
     * @return includedInSnP500
     */
    public java.lang.String getIncludedInSnP500() {
        return includedInSnP500;
    }


    /**
     * Sets the includedInSnP500 value for this DatacloudCompany.
     * 
     * @param includedInSnP500
     */
    public void setIncludedInSnP500(java.lang.String includedInSnP500) {
        this.includedInSnP500 = includedInSnP500;
    }


    /**
     * Gets the industry value for this DatacloudCompany.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this DatacloudCompany.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the isInactive value for this DatacloudCompany.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this DatacloudCompany.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isOwned value for this DatacloudCompany.
     * 
     * @return isOwned
     */
    public java.lang.Boolean getIsOwned() {
        return isOwned;
    }


    /**
     * Sets the isOwned value for this DatacloudCompany.
     * 
     * @param isOwned
     */
    public void setIsOwned(java.lang.Boolean isOwned) {
        this.isOwned = isOwned;
    }


    /**
     * Gets the naicsCode value for this DatacloudCompany.
     * 
     * @return naicsCode
     */
    public java.lang.String getNaicsCode() {
        return naicsCode;
    }


    /**
     * Sets the naicsCode value for this DatacloudCompany.
     * 
     * @param naicsCode
     */
    public void setNaicsCode(java.lang.String naicsCode) {
        this.naicsCode = naicsCode;
    }


    /**
     * Gets the naicsDesc value for this DatacloudCompany.
     * 
     * @return naicsDesc
     */
    public java.lang.String getNaicsDesc() {
        return naicsDesc;
    }


    /**
     * Sets the naicsDesc value for this DatacloudCompany.
     * 
     * @param naicsDesc
     */
    public void setNaicsDesc(java.lang.String naicsDesc) {
        this.naicsDesc = naicsDesc;
    }


    /**
     * Gets the name value for this DatacloudCompany.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DatacloudCompany.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfEmployees value for this DatacloudCompany.
     * 
     * @return numberOfEmployees
     */
    public java.lang.Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }


    /**
     * Sets the numberOfEmployees value for this DatacloudCompany.
     * 
     * @param numberOfEmployees
     */
    public void setNumberOfEmployees(java.lang.Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    /**
     * Gets the ownership value for this DatacloudCompany.
     * 
     * @return ownership
     */
    public java.lang.String getOwnership() {
        return ownership;
    }


    /**
     * Sets the ownership value for this DatacloudCompany.
     * 
     * @param ownership
     */
    public void setOwnership(java.lang.String ownership) {
        this.ownership = ownership;
    }


    /**
     * Gets the phone value for this DatacloudCompany.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this DatacloudCompany.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the premisesMeasure value for this DatacloudCompany.
     * 
     * @return premisesMeasure
     */
    public java.lang.Integer getPremisesMeasure() {
        return premisesMeasure;
    }


    /**
     * Sets the premisesMeasure value for this DatacloudCompany.
     * 
     * @param premisesMeasure
     */
    public void setPremisesMeasure(java.lang.Integer premisesMeasure) {
        this.premisesMeasure = premisesMeasure;
    }


    /**
     * Gets the premisesMeasureReliability value for this DatacloudCompany.
     * 
     * @return premisesMeasureReliability
     */
    public java.lang.String getPremisesMeasureReliability() {
        return premisesMeasureReliability;
    }


    /**
     * Sets the premisesMeasureReliability value for this DatacloudCompany.
     * 
     * @param premisesMeasureReliability
     */
    public void setPremisesMeasureReliability(java.lang.String premisesMeasureReliability) {
        this.premisesMeasureReliability = premisesMeasureReliability;
    }


    /**
     * Gets the premisesMeasureUnit value for this DatacloudCompany.
     * 
     * @return premisesMeasureUnit
     */
    public java.lang.String getPremisesMeasureUnit() {
        return premisesMeasureUnit;
    }


    /**
     * Sets the premisesMeasureUnit value for this DatacloudCompany.
     * 
     * @param premisesMeasureUnit
     */
    public void setPremisesMeasureUnit(java.lang.String premisesMeasureUnit) {
        this.premisesMeasureUnit = premisesMeasureUnit;
    }


    /**
     * Gets the priorYearEmployees value for this DatacloudCompany.
     * 
     * @return priorYearEmployees
     */
    public java.lang.Integer getPriorYearEmployees() {
        return priorYearEmployees;
    }


    /**
     * Sets the priorYearEmployees value for this DatacloudCompany.
     * 
     * @param priorYearEmployees
     */
    public void setPriorYearEmployees(java.lang.Integer priorYearEmployees) {
        this.priorYearEmployees = priorYearEmployees;
    }


    /**
     * Gets the priorYearRevenue value for this DatacloudCompany.
     * 
     * @return priorYearRevenue
     */
    public java.lang.Double getPriorYearRevenue() {
        return priorYearRevenue;
    }


    /**
     * Sets the priorYearRevenue value for this DatacloudCompany.
     * 
     * @param priorYearRevenue
     */
    public void setPriorYearRevenue(java.lang.Double priorYearRevenue) {
        this.priorYearRevenue = priorYearRevenue;
    }


    /**
     * Gets the salesTurnoverGrowthRate value for this DatacloudCompany.
     * 
     * @return salesTurnoverGrowthRate
     */
    public java.lang.Double getSalesTurnoverGrowthRate() {
        return salesTurnoverGrowthRate;
    }


    /**
     * Sets the salesTurnoverGrowthRate value for this DatacloudCompany.
     * 
     * @param salesTurnoverGrowthRate
     */
    public void setSalesTurnoverGrowthRate(java.lang.Double salesTurnoverGrowthRate) {
        this.salesTurnoverGrowthRate = salesTurnoverGrowthRate;
    }


    /**
     * Gets the sic value for this DatacloudCompany.
     * 
     * @return sic
     */
    public java.lang.String getSic() {
        return sic;
    }


    /**
     * Sets the sic value for this DatacloudCompany.
     * 
     * @param sic
     */
    public void setSic(java.lang.String sic) {
        this.sic = sic;
    }


    /**
     * Gets the sicDesc value for this DatacloudCompany.
     * 
     * @return sicDesc
     */
    public java.lang.String getSicDesc() {
        return sicDesc;
    }


    /**
     * Sets the sicDesc value for this DatacloudCompany.
     * 
     * @param sicDesc
     */
    public void setSicDesc(java.lang.String sicDesc) {
        this.sicDesc = sicDesc;
    }


    /**
     * Gets the site value for this DatacloudCompany.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this DatacloudCompany.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the state value for this DatacloudCompany.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this DatacloudCompany.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the street value for this DatacloudCompany.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this DatacloudCompany.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the tickerSymbol value for this DatacloudCompany.
     * 
     * @return tickerSymbol
     */
    public java.lang.String getTickerSymbol() {
        return tickerSymbol;
    }


    /**
     * Sets the tickerSymbol value for this DatacloudCompany.
     * 
     * @param tickerSymbol
     */
    public void setTickerSymbol(java.lang.String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }


    /**
     * Gets the tradeStyle value for this DatacloudCompany.
     * 
     * @return tradeStyle
     */
    public java.lang.String getTradeStyle() {
        return tradeStyle;
    }


    /**
     * Sets the tradeStyle value for this DatacloudCompany.
     * 
     * @param tradeStyle
     */
    public void setTradeStyle(java.lang.String tradeStyle) {
        this.tradeStyle = tradeStyle;
    }


    /**
     * Gets the updatedDate value for this DatacloudCompany.
     * 
     * @return updatedDate
     */
    public java.util.Calendar getUpdatedDate() {
        return updatedDate;
    }


    /**
     * Sets the updatedDate value for this DatacloudCompany.
     * 
     * @param updatedDate
     */
    public void setUpdatedDate(java.util.Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }


    /**
     * Gets the website value for this DatacloudCompany.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this DatacloudCompany.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the yearStarted value for this DatacloudCompany.
     * 
     * @return yearStarted
     */
    public java.lang.String getYearStarted() {
        return yearStarted;
    }


    /**
     * Sets the yearStarted value for this DatacloudCompany.
     * 
     * @param yearStarted
     */
    public void setYearStarted(java.lang.String yearStarted) {
        this.yearStarted = yearStarted;
    }


    /**
     * Gets the zip value for this DatacloudCompany.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this DatacloudCompany.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacloudCompany)) return false;
        DatacloudCompany other = (DatacloudCompany) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeContacts==null && other.getActiveContacts()==null) || 
             (this.activeContacts!=null &&
              this.activeContacts.equals(other.getActiveContacts()))) &&
            ((this.annualRevenue==null && other.getAnnualRevenue()==null) || 
             (this.annualRevenue!=null &&
              this.annualRevenue.equals(other.getAnnualRevenue()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.companyId==null && other.getCompanyId()==null) || 
             (this.companyId!=null &&
              this.companyId.equals(other.getCompanyId()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dunsNumber==null && other.getDunsNumber()==null) || 
             (this.dunsNumber!=null &&
              this.dunsNumber.equals(other.getDunsNumber()))) &&
            ((this.employeeQuantityGrowthRate==null && other.getEmployeeQuantityGrowthRate()==null) || 
             (this.employeeQuantityGrowthRate!=null &&
              this.employeeQuantityGrowthRate.equals(other.getEmployeeQuantityGrowthRate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.fortuneRank==null && other.getFortuneRank()==null) || 
             (this.fortuneRank!=null &&
              this.fortuneRank.equals(other.getFortuneRank()))) &&
            ((this.includedInSnP500==null && other.getIncludedInSnP500()==null) || 
             (this.includedInSnP500!=null &&
              this.includedInSnP500.equals(other.getIncludedInSnP500()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isOwned==null && other.getIsOwned()==null) || 
             (this.isOwned!=null &&
              this.isOwned.equals(other.getIsOwned()))) &&
            ((this.naicsCode==null && other.getNaicsCode()==null) || 
             (this.naicsCode!=null &&
              this.naicsCode.equals(other.getNaicsCode()))) &&
            ((this.naicsDesc==null && other.getNaicsDesc()==null) || 
             (this.naicsDesc!=null &&
              this.naicsDesc.equals(other.getNaicsDesc()))) &&
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
            ((this.premisesMeasure==null && other.getPremisesMeasure()==null) || 
             (this.premisesMeasure!=null &&
              this.premisesMeasure.equals(other.getPremisesMeasure()))) &&
            ((this.premisesMeasureReliability==null && other.getPremisesMeasureReliability()==null) || 
             (this.premisesMeasureReliability!=null &&
              this.premisesMeasureReliability.equals(other.getPremisesMeasureReliability()))) &&
            ((this.premisesMeasureUnit==null && other.getPremisesMeasureUnit()==null) || 
             (this.premisesMeasureUnit!=null &&
              this.premisesMeasureUnit.equals(other.getPremisesMeasureUnit()))) &&
            ((this.priorYearEmployees==null && other.getPriorYearEmployees()==null) || 
             (this.priorYearEmployees!=null &&
              this.priorYearEmployees.equals(other.getPriorYearEmployees()))) &&
            ((this.priorYearRevenue==null && other.getPriorYearRevenue()==null) || 
             (this.priorYearRevenue!=null &&
              this.priorYearRevenue.equals(other.getPriorYearRevenue()))) &&
            ((this.salesTurnoverGrowthRate==null && other.getSalesTurnoverGrowthRate()==null) || 
             (this.salesTurnoverGrowthRate!=null &&
              this.salesTurnoverGrowthRate.equals(other.getSalesTurnoverGrowthRate()))) &&
            ((this.sic==null && other.getSic()==null) || 
             (this.sic!=null &&
              this.sic.equals(other.getSic()))) &&
            ((this.sicDesc==null && other.getSicDesc()==null) || 
             (this.sicDesc!=null &&
              this.sicDesc.equals(other.getSicDesc()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.tickerSymbol==null && other.getTickerSymbol()==null) || 
             (this.tickerSymbol!=null &&
              this.tickerSymbol.equals(other.getTickerSymbol()))) &&
            ((this.tradeStyle==null && other.getTradeStyle()==null) || 
             (this.tradeStyle!=null &&
              this.tradeStyle.equals(other.getTradeStyle()))) &&
            ((this.updatedDate==null && other.getUpdatedDate()==null) || 
             (this.updatedDate!=null &&
              this.updatedDate.equals(other.getUpdatedDate()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
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
        if (getActiveContacts() != null) {
            _hashCode += getActiveContacts().hashCode();
        }
        if (getAnnualRevenue() != null) {
            _hashCode += getAnnualRevenue().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCompanyId() != null) {
            _hashCode += getCompanyId().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDunsNumber() != null) {
            _hashCode += getDunsNumber().hashCode();
        }
        if (getEmployeeQuantityGrowthRate() != null) {
            _hashCode += getEmployeeQuantityGrowthRate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFortuneRank() != null) {
            _hashCode += getFortuneRank().hashCode();
        }
        if (getIncludedInSnP500() != null) {
            _hashCode += getIncludedInSnP500().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsOwned() != null) {
            _hashCode += getIsOwned().hashCode();
        }
        if (getNaicsCode() != null) {
            _hashCode += getNaicsCode().hashCode();
        }
        if (getNaicsDesc() != null) {
            _hashCode += getNaicsDesc().hashCode();
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
        if (getPremisesMeasure() != null) {
            _hashCode += getPremisesMeasure().hashCode();
        }
        if (getPremisesMeasureReliability() != null) {
            _hashCode += getPremisesMeasureReliability().hashCode();
        }
        if (getPremisesMeasureUnit() != null) {
            _hashCode += getPremisesMeasureUnit().hashCode();
        }
        if (getPriorYearEmployees() != null) {
            _hashCode += getPriorYearEmployees().hashCode();
        }
        if (getPriorYearRevenue() != null) {
            _hashCode += getPriorYearRevenue().hashCode();
        }
        if (getSalesTurnoverGrowthRate() != null) {
            _hashCode += getSalesTurnoverGrowthRate().hashCode();
        }
        if (getSic() != null) {
            _hashCode += getSic().hashCode();
        }
        if (getSicDesc() != null) {
            _hashCode += getSicDesc().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getTickerSymbol() != null) {
            _hashCode += getTickerSymbol().hashCode();
        }
        if (getTradeStyle() != null) {
            _hashCode += getTradeStyle().hashCode();
        }
        if (getUpdatedDate() != null) {
            _hashCode += getUpdatedDate().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
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
        new org.apache.axis.description.TypeDesc(DatacloudCompany.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DatacloudCompany"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActiveContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("employeeQuantityGrowthRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmployeeQuantityGrowthRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
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
        elemField.setFieldName("includedInSnP500");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IncludedInSnP500"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("naicsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naicsDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NaicsDesc"));
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
        elemField.setFieldName("salesTurnoverGrowthRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SalesTurnoverGrowthRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("sicDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SicDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Site"));
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
        elemField.setFieldName("tickerSymbol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TickerSymbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TradeStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UpdatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
