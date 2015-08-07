package Assignments;

import java.util.Scanner;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment1 pattern=new Assignment1();
System.out.println("Enter size of pyrimid");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String result[]=new String[num];
result=pattern.pyramid(num);
for(int i=1;i<=(2*num-1);i++)
	System.out.println(result[i-1]);
	}
String spaces(int row,int n)
{
	String space="";
	if(row<=n)
	{
		for(int i=row;i<n;i++)
		space=space+" ";
	}
	else
	{
		for(int i=n;i<row;i++)
		space=space+" ";
	}
	return space;
}
String numbers(int row,int n)
{
	String no="";
	if(row<=n)
	{
		for(int i=1;i<=row;i++)
	    no=no+i;
		for(int i=(row-1);i>=1;i--)
		no=no+i;
	}
	else
	{
		for(int i=1;i<=(2*n-row);i++)
		    no=no+i;
			for(int i=(2*n-row-1);i>=1;i--)
			no=no+i;
	}
	return no;
}
String[] pyramid(int n)
{
	String fin[]=new String[2*n-1];
	for(int i=1;i<=(2*n-1);i++)
		fin[i-1]=spaces(i,n)+numbers(i,n);
return fin;
}
}
