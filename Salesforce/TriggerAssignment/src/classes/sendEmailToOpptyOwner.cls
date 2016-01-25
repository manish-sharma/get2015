public class sendEmailToOpptyOwner implements Schedulable{
  

 public void execute(SchedulableContext SC) 
 {
   sendMail();
 }
private void sendMail()
{
   List<Messaging.SingleEmailMessage> mails = new List<Messaging.SingleEmailMessage>();
     for(Opportunity op : [SELECT Name,Owner.id FROM Opportunity WHERE LastModifiedDate<LAST_N_DAYS:30])
     {
          Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
          mail.setTemplateId('00X280000015eF7');
          mail.setTargetObjectId(op.Owner.id);
          mail.setSaveAsActivity(false);
          mails.add(mail);
     }
      if ( mails.size() > 0 )
          Messaging.sendEmail(mails, false);
}

}