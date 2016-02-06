public class AccountUpdate {
public static void updateManagerField(List<Opportunity> opportunityList) {
    List<Opportunity> listToUpdate = new List<Opportunity>();
       for(Opportunity opp : opportunityList) {
           if(opp.BillToContact__c != null && opp.Manager__c == null) {
               opp.Manager__c=opp.BillToContact__r.Account.id;
                listToUpdate.add(opp);
           }
       }
      update listToUpdate;

                    
   }
}