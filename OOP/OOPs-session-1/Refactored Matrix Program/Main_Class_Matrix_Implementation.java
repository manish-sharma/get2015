import java.util.Scanner;

public class Main_Class_Matrix_Implementation {
	public static void main(String args[]) {
		int row, col;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total no. of rows in matrix");
		row = Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in matrix");
		col = Integer.parseInt(scan.nextLine());
		Result_Matrix result_Matrix = new Result_Matrix(row, col);
		result_Matrix.addMatrixElements();
		result_Matrix.transposeMatrix();
		result_Matrix.showOriginalOutputMatrix();
		result_Matrix.showTransposeMatrix();

	}

}
