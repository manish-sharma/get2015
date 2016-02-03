public class SendMailToOpportunity  {
    public static void sendMail(ID[] idSet) {
        try {
        	System.debug(idSet.size());
            Messaging.MassEmailMessage email = new Messaging.MassEmailMessage(); 
            EmailTemplate e = [select id,Name,subject,body from EmailTemplate where id = '00X28000000YuA4EAK'];
            email.setTemplateId(e.id);
            email.setTargetObjectIds(idSet);
        	email.saveAsActivity = false;
            Messaging.sendEmail(new Messaging.MassEmailMessage[] { email });
        }catch(Exception e) {
            System.debug(e);
        }
        
    }
}