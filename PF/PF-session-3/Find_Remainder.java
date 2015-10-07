/* this program is for finding remainder

   using recursion
 */
import java.text.DecimalFormat;
import java.util.Scanner;


public class Find_Remainder {
	//static int res1;
	public static void main(String args[])
	{
		Scanner scan;
		
		int dividend,divisor;
		System.out.println("Enter Dividend");
		scan=new Scanner(System.in);
		dividend=Integer.parseInt(scan.nextLine());
		System.out.println("Enter Divisor");
		divisor=Integer.parseInt(scan.nextLine());
		Find_Remainder obj=new Find_Remainder();
		int res1=obj.find(dividend,divisor);//call find fn
	
		//if divisor is 0
		if(res1==-1)
		{
			System.out.println("No output ,divisor is 0");
		}
		
		else if(res1==-2)
		{
			System.out.println("No output ,divisor is less than 0");
		}
		
		else if(res1==-3)
		{
			System.out.println("No output ,divident is less than 0");
		}
		//if divisor is not equals to 0
		else
		{
		 System.out.println("Output Is :"+res1);
		}
		
	}

	//this fn will return remainder
	public int find(int dividend, int divisor) {
		// TODO Auto-generated method stub
		
		int diff = dividend;
		
		int res= dividend;
		if(divisor==0)
		{
			res=-1;
			
		}
		
		else if(divisor<0)
		{
			res=-2;
		}
		
		else if(dividend<=0)
		{
			res=-3;
		}
		else
		{
		 if(diff>=divisor)
		 {
			diff=diff-divisor;
			
			res= find(diff,divisor);
			 
		 }
		 
		
		
		}
		
		 return res;
	}
}
