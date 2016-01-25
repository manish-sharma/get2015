/*
 * Name: UpdateMyCountTrigger
 * author: Anurag
 * Since: 25 January,2016
 * Description: Updating The MyCountTrigger
 */
trigger updateMyCountTrigger on Student__c (after insert,after update,after delete,after undelete) {
    Set<Id> classIdsSet = new Set<Id>();
    // Updating the Set For Trigger.new
    if(Trigger.isafter && (Trigger.isInsert || Trigger.IsUpdate ||Trigger.isundelete))
    {
        for(Student__c st : Trigger.new){
            classIdsSet.add(st.Class__c);
        }
    }
    // Updating the Set For Trigger.old
    if(Trigger.isAfter && (Trigger.isDelete || Trigger.IsUpdate)){
        for(Student__c st : Trigger.old){
            classIdsSet.add(st.Class__c);
        }
    }
    // It Stores the value in Map with Id and MAp
    Map<Id, Class__c> clsMap = new Map<Id, Class__c>([SELECT Id, MyCount__c FROM Class__c Where ID IN: classIdsSet]);
    if(Trigger.isUpdate)
    {
        for(Student__c stdNew :Trigger.new)
        {
            // Gets the Value of from the Id
            Class__c cls = clsMap.get(stdNew.Class__c);
            // Gets the Student from the oldMap
            Student__c oldcls = Trigger.oldMap.get(stdNew.Id);
            if(oldcls.class__C!=cls.Id)
            { 
                // Stores the id the of the Student
                class__c tempClass=clsMap.get(oldcls.class__C);
                // decreases the My count 
                tempClass.MyCount__c -= 1;
                clsMap.put(oldcls.class__C,tempClass);
                cls.MyCount__c += 1;
           }
        }
    }  
    // Trigger for the insert  and undelete
    if(Trigger.isInsert || Trigger.isundelete)
    {
        for(Student__c stdNew :Trigger.new)
        {
            Class__c cls = clsMap.get(stdNew.Class__c);
            cls.MyCount__c += 1;
        }
    }
    // Trigger For Delete
    if(Trigger.isDelete)
    {
        for(Student__c stdNew :Trigger.old)
        {
            Class__c cls = clsMap.get(stdNew.Class__c);
            cls.MyCount__c -= 1;
        }
    }
    update clsMap.values();
}