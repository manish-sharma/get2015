@isTest
public class TestClassWithStudentId {
    public static testMethod void testgetClassWithStudentId(){
        Map<Id,List<Student__c>> classMap = new Map<Id,List<Student__c>>();
        List<Class__c> clsList = new List<Class__c>();
        Set<Id> idSet = new Set<Id>();
        for(Class__c classObject : [select id from Class__c]) {
            idSet.add(classObject.Id);
        }
        clsList = [select id,(Select id from Class_Student__r) from Class__c where id in:idSet];
        for(Class__c cls : clsList) {
            classMap.put(cls.Id, cls.Class_Student__r);
        }
        System.assertEquals(classMap, ClassWithStudentId.getClassWithStudentId());
    }
}