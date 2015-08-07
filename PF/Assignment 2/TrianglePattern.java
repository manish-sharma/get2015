
public class TrianglePattern {
	
	public String space(int row,int n)
	{  String space=new String();
		 for(int j=1;j<row;j++)
		 {
			 space=space.concat(" ");
		 }
	    return space;
	}
	
  public String number(int row,int n)
  {
	  String numberString=new String();
	  for(int k=1;k<=n-row+1;k++)
	  {
		  numberString=numberString+k;
	  }
	  
  return numberString;
  }
  
  public String[] finalPattern(int n)
  {
	  String result[]=new String[n+1]; 
	  for(int i=1;i<=n;i++)
	   {
		    result[i]=space(i,n)+number(i,n);		    
	   }
	  return result;
  }
  public static void main(String args[])
	{   
	    
		TrianglePattern pattern=new TrianglePattern();
		String output[]=pattern.finalPattern(5);
		for(int i=1;i<=5;i++)
		{
			System.out.println(output[i]);
		}
	}
}
