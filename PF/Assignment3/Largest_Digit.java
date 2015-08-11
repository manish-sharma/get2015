import java.util.InputMismatchException;
import java.util.Scanner;
public class Largest_Digit {
	
	public static void  main(String args[]) {
		
		int no = 0;
		
		try
		{
			
		Scanner sc=new Scanner(System.in);//object of Scanner class
		
		System.out.println(" Enter  Number ");
		
		no=sc.nextInt();
		
		if(no<0) //condition if dividend less then zero;
		{
			System.out.println("Number should not be  less then zero ");
			
			System.out.println(" Enter number again ");
			
			no=sc.nextInt();
			
		}
		}
		
		catch(InputMismatchException e) // string exception handling
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		
		Largest_Digit L = new Largest_Digit();// to print output;
		int out=L.largest_digit(no);
		System.out.println(" Largest Digit is =" + out);
		
	}
	// method to calculate largest digit in a number;
	int largest_digit(int no)
	{
		// using logic to find each digit and then compare with max
		
		int rem=no%10;   //reminder
		
		
		if(no/10==0)
		{
			return no;
		}
		else 
			{ 
			no=no/10;
			int max= largest_digit(no);
			
			if(rem>max)
				return rem;
			else
			return max;

	}
	}
}