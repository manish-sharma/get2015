public class AccountPDFController {
    public List<Account> accList {get;set;}
    public AccountPDFController(ApexPages.StandardController controller) {
         accList = Database.query('select Id,Name from Account');
    }
}