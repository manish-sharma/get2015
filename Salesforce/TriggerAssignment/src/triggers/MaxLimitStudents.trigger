/*
 * Name: MaxLimitStudents
 * author: Anurag
 * Since: 25 January,2016
 * Description: If max limit is reached provides an error
 */
trigger MaxLimitStudents on Student__c (before insert, before update) {
    // Lis to store the Class information
    List<Class__c> ClassList = [SELECT Id, NumberOfStudents__c, MaxSize__c FROM Class__c];
    for (Class__c cls : ClassList) {
        for (Student__c std : Trigger.new) {
            if (std.Class__c == cls.Id && cls.MaxSize__c == cls.NumberOfStudents__c) {
                // Adds the Error
                std.addError('Class Size Limit Reached. Cannot Add More Students.');
            }
        }
    }
}