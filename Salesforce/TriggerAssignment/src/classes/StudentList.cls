public class StudentList
{
	public static List<Student__c> getStudentById(Id id)
    {
        List<Student__c>  result = [Select  s.First_Name__c, s.Class__c From Student__c s where Class__r.id = :id ] ;
        return result;
    }

}