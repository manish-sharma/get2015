/**
 * Difference string and string buffer
 * @author Ankur
 *
 */
public class StringExample{

    public static void main(String args[]){
       StringBuffer stringBuffer = new StringBuffer(" Ankur");
       String sample = "adsf";
       stringBuffer.append(" String Buffer");
       sample = sample + "adsf";
       System.out.println(stringBuffer);  
   }
}