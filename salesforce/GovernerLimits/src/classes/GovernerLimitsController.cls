public class GovernerLimitsController {
   public List<Account> accountList{get ;set ;}
   public Integer dmlUsed {get ;set ;}
   public GovernerLimitsController(ApexPages.StandardController con) {
       dmlUsed = 0;
   }
    public GovernerLimitsController() {
       updateFunction();
   }
   public void updateFunction() {
       accountList = new List<Account>();
       accountList = [select Id,Name from Account limit 10];
       System.debug(accountList);
       upsert accountList;
       dmlUsed = Limits.getQueries();
       System.debug('DML % usage' + Limits.getQueries());
   }
}