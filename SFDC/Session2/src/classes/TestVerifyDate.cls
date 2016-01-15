@isTest
public class TestVerifyDate {
    
   
    @isTest 
    static void test1()
    {
       Date d1 = Date.newInstance(2015, 1, 6);
       Date d2 = Date.newInstance(2015, 1, 15);
       System.assertEquals(d2, VerifyDate.CheckDates(d1,d2));
    }
    
    @isTest 
    static void test2()
    {
       Date d1 = Date.newInstance(2015, 1, 6);
       Date d2 = Date.newInstance(2015, 2, 1);
       System.assertEquals(d2, VerifyDate.CheckDates(d1,d2));
    }
     @isTest 
    static void test3()
    {
       Date d1 = Date.newInstance(2015, 1, 6);
       Date d2 = Date.newInstance(2014, 2, 5);
       System.assertEquals(Date.newInstance(2015, 1, 31), VerifyDate.CheckDates(d1,d2));
    }

}