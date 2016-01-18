public class RelatedContactId {
    
    public static void setContactId(ID contactId) {
        
        
    
       Account acc =  [SELECT Id , Name ,ContactIDs__c, (SELECT contact.ID FROM contacts  ) FROM Account  WHERE Id in (Select AccountId from contact   where id=:contactId)] ;
       String contactcsv ='';
       
       for(Contact cnt : acc.contacts) {
            contactcsv+=cnt.id +',' ;
        }
        
        if(String.isBlank(acc.ContactIDs__c))  {
            contactcsv= contactcsv.removeEnd(',');
            acc.ContactIDs__c=contactcsv;  
           
        }
        else if(!acc.ContactIDs__c.contains(contactId)) {
             acc.ContactIDs__c+=','+contactId;
            
        }
        update (acc);
            
        
       
}
}