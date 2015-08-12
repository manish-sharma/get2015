package pf_assignment_4;

import java.util.Scanner;
/*
 *queens puzzle is the problem of placing  queens on an n×n chess board so that no two queens threaten each other
 * It takes input as a number of queens  and print the possible  arrangement of queens in  nxn chess board
 * **@author Ankur Gupta
 * ** @since 12-08-2015*/
public class QueenProblem 
{
	static int[] queens;
	int array1[][];
	
	public QueenProblem(int NoOfQueens)
	{
        queens = new int[NoOfQueens];
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter queens");
    	Scanner sc=new Scanner(System.in);
    	int queens=sc.nextInt();
        QueenProblem Q = new QueenProblem(queens); 
        Q.callplaceNqueens();
        sc.close();  
	}
	
	public int[][] printQueens(int[] queens) 
	{
        int N = queens.length;
        int array[][]= new int[N][N];
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                if (queens[i] == j) {
                   System.out.print(" 1 ");
                    array[i][j]='1';
                } else 
                {
                    System.out.print(" 0 ");
                    array[i][j]='0';
                }
            }
            System.out.println();
        }
      System.out.println();
       return array;
    }
	
	public boolean canPlaceQueen(int row, int column) {
        /**
         * Returns TRUE if a queen can be placed in row r and column c.
         * Otherwise it returns FALSE. x[] is a global array whose first (r-1)
         * values have been set.
         */
        for (int i = 0; i < row; i++) {
            if (queens[i] == column || (i - row) == (queens[i] - column) ||(i - row) == (column - queens[i])) 
            {
                return false;
            }
        }
        return true;
	}
	
	public int[][] placeNqueens(int row, int noOfQueens) 
	{
        /**
         * Using backtracking this method prints all possible placements of n
         * queens on an n x n chessboard so that they are non-attacking.
         */
		
		for (int c = 0; c < noOfQueens; c++) 
        {
            if (canPlaceQueen(row, c)) 
            {
                queens[row] = c;
                if (row == noOfQueens - 1) 
                {
                    array1=printQueens(queens);
                    return array1;
                    
                  
                } 
                else 
                {
                    placeNqueens(row + 1, noOfQueens);
                }
            }
        }
        return array1;
    }

    public int[][] callplaceNqueens()
    {
        array1=placeNqueens(0, queens.length);
        return array1;
        
    }
	
}
