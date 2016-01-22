trigger Trigger2 on Class__c (before delete) {
    Set<Id> idSet = new Set<Id>();
    List<Class__c> classList = new List<Class__c>(trigger.old);
    for(Class__c cls : trigger.old) {
        idSet.add(cls.Id);
    }
     List<Student__c> studentList = new List<Student__c>([select Id,Name,sex__c from Student__c where class__r.Id IN :idSet and sex__c='Female']);
    System.debug(studentList.size());
    if(studentLIst.size()>1)
        for(Class__c cls : classList) {
            cls.addError('cant delete');
     }
}