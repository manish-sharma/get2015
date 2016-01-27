trigger OpportunityTrigger on Opportunity (before insert, before update, before delete, after insert, after update, after undelete) {
    
    
     // Assign values of trigger new list to helper class variable
    OpportunityTriggerApex.newList = trigger.new;
    
    // Assign values of trigger old list to helper class variable
    OpportunityTriggerApex.oldList = Trigger.old;
    
    // Assign values of trigger new map to helper class variable 
    OpportunityTriggerApex.newMap = Trigger.newMap;
    
    // Assign values of trigger old map to helper class variable
    OpportunityTriggerApex.oldMap = Trigger.oldMap;
    
    
     if(trigger.isBefore){
        if(trigger.isUpdate){
				OpportunityTriggerApex.populateClosedDateField();
				OpportunityTriggerApex.deleteAssociatedProduct();
        }
        if(trigger.isDelete){

        }
    }
	    
    if(trigger.isAfter){
        if(trigger.isUndelete){


        }
        if(trigger.isUpdate){

        }
    }
    
    

}