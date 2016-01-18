public with sharing class StudentByClassId {
    public static List<Student> getStudentByClassId(Integer classId) {
    	List<Student> studentList= [select (select Name from Class_Student__r) from Class__c where Class__c.Id =:classId];
    	return studentList;
    }
}

/*
--For Execution--
	List<Class__c> studentList = StudentByClassId.getStudentByClassId('a0D28000001zEPo');
	for(Class__c class1 : studentList) {
	System.debug(class1.Class_Student__r);
	System.debug('\n');
	}
*/