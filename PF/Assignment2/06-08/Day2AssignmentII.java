
public class Day2AssignmentII {
	
	String[] printPyramid(int noOfRows){
		//checking for valid integer value
		String[] err=checkForError(noOfRows);
		if(!err[0].equals("NP"))
		return err;
		
		int N=noOfRows;  
		String[] pyStrings=new String[2*N-1]; //array to be returned
		
		for(int i=0;i<2*N-1;i++)
		pyStrings[i]=spaces(i+1, N)+numbers(i+1,N); //Decomposition-- getting spaces and number seperately 
		
		return pyStrings;
	}
	
	String[] checkForError(int n)
	{
		String[] errorMessage=new String[1];
		errorMessage[0]=new String();
		errorMessage[0]="NP";
		
		if(n<0)
			{
			errorMessage[0]="Number cant be negative";
			return errorMessage;
			}
		else if (n==0) {
			errorMessage[0]="Number cant be Zero";
			return errorMessage;
		}
		else if (n>9) {
			errorMessage[0]="Number should be a single digit number";
			return errorMessage;
		}
		return errorMessage;
	}
	String spaces(int row,int n){
		String spc="";
		if(row<=n)
			for(int i=n-row;i>0;i--)
				spc+=" ";
		else
			for(int i=row-n;i>0;i--)
				spc+=" ";
		return spc;
	}
	
	String numbers(int row,int n){
		String num="";
		if(row<=n){
			int i=0;
			for(;i<row;i++)
				num+=String.valueOf(i+1);
			for(;i>1;i--)
				num+=String.valueOf(i-1);
		}
		else{
			int i=0;
			for(;i<2*n-row;i++)
				num+=String.valueOf(i+1);
			for(;i>1;i--)
				num+=String.valueOf(i-1);
		}
		return num;	
	}
	
}
