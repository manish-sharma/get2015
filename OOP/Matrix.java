package oops_asignment_1;

import java.util.Scanner;



public class Matrix 
{
	int data[][];//global variable for data
	
	int nRow;//number of Rows
	int nCol;//numbers of Columns
	
	/*Constructor*/
	public Matrix(int row,int col)
	{
		this.nRow = row;
		this.nCol = col;
		data = new int[row][col];
		
	}
	
	/*add element to array*/
	public void addElements(int row,int col,int value)
		{
		
			
				data[row][col] = value;
			
		}
		
	
	/*transposing the matrix*/
	public Matrix transpose()
	{
		Matrix ob = new Matrix(nCol,nRow);
		
		for(int i = 0 ; i < nRow ; i++)
		{
			for(int j = 0 ; j < nCol ; j++)
			{
				ob.data[j][i] = data[i][j];
			}
		}
		
		return ob;
		
	}
	
	 /*Function to print matrix*/
	public void show()
	{
		
		for(int i = 0 ; i < nRow ; i++)
		{
			for(int j = 0 ; j < nCol ; j++)
			{
				System.out.print(this.data[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int row = sc.nextInt();
		System.out.println("enter the number of columns:");
		int col = sc.nextInt();
		Matrix ob=new Matrix(row, col);//method calling
		
		
		System.out.println("enter the elements:");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < col ; j++)
			{
				int value = sc.nextInt();
				ob.addElements(i,j,value);
			}
		}
		System.out.println("given matrix is:");
		ob.show();
		Matrix m2 = ob.transpose();
		System.out.println("Transpose of the matrix is:");
		m2.show();

	}

}
