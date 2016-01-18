public class ContactIdCheck {
    public static void checkContactIDs(ID contactId){
        String contactIds=' ';
        ID accountID = [SELECT Account.Id FROM Contact where ID=:contactId].Account.Id;
        Account account = [SELECT ID,Name,ContactIDs__c FROM Account Where ID=:accountID];
        if(String.isBlank(Account.ContactIDs__c)){
            List<Contact> contactList = [SELECT ID FROM Contact];
            for(Contact con : contactList){
                contactIds = contactIds + ',' + con.Id;
            }
            account.ContactIDs__c = contactIds;
            update(account);
            
        }
        else if(account.id == accountID && !account.ContactIDs__c.contains(contactID))
                          {
                                account.ContactIDs__c =  account.ContactIDs__c +','+ contactID;
                           
                          }
        update(account);
    }
}