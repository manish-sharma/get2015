public class SearchRecordFilter {
    public String billingCity {get;set;}
    public String billingState{get;set;}
    public String billingCountry{get;set;}
    
    public List<Account> createAccountList{get;set;}

    public void searchRecords(){
        createAccountList= new list<Account>();
       	if(string.isBlank(billingCity)&&string.isBlank(billingState)&&string.isBlank(billingCountry)) 
      	{
           createAccountList= Database.query('SELECT id,name,billingcity,billingCountry,billingState FROM Account');
   		}    
       else 
       	{
            createAccountList= Database.query('SELECT id,name,billingcity,billingCountry,billingState FROM Account WHERE billingcity LIKE \'%'+billingCity+'%\'  AND (billingcountry  LIKE  \'%'+billingCountry+'%\' OR billingcountry = NULL) AND (billingstate LIKE  \'%'+billingState+'%\' OR billingstate = NULL)');                    
       
       	}	
   }
}