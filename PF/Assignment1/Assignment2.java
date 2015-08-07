import java.util.Scanner;
public class Assignment2
{
	public static void main(String arg[])
	{
		System.out.print("Enter the height of half pyramid ");
		Scanner sc=new Scanner(System.in);
		int height =sc.nextInt();
		 Assignment2 ass=new Assignment2();
		ass.pyramid(height);
		sc.close();
	}
	String spaces(int row, int n)
	{
		String str="";
		
			for(int count=n;count>n-row+1;count--)
				str=str.concat(" ");	
		return str;
	}
	String numbers(int row, int n)
	{
		String str="";
		
			
		for(int count=1;count<=n-row+1;count++)
			str=str.concat(""+count);
		
		return str;
	}
	String[] pyramid(int n)
	{
		String[] str=new String[n];
		String str1="";
		 Assignment2 ass=new Assignment2();
		 for(int count=0;count<n;count++)
		 {
			 str1=ass.spaces(count+1,n);
			 str1=str1.concat(ass.numbers(count+1,n));
			 str[count]=str1;
			 System.out.println(str1);
		 }
		 
		return str;
	}
}