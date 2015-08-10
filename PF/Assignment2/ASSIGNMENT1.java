	/*************************
	 * @author Babalu Patidar
	 * Program to draw a pyramid pattern
	 * spaces method is used for return space string
	 * numbers method is used for return number string  
	 * drawpyramid method is used for draw pattern with the help of spaces and numbers method
	 ***********/

/* Starting of class*/
public class ASSIGNMENT1 {
	
	/* Starting of spaces method*/
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
		
	}/* Ending of spaces method*/
	
	/* Starting of numbers method*/
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
	}/* Ending of numbers method*/
	
	
	/* Starting of drawpyramid method*/
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

	}/* Ending of drawpyramid method*/
	
	
	/* Starting of main method*/
	public static void main (String arg[])
	{
		ASSIGNMENT1 b1=new ASSIGNMENT1();
		String out[]=b1.drawpyramid(3);
		for(int i=0;i<5;i++)
		System.out.println(out[i]);
		
	
	}/* Ending of main method*/

}/*Ending of class*/



