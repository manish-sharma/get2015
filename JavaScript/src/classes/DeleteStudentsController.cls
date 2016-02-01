public class DeleteStudentsController {
    public List<Student__c> studentList {set ; get;}
    public string callfunc{get;set;}
    Set<ID> idSet{set;get;}
    public DeleteStudentsController(ApexPages.StandardSetController controller) {
        if(idSet == null) {
            idSet = new Set<Id>();
        }
        List<Student__c> stdList = controller.getSelected();
        for(Student__c std : stdList) {
            idSet.add(std.ID);
        }
        studentList = [select ID,Name,Class__C from Student__c where ID IN : idSet];
    }
    public void deleteAll() {
        Database.delete(studentList);
    }
}