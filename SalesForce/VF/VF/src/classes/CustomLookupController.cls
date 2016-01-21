public class CustomLookupController {
    public Opportunity opp {get; set;}
    public Account acc {get; set;}
    public List<Contact> cntList {get; set;}
    Set<Id> idSet = new Set<Id>();
    public CustomLookupController(ApexPages.StandardController controller) {
        Id currentId = ApexPages.currentPage().getParameters().get('Id');
        opp = [select Manager__r.Id from Opportunity where id=:currentId];
        acc = [select (Select Id ,Name from Contacts) from Account where id = :opp.Manager__r.Id ];
        System.debug(acc.Id);
        cntList = [Select Id ,Name from Contact where Id =: acc.Contacts];
        System.debug(cntList.size());
    }
}