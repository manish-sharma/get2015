@isTest
public class TestStudentByClassId {
	public static testMethod void testgetStudentByClassId() {
    	List<Student__c> studentList= [select Name from Student__c where Class__c ='a0D28000001zEPoEAM'];
        List<Student__c> studentListActual = StudentByClassId.getStudentByClassId('a0D28000001zEPoEAM');
        System.assertEquals(studentList, studentListActual);
    }
}