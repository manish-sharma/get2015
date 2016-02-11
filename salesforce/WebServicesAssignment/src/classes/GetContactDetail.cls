global class GetContactDetail {
    webservice static String SearchContactById(String contactId) {
       List<Contact> cntList = [select id,FirstName,LastName,Account.name,phone from contact where id=:contactId];
       String str = JSON.serialize(cntList);
       return str;
    } 
    webservice static String SearchContactByName(String ContactName) {
       List<Contact> cntList = [select id,FirstName,LastName,Account.name,phone from contact where name=:ContactName limit 1000];
       String str = JSON.serialize(cntList);
       return str;
    } 
     webservice static String SearchContactByEmail(String ContactEmail) {
      List<Contact> cntList = [select id,FirstName,LastName,Account.name,phone from contact where Email=:ContactEmail limit 1000];
       String str = JSON.serialize(cntList);
       return str;
     } 
      webservice static String getAllContact() {
       List<Contact> cntList = [select id,FirstName,LastName,Account.name,phone from contact limit 1000];
       String str = JSON.serialize(cntList);
       return str;
     } 
}