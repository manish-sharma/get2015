@isTest
public class TestNotAllowTeacherToHindi {
     public static testMethod void  TestContactTriggerWhenInsert()
     { 
         contact newcontact=new contact(FirstName='nikhil',LastName='tinkar',Subjects__c='Hindi');
         try
         {
          insert newcontact;
         }
        catch(Exception ee)
         { 
         system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
         }
         Test.stopTest();
     }
     public static testMethod void  TestContactTriggerWhenUpdate()
        {  
        contact newcontact=new contact(FirstName='nikhil',LastName='tinkar',Subjects__c='English');
        insert newcontact;
        newcontact.Subjects__c = 'Hindi';
       try
        {
         update newcontact;
        }
     catch(Exception ee)
        { 
         system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
        }
      Test.stopTest();    
                
     }
   

}