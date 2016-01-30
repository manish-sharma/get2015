public class DeleteStudentController {
 public  List<Student__c> selectedsts{get;set;}
   private ApexPages.StandardSetController standardController;

   public DeleteStudentController(ApexPages.StandardSetController standardController)
   {
       this.standardController = standardController;
   }

   public void bumpCases()
   {       
       // Get the selected records (optional, you can use getSelected to obtain ID's and do your own SOQL)
       selectedsts = (List<Student__c>) standardController.getSelected();
       selectedsts =[select name,id,class__r.Name from student__c where id In : selectedsts];
             
   }
   public PageReference deleteStudent() {
       delete selectedsts ;
       System.debug('executed');
       return standardController.cancel();
   }

  
}