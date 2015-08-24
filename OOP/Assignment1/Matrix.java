// program to perform different operations on matrix
import java.util.Scanner;

public class Matrix 
{
	int data[][];
	int numRows;
	int numCols;
	
	/* parameterized constructor */
	public Matrix ( int row, int col)   
	{
		numRows = row ;
		numCols = col ;
		data = new int [row][col];
	}
	
	
	/* adds element at particular position */
	public void addElements ( int row, int col, int val)
	{
		this.data[row][col] = val ;
	}
	
	
	/* returns transpose of a matrix */
	public Matrix transpose()
	{
		/* creates new object to store new data after transpose & return this object */
		Matrix obj = new Matrix(numRows,numCols);
		for(int index1 = 0; index1 < numRows; index1++ )
		{
			for(int index2 = 0; index2 < numCols; index2++ )
			{
				obj.data[index1][index2] = data[index2][index1] ;
			}
		}
		return obj;
	}
	
	
	/* prints the whole matrix */
	public void showMatrix()
	{
		for(int index1 = 0; index1 < numRows; index1++ )
		{
			for(int index2 = 0; index2 < numCols; index2++ )
			{
				System.out.print(data[index1][index2]+"\t");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = null;
		Matrix objMatrix1 = null;
		try
		{
			sc = new Scanner(System.in);
			
			System.out.println("Enter the number of rows in matrix : ");
			int rows = sc.nextInt();
			
			System.out.println("Enter the number of cols in matrix : ");
			int cols = sc.nextInt();
			
			objMatrix1 = new Matrix (rows, cols);
			
			// adding all elements in array
			System.out.println("Enter the values in matrix : ");
			for(int index1 = 0; index1 < rows; index1++ )                  
			{
				for(int index2 = 0; index2 < cols; index2++ )
				{
					objMatrix1.addElements( index1, index2, sc.nextInt());
				}
			}
			
			objMatrix1.showMatrix();
			
	        Matrix objMatrix2 = objMatrix1.transpose();   
	        
	        objMatrix2.showMatrix();
		}
		catch( Exception ex )
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(objMatrix1!=null)
				objMatrix1 = null;
		}
	}
}
