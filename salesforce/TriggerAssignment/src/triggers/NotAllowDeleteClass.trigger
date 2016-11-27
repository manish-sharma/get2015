trigger NotAllowDeleteClass on Class__c (before delete) {
   for(Class__c cls : Trigger.old)
   {
       List<Student__c> stdList = [SELECT Id FROM Student__c WHERE Class__c=:cls.id AND Sex__c = 'Female'];
       System.debug(stdList);
       if(stdList.size()>1)
       {
           cls.addError('Not allowed to delete class having more than one female student');
       }
   }
}