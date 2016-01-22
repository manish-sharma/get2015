trigger Trigger3 on Student__c (before insert, before update) {
   List<Class__c> ClassList = [SELECT Id, MyCount__c, MaxSize__c FROM Class__c];
   for (Class__c cls : ClassList) {
       for (Student__c std : Trigger.new) {
           if (std.Class__c == cls.Id && cls.MaxSize__c == cls.MyCount__c) {
               std.addError('Class Size Limit Reached. Cannot Add More Students.');
           }
       }
   }
}