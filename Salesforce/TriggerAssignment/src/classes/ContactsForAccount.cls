public class ContactsForAccount {
       public static void CheckContactInAccount(ID id){
       ID accountId= [Select Account.ID from Contact where Id=:id].Account.ID;
       System.debug(accountId);
       Account accounts=[Select ID,ContactIDs__c from Account where Id=:accountId];
       if(String.isBlank(accounts.ContactIDs__c)){
           List<Contact> listContact = [SELECT Id FROM Contact WHERE Account.id =: accountId];
           System.debug(listContact.size());
                String ids = '';
             for(Contact cnt:listContact)
             {
                 ids = ids+cnt.id+',';
             }
           accounts.ContactIDs__c=ids;
           update(accounts);
             
       }
       else
       {
           if(accounts.ContactIDs__c.contains(''+id)){
               System.debug('Id is present');
               
           }
           else{
               accounts.ContactIDs__c=accounts.ContactIDs__c+id;
               update(accounts);
           }
               
       }
        
   }   
}