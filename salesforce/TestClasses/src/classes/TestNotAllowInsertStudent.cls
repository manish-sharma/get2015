@isTest
public class TestNotAllowInsertStudent {
   public static testMethod void  TestStudentTrigger()
    { 
      Id classId = 'a0628000004Doc3';
     student__c newStudent=new student__c(LastName__C='test',Class__c=classId);
     Test.startTest();
     try
     {
         insert newStudent;
     }
     catch(Exception ee)
     { 
         system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
     }
      Test.stopTest();
     
    }
}