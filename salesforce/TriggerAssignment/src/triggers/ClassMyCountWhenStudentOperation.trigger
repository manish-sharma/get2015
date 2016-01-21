trigger ClassMyCountWhenStudentOperation on Student__c (before insert,before update,before delete,after undelete) {
   if(Trigger.isUpdate)
   {
       for(Student__c stdNew : Trigger.new)
       {
           Student__c stdOld = Trigger.oldMap.get(stdNew.Id);
           if(stdOld.Class__c != stdNew.Class__c)
           {
              Class__c clsNew = [SELECT Id,MyCount__c FROM Class__c WHERE Id =:stdNew.Class__c ] ;
              clsNew.MyCount__c = clsNew.MyCount__c +1;
              update clsNew;
              Class__c clsOld = [SELECT Id,MyCount__c FROM Class__c WHERE Id =:stdOld.Class__c ] ;
              clsOld.MyCount__c = clsOld.MyCount__c - 1;
               update clsOld;
           }
       }
   }
   if(Trigger.isInsert)
   {
       for(Student__c stdNew :Trigger.new)
       {
           Class__c clsNew = [SELECT Id,MyCount__c FROM Class__c WHERE Id =:stdNew.Class__c ] ;
           clsNew.MyCount__c = clsNew.MyCount__c +1;
           System.debug('hello insert');
           update clsNew;
       }
   }
   
       if(Trigger.isDelete)
       {
          for(Student__c stdOld :Trigger.old)
          {
            Class__c clsOld = [SELECT Id,MyCount__c FROM Class__c WHERE Id =:stdOld.Class__c ] ;
            clsOld.MyCount__c = clsOld.MyCount__c -1;
            update clsOld;
          } 
       }
       
      if(Trigger.isUndelete)
           {
                  for(Student__c stdOld :Trigger.old)
                  {
                    Class__c clsOld = [SELECT Id,MyCount__c FROM Class__c WHERE Id =:stdOld.Class__c ] ;
                    clsOld.MyCount__c = clsOld.MyCount__c +1;
                    update clsOld;
                  } 
       }
  
}