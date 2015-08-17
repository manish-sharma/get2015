import java.util.*;
public class Matrix 
{
	int data[][];
	int noRows;
	int noCols;
	private Matrix Matrix;
	//Matrix class constructor used to initialize variables
	public Matrix(int row,int col)
	{
		this.noRows=row;
		this.noCols=col;
		data=new int[row][col];
	}
	//addElement method used to add elements in matrix
	public void addElement(int row,int col,int val)
	{
	    data[row][col]=val;
	}
	//This method is used to transpose the Matrix
	public Matrix Transpose()
	{
		Matrix mat=new Matrix(noRows,noCols);
		for(int i=0;i<noRows;i++)
		{
			for(int j=0;j<noCols;j++)
			{
				mat.data[j][i]=data[i][j];//transpose logic
			}
		}
		return mat;
	}
	public void show()//To show the elements of matrix after transpose
	{
		for(int i=0;i<noRows;i++)
		{
			for(int j=0;j<noCols;j++)
			{
		        System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Matrix matrix=new Matrix(3,3);
		System.out.println("Eneter element in Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int val=sc.nextInt();
				matrix.addElement(i,j,val);//call addElement method
			}
		}
		Matrix m2=matrix.Transpose();
		m2.show();//call show method
		sc.close();
	}
}
