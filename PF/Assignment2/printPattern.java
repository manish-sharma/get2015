
public class printPattern
{
	public static void main(String[] args)
	{
		int row,n=5;
		printPattern p=new printPattern();
		for(row=0;row<5;row++)
		{
			String output[]=p.pattern(row, n);
			  for(int f=0;f<output.length;f++)
				  System.out.print(output[f]);
			  System.out.println();
		}
	}
	String[] spaces(int row,int n)
	{
		String arr[]=new String[row];
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=" ";
		}
		return arr;
	}

	String[] numbers(int row,int n)
	{
		String arr1[]=new String[n-row];
		for(int i=0;i<arr1.length;i++)
		{
		   arr1[i]=i+1+"";
		}
		return arr1;
	}
	String [] pattern(int row,int n)
	{
		//printPattern p=new printPattern();
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







