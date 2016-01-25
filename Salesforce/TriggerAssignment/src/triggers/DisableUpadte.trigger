trigger DisableUpadte on Contact (after insert,before update) {
    for(Contact cnt:Trigger.new)
    {
        if(cnt.Subjects__c.Contains('Hindi'))
        {
            cnt.addError('Update Not Allowed for hindi teacher');
        }
    }

}