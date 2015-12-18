import java.util.Scanner;


public class Assignment2
{
	String space(int row,int n) /* Function For Printing Space*/
	{
		int count;
		String space="";   /*Space variable is used to store spaces and count variable is used for loop*/
		
		for(count=0;count<(n-row);count++)   
		{
			space=space+" ";  /*Space variable is used to store spaces  and count variable is used for loop*/
			
		}
		
		return space;
	}
	
	String number(int row)  /* Function For Printing number row by row*/
	{
		int count;
		String pat="";
		
	    for(count=1;count<=row+1;count++)   
		{
			pat=pat+count;      /* Storing number in each row in string variable pat*/
		}		
		return pat;
	}
	
	String pyramid(int row)  /* Function For Printing Full pattern using Space() and number() Function*/
	{
		int count;
		String space,pat, pattern="";

		for(count=row;count>0;count--)
		{
			space=space(count,row);   
			 pattern= pattern+space;       /*Storing/Printing pattern in pattern variable*/
			
			pat=number(count-1);
			 pattern= pattern+pat;            
		
			 pattern= pattern+"\n";
		}
		
		return pattern;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;    /*row  variable is used to take input from user at which number/row user wants to print pattern*/
		String pattern="";
		
		Scanner  sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		row=sc.nextInt();
				
		Assignment2 ass2=new Assignment2();
		
		pattern=ass2.pyramid(row);   
		
		System.out.print(pattern);
		
		

	}
}
