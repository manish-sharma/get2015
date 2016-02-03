public class sendEmailOnOppStatusChange {
    public static void sendEmailWhenStageChange(Opportunity opportunity){
         EmailTemplate eTemp = [select id,name from EmailTemplate where name ='OpportunityStatusChangeEmailTemplate' and isActive = true Limit 1];
       Messaging.SingleEmailMessage email = new Messaging.SingleEmailMessage(); 
       email.setReplyTo('shishir.pareek@metacube.com');
       email.setSaveAsActivity(false);
       email.setTemplateId(eTemp.Id);
       email.setTargetObjectId(opportunity.OwnerId);
       email.setToAddresses(new String[]{'shishir.pareek@metacube.com'}); 
       Messaging.sendEmail(new List<Messaging.SingleEmailMessage>{email});
   }
}