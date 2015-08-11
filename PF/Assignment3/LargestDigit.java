import java.util.InputMismatchException;
import java.util.Scanner;
public class LargestDigit {
	
	public static void  main(String args[]) {
		
		int no = 0;	
		Scanner sc = new Scanner(System.in);
		try
		{					
			System.out.println(" Enter  Number ");			
			no = sc.nextInt();
			
			if(no < 0) {
				System.out.println("Number should not be  less then zero ");				
				System.out.println(" Enter number again ");				
				no = sc.nextInt();				
			}
		}		
		catch(InputMismatchException e)
		{ 
			System.out.println("Please Enter Only Integer Values");			
		     main(args);		
		}
		finally{
			sc.close();
		}
		
		LargestDigit L = new LargestDigit();
		int out = L.largestDigit(no);
		System.out.println(" Largest Digit is =" + out);
		
	}
	
	int largestDigit(int no) {
		int rem = no % 10;			
		if(no / 10 == 0) {
			return no;
		} else { 
			no = no / 10;
			int max = largestDigit(no);			
			if(rem > max){
				return rem;
			} else {
				return max;
			}

		}
	}
}