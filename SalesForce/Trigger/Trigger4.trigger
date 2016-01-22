trigger Trigger4 on Student__c (before insert,before delete,after undelete) {
    
    if(trigger.isInsert) {
        List<Class__c> ClassList = [SELECT Id, MyCount__c, MaxSize__c FROM Class__c];
        List<Class__c> classListNew = new List<Class__c>();
        for (Class__c cls : ClassList) {
            for (Student__c std : Trigger.new) {
                if(cls.MyCount__c == null) {
                    cls.MyCount__c = 0;
                }
                cls.MyCount__c ++;
                classListNew.add(cls);
            }
        }
        update classListNew;
    }
    if(trigger.isDelete) {
        List<Class__c> ClassList = [SELECT Id, MyCount__c, MaxSize__c FROM Class__c];
        List<Class__c> classListNew = new List<Class__c>();
        for (Class__c cls : ClassList) {
            for (Student__c std : Trigger.old) {
                if(cls.MyCount__c == null) {
                    cls.MyCount__c = 0;
                }
                else {
                    cls.MyCount__c --;
                    classListNew.add(cls);
                }
                
            }
            update classListNew;
        }
    }
    
    if(trigger.isUndelete) {
         List<Class__c> ClassList = [SELECT Id, MyCount__c, MaxSize__c FROM Class__c];
        List<Class__c> classListNew = new List<Class__c>();
        for (Class__c cls : ClassList) {
            for (Student__c std : Trigger.new) {
                if(cls.MyCount__c == null) {
                    cls.MyCount__c = 0;
                }
                else {
                    cls.MyCount__c ++;
                    classListNew.add(cls);
                }
                
            }
            update classListNew;
        }
    }
}