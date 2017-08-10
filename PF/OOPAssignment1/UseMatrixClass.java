import java.util.*;
/**
 * @author Sumitra
 * this class is created to use the matrix class and to use all methods
 */
public class UseMatrixClass {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=scan.nextInt();
		System.out.println("enter the number of columns");
		int col=scan.nextInt();
		Matrix mat=new Matrix(row,col);
		//object of matrix is created and constructor is called.
		int val;
		System.out.println("enter the elements in row");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				val=scan.nextInt();
				mat.addElements(i, j, val);
				//will add the element to matrix
			}
			System.out.println();
		}
		mat.show();
		Matrix transpose=mat.transpose();
		//to transpose the matrix
		System.out.println("array after transpose");
		transpose.show();
		scan.close();
	}

}
