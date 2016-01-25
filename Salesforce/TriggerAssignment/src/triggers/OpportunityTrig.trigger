trigger OpportunityTrig on Opportunity (before update) {
     List<Opportunity> opportunityList =Trigger.new;
    
    OpportunityController.populateInOpportunity(opportunityList);

}