/** 
* Author: Dheeraj Kumar
* Created Date: 21/01/2016
* Name:  OpportunityTriggerApex
* Desc: Opportunity trigger apex helper class
*/

public class OpportunityTriggerApex { 
    
    public static List<Opportunity> newList = new List<Opportunity>();
    public static List<Opportunity> oldList = new List<Opportunity>();
    public static Map<Id,Opportunity> newMap = new Map<Id,Opportunity>();
    public static Map<Id,Opportunity> oldMap = new Map<Id,Opportunity>();     
    
    /**
*    @param void
*    @return void 
*    @desc populate closed date field with today when stage is closed won or closed lost
*/
    public static void populateClosedDateField() {
        List<Task> oppList = new List<Task>();
        for(Opportunity obj : newList)
        {
            // Checks for the Condition
            if(obj.StageName== 'Closed Won')
            {
                Task Objec = new Task(OwnerId=obj.OwnerId,Subject='Follow Up Test Task' , whatId=obj.Id);
                oppList.add(objec);
            }
        }
        // Inserts the Opplist
        insert oppList;
    }
    
      /**
*    @param void
*    @return void 
*    @desc delete associate product if custom status is Reset
*/
    public static void deleteAssociatedProduct() {
         Set<Id> setOpporutnityId = new Set<Id>();
        for (Opportunity objOpportunity: newList) {
            // Checks for the value of the Custom Status and the old value
            if (objOpportunity.Custom_Status__c != null && objOpportunity.Custom_Status__c == 'Reset' && objOpportunity.Custom_Status__c != oldMap.get(objOpportunity.Id).Custom_Status__c) {
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