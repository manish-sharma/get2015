public class ClassWithStudentId {
    public static Map<Id,List<Student__c>> getClassWithStudentId() {
    	Map<Id,List<Student__c>> classMap = new Map<Id,List<Student__c>>();
        for(Class__c classObject : [select id from Class__c]) {
            List<Student__c> studentList = [select id from Student__c where Class__r.Id =: classObject.Id];
            classMap.put(classObject.Id, studentList);
        }
        return classMAp;
    }
}

/*
--For Execution--
	Map<Id,List<Student__c>> classMap = ClassWithStudentId.getClassWithStudentId();
	System.debug( classMap.get('a0D28000001zEPj'));
*/