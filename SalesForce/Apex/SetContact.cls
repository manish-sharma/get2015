public class SetContact {
    public static void addContact(String contactId) {
       List<Contact> resultList = [select AccountId from Contact where Id =:contactId];
        List<Account> accountList = new List<Account>();
        for(Contact cntct : resultList) {
            Account acnt = [select Id,ContactIDs__c from Account  where Id = :cntct.AccountId];
            accountList.add(acnt);
        }
        for(Account acnt : accountList) {
            System.debug(acnt.Id);
            if(acnt.ContactIDs__c == null) {
                acnt.ContactIDs__c = contactId;
            }
            else {
                if(!acnt.ContactIDs__c.contains(contactId)) {
                      acnt.ContactIDs__c = acnt.ContactIDs__c + ',' + contactId;
                }       
            }
        }
        Database.update( accountList);
    }
}