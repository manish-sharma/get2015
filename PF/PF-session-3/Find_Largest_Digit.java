/*this program is for finding
 * largest digit in a given number
 */
import java.util.Scanner;


public class Find_Largest_Digit {
	long max=0;
	public static void main(String args[])
	{

	  Scanner scan;
	  long number;
	  System.out.println("Enter number");
	  scan=new Scanner(System.in);
	  number=scan.nextLong();
	  Find_Largest_Digit obj=new Find_Largest_Digit();
	  long res=obj.largestDigit(number);//call largestDigit fn
	  System.out.println("Largest Digit In a Number :"+res);
    }

	//this fn will give largest digit in an input number
	public long largestDigit(long number) {
		// TODO Auto-generated method stub
	   if(number>0)
	   {
		long rem=number%10;
		if(rem>max)
		{
			max=rem;
		}
        number=number/10;
        max=largestDigit(number);
        
       
	   }  
	 
	   return max;
	  }
}