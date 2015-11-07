package programingFundamental2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2
{
	/**printPyramid is a function which print the pyramid according to the no. pass in the function.
	 * 
	 * @param noOfRows is No of rows upto which user want's to print the pyramid.
	 * @return This function return a string which consists the elements each of which contain each row of pyramid.
	 */
	public String[] printPyramid(int noOfRows)
	{
		//checking for valid integer value
		String[] err=checkForError(noOfRows);
		//if String err not equals to "NP" means it has problem then function will return error message.
		if(!err[0].equals("NP"))                        
		return err;
		
		int N=noOfRows;
		String[] pyStrings=new String[N]; //array to be returned
	
		//Decomposition-- By this loop we are getting spaces and number separately and the decompose them to one string which is to be return.
		for(int i=0;i<N;i++)
		pyStrings[i]=spaces(i+1, N)+numbers(i+1,N); 
	
		return pyStrings;
	}
	
	/**checkForError is a function which checks that is there any error in the parameter pass to the printPyramid function.
	 * 
	 * @param n is No of rows upto which user want's to print the pyramid.
	 * @return This function return a string which consists of the error message.If string contains NP then there is NO PROBLEM else there is problem.
	 */
	public String[] checkForError(int n)
	{
		String[] errorMessage=new String[1];             //string to be returned
		errorMessage[0]=new String();
		errorMessage[0]="NP";                            //"NP" means NO PROBLEM. IT is compare in parent function.
		
		//check if n is less than zero means negative. 
		if(n<0)
			{
			errorMessage[0]="Number cant be negative";
			return errorMessage;
			}
		//check if n is equal to zero.
		else if (n==0) {
			errorMessage[0]="Number cant be Zero";
			return errorMessage;
		}
		//check if n is more than 9 i.e. in two digit. If it is than it may create an disformality in the structure of pyramid.
		else if (n>9) {
			errorMessage[0]="Number should be a single digit number";
			return errorMessage;
		}
		return errorMessage;
	}
	
	/**spaces is a function which return the spaces of one row of the pyramid in the form of string.
	 * 
	 * @param row is the no. of row of which parent function want's the space string.
	 * @param n is the no of rows .
	 * @return This function return a string which consists of the space string of a each row of the pyramid.
	 */

	public String spaces(int row,int n)
	{
		String spc="";                          //string to be returned.
		for(int i=n-row+1;i<n;i++)
			spc+=" ";
		return spc;
	}
	

	/**numbers is a function which return the one row of numbers of the pyramid in the form of string.
	 * 
	 * @param row is the no. of row of which parent function want's the space string.
	 * @param n is the no of rows .
	 * @return This function return a string which consists of the numbers string of a each row of the pyramid.
	 */
	public String numbers(int row,int n){
		String num="";                          //strig to be returned.
		for(int i=0;i<n-row+1;i++)
			num+=String.valueOf(i+1);
		return num;
		
	}
	public static void main(String args[])
	{
		int response=1;
		
		while(response==1)
		{
			
			Scanner input = new Scanner(System.in);
			try
			{
				int n;
				System.out.println("Enter the No. of rows");
				n=input.nextInt();
				Assignment2 assign=new Assignment2();
				String[] pyramid=	assign.printPyramid(n);
				for (String str : pyramid)
				System.out.println(str);
				
				System.out.println();
				System.out.println("If you wan't to continue Enter 1");
				response = input.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("kindly please enter a valid value of integer type only");
			}
			
		}
		
	}
}


