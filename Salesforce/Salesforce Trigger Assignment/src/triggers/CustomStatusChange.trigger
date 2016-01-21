trigger CustomStatusChange on Opportunity (before update) {
   for(Opportunity oppty:Trigger.new)
    {
        if(oppty.Custom_Status__c == 'Reset')
        {
            oppty.Pricebook2 = null;
        }
    }}