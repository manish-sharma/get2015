public class FillManager {
    public static List<Opportunity> fillManager(List<Opportunity> opportunityList) {
        System.debug(opportunityList.size());
        for(Opportunity opp : opportunityList) {
            if( !String.isBlank(opp.BillToContact__c) &&  String.isBlank(opp.Manager__c)) { 
                Opportunity opp1 = [select Account.Name from Opportunity where Id=:opp.Id];              
                Account acc = [select Id from Account where Name =:opp1.Account.Name limit 1];
               	opp.Manager__c = acc.Id;         
            }
        }
        return opportunityList;
    }
}