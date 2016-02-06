trigger UpdateOpportunity on Opportunity (before update) {
	List<Opportunity> opportunityList = [ Select id ,BillToContact__c, BillToContact__r.AccountId , Manager__c  from Opportunity where id in : Trigger.NewMap.keySet()] ;
      AccountUpdate.updateManagerField(opportunityList);
}