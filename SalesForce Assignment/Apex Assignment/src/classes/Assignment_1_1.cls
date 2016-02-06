public class Assignment_1_1 {
    public static List<Student__c> ListOfStudents(ID class_id){
        List<Student__c> listOfStudents = [SELECT id,Name FROM Student__c where class__r.id=:class_id];
        return listOfStudents;
    }
}