@isTest
public class TestRestrictContactByName {
    @isTest static void testTriggerNegative() {
        Contact cont = new Contact(LastName = 'INVALIDNAME');
        Test.startTest();
        try
        {
        insert(cont);
        }catch(DmlException e) {
            
        }
        Test.stopTest();   
    } 
    
    @isTest static void testTrigger() {
        Contact cont = new Contact(LastName = 'XYZ');
        Test.startTest();
        try
        {
        insert(cont);
        }catch(DmlException e) {
            
        }
        Test.stopTest();   
    } 
}