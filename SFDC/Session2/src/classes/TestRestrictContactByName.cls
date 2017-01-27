@isTest
public class TestRestrictContactByName {
  @isTest
    static void test1()
    {    
       Contact cnt = new Contact(FirstName='fusd',LastName='INVALIDNAME');
       Test.startTest();
       Database.SaveResult err = Database.insert(cnt,false);
       Test.stopTest(); 
       System.assert(!err.isSuccess());
       System.assert(err.getErrors().size() > 0);
       System.assertEquals('The Last Name "INVALIDNAME" is not allowed for DML',err.getErrors()[0].getMessage());
}
}