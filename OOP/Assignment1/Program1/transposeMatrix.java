//Program to find transpose of a matrix using OOPS concepts
import java.util.Scanner;
public class transposeMatrix 
{
	int data[][];
	int noRows;
	int noCols;
	public transposeMatrix(int row,int col) //constructor to initialize number of rows and columns 
	{
		this.noRows=row;
		this.noCols=col;
		data=new int[row][col];
	}
	
	int[][] addElements(int row ,int col) //function to input matrix from user 
	{
		int i,j,value;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter matrix elements");
		for(i=0;i<row;i++)
		 {
			 for(j=0;j<col;j++)
			 {
				value=scan.nextInt() ;
				this.data[i][j]=value;
			 }
		 }
		scan.close();
		return data;
	}
	
	public int[][] transpose(int row, int col, int data[][]) //function to transpose matrix
	{
		int i,j;
		int newMatrix[][] = new int[col][row];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				newMatrix[j][i]=this.data[i][j];
			}
		}
		return newMatrix;
	}
	
	 void show(int row, int col, int newMatrix[][]) //function to display transposed matrix
	{
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(newMatrix[i][j]);
			}
			System.out.println();
		}
	 }
	
	 public static void main(String args[])
	 {
		 transposeMatrix object = new transposeMatrix(3,3); //object of class
		 int newMatrix[][]=object.addElements(3,3);      //calling function to add elements
		 int resultMatrix[][]=object.transpose(3,3,newMatrix); //calling function to transpose
		 object.show(3,3,resultMatrix); //calling function to print resultant matrix 
	}
}
