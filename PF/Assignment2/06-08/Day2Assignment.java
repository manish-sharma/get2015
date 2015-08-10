
public class Day2Assignment {

	
	String[] printPyramid(int noOfRows){
		//checking for valid integer value
		String[] err=checkForError(noOfRows);
		if(!err[0].equals("NP"))
		return err;
		
		int N=noOfRows;
		String[] pyStrings=new String[N]; //array to be returned
		for(int i=0;i<N;i++)
		pyStrings[i]=spaces(i+1, N)+numbers(i+1,N);//Decomposition-- getting spaces and number seperately 
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
		for(int i=n-row+1;i<n;i++)
			spc+=" ";
		return spc;
	}
	

	String numbers(int row,int n){
		String num="";
		for(int i=0;i<n-row+1;i++)
			num+=String.valueOf(i+1);
		return num;
		
	}
}
