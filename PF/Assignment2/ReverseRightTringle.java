
public class ReverseRightTringle {
	public String spaces(int row, int n)
	{
		String outputSpaces="";

		for(int count=0;count<row-1;count++)
		{
	
			outputSpaces=outputSpaces+" ";
		}



		return outputSpaces;
	}
	
	public String numbers(int rows , int n)
	{
		String outputNumber="";
	
		for(int count=1;count<=(n-rows+1);count++)
		{
	
			outputNumber=outputNumber+count;

		}
		return outputNumber;
	}


	public String[] reversrRightTringle(int n)
	{
	
		String outputTringle[]=new String[n];

		for(int count=0;count<n;count++)
		{
			ReverseRightTringle reverseRightTringle= new ReverseRightTringle();	
			outputTringle[count]=reverseRightTringle.spaces(count+1, n)+reverseRightTringle.numbers(count+1,n);
		}

		return outputTringle;
	}
		
}
