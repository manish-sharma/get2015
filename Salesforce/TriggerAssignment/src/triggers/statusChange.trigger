trigger statusChange on Opportunity (before update) {
    for(Opportunity oppty:Trigger.new)
    {
        if(oppty.StageName == 'Closed Won' || oppty.StageName == 'Closed Lost')
        {
            oppty.CloseDate = Date.today();
        }
    }
    
}