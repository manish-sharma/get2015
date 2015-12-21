import java.util.Scanner;


public class Assignment1 
{
	String space(int row,int n)  /* Function For Printing Space*/
	{
		int count;
		String space="";     /*Space variable is used to store spaces  and count variable is used for loop*/
		
		for(count=0;count<(n-row);count++)
		{
			space=space+" ";
		}
		
		return space;
	}
	String number(int row,int n) /* Function For Printing number row by row*/
	{
		int count;
		String pat="";
		
		for(count=1;count<=row+1;count++)    
		{
			pat=pat+count;                   /* Storing Increasing number in each row in string variable pat*/
		}
		for(count=row;count>0;count--)     
		{
			pat=pat+count;                     /* Storing Decreasing number in each row in string variable pat*/
		}
		
		return pat;
	}
	
	 String pyramid(int no)  /* Function For Printing Full pattern using Space() and number() Function*/
	{
		int count;
		String space,pat,pattern="";
		
		for(count=0;count<no;count++)        /*Storing/Printing Above  of pattern in pat variable*/
		{
			space=space(count,no);
			pattern= pattern+space;
			
			pat=number(count,no);
			pattern= pattern+pat;
						
			pattern= pattern+"\n";
		}
		
		
		for(count=no-1;count>0;count--)             /*Storing/Printing Below part of pattern in pat variable*/
		{
			space=space(count,no+1);
			pattern= pattern+space;
			
			pat=number(count-1,no);
			pattern= pattern+pat;
						
			pattern= pattern+"\n";
		}
		
		return pattern;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;            /* no variable is used to take input from user at which number user wants to print pattern*/    
		String pattern="";   
		
		Scanner  sc=new Scanner(System.in);
	
		System.out.println("Enter number at which you want to print:");
		no=sc.nextInt();
		
		Assignment1 ass1=new Assignment1();
		
		pattern=ass1.pyramid(no);
		
		System.out.print(pattern);

	}


}
