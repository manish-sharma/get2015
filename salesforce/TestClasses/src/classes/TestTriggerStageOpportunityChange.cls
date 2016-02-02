@isTest
public class TestTriggerStageOpportunityChange {
    public static testMethod void  TestOpportunityWhenStageChange()
      {  
        Date Opportunitydate =Date.newInstance(2014, 07, 15);
        Opportunity newOpportunity=new Opportunity(Name='test',StageName='Qualification',CloseDate=Opportunitydate);
        insert newOpportunity;
        newOpportunity.StageName='Closed Lost';
        test.startTest(); 
        try
        {
            update newOpportunity;
        }
        catch(Exception ee)
        { 
            system.debug('error in  line'+ee.getLineNumber()+'due to'+ee.getMessage());
        }
        Test.stopTest();
    }
    
}