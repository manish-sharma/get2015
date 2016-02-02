@isTest
public class TestAccountWithFilter {
    public static testMethod void testgetAccountListForBillingCity() {
        List<SelectOption>  billingCityListActual = new List<SelectOption>();
        List<Account> accountListForBillingCity = [select BillingCity from Account];
        List<SelectOption> billingCityListExpected = new List<SelectOption>();
        billingCityListExpected.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingCity) {
            if(acc.BillingCity != null) {
                billingCityListExpected.add(new SelectOption(acc.BillingCity , acc.BillingCity));
            }
        }
        AccountWithFilterAndPaginationController con = new AccountWithFilterAndPaginationController();
        billingCityListActual = con.getAccountListForBillingCity();
        System.assertEquals(billingCityListActual, billingCityListExpected);
    }
    
     public static testMethod void testgetAccountListForBillingCountry() {
        List<SelectOption>  selectList = new List<SelectOption>();
        List<Account> accountListForBillingCountry = [select BillingCountry from Account];
        List<SelectOption> billingCountryList = new List<SelectOption>();
        billingCountryList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingCountry) {
            if(acc.BillingCountry != null) {
                billingCountryList.add(new SelectOption(acc.BillingCountry , acc.BillingCountry));
            }
        }
        AccountWithFilterAndPaginationController con = new AccountWithFilterAndPaginationController();
        billingCountryList = con.getAccountListForBillingCountry();
        System.assertEquals(billingCountryList, billingCountryList);
    }
    
    public static testMethod void testgetAccountListForBillingState() {
        List<SelectOption>  selectList = new List<SelectOption>();
        List<Account> accountListForBillingState = [select BillingState from Account];
        List<SelectOption> billingStateList = new List<SelectOption>();
        billingStateList.add(new SelectOption('-' , '-'));
        for(Account acc : accountListForBillingState) {
            if(acc.BillingState != null) {
                billingStateList.add(new SelectOption(acc.BillingState , acc.BillingState));
            }
        }
        AccountWithFilterAndPaginationController con = new AccountWithFilterAndPaginationController();
        billingStateList = con.getAccountListForBillingState();
        System.assertEquals(billingStateList, billingStateList);
    }
    
    public static testMethod void testgetAccounts() {
        AccountWithFilterAndPaginationController con = new AccountWithFilterAndPaginationController();
        con.selectedValueForBillingCity = 'A';
        con.selectedValueForBillingCountry='A';
        con.selectedValueForBillingState='A';
        String queryStringActual = 'select Id,Name from Account where BillingCountry =:selectedValueForBillingCountry and BillingState =:selectedValueForBillingState and BillingCity =:selectedValueForBillingCity  limit 100';
        String queryStringExpected = con.getQuery();
       	System.assertEquals(queryStringActual, queryStringExpected);
        List<Account> accountListActual; //= [select Id,Name from Account where BillingState='A' and BillingState='A' and BillingState='A'];
        List<Account> accountListExpected = con.getAccounts();
        System.assertEquals(accountListActual, accountListExpected);
        
        
    }
    
    public static testMethod void testgetAccounts1() {
    	AccountWithFilterAndPaginationController con = new AccountWithFilterAndPaginationController();
        con.selectedValueForBillingCity = '-';
        con.selectedValueForBillingCountry='-';
        con.selectedValueForBillingState='-';
        String queryStringActual = 'select Id,Name from Account  limit 100';
        String queryStringExpected = con.getQuery();
       	System.assertEquals(queryStringActual, queryStringExpected);
    }
}