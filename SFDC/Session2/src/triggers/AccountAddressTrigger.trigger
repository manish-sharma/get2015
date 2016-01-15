trigger AccountAddressTrigger on Account (before insert, before update) {
          Account acc = Trigger.new[0];
          if(acc.Match_Billing_Address__c)
          {
             acc.ShippingPostalCode = acc.BillingPostalCode  ;
          }
 }