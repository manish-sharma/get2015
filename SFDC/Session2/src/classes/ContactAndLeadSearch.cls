public class ContactAndLeadSearch {
   public static List<List<sObject>> searchContactsAndLeads(String param)
   {
       return [FIND :param IN ALL FIELDS RETURNING Contact, Lead];
       
   }
}