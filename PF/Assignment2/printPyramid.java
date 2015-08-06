
public class printPyramid 
{
	public static void main(String[] args) 
	{
		int row,n=5;
		printPyramid p=new printPyramid();
		for(row=0;row<=8;row++)
		{
			String output[]=p.pyramid(row, n);
			  for(int f=0;f<output.length;f++)
				  System.out.print(output[f]);
			  System.out.println();
		}
	}
	
	String[] spaces(int row,int n)
	{
		if(row<n)
		{
		   String arr[]=new String[n-row-1];
		   for(int i=0;i<arr.length;i++)
		   {
			   arr[i]=" ";
		   }
		   return arr;
		}
		else
		{
			String arr[]=new String[row-n+1];
			for(int i=0;i<arr.length;i++)
			{
			  arr[i]=" ";
			}
			return arr;
		}
	}
	
	String[] numbers(int row,int n)
	{		
		
		   if(row<n)
		   {    
			  String arr1[]=new String[2*row+1];
			    for(int i=0;i<=row;i++)
			       arr1[i]=i+1+"";		
				for(int i=row+1;i<arr1.length;i++)
				   arr1[i]=arr1.length-i+"";
				return arr1;
		   } 
		   else
		   {   
			   row=8-row;
			  String arr1[]=new String[2*row+1];
			   for(int i=0;i<=row;i++)
			       arr1[i]=i+1+"";		
				for(int i=row+1;i<arr1.length;i++)
				   arr1[i]=arr1.length-i+"";
				return arr1;		   
		   }
	}
	String[] pyramid(int row,int n)
	{
	String b[]=spaces(row,n);
	
	 String a[]=numbers(row,n);
	 String c[]= new String[a.length+b.length];
     for(int i=0;i<b.length;i++)
     {
     	c[i]=b[i];
     }
     for(int i=0;i<a.length;i++)
     {
     	c[i+b.length]=a[i];
     }
     return c;
	}
}
	

