/** 
* Author: Dheeraj Kumar
* Created Date: 21/01/2016
* Name:  ClassTriggerApex
* Desc: Class trigger apex helper class 
*/
public class ClassTriggerApex {
   	public static List<Class__c> newList = new List<Class__c>();
	public static List<Class__c> oldList = new List<Class__c>();
	public static Map<Id,Class__c> newMap = new Map<Id,Class__c>();
	public static Map<Id,Class__c> oldMap = new Map<Id,Class__c>(); 
    
     /**
    *    @param void
    *    @return void 
    *    @desc add error when class has more than one female student
    */
    public static void notAllowDeleteClass () {
        for(Class__c cls : oldList) {
            List<Student__c> stdList = [SELECT Id FROM Student__c WHERE Class__c=:cls.id AND Sex__c = 'Female'];
            System.debug(stdList);
            if(stdList.size()>1) {
                cls.addError('Not allowed to delete class having more than one female student');
            }
        }
    }
}