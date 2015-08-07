/* Program to print the given pattern */
public class Program2 
{
	public static void main (String args[])
	{
		Program2 obj= new Program2();
			
		int i;
		for(i=1;i<6;i++)
		{
			String a="";
			a= obj.pyramid(i,5);    //Calling function pyramid that returns pattern string
			System.out.println(a);  //Printing pattern
		}
	}
	
	public String spaces(int row,int n) //function to return spaces as string 
	{
	String a= "";
	int i;
		
			for(i=0;i<row;i++)
			{
				
					a= a + " ";      //Adding spaces
				
			}
		
		return a;		
	}

	public String number(int row, int n) //function to return numbers as string 
	{
		String a= "";
		int i;
				int b= n-row +2;	
				for(i=1;i<b;i++)
				{
					
						a= a + i;         
					
				}
			
			return a;	
	}
	
	public String pyramid(int row, int n)
	{
		String a= spaces(row,n)+number(row,n); //Concatenating spaces and numbers
		return a;
	}

}


