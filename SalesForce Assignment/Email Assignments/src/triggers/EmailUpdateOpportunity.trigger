trigger EmailUpdateOpportunity on Opportunity (before update) {
   for(Opportunity opp: Trigger.New){
   	Opportunity oldOpp = Trigger.oldMap.get(opp.Id);
       if(opp.StageName != oldOpp.StageName) {
           sendEmailOnOppStatusChange.sendEmailWhenStageChange(opp);
       }
   }  
}