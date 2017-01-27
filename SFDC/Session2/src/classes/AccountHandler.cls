public class AccountHandler {
   public static Account insertNewAccount(String paramName)
   {
       try{  
               Account acc = new Account(Name = paramName);
           insert acc;
           return acc;
               
        }
       catch(DmlException e){
            return null;
       }
       
       
   }
}