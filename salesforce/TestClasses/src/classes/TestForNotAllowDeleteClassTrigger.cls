@isTest
public class TestForNotAllowDeleteClassTrigger {
    public static testMethod void  TestForNotAllowDeleteClass()
    {   
        class__c newClass = new class__c(name = 'secondary',MaxSize__c=5,MyCount__c=0);
        insert newClass;
        System.debug(newClass);
        student__c newStudent1=new student__c(LastName__C='rakesh',Class__c=newClass.id,Sex__c='Female'); 
        student__c newStudent2=new student__c(LastName__C='ravi',Class__c=newClass.id,Sex__c='Female'); 
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
}