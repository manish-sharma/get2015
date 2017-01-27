public class RandomContactFactory {
   public static List<Contact> generateRandomContacts(Integer param1, String param2) 
   {
       List<Contact> myContactList = new List<Contact>();
       for(Integer i=0; i < param1; i++)
       {
           myContactList.add(new Contact(FirstName = 'Test '+i,LastName=param2));
       }
       return myContactList;
   }
}