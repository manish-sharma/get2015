import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printing {
	/*Starting of main function*/
	public static void main(String []args)
	{
		
		int noOfRows,noOfCols,value=0;
		Matrix mat=null;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of Rows in Matrix\t");
		try
		{
			noOfRows=Integer.parseInt(input.readLine());
			System.out.println("Enter no of Columns in Matrix\t");
			noOfCols=Integer.parseInt(input.readLine());
			 mat = new Matrix(noOfRows,noOfCols);
			try{
				for(int row = 0 ; row < noOfRows ; row++) {
					for(int col = 0 ; col < noOfCols ; col++) {
						value=Integer.parseInt(input.readLine());
						mat.addElements(row, col,value);
						}
					}
				}
			
			catch(NumberFormatException nFormat)
					{
						System.out.println("Please enter element in number format");
						System.exit(1);
					}
		}
		catch(IOException ioException)
		{
			System.out.println("Error in Reading");
			System.exit(1);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter element in number format");
			System.exit(1);
		}
		Matrix temp = mat.transpose();
		temp.show();
	}
	/*Ending of main function*/
}
