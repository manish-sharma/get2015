public class StringArrayTest {
      public static LIST<String> generateStringArray(Integer testString)
      {   LIST<String> output=new LIST<String>();
          String sample = 'Test ';
          for(Integer count=0;count<testString;count++)
          {
                output.add(sample+count);
          }
       return output;
          
          
      }

}