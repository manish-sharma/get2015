public class ContactSearch {
   
   public static List<Contact> searchForContacts(String lastName , String postalCode)
   {
       List<Contact> listOfContact =  new List<Contact>();
     	Contact[] contacts =[Select ID , Name from Contact Where (MailingPostalCode=:postalCode and LastName =:lastName)];
       for(Contact cnt : contacts)
           listOfContact.add(cnt);
       return listofContact;
   }

}