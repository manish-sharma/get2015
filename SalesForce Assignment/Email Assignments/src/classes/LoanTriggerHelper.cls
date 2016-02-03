/** 
* Author: Shishir Pareek
* Created Date: 21/01/2016
* Name:  LoanTriggerHelper
* Desc: Loan trigger apex helper class
*/
public class LoanTriggerHelper {
   
   public static List<Loan__c> newList = new List<Loan__c>();
   public static List<Loan__c> oldList = new List<Loan__c>();
   public static Map<Id,Loan__c> newMap = new Map<Id,Loan__c>();
   public static Map<Id,Loan__c> oldMap = new Map<Id,Loan__c>();
   
   
   public static void SendEmailToLoanApplicant() {
       
       List<Loan__c> loanList = new List<Loan__c>();
       for(Loan__c loan : newList) {
           if((loan.Status__c == 'Approved' || loan.Status__c == 'Rejected')) {
               loanList.add(loan);
               System.debug(loan.Status__c);
           }
       }
       if(loanList.size() > 0) {
           try{
               System.debug(loanList.size());
               Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage();
               for(Loan__c loan : loanList) {
                   String[] toAddress = new List<String>() ;
                   toAddress.add(loan.Applicant_Email__c);
                   email.setSenderDisplayName(loan.Manager__c);  
                   Id toId =  loan.Id;
                   email.setToAddresses(toAddress);
                   email.plainTextBody = 'Hii Your Status for Loan is '+loan.Status__c;
                   System.debug('email' + email);
                   Messaging.SendEmail(New Messaging.SingleEmailMessage[] {email});
               }
           }catch(Exception e) {
               System.debug(e);
           }
           
       }
       
   }
}