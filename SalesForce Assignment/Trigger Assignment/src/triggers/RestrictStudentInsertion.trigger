trigger RestrictStudentInsertion on Student__c (before insert) {
List<Class__c> stdClass = [SELECT ID,MaxCount__c,NumberOfStudent__c FROM Class__c];
  
    if(Trigger.isBefore && Trigger.isUpdate)
    {  
      List<Student__c> studentList=new List<Student__c>(Trigger.newMap.values());
    
  for(Student__c std : studentList)
  {  for(Class__c Classes:stdClass)
       {   
          system.debug(std.class__r.id+' as'+Classes.id+'maxsize'+ Classes.MaxCount__c+'students'+Classes.NumberOfStudent__c);
          if(Classes.id==std.class__c && Classes.MaxCount__c <= Classes.NumberOfStudent__c )
           {
            std.addError('No more seat  available in the class');
          }
      }
    }
  }
}