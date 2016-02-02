@isTest
public class TestContactAndLeadSearch {
    public static testMethod void searchContactsAndLeads(){
        String searchString = 'Avinash';
        List<List<SObject>> searchResult = [find 'Avinash' IN NAME FIELDS Returning Contact,Lead];   
       	List<List< sObject>> result = ContactAndLeadSearch.searchContactsAndLeads(searchString);
        System.equals(searchResult, result);
    }
}