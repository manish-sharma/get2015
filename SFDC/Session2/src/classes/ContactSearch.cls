public class ContactSearch {
  public static List<Contact> searchForContacts(String lastName , String mailingPostalCode)
  {
      List<Contact> contactList = new List<Contact>();
      contactList = [SELECT Name FROM Contact WHERE LastName =: lastName AND MailingPostalCode =: mailingPostalCode ];
      return contactList;
  }
}