trigger StudentTrigger on Student__c (before insert, before update, before delete, after insert, after update, after undelete) {
    
    // Assign values of trigger new list to helper class variable
    StudentTriggerApex.newList = Trigger.new;
    
    // Assign values of trigger old list to helper class variable
    StudentTriggerApex.oldList = Trigger.old;
    
    // Assign values of trigger new map to helper class variable 
    StudentTriggerApex.newMap = Trigger.newMap;
    
    // Assign values of trigger old map to helper class variable
    StudentTriggerApex.oldMap = Trigger.oldMap;
    
    
    if(trigger.isBefore){
        if(trigger.isInsert || trigger.isUpdate){
            StudentTriggerApex.notAllowInsertStudent();
            StudentTriggerApex.updateMyCount();
        }
        if(trigger.isDelete){
            StudentTriggerApex.updateMyCount();
        }
    }
    
    if(trigger.isAfter){
        if(trigger.isUndelete){
            StudentTriggerApex.updateMyCount();
            
        }
        if(trigger.isUpdate){
            
        }
    }
    
    
    
    
}