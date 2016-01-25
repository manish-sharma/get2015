public class UpdateMyCountTriggerHelper {
    
    public static List<Class__c> newList = new List<Class__c>();

    
    
    
    
 // Public Static List<Student__c> oldList = null;
  public static List<Class__c> clsList = [SELECT Id,MyCount__c FROM Class__c];
   public Static void insertMyCount(List<Student__c> oldList)
   {
       oldList=Trigger.new;
       for(Student__c stdNew :oldList)
        {
            for(class__c cls : clsList)
            {
                if(cls.Id==stdNew.Class__c){
                    cls.MyCount__c += 1;
                }
            }
        }
   }

}