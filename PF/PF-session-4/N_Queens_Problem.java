/*This program will find the solution
 *  of N-Queen problem
 */
 
import java.util.Scanner;


public class N_Queens_Problem {
	static int n;

	public static void  main(String args[])
	{
		
	    N_Queens_Problem obj=new N_Queens_Problem();
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter Total no. of Queens");
	    n=Integer.parseInt(scan.nextLine());
	   
	    
		boolean Result=obj.solveNQ(n);//call solveNQ() fn	 
	    
	}
	
	/* This function solves the N Queen problem using Backtracking.  It mainly uses
	solveNQUtil() to solve the problem. It returns false if queens cannot be placed,
	otherwise return true and prints placement of queens in the form of 1s. Please
	note that there may be more than one solutions, this function prints one of the
	feasible solutions.*/
	 boolean solveNQ(int n)
	{
		int i,j;
		
		/*initially chess board is empty ,
		 * there is no Queen on chess board
		 */
	    int chessBoard[][]=new int[n][n]; 
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<n;j++)
	    	{
	    		chessBoard[i][j]=0;	    	
	    	}
	    }
	 
	    /*call solveNQUtil() fn initially 
	     * with column=0, which tests and 
	     * places the Queen on chess board 
	     * if it is possible 
	     */
	    if ( solveNQUtil(chessBoard, 0)==false)
	    {
	      System.out.println("Solution does not exist");
	      return false;
	    }
	 
	    printSolution(chessBoard);
	    return true;
	}
	 
	 /* A recursive utility function to solve N Queen problem */
	 Boolean solveNQUtil(int board[][], int col)
		{
		    /* base case: If all queens are placed then return true */
		    if (col >= n)
		        return true;
		 
		    /* Consider this column and try placing this queen in all rows
		       one by one */
		    for (int i = 0; i < n; i++)
		    {
		        /* Check if queen can be placed on board[i][col] */
		        if ( isSafe(board, i, col)==true )
		        {
		            /* Place this queen in board[i][col] */
		            board[i][col] = 1;
		 
		            /* recur to place rest of the queens */
		            if ( solveNQUtil(board, col + 1) == true )
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
	 
	 /* A utility function to check if a queen can be placed on board[row][col]
	   Note that this function is called when "col" queens are already placeed
	   in columns from 0 to col -1. So we need to check only left side for
	   attacking queens */
	Boolean isSafe(int board[][], int row, int col)
	{
	    int i, j;
	 
	    /* Check this row on left side */
	    for (i = 0; i < col; i++)
	    {
	        if (board[row][i]==1)
	            return false;
	    }
	 
	    /* Check upper diagonal on left side */
	    for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
	    {
	        if (board[i][j]==1)
	            return false;
	    }
	 
	    /* Check lower diagonal on left side */
	    for (i = row, j = col; j >= 0 && i < n; i++, j--)
	    {
	        if (board[i][j]==1)
	            return false;
	    }
	 
	    return true;
	}
	
	/*this fn will print
	 *  the solution
	 */
	void printSolution(int board[][])
	{
		int a[]=new int[n];
	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 0; j < n; j++)
	        {  
	        	System.out.print(board[i][j]);
	        	
	        }
	        
	      
	           System.out.println();
	    }
	   
	}
	 
	
	
	
	 
	
	 


} 

   




