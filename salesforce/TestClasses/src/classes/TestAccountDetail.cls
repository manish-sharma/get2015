@isTest
public class TestAccountDetail {
     public static testMethod void TestsearchRecordsIfBlank()
     {   AccountDetail AcDetail=new AccountDetail();
         List<Account> accountList=[SELECT id,name,billingcity,billingCountry,billingState FROM Account];
         AcDetail.searchRecords();
         System.assertEquals(accountList.size(), AcDetail.createAccountList.size());
                 
         
     }
         
    
     public static testMethod void TestsearchRecordsIfNOtBlank()
     {  String billCountry ='%US%';
         AccountDetail AcDetail=new AccountDetail();
         AcDetail.billingCountry=billCountry;
         List<Account> accountList=[SELECT id,name,billingcity,billingCountry,billingState FROM Account where billingCountry LIKE :billCountry];
         AcDetail.searchRecords();
         System.assertEquals(accountList.size(), AcDetail.createAccountList.size());
                 
         
     }

}