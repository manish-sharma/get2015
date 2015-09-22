
public class PyramidPattern 

{
	
	public String space(int row,int n)
	{    
		String space=new String();
		 for(int j=0;j<n-row||j<row-n;j++)
		 {
			 space=space.concat(" ");
		 }
	    return space;
	}
	public String number(int row,int n)
	{
		 String numbers=new String();
		 for(int i=1;i<=row;i++)
		 {
			 numbers=numbers+i;
		 }
		 for(int i=row-1;i>=1;i--)
		 {
			 numbers=numbers+i;
		 }
		 return numbers;
		 
	}
	public String[] Pyramid(int n)
	{     
		String output_pyramid[]=new String[2*n-1];
	    int j=0;	 
	    for(int i=1;i<=n;i++)
		 {
			 output_pyramid[j]=space(i,n)+number(i,n);
			 
			 j++;
		 }
	   for(int i=n-1;i>=1;i--)
	    {
		 output_pyramid[j]=space(i,n)+number(i,n);
		 j++;
	    }
	    return output_pyramid;
	}
	 public static void main(String args[]) 
	 { 
		String pyramid[];
        PyramidPattern pattern_object=new PyramidPattern();
        pyramid=pattern_object.Pyramid(5);
        for(int i=0;i<2*5-1;i++)
        {
        	 System.out.println(pyramid[i]);
        }
	 
	 }
	 

}
