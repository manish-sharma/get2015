package programingFundamental4;

import java.util.Scanner;

public class NQueenProblem {
	static int NUMBER_OF_COLUMNS; // for matrix of 4X4 for N Queen Problem
	/** used to print the solution of nqueen problem.
	 * @param board is the board which is to be printed.
	 */
	void printSolution(int board[][])
	{
		for (int i = 0; i < NUMBER_OF_COLUMNS; i++)
		{
			for (int j = 0; j < NUMBER_OF_COLUMNS; j++)
				System.out.print(board[i][j]+"\t");
			System.out.println("\n");
		}
	}

	// function to check if a queen can be placed on board[row][col]
	/** checks that the queen which is placed is at safe location or not.
	 * @param board on which queen is to be placed.
	 * @param row of board in which queen is placed.
	 * @param col  of board in which queen is placed.
	 * @return a boolean value safe or not.
	 */
	boolean isSafe(int board[][], int row, int col)
	{
		int i, j;

		// Check this row on left side
		for (i = 0; i < col; i++)
			if (board[row][i] == 1) return false;

		// Check upper diagonal on left side
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1) return false;

		// Check lower diagonal on left side
		for (i = row, j = col; j >= 0 && i < NUMBER_OF_COLUMNS; i++, j--)
			if (board[i][j] == 1) return false;

		return true;
	}

	/** A recursive utility function to solve N Queen problem 
	 * @param board on which queen is to be placed.
	 * @param col is no. of column on which queen is to be placed.
	 * @return true if queen are placed else fail.
	 */
	boolean nQueen(int board[][], int col)
	{
		// base case: If all queens are placed then return true
		if (col >= NUMBER_OF_COLUMNS) return true;

		// Consider this column and try placing this queen in all rows one by one
		for (int i = 0; i < NUMBER_OF_COLUMNS; i++)
			if (isSafe(board, i, col) == true) // Check if queen can be placed on board[i][col]
			{
				board[i][col] = 1;// Place this queen in board[i][col]

				if (nQueen(board, col + 1) == true) return true; // recur to place rest of the queens

				board[i][col] = 0; // BACKTRACK incase If placing queen in board[i][col] doesn't lead to a solution then remove queen from
									// board[i][col]
			}

		return false;// If queen can not be place in any row in this colum col then return false
	}
	public static void main(String args[]){
		NQueenProblem obj = new NQueenProblem();
		Scanner input = new Scanner(System.in);
		System.out.println("enter the no. of columns");
		NUMBER_OF_COLUMNS= input.nextInt();
		int[][] board = new int[NUMBER_OF_COLUMNS][NUMBER_OF_COLUMNS];
		int col=0;
		obj.nQueen(board, col);
		obj.printSolution(board);
	}
}
