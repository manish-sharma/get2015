package Assignment5;

/**
 * Assignment 1: Matrix Class Implementation for transposing and showing it.
 *  
 */

import java.util.Scanner;

/**
 * @author Arushi-> Matrix class contain elements of matrix
 */
public class Matrix {
	int data[][];
	int noRows;
	int noCols;

	public Matrix(int row, int col) {
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}

	/**
	 * Function to add elements in matrix
	 * 
	 * @param row
	 *            ->row to enter element
	 * @param col
	 *            ->coloumn to enter elements
	 * @param val
	 *            ->value to be store
	 */
	public void addElements(int row, int col, int val) {
		data[row][col] = val;
	}

	/**
	 * Function to transpose matrix
	 * 
	 * @return-transpose matrix
	 */
	public Matrix transpose() {
		Matrix transposeMatrix = new Matrix(noCols, noRows);
		for (int i = 0; i < transposeMatrix.noRows; i++) {
			for (int j = 0; j < transposeMatrix.noCols; j++) {
				transposeMatrix.data[i][j] = data[j][i];
			}

		}
		return transposeMatrix;

	}

	/**
	 * To show a matrix
	 */
	public void show() {// logic to display
		for (int i = 0; i < noRows; i++) {
			for (int j = 0; j < noCols; j++) {
				System.out.print(data[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows of Matrix");
		int rowInput = sc.nextInt();
		System.out.println("Enter column of Matrix");
		int columnInput = sc.nextInt();
		Matrix matrix = new Matrix(rowInput, columnInput);
		System.out.println("Enter values in Matrix");
		for (int i = 0; i < matrix.noRows; i++) {
			for (int j = 0; j < matrix.noCols; j++) {
				matrix.addElements(i, j, sc.nextInt());
			}
			System.out.println();
		}
		Matrix m2 = matrix.transpose();
		m2.show();
		sc.close();

	}

}
