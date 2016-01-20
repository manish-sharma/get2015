/*Question 8 : Trigger on Opportunity */
trigger RelatedAccounts on Opportunity (before update,after insert) {

    List<Opportunity> opportunityList =Trigger.new;
    
    RelatedAccounts.updateManagerField(opportunityList);
}