/*
 * Name: DisableUpdate
 * Since: 25 January,2016
 * Description: cannot Insert when subject is hindi
 */
trigger DisableUpdate on Contact (after insert,before update) {
    for(Contact cnt:Trigger.new)
    {
        if(cnt.Subjects__c.Contains('Hindi'))
        {
            cnt.addError('Update Not Allowed for hindi teacher');
        }
    }

}