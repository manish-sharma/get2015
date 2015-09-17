/* The TowerOfHanoi program implements an application that
* solve the problem of Tower of Hanoi.
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-13
*/

public class NQueen {
	

	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Matrix Dimension for square matrix");
		int dimension = sc.nextInt();                        // Enter Matrix Dimension
		if(dimension>=1 && dimension <=25)
		{
			int[][] board=new int[dimension][dimension];	
			int startRow=0;
			NQueen obj=new NQueen();
		    Boolean result=obj.nQueen(board, startRow, dimension);         //Call Function
		    if(result==true)
		    	System.out.println("Solution is possible");
		    else
		    	System.out.println("Solution is not possible");
		}
		else
			System.out.println("Not valid for this size\nplease enter dimension between 1 to 25");
		sc.close();
	}
	/*It check for that whether there is any possible solution present for nQueen problem with given square matrix.
	 *
	 * @param board
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return Boolean Value True or False
	 */
	Boolean  nQueen(int[][] board, int startRow, int dimensionOfMatrix)
	{ 
		   if ( solveNQUtil(board, 0, dimensionOfMatrix) == false )
				      return false;
		   else
	                  return true;
	}
	/* A recursive utility function to solve N Queen problem */
	Boolean solveNQUtil(int[][] board, int col, int N)
	{
	    /* base case: If all queens are placed then return true */
	    if (col >= N)
	        return true;
	 
	    /* Consider this column and try placing this queen in all rows
	       one by one */
	    for (int i = 0; i < N; i++)
	    {
	        /* Check if queen can be placed on board[i][col] */
	        if ( isSafe(board, i, col, N) )
	        {
	            /* Place this queen in board[i][col] */
	            board[i][col] = 1;
	 
	            /* recur to place rest of the queens */
	            if ( solveNQUtil(board, col + 1, N) == true )
	                return true;
	 
	            /* If placing queen in board[i][col] doesn't lead to a solution
	               then remove queen from board[i][col] */
	            board[i][col] = 0; // BACKTRACK
	        }
	    }
	 
	     /* If queen can not be place in any row in this colum col
	        then return false */
	    return false;
	}

	
	Boolean isSafe(int[][] board, int row, int col, int N)
	{
	    int i, j;
	 
	    /* Check this row on left side */
	    for (i = 0; i < col; i++)
	    {
	        if (board[row][i]!=0)
	            return false;
	    }
	 
	    /* Check upper diagonal on left side */
	    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	    {
	        if (board[i][j]!=0)
	            return false;
	    }
	 
	    /* Check lower diagonal on left side */
	    for (i = row, j = col; j >= 0 && i < N; i++, j--)
	    {
	        if (board[i][j]!=0)
	            return false;
	    }
	 
	    return true;
	}
	 
}
