import java.util.*;
public class Remainder{
	
	public static void  main(String args[]) {
		
		int Divid,Divisor;
		Scanner sc=new Scanner(System.in);//object of Scanner class
		try
		{
			
		
		
		System.out.println(" Enter dividend "); // values from user
		
		Divid=sc.nextInt();
		
		
		System.out.println(" Enter divisor ");
		
		Divisor=sc.nextInt();
		
		if(Divisor==0){// in case / by 0;
			throw new ArithmeticException();
		}
		
		Remainder R =new Remainder();
		
		 int remainder = R.rem(Divid, Divisor);
		
		 System.out.println(" Remainder =" + remainder);
		}
		catch(InputMismatchException e)
		{ 
			System.out.println("Please Enter Only Integer Values");
			
		     main(args);
		
		}
		catch (ArithmeticException Ae) {//in case divide by zero exception;
		
		System.out.println("Divisor should not be 0 ");
        
		}
		
	}
	public int rem(int a,int b)// method to find reminder
	{
		if(a>=b)//recursive case
		{
			a=a-b;
			
			return rem(a,b);//recursive call;
	}
		else //base case;
			
			return a;
	}
}