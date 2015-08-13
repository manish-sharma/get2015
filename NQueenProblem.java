
import java.util.Scanner;

public class NQueenProblem 
{
	int N;
	
	 public NQueenProblem(int N) 
	    {
	       this.N=N;
	    }


    public void printQueens(int[][] board)
    {
        for (int row = 0; row < N; row++) 
        {
            for (int colomun = 0; colomun < N; colomun++)
            {
                if (board[row][colomun] == 1) {
                    System.out.print("Q");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
    }

    public boolean canPlaceQueen(int[][] board, int row, int colomun ) 
    {
    	 int i, j;
    	 
 	    /* Check this colomun up to the current row */
 	    for (i = 0; i < row; i++)
 	    {
 	        if (board[i][colomun]==1)
 	            return false;
 	    }
 	 
 	    /* Check upper diagonal on left side */
 	    for (i = row, j = colomun; i >= 0 && j >= 0; i--, j--)
 	    {
 	        if (board[i][j]==1)
 	            return false;
 	    }
 	 
 	    /* Check upper diagonal on right side */
 	    for (i = row, j = colomun; i >= 0 && j < N; i--, j++)
 	    {
 	        if (board[i][j]==1)
 	            return false;
 	    }
 	 
 	    return true;
    }
    public boolean  nQueen(int[][] board, int row, int dimensionOfMatrix) {
    
    	 /* base case: If all queens are placed then return true */
	    if (row >= dimensionOfMatrix){
	    	printQueens(board);
	    
	        return true;
	    }
	 
	    /* Consider this column and try placing this queen in all rows
	       one by one */
	    for (int i = 0; i < dimensionOfMatrix; i++)
	    {
	        /* Check if queen can be placed on board[row][i] */
	        if ( canPlaceQueen(board, row, i)==true )
	        {
	            /* Place this queen in board[row][i] */
	            board[row][i] = 1;
	 
	            /* recur to place rest of the queens */
	            if ( nQueen(board, row + 1, dimensionOfMatrix) == true )
	                return true;
	 
	            /* If placing queen in board[row][i] doesn't lead to a solution
	               then remove queen from board[i][col] */
	            board[row][i] = 0; // BACKTRACK
	        }
	    }
	 
	     /* If queen can not be place in any row in this colum col
	        then return false */
	    return false;
    }

    public static void main(String args[])
    {
    	System.out.println("Enter queens");
    	Scanner sc = new Scanner(System.in);
    	int queens = sc.nextInt();
    	int [][] board = new int [queens][queens];
    	for(int row = 0; row < queens; row++){
    		for(int colomun =0; colomun < queens; colomun++) {
    			board[row][colomun]=0;
    		}
    	}
        
    	if(queens>3) {
	        NQueenProblem Q = new NQueenProblem(queens);
	        Q.nQueen(board, 0, queens);
	        sc.close();
    	} else {
    		System.out.println("can not solve this problem");
    	}
     
    }

}
