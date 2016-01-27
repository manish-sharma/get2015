trigger ContactTrigger on Contact (before insert, before update, before delete, after insert, after update, after undelete) { 
    
     // Assign values of trigger new list to helper class variable
    ContactTriggerApex.newList = trigger.new;
    
    // Assign values of trigger old list to helper class variable
    ContactTriggerApex.oldList = Trigger.old;
    
    // Assign values of trigger new map to helper class variable 
    ContactTriggerApex.newMap = Trigger.newMap;
    
    // Assign values of trigger old map to helper class variable
    ContactTriggerApex.oldMap = Trigger.oldMap;
    
    
     if(trigger.isBefore){
        if(trigger.isInsert || trigger.isUpdate){
             ContactTriggerApex.restrictTeachingHindi(Trigger.New);

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