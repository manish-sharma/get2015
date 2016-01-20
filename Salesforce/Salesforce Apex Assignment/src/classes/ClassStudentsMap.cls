/*Question 2 Map of class id is a key and value is a set of students*/
public class ClassStudentsMap {
    // method return map of class id of key and set of students in that class of values 
    public static Map<ID, Set<Student__c>> getAllClassByStudent() {
		
      	List<Class__c> classes=[Select Id,(select Name from Students__r) from Class__c];
		Map<Id,Set<Student__c>> mapName=new Map<Id,Set<Student__c>>();
		for (Class__c class1 : classes) {
    			mapName.put(class1.id, new Set<Student__c>(class1.Students__r));
        }
      
        return mapName;
    }

}