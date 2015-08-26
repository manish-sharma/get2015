/*Matrix Implementation
 * 
 */
import java.util.Scanner;
public class Matrix_Implementation {
	int row,col;
	static int Matrix[][];
	static int Transpose[][];
	public Matrix_Implementation(int row,int col)
	{
		this.row=row;
		this.col=col;
		Matrix=new int[row][col];
		Transpose=new int[col][row];
	}
	
	/*this fn will add the elements in matrix
	 * 
	 */
	public int[][] addMatrixElements() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Elements of Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				Matrix[i][j]=Integer.parseInt(scan.nextLine());
			}
		}
		return Matrix;
	}
	
/*this fn will calculate the 
 * transpose natrix
 */
	
	public int[][] transposeMatrix() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				Transpose[i][j]=Matrix[j][i];
			}
		}
		return Transpose;
	}
	
	/*this fn will show the output matrix 
	 * for which it is calling i.e. if input matrix is original 
	 * then prints the original matrix and if input matrix is transpose
	 * then shows the transpose matrix
	 */
	public void showOutputMatrix(int[][] OutputMatrix ,int row,int col) {
		// TODO Auto-generated method stub
		System.out.println("Output Matrix Is :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(OutputMatrix[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	

	public static void main(String args[])
	{
		int row,col;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total no. of rows in matrix");
		row=Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in matrix");
		col=Integer.parseInt(scan.nextLine());
		Matrix_Implementation obj=new Matrix_Implementation(row,col);
		Matrix=new int[row][col];
		Transpose=new int[col][row];
		obj.addMatrixElements();
		obj.showOutputMatrix(Matrix,row,col);
		obj.transposeMatrix();
		obj.showOutputMatrix(Transpose,col,row);
		
	}

	
	

	

}
