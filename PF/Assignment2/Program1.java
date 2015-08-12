/* Program to print a given pattern */
public class Program1 
{
	public static void main (String args[])
	{
		Program1 obj= new Program1();
		
		int i;
		for(i=0;i<10;i++)
		{
			String a="";
			a= obj.pyramid(i,9);
			System.out.println(a);
		}
	}
	
	public String spaces(int row,int n) //To return spaces as string
	{
	String a= "";
	int i;
				if(row<n/2)
				{
			for(i=4;i>row;i--)
			{
				a= a + " "+" ";
			}
				}
				else
				{
					for(i=1;i<(row-3);i++)
					{
						
							a= a + " " + " ";
						
					}
				}
		
		return a;		
	}

	public String number(int row, int n) //To return numbers as string
	{
		String a= "";
		int i,j;
				int b= n-row +1;	
				if(row<n/2)
				{
					for(i=1;i<(row+1);i++)
					{
						a= a +" "+ i;
					}
					
					for(j=i;j>0;j--)
					{
						a= a +" "+ j;
					}
				}
				else
				{
					for(i=1;i<b;i++)
					{
						a= a +" "+ i;
					}
					
					for(j=b-2;j>0;j--)
					{
						a= a +" "+ j;
					}
				}
			
			return a;	
	}
	
	public String pyramid(int row, int n)
	{
		String a= spaces(row,n)+number(row,n); //Concatenating spaces and numbers
		return a;
	}

}
