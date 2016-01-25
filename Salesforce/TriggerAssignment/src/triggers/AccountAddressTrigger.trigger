trigger AccountAddressTrigger on Account (before insert, before update)
{
    for(Account obj : Trigger.New)
    {
        If((obj.BillingPostalCode  <> Null)&&(obj.Match_Billing_Address__c==True))
           {
               obj.ShippingPostalCode=obj.BillingPostalCode;
           }
    }
}