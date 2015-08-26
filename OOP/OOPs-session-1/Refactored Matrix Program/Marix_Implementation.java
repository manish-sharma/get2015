import java.util.Scanner;

public abstract class Marix_Implementation extends Matrix {

	// int Matrix[][],int Transpose[][];
	public Marix_Implementation(int row, int col) {
		// TODO Auto-generated constructor stub
		this.row = row;
		this.col = col;
		this.Matrix = new int[row][col];
		this.Transpose = new int[col][row];
	}

	@Override
	protected void addMatrixElements() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Elements of Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Matrix[i][j] = Integer.parseInt(scan.nextLine());
			}
		}

	}

	@Override
	protected void transposeMatrix() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				Transpose[i][j] = Matrix[j][i];
			}
		}

	}

}
