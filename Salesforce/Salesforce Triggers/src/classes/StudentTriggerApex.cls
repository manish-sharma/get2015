/** 
* Author: Dheeraj Kumar
* Created Date: 21/01/2016
* Name:  ClassTriggerApex
* Desc: Student__c trigger apex helper class 
*/
public class StudentTriggerApex {
    
    public static List<Student__c> newList = new List<Student__c>();
    public static List<Student__c> oldList = new List<Student__c>();
    public static Map<Id,Student__c> newMap = new Map<Id,Student__c>();
    public static Map<Id,Student__c> oldMap = new Map<Id,Student__c>();     
    
    /**
*    @param List<Contact>
*    @return void 
*    @desc add error when class has not seats available 
*/
    public static void notAllowInsertStudent() {
        for(Student__c std : newList )
        {
            Class__c stdClass = [SELECT Max_Size__c,Number_Of_Students__c FROM Class__c WHERE Id=:std.Class__c];
            if(stdClass.Max_Size__c <= stdClass.Number_Of_Students__c)
            {
                std.addError('No more seat in selected class');
            }
        }
        
    }
    
    
      
/**
*    @param void
*    @return void 
*    @desc updating mycount field in class object
*/
    public static void updateMyCount() {
        
        if(oldList.size() == 0) {
            for(Student__c st : newList) {
                Class__c cls =  [SELECT Id,My_Count__c FROM Class__c WHERE Id =:st.Class__c ] ;
                cls.My_Count__c ++;
                
            }
        }
        else if(newList.size() == 0 ) {
            for(Student__c st : oldList) {
                Class__c cls =  [SELECT Id,My_Count__c FROM Class__c WHERE Id =:st.Class__c ] ;
                cls.My_Count__c --;
            }
            
        }
        else {
            
            
            
            
            
        }
        
    }
    
}