package Assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment2 a1=new Assignment2();
System.out.println("enter size of pyramid");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
String result[]=new String[num];
		
	
		result=a1.printWholePattern(num);
		for(int i=0;i<num;i++)
		System.out.println(result[i]);
	}
String patternSpace(int row,int n)
{
	String s1="";
	for(int i=0;i<row;i++)
		s1=s1+" ";
	return s1;
}
String patternNumber(int row,int n)
{
	String s2="";
	for(int i=1;i<=(n-row);i++)
		s2=s2+i;
	return s2;
}
String[] printWholePattern(int n)
{
	String finalLine[]=new String[n];
	for(int i=0;i<n;i++)
		finalLine[i]=patternSpace(i,n)+patternNumber(i,n);
	return finalLine;
}
}
