public class OpportunityController {
    public static void populateInOpportunity(List<Opportunity> oppList) {
        for(Opportunity opportunity:oppList){
            if(opportunity.BillToContact__c != null && opportunity.Manager__c == null) {
                // opportunity.Manager__c = opportunity.BillToContact__c ->  AccountId;
                // Map contact Id to Account Id
                // After this loop for new list and assign account id
            }
        }
    }
}