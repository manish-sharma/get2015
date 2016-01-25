public class GenerateMap{
    public static Map < Class__c,
    Set < ID >> MapofClassAndStudentId() {
        list < Class__c > classList = [Select c.ID From Class__c c];
        Map < Class__c,
        Set < ID >> mapStudentInClass = new Map < Class__c,Set < ID >> ();
        for (Integer i = 0; i < classList.size(); i++) {
            Set < ID > studentSet = new Map < Id,
            Student__c > ([Select s.ID from Student__c s where s.Class__r.id =  : classList.get(i).Id]).keySet();

            mapStudentInClass.put(classList[i], studentSet);
        }
        System.debug(mapStudentInClass);
        
        /*
            Map<Id, List<Id>> temp = new Map<Id, List<ID>>();
            
            // PUT value in map
            List<Id> idVals = (temp.containsKey(classId)) ? temp.get(classId) : new List<Id>();
            idVals.add('dglsfk');
            temp.put(classId, idVals);
        */
        
        return mapStudentInClass;
    }
}