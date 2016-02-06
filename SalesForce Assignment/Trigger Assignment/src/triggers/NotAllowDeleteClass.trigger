trigger NotAllowDeleteClass on Class__c (before delete) {
 List<Student__c> stdList = [SELECT Id,Class__r.id FROM Student__c WHERE Sex__c = 'Female'];
    Integer count=0;
    for(Class__c Classes : Trigger.oldMap.values())
     {   for(Student__c stduents:stdList)
        {  if(stduents.Class__r.id==classes.id)
            {
             count++;
            }
         }
       if(count>1)
        {
         Classes.addError('Not allowed to delete class having more than one female student');
        }
     
       count=0;
    }
}