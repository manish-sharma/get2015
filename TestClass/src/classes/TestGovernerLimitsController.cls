@isTest
public class TestGovernerLimitsController {
    public static testMethod void updateFunction() {
        GovernerLimitsController gLimits = new GovernerLimitsController();
        gLimits.updateFunction();
        System.assertEquals(gLimits.dmlUsed, 2);
    }
}