public class OrganizationSobjects {
   
     public static List<Schema.SObjectType> OrganizationSobjects()
     {   List<Schema.SObjectType> sobjects = Schema.getGlobalDescribe().Values();
         return sobjects;
         
     } 
}