trigger OpportunityProductDelete on Opportunity (after update) {
    if(Trigger.isAfter && Trigger.isUpdate){
        Set<ID> setOpportunityId = new Set<ID>();
        for(Opportunity oppo : Trigger.NEW){
            if(oppo.Custom_Status__c != null && oppo.Custom_Status__c == 'Reset' && oppo.Custom_Status__c != Trigger.OldMap.get(oppo.ID).Custom_Status__c){
                setOpportunityId.Add(oppo.ID);
            }
        }
        if(setOpportunityID != null && setOpportunityID.size() > 0){
          /*  List<OpportunityLineItem> opportunityLineItemList = new List<OpportunityLineItem>();
            for(Opportunity opportunityObject : [SELECT ID,Name,(SELECT Id FROM OpportunityLineItem) FROM Opportunity where Id in:setOpportunityId]){
                if(opportunityObject.opportunityLineItemList != null &&  opportunityObject.opportunityLineItem.size() > 0){
                    opportunityListItemList.AddAll(opportunityObject.OpportunityLineItems);
                }
            }*/
        }
        //if(opportunityListItemList != null && opportunityListItemList.size > 0){
          delete [SELECT Id FROM OpportunityLineItem where OpportunityId in : setOpportunityId];
        }
    }
