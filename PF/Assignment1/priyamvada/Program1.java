package priyamvada;

/*Program to convert binary number to octal*/
import java.util.*;
public class Program1 {
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
		long number,result1,result2;
		//Input binary value from user
		System.out.println("Enter a binary digit");
		number=scan.nextInt();
		Program1 obj= new Program1();
		//Converting binary to decimal
		result1=obj.binaryTodecimal(number);
		System.out.println(result1);
		//Converting decimal to octal
		result2=obj.decimalTooctal(result1);
		System.out.println(result2);
	   }
	
//function to convert binary to decimal	
long binaryTodecimal(long x)
{
int decimal=0,rem=0;
int i=1;
while(x>0)
{
	rem=(int) (x%10);
	decimal=decimal+(i*rem);
	x=x/10;
	i=i*2;
	}
return (decimal);
}

//function to convert decimal to octal
long decimalTooctal(long y)
{
long octal=0,res=0;
int i=1;	
	while(y>0)
	{
	res=y%8;
	octal=octal+(res*i);
	i=i*10;
	y=y/8;
}
	return (octal);
}
}


