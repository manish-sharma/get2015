@isTest
public class TestRestrictContactByName
{
    @isTest
    public static void Test1()
    {
        List<Contact> listContact= new List<Contact>();

    Contact cont = new Contact(LastName = 'INVALIDNAME');
        listContact.add(cont);
        Test.startTest();
       try
       {
           insert listContact;
       }
        Catch( DmlException e)
        {
            
        }
	 Test.stopTest();
       
        

       

    }
}