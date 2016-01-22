trigger Trigger6 on Opportunity (before update) {
    list <OpportunityLineItem> Opplist =[select id,Opportunity.id  from OpportunityLineItem where Opportunity.id in : trigger.new];
    for(Opportunity opp : Trigger.new) {
        for(OpportunityLineItem oppLines : Opplist) {
            if(oppLines.Opportunity.id  == opp.Id) {
                if(opp.Custom_Status__c == 'Reset') { 
        			oppLines.Opportunity.id = null;
   			 	} 
            }
        }
   }
}