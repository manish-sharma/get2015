public class JsonPageView {
  public String text1 {get;set;}
     
   public JsonPageView()
   {
        
   }    
   public void parseJson()
   {
       String soql = 'SELECT Name FROM Account LIMIT 5';
       List<Account> acct = Database.Query(soql); 
       text1 = JSON.serializePretty(acct);
   }    
}