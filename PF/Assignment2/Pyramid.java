import java.util.*;
/**
 * @author Sumitra
 * This Program is to print the respective pattern.
 * space(row,n) is used to return string of space in pyramid.
 * number(row,n)is used to return string of number.
 * wholePyramid(n) is used to call space(row,n) and number(row,n) and will return array of string.
 *
 */
public class Pyramid {
/*
 *  *variable i and n are used
	 *i for loop execution
	 *n is scanned from used for size of pyramid.
 */
	public static void main(String arg[])
	{
		Pyramid pr=new Pyramid();
		int i,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of pyramid");
		n=scan.nextInt();
		String a[]=pr.wholePyramid( n);
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		scan.close();
	}
	/*
	 *  two parameters are passed in this function one is row and other size of pyramid
	 * String space will store space.
	 */
	String spaceMethod(int row,int n)
	{
		String space="";
		int i;
		if(row<n)
		{
			for(i=0;i<n-row;i++)
			{
				space=space+" ";
			}
		}
		else
		{
			for(i=0;i<row-n;i++)
			{
				space=space+" ";
			}
		}
		return space;
	}
	/*
	 * * Two parameters are passed 
	 * String number will contain the string of number.
	 */
	String numberMethod(int row,int n)
	{
		String number="";
		int i;
		if(row<n)
		{
			for(i=1;i<=row;i++)
			{
				number=number+i;
			}
			for(i=row-1;i>0;i--)
			{
				number=number+i;
			}
		}
		else
		{
			for(i=1;i<=(2*n-row);i++)
				{
					number=number+i;
				}
			for(i=(2*n-row-1);i>=1;i--)
			{
				number=number+i;
			}
		}
		return number;
	}
	/*
	 *  This method will return the array of String combined from spaceMethod and numberMethod
	 */
	String[] wholePyramid(int n)
	{
		String line[]=new String[2*n-1];
		String space, number;
		for(int i=0;i<2*n-1;i++)
		{
			space=spaceMethod(i+1,n);
			number=numberMethod(i+1,n);
			line[i]=space+number;
		}
	
		return line;
	
	}

}
