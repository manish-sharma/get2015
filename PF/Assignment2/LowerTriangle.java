import java.util.*;
/**
 * @author Sumitra
 * This Program is to print the given pattern.
 * space(row,n) is used to return string of space in pyramid.
 * number(row,n)is used to return string of number.
 * wholePyramid(n) is used to call space(row,n) and number(row,n) and will return array of string.
 *
 */


public class LowerTriangle {
	/*
	 *variable i and n are used
	 *i for loop execution
	 *n is scanned from used for size of pyramid.
	 */
	public static void main(String arg[])
	{
		LowerTriangle lower=new LowerTriangle();
		int i,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of pyramid");
		n=scan.nextInt();
		String p[]=lower.wholePyramid(n);
		for(i=0;i<n;i++)
		{
			System.out.println(p[i]);
		}
		scan.close();
	}
	/*
	 * two parameters are passed in this function one is row and other size of pyramid
	 * String space will store space.
	 */
	String spaceMethod(int row,int n)
	{
		int i;
		String space="";
		for(i=1;i<=row;i++)
		{
			space=space+" ";
		}
		return space;
	}
	/*
	 * Two parameters are passed 
	 * String number will contain the string of number.
	 */
	String numberMethod(int row,int n)
	{
		int i;
		String number="";
		for(i=1;i<=n-row;i++)
		{
			number=number+i;
		}
		return number;
	}
	/*
	 * This method will return the array of String combined from spaceMethod and numberMethod
	 */
String[] wholePyramid(int n)
{
	String line[]=new String[n+1];
	String space,number;
	for(int i=0;i<n;i++)
	{
	space=spaceMethod(i,n);
	number=numberMethod(i,n);
	line[i]=space+number;
	
	}
	return line;
}

}
