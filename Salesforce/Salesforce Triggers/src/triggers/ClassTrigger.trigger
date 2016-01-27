trigger ClassTrigger on Class__c (before insert, before update, before delete, after insert, after update, after undelete) {
    
     // Assign values of trigger new list to helper class variable
    ClassTriggerApex.newList = trigger.new;
    
    // Assign values of trigger old list to helper class variable
    ClassTriggerApex.oldList = Trigger.old;
    
    // Assign values of trigger new map to helper class variable 
    ClassTriggerApex.newMap = Trigger.newMap;
    
    // Assign values of trigger old map to helper class variable
    ClassTriggerApex.oldMap = Trigger.oldMap;
    
    
     if(trigger.isBefore){
        if(trigger.isInsert || trigger.isUpdate){

        }
        if(trigger.isDelete){
            ClassTriggerApex.notAllowDeleteClass();

        }
    }
	    
    if(trigger.isAfter){
        if(trigger.isUndelete){


        }
        if(trigger.isUpdate){

        }
    }
    
    
    

}