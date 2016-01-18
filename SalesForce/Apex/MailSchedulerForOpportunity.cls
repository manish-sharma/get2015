global class MailSchedulerForOpportunity implements Schedulable {
    global void execute(SchedulableContext ctx) {
        List<Opportunity> oppList = new List<Opportunity>([select OwnerId from Opportunity where LastModifiedDate = LAST_N_DAYS:30] );
        {
            mailToOpp(oppList);
        }
    }
    private void mailToOpp(List<Opportunity> oppList) {
        Messaging.MassEmailMessage email = new Messaging.MassEmailMessage();
        List<Id> idList = new List<Id>();
        for(Opportunity opp : oppList) {
            idList.add(opp.OwnerId);
        }
        email.setDescription('Your Opportunity is no modified since last 30 days:');
        email.setSenderDisplayName('SalesForce');
        email.setTargetObjectIds(idList);
    }
}