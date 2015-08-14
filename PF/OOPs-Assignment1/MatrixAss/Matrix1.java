package MatrixAss;

import java.util.Scanner;

public class Matrix1 {

	public int data[][];
	int nrow, ncol;
	
	public Matrix1(int row, int col)          //constructor
	{
	    nrow=row;
	    ncol=col;
	    data=new int[row][col];
	}

	public void addElement(int row,int col, int val)  //Function to add element in matrix
	{
	    data[row][col]=val;
	}

	public Matrix1 transpose()        //Function to Transpose matrix
	{
	   Matrix1 trans=new Matrix1(ncol,nrow);
	   for(int i=0;i<nrow;i++)
	   {
	     for(int j=0;j<ncol;j++)
	     trans.data[j][i]=data[i][j];
	   }
	   return trans;
	} 

	public void show()                    //Function to display matrix elements
	{
	   for(int i=0;i<nrow;i++)
	    {
	        for(int j=0;j<ncol;j++)
	        System.out.print(" "+data[i][j]+" ");
	        System.out.println();
	     }
	}
	public static void main(String[] args) 
	{

	     System.out.print("Enter row and column of matrix: ");
	     
	     Scanner sc=new Scanner(System.in);
	     
	     int row=sc.nextInt(); 
	     int col=sc.nextInt();
	     
	     Matrix1 obj= new Matrix1(row,col);
	     
	     System.out.print("Enter elements of matrix row wise: ");
	     
	     for(int i=0;i<row;i++)
	     {
	     for(int j=0;j<col;j++)
	     obj.addElement(i,j,sc.nextInt());
	     }
	     
	     System.out.println("Matrix is:");
	     obj.show();
	     
	     System.out.println("Transpose matrix");
	     
	     Matrix1 tran=obj.transpose();
	     tran.show();
	     sc.close();
	  }

	}