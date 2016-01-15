public class StringArrayTest {
    public static List<String> generateStringArray(Integer boundry)
    {   List<String> result = new List<String>();
        for(Integer i = 0; i < boundry; i++)
        {
            result.add('Test '+i);
        }
        return result;
    }
}