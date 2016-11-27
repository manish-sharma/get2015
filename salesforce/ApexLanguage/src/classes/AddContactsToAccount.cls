public class AddContactsToAccount {
    
  public static void CheckContactInAccount(ID contactsid){
    try {
      ID accountId= [Select AccountID from Contact where Id=:contactsid].AccountID;
      Account accounts=[Select ID,ContactIDs__c from Account where Id=:accountId];
      if(String.isBlank(accounts.ContactIDs__c)){
          List<Contact> listContact = [SELECT Id FROM Contact WHERE Account.id =: accountId];
               String contactIds = '';
            for(Contact contacts:listContact){
                contactIds = contactids+contacts.id+',';
            }
          accounts.ContactIDs__c=contactIds;
        }
      else {
           if(!(accounts.ContactIDs__c.contains(''+contactsid))){
           accounts.ContactIDs__c=accounts.ContactIDs__c+contactsid;
          }
        }
      
     update(accounts);
} catch(DmlException e) {
    System.debug('The following exception has occurred: ' + e.getMessage());
  }

}   
}