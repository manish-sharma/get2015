@isTest
public class TestComponentController {
    public static testMethod void testComponentController() {
        ComponentController cc = new ComponentController();
        List<Account> accountListActual = new List<Account>();
        accountListActual = cc.getaccList();
        List<Account> accountListExpected = new List<Account>();
        accountListExpected = [Select Name,Id from Account];
        System.assertEquals(accountListExpected, accountListActual);
        cc.sortField = 'Name';
        cc.sort();
        System.assertEquals(cc.noOfRecords, 10);
        System.assertEquals(10, cc.size);
    }
}