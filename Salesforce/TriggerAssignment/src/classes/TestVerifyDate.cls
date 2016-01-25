@isTest
public class TestVerifyDate 
{
@isTest
    static  void TestVerifyDate1() {
        //check for date2 being in the past
        Date day1 = Date.newInstance(2015, 1, 11);
        Date day2 = Date.newInstance(2015, 1, 10);
       	Date day3=  Date.newInstance(2015, 1, 31);
        Date date_res1 = VerifyDate.CheckDates(day1,day2);
         System.assertEquals(day3,date_res1);

    }  
   @isTest
    static  void TestVerifyDate2() {

        Date day1 = Date.newInstance(2015, 1, 11);
        Date day2 = Date.newInstance(2015, 1, 20);
       	Date day3=  Date.newInstance(2015, 1, 31);
        Date date_res1 = VerifyDate.CheckDates(day1,day2);
         System.assertEquals(day2,date_res1);

    } 

  
}