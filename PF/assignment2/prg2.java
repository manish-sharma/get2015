package assignment2;



public class prg2 {
	public static void main (String args[])
	{
		prg2 obj= new prg2();
			
		int i;
		for(i=1;i<6;i++)
		{
			String a="";
			a= obj.pyramid(i,5);
			System.out.println(a);
		}
	}
	
	public String spaces(int row,int n)
	{
	String a= "";
	int i;
				
			for(i=0;i<row-1;i++)
			{
				
					a= a + " "+ " ";
				
			}
		
		return a;		
	}

	public String number(int row, int n)
	{
		String a= "";
		int i;
				int b= n-row +2;	
				for(i=1;i<b;i++)
				{
					
						a= a+ " " + i ;
					
				}
			
			return a;	
	}
	
	public String pyramid(int row, int n)
	{
		String a= spaces(row,n)+number(row,n);
		return a;
	}
}
