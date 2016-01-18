public class ClassStudentsMap {
    
    public static Map<ID, Set<Student__c>> getAllClassByStudent() {

      	List<Class__c> classes=[Select Id,(select Name from Students__r) from Class__c];
		Map<Id,Set<Student__c>> mapName=new Map<Id,Set<Student__c>>();
		for (Class__c class1 : classes) {
    			mapName.put(class1.id, new Set<Student__c>(class1.Students__r));
        }
      
        return mapName;
    }

}