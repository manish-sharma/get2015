import java.util.Scanner;
//program for diamond
public class Assignment1
{
	public static void main(String arg[])
	{
		System.out.print("Enter the height of half pyramid ");
		Scanner sc=new Scanner(System.in);
		int height =sc.nextInt();
		 Assignment1 ass=new Assignment1();
		ass.pyramid(height);
		sc.close();
	}
	String spaces(int row, int n)
	{
		String str="";
		if(row<=5)
			for(int count=0;count<n-row;count++)
			str=str.concat(" ");
		else
			for(int count=row-n;count>0;count--)
				str=str.concat(" ");	
		return str;
	}
	String numbers(int row, int n)
	{
		String str="";
		if(row<=5)
		{
		for(int count=1;count<=row;count++)
			str=str.concat(""+count);
		for(int count=row-1;count>=1;count--)
			str=str.concat(""+count);
		}
		else
		{
			for(int count=1;count<=2*n-row;count++)
				str=str.concat(""+count);
			for(int count=2*n-row-1;count>=1;count--)
				str=str.concat(""+count);
		}
		return str;
	}
	String[] pyramid(int n)
	{
		String[] str=new String[2*n-1];
		String str1="";
		 Assignment1 ass=new Assignment1();
		 for(int count=0;count<2*n-1;count++)
		 {
			 str1=ass.spaces(count+1,n);
			 str1=str1.concat(ass.numbers(count+1,n));
			 str[count]=str1;
			 System.out.println(str1);
		 }
		 
		return str;
	}
}
