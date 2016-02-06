trigger NotAllowTeacher_To_Hindi on Contact (before insert,before update) {

   for(Contact contacts:Trigger.newMap.values())
   {   
       if(contacts.Subjects__c.Contains('Hindi'))
       {
           contacts.addError('Not allowed hindi teacher');
       }
   }
}