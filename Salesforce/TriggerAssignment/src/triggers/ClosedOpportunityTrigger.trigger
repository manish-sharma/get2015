/*
 * Name: ClosedOpportunityTrigger
 * author: Anurag
 * Since: 25 January,2016
 * Description: Populates the close Date with today Date
 */
trigger ClosedOpportunityTrigger on Opportunity (after insert,after update) 
{
    List<Task> oppList = new List<Task>();
    for(Opportunity obj : Trigger.New)
    {
        // Checks for the Condition
        if(obj.StageName== 'Closed Won')
        {
            Task Objec = new Task(OwnerId=obj.OwnerId,Subject='Follow Up Test Task',whatId=obj.Id);
            oppList.add(objec);
        }
    }
    // Inserts the Opplist
    insert oppList;
}