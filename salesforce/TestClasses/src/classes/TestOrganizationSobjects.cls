@isTest
public class TestOrganizationSobjects {
public static testMethod void testOrganizationSobjects()
{   List<Schema.SObjectType> EctualList = Schema.getGlobalDescribe().Values();
    List<Schema.SObjectType> ExpectedList = OrganizationSobjects.AllOrganizationSobjects();
    System.assertEquals(ExpectedList.size(), EctualList.size());
}
}