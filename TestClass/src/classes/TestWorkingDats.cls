@isTest
public class TestWorkingDats {
    public static testMethod void testgetWorkingDays() {
        Integer result = WorkingDays.getWorkingDays(date.newInstance(2016, 1, 21),date.newInstance(2016, 2, 21));
    	Integer expected = 22;
    	System.assertEquals(result, expected);
    }
    
     public static testMethod void testgetWorkingDays1() {
        Integer result = WorkingDays.getWorkingDays(date.newInstance(2016, 1, 21),date.newInstance(2016, 1, 22));
    	Integer expected = 2;
    	System.assertEquals(result, expected);
    }
    
    public static testMethod void testgetWorkingDays2() {
        Integer result = WorkingDays.getWorkingDays(date.newInstance(2016, 2, 6),date.newInstance(2016, 2, 13));
    	Integer expected = 5;
    	System.assertEquals(result, expected);
    }
}