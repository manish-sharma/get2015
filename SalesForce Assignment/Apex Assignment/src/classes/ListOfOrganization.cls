public class ListOfOrganization {
    public static List<Schema.SObjectType> listOfSObjects(){
        List<Schema.SObjectType> listOfOrgObjects = Schema.getGlobalDescribe().Values(); 
        return listOfOrgObjects;
    }
}