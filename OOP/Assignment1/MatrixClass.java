import java.util.Scanner;

/** Title : Implement Matrix Class for addElements, transpose, show methods.
 * 
 * @author Gaurav
 */

public class MatrixClass {

	int data[][];
	int noOfRows, noOfColumns;
	
	public MatrixClass(int row, int col){
		this.noOfRows = row;
		this.noOfColumns = col;
		data = new int[row][col];
	}
	
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MatrixClass matrix = new MatrixClass(3,3);
		
		System.out.println("enter elements of the matrix. ");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				matrix.addElements(i, j, sc.nextInt());
		
		MatrixClass m2 = matrix.transpose();
		System.out.println("the transpose of given matrix is : ");
		m2.show();
		sc.close();
	}
	
	
	public MatrixClass transpose(){
		MatrixClass tempMatrix = new MatrixClass(3, 3);
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				tempMatrix.data[j][i] = data[i][j];
		return tempMatrix;
	}
	
	
	public void addElements(int row, int col, int value){
		data[row][col] = value;
	}
	
	
	public void show(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++)
				System.out.print(data[i][j] + " ");
			System.out.println();
		}
	}

}
