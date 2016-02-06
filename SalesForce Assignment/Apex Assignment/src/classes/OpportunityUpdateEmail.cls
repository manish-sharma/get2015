public class OpportunityUpdateEmail implements Schedulable{
	 public static void execute(SchedulableContext sc){       
       DateTime d = DateTime.Now();
       Datetime lastMonthDate = d.addDays(-30) ;
       System.debug(lastMonthDate);
       String[] toAddresses = new String[]{};
       for(Opportunity ol : [Select id, Owner.email From Opportunity where LastModifiedDate < :lastMonthDate]){
           System.debug(ol.Owner.email);
     toAddresses.add(ol.Owner.email);
       }
       if(toAddresses.size()>0){
        SendEmail(toAddresses);
       }
   }
   
   public static void SendEmail(String[] toAddresses) {
       String subject = 'Opportunity Update Alert';
       String body = 'Hello, \n This is to inform you that you have not updated your opportunity record for 1 month.\n\nThanks';
       Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
       
       mail.setToAddresses(toAddresses);
       mail.setSubject(subject);
       mail.setPlainTextBody(body);
       Messaging.SendEmailResult[] results = Messaging.sendEmail(
                                new Messaging.SingleEmailMessage[] { mail });
        Boolean sendResult = true;
       for (Messaging.SendEmailResult res : results) {
           if (res.isSuccess()) {
               System.debug('Email sent successfully');
           }
           else {
               sendResult = false;
               System.debug('The following errors occurred: ' + res.getErrors());                 
           }
   }

}
}