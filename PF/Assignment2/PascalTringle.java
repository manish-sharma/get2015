
public class PascalTringle {

	public String spaces(int row, int n)
	{
		String spaceOutput="";
		int space;
		 if(row > n)
		 {
	
				space=row-n;
		 }else
		 {
	

			    space=n-row;
		 }

		 for(int count=0;count<space;count++)
		 {
	
		 spaceOutput=spaceOutput.concat(" ");
		 }

		 return spaceOutput;
	}
	
	
	public String numbers(int row, int n)
	{
	
		String numberOutput="";
		int counter;
		if(row > n)
		{
	
			counter=2*n-row;
		}else
		{
	
			counter=row;
		}

		for(int count=1;count<=counter;count++)
		{
	
			numberOutput=numberOutput.concat(""+count);

		}
		for(int count2=counter-1;count2>0;count2--)
		{

			numberOutput=numberOutput.concat(""+count2);


		}
		return numberOutput;
	}

	public String[] pascalTringle(int n)
	{
	
		String tringle[]=new String[2*n-1];

		int count=1;
		PascalTringle pascalTringle= new PascalTringle();
		for(count=0;count<2*n-1;count++)
		{
			tringle[count]=pascalTringle.spaces(count+1, n).concat(pascalTringle.numbers(count+1, n));
	
		}


		return tringle;
	}


}
