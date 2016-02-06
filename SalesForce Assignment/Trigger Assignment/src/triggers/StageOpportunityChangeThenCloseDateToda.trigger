trigger StageOpportunityChangeThenCloseDateToda on Opportunity (before update) {
 for(Opportunity oppty:Trigger.newMap.values())
   {
       if(oppty.StageName == 'Closed Won' || oppty.StageName == 'Closed Lost')
       {
           oppty.CloseDate = Date.today();
       }
   }
}