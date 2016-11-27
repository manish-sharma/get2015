public class ClassStudends {
   public static List<Student__c> getAllStudent(ID classId) {
       
       List<Student__c> studentList = [Select id ,Name from Student__c where class__r.ID = :classId];
        return studentList;
   }
}