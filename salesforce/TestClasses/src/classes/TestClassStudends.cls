@isTest
public class TestClassStudends {
 @isTest static void TestGetAllStudent()
 { 
     Id ClassId = 'a0628000004Doc3';
     List<student__c> classList = [Select Name  from Student__c where class__r.ID = :classId];
     List<String> studentList = ClassStudends.getAllStudent(ClassId);
     System.assertEquals(classList.size(),studentList.size());
     
 }
}