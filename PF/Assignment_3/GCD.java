import java.util.InputMismatchException;
import java.util.Scanner;
public class GCD{
	
	public static void  main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x,y;		
		try
		{						
			System.out.println(" Enter First Number ");		
			x = sc.nextInt();		
			
			if(x <= 0) {//condition number less then zero;		
				System.out.println("Number should be  greater then zero ");			
				System.out.println(" Enter  first number again ");			
				x=sc.nextInt();			
			}
			
			System.out.println(" Enter Second number ");		
			y = sc.nextInt();
			
			if(y <= 0) { 
				System.out.println("Number should be  greater then zero ");		
				System.out.println(" Enter  Second number again ");		
				y = sc.nextInt();		
			}
			
			GCD G =new GCD(); 
			int max = 0;
			if(y > x) {
				max = x;
				x = y;
				y = max;			
			}
			
			int Gcd = G.gcd(x, y);		
			 System.out.println(Gcd);
		}
		catch(InputMismatchException e) { 
			System.out.println("Please Enter Only Integer Values");			
		     main(args);		
		}
		finally {
			sc.close();
		}
		
		
	}
	public int  gcd(int no1,int no2) {
		int rem;
		rem=no1%no2;
		if( rem!=0) {
			return gcd(no2,rem);
		} else {
			return  no2;
		}
	}
}