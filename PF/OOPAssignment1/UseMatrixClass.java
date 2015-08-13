import java.util.*;
public class UseMatrixClass {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=scan.nextInt();
		System.out.println("enter the number of columns");
		int col=scan.nextInt();
		Matrix mat=new Matrix(row,col);
		int val;
		System.out.println("enter the elements in row");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				val=scan.nextInt();
				mat.addElements(i, j, val);
			}
			System.out.println();
		}
		mat.show();
		Matrix transpose=mat.transpose();
		System.out.println("array after transpose");
		transpose.show();
		scan.close();
	}

}
