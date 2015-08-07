
public class Assignment2 {
	

	public String  spaces(int row, int n)// it will calculate no. of spaces in row
	{
		String output="";
		
		for(int i=0;i<row-1;i++)
		{	output+=' ';
		
		}
		
		return output;
		
	}
	
	public String numbers(int row, int n)// it will calculate number string in row
	{
		String output="";
		
		for(char i=0;i<n-row+1;i++)
			{
			int j=i+1;
			output+=j;
			}
		return output;
	}
	
	public String[] drawpyramid(int n)// it will draw pyramid by help of space and numbers method 
	{
		
		String output[]=new String[2*n-1];
		
		Assignment2 b=new Assignment2();
		for(int i=0;i<n;i++)
		{
			String space=b.spaces(i+1, n);		//calling of spaces method 
			String number=b.numbers(i+1, n);	//calling of numbers method
			output[i]=space+number;				//Addition of space and number strings
	
		}
		return output;  //return pyramid as a Array Of String  

	}
	
	public static void main (String arg[])
	{
		Assignment2 b1=new Assignment2();
		String out[]=b1.drawpyramid(3);
		for(int i=0;i<3;i++)
		System.out.println(out[i]);
	}


}
