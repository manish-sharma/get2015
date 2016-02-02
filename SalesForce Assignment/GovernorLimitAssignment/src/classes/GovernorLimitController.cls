public class GovernorLimitController {
 public List<Account> accountList{get ;set ;}
  public Integer dmlUsed {get ;set ;}
  public GovernorLimitController(ApexPages.StandardController con) {
      dmlUsed = 0;
  }
   public GovernorLimitController() {
      updateFunction();
  }
  public void updateFunction() {
      accountList = new List<Account>();
      accountList = [select Id,Name from Account limit 10];
      update accountList;
      dmlUsed = Limits.getQueries();
      System.debug('DML % usage' + Limits.getQueries());
  }
}