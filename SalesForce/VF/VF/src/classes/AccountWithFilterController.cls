public class AccountWithFilterController {
    public List<Account> accountList {get; set;}
    public String selectedValueForBillingCountry {get; set;}
    public String selectedValueForBillingCity {get; set;}
    public String selectedValueForBillingState {get; set;}
    
    public List<SelectOption> getAccountListForBillingCountry() {
        List<Account> accountListForBillingCountry = [select BillingCountry from Account];
        List<SelectOption> billingCountryList = new List<SelectOption>();
        billingCountryList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingCountry) {
            if(acc.BillingCountry != null) {
                 billingCountryList.add(new SelectOption(acc.BillingCountry , acc.BillingCountry));
            }
           
        }
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
    public PageReference search() {
        
        System.debug('hii 1 ');
        String queryString = 'select Id,Name from Account ';
        Boolean isConditionBlank = false;
        if(!selectedValueForBillingCountry.equalsIgnoreCase('-')) {
            System.debug('hii 2 ');
            isConditionBlank = true;
            queryString +='where BillingCountry =:selectedValueForBillingCountry ';
        }
        if(!selectedValueForBillingState.equalsIgnoreCase('-')) {
            if(isConditionBlank == true) {
                System.debug('hii');
                queryString +='and BillingState =:selectedValueForBillingState ';
            }
            else {
                System.debug('hii');
                isConditionBlank = true;
                queryString +='where BillingState =:selectedValueForBillingState ';
            }
        }
        if(!selectedValueForBillingCity.equalsIgnoreCase('-')) {
            System.debug('hii');
            if(isConditionBlank == true) {
                System.debug('hii');
                queryString +='and BillingCity =:selectedValueForBillingCity ';
            }
            else {
                System.debug('hii');
                queryString +='where BillingCity =:selectedValueForBillingCity ';
            }
        }
        System.debug('hii' + queryString);
        queryString +=' limit 100';
       // accountList = [select Id,Name from Account where BillingCountry =:selectedValueForBillingCountry and BillingState =:selectedValueForBillingState and BillingCity=:selectedValueForBillingCity limit 100];
    	accountList = Database.query(queryString);
           System.debug('hii'+accountList.size());
        return null;
    }
}