public class OrgSobjects {
   
    public static List<Schema.SObjectType> getOrganizationSobjects() { 
		List<Schema.SObjectType> sobjects = Schema.getGlobalDescribe().Values();
     	return sobjects;
    } 
}