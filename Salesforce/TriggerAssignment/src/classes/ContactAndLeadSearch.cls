public class ContactAndLeadSearch 
{
	public static List<List< SObject>> searchContactsAndLeads(String input)
    {
        List<List<SObject>> sObjectList = [ FIND :input IN NAME FIELDS RETURNING Contact(FirstName, LastName),Lead(FirstName , LastName)];
      return sObjectList;
    }
}