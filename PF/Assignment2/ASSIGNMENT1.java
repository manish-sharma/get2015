
public class ASSIGNMENT1 {
	
	
	public String  spaces(int row, int n)// it will calculate no. of spaces in row
	{
				if(row>n)
		{
			row=2*n-row;
		}
				String outputspace="";

		
		for(int i=0;i<n-row;i++)
			outputspace+=' ';
		
		return outputspace;
		
	}
	
	public String numbers(int row, int n) // it will calculate number string in row
	{
		if(row>n)
		{
			row=2*n-row;
		}
		
		String output="";
		
		for(char i=0;i<(2*row)-1;i++)
			{
				int j=i+1;
				if(i>=row)
				{	j=2*row-i-1;	}
			
				output+=j;
			}
		
		return output;	
	}
	
	public String[] drawpyramid(int n)
	{
		
		String output[]=new String[2*n-1];
		
		ASSIGNMENT1 b=new ASSIGNMENT1();
		for(int i=0;i<2*n-1;i++)
		{
			String space=b.spaces(i+1, n);//calling of spaces method 
			String number=b.numbers(i+1, n);//calling of numbers method
		
			output[i]=space+number; 	//Addition of space and number strings
		}
		return output;

	}
	
	public static void main (String arg[])
	{
		ASSIGNMENT1 b1=new ASSIGNMENT1();
		String out[]=b1.drawpyramid(3);
		for(int i=0;i<5;i++)
		System.out.println(out[i]);
		
	
	}

}



