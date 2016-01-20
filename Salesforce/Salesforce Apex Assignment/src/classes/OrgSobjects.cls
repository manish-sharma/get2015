/*Question 6 	the list of sobjects exists in Organization */
public class OrgSobjects {
   
    public static List<Schema.SObjectType> getOrganizationSobjects() { 
		List<Schema.SObjectType> sobjects = Schema.getGlobalDescribe().Values();
     	return sobjects;
    } 
}