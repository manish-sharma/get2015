public class ReturnJsonString {
    public String text1 {get;set;}
      
    public ReturnJsonString()
    {
         
    }    
    public void parseJson()
    {
        String soql = 'SELECT Name FROM Account LIMIT 5';
        List<Account> acct = Database.Query(soql); 
        text1 = JSON.serialize(acct);
    }    

}