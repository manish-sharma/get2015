package assignment2;

public class prg1 {
	public static void main (String args[])
	{
		prg1 obj= new prg1();
		
		int i;
		for(i=1;i<10;i++)
		{
			String a="";
			a= obj.pyramid(i,9);
			
			System.out.println(a);
		}
	}
	
	public String spaces(int row,int n)
	{
	String a= "";
	int i;
				if(row<(n+1)/2)
				{
			for(i=5;i>row;i--)
			{
				a= a + " "+ " ";
			}
				}
				else
				{
					for(i=1;i<(row-4);i++)
					{
						
							a= a + " "+ " ";
						
					}
				}
		
		return a;		
	}

	public String number(int row, int n)
	{
		String a= "";
		int i,j;
				int b= n-row +1;	
				if(row<(n+1)/2)
				{
					for(i=1;i<(row);i++)
					{
						a= a+" "  + i;
					}
					
					for(j=i;j>0;j--)
					{
						a= a+" "  + j;
					}
				}
				else
				{
					for(i=1;i<b+1;i++)
					{
						a= a+" "  + i;
					}
					
					for(j=b-1;j>0;j--)
					{
						a= a+" " + j;
					}
				}
			
			return a;	
	}
	
	public String pyramid(int row, int n)
	{
		String a= spaces(row,n)+number(row,n);
		return a;
	}

}
