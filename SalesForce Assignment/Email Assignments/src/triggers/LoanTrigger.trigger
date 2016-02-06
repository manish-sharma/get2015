trigger LoanTrigger on Loan__c (before update) {
	 // Assign values of trigger new list to helper class variable
   LoanTriggerHelper.newList = trigger.new;
   
   // Assign values of trigger old list to helper class variable
   LoanTriggerHelper.oldList = Trigger.old;
   
   // Assign values of trigger new map to helper class variable 
   LoanTriggerHelper.newMap = Trigger.newMap;
   
   // Assign values of trigger old map to helper class variable
   LoanTriggerHelper.oldMap = Trigger.oldMap;
       if(trigger.isBefore){
       		if(trigger.isUpdate){
            	LoanTriggerHelper.SendEmailToLoanApplicant();
       			}
       }
}