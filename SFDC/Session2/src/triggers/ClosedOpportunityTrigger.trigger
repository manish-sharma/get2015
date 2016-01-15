trigger ClosedOpportunityTrigger on Opportunity (after insert, after update) {
    List<Opportunity> opList = [SELECT Id, StageName FROM Opportunity WHERE Id IN :Trigger.New AND StageName = 'Closed Won'];
    List<Task> taskList = new List<Task>();
    for(Opportunity op :opList)
    {   
        Task t = new Task();
        t.Subject = 'Follow Up Test Task';
        t.WhatId = op.Id;
        taskList.add(t);
    }
    
    insert taskList;
}