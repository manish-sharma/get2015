import java.util.Scanner;

//program to input values of matrix,transpose and print it

public class matrix {

	int data[][];
	int noRows;
	int noCols;

	private static Scanner in;

	public matrix(int row, int col) // assign values
	{
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];

	}

	public int[][] addElement(int row, int col) // function to add element
	{
		int i, j, val = 0;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				val = in.nextInt();
				this.data[i][j] = val;
			}
		}
		return data;

	}

	public int[][] transpose(int row, int col, int[][] data) // function to
																// transpose
																// matrix
	{
		int trans[][] = new int[row][col];
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				trans[i][j] = data[j][i];
			}
		}

		return trans;
	}

	public void show(int[][] matr, int row, int col) // function to print matrix
	{
		int i, j;
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(matr[i][j]);
			}

		}

	}

	public static void main(String args[]) {
		in = new Scanner(System.in);
		int row, col;
		System.out.println("enter no. of row"); // user input
		row = in.nextInt();
		System.out.println("enter no. of row");
		col = in.nextInt();
		System.out.println("enter elements");

		matrix obj = new matrix(row, col);
		int[][] original = obj.addElement(row, col);
		obj.show(original, row, col);
		int[][] matr = obj.transpose(col, row, original);
		obj.show(matr, col, row);
	}
}
