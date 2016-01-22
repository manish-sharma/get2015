trigger Trigger5 on Opportunity (before insert,before update) {
    List<Opportunity> oldOpp = new List<Opportunity>(trigger.old);
    List<Opportunity> newOpp = new List<Opportunity>(trigger.new);
    for(Integer i =0;i<oldOpp.size();i++) {
        if((oldOpp[i].StageName != 'Closed Won' || oldOpp[i].StageName !='Closed Lost') && (newOpp[i].StageName == 'Closed Won' || newOpp[i].StageName == 'Closed Lost'))
            newOpp[i].CloseDate = System.today();
        }
}