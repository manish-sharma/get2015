/*Question 1  Getting all the students of a class */

public class ClassStudends {
    // Method take classid as input and return list of students in that class  
    public static List<Student__c> getAllStudent(ID classId) {
        
        List<Student__c> studentList = [Select id ,Name from Student__c where class__r.ID = :classId];
         return studentList;
    }

}