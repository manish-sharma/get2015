/**
* Name:JsonCOntroller
* @author Anurag
* Since: 20 January,2016
* Description: Converts to Json
*/public class JsonController {
    public String text1 {get;set;}
    public JsonController(){
    }
    /**
* Name: ParseJson
* Description:Serialize the Name into the Json Object
*/
    public void parseJson(){
        String soql = 'SELECT Name FROM Account LIMIT 5';
        // Stores the result of the Query
        List<Account> acct = Database.Query(soql); 
        text1 = JSON.serializePretty(acct);
    }    
}