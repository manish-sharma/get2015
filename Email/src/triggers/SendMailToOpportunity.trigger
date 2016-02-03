trigger SendMailToOpportunity on Opportunity (After Update) {
    Id[] idSet = new List<Id>();
    System.debug('Trigger.New' + Trigger.new);
    System.debug('old' + trigger.oldMAp);
    For(Opportunity oppNew : Trigger.new) {
    	if((trigger.oldMap.get(oppNew.Id).Custom_Status__c != oppNew.Custom_Status__c) && oppNew.OwnerId!=null) {
        	idSet.add(oppNew.OwnerID);
        }
    }
    if(idSet != null && idSet.size() > 0) {
    	SendMailToOpportunity.sendMail(idSet);
    }
}