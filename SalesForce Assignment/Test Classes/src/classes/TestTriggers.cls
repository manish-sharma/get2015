@isTest
public class TestTriggers {
 @isTest
 public static void  TestOpportunityWhenStageChange()
     {  
       Date Opportunitydate =Date.newInstance(2014, 07, 15);
       Opportunity newOpportunity=new Opportunity(Name='test',StageName='Qualification',CloseDate=Opportunitydate);
       insert newOpportunity;
         test.startTest(); 
       try
       {
           update newOpportunity;
       }
       catch(Exception ee)
       { 
           system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
       }
       Test.stopTest();
     }
   @isTest  
   public static void testContactTriggerWhenInsert(){ 
      Test.startTest();
      contact newcontact=new contact(FirstName='nikhil',LastName='tinkar',Subjects__c='Hindi');
      try{
      	insert newcontact;
      }
      catch(Exception ee){ 
        system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
      }
      Test.stopTest();
    }
    @isTest
    public static void  TestContactTriggerWhenUpdate()
       {  
           Test.startTest();
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
    
   @isTest
   public static void  TestForNotAllowDeleteClass()
   {   
       Class__c newClass = new Class__c(Name__c = 'secondary',MaxCount__c=5,MyCount__c=0);
       insert newClass;
       System.debug(newClass);
       student__c newStudent1=new student__c(Last_Name__c='rakesh',Class__c=newClass.id,Sex__c='Female'); 
       student__c newStudent2=new student__c(Last_Name__c='ravi',Class__c=newClass.id,Sex__c='Female'); 
       insert newStudent1;
       insert newStudent2;
       System.debug('student1'+newStudent1+'student2'+newStudent2);
       Test.startTest();
       try
       {
           delete newClass;
       }
       catch(Exception ee)
       { 
           system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
       }
       Test.stopTest();
   }
   
    @isTest
     public static void TestStudentTrigger(){ 
     Id classId = 'a0628000004Doc3';
    student__c newStudent=new student__c(Last_Name__C='test',Class__c=classId);
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