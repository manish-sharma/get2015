import java.util.*;

/**
 * @author Sumitra
 *This program is to convert binary value to octal.
 *in value variable u have to insert int value that contain 0 and 1.
 */
public class BinaryToOctal {
	
	public static void main(String arg[])
	{
		BinaryToOctal bin=new BinaryToOctal();
		int value;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the boolean value");
		value=scan.nextInt();
		int result=bin.convertBinaryToOctal(value);
		System.out.println("convertion of octal value is"+result);
		
		scan.close();
	}
	/*
	 * value is a parameter to method and method is returning octal value
	 */
		int convertBinaryToOctal(int value)
	{
		
		int a,c=0,i=0;
		int b=0;
		while(value>0)
		{
			a=value%10;
			double d=a*Math.pow(2, i);
			i++;
			value=value/10;
			c+=d;
		}
		//This will convert the binary digit to decimal.
		i=1;
		while(c>0)
		{
			a=c%8;
			c=c/8;
			b+=a*i;
			i=i*10;
			
		}
		
		return b;
	}
}
