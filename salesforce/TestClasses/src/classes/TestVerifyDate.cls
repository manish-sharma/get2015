@isTest
public class TestVerifyDate {
     @isTest static void CheckDates()
     {  Date date1 =Date.newInstance(2014,07,12); 
             Date date2 =Date.newInstance(2014, 07, 15);
        date1 = VerifyDate.CheckDates(date1, date2);
         System.assertEquals(date1,date2);

     }
      @isTest static void NCheckDates()
     {
          Date date1 =Date.newInstance(2014,07,12); 
             Date date2 =Date.newInstance(2014, 09, 15);
        date1 = VerifyDate.CheckDates(date1, date2);
         System.assertEquals(date1,Date.newInstance(2014,07,31));
     }
      @isTest static void DateWithin30Days()
     {
             Date date1 =Date.newInstance(2014,07,12); 
             Date date2 =Date.newInstance(2013, 05, 05);
        Boolean output = VerifyDate.DateWithin30Days(date1, date2);
         System.assertEquals(output,false);
     }
      @isTest static void DateWithin30Days1()
     {
          Date date1 =Date.newInstance(2014,07,12); 
             Date date2 =Date.newInstance(2015, 05, 05);
        Boolean output = VerifyDate.DateWithin30Days(date1, date2);
         System.assertEquals(output,false);
     }
      @isTest static void DateWithin30Days2()
     {
          Date date1 =Date.newInstance(2014,07,12); 
          Date date2 =Date.newInstance(2014, 07, 15);
          Boolean output = VerifyDate.DateWithin30Days(date1, date2);
          System.assertEquals(TRUE,output);
     }
      @isTest static void SetEndOfMonthDate()
     {
          Date date1 =Date.newInstance(2014,07,12);
          Date output =Date.newInstance(2014,07,31);
          date1 =VerifyDate.SetEndOfMonthDate(date1); 
          System.assertEquals(date1,output);
         
     }


}