trigger UpdateMyCount on Student__c (after delete, after insert, after undelete, after update) {
    Set<Id> classIdsSet = new Set<Id>();
   if(Trigger.isafter && (Trigger.isInsert || Trigger.IsUpdate ||Trigger.isundelete))
   {
       for(Student__c st : Trigger.new){
           classIdsSet.add(st.Class__c);
       }
   }
   if(Trigger.isAfter && (Trigger.isDelete || Trigger.IsUpdate)){
       for(Student__c st : Trigger.old){
           classIdsSet.add(st.Class__c);
       }
   }
   
   Map<Id, Class__c> clsMap = new Map<Id, Class__c>([SELECT Id, MyCount__c FROM Class__c Where ID IN: classIdsSet]);
   if(Trigger.isUpdate)
   {
       for(Student__c stdNew :Trigger.new)
       {
           Class__c cls = clsMap.get(stdNew.Class__c);
           
           Student__c oldcls = Trigger.oldMap.get(stdNew.Id);
           if(oldcls.class__C!=cls.Id)
           { 
               class__c tempClass=clsMap.get(oldcls.class__C);
               tempClass.MyCount__c -= 1;
               clsMap.put(oldcls.class__C,tempClass);
               cls.MyCount__c += 1;   
           }
       }
   }  
   
   if(Trigger.isInsert && Trigger.isundelete)
   {
       for(Student__c stdNew :Trigger.new)
       {
           Class__c cls = clsMap.get(stdNew.Class__c);
           cls.MyCount__c += 1;
       }
   }
   
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