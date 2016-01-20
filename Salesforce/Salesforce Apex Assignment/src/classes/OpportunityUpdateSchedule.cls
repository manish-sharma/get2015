/*Question 5 Scheduler to mail to Opportunity Owner , if not modified for last 30 days */
public class OpportunityUpdateSchedule implements Schedulable{

public static void execute(SchedulableContext sc){       
         String[] toAddresses = new String[]{};
        for(Opportunity ol : [Select Id,ownerID,Owner.email from Opportunity where LastModifiedDate = LAST_N_DAYS:30]){
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