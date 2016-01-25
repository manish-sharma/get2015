/*
 * Name: DeleteOpportunityLineItemOnReset
 * author: Anurag
 * Since: 25 January,2016
 * Description: Deletes the Opportunity On Reset
 */
trigger DeleteOpportunityLineItemOnReset on Opportunity (after update) { 
    if (Trigger.IsAfter && Trigger.IsUpdate) {
        Set<Id> setOpporutnityId = new Set<Id>();
        for (Opportunity objOpportunity:Trigger.New) {
            // Checks for the value of the Custom Status and the old value
            if (objOpportunity.Custom_Status__c != null && objOpportunity.Custom_Status__c == 'Reset' && objOpportunity.Custom_Status__c != Trigger.OldMap.get(objOpportunity.Id).Custom_Status__c) {
                setOpporutnityId.Add(objOpportunity.id);
            }
        }
        // Sets the Value of size  and checks the opportunity Id
        if (setOpporutnityId != null && setOpporutnityId.size() > 0) {
            List<OpportunityLineItem> opportunityLineItemList = [select id from OpportunityLineItem where Opportunity.Id IN :setOpporutnityId];
            Database.delete(opportunityLineItemList);
        }
    }
}