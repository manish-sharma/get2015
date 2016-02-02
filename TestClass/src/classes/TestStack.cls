@isTest
public class TestStack {
     
    public static testMethod void testisEmpty() {
        Stack stk = new Stack();
        stk.top = null;
        System.assertEquals(true,stk.isEmpty());
    }
    public static testMethod void testPush() {
        Stack stk = new Stack();
        stk.top = null;
        stk.push(1);
        System.assertEquals(false,stk.isEmpty());
    }
    
    public static testMethod void testPop() {
        Stack stk = new Stack();
        stk.top = null;
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.assertEquals(3,stk.pop());
        System.assertEquals(2, stk.pop());
        System.assertEquals(1, stk.pop());
        System.assertEquals(null, stk.pop());
    }
    
    public static testMethod void testPrint() {
        Stack stk = new Stack();
        stk.top = null;
        System.assertEquals('Empty', stk.print());
        stk.push(1);
        System.assertEquals('1',stk.print());
        
    }
}