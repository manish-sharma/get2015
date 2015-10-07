import java.util.Scanner;
import java.math.*;

public class Binary_to_Octal 
{
	
	public static void main(String args[])
	{
		
		int num;
		System.out.println(" Enter Binary sequence");
		Scanner scan=new Scanner(System.in);//read input stream
		num=Integer.parseInt(scan.nextLine());//convert binary sring into integer
        
		Binary_to_Octal obj=new Binary_to_Octal();//object creation of class Binary_to_Octal
		int octal=obj.convert(num);//call convert fn
		System.out.println("octal value is:"+octal);//print result i.e. octal value
	}

	public int convert(int num) {
		// TODO Auto-generated method stub
		
		int decimal=0;
		int binary=num;
		int power=0;
		String octal="";
		
		while(binary>0)  //Conversion of binary value into decimal value
		{
			int lastDigit=binary%10;
		    decimal+=lastDigit*Math.pow( 2,power);
		    power++;
		    binary=binary/10;
		    
		}
		
		System.out.println("decimal value is:"+decimal);
	
		//Conversion of decimal value into octal value
		
		char oct[]={'0','1','2','3','4','5','6','7'};
		while(decimal>0)
		{
			int rem=decimal%8;
			octal=oct[rem]+octal;
			decimal=decimal/8;
		}
		
		int octal1=Integer.parseInt(octal);//convert octal string into integer
		return octal1;
		
		}
		
		
	}

