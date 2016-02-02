@isTest
public class TestForAddContactsToAccount {
     @isTest static void TestIfContactIdsIsBlank()
      {
          Id contactId = 'a0628000004Doc3';
          AddContactsToAccount.CheckContactInAccount(contactId);
      }
    @isTest static void TestIfContactIdsBlank()
      {
              Account TestAccount=new Account(name='test');
               insert TestAccount;
               System.debug(TestAccount.id+'   '+TestAccount.name);
              Contact TestContact=new Contact(LastName = 'ContactTest', Account=TestAccount);
               insert TestContact;
              System.debug(TestContact.id+'   '+TestContact.Account.name);
              AddContactsToAccount.CheckContactInAccount(TestContact.id);
      }

}