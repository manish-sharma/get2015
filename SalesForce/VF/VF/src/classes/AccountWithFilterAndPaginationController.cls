public with sharing class AccountWithFilterAndPaginationController {
    
    
    public String selectedValueForBillingCountry {get; set;}
    public String selectedValueForBillingCity {get; set;}
    public String selectedValueForBillingState {get; set;}
    public ApexPages.StandardSetController setCon {get;set;}   
    public List<SelectOption> getAccountListForBillingCountry() {
        List<Account> accountListForBillingCountry = [select BillingCountry from Account];
        List<SelectOption> billingCountryList = new List<SelectOption>();
        billingCountryList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingCountry) {
            if(acc.BillingCountry != null) {
                billingCountryList.add(new SelectOption(acc.BillingCountry , acc.BillingCountry));
            }
            
        }
        System.debug(billingCountryList);
        return billingCountryList;
    }
    public List<SelectOption> getAccountListForBillingState() {
        List<Account> accountListForBillingState = [select BillingState from Account];
        List<SelectOption> billingStateList = new List<SelectOption>();
        billingStateList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingState) {
            if(acc.BillingState != null) {
                billingStateList.add(new SelectOption(acc.BillingState , acc.BillingState));
            }
            
        }
        return billingStateList;
    }
    public List<SelectOption> getAccountListForBillingCity() {
        List<Account> accountListForBillingCity = [select BillingCity from Account];
        List<SelectOption> billingCityList = new List<SelectOption>();
        billingCityList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingCity) {
            if(acc.BillingCity != null) {
                billingCityList.add(new SelectOption(acc.BillingCity , acc.BillingCity));
            }
            
        }
        return billingCityList;
    }
    
    Public Integer noOfRecords{get; set;}
    Public Integer size{get;set;}
    
    Public List<Account> getAccounts(){
        if(setCon==null)
            return null;
        return (List<Account>)setCon.getRecords();
        
    }
    
    
    
    public String getQuery() {
        String queryString = 'select Id,Name from Account ';
        Boolean isConditionBlank = false;
        if(!selectedValueForBillingCountry.equalsIgnoreCase('-')) {
            isConditionBlank = true;
            queryString +='where BillingCountry =:selectedValueForBillingCountry ';
        }
        if(!selectedValueForBillingState.equalsIgnoreCase('-')) {
            if(isConditionBlank == true) {
                queryString +='and BillingState =:selectedValueForBillingState ';
            }
            else {
                isConditionBlank = true;
                queryString +='where BillingState =:selectedValueForBillingState ';
            }
        }
        if(!selectedValueForBillingCity.equalsIgnoreCase('-')) {
            if(isConditionBlank == true) {
                queryString +='and BillingCity =:selectedValueForBillingCity ';
            }
            else {
                queryString +='where BillingCity =:selectedValueForBillingCity ';
            }
        }
        queryString +=' limit 100';
        return queryString;
    }
    
    public void search() {
        size = 10;
        
        setCon = new ApexPages.StandardSetController(Database.getQueryLocator(getQuery()));
        setCon.setPageSize(size);
        noOfRecords = setCon.getResultSize();
        
        
    }
    
    
    public Boolean hasNext {
        get {
            return setCon.getHasNext();
        }
        set;
    }
    public Boolean hasPrevious {
        get {
            return setCon.getHasPrevious();
        }
        set;
    }
    
    public Integer pageNumber {
        get {
            return setCon.getPageNumber();
        }
        set;
    }
    
    public void first() {
        setCon.first();
    }
    
    public void last() {
        setCon.last();
    }
    
    public void previous() {
        setCon.previous();
    }
    
    public void next() {
        setCon.next();
    }
}