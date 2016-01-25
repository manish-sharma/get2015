/*
 * Name: DeleteNotAllowedForFemale
 * author: Anurag
 * Since: 25 January,2016
 * Description: Deleting the Class is not possible when no of femal students is more than 1
 */
trigger DeleteNotAllowedForFemale on Class__c (before delete) {
    //List of student where Sex is female 
    List<Student__c> stdList = [SELECT Id, Sex__c, class__c FROM Student__c WHERE Sex__c = 'Female']; 
    Map <Id, Integer> CountOfFemale = new Map<Id, Integer>();
    // Populating the Map
    for(Student__c stu : stdList) {
        if(!(CountOfFemale.containsKey(stu.Class__c))) {
            CountOfFemale.put(stu.Class__c, 1);
        } else {
            CountOfFemale.put(stu.Class__c, CountOfFemale.get(stu.Class__c) + 1);
        }
    }
    // Checks the Trigger.old And provides the Error
    for(Class__c cls : Trigger.old)
   {
       if(CountOfFemale.containsKey(cls.Id) && countOfFemale.get(cls.Id)>1)    
       {
            cls.addError('Not allowed to delete class having more than one female student');
       }
   }
}