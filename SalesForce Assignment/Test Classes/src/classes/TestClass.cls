@isTest
public class TestClass {
    @testSetup public static void testData(){
        Class__c testClass = new Class__c(Name='XIIth',Board__c='CBSE',Fee__c=300,MaxCount__c=20,MyCount__c=0,Name__c='XIIth Science');
        insert testClass;
        Student__c student1 = new Student__c(Name='Shishir Pareek',First_Name__c = 'Shishir',Last_Name__c='Pareek',Class__c=testClass.Id);
        Student__c student2 = new Student__c(Name='Amit Natani',First_Name__c = 'Amit',Last_Name__c='Natani',Class__c=testClass.Id);
        Student__c student3 = new Student__c(Name='Riddhi Jain',First_Name__c = 'Riddhi',Last_Name__c='Jain',Class__c=testClass.Id);
        List<Student__c> testStudent = new List<Student__c>();
        testStudent.add(student1);
        testStudent.add(student2);
        testStudent.add(student3);
        insert testStudent; 
       
        Account TestAccount=new Account(name='test');
        Contact TestContact=new Contact(LastName = 'ContactTest', Account=TestAccount);
        insert TestAccount;
        insert TestContact;
   }
	@isTest
    public static void testListOfStudents(){
        Class__c testClass = [SELECT id From Class__c];
        List<Student__c> testList;
        testList=Assignment_1_1.getStudentList(testClass.Id);
        Integer count = 3;
        System.assertEquals(count,  Assignment_1_1.getStudentList(testClass.Id).size());
    }
    @isTest  
      public static void testStudentMap(){
      Map<ID,Set<Student__c>> testMap = StudentMap.getAllClassByStudent();
      System.assertEquals(1, testMap.size());
    }
    
    @isTest
    public static void testBusinessDays1(){
        Date testStartingDate = Date.newInstance(2016, 1, 29);
        Date testEndingDate = Date.newInstance(2016,2,14);
        System.assertEquals(11,BusinessDays.getWorkingDays(testStartingDate, testEndingDate));
    }
    
    @isTest
    public static void testBusinessDays2(){
        Date testStartingDate = Date.newInstance(2016, 1, 31);
        Date testEndingDate = Date.newInstance(2016,1,31);
        System.assertEquals(0,BusinessDays.getWorkingDays(testStartingDate, testEndingDate));
    }
    
    @isTest
    public static void testBusinessDays3(){
        Date testStartingDate;
        Date testEndingDate = Date.newInstance(2016,1,31);
        System.assertEquals(0,BusinessDays.getWorkingDays(testStartingDate, testEndingDate));
    }
    
   /*  @isTest
    public static void testBusinessDays4(){
        Date testStartingDate = Date.newInstance(2016,2,29);
        Date testEndingDate = Date.newInstance(2016,1,31);
        System.assertEquals(0,BusinessDays.getWorkingDays(testStartingDate, testEndingDate));
    }*/
    
       
    @isTest static void testStackinsertItem()
     {  
       Stack TestStack=new Stack();
       integer ExpectedSize=2;
       TestStack.push(2);
       TestStack.push(-5);
       integer ExtualSize=TestStack.size();
       System.assertEquals(ExpectedSize,ExtualSize);
             
   }
   
    @isTest static void testStackRemoveItem()
    {  
       Stack TestStack=new Stack();
       integer ExpectedSize=0;
       TestStack.push(7);
       TestStack.push(-35);
       TestStack.pop();
        TestStack.pop();
       System.assertEquals(ExpectedSize,ExpectedSize);
       
       
    }
      @isTest static void testStackPeekValue()
    {  
       Stack TestStack=new Stack();
       integer ExpectedSize=74;
       TestStack.push(74);
       TestStack.push(-35);
       TestStack.pop();
       integer ExtualValue = (Integer)TestStack.peek();
       System.assertEquals(ExpectedSize,ExtualValue);
           
    }
      @isTest static void testStackPeekValueIfStackIsEmpty()
    {  
       Stack TestStack=new Stack();
       Object ExpectedValue=null;
       Object ExtualValue =TestStack.peek();
       System.assertEquals(ExpectedValue,ExtualValue);
           
    }
       @isTest static void  testRemoveItemIfStackIsEmpty()
       {  
       Stack TestStack=new Stack();
        Object ExpectedValue=null;
       Object ExtualValue =TestStack.pop();
       System.assertEquals(ExpectedValue,ExtualValue);
          
      }
    @isTest static void testSendEmail(){
        String [] emailAddress = new List<String> { 'shishir.pareek@metacube.com' };
        String result = OpportunityUpdateEmail.SendEmail(emailAddress);
        System.assertEquals('Email sent successfully', result);
    }
     /*@isTest static void testSendEmailNegative(){
        String [] emailAddress = new List<String> {};
        String result = OpportunityUpdateEmail.SendEmail(emailAddress);
        System.assertEquals('Email Sending Unsuccessfull', result);  
    }*/
    
    @isTest static void testListOfOrganization(){
        List<Schema.SObjectType> testListOfObjects = ListOfOrganization.getListOfSObjects();
        System.assertEquals(355, testListOfObjects.size());
    }
  
  /* @isTest static void TestIfContactIdsBlank()
     {
         List<Contact> ContactList =  [select id from Contact where LastName = 'ContactTest'];
         System.debug(ContactList);
          id ContactId;
          String ContactIds;
         
         if(ContactList.size()>0)
          {
          ContactId=ContactList.get(0).id;
          }
            ContactIdCheck.checkContactIDs(ContactId);
            List<Account> AccountList =  [select id,ContactIDs__c from Account];
            System.debug(AccountList);
            if(AccountList.size()>0){
                ContactIds = AccountList.get(0).ContactIDs__c;
            }
         System.assertEquals(ContactIds,ContactId+'');
    }*/
    
}