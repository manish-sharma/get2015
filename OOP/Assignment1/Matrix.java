/****************************************************************************************
Name            : Matrix
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to implement Matrix transpose 
                :
****************************************************************************************/
import java.util.Arrays;
import java.util.Scanner;


public class Matrix {
	
	int data[][];
	int noofrow;
	int noofcol;
	
	//Matrix constuctor takes two input as number of row and colomn
	public Matrix(int row,int col)
	{
		this.noofrow=row;
		this.noofcol=col;
		data=new int[row][col];
	}
	//End of contructor
	//showMatrix method return input matrix
	public int[][] showMatrix()
	{
		return data;
	}
	//End of showmatrix method
	
	//add element method used to add element in matrix 
	//input are row number ,colomn number,and element
	public void addElement(int row,int col,int element)
	{
		this.data[row][col]=element;
	}
	//End of add element
	
	//Matrxtranspose return transpose of matrix
	public int[][] matrixTranspose()
	{
		int transpose[][]=new int[noofcol][noofrow];
		for(int i=0;i<this.noofcol;i++)
		{
			for(int j=0;j<this.noofrow;j++)
			{
				transpose[i][j]=this.data[j][i];
			}
		}
		return transpose;
	}
	//End of matrix transpose
	
	//Start of main
	public static void main(String arg[])
	{	
		int noOfRow;
		int noOfColomn;
		try{
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter No Of Row");
			noOfRow=scan.nextInt();
			System.out.println("Enter No Of Colomn");
			noOfColomn=scan.nextInt();
			Matrix matrix=new Matrix(noOfRow,noOfColomn);
			System.out.println("Enter All Elements..");
			for(int i=0;i<noOfRow;i++)
			{
				for(int j=0;j<noOfColomn;j++)
				{
					matrix.addElement(i, j, scan.nextInt());
				}
			}
			
			System.out.println("Matrix :");
			int actual[][]=matrix.showMatrix();
			
			for(int i=0;i<noOfRow;i++)
			{
				System.out.println(Arrays.toString(actual[i])+" ");
			}
			
			
			System.out.println("Transpose Matrix :");
			int transpose[][]=matrix.matrixTranspose();
			
			for(int i=0;i<noOfColomn;i++)
			{
				System.out.println(Arrays.toString(transpose[i])+" ");
			}
			scan.close();
			
		}
		//End of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//End of catch
		
	}
	//End of main
	

}
//End of class
