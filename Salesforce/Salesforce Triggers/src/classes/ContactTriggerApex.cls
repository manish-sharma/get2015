/** 
* Author: Dheeraj Kumar
* Created Date: 21/01/2016
* Name:  ContactTriggerApex
* Desc: Contact trigger apex helper class
*/

public class ContactTriggerApex {
    public static List<Contact> newList = new List<Contact>();
	public static List<Contact> oldList = new List<Contact>();
	public static Map<Id,Contact> newMap = new Map<Id,Contact>();
	public static Map<Id,Contact> oldMap = new Map<Id,Contact>(); 
    
    /**
    *    @param List<Contact>
    *    @return void 
    *    @desc add error when teacher(contact) teach hindi
    */
    public static void restrictTeachingHindi() {
        
        for(Contact cnt : newList)
          if(cnt.Subjects__c.Contains('Hindi')) {
            cnt.addError('Teacher not allowed to teach hindi subject ');
        }
    }
}